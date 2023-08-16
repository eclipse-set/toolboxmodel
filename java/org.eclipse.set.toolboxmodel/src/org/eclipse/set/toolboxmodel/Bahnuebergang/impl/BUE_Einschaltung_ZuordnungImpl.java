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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Einschaltung Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Einschaltung_ZuordnungImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Einschaltung_ZuordnungImpl#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Einschaltung_ZuordnungImpl extends Basis_ObjektImpl implements BUE_Einschaltung_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDBUEEinschaltung() <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Einschaltung iDBUEEinschaltung;

	/**
	 * This is true if the IDBUE Einschaltung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEEinschaltungESet;

	/**
	 * The cached value of the '{@link #getIDBUEGleisbezGefahrraum() <em>IDBUE Gleisbez Gefahrraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 * @ordered
	 */
	protected BUE_Gleisbezogener_Gefahrraum iDBUEGleisbezGefahrraum;

	/**
	 * This is true if the IDBUE Gleisbez Gefahrraum reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEGleisbezGefahrraumESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Einschaltung_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Einschaltung_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Einschaltung getIDBUEEinschaltung() {
		if (iDBUEEinschaltung != null && iDBUEEinschaltung.eIsProxy()) {
			InternalEObject oldIDBUEEinschaltung = (InternalEObject)iDBUEEinschaltung;
			iDBUEEinschaltung = (BUE_Einschaltung)eResolveProxy(oldIDBUEEinschaltung);
			if (iDBUEEinschaltung != oldIDBUEEinschaltung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, iDBUEEinschaltung));
			}
		}
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Einschaltung basicGetIDBUEEinschaltung() {
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEEinschaltung(BUE_Einschaltung newIDBUEEinschaltung) {
		BUE_Einschaltung oldIDBUEEinschaltung = iDBUEEinschaltung;
		iDBUEEinschaltung = newIDBUEEinschaltung;
		boolean oldIDBUEEinschaltungESet = iDBUEEinschaltungESet;
		iDBUEEinschaltungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, iDBUEEinschaltung, !oldIDBUEEinschaltungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEEinschaltung() {
		BUE_Einschaltung oldIDBUEEinschaltung = iDBUEEinschaltung;
		boolean oldIDBUEEinschaltungESet = iDBUEEinschaltungESet;
		iDBUEEinschaltung = null;
		iDBUEEinschaltungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, null, oldIDBUEEinschaltungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEEinschaltung() {
		return iDBUEEinschaltungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Gleisbezogener_Gefahrraum getIDBUEGleisbezGefahrraum() {
		if (iDBUEGleisbezGefahrraum != null && iDBUEGleisbezGefahrraum.eIsProxy()) {
			InternalEObject oldIDBUEGleisbezGefahrraum = (InternalEObject)iDBUEGleisbezGefahrraum;
			iDBUEGleisbezGefahrraum = (BUE_Gleisbezogener_Gefahrraum)eResolveProxy(oldIDBUEGleisbezGefahrraum);
			if (iDBUEGleisbezGefahrraum != oldIDBUEGleisbezGefahrraum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, iDBUEGleisbezGefahrraum));
			}
		}
		return iDBUEGleisbezGefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Gleisbezogener_Gefahrraum basicGetIDBUEGleisbezGefahrraum() {
		return iDBUEGleisbezGefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum newIDBUEGleisbezGefahrraum) {
		BUE_Gleisbezogener_Gefahrraum oldIDBUEGleisbezGefahrraum = iDBUEGleisbezGefahrraum;
		iDBUEGleisbezGefahrraum = newIDBUEGleisbezGefahrraum;
		boolean oldIDBUEGleisbezGefahrraumESet = iDBUEGleisbezGefahrraumESet;
		iDBUEGleisbezGefahrraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, iDBUEGleisbezGefahrraum, !oldIDBUEGleisbezGefahrraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEGleisbezGefahrraum() {
		BUE_Gleisbezogener_Gefahrraum oldIDBUEGleisbezGefahrraum = iDBUEGleisbezGefahrraum;
		boolean oldIDBUEGleisbezGefahrraumESet = iDBUEGleisbezGefahrraumESet;
		iDBUEGleisbezGefahrraum = null;
		iDBUEGleisbezGefahrraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, null, oldIDBUEGleisbezGefahrraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEGleisbezGefahrraum() {
		return iDBUEGleisbezGefahrraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				if (resolve) return getIDBUEEinschaltung();
				return basicGetIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				if (resolve) return getIDBUEGleisbezGefahrraum();
				return basicGetIDBUEGleisbezGefahrraum();
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((BUE_Einschaltung)newValue);
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				setIDBUEGleisbezGefahrraum((BUE_Gleisbezogener_Gefahrraum)newValue);
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				unsetIDBUEEinschaltung();
				return;
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				unsetIDBUEGleisbezGefahrraum();
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
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return isSetIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_EINSCHALTUNG_ZUORDNUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return isSetIDBUEGleisbezGefahrraum();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Einschaltung_ZuordnungImpl
