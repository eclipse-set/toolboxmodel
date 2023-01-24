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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ist_Befahren_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Fahrweg Teile Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_Teile_AttributeGroupImpl#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_Teile_AttributeGroupImpl#getIstBefahren <em>Ist Befahren</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_Fahrweg_Teile_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FT_Fahrweg_Teile_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFTFahrwegTeil() <em>IDFT Fahrweg Teil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFTFahrwegTeil()
	 * @generated
	 * @ordered
	 */
	protected FT_Fahrweg_Teil iDFTFahrwegTeil;

	/**
	 * This is true if the IDFT Fahrweg Teil reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFTFahrwegTeilESet;

	/**
	 * The cached value of the '{@link #getIstBefahren() <em>Ist Befahren</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIstBefahren()
	 * @generated
	 * @ordered
	 */
	protected Ist_Befahren_TypeClass istBefahren;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_Fahrweg_Teile_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teile_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Fahrweg_Teil getIDFTFahrwegTeil() {
		if (iDFTFahrwegTeil != null && iDFTFahrwegTeil.eIsProxy()) {
			InternalEObject oldIDFTFahrwegTeil = (InternalEObject)iDFTFahrwegTeil;
			iDFTFahrwegTeil = (FT_Fahrweg_Teil)eResolveProxy(oldIDFTFahrwegTeil);
			if (iDFTFahrwegTeil != oldIDFTFahrwegTeil) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL, oldIDFTFahrwegTeil, iDFTFahrwegTeil));
			}
		}
		return iDFTFahrwegTeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT_Fahrweg_Teil basicGetIDFTFahrwegTeil() {
		return iDFTFahrwegTeil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFTFahrwegTeil(FT_Fahrweg_Teil newIDFTFahrwegTeil) {
		FT_Fahrweg_Teil oldIDFTFahrwegTeil = iDFTFahrwegTeil;
		iDFTFahrwegTeil = newIDFTFahrwegTeil;
		boolean oldIDFTFahrwegTeilESet = iDFTFahrwegTeilESet;
		iDFTFahrwegTeilESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL, oldIDFTFahrwegTeil, iDFTFahrwegTeil, !oldIDFTFahrwegTeilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFTFahrwegTeil() {
		FT_Fahrweg_Teil oldIDFTFahrwegTeil = iDFTFahrwegTeil;
		boolean oldIDFTFahrwegTeilESet = iDFTFahrwegTeilESet;
		iDFTFahrwegTeil = null;
		iDFTFahrwegTeilESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL, oldIDFTFahrwegTeil, null, oldIDFTFahrwegTeilESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFTFahrwegTeil() {
		return iDFTFahrwegTeilESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ist_Befahren_TypeClass getIstBefahren() {
		return istBefahren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIstBefahren(Ist_Befahren_TypeClass newIstBefahren, NotificationChain msgs) {
		Ist_Befahren_TypeClass oldIstBefahren = istBefahren;
		istBefahren = newIstBefahren;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN, oldIstBefahren, newIstBefahren);
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
	public void setIstBefahren(Ist_Befahren_TypeClass newIstBefahren) {
		if (newIstBefahren != istBefahren) {
			NotificationChain msgs = null;
			if (istBefahren != null)
				msgs = ((InternalEObject)istBefahren).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN, null, msgs);
			if (newIstBefahren != null)
				msgs = ((InternalEObject)newIstBefahren).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN, null, msgs);
			msgs = basicSetIstBefahren(newIstBefahren, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN, newIstBefahren, newIstBefahren));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN:
				return basicSetIstBefahren(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL:
				if (resolve) return getIDFTFahrwegTeil();
				return basicGetIDFTFahrwegTeil();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN:
				return getIstBefahren();
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL:
				setIDFTFahrwegTeil((FT_Fahrweg_Teil)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN:
				setIstBefahren((Ist_Befahren_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL:
				unsetIDFTFahrwegTeil();
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN:
				setIstBefahren((Ist_Befahren_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IDFT_FAHRWEG_TEIL:
				return isSetIDFTFahrwegTeil();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEILE_ATTRIBUTE_GROUP__IST_BEFAHREN:
				return istBefahren != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_Fahrweg_Teile_AttributeGroupImpl
