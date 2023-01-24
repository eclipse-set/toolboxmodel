/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl#getIDAnhangDWS <em>ID Anhang DWS</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_AnlageImpl#getWKrAnlageAllg <em>WKr Anlage Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_AnlageImpl extends Basis_ObjektImpl implements W_Kr_Anlage {
	/**
	 * The cached value of the '{@link #getIDAnhangDWS() <em>ID Anhang DWS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangDWS()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangDWS;

	/**
	 * This is true if the ID Anhang DWS reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangDWSESet;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignal;

	/**
	 * This is true if the ID Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalESet;

	/**
	 * The cached value of the '{@link #getWKrAnlageAllg() <em>WKr Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Anlage_Allg_AttributeGroup wKrAnlageAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangDWS() {
		if (iDAnhangDWS != null && iDAnhangDWS.eIsProxy()) {
			InternalEObject oldIDAnhangDWS = (InternalEObject)iDAnhangDWS;
			iDAnhangDWS = (Anhang)eResolveProxy(oldIDAnhangDWS);
			if (iDAnhangDWS != oldIDAnhangDWS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, oldIDAnhangDWS, iDAnhangDWS));
			}
		}
		return iDAnhangDWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangDWS() {
		return iDAnhangDWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangDWS(Anhang newIDAnhangDWS) {
		Anhang oldIDAnhangDWS = iDAnhangDWS;
		iDAnhangDWS = newIDAnhangDWS;
		boolean oldIDAnhangDWSESet = iDAnhangDWSESet;
		iDAnhangDWSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, oldIDAnhangDWS, iDAnhangDWS, !oldIDAnhangDWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangDWS() {
		Anhang oldIDAnhangDWS = iDAnhangDWS;
		boolean oldIDAnhangDWSESet = iDAnhangDWSESet;
		iDAnhangDWS = null;
		iDAnhangDWSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS, oldIDAnhangDWS, null, oldIDAnhangDWSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangDWS() {
		return iDAnhangDWSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignal() {
		if (iDSignal != null && iDSignal.eIsProxy()) {
			InternalEObject oldIDSignal = (InternalEObject)iDSignal;
			iDSignal = (Signal)eResolveProxy(oldIDSignal);
			if (iDSignal != oldIDSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, oldIDSignal, iDSignal));
			}
		}
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignal(Signal newIDSignal) {
		Signal oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignal() {
		Signal oldIDSignal = iDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignal = null;
		iDSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignal() {
		return iDSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Anlage_Allg_AttributeGroup getWKrAnlageAllg() {
		return wKrAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup newWKrAnlageAllg, NotificationChain msgs) {
		W_Kr_Anlage_Allg_AttributeGroup oldWKrAnlageAllg = wKrAnlageAllg;
		wKrAnlageAllg = newWKrAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, oldWKrAnlageAllg, newWKrAnlageAllg);
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
	public void setWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup newWKrAnlageAllg) {
		if (newWKrAnlageAllg != wKrAnlageAllg) {
			NotificationChain msgs = null;
			if (wKrAnlageAllg != null)
				msgs = ((InternalEObject)wKrAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, null, msgs);
			if (newWKrAnlageAllg != null)
				msgs = ((InternalEObject)newWKrAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, null, msgs);
			msgs = basicSetWKrAnlageAllg(newWKrAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG, newWKrAnlageAllg, newWKrAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				return basicSetWKrAnlageAllg(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				if (resolve) return getIDAnhangDWS();
				return basicGetIDAnhangDWS();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				return getWKrAnlageAllg();
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				setIDAnhangDWS((Anhang)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				setWKrAnlageAllg((W_Kr_Anlage_Allg_AttributeGroup)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				unsetIDAnhangDWS();
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				unsetIDSignal();
				return;
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				setWKrAnlageAllg((W_Kr_Anlage_Allg_AttributeGroup)null);
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
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_ANHANG_DWS:
				return isSetIDAnhangDWS();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__ID_SIGNAL:
				return isSetIDSignal();
			case Weichen_und_GleissperrenPackage.WKR_ANLAGE__WKR_ANLAGE_ALLG:
				return wKrAnlageAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //W_Kr_AnlageImpl
