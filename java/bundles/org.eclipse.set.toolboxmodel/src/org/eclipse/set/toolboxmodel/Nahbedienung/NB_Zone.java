/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Nahbedienung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nahstellbereichszone. Jeder Nahstellbereich hat mindestens eine Zone; es sind auch mehrere Zonen möglich. Die Zonen können voneinander unabhängig nebeneinander liegen, sich überlappen oder eine Zone kann eine kleinere "Teilmenge" einer größeren Zone sein. Als spezieller Fall ist auch die Vereinigung von zwei nebeneinander liegenden Zonen möglich. Für jede Zone werden eigene Grenzen zum angrenzenden Bereich (ESTW, NB, Ortstellbereich) festgelegt. DB-Regelwerk Für die Planung von Nahbedienzonen exisitert bei der DB AG kein Regelwerk. Die Angabe findet sich in der Nahbedienungstabelle, Spalte 1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getNBZoneAllg <em>NB Zone Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone()
 * @model extendedMetaData="name='CNB_Zone' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(NB_Zone_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	NB_Zone_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(NB_Zone_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDNB</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis von der NB Zone auf den zugehörigen Nahstellbereich. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB</em>' reference.
	 * @see #isSetIDNB()
	 * @see #unsetIDNB()
	 * @see #setIDNB(NB)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_IDNB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB'"
	 * @generated
	 */
	NB getIDNB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB</em>' reference.
	 * @see #isSetIDNB()
	 * @see #unsetIDNB()
	 * @see #getIDNB()
	 * @generated
	 */
	void setIDNB(NB value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDNB()
	 * @see #getIDNB()
	 * @see #setIDNB(NB)
	 * @generated
	 */
	void unsetIDNB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDNB</em>' reference is set.
	 * @see #unsetIDNB()
	 * @see #getIDNB()
	 * @see #setIDNB(NB)
	 * @generated
	 */
	boolean isSetIDNB();

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die übergeordnete NB_Zone (die betrachtete NB_Zone ist damit untergeordnet). In der untergeordneten Zone muss die Nahbedienung zuerst zurückgegeben werden, bevor die Nahbedienung in der übergeordneten Zone zurückgegeben werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' reference.
	 * @see #isSetIDNBZone()
	 * @see #unsetIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_IDNBZone()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	NB_Zone getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Zone</em>' reference.
	 * @see #isSetIDNBZone()
	 * @see #unsetIDNBZone()
	 * @see #getIDNBZone()
	 * @generated
	 */
	void setIDNBZone(NB_Zone value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDNBZone()
	 * @see #getIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @generated
	 */
	void unsetIDNBZone();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDNB Zone</em>' reference is set.
	 * @see #unsetIDNBZone()
	 * @see #getIDNBZone()
	 * @see #setIDNBZone(NB_Zone)
	 * @generated
	 */
	boolean isSetIDNBZone();

	/**
	 * Returns the value of the '<em><b>NB Zone Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Zone Allg</em>' containment reference.
	 * @see #setNBZoneAllg(NB_Zone_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Nahbedienung.NahbedienungPackage#getNB_Zone_NBZoneAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Allg'"
	 * @generated
	 */
	NB_Zone_Allg_AttributeGroup getNBZoneAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Nahbedienung.NB_Zone#getNBZoneAllg <em>NB Zone Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Zone Allg</em>' containment reference.
	 * @see #getNBZoneAllg()
	 * @generated
	 */
	void setNBZoneAllg(NB_Zone_Allg_AttributeGroup value);

} // NB_Zone
