/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Laufende Nummer Ausgabe Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Laufende_Nummer_Ausgabe_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getLaufende_Nummer_Ausgabe_TypeClass()
 * @model extendedMetaData="name='TCLaufende_Nummer_Ausgabe' kind='elementOnly'"
 * @generated
 */
public interface Laufende_Nummer_Ausgabe_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getLaufende_Nummer_Ausgabe_TypeClass_Wert()
	 * @model dataType="org.eclipse.set.toolboxmodel.PlanPro.Laufende_Nummer_Ausgabe_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Laufende_Nummer_Ausgabe_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

} // Laufende_Nummer_Ausgabe_TypeClass
