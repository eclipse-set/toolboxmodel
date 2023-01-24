/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Stellelementen zu einer örtlichen Bedieneinrichtung und Abbildung von Meldern, Tasten und Schaltern einer örtlichen Bedieneinrichtung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getBedienAnzeigeElementAllg <em>Bedien Anzeige Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Anzeige_Element()
 * @model extendedMetaData="name='CBedien_Anzeige_Element' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Anzeige_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Anzeige Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Anzeige Element Allg</em>' containment reference.
	 * @see #setBedienAnzeigeElementAllg(Bedien_Anzeige_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Anzeige_Element_BedienAnzeigeElementAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Anzeige_Element_Allg'"
	 * @generated
	 */
	Bedien_Anzeige_Element_Allg_AttributeGroup getBedienAnzeigeElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getBedienAnzeigeElementAllg <em>Bedien Anzeige Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Anzeige Element Allg</em>' containment reference.
	 * @see #getBedienAnzeigeElementAllg()
	 * @generated
	 */
	void setBedienAnzeigeElementAllg(Bedien_Anzeige_Element_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Anzeige_Element_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bedien_Anzeige_Element_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Einrichtung Oertlich</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Verweis erfolgt die Verbindung eines Objekts zu seiner örtlichen Bedieneinrichtung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Einrichtung Oertlich</em>' reference.
	 * @see #isSetIDBedienEinrichtungOertlich()
	 * @see #unsetIDBedienEinrichtungOertlich()
	 * @see #setIDBedienEinrichtungOertlich(Bedien_Einrichtung_Oertlich)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Anzeige_Element_IDBedienEinrichtungOertlich()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Einrichtung_Oertlich'"
	 * @generated
	 */
	Bedien_Einrichtung_Oertlich getIDBedienEinrichtungOertlich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Einrichtung Oertlich</em>' reference.
	 * @see #isSetIDBedienEinrichtungOertlich()
	 * @see #unsetIDBedienEinrichtungOertlich()
	 * @see #getIDBedienEinrichtungOertlich()
	 * @generated
	 */
	void setIDBedienEinrichtungOertlich(Bedien_Einrichtung_Oertlich value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienEinrichtungOertlich()
	 * @see #getIDBedienEinrichtungOertlich()
	 * @see #setIDBedienEinrichtungOertlich(Bedien_Einrichtung_Oertlich)
	 * @generated
	 */
	void unsetIDBedienEinrichtungOertlich();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Einrichtung Oertlich</em>' reference is set.
	 * @see #unsetIDBedienEinrichtungOertlich()
	 * @see #getIDBedienEinrichtungOertlich()
	 * @see #setIDBedienEinrichtungOertlich(Bedien_Einrichtung_Oertlich)
	 * @generated
	 */
	boolean isSetIDBedienEinrichtungOertlich();

	/**
	 * Returns the value of the '<em><b>ID Verknuepftes Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal oder W Kr Gsp Element, für das eine Abhängigkeit zu einem Schalter, Melder oder einer Taste besteht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Verknuepftes Element</em>' reference.
	 * @see #isSetIDVerknuepftesElement()
	 * @see #unsetIDVerknuepftesElement()
	 * @see #setIDVerknuepftesElement(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Anzeige_Element_IDVerknuepftesElement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Verknuepftes_Element'"
	 * @generated
	 */
	Basis_Objekt getIDVerknuepftesElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Verknuepftes Element</em>' reference.
	 * @see #isSetIDVerknuepftesElement()
	 * @see #unsetIDVerknuepftesElement()
	 * @see #getIDVerknuepftesElement()
	 * @generated
	 */
	void setIDVerknuepftesElement(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDVerknuepftesElement()
	 * @see #getIDVerknuepftesElement()
	 * @see #setIDVerknuepftesElement(Basis_Objekt)
	 * @generated
	 */
	void unsetIDVerknuepftesElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Verknuepftes Element</em>' reference is set.
	 * @see #unsetIDVerknuepftesElement()
	 * @see #getIDVerknuepftesElement()
	 * @see #setIDVerknuepftesElement(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDVerknuepftesElement();

} // Bedien_Anzeige_Element
