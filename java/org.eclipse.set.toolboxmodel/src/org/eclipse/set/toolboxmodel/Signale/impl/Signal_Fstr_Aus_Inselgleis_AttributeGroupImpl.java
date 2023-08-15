/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Bezeichnung;

import org.eclipse.set.toolboxmodel.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fstr Aus Inselgleis Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl#getIDRaFahrtGleichzeitigVerbot <em>ID Ra Fahrt Gleichzeitig Verbot</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl#getIDZgFahrtGleichzeitigVerbot <em>ID Zg Fahrt Gleichzeitig Verbot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Fstr_Aus_Inselgleis_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDRaFahrtGleichzeitigVerbot() <em>ID Ra Fahrt Gleichzeitig Verbot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRaFahrtGleichzeitigVerbot()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Bezeichnung> iDRaFahrtGleichzeitigVerbot;

	/**
	 * The cached value of the '{@link #getIDZgFahrtGleichzeitigVerbot() <em>ID Zg Fahrt Gleichzeitig Verbot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZgFahrtGleichzeitigVerbot()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Bezeichnung> iDZgFahrtGleichzeitigVerbot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Bezeichnung> getIDRaFahrtGleichzeitigVerbot() {
		if (iDRaFahrtGleichzeitigVerbot == null) {
			iDRaFahrtGleichzeitigVerbot = new EObjectResolvingEList<Gleis_Bezeichnung>(Gleis_Bezeichnung.class, this, SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT);
		}
		return iDRaFahrtGleichzeitigVerbot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Bezeichnung> getIDZgFahrtGleichzeitigVerbot() {
		if (iDZgFahrtGleichzeitigVerbot == null) {
			iDZgFahrtGleichzeitigVerbot = new EObjectResolvingEList<Gleis_Bezeichnung>(Gleis_Bezeichnung.class, this, SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT);
		}
		return iDZgFahrtGleichzeitigVerbot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				return getIDRaFahrtGleichzeitigVerbot();
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				return getIDZgFahrtGleichzeitigVerbot();
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				getIDRaFahrtGleichzeitigVerbot().clear();
				getIDRaFahrtGleichzeitigVerbot().addAll((Collection<? extends Gleis_Bezeichnung>)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				getIDZgFahrtGleichzeitigVerbot().clear();
				getIDZgFahrtGleichzeitigVerbot().addAll((Collection<? extends Gleis_Bezeichnung>)newValue);
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				getIDRaFahrtGleichzeitigVerbot().clear();
				return;
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				getIDZgFahrtGleichzeitigVerbot().clear();
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
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_RA_FAHRT_GLEICHZEITIG_VERBOT:
				return iDRaFahrtGleichzeitigVerbot != null && !iDRaFahrtGleichzeitigVerbot.isEmpty();
			case SignalePackage.SIGNAL_FSTR_AUS_INSELGLEIS_ATTRIBUTE_GROUP__ID_ZG_FAHRT_GLEICHZEITIG_VERBOT:
				return iDZgFahrtGleichzeitigVerbot != null && !iDZgFahrtGleichzeitigVerbot.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_Fstr_Aus_Inselgleis_AttributeGroupImpl
