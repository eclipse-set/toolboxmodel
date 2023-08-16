/**
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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Sonstiger_Punkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sonstiger Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Sonstiger_PunktImpl#getIDBeginnBereich <em>ID Beginn Bereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Sonstiger_PunktImpl extends Punkt_ObjektImpl implements Sonstiger_Punkt {
	/**
	 * The cached value of the '{@link #getIDBeginnBereich() <em>ID Beginn Bereich</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBeginnBereich()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDBeginnBereich;

	/**
	 * This is true if the ID Beginn Bereich reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBeginnBereichESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sonstiger_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.SONSTIGER_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDBeginnBereich() {
		if (iDBeginnBereich != null && iDBeginnBereich.eIsProxy()) {
			InternalEObject oldIDBeginnBereich = (InternalEObject)iDBeginnBereich;
			iDBeginnBereich = (Basis_Objekt)eResolveProxy(oldIDBeginnBereich);
			if (iDBeginnBereich != oldIDBeginnBereich) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, oldIDBeginnBereich, iDBeginnBereich));
			}
		}
		return iDBeginnBereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDBeginnBereich() {
		return iDBeginnBereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBeginnBereich(Basis_Objekt newIDBeginnBereich) {
		Basis_Objekt oldIDBeginnBereich = iDBeginnBereich;
		iDBeginnBereich = newIDBeginnBereich;
		boolean oldIDBeginnBereichESet = iDBeginnBereichESet;
		iDBeginnBereichESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, oldIDBeginnBereich, iDBeginnBereich, !oldIDBeginnBereichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBeginnBereich() {
		Basis_Objekt oldIDBeginnBereich = iDBeginnBereich;
		boolean oldIDBeginnBereichESet = iDBeginnBereichESet;
		iDBeginnBereich = null;
		iDBeginnBereichESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH, oldIDBeginnBereich, null, oldIDBeginnBereichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBeginnBereich() {
		return iDBeginnBereichESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				if (resolve) return getIDBeginnBereich();
				return basicGetIDBeginnBereich();
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				setIDBeginnBereich((Basis_Objekt)newValue);
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				unsetIDBeginnBereich();
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
			case FahrstrassePackage.SONSTIGER_PUNKT__ID_BEGINN_BEREICH:
				return isSetIDBeginnBereich();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Sonstiger_PunktImpl
