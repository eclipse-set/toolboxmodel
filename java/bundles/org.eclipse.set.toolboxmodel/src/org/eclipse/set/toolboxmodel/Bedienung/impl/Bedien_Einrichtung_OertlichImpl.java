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

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Einrichtung Oertlich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getBedienEinrichtOertlichAllg <em>Bedien Einricht Oertlich Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Einrichtung_OertlichImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Einrichtung_OertlichImpl extends Basis_ObjektImpl implements Bedien_Einrichtung_Oertlich {
	/**
	 * The cached value of the '{@link #getBedienEinrichtOertlichAllg() <em>Bedien Einricht Oertlich Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienEinrichtOertlichAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einricht_Oertlich_Allg_AttributeGroup bedienEinrichtOertlichAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDAnhangBenutzeroberflaeche() <em>ID Anhang Benutzeroberflaeche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangBenutzeroberflaeche()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangBenutzeroberflaeche;

	/**
	 * This is true if the ID Anhang Benutzeroberflaeche reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangBenutzeroberflaecheESet;

	/**
	 * The cached value of the '{@link #getIDAussenelementansteuerung() <em>ID Aussenelementansteuerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDAussenelementansteuerung;

	/**
	 * This is true if the ID Aussenelementansteuerung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAussenelementansteuerungESet;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung iDUnterbringung;

	/**
	 * This is true if the ID Unterbringung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUnterbringungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Einrichtung_OertlichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_EINRICHTUNG_OERTLICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einricht_Oertlich_Allg_AttributeGroup getBedienEinrichtOertlichAllg() {
		return bedienEinrichtOertlichAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienEinrichtOertlichAllg(Bedien_Einricht_Oertlich_Allg_AttributeGroup newBedienEinrichtOertlichAllg, NotificationChain msgs) {
		Bedien_Einricht_Oertlich_Allg_AttributeGroup oldBedienEinrichtOertlichAllg = bedienEinrichtOertlichAllg;
		bedienEinrichtOertlichAllg = newBedienEinrichtOertlichAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, oldBedienEinrichtOertlichAllg, newBedienEinrichtOertlichAllg);
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
	public void setBedienEinrichtOertlichAllg(Bedien_Einricht_Oertlich_Allg_AttributeGroup newBedienEinrichtOertlichAllg) {
		if (newBedienEinrichtOertlichAllg != bedienEinrichtOertlichAllg) {
			NotificationChain msgs = null;
			if (bedienEinrichtOertlichAllg != null)
				msgs = ((InternalEObject)bedienEinrichtOertlichAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, null, msgs);
			if (newBedienEinrichtOertlichAllg != null)
				msgs = ((InternalEObject)newBedienEinrichtOertlichAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, null, msgs);
			msgs = basicSetBedienEinrichtOertlichAllg(newBedienEinrichtOertlichAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG, newBedienEinrichtOertlichAllg, newBedienEinrichtOertlichAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangBenutzeroberflaeche() {
		if (iDAnhangBenutzeroberflaeche != null && iDAnhangBenutzeroberflaeche.eIsProxy()) {
			InternalEObject oldIDAnhangBenutzeroberflaeche = (InternalEObject)iDAnhangBenutzeroberflaeche;
			iDAnhangBenutzeroberflaeche = (Anhang)eResolveProxy(oldIDAnhangBenutzeroberflaeche);
			if (iDAnhangBenutzeroberflaeche != oldIDAnhangBenutzeroberflaeche) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, oldIDAnhangBenutzeroberflaeche, iDAnhangBenutzeroberflaeche));
			}
		}
		return iDAnhangBenutzeroberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangBenutzeroberflaeche() {
		return iDAnhangBenutzeroberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangBenutzeroberflaeche(Anhang newIDAnhangBenutzeroberflaeche) {
		Anhang oldIDAnhangBenutzeroberflaeche = iDAnhangBenutzeroberflaeche;
		iDAnhangBenutzeroberflaeche = newIDAnhangBenutzeroberflaeche;
		boolean oldIDAnhangBenutzeroberflaecheESet = iDAnhangBenutzeroberflaecheESet;
		iDAnhangBenutzeroberflaecheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, oldIDAnhangBenutzeroberflaeche, iDAnhangBenutzeroberflaeche, !oldIDAnhangBenutzeroberflaecheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangBenutzeroberflaeche() {
		Anhang oldIDAnhangBenutzeroberflaeche = iDAnhangBenutzeroberflaeche;
		boolean oldIDAnhangBenutzeroberflaecheESet = iDAnhangBenutzeroberflaecheESet;
		iDAnhangBenutzeroberflaeche = null;
		iDAnhangBenutzeroberflaecheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE, oldIDAnhangBenutzeroberflaeche, null, oldIDAnhangBenutzeroberflaecheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangBenutzeroberflaeche() {
		return iDAnhangBenutzeroberflaecheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDAussenelementansteuerung() {
		if (iDAussenelementansteuerung != null && iDAussenelementansteuerung.eIsProxy()) {
			InternalEObject oldIDAussenelementansteuerung = (InternalEObject)iDAussenelementansteuerung;
			iDAussenelementansteuerung = (Aussenelementansteuerung)eResolveProxy(oldIDAussenelementansteuerung);
			if (iDAussenelementansteuerung != oldIDAussenelementansteuerung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, iDAussenelementansteuerung));
			}
		}
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDAussenelementansteuerung() {
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAussenelementansteuerung(Aussenelementansteuerung newIDAussenelementansteuerung) {
		Aussenelementansteuerung oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		iDAussenelementansteuerung = newIDAussenelementansteuerung;
		boolean oldIDAussenelementansteuerungESet = iDAussenelementansteuerungESet;
		iDAussenelementansteuerungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, iDAussenelementansteuerung, !oldIDAussenelementansteuerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAussenelementansteuerung() {
		Aussenelementansteuerung oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		boolean oldIDAussenelementansteuerungESet = iDAussenelementansteuerungESet;
		iDAussenelementansteuerung = null;
		iDAussenelementansteuerungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, null, oldIDAussenelementansteuerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAussenelementansteuerung() {
		return iDAussenelementansteuerungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung getIDUnterbringung() {
		if (iDUnterbringung != null && iDUnterbringung.eIsProxy()) {
			InternalEObject oldIDUnterbringung = (InternalEObject)iDUnterbringung;
			iDUnterbringung = (Unterbringung)eResolveProxy(oldIDUnterbringung);
			if (iDUnterbringung != oldIDUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
			}
		}
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterbringung basicGetIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUnterbringung(Unterbringung newIDUnterbringung) {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUnterbringung() {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringung = null;
		iDUnterbringungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUnterbringung() {
		return iDUnterbringungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				return basicSetBedienEinrichtOertlichAllg(null, msgs);
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				return getBedienEinrichtOertlichAllg();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				if (resolve) return getIDAnhangBenutzeroberflaeche();
				return basicGetIDAnhangBenutzeroberflaeche();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				if (resolve) return getIDAussenelementansteuerung();
				return basicGetIDAussenelementansteuerung();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				setBedienEinrichtOertlichAllg((Bedien_Einricht_Oertlich_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				setBezeichnung((Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				setIDAnhangBenutzeroberflaeche((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((Aussenelementansteuerung)newValue);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				setBedienEinrichtOertlichAllg((Bedien_Einricht_Oertlich_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				setBezeichnung((Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				unsetIDAnhangBenutzeroberflaeche();
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				unsetIDAussenelementansteuerung();
				return;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
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
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEDIEN_EINRICHT_OERTLICH_ALLG:
				return bedienEinrichtOertlichAllg != null;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_ANHANG_BENUTZEROBERFLAECHE:
				return isSetIDAnhangBenutzeroberflaeche();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_AUSSENELEMENTANSTEUERUNG:
				return isSetIDAussenelementansteuerung();
			case BedienungPackage.BEDIEN_EINRICHTUNG_OERTLICH__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Einrichtung_OertlichImpl
