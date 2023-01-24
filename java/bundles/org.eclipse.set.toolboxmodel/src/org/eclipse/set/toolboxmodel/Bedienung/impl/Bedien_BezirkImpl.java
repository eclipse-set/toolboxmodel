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
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Bezirk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_BezirkImpl#getBedienBezirkAdressformel <em>Bedien Bezirk Adressformel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_BezirkImpl#getBedienBezirkAllg <em>Bedien Bezirk Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_BezirkImpl#getBedienBezirkAnhaenge <em>Bedien Bezirk Anhaenge</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_BezirkImpl#getIDBedienZentrale <em>ID Bedien Zentrale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_BezirkImpl extends Basis_ObjektImpl implements Bedien_Bezirk {
	/**
	 * The cached value of the '{@link #getBedienBezirkAdressformel() <em>Bedien Bezirk Adressformel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienBezirkAdressformel()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk_Adressformel_AttributeGroup bedienBezirkAdressformel;

	/**
	 * The cached value of the '{@link #getBedienBezirkAllg() <em>Bedien Bezirk Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienBezirkAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk_Allg_AttributeGroup bedienBezirkAllg;

	/**
	 * The cached value of the '{@link #getBedienBezirkAnhaenge() <em>Bedien Bezirk Anhaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienBezirkAnhaenge()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk_Anhaenge_AttributeGroup bedienBezirkAnhaenge;

	/**
	 * The cached value of the '{@link #getIDBedienZentrale() <em>ID Bedien Zentrale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienZentrale()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Zentrale iDBedienZentrale;

	/**
	 * This is true if the ID Bedien Zentrale reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienZentraleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_BezirkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_BEZIRK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk_Adressformel_AttributeGroup getBedienBezirkAdressformel() {
		return bedienBezirkAdressformel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienBezirkAdressformel(Bedien_Bezirk_Adressformel_AttributeGroup newBedienBezirkAdressformel, NotificationChain msgs) {
		Bedien_Bezirk_Adressformel_AttributeGroup oldBedienBezirkAdressformel = bedienBezirkAdressformel;
		bedienBezirkAdressformel = newBedienBezirkAdressformel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL, oldBedienBezirkAdressformel, newBedienBezirkAdressformel);
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
	public void setBedienBezirkAdressformel(Bedien_Bezirk_Adressformel_AttributeGroup newBedienBezirkAdressformel) {
		if (newBedienBezirkAdressformel != bedienBezirkAdressformel) {
			NotificationChain msgs = null;
			if (bedienBezirkAdressformel != null)
				msgs = ((InternalEObject)bedienBezirkAdressformel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL, null, msgs);
			if (newBedienBezirkAdressformel != null)
				msgs = ((InternalEObject)newBedienBezirkAdressformel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL, null, msgs);
			msgs = basicSetBedienBezirkAdressformel(newBedienBezirkAdressformel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL, newBedienBezirkAdressformel, newBedienBezirkAdressformel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk_Allg_AttributeGroup getBedienBezirkAllg() {
		return bedienBezirkAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienBezirkAllg(Bedien_Bezirk_Allg_AttributeGroup newBedienBezirkAllg, NotificationChain msgs) {
		Bedien_Bezirk_Allg_AttributeGroup oldBedienBezirkAllg = bedienBezirkAllg;
		bedienBezirkAllg = newBedienBezirkAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG, oldBedienBezirkAllg, newBedienBezirkAllg);
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
	public void setBedienBezirkAllg(Bedien_Bezirk_Allg_AttributeGroup newBedienBezirkAllg) {
		if (newBedienBezirkAllg != bedienBezirkAllg) {
			NotificationChain msgs = null;
			if (bedienBezirkAllg != null)
				msgs = ((InternalEObject)bedienBezirkAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG, null, msgs);
			if (newBedienBezirkAllg != null)
				msgs = ((InternalEObject)newBedienBezirkAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG, null, msgs);
			msgs = basicSetBedienBezirkAllg(newBedienBezirkAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG, newBedienBezirkAllg, newBedienBezirkAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk_Anhaenge_AttributeGroup getBedienBezirkAnhaenge() {
		return bedienBezirkAnhaenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienBezirkAnhaenge(Bedien_Bezirk_Anhaenge_AttributeGroup newBedienBezirkAnhaenge, NotificationChain msgs) {
		Bedien_Bezirk_Anhaenge_AttributeGroup oldBedienBezirkAnhaenge = bedienBezirkAnhaenge;
		bedienBezirkAnhaenge = newBedienBezirkAnhaenge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE, oldBedienBezirkAnhaenge, newBedienBezirkAnhaenge);
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
	public void setBedienBezirkAnhaenge(Bedien_Bezirk_Anhaenge_AttributeGroup newBedienBezirkAnhaenge) {
		if (newBedienBezirkAnhaenge != bedienBezirkAnhaenge) {
			NotificationChain msgs = null;
			if (bedienBezirkAnhaenge != null)
				msgs = ((InternalEObject)bedienBezirkAnhaenge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE, null, msgs);
			if (newBedienBezirkAnhaenge != null)
				msgs = ((InternalEObject)newBedienBezirkAnhaenge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE, null, msgs);
			msgs = basicSetBedienBezirkAnhaenge(newBedienBezirkAnhaenge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE, newBedienBezirkAnhaenge, newBedienBezirkAnhaenge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Zentrale getIDBedienZentrale() {
		if (iDBedienZentrale != null && iDBedienZentrale.eIsProxy()) {
			InternalEObject oldIDBedienZentrale = (InternalEObject)iDBedienZentrale;
			iDBedienZentrale = (Bedien_Zentrale)eResolveProxy(oldIDBedienZentrale);
			if (iDBedienZentrale != oldIDBedienZentrale) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE, oldIDBedienZentrale, iDBedienZentrale));
			}
		}
		return iDBedienZentrale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Zentrale basicGetIDBedienZentrale() {
		return iDBedienZentrale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienZentrale(Bedien_Zentrale newIDBedienZentrale) {
		Bedien_Zentrale oldIDBedienZentrale = iDBedienZentrale;
		iDBedienZentrale = newIDBedienZentrale;
		boolean oldIDBedienZentraleESet = iDBedienZentraleESet;
		iDBedienZentraleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE, oldIDBedienZentrale, iDBedienZentrale, !oldIDBedienZentraleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienZentrale() {
		Bedien_Zentrale oldIDBedienZentrale = iDBedienZentrale;
		boolean oldIDBedienZentraleESet = iDBedienZentraleESet;
		iDBedienZentrale = null;
		iDBedienZentraleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE, oldIDBedienZentrale, null, oldIDBedienZentraleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienZentrale() {
		return iDBedienZentraleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL:
				return basicSetBedienBezirkAdressformel(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG:
				return basicSetBedienBezirkAllg(null, msgs);
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE:
				return basicSetBedienBezirkAnhaenge(null, msgs);
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
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL:
				return getBedienBezirkAdressformel();
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG:
				return getBedienBezirkAllg();
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE:
				return getBedienBezirkAnhaenge();
			case BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE:
				if (resolve) return getIDBedienZentrale();
				return basicGetIDBedienZentrale();
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
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL:
				setBedienBezirkAdressformel((Bedien_Bezirk_Adressformel_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG:
				setBedienBezirkAllg((Bedien_Bezirk_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE:
				setBedienBezirkAnhaenge((Bedien_Bezirk_Anhaenge_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE:
				setIDBedienZentrale((Bedien_Zentrale)newValue);
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
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL:
				setBedienBezirkAdressformel((Bedien_Bezirk_Adressformel_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG:
				setBedienBezirkAllg((Bedien_Bezirk_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE:
				setBedienBezirkAnhaenge((Bedien_Bezirk_Anhaenge_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE:
				unsetIDBedienZentrale();
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
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ADRESSFORMEL:
				return bedienBezirkAdressformel != null;
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ALLG:
				return bedienBezirkAllg != null;
			case BedienungPackage.BEDIEN_BEZIRK__BEDIEN_BEZIRK_ANHAENGE:
				return bedienBezirkAnhaenge != null;
			case BedienungPackage.BEDIEN_BEZIRK__ID_BEDIEN_ZENTRALE:
				return isSetIDBedienZentrale();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_BezirkImpl
