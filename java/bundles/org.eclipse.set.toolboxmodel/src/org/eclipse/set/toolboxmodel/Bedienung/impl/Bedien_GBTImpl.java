/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien GBT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_GBTImpl#getBedienGBTAllg <em>Bedien GBT Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_GBTImpl#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_GBTImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_GBTImpl extends Basis_ObjektImpl implements Bedien_GBT {
	/**
	 * The cached value of the '{@link #getBedienGBTAllg() <em>Bedien GBT Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienGBTAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_GBT_Allg_AttributeGroup bedienGBTAllg;

	/**
	 * The cached value of the '{@link #getIDAnhangVorgabeGBT() <em>ID Anhang Vorgabe GBT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangVorgabeGBT()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangVorgabeGBT;

	/**
	 * This is true if the ID Anhang Vorgabe GBT reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangVorgabeGBTESet;

	/**
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk iDBedienBezirk;

	/**
	 * This is true if the ID Bedien Bezirk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienBezirkESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_GBTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_GBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_GBT_Allg_AttributeGroup getBedienGBTAllg() {
		return bedienGBTAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup newBedienGBTAllg, NotificationChain msgs) {
		Bedien_GBT_Allg_AttributeGroup oldBedienGBTAllg = bedienGBTAllg;
		bedienGBTAllg = newBedienGBTAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, oldBedienGBTAllg, newBedienGBTAllg);
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
	public void setBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup newBedienGBTAllg) {
		if (newBedienGBTAllg != bedienGBTAllg) {
			NotificationChain msgs = null;
			if (bedienGBTAllg != null)
				msgs = ((InternalEObject)bedienGBTAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, null, msgs);
			if (newBedienGBTAllg != null)
				msgs = ((InternalEObject)newBedienGBTAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, null, msgs);
			msgs = basicSetBedienGBTAllg(newBedienGBTAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG, newBedienGBTAllg, newBedienGBTAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangVorgabeGBT() {
		if (iDAnhangVorgabeGBT != null && iDAnhangVorgabeGBT.eIsProxy()) {
			InternalEObject oldIDAnhangVorgabeGBT = (InternalEObject)iDAnhangVorgabeGBT;
			iDAnhangVorgabeGBT = (Anhang)eResolveProxy(oldIDAnhangVorgabeGBT);
			if (iDAnhangVorgabeGBT != oldIDAnhangVorgabeGBT) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, oldIDAnhangVorgabeGBT, iDAnhangVorgabeGBT));
			}
		}
		return iDAnhangVorgabeGBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangVorgabeGBT() {
		return iDAnhangVorgabeGBT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangVorgabeGBT(Anhang newIDAnhangVorgabeGBT) {
		Anhang oldIDAnhangVorgabeGBT = iDAnhangVorgabeGBT;
		iDAnhangVorgabeGBT = newIDAnhangVorgabeGBT;
		boolean oldIDAnhangVorgabeGBTESet = iDAnhangVorgabeGBTESet;
		iDAnhangVorgabeGBTESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, oldIDAnhangVorgabeGBT, iDAnhangVorgabeGBT, !oldIDAnhangVorgabeGBTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangVorgabeGBT() {
		Anhang oldIDAnhangVorgabeGBT = iDAnhangVorgabeGBT;
		boolean oldIDAnhangVorgabeGBTESet = iDAnhangVorgabeGBTESet;
		iDAnhangVorgabeGBT = null;
		iDAnhangVorgabeGBTESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT, oldIDAnhangVorgabeGBT, null, oldIDAnhangVorgabeGBTESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangVorgabeGBT() {
		return iDAnhangVorgabeGBTESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk getIDBedienBezirk() {
		if (iDBedienBezirk != null && iDBedienBezirk.eIsProxy()) {
			InternalEObject oldIDBedienBezirk = (InternalEObject)iDBedienBezirk;
			iDBedienBezirk = (Bedien_Bezirk)eResolveProxy(oldIDBedienBezirk);
			if (iDBedienBezirk != oldIDBedienBezirk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk));
			}
		}
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Bezirk basicGetIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienBezirk(Bedien_Bezirk newIDBedienBezirk) {
		Bedien_Bezirk oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		boolean oldIDBedienBezirkESet = iDBedienBezirkESet;
		iDBedienBezirkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk, !oldIDBedienBezirkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienBezirk() {
		Bedien_Bezirk oldIDBedienBezirk = iDBedienBezirk;
		boolean oldIDBedienBezirkESet = iDBedienBezirkESet;
		iDBedienBezirk = null;
		iDBedienBezirkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, null, oldIDBedienBezirkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienBezirk() {
		return iDBedienBezirkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				return basicSetBedienGBTAllg(null, msgs);
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				return getBedienGBTAllg();
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				if (resolve) return getIDAnhangVorgabeGBT();
				return basicGetIDAnhangVorgabeGBT();
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				if (resolve) return getIDBedienBezirk();
				return basicGetIDBedienBezirk();
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				setBedienGBTAllg((Bedien_GBT_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				setIDAnhangVorgabeGBT((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((Bedien_Bezirk)newValue);
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				setBedienGBTAllg((Bedien_GBT_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				unsetIDAnhangVorgabeGBT();
				return;
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				unsetIDBedienBezirk();
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
			case BedienungPackage.BEDIEN_GBT__BEDIEN_GBT_ALLG:
				return bedienGBTAllg != null;
			case BedienungPackage.BEDIEN_GBT__ID_ANHANG_VORGABE_GBT:
				return isSetIDAnhangVorgabeGBT();
			case BedienungPackage.BEDIEN_GBT__ID_BEDIEN_BEZIRK:
				return isSetIDBedienBezirk();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_GBTImpl
