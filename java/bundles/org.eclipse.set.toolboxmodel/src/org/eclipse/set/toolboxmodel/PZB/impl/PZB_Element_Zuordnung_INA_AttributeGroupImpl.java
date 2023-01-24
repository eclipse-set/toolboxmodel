/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PZB.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_INA_AttributeGroupImpl extends MinimalEObjectImpl.Container implements PZB_Element_Zuordnung_INA_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangINA() <em>ID Anhang INA</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangINA()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> iDAnhangINA;

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
	protected PZB_Element_Zuordnung_INA_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getIDAnhangINA() {
		if (iDAnhangINA == null) {
			iDAnhangINA = new EObjectResolvingEList<Anhang>(Anhang.class, this, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA);
		}
		return iDAnhangINA;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, iDBahnsteigKante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, iDBahnsteigKante, !oldIDBahnsteigKanteESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, null, oldIDBahnsteigKanteESet));
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				return getIDAnhangINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				getIDAnhangINA().clear();
				getIDAnhangINA().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				getIDAnhangINA().clear();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				return iDAnhangINA != null && !iDAnhangINA.isEmpty();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return isSetIDBahnsteigKante();
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Element_Zuordnung_INA_AttributeGroupImpl
