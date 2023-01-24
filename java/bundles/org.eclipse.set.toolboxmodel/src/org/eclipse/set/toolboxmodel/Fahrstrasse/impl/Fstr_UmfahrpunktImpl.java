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

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Umfahrpunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_UmfahrpunktImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_UmfahrpunktImpl#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_UmfahrpunktImpl extends Basis_ObjektImpl implements Fstr_Umfahrpunkt {
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
	 * The cached value of the '{@link #getIDUmfahrpunkt() <em>ID Umfahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUmfahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDUmfahrpunkt;

	/**
	 * This is true if the ID Umfahrpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUmfahrpunktESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_UmfahrpunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_UMFAHRPUNKT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg, !oldIDFstrFahrwegESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, null, oldIDFstrFahrwegESet));
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
	public Basis_Objekt getIDUmfahrpunkt() {
		if (iDUmfahrpunkt != null && iDUmfahrpunkt.eIsProxy()) {
			InternalEObject oldIDUmfahrpunkt = (InternalEObject)iDUmfahrpunkt;
			iDUmfahrpunkt = (Basis_Objekt)eResolveProxy(oldIDUmfahrpunkt);
			if (iDUmfahrpunkt != oldIDUmfahrpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, oldIDUmfahrpunkt, iDUmfahrpunkt));
			}
		}
		return iDUmfahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDUmfahrpunkt() {
		return iDUmfahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUmfahrpunkt(Basis_Objekt newIDUmfahrpunkt) {
		Basis_Objekt oldIDUmfahrpunkt = iDUmfahrpunkt;
		iDUmfahrpunkt = newIDUmfahrpunkt;
		boolean oldIDUmfahrpunktESet = iDUmfahrpunktESet;
		iDUmfahrpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, oldIDUmfahrpunkt, iDUmfahrpunkt, !oldIDUmfahrpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUmfahrpunkt() {
		Basis_Objekt oldIDUmfahrpunkt = iDUmfahrpunkt;
		boolean oldIDUmfahrpunktESet = iDUmfahrpunktESet;
		iDUmfahrpunkt = null;
		iDUmfahrpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT, oldIDUmfahrpunkt, null, oldIDUmfahrpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUmfahrpunkt() {
		return iDUmfahrpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				if (resolve) return getIDFstrFahrweg();
				return basicGetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				if (resolve) return getIDUmfahrpunkt();
				return basicGetIDUmfahrpunkt();
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((Fstr_Fahrweg)newValue);
				return;
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				setIDUmfahrpunkt((Basis_Objekt)newValue);
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				unsetIDFstrFahrweg();
				return;
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				unsetIDUmfahrpunkt();
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
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_FSTR_FAHRWEG:
				return isSetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_UMFAHRPUNKT__ID_UMFAHRPUNKT:
				return isSetIDUmfahrpunkt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_UmfahrpunktImpl
