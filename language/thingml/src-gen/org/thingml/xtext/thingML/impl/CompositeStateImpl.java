/**
 * *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.thingml.xtext.thingML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.thingml.xtext.thingML.Action;
import org.thingml.xtext.thingML.CompositeState;
import org.thingml.xtext.thingML.InternalTransition;
import org.thingml.xtext.thingML.Property;
import org.thingml.xtext.thingML.Region;
import org.thingml.xtext.thingML.RegionOrSession;
import org.thingml.xtext.thingML.State;
import org.thingml.xtext.thingML.ThingMLPackage;
import org.thingml.xtext.thingML.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#isHistory <em>History</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getSubstate <em>Substate</em>}</li>
 *   <li>{@link org.thingml.xtext.thingML.impl.CompositeStateImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStateImpl extends AnnotatedElementImpl implements CompositeState
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected Action entry;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected Action exit;

  /**
   * The cached value of the '{@link #getInternal() <em>Internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternal()
   * @generated
   * @ordered
   */
  protected EList<InternalTransition> internal;

  /**
   * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoing()
   * @generated
   * @ordered
   */
  protected EList<Transition> outgoing;

  /**
   * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected State initial;

  /**
   * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHistory()
   * @generated
   * @ordered
   */
  protected static final boolean HISTORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHistory()
   * @generated
   * @ordered
   */
  protected boolean history = HISTORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubstate() <em>Substate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstate()
   * @generated
   * @ordered
   */
  protected EList<State> substate;

  /**
   * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegion()
   * @generated
   * @ordered
   */
  protected EList<RegionOrSession> region;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeStateImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ThingMLPackage.Literals.COMPOSITE_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, ThingMLPackage.COMPOSITE_STATE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getEntry()
  {
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntry(Action newEntry, NotificationChain msgs)
  {
    Action oldEntry = entry;
    entry = newEntry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__ENTRY, oldEntry, newEntry);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntry(Action newEntry)
  {
    if (newEntry != entry)
    {
      NotificationChain msgs = null;
      if (entry != null)
        msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.COMPOSITE_STATE__ENTRY, null, msgs);
      if (newEntry != null)
        msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.COMPOSITE_STATE__ENTRY, null, msgs);
      msgs = basicSetEntry(newEntry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__ENTRY, newEntry, newEntry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExit(Action newExit, NotificationChain msgs)
  {
    Action oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__EXIT, oldExit, newExit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExit(Action newExit)
  {
    if (newExit != exit)
    {
      NotificationChain msgs = null;
      if (exit != null)
        msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.COMPOSITE_STATE__EXIT, null, msgs);
      if (newExit != null)
        msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingMLPackage.COMPOSITE_STATE__EXIT, null, msgs);
      msgs = basicSetExit(newExit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__EXIT, newExit, newExit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InternalTransition> getInternal()
  {
    if (internal == null)
    {
      internal = new EObjectContainmentEList<InternalTransition>(InternalTransition.class, this, ThingMLPackage.COMPOSITE_STATE__INTERNAL);
    }
    return internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getOutgoing()
  {
    if (outgoing == null)
    {
      outgoing = new EObjectContainmentEList<Transition>(Transition.class, this, ThingMLPackage.COMPOSITE_STATE__OUTGOING);
    }
    return outgoing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getInitial()
  {
    if (initial != null && initial.eIsProxy())
    {
      InternalEObject oldInitial = (InternalEObject)initial;
      initial = (State)eResolveProxy(oldInitial);
      if (initial != oldInitial)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ThingMLPackage.COMPOSITE_STATE__INITIAL, oldInitial, initial));
      }
    }
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitial(State newInitial)
  {
    State oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__INITIAL, oldInitial, initial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHistory()
  {
    return history;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHistory(boolean newHistory)
  {
    boolean oldHistory = history;
    history = newHistory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ThingMLPackage.COMPOSITE_STATE__HISTORY, oldHistory, history));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getSubstate()
  {
    if (substate == null)
    {
      substate = new EObjectContainmentEList<State>(State.class, this, ThingMLPackage.COMPOSITE_STATE__SUBSTATE);
    }
    return substate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RegionOrSession> getRegion()
  {
    if (region == null)
    {
      region = new EObjectContainmentEList<RegionOrSession>(RegionOrSession.class, this, ThingMLPackage.COMPOSITE_STATE__REGION);
    }
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case ThingMLPackage.COMPOSITE_STATE__ENTRY:
        return basicSetEntry(null, msgs);
      case ThingMLPackage.COMPOSITE_STATE__EXIT:
        return basicSetExit(null, msgs);
      case ThingMLPackage.COMPOSITE_STATE__INTERNAL:
        return ((InternalEList<?>)getInternal()).basicRemove(otherEnd, msgs);
      case ThingMLPackage.COMPOSITE_STATE__OUTGOING:
        return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
      case ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
        return ((InternalEList<?>)getSubstate()).basicRemove(otherEnd, msgs);
      case ThingMLPackage.COMPOSITE_STATE__REGION:
        return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ThingMLPackage.COMPOSITE_STATE__NAME:
        return getName();
      case ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
        return getProperties();
      case ThingMLPackage.COMPOSITE_STATE__ENTRY:
        return getEntry();
      case ThingMLPackage.COMPOSITE_STATE__EXIT:
        return getExit();
      case ThingMLPackage.COMPOSITE_STATE__INTERNAL:
        return getInternal();
      case ThingMLPackage.COMPOSITE_STATE__OUTGOING:
        return getOutgoing();
      case ThingMLPackage.COMPOSITE_STATE__INITIAL:
        if (resolve) return getInitial();
        return basicGetInitial();
      case ThingMLPackage.COMPOSITE_STATE__HISTORY:
        return isHistory();
      case ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
        return getSubstate();
      case ThingMLPackage.COMPOSITE_STATE__REGION:
        return getRegion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ThingMLPackage.COMPOSITE_STATE__NAME:
        setName((String)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__ENTRY:
        setEntry((Action)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__EXIT:
        setExit((Action)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__INTERNAL:
        getInternal().clear();
        getInternal().addAll((Collection<? extends InternalTransition>)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__OUTGOING:
        getOutgoing().clear();
        getOutgoing().addAll((Collection<? extends Transition>)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__INITIAL:
        setInitial((State)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__HISTORY:
        setHistory((Boolean)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
        getSubstate().clear();
        getSubstate().addAll((Collection<? extends State>)newValue);
        return;
      case ThingMLPackage.COMPOSITE_STATE__REGION:
        getRegion().clear();
        getRegion().addAll((Collection<? extends RegionOrSession>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ThingMLPackage.COMPOSITE_STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
        getProperties().clear();
        return;
      case ThingMLPackage.COMPOSITE_STATE__ENTRY:
        setEntry((Action)null);
        return;
      case ThingMLPackage.COMPOSITE_STATE__EXIT:
        setExit((Action)null);
        return;
      case ThingMLPackage.COMPOSITE_STATE__INTERNAL:
        getInternal().clear();
        return;
      case ThingMLPackage.COMPOSITE_STATE__OUTGOING:
        getOutgoing().clear();
        return;
      case ThingMLPackage.COMPOSITE_STATE__INITIAL:
        setInitial((State)null);
        return;
      case ThingMLPackage.COMPOSITE_STATE__HISTORY:
        setHistory(HISTORY_EDEFAULT);
        return;
      case ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
        getSubstate().clear();
        return;
      case ThingMLPackage.COMPOSITE_STATE__REGION:
        getRegion().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ThingMLPackage.COMPOSITE_STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ThingMLPackage.COMPOSITE_STATE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case ThingMLPackage.COMPOSITE_STATE__ENTRY:
        return entry != null;
      case ThingMLPackage.COMPOSITE_STATE__EXIT:
        return exit != null;
      case ThingMLPackage.COMPOSITE_STATE__INTERNAL:
        return internal != null && !internal.isEmpty();
      case ThingMLPackage.COMPOSITE_STATE__OUTGOING:
        return outgoing != null && !outgoing.isEmpty();
      case ThingMLPackage.COMPOSITE_STATE__INITIAL:
        return initial != null;
      case ThingMLPackage.COMPOSITE_STATE__HISTORY:
        return history != HISTORY_EDEFAULT;
      case ThingMLPackage.COMPOSITE_STATE__SUBSTATE:
        return substate != null && !substate.isEmpty();
      case ThingMLPackage.COMPOSITE_STATE__REGION:
        return region != null && !region.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Region.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == State.class)
    {
      switch (derivedFeatureID)
      {
        case ThingMLPackage.COMPOSITE_STATE__NAME: return ThingMLPackage.STATE__NAME;
        case ThingMLPackage.COMPOSITE_STATE__PROPERTIES: return ThingMLPackage.STATE__PROPERTIES;
        case ThingMLPackage.COMPOSITE_STATE__ENTRY: return ThingMLPackage.STATE__ENTRY;
        case ThingMLPackage.COMPOSITE_STATE__EXIT: return ThingMLPackage.STATE__EXIT;
        case ThingMLPackage.COMPOSITE_STATE__INTERNAL: return ThingMLPackage.STATE__INTERNAL;
        case ThingMLPackage.COMPOSITE_STATE__OUTGOING: return ThingMLPackage.STATE__OUTGOING;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Region.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == State.class)
    {
      switch (baseFeatureID)
      {
        case ThingMLPackage.STATE__NAME: return ThingMLPackage.COMPOSITE_STATE__NAME;
        case ThingMLPackage.STATE__PROPERTIES: return ThingMLPackage.COMPOSITE_STATE__PROPERTIES;
        case ThingMLPackage.STATE__ENTRY: return ThingMLPackage.COMPOSITE_STATE__ENTRY;
        case ThingMLPackage.STATE__EXIT: return ThingMLPackage.COMPOSITE_STATE__EXIT;
        case ThingMLPackage.STATE__INTERNAL: return ThingMLPackage.COMPOSITE_STATE__INTERNAL;
        case ThingMLPackage.STATE__OUTGOING: return ThingMLPackage.COMPOSITE_STATE__OUTGOING;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", history: ");
    result.append(history);
    result.append(')');
    return result.toString();
  }

} //CompositeStateImpl
