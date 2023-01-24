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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Steuernde Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Steuernde_AttributeGroupImpl#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Steuernde_AttributeGroupImpl#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Steuernde_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Steuernde_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDLEUAnlage() <em>IDLEU Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUAnlage()
	 * @generated
	 * @ordered
	 */
	protected LEU_Anlage iDLEUAnlage;

	/**
	 * This is true if the IDLEU Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDLEUAnlageESet;

	/**
	 * The cached value of the '{@link #getLEUAusgangNr() <em>LEU Ausgang Nr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAusgangNr()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Ausgang_Nr_TypeClass> lEUAusgangNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Steuernde_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Steuernde_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage getIDLEUAnlage() {
		if (iDLEUAnlage != null && iDLEUAnlage.eIsProxy()) {
			InternalEObject oldIDLEUAnlage = (InternalEObject)iDLEUAnlage;
			iDLEUAnlage = (LEU_Anlage)eResolveProxy(oldIDLEUAnlage);
			if (iDLEUAnlage != oldIDLEUAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, oldIDLEUAnlage, iDLEUAnlage));
			}
		}
		return iDLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEU_Anlage basicGetIDLEUAnlage() {
		return iDLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDLEUAnlage(LEU_Anlage newIDLEUAnlage) {
		LEU_Anlage oldIDLEUAnlage = iDLEUAnlage;
		iDLEUAnlage = newIDLEUAnlage;
		boolean oldIDLEUAnlageESet = iDLEUAnlageESet;
		iDLEUAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, oldIDLEUAnlage, iDLEUAnlage, !oldIDLEUAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDLEUAnlage() {
		LEU_Anlage oldIDLEUAnlage = iDLEUAnlage;
		boolean oldIDLEUAnlageESet = iDLEUAnlageESet;
		iDLEUAnlage = null;
		iDLEUAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE, oldIDLEUAnlage, null, oldIDLEUAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDLEUAnlage() {
		return iDLEUAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Ausgang_Nr_TypeClass> getLEUAusgangNr() {
		if (lEUAusgangNr == null) {
			lEUAusgangNr = new EObjectContainmentEList<LEU_Ausgang_Nr_TypeClass>(LEU_Ausgang_Nr_TypeClass.class, this, Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR);
		}
		return lEUAusgangNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return ((InternalEList<?>)getLEUAusgangNr()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				if (resolve) return getIDLEUAnlage();
				return basicGetIDLEUAnlage();
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return getLEUAusgangNr();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				setIDLEUAnlage((LEU_Anlage)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				getLEUAusgangNr().clear();
				getLEUAusgangNr().addAll((Collection<? extends LEU_Ausgang_Nr_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				unsetIDLEUAnlage();
				return;
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				getLEUAusgangNr().clear();
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
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__IDLEU_ANLAGE:
				return isSetIDLEUAnlage();
			case Balisentechnik_ETCSPackage.LEU_STEUERNDE_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return lEUAusgangNr != null && !lEUAusgangNr.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Steuernde_AttributeGroupImpl
