/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PZB.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Zuordnung Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Zuordnung_SignalImpl#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Zuordnung_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Zuordnung_SignalImpl extends Basis_ObjektImpl implements PZB_Zuordnung_Signal {
	/**
	 * The cached value of the '{@link #getIDPZBElementZuordnung() <em>IDPZB Element Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_Zuordnung iDPZBElementZuordnung;

	/**
	 * This is true if the IDPZB Element Zuordnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDPZBElementZuordnungESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Zuordnung_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ZUORDNUNG_SIGNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung getIDPZBElementZuordnung() {
		if (iDPZBElementZuordnung != null && iDPZBElementZuordnung.eIsProxy()) {
			InternalEObject oldIDPZBElementZuordnung = (InternalEObject)iDPZBElementZuordnung;
			iDPZBElementZuordnung = (PZB_Element_Zuordnung)eResolveProxy(oldIDPZBElementZuordnung);
			if (iDPZBElementZuordnung != oldIDPZBElementZuordnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, iDPZBElementZuordnung));
			}
		}
		return iDPZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZB_Element_Zuordnung basicGetIDPZBElementZuordnung() {
		return iDPZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDPZBElementZuordnung(PZB_Element_Zuordnung newIDPZBElementZuordnung) {
		PZB_Element_Zuordnung oldIDPZBElementZuordnung = iDPZBElementZuordnung;
		iDPZBElementZuordnung = newIDPZBElementZuordnung;
		boolean oldIDPZBElementZuordnungESet = iDPZBElementZuordnungESet;
		iDPZBElementZuordnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, iDPZBElementZuordnung, !oldIDPZBElementZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDPZBElementZuordnung() {
		PZB_Element_Zuordnung oldIDPZBElementZuordnung = iDPZBElementZuordnung;
		boolean oldIDPZBElementZuordnungESet = iDPZBElementZuordnungESet;
		iDPZBElementZuordnung = null;
		iDPZBElementZuordnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, null, oldIDPZBElementZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDPZBElementZuordnung() {
		return iDPZBElementZuordnungESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, oldIDSignal, iDSignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				if (resolve) return getIDPZBElementZuordnung();
				return basicGetIDPZBElementZuordnung();
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				setIDPZBElementZuordnung((PZB_Element_Zuordnung)newValue);
				return;
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				setIDSignal((Signal)newValue);
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				unsetIDPZBElementZuordnung();
				return;
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				unsetIDSignal();
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
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG:
				return isSetIDPZBElementZuordnung();
			case PZBPackage.PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL:
				return isSetIDSignal();
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Zuordnung_SignalImpl
