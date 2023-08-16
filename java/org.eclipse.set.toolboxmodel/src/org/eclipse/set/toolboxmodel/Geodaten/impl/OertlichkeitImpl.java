/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Geodaten.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke_Punkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.OertlichkeitImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.OertlichkeitImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.OertlichkeitImpl#getIDOertlichkeitAwanstBedient <em>ID Oertlichkeit Awanst Bedient</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.OertlichkeitImpl#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.OertlichkeitImpl#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OertlichkeitImpl extends Basis_ObjektImpl implements Oertlichkeit {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getIDOertlichkeitAwanstBedient() <em>ID Oertlichkeit Awanst Bedient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitAwanstBedient()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeitAwanstBedient;

	/**
	 * This is true if the ID Oertlichkeit Awanst Bedient reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitAwanstBedientESet;

	/**
	 * The cached value of the '{@link #getIDStreckePunkt() <em>ID Strecke Punkt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStreckePunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Strecke_Punkt> iDStreckePunkt;

	/**
	 * The cached value of the '{@link #getOertlichkeitAllg() <em>Oertlichkeit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOertlichkeitAllg()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit_Allg_AttributeGroup oertlichkeitAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OertlichkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.OERTLICHKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Oertlichkeit_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit, !oldIDOertlichkeitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, null, oldIDOertlichkeitESet));
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
	public Oertlichkeit getIDOertlichkeitAwanstBedient() {
		if (iDOertlichkeitAwanstBedient != null && iDOertlichkeitAwanstBedient.eIsProxy()) {
			InternalEObject oldIDOertlichkeitAwanstBedient = (InternalEObject)iDOertlichkeitAwanstBedient;
			iDOertlichkeitAwanstBedient = (Oertlichkeit)eResolveProxy(oldIDOertlichkeitAwanstBedient);
			if (iDOertlichkeitAwanstBedient != oldIDOertlichkeitAwanstBedient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, oldIDOertlichkeitAwanstBedient, iDOertlichkeitAwanstBedient));
			}
		}
		return iDOertlichkeitAwanstBedient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeitAwanstBedient() {
		return iDOertlichkeitAwanstBedient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeitAwanstBedient(Oertlichkeit newIDOertlichkeitAwanstBedient) {
		Oertlichkeit oldIDOertlichkeitAwanstBedient = iDOertlichkeitAwanstBedient;
		iDOertlichkeitAwanstBedient = newIDOertlichkeitAwanstBedient;
		boolean oldIDOertlichkeitAwanstBedientESet = iDOertlichkeitAwanstBedientESet;
		iDOertlichkeitAwanstBedientESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, oldIDOertlichkeitAwanstBedient, iDOertlichkeitAwanstBedient, !oldIDOertlichkeitAwanstBedientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeitAwanstBedient() {
		Oertlichkeit oldIDOertlichkeitAwanstBedient = iDOertlichkeitAwanstBedient;
		boolean oldIDOertlichkeitAwanstBedientESet = iDOertlichkeitAwanstBedientESet;
		iDOertlichkeitAwanstBedient = null;
		iDOertlichkeitAwanstBedientESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT, oldIDOertlichkeitAwanstBedient, null, oldIDOertlichkeitAwanstBedientESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeitAwanstBedient() {
		return iDOertlichkeitAwanstBedientESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Strecke_Punkt> getIDStreckePunkt() {
		if (iDStreckePunkt == null) {
			iDStreckePunkt = new EObjectResolvingEList<Strecke_Punkt>(Strecke_Punkt.class, this, GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT);
		}
		return iDStreckePunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit_Allg_AttributeGroup getOertlichkeitAllg() {
		return oertlichkeitAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup newOertlichkeitAllg, NotificationChain msgs) {
		Oertlichkeit_Allg_AttributeGroup oldOertlichkeitAllg = oertlichkeitAllg;
		oertlichkeitAllg = newOertlichkeitAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, oldOertlichkeitAllg, newOertlichkeitAllg);
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
	public void setOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup newOertlichkeitAllg) {
		if (newOertlichkeitAllg != oertlichkeitAllg) {
			NotificationChain msgs = null;
			if (oertlichkeitAllg != null)
				msgs = ((InternalEObject)oertlichkeitAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, null, msgs);
			if (newOertlichkeitAllg != null)
				msgs = ((InternalEObject)newOertlichkeitAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, null, msgs);
			msgs = basicSetOertlichkeitAllg(newOertlichkeitAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG, newOertlichkeitAllg, newOertlichkeitAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				return basicSetOertlichkeitAllg(null, msgs);
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
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				return getBezeichnung();
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				if (resolve) return getIDOertlichkeit();
				return basicGetIDOertlichkeit();
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				if (resolve) return getIDOertlichkeitAwanstBedient();
				return basicGetIDOertlichkeitAwanstBedient();
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				return getIDStreckePunkt();
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				return getOertlichkeitAllg();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				setBezeichnung((Oertlichkeit_Bezeichnung_AttributeGroup)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				setIDOertlichkeit((Oertlichkeit)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				setIDOertlichkeitAwanstBedient((Oertlichkeit)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				getIDStreckePunkt().addAll((Collection<? extends Strecke_Punkt>)newValue);
				return;
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				setOertlichkeitAllg((Oertlichkeit_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				setBezeichnung((Oertlichkeit_Bezeichnung_AttributeGroup)null);
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				unsetIDOertlichkeit();
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				unsetIDOertlichkeitAwanstBedient();
				return;
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				return;
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				setOertlichkeitAllg((Oertlichkeit_Allg_AttributeGroup)null);
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
			case GeodatenPackage.OERTLICHKEIT__BEZEICHNUNG:
				return bezeichnung != null;
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT:
				return isSetIDOertlichkeit();
			case GeodatenPackage.OERTLICHKEIT__ID_OERTLICHKEIT_AWANST_BEDIENT:
				return isSetIDOertlichkeitAwanstBedient();
			case GeodatenPackage.OERTLICHKEIT__ID_STRECKE_PUNKT:
				return iDStreckePunkt != null && !iDStreckePunkt.isEmpty();
			case GeodatenPackage.OERTLICHKEIT__OERTLICHKEIT_ALLG:
				return oertlichkeitAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //OertlichkeitImpl
