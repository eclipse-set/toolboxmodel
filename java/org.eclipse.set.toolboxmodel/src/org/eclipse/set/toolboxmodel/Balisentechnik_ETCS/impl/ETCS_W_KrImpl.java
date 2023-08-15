/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS WKr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getETCSWKrMUKA <em>ETCSW Kr MUKA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDETCSGefahrpunktNebengleis <em>IDETCS Gefahrpunkt Nebengleis</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDETCSKnoten <em>IDETCS Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_W_KrImpl#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_W_KrImpl extends Basis_ObjektImpl implements ETCS_W_Kr {
	/**
	 * The cached value of the '{@link #getETCSWKrMUKA() <em>ETCSW Kr MUKA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSWKrMUKA()
	 * @generated
	 * @ordered
	 */
	protected ETCS_W_Kr_MUKA_AttributeGroup eTCSWKrMUKA;

	/**
	 * The cached value of the '{@link #getIDETCSGefahrpunktNebengleis() <em>IDETCS Gefahrpunkt Nebengleis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSGefahrpunktNebengleis()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDETCSGefahrpunktNebengleis;

	/**
	 * This is true if the IDETCS Gefahrpunkt Nebengleis reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDETCSGefahrpunktNebengleisESet;

	/**
	 * The cached value of the '{@link #getIDETCSKnoten() <em>IDETCS Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKnoten()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Knoten iDETCSKnoten;

	/**
	 * This is true if the IDETCS Knoten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDETCSKnotenESet;

	/**
	 * The cached value of the '{@link #getIDRBC() <em>IDRBC</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<RBC> iDRBC;

	/**
	 * The cached value of the '{@link #getIDWKrAnlage() <em>IDW Kr Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrAnlage()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Anlage iDWKrAnlage;

	/**
	 * This is true if the IDW Kr Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWKrAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_W_KrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_W_Kr();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_W_Kr_MUKA_AttributeGroup getETCSWKrMUKA() {
		return eTCSWKrMUKA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup newETCSWKrMUKA, NotificationChain msgs) {
		ETCS_W_Kr_MUKA_AttributeGroup oldETCSWKrMUKA = eTCSWKrMUKA;
		eTCSWKrMUKA = newETCSWKrMUKA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, oldETCSWKrMUKA, newETCSWKrMUKA);
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
	public void setETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup newETCSWKrMUKA) {
		if (newETCSWKrMUKA != eTCSWKrMUKA) {
			NotificationChain msgs = null;
			if (eTCSWKrMUKA != null)
				msgs = ((InternalEObject)eTCSWKrMUKA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, null, msgs);
			if (newETCSWKrMUKA != null)
				msgs = ((InternalEObject)newETCSWKrMUKA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, null, msgs);
			msgs = basicSetETCSWKrMUKA(newETCSWKrMUKA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA, newETCSWKrMUKA, newETCSWKrMUKA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDETCSGefahrpunktNebengleis() {
		if (iDETCSGefahrpunktNebengleis != null && iDETCSGefahrpunktNebengleis.eIsProxy()) {
			InternalEObject oldIDETCSGefahrpunktNebengleis = (InternalEObject)iDETCSGefahrpunktNebengleis;
			iDETCSGefahrpunktNebengleis = (Basis_Objekt)eResolveProxy(oldIDETCSGefahrpunktNebengleis);
			if (iDETCSGefahrpunktNebengleis != oldIDETCSGefahrpunktNebengleis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS, oldIDETCSGefahrpunktNebengleis, iDETCSGefahrpunktNebengleis));
			}
		}
		return iDETCSGefahrpunktNebengleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDETCSGefahrpunktNebengleis() {
		return iDETCSGefahrpunktNebengleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDETCSGefahrpunktNebengleis(Basis_Objekt newIDETCSGefahrpunktNebengleis) {
		Basis_Objekt oldIDETCSGefahrpunktNebengleis = iDETCSGefahrpunktNebengleis;
		iDETCSGefahrpunktNebengleis = newIDETCSGefahrpunktNebengleis;
		boolean oldIDETCSGefahrpunktNebengleisESet = iDETCSGefahrpunktNebengleisESet;
		iDETCSGefahrpunktNebengleisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS, oldIDETCSGefahrpunktNebengleis, iDETCSGefahrpunktNebengleis, !oldIDETCSGefahrpunktNebengleisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDETCSGefahrpunktNebengleis() {
		Basis_Objekt oldIDETCSGefahrpunktNebengleis = iDETCSGefahrpunktNebengleis;
		boolean oldIDETCSGefahrpunktNebengleisESet = iDETCSGefahrpunktNebengleisESet;
		iDETCSGefahrpunktNebengleis = null;
		iDETCSGefahrpunktNebengleisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS, oldIDETCSGefahrpunktNebengleis, null, oldIDETCSGefahrpunktNebengleisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDETCSGefahrpunktNebengleis() {
		return iDETCSGefahrpunktNebengleisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Knoten getIDETCSKnoten() {
		if (iDETCSKnoten != null && iDETCSKnoten.eIsProxy()) {
			InternalEObject oldIDETCSKnoten = (InternalEObject)iDETCSKnoten;
			iDETCSKnoten = (ETCS_Knoten)eResolveProxy(oldIDETCSKnoten);
			if (iDETCSKnoten != oldIDETCSKnoten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, oldIDETCSKnoten, iDETCSKnoten));
			}
		}
		return iDETCSKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCS_Knoten basicGetIDETCSKnoten() {
		return iDETCSKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDETCSKnoten(ETCS_Knoten newIDETCSKnoten) {
		ETCS_Knoten oldIDETCSKnoten = iDETCSKnoten;
		iDETCSKnoten = newIDETCSKnoten;
		boolean oldIDETCSKnotenESet = iDETCSKnotenESet;
		iDETCSKnotenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, oldIDETCSKnoten, iDETCSKnoten, !oldIDETCSKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDETCSKnoten() {
		ETCS_Knoten oldIDETCSKnoten = iDETCSKnoten;
		boolean oldIDETCSKnotenESet = iDETCSKnotenESet;
		iDETCSKnoten = null;
		iDETCSKnotenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN, oldIDETCSKnoten, null, oldIDETCSKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDETCSKnoten() {
		return iDETCSKnotenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RBC> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectResolvingEList<RBC>(RBC.class, this, Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Anlage getIDWKrAnlage() {
		if (iDWKrAnlage != null && iDWKrAnlage.eIsProxy()) {
			InternalEObject oldIDWKrAnlage = (InternalEObject)iDWKrAnlage;
			iDWKrAnlage = (W_Kr_Anlage)eResolveProxy(oldIDWKrAnlage);
			if (iDWKrAnlage != oldIDWKrAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, oldIDWKrAnlage, iDWKrAnlage));
			}
		}
		return iDWKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Anlage basicGetIDWKrAnlage() {
		return iDWKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWKrAnlage(W_Kr_Anlage newIDWKrAnlage) {
		W_Kr_Anlage oldIDWKrAnlage = iDWKrAnlage;
		iDWKrAnlage = newIDWKrAnlage;
		boolean oldIDWKrAnlageESet = iDWKrAnlageESet;
		iDWKrAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, oldIDWKrAnlage, iDWKrAnlage, !oldIDWKrAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWKrAnlage() {
		W_Kr_Anlage oldIDWKrAnlage = iDWKrAnlage;
		boolean oldIDWKrAnlageESet = iDWKrAnlageESet;
		iDWKrAnlage = null;
		iDWKrAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE, oldIDWKrAnlage, null, oldIDWKrAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWKrAnlage() {
		return iDWKrAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				return basicSetETCSWKrMUKA(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				return getETCSWKrMUKA();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS:
				if (resolve) return getIDETCSGefahrpunktNebengleis();
				return basicGetIDETCSGefahrpunktNebengleis();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				if (resolve) return getIDETCSKnoten();
				return basicGetIDETCSKnoten();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				if (resolve) return getIDWKrAnlage();
				return basicGetIDWKrAnlage();
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				setETCSWKrMUKA((ETCS_W_Kr_MUKA_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS:
				setIDETCSGefahrpunktNebengleis((Basis_Objekt)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				setIDETCSKnoten((ETCS_Knoten)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends RBC>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				setIDWKrAnlage((W_Kr_Anlage)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				setETCSWKrMUKA((ETCS_W_Kr_MUKA_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS:
				unsetIDETCSGefahrpunktNebengleis();
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				unsetIDETCSKnoten();
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				unsetIDWKrAnlage();
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
			case Balisentechnik_ETCSPackage.ETCS_WKR__ETCSW_KR_MUKA:
				return eTCSWKrMUKA != null;
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_GEFAHRPUNKT_NEBENGLEIS:
				return isSetIDETCSGefahrpunktNebengleis();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDETCS_KNOTEN:
				return isSetIDETCSKnoten();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.ETCS_WKR__IDW_KR_ANLAGE:
				return isSetIDWKrAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_W_KrImpl
