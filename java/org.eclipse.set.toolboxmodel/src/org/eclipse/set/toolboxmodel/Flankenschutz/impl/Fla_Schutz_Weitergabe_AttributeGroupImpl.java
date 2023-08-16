/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup;
import org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz Weitergabe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Schutz_Weitergabe_AttributeGroupImpl#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_Weitergabe_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fla_Schutz_Weitergabe_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFlaWeitergabeL() <em>ID Fla Weitergabe L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaWeitergabeL()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz iDFlaWeitergabeL;

	/**
	 * This is true if the ID Fla Weitergabe L reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaWeitergabeLESet;

	/**
	 * The cached value of the '{@link #getIDFlaWeitergabeR() <em>ID Fla Weitergabe R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaWeitergabeR()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz iDFlaWeitergabeR;

	/**
	 * This is true if the ID Fla Weitergabe R reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaWeitergabeRESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_Weitergabe_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz getIDFlaWeitergabeL() {
		if (iDFlaWeitergabeL != null && iDFlaWeitergabeL.eIsProxy()) {
			InternalEObject oldIDFlaWeitergabeL = (InternalEObject)iDFlaWeitergabeL;
			iDFlaWeitergabeL = (Fla_Schutz)eResolveProxy(oldIDFlaWeitergabeL);
			if (iDFlaWeitergabeL != oldIDFlaWeitergabeL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, oldIDFlaWeitergabeL, iDFlaWeitergabeL));
			}
		}
		return iDFlaWeitergabeL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fla_Schutz basicGetIDFlaWeitergabeL() {
		return iDFlaWeitergabeL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaWeitergabeL(Fla_Schutz newIDFlaWeitergabeL) {
		Fla_Schutz oldIDFlaWeitergabeL = iDFlaWeitergabeL;
		iDFlaWeitergabeL = newIDFlaWeitergabeL;
		boolean oldIDFlaWeitergabeLESet = iDFlaWeitergabeLESet;
		iDFlaWeitergabeLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, oldIDFlaWeitergabeL, iDFlaWeitergabeL, !oldIDFlaWeitergabeLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaWeitergabeL() {
		Fla_Schutz oldIDFlaWeitergabeL = iDFlaWeitergabeL;
		boolean oldIDFlaWeitergabeLESet = iDFlaWeitergabeLESet;
		iDFlaWeitergabeL = null;
		iDFlaWeitergabeLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L, oldIDFlaWeitergabeL, null, oldIDFlaWeitergabeLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaWeitergabeL() {
		return iDFlaWeitergabeLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz getIDFlaWeitergabeR() {
		if (iDFlaWeitergabeR != null && iDFlaWeitergabeR.eIsProxy()) {
			InternalEObject oldIDFlaWeitergabeR = (InternalEObject)iDFlaWeitergabeR;
			iDFlaWeitergabeR = (Fla_Schutz)eResolveProxy(oldIDFlaWeitergabeR);
			if (iDFlaWeitergabeR != oldIDFlaWeitergabeR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, oldIDFlaWeitergabeR, iDFlaWeitergabeR));
			}
		}
		return iDFlaWeitergabeR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fla_Schutz basicGetIDFlaWeitergabeR() {
		return iDFlaWeitergabeR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaWeitergabeR(Fla_Schutz newIDFlaWeitergabeR) {
		Fla_Schutz oldIDFlaWeitergabeR = iDFlaWeitergabeR;
		iDFlaWeitergabeR = newIDFlaWeitergabeR;
		boolean oldIDFlaWeitergabeRESet = iDFlaWeitergabeRESet;
		iDFlaWeitergabeRESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, oldIDFlaWeitergabeR, iDFlaWeitergabeR, !oldIDFlaWeitergabeRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaWeitergabeR() {
		Fla_Schutz oldIDFlaWeitergabeR = iDFlaWeitergabeR;
		boolean oldIDFlaWeitergabeRESet = iDFlaWeitergabeRESet;
		iDFlaWeitergabeR = null;
		iDFlaWeitergabeRESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R, oldIDFlaWeitergabeR, null, oldIDFlaWeitergabeRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaWeitergabeR() {
		return iDFlaWeitergabeRESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				if (resolve) return getIDFlaWeitergabeL();
				return basicGetIDFlaWeitergabeL();
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				if (resolve) return getIDFlaWeitergabeR();
				return basicGetIDFlaWeitergabeR();
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				setIDFlaWeitergabeL((Fla_Schutz)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				setIDFlaWeitergabeR((Fla_Schutz)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				unsetIDFlaWeitergabeL();
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				unsetIDFlaWeitergabeR();
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
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L:
				return isSetIDFlaWeitergabeL();
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R:
				return isSetIDFlaWeitergabeR();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Schutz_Weitergabe_AttributeGroupImpl
