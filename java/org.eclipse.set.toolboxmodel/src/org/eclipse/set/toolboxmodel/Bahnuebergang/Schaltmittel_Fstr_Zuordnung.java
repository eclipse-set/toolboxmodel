/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schaltmittel Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verknüpft bei einem Bahnübergang mit der Funktionsüberwachung Fü die möglichen Fahrstraßen mit den Elementen für die Wirksamschaltung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchaltmittel_Fstr_Zuordnung()
 * @model extendedMetaData="name='CSchaltmittel_Fstr_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Schaltmittel_Fstr_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUEWS Fstr Zuordnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnet eine zulässige Kombination von Fahrstraße und BÜ-Einschaltung für die Wirksamkeitsschaltung der Einschaltstelle zu. Falls Einschaltstellen von BÜ nur dann wirksam sein sollen, wenn bestimmte Fahrstraßen eingestellt sind, so werden in einem ersten Schritt Zuordnungsobjekte zwischen der Funktion Einschaltung eines BÜ und allen auf diesen BÜ zulaufenden Fahrstraßen gebildet. ID_BUE_WS_Fstr_Zuordnung verweist auf dieses Zuordnungsobjekt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUEWS Fstr Zuordnung</em>' reference.
	 * @see #isSetIDBUEWSFstrZuordnung()
	 * @see #unsetIDBUEWSFstrZuordnung()
	 * @see #setIDBUEWSFstrZuordnung(BUE_WS_Fstr_Zuordnung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchaltmittel_Fstr_Zuordnung_IDBUEWSFstrZuordnung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_WS_Fstr_Zuordnung'"
	 * @generated
	 */
	BUE_WS_Fstr_Zuordnung getIDBUEWSFstrZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUEWS Fstr Zuordnung</em>' reference.
	 * @see #isSetIDBUEWSFstrZuordnung()
	 * @see #unsetIDBUEWSFstrZuordnung()
	 * @see #getIDBUEWSFstrZuordnung()
	 * @generated
	 */
	void setIDBUEWSFstrZuordnung(BUE_WS_Fstr_Zuordnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEWSFstrZuordnung()
	 * @see #getIDBUEWSFstrZuordnung()
	 * @see #setIDBUEWSFstrZuordnung(BUE_WS_Fstr_Zuordnung)
	 * @generated
	 */
	void unsetIDBUEWSFstrZuordnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDBUEWSFstrZuordnung <em>IDBUEWS Fstr Zuordnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUEWS Fstr Zuordnung</em>' reference is set.
	 * @see #unsetIDBUEWSFstrZuordnung()
	 * @see #getIDBUEWSFstrZuordnung()
	 * @see #setIDBUEWSFstrZuordnung(BUE_WS_Fstr_Zuordnung)
	 * @generated
	 */
	boolean isSetIDBUEWSFstrZuordnung();

	/**
	 * Returns the value of the '<em><b>ID Schaltmittel Zuordnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnet einer vom Befahren eines bestimmten Punktes abhängigen Funktion ein Schaltmittel zu. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schaltmittel Zuordnung</em>' reference.
	 * @see #isSetIDSchaltmittelZuordnung()
	 * @see #unsetIDSchaltmittelZuordnung()
	 * @see #setIDSchaltmittelZuordnung(Schaltmittel_Zuordnung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchaltmittel_Fstr_Zuordnung_IDSchaltmittelZuordnung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schaltmittel_Zuordnung'"
	 * @generated
	 */
	Schaltmittel_Zuordnung getIDSchaltmittelZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schaltmittel Zuordnung</em>' reference.
	 * @see #isSetIDSchaltmittelZuordnung()
	 * @see #unsetIDSchaltmittelZuordnung()
	 * @see #getIDSchaltmittelZuordnung()
	 * @generated
	 */
	void setIDSchaltmittelZuordnung(Schaltmittel_Zuordnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSchaltmittelZuordnung()
	 * @see #getIDSchaltmittelZuordnung()
	 * @see #setIDSchaltmittelZuordnung(Schaltmittel_Zuordnung)
	 * @generated
	 */
	void unsetIDSchaltmittelZuordnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schaltmittel_Fstr_Zuordnung#getIDSchaltmittelZuordnung <em>ID Schaltmittel Zuordnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Schaltmittel Zuordnung</em>' reference is set.
	 * @see #unsetIDSchaltmittelZuordnung()
	 * @see #getIDSchaltmittelZuordnung()
	 * @see #setIDSchaltmittelZuordnung(Schaltmittel_Zuordnung)
	 * @generated
	 */
	boolean isSetIDSchaltmittelZuordnung();

} // Schaltmittel_Fstr_Zuordnung
