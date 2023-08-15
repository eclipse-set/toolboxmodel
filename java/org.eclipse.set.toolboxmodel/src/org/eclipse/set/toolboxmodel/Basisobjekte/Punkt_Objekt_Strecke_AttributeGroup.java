/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Geodaten.Strecke;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Punkt Objekt Strecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getKmMassgebend <em>Km Massgebend</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup()
 * @model extendedMetaData="name='CPunkt_Objekt_Strecke' kind='elementOnly'"
 * @generated
 */
public interface Punkt_Objekt_Strecke_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung eines Punktobjektes zu einer Streckennummer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' reference.
	 * @see #isSetIDStrecke()
	 * @see #unsetIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	Strecke getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke</em>' reference.
	 * @see #isSetIDStrecke()
	 * @see #unsetIDStrecke()
	 * @see #getIDStrecke()
	 * @generated
	 */
	void setIDStrecke(Strecke value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStrecke()
	 * @see #getIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @generated
	 */
	void unsetIDStrecke();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Strecke</em>' reference is set.
	 * @see #unsetIDStrecke()
	 * @see #getIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @generated
	 */
	boolean isSetIDStrecke();

	/**
	 * Returns the value of the '<em><b>Km Massgebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzeichnung der maßgebenden Kilometrierung ("true") bei Referenz zu mehreren Strecken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Km Massgebend</em>' containment reference.
	 * @see #setKmMassgebend(Km_Massgebend_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Km_Massgebend'"
	 * @generated
	 */
	Km_Massgebend_TypeClass getKmMassgebend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getKmMassgebend <em>Km Massgebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km Massgebend</em>' containment reference.
	 * @see #getKmMassgebend()
	 * @generated
	 */
	void setKmMassgebend(Km_Massgebend_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Km</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kilometer des Punktobjekts an der Strecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Km</em>' containment reference.
	 * @see #setStreckeKm(Strecke_Km_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Km'"
	 * @generated
	 */
	Strecke_Km_TypeClass getStreckeKm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Km</em>' containment reference.
	 * @see #getStreckeKm()
	 * @generated
	 */
	void setStreckeKm(Strecke_Km_TypeClass value);

} // Punkt_Objekt_Strecke_AttributeGroup
