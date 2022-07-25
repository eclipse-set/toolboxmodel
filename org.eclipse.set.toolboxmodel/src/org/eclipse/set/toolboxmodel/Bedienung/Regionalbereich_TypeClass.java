/**
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.toolboxmodel.BasisTypen.ENUMRegionalbereich;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regionalbereich Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Regionalbereich_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getRegionalbereich_TypeClass()
 * @model extendedMetaData="name='TCRegionalbereich' kind='elementOnly'"
 * @generated
 */
public interface Regionalbereich_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMRegionalbereich)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getRegionalbereich_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.BasisTypen.Regionalbereich_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMRegionalbereich getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Regionalbereich_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMRegionalbereich value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Regionalbereich_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMRegionalbereich)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Regionalbereich_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMRegionalbereich)
	 * @generated
	 */
	boolean isSetWert();

} // Regionalbereich_TypeClass
