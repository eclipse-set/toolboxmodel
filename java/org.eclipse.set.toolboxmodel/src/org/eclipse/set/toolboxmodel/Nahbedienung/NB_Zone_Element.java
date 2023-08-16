/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Nahbedienung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung der ESTW-Elemente (Signale, Weichen, Gleissperren, Schlüsselsperren) zur NB_Zone, in der sie sich befinden. Für diese Elemente sind in Abhängigkeit der vorgesehenen NB Art Eigenschaften zur Stellbarkeit und Rückgabevoraussetzung festzulegen. DB-Regelwerk Die Angaben finden sich in der Nahbedienungstabelle, Spalten 5, 8 und 9.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getNBZoneElementAllg <em>NB Zone Element Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_Element()
 * @model extendedMetaData="name='CNB_Zone_Element' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDNB Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des Elementes, welches innerhalb der NB Zone angeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Element</em>' reference.
	 * @see #isSetIDNBElement()
	 * @see #unsetIDNBElement()
	 * @see #setIDNBElement(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_IDNBElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Element'"
	 * @generated
	 */
	Basis_Objekt getIDNBElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Element</em>' reference.
	 * @see #isSetIDNBElement()
	 * @see #unsetIDNBElement()
	 * @see #getIDNBElement()
	 * @generated
	 */
	void setIDNBElement(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDNBElement()
	 * @see #getIDNBElement()
	 * @see #setIDNBElement(Basis_Objekt)
	 * @generated
	 */
	void unsetIDNBElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBElement <em>IDNB Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDNB Element</em>' reference is set.
	 * @see #unsetIDNBElement()
	 * @see #getIDNBElement()
	 * @see #setIDNBElement(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDNBElement();

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die NB_Zone, zu der das NB_Zone_Element gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' reference.
	 * @see #isSetIDNBZone()
	 * @see #unsetIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_IDNBZone()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	NB_Zone getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Zone</em>' reference.
	 * @see #isSetIDNBZone()
	 * @see #unsetIDNBZone()
	 * @see #getIDNBZone()
	 * @generated
	 */
	void setIDNBZone(NB_Zone value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDNBZone()
	 * @see #getIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @generated
	 */
	void unsetIDNBZone();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getIDNBZone <em>IDNB Zone</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDNB Zone</em>' reference is set.
	 * @see #unsetIDNBZone()
	 * @see #getIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @generated
	 */
	boolean isSetIDNBZone();

	/**
	 * Returns the value of the '<em><b>NB Zone Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Zone Element Allg</em>' containment reference.
	 * @see #setNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_NBZoneElementAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Element_Allg'"
	 * @generated
	 */
	NB_Zone_Element_Allg_AttributeGroup getNBZoneElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone_Element#getNBZoneElementAllg <em>NB Zone Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Zone Element Allg</em>' containment reference.
	 * @see #getNBZoneElementAllg()
	 * @generated
	 */
	void setNBZoneElementAllg(NB_Zone_Element_Allg_AttributeGroup value);

} // NB_Zone_Element
