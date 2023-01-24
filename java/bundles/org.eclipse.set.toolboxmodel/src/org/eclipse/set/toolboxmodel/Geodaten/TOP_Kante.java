/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOP Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kante des topologischen Knoten-Kanten-Modells zur Darstellung der Gleislinien. Die TOP_Kante ist vom Knoten A zum Knoten B gerichtet und muss immer an zwei TOP Knoten enden. Eine TOP_Kante kann mehrere topographische Kanten (GEO_Kanten) beinhalten, die über GEO Knoten fortlaufend miteinander verbunden sind. Ein TOP Knoten ist immer auch ein GEO Knoten. Die Länge einer TOP Kante zwischen den Knoten A und B entspricht der Summe der GEO_Kanten zwischen A und B (reale Gleislänge) und wird auf Millimetergenauigkeit gerundet. Die maximale Länge einer TOP_Kante ist im Modell auf 99999,999 m (\u0026lt;100 km) begrenzt. Um ein eindeutiges Routing im topologischen Modell zu ermöglichen, sind die Anschlussarten der Kante an den beiden Knoten A und B anzugeben (siehe Attribute TOP_Anschluss_A bzw. TOP_Anschluss_B). Hierbei ist zu beachten, dass ein Routing über die Verbindung Anschluss Links - Rechts ausgeschlossen ist. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenA <em>IDTOP Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenB <em>IDTOP Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getTOPKanteAllg <em>TOP Kante Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Kante()
 * @model extendedMetaData="name='CTOP_Kante' kind='elementOnly'"
 * @generated
 */
public interface TOP_Kante extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDTOP Knoten A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den TOP Knoten am Anfang der Kante. Beginn der laufenden Länge, d. h. laufende Länge == 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Knoten A</em>' reference.
	 * @see #isSetIDTOPKnotenA()
	 * @see #unsetIDTOPKnotenA()
	 * @see #setIDTOPKnotenA(TOP_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Kante_IDTOPKnotenA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Knoten_A'"
	 * @generated
	 */
	TOP_Knoten getIDTOPKnotenA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenA <em>IDTOP Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDTOP Knoten A</em>' reference.
	 * @see #isSetIDTOPKnotenA()
	 * @see #unsetIDTOPKnotenA()
	 * @see #getIDTOPKnotenA()
	 * @generated
	 */
	void setIDTOPKnotenA(TOP_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenA <em>IDTOP Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDTOPKnotenA()
	 * @see #getIDTOPKnotenA()
	 * @see #setIDTOPKnotenA(TOP_Knoten)
	 * @generated
	 */
	void unsetIDTOPKnotenA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenA <em>IDTOP Knoten A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDTOP Knoten A</em>' reference is set.
	 * @see #unsetIDTOPKnotenA()
	 * @see #getIDTOPKnotenA()
	 * @see #setIDTOPKnotenA(TOP_Knoten)
	 * @generated
	 */
	boolean isSetIDTOPKnotenA();

	/**
	 * Returns the value of the '<em><b>IDTOP Knoten B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den TOP Knoten am Ende der Kante. Ende der laufenden Länge, d. h. laufende Länge = TOP Laenge.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Knoten B</em>' reference.
	 * @see #isSetIDTOPKnotenB()
	 * @see #unsetIDTOPKnotenB()
	 * @see #setIDTOPKnotenB(TOP_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Kante_IDTOPKnotenB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Knoten_B'"
	 * @generated
	 */
	TOP_Knoten getIDTOPKnotenB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenB <em>IDTOP Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDTOP Knoten B</em>' reference.
	 * @see #isSetIDTOPKnotenB()
	 * @see #unsetIDTOPKnotenB()
	 * @see #getIDTOPKnotenB()
	 * @generated
	 */
	void setIDTOPKnotenB(TOP_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenB <em>IDTOP Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDTOPKnotenB()
	 * @see #getIDTOPKnotenB()
	 * @see #setIDTOPKnotenB(TOP_Knoten)
	 * @generated
	 */
	void unsetIDTOPKnotenB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getIDTOPKnotenB <em>IDTOP Knoten B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDTOP Knoten B</em>' reference is set.
	 * @see #unsetIDTOPKnotenB()
	 * @see #getIDTOPKnotenB()
	 * @see #setIDTOPKnotenB(TOP_Knoten)
	 * @generated
	 */
	boolean isSetIDTOPKnotenB();

	/**
	 * Returns the value of the '<em><b>TOP Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TOP Kante Allg</em>' containment reference.
	 * @see #setTOPKanteAllg(TOP_Kante_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Kante_TOPKanteAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TOP_Kante_Allg'"
	 * @generated
	 */
	TOP_Kante_Allg_AttributeGroup getTOPKanteAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante#getTOPKanteAllg <em>TOP Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOP Kante Allg</em>' containment reference.
	 * @see #getTOPKanteAllg()
	 * @generated
	 */
	void setTOPKanteAllg(TOP_Kante_Allg_AttributeGroup value);

} // TOP_Kante
