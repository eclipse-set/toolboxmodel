/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import java.math.BigDecimal;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr Zuschlag Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Zuschlag_TypeClass()
 * @model extendedMetaData="name='TCZL_Fstr_Zuschlag' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr_Zuschlag_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(BigDecimal)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Zuschlag_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Zuschlag_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	BigDecimal getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(BigDecimal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(BigDecimal)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(BigDecimal)
	 * @generated
	 */
	boolean isSetWert();

} // ZL_Fstr_Zuschlag_TypeClass
