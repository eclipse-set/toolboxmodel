/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_W_Lage_TypeClass;
import org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz WGsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl#getFlaWLage <em>Fla WLage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Schutz_W_Gsp_AttributeGroupImpl#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_W_Gsp_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fla_Schutz_W_Gsp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFlaWLage() <em>Fla WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaWLage()
	 * @generated
	 * @ordered
	 */
	protected Fla_W_Lage_TypeClass flaWLage;

	/**
	 * The cached value of the '{@link #getIDFlaWGspElement() <em>ID Fla WGsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaWGspElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDFlaWGspElement;

	/**
	 * This is true if the ID Fla WGsp Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaWGspElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_W_Gsp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_W_Lage_TypeClass getFlaWLage() {
		return flaWLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaWLage(Fla_W_Lage_TypeClass newFlaWLage, NotificationChain msgs) {
		Fla_W_Lage_TypeClass oldFlaWLage = flaWLage;
		flaWLage = newFlaWLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, oldFlaWLage, newFlaWLage);
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
	public void setFlaWLage(Fla_W_Lage_TypeClass newFlaWLage) {
		if (newFlaWLage != flaWLage) {
			NotificationChain msgs = null;
			if (flaWLage != null)
				msgs = ((InternalEObject)flaWLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, null, msgs);
			if (newFlaWLage != null)
				msgs = ((InternalEObject)newFlaWLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, null, msgs);
			msgs = basicSetFlaWLage(newFlaWLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE, newFlaWLage, newFlaWLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDFlaWGspElement() {
		if (iDFlaWGspElement != null && iDFlaWGspElement.eIsProxy()) {
			InternalEObject oldIDFlaWGspElement = (InternalEObject)iDFlaWGspElement;
			iDFlaWGspElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDFlaWGspElement);
			if (iDFlaWGspElement != oldIDFlaWGspElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, oldIDFlaWGspElement, iDFlaWGspElement));
			}
		}
		return iDFlaWGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDFlaWGspElement() {
		return iDFlaWGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaWGspElement(W_Kr_Gsp_Element newIDFlaWGspElement) {
		W_Kr_Gsp_Element oldIDFlaWGspElement = iDFlaWGspElement;
		iDFlaWGspElement = newIDFlaWGspElement;
		boolean oldIDFlaWGspElementESet = iDFlaWGspElementESet;
		iDFlaWGspElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, oldIDFlaWGspElement, iDFlaWGspElement, !oldIDFlaWGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaWGspElement() {
		W_Kr_Gsp_Element oldIDFlaWGspElement = iDFlaWGspElement;
		boolean oldIDFlaWGspElementESet = iDFlaWGspElementESet;
		iDFlaWGspElement = null;
		iDFlaWGspElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT, oldIDFlaWGspElement, null, oldIDFlaWGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaWGspElement() {
		return iDFlaWGspElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				return basicSetFlaWLage(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				return getFlaWLage();
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				if (resolve) return getIDFlaWGspElement();
				return basicGetIDFlaWGspElement();
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				setFlaWLage((Fla_W_Lage_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				setIDFlaWGspElement((W_Kr_Gsp_Element)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				setFlaWLage((Fla_W_Lage_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				unsetIDFlaWGspElement();
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
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE:
				return flaWLage != null;
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT:
				return isSetIDFlaWGspElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Schutz_W_Gsp_AttributeGroupImpl
