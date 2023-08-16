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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup;
import org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage;
import org.eclipse.set.toolboxmodel.Flankenschutz.Massnahme_TypeClass;
import org.eclipse.set.toolboxmodel.Flankenschutz.Nachlaufverhinderung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Zwieschutz Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl#getIDFlaSchutzL <em>ID Fla Schutz L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl#getIDFlaSchutzR <em>ID Fla Schutz R</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl#getMassnahmeL <em>Massnahme L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl#getMassnahmeR <em>Massnahme R</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Zwieschutz_Element_AttributeGroupImpl#getNachlaufverhinderung <em>Nachlaufverhinderung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Zwieschutz_Element_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fla_Zwieschutz_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFlaSchutzL() <em>ID Fla Schutz L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSchutzL()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz iDFlaSchutzL;

	/**
	 * This is true if the ID Fla Schutz L reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaSchutzLESet;

	/**
	 * The cached value of the '{@link #getIDFlaSchutzR() <em>ID Fla Schutz R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSchutzR()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz iDFlaSchutzR;

	/**
	 * This is true if the ID Fla Schutz R reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaSchutzRESet;

	/**
	 * The cached value of the '{@link #getMassnahmeL() <em>Massnahme L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassnahmeL()
	 * @generated
	 * @ordered
	 */
	protected Massnahme_TypeClass massnahmeL;

	/**
	 * The cached value of the '{@link #getMassnahmeR() <em>Massnahme R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMassnahmeR()
	 * @generated
	 * @ordered
	 */
	protected Massnahme_TypeClass massnahmeR;

	/**
	 * The cached value of the '{@link #getNachlaufverhinderung() <em>Nachlaufverhinderung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachlaufverhinderung()
	 * @generated
	 * @ordered
	 */
	protected Nachlaufverhinderung_TypeClass nachlaufverhinderung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Zwieschutz_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz getIDFlaSchutzL() {
		if (iDFlaSchutzL != null && iDFlaSchutzL.eIsProxy()) {
			InternalEObject oldIDFlaSchutzL = (InternalEObject)iDFlaSchutzL;
			iDFlaSchutzL = (Fla_Schutz)eResolveProxy(oldIDFlaSchutzL);
			if (iDFlaSchutzL != oldIDFlaSchutzL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L, oldIDFlaSchutzL, iDFlaSchutzL));
			}
		}
		return iDFlaSchutzL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fla_Schutz basicGetIDFlaSchutzL() {
		return iDFlaSchutzL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaSchutzL(Fla_Schutz newIDFlaSchutzL) {
		Fla_Schutz oldIDFlaSchutzL = iDFlaSchutzL;
		iDFlaSchutzL = newIDFlaSchutzL;
		boolean oldIDFlaSchutzLESet = iDFlaSchutzLESet;
		iDFlaSchutzLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L, oldIDFlaSchutzL, iDFlaSchutzL, !oldIDFlaSchutzLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaSchutzL() {
		Fla_Schutz oldIDFlaSchutzL = iDFlaSchutzL;
		boolean oldIDFlaSchutzLESet = iDFlaSchutzLESet;
		iDFlaSchutzL = null;
		iDFlaSchutzLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L, oldIDFlaSchutzL, null, oldIDFlaSchutzLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaSchutzL() {
		return iDFlaSchutzLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz getIDFlaSchutzR() {
		if (iDFlaSchutzR != null && iDFlaSchutzR.eIsProxy()) {
			InternalEObject oldIDFlaSchutzR = (InternalEObject)iDFlaSchutzR;
			iDFlaSchutzR = (Fla_Schutz)eResolveProxy(oldIDFlaSchutzR);
			if (iDFlaSchutzR != oldIDFlaSchutzR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R, oldIDFlaSchutzR, iDFlaSchutzR));
			}
		}
		return iDFlaSchutzR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fla_Schutz basicGetIDFlaSchutzR() {
		return iDFlaSchutzR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaSchutzR(Fla_Schutz newIDFlaSchutzR) {
		Fla_Schutz oldIDFlaSchutzR = iDFlaSchutzR;
		iDFlaSchutzR = newIDFlaSchutzR;
		boolean oldIDFlaSchutzRESet = iDFlaSchutzRESet;
		iDFlaSchutzRESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R, oldIDFlaSchutzR, iDFlaSchutzR, !oldIDFlaSchutzRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaSchutzR() {
		Fla_Schutz oldIDFlaSchutzR = iDFlaSchutzR;
		boolean oldIDFlaSchutzRESet = iDFlaSchutzRESet;
		iDFlaSchutzR = null;
		iDFlaSchutzRESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R, oldIDFlaSchutzR, null, oldIDFlaSchutzRESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaSchutzR() {
		return iDFlaSchutzRESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massnahme_TypeClass getMassnahmeL() {
		return massnahmeL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassnahmeL(Massnahme_TypeClass newMassnahmeL, NotificationChain msgs) {
		Massnahme_TypeClass oldMassnahmeL = massnahmeL;
		massnahmeL = newMassnahmeL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L, oldMassnahmeL, newMassnahmeL);
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
	public void setMassnahmeL(Massnahme_TypeClass newMassnahmeL) {
		if (newMassnahmeL != massnahmeL) {
			NotificationChain msgs = null;
			if (massnahmeL != null)
				msgs = ((InternalEObject)massnahmeL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L, null, msgs);
			if (newMassnahmeL != null)
				msgs = ((InternalEObject)newMassnahmeL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L, null, msgs);
			msgs = basicSetMassnahmeL(newMassnahmeL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L, newMassnahmeL, newMassnahmeL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Massnahme_TypeClass getMassnahmeR() {
		return massnahmeR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMassnahmeR(Massnahme_TypeClass newMassnahmeR, NotificationChain msgs) {
		Massnahme_TypeClass oldMassnahmeR = massnahmeR;
		massnahmeR = newMassnahmeR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R, oldMassnahmeR, newMassnahmeR);
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
	public void setMassnahmeR(Massnahme_TypeClass newMassnahmeR) {
		if (newMassnahmeR != massnahmeR) {
			NotificationChain msgs = null;
			if (massnahmeR != null)
				msgs = ((InternalEObject)massnahmeR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R, null, msgs);
			if (newMassnahmeR != null)
				msgs = ((InternalEObject)newMassnahmeR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R, null, msgs);
			msgs = basicSetMassnahmeR(newMassnahmeR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R, newMassnahmeR, newMassnahmeR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Nachlaufverhinderung_TypeClass getNachlaufverhinderung() {
		return nachlaufverhinderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachlaufverhinderung(Nachlaufverhinderung_TypeClass newNachlaufverhinderung, NotificationChain msgs) {
		Nachlaufverhinderung_TypeClass oldNachlaufverhinderung = nachlaufverhinderung;
		nachlaufverhinderung = newNachlaufverhinderung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG, oldNachlaufverhinderung, newNachlaufverhinderung);
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
	public void setNachlaufverhinderung(Nachlaufverhinderung_TypeClass newNachlaufverhinderung) {
		if (newNachlaufverhinderung != nachlaufverhinderung) {
			NotificationChain msgs = null;
			if (nachlaufverhinderung != null)
				msgs = ((InternalEObject)nachlaufverhinderung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG, null, msgs);
			if (newNachlaufverhinderung != null)
				msgs = ((InternalEObject)newNachlaufverhinderung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG, null, msgs);
			msgs = basicSetNachlaufverhinderung(newNachlaufverhinderung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG, newNachlaufverhinderung, newNachlaufverhinderung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L:
				return basicSetMassnahmeL(null, msgs);
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R:
				return basicSetMassnahmeR(null, msgs);
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG:
				return basicSetNachlaufverhinderung(null, msgs);
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L:
				if (resolve) return getIDFlaSchutzL();
				return basicGetIDFlaSchutzL();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R:
				if (resolve) return getIDFlaSchutzR();
				return basicGetIDFlaSchutzR();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L:
				return getMassnahmeL();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R:
				return getMassnahmeR();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG:
				return getNachlaufverhinderung();
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L:
				setIDFlaSchutzL((Fla_Schutz)newValue);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R:
				setIDFlaSchutzR((Fla_Schutz)newValue);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L:
				setMassnahmeL((Massnahme_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R:
				setMassnahmeR((Massnahme_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG:
				setNachlaufverhinderung((Nachlaufverhinderung_TypeClass)newValue);
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L:
				unsetIDFlaSchutzL();
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R:
				unsetIDFlaSchutzR();
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L:
				setMassnahmeL((Massnahme_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R:
				setMassnahmeR((Massnahme_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG:
				setNachlaufverhinderung((Nachlaufverhinderung_TypeClass)null);
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
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L:
				return isSetIDFlaSchutzL();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R:
				return isSetIDFlaSchutzR();
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L:
				return massnahmeL != null;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R:
				return massnahmeR != null;
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG:
				return nachlaufverhinderung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Zwieschutz_Element_AttributeGroupImpl
