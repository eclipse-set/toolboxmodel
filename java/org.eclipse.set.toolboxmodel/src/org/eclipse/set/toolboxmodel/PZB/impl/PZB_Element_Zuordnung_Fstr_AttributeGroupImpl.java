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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup;
import org.eclipse.set.toolboxmodel.PZB.Wirksamkeit_Fstr_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_Fstr_AttributeGroupImpl#getWirksamkeitFstr <em>Wirksamkeit Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_Fstr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements PZB_Element_Zuordnung_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrZugRangier;

	/**
	 * This is true if the ID Fstr Zug Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrZugRangierESet;

	/**
	 * The cached value of the '{@link #getWirksamkeitFstr() <em>Wirksamkeit Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksamkeitFstr()
	 * @generated
	 * @ordered
	 */
	protected Wirksamkeit_Fstr_TypeClass wirksamkeitFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrZugRangier() {
		if (iDFstrZugRangier != null && iDFstrZugRangier.eIsProxy()) {
			InternalEObject oldIDFstrZugRangier = (InternalEObject)iDFstrZugRangier;
			iDFstrZugRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrZugRangier);
			if (iDFstrZugRangier != oldIDFstrZugRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
			}
		}
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrZugRangier(Fstr_Zug_Rangier newIDFstrZugRangier) {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrZugRangier() {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangier = null;
		iDFstrZugRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrZugRangier() {
		return iDFstrZugRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_Fstr_TypeClass getWirksamkeitFstr() {
		return wirksamkeitFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksamkeitFstr(Wirksamkeit_Fstr_TypeClass newWirksamkeitFstr, NotificationChain msgs) {
		Wirksamkeit_Fstr_TypeClass oldWirksamkeitFstr = wirksamkeitFstr;
		wirksamkeitFstr = newWirksamkeitFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, oldWirksamkeitFstr, newWirksamkeitFstr);
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
	public void setWirksamkeitFstr(Wirksamkeit_Fstr_TypeClass newWirksamkeitFstr) {
		if (newWirksamkeitFstr != wirksamkeitFstr) {
			NotificationChain msgs = null;
			if (wirksamkeitFstr != null)
				msgs = ((InternalEObject)wirksamkeitFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, null, msgs);
			if (newWirksamkeitFstr != null)
				msgs = ((InternalEObject)newWirksamkeitFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, null, msgs);
			msgs = basicSetWirksamkeitFstr(newWirksamkeitFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR, newWirksamkeitFstr, newWirksamkeitFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				return basicSetWirksamkeitFstr(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				if (resolve) return getIDFstrZugRangier();
				return basicGetIDFstrZugRangier();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				return getWirksamkeitFstr();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((Fstr_Zug_Rangier)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				setWirksamkeitFstr((Wirksamkeit_Fstr_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				unsetIDFstrZugRangier();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				setWirksamkeitFstr((Wirksamkeit_Fstr_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR:
				return wirksamkeitFstr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Element_Zuordnung_Fstr_AttributeGroupImpl
