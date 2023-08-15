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

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Abhaengigkeit Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getAufloesungSspZielgleis <em>Aufloesung Ssp Zielgleis</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_Ssp_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Abhaengigkeit_Ssp' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Abhaengigkeit_Ssp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Aufloesung Ssp Zielgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kriterium für die Auflösung von überwachten Schlüsselsperren im Zielgleis von Rangierstraßen. DB-Regelwerk Lastenheft ESTW F1, Abschnitt 6.5 (Rangierstraßenauflösung)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufloesung Ssp Zielgleis</em>' containment reference.
	 * @see #setAufloesungSspZielgleis(Aufloesung_Ssp_Zielgleis_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aufloesung_Ssp_Zielgleis'"
	 * @generated
	 */
	Aufloesung_Ssp_Zielgleis_TypeClass getAufloesungSspZielgleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getAufloesungSspZielgleis <em>Aufloesung Ssp Zielgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufloesung Ssp Zielgleis</em>' containment reference.
	 * @see #getAufloesungSspZielgleis()
	 * @generated
	 */
	void setAufloesungSspZielgleis(Aufloesung_Ssp_Zielgleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Schluesselsperre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schlüsselsperre, die überwacht sein muss, damit die Fstr gesichert ist. DB-Regelwerk Zugstraßentabelle, Spalte 5: "Ssp in der Fahrstraße verschlossen und überwacht"; Rangierstraßentabelle, Spalte 15: "Ssp in der Rangierstraße verschlossen und überwacht"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schluesselsperre</em>' reference.
	 * @see #isSetIDSchluesselsperre()
	 * @see #unsetIDSchluesselsperre()
	 * @see #setIDSchluesselsperre(Schluesselsperre)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schluesselsperre'"
	 * @generated
	 */
	Schluesselsperre getIDSchluesselsperre();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schluesselsperre</em>' reference.
	 * @see #isSetIDSchluesselsperre()
	 * @see #unsetIDSchluesselsperre()
	 * @see #getIDSchluesselsperre()
	 * @generated
	 */
	void setIDSchluesselsperre(Schluesselsperre value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSchluesselsperre()
	 * @see #getIDSchluesselsperre()
	 * @see #setIDSchluesselsperre(Schluesselsperre)
	 * @generated
	 */
	void unsetIDSchluesselsperre();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Schluesselsperre</em>' reference is set.
	 * @see #unsetIDSchluesselsperre()
	 * @see #getIDSchluesselsperre()
	 * @see #setIDSchluesselsperre(Schluesselsperre)
	 * @generated
	 */
	boolean isSetIDSchluesselsperre();

} // Fstr_Abhaengigkeit_Ssp_AttributeGroup
