/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bearbeitungsvermerk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.BearbeitungsvermerkImpl#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.BearbeitungsvermerkImpl#getIDAnhang <em>ID Anhang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BearbeitungsvermerkImpl extends Ur_ObjektImpl implements Bearbeitungsvermerk {
	/**
	 * The cached value of the '{@link #getBearbeitungsvermerkAllg() <em>Bearbeitungsvermerk Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsvermerkAllg()
	 * @generated
	 * @ordered
	 */
	protected Bearbeitungsvermerk_Allg_AttributeGroup bearbeitungsvermerkAllg;

	/**
	 * The cached value of the '{@link #getIDAnhang() <em>ID Anhang</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhang()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> iDAnhang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BearbeitungsvermerkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BEARBEITUNGSVERMERK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bearbeitungsvermerk_Allg_AttributeGroup getBearbeitungsvermerkAllg() {
		return bearbeitungsvermerkAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup newBearbeitungsvermerkAllg, NotificationChain msgs) {
		Bearbeitungsvermerk_Allg_AttributeGroup oldBearbeitungsvermerkAllg = bearbeitungsvermerkAllg;
		bearbeitungsvermerkAllg = newBearbeitungsvermerkAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, oldBearbeitungsvermerkAllg, newBearbeitungsvermerkAllg);
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
	public void setBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup newBearbeitungsvermerkAllg) {
		if (newBearbeitungsvermerkAllg != bearbeitungsvermerkAllg) {
			NotificationChain msgs = null;
			if (bearbeitungsvermerkAllg != null)
				msgs = ((InternalEObject)bearbeitungsvermerkAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, null, msgs);
			if (newBearbeitungsvermerkAllg != null)
				msgs = ((InternalEObject)newBearbeitungsvermerkAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, null, msgs);
			msgs = basicSetBearbeitungsvermerkAllg(newBearbeitungsvermerkAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG, newBearbeitungsvermerkAllg, newBearbeitungsvermerkAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getIDAnhang() {
		if (iDAnhang == null) {
			iDAnhang = new EObjectResolvingEList<Anhang>(Anhang.class, this, BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG);
		}
		return iDAnhang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				return basicSetBearbeitungsvermerkAllg(null, msgs);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				return getBearbeitungsvermerkAllg();
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				return getIDAnhang();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				setBearbeitungsvermerkAllg((Bearbeitungsvermerk_Allg_AttributeGroup)newValue);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				getIDAnhang().clear();
				getIDAnhang().addAll((Collection<? extends Anhang>)newValue);
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				setBearbeitungsvermerkAllg((Bearbeitungsvermerk_Allg_AttributeGroup)null);
				return;
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				getIDAnhang().clear();
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
			case BasisobjektePackage.BEARBEITUNGSVERMERK__BEARBEITUNGSVERMERK_ALLG:
				return bearbeitungsvermerkAllg != null;
			case BasisobjektePackage.BEARBEITUNGSVERMERK__ID_ANHANG:
				return iDAnhang != null && !iDAnhang.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BearbeitungsvermerkImpl
