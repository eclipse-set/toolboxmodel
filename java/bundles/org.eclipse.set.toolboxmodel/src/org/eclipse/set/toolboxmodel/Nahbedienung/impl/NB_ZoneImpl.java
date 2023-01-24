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

import org.eclipse.set.toolboxmodel.Nahbedienung.NB;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_ZoneImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_ZoneImpl#getIDNB <em>IDNB</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_ZoneImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_ZoneImpl#getNBZoneAllg <em>NB Zone Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_ZoneImpl extends Basis_ObjektImpl implements NB_Zone {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDNB() <em>IDNB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDNB()
	 * @generated
	 * @ordered
	 */
	protected NB iDNB;

	/**
	 * This is true if the IDNB reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDNBESet;

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
	 * The cached value of the '{@link #getNBZoneAllg() <em>NB Zone Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBZoneAllg()
	 * @generated
	 * @ordered
	 */
	protected NB_Zone_Allg_AttributeGroup nBZoneAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_ZoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB_Zone_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(NB_Zone_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		NB_Zone_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(NB_Zone_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NB getIDNB() {
		if (iDNB != null && iDNB.eIsProxy()) {
			InternalEObject oldIDNB = (InternalEObject)iDNB;
			iDNB = (NB)eResolveProxy(oldIDNB);
			if (iDNB != oldIDNB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_ZONE__IDNB, oldIDNB, iDNB));
			}
		}
		return iDNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NB basicGetIDNB() {
		return iDNB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDNB(NB newIDNB) {
		NB oldIDNB = iDNB;
		iDNB = newIDNB;
		boolean oldIDNBESet = iDNBESet;
		iDNBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__IDNB, oldIDNB, iDNB, !oldIDNBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDNB() {
		NB oldIDNB = iDNB;
		boolean oldIDNBESet = iDNBESet;
		iDNB = null;
		iDNBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_ZONE__IDNB, oldIDNB, null, oldIDNBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDNB() {
		return iDNBESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_ZONE__IDNB_ZONE, oldIDNBZone, iDNBZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__IDNB_ZONE, oldIDNBZone, iDNBZone, !oldIDNBZoneESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_ZONE__IDNB_ZONE, oldIDNBZone, null, oldIDNBZoneESet));
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
	public NB_Zone_Allg_AttributeGroup getNBZoneAllg() {
		return nBZoneAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBZoneAllg(NB_Zone_Allg_AttributeGroup newNBZoneAllg, NotificationChain msgs) {
		NB_Zone_Allg_AttributeGroup oldNBZoneAllg = nBZoneAllg;
		nBZoneAllg = newNBZoneAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, oldNBZoneAllg, newNBZoneAllg);
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
	public void setNBZoneAllg(NB_Zone_Allg_AttributeGroup newNBZoneAllg) {
		if (newNBZoneAllg != nBZoneAllg) {
			NotificationChain msgs = null;
			if (nBZoneAllg != null)
				msgs = ((InternalEObject)nBZoneAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, null, msgs);
			if (newNBZoneAllg != null)
				msgs = ((InternalEObject)newNBZoneAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, null, msgs);
			msgs = basicSetNBZoneAllg(newNBZoneAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG, newNBZoneAllg, newNBZoneAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				return basicSetNBZoneAllg(null, msgs);
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				return getBezeichnung();
			case NahbedienungPackage.NB_ZONE__IDNB:
				if (resolve) return getIDNB();
				return basicGetIDNB();
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				if (resolve) return getIDNBZone();
				return basicGetIDNBZone();
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				return getNBZoneAllg();
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				setBezeichnung((NB_Zone_Bezeichnung_AttributeGroup)newValue);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB:
				setIDNB((NB)newValue);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				setIDNBZone((NB_Zone)newValue);
				return;
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				setNBZoneAllg((NB_Zone_Allg_AttributeGroup)newValue);
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				setBezeichnung((NB_Zone_Bezeichnung_AttributeGroup)null);
				return;
			case NahbedienungPackage.NB_ZONE__IDNB:
				unsetIDNB();
				return;
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				unsetIDNBZone();
				return;
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				setNBZoneAllg((NB_Zone_Allg_AttributeGroup)null);
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
			case NahbedienungPackage.NB_ZONE__BEZEICHNUNG:
				return bezeichnung != null;
			case NahbedienungPackage.NB_ZONE__IDNB:
				return isSetIDNB();
			case NahbedienungPackage.NB_ZONE__IDNB_ZONE:
				return isSetIDNBZone();
			case NahbedienungPackage.NB_ZONE__NB_ZONE_ALLG:
				return nBZoneAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_ZoneImpl
