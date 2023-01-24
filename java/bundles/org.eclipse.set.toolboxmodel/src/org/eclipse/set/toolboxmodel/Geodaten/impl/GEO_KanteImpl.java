/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Knoten;
import org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_KanteImpl#getGEOKanteAllg <em>GEO Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_KanteImpl#getIDGEOArt <em>IDGEO Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_KanteImpl#getIDGEOKnotenA <em>IDGEO Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_KanteImpl#getIDGEOKnotenB <em>IDGEO Knoten B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_KanteImpl extends Basis_ObjektImpl implements GEO_Kante {
	/**
	 * The cached value of the '{@link #getGEOKanteAllg() <em>GEO Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOKanteAllg()
	 * @generated
	 * @ordered
	 */
	protected GEO_Kante_Allg_AttributeGroup gEOKanteAllg;

	/**
	 * The cached value of the '{@link #getIDGEOArt() <em>IDGEO Art</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOArt()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDGEOArt;

	/**
	 * This is true if the IDGEO Art reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOArtESet;

	/**
	 * The cached value of the '{@link #getIDGEOKnotenA() <em>IDGEO Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnotenA()
	 * @generated
	 * @ordered
	 */
	protected GEO_Knoten iDGEOKnotenA;

	/**
	 * This is true if the IDGEO Knoten A reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOKnotenAESet;

	/**
	 * The cached value of the '{@link #getIDGEOKnotenB() <em>IDGEO Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnotenB()
	 * @generated
	 * @ordered
	 */
	protected GEO_Knoten iDGEOKnotenB;

	/**
	 * This is true if the IDGEO Knoten B reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOKnotenBESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Kante_Allg_AttributeGroup getGEOKanteAllg() {
		return gEOKanteAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOKanteAllg(GEO_Kante_Allg_AttributeGroup newGEOKanteAllg, NotificationChain msgs) {
		GEO_Kante_Allg_AttributeGroup oldGEOKanteAllg = gEOKanteAllg;
		gEOKanteAllg = newGEOKanteAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, oldGEOKanteAllg, newGEOKanteAllg);
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
	public void setGEOKanteAllg(GEO_Kante_Allg_AttributeGroup newGEOKanteAllg) {
		if (newGEOKanteAllg != gEOKanteAllg) {
			NotificationChain msgs = null;
			if (gEOKanteAllg != null)
				msgs = ((InternalEObject)gEOKanteAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, null, msgs);
			if (newGEOKanteAllg != null)
				msgs = ((InternalEObject)newGEOKanteAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, null, msgs);
			msgs = basicSetGEOKanteAllg(newGEOKanteAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG, newGEOKanteAllg, newGEOKanteAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDGEOArt() {
		if (iDGEOArt != null && iDGEOArt.eIsProxy()) {
			InternalEObject oldIDGEOArt = (InternalEObject)iDGEOArt;
			iDGEOArt = (Basis_Objekt)eResolveProxy(oldIDGEOArt);
			if (iDGEOArt != oldIDGEOArt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.GEO_KANTE__IDGEO_ART, oldIDGEOArt, iDGEOArt));
			}
		}
		return iDGEOArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDGEOArt() {
		return iDGEOArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOArt(Basis_Objekt newIDGEOArt) {
		Basis_Objekt oldIDGEOArt = iDGEOArt;
		iDGEOArt = newIDGEOArt;
		boolean oldIDGEOArtESet = iDGEOArtESet;
		iDGEOArtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_ART, oldIDGEOArt, iDGEOArt, !oldIDGEOArtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOArt() {
		Basis_Objekt oldIDGEOArt = iDGEOArt;
		boolean oldIDGEOArtESet = iDGEOArtESet;
		iDGEOArt = null;
		iDGEOArtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.GEO_KANTE__IDGEO_ART, oldIDGEOArt, null, oldIDGEOArtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOArt() {
		return iDGEOArtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Knoten getIDGEOKnotenA() {
		if (iDGEOKnotenA != null && iDGEOKnotenA.eIsProxy()) {
			InternalEObject oldIDGEOKnotenA = (InternalEObject)iDGEOKnotenA;
			iDGEOKnotenA = (GEO_Knoten)eResolveProxy(oldIDGEOKnotenA);
			if (iDGEOKnotenA != oldIDGEOKnotenA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, oldIDGEOKnotenA, iDGEOKnotenA));
			}
		}
		return iDGEOKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEO_Knoten basicGetIDGEOKnotenA() {
		return iDGEOKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOKnotenA(GEO_Knoten newIDGEOKnotenA) {
		GEO_Knoten oldIDGEOKnotenA = iDGEOKnotenA;
		iDGEOKnotenA = newIDGEOKnotenA;
		boolean oldIDGEOKnotenAESet = iDGEOKnotenAESet;
		iDGEOKnotenAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, oldIDGEOKnotenA, iDGEOKnotenA, !oldIDGEOKnotenAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOKnotenA() {
		GEO_Knoten oldIDGEOKnotenA = iDGEOKnotenA;
		boolean oldIDGEOKnotenAESet = iDGEOKnotenAESet;
		iDGEOKnotenA = null;
		iDGEOKnotenAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A, oldIDGEOKnotenA, null, oldIDGEOKnotenAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOKnotenA() {
		return iDGEOKnotenAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Knoten getIDGEOKnotenB() {
		if (iDGEOKnotenB != null && iDGEOKnotenB.eIsProxy()) {
			InternalEObject oldIDGEOKnotenB = (InternalEObject)iDGEOKnotenB;
			iDGEOKnotenB = (GEO_Knoten)eResolveProxy(oldIDGEOKnotenB);
			if (iDGEOKnotenB != oldIDGEOKnotenB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, oldIDGEOKnotenB, iDGEOKnotenB));
			}
		}
		return iDGEOKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEO_Knoten basicGetIDGEOKnotenB() {
		return iDGEOKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOKnotenB(GEO_Knoten newIDGEOKnotenB) {
		GEO_Knoten oldIDGEOKnotenB = iDGEOKnotenB;
		iDGEOKnotenB = newIDGEOKnotenB;
		boolean oldIDGEOKnotenBESet = iDGEOKnotenBESet;
		iDGEOKnotenBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, oldIDGEOKnotenB, iDGEOKnotenB, !oldIDGEOKnotenBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOKnotenB() {
		GEO_Knoten oldIDGEOKnotenB = iDGEOKnotenB;
		boolean oldIDGEOKnotenBESet = iDGEOKnotenBESet;
		iDGEOKnotenB = null;
		iDGEOKnotenBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B, oldIDGEOKnotenB, null, oldIDGEOKnotenBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOKnotenB() {
		return iDGEOKnotenBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				return basicSetGEOKanteAllg(null, msgs);
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				return getGEOKanteAllg();
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				if (resolve) return getIDGEOArt();
				return basicGetIDGEOArt();
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				if (resolve) return getIDGEOKnotenA();
				return basicGetIDGEOKnotenA();
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				if (resolve) return getIDGEOKnotenB();
				return basicGetIDGEOKnotenB();
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				setGEOKanteAllg((GEO_Kante_Allg_AttributeGroup)newValue);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				setIDGEOArt((Basis_Objekt)newValue);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				setIDGEOKnotenA((GEO_Knoten)newValue);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				setIDGEOKnotenB((GEO_Knoten)newValue);
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				setGEOKanteAllg((GEO_Kante_Allg_AttributeGroup)null);
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				unsetIDGEOArt();
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				unsetIDGEOKnotenA();
				return;
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				unsetIDGEOKnotenB();
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
			case GeodatenPackage.GEO_KANTE__GEO_KANTE_ALLG:
				return gEOKanteAllg != null;
			case GeodatenPackage.GEO_KANTE__IDGEO_ART:
				return isSetIDGEOArt();
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_A:
				return isSetIDGEOKnotenA();
			case GeodatenPackage.GEO_KANTE__IDGEO_KNOTEN_B:
				return isSetIDGEOKnotenB();
			default:
				return super.eIsSet(featureID);
		}
	}

} //GEO_KanteImpl
