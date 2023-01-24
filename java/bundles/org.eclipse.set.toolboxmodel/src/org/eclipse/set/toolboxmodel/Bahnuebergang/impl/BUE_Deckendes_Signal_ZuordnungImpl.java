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

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Sicherheitsabstand_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Deckendes Signal Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Deckendes_Signal_ZuordnungImpl#getSicherheitsabstand <em>Sicherheitsabstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Deckendes_Signal_ZuordnungImpl extends Basis_ObjektImpl implements BUE_Deckendes_Signal_Zuordnung {
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
	 * The cached value of the '{@link #getSicherheitsabstand() <em>Sicherheitsabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSicherheitsabstand()
	 * @generated
	 * @ordered
	 */
	protected Sicherheitsabstand_TypeClass sicherheitsabstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Deckendes_Signal_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Deckendes_Signal_Zuordnung();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, iDBUEEinschaltung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, iDBUEEinschaltung, !oldIDBUEEinschaltungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, null, oldIDBUEEinschaltungESet));
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
	public Signal getIDSignal() {
		if (iDSignal != null && iDSignal.eIsProxy()) {
			InternalEObject oldIDSignal = (InternalEObject)iDSignal;
			iDSignal = (Signal)eResolveProxy(oldIDSignal);
			if (iDSignal != oldIDSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, oldIDSignal, iDSignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
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
	public Sicherheitsabstand_TypeClass getSicherheitsabstand() {
		return sicherheitsabstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSicherheitsabstand(Sicherheitsabstand_TypeClass newSicherheitsabstand, NotificationChain msgs) {
		Sicherheitsabstand_TypeClass oldSicherheitsabstand = sicherheitsabstand;
		sicherheitsabstand = newSicherheitsabstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, oldSicherheitsabstand, newSicherheitsabstand);
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
	public void setSicherheitsabstand(Sicherheitsabstand_TypeClass newSicherheitsabstand) {
		if (newSicherheitsabstand != sicherheitsabstand) {
			NotificationChain msgs = null;
			if (sicherheitsabstand != null)
				msgs = ((InternalEObject)sicherheitsabstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, null, msgs);
			if (newSicherheitsabstand != null)
				msgs = ((InternalEObject)newSicherheitsabstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, null, msgs);
			msgs = basicSetSicherheitsabstand(newSicherheitsabstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND, newSicherheitsabstand, newSicherheitsabstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				return basicSetSicherheitsabstand(null, msgs);
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				if (resolve) return getIDBUEEinschaltung();
				return basicGetIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				return getSicherheitsabstand();
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((BUE_Einschaltung)newValue);
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				setSicherheitsabstand((Sicherheitsabstand_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				unsetIDBUEEinschaltung();
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				unsetIDSignal();
				return;
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				setSicherheitsabstand((Sicherheitsabstand_TypeClass)null);
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
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return isSetIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__ID_SIGNAL:
				return isSetIDSignal();
			case BahnuebergangPackage.BUE_DECKENDES_SIGNAL_ZUORDNUNG__SICHERHEITSABSTAND:
				return sicherheitsabstand != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Deckendes_Signal_ZuordnungImpl
