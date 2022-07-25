/**
 */
package org.eclipse.set.toolboxmodel.Ortung;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Komponente Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getFMA_Komponente_Art_TypeClass()
 * @model extendedMetaData="name='TCFMA_Komponente_Art' kind='elementOnly'"
 * @generated
 */
public interface FMA_Komponente_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMFMAKomponenteArt)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getFMA_Komponente_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Ortung.ENUMFMAKomponenteArtObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMFMAKomponenteArt getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMFMAKomponenteArt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMFMAKomponenteArt)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMFMAKomponenteArt)
	 * @generated
	 */
	boolean isSetWert();

} // FMA_Komponente_Art_TypeClass
