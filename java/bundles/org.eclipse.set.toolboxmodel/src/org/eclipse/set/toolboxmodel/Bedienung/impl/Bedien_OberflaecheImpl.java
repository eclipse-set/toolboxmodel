/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oberflaeche;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_OberflaecheImpl#getBedienOberflaecheAnhaenge <em>Bedien Oberflaeche Anhaenge</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_OberflaecheImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_OberflaecheImpl extends Basis_ObjektImpl implements Bedien_Oberflaeche {
	/**
	 * The cached value of the '{@link #getBedienOberflaecheAnhaenge() <em>Bedien Oberflaeche Anhaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOberflaecheAnhaenge()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oberflaeche_Anhaenge_AttributeGroup bedienOberflaecheAnhaenge;

	/**
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk iDBedienBezirk;

	/**
	 * This is true if the ID Bedien Bezirk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienBezirkESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_OberflaecheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Anhaenge_AttributeGroup getBedienOberflaecheAnhaenge() {
		return bedienOberflaecheAnhaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienOberflaecheAnhaenge(Bedien_Oberflaeche_Anhaenge_AttributeGroup newBedienOberflaecheAnhaenge, NotificationChain msgs) {
		Bedien_Oberflaeche_Anhaenge_AttributeGroup oldBedienOberflaecheAnhaenge = bedienOberflaecheAnhaenge;
		bedienOberflaecheAnhaenge = newBedienOberflaecheAnhaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, oldBedienOberflaecheAnhaenge, newBedienOberflaecheAnhaenge);
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
	public void setBedienOberflaecheAnhaenge(Bedien_Oberflaeche_Anhaenge_AttributeGroup newBedienOberflaecheAnhaenge) {
		if (newBedienOberflaecheAnhaenge != bedienOberflaecheAnhaenge) {
			NotificationChain msgs = null;
			if (bedienOberflaecheAnhaenge != null)
				msgs = ((InternalEObject)bedienOberflaecheAnhaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, null, msgs);
			if (newBedienOberflaecheAnhaenge != null)
				msgs = ((InternalEObject)newBedienOberflaecheAnhaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, null, msgs);
			msgs = basicSetBedienOberflaecheAnhaenge(newBedienOberflaecheAnhaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE, newBedienOberflaecheAnhaenge, newBedienOberflaecheAnhaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk getIDBedienBezirk() {
		if (iDBedienBezirk != null && iDBedienBezirk.eIsProxy()) {
			InternalEObject oldIDBedienBezirk = (InternalEObject)iDBedienBezirk;
			iDBedienBezirk = (Bedien_Bezirk)eResolveProxy(oldIDBedienBezirk);
			if (iDBedienBezirk != oldIDBedienBezirk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk));
			}
		}
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Bezirk basicGetIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienBezirk(Bedien_Bezirk newIDBedienBezirk) {
		Bedien_Bezirk oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		boolean oldIDBedienBezirkESet = iDBedienBezirkESet;
		iDBedienBezirkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk, !oldIDBedienBezirkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienBezirk() {
		Bedien_Bezirk oldIDBedienBezirk = iDBedienBezirk;
		boolean oldIDBedienBezirkESet = iDBedienBezirkESet;
		iDBedienBezirk = null;
		iDBedienBezirkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, null, oldIDBedienBezirkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienBezirk() {
		return iDBedienBezirkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				return basicSetBedienOberflaecheAnhaenge(null, msgs);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				return getBedienOberflaecheAnhaenge();
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				if (resolve) return getIDBedienBezirk();
				return basicGetIDBedienBezirk();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				setBedienOberflaecheAnhaenge((Bedien_Oberflaeche_Anhaenge_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((Bedien_Bezirk)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				setBedienOberflaecheAnhaenge((Bedien_Oberflaeche_Anhaenge_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				unsetIDBedienBezirk();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE__BEDIEN_OBERFLAECHE_ANHAENGE:
				return bedienOberflaecheAnhaenge != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE__ID_BEDIEN_BEZIRK:
				return isSetIDBedienBezirk();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_OberflaecheImpl
