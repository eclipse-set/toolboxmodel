/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE WS Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung zwischen BUE-Einschaltung und zugehörigen Fahrstraßen, für die die Wirksamkeitskontakte wirken sollen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_WS_Fstr_Zuordnung()
 * @model extendedMetaData="name='CBUE_WS_Fstr_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_WS_Fstr_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf denjenigen Einschaltpunkt, für den die Wirksamschaltung vorgesehen wird. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' reference.
	 * @see #isSetIDBUEEinschaltung()
	 * @see #unsetIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_WS_Fstr_Zuordnung_IDBUEEinschaltung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	BUE_Einschaltung getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Einschaltung</em>' reference.
	 * @see #isSetIDBUEEinschaltung()
	 * @see #unsetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 */
	void setIDBUEEinschaltung(BUE_Einschaltung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	void unsetIDBUEEinschaltung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Einschaltung</em>' reference is set.
	 * @see #unsetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	boolean isSetIDBUEEinschaltung();

	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf die Fahrstraße, für die die Einschaltung des BÜ abhängig geschaltet wird. DB-Regelwerk Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' reference.
	 * @see #isSetIDFstrZugRangier()
	 * @see #unsetIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_WS_Fstr_Zuordnung_IDFstrZugRangier()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	Fstr_Zug_Rangier getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	void unsetIDFstrZugRangier();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Zug Rangier</em>' reference is set.
	 * @see #unsetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	boolean isSetIDFstrZugRangier();

} // BUE_WS_Fstr_Zuordnung
