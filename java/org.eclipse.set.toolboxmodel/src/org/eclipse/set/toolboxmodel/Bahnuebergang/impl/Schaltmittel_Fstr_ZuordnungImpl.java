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

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schaltmittel Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.Schaltmittel_Fstr_ZuordnungImpl#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.Schaltmittel_Fstr_ZuordnungImpl#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schaltmittel_Fstr_ZuordnungImpl extends Basis_ObjektImpl implements Schaltmittel_Fstr_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDBUEWSFstrZuordnung() <em>IDBUEWS Fstr Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEWSFstrZuordnung()
	 * @generated
	 * @ordered
	 */
	protected BUE_WS_Fstr_Zuordnung iDBUEWSFstrZuordnung;

	/**
	 * This is true if the IDBUEWS Fstr Zuordnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEWSFstrZuordnungESet;

	/**
	 * The cached value of the '{@link #getIDSchaltmittelZuordnung() <em>ID Schaltmittel Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchaltmittelZuordnung()
	 * @generated
	 * @ordered
	 */
	protected Schaltmittel_Zuordnung iDSchaltmittelZuordnung;

	/**
	 * This is true if the ID Schaltmittel Zuordnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSchaltmittelZuordnungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schaltmittel_Fstr_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getSchaltmittel_Fstr_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_WS_Fstr_Zuordnung getIDBUEWSFstrZuordnung() {
		if (iDBUEWSFstrZuordnung != null && iDBUEWSFstrZuordnung.eIsProxy()) {
			InternalEObject oldIDBUEWSFstrZuordnung = (InternalEObject)iDBUEWSFstrZuordnung;
			iDBUEWSFstrZuordnung = (BUE_WS_Fstr_Zuordnung)eResolveProxy(oldIDBUEWSFstrZuordnung);
			if (iDBUEWSFstrZuordnung != oldIDBUEWSFstrZuordnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, oldIDBUEWSFstrZuordnung, iDBUEWSFstrZuordnung));
			}
		}
		return iDBUEWSFstrZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_WS_Fstr_Zuordnung basicGetIDBUEWSFstrZuordnung() {
		return iDBUEWSFstrZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEWSFstrZuordnung(BUE_WS_Fstr_Zuordnung newIDBUEWSFstrZuordnung) {
		BUE_WS_Fstr_Zuordnung oldIDBUEWSFstrZuordnung = iDBUEWSFstrZuordnung;
		iDBUEWSFstrZuordnung = newIDBUEWSFstrZuordnung;
		boolean oldIDBUEWSFstrZuordnungESet = iDBUEWSFstrZuordnungESet;
		iDBUEWSFstrZuordnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, oldIDBUEWSFstrZuordnung, iDBUEWSFstrZuordnung, !oldIDBUEWSFstrZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEWSFstrZuordnung() {
		BUE_WS_Fstr_Zuordnung oldIDBUEWSFstrZuordnung = iDBUEWSFstrZuordnung;
		boolean oldIDBUEWSFstrZuordnungESet = iDBUEWSFstrZuordnungESet;
		iDBUEWSFstrZuordnung = null;
		iDBUEWSFstrZuordnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG, oldIDBUEWSFstrZuordnung, null, oldIDBUEWSFstrZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEWSFstrZuordnung() {
		return iDBUEWSFstrZuordnungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Zuordnung getIDSchaltmittelZuordnung() {
		if (iDSchaltmittelZuordnung != null && iDSchaltmittelZuordnung.eIsProxy()) {
			InternalEObject oldIDSchaltmittelZuordnung = (InternalEObject)iDSchaltmittelZuordnung;
			iDSchaltmittelZuordnung = (Schaltmittel_Zuordnung)eResolveProxy(oldIDSchaltmittelZuordnung);
			if (iDSchaltmittelZuordnung != oldIDSchaltmittelZuordnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, oldIDSchaltmittelZuordnung, iDSchaltmittelZuordnung));
			}
		}
		return iDSchaltmittelZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schaltmittel_Zuordnung basicGetIDSchaltmittelZuordnung() {
		return iDSchaltmittelZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSchaltmittelZuordnung(Schaltmittel_Zuordnung newIDSchaltmittelZuordnung) {
		Schaltmittel_Zuordnung oldIDSchaltmittelZuordnung = iDSchaltmittelZuordnung;
		iDSchaltmittelZuordnung = newIDSchaltmittelZuordnung;
		boolean oldIDSchaltmittelZuordnungESet = iDSchaltmittelZuordnungESet;
		iDSchaltmittelZuordnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, oldIDSchaltmittelZuordnung, iDSchaltmittelZuordnung, !oldIDSchaltmittelZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSchaltmittelZuordnung() {
		Schaltmittel_Zuordnung oldIDSchaltmittelZuordnung = iDSchaltmittelZuordnung;
		boolean oldIDSchaltmittelZuordnungESet = iDSchaltmittelZuordnungESet;
		iDSchaltmittelZuordnung = null;
		iDSchaltmittelZuordnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG, oldIDSchaltmittelZuordnung, null, oldIDSchaltmittelZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSchaltmittelZuordnung() {
		return iDSchaltmittelZuordnungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				if (resolve) return getIDBUEWSFstrZuordnung();
				return basicGetIDBUEWSFstrZuordnung();
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				if (resolve) return getIDSchaltmittelZuordnung();
				return basicGetIDSchaltmittelZuordnung();
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				setIDBUEWSFstrZuordnung((BUE_WS_Fstr_Zuordnung)newValue);
				return;
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				setIDSchaltmittelZuordnung((Schaltmittel_Zuordnung)newValue);
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				unsetIDBUEWSFstrZuordnung();
				return;
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				unsetIDSchaltmittelZuordnung();
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
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__IDBUEWS_FSTR_ZUORDNUNG:
				return isSetIDBUEWSFstrZuordnung();
			case BahnuebergangPackage.SCHALTMITTEL_FSTR_ZUORDNUNG__ID_SCHALTMITTEL_ZUORDNUNG:
				return isSetIDSchaltmittelZuordnung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schaltmittel_Fstr_ZuordnungImpl
