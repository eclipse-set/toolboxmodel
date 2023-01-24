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

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bgrenze Nach Ohne Bed Einstieg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup#getIDWElement <em>IDW Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup#getWLage <em>WLage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup()
 * @model extendedMetaData="name='CBgrenze_Nach_Ohne_Bed_Einstieg' kind='elementOnly'"
 * @generated
 */
public interface Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDW Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Weichen-Element der Entscheidungsweiche.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Element</em>' reference.
	 * @see #isSetIDWElement()
	 * @see #unsetIDWElement()
	 * @see #setIDWElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup_IDWElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup#getIDWElement <em>IDW Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Element</em>' reference.
	 * @see #isSetIDWElement()
	 * @see #unsetIDWElement()
	 * @see #getIDWElement()
	 * @generated
	 */
	void setIDWElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup#getIDWElement <em>IDW Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWElement()
	 * @see #getIDWElement()
	 * @see #setIDWElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDWElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup#getIDWElement <em>IDW Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDW Element</em>' reference is set.
	 * @see #unsetIDWElement()
	 * @see #getIDWElement()
	 * @see #setIDWElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDWElement();

	/**
	 * Returns the value of the '<em><b>WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage des Weichen-Elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WLage</em>' containment reference.
	 * @see #setWLage(W_Lage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup_WLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Lage'"
	 * @generated
	 */
	W_Lage_TypeClass getWLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup#getWLage <em>WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WLage</em>' containment reference.
	 * @see #getWLage()
	 * @generated
	 */
	void setWLage(W_Lage_TypeClass value);

} // Bgrenze_Nach_Ohne_Bed_Einstieg_AttributeGroup
