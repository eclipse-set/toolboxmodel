/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Anzahl_Voll_LEU_Kalkuliert_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Max_Leistung_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Spannung_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ueberbrueckung_EV_Unterbrechung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Schaltkasten Energie Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Energie_AttributeGroupImpl#getAnzahlVollLEUKalkuliert <em>Anzahl Voll LEU Kalkuliert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Energie_AttributeGroupImpl#getIDEnergieLEUSchaltkasten <em>ID Energie LEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Energie_AttributeGroupImpl#getMaxLeistung <em>Max Leistung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Energie_AttributeGroupImpl#getSpannungArt <em>Spannung Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Energie_AttributeGroupImpl#getUeberbrueckungEVUnterbrechung <em>Ueberbrueckung EV Unterbrechung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Schaltkasten_Energie_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Schaltkasten_Energie_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnzahlVollLEUKalkuliert() <em>Anzahl Voll LEU Kalkuliert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlVollLEUKalkuliert()
	 * @generated
	 * @ordered
	 */
	protected Anzahl_Voll_LEU_Kalkuliert_TypeClass anzahlVollLEUKalkuliert;

	/**
	 * The cached value of the '{@link #getIDEnergieLEUSchaltkasten() <em>ID Energie LEU Schaltkasten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergieLEUSchaltkasten()
	 * @generated
	 * @ordered
	 */
	protected EV_Modul iDEnergieLEUSchaltkasten;

	/**
	 * This is true if the ID Energie LEU Schaltkasten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEnergieLEUSchaltkastenESet;

	/**
	 * The cached value of the '{@link #getMaxLeistung() <em>Max Leistung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLeistung()
	 * @generated
	 * @ordered
	 */
	protected Max_Leistung_TypeClass maxLeistung;

	/**
	 * The cached value of the '{@link #getSpannungArt() <em>Spannung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpannungArt()
	 * @generated
	 * @ordered
	 */
	protected Spannung_Art_TypeClass spannungArt;

	/**
	 * The cached value of the '{@link #getUeberbrueckungEVUnterbrechung() <em>Ueberbrueckung EV Unterbrechung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberbrueckungEVUnterbrechung()
	 * @generated
	 * @ordered
	 */
	protected Ueberbrueckung_EV_Unterbrechung_TypeClass ueberbrueckungEVUnterbrechung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Schaltkasten_Energie_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Schaltkasten_Energie_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzahl_Voll_LEU_Kalkuliert_TypeClass getAnzahlVollLEUKalkuliert() {
		return anzahlVollLEUKalkuliert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnzahlVollLEUKalkuliert(Anzahl_Voll_LEU_Kalkuliert_TypeClass newAnzahlVollLEUKalkuliert, NotificationChain msgs) {
		Anzahl_Voll_LEU_Kalkuliert_TypeClass oldAnzahlVollLEUKalkuliert = anzahlVollLEUKalkuliert;
		anzahlVollLEUKalkuliert = newAnzahlVollLEUKalkuliert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT, oldAnzahlVollLEUKalkuliert, newAnzahlVollLEUKalkuliert);
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
	public void setAnzahlVollLEUKalkuliert(Anzahl_Voll_LEU_Kalkuliert_TypeClass newAnzahlVollLEUKalkuliert) {
		if (newAnzahlVollLEUKalkuliert != anzahlVollLEUKalkuliert) {
			NotificationChain msgs = null;
			if (anzahlVollLEUKalkuliert != null)
				msgs = ((InternalEObject)anzahlVollLEUKalkuliert).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT, null, msgs);
			if (newAnzahlVollLEUKalkuliert != null)
				msgs = ((InternalEObject)newAnzahlVollLEUKalkuliert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT, null, msgs);
			msgs = basicSetAnzahlVollLEUKalkuliert(newAnzahlVollLEUKalkuliert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT, newAnzahlVollLEUKalkuliert, newAnzahlVollLEUKalkuliert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul getIDEnergieLEUSchaltkasten() {
		if (iDEnergieLEUSchaltkasten != null && iDEnergieLEUSchaltkasten.eIsProxy()) {
			InternalEObject oldIDEnergieLEUSchaltkasten = (InternalEObject)iDEnergieLEUSchaltkasten;
			iDEnergieLEUSchaltkasten = (EV_Modul)eResolveProxy(oldIDEnergieLEUSchaltkasten);
			if (iDEnergieLEUSchaltkasten != oldIDEnergieLEUSchaltkasten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN, oldIDEnergieLEUSchaltkasten, iDEnergieLEUSchaltkasten));
			}
		}
		return iDEnergieLEUSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EV_Modul basicGetIDEnergieLEUSchaltkasten() {
		return iDEnergieLEUSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEnergieLEUSchaltkasten(EV_Modul newIDEnergieLEUSchaltkasten) {
		EV_Modul oldIDEnergieLEUSchaltkasten = iDEnergieLEUSchaltkasten;
		iDEnergieLEUSchaltkasten = newIDEnergieLEUSchaltkasten;
		boolean oldIDEnergieLEUSchaltkastenESet = iDEnergieLEUSchaltkastenESet;
		iDEnergieLEUSchaltkastenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN, oldIDEnergieLEUSchaltkasten, iDEnergieLEUSchaltkasten, !oldIDEnergieLEUSchaltkastenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEnergieLEUSchaltkasten() {
		EV_Modul oldIDEnergieLEUSchaltkasten = iDEnergieLEUSchaltkasten;
		boolean oldIDEnergieLEUSchaltkastenESet = iDEnergieLEUSchaltkastenESet;
		iDEnergieLEUSchaltkasten = null;
		iDEnergieLEUSchaltkastenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN, oldIDEnergieLEUSchaltkasten, null, oldIDEnergieLEUSchaltkastenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEnergieLEUSchaltkasten() {
		return iDEnergieLEUSchaltkastenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Max_Leistung_TypeClass getMaxLeistung() {
		return maxLeistung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxLeistung(Max_Leistung_TypeClass newMaxLeistung, NotificationChain msgs) {
		Max_Leistung_TypeClass oldMaxLeistung = maxLeistung;
		maxLeistung = newMaxLeistung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG, oldMaxLeistung, newMaxLeistung);
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
	public void setMaxLeistung(Max_Leistung_TypeClass newMaxLeistung) {
		if (newMaxLeistung != maxLeistung) {
			NotificationChain msgs = null;
			if (maxLeistung != null)
				msgs = ((InternalEObject)maxLeistung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG, null, msgs);
			if (newMaxLeistung != null)
				msgs = ((InternalEObject)newMaxLeistung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG, null, msgs);
			msgs = basicSetMaxLeistung(newMaxLeistung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG, newMaxLeistung, newMaxLeistung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spannung_Art_TypeClass getSpannungArt() {
		return spannungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpannungArt(Spannung_Art_TypeClass newSpannungArt, NotificationChain msgs) {
		Spannung_Art_TypeClass oldSpannungArt = spannungArt;
		spannungArt = newSpannungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART, oldSpannungArt, newSpannungArt);
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
	public void setSpannungArt(Spannung_Art_TypeClass newSpannungArt) {
		if (newSpannungArt != spannungArt) {
			NotificationChain msgs = null;
			if (spannungArt != null)
				msgs = ((InternalEObject)spannungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART, null, msgs);
			if (newSpannungArt != null)
				msgs = ((InternalEObject)newSpannungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART, null, msgs);
			msgs = basicSetSpannungArt(newSpannungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART, newSpannungArt, newSpannungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberbrueckung_EV_Unterbrechung_TypeClass getUeberbrueckungEVUnterbrechung() {
		return ueberbrueckungEVUnterbrechung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberbrueckungEVUnterbrechung(Ueberbrueckung_EV_Unterbrechung_TypeClass newUeberbrueckungEVUnterbrechung, NotificationChain msgs) {
		Ueberbrueckung_EV_Unterbrechung_TypeClass oldUeberbrueckungEVUnterbrechung = ueberbrueckungEVUnterbrechung;
		ueberbrueckungEVUnterbrechung = newUeberbrueckungEVUnterbrechung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG, oldUeberbrueckungEVUnterbrechung, newUeberbrueckungEVUnterbrechung);
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
	public void setUeberbrueckungEVUnterbrechung(Ueberbrueckung_EV_Unterbrechung_TypeClass newUeberbrueckungEVUnterbrechung) {
		if (newUeberbrueckungEVUnterbrechung != ueberbrueckungEVUnterbrechung) {
			NotificationChain msgs = null;
			if (ueberbrueckungEVUnterbrechung != null)
				msgs = ((InternalEObject)ueberbrueckungEVUnterbrechung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG, null, msgs);
			if (newUeberbrueckungEVUnterbrechung != null)
				msgs = ((InternalEObject)newUeberbrueckungEVUnterbrechung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG, null, msgs);
			msgs = basicSetUeberbrueckungEVUnterbrechung(newUeberbrueckungEVUnterbrechung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG, newUeberbrueckungEVUnterbrechung, newUeberbrueckungEVUnterbrechung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT:
				return basicSetAnzahlVollLEUKalkuliert(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG:
				return basicSetMaxLeistung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART:
				return basicSetSpannungArt(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG:
				return basicSetUeberbrueckungEVUnterbrechung(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT:
				return getAnzahlVollLEUKalkuliert();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN:
				if (resolve) return getIDEnergieLEUSchaltkasten();
				return basicGetIDEnergieLEUSchaltkasten();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG:
				return getMaxLeistung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART:
				return getSpannungArt();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG:
				return getUeberbrueckungEVUnterbrechung();
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT:
				setAnzahlVollLEUKalkuliert((Anzahl_Voll_LEU_Kalkuliert_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN:
				setIDEnergieLEUSchaltkasten((EV_Modul)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG:
				setMaxLeistung((Max_Leistung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART:
				setSpannungArt((Spannung_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG:
				setUeberbrueckungEVUnterbrechung((Ueberbrueckung_EV_Unterbrechung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT:
				setAnzahlVollLEUKalkuliert((Anzahl_Voll_LEU_Kalkuliert_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN:
				unsetIDEnergieLEUSchaltkasten();
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG:
				setMaxLeistung((Max_Leistung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART:
				setSpannungArt((Spannung_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG:
				setUeberbrueckungEVUnterbrechung((Ueberbrueckung_EV_Unterbrechung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ANZAHL_VOLL_LEU_KALKULIERT:
				return anzahlVollLEUKalkuliert != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__ID_ENERGIE_LEU_SCHALTKASTEN:
				return isSetIDEnergieLEUSchaltkasten();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__MAX_LEISTUNG:
				return maxLeistung != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__SPANNUNG_ART:
				return spannungArt != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_ENERGIE_ATTRIBUTE_GROUP__UEBERBRUECKUNG_EV_UNTERBRECHUNG:
				return ueberbrueckungEVUnterbrechung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Schaltkasten_Energie_AttributeGroupImpl
