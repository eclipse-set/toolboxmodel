/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;
import org.eclipse.set.toolboxmodel.Signale.Signal_Fank_Zuordnung;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fank Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fank_ZuordnungImpl#getIDSignalFank <em>ID Signal Fank</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fank_ZuordnungImpl#getIDSignalStart <em>ID Signal Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fank_ZuordnungImpl extends Basis_ObjektImpl implements Signal_Fank_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDSignalFank() <em>ID Signal Fank</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalFank()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> iDSignalFank;

	/**
	 * The cached value of the '{@link #getIDSignalStart() <em>ID Signal Start</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalStart()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> iDSignalStart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fank_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FANK_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal> getIDSignalFank() {
		if (iDSignalFank == null) {
			iDSignalFank = new EObjectResolvingEList<Signal>(Signal.class, this, SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK);
		}
		return iDSignalFank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal> getIDSignalStart() {
		if (iDSignalStart == null) {
			iDSignalStart = new EObjectResolvingEList<Signal>(Signal.class, this, SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START);
		}
		return iDSignalStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				return getIDSignalFank();
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				return getIDSignalStart();
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
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				getIDSignalFank().clear();
				getIDSignalFank().addAll((Collection<? extends Signal>)newValue);
				return;
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				getIDSignalStart().clear();
				getIDSignalStart().addAll((Collection<? extends Signal>)newValue);
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
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				getIDSignalFank().clear();
				return;
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				getIDSignalStart().clear();
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
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_FANK:
				return iDSignalFank != null && !iDSignalFank.isEmpty();
			case SignalePackage.SIGNAL_FANK_ZUORDNUNG__ID_SIGNAL_START:
				return iDSignalStart != null && !iDSignalStart.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_Fank_ZuordnungImpl
