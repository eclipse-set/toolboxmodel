/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.PZB.PZB_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedingung PZB Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup#getIDPZBElement <em>IDPZB Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup#getWirksam <em>Wirksam</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_PZB_AttributeGroup()
 * @model extendedMetaData="name='CBedingung_PZB' kind='elementOnly'"
 * @generated
 */
public interface Bedingung_PZB_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDPZB Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein PZB-Element (Gleismagnet oder GÜ), das als Bedingung für die Auswahl des Fachtelegramms wirksam sein muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element</em>' reference.
	 * @see #isSetIDPZBElement()
	 * @see #unsetIDPZBElement()
	 * @see #setIDPZBElement(PZB_Element)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_PZB_AttributeGroup_IDPZBElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element'"
	 * @generated
	 */
	PZB_Element getIDPZBElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup#getIDPZBElement <em>IDPZB Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element</em>' reference.
	 * @see #isSetIDPZBElement()
	 * @see #unsetIDPZBElement()
	 * @see #getIDPZBElement()
	 * @generated
	 */
	void setIDPZBElement(PZB_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup#getIDPZBElement <em>IDPZB Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDPZBElement()
	 * @see #getIDPZBElement()
	 * @see #setIDPZBElement(PZB_Element)
	 * @generated
	 */
	void unsetIDPZBElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup#getIDPZBElement <em>IDPZB Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDPZB Element</em>' reference is set.
	 * @see #unsetIDPZBElement()
	 * @see #getIDPZBElement()
	 * @see #setIDPZBElement(PZB_Element)
	 * @generated
	 */
	boolean isSetIDPZBElement();

	/**
	 * Returns the value of the '<em><b>Wirksam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das PZB-Element wirksam sein muss (true) oder nicht (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirksam</em>' containment reference.
	 * @see #setWirksam(Wirksam_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_PZB_AttributeGroup_Wirksam()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Wirksam'"
	 * @generated
	 */
	Wirksam_TypeClass getWirksam();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup#getWirksam <em>Wirksam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirksam</em>' containment reference.
	 * @see #getWirksam()
	 * @generated
	 */
	void setWirksam(Wirksam_TypeClass value);

} // Bedingung_PZB_AttributeGroup
