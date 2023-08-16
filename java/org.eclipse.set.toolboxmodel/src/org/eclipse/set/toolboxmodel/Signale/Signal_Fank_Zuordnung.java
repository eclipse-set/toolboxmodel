/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Fank Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung des Fahrtankünders (Weißes Dreieck) sowie Zuordnung der Startsignale, für die eine Fahrtankündigung erfolgen soll. Ein physischer Fahrtankünder (Anzeiger) wird als Signal abgebildet, wobei hierbei nur die Attributgruppen Bezeichnung sowie Signal_Real zu nutzen sind (nicht: Signal_Real_Aktiv, da kein Anschluss mittels ID_Stellelement an ein Stellwerk). Erfolgt die Fahrtankündigung ausschließlich auf mobilen Endgeräten, so entfällt das Anlegen des Signals für den Fahrtankünder.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Fank_Zuordnung#getIDSignalFank <em>ID Signal Fank</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Fank_Zuordnung#getIDSignalStart <em>ID Signal Start</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Fank_Zuordnung()
 * @model extendedMetaData="name='CSignal_Fank_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Signal_Fank_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal Fank</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Signale.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den oder die Fahrtankünder ("Weißes Dreieck"), durch die eine Fahrtstellung der unter ID_Signal_Start angegebenen Startsignale angekündigt werden soll. Der Verweis entfällt, wenn die Anzeige ausschließlich auf mobilen Endgeräten erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Fank</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Fank_Zuordnung_IDSignalFank()
	 * @model extendedMetaData="kind='element' name='ID_Signal_Fank'"
	 * @generated
	 */
	EList<Signal> getIDSignalFank();

	/**
	 * Returns the value of the '<em><b>ID Signal Start</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Signale.Signal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Startsignal bzw. die Startsignale, deren Fahrtstellung angekündigt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Start</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Fank_Zuordnung_IDSignalStart()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Start'"
	 * @generated
	 */
	EList<Signal> getIDSignalStart();

} // Signal_Fank_Zuordnung
