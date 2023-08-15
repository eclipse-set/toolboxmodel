/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung einer Oertlichkeit zum Bedien Bezirk, aus dem sie bedient wird. Dabei werden in diesem Zuordnungsobjekt die vorhandenen Angaben aus dem Objekt Örtlichkeit der jeweiligen Betriebsstelle um weitere Angaben wie beispielsweise die ESTW-Kennzahl oder den Betriebsstellenbezeichner (Streckenziel) planerisch angereichert. Gemäß Richtlinie 819.0603 müssen die ESTW-Kennzahlen und Betriebsstellenbezeichner im Steuerbezirk und an seinen Grenzen eindeutig (einmalig) sein. Diese Regel kann nicht über das Modell abgebildet werden, sondern muss in der Plausibilitäts- und Zulässigkeitsprüfung (PlaZ) abgefangen werden. Siehe Beispiel Media:Lupen HBS1.pdf "Bf Braunschweig Hbf (HBS) 30": Betriebsstellenbezeichner ==\u0026gt; "Bf Braunschweig Hbf", Oertlichkeit ==\u0026gt; "HBS", Kennzahl ==\u0026gt; "30". DB-Regelwerk 819.0603 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getBedienOertlichkeitKennzahlen <em>Bedien Oertlichkeit Kennzahlen</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Oertlichkeit()
 * @model extendedMetaData="name='CBedien_Oertlichkeit' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Oertlichkeit extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Oertlichkeit Kennzahlen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Oertlichkeit Kennzahlen</em>' containment reference.
	 * @see #setBedienOertlichkeitKennzahlen(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Oertlichkeit_BedienOertlichkeitKennzahlen()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Oertlichkeit_Kennzahlen'"
	 * @generated
	 */
	Bedien_Oertlichkeit_Kennzahlen_AttributeGroup getBedienOertlichkeitKennzahlen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getBedienOertlichkeitKennzahlen <em>Bedien Oertlichkeit Kennzahlen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Oertlichkeit Kennzahlen</em>' containment reference.
	 * @see #getBedienOertlichkeitKennzahlen()
	 * @generated
	 */
	void setBedienOertlichkeitKennzahlen(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit diesem Verweis werden alle aus einem Bedienbezirk steuerbaren Örtlichkeiten diesem planerisch zugeordnet. Heute erfolgt dies implizit über die Kennzahlentabelle, Steuerbezirksgrafiken oder die Beschreibung im Erläuterungsbericht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk</em>' reference.
	 * @see #isSetIDBedienBezirk()
	 * @see #unsetIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Oertlichkeit_IDBedienBezirk()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk'"
	 * @generated
	 */
	Bedien_Bezirk getIDBedienBezirk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk</em>' reference.
	 * @see #isSetIDBedienBezirk()
	 * @see #unsetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @generated
	 */
	void setIDBedienBezirk(Bedien_Bezirk value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @generated
	 */
	void unsetIDBedienBezirk();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Bezirk</em>' reference is set.
	 * @see #unsetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @generated
	 */
	boolean isSetIDBedienBezirk();

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis zur Ermittlung der Ril 100-Abkürzung für die jeweils im Bedienbezirk bedienten Betriebsstellen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Oertlichkeit_IDOertlichkeit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	Oertlichkeit getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	void unsetIDOertlichkeit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Oertlichkeit</em>' reference is set.
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDOertlichkeit();

} // Bedien_Oertlichkeit
