/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Bezug Funktional Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Bezug_Funktional_AttributeGroupImpl#getDPBezugFunktionalArt <em>DP Bezug Funktional Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Bezug_Funktional_AttributeGroupImpl#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Bezug_Funktional_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Bezug_Funktional_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPBezugFunktionalArt() <em>DP Bezug Funktional Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPBezugFunktionalArt()
	 * @generated
	 * @ordered
	 */
	protected DP_Bezug_Funktional_Art_TypeClass dPBezugFunktionalArt;

	/**
	 * The cached value of the '{@link #getIDDPBezugFunktional() <em>IDDP Bezug Funktional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDPBezugFunktional()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDDPBezugFunktional;

	/**
	 * This is true if the IDDP Bezug Funktional reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDDPBezugFunktionalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Bezug_Funktional_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Bezug_Funktional_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Bezug_Funktional_Art_TypeClass getDPBezugFunktionalArt() {
		return dPBezugFunktionalArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPBezugFunktionalArt(DP_Bezug_Funktional_Art_TypeClass newDPBezugFunktionalArt, NotificationChain msgs) {
		DP_Bezug_Funktional_Art_TypeClass oldDPBezugFunktionalArt = dPBezugFunktionalArt;
		dPBezugFunktionalArt = newDPBezugFunktionalArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART, oldDPBezugFunktionalArt, newDPBezugFunktionalArt);
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
	public void setDPBezugFunktionalArt(DP_Bezug_Funktional_Art_TypeClass newDPBezugFunktionalArt) {
		if (newDPBezugFunktionalArt != dPBezugFunktionalArt) {
			NotificationChain msgs = null;
			if (dPBezugFunktionalArt != null)
				msgs = ((InternalEObject)dPBezugFunktionalArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART, null, msgs);
			if (newDPBezugFunktionalArt != null)
				msgs = ((InternalEObject)newDPBezugFunktionalArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART, null, msgs);
			msgs = basicSetDPBezugFunktionalArt(newDPBezugFunktionalArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART, newDPBezugFunktionalArt, newDPBezugFunktionalArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDDPBezugFunktional() {
		if (iDDPBezugFunktional != null && iDDPBezugFunktional.eIsProxy()) {
			InternalEObject oldIDDPBezugFunktional = (InternalEObject)iDDPBezugFunktional;
			iDDPBezugFunktional = (Basis_Objekt)eResolveProxy(oldIDDPBezugFunktional);
			if (iDDPBezugFunktional != oldIDDPBezugFunktional) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, oldIDDPBezugFunktional, iDDPBezugFunktional));
			}
		}
		return iDDPBezugFunktional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDDPBezugFunktional() {
		return iDDPBezugFunktional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDDPBezugFunktional(Basis_Objekt newIDDPBezugFunktional) {
		Basis_Objekt oldIDDPBezugFunktional = iDDPBezugFunktional;
		iDDPBezugFunktional = newIDDPBezugFunktional;
		boolean oldIDDPBezugFunktionalESet = iDDPBezugFunktionalESet;
		iDDPBezugFunktionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, oldIDDPBezugFunktional, iDDPBezugFunktional, !oldIDDPBezugFunktionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDDPBezugFunktional() {
		Basis_Objekt oldIDDPBezugFunktional = iDDPBezugFunktional;
		boolean oldIDDPBezugFunktionalESet = iDDPBezugFunktionalESet;
		iDDPBezugFunktional = null;
		iDDPBezugFunktionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL, oldIDDPBezugFunktional, null, oldIDDPBezugFunktionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDDPBezugFunktional() {
		return iDDPBezugFunktionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART:
				return basicSetDPBezugFunktionalArt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART:
				return getDPBezugFunktionalArt();
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				if (resolve) return getIDDPBezugFunktional();
				return basicGetIDDPBezugFunktional();
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART:
				setDPBezugFunktionalArt((DP_Bezug_Funktional_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				setIDDPBezugFunktional((Basis_Objekt)newValue);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART:
				setDPBezugFunktionalArt((DP_Bezug_Funktional_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				unsetIDDPBezugFunktional();
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__DP_BEZUG_FUNKTIONAL_ART:
				return dPBezugFunktionalArt != null;
			case Balisentechnik_ETCSPackage.DP_BEZUG_FUNKTIONAL_ATTRIBUTE_GROUP__IDDP_BEZUG_FUNKTIONAL:
				return isSetIDDPBezugFunktional();
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_Bezug_Funktional_AttributeGroupImpl
