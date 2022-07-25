/**
 */
package org.eclipse.set.toolboxmodel.Gleis;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lichtraumprofil Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Gleis.Lichtraumprofil_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Gleis.GleisPackage#getLichtraumprofil_TypeClass()
 * @model extendedMetaData="name='TCLichtraumprofil' kind='elementOnly'"
 * @generated
 */
public interface Lichtraumprofil_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMLichtraumprofil)
	 * @see org.eclipse.set.toolboxmodel.Gleis.GleisPackage#getLichtraumprofil_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Gleis.ENUMLichtraumprofilObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMLichtraumprofil getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Gleis.Lichtraumprofil_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMLichtraumprofil value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Gleis.Lichtraumprofil_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMLichtraumprofil)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Gleis.Lichtraumprofil_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMLichtraumprofil)
	 * @generated
	 */
	boolean isSetWert();

} // Lichtraumprofil_TypeClass
