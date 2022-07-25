/**
 */
package org.eclipse.set.toolboxmodel.Gleis;

import java.util.List;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.toolboxmodel.BasisTypen.ENUMFahrstrom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fahrstrom Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Gleis.Fahrstrom_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Gleis.GleisPackage#getFahrstrom_TypeClass()
 * @model extendedMetaData="name='TCFahrstrom' kind='elementOnly'"
 * @generated
 */
public interface Fahrstrom_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(List)
	 * @see org.eclipse.set.toolboxmodel.Gleis.GleisPackage#getFahrstrom_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.BasisTypen.Fahrstrom_Type" required="true" many="false"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	List<ENUMFahrstrom> getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Gleis.Fahrstrom_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(List<ENUMFahrstrom> value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Gleis.Fahrstrom_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(List)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Gleis.Fahrstrom_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(List)
	 * @generated
	 */
	boolean isSetWert();

} // Fahrstrom_TypeClass
