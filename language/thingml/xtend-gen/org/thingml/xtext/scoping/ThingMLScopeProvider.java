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
/**
 * generated by Xtext 2.10.0
 */
package org.thingml.xtext.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.thingml.xtext.constraints.ThingMLHelpers;
import org.thingml.xtext.helpers.ConfigurationHelper;
import org.thingml.xtext.helpers.ThingMLElementHelper;
import org.thingml.xtext.scoping.AbstractThingMLScopeProvider;
import org.thingml.xtext.thingML.ConfigPropertyAssign;
import org.thingml.xtext.thingML.Configuration;
import org.thingml.xtext.thingML.Connector;
import org.thingml.xtext.thingML.Decrement;
import org.thingml.xtext.thingML.EnumLiteralRef;
import org.thingml.xtext.thingML.Event;
import org.thingml.xtext.thingML.EventReference;
import org.thingml.xtext.thingML.ExternalConnector;
import org.thingml.xtext.thingML.Handler;
import org.thingml.xtext.thingML.Increment;
import org.thingml.xtext.thingML.Instance;
import org.thingml.xtext.thingML.Port;
import org.thingml.xtext.thingML.PropertyAssign;
import org.thingml.xtext.thingML.PropertyReference;
import org.thingml.xtext.thingML.ReceiveMessage;
import org.thingml.xtext.thingML.SendAction;
import org.thingml.xtext.thingML.Session;
import org.thingml.xtext.thingML.StartSession;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.StateContainer;
import org.thingml.xtext.thingML.Thing;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Transition;
import org.thingml.xtext.thingML.VariableAssignment;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class ThingMLScopeProvider extends AbstractThingMLScopeProvider {
  private final ThingMLPackage p = ThingMLPackage.eINSTANCE;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((Objects.equal(reference, this.p.getPort_Receives()) || Objects.equal(reference, this.p.getPort_Sends()))) {
      return this.scopeForPort_SendsReceives(((Port) context));
    } else {
      EReference _sendAction_Port = this.p.getSendAction_Port();
      boolean _equals = Objects.equal(reference, _sendAction_Port);
      if (_equals) {
        return this.scopeForSendAction_Port(((SendAction) context));
      } else {
        EReference _sendAction_Message = this.p.getSendAction_Message();
        boolean _equals_1 = Objects.equal(reference, _sendAction_Message);
        if (_equals_1) {
          return this.scopeForSendAction_Message(((SendAction) context));
        } else {
          EReference _configPropertyAssign_Property = this.p.getConfigPropertyAssign_Property();
          boolean _equals_2 = Objects.equal(reference, _configPropertyAssign_Property);
          if (_equals_2) {
            return this.scopeForConfigPropertyAssign_Property(((ConfigPropertyAssign) context));
          } else {
            if ((Objects.equal(reference, this.p.getConnector_Cli()) || Objects.equal(reference, this.p.getConnector_Srv()))) {
              return this.scopeForConnector_CliSrV(((Connector) context));
            } else {
              EReference _connector_Provided = this.p.getConnector_Provided();
              boolean _equals_3 = Objects.equal(reference, _connector_Provided);
              if (_equals_3) {
                return this.scopeForConnector_Provided(((Connector) context));
              } else {
                EReference _connector_Required = this.p.getConnector_Required();
                boolean _equals_4 = Objects.equal(reference, _connector_Required);
                if (_equals_4) {
                  return this.scopeForConnector_Required(((Connector) context));
                } else {
                  EReference _decrement_Var = this.p.getDecrement_Var();
                  boolean _equals_5 = Objects.equal(reference, _decrement_Var);
                  if (_equals_5) {
                    return this.scopeForDecrement_Var(((Decrement) context));
                  } else {
                    EReference _enumLiteralRef_Enum = this.p.getEnumLiteralRef_Enum();
                    boolean _equals_6 = Objects.equal(reference, _enumLiteralRef_Enum);
                    if (_equals_6) {
                      return this.scopeForEnumLiteralRef_Enum(((EnumLiteralRef) context));
                    } else {
                      EReference _enumLiteralRef_Literal = this.p.getEnumLiteralRef_Literal();
                      boolean _equals_7 = Objects.equal(reference, _enumLiteralRef_Literal);
                      if (_equals_7) {
                        return this.scopeForEnumLiteralRef_Literal(((EnumLiteralRef) context));
                      } else {
                        EReference _externalConnector_Port = this.p.getExternalConnector_Port();
                        boolean _equals_8 = Objects.equal(reference, _externalConnector_Port);
                        if (_equals_8) {
                          return this.scopeForExternalConnector_Port(((ExternalConnector) context));
                        } else {
                          EReference _externalConnector_Protocol = this.p.getExternalConnector_Protocol();
                          boolean _equals_9 = Objects.equal(reference, _externalConnector_Protocol);
                          if (_equals_9) {
                            return this.scopeForExternalConnector_Protocol(((ExternalConnector) context));
                          } else {
                            if ((Objects.equal(reference, this.p.getFunctionCallExpression_Function()) || Objects.equal(reference, this.p.getFunctionCallStatement_Function()))) {
                              return this.scopeForFunctionCallExpressionFunctionCallStatement_Function(context);
                            } else {
                              EReference _increment_Var = this.p.getIncrement_Var();
                              boolean _equals_10 = Objects.equal(reference, _increment_Var);
                              if (_equals_10) {
                                return this.scopeForIncrement_Var(((Increment) context));
                              } else {
                                EReference _instance_Type = this.p.getInstance_Type();
                                boolean _equals_11 = Objects.equal(reference, _instance_Type);
                                if (_equals_11) {
                                  return this.scopeForInstance_Type(((Instance) context));
                                } else {
                                  EReference _propertyAssign_Property = this.p.getPropertyAssign_Property();
                                  boolean _equals_12 = Objects.equal(reference, _propertyAssign_Property);
                                  if (_equals_12) {
                                    return this.scopeForPropertyAssign_Property(((PropertyAssign) context));
                                  } else {
                                    EReference _propertyReference_Property = this.p.getPropertyReference_Property();
                                    boolean _equals_13 = Objects.equal(reference, _propertyReference_Property);
                                    if (_equals_13) {
                                      return this.scopeForPropertyReference_Property(((PropertyReference) context));
                                    } else {
                                      EReference _receiveMessage_Port = this.p.getReceiveMessage_Port();
                                      boolean _equals_14 = Objects.equal(reference, _receiveMessage_Port);
                                      if (_equals_14) {
                                        return this.scopeForReceiveMessage_Port(((ReceiveMessage) context));
                                      } else {
                                        EReference _receiveMessage_Message = this.p.getReceiveMessage_Message();
                                        boolean _equals_15 = Objects.equal(reference, _receiveMessage_Message);
                                        if (_equals_15) {
                                          return this.scopeForReceiveMessage_Message(((ReceiveMessage) context));
                                        } else {
                                          EReference _startSession_Session = this.p.getStartSession_Session();
                                          boolean _equals_16 = Objects.equal(reference, _startSession_Session);
                                          if (_equals_16) {
                                            return this.scopeForStartSession_Session(((StartSession) context));
                                          } else {
                                            EReference _thing_Includes = this.p.getThing_Includes();
                                            boolean _equals_17 = Objects.equal(reference, _thing_Includes);
                                            if (_equals_17) {
                                              return this.scopeForThing_Includes(((Thing) context));
                                            } else {
                                              EReference _transition_Target = this.p.getTransition_Target();
                                              boolean _equals_18 = Objects.equal(reference, _transition_Target);
                                              if (_equals_18) {
                                                return this.scopeForTransition_Target(((Transition) context));
                                              } else {
                                                EReference _typeRef_Type = this.p.getTypeRef_Type();
                                                boolean _equals_19 = Objects.equal(reference, _typeRef_Type);
                                                if (_equals_19) {
                                                  return this.scopeForTypeRef_Type(context);
                                                } else {
                                                  EReference _castExpression_Type = this.p.getCastExpression_Type();
                                                  boolean _equals_20 = Objects.equal(reference, _castExpression_Type);
                                                  if (_equals_20) {
                                                    return this.scopeForCastExpression_Type(context);
                                                  } else {
                                                    EReference _variableAssignment_Property = this.p.getVariableAssignment_Property();
                                                    boolean _equals_21 = Objects.equal(reference, _variableAssignment_Property);
                                                    if (_equals_21) {
                                                      return this.scopeForVariableAssignment_Property(((VariableAssignment) context));
                                                    } else {
                                                      EReference _stateContainer_Initial = this.p.getStateContainer_Initial();
                                                      boolean _equals_22 = Objects.equal(reference, _stateContainer_Initial);
                                                      if (_equals_22) {
                                                        return this.scopeForStateContainer_Initial(((StateContainer) context));
                                                      } else {
                                                        EReference _eventReference_ReceiveMsg = this.p.getEventReference_ReceiveMsg();
                                                        boolean _equals_23 = Objects.equal(reference, _eventReference_ReceiveMsg);
                                                        if (_equals_23) {
                                                          return this.scopeForEventReference_ReceiveMsg(((EventReference) context));
                                                        } else {
                                                          EReference _eventReference_Parameter = this.p.getEventReference_Parameter();
                                                          boolean _equals_24 = Objects.equal(reference, _eventReference_Parameter);
                                                          if (_equals_24) {
                                                            return this.scopeForEventReference_Parameter(((EventReference) context));
                                                          } else {
                                                            EReference _startSession_Session_1 = this.p.getStartSession_Session();
                                                            boolean _equals_25 = Objects.equal(reference, _startSession_Session_1);
                                                            if (_equals_25) {
                                                              return this.scopeForStartSession_Session(((StartSession) context));
                                                            } else {
                                                              if ((((Objects.equal(reference, this.p.getConfigPropertyAssign_Instance()) || Objects.equal(reference, this.p.getConnector_Cli())) || Objects.equal(reference, this.p.getConnector_Srv())) || Objects.equal(reference, this.p.getExternalConnector_Inst()))) {
                                                                return this.scopeForConfigurationInstances(ThingMLElementHelper.findContainingConfiguration(context));
                                                              } else {
                                                                String _name = reference.getName();
                                                                String _plus = ("INFO: Resolving reference : " + _name);
                                                                String _plus_1 = (_plus + " in Class ");
                                                                EObject _eContainer = reference.eContainer();
                                                                String _name_1 = ((ENamedElement) _eContainer).getName();
                                                                String _plus_2 = (_plus_1 + _name_1);
                                                                System.out.println(_plus_2);
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Scopes.scopeFor(this.EMPTY);
  }
  
  protected ArrayList EMPTY = new ArrayList<Object>();
  
  protected IScope scopeForStateContainer_Initial(final StateContainer context) {
    return Scopes.scopeFor(context.getSubstate());
  }
  
  protected IScope scopeForConfigurationInstances(final Configuration context) {
    return Scopes.scopeFor(ConfigurationHelper.allInstances(context));
  }
  
  protected IScope scopeForSession_Initial(final Session context) {
    return Scopes.scopeFor(context.getSubstate());
  }
  
  protected IScope scopeForEventReference_ReceiveMsg(final EventReference context) {
    IScope _xblockexpression = null;
    {
      Handler h = ThingMLHelpers.findContainingHandler(context);
      IScope _xifexpression = null;
      boolean _equals = Objects.equal(h, null);
      if (_equals) {
        _xifexpression = Scopes.scopeFor(this.EMPTY);
      } else {
        _xifexpression = Scopes.scopeFor(h.getEvent());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected IScope scopeForEventReference_Parameter(final EventReference context) {
    IScope _xifexpression = null;
    if (((!Objects.equal(context.getReceiveMsg(), null)) && (context.getReceiveMsg() instanceof ReceiveMessage))) {
      Event _receiveMsg = context.getReceiveMsg();
      _xifexpression = Scopes.scopeFor(((ReceiveMessage) _receiveMsg).getMessage().getParameters());
    } else {
      _xifexpression = Scopes.scopeFor(this.EMPTY);
    }
    return _xifexpression;
  }
  
  protected IScope scopeForPort_SendsReceives(final Port context) {
    EObject _eContainer = context.eContainer();
    return Scopes.scopeFor(ThingMLHelpers.allMessages(((Thing) _eContainer)));
  }
  
  protected IScope scopeForSendAction_Port(final SendAction context) {
    return Scopes.scopeFor(ThingMLHelpers.allPorts(ThingMLHelpers.findContainingThing(context)));
  }
  
  protected IScope scopeForSendAction_Message(final SendAction context) {
    return Scopes.scopeFor(context.getPort().getSends());
  }
  
  protected IScope scopeForConfigPropertyAssign_Property(final ConfigPropertyAssign context) {
    return Scopes.scopeFor(ThingMLHelpers.allProperties(context.getInstance().getType()));
  }
  
  protected IScope scopeForConnector_CliSrV(final Connector context) {
    EObject _eContainer = context.eContainer();
    return Scopes.scopeFor(ConfigurationHelper.allInstances(((Configuration) _eContainer)));
  }
  
  protected IScope scopeForConnector_Provided(final Connector context) {
    return Scopes.scopeFor(ThingMLHelpers.allProvidedPorts(context.getSrv().getType()));
  }
  
  protected IScope scopeForConnector_Required(final Connector context) {
    return Scopes.scopeFor(ThingMLHelpers.allRequiredPorts(context.getCli().getType()));
  }
  
  protected IScope scopeForDecrement_Var(final Decrement context) {
    return Scopes.scopeFor(ThingMLHelpers.allVisibleVariables(context));
  }
  
  protected IScope scopeForEnumLiteralRef_Enum(final EnumLiteralRef context) {
    return Scopes.scopeFor(ThingMLHelpers.allEnnumerations(ThingMLHelpers.findContainingModel(context)));
  }
  
  protected IScope scopeForEnumLiteralRef_Literal(final EnumLiteralRef context) {
    return Scopes.scopeFor(context.getEnum().getLiterals());
  }
  
  protected IScope scopeForExternalConnector_Port(final ExternalConnector context) {
    return Scopes.scopeFor(ThingMLHelpers.allPorts(context.getInst().getType()));
  }
  
  protected IScope scopeForExternalConnector_Protocol(final ExternalConnector context) {
    return Scopes.scopeFor(ThingMLHelpers.allProtocols(ThingMLHelpers.findContainingModel(context)));
  }
  
  protected IScope scopeForFunctionCallExpressionFunctionCallStatement_Function(final EObject context) {
    return Scopes.scopeFor(ThingMLHelpers.allFunctions(ThingMLHelpers.findContainingThing(context)));
  }
  
  protected IScope scopeForIncrement_Var(final Increment context) {
    return Scopes.scopeFor(ThingMLHelpers.allVisibleVariables(context));
  }
  
  protected IScope scopeForInstance_Type(final Instance context) {
    return Scopes.scopeFor(ThingMLHelpers.allThings(ThingMLHelpers.findContainingModel(context)));
  }
  
  protected IScope scopeForPropertyAssign_Property(final PropertyAssign context) {
    IScope _xblockexpression = null;
    {
      final Thing t = ThingMLHelpers.findContainingThing(context);
      boolean _notEquals = (!Objects.equal(t, null));
      if (_notEquals) {
        return Scopes.scopeFor(ThingMLHelpers.allProperties(t));
      }
      final Instance i = ThingMLHelpers.findContainingInstance(context);
      boolean _notEquals_1 = (!Objects.equal(i, null));
      if (_notEquals_1) {
        return Scopes.scopeFor(ThingMLHelpers.allProperties(i.getType()));
      }
      _xblockexpression = Scopes.scopeFor(this.EMPTY);
    }
    return _xblockexpression;
  }
  
  protected IScope scopeForPropertyReference_Property(final PropertyReference context) {
    return Scopes.scopeFor(ThingMLHelpers.allVisibleVariables(context));
  }
  
  protected IScope scopeForReceiveMessage_Port(final ReceiveMessage context) {
    return Scopes.scopeFor(ThingMLHelpers.allPorts(ThingMLHelpers.findContainingThing(context)));
  }
  
  protected IScope scopeForReceiveMessage_Message(final ReceiveMessage context) {
    return Scopes.scopeFor(context.getPort().getReceives());
  }
  
  protected IScope scopeForReference_Reference(final EObject context) {
    return Scopes.scopeFor(this.EMPTY);
  }
  
  protected IScope scopeForStartSession_Session(final StartSession context) {
    return Scopes.scopeFor(ThingMLHelpers.allVisibleSessions(context));
  }
  
  protected IScope scopeForThing_Includes(final Thing context) {
    return Scopes.scopeFor(ThingMLHelpers.allThings(ThingMLHelpers.findContainingModel(context)));
  }
  
  protected IScope scopeForTransition_Target(final Transition context) {
    EObject _eContainer = context.eContainer();
    return Scopes.scopeFor(ThingMLHelpers.allValidTargetStates(((State) _eContainer)));
  }
  
  protected IScope scopeForTypeRef_Type(final EObject context) {
    return Scopes.scopeFor(ThingMLHelpers.allTypes(ThingMLHelpers.findContainingModel(context)));
  }
  
  protected IScope scopeForCastExpression_Type(final EObject context) {
    return Scopes.scopeFor(ThingMLHelpers.allTypes(ThingMLHelpers.findContainingModel(context)));
  }
  
  protected IScope scopeForVariableAssignment_Property(final VariableAssignment context) {
    return Scopes.scopeFor(ThingMLHelpers.allVisibleVariables(context));
  }
}
