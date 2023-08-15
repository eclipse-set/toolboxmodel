/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bgrenze RBC Wechsel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl#getBgrenzeRBCWechselBTSKette <em>Bgrenze RBC Wechsel BTS Kette</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bgrenze_RBC_Wechsel_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBgrenzeRBCWechselBTSKette() <em>Bgrenze RBC Wechsel BTS Kette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeRBCWechselBTSKette()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup> bgrenzeRBCWechselBTSKette;

	/**
	 * The cached value of the '{@link #getIDRBCNachGrenze() <em>IDRBC Nach Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 * @ordered
	 */
	protected RBC iDRBCNachGrenze;

	/**
	 * This is true if the IDRBC Nach Grenze reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRBCNachGrenzeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bgrenze_RBC_Wechsel_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup> getBgrenzeRBCWechselBTSKette() {
		if (bgrenzeRBCWechselBTSKette == null) {
			bgrenzeRBCWechselBTSKette = new EObjectContainmentEList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup>(Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE);
		}
		return bgrenzeRBCWechselBTSKette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC getIDRBCNachGrenze() {
		if (iDRBCNachGrenze != null && iDRBCNachGrenze.eIsProxy()) {
			InternalEObject oldIDRBCNachGrenze = (InternalEObject)iDRBCNachGrenze;
			iDRBCNachGrenze = (RBC)eResolveProxy(oldIDRBCNachGrenze);
			if (iDRBCNachGrenze != oldIDRBCNachGrenze) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, iDRBCNachGrenze));
			}
		}
		return iDRBCNachGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBC basicGetIDRBCNachGrenze() {
		return iDRBCNachGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRBCNachGrenze(RBC newIDRBCNachGrenze) {
		RBC oldIDRBCNachGrenze = iDRBCNachGrenze;
		iDRBCNachGrenze = newIDRBCNachGrenze;
		boolean oldIDRBCNachGrenzeESet = iDRBCNachGrenzeESet;
		iDRBCNachGrenzeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, iDRBCNachGrenze, !oldIDRBCNachGrenzeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRBCNachGrenze() {
		RBC oldIDRBCNachGrenze = iDRBCNachGrenze;
		boolean oldIDRBCNachGrenzeESet = iDRBCNachGrenzeESet;
		iDRBCNachGrenze = null;
		iDRBCNachGrenzeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, null, oldIDRBCNachGrenzeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRBCNachGrenze() {
		return iDRBCNachGrenzeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				return ((InternalEList<?>)getBgrenzeRBCWechselBTSKette()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				return getBgrenzeRBCWechselBTSKette();
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				if (resolve) return getIDRBCNachGrenze();
				return basicGetIDRBCNachGrenze();
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				getBgrenzeRBCWechselBTSKette().clear();
				getBgrenzeRBCWechselBTSKette().addAll((Collection<? extends Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				setIDRBCNachGrenze((RBC)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				getBgrenzeRBCWechselBTSKette().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				unsetIDRBCNachGrenze();
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
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__BGRENZE_RBC_WECHSEL_BTS_KETTE:
				return bgrenzeRBCWechselBTSKette != null && !bgrenzeRBCWechselBTSKette.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BGRENZE_RBC_WECHSEL_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return isSetIDRBCNachGrenze();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bgrenze_RBC_Wechsel_AttributeGroupImpl
