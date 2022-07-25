/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Akustikdauer Voranz Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getAkustikdauer_Voranz_TypeClass()
 * @model extendedMetaData="name='TCAkustikdauer_Voranz' kind='elementOnly'"
 * @generated
 */
public interface Akustikdauer_Voranz_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMAkustikSonst)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getAkustikdauer_Voranz_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ENUMAkustikSonstObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMAkustikSonst getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMAkustikSonst value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAkustikSonst)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Akustikdauer_Voranz_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAkustikSonst)
	 * @generated
	 */
	boolean isSetWert();

} // Akustikdauer_Voranz_TypeClass
