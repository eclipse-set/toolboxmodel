/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Zentrale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_ZentraleImpl#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_ZentraleImpl#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_ZentraleImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_ZentraleImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_ZentraleImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_ZentraleImpl extends Basis_ObjektImpl implements Bedien_Zentrale {
	/**
	 * The cached value of the '{@link #getIDAnhangPlanBedienraum() <em>ID Anhang Plan Bedienraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangPlanBedienraum()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangPlanBedienraum;

	/**
	 * This is true if the ID Anhang Plan Bedienraum reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangPlanBedienraumESet;

	/**
	 * The cached value of the '{@link #getIDAnhangPlanRechnerraum() <em>ID Anhang Plan Rechnerraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangPlanRechnerraum()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangPlanRechnerraum;

	/**
	 * This is true if the ID Anhang Plan Rechnerraum reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangPlanRechnerraumESet;

	/**
	 * The cached value of the '{@link #getIDStrecke() <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStrecke()
	 * @generated
	 * @ordered
	 */
	protected Strecke iDStrecke;

	/**
	 * This is true if the ID Strecke reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStreckeESet;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Zentrale_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeit;

	/**
	 * This is true if the ID Oertlichkeit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_ZentraleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ZENTRALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangPlanBedienraum() {
		if (iDAnhangPlanBedienraum != null && iDAnhangPlanBedienraum.eIsProxy()) {
			InternalEObject oldIDAnhangPlanBedienraum = (InternalEObject)iDAnhangPlanBedienraum;
			iDAnhangPlanBedienraum = (Anhang)eResolveProxy(oldIDAnhangPlanBedienraum);
			if (iDAnhangPlanBedienraum != oldIDAnhangPlanBedienraum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, oldIDAnhangPlanBedienraum, iDAnhangPlanBedienraum));
			}
		}
		return iDAnhangPlanBedienraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangPlanBedienraum() {
		return iDAnhangPlanBedienraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangPlanBedienraum(Anhang newIDAnhangPlanBedienraum) {
		Anhang oldIDAnhangPlanBedienraum = iDAnhangPlanBedienraum;
		iDAnhangPlanBedienraum = newIDAnhangPlanBedienraum;
		boolean oldIDAnhangPlanBedienraumESet = iDAnhangPlanBedienraumESet;
		iDAnhangPlanBedienraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, oldIDAnhangPlanBedienraum, iDAnhangPlanBedienraum, !oldIDAnhangPlanBedienraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangPlanBedienraum() {
		Anhang oldIDAnhangPlanBedienraum = iDAnhangPlanBedienraum;
		boolean oldIDAnhangPlanBedienraumESet = iDAnhangPlanBedienraumESet;
		iDAnhangPlanBedienraum = null;
		iDAnhangPlanBedienraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM, oldIDAnhangPlanBedienraum, null, oldIDAnhangPlanBedienraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangPlanBedienraum() {
		return iDAnhangPlanBedienraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangPlanRechnerraum() {
		if (iDAnhangPlanRechnerraum != null && iDAnhangPlanRechnerraum.eIsProxy()) {
			InternalEObject oldIDAnhangPlanRechnerraum = (InternalEObject)iDAnhangPlanRechnerraum;
			iDAnhangPlanRechnerraum = (Anhang)eResolveProxy(oldIDAnhangPlanRechnerraum);
			if (iDAnhangPlanRechnerraum != oldIDAnhangPlanRechnerraum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, oldIDAnhangPlanRechnerraum, iDAnhangPlanRechnerraum));
			}
		}
		return iDAnhangPlanRechnerraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangPlanRechnerraum() {
		return iDAnhangPlanRechnerraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangPlanRechnerraum(Anhang newIDAnhangPlanRechnerraum) {
		Anhang oldIDAnhangPlanRechnerraum = iDAnhangPlanRechnerraum;
		iDAnhangPlanRechnerraum = newIDAnhangPlanRechnerraum;
		boolean oldIDAnhangPlanRechnerraumESet = iDAnhangPlanRechnerraumESet;
		iDAnhangPlanRechnerraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, oldIDAnhangPlanRechnerraum, iDAnhangPlanRechnerraum, !oldIDAnhangPlanRechnerraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangPlanRechnerraum() {
		Anhang oldIDAnhangPlanRechnerraum = iDAnhangPlanRechnerraum;
		boolean oldIDAnhangPlanRechnerraumESet = iDAnhangPlanRechnerraumESet;
		iDAnhangPlanRechnerraum = null;
		iDAnhangPlanRechnerraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM, oldIDAnhangPlanRechnerraum, null, oldIDAnhangPlanRechnerraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangPlanRechnerraum() {
		return iDAnhangPlanRechnerraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke getIDStrecke() {
		if (iDStrecke != null && iDStrecke.eIsProxy()) {
			InternalEObject oldIDStrecke = (InternalEObject)iDStrecke;
			iDStrecke = (Strecke)eResolveProxy(oldIDStrecke);
			if (iDStrecke != oldIDStrecke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, oldIDStrecke, iDStrecke));
			}
		}
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strecke basicGetIDStrecke() {
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStrecke(Strecke newIDStrecke) {
		Strecke oldIDStrecke = iDStrecke;
		iDStrecke = newIDStrecke;
		boolean oldIDStreckeESet = iDStreckeESet;
		iDStreckeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, oldIDStrecke, iDStrecke, !oldIDStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStrecke() {
		Strecke oldIDStrecke = iDStrecke;
		boolean oldIDStreckeESet = iDStreckeESet;
		iDStrecke = null;
		iDStreckeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE, oldIDStrecke, null, oldIDStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStrecke() {
		return iDStreckeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Zentrale_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Zentrale_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Zentrale_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Zentrale_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeit() {
		if (iDOertlichkeit != null && iDOertlichkeit.eIsProxy()) {
			InternalEObject oldIDOertlichkeit = (InternalEObject)iDOertlichkeit;
			iDOertlichkeit = (Oertlichkeit)eResolveProxy(oldIDOertlichkeit);
			if (iDOertlichkeit != oldIDOertlichkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit));
			}
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeit(Oertlichkeit newIDOertlichkeit) {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit, !oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeit() {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeit = null;
		iDOertlichkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT, oldIDOertlichkeit, null, oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeit() {
		return iDOertlichkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				if (resolve) return getIDAnhangPlanBedienraum();
				return basicGetIDAnhangPlanBedienraum();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				if (resolve) return getIDAnhangPlanRechnerraum();
				return basicGetIDAnhangPlanRechnerraum();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				if (resolve) return getIDStrecke();
				return basicGetIDStrecke();
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				if (resolve) return getIDOertlichkeit();
				return basicGetIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				setIDAnhangPlanBedienraum((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				setIDAnhangPlanRechnerraum((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				setIDStrecke((Strecke)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				setBezeichnung((Bedien_Zentrale_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				setIDOertlichkeit((Oertlichkeit)newValue);
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				unsetIDAnhangPlanBedienraum();
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				unsetIDAnhangPlanRechnerraum();
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				unsetIDStrecke();
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				setBezeichnung((Bedien_Zentrale_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				unsetIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_BEDIENRAUM:
				return isSetIDAnhangPlanBedienraum();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_ANHANG_PLAN_RECHNERRAUM:
				return isSetIDAnhangPlanRechnerraum();
			case BedienungPackage.BEDIEN_ZENTRALE__ID_STRECKE:
				return isSetIDStrecke();
			case BedienungPackage.BEDIEN_ZENTRALE__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_ZENTRALE__ID_OERTLICHKEIT:
				return isSetIDOertlichkeit();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_ZentraleImpl
