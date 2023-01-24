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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Aufloesung_Ssp_Zielgleis_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Abhaengigkeit Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl#getAufloesungSspZielgleis <em>Aufloesung Ssp Zielgleis</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fstr_Abhaengigkeit_Ssp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAufloesungSspZielgleis() <em>Aufloesung Ssp Zielgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufloesungSspZielgleis()
	 * @generated
	 * @ordered
	 */
	protected Aufloesung_Ssp_Zielgleis_TypeClass aufloesungSspZielgleis;

	/**
	 * The cached value of the '{@link #getIDSchluesselsperre() <em>ID Schluesselsperre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchluesselsperre()
	 * @generated
	 * @ordered
	 */
	protected Schluesselsperre iDSchluesselsperre;

	/**
	 * This is true if the ID Schluesselsperre reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSchluesselsperreESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aufloesung_Ssp_Zielgleis_TypeClass getAufloesungSspZielgleis() {
		return aufloesungSspZielgleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufloesungSspZielgleis(Aufloesung_Ssp_Zielgleis_TypeClass newAufloesungSspZielgleis, NotificationChain msgs) {
		Aufloesung_Ssp_Zielgleis_TypeClass oldAufloesungSspZielgleis = aufloesungSspZielgleis;
		aufloesungSspZielgleis = newAufloesungSspZielgleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, oldAufloesungSspZielgleis, newAufloesungSspZielgleis);
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
	public void setAufloesungSspZielgleis(Aufloesung_Ssp_Zielgleis_TypeClass newAufloesungSspZielgleis) {
		if (newAufloesungSspZielgleis != aufloesungSspZielgleis) {
			NotificationChain msgs = null;
			if (aufloesungSspZielgleis != null)
				msgs = ((InternalEObject)aufloesungSspZielgleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, null, msgs);
			if (newAufloesungSspZielgleis != null)
				msgs = ((InternalEObject)newAufloesungSspZielgleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, null, msgs);
			msgs = basicSetAufloesungSspZielgleis(newAufloesungSspZielgleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS, newAufloesungSspZielgleis, newAufloesungSspZielgleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluesselsperre getIDSchluesselsperre() {
		if (iDSchluesselsperre != null && iDSchluesselsperre.eIsProxy()) {
			InternalEObject oldIDSchluesselsperre = (InternalEObject)iDSchluesselsperre;
			iDSchluesselsperre = (Schluesselsperre)eResolveProxy(oldIDSchluesselsperre);
			if (iDSchluesselsperre != oldIDSchluesselsperre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, iDSchluesselsperre));
			}
		}
		return iDSchluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schluesselsperre basicGetIDSchluesselsperre() {
		return iDSchluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSchluesselsperre(Schluesselsperre newIDSchluesselsperre) {
		Schluesselsperre oldIDSchluesselsperre = iDSchluesselsperre;
		iDSchluesselsperre = newIDSchluesselsperre;
		boolean oldIDSchluesselsperreESet = iDSchluesselsperreESet;
		iDSchluesselsperreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, iDSchluesselsperre, !oldIDSchluesselsperreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSchluesselsperre() {
		Schluesselsperre oldIDSchluesselsperre = iDSchluesselsperre;
		boolean oldIDSchluesselsperreESet = iDSchluesselsperreESet;
		iDSchluesselsperre = null;
		iDSchluesselsperreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, null, oldIDSchluesselsperreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSchluesselsperre() {
		return iDSchluesselsperreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				return basicSetAufloesungSspZielgleis(null, msgs);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				return getAufloesungSspZielgleis();
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				if (resolve) return getIDSchluesselsperre();
				return basicGetIDSchluesselsperre();
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				setAufloesungSspZielgleis((Aufloesung_Ssp_Zielgleis_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				setIDSchluesselsperre((Schluesselsperre)newValue);
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				setAufloesungSspZielgleis((Aufloesung_Ssp_Zielgleis_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				unsetIDSchluesselsperre();
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
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__AUFLOESUNG_SSP_ZIELGLEIS:
				return aufloesungSspZielgleis != null;
			case FahrstrassePackage.FSTR_ABHAENGIGKEIT_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				return isSetIDSchluesselsperre();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_Abhaengigkeit_Ssp_AttributeGroupImpl
