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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_V_Hg_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Start_Signal_Charakter_TypeClass;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Fahrweg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_FahrwegImpl#getFstrVHg <em>Fstr VHg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_FahrwegImpl#getIDStart <em>ID Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_FahrwegImpl#getIDZiel <em>ID Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_FahrwegImpl#getStartSignalCharakter <em>Start Signal Charakter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_FahrwegImpl extends Bereich_ObjektImpl implements Fstr_Fahrweg {
	/**
	 * The cached value of the '{@link #getFstrVHg() <em>Fstr VHg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrVHg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_V_Hg_TypeClass fstrVHg;

	/**
	 * The cached value of the '{@link #getIDStart() <em>ID Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStart()
	 * @generated
	 * @ordered
	 */
	protected Signal iDStart;

	/**
	 * This is true if the ID Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStartESet;

	/**
	 * The cached value of the '{@link #getIDZiel() <em>ID Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZiel()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDZiel;

	/**
	 * This is true if the ID Ziel reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZielESet;

	/**
	 * The cached value of the '{@link #getStartSignalCharakter() <em>Start Signal Charakter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSignalCharakter()
	 * @generated
	 * @ordered
	 */
	protected Start_Signal_Charakter_TypeClass startSignalCharakter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_FahrwegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_FAHRWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_V_Hg_TypeClass getFstrVHg() {
		return fstrVHg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrVHg(Fstr_V_Hg_TypeClass newFstrVHg, NotificationChain msgs) {
		Fstr_V_Hg_TypeClass oldFstrVHg = fstrVHg;
		fstrVHg = newFstrVHg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, oldFstrVHg, newFstrVHg);
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
	public void setFstrVHg(Fstr_V_Hg_TypeClass newFstrVHg) {
		if (newFstrVHg != fstrVHg) {
			NotificationChain msgs = null;
			if (fstrVHg != null)
				msgs = ((InternalEObject)fstrVHg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, null, msgs);
			if (newFstrVHg != null)
				msgs = ((InternalEObject)newFstrVHg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, null, msgs);
			msgs = basicSetFstrVHg(newFstrVHg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG, newFstrVHg, newFstrVHg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDStart() {
		if (iDStart != null && iDStart.eIsProxy()) {
			InternalEObject oldIDStart = (InternalEObject)iDStart;
			iDStart = (Signal)eResolveProxy(oldIDStart);
			if (iDStart != oldIDStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_FAHRWEG__ID_START, oldIDStart, iDStart));
			}
		}
		return iDStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDStart() {
		return iDStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStart(Signal newIDStart) {
		Signal oldIDStart = iDStart;
		iDStart = newIDStart;
		boolean oldIDStartESet = iDStartESet;
		iDStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__ID_START, oldIDStart, iDStart, !oldIDStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStart() {
		Signal oldIDStart = iDStart;
		boolean oldIDStartESet = iDStartESet;
		iDStart = null;
		iDStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_FAHRWEG__ID_START, oldIDStart, null, oldIDStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStart() {
		return iDStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDZiel() {
		if (iDZiel != null && iDZiel.eIsProxy()) {
			InternalEObject oldIDZiel = (InternalEObject)iDZiel;
			iDZiel = (Basis_Objekt)eResolveProxy(oldIDZiel);
			if (iDZiel != oldIDZiel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, oldIDZiel, iDZiel));
			}
		}
		return iDZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDZiel() {
		return iDZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZiel(Basis_Objekt newIDZiel) {
		Basis_Objekt oldIDZiel = iDZiel;
		iDZiel = newIDZiel;
		boolean oldIDZielESet = iDZielESet;
		iDZielESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, oldIDZiel, iDZiel, !oldIDZielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZiel() {
		Basis_Objekt oldIDZiel = iDZiel;
		boolean oldIDZielESet = iDZielESet;
		iDZiel = null;
		iDZielESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL, oldIDZiel, null, oldIDZielESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZiel() {
		return iDZielESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_Signal_Charakter_TypeClass getStartSignalCharakter() {
		return startSignalCharakter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartSignalCharakter(Start_Signal_Charakter_TypeClass newStartSignalCharakter, NotificationChain msgs) {
		Start_Signal_Charakter_TypeClass oldStartSignalCharakter = startSignalCharakter;
		startSignalCharakter = newStartSignalCharakter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, oldStartSignalCharakter, newStartSignalCharakter);
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
	public void setStartSignalCharakter(Start_Signal_Charakter_TypeClass newStartSignalCharakter) {
		if (newStartSignalCharakter != startSignalCharakter) {
			NotificationChain msgs = null;
			if (startSignalCharakter != null)
				msgs = ((InternalEObject)startSignalCharakter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, null, msgs);
			if (newStartSignalCharakter != null)
				msgs = ((InternalEObject)newStartSignalCharakter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, null, msgs);
			msgs = basicSetStartSignalCharakter(newStartSignalCharakter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER, newStartSignalCharakter, newStartSignalCharakter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				return basicSetFstrVHg(null, msgs);
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				return basicSetStartSignalCharakter(null, msgs);
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				return getFstrVHg();
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				if (resolve) return getIDStart();
				return basicGetIDStart();
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				if (resolve) return getIDZiel();
				return basicGetIDZiel();
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				return getStartSignalCharakter();
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				setFstrVHg((Fstr_V_Hg_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				setIDStart((Signal)newValue);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				setIDZiel((Basis_Objekt)newValue);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				setStartSignalCharakter((Start_Signal_Charakter_TypeClass)newValue);
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				setFstrVHg((Fstr_V_Hg_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				unsetIDStart();
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				unsetIDZiel();
				return;
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				setStartSignalCharakter((Start_Signal_Charakter_TypeClass)null);
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
			case FahrstrassePackage.FSTR_FAHRWEG__FSTR_VHG:
				return fstrVHg != null;
			case FahrstrassePackage.FSTR_FAHRWEG__ID_START:
				return isSetIDStart();
			case FahrstrassePackage.FSTR_FAHRWEG__ID_ZIEL:
				return isSetIDZiel();
			case FahrstrassePackage.FSTR_FAHRWEG__START_SIGNAL_CHARAKTER:
				return startSignalCharakter != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_FahrwegImpl
