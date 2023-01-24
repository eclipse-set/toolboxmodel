/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.ATO.ATOPackage;
import org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz;
import org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz_Adresse_AttributeGroup;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO TS Instanz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_TS_InstanzImpl#getATOTSInstanzAdresse <em>ATOTS Instanz Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_TS_InstanzImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_TS_InstanzImpl extends Basis_ObjektImpl implements ATO_TS_Instanz {
	/**
	 * The cached value of the '{@link #getATOTSInstanzAdresse() <em>ATOTS Instanz Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOTSInstanzAdresse()
	 * @generated
	 * @ordered
	 */
	protected ATO_TS_Instanz_Adresse_AttributeGroup aTOTSInstanzAdresse;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_TS_InstanzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TS_INSTANZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_TS_Instanz_Adresse_AttributeGroup getATOTSInstanzAdresse() {
		return aTOTSInstanzAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATOTSInstanzAdresse(ATO_TS_Instanz_Adresse_AttributeGroup newATOTSInstanzAdresse, NotificationChain msgs) {
		ATO_TS_Instanz_Adresse_AttributeGroup oldATOTSInstanzAdresse = aTOTSInstanzAdresse;
		aTOTSInstanzAdresse = newATOTSInstanzAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, oldATOTSInstanzAdresse, newATOTSInstanzAdresse);
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
	public void setATOTSInstanzAdresse(ATO_TS_Instanz_Adresse_AttributeGroup newATOTSInstanzAdresse) {
		if (newATOTSInstanzAdresse != aTOTSInstanzAdresse) {
			NotificationChain msgs = null;
			if (aTOTSInstanzAdresse != null)
				msgs = ((InternalEObject)aTOTSInstanzAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, null, msgs);
			if (newATOTSInstanzAdresse != null)
				msgs = ((InternalEObject)newATOTSInstanzAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, null, msgs);
			msgs = basicSetATOTSInstanzAdresse(newATOTSInstanzAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE, newATOTSInstanzAdresse, newATOTSInstanzAdresse));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				return basicSetATOTSInstanzAdresse(null, msgs);
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				return getATOTSInstanzAdresse();
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				setATOTSInstanzAdresse((ATO_TS_Instanz_Adresse_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				setATOTSInstanzAdresse((ATO_TS_Instanz_Adresse_AttributeGroup)null);
				return;
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
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
			case ATOPackage.ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE:
				return aTOTSInstanzAdresse != null;
			case ATOPackage.ATO_TS_INSTANZ__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ATO_TS_InstanzImpl
