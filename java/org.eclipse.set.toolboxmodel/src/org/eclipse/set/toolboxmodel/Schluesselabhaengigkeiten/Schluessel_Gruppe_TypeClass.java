/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluessel Gruppe Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Gruppe_TypeClass()
 * @model extendedMetaData="name='TCSchluessel_Gruppe' kind='elementOnly'"
 * @generated
 */
public interface Schluessel_Gruppe_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMSchluesselGruppe)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Gruppe_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.ENUMSchluesselGruppeObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMSchluesselGruppe getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMSchluesselGruppe value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMSchluesselGruppe)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMSchluesselGruppe)
	 * @generated
	 */
	boolean isSetWert();

} // Schluessel_Gruppe_TypeClass
