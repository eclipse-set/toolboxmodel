/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Signalisierung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Je Fahrstraße zu zeigende Signalisierung, die sich nicht eindeutig aus den Stellwerksfunktionen ergibt. Siehe auch Bildung der Signalbegriffe. DB-Regelwerk Signaltabelle 2, jedoch sind hier alle Signalisierungen angegeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung()
 * @model extendedMetaData="name='CFstr_Signalisierung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Signalisierung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Signalbildes zur jeweiligen Fahrstraße. DB-Regelwerk Signaltabelle 2, Spalte 1: "Signalisierungsabschnitt/Zugstraße" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' reference.
	 * @see #isSetIDFstrZugRangier()
	 * @see #unsetIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung_IDFstrZugRangier()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	Fstr_Zug_Rangier getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	void unsetIDFstrZugRangier();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Zug Rangier</em>' reference is set.
	 * @see #unsetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	boolean isSetIDFstrZugRangier();

	/**
	 * Returns the value of the '<em><b>ID Signal Signalbegriff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Signalbegriffs zur jeweiligen Fahrstraße, u. U. in Abhängigkeit von ID Signal Signalbegriff Ziel. DB-Regelwerk Signaltabelle 2: Eintrag der jeweiligen Signalbegriffe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Signalbegriff</em>' reference.
	 * @see #isSetIDSignalSignalbegriff()
	 * @see #unsetIDSignalSignalbegriff()
	 * @see #setIDSignalSignalbegriff(Signal_Signalbegriff)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung_IDSignalSignalbegriff()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Signalbegriff'"
	 * @generated
	 */
	Signal_Signalbegriff getIDSignalSignalbegriff();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Signalbegriff</em>' reference.
	 * @see #isSetIDSignalSignalbegriff()
	 * @see #unsetIDSignalSignalbegriff()
	 * @see #getIDSignalSignalbegriff()
	 * @generated
	 */
	void setIDSignalSignalbegriff(Signal_Signalbegriff value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignalSignalbegriff()
	 * @see #getIDSignalSignalbegriff()
	 * @see #setIDSignalSignalbegriff(Signal_Signalbegriff)
	 * @generated
	 */
	void unsetIDSignalSignalbegriff();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal Signalbegriff</em>' reference is set.
	 * @see #unsetIDSignalSignalbegriff()
	 * @see #getIDSignalSignalbegriff()
	 * @see #setIDSignalSignalbegriff(Signal_Signalbegriff)
	 * @generated
	 */
	boolean isSetIDSignalSignalbegriff();

	/**
	 * Returns the value of the '<em><b>ID Signal Signalbegriff Ziel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionale Bedingung für die Anzeige von Fstr_Signalisierung.ID Signal Signalbegriff. Das Zielsignal ist meist das Signal am Fahrstraßenziel, kann aber auch davor (z. B. gestufte Geschwindigkeitssignalisierung) oder dahinter (z. B. nach dem Ende des Weichenbereiches bei Ausfahrten) liegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Signalbegriff Ziel</em>' reference.
	 * @see #isSetIDSignalSignalbegriffZiel()
	 * @see #unsetIDSignalSignalbegriffZiel()
	 * @see #setIDSignalSignalbegriffZiel(Signal_Signalbegriff)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung_IDSignalSignalbegriffZiel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Signalbegriff_Ziel'"
	 * @generated
	 */
	Signal_Signalbegriff getIDSignalSignalbegriffZiel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Signalbegriff Ziel</em>' reference.
	 * @see #isSetIDSignalSignalbegriffZiel()
	 * @see #unsetIDSignalSignalbegriffZiel()
	 * @see #getIDSignalSignalbegriffZiel()
	 * @generated
	 */
	void setIDSignalSignalbegriffZiel(Signal_Signalbegriff value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignalSignalbegriffZiel()
	 * @see #getIDSignalSignalbegriffZiel()
	 * @see #setIDSignalSignalbegriffZiel(Signal_Signalbegriff)
	 * @generated
	 */
	void unsetIDSignalSignalbegriffZiel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal Signalbegriff Ziel</em>' reference is set.
	 * @see #unsetIDSignalSignalbegriffZiel()
	 * @see #getIDSignalSignalbegriffZiel()
	 * @see #setIDSignalSignalbegriffZiel(Signal_Signalbegriff)
	 * @generated
	 */
	boolean isSetIDSignalSignalbegriffZiel();

} // Fstr_Signalisierung
