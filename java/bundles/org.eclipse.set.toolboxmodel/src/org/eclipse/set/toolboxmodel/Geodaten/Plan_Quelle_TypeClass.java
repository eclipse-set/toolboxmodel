/**
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Quelle Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Plan_Quelle_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getPlan_Quelle_TypeClass()
 * @model extendedMetaData="name='TCPlan_Quelle' kind='elementOnly'"
 * @generated
 */
public interface Plan_Quelle_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMPlanQuelle)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getPlan_Quelle_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Geodaten.ENUMPlanQuelleObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMPlanQuelle getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Plan_Quelle_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMPlanQuelle value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Plan_Quelle_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMPlanQuelle)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Plan_Quelle_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMPlanQuelle)
	 * @generated
	 */
	boolean isSetWert();

} // Plan_Quelle_TypeClass
