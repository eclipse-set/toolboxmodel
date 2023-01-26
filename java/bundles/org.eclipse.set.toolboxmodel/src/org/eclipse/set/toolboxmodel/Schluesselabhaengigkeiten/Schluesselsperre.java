/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluesselsperre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elektromechanisches Bauelement, das die Anwesenheit eines Schlüssels prüft, ihn festhält und eine Abhängigkeit zur Stellwerkslogik besitzt. Schlüsselsperren dienen der Festhaltung bzw. Freigabe von Schlüsseln, mit denen in der Regel weitere Elemente bedienbar gemacht werden. In Einzelfällen dienen Schlüsselsperren nur als Schlüsselschalter. Die Darstellung im Lageplan erfolgt am Ort der Bedienung (z. B. Stellwerk, sonstiges Gebäude), der durch die Unterbringung beschrieben wird. Eine Darstellung am oder auf dem Gleis erfolgt nicht! DB-Regelwerk Darstellung durch Zeichnung im Lageplan nach 819.9002 2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getBedienungArt <em>Bedienung Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluesselsperre()
 * @model extendedMetaData="name='CSchluesselsperre' kind='elementOnly'"
 * @generated
 */
public interface Schluesselsperre extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedienung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unterscheidung nach Innen- und Außenschlüsselsperre. Alt: Traditionell wird unterschieden zwischen einer Schlüsselsperre als Teil der Bedieneinrichtung im Stellwerk (Innenschlüsselsperre) und einer solchen in der Nähe des zu bedienenden Elements in den Außenanlagen (Außenschlüsselsperre). Mit zunehmender Zentralisierung und Entfall örtlich besetzter Stellwerke verliert diese Unterscheidung ihre Bedeutung. Neu (ESTW-Technik): Als Innenschlüsselsperre werden die nur für das LST-Personal zugänglichen Schlüsselsperren in der Außenelementansteuerung bezeichnet, die z. B. zum Sperren von Fahrstraßen genutzt werden. Alle für das Betriebspersonal (insbesondere Rangierpersonal) zugänglichen Schlüsselsperren sind Außenschlüsselsperren, unabhängig von der Art der Unterbringung. DB-Regelwerk Darstellung durch Zeichnung im Lageplan nach 819.9002 2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedienung Art</em>' containment reference.
	 * @see #setBedienungArt(Bedienung_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluesselsperre_BedienungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedienung_Art'"
	 * @generated
	 */
	Bedienung_Art_TypeClass getBedienungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getBedienungArt <em>Bedienung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedienung Art</em>' containment reference.
	 * @see #getBedienungArt()
	 * @generated
	 */
	void setBedienungArt(Bedienung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluesselsperre_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

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
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluesselsperre_IDStellelement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	Stellelement getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDStellelement <em>ID Stellelement</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	void unsetIDStellelement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDStellelement <em>ID Stellelement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Stellelement</em>' reference is set.
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	boolean isSetIDStellelement();

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
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluesselsperre_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

} // Schluesselsperre
