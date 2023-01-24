/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Fortschalt Kriterium</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt, welches die funktionellen ZN-Fortschaltkriterien beschreibt. Die Attributgruppe ZN_Fortschalt_Krit_Druck wird nur angelegt, wenn aus dem Fortschaltkriterium ein Druck erzeugt wird. DB-Regelwerk 819.0731 6 (16) und (17) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZNFortschaltKritStart <em>IDZN Fortschalt Krit Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZNFortschaltKritZiel <em>IDZN Fortschalt Krit Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getZNFortschaltKritDruck <em>ZN Fortschalt Krit Druck</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getZNFortschaltKritSchalt <em>ZN Fortschalt Krit Schalt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Kriterium()
 * @model extendedMetaData="name='CZN_Fortschalt_Kriterium' kind='elementOnly'"
 * @generated
 */
public interface ZN_Fortschalt_Kriterium extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, zu der das Fortschaltkriterium gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #setIDZN(ZN)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Kriterium_IDZN()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ZN getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZN <em>IDZN</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	void unsetIDZN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZN <em>IDZN</em>}' reference is set.
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
	 * Returns the value of the '<em><b>IDZN Fortschalt Krit Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das ZN Anzeigefeld in der Bedienoberfläche, von dem aus die Zugnummer fortgeschaltet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Fortschalt Krit Start</em>' reference.
	 * @see #isSetIDZNFortschaltKritStart()
	 * @see #unsetIDZNFortschaltKritStart()
	 * @see #setIDZNFortschaltKritStart(ZN_Anzeigefeld)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Kriterium_IDZNFortschaltKritStart()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Fortschalt_Krit_Start'"
	 * @generated
	 */
	ZN_Anzeigefeld getIDZNFortschaltKritStart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZNFortschaltKritStart <em>IDZN Fortschalt Krit Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Fortschalt Krit Start</em>' reference.
	 * @see #isSetIDZNFortschaltKritStart()
	 * @see #unsetIDZNFortschaltKritStart()
	 * @see #getIDZNFortschaltKritStart()
	 * @generated
	 */
	void setIDZNFortschaltKritStart(ZN_Anzeigefeld value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZNFortschaltKritStart <em>IDZN Fortschalt Krit Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNFortschaltKritStart()
	 * @see #getIDZNFortschaltKritStart()
	 * @see #setIDZNFortschaltKritStart(ZN_Anzeigefeld)
	 * @generated
	 */
	void unsetIDZNFortschaltKritStart();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getIDZNFortschaltKritStart <em>IDZN Fortschalt Krit Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN Fortschalt Krit Start</em>' reference is set.
	 * @see #unsetIDZNFortschaltKritStart()
	 * @see #getIDZNFortschaltKritStart()
	 * @see #setIDZNFortschaltKritStart(ZN_Anzeigefeld)
	 * @generated
	 */
	boolean isSetIDZNFortschaltKritStart();

	/**
	 * Returns the value of the '<em><b>IDZN Fortschalt Krit Ziel</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das ZN Anzeigefeld in der Bedienoberfläche, in das die Zugnummer fortgeschaltet wird. Die Angabe erfolgt nur bei besonderen Schaltkriterien. Eine Fortschaltung ist in mehrere Richtungen möglich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Fortschalt Krit Ziel</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Kriterium_IDZNFortschaltKritZiel()
	 * @model extendedMetaData="kind='element' name='ID_ZN_Fortschalt_Krit_Ziel'"
	 * @generated
	 */
	EList<ZN_Anzeigefeld> getIDZNFortschaltKritZiel();

	/**
	 * Returns the value of the '<em><b>ZN Fortschalt Krit Druck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Fortschalt Krit Druck</em>' containment reference.
	 * @see #setZNFortschaltKritDruck(ZN_Fortschalt_Krit_Druck_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Kriterium_ZNFortschaltKritDruck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Fortschalt_Krit_Druck'"
	 * @generated
	 */
	ZN_Fortschalt_Krit_Druck_AttributeGroup getZNFortschaltKritDruck();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Kriterium#getZNFortschaltKritDruck <em>ZN Fortschalt Krit Druck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Fortschalt Krit Druck</em>' containment reference.
	 * @see #getZNFortschaltKritDruck()
	 * @generated
	 */
	void setZNFortschaltKritDruck(ZN_Fortschalt_Krit_Druck_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZN Fortschalt Krit Schalt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Fortschalt Krit Schalt</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Kriterium_ZNFortschaltKritSchalt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Fortschalt_Krit_Schalt'"
	 * @generated
	 */
	EList<ZN_Fortschalt_Krit_Schalt_AttributeGroup> getZNFortschaltKritSchalt();

} // ZN_Fortschalt_Kriterium
