/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFR Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gerfahrraumfreimeldeanlage. Folgende Rahmenbedingungen sind für den Einsatz einer GFR zu beachten: max. Höhe der Bodenwellen des BÜ: 15 cm; max. Neigung des BÜ: 2°.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage#getGFRAnlageAllg <em>GFR Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage()
 * @model extendedMetaData="name='CGFR_Anlage' kind='elementOnly'"
 * @generated
 */
public interface GFR_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GFR Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GFR Anlage Allg</em>' containment reference.
	 * @see #setGFRAnlageAllg(GFR_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_GFRAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GFR_Anlage_Allg'"
	 * @generated
	 */
	GFR_Anlage_Allg_AttributeGroup getGFRAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage#getGFRAnlageAllg <em>GFR Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GFR Anlage Allg</em>' containment reference.
	 * @see #getGFRAnlageAllg()
	 * @generated
	 */
	void setGFRAnlageAllg(GFR_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige BÜ-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_IDBUEAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	BUE_Anlage getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(BUE_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	void unsetIDBUEAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Anlage</em>' reference is set.
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	boolean isSetIDBUEAnlage();

} // GFR_Anlage
