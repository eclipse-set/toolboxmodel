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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LT Binaerdaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDBinaerdaten <em>ID Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getPruefmerkmaleBinaerdaten <em>Pruefmerkmale Binaerdaten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup()
 * @model extendedMetaData="name='CLT_Binaerdaten' kind='elementOnly'"
 * @generated
 */
public interface LT_Binaerdaten_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang EA Doku</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Anhang, der die Zuordnung zwischen Eingangsinformationen (z. B. Signalbegriffe) und zugehörigem Lufttelegramm enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang EA Doku</em>' reference.
	 * @see #isSetIDAnhangEADoku()
	 * @see #unsetIDAnhangEADoku()
	 * @see #setIDAnhangEADoku(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup_IDAnhangEADoku()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_EA_Doku'"
	 * @generated
	 */
	Anhang getIDAnhangEADoku();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang EA Doku</em>' reference.
	 * @see #isSetIDAnhangEADoku()
	 * @see #unsetIDAnhangEADoku()
	 * @see #getIDAnhangEADoku()
	 * @generated
	 */
	void setIDAnhangEADoku(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangEADoku()
	 * @see #getIDAnhangEADoku()
	 * @see #setIDAnhangEADoku(Anhang)
	 * @generated
	 */
	void unsetIDAnhangEADoku();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang EA Doku</em>' reference is set.
	 * @see #unsetIDAnhangEADoku()
	 * @see #getIDAnhangEADoku()
	 * @see #setIDAnhangEADoku(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangEADoku();

	/**
	 * Returns the value of the '<em><b>ID Binaerdaten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Binärdaten, die von der Balise gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdaten</em>' reference.
	 * @see #isSetIDBinaerdaten()
	 * @see #unsetIDBinaerdaten()
	 * @see #setIDBinaerdaten(Binaerdaten)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup_IDBinaerdaten()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdaten'"
	 * @generated
	 */
	Binaerdaten getIDBinaerdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDBinaerdaten <em>ID Binaerdaten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdaten</em>' reference.
	 * @see #isSetIDBinaerdaten()
	 * @see #unsetIDBinaerdaten()
	 * @see #getIDBinaerdaten()
	 * @generated
	 */
	void setIDBinaerdaten(Binaerdaten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDBinaerdaten <em>ID Binaerdaten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBinaerdaten()
	 * @see #getIDBinaerdaten()
	 * @see #setIDBinaerdaten(Binaerdaten)
	 * @generated
	 */
	void unsetIDBinaerdaten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getIDBinaerdaten <em>ID Binaerdaten</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Binaerdaten</em>' reference is set.
	 * @see #unsetIDBinaerdaten()
	 * @see #getIDBinaerdaten()
	 * @see #setIDBinaerdaten(Binaerdaten)
	 * @generated
	 */
	boolean isSetIDBinaerdaten();

	/**
	 * Returns the value of the '<em><b>Pruefmerkmale Binaerdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfmerkmale der Binärdaten (z. B. Prüfsumme, Version), die von der Balise gesendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefmerkmale Binaerdaten</em>' containment reference.
	 * @see #setPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLT_Binaerdaten_AttributeGroup_PruefmerkmaleBinaerdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pruefmerkmale_Binaerdaten'"
	 * @generated
	 */
	Pruefmerkmale_Daten_AttributeGroup getPruefmerkmaleBinaerdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup#getPruefmerkmaleBinaerdaten <em>Pruefmerkmale Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefmerkmale Binaerdaten</em>' containment reference.
	 * @see #getPruefmerkmaleBinaerdaten()
	 * @generated
	 */
	void setPruefmerkmaleBinaerdaten(Pruefmerkmale_Daten_AttributeGroup value);

} // LT_Binaerdaten_AttributeGroup
