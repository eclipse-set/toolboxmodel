/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technik Standort Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bezeichnung des Technikstandorts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup#getBezeichnungTSO <em>Bezeichnung TSO</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CTechnik_Standort_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Technik_Standort_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung TSO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Technik-Standorts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung TSO</em>' containment reference.
	 * @see #setBezeichnungTSO(Bezeichnung_TSO_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Standort_Bezeichnung_AttributeGroup_BezeichnungTSO()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_TSO'"
	 * @generated
	 */
	Bezeichnung_TSO_TypeClass getBezeichnungTSO();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Standort_Bezeichnung_AttributeGroup#getBezeichnungTSO <em>Bezeichnung TSO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung TSO</em>' containment reference.
	 * @see #getBezeichnungTSO()
	 * @generated
	 */
	void setBezeichnungTSO(Bezeichnung_TSO_TypeClass value);

} // Technik_Standort_Bezeichnung_AttributeGroup
