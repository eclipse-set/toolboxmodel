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
 * A representation of the model object '<em><b>Fstr Aneinander Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung der aneinandergereihten Zug- oder Rangierstraße zu den Fahrstraßen Fstr Zug Rangier ("Elementarfahrstraßen"), aus denen sie besteht. DB-Regelwerk Tabelle der aneinandergereihten Zugstraßen Tabelle der aneinandergereihten Rangierstraßen 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_Zuordnung()
 * @model extendedMetaData="name='CFstr_Aneinander_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Aneinander_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Aneinander</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf Fstr Aneinander des Zuordnungsobjekts Fstr Aneinander Zuordnung. DB-Regelwerk Zusammengesetzte Zugstraßentabelle: Eintragungen einer Zeile
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Aneinander</em>' reference.
	 * @see #isSetIDFstrAneinander()
	 * @see #unsetIDFstrAneinander()
	 * @see #setIDFstrAneinander(Fstr_Aneinander)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_Zuordnung_IDFstrAneinander()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Aneinander'"
	 * @generated
	 */
	Fstr_Aneinander getIDFstrAneinander();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Aneinander</em>' reference.
	 * @see #isSetIDFstrAneinander()
	 * @see #unsetIDFstrAneinander()
	 * @see #getIDFstrAneinander()
	 * @generated
	 */
	void setIDFstrAneinander(Fstr_Aneinander value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrAneinander()
	 * @see #getIDFstrAneinander()
	 * @see #setIDFstrAneinander(Fstr_Aneinander)
	 * @generated
	 */
	void unsetIDFstrAneinander();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrAneinander <em>ID Fstr Aneinander</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Aneinander</em>' reference is set.
	 * @see #unsetIDFstrAneinander()
	 * @see #getIDFstrAneinander()
	 * @see #setIDFstrAneinander(Fstr_Aneinander)
	 * @generated
	 */
	boolean isSetIDFstrAneinander();

	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf die jeweilige Fahrstraße des Zuordnungsobjekts Fstr Aneinander Zuordnung. DB-Regelwerk Zusammengesetzte Zugstraßentabelle: Eintragungen einer Zeile 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' reference.
	 * @see #isSetIDFstrZugRangier()
	 * @see #unsetIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Aneinander_Zuordnung_IDFstrZugRangier()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	Fstr_Zug_Rangier getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' reference.
	 * @see #isSetIDFstrZugRangier()
	 * @see #unsetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(Fstr_Zug_Rangier value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	void unsetIDFstrZugRangier();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Zug Rangier</em>' reference is set.
	 * @see #unsetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	boolean isSetIDFstrZugRangier();

} // Fstr_Aneinander_Zuordnung
