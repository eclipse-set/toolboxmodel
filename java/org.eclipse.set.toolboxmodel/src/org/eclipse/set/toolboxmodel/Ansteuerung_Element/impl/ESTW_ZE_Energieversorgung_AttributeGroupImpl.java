/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Energieversorgung_Art_Ersatz_TypeClass;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Energieversorgung_Art_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESTW ZE Energieversorgung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZE_Energieversorgung_AttributeGroupImpl#getEnergieversorgungArtErsatz2 <em>Energieversorgung Art Ersatz2</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZE_Energieversorgung_AttributeGroupImpl#getEnergieversorgungArt <em>Energieversorgung Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZE_Energieversorgung_AttributeGroupImpl#getIDEnergiePrimaer <em>ID Energie Primaer</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZE_Energieversorgung_AttributeGroupImpl#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZE_Energieversorgung_AttributeGroupImpl#getIDEnergieSekundaer <em>ID Energie Sekundaer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESTW_ZE_Energieversorgung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ESTW_ZE_Energieversorgung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEnergieversorgungArtErsatz2() <em>Energieversorgung Art Ersatz2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArtErsatz2()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_Ersatz_TypeClass energieversorgungArtErsatz2;

	/**
	 * The cached value of the '{@link #getEnergieversorgungArt() <em>Energieversorgung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArt()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_TypeClass energieversorgungArt;

	/**
	 * The cached value of the '{@link #getIDEnergiePrimaer() <em>ID Energie Primaer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergiePrimaer()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDEnergiePrimaer;

	/**
	 * This is true if the ID Energie Primaer reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEnergiePrimaerESet;

	/**
	 * The cached value of the '{@link #getEnergieversorgungArtErsatz() <em>Energieversorgung Art Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergieversorgungArtErsatz()
	 * @generated
	 * @ordered
	 */
	protected Energieversorgung_Art_Ersatz_TypeClass energieversorgungArtErsatz;

	/**
	 * The cached value of the '{@link #getIDEnergieSekundaer() <em>ID Energie Sekundaer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergieSekundaer()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDEnergieSekundaer;

	/**
	 * This is true if the ID Energie Sekundaer reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEnergieSekundaerESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESTW_ZE_Energieversorgung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_TypeClass getEnergieversorgungArt() {
		return energieversorgungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArt(Energieversorgung_Art_TypeClass newEnergieversorgungArt, NotificationChain msgs) {
		Energieversorgung_Art_TypeClass oldEnergieversorgungArt = energieversorgungArt;
		energieversorgungArt = newEnergieversorgungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, oldEnergieversorgungArt, newEnergieversorgungArt);
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
	public void setEnergieversorgungArt(Energieversorgung_Art_TypeClass newEnergieversorgungArt) {
		if (newEnergieversorgungArt != energieversorgungArt) {
			NotificationChain msgs = null;
			if (energieversorgungArt != null)
				msgs = ((InternalEObject)energieversorgungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, null, msgs);
			if (newEnergieversorgungArt != null)
				msgs = ((InternalEObject)newEnergieversorgungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, null, msgs);
			msgs = basicSetEnergieversorgungArt(newEnergieversorgungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART, newEnergieversorgungArt, newEnergieversorgungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDEnergiePrimaer() {
		if (iDEnergiePrimaer != null && iDEnergiePrimaer.eIsProxy()) {
			InternalEObject oldIDEnergiePrimaer = (InternalEObject)iDEnergiePrimaer;
			iDEnergiePrimaer = (Basis_Objekt)eResolveProxy(oldIDEnergiePrimaer);
			if (iDEnergiePrimaer != oldIDEnergiePrimaer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, oldIDEnergiePrimaer, iDEnergiePrimaer));
			}
		}
		return iDEnergiePrimaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDEnergiePrimaer() {
		return iDEnergiePrimaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEnergiePrimaer(Basis_Objekt newIDEnergiePrimaer) {
		Basis_Objekt oldIDEnergiePrimaer = iDEnergiePrimaer;
		iDEnergiePrimaer = newIDEnergiePrimaer;
		boolean oldIDEnergiePrimaerESet = iDEnergiePrimaerESet;
		iDEnergiePrimaerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, oldIDEnergiePrimaer, iDEnergiePrimaer, !oldIDEnergiePrimaerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEnergiePrimaer() {
		Basis_Objekt oldIDEnergiePrimaer = iDEnergiePrimaer;
		boolean oldIDEnergiePrimaerESet = iDEnergiePrimaerESet;
		iDEnergiePrimaer = null;
		iDEnergiePrimaerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER, oldIDEnergiePrimaer, null, oldIDEnergiePrimaerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEnergiePrimaer() {
		return iDEnergiePrimaerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz() {
		return energieversorgungArtErsatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz, NotificationChain msgs) {
		Energieversorgung_Art_Ersatz_TypeClass oldEnergieversorgungArtErsatz = energieversorgungArtErsatz;
		energieversorgungArtErsatz = newEnergieversorgungArtErsatz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, oldEnergieversorgungArtErsatz, newEnergieversorgungArtErsatz);
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
	public void setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz) {
		if (newEnergieversorgungArtErsatz != energieversorgungArtErsatz) {
			NotificationChain msgs = null;
			if (energieversorgungArtErsatz != null)
				msgs = ((InternalEObject)energieversorgungArtErsatz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, null, msgs);
			if (newEnergieversorgungArtErsatz != null)
				msgs = ((InternalEObject)newEnergieversorgungArtErsatz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, null, msgs);
			msgs = basicSetEnergieversorgungArtErsatz(newEnergieversorgungArtErsatz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ, newEnergieversorgungArtErsatz, newEnergieversorgungArtErsatz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz2() {
		return energieversorgungArtErsatz2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz2, NotificationChain msgs) {
		Energieversorgung_Art_Ersatz_TypeClass oldEnergieversorgungArtErsatz2 = energieversorgungArtErsatz2;
		energieversorgungArtErsatz2 = newEnergieversorgungArtErsatz2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, oldEnergieversorgungArtErsatz2, newEnergieversorgungArtErsatz2);
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
	public void setEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass newEnergieversorgungArtErsatz2) {
		if (newEnergieversorgungArtErsatz2 != energieversorgungArtErsatz2) {
			NotificationChain msgs = null;
			if (energieversorgungArtErsatz2 != null)
				msgs = ((InternalEObject)energieversorgungArtErsatz2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, null, msgs);
			if (newEnergieversorgungArtErsatz2 != null)
				msgs = ((InternalEObject)newEnergieversorgungArtErsatz2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, null, msgs);
			msgs = basicSetEnergieversorgungArtErsatz2(newEnergieversorgungArtErsatz2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2, newEnergieversorgungArtErsatz2, newEnergieversorgungArtErsatz2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDEnergieSekundaer() {
		if (iDEnergieSekundaer != null && iDEnergieSekundaer.eIsProxy()) {
			InternalEObject oldIDEnergieSekundaer = (InternalEObject)iDEnergieSekundaer;
			iDEnergieSekundaer = (Basis_Objekt)eResolveProxy(oldIDEnergieSekundaer);
			if (iDEnergieSekundaer != oldIDEnergieSekundaer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, oldIDEnergieSekundaer, iDEnergieSekundaer));
			}
		}
		return iDEnergieSekundaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDEnergieSekundaer() {
		return iDEnergieSekundaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEnergieSekundaer(Basis_Objekt newIDEnergieSekundaer) {
		Basis_Objekt oldIDEnergieSekundaer = iDEnergieSekundaer;
		iDEnergieSekundaer = newIDEnergieSekundaer;
		boolean oldIDEnergieSekundaerESet = iDEnergieSekundaerESet;
		iDEnergieSekundaerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, oldIDEnergieSekundaer, iDEnergieSekundaer, !oldIDEnergieSekundaerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEnergieSekundaer() {
		Basis_Objekt oldIDEnergieSekundaer = iDEnergieSekundaer;
		boolean oldIDEnergieSekundaerESet = iDEnergieSekundaerESet;
		iDEnergieSekundaer = null;
		iDEnergieSekundaerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER, oldIDEnergieSekundaer, null, oldIDEnergieSekundaerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEnergieSekundaer() {
		return iDEnergieSekundaerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				return basicSetEnergieversorgungArtErsatz2(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return basicSetEnergieversorgungArt(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return basicSetEnergieversorgungArtErsatz(null, msgs);
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
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				return getEnergieversorgungArtErsatz2();
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return getEnergieversorgungArt();
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				if (resolve) return getIDEnergiePrimaer();
				return basicGetIDEnergiePrimaer();
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return getEnergieversorgungArtErsatz();
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				if (resolve) return getIDEnergieSekundaer();
				return basicGetIDEnergieSekundaer();
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
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				setEnergieversorgungArtErsatz2((Energieversorgung_Art_Ersatz_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				setEnergieversorgungArt((Energieversorgung_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				setIDEnergiePrimaer((Basis_Objekt)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				setEnergieversorgungArtErsatz((Energieversorgung_Art_Ersatz_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				setIDEnergieSekundaer((Basis_Objekt)newValue);
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
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				setEnergieversorgungArtErsatz2((Energieversorgung_Art_Ersatz_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				setEnergieversorgungArt((Energieversorgung_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				unsetIDEnergiePrimaer();
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				setEnergieversorgungArtErsatz((Energieversorgung_Art_Ersatz_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				unsetIDEnergieSekundaer();
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
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
				return energieversorgungArtErsatz2 != null;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
				return energieversorgungArt != null;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_PRIMAER:
				return isSetIDEnergiePrimaer();
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
				return energieversorgungArtErsatz != null;
			case Ansteuerung_ElementPackage.ESTW_ZE_ENERGIEVERSORGUNG_ATTRIBUTE_GROUP__ID_ENERGIE_SEKUNDAER:
				return isSetIDEnergieSekundaer();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ESTW_ZE_Energieversorgung_AttributeGroupImpl
