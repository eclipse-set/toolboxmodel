/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import java.math.BigInteger;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DWeg VType Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getDWeg_V_TypeClass()
 * @model extendedMetaData="name='TCDWeg_V' kind='elementOnly'"
 * @generated
 */
public interface DWeg_V_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(BigInteger)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getDWeg_V_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	BigInteger getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(BigInteger)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(BigInteger)
	 * @generated
	 */
	boolean isSetWert();

} // DWeg_V_TypeClass
