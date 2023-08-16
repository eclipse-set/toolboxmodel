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

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Nichthaltfall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nichthaltfallabschnitt (auch: Haltfallverhinderungsabschnitt). Im Gegensatz zur bisherigen Praxis der LST-Planung, den Haltfallabschnitt zu planen, werden im Datenmodell nur die Nichthaltfallabschnitte für jeden Fahrweg geplant. In der Regel ist es einer, selten mehrere. DB-Regelwerk Haltfallabschnitt bisher: Zugstraßentabelle, Spalte 6: Signalhaltfall
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Nichthaltfall()
 * @model extendedMetaData="name='CFstr_Nichthaltfall' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Nichthaltfall extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDFMA Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freimeldeabschnitt, der als Nichthaltfallabschnitt genutzt wird. DB-Regelwerk Wurde bisher nicht angegeben, stattdessen: Zugstraßentabelle, Spalte 6: Signalhaltfall.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage</em>' reference.
	 * @see #isSetIDFMAAnlage()
	 * @see #unsetIDFMAAnlage()
	 * @see #setIDFMAAnlage(FMA_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Nichthaltfall_IDFMAAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage'"
	 * @generated
	 */
	FMA_Anlage getIDFMAAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFMA Anlage</em>' reference.
	 * @see #isSetIDFMAAnlage()
	 * @see #unsetIDFMAAnlage()
	 * @see #getIDFMAAnlage()
	 * @generated
	 */
	void setIDFMAAnlage(FMA_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFMAAnlage()
	 * @see #getIDFMAAnlage()
	 * @see #setIDFMAAnlage(FMA_Anlage)
	 * @generated
	 */
	void unsetIDFMAAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFMAAnlage <em>IDFMA Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDFMA Anlage</em>' reference is set.
	 * @see #unsetIDFMAAnlage()
	 * @see #getIDFMAAnlage()
	 * @see #setIDFMAAnlage(FMA_Anlage)
	 * @generated
	 */
	boolean isSetIDFMAAnlage();

	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Nichthaltfallabschnitts zu Fstr Fahrweg. DB-Regelwerk Wurde bisher nicht angegeben, stattdessen: Zugstraßentabelle, Spalte 6: Signalhaltfall 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Nichthaltfall_IDFstrFahrweg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	Fstr_Fahrweg getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	void unsetIDFstrFahrweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Nichthaltfall#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Fahrweg</em>' reference is set.
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	boolean isSetIDFstrFahrweg();

} // Fstr_Nichthaltfall
