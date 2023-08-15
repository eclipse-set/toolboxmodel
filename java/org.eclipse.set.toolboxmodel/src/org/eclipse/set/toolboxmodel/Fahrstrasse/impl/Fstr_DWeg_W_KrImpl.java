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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Element_Verschluss_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg WKr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl#getElementVerschluss <em>Element Verschluss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_W_KrImpl#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWeg_W_KrImpl extends Basis_ObjektImpl implements Fstr_DWeg_W_Kr {
	/**
	 * The cached value of the '{@link #getElementVerschluss() <em>Element Verschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementVerschluss()
	 * @generated
	 * @ordered
	 */
	protected Element_Verschluss_TypeClass elementVerschluss;

	/**
	 * The cached value of the '{@link #getIDFstrDWeg() <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrDWeg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg iDFstrDWeg;

	/**
	 * This is true if the ID Fstr DWeg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrDWegESet;

	/**
	 * The cached value of the '{@link #getIDWKrGspElement() <em>IDW Kr Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrGspElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDWKrGspElement;

	/**
	 * This is true if the IDW Kr Gsp Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWKrGspElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWeg_W_KrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG_WKR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Verschluss_TypeClass getElementVerschluss() {
		return elementVerschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementVerschluss(Element_Verschluss_TypeClass newElementVerschluss, NotificationChain msgs) {
		Element_Verschluss_TypeClass oldElementVerschluss = elementVerschluss;
		elementVerschluss = newElementVerschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, oldElementVerschluss, newElementVerschluss);
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
	public void setElementVerschluss(Element_Verschluss_TypeClass newElementVerschluss) {
		if (newElementVerschluss != elementVerschluss) {
			NotificationChain msgs = null;
			if (elementVerschluss != null)
				msgs = ((InternalEObject)elementVerschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, null, msgs);
			if (newElementVerschluss != null)
				msgs = ((InternalEObject)newElementVerschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, null, msgs);
			msgs = basicSetElementVerschluss(newElementVerschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS, newElementVerschluss, newElementVerschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg getIDFstrDWeg() {
		if (iDFstrDWeg != null && iDFstrDWeg.eIsProxy()) {
			InternalEObject oldIDFstrDWeg = (InternalEObject)iDFstrDWeg;
			iDFstrDWeg = (Fstr_DWeg)eResolveProxy(oldIDFstrDWeg);
			if (iDFstrDWeg != oldIDFstrDWeg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, oldIDFstrDWeg, iDFstrDWeg));
			}
		}
		return iDFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_DWeg basicGetIDFstrDWeg() {
		return iDFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrDWeg(Fstr_DWeg newIDFstrDWeg) {
		Fstr_DWeg oldIDFstrDWeg = iDFstrDWeg;
		iDFstrDWeg = newIDFstrDWeg;
		boolean oldIDFstrDWegESet = iDFstrDWegESet;
		iDFstrDWegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, oldIDFstrDWeg, iDFstrDWeg, !oldIDFstrDWegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrDWeg() {
		Fstr_DWeg oldIDFstrDWeg = iDFstrDWeg;
		boolean oldIDFstrDWegESet = iDFstrDWegESet;
		iDFstrDWeg = null;
		iDFstrDWegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG, oldIDFstrDWeg, null, oldIDFstrDWegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrDWeg() {
		return iDFstrDWegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDWKrGspElement() {
		if (iDWKrGspElement != null && iDWKrGspElement.eIsProxy()) {
			InternalEObject oldIDWKrGspElement = (InternalEObject)iDWKrGspElement;
			iDWKrGspElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDWKrGspElement);
			if (iDWKrGspElement != oldIDWKrGspElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, iDWKrGspElement));
			}
		}
		return iDWKrGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDWKrGspElement() {
		return iDWKrGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWKrGspElement(W_Kr_Gsp_Element newIDWKrGspElement) {
		W_Kr_Gsp_Element oldIDWKrGspElement = iDWKrGspElement;
		iDWKrGspElement = newIDWKrGspElement;
		boolean oldIDWKrGspElementESet = iDWKrGspElementESet;
		iDWKrGspElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, iDWKrGspElement, !oldIDWKrGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWKrGspElement() {
		W_Kr_Gsp_Element oldIDWKrGspElement = iDWKrGspElement;
		boolean oldIDWKrGspElementESet = iDWKrGspElementESet;
		iDWKrGspElement = null;
		iDWKrGspElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, null, oldIDWKrGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWKrGspElement() {
		return iDWKrGspElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				return basicSetElementVerschluss(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				return getElementVerschluss();
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				if (resolve) return getIDFstrDWeg();
				return basicGetIDFstrDWeg();
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				if (resolve) return getIDWKrGspElement();
				return basicGetIDWKrGspElement();
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				setElementVerschluss((Element_Verschluss_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				setIDFstrDWeg((Fstr_DWeg)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				setIDWKrGspElement((W_Kr_Gsp_Element)newValue);
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				setElementVerschluss((Element_Verschluss_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				unsetIDFstrDWeg();
				return;
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				unsetIDWKrGspElement();
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
			case FahrstrassePackage.FSTR_DWEG_WKR__ELEMENT_VERSCHLUSS:
				return elementVerschluss != null;
			case FahrstrassePackage.FSTR_DWEG_WKR__ID_FSTR_DWEG:
				return isSetIDFstrDWeg();
			case FahrstrassePackage.FSTR_DWEG_WKR__IDW_KR_GSP_ELEMENT:
				return isSetIDWKrGspElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_DWeg_W_KrImpl
