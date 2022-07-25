/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technik Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Art_TypeClass()
 * @model extendedMetaData="name='TCTechnik_Art' kind='elementOnly'"
 * @generated
 */
public interface Technik_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMTechnikArt)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getTechnik_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Ansteuerung_Element.ENUMTechnikArtObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMTechnikArt getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMTechnikArt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMTechnikArt)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Technik_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMTechnikArt)
	 * @generated
	 */
	boolean isSetWert();

} // Technik_Art_TypeClass
