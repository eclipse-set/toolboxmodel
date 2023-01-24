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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone;
import org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Bedien_Anzeige_ElementImpl#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Bedien_Anzeige_ElementImpl extends Basis_ObjektImpl implements NB_Bedien_Anzeige_Element {
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
	 * The cached value of the '{@link #getNBBedienAnzeigeFunktionen() <em>NB Bedien Anzeige Funktionen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBBedienAnzeigeFunktionen()
	 * @generated
	 * @ordered
	 */
	protected NB_Bedien_Anzeige_Funktionen_AttributeGroup nBBedienAnzeigeFunktionen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Bedien_Anzeige_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_BEDIEN_ANZEIGE_ELEMENT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, iDBedienAnzeigeElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, iDBedienAnzeigeElement, !oldIDBedienAnzeigeElementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, null, oldIDBedienAnzeigeElementESet));
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
	public NB_Zone getIDNBZone() {
		if (iDNBZone != null && iDNBZone.eIsProxy()) {
			InternalEObject oldIDNBZone = (InternalEObject)iDNBZone;
			iDNBZone = (NB_Zone)eResolveProxy(oldIDNBZone);
			if (iDNBZone != oldIDNBZone) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, oldIDNBZone, iDNBZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, oldIDNBZone, iDNBZone, !oldIDNBZoneESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE, oldIDNBZone, null, oldIDNBZoneESet));
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
	public NB_Bedien_Anzeige_Funktionen_AttributeGroup getNBBedienAnzeigeFunktionen() {
		return nBBedienAnzeigeFunktionen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup newNBBedienAnzeigeFunktionen, NotificationChain msgs) {
		NB_Bedien_Anzeige_Funktionen_AttributeGroup oldNBBedienAnzeigeFunktionen = nBBedienAnzeigeFunktionen;
		nBBedienAnzeigeFunktionen = newNBBedienAnzeigeFunktionen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, oldNBBedienAnzeigeFunktionen, newNBBedienAnzeigeFunktionen);
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
	public void setNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup newNBBedienAnzeigeFunktionen) {
		if (newNBBedienAnzeigeFunktionen != nBBedienAnzeigeFunktionen) {
			NotificationChain msgs = null;
			if (nBBedienAnzeigeFunktionen != null)
				msgs = ((InternalEObject)nBBedienAnzeigeFunktionen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, null, msgs);
			if (newNBBedienAnzeigeFunktionen != null)
				msgs = ((InternalEObject)newNBBedienAnzeigeFunktionen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, null, msgs);
			msgs = basicSetNBBedienAnzeigeFunktionen(newNBBedienAnzeigeFunktionen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN, newNBBedienAnzeigeFunktionen, newNBBedienAnzeigeFunktionen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				return basicSetNBBedienAnzeigeFunktionen(null, msgs);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				if (resolve) return getIDBedienAnzeigeElement();
				return basicGetIDBedienAnzeigeElement();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				if (resolve) return getIDNBZone();
				return basicGetIDNBZone();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				return getNBBedienAnzeigeFunktionen();
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((Bedien_Anzeige_Element)newValue);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				setIDNBZone((NB_Zone)newValue);
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				setNBBedienAnzeigeFunktionen((NB_Bedien_Anzeige_Funktionen_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				unsetIDBedienAnzeigeElement();
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				unsetIDNBZone();
				return;
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				setNBBedienAnzeigeFunktionen((NB_Bedien_Anzeige_Funktionen_AttributeGroup)null);
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
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT:
				return isSetIDBedienAnzeigeElement();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE:
				return isSetIDNBZone();
			case NahbedienungPackage.NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN:
				return nBBedienAnzeigeFunktionen != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Bedien_Anzeige_ElementImpl
