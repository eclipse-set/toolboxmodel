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
import org.eclipse.set.toolboxmodel.Bahnuebergang.SA_Schrankenbaum_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb_Bezeichnung_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schrankenantrieb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.SchrankenantriebImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.SchrankenantriebImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.SchrankenantriebImpl#getSASchrankenbaum <em>SA Schrankenbaum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.SchrankenantriebImpl#getSchrankenantriebAllg <em>Schrankenantrieb Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchrankenantriebImpl extends Punkt_ObjektImpl implements Schrankenantrieb {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Schrankenantrieb_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getSASchrankenbaum() <em>SA Schrankenbaum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSASchrankenbaum()
	 * @generated
	 * @ordered
	 */
	protected SA_Schrankenbaum_AttributeGroup sASchrankenbaum;

	/**
	 * The cached value of the '{@link #getSchrankenantriebAllg() <em>Schrankenantrieb Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchrankenantriebAllg()
	 * @generated
	 * @ordered
	 */
	protected Schrankenantrieb_Allg_AttributeGroup schrankenantriebAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchrankenantriebImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getSchrankenantrieb();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankenantrieb_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Schrankenantrieb_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Schrankenantrieb_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Schrankenantrieb_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage, !oldIDBUEAnlageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE, oldIDBUEAnlage, null, oldIDBUEAnlageESet));
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
	public SA_Schrankenbaum_AttributeGroup getSASchrankenbaum() {
		return sASchrankenbaum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSASchrankenbaum(SA_Schrankenbaum_AttributeGroup newSASchrankenbaum, NotificationChain msgs) {
		SA_Schrankenbaum_AttributeGroup oldSASchrankenbaum = sASchrankenbaum;
		sASchrankenbaum = newSASchrankenbaum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM, oldSASchrankenbaum, newSASchrankenbaum);
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
	public void setSASchrankenbaum(SA_Schrankenbaum_AttributeGroup newSASchrankenbaum) {
		if (newSASchrankenbaum != sASchrankenbaum) {
			NotificationChain msgs = null;
			if (sASchrankenbaum != null)
				msgs = ((InternalEObject)sASchrankenbaum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM, null, msgs);
			if (newSASchrankenbaum != null)
				msgs = ((InternalEObject)newSASchrankenbaum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM, null, msgs);
			msgs = basicSetSASchrankenbaum(newSASchrankenbaum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM, newSASchrankenbaum, newSASchrankenbaum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schrankenantrieb_Allg_AttributeGroup getSchrankenantriebAllg() {
		return schrankenantriebAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchrankenantriebAllg(Schrankenantrieb_Allg_AttributeGroup newSchrankenantriebAllg, NotificationChain msgs) {
		Schrankenantrieb_Allg_AttributeGroup oldSchrankenantriebAllg = schrankenantriebAllg;
		schrankenantriebAllg = newSchrankenantriebAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG, oldSchrankenantriebAllg, newSchrankenantriebAllg);
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
	public void setSchrankenantriebAllg(Schrankenantrieb_Allg_AttributeGroup newSchrankenantriebAllg) {
		if (newSchrankenantriebAllg != schrankenantriebAllg) {
			NotificationChain msgs = null;
			if (schrankenantriebAllg != null)
				msgs = ((InternalEObject)schrankenantriebAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG, null, msgs);
			if (newSchrankenantriebAllg != null)
				msgs = ((InternalEObject)newSchrankenantriebAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG, null, msgs);
			msgs = basicSetSchrankenantriebAllg(newSchrankenantriebAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG, newSchrankenantriebAllg, newSchrankenantriebAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM:
				return basicSetSASchrankenbaum(null, msgs);
			case BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG:
				return basicSetSchrankenantriebAllg(null, msgs);
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
			case BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE:
				if (resolve) return getIDBUEAnlage();
				return basicGetIDBUEAnlage();
			case BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM:
				return getSASchrankenbaum();
			case BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG:
				return getSchrankenantriebAllg();
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
			case BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG:
				setBezeichnung((Schrankenantrieb_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE:
				setIDBUEAnlage((BUE_Anlage)newValue);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM:
				setSASchrankenbaum((SA_Schrankenbaum_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG:
				setSchrankenantriebAllg((Schrankenantrieb_Allg_AttributeGroup)newValue);
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
			case BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG:
				setBezeichnung((Schrankenantrieb_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE:
				unsetIDBUEAnlage();
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM:
				setSASchrankenbaum((SA_Schrankenbaum_AttributeGroup)null);
				return;
			case BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG:
				setSchrankenantriebAllg((Schrankenantrieb_Allg_AttributeGroup)null);
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
			case BahnuebergangPackage.SCHRANKENANTRIEB__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.SCHRANKENANTRIEB__IDBUE_ANLAGE:
				return isSetIDBUEAnlage();
			case BahnuebergangPackage.SCHRANKENANTRIEB__SA_SCHRANKENBAUM:
				return sASchrankenbaum != null;
			case BahnuebergangPackage.SCHRANKENANTRIEB__SCHRANKENANTRIEB_ALLG:
				return schrankenantriebAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //SchrankenantriebImpl
