/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.PZB_Art_TypeClass;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_GM_AttributeGroup;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_GUE_AttributeGroup;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_ElementImpl#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_ElementImpl#getPZBArt <em>PZB Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_ElementImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_ElementImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_ElementImpl#getPZBElementGM <em>PZB Element GM</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_ElementImpl#getPZBElementGUE <em>PZB Element GUE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_ElementImpl extends Punkt_ObjektImpl implements PZB_Element {
	/**
	 * The cached value of the '{@link #getIDPZBElementZuordnung() <em>IDPZB Element Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_Zuordnung iDPZBElementZuordnung;

	/**
	 * This is true if the IDPZB Element Zuordnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDPZBElementZuordnungESet;

	/**
	 * The cached value of the '{@link #getPZBArt() <em>PZB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBArt()
	 * @generated
	 * @ordered
	 */
	protected PZB_Art_TypeClass pZBArt;

	/**
	 * The cached value of the '{@link #getIDStellelement() <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellelement()
	 * @generated
	 * @ordered
	 */
	protected Stellelement iDStellelement;

	/**
	 * This is true if the ID Stellelement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStellelementESet;

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
	 * The cached value of the '{@link #getPZBElementGM() <em>PZB Element GM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementGM()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_GM_AttributeGroup pZBElementGM;

	/**
	 * The cached value of the '{@link #getPZBElementGUE() <em>PZB Element GUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementGUE()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_GUE_AttributeGroup pZBElementGUE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung getIDPZBElementZuordnung() {
		if (iDPZBElementZuordnung != null && iDPZBElementZuordnung.eIsProxy()) {
			InternalEObject oldIDPZBElementZuordnung = (InternalEObject)iDPZBElementZuordnung;
			iDPZBElementZuordnung = (PZB_Element_Zuordnung)eResolveProxy(oldIDPZBElementZuordnung);
			if (iDPZBElementZuordnung != oldIDPZBElementZuordnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, iDPZBElementZuordnung));
			}
		}
		return iDPZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZB_Element_Zuordnung basicGetIDPZBElementZuordnung() {
		return iDPZBElementZuordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDPZBElementZuordnung(PZB_Element_Zuordnung newIDPZBElementZuordnung) {
		PZB_Element_Zuordnung oldIDPZBElementZuordnung = iDPZBElementZuordnung;
		iDPZBElementZuordnung = newIDPZBElementZuordnung;
		boolean oldIDPZBElementZuordnungESet = iDPZBElementZuordnungESet;
		iDPZBElementZuordnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, iDPZBElementZuordnung, !oldIDPZBElementZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDPZBElementZuordnung() {
		PZB_Element_Zuordnung oldIDPZBElementZuordnung = iDPZBElementZuordnung;
		boolean oldIDPZBElementZuordnungESet = iDPZBElementZuordnungESet;
		iDPZBElementZuordnung = null;
		iDPZBElementZuordnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG, oldIDPZBElementZuordnung, null, oldIDPZBElementZuordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDPZBElementZuordnung() {
		return iDPZBElementZuordnungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Art_TypeClass getPZBArt() {
		return pZBArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBArt(PZB_Art_TypeClass newPZBArt, NotificationChain msgs) {
		PZB_Art_TypeClass oldPZBArt = pZBArt;
		pZBArt = newPZBArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ART, oldPZBArt, newPZBArt);
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
	public void setPZBArt(PZB_Art_TypeClass newPZBArt) {
		if (newPZBArt != pZBArt) {
			NotificationChain msgs = null;
			if (pZBArt != null)
				msgs = ((InternalEObject)pZBArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ART, null, msgs);
			if (newPZBArt != null)
				msgs = ((InternalEObject)newPZBArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ART, null, msgs);
			msgs = basicSetPZBArt(newPZBArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ART, newPZBArt, newPZBArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stellelement getIDStellelement() {
		if (iDStellelement != null && iDStellelement.eIsProxy()) {
			InternalEObject oldIDStellelement = (InternalEObject)iDStellelement;
			iDStellelement = (Stellelement)eResolveProxy(oldIDStellelement);
			if (iDStellelement != oldIDStellelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, oldIDStellelement, iDStellelement));
			}
		}
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stellelement basicGetIDStellelement() {
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStellelement(Stellelement newIDStellelement) {
		Stellelement oldIDStellelement = iDStellelement;
		iDStellelement = newIDStellelement;
		boolean oldIDStellelementESet = iDStellelementESet;
		iDStellelementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, oldIDStellelement, iDStellelement, !oldIDStellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStellelement() {
		Stellelement oldIDStellelement = iDStellelement;
		boolean oldIDStellelementESet = iDStellelementESet;
		iDStellelement = null;
		iDStellelementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT__ID_STELLELEMENT, oldIDStellelement, null, oldIDStellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStellelement() {
		return iDStellelementESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public PZB_Element_GM_AttributeGroup getPZBElementGM() {
		return pZBElementGM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementGM(PZB_Element_GM_AttributeGroup newPZBElementGM, NotificationChain msgs) {
		PZB_Element_GM_AttributeGroup oldPZBElementGM = pZBElementGM;
		pZBElementGM = newPZBElementGM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, oldPZBElementGM, newPZBElementGM);
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
	public void setPZBElementGM(PZB_Element_GM_AttributeGroup newPZBElementGM) {
		if (newPZBElementGM != pZBElementGM) {
			NotificationChain msgs = null;
			if (pZBElementGM != null)
				msgs = ((InternalEObject)pZBElementGM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, null, msgs);
			if (newPZBElementGM != null)
				msgs = ((InternalEObject)newPZBElementGM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, null, msgs);
			msgs = basicSetPZBElementGM(newPZBElementGM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM, newPZBElementGM, newPZBElementGM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_GUE_AttributeGroup getPZBElementGUE() {
		return pZBElementGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementGUE(PZB_Element_GUE_AttributeGroup newPZBElementGUE, NotificationChain msgs) {
		PZB_Element_GUE_AttributeGroup oldPZBElementGUE = pZBElementGUE;
		pZBElementGUE = newPZBElementGUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, oldPZBElementGUE, newPZBElementGUE);
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
	public void setPZBElementGUE(PZB_Element_GUE_AttributeGroup newPZBElementGUE) {
		if (newPZBElementGUE != pZBElementGUE) {
			NotificationChain msgs = null;
			if (pZBElementGUE != null)
				msgs = ((InternalEObject)pZBElementGUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, null, msgs);
			if (newPZBElementGUE != null)
				msgs = ((InternalEObject)newPZBElementGUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, null, msgs);
			msgs = basicSetPZBElementGUE(newPZBElementGUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE, newPZBElementGUE, newPZBElementGUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				return basicSetPZBArt(null, msgs);
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				return basicSetPZBElementGM(null, msgs);
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				return basicSetPZBElementGUE(null, msgs);
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				if (resolve) return getIDPZBElementZuordnung();
				return basicGetIDPZBElementZuordnung();
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				return getPZBArt();
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				if (resolve) return getIDStellelement();
				return basicGetIDStellelement();
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				return getPZBElementGM();
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				return getPZBElementGUE();
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				setIDPZBElementZuordnung((PZB_Element_Zuordnung)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				setPZBArt((PZB_Art_TypeClass)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				setIDStellelement((Stellelement)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				setPZBElementGM((PZB_Element_GM_AttributeGroup)newValue);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				setPZBElementGUE((PZB_Element_GUE_AttributeGroup)newValue);
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				unsetIDPZBElementZuordnung();
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				setPZBArt((PZB_Art_TypeClass)null);
				return;
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				unsetIDStellelement();
				return;
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				setPZBElementGM((PZB_Element_GM_AttributeGroup)null);
				return;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				setPZBElementGUE((PZB_Element_GUE_AttributeGroup)null);
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
			case PZBPackage.PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG:
				return isSetIDPZBElementZuordnung();
			case PZBPackage.PZB_ELEMENT__PZB_ART:
				return pZBArt != null;
			case PZBPackage.PZB_ELEMENT__ID_STELLELEMENT:
				return isSetIDStellelement();
			case PZBPackage.PZB_ELEMENT__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GM:
				return pZBElementGM != null;
			case PZBPackage.PZB_ELEMENT__PZB_ELEMENT_GUE:
				return pZBElementGUE != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_ElementImpl
