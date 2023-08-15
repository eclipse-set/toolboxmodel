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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_GNT_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GGNT Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Typ_GGNT_AttributeGroupImpl#getDPTypGNT <em>DP Typ GNT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GGNT_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Typ_GGNT_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPTypGNT() <em>DP Typ GNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypGNT()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_GNT_TypeClass dPTypGNT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GGNT_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GGNT_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_GNT_TypeClass getDPTypGNT() {
		return dPTypGNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypGNT(DP_Typ_GNT_TypeClass newDPTypGNT, NotificationChain msgs) {
		DP_Typ_GNT_TypeClass oldDPTypGNT = dPTypGNT;
		dPTypGNT = newDPTypGNT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT, oldDPTypGNT, newDPTypGNT);
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
	public void setDPTypGNT(DP_Typ_GNT_TypeClass newDPTypGNT) {
		if (newDPTypGNT != dPTypGNT) {
			NotificationChain msgs = null;
			if (dPTypGNT != null)
				msgs = ((InternalEObject)dPTypGNT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT, null, msgs);
			if (newDPTypGNT != null)
				msgs = ((InternalEObject)newDPTypGNT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT, null, msgs);
			msgs = basicSetDPTypGNT(newDPTypGNT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT, newDPTypGNT, newDPTypGNT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT:
				return basicSetDPTypGNT(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT:
				return getDPTypGNT();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT:
				setDPTypGNT((DP_Typ_GNT_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT:
				setDPTypGNT((DP_Typ_GNT_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GGNT_ATTRIBUTE_GROUP__DP_TYP_GNT:
				return dPTypGNT != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_Typ_GGNT_AttributeGroupImpl
