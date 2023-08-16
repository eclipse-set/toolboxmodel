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

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESG Individuelle Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndErlaeuterung <em>ESG Ind Erlaeuterung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameter <em>ESG Ind Parameter</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameterwert <em>ESG Ind Parameterwert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getIDAnhangUiG <em>ID Anhang Ui G</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CESG_Individuelle_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface ESG_Individuelle_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ESG Ind Erlaeuterung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erläuterung des unter ESG_Ind_Parameterwert modifizierten Parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Ind Erlaeuterung</em>' containment reference.
	 * @see #setESGIndErlaeuterung(ESG_Ind_Erlaeuterung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_ESGIndErlaeuterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESG_Ind_Erlaeuterung'"
	 * @generated
	 */
	ESG_Ind_Erlaeuterung_TypeClass getESGIndErlaeuterung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndErlaeuterung <em>ESG Ind Erlaeuterung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESG Ind Erlaeuterung</em>' containment reference.
	 * @see #getESGIndErlaeuterung()
	 * @generated
	 */
	void setESGIndErlaeuterung(ESG_Ind_Erlaeuterung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ESG Ind Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des für die LfdNr_in_Telegr_Spec vorgesehenen variablen Parameters, z. B. L_TRACKCOND für lfd. Nr. 70.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Ind Parameter</em>' containment reference.
	 * @see #setESGIndParameter(ESG_Ind_Parameter_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_ESGIndParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESG_Ind_Parameter'"
	 * @generated
	 */
	ESG_Ind_Parameter_TypeClass getESGIndParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameter <em>ESG Ind Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESG Ind Parameter</em>' containment reference.
	 * @see #getESGIndParameter()
	 * @generated
	 */
	void setESGIndParameter(ESG_Ind_Parameter_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ESG Ind Parameterwert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wert des unter ESG_Ind_Parameter definierten Parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Ind Parameterwert</em>' containment reference.
	 * @see #setESGIndParameterwert(ESG_Ind_Parameterwert_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_ESGIndParameterwert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESG_Ind_Parameterwert'"
	 * @generated
	 */
	ESG_Ind_Parameterwert_TypeClass getESGIndParameterwert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameterwert <em>ESG Ind Parameterwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESG Ind Parameterwert</em>' containment reference.
	 * @see #getESGIndParameterwert()
	 * @generated
	 */
	void setESGIndParameterwert(ESG_Ind_Parameterwert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Ui G</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die UiG zur individuellen Programmierung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Ui G</em>' reference.
	 * @see #isSetIDAnhangUiG()
	 * @see #unsetIDAnhangUiG()
	 * @see #setIDAnhangUiG(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_IDAnhangUiG()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_UiG'"
	 * @generated
	 */
	Anhang getIDAnhangUiG();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getIDAnhangUiG <em>ID Anhang Ui G</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Ui G</em>' reference.
	 * @see #isSetIDAnhangUiG()
	 * @see #unsetIDAnhangUiG()
	 * @see #getIDAnhangUiG()
	 * @generated
	 */
	void setIDAnhangUiG(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getIDAnhangUiG <em>ID Anhang Ui G</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangUiG()
	 * @see #getIDAnhangUiG()
	 * @see #setIDAnhangUiG(Anhang)
	 * @generated
	 */
	void unsetIDAnhangUiG();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getIDAnhangUiG <em>ID Anhang Ui G</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Ui G</em>' reference is set.
	 * @see #unsetIDAnhangUiG()
	 * @see #getIDAnhangUiG()
	 * @see #setIDAnhangUiG(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangUiG();

} // ESG_Individuelle_Merkmale_AttributeGroup
