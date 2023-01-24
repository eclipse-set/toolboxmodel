/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fachdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Fachdaten_AttributeGroup#getAusgabeFachdaten <em>Ausgabe Fachdaten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getFachdaten_AttributeGroup()
 * @model extendedMetaData="name='CFachdaten' kind='elementOnly'"
 * @generated
 */
public interface Fachdaten_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ausgabe Fachdaten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung der konkreten Lieferung von LST-Fachdaten.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausgabe Fachdaten</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getFachdaten_AttributeGroup_AusgabeFachdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausgabe_Fachdaten'"
	 * @generated
	 */
	EList<Ausgabe_Fachdaten> getAusgabeFachdaten();

} // Fachdaten_AttributeGroup
