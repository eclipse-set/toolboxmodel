/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz WGsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getFlaWLage <em>Fla WLage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_W_Gsp_AttributeGroup()
 * @model extendedMetaData="name='CFla_Schutz_W_Gsp' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz_W_Gsp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fla WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der Flankenschutz bietenden Weiche. DB-Regelwerk Flankenschutztabelle, Spalte 3 "Weiche Gs"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla WLage</em>' containment reference.
	 * @see #setFlaWLage(Fla_W_Lage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_W_Lage'"
	 * @generated
	 */
	Fla_W_Lage_TypeClass getFlaWLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getFlaWLage <em>Fla WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla WLage</em>' containment reference.
	 * @see #getFlaWLage()
	 * @generated
	 */
	void setFlaWLage(Fla_W_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fla WGsp Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Flankenschutz bietende Weiche oder Gleissperre. DB-Regelwerk Flankenschutztabelle, Spalte 3 "Weiche Gs"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla WGsp Element</em>' reference.
	 * @see #isSetIDFlaWGspElement()
	 * @see #unsetIDFlaWGspElement()
	 * @see #setIDFlaWGspElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_W_Gsp_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDFlaWGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla WGsp Element</em>' reference.
	 * @see #isSetIDFlaWGspElement()
	 * @see #unsetIDFlaWGspElement()
	 * @see #getIDFlaWGspElement()
	 * @generated
	 */
	void setIDFlaWGspElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaWGspElement()
	 * @see #getIDFlaWGspElement()
	 * @see #setIDFlaWGspElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDFlaWGspElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup#getIDFlaWGspElement <em>ID Fla WGsp Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla WGsp Element</em>' reference is set.
	 * @see #unsetIDFlaWGspElement()
	 * @see #getIDFlaWGspElement()
	 * @see #setIDFlaWGspElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDFlaWGspElement();

} // Fla_Schutz_W_Gsp_AttributeGroup
