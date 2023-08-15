/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Block.Block_Element;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markanter Punkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Markanter_PunktImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Markanter_PunktImpl#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Markanter_PunktImpl#getIDMarkanteStelle <em>ID Markante Stelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Markanter_PunktImpl extends Basis_ObjektImpl implements Markanter_Punkt {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDDWegErlaubnisabhaengig() <em>IDD Weg Erlaubnisabhaengig</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDWegErlaubnisabhaengig()
	 * @generated
	 * @ordered
	 */
	protected Block_Element iDDWegErlaubnisabhaengig;

	/**
	 * This is true if the IDD Weg Erlaubnisabhaengig reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDDWegErlaubnisabhaengigESet;

	/**
	 * The cached value of the '{@link #getIDMarkanteStelle() <em>ID Markante Stelle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanteStelle()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDMarkanteStelle;

	/**
	 * This is true if the ID Markante Stelle reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDMarkanteStelleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Markanter_PunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.MARKANTER_PUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Markanter_Punkt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element getIDDWegErlaubnisabhaengig() {
		if (iDDWegErlaubnisabhaengig != null && iDDWegErlaubnisabhaengig.eIsProxy()) {
			InternalEObject oldIDDWegErlaubnisabhaengig = (InternalEObject)iDDWegErlaubnisabhaengig;
			iDDWegErlaubnisabhaengig = (Block_Element)eResolveProxy(oldIDDWegErlaubnisabhaengig);
			if (iDDWegErlaubnisabhaengig != oldIDDWegErlaubnisabhaengig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, oldIDDWegErlaubnisabhaengig, iDDWegErlaubnisabhaengig));
			}
		}
		return iDDWegErlaubnisabhaengig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_Element basicGetIDDWegErlaubnisabhaengig() {
		return iDDWegErlaubnisabhaengig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDDWegErlaubnisabhaengig(Block_Element newIDDWegErlaubnisabhaengig) {
		Block_Element oldIDDWegErlaubnisabhaengig = iDDWegErlaubnisabhaengig;
		iDDWegErlaubnisabhaengig = newIDDWegErlaubnisabhaengig;
		boolean oldIDDWegErlaubnisabhaengigESet = iDDWegErlaubnisabhaengigESet;
		iDDWegErlaubnisabhaengigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, oldIDDWegErlaubnisabhaengig, iDDWegErlaubnisabhaengig, !oldIDDWegErlaubnisabhaengigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDDWegErlaubnisabhaengig() {
		Block_Element oldIDDWegErlaubnisabhaengig = iDDWegErlaubnisabhaengig;
		boolean oldIDDWegErlaubnisabhaengigESet = iDDWegErlaubnisabhaengigESet;
		iDDWegErlaubnisabhaengig = null;
		iDDWegErlaubnisabhaengigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG, oldIDDWegErlaubnisabhaengig, null, oldIDDWegErlaubnisabhaengigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDDWegErlaubnisabhaengig() {
		return iDDWegErlaubnisabhaengigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDMarkanteStelle() {
		if (iDMarkanteStelle != null && iDMarkanteStelle.eIsProxy()) {
			InternalEObject oldIDMarkanteStelle = (InternalEObject)iDMarkanteStelle;
			iDMarkanteStelle = (Basis_Objekt)eResolveProxy(oldIDMarkanteStelle);
			if (iDMarkanteStelle != oldIDMarkanteStelle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, oldIDMarkanteStelle, iDMarkanteStelle));
			}
		}
		return iDMarkanteStelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDMarkanteStelle() {
		return iDMarkanteStelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDMarkanteStelle(Basis_Objekt newIDMarkanteStelle) {
		Basis_Objekt oldIDMarkanteStelle = iDMarkanteStelle;
		iDMarkanteStelle = newIDMarkanteStelle;
		boolean oldIDMarkanteStelleESet = iDMarkanteStelleESet;
		iDMarkanteStelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, oldIDMarkanteStelle, iDMarkanteStelle, !oldIDMarkanteStelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDMarkanteStelle() {
		Basis_Objekt oldIDMarkanteStelle = iDMarkanteStelle;
		boolean oldIDMarkanteStelleESet = iDMarkanteStelleESet;
		iDMarkanteStelle = null;
		iDMarkanteStelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE, oldIDMarkanteStelle, null, oldIDMarkanteStelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDMarkanteStelle() {
		return iDMarkanteStelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				return getBezeichnung();
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				if (resolve) return getIDDWegErlaubnisabhaengig();
				return basicGetIDDWegErlaubnisabhaengig();
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				if (resolve) return getIDMarkanteStelle();
				return basicGetIDMarkanteStelle();
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				setBezeichnung((Markanter_Punkt_Bezeichnung_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				setIDDWegErlaubnisabhaengig((Block_Element)newValue);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				setIDMarkanteStelle((Basis_Objekt)newValue);
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				setBezeichnung((Markanter_Punkt_Bezeichnung_AttributeGroup)null);
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				unsetIDDWegErlaubnisabhaengig();
				return;
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				unsetIDMarkanteStelle();
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
			case FahrstrassePackage.MARKANTER_PUNKT__BEZEICHNUNG:
				return bezeichnung != null;
			case FahrstrassePackage.MARKANTER_PUNKT__IDD_WEG_ERLAUBNISABHAENGIG:
				return isSetIDDWegErlaubnisabhaengig();
			case FahrstrassePackage.MARKANTER_PUNKT__ID_MARKANTE_STELLE:
				return isSetIDMarkanteStelle();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Markanter_PunktImpl
