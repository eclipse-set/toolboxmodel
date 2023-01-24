/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Abhaengigkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl#getFstrAbhaengigkeitSsp <em>Fstr Abhaengigkeit Ssp</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_AbhaengigkeitImpl#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_AbhaengigkeitImpl extends Basis_ObjektImpl implements Fstr_Abhaengigkeit {
	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Fahrweg iDFstrFahrweg;

	/**
	 * This is true if the ID Fstr Fahrweg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrFahrwegESet;

	/**
	 * The cached value of the '{@link #getFstrAbhaengigkeitSsp() <em>Fstr Abhaengigkeit Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrAbhaengigkeitSsp()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Abhaengigkeit_Ssp_AttributeGroup fstrAbhaengigkeitSsp;

	/**
	 * The cached value of the '{@link #getIDBedienAnzeigeElement() <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element iDBedienAnzeigeElement;

	/**
	 * This is true if the ID Bedien Anzeige Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienAnzeigeElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_AbhaengigkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ABHAENGIGKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Fahrweg getIDFstrFahrweg() {
		if (iDFstrFahrweg != null && iDFstrFahrweg.eIsProxy()) {
			InternalEObject oldIDFstrFahrweg = (InternalEObject)iDFstrFahrweg;
			iDFstrFahrweg = (Fstr_Fahrweg)eResolveProxy(oldIDFstrFahrweg);
			if (iDFstrFahrweg != oldIDFstrFahrweg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg));
			}
		}
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Fahrweg basicGetIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrFahrweg(Fstr_Fahrweg newIDFstrFahrweg) {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrwegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg, !oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrFahrweg() {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrweg = null;
		iDFstrFahrwegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, null, oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrFahrweg() {
		return iDFstrFahrwegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Abhaengigkeit_Ssp_AttributeGroup getFstrAbhaengigkeitSsp() {
		return fstrAbhaengigkeitSsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrAbhaengigkeitSsp(Fstr_Abhaengigkeit_Ssp_AttributeGroup newFstrAbhaengigkeitSsp, NotificationChain msgs) {
		Fstr_Abhaengigkeit_Ssp_AttributeGroup oldFstrAbhaengigkeitSsp = fstrAbhaengigkeitSsp;
		fstrAbhaengigkeitSsp = newFstrAbhaengigkeitSsp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, oldFstrAbhaengigkeitSsp, newFstrAbhaengigkeitSsp);
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
	public void setFstrAbhaengigkeitSsp(Fstr_Abhaengigkeit_Ssp_AttributeGroup newFstrAbhaengigkeitSsp) {
		if (newFstrAbhaengigkeitSsp != fstrAbhaengigkeitSsp) {
			NotificationChain msgs = null;
			if (fstrAbhaengigkeitSsp != null)
				msgs = ((InternalEObject)fstrAbhaengigkeitSsp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, null, msgs);
			if (newFstrAbhaengigkeitSsp != null)
				msgs = ((InternalEObject)newFstrAbhaengigkeitSsp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, null, msgs);
			msgs = basicSetFstrAbhaengigkeitSsp(newFstrAbhaengigkeitSsp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP, newFstrAbhaengigkeitSsp, newFstrAbhaengigkeitSsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element getIDBedienAnzeigeElement() {
		if (iDBedienAnzeigeElement != null && iDBedienAnzeigeElement.eIsProxy()) {
			InternalEObject oldIDBedienAnzeigeElement = (InternalEObject)iDBedienAnzeigeElement;
			iDBedienAnzeigeElement = (Bedien_Anzeige_Element)eResolveProxy(oldIDBedienAnzeigeElement);
			if (iDBedienAnzeigeElement != oldIDBedienAnzeigeElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, iDBedienAnzeigeElement));
			}
		}
		return iDBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Anzeige_Element basicGetIDBedienAnzeigeElement() {
		return iDBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienAnzeigeElement(Bedien_Anzeige_Element newIDBedienAnzeigeElement) {
		Bedien_Anzeige_Element oldIDBedienAnzeigeElement = iDBedienAnzeigeElement;
		iDBedienAnzeigeElement = newIDBedienAnzeigeElement;
		boolean oldIDBedienAnzeigeElementESet = iDBedienAnzeigeElementESet;
		iDBedienAnzeigeElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, iDBedienAnzeigeElement, !oldIDBedienAnzeigeElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienAnzeigeElement() {
		Bedien_Anzeige_Element oldIDBedienAnzeigeElement = iDBedienAnzeigeElement;
		boolean oldIDBedienAnzeigeElementESet = iDBedienAnzeigeElementESet;
		iDBedienAnzeigeElement = null;
		iDBedienAnzeigeElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, null, oldIDBedienAnzeigeElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienAnzeigeElement() {
		return iDBedienAnzeigeElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				return basicSetFstrAbhaengigkeitSsp(null, msgs);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				if (resolve) return getIDFstrFahrweg();
				return basicGetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				return getFstrAbhaengigkeitSsp();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				if (resolve) return getIDBedienAnzeigeElement();
				return basicGetIDBedienAnzeigeElement();
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((Fstr_Fahrweg)newValue);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				setFstrAbhaengigkeitSsp((Fstr_Abhaengigkeit_Ssp_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((Bedien_Anzeige_Element)newValue);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				unsetIDFstrFahrweg();
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				setFstrAbhaengigkeitSsp((Fstr_Abhaengigkeit_Ssp_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				unsetIDBedienAnzeigeElement();
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_FSTR_FAHRWEG:
				return isSetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__FSTR_ABHAENGIGKEIT_SSP:
				return fstrAbhaengigkeitSsp != null;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return isSetIDBedienAnzeigeElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_AbhaengigkeitImpl
