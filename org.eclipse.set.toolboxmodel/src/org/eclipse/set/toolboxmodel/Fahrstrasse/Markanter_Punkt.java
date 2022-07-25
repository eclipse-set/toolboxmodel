/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Block.Block_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markanter Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Punkt in der Örtlichkeit, der eindeutig aufzufinden und beschreibbar ist. Hauptsächlicher Anwendungsfall ist die Definition des Gefahrpunktes oder des Endes eines Durchrutschweges. Auch der PZB-Gefahrpunkt wird damit verortet. Die eindeutige Auffindbarkeit dient der Freimeldung durch Hinsehen in der Rückfallebene. Wegen schlechter Erkennbarkeit soll eine Gleisfreimeldegrenze nur ausnahmsweise als markanter Punkt genutzt werden, wenn sich in vertretbarer Entfernung kein anderer Punkt finden lässt. Antennen von Zugbeeinflussungen (z. B. PZB-Gleismagnet) gelten nicht als markanter Punkt. Das Ende des Durchrutschweges muss nicht mit einer Freimeldegrenze zusammenfallen. Ein weiterer Anwendungsfall ist die Verortung von Freimeldegrenzen als Hilfestellung für deren Montage. Markante Punkte sind: Signal (insbesondere Haupt- und Sperrsignal, Grenzzeichen, Schutzhaltsignal), Weichenspitze (W Kr Gsp Komponente), Gleissperre (W Kr Gsp Komponente), Kante des Gefahrraums an BÜ (Sonstiger Punkt), Besondere Objekte, z. B. an Deckungsstellen (derzeit noch nicht modelliert), Gleisfreimeldegrenze (nur ausnahmsweise), Beginn eines Bahnsteigs (Sonstiger Punkt), Zugschluss bzw. -spitze (Sonstiger Punkt), Sonstige Punkte (Sonstiger Punkt). DB-Regelwerk Ende Durchrutschweg: Durchrutschwegtabelle, Spalte 2: "bis"; Gefahrpunkt: Gefahrpunkttabelle, Spalte 2: "maßgebender Gefahrpunkt"; Verortung Gleisfreimeldegrenze: Bemaßungsangabe im sicherungstechnischen Lageplan und Achszählpunkttabelle, Spalte 17: "Bezugspunkt". 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt()
 * @model extendedMetaData="name='CMarkanter_Punkt' kind='elementOnly'"
 * @generated
 */
public interface Markanter_Punkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Markanter_Punkt_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Markanter_Punkt_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDD Weg Erlaubnisabhaengig</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abhängigkeit aller DWege - mit diesem Markanten Punkt als Ziel - von der Stellung der Erlaubnis der Block Anlage, an dessen Ende sich das verlinkte Block Element befindet. Der DWeg ist nur einstellbar, wenn die Erlaubnis vom Block Element Richtung Strecke zeigt. DB-Regelwerk Streckenblocktabelle, Spalte 11: "D-Weg erlaubnisabhängig"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDD Weg Erlaubnisabhaengig</em>' reference.
	 * @see #isSetIDDWegErlaubnisabhaengig()
	 * @see #unsetIDDWegErlaubnisabhaengig()
	 * @see #setIDDWegErlaubnisabhaengig(Block_Element)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_IDDWegErlaubnisabhaengig()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_DWeg_Erlaubnisabhaengig'"
	 * @generated
	 */
	Block_Element getIDDWegErlaubnisabhaengig();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDD Weg Erlaubnisabhaengig</em>' reference.
	 * @see #isSetIDDWegErlaubnisabhaengig()
	 * @see #unsetIDDWegErlaubnisabhaengig()
	 * @see #getIDDWegErlaubnisabhaengig()
	 * @generated
	 */
	void setIDDWegErlaubnisabhaengig(Block_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDDWegErlaubnisabhaengig()
	 * @see #getIDDWegErlaubnisabhaengig()
	 * @see #setIDDWegErlaubnisabhaengig(Block_Element)
	 * @generated
	 */
	void unsetIDDWegErlaubnisabhaengig();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDDWegErlaubnisabhaengig <em>IDD Weg Erlaubnisabhaengig</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDD Weg Erlaubnisabhaengig</em>' reference is set.
	 * @see #unsetIDDWegErlaubnisabhaengig()
	 * @see #getIDDWegErlaubnisabhaengig()
	 * @see #setIDDWegErlaubnisabhaengig(Block_Element)
	 * @generated
	 */
	boolean isSetIDDWegErlaubnisabhaengig();

	/**
	 * Returns the value of the '<em><b>ID Markante Stelle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Punkt Objekt, das als Markanter Punkt dient. DB-Regelwerk siehe Markanter Punkt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Markante Stelle</em>' reference.
	 * @see #isSetIDMarkanteStelle()
	 * @see #unsetIDMarkanteStelle()
	 * @see #setIDMarkanteStelle(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_IDMarkanteStelle()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Markante_Stelle'"
	 * @generated
	 */
	Basis_Objekt getIDMarkanteStelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Markante Stelle</em>' reference.
	 * @see #isSetIDMarkanteStelle()
	 * @see #unsetIDMarkanteStelle()
	 * @see #getIDMarkanteStelle()
	 * @generated
	 */
	void setIDMarkanteStelle(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDMarkanteStelle()
	 * @see #getIDMarkanteStelle()
	 * @see #setIDMarkanteStelle(Basis_Objekt)
	 * @generated
	 */
	void unsetIDMarkanteStelle();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt#getIDMarkanteStelle <em>ID Markante Stelle</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Markante Stelle</em>' reference is set.
	 * @see #unsetIDMarkanteStelle()
	 * @see #getIDMarkanteStelle()
	 * @see #setIDMarkanteStelle(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDMarkanteStelle();

} // Markanter_Punkt
