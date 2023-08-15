/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Ssp_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Ssp' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Ssp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Schluesselsperre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Schlüsselsperre, in der sich das Schloss befindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schluesselsperre</em>' reference.
	 * @see #isSetIDSchluesselsperre()
	 * @see #unsetIDSchluesselsperre()
	 * @see #setIDSchluesselsperre(Schluesselsperre)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Ssp_AttributeGroup_IDSchluesselsperre()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schluesselsperre'"
	 * @generated
	 */
	Schluesselsperre getIDSchluesselsperre();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schluesselsperre</em>' reference.
	 * @see #isSetIDSchluesselsperre()
	 * @see #unsetIDSchluesselsperre()
	 * @see #getIDSchluesselsperre()
	 * @generated
	 */
	void setIDSchluesselsperre(Schluesselsperre value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSchluesselsperre()
	 * @see #getIDSchluesselsperre()
	 * @see #setIDSchluesselsperre(Schluesselsperre)
	 * @generated
	 */
	void unsetIDSchluesselsperre();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Schluesselsperre</em>' reference is set.
	 * @see #unsetIDSchluesselsperre()
	 * @see #getIDSchluesselsperre()
	 * @see #setIDSchluesselsperre(Schluesselsperre)
	 * @generated
	 */
	boolean isSetIDSchluesselsperre();

} // Schloss_Ssp_AttributeGroup
