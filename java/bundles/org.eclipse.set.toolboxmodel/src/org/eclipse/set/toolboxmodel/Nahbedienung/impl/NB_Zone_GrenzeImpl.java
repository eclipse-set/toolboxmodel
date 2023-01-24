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

import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Grenze_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone;
import org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Grenze;
import org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NB Zone Grenze</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Zone_GrenzeImpl#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Zone_GrenzeImpl#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.impl.NB_Zone_GrenzeImpl#getNBGrenzeArt <em>NB Grenze Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NB_Zone_GrenzeImpl extends Basis_ObjektImpl implements NB_Zone_Grenze {
	/**
	 * The cached value of the '{@link #getIDMarkanterPunkt() <em>ID Markanter Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDMarkanterPunkt;

	/**
	 * This is true if the ID Markanter Punkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDMarkanterPunktESet;

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
	 * The cached value of the '{@link #getNBGrenzeArt() <em>NB Grenze Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNBGrenzeArt()
	 * @generated
	 * @ordered
	 */
	protected NB_Grenze_Art_TypeClass nBGrenzeArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NB_Zone_GrenzeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NahbedienungPackage.Literals.NB_ZONE_GRENZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDMarkanterPunkt() {
		if (iDMarkanterPunkt != null && iDMarkanterPunkt.eIsProxy()) {
			InternalEObject oldIDMarkanterPunkt = (InternalEObject)iDMarkanterPunkt;
			iDMarkanterPunkt = (Markanter_Punkt)eResolveProxy(oldIDMarkanterPunkt);
			if (iDMarkanterPunkt != oldIDMarkanterPunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, iDMarkanterPunkt));
			}
		}
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDMarkanterPunkt() {
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDMarkanterPunkt(Markanter_Punkt newIDMarkanterPunkt) {
		Markanter_Punkt oldIDMarkanterPunkt = iDMarkanterPunkt;
		iDMarkanterPunkt = newIDMarkanterPunkt;
		boolean oldIDMarkanterPunktESet = iDMarkanterPunktESet;
		iDMarkanterPunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, iDMarkanterPunkt, !oldIDMarkanterPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDMarkanterPunkt() {
		Markanter_Punkt oldIDMarkanterPunkt = iDMarkanterPunkt;
		boolean oldIDMarkanterPunktESet = iDMarkanterPunktESet;
		iDMarkanterPunkt = null;
		iDMarkanterPunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, null, oldIDMarkanterPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDMarkanterPunkt() {
		return iDMarkanterPunktESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, oldIDNBZone, iDNBZone));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, oldIDNBZone, iDNBZone, !oldIDNBZoneESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE, oldIDNBZone, null, oldIDNBZoneESet));
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
	public NB_Grenze_Art_TypeClass getNBGrenzeArt() {
		return nBGrenzeArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNBGrenzeArt(NB_Grenze_Art_TypeClass newNBGrenzeArt, NotificationChain msgs) {
		NB_Grenze_Art_TypeClass oldNBGrenzeArt = nBGrenzeArt;
		nBGrenzeArt = newNBGrenzeArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, oldNBGrenzeArt, newNBGrenzeArt);
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
	public void setNBGrenzeArt(NB_Grenze_Art_TypeClass newNBGrenzeArt) {
		if (newNBGrenzeArt != nBGrenzeArt) {
			NotificationChain msgs = null;
			if (nBGrenzeArt != null)
				msgs = ((InternalEObject)nBGrenzeArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, null, msgs);
			if (newNBGrenzeArt != null)
				msgs = ((InternalEObject)newNBGrenzeArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, null, msgs);
			msgs = basicSetNBGrenzeArt(newNBGrenzeArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART, newNBGrenzeArt, newNBGrenzeArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				return basicSetNBGrenzeArt(null, msgs);
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				if (resolve) return getIDMarkanterPunkt();
				return basicGetIDMarkanterPunkt();
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				if (resolve) return getIDNBZone();
				return basicGetIDNBZone();
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				return getNBGrenzeArt();
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((Markanter_Punkt)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				setIDNBZone((NB_Zone)newValue);
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				setNBGrenzeArt((NB_Grenze_Art_TypeClass)newValue);
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				unsetIDMarkanterPunkt();
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				unsetIDNBZone();
				return;
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				setNBGrenzeArt((NB_Grenze_Art_TypeClass)null);
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
			case NahbedienungPackage.NB_ZONE_GRENZE__ID_MARKANTER_PUNKT:
				return isSetIDMarkanterPunkt();
			case NahbedienungPackage.NB_ZONE_GRENZE__IDNB_ZONE:
				return isSetIDNBZone();
			case NahbedienungPackage.NB_ZONE_GRENZE__NB_GRENZE_ART:
				return nBGrenzeArt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //NB_Zone_GrenzeImpl
