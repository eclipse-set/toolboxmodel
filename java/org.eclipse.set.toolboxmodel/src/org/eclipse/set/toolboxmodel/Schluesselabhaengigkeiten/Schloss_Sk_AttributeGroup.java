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
 * A representation of the model object '<em><b>Schloss Sk Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getHauptschloss <em>Hauptschloss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sk_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Sk' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Sk_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Hauptschloss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schloss ist das Hauptschloss der Schlosskombination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hauptschloss</em>' containment reference.
	 * @see #setHauptschloss(Hauptschloss_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sk_AttributeGroup_Hauptschloss()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hauptschloss'"
	 * @generated
	 */
	Hauptschloss_TypeClass getHauptschloss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getHauptschloss <em>Hauptschloss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauptschloss</em>' containment reference.
	 * @see #getHauptschloss()
	 * @generated
	 */
	void setHauptschloss(Hauptschloss_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Schlosskombination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Schlosskombination, zu der das Schloss gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schlosskombination</em>' reference.
	 * @see #isSetIDSchlosskombination()
	 * @see #unsetIDSchlosskombination()
	 * @see #setIDSchlosskombination(Schlosskombination)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sk_AttributeGroup_IDSchlosskombination()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schlosskombination'"
	 * @generated
	 */
	Schlosskombination getIDSchlosskombination();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schlosskombination</em>' reference.
	 * @see #isSetIDSchlosskombination()
	 * @see #unsetIDSchlosskombination()
	 * @see #getIDSchlosskombination()
	 * @generated
	 */
	void setIDSchlosskombination(Schlosskombination value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSchlosskombination()
	 * @see #getIDSchlosskombination()
	 * @see #setIDSchlosskombination(Schlosskombination)
	 * @generated
	 */
	void unsetIDSchlosskombination();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup#getIDSchlosskombination <em>ID Schlosskombination</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Schlosskombination</em>' reference is set.
	 * @see #unsetIDSchlosskombination()
	 * @see #getIDSchlosskombination()
	 * @see #setIDSchlosskombination(Schlosskombination)
	 * @generated
	 */
	boolean isSetIDSchlosskombination();

} // Schloss_Sk_AttributeGroup
