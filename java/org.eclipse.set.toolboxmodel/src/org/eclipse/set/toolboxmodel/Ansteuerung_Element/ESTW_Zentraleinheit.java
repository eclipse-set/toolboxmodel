/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESTW Zentraleinheit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zentrale Komponente eines ESTW. Die ESTW-Zentraleinheit (ZE) steuert alle untergeordneten Aussenelementansteuerungen, stellt die Verbindung zu den Bedienbezirken (Notbedienplatz, Steuerbezirk/Zentralbedienung) und zu Nachbar-ESTW-Zentraleinheiten, zur Zuglenkung und zur Zugnummernmeldeanlage her. Die ZE kann ein ESTW-Z oder eine ESTW-UZ sein. Die geografische Grenze einer ZE liegt immer an einem Haupt- oder Sperrsignal (Signal_Real_Aktiv) oder einem Bedienpunkt (Signal_Fiktiv), in der Regel an einem Einfahrsignal. Die von einer Unterzentrale benötigten Adressformeln nach Richtlinie 819.0705 werden über die Verknüpfung zu Bedien Bezirk bereitgestellt. DB-Regelwerk Darstellung des ESTW-Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002, Beschreibung im Erläuterungsbericht
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZEEnergieversorgung <em>ESTWZE Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZentraleinheitAllg <em>ESTW Zentraleinheit Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit()
 * @model extendedMetaData="name='CESTW_Zentraleinheit' kind='elementOnly'"
 * @generated
 */
public interface ESTW_Zentraleinheit extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ESTW_Zentraleinheit_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ESTWZE Energieversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESTWZE Energieversorgung</em>' containment reference.
	 * @see #setESTWZEEnergieversorgung(ESTW_ZE_Energieversorgung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_ESTWZEEnergieversorgung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESTW_ZE_Energieversorgung'"
	 * @generated
	 */
	ESTW_ZE_Energieversorgung_AttributeGroup getESTWZEEnergieversorgung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZEEnergieversorgung <em>ESTWZE Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESTWZE Energieversorgung</em>' containment reference.
	 * @see #getESTWZEEnergieversorgung()
	 * @generated
	 */
	void setESTWZEEnergieversorgung(ESTW_ZE_Energieversorgung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ESTW Zentraleinheit Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ESTW Zentraleinheit Allg</em>' containment reference.
	 * @see #setESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_ESTWZentraleinheitAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESTW_Zentraleinheit_Allg'"
	 * @generated
	 */
	ESTW_Zentraleinheit_Allg_AttributeGroup getESTWZentraleinheitAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getESTWZentraleinheitAllg <em>ESTW Zentraleinheit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESTW Zentraleinheit Allg</em>' containment reference.
	 * @see #getESTWZentraleinheitAllg()
	 * @generated
	 */
	void setESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit Namensgebend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeit, die für die ESTW-Zentraleinheit namensgebend ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit Namensgebend</em>' reference.
	 * @see #isSetIDOertlichkeitNamensgebend()
	 * @see #unsetIDOertlichkeitNamensgebend()
	 * @see #setIDOertlichkeitNamensgebend(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDOertlichkeitNamensgebend()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_Namensgebend'"
	 * @generated
	 */
	Oertlichkeit getIDOertlichkeitNamensgebend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit Namensgebend</em>' reference.
	 * @see #isSetIDOertlichkeitNamensgebend()
	 * @see #unsetIDOertlichkeitNamensgebend()
	 * @see #getIDOertlichkeitNamensgebend()
	 * @generated
	 */
	void setIDOertlichkeitNamensgebend(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDOertlichkeitNamensgebend()
	 * @see #getIDOertlichkeitNamensgebend()
	 * @see #setIDOertlichkeitNamensgebend(Oertlichkeit)
	 * @generated
	 */
	void unsetIDOertlichkeitNamensgebend();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Oertlichkeit Namensgebend</em>' reference is set.
	 * @see #unsetIDOertlichkeitNamensgebend()
	 * @see #getIDOertlichkeitNamensgebend()
	 * @see #setIDOertlichkeitNamensgebend(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDOertlichkeitNamensgebend();

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
	 * @see #setIDUnterbringung(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Basis_Objekt getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Basis_Objekt)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk Virtuell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Virtuelle bzw. vorbereitende Zuordnung der ESTW Zentraleinheit zu einem Bedien Bezirk. Der Verweis wird gefüllt, sofern ein Stellwerk (noch) nicht in ESTW-Technik realisiert ist bzw. die Zuordnung zum Regionalnetz oder Fern- und Ballungsnetz noch offen ist. Die Zuordnung erfolgt, um jegliche spätere Realisierungsform zu ermöglichen und auch die Kennzahlenvergabe sicher zu gestalten. Die Befüllung ist alternativ zu ID Bedien Bezirk Zentral. DB-Regelwerk Diverse Listen und Erläuterungsbericht des BZ-PT 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk Virtuell</em>' reference.
	 * @see #isSetIDBedienBezirkVirtuell()
	 * @see #unsetIDBedienBezirkVirtuell()
	 * @see #setIDBedienBezirkVirtuell(Bedien_Bezirk)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDBedienBezirkVirtuell()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk_Virtuell'"
	 * @generated
	 */
	Bedien_Bezirk getIDBedienBezirkVirtuell();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk Virtuell</em>' reference.
	 * @see #isSetIDBedienBezirkVirtuell()
	 * @see #unsetIDBedienBezirkVirtuell()
	 * @see #getIDBedienBezirkVirtuell()
	 * @generated
	 */
	void setIDBedienBezirkVirtuell(Bedien_Bezirk value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienBezirkVirtuell()
	 * @see #getIDBedienBezirkVirtuell()
	 * @see #setIDBedienBezirkVirtuell(Bedien_Bezirk)
	 * @generated
	 */
	void unsetIDBedienBezirkVirtuell();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Bezirk Virtuell</em>' reference is set.
	 * @see #unsetIDBedienBezirkVirtuell()
	 * @see #getIDBedienBezirkVirtuell()
	 * @see #setIDBedienBezirkVirtuell(Bedien_Bezirk)
	 * @generated
	 */
	boolean isSetIDBedienBezirkVirtuell();

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk Zentral</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Bedien Bezirk, sofern eine zentrale Bedienung in einer Bedien Zentrale, Regio-BZ oder einem sonstigen Technikstandort stattfindet. Die Befüllung ist alternativ zum Verweis ID Bedien Bezirk Virtuell. DB-Regelwerk Diverse Listen und Erläuterungsbericht des BZ-PT 1
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk Zentral</em>' reference.
	 * @see #isSetIDBedienBezirkZentral()
	 * @see #unsetIDBedienBezirkZentral()
	 * @see #setIDBedienBezirkZentral(Bedien_Bezirk)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_Zentraleinheit_IDBedienBezirkZentral()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk_Zentral'"
	 * @generated
	 */
	Bedien_Bezirk getIDBedienBezirkZentral();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk Zentral</em>' reference.
	 * @see #isSetIDBedienBezirkZentral()
	 * @see #unsetIDBedienBezirkZentral()
	 * @see #getIDBedienBezirkZentral()
	 * @generated
	 */
	void setIDBedienBezirkZentral(Bedien_Bezirk value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienBezirkZentral()
	 * @see #getIDBedienBezirkZentral()
	 * @see #setIDBedienBezirkZentral(Bedien_Bezirk)
	 * @generated
	 */
	void unsetIDBedienBezirkZentral();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Bezirk Zentral</em>' reference is set.
	 * @see #unsetIDBedienBezirkZentral()
	 * @see #getIDBedienBezirkZentral()
	 * @see #setIDBedienBezirkZentral(Bedien_Bezirk)
	 * @generated
	 */
	boolean isSetIDBedienBezirkZentral();

} // ESTW_Zentraleinheit
