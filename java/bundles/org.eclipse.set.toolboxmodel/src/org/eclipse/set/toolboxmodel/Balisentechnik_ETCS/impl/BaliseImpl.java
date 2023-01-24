/**
 * /**
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

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Balise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.BaliseImpl#getBaliseAllg <em>Balise Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.BaliseImpl#getIDDatenpunkt <em>ID Datenpunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaliseImpl extends Basis_ObjektImpl implements Balise {
	/**
	 * The cached value of the '{@link #getBaliseAllg() <em>Balise Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaliseAllg()
	 * @generated
	 * @ordered
	 */
	protected Balise_Allg_AttributeGroup baliseAllg;

	/**
	 * The cached value of the '{@link #getIDDatenpunkt() <em>ID Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt iDDatenpunkt;

	/**
	 * This is true if the ID Datenpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDDatenpunktESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaliseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBalise();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise_Allg_AttributeGroup getBaliseAllg() {
		return baliseAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaliseAllg(Balise_Allg_AttributeGroup newBaliseAllg, NotificationChain msgs) {
		Balise_Allg_AttributeGroup oldBaliseAllg = baliseAllg;
		baliseAllg = newBaliseAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, oldBaliseAllg, newBaliseAllg);
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
	public void setBaliseAllg(Balise_Allg_AttributeGroup newBaliseAllg) {
		if (newBaliseAllg != baliseAllg) {
			NotificationChain msgs = null;
			if (baliseAllg != null)
				msgs = ((InternalEObject)baliseAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, null, msgs);
			if (newBaliseAllg != null)
				msgs = ((InternalEObject)newBaliseAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, null, msgs);
			msgs = basicSetBaliseAllg(newBaliseAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG, newBaliseAllg, newBaliseAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt getIDDatenpunkt() {
		if (iDDatenpunkt != null && iDDatenpunkt.eIsProxy()) {
			InternalEObject oldIDDatenpunkt = (InternalEObject)iDDatenpunkt;
			iDDatenpunkt = (Datenpunkt)eResolveProxy(oldIDDatenpunkt);
			if (iDDatenpunkt != oldIDDatenpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, oldIDDatenpunkt, iDDatenpunkt));
			}
		}
		return iDDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenpunkt basicGetIDDatenpunkt() {
		return iDDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDDatenpunkt(Datenpunkt newIDDatenpunkt) {
		Datenpunkt oldIDDatenpunkt = iDDatenpunkt;
		iDDatenpunkt = newIDDatenpunkt;
		boolean oldIDDatenpunktESet = iDDatenpunktESet;
		iDDatenpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, oldIDDatenpunkt, iDDatenpunkt, !oldIDDatenpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDDatenpunkt() {
		Datenpunkt oldIDDatenpunkt = iDDatenpunkt;
		boolean oldIDDatenpunktESet = iDDatenpunktESet;
		iDDatenpunkt = null;
		iDDatenpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT, oldIDDatenpunkt, null, oldIDDatenpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDDatenpunkt() {
		return iDDatenpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				return basicSetBaliseAllg(null, msgs);
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
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				return getBaliseAllg();
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				if (resolve) return getIDDatenpunkt();
				return basicGetIDDatenpunkt();
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
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				setBaliseAllg((Balise_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				setIDDatenpunkt((Datenpunkt)newValue);
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
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				setBaliseAllg((Balise_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				unsetIDDatenpunkt();
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
			case Balisentechnik_ETCSPackage.BALISE__BALISE_ALLG:
				return baliseAllg != null;
			case Balisentechnik_ETCSPackage.BALISE__ID_DATENPUNKT:
				return isSetIDDatenpunkt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BaliseImpl
