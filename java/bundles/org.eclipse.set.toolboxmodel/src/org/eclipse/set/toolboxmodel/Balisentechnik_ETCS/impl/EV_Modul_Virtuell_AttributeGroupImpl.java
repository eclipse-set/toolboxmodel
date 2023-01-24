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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV Modul Virtuell Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.EV_Modul_Virtuell_AttributeGroupImpl#getIDQuellelement <em>ID Quellelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_Modul_Virtuell_AttributeGroupImpl extends MinimalEObjectImpl.Container implements EV_Modul_Virtuell_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDQuellelement() <em>ID Quellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDQuellelement()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDQuellelement;

	/**
	 * This is true if the ID Quellelement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDQuellelementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_Modul_Virtuell_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Virtuell_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDQuellelement() {
		if (iDQuellelement != null && iDQuellelement.eIsProxy()) {
			InternalEObject oldIDQuellelement = (InternalEObject)iDQuellelement;
			iDQuellelement = (Basis_Objekt)eResolveProxy(oldIDQuellelement);
			if (iDQuellelement != oldIDQuellelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, oldIDQuellelement, iDQuellelement));
			}
		}
		return iDQuellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDQuellelement() {
		return iDQuellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDQuellelement(Basis_Objekt newIDQuellelement) {
		Basis_Objekt oldIDQuellelement = iDQuellelement;
		iDQuellelement = newIDQuellelement;
		boolean oldIDQuellelementESet = iDQuellelementESet;
		iDQuellelementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, oldIDQuellelement, iDQuellelement, !oldIDQuellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDQuellelement() {
		Basis_Objekt oldIDQuellelement = iDQuellelement;
		boolean oldIDQuellelementESet = iDQuellelementESet;
		iDQuellelement = null;
		iDQuellelementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT, oldIDQuellelement, null, oldIDQuellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDQuellelement() {
		return iDQuellelementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				if (resolve) return getIDQuellelement();
				return basicGetIDQuellelement();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				setIDQuellelement((Basis_Objekt)newValue);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				unsetIDQuellelement();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_VIRTUELL_ATTRIBUTE_GROUP__ID_QUELLELEMENT:
				return isSetIDQuellelement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //EV_Modul_Virtuell_AttributeGroupImpl
