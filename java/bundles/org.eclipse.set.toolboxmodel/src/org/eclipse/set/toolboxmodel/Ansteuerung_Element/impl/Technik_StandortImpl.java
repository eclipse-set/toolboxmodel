/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.TSO_IP_Adressblock_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Standort;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technik Standort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Technik_StandortImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Technik_StandortImpl#getIDBedienStandort <em>ID Bedien Standort</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Technik_StandortImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Technik_StandortImpl#getTSOIPAdressblock <em>TSOIP Adressblock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Technik_StandortImpl extends Basis_ObjektImpl implements Technik_Standort {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Technik_Standort_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBedienStandort() <em>ID Bedien Standort</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienStandort()
	 * @generated
	 * @ordered
	 */
	protected EList<Bedien_Standort> iDBedienStandort;

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
	 * The cached value of the '{@link #getTSOIPAdressblock() <em>TSOIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSOIPAdressblock()
	 * @generated
	 * @ordered
	 */
	protected TSO_IP_Adressblock_AttributeGroup tSOIPAdressblock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Technik_StandortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.TECHNIK_STANDORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technik_Standort_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Technik_Standort_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Technik_Standort_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Technik_Standort_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bedien_Standort> getIDBedienStandort() {
		if (iDBedienStandort == null) {
			iDBedienStandort = new EObjectResolvingEList<Bedien_Standort>(Bedien_Standort.class, this, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT);
		}
		return iDBedienStandort;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public TSO_IP_Adressblock_AttributeGroup getTSOIPAdressblock() {
		return tSOIPAdressblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTSOIPAdressblock(TSO_IP_Adressblock_AttributeGroup newTSOIPAdressblock, NotificationChain msgs) {
		TSO_IP_Adressblock_AttributeGroup oldTSOIPAdressblock = tSOIPAdressblock;
		tSOIPAdressblock = newTSOIPAdressblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, oldTSOIPAdressblock, newTSOIPAdressblock);
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
	public void setTSOIPAdressblock(TSO_IP_Adressblock_AttributeGroup newTSOIPAdressblock) {
		if (newTSOIPAdressblock != tSOIPAdressblock) {
			NotificationChain msgs = null;
			if (tSOIPAdressblock != null)
				msgs = ((InternalEObject)tSOIPAdressblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, null, msgs);
			if (newTSOIPAdressblock != null)
				msgs = ((InternalEObject)newTSOIPAdressblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, null, msgs);
			msgs = basicSetTSOIPAdressblock(newTSOIPAdressblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK, newTSOIPAdressblock, newTSOIPAdressblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				return basicSetTSOIPAdressblock(null, msgs);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				return getBezeichnung();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				return getIDBedienStandort();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				return getTSOIPAdressblock();
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				setBezeichnung((Technik_Standort_Bezeichnung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				getIDBedienStandort().clear();
				getIDBedienStandort().addAll((Collection<? extends Bedien_Standort>)newValue);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				setTSOIPAdressblock((TSO_IP_Adressblock_AttributeGroup)newValue);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				setBezeichnung((Technik_Standort_Bezeichnung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				getIDBedienStandort().clear();
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				setTSOIPAdressblock((TSO_IP_Adressblock_AttributeGroup)null);
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
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__BEZEICHNUNG:
				return bezeichnung != null;
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_BEDIEN_STANDORT:
				return iDBedienStandort != null && !iDBedienStandort.isEmpty();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case Ansteuerung_ElementPackage.TECHNIK_STANDORT__TSOIP_ADRESSBLOCK:
				return tSOIPAdressblock != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Technik_StandortImpl
