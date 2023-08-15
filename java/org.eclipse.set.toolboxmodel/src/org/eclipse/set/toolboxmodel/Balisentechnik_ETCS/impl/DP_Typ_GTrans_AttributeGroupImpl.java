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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_GTrans_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_Trans_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GTrans Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Typ_GTrans_AttributeGroupImpl#getDPTypTrans <em>DP Typ Trans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GTrans_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Typ_GTrans_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPTypTrans() <em>DP Typ Trans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypTrans()
	 * @generated
	 * @ordered
	 */
	protected DP_Typ_Trans_TypeClass dPTypTrans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GTrans_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GTrans_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Typ_Trans_TypeClass getDPTypTrans() {
		return dPTypTrans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPTypTrans(DP_Typ_Trans_TypeClass newDPTypTrans, NotificationChain msgs) {
		DP_Typ_Trans_TypeClass oldDPTypTrans = dPTypTrans;
		dPTypTrans = newDPTypTrans;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS, oldDPTypTrans, newDPTypTrans);
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
	public void setDPTypTrans(DP_Typ_Trans_TypeClass newDPTypTrans) {
		if (newDPTypTrans != dPTypTrans) {
			NotificationChain msgs = null;
			if (dPTypTrans != null)
				msgs = ((InternalEObject)dPTypTrans).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS, null, msgs);
			if (newDPTypTrans != null)
				msgs = ((InternalEObject)newDPTypTrans).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS, null, msgs);
			msgs = basicSetDPTypTrans(newDPTypTrans, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS, newDPTypTrans, newDPTypTrans));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS:
				return basicSetDPTypTrans(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS:
				return getDPTypTrans();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS:
				setDPTypTrans((DP_Typ_Trans_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS:
				setDPTypTrans((DP_Typ_Trans_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GTRANS_ATTRIBUTE_GROUP__DP_TYP_TRANS:
				return dPTypTrans != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_Typ_GTrans_AttributeGroupImpl
