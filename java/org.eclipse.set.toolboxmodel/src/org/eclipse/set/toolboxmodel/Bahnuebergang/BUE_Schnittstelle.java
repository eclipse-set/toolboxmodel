/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Schnittstelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Schnittstelle zwischen dem Planer des ESTW und dem Planer der technischen Sicherung des Bahnübergangs. Im ESTW wird eine technische Schnittstelle für Hp-Abhängigkeiten zwischen ESTW und BÜ und/oder Fernüberwachung (FÜ) durch den özF vorgesehen. Bau-BÜ, die über eine Schlüsselsperre gesichert werden, sowie nichttechnisch gesicherte BÜ erhalten keine BUE_Schnittstelle. DB-Regelwerk Die betreffenden Angaben finden sich im "Datenblatt für die Abhängigkeiten BÜ - Stw".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getBUEAbhaengigkeitFue <em>BUE Abhaengigkeit Fue</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getBUESchnittstelleAllg <em>BUE Schnittstelle Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getIDStellelement <em>ID Stellelement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle()
 * @model extendedMetaData="name='CBUE_Schnittstelle' kind='elementOnly'"
 * @generated
 */
public interface BUE_Schnittstelle extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Abhaengigkeit Fue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Abhaengigkeit Fue</em>' containment reference.
	 * @see #setBUEAbhaengigkeitFue(BUE_Abhaengigkeit_Fue_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_BUEAbhaengigkeitFue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Abhaengigkeit_Fue'"
	 * @generated
	 */
	BUE_Abhaengigkeit_Fue_AttributeGroup getBUEAbhaengigkeitFue();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getBUEAbhaengigkeitFue <em>BUE Abhaengigkeit Fue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Abhaengigkeit Fue</em>' containment reference.
	 * @see #getBUEAbhaengigkeitFue()
	 * @generated
	 */
	void setBUEAbhaengigkeitFue(BUE_Abhaengigkeit_Fue_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>BUE Schnittstelle Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Schnittstelle Allg</em>' containment reference.
	 * @see #setBUESchnittstelleAllg(BUE_Schnittstelle_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_BUESchnittstelleAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Schnittstelle_Allg'"
	 * @generated
	 */
	BUE_Schnittstelle_Allg_AttributeGroup getBUESchnittstelleAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getBUESchnittstelleAllg <em>BUE Schnittstelle Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Schnittstelle Allg</em>' containment reference.
	 * @see #getBUESchnittstelleAllg()
	 * @generated
	 */
	void setBUESchnittstelleAllg(BUE_Schnittstelle_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Stellelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enthält Informationen über den energetischen und logischen Anschluss der Objekte. Für das PZB Element ist der Verweis nur zu füllen, wenn das PZB_Element eine GÜ ist. DB-Regelwerk Bisher ohne eindeutige Darstellung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_IDStellelement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	Stellelement getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @generated
	 */
	void setIDStellelement(Stellelement value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	void unsetIDStellelement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle#getIDStellelement <em>ID Stellelement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Stellelement</em>' reference is set.
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	boolean isSetIDStellelement();

} // BUE_Schnittstelle
