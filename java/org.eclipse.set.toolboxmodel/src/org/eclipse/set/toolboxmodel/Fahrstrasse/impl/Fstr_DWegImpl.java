/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWegImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWegImpl#getFstrDWegAllg <em>Fstr DWeg Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWegImpl#getFstrDWegSpezifisch <em>Fstr DWeg Spezifisch</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWegImpl#getIDFMAAnlageFreimeldung <em>IDFMA Anlage Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWegImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWegImpl#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWegImpl extends Basis_ObjektImpl implements Fstr_DWeg {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getFstrDWegAllg() <em>Fstr DWeg Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWegAllg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_Allg_AttributeGroup fstrDWegAllg;

	/**
	 * The cached value of the '{@link #getFstrDWegSpezifisch() <em>Fstr DWeg Spezifisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrDWegSpezifisch()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg_Spezifisch_AttributeGroup fstrDWegSpezifisch;

	/**
	 * The cached value of the '{@link #getIDFMAAnlageFreimeldung() <em>IDFMA Anlage Freimeldung</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlageFreimeldung()
	 * @generated
	 * @ordered
	 */
	protected EList<FMA_Anlage> iDFMAAnlageFreimeldung;

	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Fahrweg iDFstrFahrweg;

	/**
	 * This is true if the ID Fstr Fahrweg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrFahrwegESet;

	/**
	 * The cached value of the '{@link #getIDPZBGefahrpunkt() <em>IDPZB Gefahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBGefahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDPZBGefahrpunkt;

	/**
	 * This is true if the IDPZB Gefahrpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDPZBGefahrpunktESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Fstr_DWeg_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Fstr_DWeg_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Fstr_DWeg_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Allg_AttributeGroup getFstrDWegAllg() {
		return fstrDWegAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrDWegAllg(Fstr_DWeg_Allg_AttributeGroup newFstrDWegAllg, NotificationChain msgs) {
		Fstr_DWeg_Allg_AttributeGroup oldFstrDWegAllg = fstrDWegAllg;
		fstrDWegAllg = newFstrDWegAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, oldFstrDWegAllg, newFstrDWegAllg);
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
	public void setFstrDWegAllg(Fstr_DWeg_Allg_AttributeGroup newFstrDWegAllg) {
		if (newFstrDWegAllg != fstrDWegAllg) {
			NotificationChain msgs = null;
			if (fstrDWegAllg != null)
				msgs = ((InternalEObject)fstrDWegAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, null, msgs);
			if (newFstrDWegAllg != null)
				msgs = ((InternalEObject)newFstrDWegAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, null, msgs);
			msgs = basicSetFstrDWegAllg(newFstrDWegAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG, newFstrDWegAllg, newFstrDWegAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg_Spezifisch_AttributeGroup getFstrDWegSpezifisch() {
		return fstrDWegSpezifisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrDWegSpezifisch(Fstr_DWeg_Spezifisch_AttributeGroup newFstrDWegSpezifisch, NotificationChain msgs) {
		Fstr_DWeg_Spezifisch_AttributeGroup oldFstrDWegSpezifisch = fstrDWegSpezifisch;
		fstrDWegSpezifisch = newFstrDWegSpezifisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, oldFstrDWegSpezifisch, newFstrDWegSpezifisch);
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
	public void setFstrDWegSpezifisch(Fstr_DWeg_Spezifisch_AttributeGroup newFstrDWegSpezifisch) {
		if (newFstrDWegSpezifisch != fstrDWegSpezifisch) {
			NotificationChain msgs = null;
			if (fstrDWegSpezifisch != null)
				msgs = ((InternalEObject)fstrDWegSpezifisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, null, msgs);
			if (newFstrDWegSpezifisch != null)
				msgs = ((InternalEObject)newFstrDWegSpezifisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, null, msgs);
			msgs = basicSetFstrDWegSpezifisch(newFstrDWegSpezifisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH, newFstrDWegSpezifisch, newFstrDWegSpezifisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMA_Anlage> getIDFMAAnlageFreimeldung() {
		if (iDFMAAnlageFreimeldung == null) {
			iDFMAAnlageFreimeldung = new EObjectResolvingEList<FMA_Anlage>(FMA_Anlage.class, this, FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG);
		}
		return iDFMAAnlageFreimeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Fahrweg getIDFstrFahrweg() {
		if (iDFstrFahrweg != null && iDFstrFahrweg.eIsProxy()) {
			InternalEObject oldIDFstrFahrweg = (InternalEObject)iDFstrFahrweg;
			iDFstrFahrweg = (Fstr_Fahrweg)eResolveProxy(oldIDFstrFahrweg);
			if (iDFstrFahrweg != oldIDFstrFahrweg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg));
			}
		}
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Fahrweg basicGetIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrFahrweg(Fstr_Fahrweg newIDFstrFahrweg) {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrwegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg, !oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrFahrweg() {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrweg = null;
		iDFstrFahrwegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, null, oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrFahrweg() {
		return iDFstrFahrwegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDPZBGefahrpunkt() {
		if (iDPZBGefahrpunkt != null && iDPZBGefahrpunkt.eIsProxy()) {
			InternalEObject oldIDPZBGefahrpunkt = (InternalEObject)iDPZBGefahrpunkt;
			iDPZBGefahrpunkt = (Markanter_Punkt)eResolveProxy(oldIDPZBGefahrpunkt);
			if (iDPZBGefahrpunkt != oldIDPZBGefahrpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, oldIDPZBGefahrpunkt, iDPZBGefahrpunkt));
			}
		}
		return iDPZBGefahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDPZBGefahrpunkt() {
		return iDPZBGefahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDPZBGefahrpunkt(Markanter_Punkt newIDPZBGefahrpunkt) {
		Markanter_Punkt oldIDPZBGefahrpunkt = iDPZBGefahrpunkt;
		iDPZBGefahrpunkt = newIDPZBGefahrpunkt;
		boolean oldIDPZBGefahrpunktESet = iDPZBGefahrpunktESet;
		iDPZBGefahrpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, oldIDPZBGefahrpunkt, iDPZBGefahrpunkt, !oldIDPZBGefahrpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDPZBGefahrpunkt() {
		Markanter_Punkt oldIDPZBGefahrpunkt = iDPZBGefahrpunkt;
		boolean oldIDPZBGefahrpunktESet = iDPZBGefahrpunktESet;
		iDPZBGefahrpunkt = null;
		iDPZBGefahrpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT, oldIDPZBGefahrpunkt, null, oldIDPZBGefahrpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDPZBGefahrpunkt() {
		return iDPZBGefahrpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				return basicSetFstrDWegAllg(null, msgs);
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				return basicSetFstrDWegSpezifisch(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				return getBezeichnung();
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				return getFstrDWegAllg();
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				return getFstrDWegSpezifisch();
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				return getIDFMAAnlageFreimeldung();
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				if (resolve) return getIDFstrFahrweg();
				return basicGetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				if (resolve) return getIDPZBGefahrpunkt();
				return basicGetIDPZBGefahrpunkt();
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				setBezeichnung((Fstr_DWeg_Bezeichnung_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				setFstrDWegAllg((Fstr_DWeg_Allg_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				setFstrDWegSpezifisch((Fstr_DWeg_Spezifisch_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				getIDFMAAnlageFreimeldung().clear();
				getIDFMAAnlageFreimeldung().addAll((Collection<? extends FMA_Anlage>)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((Fstr_Fahrweg)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				setIDPZBGefahrpunkt((Markanter_Punkt)newValue);
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				setBezeichnung((Fstr_DWeg_Bezeichnung_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				setFstrDWegAllg((Fstr_DWeg_Allg_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				setFstrDWegSpezifisch((Fstr_DWeg_Spezifisch_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				getIDFMAAnlageFreimeldung().clear();
				return;
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				unsetIDFstrFahrweg();
				return;
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				unsetIDPZBGefahrpunkt();
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
			case FahrstrassePackage.FSTR_DWEG__BEZEICHNUNG:
				return bezeichnung != null;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_ALLG:
				return fstrDWegAllg != null;
			case FahrstrassePackage.FSTR_DWEG__FSTR_DWEG_SPEZIFISCH:
				return fstrDWegSpezifisch != null;
			case FahrstrassePackage.FSTR_DWEG__IDFMA_ANLAGE_FREIMELDUNG:
				return iDFMAAnlageFreimeldung != null && !iDFMAAnlageFreimeldung.isEmpty();
			case FahrstrassePackage.FSTR_DWEG__ID_FSTR_FAHRWEG:
				return isSetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_DWEG__IDPZB_GEFAHRPUNKT:
				return isSetIDPZBGefahrpunkt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_DWegImpl
