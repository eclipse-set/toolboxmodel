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
 * A representation of the model object '<em><b>LEU Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elektronische Einheit zur Ansteuerung der Eurobalisen mit Balisentelegrammen in Abhängigkeit von Eingangsinformationen (Signalbegriffe, Weichenlagen etc.). Die LEU-Anlage besteht ggf. aus mehreren Schaltkästen, die mehrere LEU-Module enthalten können.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getLEUAnlageAllg <em>LEU Anlage Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage()
 * @model extendedMetaData="name='CLEU_Anlage' kind='elementOnly'"
 * @generated
 */
public interface LEU_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	LEU_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(LEU_Anlage_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDLEU Bezugspunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bezugselement der LEU-Anlage, aus dem in der Regel auch die Bezeichnung generiert wird. Über diesen Verweis erfolgt auch die Ermittlung des Bezugselements für von dieser LEU-Anlage gesteuerte Datenpunkte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Bezugspunkt</em>' reference.
	 * @see #isSetIDLEUBezugspunkt()
	 * @see #unsetIDLEUBezugspunkt()
	 * @see #setIDLEUBezugspunkt(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_IDLEUBezugspunkt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Bezugspunkt'"
	 * @generated
	 */
	Basis_Objekt getIDLEUBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Bezugspunkt</em>' reference.
	 * @see #isSetIDLEUBezugspunkt()
	 * @see #unsetIDLEUBezugspunkt()
	 * @see #getIDLEUBezugspunkt()
	 * @generated
	 */
	void setIDLEUBezugspunkt(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDLEUBezugspunkt()
	 * @see #getIDLEUBezugspunkt()
	 * @see #setIDLEUBezugspunkt(Basis_Objekt)
	 * @generated
	 */
	void unsetIDLEUBezugspunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getIDLEUBezugspunkt <em>IDLEU Bezugspunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDLEU Bezugspunkt</em>' reference is set.
	 * @see #unsetIDLEUBezugspunkt()
	 * @see #getIDLEUBezugspunkt()
	 * @see #setIDLEUBezugspunkt(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDLEUBezugspunkt();

	/**
	 * Returns the value of the '<em><b>LEU Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LEU Anlage Allg</em>' containment reference.
	 * @see #setLEUAnlageAllg(LEU_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_LEUAnlageAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Anlage_Allg'"
	 * @generated
	 */
	LEU_Anlage_Allg_AttributeGroup getLEUAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage#getLEUAnlageAllg <em>LEU Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Anlage Allg</em>' containment reference.
	 * @see #getLEUAnlageAllg()
	 * @generated
	 */
	void setLEUAnlageAllg(LEU_Anlage_Allg_AttributeGroup value);

} // LEU_Anlage
