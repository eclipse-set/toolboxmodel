/**
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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Knoten;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GEO Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_PunktImpl#getGEOPunktAllg <em>GEO Punkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_PunktImpl#getIDGEOKante <em>IDGEO Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.GEO_PunktImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GEO_PunktImpl extends Basis_ObjektImpl implements GEO_Punkt {
	/**
	 * The cached value of the '{@link #getGEOPunktAllg() <em>GEO Punkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGEOPunktAllg()
	 * @generated
	 * @ordered
	 */
	protected GEO_Punkt_Allg_AttributeGroup gEOPunktAllg;

	/**
	 * The cached value of the '{@link #getIDGEOKante() <em>IDGEO Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKante()
	 * @generated
	 * @ordered
	 */
	protected GEO_Kante iDGEOKante;

	/**
	 * This is true if the IDGEO Kante reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOKanteESet;

	/**
	 * The cached value of the '{@link #getIDGEOKnoten() <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnoten()
	 * @generated
	 * @ordered
	 */
	protected GEO_Knoten iDGEOKnoten;

	/**
	 * This is true if the IDGEO Knoten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOKnotenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GEO_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.GEO_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Punkt_Allg_AttributeGroup getGEOPunktAllg() {
		return gEOPunktAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup newGEOPunktAllg, NotificationChain msgs) {
		GEO_Punkt_Allg_AttributeGroup oldGEOPunktAllg = gEOPunktAllg;
		gEOPunktAllg = newGEOPunktAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, oldGEOPunktAllg, newGEOPunktAllg);
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
	public void setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup newGEOPunktAllg) {
		if (newGEOPunktAllg != gEOPunktAllg) {
			NotificationChain msgs = null;
			if (gEOPunktAllg != null)
				msgs = ((InternalEObject)gEOPunktAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, null, msgs);
			if (newGEOPunktAllg != null)
				msgs = ((InternalEObject)newGEOPunktAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, null, msgs);
			msgs = basicSetGEOPunktAllg(newGEOPunktAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG, newGEOPunktAllg, newGEOPunktAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Kante getIDGEOKante() {
		if (iDGEOKante != null && iDGEOKante.eIsProxy()) {
			InternalEObject oldIDGEOKante = (InternalEObject)iDGEOKante;
			iDGEOKante = (GEO_Kante)eResolveProxy(oldIDGEOKante);
			if (iDGEOKante != oldIDGEOKante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.GEO_PUNKT__IDGEO_KANTE, oldIDGEOKante, iDGEOKante));
			}
		}
		return iDGEOKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEO_Kante basicGetIDGEOKante() {
		return iDGEOKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOKante(GEO_Kante newIDGEOKante) {
		GEO_Kante oldIDGEOKante = iDGEOKante;
		iDGEOKante = newIDGEOKante;
		boolean oldIDGEOKanteESet = iDGEOKanteESet;
		iDGEOKanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__IDGEO_KANTE, oldIDGEOKante, iDGEOKante, !oldIDGEOKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOKante() {
		GEO_Kante oldIDGEOKante = iDGEOKante;
		boolean oldIDGEOKanteESet = iDGEOKanteESet;
		iDGEOKante = null;
		iDGEOKanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.GEO_PUNKT__IDGEO_KANTE, oldIDGEOKante, null, oldIDGEOKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOKante() {
		return iDGEOKanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Knoten getIDGEOKnoten() {
		if (iDGEOKnoten != null && iDGEOKnoten.eIsProxy()) {
			InternalEObject oldIDGEOKnoten = (InternalEObject)iDGEOKnoten;
			iDGEOKnoten = (GEO_Knoten)eResolveProxy(oldIDGEOKnoten);
			if (iDGEOKnoten != oldIDGEOKnoten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten));
			}
		}
		return iDGEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEO_Knoten basicGetIDGEOKnoten() {
		return iDGEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOKnoten(GEO_Knoten newIDGEOKnoten) {
		GEO_Knoten oldIDGEOKnoten = iDGEOKnoten;
		iDGEOKnoten = newIDGEOKnoten;
		boolean oldIDGEOKnotenESet = iDGEOKnotenESet;
		iDGEOKnotenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten, !oldIDGEOKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOKnoten() {
		GEO_Knoten oldIDGEOKnoten = iDGEOKnoten;
		boolean oldIDGEOKnotenESet = iDGEOKnotenESet;
		iDGEOKnoten = null;
		iDGEOKnotenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, null, oldIDGEOKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOKnoten() {
		return iDGEOKnotenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				return basicSetGEOPunktAllg(null, msgs);
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				return getGEOPunktAllg();
			case GeodatenPackage.GEO_PUNKT__IDGEO_KANTE:
				if (resolve) return getIDGEOKante();
				return basicGetIDGEOKante();
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				if (resolve) return getIDGEOKnoten();
				return basicGetIDGEOKnoten();
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				setGEOPunktAllg((GEO_Punkt_Allg_AttributeGroup)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KANTE:
				setIDGEOKante((GEO_Kante)newValue);
				return;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				setIDGEOKnoten((GEO_Knoten)newValue);
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				setGEOPunktAllg((GEO_Punkt_Allg_AttributeGroup)null);
				return;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KANTE:
				unsetIDGEOKante();
				return;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				unsetIDGEOKnoten();
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
			case GeodatenPackage.GEO_PUNKT__GEO_PUNKT_ALLG:
				return gEOPunktAllg != null;
			case GeodatenPackage.GEO_PUNKT__IDGEO_KANTE:
				return isSetIDGEOKante();
			case GeodatenPackage.GEO_PUNKT__IDGEO_KNOTEN:
				return isSetIDGEOKnoten();
			default:
				return super.eIsSet(featureID);
		}
	}

} //GEO_PunktImpl
