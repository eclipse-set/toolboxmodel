/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Nahbedienung.Bezeichnung_NB_TypeClass;
import org.eclipse.set.toolboxmodel.Nahbedienung.Kennzahl_TypeClass;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Bezeichnung_AttributeGroupImpl#getBezeichnungNB <em>Bezeichnung NB</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Bezeichnung_AttributeGroupImpl#getKennzahl <em>Kennzahl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements NB_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungNB() <em>Bezeichnung NB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungNB()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_NB_TypeClass bezeichnungNB;

	/**
	 * The cached value of the '{@link #getKennzahl() <em>Kennzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennzahl()
	 * @generated
	 * @ordered
	 */
	protected Kennzahl_TypeClass kennzahl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_NB_TypeClass getBezeichnungNB() {
		return bezeichnungNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungNB(Bezeichnung_NB_TypeClass newBezeichnungNB, NotificationChain msgs) {
		Bezeichnung_NB_TypeClass oldBezeichnungNB = bezeichnungNB;
		bezeichnungNB = newBezeichnungNB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB, oldBezeichnungNB, newBezeichnungNB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezeichnungNB(Bezeichnung_NB_TypeClass newBezeichnungNB) {
		if (newBezeichnungNB != bezeichnungNB) {
			NotificationChain msgs = null;
			if (bezeichnungNB != null)
				msgs = ((InternalEObject)bezeichnungNB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB, null, msgs);
			if (newBezeichnungNB != null)
				msgs = ((InternalEObject)newBezeichnungNB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB, null, msgs);
			msgs = basicSetBezeichnungNB(newBezeichnungNB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB, newBezeichnungNB, newBezeichnungNB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kennzahl_TypeClass getKennzahl() {
		return kennzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKennzahl(Kennzahl_TypeClass newKennzahl, NotificationChain msgs) {
		Kennzahl_TypeClass oldKennzahl = kennzahl;
		kennzahl = newKennzahl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL, oldKennzahl, newKennzahl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennzahl(Kennzahl_TypeClass newKennzahl) {
		if (newKennzahl != kennzahl) {
			NotificationChain msgs = null;
			if (kennzahl != null)
				msgs = ((InternalEObject)kennzahl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL, null, msgs);
			if (newKennzahl != null)
				msgs = ((InternalEObject)newKennzahl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL, null, msgs);
			msgs = basicSetKennzahl(newKennzahl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL, newKennzahl, newKennzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB:
				return basicSetBezeichnungNB(null, msgs);
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL:
				return basicSetKennzahl(null, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB:
				return getBezeichnungNB();
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL:
				return getKennzahl();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB:
				setBezeichnungNB((Bezeichnung_NB_TypeClass)newValue);
				return;
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL:
				setKennzahl((Kennzahl_TypeClass)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB:
				setBezeichnungNB((Bezeichnung_NB_TypeClass)null);
				return;
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL:
				setKennzahl((Kennzahl_TypeClass)null);
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB:
				return bezeichnungNB != null;
			case NahbedienungPackage.NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL:
				return kennzahl != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Bezeichnung_AttributeGroupImpl
