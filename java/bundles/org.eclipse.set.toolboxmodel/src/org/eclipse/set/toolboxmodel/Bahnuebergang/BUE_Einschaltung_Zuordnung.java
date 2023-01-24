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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Einschaltung Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt zur Zuordnung zwischen BUE Einschaltung und zugehörigem BUE Gleisbezogener Gefahrraum. Im Regelfall wirkt eine BUE_Einschaltung direkt auf einen gleisbezogenen Gefahrraum; das Zuordnungsobjekt wäre nicht erforderlich. Liegt jedoch zwischen BUE_Einschaltung und dem BÜ eine Weichenverbindung, wird eine Zuordnung der BUE_Einschaltung auf mehrere gleisbezogene Gefahrräume notwendig. Diese Verbindung stellt das Zuordnungsobjekt her. Zur Vereinheitlichung wurde auf eine Choice zwischen direktem Verweis von BUE_Einschaltung auf BUE_Gleisbezogener_Gefahrraum und den Verweisen durch das Zuordnungsobjekt verzichtet. DB-Regelwerk Dieser Anwendungsfall ist im Regelwerk der DB AG nicht explizit beschrieben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Zuordnung()
 * @model extendedMetaData="name='CBUE_Einschaltung_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Einschaltung_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf denjenigen Einschaltpunkt, der die Einschaltung des betreffenden BUE Gleisbezogener Gefahrraum bewirkt. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' reference.
	 * @see #isSetIDBUEEinschaltung()
	 * @see #unsetIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Zuordnung_IDBUEEinschaltung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	BUE_Einschaltung getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	void unsetIDBUEEinschaltung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference is set.
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
	 * Returns the value of the '<em><b>IDBUE Gleisbez Gefahrraum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen Gefahrraum, auf den sich die BUE_Einschaltung - gleisbezogen - bezieht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Gleisbez Gefahrraum</em>' reference.
	 * @see #isSetIDBUEGleisbezGefahrraum()
	 * @see #unsetIDBUEGleisbezGefahrraum()
	 * @see #setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Zuordnung_IDBUEGleisbezGefahrraum()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Gleisbez_Gefahrraum'"
	 * @generated
	 */
	BUE_Gleisbezogener_Gefahrraum getIDBUEGleisbezGefahrraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Gleisbez Gefahrraum</em>' reference.
	 * @see #isSetIDBUEGleisbezGefahrraum()
	 * @see #unsetIDBUEGleisbezGefahrraum()
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 */
	void setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEGleisbezGefahrraum()
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @see #setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum)
	 * @generated
	 */
	void unsetIDBUEGleisbezGefahrraum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung_Zuordnung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Gleisbez Gefahrraum</em>' reference is set.
	 * @see #unsetIDBUEGleisbezGefahrraum()
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @see #setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum)
	 * @generated
	 */
	boolean isSetIDBUEGleisbezGefahrraum();

} // BUE_Einschaltung_Zuordnung
