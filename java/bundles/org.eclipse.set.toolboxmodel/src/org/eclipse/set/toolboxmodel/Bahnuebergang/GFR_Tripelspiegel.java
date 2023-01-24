/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GFR Tripelspiegel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ortungshilfe für GFR-Anlagen der Firma Honeywell.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getGFRTripelspiegelAllg <em>GFR Tripelspiegel Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getIDGFRAnlage <em>IDGFR Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel()
 * @model extendedMetaData="name='CGFR_Tripelspiegel' kind='elementOnly'"
 * @generated
 */
public interface GFR_Tripelspiegel extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(GFR_Tripelspiegel_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	GFR_Tripelspiegel_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(GFR_Tripelspiegel_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>GFR Tripelspiegel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GFR Tripelspiegel Allg</em>' containment reference.
	 * @see #setGFRTripelspiegelAllg(GFR_Tripelspiegel_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_GFRTripelspiegelAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GFR_Tripelspiegel_Allg'"
	 * @generated
	 */
	GFR_Tripelspiegel_Allg_AttributeGroup getGFRTripelspiegelAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getGFRTripelspiegelAllg <em>GFR Tripelspiegel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GFR Tripelspiegel Allg</em>' containment reference.
	 * @see #getGFRTripelspiegelAllg()
	 * @generated
	 */
	void setGFRTripelspiegelAllg(GFR_Tripelspiegel_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGFR Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige GFR-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGFR Anlage</em>' reference.
	 * @see #isSetIDGFRAnlage()
	 * @see #unsetIDGFRAnlage()
	 * @see #setIDGFRAnlage(GFR_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getGFR_Tripelspiegel_IDGFRAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GFR_Anlage'"
	 * @generated
	 */
	GFR_Anlage getIDGFRAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getIDGFRAnlage <em>IDGFR Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGFR Anlage</em>' reference.
	 * @see #isSetIDGFRAnlage()
	 * @see #unsetIDGFRAnlage()
	 * @see #getIDGFRAnlage()
	 * @generated
	 */
	void setIDGFRAnlage(GFR_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getIDGFRAnlage <em>IDGFR Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGFRAnlage()
	 * @see #getIDGFRAnlage()
	 * @see #setIDGFRAnlage(GFR_Anlage)
	 * @generated
	 */
	void unsetIDGFRAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel#getIDGFRAnlage <em>IDGFR Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGFR Anlage</em>' reference is set.
	 * @see #unsetIDGFRAnlage()
	 * @see #getIDGFRAnlage()
	 * @see #setIDGFRAnlage(GFR_Anlage)
	 * @generated
	 */
	boolean isSetIDGFRAnlage();

} // GFR_Tripelspiegel
