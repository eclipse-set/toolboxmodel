/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bgrenze RBC Wechsel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getBgrenzeRBCWechselBTSKette <em>Bgrenze RBC Wechsel BTS Kette</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bgrenze_RBC_Wechsel_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bgrenze_RBC_Wechsel' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bgrenze_RBC_Wechsel_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bgrenze RBC Wechsel BTS Kette</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den drei angrenzenden GSM-R-Sendemasten (BTS). Die Angabe erfolgt für jede Fahrtrichtung und Fahrtmöglichkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bgrenze RBC Wechsel BTS Kette</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bgrenze_RBC_Wechsel_AttributeGroup_BgrenzeRBCWechselBTSKette()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_RBC_Wechsel_BTS_Kette'"
	 * @generated
	 */
	EList<Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup> getBgrenzeRBCWechselBTSKette();

	/**
	 * Returns the value of the '<em><b>IDRBC Nach Grenze</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das nach der Bereichsgrenze zuständige RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC Nach Grenze</em>' reference.
	 * @see #isSetIDRBCNachGrenze()
	 * @see #unsetIDRBCNachGrenze()
	 * @see #setIDRBCNachGrenze(RBC)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bgrenze_RBC_Wechsel_AttributeGroup_IDRBCNachGrenze()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC_Nach_Grenze'"
	 * @generated
	 */
	RBC getIDRBCNachGrenze();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDRBC Nach Grenze</em>' reference.
	 * @see #isSetIDRBCNachGrenze()
	 * @see #unsetIDRBCNachGrenze()
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 */
	void setIDRBCNachGrenze(RBC value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDRBCNachGrenze()
	 * @see #getIDRBCNachGrenze()
	 * @see #setIDRBCNachGrenze(RBC)
	 * @generated
	 */
	void unsetIDRBCNachGrenze();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDRBC Nach Grenze</em>' reference is set.
	 * @see #unsetIDRBCNachGrenze()
	 * @see #getIDRBCNachGrenze()
	 * @see #setIDRBCNachGrenze(RBC)
	 * @generated
	 */
	boolean isSetIDRBCNachGrenze();

} // ZUB_Bgrenze_RBC_Wechsel_AttributeGroup
