/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Nahbedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Zone_ElementImpl#getIDNBElement <em>IDNB Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Zone_ElementImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Zone_ElementImpl#getNBZoneElementAllg <em>NB Zone Element Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_ElementImpl extends Basis_ObjektImpl implements NB_Zone_Element {
	/**
	 * The cached value of the '{@link #getIDNBElement() <em>IDNB Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNBElement()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDNBElement;

	/**
	 * This is true if the IDNB Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDNBElementESet;

	/**
	 * The cached value of the '{@link #getIDNBZone() <em>IDNB Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNBZone()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone iDNBZone;

	/**
	 * This is true if the IDNB Zone reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDNBZoneESet;

	/**
	 * The cached value of the '{@link #getNBZoneElementAllg() <em>NB Zone Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneElementAllg()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Element_Allg_AttributeGroup nBZoneElementAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDNBElement() {
		if (iDNBElement != null && iDNBElement.eIsProxy()) {
			InternalEObject oldIDNBElement = (InternalEObject)iDNBElement;
			iDNBElement = (Basis_Objekt)eResolveProxy(oldIDNBElement);
			if (iDNBElement != oldIDNBElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, oldIDNBElement, iDNBElement));
			}
		}
		return iDNBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDNBElement() {
		return iDNBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDNBElement(Basis_Objekt newIDNBElement) {
		Basis_Objekt oldIDNBElement = iDNBElement;
		iDNBElement = newIDNBElement;
		boolean oldIDNBElementESet = iDNBElementESet;
		iDNBElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, oldIDNBElement, iDNBElement, !oldIDNBElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDNBElement() {
		Basis_Objekt oldIDNBElement = iDNBElement;
		boolean oldIDNBElementESet = iDNBElementESet;
		iDNBElement = null;
		iDNBElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT, oldIDNBElement, null, oldIDNBElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDNBElement() {
		return iDNBElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone getIDNBZone() {
		if (iDNBZone != null && iDNBZone.eIsProxy()) {
			InternalEObject oldIDNBZone = (InternalEObject)iDNBZone;
			iDNBZone = (NB_Zone)eResolveProxy(oldIDNBZone);
			if (iDNBZone != oldIDNBZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, oldIDNBZone, iDNBZone));
			}
		}
		return iDNBZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NB_Zone basicGetIDNBZone() {
		return iDNBZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDNBZone(NB_Zone newIDNBZone) {
		NB_Zone oldIDNBZone = iDNBZone;
		iDNBZone = newIDNBZone;
		boolean oldIDNBZoneESet = iDNBZoneESet;
		iDNBZoneESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, oldIDNBZone, iDNBZone, !oldIDNBZoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDNBZone() {
		NB_Zone oldIDNBZone = iDNBZone;
		boolean oldIDNBZoneESet = iDNBZoneESet;
		iDNBZone = null;
		iDNBZoneESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE, oldIDNBZone, null, oldIDNBZoneESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDNBZone() {
		return iDNBZoneESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Element_Allg_AttributeGroup getNBZoneElementAllg() {
		return nBZoneElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup newNBZoneElementAllg, NotificationChain msgs) {
		NB_Zone_Element_Allg_AttributeGroup oldNBZoneElementAllg = nBZoneElementAllg;
		nBZoneElementAllg = newNBZoneElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, oldNBZoneElementAllg, newNBZoneElementAllg);
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
	public void setNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup newNBZoneElementAllg) {
		if (newNBZoneElementAllg != nBZoneElementAllg) {
			NotificationChain msgs = null;
			if (nBZoneElementAllg != null)
				msgs = ((InternalEObject)nBZoneElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, null, msgs);
			if (newNBZoneElementAllg != null)
				msgs = ((InternalEObject)newNBZoneElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, null, msgs);
			msgs = basicSetNBZoneElementAllg(newNBZoneElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG, newNBZoneElementAllg, newNBZoneElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				return basicSetNBZoneElementAllg(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				if (resolve) return getIDNBElement();
				return basicGetIDNBElement();
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				if (resolve) return getIDNBZone();
				return basicGetIDNBZone();
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				return getNBZoneElementAllg();
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				setIDNBElement((Basis_Objekt)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				setIDNBZone((NB_Zone)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				setNBZoneElementAllg((NB_Zone_Element_Allg_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				unsetIDNBElement();
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				unsetIDNBZone();
				return;
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				setNBZoneElementAllg((NB_Zone_Element_Allg_AttributeGroup)null);
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
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ELEMENT:
				return isSetIDNBElement();
			case NahbedienungPackage.NB_ZONE_ELEMENT__IDNB_ZONE:
				return isSetIDNBZone();
			case NahbedienungPackage.NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG:
				return nBZoneElementAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Zone_ElementImpl
