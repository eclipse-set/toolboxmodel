/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Anlage;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Zugang;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Zugang</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.impl.Bahnsteig_ZugangImpl#getBahnsteigZugangAllg <em>Bahnsteig Zugang Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.impl.Bahnsteig_ZugangImpl#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_ZugangImpl extends Punkt_ObjektImpl implements Bahnsteig_Zugang {
	/**
	 * The cached value of the '{@link #getBahnsteigZugangAllg() <em>Bahnsteig Zugang Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigZugangAllg()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Zugang_Allg_AttributeGroup bahnsteigZugangAllg;

	/**
	 * The cached value of the '{@link #getIDBahnsteigAnlage() <em>ID Bahnsteig Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Anlage iDBahnsteigAnlage;

	/**
	 * This is true if the ID Bahnsteig Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBahnsteigAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_ZugangImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_ZUGANG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Zugang_Allg_AttributeGroup getBahnsteigZugangAllg() {
		return bahnsteigZugangAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBahnsteigZugangAllg(Bahnsteig_Zugang_Allg_AttributeGroup newBahnsteigZugangAllg, NotificationChain msgs) {
		Bahnsteig_Zugang_Allg_AttributeGroup oldBahnsteigZugangAllg = bahnsteigZugangAllg;
		bahnsteigZugangAllg = newBahnsteigZugangAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, oldBahnsteigZugangAllg, newBahnsteigZugangAllg);
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
	public void setBahnsteigZugangAllg(Bahnsteig_Zugang_Allg_AttributeGroup newBahnsteigZugangAllg) {
		if (newBahnsteigZugangAllg != bahnsteigZugangAllg) {
			NotificationChain msgs = null;
			if (bahnsteigZugangAllg != null)
				msgs = ((InternalEObject)bahnsteigZugangAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, null, msgs);
			if (newBahnsteigZugangAllg != null)
				msgs = ((InternalEObject)newBahnsteigZugangAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, null, msgs);
			msgs = basicSetBahnsteigZugangAllg(newBahnsteigZugangAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG, newBahnsteigZugangAllg, newBahnsteigZugangAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Anlage getIDBahnsteigAnlage() {
		if (iDBahnsteigAnlage != null && iDBahnsteigAnlage.eIsProxy()) {
			InternalEObject oldIDBahnsteigAnlage = (InternalEObject)iDBahnsteigAnlage;
			iDBahnsteigAnlage = (Bahnsteig_Anlage)eResolveProxy(oldIDBahnsteigAnlage);
			if (iDBahnsteigAnlage != oldIDBahnsteigAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, iDBahnsteigAnlage));
			}
		}
		return iDBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bahnsteig_Anlage basicGetIDBahnsteigAnlage() {
		return iDBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBahnsteigAnlage(Bahnsteig_Anlage newIDBahnsteigAnlage) {
		Bahnsteig_Anlage oldIDBahnsteigAnlage = iDBahnsteigAnlage;
		iDBahnsteigAnlage = newIDBahnsteigAnlage;
		boolean oldIDBahnsteigAnlageESet = iDBahnsteigAnlageESet;
		iDBahnsteigAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, iDBahnsteigAnlage, !oldIDBahnsteigAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBahnsteigAnlage() {
		Bahnsteig_Anlage oldIDBahnsteigAnlage = iDBahnsteigAnlage;
		boolean oldIDBahnsteigAnlageESet = iDBahnsteigAnlageESet;
		iDBahnsteigAnlage = null;
		iDBahnsteigAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, null, oldIDBahnsteigAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBahnsteigAnlage() {
		return iDBahnsteigAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				return basicSetBahnsteigZugangAllg(null, msgs);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				return getBahnsteigZugangAllg();
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				if (resolve) return getIDBahnsteigAnlage();
				return basicGetIDBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				setBahnsteigZugangAllg((Bahnsteig_Zugang_Allg_AttributeGroup)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				setIDBahnsteigAnlage((Bahnsteig_Anlage)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				setBahnsteigZugangAllg((Bahnsteig_Zugang_Allg_AttributeGroup)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				unsetIDBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG:
				return bahnsteigZugangAllg != null;
			case BahnsteigPackage.BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE:
				return isSetIDBahnsteigAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bahnsteig_ZugangImpl
