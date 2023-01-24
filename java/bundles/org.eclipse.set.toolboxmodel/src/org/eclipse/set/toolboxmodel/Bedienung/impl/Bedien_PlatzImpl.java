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

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Platz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_PlatzImpl#getBedienPlatzAllg <em>Bedien Platz Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_PlatzImpl#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_PlatzImpl#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_PlatzImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_PlatzImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_PlatzImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_PlatzImpl extends Basis_ObjektImpl implements Bedien_Platz {
	/**
	 * The cached value of the '{@link #getBedienPlatzAllg() <em>Bedien Platz Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienPlatzAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Platz_Allg_AttributeGroup bedienPlatzAllg;

	/**
	 * The cached value of the '{@link #getIDAnhangMoebelplanAufriss() <em>ID Anhang Moebelplan Aufriss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangMoebelplanAufriss()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangMoebelplanAufriss;

	/**
	 * This is true if the ID Anhang Moebelplan Aufriss reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangMoebelplanAufrissESet;

	/**
	 * The cached value of the '{@link #getIDAnhangMoebelplanGrundriss() <em>ID Anhang Moebelplan Grundriss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangMoebelplanGrundriss()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangMoebelplanGrundriss;

	/**
	 * This is true if the ID Anhang Moebelplan Grundriss reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangMoebelplanGrundrissESet;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung iDUnterbringung;

	/**
	 * This is true if the ID Unterbringung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUnterbringungESet;

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
	 * The cached value of the '{@link #getIDESTWZentraleinheit() <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected ESTW_Zentraleinheit iDESTWZentraleinheit;

	/**
	 * This is true if the IDESTW Zentraleinheit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDESTWZentraleinheitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_PlatzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_PLATZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Platz_Allg_AttributeGroup getBedienPlatzAllg() {
		return bedienPlatzAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienPlatzAllg(Bedien_Platz_Allg_AttributeGroup newBedienPlatzAllg, NotificationChain msgs) {
		Bedien_Platz_Allg_AttributeGroup oldBedienPlatzAllg = bedienPlatzAllg;
		bedienPlatzAllg = newBedienPlatzAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, oldBedienPlatzAllg, newBedienPlatzAllg);
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
	public void setBedienPlatzAllg(Bedien_Platz_Allg_AttributeGroup newBedienPlatzAllg) {
		if (newBedienPlatzAllg != bedienPlatzAllg) {
			NotificationChain msgs = null;
			if (bedienPlatzAllg != null)
				msgs = ((InternalEObject)bedienPlatzAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, null, msgs);
			if (newBedienPlatzAllg != null)
				msgs = ((InternalEObject)newBedienPlatzAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, null, msgs);
			msgs = basicSetBedienPlatzAllg(newBedienPlatzAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG, newBedienPlatzAllg, newBedienPlatzAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangMoebelplanAufriss() {
		if (iDAnhangMoebelplanAufriss != null && iDAnhangMoebelplanAufriss.eIsProxy()) {
			InternalEObject oldIDAnhangMoebelplanAufriss = (InternalEObject)iDAnhangMoebelplanAufriss;
			iDAnhangMoebelplanAufriss = (Anhang)eResolveProxy(oldIDAnhangMoebelplanAufriss);
			if (iDAnhangMoebelplanAufriss != oldIDAnhangMoebelplanAufriss) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, oldIDAnhangMoebelplanAufriss, iDAnhangMoebelplanAufriss));
			}
		}
		return iDAnhangMoebelplanAufriss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangMoebelplanAufriss() {
		return iDAnhangMoebelplanAufriss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangMoebelplanAufriss(Anhang newIDAnhangMoebelplanAufriss) {
		Anhang oldIDAnhangMoebelplanAufriss = iDAnhangMoebelplanAufriss;
		iDAnhangMoebelplanAufriss = newIDAnhangMoebelplanAufriss;
		boolean oldIDAnhangMoebelplanAufrissESet = iDAnhangMoebelplanAufrissESet;
		iDAnhangMoebelplanAufrissESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, oldIDAnhangMoebelplanAufriss, iDAnhangMoebelplanAufriss, !oldIDAnhangMoebelplanAufrissESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangMoebelplanAufriss() {
		Anhang oldIDAnhangMoebelplanAufriss = iDAnhangMoebelplanAufriss;
		boolean oldIDAnhangMoebelplanAufrissESet = iDAnhangMoebelplanAufrissESet;
		iDAnhangMoebelplanAufriss = null;
		iDAnhangMoebelplanAufrissESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS, oldIDAnhangMoebelplanAufriss, null, oldIDAnhangMoebelplanAufrissESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangMoebelplanAufriss() {
		return iDAnhangMoebelplanAufrissESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangMoebelplanGrundriss() {
		if (iDAnhangMoebelplanGrundriss != null && iDAnhangMoebelplanGrundriss.eIsProxy()) {
			InternalEObject oldIDAnhangMoebelplanGrundriss = (InternalEObject)iDAnhangMoebelplanGrundriss;
			iDAnhangMoebelplanGrundriss = (Anhang)eResolveProxy(oldIDAnhangMoebelplanGrundriss);
			if (iDAnhangMoebelplanGrundriss != oldIDAnhangMoebelplanGrundriss) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, oldIDAnhangMoebelplanGrundriss, iDAnhangMoebelplanGrundriss));
			}
		}
		return iDAnhangMoebelplanGrundriss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangMoebelplanGrundriss() {
		return iDAnhangMoebelplanGrundriss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangMoebelplanGrundriss(Anhang newIDAnhangMoebelplanGrundriss) {
		Anhang oldIDAnhangMoebelplanGrundriss = iDAnhangMoebelplanGrundriss;
		iDAnhangMoebelplanGrundriss = newIDAnhangMoebelplanGrundriss;
		boolean oldIDAnhangMoebelplanGrundrissESet = iDAnhangMoebelplanGrundrissESet;
		iDAnhangMoebelplanGrundrissESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, oldIDAnhangMoebelplanGrundriss, iDAnhangMoebelplanGrundriss, !oldIDAnhangMoebelplanGrundrissESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangMoebelplanGrundriss() {
		Anhang oldIDAnhangMoebelplanGrundriss = iDAnhangMoebelplanGrundriss;
		boolean oldIDAnhangMoebelplanGrundrissESet = iDAnhangMoebelplanGrundrissESet;
		iDAnhangMoebelplanGrundriss = null;
		iDAnhangMoebelplanGrundrissESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS, oldIDAnhangMoebelplanGrundriss, null, oldIDAnhangMoebelplanGrundrissESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangMoebelplanGrundriss() {
		return iDAnhangMoebelplanGrundrissESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung getIDUnterbringung() {
		if (iDUnterbringung != null && iDUnterbringung.eIsProxy()) {
			InternalEObject oldIDUnterbringung = (InternalEObject)iDUnterbringung;
			iDUnterbringung = (Unterbringung)eResolveProxy(oldIDUnterbringung);
			if (iDUnterbringung != oldIDUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
			}
		}
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterbringung basicGetIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUnterbringung(Unterbringung newIDUnterbringung) {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUnterbringung() {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringung = null;
		iDUnterbringungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUnterbringung() {
		return iDUnterbringungESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk, !oldIDBedienBezirkESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, null, oldIDBedienBezirkESet));
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
	public ESTW_Zentraleinheit getIDESTWZentraleinheit() {
		if (iDESTWZentraleinheit != null && iDESTWZentraleinheit.eIsProxy()) {
			InternalEObject oldIDESTWZentraleinheit = (InternalEObject)iDESTWZentraleinheit;
			iDESTWZentraleinheit = (ESTW_Zentraleinheit)eResolveProxy(oldIDESTWZentraleinheit);
			if (iDESTWZentraleinheit != oldIDESTWZentraleinheit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, iDESTWZentraleinheit));
			}
		}
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESTW_Zentraleinheit basicGetIDESTWZentraleinheit() {
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDESTWZentraleinheit(ESTW_Zentraleinheit newIDESTWZentraleinheit) {
		ESTW_Zentraleinheit oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		iDESTWZentraleinheit = newIDESTWZentraleinheit;
		boolean oldIDESTWZentraleinheitESet = iDESTWZentraleinheitESet;
		iDESTWZentraleinheitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, iDESTWZentraleinheit, !oldIDESTWZentraleinheitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDESTWZentraleinheit() {
		ESTW_Zentraleinheit oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		boolean oldIDESTWZentraleinheitESet = iDESTWZentraleinheitESet;
		iDESTWZentraleinheit = null;
		iDESTWZentraleinheitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, null, oldIDESTWZentraleinheitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDESTWZentraleinheit() {
		return iDESTWZentraleinheitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				return basicSetBedienPlatzAllg(null, msgs);
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				return getBedienPlatzAllg();
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				if (resolve) return getIDAnhangMoebelplanAufriss();
				return basicGetIDAnhangMoebelplanAufriss();
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				if (resolve) return getIDAnhangMoebelplanGrundriss();
				return basicGetIDAnhangMoebelplanGrundriss();
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				if (resolve) return getIDBedienBezirk();
				return basicGetIDBedienBezirk();
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				if (resolve) return getIDESTWZentraleinheit();
				return basicGetIDESTWZentraleinheit();
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				setBedienPlatzAllg((Bedien_Platz_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				setIDAnhangMoebelplanAufriss((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				setIDAnhangMoebelplanGrundriss((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((Bedien_Bezirk)newValue);
				return;
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ESTW_Zentraleinheit)newValue);
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				setBedienPlatzAllg((Bedien_Platz_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				unsetIDAnhangMoebelplanAufriss();
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				unsetIDAnhangMoebelplanGrundriss();
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				unsetIDBedienBezirk();
				return;
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				unsetIDESTWZentraleinheit();
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
			case BedienungPackage.BEDIEN_PLATZ__BEDIEN_PLATZ_ALLG:
				return bedienPlatzAllg != null;
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_AUFRISS:
				return isSetIDAnhangMoebelplanAufriss();
			case BedienungPackage.BEDIEN_PLATZ__ID_ANHANG_MOEBELPLAN_GRUNDRISS:
				return isSetIDAnhangMoebelplanGrundriss();
			case BedienungPackage.BEDIEN_PLATZ__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case BedienungPackage.BEDIEN_PLATZ__ID_BEDIEN_BEZIRK:
				return isSetIDBedienBezirk();
			case BedienungPackage.BEDIEN_PLATZ__IDESTW_ZENTRALEINHEIT:
				return isSetIDESTWZentraleinheit();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_PlatzImpl
