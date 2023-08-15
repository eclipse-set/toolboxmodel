/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Durchrutschweg oder Gefahrpunktabstand. Die Ausdehnung des Durchrutschwegs bzw. Gefahrpunktabstands wird mit dem Bereich Objekt Fstr Fahrweg festgelegt. Ein Durchrutschweg kann von mehreren Fahrstraßen genutzt werden. Ist die Attributgruppe Fstr_DWeg_Spezifisch nicht gefüllt, so handelt es sich um einen Gefahrpunktabstand. Ein Durchrutschweg der Länge Null wird ebenfalls als Instanz von Fstr_DWeg abgebildet. In dem Fall wird mit Fstr Fahrweg ein Bereichsobjekt der Länge Null mit Start und Ziel am Zielsignal der Fahrstraße verwendet. Derartige Durchrutschwege sind zu planen: am realen Zielsignal, hinter denen ein (Wahl-)Durchrutschweg der Länge Null vorgesehen ist, am fiktiven Zielsignal bei Stumpfgleiseinfahrt, am Zugdeckungssignal. Siehe hierzu auch Aufloesung Verzoegerung. DB-Regelwerk Durchrutschwegtabelle (eine Zeile)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getFstrDWegAllg <em>Fstr DWeg Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getFstrDWegSpezifisch <em>Fstr DWeg Spezifisch</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDFMAAnlageFreimeldung <em>IDFMA Anlage Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg()
 * @model extendedMetaData="name='CFstr_DWeg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Fstr_DWeg_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Fstr_DWeg_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Fstr_DWeg_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fstr DWeg Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr DWeg Allg</em>' containment reference.
	 * @see #setFstrDWegAllg(Fstr_DWeg_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_FstrDWegAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_DWeg_Allg'"
	 * @generated
	 */
	Fstr_DWeg_Allg_AttributeGroup getFstrDWegAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getFstrDWegAllg <em>Fstr DWeg Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr DWeg Allg</em>' containment reference.
	 * @see #getFstrDWegAllg()
	 * @generated
	 */
	void setFstrDWegAllg(Fstr_DWeg_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fstr DWeg Spezifisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr DWeg Spezifisch</em>' containment reference.
	 * @see #setFstrDWegSpezifisch(Fstr_DWeg_Spezifisch_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_FstrDWegSpezifisch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_DWeg_Spezifisch'"
	 * @generated
	 */
	Fstr_DWeg_Spezifisch_AttributeGroup getFstrDWegSpezifisch();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getFstrDWegSpezifisch <em>Fstr DWeg Spezifisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr DWeg Spezifisch</em>' containment reference.
	 * @see #getFstrDWegSpezifisch()
	 * @generated
	 */
	void setFstrDWegSpezifisch(Fstr_DWeg_Spezifisch_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDFMA Anlage Freimeldung</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freimeldeabschnitt(e) des Durchrutschwegs bzw. Gefahrpunktabstands, der/die freigeprüft wird/werden. Es werden alle zu berücksichtigenden Freimeldeabschnitte angegeben. Die Notwendigkeit, insbesondere den letzten freizuprüfenden Abschnitt zu definieren, ergibt sich aus der Tatsache, dass das Ende des Durchrutschweges (Markanter Punkt) bzw. der Gefahrpunkt nicht unbedingt deckungsgleich mit einer Gleisfreimeldegrenze sein muss. Die Angabe ist optional, da ein Durchrutschweg auch keinen Freimeldeabsschnitt haben kann (z. B. bei sehr kurzen Durchrutschwegen bis einschließlich "Null") und der Gefahrpunktabstand bei Freimeldung mit Achszählern heute in der Regel zusammen mit dem Blockabschnitt freigemeldet wird. Nur bei separater Freimeldung des Gefahrpunktabstands ist die Angabe erforderlich. DB-Regelwerk Durchrutschwegtabelle, Spalte 13: "technisch freizuprüfende Freimeldeabschnitte"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage Freimeldung</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_IDFMAAnlageFreimeldung()
	 * @model extendedMetaData="kind='element' name='ID_FMA_Anlage_Freimeldung'"
	 * @generated
	 */
	EList<FMA_Anlage> getIDFMAAnlageFreimeldung();

	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Fstr Fahrweg zur Angabe der Lage des DWegs. DB-Regelwerk Durchrutschwegtabelle, Spalten "von Signal" und "bis"  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_IDFstrFahrweg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	Fstr_Fahrweg getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(Fstr_Fahrweg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	void unsetIDFstrFahrweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Fahrweg</em>' reference is set.
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	boolean isSetIDFstrFahrweg();

	/**
	 * Returns the value of the '<em><b>IDPZB Gefahrpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Markanter Punkt, das den PZB-Gefahrpunkt hinter dem Signal, zu dem der Durchrutschweg gehört, repräsentiert. Der Durchrutschweg hat keinen PZB-Gefahrpunkt am fiktiven Zielsignal bei Stumpfgleiseinfahrt und am Zugdeckungssignal. PZB-Gefahrpunkt kann sein: ein Grenzzeichen, die Zugspitze/der Zugschluss eines am gewöhnlichen Halteplatz stehenden Zuges, eine Rangierhalttafel sowie ein ortsfestes Rangier- und Schutzhaltsignal in Gegenrichtung, eine durch Schutzsignal zu schützende Gefahrstelle, ein Bahnsteigende oder der Zugschluss einer Bedienfahrt in einer Awanst. Der PZB-Gefahrpunkt ist vom Gefahrpunkt für Hauptsignale nach Ril 819.02 zu unterscheiden, was sich schon aus den abweichenden Auflistungen ergibt. Der PZB-Gefahrpunkt dient zur Bemessung der Ausrüstung der Signale mit Anlagen der PZB. Während der Gefahrpunkt auch betriebliche Aufgaben hat und sowohl vom örtlichen als auch vom fahrenden Personal jederzeit erkennbar sein muss, stellt der PZB-Gefahrpunkt die rein technische Sicht auf einen möglichen Konfliktpunkt eines mittels PZB zwangsgebremsten Zuges mit einem anderen Zug dar. Zur Ermittlung dieses Konfliktpunktes werden die Maßnahmen der Fahrwegsicherung - z. B. Flankenschutz - mitbetrachtet. Konfliktpunkte mit Rangierfahrten werden nur in wenigen Fällen (besonderes Gefahrenpotential) berücksichtigt. DB-Regelwerk 819.1310 6 Gleismagnettabelle, Zeile 15 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Gefahrpunkt</em>' reference.
	 * @see #isSetIDPZBGefahrpunkt()
	 * @see #unsetIDPZBGefahrpunkt()
	 * @see #setIDPZBGefahrpunkt(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_IDPZBGefahrpunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Gefahrpunkt'"
	 * @generated
	 */
	Markanter_Punkt getIDPZBGefahrpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Gefahrpunkt</em>' reference.
	 * @see #isSetIDPZBGefahrpunkt()
	 * @see #unsetIDPZBGefahrpunkt()
	 * @see #getIDPZBGefahrpunkt()
	 * @generated
	 */
	void setIDPZBGefahrpunkt(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDPZBGefahrpunkt()
	 * @see #getIDPZBGefahrpunkt()
	 * @see #setIDPZBGefahrpunkt(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDPZBGefahrpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg#getIDPZBGefahrpunkt <em>IDPZB Gefahrpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDPZB Gefahrpunkt</em>' reference is set.
	 * @see #unsetIDPZBGefahrpunkt()
	 * @see #getIDPZBGefahrpunkt()
	 * @see #setIDPZBGefahrpunkt(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDPZBGefahrpunkt();

} // Fstr_DWeg
