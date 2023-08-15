/**
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
 * A representation of the model object '<em><b>Ziel WElement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup#getIDZielWElement <em>ID Ziel WElement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup#getWAnschluss <em>WAnschluss</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZiel_W_Element_AttributeGroup()
 * @model extendedMetaData="name='CZiel_W_Element' kind='elementOnly'"
 * @generated
 */
public interface Ziel_W_Element_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Ziel WElement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Weichenelement, das als Ziel-Element zur Beschreibung des Fahrwegteils verwendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ziel WElement</em>' reference.
	 * @see #isSetIDZielWElement()
	 * @see #unsetIDZielWElement()
	 * @see #setIDZielWElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZiel_W_Element_AttributeGroup_IDZielWElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ziel_W_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDZielWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup#getIDZielWElement <em>ID Ziel WElement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ziel WElement</em>' reference.
	 * @see #isSetIDZielWElement()
	 * @see #unsetIDZielWElement()
	 * @see #getIDZielWElement()
	 * @generated
	 */
	void setIDZielWElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup#getIDZielWElement <em>ID Ziel WElement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZielWElement()
	 * @see #getIDZielWElement()
	 * @see #setIDZielWElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDZielWElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup#getIDZielWElement <em>ID Ziel WElement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Ziel WElement</em>' reference is set.
	 * @see #unsetIDZielWElement()
	 * @see #getIDZielWElement()
	 * @see #setIDZielWElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDZielWElement();

	/**
	 * Returns the value of the '<em><b>WAnschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des relevanten Anschlusses der Weiche (links, rechts, Spitze).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WAnschluss</em>' containment reference.
	 * @see #setWAnschluss(W_Anschluss_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZiel_W_Element_AttributeGroup_WAnschluss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='W_Anschluss'"
	 * @generated
	 */
	W_Anschluss_TypeClass getWAnschluss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup#getWAnschluss <em>WAnschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WAnschluss</em>' containment reference.
	 * @see #getWAnschluss()
	 * @generated
	 */
	void setWAnschluss(W_Anschluss_TypeClass value);

} // Ziel_W_Element_AttributeGroup
