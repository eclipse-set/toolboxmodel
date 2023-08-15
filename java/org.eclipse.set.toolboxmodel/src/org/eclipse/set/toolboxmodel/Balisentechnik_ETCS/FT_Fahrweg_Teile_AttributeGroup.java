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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT Fahrweg Teile Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIstBefahren <em>Ist Befahren</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teile_AttributeGroup()
 * @model extendedMetaData="name='CFT_Fahrweg_Teile' kind='elementOnly'"
 * @generated
 */
public interface FT_Fahrweg_Teile_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDFT Fahrweg Teil</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Fahrwegteil, auf den sich das Fachtelegramm bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFT Fahrweg Teil</em>' reference.
	 * @see #isSetIDFTFahrwegTeil()
	 * @see #unsetIDFTFahrwegTeil()
	 * @see #setIDFTFahrwegTeil(FT_Fahrweg_Teil)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teile_AttributeGroup_IDFTFahrwegTeil()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FT_Fahrweg_Teil'"
	 * @generated
	 */
	FT_Fahrweg_Teil getIDFTFahrwegTeil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFT Fahrweg Teil</em>' reference.
	 * @see #isSetIDFTFahrwegTeil()
	 * @see #unsetIDFTFahrwegTeil()
	 * @see #getIDFTFahrwegTeil()
	 * @generated
	 */
	void setIDFTFahrwegTeil(FT_Fahrweg_Teil value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFTFahrwegTeil()
	 * @see #getIDFTFahrwegTeil()
	 * @see #setIDFTFahrwegTeil(FT_Fahrweg_Teil)
	 * @generated
	 */
	void unsetIDFTFahrwegTeil();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIDFTFahrwegTeil <em>IDFT Fahrweg Teil</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDFT Fahrweg Teil</em>' reference is set.
	 * @see #unsetIDFTFahrwegTeil()
	 * @see #getIDFTFahrwegTeil()
	 * @see #setIDFTFahrwegTeil(FT_Fahrweg_Teil)
	 * @generated
	 */
	boolean isSetIDFTFahrwegTeil();

	/**
	 * Returns the value of the '<em><b>Ist Befahren</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Fahrwegteil befahren wird (true) oder nicht (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ist Befahren</em>' containment reference.
	 * @see #setIstBefahren(Ist_Befahren_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teile_AttributeGroup_IstBefahren()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ist_Befahren'"
	 * @generated
	 */
	Ist_Befahren_TypeClass getIstBefahren();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup#getIstBefahren <em>Ist Befahren</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ist Befahren</em>' containment reference.
	 * @see #getIstBefahren()
	 * @generated
	 */
	void setIstBefahren(Ist_Befahren_TypeClass value);

} // FT_Fahrweg_Teile_AttributeGroup
