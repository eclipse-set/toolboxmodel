/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Layoutinformationen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan;
import org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand;
import org.eclipse.set.toolboxmodel.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.toolboxmodel.Layoutinformationen.Referenz_LST_Zustand_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lageplan Zustand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.impl.Lageplan_ZustandImpl#getIDLageplan <em>ID Lageplan</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.impl.Lageplan_ZustandImpl#getReferenzLSTZustand <em>Referenz LST Zustand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Lageplan_ZustandImpl extends Ur_ObjektImpl implements Lageplan_Zustand {
	/**
	 * The cached value of the '{@link #getIDLageplan() <em>ID Lageplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLageplan()
	 * @generated
	 * @ordered
	 */
	protected Lageplan iDLageplan;

	/**
	 * This is true if the ID Lageplan reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDLageplanESet;

	/**
	 * The cached value of the '{@link #getReferenzLSTZustand() <em>Referenz LST Zustand</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenzLSTZustand()
	 * @generated
	 * @ordered
	 */
	protected EList<Referenz_LST_Zustand_TypeClass> referenzLSTZustand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Lageplan_ZustandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.LAGEPLAN_ZUSTAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lageplan getIDLageplan() {
		if (iDLageplan != null && iDLageplan.eIsProxy()) {
			InternalEObject oldIDLageplan = (InternalEObject)iDLageplan;
			iDLageplan = (Lageplan)eResolveProxy(oldIDLageplan);
			if (iDLageplan != oldIDLageplan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, oldIDLageplan, iDLageplan));
			}
		}
		return iDLageplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lageplan basicGetIDLageplan() {
		return iDLageplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDLageplan(Lageplan newIDLageplan) {
		Lageplan oldIDLageplan = iDLageplan;
		iDLageplan = newIDLageplan;
		boolean oldIDLageplanESet = iDLageplanESet;
		iDLageplanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, oldIDLageplan, iDLageplan, !oldIDLageplanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDLageplan() {
		Lageplan oldIDLageplan = iDLageplan;
		boolean oldIDLageplanESet = iDLageplanESet;
		iDLageplan = null;
		iDLageplanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN, oldIDLageplan, null, oldIDLageplanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDLageplan() {
		return iDLageplanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Referenz_LST_Zustand_TypeClass> getReferenzLSTZustand() {
		if (referenzLSTZustand == null) {
			referenzLSTZustand = new EObjectContainmentEList<Referenz_LST_Zustand_TypeClass>(Referenz_LST_Zustand_TypeClass.class, this, LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND);
		}
		return referenzLSTZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				return ((InternalEList<?>)getReferenzLSTZustand()).basicRemove(otherEnd, msgs);
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				if (resolve) return getIDLageplan();
				return basicGetIDLageplan();
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				return getReferenzLSTZustand();
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				setIDLageplan((Lageplan)newValue);
				return;
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				getReferenzLSTZustand().clear();
				getReferenzLSTZustand().addAll((Collection<? extends Referenz_LST_Zustand_TypeClass>)newValue);
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				unsetIDLageplan();
				return;
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				getReferenzLSTZustand().clear();
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
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__ID_LAGEPLAN:
				return isSetIDLageplan();
			case LayoutinformationenPackage.LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND:
				return referenzLSTZustand != null && !referenzLSTZustand.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Lageplan_ZustandImpl
