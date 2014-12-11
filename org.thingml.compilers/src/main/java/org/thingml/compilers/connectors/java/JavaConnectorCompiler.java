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
package org.thingml.compilers.connectors.java;

import org.thingml.compilers.Context;
import org.thingml.compilers.connectors.ConnectorCompiler;

/**
 * Created by bmori on 10.12.2014.
 */
public class JavaConnectorCompiler extends ConnectorCompiler {
    @Override
    public void generateLib(Context ctx, String protocol) {
        switch(protocol) {
            case "http":
                break;
            case "mqtt":
                break;
            case "ws":
                break;
            case "coap":
                break;
            default:
                throw(new UnsupportedOperationException("Cannot generate protocol " + protocol + " for Java"));
        }
    }
}