/**
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
 * A representation of the model object '<em><b>TOP Knoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Knoten des topologischen Knoten-Kanten-Modells. Der TOP_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den TOP_Knoten anschließenden topologischen Kanten ist je nach Art des TOP_Knoten unterschiedlich und muss mit der Anzahl der an den zugehörigen GEO Knoten anschließenden GEO_Kanten übereinstimmen: eine TOP-Kante: Gleisende, Digitalisierungsende, Betrachtungsende; drei TOP-Kanten: verzweigendes Fahrwegelement (siehe Modellierung Weichen). Weitere Fälle mit 0..2 anschließenden TOP-Kanten treten am Verbindungsknoten auf (siehe entsprechende Beschreibung). Im Fall eines Meridiansprungs werden zwei TOP_Knoten angelegt, die mit einer TOP_Kante der Länge Null verbunden werden. an die beiden TOP_Knoten schließen also genau zwei TOP_Kanten an.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten#getKnotenname <em>Knotenname</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Knoten()
 * @model extendedMetaData="name='CTOP_Knoten' kind='elementOnly'"
 * @generated
 */
public interface TOP_Knoten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein TOP_Knoten fällt immer mit einem GEO_Knoten der Gleislinie zusammen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' reference.
	 * @see #isSetIDGEOKnoten()
	 * @see #unsetIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Knoten_IDGEOKnoten()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	GEO_Knoten getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten</em>' reference.
	 * @see #isSetIDGEOKnoten()
	 * @see #unsetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @generated
	 */
	void setIDGEOKnoten(GEO_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @generated
	 */
	void unsetIDGEOKnoten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGEO Knoten</em>' reference is set.
	 * @see #unsetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @generated
	 */
	boolean isSetIDGEOKnoten();

	/**
	 * Returns the value of the '<em><b>Knotenname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung für den Knoten. Die Bezeichnung wird aus dem DB-GIS System übernommen um die Referenz sicherzustellen. Bei Neutrassierung kann diese Bezeichnung leer bleiben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Knotenname</em>' containment reference.
	 * @see #setKnotenname(Knotenname_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getTOP_Knoten_Knotenname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Knotenname'"
	 * @generated
	 */
	Knotenname_TypeClass getKnotenname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten#getKnotenname <em>Knotenname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knotenname</em>' containment reference.
	 * @see #getKnotenname()
	 * @generated
	 */
	void setKnotenname(Knotenname_TypeClass value);

} // TOP_Knoten
