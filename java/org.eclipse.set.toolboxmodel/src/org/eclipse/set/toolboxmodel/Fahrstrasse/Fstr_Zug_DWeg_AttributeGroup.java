/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Zug DWeg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getDWegVorzug <em>DWeg Vorzug</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_DWeg_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Zug_DWeg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Zug_DWeg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DWeg Vorzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorzugs-Durchrutschweg. Der DWeg ist der Standard-Durchrutschweg, der verwendet wird, wenn in der Bedienung kein spezieller DWeg ausgewählt wird. DB-Regelwerk Durchrutschwegtabelle: Je Signal als erster eingetragener DWeg.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Vorzug</em>' containment reference.
	 * @see #setDWegVorzug(DWeg_Vorzug_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_DWeg_AttributeGroup_DWegVorzug()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DWeg_Vorzug'"
	 * @generated
	 */
	DWeg_Vorzug_TypeClass getDWegVorzug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getDWegVorzug <em>DWeg Vorzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Vorzug</em>' containment reference.
	 * @see #getDWegVorzug()
	 * @generated
	 */
	void setDWegVorzug(DWeg_Vorzug_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr DWeg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des DWeges zur Zugstraße. DB-Regelwerk Zugstraßentabelle: Nennung des D-Weges im Namen der Fahrstraße 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr DWeg</em>' reference.
	 * @see #isSetIDFstrDWeg()
	 * @see #unsetIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_DWeg_AttributeGroup_IDFstrDWeg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_DWeg'"
	 * @generated
	 */
	Fstr_DWeg getIDFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr DWeg</em>' reference.
	 * @see #isSetIDFstrDWeg()
	 * @see #unsetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @generated
	 */
	void setIDFstrDWeg(Fstr_DWeg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @generated
	 */
	void unsetIDFstrDWeg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr DWeg</em>' reference is set.
	 * @see #unsetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @generated
	 */
	boolean isSetIDFstrDWeg();

} // Fstr_Zug_DWeg_AttributeGroup
