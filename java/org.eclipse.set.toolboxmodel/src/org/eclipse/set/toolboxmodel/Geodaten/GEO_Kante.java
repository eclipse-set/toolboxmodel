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
 * A representation of the model object '<em><b>GEO Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kante des topografischen Knoten-Kanten-Modells. Die GEO_Kante ist vom GEO_Knoten A zum GEO_Knoten B gerichtet (GEO Richtungswinkel) und muss immer an zwei GEO_Knoten enden. Die Länge einer GEO_Kante zwischen den GEO_Knoten A und B entspricht der realen Gleislänge zwischen diesen Knoten und wird im Attribut GEO Laenge gespeichert. Mit Bezug auf die Regeln zu den Gleisnetzdaten (GND) ist die Länge einer GEO_Kante stets kleiner 10 km. Eine GEO_Kante besitzt eine geometrische Form, die durch GEO Form beschrieben wird. GEO_Kanten werden für die Abbildung der Gleislinie und der Kilometrierungslinie verwendet. Eine Unterscheidung dieser Anwendung erfolgt durch den Verweis ID GEO Art. Der GEO_Radius (GEO Radius A und GEO Radius B) ist negativ, wenn die GEO_Kante vom GEO_Knoten_A in einem Linksbogen führt und ist positiv, wenn diese in einen Rechtsbogen führt. Die beiden Radien sind jeweils der Radius an der A- bzw. B-Seite der GEO_Kante. Bei einem Kreisbogen wird nur der GEO Radius A angegeben. Für eine Gerade wird dieser Radius mit 0.000 definiert. Ein Algorithmus zur Darstellung eines Punktes auf einem Übergangsbogen kann der folgenden Literaturquelle entnommen werden: Media:Literatur Uebergangsbogen.pdf. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getGEOKanteAllg <em>GEO Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Kante()
 * @model extendedMetaData="name='CGEO_Kante' kind='elementOnly'"
 * @generated
 */
public interface GEO_Kante extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GEO Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GEO Kante Allg</em>' containment reference.
	 * @see #setGEOKanteAllg(GEO_Kante_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Kante_GEOKanteAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Kante_Allg'"
	 * @generated
	 */
	GEO_Kante_Allg_AttributeGroup getGEOKanteAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getGEOKanteAllg <em>GEO Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Kante Allg</em>' containment reference.
	 * @see #getGEOKanteAllg()
	 * @generated
	 */
	void setGEOKanteAllg(GEO_Kante_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Art</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch den Verweis auf eine TOP_Kante wird die GEO_Kante als Gleislinie, beim Verweis auf eine Strecke als Kilometrierungslinie und beim Verweis auf eine Trasse_Kante als Kabel- bzw. Medientrassenlinie definiert. Der Startpunkt einer TOP-Kante ist über die Verweise auf einen TOP-Knoten A und anschließend auf einen GEO-Knoten A oder GEO-Knoten B identifizierbar. Wenn der Verweis auf GEO-Knoten A fällt, liegt der Verlauf der GEO-Kante in Richtung der TOP-Kante, andernfalls in Gegenrichtung. Weitere GEO-Kanten werden mit End- und Anfangs-Knoten verbunden, bis auf den End-Knoten einer GEO-Kante wiederum von einem TOP-Knoten B verwiesen wird. DIe Verfahrensweise ist bei Trassen-Kanten analog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Art</em>' reference.
	 * @see #isSetIDGEOArt()
	 * @see #unsetIDGEOArt()
	 * @see #setIDGEOArt(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Kante_IDGEOArt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Art'"
	 * @generated
	 */
	Basis_Objekt getIDGEOArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Art</em>' reference.
	 * @see #isSetIDGEOArt()
	 * @see #unsetIDGEOArt()
	 * @see #getIDGEOArt()
	 * @generated
	 */
	void setIDGEOArt(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOArt()
	 * @see #getIDGEOArt()
	 * @see #setIDGEOArt(Basis_Objekt)
	 * @generated
	 */
	void unsetIDGEOArt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGEO Art</em>' reference is set.
	 * @see #unsetIDGEOArt()
	 * @see #getIDGEOArt()
	 * @see #setIDGEOArt(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDGEOArt();

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den GEO Knoten am Anfang der GEO Kante. Durch die Angabe des Anfangs- sowie des Endknotens wird die Richtung der GEO Kante definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten A</em>' reference.
	 * @see #isSetIDGEOKnotenA()
	 * @see #unsetIDGEOKnotenA()
	 * @see #setIDGEOKnotenA(GEO_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Kante_IDGEOKnotenA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten_A'"
	 * @generated
	 */
	GEO_Knoten getIDGEOKnotenA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten A</em>' reference.
	 * @see #isSetIDGEOKnotenA()
	 * @see #unsetIDGEOKnotenA()
	 * @see #getIDGEOKnotenA()
	 * @generated
	 */
	void setIDGEOKnotenA(GEO_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOKnotenA()
	 * @see #getIDGEOKnotenA()
	 * @see #setIDGEOKnotenA(GEO_Knoten)
	 * @generated
	 */
	void unsetIDGEOKnotenA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGEO Knoten A</em>' reference is set.
	 * @see #unsetIDGEOKnotenA()
	 * @see #getIDGEOKnotenA()
	 * @see #setIDGEOKnotenA(GEO_Knoten)
	 * @generated
	 */
	boolean isSetIDGEOKnotenA();

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den GEO Knoten am Ende der GEO Kante. Durch die Angabe des Anfangs- sowie des Endknotens wird die Richtung der GEO Kante definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten B</em>' reference.
	 * @see #isSetIDGEOKnotenB()
	 * @see #unsetIDGEOKnotenB()
	 * @see #setIDGEOKnotenB(GEO_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Kante_IDGEOKnotenB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten_B'"
	 * @generated
	 */
	GEO_Knoten getIDGEOKnotenB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten B</em>' reference.
	 * @see #isSetIDGEOKnotenB()
	 * @see #unsetIDGEOKnotenB()
	 * @see #getIDGEOKnotenB()
	 * @generated
	 */
	void setIDGEOKnotenB(GEO_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOKnotenB()
	 * @see #getIDGEOKnotenB()
	 * @see #setIDGEOKnotenB(GEO_Knoten)
	 * @generated
	 */
	void unsetIDGEOKnotenB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGEO Knoten B</em>' reference is set.
	 * @see #unsetIDGEOKnotenB()
	 * @see #getIDGEOKnotenB()
	 * @see #setIDGEOKnotenB(GEO_Knoten)
	 * @generated
	 */
	boolean isSetIDGEOKnotenB();

} // GEO_Kante
