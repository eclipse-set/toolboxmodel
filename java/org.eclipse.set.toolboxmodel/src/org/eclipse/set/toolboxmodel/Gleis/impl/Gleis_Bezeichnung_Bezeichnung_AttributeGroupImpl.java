/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Gleis.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Gleis.Bez_Gleis_Bezeichnung_TypeClass;
import org.eclipse.set.toolboxmodel.Gleis.GleisPackage;
import org.eclipse.set.toolboxmodel.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gleis Bezeichnung Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Gleis.impl.Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl#getBezGleisBezeichnung <em>Bez Gleis Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Gleis_Bezeichnung_Bezeichnung_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBezGleisBezeichnung() <em>Bez Gleis Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezGleisBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bez_Gleis_Bezeichnung_TypeClass bezGleisBezeichnung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GleisPackage.Literals.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bez_Gleis_Bezeichnung_TypeClass getBezGleisBezeichnung() {
		return bezGleisBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezGleisBezeichnung(Bez_Gleis_Bezeichnung_TypeClass newBezGleisBezeichnung, NotificationChain msgs) {
		Bez_Gleis_Bezeichnung_TypeClass oldBezGleisBezeichnung = bezGleisBezeichnung;
		bezGleisBezeichnung = newBezGleisBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG, oldBezGleisBezeichnung, newBezGleisBezeichnung);
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
	public void setBezGleisBezeichnung(Bez_Gleis_Bezeichnung_TypeClass newBezGleisBezeichnung) {
		if (newBezGleisBezeichnung != bezGleisBezeichnung) {
			NotificationChain msgs = null;
			if (bezGleisBezeichnung != null)
				msgs = ((InternalEObject)bezGleisBezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG, null, msgs);
			if (newBezGleisBezeichnung != null)
				msgs = ((InternalEObject)newBezGleisBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG, null, msgs);
			msgs = basicSetBezGleisBezeichnung(newBezGleisBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG, newBezGleisBezeichnung, newBezGleisBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG:
				return basicSetBezGleisBezeichnung(null, msgs);
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
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG:
				return getBezGleisBezeichnung();
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
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG:
				setBezGleisBezeichnung((Bez_Gleis_Bezeichnung_TypeClass)newValue);
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
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG:
				setBezGleisBezeichnung((Bez_Gleis_Bezeichnung_TypeClass)null);
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
			case GleisPackage.GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG:
				return bezGleisBezeichnung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Gleis_Bezeichnung_Bezeichnung_AttributeGroupImpl
