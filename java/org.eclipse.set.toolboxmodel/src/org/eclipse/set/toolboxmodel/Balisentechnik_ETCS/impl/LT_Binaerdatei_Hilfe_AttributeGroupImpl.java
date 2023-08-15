/**
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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Verwendung_Hilfe_TypeClass;

import org.eclipse.set.toolboxmodel.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LT Binaerdatei Hilfe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LT_Binaerdatei_Hilfe_AttributeGroupImpl#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LT_Binaerdatei_Hilfe_AttributeGroupImpl#getPruefmerkmaleBinaerdateiHilfe <em>Pruefmerkmale Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LT_Binaerdatei_Hilfe_AttributeGroupImpl#getVerwendungHilfe <em>Verwendung Hilfe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LT_Binaerdatei_Hilfe_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LT_Binaerdatei_Hilfe_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBinaerdateiHilfe() <em>ID Binaerdatei Hilfe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected Binaerdaten iDBinaerdateiHilfe;

	/**
	 * This is true if the ID Binaerdatei Hilfe reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBinaerdateiHilfeESet;

	/**
	 * The cached value of the '{@link #getPruefmerkmaleBinaerdateiHilfe() <em>Pruefmerkmale Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPruefmerkmaleBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected Pruefmerkmale_Daten_AttributeGroup pruefmerkmaleBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getVerwendungHilfe() <em>Verwendung Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwendungHilfe()
	 * @generated
	 * @ordered
	 */
	protected Verwendung_Hilfe_TypeClass verwendungHilfe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LT_Binaerdatei_Hilfe_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLT_Binaerdatei_Hilfe_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdaten getIDBinaerdateiHilfe() {
		if (iDBinaerdateiHilfe != null && iDBinaerdateiHilfe.eIsProxy()) {
			InternalEObject oldIDBinaerdateiHilfe = (InternalEObject)iDBinaerdateiHilfe;
			iDBinaerdateiHilfe = (Binaerdaten)eResolveProxy(oldIDBinaerdateiHilfe);
			if (iDBinaerdateiHilfe != oldIDBinaerdateiHilfe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, iDBinaerdateiHilfe));
			}
		}
		return iDBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binaerdaten basicGetIDBinaerdateiHilfe() {
		return iDBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBinaerdateiHilfe(Binaerdaten newIDBinaerdateiHilfe) {
		Binaerdaten oldIDBinaerdateiHilfe = iDBinaerdateiHilfe;
		iDBinaerdateiHilfe = newIDBinaerdateiHilfe;
		boolean oldIDBinaerdateiHilfeESet = iDBinaerdateiHilfeESet;
		iDBinaerdateiHilfeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, iDBinaerdateiHilfe, !oldIDBinaerdateiHilfeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBinaerdateiHilfe() {
		Binaerdaten oldIDBinaerdateiHilfe = iDBinaerdateiHilfe;
		boolean oldIDBinaerdateiHilfeESet = iDBinaerdateiHilfeESet;
		iDBinaerdateiHilfe = null;
		iDBinaerdateiHilfeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, null, oldIDBinaerdateiHilfeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBinaerdateiHilfe() {
		return iDBinaerdateiHilfeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdateiHilfe() {
		return pruefmerkmaleBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPruefmerkmaleBinaerdateiHilfe(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdateiHilfe, NotificationChain msgs) {
		Pruefmerkmale_Daten_AttributeGroup oldPruefmerkmaleBinaerdateiHilfe = pruefmerkmaleBinaerdateiHilfe;
		pruefmerkmaleBinaerdateiHilfe = newPruefmerkmaleBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, oldPruefmerkmaleBinaerdateiHilfe, newPruefmerkmaleBinaerdateiHilfe);
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
	public void setPruefmerkmaleBinaerdateiHilfe(Pruefmerkmale_Daten_AttributeGroup newPruefmerkmaleBinaerdateiHilfe) {
		if (newPruefmerkmaleBinaerdateiHilfe != pruefmerkmaleBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (pruefmerkmaleBinaerdateiHilfe != null)
				msgs = ((InternalEObject)pruefmerkmaleBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, null, msgs);
			if (newPruefmerkmaleBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newPruefmerkmaleBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetPruefmerkmaleBinaerdateiHilfe(newPruefmerkmaleBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE, newPruefmerkmaleBinaerdateiHilfe, newPruefmerkmaleBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_Hilfe_TypeClass getVerwendungHilfe() {
		return verwendungHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwendungHilfe(Verwendung_Hilfe_TypeClass newVerwendungHilfe, NotificationChain msgs) {
		Verwendung_Hilfe_TypeClass oldVerwendungHilfe = verwendungHilfe;
		verwendungHilfe = newVerwendungHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, oldVerwendungHilfe, newVerwendungHilfe);
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
	public void setVerwendungHilfe(Verwendung_Hilfe_TypeClass newVerwendungHilfe) {
		if (newVerwendungHilfe != verwendungHilfe) {
			NotificationChain msgs = null;
			if (verwendungHilfe != null)
				msgs = ((InternalEObject)verwendungHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, null, msgs);
			if (newVerwendungHilfe != null)
				msgs = ((InternalEObject)newVerwendungHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, null, msgs);
			msgs = basicSetVerwendungHilfe(newVerwendungHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE, newVerwendungHilfe, newVerwendungHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				return basicSetPruefmerkmaleBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				return basicSetVerwendungHilfe(null, msgs);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				if (resolve) return getIDBinaerdateiHilfe();
				return basicGetIDBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				return getPruefmerkmaleBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				return getVerwendungHilfe();
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				setIDBinaerdateiHilfe((Binaerdaten)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				setPruefmerkmaleBinaerdateiHilfe((Pruefmerkmale_Daten_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				setVerwendungHilfe((Verwendung_Hilfe_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				unsetIDBinaerdateiHilfe();
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				setPruefmerkmaleBinaerdateiHilfe((Pruefmerkmale_Daten_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				setVerwendungHilfe((Verwendung_Hilfe_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__ID_BINAERDATEI_HILFE:
				return isSetIDBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__PRUEFMERKMALE_BINAERDATEI_HILFE:
				return pruefmerkmaleBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LT_BINAERDATEI_HILFE_ATTRIBUTE_GROUP__VERWENDUNG_HILFE:
				return verwendungHilfe != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LT_Binaerdatei_Hilfe_AttributeGroupImpl
