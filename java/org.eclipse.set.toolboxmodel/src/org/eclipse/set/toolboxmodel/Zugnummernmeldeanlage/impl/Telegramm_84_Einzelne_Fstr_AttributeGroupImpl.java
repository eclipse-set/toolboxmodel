/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Telegramm_84_Einzelne_Fstr_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telegramm 84 Einzelne Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.Telegramm_84_Einzelne_Fstr_AttributeGroupImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.Telegramm_84_Einzelne_Fstr_AttributeGroupImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Telegramm_84_Einzelne_Fstr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Telegramm_84_Einzelne_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrZugRangier;

	/**
	 * This is true if the ID Fstr Zug Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrZugRangierESet;

	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus iDZLVBus;

	/**
	 * This is true if the IDZLV Bus reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLVBusESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Telegramm_84_Einzelne_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrZugRangier() {
		if (iDFstrZugRangier != null && iDFstrZugRangier.eIsProxy()) {
			InternalEObject oldIDFstrZugRangier = (InternalEObject)iDFstrZugRangier;
			iDFstrZugRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrZugRangier);
			if (iDFstrZugRangier != oldIDFstrZugRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
			}
		}
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrZugRangier(Fstr_Zug_Rangier newIDFstrZugRangier) {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrZugRangier() {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangier = null;
		iDFstrZugRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrZugRangier() {
		return iDFstrZugRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus getIDZLVBus() {
		if (iDZLVBus != null && iDZLVBus.eIsProxy()) {
			InternalEObject oldIDZLVBus = (InternalEObject)iDZLVBus;
			iDZLVBus = (ZLV_Bus)eResolveProxy(oldIDZLVBus);
			if (iDZLVBus != oldIDZLVBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, iDZLVBus));
			}
		}
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLV_Bus basicGetIDZLVBus() {
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLVBus(ZLV_Bus newIDZLVBus) {
		ZLV_Bus oldIDZLVBus = iDZLVBus;
		iDZLVBus = newIDZLVBus;
		boolean oldIDZLVBusESet = iDZLVBusESet;
		iDZLVBusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, iDZLVBus, !oldIDZLVBusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLVBus() {
		ZLV_Bus oldIDZLVBus = iDZLVBus;
		boolean oldIDZLVBusESet = iDZLVBusESet;
		iDZLVBus = null;
		iDZLVBusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, null, oldIDZLVBusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLVBus() {
		return iDZLVBusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				if (resolve) return getIDFstrZugRangier();
				return basicGetIDFstrZugRangier();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				if (resolve) return getIDZLVBus();
				return basicGetIDZLVBus();
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((Fstr_Zug_Rangier)newValue);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ZLV_Bus)newValue);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				unsetIDFstrZugRangier();
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				unsetIDZLVBus();
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_EINZELNE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return isSetIDZLVBus();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Telegramm_84_Einzelne_Fstr_AttributeGroupImpl
