/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Fortschalt Kriterium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getIDZNFortschaltKritStart <em>IDZN Fortschalt Krit Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getIDZNFortschaltKritZiel <em>IDZN Fortschalt Krit Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getZNFortschaltKritDruck <em>ZN Fortschalt Krit Druck</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_KriteriumImpl#getZNFortschaltKritSchalt <em>ZN Fortschalt Krit Schalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Fortschalt_KriteriumImpl extends Basis_ObjektImpl implements ZN_Fortschalt_Kriterium {
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
	 * The cached value of the '{@link #getIDZNFortschaltKritStart() <em>IDZN Fortschalt Krit Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNFortschaltKritStart()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld iDZNFortschaltKritStart;

	/**
	 * This is true if the IDZN Fortschalt Krit Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNFortschaltKritStartESet;

	/**
	 * The cached value of the '{@link #getIDZNFortschaltKritZiel() <em>IDZN Fortschalt Krit Ziel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNFortschaltKritZiel()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Anzeigefeld> iDZNFortschaltKritZiel;

	/**
	 * The cached value of the '{@link #getZNFortschaltKritDruck() <em>ZN Fortschalt Krit Druck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNFortschaltKritDruck()
	 * @generated
	 * @ordered
	 */
	protected ZN_Fortschalt_Krit_Druck_AttributeGroup zNFortschaltKritDruck;

	/**
	 * The cached value of the '{@link #getZNFortschaltKritSchalt() <em>ZN Fortschalt Krit Schalt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNFortschaltKritSchalt()
	 * @generated
	 * @ordered
	 */
	protected EList<ZN_Fortschalt_Krit_Schalt_AttributeGroup> zNFortschaltKritSchalt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Fortschalt_KriteriumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRITERIUM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, oldIDZN, iDZN));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, oldIDZN, iDZN, !oldIDZNESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN, oldIDZN, null, oldIDZNESet));
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
	public ZN_Anzeigefeld getIDZNFortschaltKritStart() {
		if (iDZNFortschaltKritStart != null && iDZNFortschaltKritStart.eIsProxy()) {
			InternalEObject oldIDZNFortschaltKritStart = (InternalEObject)iDZNFortschaltKritStart;
			iDZNFortschaltKritStart = (ZN_Anzeigefeld)eResolveProxy(oldIDZNFortschaltKritStart);
			if (iDZNFortschaltKritStart != oldIDZNFortschaltKritStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, oldIDZNFortschaltKritStart, iDZNFortschaltKritStart));
			}
		}
		return iDZNFortschaltKritStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Anzeigefeld basicGetIDZNFortschaltKritStart() {
		return iDZNFortschaltKritStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNFortschaltKritStart(ZN_Anzeigefeld newIDZNFortschaltKritStart) {
		ZN_Anzeigefeld oldIDZNFortschaltKritStart = iDZNFortschaltKritStart;
		iDZNFortschaltKritStart = newIDZNFortschaltKritStart;
		boolean oldIDZNFortschaltKritStartESet = iDZNFortschaltKritStartESet;
		iDZNFortschaltKritStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, oldIDZNFortschaltKritStart, iDZNFortschaltKritStart, !oldIDZNFortschaltKritStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNFortschaltKritStart() {
		ZN_Anzeigefeld oldIDZNFortschaltKritStart = iDZNFortschaltKritStart;
		boolean oldIDZNFortschaltKritStartESet = iDZNFortschaltKritStartESet;
		iDZNFortschaltKritStart = null;
		iDZNFortschaltKritStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START, oldIDZNFortschaltKritStart, null, oldIDZNFortschaltKritStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNFortschaltKritStart() {
		return iDZNFortschaltKritStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Anzeigefeld> getIDZNFortschaltKritZiel() {
		if (iDZNFortschaltKritZiel == null) {
			iDZNFortschaltKritZiel = new EObjectResolvingEList<ZN_Anzeigefeld>(ZN_Anzeigefeld.class, this, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL);
		}
		return iDZNFortschaltKritZiel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Fortschalt_Krit_Druck_AttributeGroup getZNFortschaltKritDruck() {
		return zNFortschaltKritDruck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNFortschaltKritDruck(ZN_Fortschalt_Krit_Druck_AttributeGroup newZNFortschaltKritDruck, NotificationChain msgs) {
		ZN_Fortschalt_Krit_Druck_AttributeGroup oldZNFortschaltKritDruck = zNFortschaltKritDruck;
		zNFortschaltKritDruck = newZNFortschaltKritDruck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, oldZNFortschaltKritDruck, newZNFortschaltKritDruck);
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
	public void setZNFortschaltKritDruck(ZN_Fortschalt_Krit_Druck_AttributeGroup newZNFortschaltKritDruck) {
		if (newZNFortschaltKritDruck != zNFortschaltKritDruck) {
			NotificationChain msgs = null;
			if (zNFortschaltKritDruck != null)
				msgs = ((InternalEObject)zNFortschaltKritDruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, null, msgs);
			if (newZNFortschaltKritDruck != null)
				msgs = ((InternalEObject)newZNFortschaltKritDruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, null, msgs);
			msgs = basicSetZNFortschaltKritDruck(newZNFortschaltKritDruck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK, newZNFortschaltKritDruck, newZNFortschaltKritDruck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZN_Fortschalt_Krit_Schalt_AttributeGroup> getZNFortschaltKritSchalt() {
		if (zNFortschaltKritSchalt == null) {
			zNFortschaltKritSchalt = new EObjectContainmentEList<ZN_Fortschalt_Krit_Schalt_AttributeGroup>(ZN_Fortschalt_Krit_Schalt_AttributeGroup.class, this, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT);
		}
		return zNFortschaltKritSchalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				return basicSetZNFortschaltKritDruck(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				return ((InternalEList<?>)getZNFortschaltKritSchalt()).basicRemove(otherEnd, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				if (resolve) return getIDZN();
				return basicGetIDZN();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				if (resolve) return getIDZNFortschaltKritStart();
				return basicGetIDZNFortschaltKritStart();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				return getIDZNFortschaltKritZiel();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				return getZNFortschaltKritDruck();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				return getZNFortschaltKritSchalt();
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				setIDZN((ZN)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				setIDZNFortschaltKritStart((ZN_Anzeigefeld)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				getIDZNFortschaltKritZiel().clear();
				getIDZNFortschaltKritZiel().addAll((Collection<? extends ZN_Anzeigefeld>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				setZNFortschaltKritDruck((ZN_Fortschalt_Krit_Druck_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				getZNFortschaltKritSchalt().clear();
				getZNFortschaltKritSchalt().addAll((Collection<? extends ZN_Fortschalt_Krit_Schalt_AttributeGroup>)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				unsetIDZN();
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				unsetIDZNFortschaltKritStart();
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				getIDZNFortschaltKritZiel().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				setZNFortschaltKritDruck((ZN_Fortschalt_Krit_Druck_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				getZNFortschaltKritSchalt().clear();
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN:
				return isSetIDZN();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_START:
				return isSetIDZNFortschaltKritStart();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__IDZN_FORTSCHALT_KRIT_ZIEL:
				return iDZNFortschaltKritZiel != null && !iDZNFortschaltKritZiel.isEmpty();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_DRUCK:
				return zNFortschaltKritDruck != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRITERIUM__ZN_FORTSCHALT_KRIT_SCHALT:
				return zNFortschaltKritSchalt != null && !zNFortschaltKritSchalt.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_Fortschalt_KriteriumImpl
