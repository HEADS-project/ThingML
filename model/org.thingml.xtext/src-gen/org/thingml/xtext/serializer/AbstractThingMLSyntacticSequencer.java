/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
/*
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.thingml.xtext.services.ThingMLGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractThingMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ThingMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Message_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_ObjectType_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_PrimitiveType_SemicolonKeyword_6_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ThingMLGrammarAccess) access;
		match_Message_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
		match_ObjectType_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
		match_Primary_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_Primary_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
		match_PrimitiveType_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Message_SemicolonKeyword_6_q.equals(syntax))
				emit_Message_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectType_SemicolonKeyword_3_q.equals(syntax))
				emit_ObjectType_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimitiveType_SemicolonKeyword_6_q.equals(syntax))
				emit_PrimitiveType_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID '(' ')' (ambiguity) (rule end)
	 *     parameters+=Parameter ')' (ambiguity) (rule end)
	 */
	protected void emit_Message_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_ObjectType_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' term=Primary
	 *     (rule start) (ambiguity) 'not' term=Primary
	 *     (rule start) (ambiguity) boolValue='false'
	 *     (rule start) (ambiguity) boolValue='true'
	 *     (rule start) (ambiguity) doubleValue=FLOAT
	 *     (rule start) (ambiguity) enum=[Enumeration|ID]
	 *     (rule start) (ambiguity) expression=STRING_EXT
	 *     (rule start) (ambiguity) function=[Function|ID]
	 *     (rule start) (ambiguity) intValue=INT
	 *     (rule start) (ambiguity) property=[Variable|ID]
	 *     (rule start) (ambiguity) reference=[ReferencedElmt|ID]
	 *     (rule start) (ambiguity) stringValue=STRING_LIT
	 *     (rule start) (ambiguity) {AndExpression.lhs=}
	 *     (rule start) (ambiguity) {ArrayIndex.array=}
	 *     (rule start) (ambiguity) {DivExpression.lhs=}
	 *     (rule start) (ambiguity) {EqualsExpression.lhs=}
	 *     (rule start) (ambiguity) {GreaterExpression.lhs=}
	 *     (rule start) (ambiguity) {GreaterOrEqualExpression.lhs=}
	 *     (rule start) (ambiguity) {LowerExpression.lhs=}
	 *     (rule start) (ambiguity) {LowerOrEqualExpression.lhs=}
	 *     (rule start) (ambiguity) {MinusExpression.lhs=}
	 *     (rule start) (ambiguity) {ModExpression.lhs=}
	 *     (rule start) (ambiguity) {NotEqualsExpression.lhs=}
	 *     (rule start) (ambiguity) {OrExpression.lhs=}
	 *     (rule start) (ambiguity) {PlusExpression.lhs=}
	 *     (rule start) (ambiguity) {TimesExpression.lhs=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {AndExpression.lhs=}
	 *     (rule start) (ambiguity) {DivExpression.lhs=}
	 *     (rule start) (ambiguity) {EqualsExpression.lhs=}
	 *     (rule start) (ambiguity) {GreaterExpression.lhs=}
	 *     (rule start) (ambiguity) {GreaterOrEqualExpression.lhs=}
	 *     (rule start) (ambiguity) {LowerExpression.lhs=}
	 *     (rule start) (ambiguity) {LowerOrEqualExpression.lhs=}
	 *     (rule start) (ambiguity) {MinusExpression.lhs=}
	 *     (rule start) (ambiguity) {ModExpression.lhs=}
	 *     (rule start) (ambiguity) {NotEqualsExpression.lhs=}
	 *     (rule start) (ambiguity) {OrExpression.lhs=}
	 *     (rule start) (ambiguity) {PlusExpression.lhs=}
	 *     (rule start) (ambiguity) {TimesExpression.lhs=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ByteSize=INT '>' (ambiguity) (rule end)
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 */
	protected void emit_PrimitiveType_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
