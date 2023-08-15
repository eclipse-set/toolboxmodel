/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Block;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.toolboxmodel.BasisTypen.ENUMAnwendungssystem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zugbeeinflussung Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getZugbeeinflussung_Art_TypeClass()
 * @model extendedMetaData="name='TCZugbeeinflussung_Art' kind='elementOnly'"
 * @generated
 */
public interface Zugbeeinflussung_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMAnwendungssystem)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getZugbeeinflussung_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.BasisTypen.Anwendungssystem_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMAnwendungssystem getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMAnwendungssystem value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAnwendungssystem)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Zugbeeinflussung_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMAnwendungssystem)
	 * @generated
	 */
	boolean isSetWert();

} // Zugbeeinflussung_Art_TypeClass
