/**
 */
package org.eclipse.set.toolboxmodel.Nahbedienbereich;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Rueckgabevoraussetzung Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienbereich.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Nahbedienbereich.NahbedienbereichPackage#getNB_Rueckgabevoraussetzung_TypeClass()
 * @model extendedMetaData="name='TCNB_Rueckgabevoraussetzung' kind='elementOnly'"
 * @generated
 */
public interface NB_Rueckgabevoraussetzung_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMNBRueckgabevoraussetzung)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienbereich.NahbedienbereichPackage#getNB_Rueckgabevoraussetzung_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Nahbedienbereich.ENUMNBRueckgabevoraussetzungObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMNBRueckgabevoraussetzung getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienbereich.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMNBRueckgabevoraussetzung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienbereich.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMNBRueckgabevoraussetzung)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienbereich.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMNBRueckgabevoraussetzung)
	 * @generated
	 */
	boolean isSetWert();

} // NB_Rueckgabevoraussetzung_TypeClass
