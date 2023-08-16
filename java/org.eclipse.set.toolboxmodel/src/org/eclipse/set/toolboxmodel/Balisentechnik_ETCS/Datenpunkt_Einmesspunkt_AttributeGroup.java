/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenpunkt Einmesspunkt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getAbstandEinmesspunkt <em>Abstand Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getIDEinmesspunkt <em>ID Einmesspunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Einmesspunkt_AttributeGroup()
 * @model extendedMetaData="name='CDatenpunkt_Einmesspunkt' kind='elementOnly'"
 * @generated
 */
public interface Datenpunkt_Einmesspunkt_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Einmesspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll-Abstand zum unter ID_Einmesspunkt angegebenen Referenzpunkt für die Montage. Das Attribut darf nur in den XML-Dateien für die Balisen-Programmiergeräte gefüllt sein (Ersatz für die topologische Berechnung des Abstands). Die Umsetzung der Richtungsinformationen in den Planunterlagen muss entsprechend des Anwendungssystems festgelegt und im Werkzeug implementiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Einmesspunkt</em>' containment reference.
	 * @see #setAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Einmesspunkt_AttributeGroup_AbstandEinmesspunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstand_Einmesspunkt'"
	 * @generated
	 */
	Abstand_Einmesspunkt_TypeClass getAbstandEinmesspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getAbstandEinmesspunkt <em>Abstand Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Einmesspunkt</em>' containment reference.
	 * @see #getAbstandEinmesspunkt()
	 * @generated
	 */
	void setAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Einmesspunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Referenzpunkt für die Montage. ETCS L2: Vorläufig wird dieser Verweis nicht verwendet und in der ETCS-Datenpunkttabelle der funktionale Bezugspunkt als Einmesspunkt angegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Einmesspunkt</em>' reference.
	 * @see #isSetIDEinmesspunkt()
	 * @see #unsetIDEinmesspunkt()
	 * @see #setIDEinmesspunkt(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Einmesspunkt_AttributeGroup_IDEinmesspunkt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Einmesspunkt'"
	 * @generated
	 */
	Markanter_Punkt getIDEinmesspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Einmesspunkt</em>' reference.
	 * @see #isSetIDEinmesspunkt()
	 * @see #unsetIDEinmesspunkt()
	 * @see #getIDEinmesspunkt()
	 * @generated
	 */
	void setIDEinmesspunkt(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDEinmesspunkt()
	 * @see #getIDEinmesspunkt()
	 * @see #setIDEinmesspunkt(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDEinmesspunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Einmesspunkt</em>' reference is set.
	 * @see #unsetIDEinmesspunkt()
	 * @see #getIDEinmesspunkt()
	 * @see #setIDEinmesspunkt(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDEinmesspunkt();

} // Datenpunkt_Einmesspunkt_AttributeGroup
