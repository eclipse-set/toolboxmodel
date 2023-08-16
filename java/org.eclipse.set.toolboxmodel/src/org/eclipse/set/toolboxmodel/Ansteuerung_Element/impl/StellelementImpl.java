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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stellelement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.StellelementImpl#getIDEnergie <em>ID Energie</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.StellelementImpl#getIDInformation <em>ID Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StellelementImpl extends Basis_ObjektImpl implements Stellelement {
	/**
	 * The cached value of the '{@link #getIDEnergie() <em>ID Energie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergie()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDEnergie;

	/**
	 * This is true if the ID Energie reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEnergieESet;

	/**
	 * The cached value of the '{@link #getIDInformation() <em>ID Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformation()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDInformation;

	/**
	 * This is true if the ID Information reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDInformationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StellelementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.STELLELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDEnergie() {
		if (iDEnergie != null && iDEnergie.eIsProxy()) {
			InternalEObject oldIDEnergie = (InternalEObject)iDEnergie;
			iDEnergie = (Aussenelementansteuerung)eResolveProxy(oldIDEnergie);
			if (iDEnergie != oldIDEnergie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, oldIDEnergie, iDEnergie));
			}
		}
		return iDEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDEnergie() {
		return iDEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEnergie(Aussenelementansteuerung newIDEnergie) {
		Aussenelementansteuerung oldIDEnergie = iDEnergie;
		iDEnergie = newIDEnergie;
		boolean oldIDEnergieESet = iDEnergieESet;
		iDEnergieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, oldIDEnergie, iDEnergie, !oldIDEnergieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEnergie() {
		Aussenelementansteuerung oldIDEnergie = iDEnergie;
		boolean oldIDEnergieESet = iDEnergieESet;
		iDEnergie = null;
		iDEnergieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE, oldIDEnergie, null, oldIDEnergieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEnergie() {
		return iDEnergieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDInformation() {
		if (iDInformation != null && iDInformation.eIsProxy()) {
			InternalEObject oldIDInformation = (InternalEObject)iDInformation;
			iDInformation = (Aussenelementansteuerung)eResolveProxy(oldIDInformation);
			if (iDInformation != oldIDInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, oldIDInformation, iDInformation));
			}
		}
		return iDInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDInformation() {
		return iDInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDInformation(Aussenelementansteuerung newIDInformation) {
		Aussenelementansteuerung oldIDInformation = iDInformation;
		iDInformation = newIDInformation;
		boolean oldIDInformationESet = iDInformationESet;
		iDInformationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, oldIDInformation, iDInformation, !oldIDInformationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDInformation() {
		Aussenelementansteuerung oldIDInformation = iDInformation;
		boolean oldIDInformationESet = iDInformationESet;
		iDInformation = null;
		iDInformationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION, oldIDInformation, null, oldIDInformationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDInformation() {
		return iDInformationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				if (resolve) return getIDEnergie();
				return basicGetIDEnergie();
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				if (resolve) return getIDInformation();
				return basicGetIDInformation();
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				setIDEnergie((Aussenelementansteuerung)newValue);
				return;
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				setIDInformation((Aussenelementansteuerung)newValue);
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				unsetIDEnergie();
				return;
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				unsetIDInformation();
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
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_ENERGIE:
				return isSetIDEnergie();
			case Ansteuerung_ElementPackage.STELLELEMENT__ID_INFORMATION:
				return isSetIDInformation();
			default:
				return super.eIsSet(featureID);
		}
	}

} //StellelementImpl
