/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup#getBezeichnungLEUAnlage <em>Bezeichnung LEU Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Anlage_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface LEU_Anlage_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung LEU Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der LEU-Anlage. Im Regelfall ist die Bezeichnung des Bezugspunkts zu übernehmen (Planungsunterstützung). Sofern mehrere LEU-Anlagen in einem LEU-Schaltkasten vorhanden sind, wird die Bezeichnung der LEU_Anlage aus den Bezeichnungen der Bezugspunkte zusammengesetzt (z. B. 60P5/60P6).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung LEU Anlage</em>' containment reference.
	 * @see #setBezeichnungLEUAnlage(Bezeichnung_LEU_Anlage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung_AttributeGroup_BezeichnungLEUAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_LEU_Anlage'"
	 * @generated
	 */
	Bezeichnung_LEU_Anlage_TypeClass getBezeichnungLEUAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage_Bezeichnung_AttributeGroup#getBezeichnungLEUAnlage <em>Bezeichnung LEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung LEU Anlage</em>' containment reference.
	 * @see #getBezeichnungLEUAnlage()
	 * @generated
	 */
	void setBezeichnungLEUAnlage(Bezeichnung_LEU_Anlage_TypeClass value);

} // LEU_Anlage_Bezeichnung_AttributeGroup
