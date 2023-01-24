/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Nahbedienung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Bedienfunktionen zur Bedieneinrichtung einer oder mehrerer NB_Zonen, über die Fahrdienstleiter und örtlichen Bediener miteinander kommunizieren. Falls sich bedienbare Elemente innerhalb der NB_Zone befinden, sind diese durch eine entsprechende Bedieneinrichtung (um)stellbar, sofern eine (Um-)Stellbarkeit vorgesehen wurde. Der Umfang hängt von der gewählten NB Art ab. Weiterhin sind in der Bedieneinrichtung Elemente für die Kommunikation zwischen Fahrdienstleiter und Bediener untergebracht. In diesem Objekt wird die Logik der Bedieneinrichtung abgebildet. Falls eine Bedieneinrichtung Elemente aus mindestens zwei verschiedenen NB_Zonen enthält, ist eine Zuordnung der Bedieneinrichtung zu den betreffenden NB_Zonen erforderlich. Der Verweis auf Bedien Anzeige Element führt zur Zuordnung der physischen Unterbringung. DB-Regelwerk Für die Planung exisitert bei der DB AG kein Regelwerk. Die Angaben finden sich meist im Erläuterungsbericht zum PT1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element()
 * @model extendedMetaData="name='CNB_Bedien_Anzeige_Element' kind='elementOnly'"
 * @generated
 */
public interface NB_Bedien_Anzeige_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Bedien Anzeige Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bedien Anzeige Element, welches die Zuordnung zur Bedien Einrichtung Oertlich und damit zur physischen Unterbringung der Tasten herstellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Anzeige Element</em>' reference.
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Anzeige_Element'"
	 * @generated
	 */
	Bedien_Anzeige_Element getIDBedienAnzeigeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Anzeige Element</em>' reference.
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 */
	void setIDBedienAnzeigeElement(Bedien_Anzeige_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @generated
	 */
	void unsetIDBedienAnzeigeElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Anzeige Element</em>' reference is set.
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @generated
	 */
	boolean isSetIDBedienAnzeigeElement();

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die NB_Zone, der das geplante Bedien_Anzeige_Element zugeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' reference.
	 * @see #isSetIDNBZone()
	 * @see #unsetIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element_IDNBZone()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	NB_Zone getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDNBZone()
	 * @see #getIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @generated
	 */
	void unsetIDNBZone();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getIDNBZone <em>IDNB Zone</em>}' reference is set.
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
	 * Returns the value of the '<em><b>NB Bedien Anzeige Funktionen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Bedien Anzeige Funktionen</em>' containment reference.
	 * @see #setNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Bedien_Anzeige_Funktionen'"
	 * @generated
	 */
	NB_Bedien_Anzeige_Funktionen_AttributeGroup getNBBedienAnzeigeFunktionen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Bedien_Anzeige_Element#getNBBedienAnzeigeFunktionen <em>NB Bedien Anzeige Funktionen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Bedien Anzeige Funktionen</em>' containment reference.
	 * @see #getNBBedienAnzeigeFunktionen()
	 * @generated
	 */
	void setNBBedienAnzeigeFunktionen(NB_Bedien_Anzeige_Funktionen_AttributeGroup value);

} // NB_Bedien_Anzeige_Element
