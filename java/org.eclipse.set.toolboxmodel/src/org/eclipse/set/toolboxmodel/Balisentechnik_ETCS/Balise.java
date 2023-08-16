/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bauelement zur Übertragung von Telegrammen an ETCS-Fahrzeugeinrichtungen. Gesteuerte Balisen sind anhand des Verweises LEU_Modul.LEU_Modul_Ausgang.ID_Balise auf diese Balise zu erkennen. Bei Erstellung des PT 1 ESG sind neben dem Datenpunkt auch die entsprechende Anzahl von Balisen anzulegen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise#getBaliseAllg <em>Balise Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise#getIDDatenpunkt <em>ID Datenpunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise()
 * @model extendedMetaData="name='CBalise' kind='elementOnly'"
 * @generated
 */
public interface Balise extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Balise Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balise Allg</em>' containment reference.
	 * @see #setBaliseAllg(Balise_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_BaliseAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Balise_Allg'"
	 * @generated
	 */
	Balise_Allg_AttributeGroup getBaliseAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise#getBaliseAllg <em>Balise Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balise Allg</em>' containment reference.
	 * @see #getBaliseAllg()
	 * @generated
	 */
	void setBaliseAllg(Balise_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Datenpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Datenpunkt, zu dem die Balise gehört. Die maximale Anzahl von 16 Balisen für einen Datenpunkt ergibt sich aus der Möglichkeit duplizierter Balisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Datenpunkt</em>' reference.
	 * @see #isSetIDDatenpunkt()
	 * @see #unsetIDDatenpunkt()
	 * @see #setIDDatenpunkt(Datenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_IDDatenpunkt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Datenpunkt'"
	 * @generated
	 */
	Datenpunkt getIDDatenpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise#getIDDatenpunkt <em>ID Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Datenpunkt</em>' reference.
	 * @see #isSetIDDatenpunkt()
	 * @see #unsetIDDatenpunkt()
	 * @see #getIDDatenpunkt()
	 * @generated
	 */
	void setIDDatenpunkt(Datenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise#getIDDatenpunkt <em>ID Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDDatenpunkt()
	 * @see #getIDDatenpunkt()
	 * @see #setIDDatenpunkt(Datenpunkt)
	 * @generated
	 */
	void unsetIDDatenpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise#getIDDatenpunkt <em>ID Datenpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Datenpunkt</em>' reference is set.
	 * @see #unsetIDDatenpunkt()
	 * @see #getIDDatenpunkt()
	 * @see #setIDDatenpunkt(Datenpunkt)
	 * @generated
	 */
	boolean isSetIDDatenpunkt();

} // Balise
