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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus US Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getZLVBusUSZuordnungTelegramm <em>ZLV Bus US Zuordnung Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZLV_Bus_US_ZuordnungImpl#getZLVBusZuordnungAllg <em>ZLV Bus Zuordnung Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_Bus_US_ZuordnungImpl extends Basis_ObjektImpl implements ZLV_Bus_US_Zuordnung {
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
	 * The cached value of the '{@link #getIDZNUnterstation() <em>IDZN Unterstation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNUnterstation()
	 * @generated
	 * @ordered
	 */
	protected ZN_Unterstation iDZNUnterstation;

	/**
	 * This is true if the IDZN Unterstation reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNUnterstationESet;

	/**
	 * The cached value of the '{@link #getZLVBusUSZuordnungTelegramm() <em>ZLV Bus US Zuordnung Telegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusUSZuordnungTelegramm()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup zLVBusUSZuordnungTelegramm;

	/**
	 * The cached value of the '{@link #getZLVBusZuordnungAllg() <em>ZLV Bus Zuordnung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusZuordnungAllg()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Zuordnung_Allg_AttributeGroup zLVBusZuordnungAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_Bus_US_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS_US_ZUORDNUNG;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, oldIDZLVBus, iDZLVBus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, oldIDZLVBus, iDZLVBus, !oldIDZLVBusESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS, oldIDZLVBus, null, oldIDZLVBusESet));
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
	public ZN_Unterstation getIDZNUnterstation() {
		if (iDZNUnterstation != null && iDZNUnterstation.eIsProxy()) {
			InternalEObject oldIDZNUnterstation = (InternalEObject)iDZNUnterstation;
			iDZNUnterstation = (ZN_Unterstation)eResolveProxy(oldIDZNUnterstation);
			if (iDZNUnterstation != oldIDZNUnterstation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, oldIDZNUnterstation, iDZNUnterstation));
			}
		}
		return iDZNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Unterstation basicGetIDZNUnterstation() {
		return iDZNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNUnterstation(ZN_Unterstation newIDZNUnterstation) {
		ZN_Unterstation oldIDZNUnterstation = iDZNUnterstation;
		iDZNUnterstation = newIDZNUnterstation;
		boolean oldIDZNUnterstationESet = iDZNUnterstationESet;
		iDZNUnterstationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, oldIDZNUnterstation, iDZNUnterstation, !oldIDZNUnterstationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNUnterstation() {
		ZN_Unterstation oldIDZNUnterstation = iDZNUnterstation;
		boolean oldIDZNUnterstationESet = iDZNUnterstationESet;
		iDZNUnterstation = null;
		iDZNUnterstationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION, oldIDZNUnterstation, null, oldIDZNUnterstationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNUnterstation() {
		return iDZNUnterstationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup getZLVBusUSZuordnungTelegramm() {
		return zLVBusUSZuordnungTelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusUSZuordnungTelegramm(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup newZLVBusUSZuordnungTelegramm, NotificationChain msgs) {
		ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup oldZLVBusUSZuordnungTelegramm = zLVBusUSZuordnungTelegramm;
		zLVBusUSZuordnungTelegramm = newZLVBusUSZuordnungTelegramm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, oldZLVBusUSZuordnungTelegramm, newZLVBusUSZuordnungTelegramm);
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
	public void setZLVBusUSZuordnungTelegramm(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup newZLVBusUSZuordnungTelegramm) {
		if (newZLVBusUSZuordnungTelegramm != zLVBusUSZuordnungTelegramm) {
			NotificationChain msgs = null;
			if (zLVBusUSZuordnungTelegramm != null)
				msgs = ((InternalEObject)zLVBusUSZuordnungTelegramm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, null, msgs);
			if (newZLVBusUSZuordnungTelegramm != null)
				msgs = ((InternalEObject)newZLVBusUSZuordnungTelegramm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, null, msgs);
			msgs = basicSetZLVBusUSZuordnungTelegramm(newZLVBusUSZuordnungTelegramm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM, newZLVBusUSZuordnungTelegramm, newZLVBusUSZuordnungTelegramm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Zuordnung_Allg_AttributeGroup getZLVBusZuordnungAllg() {
		return zLVBusZuordnungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusZuordnungAllg(ZLV_Bus_Zuordnung_Allg_AttributeGroup newZLVBusZuordnungAllg, NotificationChain msgs) {
		ZLV_Bus_Zuordnung_Allg_AttributeGroup oldZLVBusZuordnungAllg = zLVBusZuordnungAllg;
		zLVBusZuordnungAllg = newZLVBusZuordnungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, oldZLVBusZuordnungAllg, newZLVBusZuordnungAllg);
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
	public void setZLVBusZuordnungAllg(ZLV_Bus_Zuordnung_Allg_AttributeGroup newZLVBusZuordnungAllg) {
		if (newZLVBusZuordnungAllg != zLVBusZuordnungAllg) {
			NotificationChain msgs = null;
			if (zLVBusZuordnungAllg != null)
				msgs = ((InternalEObject)zLVBusZuordnungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, null, msgs);
			if (newZLVBusZuordnungAllg != null)
				msgs = ((InternalEObject)newZLVBusZuordnungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, null, msgs);
			msgs = basicSetZLVBusZuordnungAllg(newZLVBusZuordnungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG, newZLVBusZuordnungAllg, newZLVBusZuordnungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				return basicSetZLVBusUSZuordnungTelegramm(null, msgs);
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				return basicSetZLVBusZuordnungAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				if (resolve) return getIDZLVBus();
				return basicGetIDZLVBus();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				if (resolve) return getIDZNUnterstation();
				return basicGetIDZNUnterstation();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				return getZLVBusUSZuordnungTelegramm();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				return getZLVBusZuordnungAllg();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				setIDZLVBus((ZLV_Bus)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				setIDZNUnterstation((ZN_Unterstation)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				setZLVBusUSZuordnungTelegramm((ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				setZLVBusZuordnungAllg((ZLV_Bus_Zuordnung_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				unsetIDZLVBus();
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				unsetIDZNUnterstation();
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				setZLVBusUSZuordnungTelegramm((ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				setZLVBusZuordnungAllg((ZLV_Bus_Zuordnung_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZLV_BUS:
				return isSetIDZLVBus();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__IDZN_UNTERSTATION:
				return isSetIDZNUnterstation();
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_US_ZUORDNUNG_TELEGRAMM:
				return zLVBusUSZuordnungTelegramm != null;
			case ZugnummernmeldeanlagePackage.ZLV_BUS_US_ZUORDNUNG__ZLV_BUS_ZUORDNUNG_ALLG:
				return zLVBusZuordnungAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZLV_Bus_US_ZuordnungImpl
