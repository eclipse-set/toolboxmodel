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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik_Anzeigefeld_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Akustik</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AkustikImpl#getZNAkustikAnzeigefeld <em>ZN Akustik Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AkustikImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AkustikImpl#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_AkustikImpl extends Basis_ObjektImpl implements ZN_Akustik {
	/**
	 * The cached value of the '{@link #getZNAkustikAnzeigefeld() <em>ZN Akustik Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAkustikAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected ZN_Akustik_Anzeigefeld_AttributeGroup zNAkustikAnzeigefeld;

	/**
	 * The cached value of the '{@link #getIDZN() <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZN()
	 * @generated
	 * @ordered
	 */
	protected ZN iDZN;

	/**
	 * This is true if the IDZN reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNESet;

	/**
	 * The cached value of the '{@link #getIDZNAnzeigefeld() <em>IDZN Anzeigefeld</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld iDZNAnzeigefeld;

	/**
	 * This is true if the IDZN Anzeigefeld reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNAnzeigefeldESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_AkustikImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_AKUSTIK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Akustik_Anzeigefeld_AttributeGroup getZNAkustikAnzeigefeld() {
		return zNAkustikAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup newZNAkustikAnzeigefeld, NotificationChain msgs) {
		ZN_Akustik_Anzeigefeld_AttributeGroup oldZNAkustikAnzeigefeld = zNAkustikAnzeigefeld;
		zNAkustikAnzeigefeld = newZNAkustikAnzeigefeld;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, oldZNAkustikAnzeigefeld, newZNAkustikAnzeigefeld);
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
	public void setZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup newZNAkustikAnzeigefeld) {
		if (newZNAkustikAnzeigefeld != zNAkustikAnzeigefeld) {
			NotificationChain msgs = null;
			if (zNAkustikAnzeigefeld != null)
				msgs = ((InternalEObject)zNAkustikAnzeigefeld).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, null, msgs);
			if (newZNAkustikAnzeigefeld != null)
				msgs = ((InternalEObject)newZNAkustikAnzeigefeld).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, null, msgs);
			msgs = basicSetZNAkustikAnzeigefeld(newZNAkustikAnzeigefeld, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD, newZNAkustikAnzeigefeld, newZNAkustikAnzeigefeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN getIDZN() {
		if (iDZN != null && iDZN.eIsProxy()) {
			InternalEObject oldIDZN = (InternalEObject)iDZN;
			iDZN = (ZN)eResolveProxy(oldIDZN);
			if (iDZN != oldIDZN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, oldIDZN, iDZN));
			}
		}
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN basicGetIDZN() {
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZN(ZN newIDZN) {
		ZN oldIDZN = iDZN;
		iDZN = newIDZN;
		boolean oldIDZNESet = iDZNESet;
		iDZNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, oldIDZN, iDZN, !oldIDZNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZN() {
		ZN oldIDZN = iDZN;
		boolean oldIDZNESet = iDZNESet;
		iDZN = null;
		iDZNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN, oldIDZN, null, oldIDZNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZN() {
		return iDZNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld getIDZNAnzeigefeld() {
		if (iDZNAnzeigefeld != null && iDZNAnzeigefeld.eIsProxy()) {
			InternalEObject oldIDZNAnzeigefeld = (InternalEObject)iDZNAnzeigefeld;
			iDZNAnzeigefeld = (ZN_Anzeigefeld)eResolveProxy(oldIDZNAnzeigefeld);
			if (iDZNAnzeigefeld != oldIDZNAnzeigefeld) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, iDZNAnzeigefeld));
			}
		}
		return iDZNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Anzeigefeld basicGetIDZNAnzeigefeld() {
		return iDZNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNAnzeigefeld(ZN_Anzeigefeld newIDZNAnzeigefeld) {
		ZN_Anzeigefeld oldIDZNAnzeigefeld = iDZNAnzeigefeld;
		iDZNAnzeigefeld = newIDZNAnzeigefeld;
		boolean oldIDZNAnzeigefeldESet = iDZNAnzeigefeldESet;
		iDZNAnzeigefeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, iDZNAnzeigefeld, !oldIDZNAnzeigefeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNAnzeigefeld() {
		ZN_Anzeigefeld oldIDZNAnzeigefeld = iDZNAnzeigefeld;
		boolean oldIDZNAnzeigefeldESet = iDZNAnzeigefeldESet;
		iDZNAnzeigefeld = null;
		iDZNAnzeigefeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, null, oldIDZNAnzeigefeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNAnzeigefeld() {
		return iDZNAnzeigefeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				return basicSetZNAkustikAnzeigefeld(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				return getZNAkustikAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				if (resolve) return getIDZN();
				return basicGetIDZN();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				if (resolve) return getIDZNAnzeigefeld();
				return basicGetIDZNAnzeigefeld();
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				setZNAkustikAnzeigefeld((ZN_Akustik_Anzeigefeld_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				setIDZN((ZN)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				setIDZNAnzeigefeld((ZN_Anzeigefeld)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				setZNAkustikAnzeigefeld((ZN_Akustik_Anzeigefeld_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				unsetIDZN();
				return;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				unsetIDZNAnzeigefeld();
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
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__ZN_AKUSTIK_ANZEIGEFELD:
				return zNAkustikAnzeigefeld != null;
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN:
				return isSetIDZN();
			case ZugnummernmeldeanlagePackage.ZN_AKUSTIK__IDZN_ANZEIGEFELD:
				return isSetIDZNAnzeigefeld();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_AkustikImpl
