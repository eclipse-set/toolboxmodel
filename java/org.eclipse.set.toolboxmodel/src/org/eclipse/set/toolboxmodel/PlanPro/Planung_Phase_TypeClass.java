/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung Phase Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Phase_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanung_Phase_TypeClass()
 * @model extendedMetaData="name='TCPlanung_Phase' kind='elementOnly'"
 * @generated
 */
public interface Planung_Phase_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMPlanungPhase)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanung_Phase_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.PlanPro.ENUMPlanungPhaseObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMPlanungPhase getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Phase_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMPlanungPhase value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Phase_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMPlanungPhase)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Phase_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMPlanungPhase)
	 * @generated
	 */
	boolean isSetWert();

} // Planung_Phase_TypeClass
