/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Km_Massgebend_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Strecke_Km_TypeClass;

import org.eclipse.set.toolboxmodel.Geodaten.Strecke;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Punkt Objekt Strecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl#getKmMassgebend <em>Km Massgebend</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_Strecke_AttributeGroupImpl#getStreckeKm <em>Strecke Km</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Punkt_Objekt_Strecke_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Punkt_Objekt_Strecke_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDStrecke() <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStrecke()
	 * @generated
	 * @ordered
	 */
	protected Strecke iDStrecke;

	/**
	 * This is true if the ID Strecke reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStreckeESet;

	/**
	 * The cached value of the '{@link #getKmMassgebend() <em>Km Massgebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKmMassgebend()
	 * @generated
	 * @ordered
	 */
	protected Km_Massgebend_TypeClass kmMassgebend;

	/**
	 * The cached value of the '{@link #getStreckeKm() <em>Strecke Km</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreckeKm()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Km_TypeClass streckeKm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Punkt_Objekt_Strecke_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke getIDStrecke() {
		if (iDStrecke != null && iDStrecke.eIsProxy()) {
			InternalEObject oldIDStrecke = (InternalEObject)iDStrecke;
			iDStrecke = (Strecke)eResolveProxy(oldIDStrecke);
			if (iDStrecke != oldIDStrecke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE, oldIDStrecke, iDStrecke));
			}
		}
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strecke basicGetIDStrecke() {
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStrecke(Strecke newIDStrecke) {
		Strecke oldIDStrecke = iDStrecke;
		iDStrecke = newIDStrecke;
		boolean oldIDStreckeESet = iDStreckeESet;
		iDStreckeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE, oldIDStrecke, iDStrecke, !oldIDStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStrecke() {
		Strecke oldIDStrecke = iDStrecke;
		boolean oldIDStreckeESet = iDStreckeESet;
		iDStrecke = null;
		iDStreckeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE, oldIDStrecke, null, oldIDStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStrecke() {
		return iDStreckeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Km_Massgebend_TypeClass getKmMassgebend() {
		return kmMassgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKmMassgebend(Km_Massgebend_TypeClass newKmMassgebend, NotificationChain msgs) {
		Km_Massgebend_TypeClass oldKmMassgebend = kmMassgebend;
		kmMassgebend = newKmMassgebend;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND, oldKmMassgebend, newKmMassgebend);
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
	public void setKmMassgebend(Km_Massgebend_TypeClass newKmMassgebend) {
		if (newKmMassgebend != kmMassgebend) {
			NotificationChain msgs = null;
			if (kmMassgebend != null)
				msgs = ((InternalEObject)kmMassgebend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND, null, msgs);
			if (newKmMassgebend != null)
				msgs = ((InternalEObject)newKmMassgebend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND, null, msgs);
			msgs = basicSetKmMassgebend(newKmMassgebend, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND, newKmMassgebend, newKmMassgebend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke_Km_TypeClass getStreckeKm() {
		return streckeKm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStreckeKm(Strecke_Km_TypeClass newStreckeKm, NotificationChain msgs) {
		Strecke_Km_TypeClass oldStreckeKm = streckeKm;
		streckeKm = newStreckeKm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, oldStreckeKm, newStreckeKm);
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
	public void setStreckeKm(Strecke_Km_TypeClass newStreckeKm) {
		if (newStreckeKm != streckeKm) {
			NotificationChain msgs = null;
			if (streckeKm != null)
				msgs = ((InternalEObject)streckeKm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, null, msgs);
			if (newStreckeKm != null)
				msgs = ((InternalEObject)newStreckeKm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, null, msgs);
			msgs = basicSetStreckeKm(newStreckeKm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM, newStreckeKm, newStreckeKm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND:
				return basicSetKmMassgebend(null, msgs);
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				return basicSetStreckeKm(null, msgs);
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
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE:
				if (resolve) return getIDStrecke();
				return basicGetIDStrecke();
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND:
				return getKmMassgebend();
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				return getStreckeKm();
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
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE:
				setIDStrecke((Strecke)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND:
				setKmMassgebend((Km_Massgebend_TypeClass)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				setStreckeKm((Strecke_Km_TypeClass)newValue);
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
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE:
				unsetIDStrecke();
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND:
				setKmMassgebend((Km_Massgebend_TypeClass)null);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				setStreckeKm((Strecke_Km_TypeClass)null);
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
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__ID_STRECKE:
				return isSetIDStrecke();
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__KM_MASSGEBEND:
				return kmMassgebend != null;
			case BasisobjektePackage.PUNKT_OBJEKT_STRECKE_ATTRIBUTE_GROUP__STRECKE_KM:
				return streckeKm != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Punkt_Objekt_Strecke_AttributeGroupImpl
