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

import org.eclipse.set.toolboxmodel.Geodaten.GEO_Knoten;
import org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke_Meter_TypeClass;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke_Punkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strecke Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.Strecke_PunktImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.Strecke_PunktImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.Strecke_PunktImpl#getStreckeMeter <em>Strecke Meter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Strecke_PunktImpl extends Basis_ObjektImpl implements Strecke_Punkt {
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
	 * The cached value of the '{@link #getStreckeMeter() <em>Strecke Meter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeMeter()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Meter_TypeClass streckeMeter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Strecke_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.STRECKE_PUNKT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten, !oldIDGEOKnotenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN, oldIDGEOKnoten, null, oldIDGEOKnotenESet));
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
	public Strecke getIDStrecke() {
		if (iDStrecke != null && iDStrecke.eIsProxy()) {
			InternalEObject oldIDStrecke = (InternalEObject)iDStrecke;
			iDStrecke = (Strecke)eResolveProxy(oldIDStrecke);
			if (iDStrecke != oldIDStrecke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, oldIDStrecke, iDStrecke));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, oldIDStrecke, iDStrecke, !oldIDStreckeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.STRECKE_PUNKT__ID_STRECKE, oldIDStrecke, null, oldIDStreckeESet));
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
	public Strecke_Meter_TypeClass getStreckeMeter() {
		return streckeMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeMeter(Strecke_Meter_TypeClass newStreckeMeter, NotificationChain msgs) {
		Strecke_Meter_TypeClass oldStreckeMeter = streckeMeter;
		streckeMeter = newStreckeMeter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, oldStreckeMeter, newStreckeMeter);
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
	public void setStreckeMeter(Strecke_Meter_TypeClass newStreckeMeter) {
		if (newStreckeMeter != streckeMeter) {
			NotificationChain msgs = null;
			if (streckeMeter != null)
				msgs = ((InternalEObject)streckeMeter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, null, msgs);
			if (newStreckeMeter != null)
				msgs = ((InternalEObject)newStreckeMeter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, null, msgs);
			msgs = basicSetStreckeMeter(newStreckeMeter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.STRECKE_PUNKT__STRECKE_METER, newStreckeMeter, newStreckeMeter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				return basicSetStreckeMeter(null, msgs);
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				if (resolve) return getIDGEOKnoten();
				return basicGetIDGEOKnoten();
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				if (resolve) return getIDStrecke();
				return basicGetIDStrecke();
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				return getStreckeMeter();
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				setIDGEOKnoten((GEO_Knoten)newValue);
				return;
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				setIDStrecke((Strecke)newValue);
				return;
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				setStreckeMeter((Strecke_Meter_TypeClass)newValue);
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				unsetIDGEOKnoten();
				return;
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				unsetIDStrecke();
				return;
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				setStreckeMeter((Strecke_Meter_TypeClass)null);
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
			case GeodatenPackage.STRECKE_PUNKT__IDGEO_KNOTEN:
				return isSetIDGEOKnoten();
			case GeodatenPackage.STRECKE_PUNKT__ID_STRECKE:
				return isSetIDStrecke();
			case GeodatenPackage.STRECKE_PUNKT__STRECKE_METER:
				return streckeMeter != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Strecke_PunktImpl
