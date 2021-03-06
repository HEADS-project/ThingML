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
package org.sintef.thingml.impl;

import java.util.Collection;
import java.util.*;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sintef.thingml.Action;
import org.sintef.thingml.InternalTransition;
import org.sintef.thingml.Property;
import org.sintef.thingml.State;
import org.sintef.thingml.ThingmlPackage;
import org.sintef.thingml.Transition;
import org.sintef.thingml.*;
import org.sintef.thingml.constraints.ThingMLHelpers;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sintef.thingml.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.StateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sintef.thingml.impl.StateImpl#getInternal <em>Internal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends AnnotatedElementImpl implements State {
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
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ThingmlPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, ThingmlPackage.STATE__OUTGOING, ThingmlPackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null) {
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, ThingmlPackage.STATE__INCOMING, ThingmlPackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Action newEntry, NotificationChain msgs) {
		Action oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingmlPackage.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Action newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingmlPackage.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingmlPackage.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmlPackage.STATE__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Action newExit, NotificationChain msgs) {
		Action oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ThingmlPackage.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Action newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ThingmlPackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ThingmlPackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ThingmlPackage.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, ThingmlPackage.STATE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalTransition> getInternal() {
		if (internal == null) {
			internal = new EObjectContainmentEList<InternalTransition>(InternalTransition.class, this, ThingmlPackage.STATE__INTERNAL);
		}
		return internal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingmlPackage.STATE__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
			case ThingmlPackage.STATE__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ThingmlPackage.STATE__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
			case ThingmlPackage.STATE__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case ThingmlPackage.STATE__ENTRY:
				return basicSetEntry(null, msgs);
			case ThingmlPackage.STATE__EXIT:
				return basicSetExit(null, msgs);
			case ThingmlPackage.STATE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ThingmlPackage.STATE__INTERNAL:
				return ((InternalEList<?>)getInternal()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ThingmlPackage.STATE__OUTGOING:
				return getOutgoing();
			case ThingmlPackage.STATE__INCOMING:
				return getIncoming();
			case ThingmlPackage.STATE__ENTRY:
				return getEntry();
			case ThingmlPackage.STATE__EXIT:
				return getExit();
			case ThingmlPackage.STATE__PROPERTIES:
				return getProperties();
			case ThingmlPackage.STATE__INTERNAL:
				return getInternal();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ThingmlPackage.STATE__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
				return;
			case ThingmlPackage.STATE__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case ThingmlPackage.STATE__ENTRY:
				setEntry((Action)newValue);
				return;
			case ThingmlPackage.STATE__EXIT:
				setExit((Action)newValue);
				return;
			case ThingmlPackage.STATE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case ThingmlPackage.STATE__INTERNAL:
				getInternal().clear();
				getInternal().addAll((Collection<? extends InternalTransition>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ThingmlPackage.STATE__OUTGOING:
				getOutgoing().clear();
				return;
			case ThingmlPackage.STATE__INCOMING:
				getIncoming().clear();
				return;
			case ThingmlPackage.STATE__ENTRY:
				setEntry((Action)null);
				return;
			case ThingmlPackage.STATE__EXIT:
				setExit((Action)null);
				return;
			case ThingmlPackage.STATE__PROPERTIES:
				getProperties().clear();
				return;
			case ThingmlPackage.STATE__INTERNAL:
				getInternal().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ThingmlPackage.STATE__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
			case ThingmlPackage.STATE__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ThingmlPackage.STATE__ENTRY:
				return entry != null;
			case ThingmlPackage.STATE__EXIT:
				return exit != null;
			case ThingmlPackage.STATE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case ThingmlPackage.STATE__INTERNAL:
				return internal != null && !internal.isEmpty();
		}
		return super.eIsSet(featureID);
	}




} //StateImpl
