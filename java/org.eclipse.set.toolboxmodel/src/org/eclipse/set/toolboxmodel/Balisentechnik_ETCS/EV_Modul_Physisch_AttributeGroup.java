/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EV Modul Physisch Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getEVModulArt <em>EV Modul Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getEVModulEingang <em>EV Modul Eingang</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getEVModulTyp <em>EV Modul Typ</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getIDElementUnterbringung <em>ID Element Unterbringung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Physisch_AttributeGroup()
 * @model extendedMetaData="name='CEV_Modul_Physisch' kind='elementOnly'"
 * @generated
 */
public interface EV_Modul_Physisch_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>EV Modul Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Energieversorgungsmoduls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EV Modul Art</em>' containment reference.
	 * @see #setEVModulArt(EV_Modul_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Physisch_AttributeGroup_EVModulArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EV_Modul_Art'"
	 * @generated
	 */
	EV_Modul_Art_TypeClass getEVModulArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getEVModulArt <em>EV Modul Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Modul Art</em>' containment reference.
	 * @see #getEVModulArt()
	 * @generated
	 */
	void setEVModulArt(EV_Modul_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>EV Modul Eingang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Eingang_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EV Modul Eingang</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Physisch_AttributeGroup_EVModulEingang()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EV_Modul_Eingang'"
	 * @generated
	 */
	EList<EV_Modul_Eingang_AttributeGroup> getEVModulEingang();

	/**
	 * Returns the value of the '<em><b>EV Modul Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerbezogene Typ-Angabe (Rücklaufdatum).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EV Modul Typ</em>' containment reference.
	 * @see #setEVModulTyp(EV_Modul_Typ_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Physisch_AttributeGroup_EVModulTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EV_Modul_Typ'"
	 * @generated
	 */
	EV_Modul_Typ_TypeClass getEVModulTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getEVModulTyp <em>EV Modul Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EV Modul Typ</em>' containment reference.
	 * @see #getEVModulTyp()
	 * @generated
	 */
	void setEVModulTyp(EV_Modul_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Physisch_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Element Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Unterbringung oder einen LEU-Schaltkasten (z. B. bei Solarer Energieversorgung), in der/dem das EV-Modul untergebracht ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Element Unterbringung</em>' reference.
	 * @see #isSetIDElementUnterbringung()
	 * @see #unsetIDElementUnterbringung()
	 * @see #setIDElementUnterbringung(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Physisch_AttributeGroup_IDElementUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Element_Unterbringung'"
	 * @generated
	 */
	Basis_Objekt getIDElementUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getIDElementUnterbringung <em>ID Element Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Element Unterbringung</em>' reference.
	 * @see #isSetIDElementUnterbringung()
	 * @see #unsetIDElementUnterbringung()
	 * @see #getIDElementUnterbringung()
	 * @generated
	 */
	void setIDElementUnterbringung(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getIDElementUnterbringung <em>ID Element Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDElementUnterbringung()
	 * @see #getIDElementUnterbringung()
	 * @see #setIDElementUnterbringung(Basis_Objekt)
	 * @generated
	 */
	void unsetIDElementUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.EV_Modul_Physisch_AttributeGroup#getIDElementUnterbringung <em>ID Element Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Element Unterbringung</em>' reference is set.
	 * @see #unsetIDElementUnterbringung()
	 * @see #getIDElementUnterbringung()
	 * @see #setIDElementUnterbringung(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDElementUnterbringung();

} // EV_Modul_Physisch_AttributeGroup
