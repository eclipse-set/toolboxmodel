/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel Verteilpunkt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.Kabel_VerteilpunktImpl#getKabelVerteilpunktArt <em>Kabel Verteilpunkt Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Kabel_VerteilpunktImpl extends Basis_ObjektImpl implements Kabel_Verteilpunkt {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Verteilpunkt_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getKabelVerteilpunktArt() <em>Kabel Verteilpunkt Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelVerteilpunktArt()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Verteilpunkt_Art_TypeClass kabelVerteilpunktArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Kabel_VerteilpunktImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL_VERTEILPUNKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Verteilpunkt_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Kabel_Verteilpunkt_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public Kabel_Verteilpunkt_Art_TypeClass getKabelVerteilpunktArt() {
		return kabelVerteilpunktArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelVerteilpunktArt(Kabel_Verteilpunkt_Art_TypeClass newKabelVerteilpunktArt, NotificationChain msgs) {
		Kabel_Verteilpunkt_Art_TypeClass oldKabelVerteilpunktArt = kabelVerteilpunktArt;
		kabelVerteilpunktArt = newKabelVerteilpunktArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART, oldKabelVerteilpunktArt, newKabelVerteilpunktArt);
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
	public void setKabelVerteilpunktArt(Kabel_Verteilpunkt_Art_TypeClass newKabelVerteilpunktArt) {
		if (newKabelVerteilpunktArt != kabelVerteilpunktArt) {
			NotificationChain msgs = null;
			if (kabelVerteilpunktArt != null)
				msgs = ((InternalEObject)kabelVerteilpunktArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART, null, msgs);
			if (newKabelVerteilpunktArt != null)
				msgs = ((InternalEObject)newKabelVerteilpunktArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART, null, msgs);
			msgs = basicSetKabelVerteilpunktArt(newKabelVerteilpunktArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART, newKabelVerteilpunktArt, newKabelVerteilpunktArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART:
				return basicSetKabelVerteilpunktArt(null, msgs);
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG:
				return getBezeichnung();
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART:
				return getKabelVerteilpunktArt();
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG:
				setBezeichnung((Kabel_Verteilpunkt_Bezeichnung_AttributeGroup)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART:
				setKabelVerteilpunktArt((Kabel_Verteilpunkt_Art_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG:
				setBezeichnung((Kabel_Verteilpunkt_Bezeichnung_AttributeGroup)null);
				return;
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART:
				setKabelVerteilpunktArt((Kabel_Verteilpunkt_Art_TypeClass)null);
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
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__BEZEICHNUNG:
				return bezeichnung != null;
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case Medien_und_TrassenPackage.KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART:
				return kabelVerteilpunktArt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Kabel_VerteilpunktImpl
