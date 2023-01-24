/**
 * /**
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

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Abstand_Einmesspunkt_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datenpunkt Einmesspunkt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Datenpunkt_Einmesspunkt_AttributeGroupImpl#getAbstandEinmesspunkt <em>Abstand Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Datenpunkt_Einmesspunkt_AttributeGroupImpl#getIDEinmesspunkt <em>ID Einmesspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Datenpunkt_Einmesspunkt_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Datenpunkt_Einmesspunkt_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandEinmesspunkt() <em>Abstand Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandEinmesspunkt()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Einmesspunkt_TypeClass abstandEinmesspunkt;

	/**
	 * The cached value of the '{@link #getIDEinmesspunkt() <em>ID Einmesspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEinmesspunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDEinmesspunkt;

	/**
	 * This is true if the ID Einmesspunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEinmesspunktESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Datenpunkt_Einmesspunkt_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_Einmesspunkt_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Einmesspunkt_TypeClass getAbstandEinmesspunkt() {
		return abstandEinmesspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass newAbstandEinmesspunkt, NotificationChain msgs) {
		Abstand_Einmesspunkt_TypeClass oldAbstandEinmesspunkt = abstandEinmesspunkt;
		abstandEinmesspunkt = newAbstandEinmesspunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, oldAbstandEinmesspunkt, newAbstandEinmesspunkt);
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
	public void setAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass newAbstandEinmesspunkt) {
		if (newAbstandEinmesspunkt != abstandEinmesspunkt) {
			NotificationChain msgs = null;
			if (abstandEinmesspunkt != null)
				msgs = ((InternalEObject)abstandEinmesspunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, null, msgs);
			if (newAbstandEinmesspunkt != null)
				msgs = ((InternalEObject)newAbstandEinmesspunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, null, msgs);
			msgs = basicSetAbstandEinmesspunkt(newAbstandEinmesspunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT, newAbstandEinmesspunkt, newAbstandEinmesspunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDEinmesspunkt() {
		if (iDEinmesspunkt != null && iDEinmesspunkt.eIsProxy()) {
			InternalEObject oldIDEinmesspunkt = (InternalEObject)iDEinmesspunkt;
			iDEinmesspunkt = (Markanter_Punkt)eResolveProxy(oldIDEinmesspunkt);
			if (iDEinmesspunkt != oldIDEinmesspunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, oldIDEinmesspunkt, iDEinmesspunkt));
			}
		}
		return iDEinmesspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDEinmesspunkt() {
		return iDEinmesspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEinmesspunkt(Markanter_Punkt newIDEinmesspunkt) {
		Markanter_Punkt oldIDEinmesspunkt = iDEinmesspunkt;
		iDEinmesspunkt = newIDEinmesspunkt;
		boolean oldIDEinmesspunktESet = iDEinmesspunktESet;
		iDEinmesspunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, oldIDEinmesspunkt, iDEinmesspunkt, !oldIDEinmesspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEinmesspunkt() {
		Markanter_Punkt oldIDEinmesspunkt = iDEinmesspunkt;
		boolean oldIDEinmesspunktESet = iDEinmesspunktESet;
		iDEinmesspunkt = null;
		iDEinmesspunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT, oldIDEinmesspunkt, null, oldIDEinmesspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEinmesspunkt() {
		return iDEinmesspunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				return basicSetAbstandEinmesspunkt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				return getAbstandEinmesspunkt();
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				if (resolve) return getIDEinmesspunkt();
				return basicGetIDEinmesspunkt();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				setAbstandEinmesspunkt((Abstand_Einmesspunkt_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				setIDEinmesspunkt((Markanter_Punkt)newValue);
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				setAbstandEinmesspunkt((Abstand_Einmesspunkt_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				unsetIDEinmesspunkt();
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
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ABSTAND_EINMESSPUNKT:
				return abstandEinmesspunkt != null;
			case Balisentechnik_ETCSPackage.DATENPUNKT_EINMESSPUNKT_ATTRIBUTE_GROUP__ID_EINMESSPUNKT:
				return isSetIDEinmesspunkt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Datenpunkt_Einmesspunkt_AttributeGroupImpl
