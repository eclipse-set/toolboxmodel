/**
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.W_Anschluss_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ziel WElement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Ziel_W_Element_AttributeGroupImpl#getIDZielWElement <em>ID Ziel WElement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Ziel_W_Element_AttributeGroupImpl#getWAnschluss <em>WAnschluss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Ziel_W_Element_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Ziel_W_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDZielWElement() <em>ID Ziel WElement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZielWElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDZielWElement;

	/**
	 * This is true if the ID Ziel WElement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZielWElementESet;

	/**
	 * The cached value of the '{@link #getWAnschluss() <em>WAnschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWAnschluss()
	 * @generated
	 * @ordered
	 */
	protected W_Anschluss_TypeClass wAnschluss;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ziel_W_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZiel_W_Element_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDZielWElement() {
		if (iDZielWElement != null && iDZielWElement.eIsProxy()) {
			InternalEObject oldIDZielWElement = (InternalEObject)iDZielWElement;
			iDZielWElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDZielWElement);
			if (iDZielWElement != oldIDZielWElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, oldIDZielWElement, iDZielWElement));
			}
		}
		return iDZielWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDZielWElement() {
		return iDZielWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZielWElement(W_Kr_Gsp_Element newIDZielWElement) {
		W_Kr_Gsp_Element oldIDZielWElement = iDZielWElement;
		iDZielWElement = newIDZielWElement;
		boolean oldIDZielWElementESet = iDZielWElementESet;
		iDZielWElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, oldIDZielWElement, iDZielWElement, !oldIDZielWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZielWElement() {
		W_Kr_Gsp_Element oldIDZielWElement = iDZielWElement;
		boolean oldIDZielWElementESet = iDZielWElementESet;
		iDZielWElement = null;
		iDZielWElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT, oldIDZielWElement, null, oldIDZielWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZielWElement() {
		return iDZielWElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Anschluss_TypeClass getWAnschluss() {
		return wAnschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWAnschluss(W_Anschluss_TypeClass newWAnschluss, NotificationChain msgs) {
		W_Anschluss_TypeClass oldWAnschluss = wAnschluss;
		wAnschluss = newWAnschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, oldWAnschluss, newWAnschluss);
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
	public void setWAnschluss(W_Anschluss_TypeClass newWAnschluss) {
		if (newWAnschluss != wAnschluss) {
			NotificationChain msgs = null;
			if (wAnschluss != null)
				msgs = ((InternalEObject)wAnschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			if (newWAnschluss != null)
				msgs = ((InternalEObject)newWAnschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			msgs = basicSetWAnschluss(newWAnschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, newWAnschluss, newWAnschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return basicSetWAnschluss(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				if (resolve) return getIDZielWElement();
				return basicGetIDZielWElement();
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return getWAnschluss();
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				setIDZielWElement((W_Kr_Gsp_Element)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				unsetIDZielWElement();
				return;
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__ID_ZIEL_WELEMENT:
				return isSetIDZielWElement();
			case Balisentechnik_ETCSPackage.ZIEL_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return wAnschluss != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Ziel_W_Element_AttributeGroupImpl
