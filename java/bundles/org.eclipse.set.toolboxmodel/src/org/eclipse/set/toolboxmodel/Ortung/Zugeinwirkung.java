/**
 */
package org.eclipse.set.toolboxmodel.Ortung;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zugeinwirkung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technische Anlage, die durch die punktuelle Einwirkung eines Zuges einen Schaltvorgang auslösen kann. Bei BÜSA werden Ein- und Ausschaltpunkte sowie Kontakte für die Wirksamkeitsschaltung in Abhängigkeit vom Hersteller auf verschiedene Art ausgebildet: Die Hersteller Scheidt\u0026amp;Bachmann sowie PintschBamag verwenden als Zugeinwirkung Fahrzeugsensoren in Form von 8-förmig verlegten Schleifen im Gleis. Einschaltpunkte und Kontakte für die Wirksamkeitsschaltung werden im Regelfall aus zwei Schleifen, Ausschaltpunkte aus einer Schleife gebildet. Nur im Ausnahmefall werden beim Hersteller PintschBamag Einschaltpunkte mit drei Schleifen errichtet. Der Hersteller Siemens AG verwendet dagegen Achszählern vergleichbare sogenannte Doppelsensoren. Für das Modell werden, unabhängig von der herstellerspezifischen Ausbildung, Ein-und Ausschaltpunkte sowie Kontakte der Wirksamkeitsschaltung grundsätzlich als EINE Zugeinwirkung betrachtet. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisfreimeldeplan. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getIDBezugspunkt <em>ID Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getZugeinwirkungAllg <em>Zugeinwirkung Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getZugeinwirkung()
 * @model extendedMetaData="name='CZugeinwirkung' kind='elementOnly'"
 * @generated
 */
public interface Zugeinwirkung extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getZugeinwirkung_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bezugspunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Punkt Objekt, dass für die Positionierung der Freimeldeabschnittsgrenze (FMA_Komponente) bzw. der Zugeinwirkung maßgebend ist. Für alle Arten von Freimeldeabschnittsgrenzen bzw. Zugeinwirkungen anzugeben, für die ein Bezugspunkt existiert, zu dem ein vorgeschriebener Abstand erforderlich ist. Typische Bezugspunkte sind Signal, Weichen-Komponente und Gleissperren-Komponente. DB-Regelwerk bei Achszählpunkten: Achszähltabelle, Spalte 17; bei anderen Freimeldeabschnittsgrenzen und Zugeinwirkungen: häufig aus einer Abstandsangabe im Sicherungstechnischen Lageplan / BÜ-Lageplan erkennbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bezugspunkt</em>' reference.
	 * @see #isSetIDBezugspunkt()
	 * @see #unsetIDBezugspunkt()
	 * @see #setIDBezugspunkt(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getZugeinwirkung_IDBezugspunkt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bezugspunkt'"
	 * @generated
	 */
	Markanter_Punkt getIDBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getIDBezugspunkt <em>ID Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bezugspunkt</em>' reference.
	 * @see #isSetIDBezugspunkt()
	 * @see #unsetIDBezugspunkt()
	 * @see #getIDBezugspunkt()
	 * @generated
	 */
	void setIDBezugspunkt(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getIDBezugspunkt <em>ID Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBezugspunkt()
	 * @see #getIDBezugspunkt()
	 * @see #setIDBezugspunkt(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDBezugspunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getIDBezugspunkt <em>ID Bezugspunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bezugspunkt</em>' reference is set.
	 * @see #unsetIDBezugspunkt()
	 * @see #getIDBezugspunkt()
	 * @see #setIDBezugspunkt(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDBezugspunkt();

	/**
	 * Returns the value of the '<em><b>Zugeinwirkung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zugeinwirkung Allg</em>' containment reference.
	 * @see #setZugeinwirkungAllg(Zugeinwirkung_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getZugeinwirkung_ZugeinwirkungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Zugeinwirkung_Allg'"
	 * @generated
	 */
	Zugeinwirkung_Allg_AttributeGroup getZugeinwirkungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Zugeinwirkung#getZugeinwirkungAllg <em>Zugeinwirkung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zugeinwirkung Allg</em>' containment reference.
	 * @see #getZugeinwirkungAllg()
	 * @generated
	 */
	void setZugeinwirkungAllg(Zugeinwirkung_Allg_AttributeGroup value);

} // Zugeinwirkung
