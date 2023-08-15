/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Bezirk Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Bezirk_Anhaenge' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Bezirk_Anhaenge_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang Anbindung IB2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan zur Kabel-/Trassen-/Datenanbindung. Pläne können z. B. zur Darstellung der Kabelverbindungen vom IB 1 zum IB 2 angefügt werden. Die Unterlagen sind in den Standorten unterschiedlich oder gar nicht vorhanden und werden ggf. als Anlage der AP PT 1 beigefügt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Anbindung IB2</em>' reference.
	 * @see #isSetIDAnhangAnbindungIB2()
	 * @see #unsetIDAnhangAnbindungIB2()
	 * @see #setIDAnhangAnbindungIB2(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Anbindung_IB2'"
	 * @generated
	 */
	Anhang getIDAnhangAnbindungIB2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Anbindung IB2</em>' reference.
	 * @see #isSetIDAnhangAnbindungIB2()
	 * @see #unsetIDAnhangAnbindungIB2()
	 * @see #getIDAnhangAnbindungIB2()
	 * @generated
	 */
	void setIDAnhangAnbindungIB2(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangAnbindungIB2()
	 * @see #getIDAnhangAnbindungIB2()
	 * @see #setIDAnhangAnbindungIB2(Anhang)
	 * @generated
	 */
	void unsetIDAnhangAnbindungIB2();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Anbindung IB2</em>' reference is set.
	 * @see #unsetIDAnhangAnbindungIB2()
	 * @see #getIDAnhangAnbindungIB2()
	 * @see #setIDAnhangAnbindungIB2(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangAnbindungIB2();

	/**
	 * Returns the value of the '<em><b>ID Anhang Anbindung IB3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan zur Kabel-/Trassen-/Datenanbindung. Pläne können z. B. zur Darstellung der Kabelverbindungen vom IB 1 zum IB 3 angefügt werden. Die Unterlagen sind in den Standorten unterschiedlich oder gar nicht vorhanden und werden ggf. als Anlage der AP PT 1 beigefügt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Anbindung IB3</em>' reference.
	 * @see #isSetIDAnhangAnbindungIB3()
	 * @see #unsetIDAnhangAnbindungIB3()
	 * @see #setIDAnhangAnbindungIB3(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangAnbindungIB3()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Anbindung_IB3'"
	 * @generated
	 */
	Anhang getIDAnhangAnbindungIB3();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Anbindung IB3</em>' reference.
	 * @see #isSetIDAnhangAnbindungIB3()
	 * @see #unsetIDAnhangAnbindungIB3()
	 * @see #getIDAnhangAnbindungIB3()
	 * @generated
	 */
	void setIDAnhangAnbindungIB3(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangAnbindungIB3()
	 * @see #getIDAnhangAnbindungIB3()
	 * @see #setIDAnhangAnbindungIB3(Anhang)
	 * @generated
	 */
	void unsetIDAnhangAnbindungIB3();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Anbindung IB3</em>' reference is set.
	 * @see #unsetIDAnhangAnbindungIB3()
	 * @see #getIDAnhangAnbindungIB3()
	 * @see #setIDAnhangAnbindungIB3(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangAnbindungIB3();

	/**
	 * Returns the value of the '<em><b>ID Anhang Steuerbez Uebersicht</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesen Anhang wird die Steuerbezirksübersicht gemäß 819.0603 als PDF eingebettet. Beispiel: Media:Steuerbezirksuebersicht.pdf DB-Regelwerk 819.0603 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Steuerbez Uebersicht</em>' reference.
	 * @see #isSetIDAnhangSteuerbezUebersicht()
	 * @see #unsetIDAnhangSteuerbezUebersicht()
	 * @see #setIDAnhangSteuerbezUebersicht(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Bezirk_Anhaenge_AttributeGroup_IDAnhangSteuerbezUebersicht()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Steuerbez_Uebersicht'"
	 * @generated
	 */
	Anhang getIDAnhangSteuerbezUebersicht();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Steuerbez Uebersicht</em>' reference.
	 * @see #isSetIDAnhangSteuerbezUebersicht()
	 * @see #unsetIDAnhangSteuerbezUebersicht()
	 * @see #getIDAnhangSteuerbezUebersicht()
	 * @generated
	 */
	void setIDAnhangSteuerbezUebersicht(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangSteuerbezUebersicht()
	 * @see #getIDAnhangSteuerbezUebersicht()
	 * @see #setIDAnhangSteuerbezUebersicht(Anhang)
	 * @generated
	 */
	void unsetIDAnhangSteuerbezUebersicht();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Steuerbez Uebersicht</em>' reference is set.
	 * @see #unsetIDAnhangSteuerbezUebersicht()
	 * @see #getIDAnhangSteuerbezUebersicht()
	 * @see #setIDAnhangSteuerbezUebersicht(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangSteuerbezUebersicht();

} // Bedien_Bezirk_Anhaenge_AttributeGroup
