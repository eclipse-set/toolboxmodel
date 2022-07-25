/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Koordinatensystem PB Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Koordinatensystem_PB_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getKoordinatensystem_PB_TypeClass()
 * @model extendedMetaData="name='TCKoordinatensystem_PB' kind='elementOnly'"
 * @generated
 */
public interface Koordinatensystem_PB_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMKoordinatensystem)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getKoordinatensystem_PB_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.PlanPro.ENUMKoordinatensystemObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMKoordinatensystem getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Koordinatensystem_PB_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMKoordinatensystem value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Koordinatensystem_PB_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMKoordinatensystem)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Koordinatensystem_PB_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMKoordinatensystem)
	 * @generated
	 */
	boolean isSetWert();

} // Koordinatensystem_PB_TypeClass
