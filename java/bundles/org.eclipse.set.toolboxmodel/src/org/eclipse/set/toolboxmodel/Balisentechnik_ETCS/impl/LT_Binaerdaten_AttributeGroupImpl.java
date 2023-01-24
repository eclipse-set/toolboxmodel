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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdaten;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup;

import org.eclipse.set.toolboxmodel.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LT Binaerdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LT_Binaerdaten_AttributeGroupImpl#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LT_Binaerdaten_AttributeGroupImpl#getIDBinaerdaten <em>ID Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LT_Binaerdaten_AttributeGroupImpl#getPruefmerkmaleBinaerdaten <em>Pruefmerkmale Binaerdaten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LT_Binaerdaten_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LT_Binaerdaten_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangEADoku() <em>ID Anhang EA Doku</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangEADoku()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangEADoku;

	/**
	 * This is true if the ID Anhang EA Doku reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangEADokuESet;

	/**
	 * The cached value of the '{@link #getIDBinaerdaten() <em>ID Binaerdaten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected Binaerdaten iDBinaerdaten;

	/**
	 * This is true if the ID Binaerdaten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBinaerdatenESet;

	/**
	 * The cached value of the '{@link #getPruefmerkmaleBinaerdaten() <em>Pruefmerkmale Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefmerkmaleBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected Pruefmerkmale_Daten_AttributeGroup pruefmerkmaleBinaerdaten;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LT_Binaerdaten_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLT_Binaerdaten_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangEADoku() {
		if (iDAnhangEADoku != null && iDAnhangEADoku.eIsProxy()) {
			InternalEObject oldIDAnhangEADoku = (InternalEObject)iDAnhangEADoku;
			iDAnhangEADoku = (Anhang)eResolveProxy(oldIDAnhangEADoku);
			if (iDAnhangEADoku != oldIDAnhangEADoku) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, iDAnhangEADoku));
			}
		}
		return iDAnhangEADoku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangEADoku() {
		return iDAnhangEADoku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangEADoku(Anhang newIDAnhangEADoku) {
		Anhang oldIDAnhangEADoku = iDAnhangEADoku;
		iDAnhangEADoku = newIDAnhangEADoku;
		boolean oldIDAnhangEADokuESet = iDAnhangEADokuESet;
		iDAnhangEADokuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, iDAnhangEADoku, !oldIDAnhangEADokuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangEADoku() {
		Anhang oldIDAnhangEADoku = iDAnhangEADoku;
		boolean oldIDAnhangEADokuESet = iDAnhangEADokuESet;
		iDAnhangEADoku = null;
		iDAnhangEADokuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, null, oldIDAnhangEADokuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangEADoku() {
		return iDAnhangEADokuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdaten getIDBinaerdaten() {
		if (iDBinaerdaten != null && iDBinaerdaten.eIsProxy()) {
			InternalEObject oldIDBinaerdaten = (InternalEObject)iDBinaerdaten;
			iDBinaerdaten = (Binaerdaten)eResolveProxy(oldIDBinaerdaten);
			if (iDBinaerdaten != oldIDBinaerdaten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, oldIDBinaerdaten, iDBinaerdaten));
			}
		}
		return iDBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binaerdaten basicGetIDBinaerdaten() {
		return iDBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBinaerdaten(Binaerdaten newIDBinaerdaten) {
		Binaerdaten oldIDBinaerdaten = iDBinaerdaten;
		iDBinaerdaten = newIDBinaerdaten;
		boolean oldIDBinaerdatenESet = iDBinaerdatenESet;
		iDBinaerdatenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, oldIDBinaerdaten, iDBinaerdaten, !oldIDBinaerdatenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBinaerdaten() {
		Binaerdaten oldIDBinaerdaten = iDBinaerdaten;
		boolean oldIDBinaerdatenESet = iDBinaerdatenESet;
		iDBinaerdaten = null;
		iDBinaerdatenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN, oldIDBinaerdaten, null, oldIDBinaerdatenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBinaerdaten() {
		return iDBinaerdatenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdaten() {
		return pruefmerkmaleBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdaten, NotificationChain msgs) {
		Pruefmerkmale_Daten_AttributeGroup oldPruefmerkmaleBinaerdaten = pruefmerkmaleBinaerdaten;
		pruefmerkmaleBinaerdaten = newPruefmerkmaleBinaerdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, oldPruefmerkmaleBinaerdaten, newPruefmerkmaleBinaerdaten);
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
	public void setPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdaten) {
		if (newPruefmerkmaleBinaerdaten != pruefmerkmaleBinaerdaten) {
			NotificationChain msgs = null;
			if (pruefmerkmaleBinaerdaten != null)
				msgs = ((InternalEObject)pruefmerkmaleBinaerdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, null, msgs);
			if (newPruefmerkmaleBinaerdaten != null)
				msgs = ((InternalEObject)newPruefmerkmaleBinaerdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, null, msgs);
			msgs = basicSetPruefmerkmaleBinaerdaten(newPruefmerkmaleBinaerdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN, newPruefmerkmaleBinaerdaten, newPruefmerkmaleBinaerdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				return basicSetPruefmerkmaleBinaerdaten(null, msgs);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				if (resolve) return getIDAnhangEADoku();
				return basicGetIDAnhangEADoku();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				if (resolve) return getIDBinaerdaten();
				return basicGetIDBinaerdaten();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				return getPruefmerkmaleBinaerdaten();
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				setIDAnhangEADoku((Anhang)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				setIDBinaerdaten((Binaerdaten)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				setPruefmerkmaleBinaerdaten((Pruefmerkmale_Daten_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				unsetIDAnhangEADoku();
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				unsetIDBinaerdaten();
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				setPruefmerkmaleBinaerdaten((Pruefmerkmale_Daten_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_ANHANG_EA_DOKU:
				return isSetIDAnhangEADoku();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__ID_BINAERDATEN:
				return isSetIDBinaerdaten();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEN_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEN:
				return pruefmerkmaleBinaerdaten != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LT_Binaerdaten_AttributeGroupImpl
