/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Radio Block Centre (ETCS-Streckenzentrale).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getETCSAdresse <em>ETCS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getRBCAllg <em>RBC Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC()
 * @model extendedMetaData="name='CRBC' kind='elementOnly'"
 * @generated
 */
public interface RBC extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ETCS Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Adresse</em>' containment reference.
	 * @see #setETCSAdresse(ETCS_Adresse_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_ETCSAdresse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Adresse'"
	 * @generated
	 */
	ETCS_Adresse_AttributeGroup getETCSAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getETCSAdresse <em>ETCS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Adresse</em>' containment reference.
	 * @see #getETCSAdresse()
	 * @generated
	 */
	void setETCSAdresse(ETCS_Adresse_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDESTW Zentraleinheit</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ESTW-Zentraleinheiten, die mit dem RBC verbunden sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESTW Zentraleinheit</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_IDESTWZentraleinheit()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_ESTW_Zentraleinheit'"
	 * @generated
	 */
	EList<ESTW_Zentraleinheit> getIDESTWZentraleinheit();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Unterbringung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>RBC Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RBC Allg</em>' containment reference.
	 * @see #setRBCAllg(RBC_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getRBC_RBCAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RBC_Allg'"
	 * @generated
	 */
	RBC_Allg_AttributeGroup getRBCAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC#getRBCAllg <em>RBC Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RBC Allg</em>' containment reference.
	 * @see #getRBCAllg()
	 * @generated
	 */
	void setRBCAllg(RBC_Allg_AttributeGroup value);

} // RBC
