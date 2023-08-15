/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bezeichnung_LEU_Anlage_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Anlage_Bezeichnung_AttributeGroupImpl#getBezeichnungLEUAnlage <em>Bezeichnung LEU Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Anlage_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Anlage_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezeichnungLEUAnlage() <em>Bezeichnung LEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungLEUAnlage()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_LEU_Anlage_TypeClass bezeichnungLEUAnlage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Anlage_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Anlage_Bezeichnung_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_LEU_Anlage_TypeClass getBezeichnungLEUAnlage() {
		return bezeichnungLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungLEUAnlage(Bezeichnung_LEU_Anlage_TypeClass newBezeichnungLEUAnlage, NotificationChain msgs) {
		Bezeichnung_LEU_Anlage_TypeClass oldBezeichnungLEUAnlage = bezeichnungLEUAnlage;
		bezeichnungLEUAnlage = newBezeichnungLEUAnlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE, oldBezeichnungLEUAnlage, newBezeichnungLEUAnlage);
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
	public void setBezeichnungLEUAnlage(Bezeichnung_LEU_Anlage_TypeClass newBezeichnungLEUAnlage) {
		if (newBezeichnungLEUAnlage != bezeichnungLEUAnlage) {
			NotificationChain msgs = null;
			if (bezeichnungLEUAnlage != null)
				msgs = ((InternalEObject)bezeichnungLEUAnlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE, null, msgs);
			if (newBezeichnungLEUAnlage != null)
				msgs = ((InternalEObject)newBezeichnungLEUAnlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE, null, msgs);
			msgs = basicSetBezeichnungLEUAnlage(newBezeichnungLEUAnlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE, newBezeichnungLEUAnlage, newBezeichnungLEUAnlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE:
				return basicSetBezeichnungLEUAnlage(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE:
				return getBezeichnungLEUAnlage();
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE:
				setBezeichnungLEUAnlage((Bezeichnung_LEU_Anlage_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE:
				setBezeichnungLEUAnlage((Bezeichnung_LEU_Anlage_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LEU_ANLAGE:
				return bezeichnungLEUAnlage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Anlage_Bezeichnung_AttributeGroupImpl
