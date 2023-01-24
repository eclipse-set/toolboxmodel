/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

import org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Signalisierung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_SignalisierungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_SignalisierungImpl#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_SignalisierungImpl#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_SignalisierungImpl extends Basis_ObjektImpl implements Fstr_Signalisierung {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrZugRangier;

	/**
	 * This is true if the ID Fstr Zug Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrZugRangierESet;

	/**
	 * The cached value of the '{@link #getIDSignalSignalbegriff() <em>ID Signal Signalbegriff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalSignalbegriff()
	 * @generated
	 * @ordered
	 */
	protected Signal_Signalbegriff iDSignalSignalbegriff;

	/**
	 * This is true if the ID Signal Signalbegriff reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalSignalbegriffESet;

	/**
	 * The cached value of the '{@link #getIDSignalSignalbegriffZiel() <em>ID Signal Signalbegriff Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalSignalbegriffZiel()
	 * @generated
	 * @ordered
	 */
	protected Signal_Signalbegriff iDSignalSignalbegriffZiel;

	/**
	 * This is true if the ID Signal Signalbegriff Ziel reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalSignalbegriffZielESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_SignalisierungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_SIGNALISIERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrZugRangier() {
		if (iDFstrZugRangier != null && iDFstrZugRangier.eIsProxy()) {
			InternalEObject oldIDFstrZugRangier = (InternalEObject)iDFstrZugRangier;
			iDFstrZugRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrZugRangier);
			if (iDFstrZugRangier != oldIDFstrZugRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
			}
		}
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrZugRangier(Fstr_Zug_Rangier newIDFstrZugRangier) {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrZugRangier() {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangier = null;
		iDFstrZugRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrZugRangier() {
		return iDFstrZugRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Signalbegriff getIDSignalSignalbegriff() {
		if (iDSignalSignalbegriff != null && iDSignalSignalbegriff.eIsProxy()) {
			InternalEObject oldIDSignalSignalbegriff = (InternalEObject)iDSignalSignalbegriff;
			iDSignalSignalbegriff = (Signal_Signalbegriff)eResolveProxy(oldIDSignalSignalbegriff);
			if (iDSignalSignalbegriff != oldIDSignalSignalbegriff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, oldIDSignalSignalbegriff, iDSignalSignalbegriff));
			}
		}
		return iDSignalSignalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal_Signalbegriff basicGetIDSignalSignalbegriff() {
		return iDSignalSignalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignalSignalbegriff(Signal_Signalbegriff newIDSignalSignalbegriff) {
		Signal_Signalbegriff oldIDSignalSignalbegriff = iDSignalSignalbegriff;
		iDSignalSignalbegriff = newIDSignalSignalbegriff;
		boolean oldIDSignalSignalbegriffESet = iDSignalSignalbegriffESet;
		iDSignalSignalbegriffESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, oldIDSignalSignalbegriff, iDSignalSignalbegriff, !oldIDSignalSignalbegriffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignalSignalbegriff() {
		Signal_Signalbegriff oldIDSignalSignalbegriff = iDSignalSignalbegriff;
		boolean oldIDSignalSignalbegriffESet = iDSignalSignalbegriffESet;
		iDSignalSignalbegriff = null;
		iDSignalSignalbegriffESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF, oldIDSignalSignalbegriff, null, oldIDSignalSignalbegriffESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignalSignalbegriff() {
		return iDSignalSignalbegriffESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Signalbegriff getIDSignalSignalbegriffZiel() {
		if (iDSignalSignalbegriffZiel != null && iDSignalSignalbegriffZiel.eIsProxy()) {
			InternalEObject oldIDSignalSignalbegriffZiel = (InternalEObject)iDSignalSignalbegriffZiel;
			iDSignalSignalbegriffZiel = (Signal_Signalbegriff)eResolveProxy(oldIDSignalSignalbegriffZiel);
			if (iDSignalSignalbegriffZiel != oldIDSignalSignalbegriffZiel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, oldIDSignalSignalbegriffZiel, iDSignalSignalbegriffZiel));
			}
		}
		return iDSignalSignalbegriffZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal_Signalbegriff basicGetIDSignalSignalbegriffZiel() {
		return iDSignalSignalbegriffZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignalSignalbegriffZiel(Signal_Signalbegriff newIDSignalSignalbegriffZiel) {
		Signal_Signalbegriff oldIDSignalSignalbegriffZiel = iDSignalSignalbegriffZiel;
		iDSignalSignalbegriffZiel = newIDSignalSignalbegriffZiel;
		boolean oldIDSignalSignalbegriffZielESet = iDSignalSignalbegriffZielESet;
		iDSignalSignalbegriffZielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, oldIDSignalSignalbegriffZiel, iDSignalSignalbegriffZiel, !oldIDSignalSignalbegriffZielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignalSignalbegriffZiel() {
		Signal_Signalbegriff oldIDSignalSignalbegriffZiel = iDSignalSignalbegriffZiel;
		boolean oldIDSignalSignalbegriffZielESet = iDSignalSignalbegriffZielESet;
		iDSignalSignalbegriffZiel = null;
		iDSignalSignalbegriffZielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL, oldIDSignalSignalbegriffZiel, null, oldIDSignalSignalbegriffZielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignalSignalbegriffZiel() {
		return iDSignalSignalbegriffZielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				if (resolve) return getIDFstrZugRangier();
				return basicGetIDFstrZugRangier();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				if (resolve) return getIDSignalSignalbegriff();
				return basicGetIDSignalSignalbegriff();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				if (resolve) return getIDSignalSignalbegriffZiel();
				return basicGetIDSignalSignalbegriffZiel();
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((Fstr_Zug_Rangier)newValue);
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				setIDSignalSignalbegriff((Signal_Signalbegriff)newValue);
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				setIDSignalSignalbegriffZiel((Signal_Signalbegriff)newValue);
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				unsetIDFstrZugRangier();
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				unsetIDSignalSignalbegriff();
				return;
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				unsetIDSignalSignalbegriffZiel();
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
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF:
				return isSetIDSignalSignalbegriff();
			case FahrstrassePackage.FSTR_SIGNALISIERUNG__ID_SIGNAL_SIGNALBEGRIFF_ZIEL:
				return isSetIDSignalSignalbegriffZiel();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_SignalisierungImpl
