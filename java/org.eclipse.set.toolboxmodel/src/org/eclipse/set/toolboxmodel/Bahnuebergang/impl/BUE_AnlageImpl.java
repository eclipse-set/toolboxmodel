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

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_AnlageImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_AnlageImpl#getBUEAnlageAllg <em>BUE Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_AnlageImpl#getIDAEABUEAnschaltung <em>IDAEABUE Anschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_AnlageImpl#getIDBUESchnittstelle <em>IDBUE Schnittstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_AnlageImpl extends Punkt_ObjektImpl implements BUE_Anlage {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getBUEAnlageAllg() <em>BUE Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage_Allg_AttributeGroup bUEAnlageAllg;

	/**
	 * The cached value of the '{@link #getIDAEABUEAnschaltung() <em>IDAEABUE Anschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAEABUEAnschaltung()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDAEABUEAnschaltung;

	/**
	 * This is true if the IDAEABUE Anschaltung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAEABUEAnschaltungESet;

	/**
	 * The cached value of the '{@link #getIDBUESchnittstelle() <em>IDBUE Schnittstelle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUESchnittstelle()
	 * @generated
	 * @ordered
	 */
	protected BUE_Schnittstelle iDBUESchnittstelle;

	/**
	 * This is true if the IDBUE Schnittstelle reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUESchnittstelleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Anlage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage_Allg_AttributeGroup getBUEAnlageAllg() {
		return bUEAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup newBUEAnlageAllg, NotificationChain msgs) {
		BUE_Anlage_Allg_AttributeGroup oldBUEAnlageAllg = bUEAnlageAllg;
		bUEAnlageAllg = newBUEAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, oldBUEAnlageAllg, newBUEAnlageAllg);
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
	public void setBUEAnlageAllg(BUE_Anlage_Allg_AttributeGroup newBUEAnlageAllg) {
		if (newBUEAnlageAllg != bUEAnlageAllg) {
			NotificationChain msgs = null;
			if (bUEAnlageAllg != null)
				msgs = ((InternalEObject)bUEAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, null, msgs);
			if (newBUEAnlageAllg != null)
				msgs = ((InternalEObject)newBUEAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, null, msgs);
			msgs = basicSetBUEAnlageAllg(newBUEAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG, newBUEAnlageAllg, newBUEAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDAEABUEAnschaltung() {
		if (iDAEABUEAnschaltung != null && iDAEABUEAnschaltung.eIsProxy()) {
			InternalEObject oldIDAEABUEAnschaltung = (InternalEObject)iDAEABUEAnschaltung;
			iDAEABUEAnschaltung = (Aussenelementansteuerung)eResolveProxy(oldIDAEABUEAnschaltung);
			if (iDAEABUEAnschaltung != oldIDAEABUEAnschaltung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, oldIDAEABUEAnschaltung, iDAEABUEAnschaltung));
			}
		}
		return iDAEABUEAnschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDAEABUEAnschaltung() {
		return iDAEABUEAnschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAEABUEAnschaltung(Aussenelementansteuerung newIDAEABUEAnschaltung) {
		Aussenelementansteuerung oldIDAEABUEAnschaltung = iDAEABUEAnschaltung;
		iDAEABUEAnschaltung = newIDAEABUEAnschaltung;
		boolean oldIDAEABUEAnschaltungESet = iDAEABUEAnschaltungESet;
		iDAEABUEAnschaltungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, oldIDAEABUEAnschaltung, iDAEABUEAnschaltung, !oldIDAEABUEAnschaltungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAEABUEAnschaltung() {
		Aussenelementansteuerung oldIDAEABUEAnschaltung = iDAEABUEAnschaltung;
		boolean oldIDAEABUEAnschaltungESet = iDAEABUEAnschaltungESet;
		iDAEABUEAnschaltung = null;
		iDAEABUEAnschaltungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG, oldIDAEABUEAnschaltung, null, oldIDAEABUEAnschaltungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAEABUEAnschaltung() {
		return iDAEABUEAnschaltungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Schnittstelle getIDBUESchnittstelle() {
		if (iDBUESchnittstelle != null && iDBUESchnittstelle.eIsProxy()) {
			InternalEObject oldIDBUESchnittstelle = (InternalEObject)iDBUESchnittstelle;
			iDBUESchnittstelle = (BUE_Schnittstelle)eResolveProxy(oldIDBUESchnittstelle);
			if (iDBUESchnittstelle != oldIDBUESchnittstelle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, oldIDBUESchnittstelle, iDBUESchnittstelle));
			}
		}
		return iDBUESchnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Schnittstelle basicGetIDBUESchnittstelle() {
		return iDBUESchnittstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUESchnittstelle(BUE_Schnittstelle newIDBUESchnittstelle) {
		BUE_Schnittstelle oldIDBUESchnittstelle = iDBUESchnittstelle;
		iDBUESchnittstelle = newIDBUESchnittstelle;
		boolean oldIDBUESchnittstelleESet = iDBUESchnittstelleESet;
		iDBUESchnittstelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, oldIDBUESchnittstelle, iDBUESchnittstelle, !oldIDBUESchnittstelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUESchnittstelle() {
		BUE_Schnittstelle oldIDBUESchnittstelle = iDBUESchnittstelle;
		boolean oldIDBUESchnittstelleESet = iDBUESchnittstelleESet;
		iDBUESchnittstelle = null;
		iDBUESchnittstelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE, oldIDBUESchnittstelle, null, oldIDBUESchnittstelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUESchnittstelle() {
		return iDBUESchnittstelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				return basicSetBUEAnlageAllg(null, msgs);
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				return getBUEAnlageAllg();
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				if (resolve) return getIDAEABUEAnschaltung();
				return basicGetIDAEABUEAnschaltung();
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				if (resolve) return getIDBUESchnittstelle();
				return basicGetIDBUESchnittstelle();
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				setBUEAnlageAllg((BUE_Anlage_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				setIDAEABUEAnschaltung((Aussenelementansteuerung)newValue);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				setIDBUESchnittstelle((BUE_Schnittstelle)newValue);
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				setBUEAnlageAllg((BUE_Anlage_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				unsetIDAEABUEAnschaltung();
				return;
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				unsetIDBUESchnittstelle();
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
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
				return bUEAnlageAllg != null;
			case BahnuebergangPackage.BUE_ANLAGE__IDAEABUE_ANSCHALTUNG:
				return isSetIDAEABUEAnschaltung();
			case BahnuebergangPackage.BUE_ANLAGE__IDBUE_SCHNITTSTELLE:
				return isSetIDBUESchnittstelle();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_AnlageImpl
