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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.W_Lage_TypeClass;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bgrenze Nach PZB Bed Einstieg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl#getIDWElement <em>IDW Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl#getWLage <em>WLage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDWElement() <em>IDW Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDWElement;

	/**
	 * This is true if the IDW Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWElementESet;

	/**
	 * The cached value of the '{@link #getWLage() <em>WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWLage()
	 * @generated
	 * @ordered
	 */
	protected W_Lage_TypeClass wLage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBgrenze_Nach_PZB_Bed_Einstieg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDWElement() {
		if (iDWElement != null && iDWElement.eIsProxy()) {
			InternalEObject oldIDWElement = (InternalEObject)iDWElement;
			iDWElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDWElement);
			if (iDWElement != oldIDWElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, iDWElement));
			}
		}
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDWElement() {
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWElement(W_Kr_Gsp_Element newIDWElement) {
		W_Kr_Gsp_Element oldIDWElement = iDWElement;
		iDWElement = newIDWElement;
		boolean oldIDWElementESet = iDWElementESet;
		iDWElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, iDWElement, !oldIDWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWElement() {
		W_Kr_Gsp_Element oldIDWElement = iDWElement;
		boolean oldIDWElementESet = iDWElementESet;
		iDWElement = null;
		iDWElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, null, oldIDWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWElement() {
		return iDWElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Lage_TypeClass getWLage() {
		return wLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWLage(W_Lage_TypeClass newWLage, NotificationChain msgs) {
		W_Lage_TypeClass oldWLage = wLage;
		wLage = newWLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, oldWLage, newWLage);
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
	public void setWLage(W_Lage_TypeClass newWLage) {
		if (newWLage != wLage) {
			NotificationChain msgs = null;
			if (wLage != null)
				msgs = ((InternalEObject)wLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, null, msgs);
			if (newWLage != null)
				msgs = ((InternalEObject)newWLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, null, msgs);
			msgs = basicSetWLage(newWLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE, newWLage, newWLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				return basicSetWLage(null, msgs);
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				if (resolve) return getIDWElement();
				return basicGetIDWElement();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				return getWLage();
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				setIDWElement((W_Kr_Gsp_Element)newValue);
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				setWLage((W_Lage_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				unsetIDWElement();
				return;
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				setWLage((W_Lage_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return isSetIDWElement();
			case Balisentechnik_ETCSPackage.BGRENZE_NACH_PZB_BED_EINSTIEG_ATTRIBUTE_GROUP__WLAGE:
				return wLage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bgrenze_Nach_PZB_Bed_Einstieg_AttributeGroupImpl
