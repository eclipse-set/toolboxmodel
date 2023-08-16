/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zuglenkung.ZL;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Signalgruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_SignalgruppeImpl#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_SignalgruppeImpl#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_SignalgruppeImpl extends Basis_ObjektImpl implements ZL_Signalgruppe {
	/**
	 * The cached value of the '{@link #getIDZL() <em>IDZL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZL()
	 * @generated
	 * @ordered
	 */
	protected ZL iDZL;

	/**
	 * This is true if the IDZL reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLESet;

	/**
	 * The cached value of the '{@link #getZLSignalgruppeAllg() <em>ZL Signalgruppe Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLSignalgruppeAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Signalgruppe_Allg_AttributeGroup zLSignalgruppeAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_SignalgruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_SIGNALGRUPPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL getIDZL() {
		if (iDZL != null && iDZL.eIsProxy()) {
			InternalEObject oldIDZL = (InternalEObject)iDZL;
			iDZL = (ZL)eResolveProxy(oldIDZL);
			if (iDZL != oldIDZL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, oldIDZL, iDZL));
			}
		}
		return iDZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL basicGetIDZL() {
		return iDZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZL(ZL newIDZL) {
		ZL oldIDZL = iDZL;
		iDZL = newIDZL;
		boolean oldIDZLESet = iDZLESet;
		iDZLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, oldIDZL, iDZL, !oldIDZLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZL() {
		ZL oldIDZL = iDZL;
		boolean oldIDZLESet = iDZLESet;
		iDZL = null;
		iDZLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL, oldIDZL, null, oldIDZLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZL() {
		return iDZLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Signalgruppe_Allg_AttributeGroup getZLSignalgruppeAllg() {
		return zLSignalgruppeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup newZLSignalgruppeAllg, NotificationChain msgs) {
		ZL_Signalgruppe_Allg_AttributeGroup oldZLSignalgruppeAllg = zLSignalgruppeAllg;
		zLSignalgruppeAllg = newZLSignalgruppeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, oldZLSignalgruppeAllg, newZLSignalgruppeAllg);
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
	public void setZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup newZLSignalgruppeAllg) {
		if (newZLSignalgruppeAllg != zLSignalgruppeAllg) {
			NotificationChain msgs = null;
			if (zLSignalgruppeAllg != null)
				msgs = ((InternalEObject)zLSignalgruppeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, null, msgs);
			if (newZLSignalgruppeAllg != null)
				msgs = ((InternalEObject)newZLSignalgruppeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, null, msgs);
			msgs = basicSetZLSignalgruppeAllg(newZLSignalgruppeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG, newZLSignalgruppeAllg, newZLSignalgruppeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				return basicSetZLSignalgruppeAllg(null, msgs);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				if (resolve) return getIDZL();
				return basicGetIDZL();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				return getZLSignalgruppeAllg();
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				setIDZL((ZL)newValue);
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				setZLSignalgruppeAllg((ZL_Signalgruppe_Allg_AttributeGroup)newValue);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				unsetIDZL();
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				setZLSignalgruppeAllg((ZL_Signalgruppe_Allg_AttributeGroup)null);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__IDZL:
				return isSetIDZL();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG:
				return zLSignalgruppeAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_SignalgruppeImpl
