/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Kreuzungsplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verortungspunkte des für die BÜ-Planung verwendeten bautechnischen BÜ-Kreuzungsplans. Sofern der Anhang nicht als GeoTiff vorliegt, sind mindestens 2 Verortungspunkte anzugeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan()
 * @model extendedMetaData="name='CBUE_Kreuzungsplan' kind='elementOnly'"
 * @generated
 */
public interface BUE_Kreuzungsplan extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Kreuzungsplan Koordinaten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Kreuzungsplan Koordinaten</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_BUEKreuzungsplanKoordinaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Kreuzungsplan_Koordinaten'"
	 * @generated
	 */
	EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> getBUEKreuzungsplanKoordinaten();

	/**
	 * Returns the value of the '<em><b>ID Anhang Kreuzungsplan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den einzubindenden bautechnischen BÜ-Kreuzungsplan als Bild.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Kreuzungsplan</em>' reference.
	 * @see #isSetIDAnhangKreuzungsplan()
	 * @see #unsetIDAnhangKreuzungsplan()
	 * @see #setIDAnhangKreuzungsplan(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_IDAnhangKreuzungsplan()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Kreuzungsplan'"
	 * @generated
	 */
	Anhang getIDAnhangKreuzungsplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Kreuzungsplan</em>' reference.
	 * @see #isSetIDAnhangKreuzungsplan()
	 * @see #unsetIDAnhangKreuzungsplan()
	 * @see #getIDAnhangKreuzungsplan()
	 * @generated
	 */
	void setIDAnhangKreuzungsplan(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangKreuzungsplan()
	 * @see #getIDAnhangKreuzungsplan()
	 * @see #setIDAnhangKreuzungsplan(Anhang)
	 * @generated
	 */
	void unsetIDAnhangKreuzungsplan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Kreuzungsplan</em>' reference is set.
	 * @see #unsetIDAnhangKreuzungsplan()
	 * @see #getIDAnhangKreuzungsplan()
	 * @see #setIDAnhangKreuzungsplan(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangKreuzungsplan();

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die für die Ausgabe des Kreuzungsplans relevante BÜ-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_IDBUEAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	BUE_Anlage getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	void unsetIDBUEAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Anlage</em>' reference is set.
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	boolean isSetIDBUEAnlage();

} // BUE_Kreuzungsplan
