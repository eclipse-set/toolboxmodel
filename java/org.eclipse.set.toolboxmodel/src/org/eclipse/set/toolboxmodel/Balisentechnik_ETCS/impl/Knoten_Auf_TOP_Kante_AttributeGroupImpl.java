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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten_Art_Sonstige_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knoten Auf TOP Kante Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Knoten_Auf_TOP_Kante_AttributeGroupImpl#getETCSKnotenArtSonstige <em>ETCS Knoten Art Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Knoten_Auf_TOP_Kante_AttributeGroupImpl#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Knoten_Auf_TOP_Kante_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Knoten_Auf_TOP_Kante_AttributeGroup {
	/**
	 * The cached value of the '{@link #getETCSKnotenArtSonstige() <em>ETCS Knoten Art Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSKnotenArtSonstige()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Knoten_Art_Sonstige_TypeClass eTCSKnotenArtSonstige;

	/**
	 * The cached value of the '{@link #getPunktObjektTOPKante() <em>Punkt Objekt TOP Kante</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPunktObjektTOPKante()
	 * @generated
	 * @ordered
	 */
	protected EList<Punkt_Objekt_TOP_Kante_AttributeGroup> punktObjektTOPKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Knoten_Auf_TOP_Kante_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getKnoten_Auf_TOP_Kante_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Knoten_Art_Sonstige_TypeClass getETCSKnotenArtSonstige() {
		return eTCSKnotenArtSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSKnotenArtSonstige(ETCS_Knoten_Art_Sonstige_TypeClass newETCSKnotenArtSonstige, NotificationChain msgs) {
		ETCS_Knoten_Art_Sonstige_TypeClass oldETCSKnotenArtSonstige = eTCSKnotenArtSonstige;
		eTCSKnotenArtSonstige = newETCSKnotenArtSonstige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE, oldETCSKnotenArtSonstige, newETCSKnotenArtSonstige);
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
	public void setETCSKnotenArtSonstige(ETCS_Knoten_Art_Sonstige_TypeClass newETCSKnotenArtSonstige) {
		if (newETCSKnotenArtSonstige != eTCSKnotenArtSonstige) {
			NotificationChain msgs = null;
			if (eTCSKnotenArtSonstige != null)
				msgs = ((InternalEObject)eTCSKnotenArtSonstige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE, null, msgs);
			if (newETCSKnotenArtSonstige != null)
				msgs = ((InternalEObject)newETCSKnotenArtSonstige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE, null, msgs);
			msgs = basicSetETCSKnotenArtSonstige(newETCSKnotenArtSonstige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE, newETCSKnotenArtSonstige, newETCSKnotenArtSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Punkt_Objekt_TOP_Kante_AttributeGroup> getPunktObjektTOPKante() {
		if (punktObjektTOPKante == null) {
			punktObjektTOPKante = new EObjectContainmentEList<Punkt_Objekt_TOP_Kante_AttributeGroup>(Punkt_Objekt_TOP_Kante_AttributeGroup.class, this, Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__PUNKT_OBJEKT_TOP_KANTE);
		}
		return punktObjektTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE:
				return basicSetETCSKnotenArtSonstige(null, msgs);
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__PUNKT_OBJEKT_TOP_KANTE:
				return ((InternalEList<?>)getPunktObjektTOPKante()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE:
				return getETCSKnotenArtSonstige();
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__PUNKT_OBJEKT_TOP_KANTE:
				return getPunktObjektTOPKante();
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
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE:
				setETCSKnotenArtSonstige((ETCS_Knoten_Art_Sonstige_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__PUNKT_OBJEKT_TOP_KANTE:
				getPunktObjektTOPKante().clear();
				getPunktObjektTOPKante().addAll((Collection<? extends Punkt_Objekt_TOP_Kante_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE:
				setETCSKnotenArtSonstige((ETCS_Knoten_Art_Sonstige_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__PUNKT_OBJEKT_TOP_KANTE:
				getPunktObjektTOPKante().clear();
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
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__ETCS_KNOTEN_ART_SONSTIGE:
				return eTCSKnotenArtSonstige != null;
			case Balisentechnik_ETCSPackage.KNOTEN_AUF_TOP_KANTE_ATTRIBUTE_GROUP__PUNKT_OBJEKT_TOP_KANTE:
				return punktObjektTOPKante != null && !punktObjektTOPKante.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Knoten_Auf_TOP_Kante_AttributeGroupImpl
