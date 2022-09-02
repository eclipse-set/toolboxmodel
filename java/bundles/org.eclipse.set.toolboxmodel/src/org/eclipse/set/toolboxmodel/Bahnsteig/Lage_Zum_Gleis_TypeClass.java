/**
 */
package org.eclipse.set.toolboxmodel.Bahnsteig;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.toolboxmodel.BasisTypen.ENUMLinksRechts;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lage Zum Gleis Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.Lage_Zum_Gleis_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getLage_Zum_Gleis_TypeClass()
 * @model extendedMetaData="name='TCLage_Zum_Gleis' kind='elementOnly'"
 * @generated
 */
public interface Lage_Zum_Gleis_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMLinksRechts)
	 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getLage_Zum_Gleis_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Bahnsteig.Lage_Zum_Gleis_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMLinksRechts getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Lage_Zum_Gleis_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMLinksRechts value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Lage_Zum_Gleis_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMLinksRechts)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Lage_Zum_Gleis_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMLinksRechts)
	 * @generated
	 */
	boolean isSetWert();

} // Lage_Zum_Gleis_TypeClass
