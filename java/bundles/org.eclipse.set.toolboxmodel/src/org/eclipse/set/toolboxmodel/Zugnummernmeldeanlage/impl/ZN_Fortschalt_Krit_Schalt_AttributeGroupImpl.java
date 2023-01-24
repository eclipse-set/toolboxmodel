/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Besonderes_Schaltkriterium_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Telegrammwiederholung_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Schaltkriterium_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Fortschalt Krit Schalt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getBesonderesSchaltkriterium <em>Besonderes Schaltkriterium</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getIDFortschaltungStart <em>ID Fortschaltung Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getTelegrammwiederholung <em>Telegrammwiederholung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl#getZNSchaltkriterium <em>ZN Schaltkriterium</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZN_Fortschalt_Krit_Schalt_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBesonderesSchaltkriterium() <em>Besonderes Schaltkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesonderesSchaltkriterium()
	 * @generated
	 * @ordered
	 */
	protected Besonderes_Schaltkriterium_TypeClass besonderesSchaltkriterium;

	/**
	 * The cached value of the '{@link #getIDFortschaltungStart() <em>ID Fortschaltung Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFortschaltungStart()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDFortschaltungStart;

	/**
	 * This is true if the ID Fortschaltung Start reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFortschaltungStartESet;

	/**
	 * The cached value of the '{@link #getTelegrammwiederholung() <em>Telegrammwiederholung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegrammwiederholung()
	 * @generated
	 * @ordered
	 */
	protected Telegrammwiederholung_TypeClass telegrammwiederholung;

	/**
	 * The cached value of the '{@link #getZNSchaltkriterium() <em>ZN Schaltkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNSchaltkriterium()
	 * @generated
	 * @ordered
	 */
	protected ZN_Schaltkriterium_TypeClass zNSchaltkriterium;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besonderes_Schaltkriterium_TypeClass getBesonderesSchaltkriterium() {
		return besonderesSchaltkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBesonderesSchaltkriterium(Besonderes_Schaltkriterium_TypeClass newBesonderesSchaltkriterium, NotificationChain msgs) {
		Besonderes_Schaltkriterium_TypeClass oldBesonderesSchaltkriterium = besonderesSchaltkriterium;
		besonderesSchaltkriterium = newBesonderesSchaltkriterium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, oldBesonderesSchaltkriterium, newBesonderesSchaltkriterium);
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
	public void setBesonderesSchaltkriterium(Besonderes_Schaltkriterium_TypeClass newBesonderesSchaltkriterium) {
		if (newBesonderesSchaltkriterium != besonderesSchaltkriterium) {
			NotificationChain msgs = null;
			if (besonderesSchaltkriterium != null)
				msgs = ((InternalEObject)besonderesSchaltkriterium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, null, msgs);
			if (newBesonderesSchaltkriterium != null)
				msgs = ((InternalEObject)newBesonderesSchaltkriterium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, null, msgs);
			msgs = basicSetBesonderesSchaltkriterium(newBesonderesSchaltkriterium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM, newBesonderesSchaltkriterium, newBesonderesSchaltkriterium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDFortschaltungStart() {
		if (iDFortschaltungStart != null && iDFortschaltungStart.eIsProxy()) {
			InternalEObject oldIDFortschaltungStart = (InternalEObject)iDFortschaltungStart;
			iDFortschaltungStart = (Basis_Objekt)eResolveProxy(oldIDFortschaltungStart);
			if (iDFortschaltungStart != oldIDFortschaltungStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, oldIDFortschaltungStart, iDFortschaltungStart));
			}
		}
		return iDFortschaltungStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDFortschaltungStart() {
		return iDFortschaltungStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFortschaltungStart(Basis_Objekt newIDFortschaltungStart) {
		Basis_Objekt oldIDFortschaltungStart = iDFortschaltungStart;
		iDFortschaltungStart = newIDFortschaltungStart;
		boolean oldIDFortschaltungStartESet = iDFortschaltungStartESet;
		iDFortschaltungStartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, oldIDFortschaltungStart, iDFortschaltungStart, !oldIDFortschaltungStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFortschaltungStart() {
		Basis_Objekt oldIDFortschaltungStart = iDFortschaltungStart;
		boolean oldIDFortschaltungStartESet = iDFortschaltungStartESet;
		iDFortschaltungStart = null;
		iDFortschaltungStartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START, oldIDFortschaltungStart, null, oldIDFortschaltungStartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFortschaltungStart() {
		return iDFortschaltungStartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegrammwiederholung_TypeClass getTelegrammwiederholung() {
		return telegrammwiederholung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegrammwiederholung(Telegrammwiederholung_TypeClass newTelegrammwiederholung, NotificationChain msgs) {
		Telegrammwiederholung_TypeClass oldTelegrammwiederholung = telegrammwiederholung;
		telegrammwiederholung = newTelegrammwiederholung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, oldTelegrammwiederholung, newTelegrammwiederholung);
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
	public void setTelegrammwiederholung(Telegrammwiederholung_TypeClass newTelegrammwiederholung) {
		if (newTelegrammwiederholung != telegrammwiederholung) {
			NotificationChain msgs = null;
			if (telegrammwiederholung != null)
				msgs = ((InternalEObject)telegrammwiederholung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, null, msgs);
			if (newTelegrammwiederholung != null)
				msgs = ((InternalEObject)newTelegrammwiederholung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, null, msgs);
			msgs = basicSetTelegrammwiederholung(newTelegrammwiederholung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG, newTelegrammwiederholung, newTelegrammwiederholung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Schaltkriterium_TypeClass getZNSchaltkriterium() {
		return zNSchaltkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNSchaltkriterium(ZN_Schaltkriterium_TypeClass newZNSchaltkriterium, NotificationChain msgs) {
		ZN_Schaltkriterium_TypeClass oldZNSchaltkriterium = zNSchaltkriterium;
		zNSchaltkriterium = newZNSchaltkriterium;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, oldZNSchaltkriterium, newZNSchaltkriterium);
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
	public void setZNSchaltkriterium(ZN_Schaltkriterium_TypeClass newZNSchaltkriterium) {
		if (newZNSchaltkriterium != zNSchaltkriterium) {
			NotificationChain msgs = null;
			if (zNSchaltkriterium != null)
				msgs = ((InternalEObject)zNSchaltkriterium).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, null, msgs);
			if (newZNSchaltkriterium != null)
				msgs = ((InternalEObject)newZNSchaltkriterium).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, null, msgs);
			msgs = basicSetZNSchaltkriterium(newZNSchaltkriterium, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM, newZNSchaltkriterium, newZNSchaltkriterium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				return basicSetBesonderesSchaltkriterium(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				return basicSetTelegrammwiederholung(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				return basicSetZNSchaltkriterium(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				return getBesonderesSchaltkriterium();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				if (resolve) return getIDFortschaltungStart();
				return basicGetIDFortschaltungStart();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				return getTelegrammwiederholung();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				return getZNSchaltkriterium();
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				setBesonderesSchaltkriterium((Besonderes_Schaltkriterium_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				setIDFortschaltungStart((Basis_Objekt)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				setTelegrammwiederholung((Telegrammwiederholung_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				setZNSchaltkriterium((ZN_Schaltkriterium_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				setBesonderesSchaltkriterium((Besonderes_Schaltkriterium_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				unsetIDFortschaltungStart();
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				setTelegrammwiederholung((Telegrammwiederholung_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				setZNSchaltkriterium((ZN_Schaltkriterium_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__BESONDERES_SCHALTKRITERIUM:
				return besonderesSchaltkriterium != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ID_FORTSCHALTUNG_START:
				return isSetIDFortschaltungStart();
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__TELEGRAMMWIEDERHOLUNG:
				return telegrammwiederholung != null;
			case ZugnummernmeldeanlagePackage.ZN_FORTSCHALT_KRIT_SCHALT_ATTRIBUTE_GROUP__ZN_SCHALTKRITERIUM:
				return zNSchaltkriterium != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_Fortschalt_Krit_Schalt_AttributeGroupImpl
