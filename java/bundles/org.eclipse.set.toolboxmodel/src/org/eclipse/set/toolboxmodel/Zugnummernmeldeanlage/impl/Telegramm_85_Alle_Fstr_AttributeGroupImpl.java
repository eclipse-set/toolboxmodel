/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Telegramm_85_Alle_Fstr_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Telegramm_85_Fuer_Alle_Fstr_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telegramm 85 Alle Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.Telegramm_85_Alle_Fstr_AttributeGroupImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.Telegramm_85_Alle_Fstr_AttributeGroupImpl#getTelegramm85FuerAlleFstr <em>Telegramm85 Fuer Alle Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Telegramm_85_Alle_Fstr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Telegramm_85_Alle_Fstr_AttributeGroup {
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
	 * The cached value of the '{@link #getTelegramm85FuerAlleFstr() <em>Telegramm85 Fuer Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm85FuerAlleFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_85_Fuer_Alle_Fstr_TypeClass telegramm85FuerAlleFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Telegramm_85_Alle_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, iDZLVBus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, iDZLVBus, !oldIDZLVBusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, null, oldIDZLVBusESet));
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
	public Telegramm_85_Fuer_Alle_Fstr_TypeClass getTelegramm85FuerAlleFstr() {
		return telegramm85FuerAlleFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm85FuerAlleFstr(Telegramm_85_Fuer_Alle_Fstr_TypeClass newTelegramm85FuerAlleFstr, NotificationChain msgs) {
		Telegramm_85_Fuer_Alle_Fstr_TypeClass oldTelegramm85FuerAlleFstr = telegramm85FuerAlleFstr;
		telegramm85FuerAlleFstr = newTelegramm85FuerAlleFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, oldTelegramm85FuerAlleFstr, newTelegramm85FuerAlleFstr);
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
	public void setTelegramm85FuerAlleFstr(Telegramm_85_Fuer_Alle_Fstr_TypeClass newTelegramm85FuerAlleFstr) {
		if (newTelegramm85FuerAlleFstr != telegramm85FuerAlleFstr) {
			NotificationChain msgs = null;
			if (telegramm85FuerAlleFstr != null)
				msgs = ((InternalEObject)telegramm85FuerAlleFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, null, msgs);
			if (newTelegramm85FuerAlleFstr != null)
				msgs = ((InternalEObject)newTelegramm85FuerAlleFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, null, msgs);
			msgs = basicSetTelegramm85FuerAlleFstr(newTelegramm85FuerAlleFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR, newTelegramm85FuerAlleFstr, newTelegramm85FuerAlleFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				return basicSetTelegramm85FuerAlleFstr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				if (resolve) return getIDZLVBus();
				return basicGetIDZLVBus();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				return getTelegramm85FuerAlleFstr();
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ZLV_Bus)newValue);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				setTelegramm85FuerAlleFstr((Telegramm_85_Fuer_Alle_Fstr_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				unsetIDZLVBus();
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				setTelegramm85FuerAlleFstr((Telegramm_85_Fuer_Alle_Fstr_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return isSetIDZLVBus();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_85_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM85_FUER_ALLE_FSTR:
				return telegramm85FuerAlleFstr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Telegramm_85_Alle_Fstr_AttributeGroupImpl
