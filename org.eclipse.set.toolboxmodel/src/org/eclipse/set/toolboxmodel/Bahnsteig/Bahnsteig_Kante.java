/**
 */
package org.eclipse.set.toolboxmodel.Bahnsteig;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parallel zum Gleis verlaufende Kante eines Bahnsteigs, die für den Fahrgastwechsel nutzbar ist. Für die LST-Planung sind Beginn und Ende der genutzten Bahnsteigkante z. B. für die Zugbeeinflussung (PZB 90) sowie die Festlegung von Signalstandorten und Gefahrpunkten maßgebend. Die Baulänge der Bahnsteigkante wird im Datenmodell durch die Länge des Bereichsobjekts Bahnsteig_Kante abgebildet. Eventuell daran anschließende Tiefbauobjekte (auch stillgelegte Bahnsteigbereiche) können als Ingenieurbauwerke (momentan noch nicht modelliert) abgebildet werden. DB-Regelwerk Darstellung einer Doppellinie im sicherungstechnischen Lageplan
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante()
 * @model extendedMetaData="name='CBahnsteig_Kante' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Kante extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bahnsteig Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bahnsteig Kante Allg</em>' containment reference.
	 * @see #setBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_BahnsteigKanteAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Kante_Allg'"
	 * @generated
	 */
	Bahnsteig_Kante_Allg_AttributeGroup getBahnsteigKanteAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bahnsteig Kante Allg</em>' containment reference.
	 * @see #getBahnsteigKanteAllg()
	 * @generated
	 */
	void setBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bahnsteig_Kante_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung einer Bahnsteigkante oder eines Bahnsteigzugangs zu einer Bahnsteiganlage. DB-Regelwerk Zusammenhang wird aus der Darstellung im sicherungstechnischen Lageplan ersichtlich
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Anlage</em>' reference.
	 * @see #isSetIDBahnsteigAnlage()
	 * @see #unsetIDBahnsteigAnlage()
	 * @see #setIDBahnsteigAnlage(Bahnsteig_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_IDBahnsteigAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Anlage'"
	 * @generated
	 */
	Bahnsteig_Anlage getIDBahnsteigAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Anlage</em>' reference.
	 * @see #isSetIDBahnsteigAnlage()
	 * @see #unsetIDBahnsteigAnlage()
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 */
	void setIDBahnsteigAnlage(Bahnsteig_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBahnsteigAnlage()
	 * @see #getIDBahnsteigAnlage()
	 * @see #setIDBahnsteigAnlage(Bahnsteig_Anlage)
	 * @generated
	 */
	void unsetIDBahnsteigAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bahnsteig Anlage</em>' reference is set.
	 * @see #unsetIDBahnsteigAnlage()
	 * @see #getIDBahnsteigAnlage()
	 * @see #setIDBahnsteigAnlage(Bahnsteig_Anlage)
	 * @generated
	 */
	boolean isSetIDBahnsteigAnlage();

} // Bahnsteig_Kante
