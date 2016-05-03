/**
 * Copyright (C) 2014 SINTEF <franck.fleurey@sintef.no>
 *
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sintef
 */
package org.thingml.network.plugins.java;

import org.sintef.thingml.Message;
import org.sintef.thingml.ObjectType;
import org.sintef.thingml.Parameter;
import org.sintef.thingml.PrimitiveType;
import org.thingml.compilers.Context;
import org.thingml.compilers.java.JavaHelper;
import org.thingml.compilers.spi.SerializationPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JavaByteArraySerializerPlugin extends SerializationPlugin {

    @Override
    public String generateSerialization(StringBuilder builder, String bufferName, Message m) {
        int size = 2; //code encoded by a 2 bytes
        for (Parameter p : m.getParameters()) {
            if (p.getType() instanceof PrimitiveType) {
                size = size + ((PrimitiveType) p.getType()).getByteSize();
            }
        }
        //Serialize message into binary
        builder.append("/**Serializes a message into a binary format*/\n");
        builder.append("private static byte[] toBytes(" + context.firstToUpper(m.getName()) + "MessageType." + context.firstToUpper(m.getName()) + "Message _this) {\n");
        builder.append("ByteBuffer buffer = ByteBuffer.allocate(" + size + ");\n");
        builder.append("buffer.order(ByteOrder.BIG_ENDIAN);\n");
        builder.append("buffer.putShort(" + m.getName().toUpperCase() + ".getCode());\n");
        for (Parameter p : m.getParameters()) {
            if (JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context).equals("byte")) {
                builder.append("buffer.put(_this." + p.getName() + ");\n");
            } else if (JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context).equals("boolean")) {
                builder.append("if(" + p.getName() + ") buffer.put((byte)0x01); else buffer.put((byte)0x00); ");
            } else {
                builder.append("buffer.put" + context.firstToUpper(JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context)) + "(_this." + p.getName() + ");\n");
            }
        }
        builder.append("return buffer.array();\n");
        builder.append("}\n\n");


        return builder.toString();
    }

    @Override
    public void generateParserBody(StringBuilder builder, String bufferName, String bufferSizeName, Set<Message> messages, String sender) {
        builder.append("package org.thingml.generated.network;\n\n");
        builder.append("import org.thingml.generated.messages.*;\n");
        builder.append("import org.thingml.java.ext.Event;\n");
        builder.append("import java.nio.ByteBuffer;\n");
        builder.append("import java.nio.ByteOrder;\n");
        builder.append("public class " + bufferName + " {\n");
        for(Message m : messages) {
            final String code = m.hasAnnotation("code") ? m.annotation("code").get(0) : "0";
            builder.append("private static final " + context.firstToUpper(m.getName()) + "MessageType " + m.getName().toUpperCase() + " = new " + context.firstToUpper(m.getName()) + "MessageType((short) " + code + ");\n");
        }
        //Instantiate message from binary
        builder.append("public static Event instantiate(byte[] payload) {\n");
        builder.append("ByteBuffer buffer = ByteBuffer.wrap(payload);\n");
        builder.append("buffer.order(ByteOrder.BIG_ENDIAN);\n");
        builder.append("final short code = buffer.getShort();\n");
        builder.append("switch(code) {\n");
        for(Message m : messages) {
            final String code = m.hasAnnotation("code") ? m.annotation("code").get(0) : "0";
            builder.append("case " + code + ":{\n");
            for (Parameter p : m.getParameters()) {
                final String javaType = JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context);
                if ("byte".equals(javaType)) {
                    builder.append("final " + JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context) + " " + p.getName() + " = " + "buffer.get();\n");
                } else if ("boolean".equals(javaType)) {
                    builder.append("final " + JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context) + " " + p.getName() + " = " + "buffer.get() == 0x00 ? false : true;\n");
                } else if ("String".equals(javaType)) {
                    //TODO [0: #bytes size, 1:size[#bytes size], 2(-3-5): [UTF-8 bytes]]
                } else {
                    builder.append("final " + JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context) + " " + p.getName() + " = " + "buffer.get" + context.firstToUpper(JavaHelper.getJavaType(p.getType(), p.getCardinality() != null, context)) + "();\n");
                }
            }
            builder.append("return " + m.getName().toUpperCase() + ".instantiate(");
            for (Parameter p : m.getParameters()) {
                if (m.getParameters().indexOf(p) > 0)
                    builder.append(", ");
                builder.append(p.getName());
            }
            builder.append(");\n}\n");

        }
        builder.append("default: return null;\n");
        builder.append("}\n}\n");

        builder.append("public static byte[] toBytes(Event e){\n");
        builder.append("switch(e.getType().getCode()){\n");
        for(Message m : messages) {
            final String code = m.hasAnnotation("code") ? m.annotation("code").get(0) : "0";
            builder.append("case " + code + ": return toBytes((" + context.firstToUpper(m.getName()) + "MessageType." + context.firstToUpper(m.getName()) + "Message)e);\n");
        }
        builder.append("default: return null;\n");
        builder.append("}\n");
        builder.append("}\n");

        for(Message m : messages) {
            generateSerialization(builder, bufferName, m);
        }
        builder.append("}\n");
    }

    @Override
    public String getPluginID() {
        return "JavaByteArraySerializerPlugin";
    }

    @Override
    public List<String> getTargetedLanguages() {
        List<String> res = new ArrayList<>();
        res.add("java");
        return res;
    }

}