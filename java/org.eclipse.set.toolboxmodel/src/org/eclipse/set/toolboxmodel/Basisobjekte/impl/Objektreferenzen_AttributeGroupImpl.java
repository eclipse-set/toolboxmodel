/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.DB_GDI_Referenz_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Objektreferenzen_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Technischer_Platz_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objektreferenzen Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Objektreferenzen_AttributeGroupImpl#getDBGDIReferenz <em>DBGDI Referenz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Objektreferenzen_AttributeGroupImpl#getTechnischerPlatz <em>Technischer Platz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Objektreferenzen_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Objektreferenzen_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDBGDIReferenz() <em>DBGDI Referenz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDBGDIReferenz()
	 * @generated
	 * @ordered
	 */
	protected DB_GDI_Referenz_TypeClass dBGDIReferenz;

	/**
	 * The cached value of the '{@link #getTechnischerPlatz() <em>Technischer Platz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnischerPlatz()
	 * @generated
	 * @ordered
	 */
	protected Technischer_Platz_TypeClass technischerPlatz;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Objektreferenzen_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.OBJEKTREFERENZEN_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DB_GDI_Referenz_TypeClass getDBGDIReferenz() {
		return dBGDIReferenz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDBGDIReferenz(DB_GDI_Referenz_TypeClass newDBGDIReferenz, NotificationChain msgs) {
		DB_GDI_Referenz_TypeClass oldDBGDIReferenz = dBGDIReferenz;
		dBGDIReferenz = newDBGDIReferenz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ, oldDBGDIReferenz, newDBGDIReferenz);
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
	public void setDBGDIReferenz(DB_GDI_Referenz_TypeClass newDBGDIReferenz) {
		if (newDBGDIReferenz != dBGDIReferenz) {
			NotificationChain msgs = null;
			if (dBGDIReferenz != null)
				msgs = ((InternalEObject)dBGDIReferenz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ, null, msgs);
			if (newDBGDIReferenz != null)
				msgs = ((InternalEObject)newDBGDIReferenz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ, null, msgs);
			msgs = basicSetDBGDIReferenz(newDBGDIReferenz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ, newDBGDIReferenz, newDBGDIReferenz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technischer_Platz_TypeClass getTechnischerPlatz() {
		return technischerPlatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnischerPlatz(Technischer_Platz_TypeClass newTechnischerPlatz, NotificationChain msgs) {
		Technischer_Platz_TypeClass oldTechnischerPlatz = technischerPlatz;
		technischerPlatz = newTechnischerPlatz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ, oldTechnischerPlatz, newTechnischerPlatz);
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
	public void setTechnischerPlatz(Technischer_Platz_TypeClass newTechnischerPlatz) {
		if (newTechnischerPlatz != technischerPlatz) {
			NotificationChain msgs = null;
			if (technischerPlatz != null)
				msgs = ((InternalEObject)technischerPlatz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ, null, msgs);
			if (newTechnischerPlatz != null)
				msgs = ((InternalEObject)newTechnischerPlatz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ, null, msgs);
			msgs = basicSetTechnischerPlatz(newTechnischerPlatz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ, newTechnischerPlatz, newTechnischerPlatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ:
				return basicSetDBGDIReferenz(null, msgs);
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ:
				return basicSetTechnischerPlatz(null, msgs);
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
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ:
				return getDBGDIReferenz();
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ:
				return getTechnischerPlatz();
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
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ:
				setDBGDIReferenz((DB_GDI_Referenz_TypeClass)newValue);
				return;
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ:
				setTechnischerPlatz((Technischer_Platz_TypeClass)newValue);
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
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ:
				setDBGDIReferenz((DB_GDI_Referenz_TypeClass)null);
				return;
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ:
				setTechnischerPlatz((Technischer_Platz_TypeClass)null);
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
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__DBGDI_REFERENZ:
				return dBGDIReferenz != null;
			case BasisobjektePackage.OBJEKTREFERENZEN_ATTRIBUTE_GROUP__TECHNISCHER_PLATZ:
				return technischerPlatz != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Objektreferenzen_AttributeGroupImpl
