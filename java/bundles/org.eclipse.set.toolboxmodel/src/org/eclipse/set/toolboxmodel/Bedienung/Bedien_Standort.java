/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Standort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bei DSTW: Standort, von dem die Bedienung der DSTW erfolgt. Von einem Bedienstandort können mehrere Technikstandorte bedient werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getBSOIPAdressblock <em>BSOIP Adressblock</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Standort()
 * @model extendedMetaData="name='CBedien_Standort' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Standort extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bedien_Standort_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Standort_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bedien_Standort_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bedien_Standort_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>BSOIP Adressblock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BSOIP Adressblock</em>' containment reference.
	 * @see #setBSOIPAdressblock(BSO_IP_Adressblock_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Standort_BSOIPAdressblock()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BSO_IP_Adressblock'"
	 * @generated
	 */
	BSO_IP_Adressblock_AttributeGroup getBSOIPAdressblock();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getBSOIPAdressblock <em>BSOIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BSOIP Adressblock</em>' containment reference.
	 * @see #getBSOIPAdressblock()
	 * @generated
	 */
	void setBSOIPAdressblock(BSO_IP_Adressblock_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung (Gebäude), in der der Bedien-Standort untergebracht ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Standort_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Standort#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

} // Bedien_Standort
