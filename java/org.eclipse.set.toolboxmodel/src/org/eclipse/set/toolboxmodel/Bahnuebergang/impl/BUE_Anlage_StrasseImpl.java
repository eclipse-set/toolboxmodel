/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage_Strasse;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage Strasse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Anlage_StrasseImpl#getBUEAnlageFussRad <em>BUE Anlage Fuss Rad</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Anlage_StrasseImpl#getBUEAnlageStrasseAllg <em>BUE Anlage Strasse Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Anlage_StrasseImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Anlage_StrasseImpl extends Basis_ObjektImpl implements BUE_Anlage_Strasse {
	/**
	 * The cached value of the '{@link #getBUEAnlageFussRad() <em>BUE Anlage Fuss Rad</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageFussRad()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Anlage_Fuss_Rad_AttributeGroup> bUEAnlageFussRad;

	/**
	 * The cached value of the '{@link #getBUEAnlageStrasseAllg() <em>BUE Anlage Strasse Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageStrasseAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage_Strasse_Allg_AttributeGroup bUEAnlageStrasseAllg;

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
	protected BUE_Anlage_StrasseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage_Strasse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Anlage_Fuss_Rad_AttributeGroup> getBUEAnlageFussRad() {
		if (bUEAnlageFussRad == null) {
			bUEAnlageFussRad = new EObjectContainmentEList<BUE_Anlage_Fuss_Rad_AttributeGroup>(BUE_Anlage_Fuss_Rad_AttributeGroup.class, this, BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD);
		}
		return bUEAnlageFussRad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Strasse_Allg_AttributeGroup getBUEAnlageStrasseAllg() {
		return bUEAnlageStrasseAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEAnlageStrasseAllg(BUE_Anlage_Strasse_Allg_AttributeGroup newBUEAnlageStrasseAllg, NotificationChain msgs) {
		BUE_Anlage_Strasse_Allg_AttributeGroup oldBUEAnlageStrasseAllg = bUEAnlageStrasseAllg;
		bUEAnlageStrasseAllg = newBUEAnlageStrasseAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG, oldBUEAnlageStrasseAllg, newBUEAnlageStrasseAllg);
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
	public void setBUEAnlageStrasseAllg(BUE_Anlage_Strasse_Allg_AttributeGroup newBUEAnlageStrasseAllg) {
		if (newBUEAnlageStrasseAllg != bUEAnlageStrasseAllg) {
			NotificationChain msgs = null;
			if (bUEAnlageStrasseAllg != null)
				msgs = ((InternalEObject)bUEAnlageStrasseAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG, null, msgs);
			if (newBUEAnlageStrasseAllg != null)
				msgs = ((InternalEObject)newBUEAnlageStrasseAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG, null, msgs);
			msgs = basicSetBUEAnlageStrasseAllg(newBUEAnlageStrasseAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG, newBUEAnlageStrasseAllg, newBUEAnlageStrasseAllg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage, !oldIDBUEAnlageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE, oldIDBUEAnlage, null, oldIDBUEAnlageESet));
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD:
				return ((InternalEList<?>)getBUEAnlageFussRad()).basicRemove(otherEnd, msgs);
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG:
				return basicSetBUEAnlageStrasseAllg(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD:
				return getBUEAnlageFussRad();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG:
				return getBUEAnlageStrasseAllg();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD:
				getBUEAnlageFussRad().clear();
				getBUEAnlageFussRad().addAll((Collection<? extends BUE_Anlage_Fuss_Rad_AttributeGroup>)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG:
				setBUEAnlageStrasseAllg((BUE_Anlage_Strasse_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD:
				getBUEAnlageFussRad().clear();
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG:
				setBUEAnlageStrasseAllg((BUE_Anlage_Strasse_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE:
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
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_FUSS_RAD:
				return bUEAnlageFussRad != null && !bUEAnlageFussRad.isEmpty();
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__BUE_ANLAGE_STRASSE_ALLG:
				return bUEAnlageStrasseAllg != null;
			case BahnuebergangPackage.BUE_ANLAGE_STRASSE__IDBUE_ANLAGE:
				return isSetIDBUEAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Anlage_StrasseImpl
