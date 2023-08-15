/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage_Uebertragung_FMinfo_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ortung.OrtungPackage;
import org.eclipse.set.toolboxmodel.Ortung.Uebertragung_FMinfo_Richtung_TypeClass;
import org.eclipse.set.toolboxmodel.Ortung.Uebertragung_FMinfo_Typ_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Anlage Uebertragung FMinfo Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl#getIDUebertragungFMinfo <em>ID Uebertragung FMinfo</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl#getUebertragungFMinfoRichtung <em>Uebertragung FMinfo Richtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl#getUebertragungFMinfoTyp <em>Uebertragung FMinfo Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FMA_Anlage_Uebertragung_FMinfo_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDUebertragungFMinfo() <em>ID Uebertragung FMinfo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUebertragungFMinfo()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDUebertragungFMinfo;

	/**
	 * This is true if the ID Uebertragung FMinfo reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUebertragungFMinfoESet;

	/**
	 * The cached value of the '{@link #getUebertragungFMinfoRichtung() <em>Uebertragung FMinfo Richtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungFMinfoRichtung()
	 * @generated
	 * @ordered
	 */
	protected Uebertragung_FMinfo_Richtung_TypeClass uebertragungFMinfoRichtung;

	/**
	 * The cached value of the '{@link #getUebertragungFMinfoTyp() <em>Uebertragung FMinfo Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUebertragungFMinfoTyp()
	 * @generated
	 * @ordered
	 */
	protected Uebertragung_FMinfo_Typ_TypeClass uebertragungFMinfoTyp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDUebertragungFMinfo() {
		if (iDUebertragungFMinfo != null && iDUebertragungFMinfo.eIsProxy()) {
			InternalEObject oldIDUebertragungFMinfo = (InternalEObject)iDUebertragungFMinfo;
			iDUebertragungFMinfo = (Aussenelementansteuerung)eResolveProxy(oldIDUebertragungFMinfo);
			if (iDUebertragungFMinfo != oldIDUebertragungFMinfo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO, oldIDUebertragungFMinfo, iDUebertragungFMinfo));
			}
		}
		return iDUebertragungFMinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDUebertragungFMinfo() {
		return iDUebertragungFMinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUebertragungFMinfo(Aussenelementansteuerung newIDUebertragungFMinfo) {
		Aussenelementansteuerung oldIDUebertragungFMinfo = iDUebertragungFMinfo;
		iDUebertragungFMinfo = newIDUebertragungFMinfo;
		boolean oldIDUebertragungFMinfoESet = iDUebertragungFMinfoESet;
		iDUebertragungFMinfoESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO, oldIDUebertragungFMinfo, iDUebertragungFMinfo, !oldIDUebertragungFMinfoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUebertragungFMinfo() {
		Aussenelementansteuerung oldIDUebertragungFMinfo = iDUebertragungFMinfo;
		boolean oldIDUebertragungFMinfoESet = iDUebertragungFMinfoESet;
		iDUebertragungFMinfo = null;
		iDUebertragungFMinfoESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO, oldIDUebertragungFMinfo, null, oldIDUebertragungFMinfoESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUebertragungFMinfo() {
		return iDUebertragungFMinfoESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragung_FMinfo_Richtung_TypeClass getUebertragungFMinfoRichtung() {
		return uebertragungFMinfoRichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebertragungFMinfoRichtung(Uebertragung_FMinfo_Richtung_TypeClass newUebertragungFMinfoRichtung, NotificationChain msgs) {
		Uebertragung_FMinfo_Richtung_TypeClass oldUebertragungFMinfoRichtung = uebertragungFMinfoRichtung;
		uebertragungFMinfoRichtung = newUebertragungFMinfoRichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG, oldUebertragungFMinfoRichtung, newUebertragungFMinfoRichtung);
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
	public void setUebertragungFMinfoRichtung(Uebertragung_FMinfo_Richtung_TypeClass newUebertragungFMinfoRichtung) {
		if (newUebertragungFMinfoRichtung != uebertragungFMinfoRichtung) {
			NotificationChain msgs = null;
			if (uebertragungFMinfoRichtung != null)
				msgs = ((InternalEObject)uebertragungFMinfoRichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG, null, msgs);
			if (newUebertragungFMinfoRichtung != null)
				msgs = ((InternalEObject)newUebertragungFMinfoRichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG, null, msgs);
			msgs = basicSetUebertragungFMinfoRichtung(newUebertragungFMinfoRichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG, newUebertragungFMinfoRichtung, newUebertragungFMinfoRichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uebertragung_FMinfo_Typ_TypeClass getUebertragungFMinfoTyp() {
		return uebertragungFMinfoTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUebertragungFMinfoTyp(Uebertragung_FMinfo_Typ_TypeClass newUebertragungFMinfoTyp, NotificationChain msgs) {
		Uebertragung_FMinfo_Typ_TypeClass oldUebertragungFMinfoTyp = uebertragungFMinfoTyp;
		uebertragungFMinfoTyp = newUebertragungFMinfoTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP, oldUebertragungFMinfoTyp, newUebertragungFMinfoTyp);
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
	public void setUebertragungFMinfoTyp(Uebertragung_FMinfo_Typ_TypeClass newUebertragungFMinfoTyp) {
		if (newUebertragungFMinfoTyp != uebertragungFMinfoTyp) {
			NotificationChain msgs = null;
			if (uebertragungFMinfoTyp != null)
				msgs = ((InternalEObject)uebertragungFMinfoTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP, null, msgs);
			if (newUebertragungFMinfoTyp != null)
				msgs = ((InternalEObject)newUebertragungFMinfoTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP, null, msgs);
			msgs = basicSetUebertragungFMinfoTyp(newUebertragungFMinfoTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP, newUebertragungFMinfoTyp, newUebertragungFMinfoTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG:
				return basicSetUebertragungFMinfoRichtung(null, msgs);
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP:
				return basicSetUebertragungFMinfoTyp(null, msgs);
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
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO:
				if (resolve) return getIDUebertragungFMinfo();
				return basicGetIDUebertragungFMinfo();
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG:
				return getUebertragungFMinfoRichtung();
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP:
				return getUebertragungFMinfoTyp();
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
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO:
				setIDUebertragungFMinfo((Aussenelementansteuerung)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG:
				setUebertragungFMinfoRichtung((Uebertragung_FMinfo_Richtung_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP:
				setUebertragungFMinfoTyp((Uebertragung_FMinfo_Typ_TypeClass)newValue);
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
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO:
				unsetIDUebertragungFMinfo();
				return;
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG:
				setUebertragungFMinfoRichtung((Uebertragung_FMinfo_Richtung_TypeClass)null);
				return;
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP:
				setUebertragungFMinfoTyp((Uebertragung_FMinfo_Typ_TypeClass)null);
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
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__ID_UEBERTRAGUNG_FMINFO:
				return isSetIDUebertragungFMinfo();
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_RICHTUNG:
				return uebertragungFMinfoRichtung != null;
			case OrtungPackage.FMA_ANLAGE_UEBERTRAGUNG_FMINFO_ATTRIBUTE_GROUP__UEBERTRAGUNG_FMINFO_TYP:
				return uebertragungFMinfoTyp != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FMA_Anlage_Uebertragung_FMinfo_AttributeGroupImpl
