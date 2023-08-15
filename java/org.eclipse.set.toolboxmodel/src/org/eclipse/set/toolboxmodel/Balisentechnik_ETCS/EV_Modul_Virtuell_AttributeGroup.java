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

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV Modul Virtuell Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup#getIDQuellelement <em>ID Quellelement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Virtuell_AttributeGroup()
 * @model extendedMetaData="name='CEV_Modul_Virtuell' kind='elementOnly'"
 * @generated
 */
public interface EV_Modul_Virtuell_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Quellelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das bestehende Element (z. B. Aussenelementansteuerung, BUE_Anlage, EV_Modul, ESTW_Zentraleinheit, PZB_Element), von dem der eigentliche Energie-Abgriff erfolgt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Quellelement</em>' reference.
	 * @see #isSetIDQuellelement()
	 * @see #unsetIDQuellelement()
	 * @see #setIDQuellelement(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Virtuell_AttributeGroup_IDQuellelement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Quellelement'"
	 * @generated
	 */
	Basis_Objekt getIDQuellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup#getIDQuellelement <em>ID Quellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Quellelement</em>' reference.
	 * @see #isSetIDQuellelement()
	 * @see #unsetIDQuellelement()
	 * @see #getIDQuellelement()
	 * @generated
	 */
	void setIDQuellelement(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup#getIDQuellelement <em>ID Quellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDQuellelement()
	 * @see #getIDQuellelement()
	 * @see #setIDQuellelement(Basis_Objekt)
	 * @generated
	 */
	void unsetIDQuellelement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Virtuell_AttributeGroup#getIDQuellelement <em>ID Quellelement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Quellelement</em>' reference is set.
	 * @see #unsetIDQuellelement()
	 * @see #getIDQuellelement()
	 * @see #setIDQuellelement(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDQuellelement();

} // EV_Modul_Virtuell_AttributeGroup
