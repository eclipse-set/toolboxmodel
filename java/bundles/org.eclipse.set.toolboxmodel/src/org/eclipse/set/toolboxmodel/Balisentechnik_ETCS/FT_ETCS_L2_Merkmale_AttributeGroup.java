/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT ETCS L2 Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getFTETCSL2Typ <em>FTETCSL2 Typ</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_ETCS_L2_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_ETCS_L2_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FTETCSL2 Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des ETCS-Fachtelegramms (Level 2), der dessen (Überwachungs-)Funktion bestimmt. Die zulässigen Werte werden über eine separate Liste vorgegeben, die bei der Werkzeugentwicklung zu berücksichtigen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTETCSL2 Typ</em>' containment reference.
	 * @see #setFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup_FTETCSL2Typ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FT_ETCS_L2_Typ'"
	 * @generated
	 */
	FT_ETCS_L2_Typ_TypeClass getFTETCSL2Typ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getFTETCSL2Typ <em>FTETCSL2 Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTETCSL2 Typ</em>' containment reference.
	 * @see #getFTETCSL2Typ()
	 * @generated
	 */
	void setFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass value);

} // FT_ETCS_L2_Merkmale_AttributeGroup
