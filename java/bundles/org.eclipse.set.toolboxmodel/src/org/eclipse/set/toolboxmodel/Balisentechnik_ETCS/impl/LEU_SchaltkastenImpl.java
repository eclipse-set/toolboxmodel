/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Typ_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Schaltkasten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_SchaltkastenImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_SchaltkastenImpl#getLEUSchaltkastenEnergie <em>LEU Schaltkasten Energie</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_SchaltkastenImpl#getLEUSchaltkastenTyp <em>LEU Schaltkasten Typ</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_SchaltkastenImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_SchaltkastenImpl#getLEUSchaltkastenPosition <em>LEU Schaltkasten Position</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_SchaltkastenImpl extends Basis_ObjektImpl implements LEU_Schaltkasten {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected LEU_Schaltkasten_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getLEUSchaltkastenEnergie() <em>LEU Schaltkasten Energie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUSchaltkastenEnergie()
	 * @generated
	 * @ordered
	 */
	protected LEU_Schaltkasten_Energie_AttributeGroup lEUSchaltkastenEnergie;

	/**
	 * The cached value of the '{@link #getLEUSchaltkastenTyp() <em>LEU Schaltkasten Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUSchaltkastenTyp()
	 * @generated
	 * @ordered
	 */
	protected LEU_Schaltkasten_Typ_TypeClass lEUSchaltkastenTyp;

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
	 * The cached value of the '{@link #getLEUSchaltkastenPosition() <em>LEU Schaltkasten Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUSchaltkastenPosition()
	 * @generated
	 * @ordered
	 */
	protected LEU_Schaltkasten_Position_AttributeGroup lEUSchaltkastenPosition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_SchaltkastenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Schaltkasten();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(LEU_Schaltkasten_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		LEU_Schaltkasten_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(LEU_Schaltkasten_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Energie_AttributeGroup getLEUSchaltkastenEnergie() {
		return lEUSchaltkastenEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUSchaltkastenEnergie(LEU_Schaltkasten_Energie_AttributeGroup newLEUSchaltkastenEnergie, NotificationChain msgs) {
		LEU_Schaltkasten_Energie_AttributeGroup oldLEUSchaltkastenEnergie = lEUSchaltkastenEnergie;
		lEUSchaltkastenEnergie = newLEUSchaltkastenEnergie;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE, oldLEUSchaltkastenEnergie, newLEUSchaltkastenEnergie);
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
	public void setLEUSchaltkastenEnergie(LEU_Schaltkasten_Energie_AttributeGroup newLEUSchaltkastenEnergie) {
		if (newLEUSchaltkastenEnergie != lEUSchaltkastenEnergie) {
			NotificationChain msgs = null;
			if (lEUSchaltkastenEnergie != null)
				msgs = ((InternalEObject)lEUSchaltkastenEnergie).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE, null, msgs);
			if (newLEUSchaltkastenEnergie != null)
				msgs = ((InternalEObject)newLEUSchaltkastenEnergie).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE, null, msgs);
			msgs = basicSetLEUSchaltkastenEnergie(newLEUSchaltkastenEnergie, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE, newLEUSchaltkastenEnergie, newLEUSchaltkastenEnergie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten_Typ_TypeClass getLEUSchaltkastenTyp() {
		return lEUSchaltkastenTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUSchaltkastenTyp(LEU_Schaltkasten_Typ_TypeClass newLEUSchaltkastenTyp, NotificationChain msgs) {
		LEU_Schaltkasten_Typ_TypeClass oldLEUSchaltkastenTyp = lEUSchaltkastenTyp;
		lEUSchaltkastenTyp = newLEUSchaltkastenTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP, oldLEUSchaltkastenTyp, newLEUSchaltkastenTyp);
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
	public void setLEUSchaltkastenTyp(LEU_Schaltkasten_Typ_TypeClass newLEUSchaltkastenTyp) {
		if (newLEUSchaltkastenTyp != lEUSchaltkastenTyp) {
			NotificationChain msgs = null;
			if (lEUSchaltkastenTyp != null)
				msgs = ((InternalEObject)lEUSchaltkastenTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP, null, msgs);
			if (newLEUSchaltkastenTyp != null)
				msgs = ((InternalEObject)newLEUSchaltkastenTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP, null, msgs);
			msgs = basicSetLEUSchaltkastenTyp(newLEUSchaltkastenTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP, newLEUSchaltkastenTyp, newLEUSchaltkastenTyp));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public LEU_Schaltkasten_Position_AttributeGroup getLEUSchaltkastenPosition() {
		return lEUSchaltkastenPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUSchaltkastenPosition(LEU_Schaltkasten_Position_AttributeGroup newLEUSchaltkastenPosition, NotificationChain msgs) {
		LEU_Schaltkasten_Position_AttributeGroup oldLEUSchaltkastenPosition = lEUSchaltkastenPosition;
		lEUSchaltkastenPosition = newLEUSchaltkastenPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION, oldLEUSchaltkastenPosition, newLEUSchaltkastenPosition);
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
	public void setLEUSchaltkastenPosition(LEU_Schaltkasten_Position_AttributeGroup newLEUSchaltkastenPosition) {
		if (newLEUSchaltkastenPosition != lEUSchaltkastenPosition) {
			NotificationChain msgs = null;
			if (lEUSchaltkastenPosition != null)
				msgs = ((InternalEObject)lEUSchaltkastenPosition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION, null, msgs);
			if (newLEUSchaltkastenPosition != null)
				msgs = ((InternalEObject)newLEUSchaltkastenPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION, null, msgs);
			msgs = basicSetLEUSchaltkastenPosition(newLEUSchaltkastenPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION, newLEUSchaltkastenPosition, newLEUSchaltkastenPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE:
				return basicSetLEUSchaltkastenEnergie(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP:
				return basicSetLEUSchaltkastenTyp(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION:
				return basicSetLEUSchaltkastenPosition(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE:
				return getLEUSchaltkastenEnergie();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP:
				return getLEUSchaltkastenTyp();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION:
				return getLEUSchaltkastenPosition();
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG:
				setBezeichnung((LEU_Schaltkasten_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE:
				setLEUSchaltkastenEnergie((LEU_Schaltkasten_Energie_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP:
				setLEUSchaltkastenTyp((LEU_Schaltkasten_Typ_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION:
				setLEUSchaltkastenPosition((LEU_Schaltkasten_Position_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG:
				setBezeichnung((LEU_Schaltkasten_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE:
				setLEUSchaltkastenEnergie((LEU_Schaltkasten_Energie_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP:
				setLEUSchaltkastenTyp((LEU_Schaltkasten_Typ_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION:
				setLEUSchaltkastenPosition((LEU_Schaltkasten_Position_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_ENERGIE:
				return lEUSchaltkastenEnergie != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_TYP:
				return lEUSchaltkastenTyp != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN__LEU_SCHALTKASTEN_POSITION:
				return lEUSchaltkastenPosition != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_SchaltkastenImpl
