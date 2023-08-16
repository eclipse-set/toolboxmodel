/**
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

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anrueckabschnitt;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anrueckabschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_AnrueckabschnittImpl#getIDGleisAbschnittPosition <em>ID Gleis Abschnitt Position</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_AnrueckabschnittImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_AnrueckabschnittImpl#getIDGleisAbschnittDarstellen <em>ID Gleis Abschnitt Darstellen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_AnrueckabschnittImpl extends Basis_ObjektImpl implements Bedien_Anrueckabschnitt {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnittPosition() <em>ID Gleis Abschnitt Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnittPosition()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Abschnitt iDGleisAbschnittPosition;

	/**
	 * This is true if the ID Gleis Abschnitt Position reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGleisAbschnittPositionESet;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDGleisAbschnittDarstellen() <em>ID Gleis Abschnitt Darstellen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnittDarstellen()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Abschnitt iDGleisAbschnittDarstellen;

	/**
	 * This is true if the ID Gleis Abschnitt Darstellen reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGleisAbschnittDarstellenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_AnrueckabschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANRUECKABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschnitt getIDGleisAbschnittPosition() {
		if (iDGleisAbschnittPosition != null && iDGleisAbschnittPosition.eIsProxy()) {
			InternalEObject oldIDGleisAbschnittPosition = (InternalEObject)iDGleisAbschnittPosition;
			iDGleisAbschnittPosition = (Gleis_Abschnitt)eResolveProxy(oldIDGleisAbschnittPosition);
			if (iDGleisAbschnittPosition != oldIDGleisAbschnittPosition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, oldIDGleisAbschnittPosition, iDGleisAbschnittPosition));
			}
		}
		return iDGleisAbschnittPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gleis_Abschnitt basicGetIDGleisAbschnittPosition() {
		return iDGleisAbschnittPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGleisAbschnittPosition(Gleis_Abschnitt newIDGleisAbschnittPosition) {
		Gleis_Abschnitt oldIDGleisAbschnittPosition = iDGleisAbschnittPosition;
		iDGleisAbschnittPosition = newIDGleisAbschnittPosition;
		boolean oldIDGleisAbschnittPositionESet = iDGleisAbschnittPositionESet;
		iDGleisAbschnittPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, oldIDGleisAbschnittPosition, iDGleisAbschnittPosition, !oldIDGleisAbschnittPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGleisAbschnittPosition() {
		Gleis_Abschnitt oldIDGleisAbschnittPosition = iDGleisAbschnittPosition;
		boolean oldIDGleisAbschnittPositionESet = iDGleisAbschnittPositionESet;
		iDGleisAbschnittPosition = null;
		iDGleisAbschnittPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION, oldIDGleisAbschnittPosition, null, oldIDGleisAbschnittPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGleisAbschnittPosition() {
		return iDGleisAbschnittPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschnitt getIDGleisAbschnittDarstellen() {
		if (iDGleisAbschnittDarstellen != null && iDGleisAbschnittDarstellen.eIsProxy()) {
			InternalEObject oldIDGleisAbschnittDarstellen = (InternalEObject)iDGleisAbschnittDarstellen;
			iDGleisAbschnittDarstellen = (Gleis_Abschnitt)eResolveProxy(oldIDGleisAbschnittDarstellen);
			if (iDGleisAbschnittDarstellen != oldIDGleisAbschnittDarstellen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, oldIDGleisAbschnittDarstellen, iDGleisAbschnittDarstellen));
			}
		}
		return iDGleisAbschnittDarstellen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gleis_Abschnitt basicGetIDGleisAbschnittDarstellen() {
		return iDGleisAbschnittDarstellen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGleisAbschnittDarstellen(Gleis_Abschnitt newIDGleisAbschnittDarstellen) {
		Gleis_Abschnitt oldIDGleisAbschnittDarstellen = iDGleisAbschnittDarstellen;
		iDGleisAbschnittDarstellen = newIDGleisAbschnittDarstellen;
		boolean oldIDGleisAbschnittDarstellenESet = iDGleisAbschnittDarstellenESet;
		iDGleisAbschnittDarstellenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, oldIDGleisAbschnittDarstellen, iDGleisAbschnittDarstellen, !oldIDGleisAbschnittDarstellenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGleisAbschnittDarstellen() {
		Gleis_Abschnitt oldIDGleisAbschnittDarstellen = iDGleisAbschnittDarstellen;
		boolean oldIDGleisAbschnittDarstellenESet = iDGleisAbschnittDarstellenESet;
		iDGleisAbschnittDarstellen = null;
		iDGleisAbschnittDarstellenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN, oldIDGleisAbschnittDarstellen, null, oldIDGleisAbschnittDarstellenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGleisAbschnittDarstellen() {
		return iDGleisAbschnittDarstellenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				if (resolve) return getIDGleisAbschnittPosition();
				return basicGetIDGleisAbschnittPosition();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				if (resolve) return getIDGleisAbschnittDarstellen();
				return basicGetIDGleisAbschnittDarstellen();
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				setIDGleisAbschnittPosition((Gleis_Abschnitt)newValue);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				setIDGleisAbschnittDarstellen((Gleis_Abschnitt)newValue);
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				unsetIDGleisAbschnittPosition();
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				unsetIDGleisAbschnittDarstellen();
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
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_POSITION:
				return isSetIDGleisAbschnittPosition();
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_ANRUECKABSCHNITT__ID_GLEIS_ABSCHNITT_DARSTELLEN:
				return isSetIDGleisAbschnittDarstellen();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_AnrueckabschnittImpl
