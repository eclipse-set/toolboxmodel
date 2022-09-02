/**
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.toolboxmodel.BasisTypen.ENUMWirkrichtung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wirkrichtung Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Wirkrichtung_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getWirkrichtung_TypeClass()
 * @model extendedMetaData="name='TCWirkrichtung' kind='elementOnly'"
 * @generated
 */
public interface Wirkrichtung_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMWirkrichtung)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getWirkrichtung_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.BasisTypen.Wirkrichtung_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMWirkrichtung getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Wirkrichtung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMWirkrichtung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Wirkrichtung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMWirkrichtung)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Wirkrichtung_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMWirkrichtung)
	 * @generated
	 */
	boolean isSetWert();

} // Wirkrichtung_TypeClass
