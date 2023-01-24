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
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Nichthaltfall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_NichthaltfallImpl#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_NichthaltfallImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_NichthaltfallImpl extends Basis_ObjektImpl implements Fstr_Nichthaltfall {
	/**
	 * The cached value of the '{@link #getIDFMAAnlage() <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage iDFMAAnlage;

	/**
	 * This is true if the IDFMA Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFMAAnlageESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_NichthaltfallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_NICHTHALTFALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage getIDFMAAnlage() {
		if (iDFMAAnlage != null && iDFMAAnlage.eIsProxy()) {
			InternalEObject oldIDFMAAnlage = (InternalEObject)iDFMAAnlage;
			iDFMAAnlage = (FMA_Anlage)eResolveProxy(oldIDFMAAnlage);
			if (iDFMAAnlage != oldIDFMAAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, oldIDFMAAnlage, iDFMAAnlage));
			}
		}
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMA_Anlage basicGetIDFMAAnlage() {
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFMAAnlage(FMA_Anlage newIDFMAAnlage) {
		FMA_Anlage oldIDFMAAnlage = iDFMAAnlage;
		iDFMAAnlage = newIDFMAAnlage;
		boolean oldIDFMAAnlageESet = iDFMAAnlageESet;
		iDFMAAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, oldIDFMAAnlage, iDFMAAnlage, !oldIDFMAAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFMAAnlage() {
		FMA_Anlage oldIDFMAAnlage = iDFMAAnlage;
		boolean oldIDFMAAnlageESet = iDFMAAnlageESet;
		iDFMAAnlage = null;
		iDFMAAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE, oldIDFMAAnlage, null, oldIDFMAAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFMAAnlage() {
		return iDFMAAnlageESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg, !oldIDFstrFahrwegESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, null, oldIDFstrFahrwegESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				if (resolve) return getIDFMAAnlage();
				return basicGetIDFMAAnlage();
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				if (resolve) return getIDFstrFahrweg();
				return basicGetIDFstrFahrweg();
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				setIDFMAAnlage((FMA_Anlage)newValue);
				return;
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((Fstr_Fahrweg)newValue);
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				unsetIDFMAAnlage();
				return;
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				unsetIDFstrFahrweg();
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
			case FahrstrassePackage.FSTR_NICHTHALTFALL__IDFMA_ANLAGE:
				return isSetIDFMAAnlage();
			case FahrstrassePackage.FSTR_NICHTHALTFALL__ID_FSTR_FAHRWEG:
				return isSetIDFstrFahrweg();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_NichthaltfallImpl
