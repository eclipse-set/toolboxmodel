/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygonzug Betrachtungsbereich Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPolygonzug_Betrachtungsbereich_TypeClass()
 * @model extendedMetaData="name='TCPolygonzug_Betrachtungsbereich' kind='elementOnly'"
 * @generated
 */
public interface Polygonzug_Betrachtungsbereich_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #setWert(String)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPolygonzug_Betrachtungsbereich_TypeClass_Wert()
	 * @model dataType="org.eclipse.set.toolboxmodel.PlanPro.Polygonzug_Betrachtungsbereich_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Polygonzug_Betrachtungsbereich_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

} // Polygonzug_Betrachtungsbereich_TypeClass
