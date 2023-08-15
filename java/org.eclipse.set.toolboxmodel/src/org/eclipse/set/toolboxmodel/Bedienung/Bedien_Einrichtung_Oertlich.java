/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Einrichtung Oertlich</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung einer örtlichen Bedieneinrichtung (Stelltafel, Bedienpult etc.) als physisches Element der Außenanlage. Bedienbare Elemente, die nicht von einer ESTW-Bedienoberfläche bedient werden, sind durch eine entsprechende Bedieneinrichtung umstellbar. Weiterhin sind in der Bedieneinrichtung Tasten für die Kommunikation zwischen özF und Bediener untergebracht. Im Objekt Bedien_Einrichtung_Oertlich wird die physische Ausbildung der Bedieneinrichtung abgebildet. Die dazugehörigen Melder, Schalter und Taster sind im Objekt Bedien Anzeige Element modelliert. Die logischen Funktionen einer Bedieneinrichtung für Nahstellbereiche und Bahnübergänge befinden sich in den Objekten „BUE Bedien Anzeige Element“ oder „NB Bedien Anzeige Element“. Die Bedien_Einrichtung_Oertlich kommt zur Anwendung bei: Nahstellbereichen, Bahnübergängen (HET, UT, etc.), Schlüsselschaltern- und Tastern (Zustimmung, Gleisfreimeldung, Zugschlussmeldung, etc.), ZP 10/9-Bediensäulen, örtlicher Abgabe von Zugschlussmeldungen und Bedieneinrichtungen an Schnittstellen zum Zugleitbetrieb. Bedieneinrichtungen von elektrisch ortsgestellten Weichen (EOW) werden mit diesem Objekt nicht modelliert.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getBedienEinrichtOertlichAllg <em>Bedien Einricht Oertlich Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich()
 * @model extendedMetaData="name='CBedien_Einrichtung_Oertlich' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Einrichtung_Oertlich extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Einricht Oertlich Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Einricht Oertlich Allg</em>' containment reference.
	 * @see #setBedienEinrichtOertlichAllg(Bedien_Einricht_Oertlich_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_BedienEinrichtOertlichAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Einricht_Oertlich_Allg'"
	 * @generated
	 */
	Bedien_Einricht_Oertlich_Allg_AttributeGroup getBedienEinrichtOertlichAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getBedienEinrichtOertlichAllg <em>Bedien Einricht Oertlich Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Einricht Oertlich Allg</em>' containment reference.
	 * @see #getBedienEinrichtOertlichAllg()
	 * @generated
	 */
	void setBedienEinrichtOertlichAllg(Bedien_Einricht_Oertlich_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Benutzeroberflaeche</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang zur Darstellung der Benutzeroberflaeche der Bedieneinrichtung. Beispielsweise kann eine Skizze für eine Gleisbilddarstellung oder die Anordnung der Schalter und Tasten beigefügt werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Benutzeroberflaeche</em>' reference.
	 * @see #isSetIDAnhangBenutzeroberflaeche()
	 * @see #unsetIDAnhangBenutzeroberflaeche()
	 * @see #setIDAnhangBenutzeroberflaeche(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_IDAnhangBenutzeroberflaeche()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Benutzeroberflaeche'"
	 * @generated
	 */
	Anhang getIDAnhangBenutzeroberflaeche();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Benutzeroberflaeche</em>' reference.
	 * @see #isSetIDAnhangBenutzeroberflaeche()
	 * @see #unsetIDAnhangBenutzeroberflaeche()
	 * @see #getIDAnhangBenutzeroberflaeche()
	 * @generated
	 */
	void setIDAnhangBenutzeroberflaeche(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangBenutzeroberflaeche()
	 * @see #getIDAnhangBenutzeroberflaeche()
	 * @see #setIDAnhangBenutzeroberflaeche(Anhang)
	 * @generated
	 */
	void unsetIDAnhangBenutzeroberflaeche();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAnhangBenutzeroberflaeche <em>ID Anhang Benutzeroberflaeche</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Benutzeroberflaeche</em>' reference is set.
	 * @see #unsetIDAnhangBenutzeroberflaeche()
	 * @see #getIDAnhangBenutzeroberflaeche()
	 * @see #setIDAnhangBenutzeroberflaeche(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangBenutzeroberflaeche();

	/**
	 * Returns the value of the '<em><b>ID Aussenelementansteuerung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Außenelementansteuerung, von der die örtliche Bedieneinrichtung angesteuert wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Aussenelementansteuerung</em>' reference.
	 * @see #isSetIDAussenelementansteuerung()
	 * @see #unsetIDAussenelementansteuerung()
	 * @see #setIDAussenelementansteuerung(Aussenelementansteuerung)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_IDAussenelementansteuerung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Aussenelementansteuerung'"
	 * @generated
	 */
	Aussenelementansteuerung getIDAussenelementansteuerung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Aussenelementansteuerung</em>' reference.
	 * @see #isSetIDAussenelementansteuerung()
	 * @see #unsetIDAussenelementansteuerung()
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 */
	void setIDAussenelementansteuerung(Aussenelementansteuerung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAussenelementansteuerung()
	 * @see #getIDAussenelementansteuerung()
	 * @see #setIDAussenelementansteuerung(Aussenelementansteuerung)
	 * @generated
	 */
	void unsetIDAussenelementansteuerung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Aussenelementansteuerung</em>' reference is set.
	 * @see #unsetIDAussenelementansteuerung()
	 * @see #getIDAussenelementansteuerung()
	 * @see #setIDAussenelementansteuerung(Aussenelementansteuerung)
	 * @generated
	 */
	boolean isSetIDAussenelementansteuerung();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

} // Bedien_Einrichtung_Oertlich
