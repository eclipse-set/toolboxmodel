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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

import org.eclipse.set.toolboxmodel.PZB.INA_Gefahrstelle_AttributeGroup;
import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.Prioritaet_Gefahrstelle_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INA Gefahrstelle Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.INA_Gefahrstelle_AttributeGroupImpl#getPrioritaetGefahrstelle <em>Prioritaet Gefahrstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INA_Gefahrstelle_AttributeGroupImpl extends MinimalEObjectImpl.Container implements INA_Gefahrstelle_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDMarkanterPunkt() <em>ID Markanter Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDMarkanterPunkt;

	/**
	 * This is true if the ID Markanter Punkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDMarkanterPunktESet;

	/**
	 * The cached value of the '{@link #getPrioritaetGefahrstelle() <em>Prioritaet Gefahrstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritaetGefahrstelle()
	 * @generated
	 * @ordered
	 */
	protected Prioritaet_Gefahrstelle_TypeClass prioritaetGefahrstelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected INA_Gefahrstelle_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDMarkanterPunkt() {
		if (iDMarkanterPunkt != null && iDMarkanterPunkt.eIsProxy()) {
			InternalEObject oldIDMarkanterPunkt = (InternalEObject)iDMarkanterPunkt;
			iDMarkanterPunkt = (Markanter_Punkt)eResolveProxy(oldIDMarkanterPunkt);
			if (iDMarkanterPunkt != oldIDMarkanterPunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, iDMarkanterPunkt));
			}
		}
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDMarkanterPunkt() {
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDMarkanterPunkt(Markanter_Punkt newIDMarkanterPunkt) {
		Markanter_Punkt oldIDMarkanterPunkt = iDMarkanterPunkt;
		iDMarkanterPunkt = newIDMarkanterPunkt;
		boolean oldIDMarkanterPunktESet = iDMarkanterPunktESet;
		iDMarkanterPunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, iDMarkanterPunkt, !oldIDMarkanterPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDMarkanterPunkt() {
		Markanter_Punkt oldIDMarkanterPunkt = iDMarkanterPunkt;
		boolean oldIDMarkanterPunktESet = iDMarkanterPunktESet;
		iDMarkanterPunkt = null;
		iDMarkanterPunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, null, oldIDMarkanterPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDMarkanterPunkt() {
		return iDMarkanterPunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_Gefahrstelle_TypeClass getPrioritaetGefahrstelle() {
		return prioritaetGefahrstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritaetGefahrstelle(Prioritaet_Gefahrstelle_TypeClass newPrioritaetGefahrstelle, NotificationChain msgs) {
		Prioritaet_Gefahrstelle_TypeClass oldPrioritaetGefahrstelle = prioritaetGefahrstelle;
		prioritaetGefahrstelle = newPrioritaetGefahrstelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, oldPrioritaetGefahrstelle, newPrioritaetGefahrstelle);
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
	public void setPrioritaetGefahrstelle(Prioritaet_Gefahrstelle_TypeClass newPrioritaetGefahrstelle) {
		if (newPrioritaetGefahrstelle != prioritaetGefahrstelle) {
			NotificationChain msgs = null;
			if (prioritaetGefahrstelle != null)
				msgs = ((InternalEObject)prioritaetGefahrstelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, null, msgs);
			if (newPrioritaetGefahrstelle != null)
				msgs = ((InternalEObject)newPrioritaetGefahrstelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, null, msgs);
			msgs = basicSetPrioritaetGefahrstelle(newPrioritaetGefahrstelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE, newPrioritaetGefahrstelle, newPrioritaetGefahrstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				return basicSetPrioritaetGefahrstelle(null, msgs);
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				if (resolve) return getIDMarkanterPunkt();
				return basicGetIDMarkanterPunkt();
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				return getPrioritaetGefahrstelle();
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((Markanter_Punkt)newValue);
				return;
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				setPrioritaetGefahrstelle((Prioritaet_Gefahrstelle_TypeClass)newValue);
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				unsetIDMarkanterPunkt();
				return;
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				setPrioritaetGefahrstelle((Prioritaet_Gefahrstelle_TypeClass)null);
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
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return isSetIDMarkanterPunkt();
			case PZBPackage.INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE:
				return prioritaetGefahrstelle != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //INA_Gefahrstelle_AttributeGroupImpl
