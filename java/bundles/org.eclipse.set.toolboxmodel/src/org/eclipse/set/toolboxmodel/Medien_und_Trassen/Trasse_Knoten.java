/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Medien_und_Trassen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Geodaten.GEO_Knoten;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trasse Knoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Knoten des topologischen Knoten-Kanten-Modells zur Darstellung des Kabelgefäßsystems (Kabeltrasse) oder gleichartiger Medientrassen. Der Trasse_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den Trasse_Knoten anschließenden topologischen Kanten ist je nach Art des Trasse_Knoten unterschiedlich und muss mit der Anzahl der an den zugehörigen GEO Knoten anschließenden GEO_Kanten übereinstimmen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getIDAnschlussElement <em>ID Anschluss Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getTrasseKnotenArt <em>Trasse Knoten Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Knoten()
 * @model extendedMetaData="name='CTrasse_Knoten' kind='elementOnly'"
 * @generated
 */
public interface Trasse_Knoten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anschluss Element</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Anschluss-Element, das durch den Trassen-Knoten repräsentiert wird. Der Verweis wird nicht gefüllt bei Schacht, Trassenabzweig, Trassenänderung, ggf. auch nicht bei Trassenende. Die Medientrasse kann ggf.wenige Meter vor dem Anschlusselement enden, wenn für den Weg bis zum Anschlusselement eine freie Verlegung (z. B. im Schotter) vorgesehen ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anschluss Element</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Knoten_IDAnschlussElement()
	 * @model extendedMetaData="kind='element' name='ID_Anschluss_Element'"
	 * @generated
	 */
	EList<Basis_Objekt> getIDAnschlussElement();

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen GEO_Knoten, über den mittelbar (GEO_Punkt) auch eine Verortung erfolgen kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' reference.
	 * @see #isSetIDGEOKnoten()
	 * @see #unsetIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Knoten_IDGEOKnoten()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	GEO_Knoten getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @generated
	 */
	void unsetIDGEOKnoten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Trasse Knoten Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Trassenknotens, z. B. Trassenende oder -abzweig. Beim Wechsel der Trassen(kanten)art ist ein Trassenknoten der Art "Trassenaenderung" vorzusehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trasse Knoten Art</em>' containment reference.
	 * @see #setTrasseKnotenArt(Trasse_Knoten_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Knoten_TrasseKnotenArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Trasse_Knoten_Art'"
	 * @generated
	 */
	Trasse_Knoten_Art_TypeClass getTrasseKnotenArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten#getTrasseKnotenArt <em>Trasse Knoten Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trasse Knoten Art</em>' containment reference.
	 * @see #getTrasseKnotenArt()
	 * @generated
	 */
	void setTrasseKnotenArt(Trasse_Knoten_Art_TypeClass value);

} // Trasse_Knoten
