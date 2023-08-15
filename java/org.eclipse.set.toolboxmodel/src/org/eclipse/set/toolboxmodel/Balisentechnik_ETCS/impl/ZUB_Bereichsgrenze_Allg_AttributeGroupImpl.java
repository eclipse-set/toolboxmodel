/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.System_Vor_Grenze_Besonders_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.System_Vor_Grenze_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getIDElementGrenze <em>ID Element Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getSystemVorGrenze <em>System Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Allg_AttributeGroupImpl#getSystemVorGrenzeBesonders <em>System Vor Grenze Besonders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDElementGrenze() <em>ID Element Grenze</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDElementGrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<Basis_Objekt> iDElementGrenze;

	/**
	 * The cached value of the '{@link #getIDRBCVorGrenze() <em>IDRBC Vor Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBCVorGrenze()
	 * @generated
	 * @ordered
	 */
	protected RBC iDRBCVorGrenze;

	/**
	 * This is true if the IDRBC Vor Grenze reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRBCVorGrenzeESet;

	/**
	 * The cached value of the '{@link #getSystemVorGrenze() <em>System Vor Grenze</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemVorGrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<System_Vor_Grenze_TypeClass> systemVorGrenze;

	/**
	 * The cached value of the '{@link #getSystemVorGrenzeBesonders() <em>System Vor Grenze Besonders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemVorGrenzeBesonders()
	 * @generated
	 * @ordered
	 */
	protected EList<System_Vor_Grenze_Besonders_TypeClass> systemVorGrenzeBesonders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Basis_Objekt> getIDElementGrenze() {
		if (iDElementGrenze == null) {
			iDElementGrenze = new EObjectResolvingEList<Basis_Objekt>(Basis_Objekt.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE);
		}
		return iDElementGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC getIDRBCVorGrenze() {
		if (iDRBCVorGrenze != null && iDRBCVorGrenze.eIsProxy()) {
			InternalEObject oldIDRBCVorGrenze = (InternalEObject)iDRBCVorGrenze;
			iDRBCVorGrenze = (RBC)eResolveProxy(oldIDRBCVorGrenze);
			if (iDRBCVorGrenze != oldIDRBCVorGrenze) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, oldIDRBCVorGrenze, iDRBCVorGrenze));
			}
		}
		return iDRBCVorGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBC basicGetIDRBCVorGrenze() {
		return iDRBCVorGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRBCVorGrenze(RBC newIDRBCVorGrenze) {
		RBC oldIDRBCVorGrenze = iDRBCVorGrenze;
		iDRBCVorGrenze = newIDRBCVorGrenze;
		boolean oldIDRBCVorGrenzeESet = iDRBCVorGrenzeESet;
		iDRBCVorGrenzeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, oldIDRBCVorGrenze, iDRBCVorGrenze, !oldIDRBCVorGrenzeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRBCVorGrenze() {
		RBC oldIDRBCVorGrenze = iDRBCVorGrenze;
		boolean oldIDRBCVorGrenzeESet = iDRBCVorGrenzeESet;
		iDRBCVorGrenze = null;
		iDRBCVorGrenzeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE, oldIDRBCVorGrenze, null, oldIDRBCVorGrenzeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRBCVorGrenze() {
		return iDRBCVorGrenzeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_Vor_Grenze_TypeClass> getSystemVorGrenze() {
		if (systemVorGrenze == null) {
			systemVorGrenze = new EObjectContainmentEList<System_Vor_Grenze_TypeClass>(System_Vor_Grenze_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE);
		}
		return systemVorGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<System_Vor_Grenze_Besonders_TypeClass> getSystemVorGrenzeBesonders() {
		if (systemVorGrenzeBesonders == null) {
			systemVorGrenzeBesonders = new EObjectContainmentEList<System_Vor_Grenze_Besonders_TypeClass>(System_Vor_Grenze_Besonders_TypeClass.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS);
		}
		return systemVorGrenzeBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				return ((InternalEList<?>)getSystemVorGrenze()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				return ((InternalEList<?>)getSystemVorGrenzeBesonders()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				return getIDElementGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				if (resolve) return getIDRBCVorGrenze();
				return basicGetIDRBCVorGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				return getSystemVorGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				return getSystemVorGrenzeBesonders();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				getIDElementGrenze().clear();
				getIDElementGrenze().addAll((Collection<? extends Basis_Objekt>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				setIDRBCVorGrenze((RBC)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				getSystemVorGrenze().clear();
				getSystemVorGrenze().addAll((Collection<? extends System_Vor_Grenze_TypeClass>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				getSystemVorGrenzeBesonders().clear();
				getSystemVorGrenzeBesonders().addAll((Collection<? extends System_Vor_Grenze_Besonders_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				getIDElementGrenze().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				unsetIDRBCVorGrenze();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				getSystemVorGrenze().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				getSystemVorGrenzeBesonders().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__ID_ELEMENT_GRENZE:
				return iDElementGrenze != null && !iDElementGrenze.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__IDRBC_VOR_GRENZE:
				return isSetIDRBCVorGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE:
				return systemVorGrenze != null && !systemVorGrenze.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_ALLG_ATTRIBUTE_GROUP__SYSTEM_VOR_GRENZE_BESONDERS:
				return systemVorGrenzeBesonders != null && !systemVorGrenzeBesonders.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bereichsgrenze_Allg_AttributeGroupImpl
