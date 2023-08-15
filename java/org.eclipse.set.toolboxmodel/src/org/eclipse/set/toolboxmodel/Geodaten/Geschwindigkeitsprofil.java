/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geschwindigkeitsprofil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zulässige Geschwindigkeit der Strecke, bei ETCS auch außerhalb der durchgehenden Hauptgleise. Das Geschwindigkeitsprofil wird zusammengesetzt aus Bereichen mit konstanten Geschwindigkeiten. Es kann in unterschiedlichen Arten (z. B. NeiTec, ETCS) ausgeprägt sein. Für jede Art wird ein separates Geschwindigkeitsprofil angelegt. "Geschwindigkeitsband" ist ein Synonym für Geschwindigkeitsprofil. Unabhängig vom Geschwindigkeitsprofil können in Elementen (Weiche, Gleisabschnitt) eigene Geschwindigkeiten hinterlegt sein. Je nach Anwendung wird über die Gültigkeit der in den Elementen hinterlegten Geschwindigkeit oder der des Geschwindigkeitsprofils entschieden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Geschwindigkeitsprofil#getGeschwindigkeitsprofilAllg <em>Geschwindigkeitsprofil Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil()
 * @model extendedMetaData="name='CGeschwindigkeitsprofil' kind='elementOnly'"
 * @generated
 */
public interface Geschwindigkeitsprofil extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Geschwindigkeitsprofil Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geschwindigkeitsprofil Allg</em>' containment reference.
	 * @see #setGeschwindigkeitsprofilAllg(Geschwindigkeitsprofil_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGeschwindigkeitsprofil_GeschwindigkeitsprofilAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeitsprofil_Allg'"
	 * @generated
	 */
	Geschwindigkeitsprofil_Allg_AttributeGroup getGeschwindigkeitsprofilAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Geschwindigkeitsprofil#getGeschwindigkeitsprofilAllg <em>Geschwindigkeitsprofil Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeitsprofil Allg</em>' containment reference.
	 * @see #getGeschwindigkeitsprofilAllg()
	 * @generated
	 */
	void setGeschwindigkeitsprofilAllg(Geschwindigkeitsprofil_Allg_AttributeGroup value);

} // Geschwindigkeitsprofil
