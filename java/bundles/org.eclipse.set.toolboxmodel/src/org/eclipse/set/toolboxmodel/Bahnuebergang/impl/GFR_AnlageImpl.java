/**
 * /**
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
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_AnlageImpl#getGFRAnlageAllg <em>GFR Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_AnlageImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_AnlageImpl extends Basis_ObjektImpl implements GFR_Anlage {
	/**
	 * The cached value of the '{@link #getGFRAnlageAllg() <em>GFR Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected GFR_Anlage_Allg_AttributeGroup gFRAnlageAllg;

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
	protected GFR_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Anlage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Anlage_Allg_AttributeGroup getGFRAnlageAllg() {
		return gFRAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRAnlageAllg(GFR_Anlage_Allg_AttributeGroup newGFRAnlageAllg, NotificationChain msgs) {
		GFR_Anlage_Allg_AttributeGroup oldGFRAnlageAllg = gFRAnlageAllg;
		gFRAnlageAllg = newGFRAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG, oldGFRAnlageAllg, newGFRAnlageAllg);
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
	public void setGFRAnlageAllg(GFR_Anlage_Allg_AttributeGroup newGFRAnlageAllg) {
		if (newGFRAnlageAllg != gFRAnlageAllg) {
			NotificationChain msgs = null;
			if (gFRAnlageAllg != null)
				msgs = ((InternalEObject)gFRAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG, null, msgs);
			if (newGFRAnlageAllg != null)
				msgs = ((InternalEObject)newGFRAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG, null, msgs);
			msgs = basicSetGFRAnlageAllg(newGFRAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG, newGFRAnlageAllg, newGFRAnlageAllg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage, !oldIDBUEAnlageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE, oldIDBUEAnlage, null, oldIDBUEAnlageESet));
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
			case BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG:
				return basicSetGFRAnlageAllg(null, msgs);
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
			case BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG:
				return getGFRAnlageAllg();
			case BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG:
				setGFRAnlageAllg((GFR_Anlage_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG:
				setGFRAnlageAllg((GFR_Anlage_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.GFR_ANLAGE__GFR_ANLAGE_ALLG:
				return gFRAnlageAllg != null;
			case BahnuebergangPackage.GFR_ANLAGE__IDBUE_ANLAGE:
				return isSetIDBUEAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //GFR_AnlageImpl
