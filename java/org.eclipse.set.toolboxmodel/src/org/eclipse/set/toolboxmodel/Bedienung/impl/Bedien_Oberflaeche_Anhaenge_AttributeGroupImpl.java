/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl#getIDAnhangMonitoraufteilung <em>ID Anhang Monitoraufteilung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl#getIDAnhangRichtungssinn <em>ID Anhang Richtungssinn</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl#getIDAnhangVorgabeBELU <em>ID Anhang Vorgabe BELU</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedien_Oberflaeche_Anhaenge_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangMonitoraufteilung() <em>ID Anhang Monitoraufteilung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangMonitoraufteilung()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangMonitoraufteilung;

	/**
	 * This is true if the ID Anhang Monitoraufteilung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangMonitoraufteilungESet;

	/**
	 * The cached value of the '{@link #getIDAnhangRichtungssinn() <em>ID Anhang Richtungssinn</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangRichtungssinn()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangRichtungssinn;

	/**
	 * This is true if the ID Anhang Richtungssinn reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangRichtungssinnESet;

	/**
	 * The cached value of the '{@link #getIDAnhangVorgabeBELU() <em>ID Anhang Vorgabe BELU</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangVorgabeBELU()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangVorgabeBELU;

	/**
	 * This is true if the ID Anhang Vorgabe BELU reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangVorgabeBELUESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangMonitoraufteilung() {
		if (iDAnhangMonitoraufteilung != null && iDAnhangMonitoraufteilung.eIsProxy()) {
			InternalEObject oldIDAnhangMonitoraufteilung = (InternalEObject)iDAnhangMonitoraufteilung;
			iDAnhangMonitoraufteilung = (Anhang)eResolveProxy(oldIDAnhangMonitoraufteilung);
			if (iDAnhangMonitoraufteilung != oldIDAnhangMonitoraufteilung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, oldIDAnhangMonitoraufteilung, iDAnhangMonitoraufteilung));
			}
		}
		return iDAnhangMonitoraufteilung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangMonitoraufteilung() {
		return iDAnhangMonitoraufteilung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangMonitoraufteilung(Anhang newIDAnhangMonitoraufteilung) {
		Anhang oldIDAnhangMonitoraufteilung = iDAnhangMonitoraufteilung;
		iDAnhangMonitoraufteilung = newIDAnhangMonitoraufteilung;
		boolean oldIDAnhangMonitoraufteilungESet = iDAnhangMonitoraufteilungESet;
		iDAnhangMonitoraufteilungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, oldIDAnhangMonitoraufteilung, iDAnhangMonitoraufteilung, !oldIDAnhangMonitoraufteilungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangMonitoraufteilung() {
		Anhang oldIDAnhangMonitoraufteilung = iDAnhangMonitoraufteilung;
		boolean oldIDAnhangMonitoraufteilungESet = iDAnhangMonitoraufteilungESet;
		iDAnhangMonitoraufteilung = null;
		iDAnhangMonitoraufteilungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG, oldIDAnhangMonitoraufteilung, null, oldIDAnhangMonitoraufteilungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangMonitoraufteilung() {
		return iDAnhangMonitoraufteilungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangRichtungssinn() {
		if (iDAnhangRichtungssinn != null && iDAnhangRichtungssinn.eIsProxy()) {
			InternalEObject oldIDAnhangRichtungssinn = (InternalEObject)iDAnhangRichtungssinn;
			iDAnhangRichtungssinn = (Anhang)eResolveProxy(oldIDAnhangRichtungssinn);
			if (iDAnhangRichtungssinn != oldIDAnhangRichtungssinn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, oldIDAnhangRichtungssinn, iDAnhangRichtungssinn));
			}
		}
		return iDAnhangRichtungssinn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangRichtungssinn() {
		return iDAnhangRichtungssinn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangRichtungssinn(Anhang newIDAnhangRichtungssinn) {
		Anhang oldIDAnhangRichtungssinn = iDAnhangRichtungssinn;
		iDAnhangRichtungssinn = newIDAnhangRichtungssinn;
		boolean oldIDAnhangRichtungssinnESet = iDAnhangRichtungssinnESet;
		iDAnhangRichtungssinnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, oldIDAnhangRichtungssinn, iDAnhangRichtungssinn, !oldIDAnhangRichtungssinnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangRichtungssinn() {
		Anhang oldIDAnhangRichtungssinn = iDAnhangRichtungssinn;
		boolean oldIDAnhangRichtungssinnESet = iDAnhangRichtungssinnESet;
		iDAnhangRichtungssinn = null;
		iDAnhangRichtungssinnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN, oldIDAnhangRichtungssinn, null, oldIDAnhangRichtungssinnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangRichtungssinn() {
		return iDAnhangRichtungssinnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangVorgabeBELU() {
		if (iDAnhangVorgabeBELU != null && iDAnhangVorgabeBELU.eIsProxy()) {
			InternalEObject oldIDAnhangVorgabeBELU = (InternalEObject)iDAnhangVorgabeBELU;
			iDAnhangVorgabeBELU = (Anhang)eResolveProxy(oldIDAnhangVorgabeBELU);
			if (iDAnhangVorgabeBELU != oldIDAnhangVorgabeBELU) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, oldIDAnhangVorgabeBELU, iDAnhangVorgabeBELU));
			}
		}
		return iDAnhangVorgabeBELU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangVorgabeBELU() {
		return iDAnhangVorgabeBELU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangVorgabeBELU(Anhang newIDAnhangVorgabeBELU) {
		Anhang oldIDAnhangVorgabeBELU = iDAnhangVorgabeBELU;
		iDAnhangVorgabeBELU = newIDAnhangVorgabeBELU;
		boolean oldIDAnhangVorgabeBELUESet = iDAnhangVorgabeBELUESet;
		iDAnhangVorgabeBELUESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, oldIDAnhangVorgabeBELU, iDAnhangVorgabeBELU, !oldIDAnhangVorgabeBELUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangVorgabeBELU() {
		Anhang oldIDAnhangVorgabeBELU = iDAnhangVorgabeBELU;
		boolean oldIDAnhangVorgabeBELUESet = iDAnhangVorgabeBELUESet;
		iDAnhangVorgabeBELU = null;
		iDAnhangVorgabeBELUESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU, oldIDAnhangVorgabeBELU, null, oldIDAnhangVorgabeBELUESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangVorgabeBELU() {
		return iDAnhangVorgabeBELUESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				if (resolve) return getIDAnhangMonitoraufteilung();
				return basicGetIDAnhangMonitoraufteilung();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				if (resolve) return getIDAnhangRichtungssinn();
				return basicGetIDAnhangRichtungssinn();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				if (resolve) return getIDAnhangVorgabeBELU();
				return basicGetIDAnhangVorgabeBELU();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				setIDAnhangMonitoraufteilung((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				setIDAnhangRichtungssinn((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				setIDAnhangVorgabeBELU((Anhang)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				unsetIDAnhangMonitoraufteilung();
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				unsetIDAnhangRichtungssinn();
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				unsetIDAnhangVorgabeBELU();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_MONITORAUFTEILUNG:
				return isSetIDAnhangMonitoraufteilung();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_RICHTUNGSSINN:
				return isSetIDAnhangRichtungssinn();
			case BedienungPackage.BEDIEN_OBERFLAECHE_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_VORGABE_BELU:
				return isSetIDAnhangVorgabeBELU();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Oberflaeche_Anhaenge_AttributeGroupImpl
