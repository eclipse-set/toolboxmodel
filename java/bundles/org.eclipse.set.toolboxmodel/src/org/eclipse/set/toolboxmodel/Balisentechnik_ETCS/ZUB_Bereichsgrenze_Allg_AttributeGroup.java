/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDElementGrenze <em>ID Element Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getSystemVorGrenze <em>System Vor Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getSystemVorGrenzeBesonders <em>System Vor Grenze Besonders</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Element Grenze</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Grenzsignal bzw. den Grenzdatenpunkt. Der Ort der Bereichsgrenze kann sich vom Ort des Grenzelements unterscheiden.
	 * Bereichsgrenze nach L2: Verweis auf das Grenzsignal (Einstiegssignal für L2) bzw. den Grenzdatenpunkt (nur bei Einstieg ohne bekanntes rückwärtiges Signal)
	 * Bereichsgrenze nach ESG: Verweis auf den Transitionsdatenpunkt (Einstieg für ESG)
	 * Bereichsgrenze nach PZB/LZB: Verweis auf einen Transitionsdatenpunkt (ESG) bzw. auf das Ausstiegssignal (L2)
	 * Bereichsgrenze RBC-Wechsel: Verweis auf das Grenzsignal, an dem die Zuständigkeit des RBC wechselt
	 * Bereichsgrenze nach GNT: Verweis auf den ersten GNT-Datenpunkt (B1 oder B3)
	 * Bereichsgrenze nach OHNE: Verweis auf das Grenzsignal (bei Übergang aus PZB) bzw. den Grenzdatenpunkt (bei Übergang aus ESG oder L2)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Element Grenze</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_IDElementGrenze()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_Element_Grenze'"
	 * @generated
	 */
	EList<Basis_Objekt> getIDElementGrenze();

	/**
	 * Returns the value of the '<em><b>IDRBC Vor Grenze</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei L2: Verweis auf das vor der Bereichsgrenze zuständige RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC Vor Grenze</em>' reference.
	 * @see #isSetIDRBCVorGrenze()
	 * @see #unsetIDRBCVorGrenze()
	 * @see #setIDRBCVorGrenze(RBC)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_IDRBCVorGrenze()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_RBC_Vor_Grenze'"
	 * @generated
	 */
	RBC getIDRBCVorGrenze();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDRBC Vor Grenze</em>' reference.
	 * @see #isSetIDRBCVorGrenze()
	 * @see #unsetIDRBCVorGrenze()
	 * @see #getIDRBCVorGrenze()
	 * @generated
	 */
	void setIDRBCVorGrenze(RBC value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDRBCVorGrenze()
	 * @see #getIDRBCVorGrenze()
	 * @see #setIDRBCVorGrenze(RBC)
	 * @generated
	 */
	void unsetIDRBCVorGrenze();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Allg_AttributeGroup#getIDRBCVorGrenze <em>IDRBC Vor Grenze</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDRBC Vor Grenze</em>' reference is set.
	 * @see #unsetIDRBCVorGrenze()
	 * @see #getIDRBCVorGrenze()
	 * @see #setIDRBCVorGrenze(RBC)
	 * @generated
	 */
	boolean isSetIDRBCVorGrenze();

	/**
	 * Returns the value of the '<em><b>System Vor Grenze</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.System_Vor_Grenze_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des in Bezug auf die Wirkrichtung vor der Bereichsgrenze vorhandenen Zugbeeinflussungssystems. Es können mehrere Systeme vorhanden sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Vor Grenze</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_SystemVorGrenze()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='System_Vor_Grenze'"
	 * @generated
	 */
	EList<System_Vor_Grenze_TypeClass> getSystemVorGrenze();

	/**
	 * Returns the value of the '<em><b>System Vor Grenze Besonders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.System_Vor_Grenze_Besonders_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des in Bezug auf die Wirkrichtung vor der Bereichsgrenze vorhandenen Class-B-Zugbeeinflussungssystems. Es können mehrere Systeme vorhanden sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Vor Grenze Besonders</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Allg_AttributeGroup_SystemVorGrenzeBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='System_Vor_Grenze_Besonders'"
	 * @generated
	 */
	EList<System_Vor_Grenze_Besonders_TypeClass> getSystemVorGrenzeBesonders();

} // ZUB_Bereichsgrenze_Allg_AttributeGroup
