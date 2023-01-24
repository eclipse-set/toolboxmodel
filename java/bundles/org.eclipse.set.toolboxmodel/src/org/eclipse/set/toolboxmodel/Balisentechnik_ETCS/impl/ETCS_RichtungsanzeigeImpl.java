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

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Textmeldung_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Richtungsanzeige</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_RichtungsanzeigeImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_RichtungsanzeigeImpl#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_RichtungsanzeigeImpl#getTextmeldung <em>Textmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_RichtungsanzeigeImpl extends Basis_ObjektImpl implements ETCS_Richtungsanzeige {
	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Fahrweg iDFstrFahrweg;

	/**
	 * This is true if the ID Fstr Fahrweg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrFahrwegESet;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitInRichtung() <em>ID Oertlichkeit In Richtung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitInRichtung()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeitInRichtung;

	/**
	 * This is true if the ID Oertlichkeit In Richtung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitInRichtungESet;

	/**
	 * The cached value of the '{@link #getTextmeldung() <em>Textmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextmeldung()
	 * @generated
	 * @ordered
	 */
	protected Textmeldung_TypeClass textmeldung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_RichtungsanzeigeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Richtungsanzeige();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Fahrweg getIDFstrFahrweg() {
		if (iDFstrFahrweg != null && iDFstrFahrweg.eIsProxy()) {
			InternalEObject oldIDFstrFahrweg = (InternalEObject)iDFstrFahrweg;
			iDFstrFahrweg = (Fstr_Fahrweg)eResolveProxy(oldIDFstrFahrweg);
			if (iDFstrFahrweg != oldIDFstrFahrweg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg));
			}
		}
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Fahrweg basicGetIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrFahrweg(Fstr_Fahrweg newIDFstrFahrweg) {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrwegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg, !oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrFahrweg() {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrweg = null;
		iDFstrFahrwegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, null, oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrFahrweg() {
		return iDFstrFahrwegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeitInRichtung() {
		if (iDOertlichkeitInRichtung != null && iDOertlichkeitInRichtung.eIsProxy()) {
			InternalEObject oldIDOertlichkeitInRichtung = (InternalEObject)iDOertlichkeitInRichtung;
			iDOertlichkeitInRichtung = (Oertlichkeit)eResolveProxy(oldIDOertlichkeitInRichtung);
			if (iDOertlichkeitInRichtung != oldIDOertlichkeitInRichtung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, oldIDOertlichkeitInRichtung, iDOertlichkeitInRichtung));
			}
		}
		return iDOertlichkeitInRichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeitInRichtung() {
		return iDOertlichkeitInRichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeitInRichtung(Oertlichkeit newIDOertlichkeitInRichtung) {
		Oertlichkeit oldIDOertlichkeitInRichtung = iDOertlichkeitInRichtung;
		iDOertlichkeitInRichtung = newIDOertlichkeitInRichtung;
		boolean oldIDOertlichkeitInRichtungESet = iDOertlichkeitInRichtungESet;
		iDOertlichkeitInRichtungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, oldIDOertlichkeitInRichtung, iDOertlichkeitInRichtung, !oldIDOertlichkeitInRichtungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeitInRichtung() {
		Oertlichkeit oldIDOertlichkeitInRichtung = iDOertlichkeitInRichtung;
		boolean oldIDOertlichkeitInRichtungESet = iDOertlichkeitInRichtungESet;
		iDOertlichkeitInRichtung = null;
		iDOertlichkeitInRichtungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG, oldIDOertlichkeitInRichtung, null, oldIDOertlichkeitInRichtungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeitInRichtung() {
		return iDOertlichkeitInRichtungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Textmeldung_TypeClass getTextmeldung() {
		return textmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextmeldung(Textmeldung_TypeClass newTextmeldung, NotificationChain msgs) {
		Textmeldung_TypeClass oldTextmeldung = textmeldung;
		textmeldung = newTextmeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, oldTextmeldung, newTextmeldung);
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
	public void setTextmeldung(Textmeldung_TypeClass newTextmeldung) {
		if (newTextmeldung != textmeldung) {
			NotificationChain msgs = null;
			if (textmeldung != null)
				msgs = ((InternalEObject)textmeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, null, msgs);
			if (newTextmeldung != null)
				msgs = ((InternalEObject)newTextmeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, null, msgs);
			msgs = basicSetTextmeldung(newTextmeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG, newTextmeldung, newTextmeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				return basicSetTextmeldung(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				if (resolve) return getIDFstrFahrweg();
				return basicGetIDFstrFahrweg();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				if (resolve) return getIDOertlichkeitInRichtung();
				return basicGetIDOertlichkeitInRichtung();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				return getTextmeldung();
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((Fstr_Fahrweg)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				setIDOertlichkeitInRichtung((Oertlichkeit)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				setTextmeldung((Textmeldung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				unsetIDFstrFahrweg();
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				unsetIDOertlichkeitInRichtung();
				return;
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				setTextmeldung((Textmeldung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_FSTR_FAHRWEG:
				return isSetIDFstrFahrweg();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__ID_OERTLICHKEIT_IN_RICHTUNG:
				return isSetIDOertlichkeitInRichtung();
			case Balisentechnik_ETCSPackage.ETCS_RICHTUNGSANZEIGE__TEXTMELDUNG:
				return textmeldung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_RichtungsanzeigeImpl
