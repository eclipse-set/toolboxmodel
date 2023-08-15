/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV Modul Eingang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getEingangGepuffert <em>Eingang Gepuffert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getPrimaerquelle <em>Primaerquelle</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getEnergieEingangArt <em>Energie Eingang Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getIDEnergieEingang <em>ID Energie Eingang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Eingang_AttributeGroup()
 * @model extendedMetaData="name='CEV_Modul_Eingang' kind='elementOnly'"
 * @generated
 */
public interface EV_Modul_Eingang_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Eingang Gepuffert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Abgriff gepuffert (Parallelabgriff an USV, Batterie etc.) oder ungepuffert (Nebenabgriff am Zähleranschluss) erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eingang Gepuffert</em>' containment reference.
	 * @see #setEingangGepuffert(Eingang_Gepuffert_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Eingang_AttributeGroup_EingangGepuffert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Eingang_Gepuffert'"
	 * @generated
	 */
	Eingang_Gepuffert_TypeClass getEingangGepuffert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getEingangGepuffert <em>Eingang Gepuffert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eingang Gepuffert</em>' containment reference.
	 * @see #getEingangGepuffert()
	 * @generated
	 */
	void setEingangGepuffert(Eingang_Gepuffert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Primaerquelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die angegebene Energiequelle ist die primäre Energiequelle für das Energieversorgungsmodul.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primaerquelle</em>' containment reference.
	 * @see #setPrimaerquelle(Primaerquelle_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Eingang_AttributeGroup_Primaerquelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Primaerquelle'"
	 * @generated
	 */
	Primaerquelle_TypeClass getPrimaerquelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getPrimaerquelle <em>Primaerquelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primaerquelle</em>' containment reference.
	 * @see #getPrimaerquelle()
	 * @generated
	 */
	void setPrimaerquelle(Primaerquelle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Energie Eingang Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Energiequelle, von der der Abgriff erfolgt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energie Eingang Art</em>' containment reference.
	 * @see #setEnergieEingangArt(Energie_Eingang_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Eingang_AttributeGroup_EnergieEingangArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Energie_Eingang_Art'"
	 * @generated
	 */
	Energie_Eingang_Art_TypeClass getEnergieEingangArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getEnergieEingangArt <em>Energie Eingang Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energie Eingang Art</em>' containment reference.
	 * @see #getEnergieEingangArt()
	 * @generated
	 */
	void setEnergieEingangArt(Energie_Eingang_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Energie Eingang</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Energiequelle, von der der Abgriff erfolgt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Energie Eingang</em>' reference.
	 * @see #isSetIDEnergieEingang()
	 * @see #unsetIDEnergieEingang()
	 * @see #setIDEnergieEingang(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Eingang_AttributeGroup_IDEnergieEingang()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Energie_Eingang'"
	 * @generated
	 */
	Basis_Objekt getIDEnergieEingang();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getIDEnergieEingang <em>ID Energie Eingang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Energie Eingang</em>' reference.
	 * @see #isSetIDEnergieEingang()
	 * @see #unsetIDEnergieEingang()
	 * @see #getIDEnergieEingang()
	 * @generated
	 */
	void setIDEnergieEingang(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getIDEnergieEingang <em>ID Energie Eingang</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDEnergieEingang()
	 * @see #getIDEnergieEingang()
	 * @see #setIDEnergieEingang(Basis_Objekt)
	 * @generated
	 */
	void unsetIDEnergieEingang();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup#getIDEnergieEingang <em>ID Energie Eingang</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Energie Eingang</em>' reference is set.
	 * @see #unsetIDEnergieEingang()
	 * @see #getIDEnergieEingang()
	 * @see #setIDEnergieEingang(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDEnergieEingang();

} // EV_Modul_Eingang_AttributeGroup
