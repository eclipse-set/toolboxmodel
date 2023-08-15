/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz Signal Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getFlaSignalZielsperrung <em>Fla Signal Zielsperrung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getIDFlaSignal <em>ID Fla Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Signal_AttributeGroup()
 * @model extendedMetaData="name='CFla_Schutz_Signal' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz_Signal_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fla Signal Zielsperrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Belegung des Signals mit einer Zielsperre für Rangierstraßen, während der Beanspruchung als Flankenschutz bietendes Element. Das Attribut ist nur dann sinnvoll füllbar, wenn das betreffende Signal Ziel einer Rangierstraße ist. Betrieblich wird diese Maßnahme "Doppelter Lichtschutz" genannt. DB-Regelwerk Flankenschutztabelle, Fußnote
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Signal Zielsperrung</em>' containment reference.
	 * @see #setFlaSignalZielsperrung(Fla_Signal_Zielsperrung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Signal_Zielsperrung'"
	 * @generated
	 */
	Fla_Signal_Zielsperrung_TypeClass getFlaSignalZielsperrung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getFlaSignalZielsperrung <em>Fla Signal Zielsperrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Signal Zielsperrung</em>' containment reference.
	 * @see #getFlaSignalZielsperrung()
	 * @generated
	 */
	void setFlaSignalZielsperrung(Fla_Signal_Zielsperrung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fla Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal, das unmittelbar an die Weiche angrenzt und Flankenschutz bietet. Steht das Signal nicht grenzzeichenfrei an der Flankenschutz suchenden Weiche, so wird dies nicht explizit im Datenmodell gespeichert. Stattdessen wird das nächste Flankenschutz bietende Element als Flankenschutzmaßnahme geplant. DB-Regelwerk Flankenschutztabelle, Spalte 5 "Hp 0"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Signal</em>' reference.
	 * @see #isSetIDFlaSignal()
	 * @see #unsetIDFlaSignal()
	 * @see #setIDFlaSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Signal_AttributeGroup_IDFlaSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Signal'"
	 * @generated
	 */
	Signal getIDFlaSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getIDFlaSignal <em>ID Fla Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Signal</em>' reference.
	 * @see #isSetIDFlaSignal()
	 * @see #unsetIDFlaSignal()
	 * @see #getIDFlaSignal()
	 * @generated
	 */
	void setIDFlaSignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getIDFlaSignal <em>ID Fla Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaSignal()
	 * @see #getIDFlaSignal()
	 * @see #setIDFlaSignal(Signal)
	 * @generated
	 */
	void unsetIDFlaSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup#getIDFlaSignal <em>ID Fla Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Signal</em>' reference is set.
	 * @see #unsetIDFlaSignal()
	 * @see #getIDFlaSignal()
	 * @see #setIDFlaSignal(Signal)
	 * @generated
	 */
	boolean isSetIDFlaSignal();

} // Fla_Schutz_Signal_AttributeGroup
