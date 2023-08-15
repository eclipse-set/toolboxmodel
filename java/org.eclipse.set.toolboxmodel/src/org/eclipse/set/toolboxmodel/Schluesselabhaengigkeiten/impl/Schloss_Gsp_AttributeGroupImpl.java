/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Gsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Gsp_AttributeGroupImpl#getGspLage <em>Gsp Lage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Gsp_AttributeGroupImpl#getIDGspElement <em>ID Gsp Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Gsp_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schloss_Gsp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGspLage() <em>Gsp Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGspLage()
	 * @generated
	 * @ordered
	 */
	protected Gsp_Lage_TypeClass gspLage;

	/**
	 * The cached value of the '{@link #getIDGspElement() <em>ID Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGspElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDGspElement;

	/**
	 * This is true if the ID Gsp Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGspElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Gsp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_GSP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gsp_Lage_TypeClass getGspLage() {
		return gspLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGspLage(Gsp_Lage_TypeClass newGspLage, NotificationChain msgs) {
		Gsp_Lage_TypeClass oldGspLage = gspLage;
		gspLage = newGspLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE, oldGspLage, newGspLage);
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
	public void setGspLage(Gsp_Lage_TypeClass newGspLage) {
		if (newGspLage != gspLage) {
			NotificationChain msgs = null;
			if (gspLage != null)
				msgs = ((InternalEObject)gspLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE, null, msgs);
			if (newGspLage != null)
				msgs = ((InternalEObject)newGspLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE, null, msgs);
			msgs = basicSetGspLage(newGspLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE, newGspLage, newGspLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDGspElement() {
		if (iDGspElement != null && iDGspElement.eIsProxy()) {
			InternalEObject oldIDGspElement = (InternalEObject)iDGspElement;
			iDGspElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDGspElement);
			if (iDGspElement != oldIDGspElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT, oldIDGspElement, iDGspElement));
			}
		}
		return iDGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDGspElement() {
		return iDGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGspElement(W_Kr_Gsp_Element newIDGspElement) {
		W_Kr_Gsp_Element oldIDGspElement = iDGspElement;
		iDGspElement = newIDGspElement;
		boolean oldIDGspElementESet = iDGspElementESet;
		iDGspElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT, oldIDGspElement, iDGspElement, !oldIDGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGspElement() {
		W_Kr_Gsp_Element oldIDGspElement = iDGspElement;
		boolean oldIDGspElementESet = iDGspElementESet;
		iDGspElement = null;
		iDGspElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT, oldIDGspElement, null, oldIDGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGspElement() {
		return iDGspElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE:
				return basicSetGspLage(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE:
				return getGspLage();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT:
				if (resolve) return getIDGspElement();
				return basicGetIDGspElement();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE:
				setGspLage((Gsp_Lage_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT:
				setIDGspElement((W_Kr_Gsp_Element)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE:
				setGspLage((Gsp_Lage_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT:
				unsetIDGspElement();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE:
				return gspLage != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT:
				return isSetIDGspElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schloss_Gsp_AttributeGroupImpl
