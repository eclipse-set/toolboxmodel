/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weichenlaufkette Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weichenlaufkette_ZuordnungImpl#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Weichenlaufkette_ZuordnungImpl extends Basis_ObjektImpl implements Weichenlaufkette_Zuordnung {
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
	 * The cached value of the '{@link #getIDWeichenlaufkette() <em>ID Weichenlaufkette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWeichenlaufkette()
	 * @generated
	 * @ordered
	 */
	protected Weichenlaufkette iDWeichenlaufkette;

	/**
	 * This is true if the ID Weichenlaufkette reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWeichenlaufketteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weichenlaufkette_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WEICHENLAUFKETTE_ZUORDNUNG;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, iDSignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
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
	public Weichenlaufkette getIDWeichenlaufkette() {
		if (iDWeichenlaufkette != null && iDWeichenlaufkette.eIsProxy()) {
			InternalEObject oldIDWeichenlaufkette = (InternalEObject)iDWeichenlaufkette;
			iDWeichenlaufkette = (Weichenlaufkette)eResolveProxy(oldIDWeichenlaufkette);
			if (iDWeichenlaufkette != oldIDWeichenlaufkette) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, iDWeichenlaufkette));
			}
		}
		return iDWeichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichenlaufkette basicGetIDWeichenlaufkette() {
		return iDWeichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWeichenlaufkette(Weichenlaufkette newIDWeichenlaufkette) {
		Weichenlaufkette oldIDWeichenlaufkette = iDWeichenlaufkette;
		iDWeichenlaufkette = newIDWeichenlaufkette;
		boolean oldIDWeichenlaufketteESet = iDWeichenlaufketteESet;
		iDWeichenlaufketteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, iDWeichenlaufkette, !oldIDWeichenlaufketteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWeichenlaufkette() {
		Weichenlaufkette oldIDWeichenlaufkette = iDWeichenlaufkette;
		boolean oldIDWeichenlaufketteESet = iDWeichenlaufketteESet;
		iDWeichenlaufkette = null;
		iDWeichenlaufketteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, null, oldIDWeichenlaufketteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWeichenlaufkette() {
		return iDWeichenlaufketteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				if (resolve) return getIDWeichenlaufkette();
				return basicGetIDWeichenlaufkette();
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				setIDWeichenlaufkette((Weichenlaufkette)newValue);
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				unsetIDSignal();
				return;
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				unsetIDWeichenlaufkette();
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
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_SIGNAL:
				return isSetIDSignal();
			case Weichen_und_GleissperrenPackage.WEICHENLAUFKETTE_ZUORDNUNG__ID_WEICHENLAUFKETTE:
				return isSetIDWeichenlaufkette();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Weichenlaufkette_ZuordnungImpl
