/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Uebertragungsweg;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Uebertragungsweg_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Uebertragungsweg_Technik_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uebertragungsweg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.UebertragungswegImpl#getIDAnhangUeWegNach <em>ID Anhang Ue Weg Nach</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.UebertragungswegImpl#getIDAnhangUeWegVon <em>ID Anhang Ue Weg Von</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.UebertragungswegImpl#getIDUebertragungswegNach <em>ID Uebertragungsweg Nach</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.UebertragungswegImpl#getIDUebertragungswegVon <em>ID Uebertragungsweg Von</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.UebertragungswegImpl#getUebertragungswegArt <em>Uebertragungsweg Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.UebertragungswegImpl#getUebertragungswegTechnik <em>Uebertragungsweg Technik</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UebertragungswegImpl extends Basis_ObjektImpl implements Uebertragungsweg {
	/**
	 * The cached value of the '{@link #getIDAnhangUeWegNach() <em>ID Anhang Ue Weg Nach</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangUeWegNach()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> iDAnhangUeWegNach;

	/**
	 * The cached value of the '{@link #getIDAnhangUeWegVon() <em>ID Anhang Ue Weg Von</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangUeWegVon()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> iDAnhangUeWegVon;

	/**
	 * The cached value of the '{@link #getIDUebertragungswegNach() <em>ID Uebertragungsweg Nach</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUebertragungswegNach()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDUebertragungswegNach;

	/**
	 * This is true if the ID Uebertragungsweg Nach reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUebertragungswegNachESet;

	/**
	 * The cached value of the '{@link #getIDUebertragungswegVon() <em>ID Uebertragungsweg Von</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUebertragungswegVon()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDUebertragungswegVon;

	/**
	 * This is true if the ID Uebertragungsweg Von reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUebertragungswegVonESet;

	/**
	 * The cached value of the '{@link #getUebertragungswegArt() <em>Uebertragungsweg Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungswegArt()
	 * @generated
	 * @ordered
	 */
	protected Uebertragungsweg_Art_TypeClass uebertragungswegArt;

	/**
	 * The cached value of the '{@link #getUebertragungswegTechnik() <em>Uebertragungsweg Technik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungswegTechnik()
	 * @generated
	 * @ordered
	 */
	protected Uebertragungsweg_Technik_AttributeGroup uebertragungswegTechnik;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UebertragungswegImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getIDAnhangUeWegNach() {
		if (iDAnhangUeWegNach == null) {
			iDAnhangUeWegNach = new EObjectResolvingEList<Anhang>(Anhang.class, this, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH);
		}
		return iDAnhangUeWegNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getIDAnhangUeWegVon() {
		if (iDAnhangUeWegVon == null) {
			iDAnhangUeWegVon = new EObjectResolvingEList<Anhang>(Anhang.class, this, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON);
		}
		return iDAnhangUeWegVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDUebertragungswegNach() {
		if (iDUebertragungswegNach != null && iDUebertragungswegNach.eIsProxy()) {
			InternalEObject oldIDUebertragungswegNach = (InternalEObject)iDUebertragungswegNach;
			iDUebertragungswegNach = (Basis_Objekt)eResolveProxy(oldIDUebertragungswegNach);
			if (iDUebertragungswegNach != oldIDUebertragungswegNach) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, oldIDUebertragungswegNach, iDUebertragungswegNach));
			}
		}
		return iDUebertragungswegNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDUebertragungswegNach() {
		return iDUebertragungswegNach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUebertragungswegNach(Basis_Objekt newIDUebertragungswegNach) {
		Basis_Objekt oldIDUebertragungswegNach = iDUebertragungswegNach;
		iDUebertragungswegNach = newIDUebertragungswegNach;
		boolean oldIDUebertragungswegNachESet = iDUebertragungswegNachESet;
		iDUebertragungswegNachESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, oldIDUebertragungswegNach, iDUebertragungswegNach, !oldIDUebertragungswegNachESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUebertragungswegNach() {
		Basis_Objekt oldIDUebertragungswegNach = iDUebertragungswegNach;
		boolean oldIDUebertragungswegNachESet = iDUebertragungswegNachESet;
		iDUebertragungswegNach = null;
		iDUebertragungswegNachESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH, oldIDUebertragungswegNach, null, oldIDUebertragungswegNachESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUebertragungswegNach() {
		return iDUebertragungswegNachESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDUebertragungswegVon() {
		if (iDUebertragungswegVon != null && iDUebertragungswegVon.eIsProxy()) {
			InternalEObject oldIDUebertragungswegVon = (InternalEObject)iDUebertragungswegVon;
			iDUebertragungswegVon = (Basis_Objekt)eResolveProxy(oldIDUebertragungswegVon);
			if (iDUebertragungswegVon != oldIDUebertragungswegVon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, oldIDUebertragungswegVon, iDUebertragungswegVon));
			}
		}
		return iDUebertragungswegVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDUebertragungswegVon() {
		return iDUebertragungswegVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUebertragungswegVon(Basis_Objekt newIDUebertragungswegVon) {
		Basis_Objekt oldIDUebertragungswegVon = iDUebertragungswegVon;
		iDUebertragungswegVon = newIDUebertragungswegVon;
		boolean oldIDUebertragungswegVonESet = iDUebertragungswegVonESet;
		iDUebertragungswegVonESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, oldIDUebertragungswegVon, iDUebertragungswegVon, !oldIDUebertragungswegVonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUebertragungswegVon() {
		Basis_Objekt oldIDUebertragungswegVon = iDUebertragungswegVon;
		boolean oldIDUebertragungswegVonESet = iDUebertragungswegVonESet;
		iDUebertragungswegVon = null;
		iDUebertragungswegVonESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON, oldIDUebertragungswegVon, null, oldIDUebertragungswegVonESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUebertragungswegVon() {
		return iDUebertragungswegVonESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg_Art_TypeClass getUebertragungswegArt() {
		return uebertragungswegArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebertragungswegArt(Uebertragungsweg_Art_TypeClass newUebertragungswegArt, NotificationChain msgs) {
		Uebertragungsweg_Art_TypeClass oldUebertragungswegArt = uebertragungswegArt;
		uebertragungswegArt = newUebertragungswegArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, oldUebertragungswegArt, newUebertragungswegArt);
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
	public void setUebertragungswegArt(Uebertragungsweg_Art_TypeClass newUebertragungswegArt) {
		if (newUebertragungswegArt != uebertragungswegArt) {
			NotificationChain msgs = null;
			if (uebertragungswegArt != null)
				msgs = ((InternalEObject)uebertragungswegArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, null, msgs);
			if (newUebertragungswegArt != null)
				msgs = ((InternalEObject)newUebertragungswegArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, null, msgs);
			msgs = basicSetUebertragungswegArt(newUebertragungswegArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART, newUebertragungswegArt, newUebertragungswegArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragungsweg_Technik_AttributeGroup getUebertragungswegTechnik() {
		return uebertragungswegTechnik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebertragungswegTechnik(Uebertragungsweg_Technik_AttributeGroup newUebertragungswegTechnik, NotificationChain msgs) {
		Uebertragungsweg_Technik_AttributeGroup oldUebertragungswegTechnik = uebertragungswegTechnik;
		uebertragungswegTechnik = newUebertragungswegTechnik;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, oldUebertragungswegTechnik, newUebertragungswegTechnik);
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
	public void setUebertragungswegTechnik(Uebertragungsweg_Technik_AttributeGroup newUebertragungswegTechnik) {
		if (newUebertragungswegTechnik != uebertragungswegTechnik) {
			NotificationChain msgs = null;
			if (uebertragungswegTechnik != null)
				msgs = ((InternalEObject)uebertragungswegTechnik).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, null, msgs);
			if (newUebertragungswegTechnik != null)
				msgs = ((InternalEObject)newUebertragungswegTechnik).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, null, msgs);
			msgs = basicSetUebertragungswegTechnik(newUebertragungswegTechnik, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK, newUebertragungswegTechnik, newUebertragungswegTechnik));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				return basicSetUebertragungswegArt(null, msgs);
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				return basicSetUebertragungswegTechnik(null, msgs);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				return getIDAnhangUeWegNach();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				return getIDAnhangUeWegVon();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				if (resolve) return getIDUebertragungswegNach();
				return basicGetIDUebertragungswegNach();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				if (resolve) return getIDUebertragungswegVon();
				return basicGetIDUebertragungswegVon();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				return getUebertragungswegArt();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				return getUebertragungswegTechnik();
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				getIDAnhangUeWegNach().clear();
				getIDAnhangUeWegNach().addAll((Collection<? extends Anhang>)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				getIDAnhangUeWegVon().clear();
				getIDAnhangUeWegVon().addAll((Collection<? extends Anhang>)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				setIDUebertragungswegNach((Basis_Objekt)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				setIDUebertragungswegVon((Basis_Objekt)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				setUebertragungswegArt((Uebertragungsweg_Art_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				setUebertragungswegTechnik((Uebertragungsweg_Technik_AttributeGroup)newValue);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				getIDAnhangUeWegNach().clear();
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				getIDAnhangUeWegVon().clear();
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				unsetIDUebertragungswegNach();
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				unsetIDUebertragungswegVon();
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				setUebertragungswegArt((Uebertragungsweg_Art_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				setUebertragungswegTechnik((Uebertragungsweg_Technik_AttributeGroup)null);
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
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH:
				return iDAnhangUeWegNach != null && !iDAnhangUeWegNach.isEmpty();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON:
				return iDAnhangUeWegVon != null && !iDAnhangUeWegVon.isEmpty();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH:
				return isSetIDUebertragungswegNach();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON:
				return isSetIDUebertragungswegVon();
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
				return uebertragungswegArt != null;
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
				return uebertragungswegTechnik != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //UebertragungswegImpl
