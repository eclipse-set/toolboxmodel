/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verkehrszeichen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung von Lichtzeichen und Andreaskreuzen im Rahmen der BÜ-Planung. Die Attributgruppe Verkehrszeichen_Lz entfällt bei nichttechnisch gesicherten BÜ oder beschrankten BÜ mit Läutewerk. Die Attributgruppe Verkehrszeichen_Andreaskreuz entfällt bei vorgeschalteten Lichtzeichen. Mehrere Andreaskreuze bei einmündenden Straßen sind möglich (i. d. R. max 3). Die Attributgruppe Vz_Sperrstrecke entfällt bei vorgeschalteten Lichtzeichen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAndreaskreuz <em>Verkehrszeichen Andreaskreuz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVzSperrstrecke <em>Vz Sperrstrecke</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen()
 * @model extendedMetaData="name='CVerkehrszeichen' kind='elementOnly'"
 * @generated
 */
public interface Verkehrszeichen extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Verkehrszeichen_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BÜ-Anlage, zu der das Verkehrszeichen gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_IDBUEAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	BUE_Anlage getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(BUE_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	void unsetIDBUEAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Anlage</em>' reference is set.
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	boolean isSetIDBUEAnlage();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Unterbringung zur Verortung des Verkehrszeichens
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkehrszeichen Allg</em>' containment reference.
	 * @see #setVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VerkehrszeichenAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen_Allg'"
	 * @generated
	 */
	Verkehrszeichen_Allg_AttributeGroup getVerkehrszeichenAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verkehrszeichen Allg</em>' containment reference.
	 * @see #getVerkehrszeichenAllg()
	 * @generated
	 */
	void setVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen Andreaskreuz</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkehrszeichen Andreaskreuz</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VerkehrszeichenAndreaskreuz()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen_Andreaskreuz'"
	 * @generated
	 */
	EList<Verkehrszeichen_Andreaskreuz_AttributeGroup> getVerkehrszeichenAndreaskreuz();

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen Lz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkehrszeichen Lz</em>' containment reference.
	 * @see #setVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VerkehrszeichenLz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen_Lz'"
	 * @generated
	 */
	Verkehrszeichen_Lz_AttributeGroup getVerkehrszeichenLz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verkehrszeichen Lz</em>' containment reference.
	 * @see #getVerkehrszeichenLz()
	 * @generated
	 */
	void setVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Vz Sperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vz Sperrstrecke</em>' containment reference.
	 * @see #setVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VzSperrstrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vz_Sperrstrecke'"
	 * @generated
	 */
	Vz_Sperrstrecke_AttributeGroup getVzSperrstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen#getVzSperrstrecke <em>Vz Sperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vz Sperrstrecke</em>' containment reference.
	 * @see #getVzSperrstrecke()
	 * @generated
	 */
	void setVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup value);

} // Verkehrszeichen
