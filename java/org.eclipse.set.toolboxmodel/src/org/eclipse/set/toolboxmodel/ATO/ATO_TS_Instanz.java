/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.ATO;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATO TS Instanz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zentrale Komponente für einen ATO-Infrastrukturbereich, die für die gesamten ATO-relevanten Infrastrukturdaten, insbesondere Segment Profiles und deren Verteilung an die ATO-Fahrzeugkomponenten (ATO-OB), verantwortlich ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz#getATOTSInstanzAdresse <em>ATOTS Instanz Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_TS_Instanz()
 * @model extendedMetaData="name='CATO_TS_Instanz' kind='elementOnly'"
 * @generated
 */
public interface ATO_TS_Instanz extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ATOTS Instanz Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATOTS Instanz Adresse</em>' containment reference.
	 * @see #setATOTSInstanzAdresse(ATO_TS_Instanz_Adresse_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_TS_Instanz_ATOTSInstanzAdresse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ATO_TS_Instanz_Adresse'"
	 * @generated
	 */
	ATO_TS_Instanz_Adresse_AttributeGroup getATOTSInstanzAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz#getATOTSInstanzAdresse <em>ATOTS Instanz Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATOTS Instanz Adresse</em>' containment reference.
	 * @see #getATOTSInstanzAdresse()
	 * @generated
	 */
	void setATOTSInstanzAdresse(ATO_TS_Instanz_Adresse_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung, in der die ATO-TS-Instanz untergebracht ist. Über die Unterbringung wird auch die Position abgebildet. Die Angabe entfällt bei einer cloud-basierten Realisierung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_TS_Instanz_IDUnterbringung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

} // ATO_TS_Instanz
