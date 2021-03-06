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
package org.thingml.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.thingml.xtext.ide.contentassist.antlr.internal.InternalThingMLParser;
import org.thingml.xtext.services.ThingMLGrammarAccess;

public class ThingMLParser extends AbstractContentAssistParser {

	@Inject
	private ThingMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalThingMLParser createParser() {
		InternalThingMLParser result = new InternalThingMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getThingMLModelAccess().getAlternatives_1(), "rule__ThingMLModel__Alternatives_1");
					put(grammarAccess.getAnnotatedElementAccess().getAlternatives(), "rule__AnnotatedElement__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getThingAccess().getAlternatives_6(), "rule__Thing__Alternatives_6");
					put(grammarAccess.getPortAccess().getAlternatives(), "rule__Port__Alternatives");
					put(grammarAccess.getRequiredPortAccess().getAlternatives_6(), "rule__RequiredPort__Alternatives_6");
					put(grammarAccess.getProvidedPortAccess().getAlternatives_5(), "rule__ProvidedPort__Alternatives_5");
					put(grammarAccess.getInternalPortAccess().getAlternatives_5(), "rule__InternalPort__Alternatives_5");
					put(grammarAccess.getRegionAccess().getAlternatives(), "rule__Region__Alternatives");
					put(grammarAccess.getRegionOrSessionAccess().getAlternatives(), "rule__RegionOrSession__Alternatives");
					put(grammarAccess.getStateMachineAccess().getAlternatives_10(), "rule__StateMachine__Alternatives_10");
					put(grammarAccess.getCompositeStateAccess().getAlternatives_11(), "rule__CompositeState__Alternatives_11");
					put(grammarAccess.getSessionAccess().getAlternatives_10(), "rule__Session__Alternatives_10");
					put(grammarAccess.getStateAccess().getAlternatives(), "rule__State__Alternatives");
					put(grammarAccess.getStateAccess().getAlternatives_3_7(), "rule__State__Alternatives_3_7");
					put(grammarAccess.getHandlerAccess().getAlternatives(), "rule__Handler__Alternatives");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getVariableAccess().getAlternatives(), "rule__Variable__Alternatives");
					put(grammarAccess.getEqualityAccess().getAlternatives_1(), "rule__Equality__Alternatives_1");
					put(grammarAccess.getComparaisonAccess().getAlternatives_1(), "rule__Comparaison__Alternatives_1");
					put(grammarAccess.getAdditionAccess().getAlternatives_1(), "rule__Addition__Alternatives_1");
					put(grammarAccess.getMultiplicationAccess().getAlternatives_1(), "rule__Multiplication__Alternatives_1");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getAtomicExpressionAccess().getAlternatives(), "rule__AtomicExpression__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getBoolValueAlternatives_0(), "rule__BooleanLiteral__BoolValueAlternatives_0");
					put(grammarAccess.getConfigurationAccess().getAlternatives_4(), "rule__Configuration__Alternatives_4");
					put(grammarAccess.getAbstractConnectorAccess().getAlternatives(), "rule__AbstractConnector__Alternatives");
					put(grammarAccess.getThingMLModelAccess().getGroup(), "rule__ThingMLModel__Group__0");
					put(grammarAccess.getThingMLModelAccess().getGroup_0(), "rule__ThingMLModel__Group_0__0");
					put(grammarAccess.getPlatformAnnotationAccess().getGroup(), "rule__PlatformAnnotation__Group__0");
					put(grammarAccess.getTypeRefAccess().getGroup(), "rule__TypeRef__Group__0");
					put(grammarAccess.getTypeRefAccess().getGroup_1(), "rule__TypeRef__Group_1__0");
					put(grammarAccess.getPrimitiveTypeAccess().getGroup(), "rule__PrimitiveType__Group__0");
					put(grammarAccess.getObjectTypeAccess().getGroup(), "rule__ObjectType__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationLiteralAccess().getGroup(), "rule__EnumerationLiteral__Group__0");
					put(grammarAccess.getThingAccess().getGroup(), "rule__Thing__Group__0");
					put(grammarAccess.getThingAccess().getGroup_3(), "rule__Thing__Group_3__0");
					put(grammarAccess.getThingAccess().getGroup_3_2(), "rule__Thing__Group_3_2__0");
					put(grammarAccess.getPropertyAssignAccess().getGroup(), "rule__PropertyAssign__Group__0");
					put(grammarAccess.getPropertyAssignAccess().getGroup_2(), "rule__PropertyAssign__Group_2__0");
					put(grammarAccess.getProtocolAccess().getGroup(), "rule__Protocol__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
					put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
					put(grammarAccess.getFunctionAccess().getGroup_5(), "rule__Function__Group_5__0");
					put(grammarAccess.getPropertyAccess().getGroup(), "rule__Property__Group__0");
					put(grammarAccess.getPropertyAccess().getGroup_5(), "rule__Property__Group_5__0");
					put(grammarAccess.getMessageAccess().getGroup(), "rule__Message__Group__0");
					put(grammarAccess.getMessageAccess().getGroup_3(), "rule__Message__Group_3__0");
					put(grammarAccess.getMessageAccess().getGroup_3_1(), "rule__Message__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getRequiredPortAccess().getGroup(), "rule__RequiredPort__Group__0");
					put(grammarAccess.getRequiredPortAccess().getGroup_6_0(), "rule__RequiredPort__Group_6_0__0");
					put(grammarAccess.getRequiredPortAccess().getGroup_6_0_2(), "rule__RequiredPort__Group_6_0_2__0");
					put(grammarAccess.getRequiredPortAccess().getGroup_6_1(), "rule__RequiredPort__Group_6_1__0");
					put(grammarAccess.getRequiredPortAccess().getGroup_6_1_2(), "rule__RequiredPort__Group_6_1_2__0");
					put(grammarAccess.getProvidedPortAccess().getGroup(), "rule__ProvidedPort__Group__0");
					put(grammarAccess.getProvidedPortAccess().getGroup_5_0(), "rule__ProvidedPort__Group_5_0__0");
					put(grammarAccess.getProvidedPortAccess().getGroup_5_0_2(), "rule__ProvidedPort__Group_5_0_2__0");
					put(grammarAccess.getProvidedPortAccess().getGroup_5_1(), "rule__ProvidedPort__Group_5_1__0");
					put(grammarAccess.getProvidedPortAccess().getGroup_5_1_2(), "rule__ProvidedPort__Group_5_1_2__0");
					put(grammarAccess.getInternalPortAccess().getGroup(), "rule__InternalPort__Group__0");
					put(grammarAccess.getInternalPortAccess().getGroup_5_0(), "rule__InternalPort__Group_5_0__0");
					put(grammarAccess.getInternalPortAccess().getGroup_5_0_2(), "rule__InternalPort__Group_5_0_2__0");
					put(grammarAccess.getInternalPortAccess().getGroup_5_1(), "rule__InternalPort__Group_5_1__0");
					put(grammarAccess.getInternalPortAccess().getGroup_5_1_2(), "rule__InternalPort__Group_5_1_2__0");
					put(grammarAccess.getStateMachineAccess().getGroup(), "rule__StateMachine__Group__0");
					put(grammarAccess.getStateMachineAccess().getGroup_4(), "rule__StateMachine__Group_4__0");
					put(grammarAccess.getStateMachineAccess().getGroup_8(), "rule__StateMachine__Group_8__0");
					put(grammarAccess.getStateMachineAccess().getGroup_9(), "rule__StateMachine__Group_9__0");
					put(grammarAccess.getFinalStateAccess().getGroup(), "rule__FinalState__Group__0");
					put(grammarAccess.getFinalStateAccess().getGroup_5(), "rule__FinalState__Group_5__0");
					put(grammarAccess.getCompositeStateAccess().getGroup(), "rule__CompositeState__Group__0");
					put(grammarAccess.getCompositeStateAccess().getGroup_5(), "rule__CompositeState__Group_5__0");
					put(grammarAccess.getCompositeStateAccess().getGroup_9(), "rule__CompositeState__Group_9__0");
					put(grammarAccess.getCompositeStateAccess().getGroup_10(), "rule__CompositeState__Group_10__0");
					put(grammarAccess.getSessionAccess().getGroup(), "rule__Session__Group__0");
					put(grammarAccess.getSessionAccess().getGroup_2(), "rule__Session__Group_2__0");
					put(grammarAccess.getSessionAccess().getGroup_8(), "rule__Session__Group_8__0");
					put(grammarAccess.getSessionAccess().getGroup_9(), "rule__Session__Group_9__0");
					put(grammarAccess.getParallelRegionAccess().getGroup(), "rule__ParallelRegion__Group__0");
					put(grammarAccess.getParallelRegionAccess().getGroup_4(), "rule__ParallelRegion__Group_4__0");
					put(grammarAccess.getStateAccess().getGroup_3(), "rule__State__Group_3__0");
					put(grammarAccess.getStateAccess().getGroup_3_5(), "rule__State__Group_3_5__0");
					put(grammarAccess.getStateAccess().getGroup_3_6(), "rule__State__Group_3_6__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_5(), "rule__Transition__Group_5__0");
					put(grammarAccess.getTransitionAccess().getGroup_6(), "rule__Transition__Group_6__0");
					put(grammarAccess.getTransitionAccess().getGroup_7(), "rule__Transition__Group_7__0");
					put(grammarAccess.getInternalTransitionAccess().getGroup(), "rule__InternalTransition__Group__0");
					put(grammarAccess.getInternalTransitionAccess().getGroup_4(), "rule__InternalTransition__Group_4__0");
					put(grammarAccess.getInternalTransitionAccess().getGroup_5(), "rule__InternalTransition__Group_5__0");
					put(grammarAccess.getInternalTransitionAccess().getGroup_6(), "rule__InternalTransition__Group_6__0");
					put(grammarAccess.getReceiveMessageAccess().getGroup(), "rule__ReceiveMessage__Group__0");
					put(grammarAccess.getReceiveMessageAccess().getGroup_0(), "rule__ReceiveMessage__Group_0__0");
					put(grammarAccess.getActionBlockAccess().getGroup(), "rule__ActionBlock__Group__0");
					put(grammarAccess.getExternStatementAccess().getGroup(), "rule__ExternStatement__Group__0");
					put(grammarAccess.getExternStatementAccess().getGroup_1(), "rule__ExternStatement__Group_1__0");
					put(grammarAccess.getLocalVariableAccess().getGroup(), "rule__LocalVariable__Group__0");
					put(grammarAccess.getLocalVariableAccess().getGroup_5(), "rule__LocalVariable__Group_5__0");
					put(grammarAccess.getSendActionAccess().getGroup(), "rule__SendAction__Group__0");
					put(grammarAccess.getSendActionAccess().getGroup_4(), "rule__SendAction__Group_4__0");
					put(grammarAccess.getSendActionAccess().getGroup_4_1(), "rule__SendAction__Group_4_1__0");
					put(grammarAccess.getVariableAssignmentAccess().getGroup(), "rule__VariableAssignment__Group__0");
					put(grammarAccess.getVariableAssignmentAccess().getGroup_1(), "rule__VariableAssignment__Group_1__0");
					put(grammarAccess.getIncrementAccess().getGroup(), "rule__Increment__Group__0");
					put(grammarAccess.getDecrementAccess().getGroup(), "rule__Decrement__Group__0");
					put(grammarAccess.getLoopActionAccess().getGroup(), "rule__LoopAction__Group__0");
					put(grammarAccess.getConditionalActionAccess().getGroup(), "rule__ConditionalAction__Group__0");
					put(grammarAccess.getConditionalActionAccess().getGroup_5(), "rule__ConditionalAction__Group_5__0");
					put(grammarAccess.getReturnActionAccess().getGroup(), "rule__ReturnAction__Group__0");
					put(grammarAccess.getPrintActionAccess().getGroup(), "rule__PrintAction__Group__0");
					put(grammarAccess.getErrorActionAccess().getGroup(), "rule__ErrorAction__Group__0");
					put(grammarAccess.getStartSessionAccess().getGroup(), "rule__StartSession__Group__0");
					put(grammarAccess.getFunctionCallStatementAccess().getGroup(), "rule__FunctionCallStatement__Group__0");
					put(grammarAccess.getFunctionCallStatementAccess().getGroup_2(), "rule__FunctionCallStatement__Group_2__0");
					put(grammarAccess.getFunctionCallStatementAccess().getGroup_2_1(), "rule__FunctionCallStatement__Group_2_1__0");
					put(grammarAccess.getOrExpressionAccess().getGroup(), "rule__OrExpression__Group__0");
					put(grammarAccess.getOrExpressionAccess().getGroup_1(), "rule__OrExpression__Group_1__0");
					put(grammarAccess.getAndExpressionAccess().getGroup(), "rule__AndExpression__Group__0");
					put(grammarAccess.getAndExpressionAccess().getGroup_1(), "rule__AndExpression__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1_0(), "rule__Equality__Group_1_0__0");
					put(grammarAccess.getEqualityAccess().getGroup_1_1(), "rule__Equality__Group_1_1__0");
					put(grammarAccess.getComparaisonAccess().getGroup(), "rule__Comparaison__Group__0");
					put(grammarAccess.getComparaisonAccess().getGroup_1_0(), "rule__Comparaison__Group_1_0__0");
					put(grammarAccess.getComparaisonAccess().getGroup_1_1(), "rule__Comparaison__Group_1_1__0");
					put(grammarAccess.getComparaisonAccess().getGroup_1_2(), "rule__Comparaison__Group_1_2__0");
					put(grammarAccess.getComparaisonAccess().getGroup_1_3(), "rule__Comparaison__Group_1_3__0");
					put(grammarAccess.getAdditionAccess().getGroup(), "rule__Addition__Group__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_0(), "rule__Addition__Group_1_0__0");
					put(grammarAccess.getAdditionAccess().getGroup_1_1(), "rule__Addition__Group_1_1__0");
					put(grammarAccess.getMultiplicationAccess().getGroup(), "rule__Multiplication__Group__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_0(), "rule__Multiplication__Group_1_0__0");
					put(grammarAccess.getMultiplicationAccess().getGroup_1_1(), "rule__Multiplication__Group_1_1__0");
					put(grammarAccess.getModuloAccess().getGroup(), "rule__Modulo__Group__0");
					put(grammarAccess.getModuloAccess().getGroup_1(), "rule__Modulo__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
					put(grammarAccess.getArrayIndexPostfixAccess().getGroup(), "rule__ArrayIndexPostfix__Group__0");
					put(grammarAccess.getArrayIndexPostfixAccess().getGroup_1(), "rule__ArrayIndexPostfix__Group_1__0");
					put(grammarAccess.getExternExpressionAccess().getGroup(), "rule__ExternExpression__Group__0");
					put(grammarAccess.getExternExpressionAccess().getGroup_1(), "rule__ExternExpression__Group_1__0");
					put(grammarAccess.getEnumLiteralRefAccess().getGroup(), "rule__EnumLiteralRef__Group__0");
					put(grammarAccess.getEventReferenceAccess().getGroup(), "rule__EventReference__Group__0");
					put(grammarAccess.getFunctionCallExpressionAccess().getGroup(), "rule__FunctionCallExpression__Group__0");
					put(grammarAccess.getFunctionCallExpressionAccess().getGroup_2(), "rule__FunctionCallExpression__Group_2__0");
					put(grammarAccess.getFunctionCallExpressionAccess().getGroup_2_1(), "rule__FunctionCallExpression__Group_2_1__0");
					put(grammarAccess.getConfigurationAccess().getGroup(), "rule__Configuration__Group__0");
					put(grammarAccess.getInstanceAccess().getGroup(), "rule__Instance__Group__0");
					put(grammarAccess.getConfigPropertyAssignAccess().getGroup(), "rule__ConfigPropertyAssign__Group__0");
					put(grammarAccess.getConfigPropertyAssignAccess().getGroup_4(), "rule__ConfigPropertyAssign__Group_4__0");
					put(grammarAccess.getConnectorAccess().getGroup(), "rule__Connector__Group__0");
					put(grammarAccess.getExternalConnectorAccess().getGroup(), "rule__ExternalConnector__Group__0");
					put(grammarAccess.getThingMLModelAccess().getImportURIAssignment_0_1(), "rule__ThingMLModel__ImportURIAssignment_0_1");
					put(grammarAccess.getThingMLModelAccess().getTypesAssignment_1_0(), "rule__ThingMLModel__TypesAssignment_1_0");
					put(grammarAccess.getThingMLModelAccess().getProtocolsAssignment_1_1(), "rule__ThingMLModel__ProtocolsAssignment_1_1");
					put(grammarAccess.getThingMLModelAccess().getConfigsAssignment_1_2(), "rule__ThingMLModel__ConfigsAssignment_1_2");
					put(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0(), "rule__PlatformAnnotation__NameAssignment_0");
					put(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1(), "rule__PlatformAnnotation__ValueAssignment_1");
					put(grammarAccess.getTypeRefAccess().getTypeAssignment_0(), "rule__TypeRef__TypeAssignment_0");
					put(grammarAccess.getTypeRefAccess().getIsArrayAssignment_1_0(), "rule__TypeRef__IsArrayAssignment_1_0");
					put(grammarAccess.getTypeRefAccess().getCardinalityAssignment_1_1(), "rule__TypeRef__CardinalityAssignment_1_1");
					put(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1(), "rule__PrimitiveType__NameAssignment_1");
					put(grammarAccess.getPrimitiveTypeAccess().getByteSizeAssignment_3(), "rule__PrimitiveType__ByteSizeAssignment_3");
					put(grammarAccess.getPrimitiveTypeAccess().getAnnotationsAssignment_5(), "rule__PrimitiveType__AnnotationsAssignment_5");
					put(grammarAccess.getObjectTypeAccess().getNameAssignment_1(), "rule__ObjectType__NameAssignment_1");
					put(grammarAccess.getObjectTypeAccess().getAnnotationsAssignment_2(), "rule__ObjectType__AnnotationsAssignment_2");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_1(), "rule__Enumeration__NameAssignment_1");
					put(grammarAccess.getEnumerationAccess().getAnnotationsAssignment_2(), "rule__Enumeration__AnnotationsAssignment_2");
					put(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4(), "rule__Enumeration__LiteralsAssignment_4");
					put(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0(), "rule__EnumerationLiteral__NameAssignment_0");
					put(grammarAccess.getEnumerationLiteralAccess().getAnnotationsAssignment_1(), "rule__EnumerationLiteral__AnnotationsAssignment_1");
					put(grammarAccess.getThingAccess().getFragmentAssignment_1(), "rule__Thing__FragmentAssignment_1");
					put(grammarAccess.getThingAccess().getNameAssignment_2(), "rule__Thing__NameAssignment_2");
					put(grammarAccess.getThingAccess().getIncludesAssignment_3_1(), "rule__Thing__IncludesAssignment_3_1");
					put(grammarAccess.getThingAccess().getIncludesAssignment_3_2_1(), "rule__Thing__IncludesAssignment_3_2_1");
					put(grammarAccess.getThingAccess().getAnnotationsAssignment_4(), "rule__Thing__AnnotationsAssignment_4");
					put(grammarAccess.getThingAccess().getMessagesAssignment_6_0(), "rule__Thing__MessagesAssignment_6_0");
					put(grammarAccess.getThingAccess().getPortsAssignment_6_1(), "rule__Thing__PortsAssignment_6_1");
					put(grammarAccess.getThingAccess().getPropertiesAssignment_6_2(), "rule__Thing__PropertiesAssignment_6_2");
					put(grammarAccess.getThingAccess().getFunctionsAssignment_6_3(), "rule__Thing__FunctionsAssignment_6_3");
					put(grammarAccess.getThingAccess().getAssignAssignment_6_4(), "rule__Thing__AssignAssignment_6_4");
					put(grammarAccess.getThingAccess().getBehaviourAssignment_6_5(), "rule__Thing__BehaviourAssignment_6_5");
					put(grammarAccess.getPropertyAssignAccess().getPropertyAssignment_1(), "rule__PropertyAssign__PropertyAssignment_1");
					put(grammarAccess.getPropertyAssignAccess().getIndexAssignment_2_1(), "rule__PropertyAssign__IndexAssignment_2_1");
					put(grammarAccess.getPropertyAssignAccess().getInitAssignment_4(), "rule__PropertyAssign__InitAssignment_4");
					put(grammarAccess.getPropertyAssignAccess().getAnnotationsAssignment_5(), "rule__PropertyAssign__AnnotationsAssignment_5");
					put(grammarAccess.getProtocolAccess().getNameAssignment_1(), "rule__Protocol__NameAssignment_1");
					put(grammarAccess.getProtocolAccess().getAnnotationsAssignment_2(), "rule__Protocol__AnnotationsAssignment_2");
					put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_3_0(), "rule__Function__ParametersAssignment_3_0");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_3_1_1(), "rule__Function__ParametersAssignment_3_1_1");
					put(grammarAccess.getFunctionAccess().getTypeRefAssignment_5_1(), "rule__Function__TypeRefAssignment_5_1");
					put(grammarAccess.getFunctionAccess().getAnnotationsAssignment_6(), "rule__Function__AnnotationsAssignment_6");
					put(grammarAccess.getFunctionAccess().getBodyAssignment_7(), "rule__Function__BodyAssignment_7");
					put(grammarAccess.getPropertyAccess().getChangeableAssignment_0(), "rule__Property__ChangeableAssignment_0");
					put(grammarAccess.getPropertyAccess().getNameAssignment_2(), "rule__Property__NameAssignment_2");
					put(grammarAccess.getPropertyAccess().getTypeRefAssignment_4(), "rule__Property__TypeRefAssignment_4");
					put(grammarAccess.getPropertyAccess().getInitAssignment_5_1(), "rule__Property__InitAssignment_5_1");
					put(grammarAccess.getPropertyAccess().getAnnotationsAssignment_6(), "rule__Property__AnnotationsAssignment_6");
					put(grammarAccess.getMessageAccess().getNameAssignment_1(), "rule__Message__NameAssignment_1");
					put(grammarAccess.getMessageAccess().getParametersAssignment_3_0(), "rule__Message__ParametersAssignment_3_0");
					put(grammarAccess.getMessageAccess().getParametersAssignment_3_1_1(), "rule__Message__ParametersAssignment_3_1_1");
					put(grammarAccess.getMessageAccess().getAnnotationsAssignment_5(), "rule__Message__AnnotationsAssignment_5");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeRefAssignment_2(), "rule__Parameter__TypeRefAssignment_2");
					put(grammarAccess.getParameterAccess().getAnnotationsAssignment_3(), "rule__Parameter__AnnotationsAssignment_3");
					put(grammarAccess.getRequiredPortAccess().getOptionalAssignment_0(), "rule__RequiredPort__OptionalAssignment_0");
					put(grammarAccess.getRequiredPortAccess().getNameAssignment_3(), "rule__RequiredPort__NameAssignment_3");
					put(grammarAccess.getRequiredPortAccess().getAnnotationsAssignment_4(), "rule__RequiredPort__AnnotationsAssignment_4");
					put(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_1(), "rule__RequiredPort__SendsAssignment_6_0_1");
					put(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_2_1(), "rule__RequiredPort__SendsAssignment_6_0_2_1");
					put(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_1(), "rule__RequiredPort__ReceivesAssignment_6_1_1");
					put(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_2_1(), "rule__RequiredPort__ReceivesAssignment_6_1_2_1");
					put(grammarAccess.getProvidedPortAccess().getNameAssignment_2(), "rule__ProvidedPort__NameAssignment_2");
					put(grammarAccess.getProvidedPortAccess().getAnnotationsAssignment_3(), "rule__ProvidedPort__AnnotationsAssignment_3");
					put(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_1(), "rule__ProvidedPort__SendsAssignment_5_0_1");
					put(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_2_1(), "rule__ProvidedPort__SendsAssignment_5_0_2_1");
					put(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_1(), "rule__ProvidedPort__ReceivesAssignment_5_1_1");
					put(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_2_1(), "rule__ProvidedPort__ReceivesAssignment_5_1_2_1");
					put(grammarAccess.getInternalPortAccess().getNameAssignment_2(), "rule__InternalPort__NameAssignment_2");
					put(grammarAccess.getInternalPortAccess().getAnnotationsAssignment_3(), "rule__InternalPort__AnnotationsAssignment_3");
					put(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_1(), "rule__InternalPort__SendsAssignment_5_0_1");
					put(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_2_1(), "rule__InternalPort__SendsAssignment_5_0_2_1");
					put(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_1(), "rule__InternalPort__ReceivesAssignment_5_1_1");
					put(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_2_1(), "rule__InternalPort__ReceivesAssignment_5_1_2_1");
					put(grammarAccess.getStateMachineAccess().getNameAssignment_1(), "rule__StateMachine__NameAssignment_1");
					put(grammarAccess.getStateMachineAccess().getInitialAssignment_3(), "rule__StateMachine__InitialAssignment_3");
					put(grammarAccess.getStateMachineAccess().getHistoryAssignment_4_1(), "rule__StateMachine__HistoryAssignment_4_1");
					put(grammarAccess.getStateMachineAccess().getAnnotationsAssignment_5(), "rule__StateMachine__AnnotationsAssignment_5");
					put(grammarAccess.getStateMachineAccess().getPropertiesAssignment_7(), "rule__StateMachine__PropertiesAssignment_7");
					put(grammarAccess.getStateMachineAccess().getEntryAssignment_8_2(), "rule__StateMachine__EntryAssignment_8_2");
					put(grammarAccess.getStateMachineAccess().getExitAssignment_9_2(), "rule__StateMachine__ExitAssignment_9_2");
					put(grammarAccess.getStateMachineAccess().getSubstateAssignment_10_0(), "rule__StateMachine__SubstateAssignment_10_0");
					put(grammarAccess.getStateMachineAccess().getInternalAssignment_10_1(), "rule__StateMachine__InternalAssignment_10_1");
					put(grammarAccess.getStateMachineAccess().getRegionAssignment_11(), "rule__StateMachine__RegionAssignment_11");
					put(grammarAccess.getFinalStateAccess().getNameAssignment_2(), "rule__FinalState__NameAssignment_2");
					put(grammarAccess.getFinalStateAccess().getAnnotationsAssignment_3(), "rule__FinalState__AnnotationsAssignment_3");
					put(grammarAccess.getFinalStateAccess().getEntryAssignment_5_2(), "rule__FinalState__EntryAssignment_5_2");
					put(grammarAccess.getCompositeStateAccess().getNameAssignment_2(), "rule__CompositeState__NameAssignment_2");
					put(grammarAccess.getCompositeStateAccess().getInitialAssignment_4(), "rule__CompositeState__InitialAssignment_4");
					put(grammarAccess.getCompositeStateAccess().getHistoryAssignment_5_1(), "rule__CompositeState__HistoryAssignment_5_1");
					put(grammarAccess.getCompositeStateAccess().getAnnotationsAssignment_6(), "rule__CompositeState__AnnotationsAssignment_6");
					put(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_8(), "rule__CompositeState__PropertiesAssignment_8");
					put(grammarAccess.getCompositeStateAccess().getEntryAssignment_9_2(), "rule__CompositeState__EntryAssignment_9_2");
					put(grammarAccess.getCompositeStateAccess().getExitAssignment_10_2(), "rule__CompositeState__ExitAssignment_10_2");
					put(grammarAccess.getCompositeStateAccess().getSubstateAssignment_11_0(), "rule__CompositeState__SubstateAssignment_11_0");
					put(grammarAccess.getCompositeStateAccess().getInternalAssignment_11_1(), "rule__CompositeState__InternalAssignment_11_1");
					put(grammarAccess.getCompositeStateAccess().getOutgoingAssignment_11_2(), "rule__CompositeState__OutgoingAssignment_11_2");
					put(grammarAccess.getCompositeStateAccess().getRegionAssignment_12(), "rule__CompositeState__RegionAssignment_12");
					put(grammarAccess.getSessionAccess().getNameAssignment_1(), "rule__Session__NameAssignment_1");
					put(grammarAccess.getSessionAccess().getMaxInstancesAssignment_2_1(), "rule__Session__MaxInstancesAssignment_2_1");
					put(grammarAccess.getSessionAccess().getInitialAssignment_4(), "rule__Session__InitialAssignment_4");
					put(grammarAccess.getSessionAccess().getAnnotationsAssignment_5(), "rule__Session__AnnotationsAssignment_5");
					put(grammarAccess.getSessionAccess().getPropertiesAssignment_7(), "rule__Session__PropertiesAssignment_7");
					put(grammarAccess.getSessionAccess().getEntryAssignment_8_2(), "rule__Session__EntryAssignment_8_2");
					put(grammarAccess.getSessionAccess().getExitAssignment_9_2(), "rule__Session__ExitAssignment_9_2");
					put(grammarAccess.getSessionAccess().getSubstateAssignment_10_0(), "rule__Session__SubstateAssignment_10_0");
					put(grammarAccess.getSessionAccess().getInternalAssignment_10_1(), "rule__Session__InternalAssignment_10_1");
					put(grammarAccess.getSessionAccess().getRegionAssignment_11(), "rule__Session__RegionAssignment_11");
					put(grammarAccess.getParallelRegionAccess().getNameAssignment_1(), "rule__ParallelRegion__NameAssignment_1");
					put(grammarAccess.getParallelRegionAccess().getInitialAssignment_3(), "rule__ParallelRegion__InitialAssignment_3");
					put(grammarAccess.getParallelRegionAccess().getHistoryAssignment_4_1(), "rule__ParallelRegion__HistoryAssignment_4_1");
					put(grammarAccess.getParallelRegionAccess().getAnnotationsAssignment_5(), "rule__ParallelRegion__AnnotationsAssignment_5");
					put(grammarAccess.getParallelRegionAccess().getSubstateAssignment_7(), "rule__ParallelRegion__SubstateAssignment_7");
					put(grammarAccess.getParallelRegionAccess().getRegionAssignment_8(), "rule__ParallelRegion__RegionAssignment_8");
					put(grammarAccess.getStateAccess().getNameAssignment_3_1(), "rule__State__NameAssignment_3_1");
					put(grammarAccess.getStateAccess().getAnnotationsAssignment_3_2(), "rule__State__AnnotationsAssignment_3_2");
					put(grammarAccess.getStateAccess().getPropertiesAssignment_3_4(), "rule__State__PropertiesAssignment_3_4");
					put(grammarAccess.getStateAccess().getEntryAssignment_3_5_2(), "rule__State__EntryAssignment_3_5_2");
					put(grammarAccess.getStateAccess().getExitAssignment_3_6_2(), "rule__State__ExitAssignment_3_6_2");
					put(grammarAccess.getStateAccess().getInternalAssignment_3_7_0(), "rule__State__InternalAssignment_3_7_0");
					put(grammarAccess.getStateAccess().getOutgoingAssignment_3_7_1(), "rule__State__OutgoingAssignment_3_7_1");
					put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_3(), "rule__Transition__TargetAssignment_3");
					put(grammarAccess.getTransitionAccess().getAnnotationsAssignment_4(), "rule__Transition__AnnotationsAssignment_4");
					put(grammarAccess.getTransitionAccess().getEventAssignment_5_1(), "rule__Transition__EventAssignment_5_1");
					put(grammarAccess.getTransitionAccess().getGuardAssignment_6_1(), "rule__Transition__GuardAssignment_6_1");
					put(grammarAccess.getTransitionAccess().getActionAssignment_7_1(), "rule__Transition__ActionAssignment_7_1");
					put(grammarAccess.getInternalTransitionAccess().getNameAssignment_2(), "rule__InternalTransition__NameAssignment_2");
					put(grammarAccess.getInternalTransitionAccess().getAnnotationsAssignment_3(), "rule__InternalTransition__AnnotationsAssignment_3");
					put(grammarAccess.getInternalTransitionAccess().getEventAssignment_4_1(), "rule__InternalTransition__EventAssignment_4_1");
					put(grammarAccess.getInternalTransitionAccess().getGuardAssignment_5_1(), "rule__InternalTransition__GuardAssignment_5_1");
					put(grammarAccess.getInternalTransitionAccess().getActionAssignment_6_1(), "rule__InternalTransition__ActionAssignment_6_1");
					put(grammarAccess.getReceiveMessageAccess().getNameAssignment_0_0(), "rule__ReceiveMessage__NameAssignment_0_0");
					put(grammarAccess.getReceiveMessageAccess().getPortAssignment_1(), "rule__ReceiveMessage__PortAssignment_1");
					put(grammarAccess.getReceiveMessageAccess().getMessageAssignment_3(), "rule__ReceiveMessage__MessageAssignment_3");
					put(grammarAccess.getActionBlockAccess().getActionsAssignment_2(), "rule__ActionBlock__ActionsAssignment_2");
					put(grammarAccess.getExternStatementAccess().getStatementAssignment_0(), "rule__ExternStatement__StatementAssignment_0");
					put(grammarAccess.getExternStatementAccess().getSegmentsAssignment_1_1(), "rule__ExternStatement__SegmentsAssignment_1_1");
					put(grammarAccess.getLocalVariableAccess().getChangeableAssignment_0(), "rule__LocalVariable__ChangeableAssignment_0");
					put(grammarAccess.getLocalVariableAccess().getNameAssignment_2(), "rule__LocalVariable__NameAssignment_2");
					put(grammarAccess.getLocalVariableAccess().getTypeRefAssignment_4(), "rule__LocalVariable__TypeRefAssignment_4");
					put(grammarAccess.getLocalVariableAccess().getInitAssignment_5_1(), "rule__LocalVariable__InitAssignment_5_1");
					put(grammarAccess.getLocalVariableAccess().getAnnotationsAssignment_6(), "rule__LocalVariable__AnnotationsAssignment_6");
					put(grammarAccess.getSendActionAccess().getPortAssignment_0(), "rule__SendAction__PortAssignment_0");
					put(grammarAccess.getSendActionAccess().getMessageAssignment_2(), "rule__SendAction__MessageAssignment_2");
					put(grammarAccess.getSendActionAccess().getParametersAssignment_4_0(), "rule__SendAction__ParametersAssignment_4_0");
					put(grammarAccess.getSendActionAccess().getParametersAssignment_4_1_1(), "rule__SendAction__ParametersAssignment_4_1_1");
					put(grammarAccess.getVariableAssignmentAccess().getPropertyAssignment_0(), "rule__VariableAssignment__PropertyAssignment_0");
					put(grammarAccess.getVariableAssignmentAccess().getIndexAssignment_1_1(), "rule__VariableAssignment__IndexAssignment_1_1");
					put(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_3(), "rule__VariableAssignment__ExpressionAssignment_3");
					put(grammarAccess.getIncrementAccess().getVarAssignment_0(), "rule__Increment__VarAssignment_0");
					put(grammarAccess.getDecrementAccess().getVarAssignment_0(), "rule__Decrement__VarAssignment_0");
					put(grammarAccess.getLoopActionAccess().getConditionAssignment_2(), "rule__LoopAction__ConditionAssignment_2");
					put(grammarAccess.getLoopActionAccess().getActionAssignment_4(), "rule__LoopAction__ActionAssignment_4");
					put(grammarAccess.getConditionalActionAccess().getConditionAssignment_2(), "rule__ConditionalAction__ConditionAssignment_2");
					put(grammarAccess.getConditionalActionAccess().getActionAssignment_4(), "rule__ConditionalAction__ActionAssignment_4");
					put(grammarAccess.getConditionalActionAccess().getElseActionAssignment_5_1(), "rule__ConditionalAction__ElseActionAssignment_5_1");
					put(grammarAccess.getReturnActionAccess().getExpAssignment_1(), "rule__ReturnAction__ExpAssignment_1");
					put(grammarAccess.getPrintActionAccess().getMsgAssignment_1(), "rule__PrintAction__MsgAssignment_1");
					put(grammarAccess.getErrorActionAccess().getMsgAssignment_1(), "rule__ErrorAction__MsgAssignment_1");
					put(grammarAccess.getStartSessionAccess().getSessionAssignment_1(), "rule__StartSession__SessionAssignment_1");
					put(grammarAccess.getFunctionCallStatementAccess().getFunctionAssignment_0(), "rule__FunctionCallStatement__FunctionAssignment_0");
					put(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_0(), "rule__FunctionCallStatement__ParametersAssignment_2_0");
					put(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_1_1(), "rule__FunctionCallStatement__ParametersAssignment_2_1_1");
					put(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2(), "rule__OrExpression__RhsAssignment_1_2");
					put(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2(), "rule__AndExpression__RhsAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getRhsAssignment_1_0_2(), "rule__Equality__RhsAssignment_1_0_2");
					put(grammarAccess.getEqualityAccess().getRhsAssignment_1_1_2(), "rule__Equality__RhsAssignment_1_1_2");
					put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_0_2(), "rule__Comparaison__RhsAssignment_1_0_2");
					put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_1_2(), "rule__Comparaison__RhsAssignment_1_1_2");
					put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_2_2(), "rule__Comparaison__RhsAssignment_1_2_2");
					put(grammarAccess.getComparaisonAccess().getRhsAssignment_1_3_2(), "rule__Comparaison__RhsAssignment_1_3_2");
					put(grammarAccess.getAdditionAccess().getRhsAssignment_1_0_2(), "rule__Addition__RhsAssignment_1_0_2");
					put(grammarAccess.getAdditionAccess().getRhsAssignment_1_1_2(), "rule__Addition__RhsAssignment_1_1_2");
					put(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_0_2(), "rule__Multiplication__RhsAssignment_1_0_2");
					put(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_1_2(), "rule__Multiplication__RhsAssignment_1_1_2");
					put(grammarAccess.getModuloAccess().getRhsAssignment_1_2(), "rule__Modulo__RhsAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getTermAssignment_1_2(), "rule__Primary__TermAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getTermAssignment_2_2(), "rule__Primary__TermAssignment_2_2");
					put(grammarAccess.getArrayIndexPostfixAccess().getIndexAssignment_1_2(), "rule__ArrayIndexPostfix__IndexAssignment_1_2");
					put(grammarAccess.getExternExpressionAccess().getExpressionAssignment_0(), "rule__ExternExpression__ExpressionAssignment_0");
					put(grammarAccess.getExternExpressionAccess().getSegmentsAssignment_1_1(), "rule__ExternExpression__SegmentsAssignment_1_1");
					put(grammarAccess.getEnumLiteralRefAccess().getEnumAssignment_0(), "rule__EnumLiteralRef__EnumAssignment_0");
					put(grammarAccess.getEnumLiteralRefAccess().getLiteralAssignment_2(), "rule__EnumLiteralRef__LiteralAssignment_2");
					put(grammarAccess.getIntegerLiteralAccess().getIntValueAssignment(), "rule__IntegerLiteral__IntValueAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getBoolValueAssignment(), "rule__BooleanLiteral__BoolValueAssignment");
					put(grammarAccess.getStringLiteralAccess().getStringValueAssignment(), "rule__StringLiteral__StringValueAssignment");
					put(grammarAccess.getDoubleLiteralAccess().getDoubleValueAssignment(), "rule__DoubleLiteral__DoubleValueAssignment");
					put(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment(), "rule__PropertyReference__PropertyAssignment");
					put(grammarAccess.getEventReferenceAccess().getReceiveMsgAssignment_0(), "rule__EventReference__ReceiveMsgAssignment_0");
					put(grammarAccess.getEventReferenceAccess().getParameterAssignment_2(), "rule__EventReference__ParameterAssignment_2");
					put(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_0(), "rule__FunctionCallExpression__FunctionAssignment_0");
					put(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_0(), "rule__FunctionCallExpression__ParametersAssignment_2_0");
					put(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_1_1(), "rule__FunctionCallExpression__ParametersAssignment_2_1_1");
					put(grammarAccess.getConfigurationAccess().getNameAssignment_1(), "rule__Configuration__NameAssignment_1");
					put(grammarAccess.getConfigurationAccess().getAnnotationsAssignment_2(), "rule__Configuration__AnnotationsAssignment_2");
					put(grammarAccess.getConfigurationAccess().getInstancesAssignment_4_0(), "rule__Configuration__InstancesAssignment_4_0");
					put(grammarAccess.getConfigurationAccess().getConnectorsAssignment_4_1(), "rule__Configuration__ConnectorsAssignment_4_1");
					put(grammarAccess.getConfigurationAccess().getPropassignsAssignment_4_2(), "rule__Configuration__PropassignsAssignment_4_2");
					put(grammarAccess.getInstanceAccess().getNameAssignment_1(), "rule__Instance__NameAssignment_1");
					put(grammarAccess.getInstanceAccess().getTypeAssignment_3(), "rule__Instance__TypeAssignment_3");
					put(grammarAccess.getInstanceAccess().getAnnotationsAssignment_4(), "rule__Instance__AnnotationsAssignment_4");
					put(grammarAccess.getConfigPropertyAssignAccess().getInstanceAssignment_1(), "rule__ConfigPropertyAssign__InstanceAssignment_1");
					put(grammarAccess.getConfigPropertyAssignAccess().getPropertyAssignment_3(), "rule__ConfigPropertyAssign__PropertyAssignment_3");
					put(grammarAccess.getConfigPropertyAssignAccess().getIndexAssignment_4_1(), "rule__ConfigPropertyAssign__IndexAssignment_4_1");
					put(grammarAccess.getConfigPropertyAssignAccess().getInitAssignment_6(), "rule__ConfigPropertyAssign__InitAssignment_6");
					put(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsAssignment_7(), "rule__ConfigPropertyAssign__AnnotationsAssignment_7");
					put(grammarAccess.getConnectorAccess().getNameAssignment_1(), "rule__Connector__NameAssignment_1");
					put(grammarAccess.getConnectorAccess().getCliAssignment_2(), "rule__Connector__CliAssignment_2");
					put(grammarAccess.getConnectorAccess().getRequiredAssignment_4(), "rule__Connector__RequiredAssignment_4");
					put(grammarAccess.getConnectorAccess().getSrvAssignment_6(), "rule__Connector__SrvAssignment_6");
					put(grammarAccess.getConnectorAccess().getProvidedAssignment_8(), "rule__Connector__ProvidedAssignment_8");
					put(grammarAccess.getConnectorAccess().getAnnotationsAssignment_9(), "rule__Connector__AnnotationsAssignment_9");
					put(grammarAccess.getExternalConnectorAccess().getNameAssignment_1(), "rule__ExternalConnector__NameAssignment_1");
					put(grammarAccess.getExternalConnectorAccess().getInstAssignment_2(), "rule__ExternalConnector__InstAssignment_2");
					put(grammarAccess.getExternalConnectorAccess().getPortAssignment_4(), "rule__ExternalConnector__PortAssignment_4");
					put(grammarAccess.getExternalConnectorAccess().getProtocolAssignment_6(), "rule__ExternalConnector__ProtocolAssignment_6");
					put(grammarAccess.getExternalConnectorAccess().getAnnotationsAssignment_7(), "rule__ExternalConnector__AnnotationsAssignment_7");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalThingMLParser typedParser = (InternalThingMLParser) parser;
			typedParser.entryRuleThingMLModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ThingMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ThingMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
