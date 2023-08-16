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
import org.eclipse.set.toolboxmodel.Geodaten.Knotenname_TypeClass;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP Knoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.TOP_KnotenImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.TOP_KnotenImpl#getKnotenname <em>Knotenname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOP_KnotenImpl extends Basis_ObjektImpl implements TOP_Knoten {
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
	 * The cached value of the '{@link #getKnotenname() <em>Knotenname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnotenname()
	 * @generated
	 * @ordered
	 */
	protected Knotenname_TypeClass knotenname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOP_KnotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TOP_KNOTEN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten, !oldIDGEOKnotenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, null, oldIDGEOKnotenESet));
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
	public Knotenname_TypeClass getKnotenname() {
		return knotenname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnotenname(Knotenname_TypeClass newKnotenname, NotificationChain msgs) {
		Knotenname_TypeClass oldKnotenname = knotenname;
		knotenname = newKnotenname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__KNOTENNAME, oldKnotenname, newKnotenname);
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
	public void setKnotenname(Knotenname_TypeClass newKnotenname) {
		if (newKnotenname != knotenname) {
			NotificationChain msgs = null;
			if (knotenname != null)
				msgs = ((InternalEObject)knotenname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KNOTEN__KNOTENNAME, null, msgs);
			if (newKnotenname != null)
				msgs = ((InternalEObject)newKnotenname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KNOTEN__KNOTENNAME, null, msgs);
			msgs = basicSetKnotenname(newKnotenname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KNOTEN__KNOTENNAME, newKnotenname, newKnotenname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				return basicSetKnotenname(null, msgs);
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				if (resolve) return getIDGEOKnoten();
				return basicGetIDGEOKnoten();
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				return getKnotenname();
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				setIDGEOKnoten((GEO_Knoten)newValue);
				return;
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				setKnotenname((Knotenname_TypeClass)newValue);
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				unsetIDGEOKnoten();
				return;
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				setKnotenname((Knotenname_TypeClass)null);
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
			case GeodatenPackage.TOP_KNOTEN__IDGEO_KNOTEN:
				return isSetIDGEOKnoten();
			case GeodatenPackage.TOP_KNOTEN__KNOTENNAME:
				return knotenname != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //TOP_KnotenImpl
