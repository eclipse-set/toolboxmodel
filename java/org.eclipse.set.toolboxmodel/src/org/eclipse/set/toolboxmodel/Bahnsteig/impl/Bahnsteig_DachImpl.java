/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Dach;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Dach</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.impl.Bahnsteig_DachImpl#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_DachImpl extends Bereich_ObjektImpl implements Bahnsteig_Dach {
	/**
	 * The cached value of the '{@link #getIDBahnsteigKante() <em>ID Bahnsteig Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigKante()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Kante iDBahnsteigKante;

	/**
	 * This is true if the ID Bahnsteig Kante reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBahnsteigKanteESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_DachImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_DACH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante getIDBahnsteigKante() {
		if (iDBahnsteigKante != null && iDBahnsteigKante.eIsProxy()) {
			InternalEObject oldIDBahnsteigKante = (InternalEObject)iDBahnsteigKante;
			iDBahnsteigKante = (Bahnsteig_Kante)eResolveProxy(oldIDBahnsteigKante);
			if (iDBahnsteigKante != oldIDBahnsteigKante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, iDBahnsteigKante));
			}
		}
		return iDBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bahnsteig_Kante basicGetIDBahnsteigKante() {
		return iDBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBahnsteigKante(Bahnsteig_Kante newIDBahnsteigKante) {
		Bahnsteig_Kante oldIDBahnsteigKante = iDBahnsteigKante;
		iDBahnsteigKante = newIDBahnsteigKante;
		boolean oldIDBahnsteigKanteESet = iDBahnsteigKanteESet;
		iDBahnsteigKanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, iDBahnsteigKante, !oldIDBahnsteigKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBahnsteigKante() {
		Bahnsteig_Kante oldIDBahnsteigKante = iDBahnsteigKante;
		boolean oldIDBahnsteigKanteESet = iDBahnsteigKanteESet;
		iDBahnsteigKante = null;
		iDBahnsteigKanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, null, oldIDBahnsteigKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBahnsteigKante() {
		return iDBahnsteigKanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				if (resolve) return getIDBahnsteigKante();
				return basicGetIDBahnsteigKante();
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((Bahnsteig_Kante)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				unsetIDBahnsteigKante();
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
			case BahnsteigPackage.BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE:
				return isSetIDBahnsteigKante();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bahnsteig_DachImpl
