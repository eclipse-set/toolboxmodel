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

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Ortung.OrtungPackage;
import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Funktion_TypeClass;
import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schaltmittel Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.Schaltmittel_ZuordnungImpl#getIDAnforderung <em>ID Anforderung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.Schaltmittel_ZuordnungImpl#getIDSchalter <em>ID Schalter</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.Schaltmittel_ZuordnungImpl#getSchaltmittelFunktion <em>Schaltmittel Funktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schaltmittel_ZuordnungImpl extends Basis_ObjektImpl implements Schaltmittel_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDAnforderung() <em>ID Anforderung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnforderung()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDAnforderung;

	/**
	 * This is true if the ID Anforderung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnforderungESet;

	/**
	 * The cached value of the '{@link #getIDSchalter() <em>ID Schalter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchalter()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDSchalter;

	/**
	 * This is true if the ID Schalter reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSchalterESet;

	/**
	 * The cached value of the '{@link #getSchaltmittelFunktion() <em>Schaltmittel Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchaltmittelFunktion()
	 * @generated
	 * @ordered
	 */
	protected Schaltmittel_Funktion_TypeClass schaltmittelFunktion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schaltmittel_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.SCHALTMITTEL_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDAnforderung() {
		if (iDAnforderung != null && iDAnforderung.eIsProxy()) {
			InternalEObject oldIDAnforderung = (InternalEObject)iDAnforderung;
			iDAnforderung = (Basis_Objekt)eResolveProxy(oldIDAnforderung);
			if (iDAnforderung != oldIDAnforderung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, oldIDAnforderung, iDAnforderung));
			}
		}
		return iDAnforderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDAnforderung() {
		return iDAnforderung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnforderung(Basis_Objekt newIDAnforderung) {
		Basis_Objekt oldIDAnforderung = iDAnforderung;
		iDAnforderung = newIDAnforderung;
		boolean oldIDAnforderungESet = iDAnforderungESet;
		iDAnforderungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, oldIDAnforderung, iDAnforderung, !oldIDAnforderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnforderung() {
		Basis_Objekt oldIDAnforderung = iDAnforderung;
		boolean oldIDAnforderungESet = iDAnforderungESet;
		iDAnforderung = null;
		iDAnforderungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG, oldIDAnforderung, null, oldIDAnforderungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnforderung() {
		return iDAnforderungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDSchalter() {
		if (iDSchalter != null && iDSchalter.eIsProxy()) {
			InternalEObject oldIDSchalter = (InternalEObject)iDSchalter;
			iDSchalter = (Basis_Objekt)eResolveProxy(oldIDSchalter);
			if (iDSchalter != oldIDSchalter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, oldIDSchalter, iDSchalter));
			}
		}
		return iDSchalter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDSchalter() {
		return iDSchalter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSchalter(Basis_Objekt newIDSchalter) {
		Basis_Objekt oldIDSchalter = iDSchalter;
		iDSchalter = newIDSchalter;
		boolean oldIDSchalterESet = iDSchalterESet;
		iDSchalterESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, oldIDSchalter, iDSchalter, !oldIDSchalterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSchalter() {
		Basis_Objekt oldIDSchalter = iDSchalter;
		boolean oldIDSchalterESet = iDSchalterESet;
		iDSchalter = null;
		iDSchalterESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER, oldIDSchalter, null, oldIDSchalterESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSchalter() {
		return iDSchalterESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Funktion_TypeClass getSchaltmittelFunktion() {
		return schaltmittelFunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchaltmittelFunktion(Schaltmittel_Funktion_TypeClass newSchaltmittelFunktion, NotificationChain msgs) {
		Schaltmittel_Funktion_TypeClass oldSchaltmittelFunktion = schaltmittelFunktion;
		schaltmittelFunktion = newSchaltmittelFunktion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, oldSchaltmittelFunktion, newSchaltmittelFunktion);
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
	public void setSchaltmittelFunktion(Schaltmittel_Funktion_TypeClass newSchaltmittelFunktion) {
		if (newSchaltmittelFunktion != schaltmittelFunktion) {
			NotificationChain msgs = null;
			if (schaltmittelFunktion != null)
				msgs = ((InternalEObject)schaltmittelFunktion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, null, msgs);
			if (newSchaltmittelFunktion != null)
				msgs = ((InternalEObject)newSchaltmittelFunktion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, null, msgs);
			msgs = basicSetSchaltmittelFunktion(newSchaltmittelFunktion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION, newSchaltmittelFunktion, newSchaltmittelFunktion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				return basicSetSchaltmittelFunktion(null, msgs);
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				if (resolve) return getIDAnforderung();
				return basicGetIDAnforderung();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				if (resolve) return getIDSchalter();
				return basicGetIDSchalter();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				return getSchaltmittelFunktion();
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				setIDAnforderung((Basis_Objekt)newValue);
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				setIDSchalter((Basis_Objekt)newValue);
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				setSchaltmittelFunktion((Schaltmittel_Funktion_TypeClass)newValue);
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				unsetIDAnforderung();
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				unsetIDSchalter();
				return;
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				setSchaltmittelFunktion((Schaltmittel_Funktion_TypeClass)null);
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
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_ANFORDERUNG:
				return isSetIDAnforderung();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__ID_SCHALTER:
				return isSetIDSchalter();
			case OrtungPackage.SCHALTMITTEL_ZUORDNUNG__SCHALTMITTEL_FUNKTION:
				return schaltmittelFunktion != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schaltmittel_ZuordnungImpl
