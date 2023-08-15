/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Nahbedienung;

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
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Rueckgabevoraussetzung_TypeClass()
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
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Rueckgabevoraussetzung_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Nahbedienung.ENUMNBRueckgabevoraussetzungObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMNBRueckgabevoraussetzung getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMNBRueckgabevoraussetzung)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass#getWert <em>Wert</em>}' attribute is set.
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
