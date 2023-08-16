/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Anlage zur automatischen Einstellung von Fahrstraßen aufgrund von Zuglaufinformationen. Die Zuglenkung ist eine Anlage, die der Unterstützung des Betriebsablaufes dient. Aufgabe der Zuglenkung ist es, auf der Basis von Zuglaufinformationen und zugbezogenen Vorgaben für die Benutzung von Strecken- und Bahnhofsgleisen ohne unmittelbare Mitwirkung des Bedieners Stellkommandos an das zuständige Stellwerk auszugeben, ihre Ausführung zu überwachen und sich aus Meldungen des Stellwerkes ergebenden Handlungsbedarf an den Bediener weiterzugeben. Zuglaufinformationen erhält die Zuglenkung von der Zuglaufverfolgung (ZLV), die vorgesehene Benutzung der Strecken- und Bahnhofsgleise sowie Wartebedingungen einschließlich besonderer Bedingungen für die Regelung der Reihenfolge der Züge aus einem sogenannten Lenkplan, der in Form einer Gleisbenutzungstabelle (GBT) darstellbar ist. DB-Regelwerk 819.0732 Gleisbenutzungstabelle Weitere Angaben finden sich im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getZLAllg <em>ZL Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getZLZN <em>ZLZN</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL()
 * @model extendedMetaData="name='CZL' kind='elementOnly'"
 * @generated
 */
public interface ZL extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDESTW Zentraleinheit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ESTW-Zentraleinheit, zu der diese ZL geplant wurde. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_IDESTWZentraleinheit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ESTW_Zentraleinheit'"
	 * @generated
	 */
	ESTW_Zentraleinheit getIDESTWZentraleinheit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 */
	void setIDESTWZentraleinheit(ESTW_Zentraleinheit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	void unsetIDESTWZentraleinheit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDESTW Zentraleinheit</em>' reference is set.
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	boolean isSetIDESTWZentraleinheit();

	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, die zu dieser ZL gehört. ZL und ZN müssen planerisch eine Einheit bilden, da die ZN-Anzeigefelder immer definierte Einschaltpunkte für die ZL sind. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #setIDZN(ZN)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_IDZN()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ZN getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #getIDZN()
	 * @generated
	 */
	void setIDZN(ZN value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	void unsetIDZN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getIDZN <em>IDZN</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN</em>' reference is set.
	 * @see #unsetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	boolean isSetIDZN();

	/**
	 * Returns the value of the '<em><b>ZL Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Allg</em>' containment reference.
	 * @see #setZLAllg(ZL_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_ZLAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Allg'"
	 * @generated
	 */
	ZL_Allg_AttributeGroup getZLAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getZLAllg <em>ZL Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Allg</em>' containment reference.
	 * @see #getZLAllg()
	 * @generated
	 */
	void setZLAllg(ZL_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZLZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZLZN</em>' containment reference.
	 * @see #setZLZN(ZL_ZN_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_ZLZN()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_ZN'"
	 * @generated
	 */
	ZL_ZN_AttributeGroup getZLZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL#getZLZN <em>ZLZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLZN</em>' containment reference.
	 * @see #getZLZN()
	 * @generated
	 */
	void setZLZN(ZL_ZN_AttributeGroup value);

} // ZL
