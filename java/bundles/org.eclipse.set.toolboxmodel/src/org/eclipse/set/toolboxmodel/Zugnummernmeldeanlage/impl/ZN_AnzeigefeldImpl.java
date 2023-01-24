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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Anzeigefeld</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getZNAnzeigefeldAllg <em>ZN Anzeigefeld Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_AnzeigefeldImpl#getZNAnzeigefeldBezeichnung <em>ZN Anzeigefeld Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_AnzeigefeldImpl extends Basis_ObjektImpl implements ZN_Anzeigefeld {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Abschnitt iDGleisAbschnitt;

	/**
	 * This is true if the ID Gleis Abschnitt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGleisAbschnittESet;

	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected EList<ZLV_Bus> iDZLVBus;

	/**
	 * The cached value of the '{@link #getIDZN() <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZN()
	 * @generated
	 * @ordered
	 */
	protected ZN iDZN;

	/**
	 * This is true if the IDZN reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNESet;

	/**
	 * The cached value of the '{@link #getIDZNAnzeigefeld() <em>IDZN Anzeigefeld</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld iDZNAnzeigefeld;

	/**
	 * This is true if the IDZN Anzeigefeld reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNAnzeigefeldESet;

	/**
	 * The cached value of the '{@link #getZNAnzeigefeldAllg() <em>ZN Anzeigefeld Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnzeigefeldAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld_Allg_AttributeGroup zNAnzeigefeldAllg;

	/**
	 * The cached value of the '{@link #getZNAnzeigefeldBezeichnung() <em>ZN Anzeigefeld Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAnzeigefeldBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld_Bezeichnung_AttributeGroup zNAnzeigefeldBezeichnung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_AnzeigefeldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschnitt getIDGleisAbschnitt() {
		if (iDGleisAbschnitt != null && iDGleisAbschnitt.eIsProxy()) {
			InternalEObject oldIDGleisAbschnitt = (InternalEObject)iDGleisAbschnitt;
			iDGleisAbschnitt = (Gleis_Abschnitt)eResolveProxy(oldIDGleisAbschnitt);
			if (iDGleisAbschnitt != oldIDGleisAbschnitt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, iDGleisAbschnitt));
			}
		}
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gleis_Abschnitt basicGetIDGleisAbschnitt() {
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGleisAbschnitt(Gleis_Abschnitt newIDGleisAbschnitt) {
		Gleis_Abschnitt oldIDGleisAbschnitt = iDGleisAbschnitt;
		iDGleisAbschnitt = newIDGleisAbschnitt;
		boolean oldIDGleisAbschnittESet = iDGleisAbschnittESet;
		iDGleisAbschnittESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, iDGleisAbschnitt, !oldIDGleisAbschnittESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGleisAbschnitt() {
		Gleis_Abschnitt oldIDGleisAbschnitt = iDGleisAbschnitt;
		boolean oldIDGleisAbschnittESet = iDGleisAbschnittESet;
		iDGleisAbschnitt = null;
		iDGleisAbschnittESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, null, oldIDGleisAbschnittESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGleisAbschnitt() {
		return iDGleisAbschnittESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZLV_Bus> getIDZLVBus() {
		if (iDZLVBus == null) {
			iDZLVBus = new EObjectResolvingEList<ZLV_Bus>(ZLV_Bus.class, this, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS);
		}
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN getIDZN() {
		if (iDZN != null && iDZN.eIsProxy()) {
			InternalEObject oldIDZN = (InternalEObject)iDZN;
			iDZN = (ZN)eResolveProxy(oldIDZN);
			if (iDZN != oldIDZN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, oldIDZN, iDZN));
			}
		}
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN basicGetIDZN() {
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZN(ZN newIDZN) {
		ZN oldIDZN = iDZN;
		iDZN = newIDZN;
		boolean oldIDZNESet = iDZNESet;
		iDZNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, oldIDZN, iDZN, !oldIDZNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZN() {
		ZN oldIDZN = iDZN;
		boolean oldIDZNESet = iDZNESet;
		iDZN = null;
		iDZNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN, oldIDZN, null, oldIDZNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZN() {
		return iDZNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld getIDZNAnzeigefeld() {
		if (iDZNAnzeigefeld != null && iDZNAnzeigefeld.eIsProxy()) {
			InternalEObject oldIDZNAnzeigefeld = (InternalEObject)iDZNAnzeigefeld;
			iDZNAnzeigefeld = (ZN_Anzeigefeld)eResolveProxy(oldIDZNAnzeigefeld);
			if (iDZNAnzeigefeld != oldIDZNAnzeigefeld) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, iDZNAnzeigefeld));
			}
		}
		return iDZNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Anzeigefeld basicGetIDZNAnzeigefeld() {
		return iDZNAnzeigefeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNAnzeigefeld(ZN_Anzeigefeld newIDZNAnzeigefeld) {
		ZN_Anzeigefeld oldIDZNAnzeigefeld = iDZNAnzeigefeld;
		iDZNAnzeigefeld = newIDZNAnzeigefeld;
		boolean oldIDZNAnzeigefeldESet = iDZNAnzeigefeldESet;
		iDZNAnzeigefeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, iDZNAnzeigefeld, !oldIDZNAnzeigefeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNAnzeigefeld() {
		ZN_Anzeigefeld oldIDZNAnzeigefeld = iDZNAnzeigefeld;
		boolean oldIDZNAnzeigefeldESet = iDZNAnzeigefeldESet;
		iDZNAnzeigefeld = null;
		iDZNAnzeigefeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD, oldIDZNAnzeigefeld, null, oldIDZNAnzeigefeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNAnzeigefeld() {
		return iDZNAnzeigefeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Allg_AttributeGroup getZNAnzeigefeldAllg() {
		return zNAnzeigefeldAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup newZNAnzeigefeldAllg, NotificationChain msgs) {
		ZN_Anzeigefeld_Allg_AttributeGroup oldZNAnzeigefeldAllg = zNAnzeigefeldAllg;
		zNAnzeigefeldAllg = newZNAnzeigefeldAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, oldZNAnzeigefeldAllg, newZNAnzeigefeldAllg);
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
	public void setZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup newZNAnzeigefeldAllg) {
		if (newZNAnzeigefeldAllg != zNAnzeigefeldAllg) {
			NotificationChain msgs = null;
			if (zNAnzeigefeldAllg != null)
				msgs = ((InternalEObject)zNAnzeigefeldAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, null, msgs);
			if (newZNAnzeigefeldAllg != null)
				msgs = ((InternalEObject)newZNAnzeigefeldAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, null, msgs);
			msgs = basicSetZNAnzeigefeldAllg(newZNAnzeigefeldAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG, newZNAnzeigefeldAllg, newZNAnzeigefeldAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld_Bezeichnung_AttributeGroup getZNAnzeigefeldBezeichnung() {
		return zNAnzeigefeldBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup newZNAnzeigefeldBezeichnung, NotificationChain msgs) {
		ZN_Anzeigefeld_Bezeichnung_AttributeGroup oldZNAnzeigefeldBezeichnung = zNAnzeigefeldBezeichnung;
		zNAnzeigefeldBezeichnung = newZNAnzeigefeldBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, oldZNAnzeigefeldBezeichnung, newZNAnzeigefeldBezeichnung);
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
	public void setZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup newZNAnzeigefeldBezeichnung) {
		if (newZNAnzeigefeldBezeichnung != zNAnzeigefeldBezeichnung) {
			NotificationChain msgs = null;
			if (zNAnzeigefeldBezeichnung != null)
				msgs = ((InternalEObject)zNAnzeigefeldBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, null, msgs);
			if (newZNAnzeigefeldBezeichnung != null)
				msgs = ((InternalEObject)newZNAnzeigefeldBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, null, msgs);
			msgs = basicSetZNAnzeigefeldBezeichnung(newZNAnzeigefeldBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG, newZNAnzeigefeldBezeichnung, newZNAnzeigefeldBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				return basicSetZNAnzeigefeldAllg(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				return basicSetZNAnzeigefeldBezeichnung(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				if (resolve) return getIDGleisAbschnitt();
				return basicGetIDGleisAbschnitt();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				return getIDZLVBus();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				if (resolve) return getIDZN();
				return basicGetIDZN();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				if (resolve) return getIDZNAnzeigefeld();
				return basicGetIDZNAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				return getZNAnzeigefeldAllg();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				return getZNAnzeigefeldBezeichnung();
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((Gleis_Abschnitt)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				getIDZLVBus().clear();
				getIDZLVBus().addAll((Collection<? extends ZLV_Bus>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				setIDZN((ZN)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				setIDZNAnzeigefeld((ZN_Anzeigefeld)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				setZNAnzeigefeldAllg((ZN_Anzeigefeld_Allg_AttributeGroup)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				setZNAnzeigefeldBezeichnung((ZN_Anzeigefeld_Bezeichnung_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				unsetIDGleisAbschnitt();
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				getIDZLVBus().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				unsetIDZN();
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				unsetIDZNAnzeigefeld();
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				setZNAnzeigefeldAllg((ZN_Anzeigefeld_Allg_AttributeGroup)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				setZNAnzeigefeldBezeichnung((ZN_Anzeigefeld_Bezeichnung_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT:
				return isSetIDGleisAbschnitt();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZLV_BUS:
				return iDZLVBus != null && !iDZLVBus.isEmpty();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN:
				return isSetIDZN();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD:
				return isSetIDZNAnzeigefeld();
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
				return zNAnzeigefeldAllg != null;
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
				return zNAnzeigefeldBezeichnung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_AnzeigefeldImpl
