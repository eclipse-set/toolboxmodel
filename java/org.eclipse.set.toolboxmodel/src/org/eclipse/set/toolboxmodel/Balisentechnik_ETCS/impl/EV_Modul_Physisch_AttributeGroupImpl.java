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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Typ_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Hersteller_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EV Modul Physisch Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.EV_Modul_Physisch_AttributeGroupImpl#getEVModulArt <em>EV Modul Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.EV_Modul_Physisch_AttributeGroupImpl#getEVModulEingang <em>EV Modul Eingang</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.EV_Modul_Physisch_AttributeGroupImpl#getEVModulTyp <em>EV Modul Typ</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.EV_Modul_Physisch_AttributeGroupImpl#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.EV_Modul_Physisch_AttributeGroupImpl#getIDElementUnterbringung <em>ID Element Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EV_Modul_Physisch_AttributeGroupImpl extends MinimalEObjectImpl.Container implements EV_Modul_Physisch_AttributeGroup {
	/**
	 * The cached value of the '{@link #getEVModulArt() <em>EV Modul Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModulArt()
	 * @generated
	 * @ordered
	 */
	protected EV_Modul_Art_TypeClass eVModulArt;

	/**
	 * The cached value of the '{@link #getEVModulEingang() <em>EV Modul Eingang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModulEingang()
	 * @generated
	 * @ordered
	 */
	protected EList<EV_Modul_Eingang_AttributeGroup> eVModulEingang;

	/**
	 * The cached value of the '{@link #getEVModulTyp() <em>EV Modul Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVModulTyp()
	 * @generated
	 * @ordered
	 */
	protected EV_Modul_Typ_TypeClass eVModulTyp;

	/**
	 * The cached value of the '{@link #getHersteller() <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHersteller()
	 * @generated
	 * @ordered
	 */
	protected Hersteller_TypeClass hersteller;

	/**
	 * The cached value of the '{@link #getIDElementUnterbringung() <em>ID Element Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDElementUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDElementUnterbringung;

	/**
	 * This is true if the ID Element Unterbringung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDElementUnterbringungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EV_Modul_Physisch_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getEV_Modul_Physisch_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Art_TypeClass getEVModulArt() {
		return eVModulArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVModulArt(EV_Modul_Art_TypeClass newEVModulArt, NotificationChain msgs) {
		EV_Modul_Art_TypeClass oldEVModulArt = eVModulArt;
		eVModulArt = newEVModulArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART, oldEVModulArt, newEVModulArt);
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
	public void setEVModulArt(EV_Modul_Art_TypeClass newEVModulArt) {
		if (newEVModulArt != eVModulArt) {
			NotificationChain msgs = null;
			if (eVModulArt != null)
				msgs = ((InternalEObject)eVModulArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART, null, msgs);
			if (newEVModulArt != null)
				msgs = ((InternalEObject)newEVModulArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART, null, msgs);
			msgs = basicSetEVModulArt(newEVModulArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART, newEVModulArt, newEVModulArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EV_Modul_Eingang_AttributeGroup> getEVModulEingang() {
		if (eVModulEingang == null) {
			eVModulEingang = new EObjectContainmentEList<EV_Modul_Eingang_AttributeGroup>(EV_Modul_Eingang_AttributeGroup.class, this, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_EINGANG);
		}
		return eVModulEingang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EV_Modul_Typ_TypeClass getEVModulTyp() {
		return eVModulTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVModulTyp(EV_Modul_Typ_TypeClass newEVModulTyp, NotificationChain msgs) {
		EV_Modul_Typ_TypeClass oldEVModulTyp = eVModulTyp;
		eVModulTyp = newEVModulTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP, oldEVModulTyp, newEVModulTyp);
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
	public void setEVModulTyp(EV_Modul_Typ_TypeClass newEVModulTyp) {
		if (newEVModulTyp != eVModulTyp) {
			NotificationChain msgs = null;
			if (eVModulTyp != null)
				msgs = ((InternalEObject)eVModulTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP, null, msgs);
			if (newEVModulTyp != null)
				msgs = ((InternalEObject)newEVModulTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP, null, msgs);
			msgs = basicSetEVModulTyp(newEVModulTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP, newEVModulTyp, newEVModulTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hersteller_TypeClass getHersteller() {
		return hersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHersteller(Hersteller_TypeClass newHersteller, NotificationChain msgs) {
		Hersteller_TypeClass oldHersteller = hersteller;
		hersteller = newHersteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER, oldHersteller, newHersteller);
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
	public void setHersteller(Hersteller_TypeClass newHersteller) {
		if (newHersteller != hersteller) {
			NotificationChain msgs = null;
			if (hersteller != null)
				msgs = ((InternalEObject)hersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			if (newHersteller != null)
				msgs = ((InternalEObject)newHersteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER, null, msgs);
			msgs = basicSetHersteller(newHersteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER, newHersteller, newHersteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDElementUnterbringung() {
		if (iDElementUnterbringung != null && iDElementUnterbringung.eIsProxy()) {
			InternalEObject oldIDElementUnterbringung = (InternalEObject)iDElementUnterbringung;
			iDElementUnterbringung = (Basis_Objekt)eResolveProxy(oldIDElementUnterbringung);
			if (iDElementUnterbringung != oldIDElementUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG, oldIDElementUnterbringung, iDElementUnterbringung));
			}
		}
		return iDElementUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDElementUnterbringung() {
		return iDElementUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDElementUnterbringung(Basis_Objekt newIDElementUnterbringung) {
		Basis_Objekt oldIDElementUnterbringung = iDElementUnterbringung;
		iDElementUnterbringung = newIDElementUnterbringung;
		boolean oldIDElementUnterbringungESet = iDElementUnterbringungESet;
		iDElementUnterbringungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG, oldIDElementUnterbringung, iDElementUnterbringung, !oldIDElementUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDElementUnterbringung() {
		Basis_Objekt oldIDElementUnterbringung = iDElementUnterbringung;
		boolean oldIDElementUnterbringungESet = iDElementUnterbringungESet;
		iDElementUnterbringung = null;
		iDElementUnterbringungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG, oldIDElementUnterbringung, null, oldIDElementUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDElementUnterbringung() {
		return iDElementUnterbringungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART:
				return basicSetEVModulArt(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_EINGANG:
				return ((InternalEList<?>)getEVModulEingang()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP:
				return basicSetEVModulTyp(null, msgs);
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER:
				return basicSetHersteller(null, msgs);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART:
				return getEVModulArt();
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_EINGANG:
				return getEVModulEingang();
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP:
				return getEVModulTyp();
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER:
				return getHersteller();
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG:
				if (resolve) return getIDElementUnterbringung();
				return basicGetIDElementUnterbringung();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART:
				setEVModulArt((EV_Modul_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_EINGANG:
				getEVModulEingang().clear();
				getEVModulEingang().addAll((Collection<? extends EV_Modul_Eingang_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP:
				setEVModulTyp((EV_Modul_Typ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG:
				setIDElementUnterbringung((Basis_Objekt)newValue);
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
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART:
				setEVModulArt((EV_Modul_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_EINGANG:
				getEVModulEingang().clear();
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP:
				setEVModulTyp((EV_Modul_Typ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER:
				setHersteller((Hersteller_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG:
				unsetIDElementUnterbringung();
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
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_ART:
				return eVModulArt != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_EINGANG:
				return eVModulEingang != null && !eVModulEingang.isEmpty();
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__EV_MODUL_TYP:
				return eVModulTyp != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__HERSTELLER:
				return hersteller != null;
			case Balisentechnik_ETCSPackage.EV_MODUL_PHYSISCH_ATTRIBUTE_GROUP__ID_ELEMENT_UNTERBRINGUNG:
				return isSetIDElementUnterbringung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //EV_Modul_Physisch_AttributeGroupImpl
