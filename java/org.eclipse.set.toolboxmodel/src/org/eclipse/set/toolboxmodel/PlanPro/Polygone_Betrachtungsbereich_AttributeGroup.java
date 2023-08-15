/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygone Betrachtungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup#getKoordinatensystemBB <em>Koordinatensystem BB</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup#getPolygonzugBetrachtungsbereich <em>Polygonzug Betrachtungsbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPolygone_Betrachtungsbereich_AttributeGroup()
 * @model extendedMetaData="name='CPolygone_Betrachtungsbereich' kind='elementOnly'"
 * @generated
 */
public interface Polygone_Betrachtungsbereich_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Koordinatensystem BB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Koordinatensystem, in dem der Polygonzug des Betrachtungsbereichs definiert ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Koordinatensystem BB</em>' containment reference.
	 * @see #setKoordinatensystemBB(Koordinatensystem_BB_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPolygone_Betrachtungsbereich_AttributeGroup_KoordinatensystemBB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Koordinatensystem_BB'"
	 * @generated
	 */
	Koordinatensystem_BB_TypeClass getKoordinatensystemBB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Polygone_Betrachtungsbereich_AttributeGroup#getKoordinatensystemBB <em>Koordinatensystem BB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Koordinatensystem BB</em>' containment reference.
	 * @see #getKoordinatensystemBB()
	 * @generated
	 */
	void setKoordinatensystemBB(Koordinatensystem_BB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Polygonzug Betrachtungsbereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polygonzug zur Beschreibung des Betrachtungsbereichs unter Nutzung des GML-Standards.
	 * Der definierte Betrachtungsbereich gilt für alle Einzelplanungen der Planung Gruppe und dient der Ermittlung der eingeschlossenen Objekte der LST-Anlage sowie der Beschreibung des flächenhaften Bereichs.
	 * Der Betrachtungsbereich muss vom LST-Fachplaner für die Erbringung seiner beauftragten Leistungen berücksichtigt werden und kann nicht verändert werden.
	 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
	 * Bedingt durch die flächenhafte Abgrenzung können auch weitere Objekte enthalten sein, die für die Erstellung der Planung nicht relevant sind. Die Vereinigung aller Betrachtungsbereiche muss alle für die Planung relevanten Objekte außerhalb des Planungsbereichs enthalten. Der Betrachtungsbereich ist benachbart zum Planungsbereich, im besonderen Fall umschließt er diesen vollständig.
	 * Durch den Prozess der Planung können keine neuen Objekte in den Betrachtungsbereich eingebracht oder vorhandene Objekte modifiziert bzw. entfernt werden. Ist dies erforderlich, muss der Planungsbereich erweitert werden. Sofern für den Betrachtungsbereich noch keine Bestandsdaten vorhanden sind, ist ein eigenes Projekt zur Bestandsdigitalisierung durchzuführen.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * Ggf. planerspezifische Darstellungsformen (z. B. grau, gestrichelt).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygonzug Betrachtungsbereich</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPolygone_Betrachtungsbereich_AttributeGroup_PolygonzugBetrachtungsbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Polygonzug_Betrachtungsbereich'"
	 * @generated
	 */
	EList<Polygonzug_Betrachtungsbereich_TypeClass> getPolygonzugBetrachtungsbereich();

} // Polygone_Betrachtungsbereich_AttributeGroup
