/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Umfahrpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bezeichner des Umfahrpunkts durch eine Weiche oder einen Gleisabschnitt. Der Bezeichner dient nur dazu, den Umfahrweg zu benennen, nicht dazu, den Fahrweg zu beschreiben; die Beschreibung erfolgt in Fstr Fahrweg (Bereich Objekt). Die Festlegung des Umfahrpunkts gilt je Fahrweg und damit für alle Zug- und Rangierstraßen, die diesen Fahrweg nutzen. Das Objekt ist Bestandteil des Untergewerks "Bedienung Fdl". DB-Regelwerk Bestandteil des Bezeichners der Umfahrstraße in der Zug-/Rangierstraßentabelle, Spalte 1 "Start/Ziel"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Umfahrpunkt()
 * @model extendedMetaData="name='CFstr_Umfahrpunkt' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Umfahrpunkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Fahrwegs zum Umfahrpunkt. DB-Regelwerk Zugstraßentabelle, Bezeichnung der Fstr (inkl. Umfahrpunkt) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Umfahrpunkt_IDFstrFahrweg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	Fstr_Fahrweg getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(Fstr_Fahrweg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	void unsetIDFstrFahrweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Fahrweg</em>' reference is set.
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	boolean isSetIDFstrFahrweg();

	/**
	 * Returns the value of the '<em><b>ID Umfahrpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Element (Gleisabschnitt oder Weiche), das für den Umfahrpunkt namensgebend ist. DB-Regelwerk Zugstraßentabelle, Bezeichnung des Umfahrpunktes in der Fahrstraßenbezeichnung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Umfahrpunkt</em>' reference.
	 * @see #isSetIDUmfahrpunkt()
	 * @see #unsetIDUmfahrpunkt()
	 * @see #setIDUmfahrpunkt(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Umfahrpunkt_IDUmfahrpunkt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Umfahrpunkt'"
	 * @generated
	 */
	Basis_Objekt getIDUmfahrpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Umfahrpunkt</em>' reference.
	 * @see #isSetIDUmfahrpunkt()
	 * @see #unsetIDUmfahrpunkt()
	 * @see #getIDUmfahrpunkt()
	 * @generated
	 */
	void setIDUmfahrpunkt(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUmfahrpunkt()
	 * @see #getIDUmfahrpunkt()
	 * @see #setIDUmfahrpunkt(Basis_Objekt)
	 * @generated
	 */
	void unsetIDUmfahrpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Umfahrpunkt#getIDUmfahrpunkt <em>ID Umfahrpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Umfahrpunkt</em>' reference is set.
	 * @see #unsetIDUmfahrpunkt()
	 * @see #getIDUmfahrpunkt()
	 * @see #setIDUmfahrpunkt(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDUmfahrpunkt();

} // Fstr_Umfahrpunkt
