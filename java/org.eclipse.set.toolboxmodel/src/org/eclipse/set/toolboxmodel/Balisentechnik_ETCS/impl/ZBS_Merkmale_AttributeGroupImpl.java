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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Link_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Reaktion_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZBS_Merkmale_AttributeGroupImpl#getDPLinkArt <em>DP Link Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZBS_Merkmale_AttributeGroupImpl#getZBSReaktion <em>ZBS Reaktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_Merkmale_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZBS_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPLinkArt() <em>DP Link Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPLinkArt()
	 * @generated
	 * @ordered
	 */
	protected DP_Link_Art_TypeClass dPLinkArt;

	/**
	 * The cached value of the '{@link #getZBSReaktion() <em>ZBS Reaktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSReaktion()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Reaktion_TypeClass zBSReaktion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Link_Art_TypeClass getDPLinkArt() {
		return dPLinkArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPLinkArt(DP_Link_Art_TypeClass newDPLinkArt, NotificationChain msgs) {
		DP_Link_Art_TypeClass oldDPLinkArt = dPLinkArt;
		dPLinkArt = newDPLinkArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART, oldDPLinkArt, newDPLinkArt);
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
	public void setDPLinkArt(DP_Link_Art_TypeClass newDPLinkArt) {
		if (newDPLinkArt != dPLinkArt) {
			NotificationChain msgs = null;
			if (dPLinkArt != null)
				msgs = ((InternalEObject)dPLinkArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART, null, msgs);
			if (newDPLinkArt != null)
				msgs = ((InternalEObject)newDPLinkArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART, null, msgs);
			msgs = basicSetDPLinkArt(newDPLinkArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART, newDPLinkArt, newDPLinkArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Reaktion_TypeClass getZBSReaktion() {
		return zBSReaktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSReaktion(ZBS_Reaktion_TypeClass newZBSReaktion, NotificationChain msgs) {
		ZBS_Reaktion_TypeClass oldZBSReaktion = zBSReaktion;
		zBSReaktion = newZBSReaktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION, oldZBSReaktion, newZBSReaktion);
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
	public void setZBSReaktion(ZBS_Reaktion_TypeClass newZBSReaktion) {
		if (newZBSReaktion != zBSReaktion) {
			NotificationChain msgs = null;
			if (zBSReaktion != null)
				msgs = ((InternalEObject)zBSReaktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION, null, msgs);
			if (newZBSReaktion != null)
				msgs = ((InternalEObject)newZBSReaktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION, null, msgs);
			msgs = basicSetZBSReaktion(newZBSReaktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION, newZBSReaktion, newZBSReaktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART:
				return basicSetDPLinkArt(null, msgs);
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION:
				return basicSetZBSReaktion(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART:
				return getDPLinkArt();
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION:
				return getZBSReaktion();
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
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART:
				setDPLinkArt((DP_Link_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION:
				setZBSReaktion((ZBS_Reaktion_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART:
				setDPLinkArt((DP_Link_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION:
				setZBSReaktion((ZBS_Reaktion_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__DP_LINK_ART:
				return dPLinkArt != null;
			case Balisentechnik_ETCSPackage.ZBS_MERKMALE_ATTRIBUTE_GROUP__ZBS_REAKTION:
				return zBSReaktion != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZBS_Merkmale_AttributeGroupImpl
