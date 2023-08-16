/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage_V;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage_V_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage V</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Anlage_VImpl#getBUEAnlageVAllg <em>BUE Anlage VAllg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Anlage_VImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_VImpl extends Basis_ObjektImpl implements BUE_Anlage_V {
	/**
	 * The cached value of the '{@link #getBUEAnlageVAllg() <em>BUE Anlage VAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageVAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage_V_Allg_AttributeGroup bUEAnlageVAllg;

	/**
	 * The cached value of the '{@link #getIDBUEAnlage() <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage iDBUEAnlage;

	/**
	 * This is true if the IDBUE Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Anlage_VImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_V();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_V_Allg_AttributeGroup getBUEAnlageVAllg() {
		return bUEAnlageVAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEAnlageVAllg(BUE_Anlage_V_Allg_AttributeGroup newBUEAnlageVAllg, NotificationChain msgs) {
		BUE_Anlage_V_Allg_AttributeGroup oldBUEAnlageVAllg = bUEAnlageVAllg;
		bUEAnlageVAllg = newBUEAnlageVAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, oldBUEAnlageVAllg, newBUEAnlageVAllg);
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
	public void setBUEAnlageVAllg(BUE_Anlage_V_Allg_AttributeGroup newBUEAnlageVAllg) {
		if (newBUEAnlageVAllg != bUEAnlageVAllg) {
			NotificationChain msgs = null;
			if (bUEAnlageVAllg != null)
				msgs = ((InternalEObject)bUEAnlageVAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, null, msgs);
			if (newBUEAnlageVAllg != null)
				msgs = ((InternalEObject)newBUEAnlageVAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, null, msgs);
			msgs = basicSetBUEAnlageVAllg(newBUEAnlageVAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG, newBUEAnlageVAllg, newBUEAnlageVAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage getIDBUEAnlage() {
		if (iDBUEAnlage != null && iDBUEAnlage.eIsProxy()) {
			InternalEObject oldIDBUEAnlage = (InternalEObject)iDBUEAnlage;
			iDBUEAnlage = (BUE_Anlage)eResolveProxy(oldIDBUEAnlage);
			if (iDBUEAnlage != oldIDBUEAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage));
			}
		}
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Anlage basicGetIDBUEAnlage() {
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEAnlage(BUE_Anlage newIDBUEAnlage) {
		BUE_Anlage oldIDBUEAnlage = iDBUEAnlage;
		iDBUEAnlage = newIDBUEAnlage;
		boolean oldIDBUEAnlageESet = iDBUEAnlageESet;
		iDBUEAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage, !oldIDBUEAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEAnlage() {
		BUE_Anlage oldIDBUEAnlage = iDBUEAnlage;
		boolean oldIDBUEAnlageESet = iDBUEAnlageESet;
		iDBUEAnlage = null;
		iDBUEAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE, oldIDBUEAnlage, null, oldIDBUEAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEAnlage() {
		return iDBUEAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				return basicSetBUEAnlageVAllg(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				return getBUEAnlageVAllg();
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
				if (resolve) return getIDBUEAnlage();
				return basicGetIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				setBUEAnlageVAllg((BUE_Anlage_V_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
				setIDBUEAnlage((BUE_Anlage)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				setBUEAnlageVAllg((BUE_Anlage_V_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
				unsetIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_ANLAGE_V__BUE_ANLAGE_VALLG:
				return bUEAnlageVAllg != null;
			case BahnuebergangPackage.BUE_ANLAGE_V__IDBUE_ANLAGE:
				return isSetIDBUEAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Anlage_VImpl
