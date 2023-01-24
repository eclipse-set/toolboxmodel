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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trasse Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kante des topologischen Knoten-Kanten-Modells zur Darstellung des Kabelgefäßsystems (Kabeltrasse) oder gleichartiger Medientrassen. Die Trasse Kante ist vom Knoten A zum Knoten B gerichtet und muss immer an zwei Trasse Knoten enden. Der geometrische Verlauf einer Trasse_Kante kann durch eine oder mehrere GEO_Kanten beschrieben werden (siehe auch TOP_Kante).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenA <em>ID Trasse Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenB <em>ID Trasse Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getTrasseKanteArt <em>Trasse Kante Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getTrasseNutzer <em>Trasse Nutzer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Kante()
 * @model extendedMetaData="name='CTrasse_Kante' kind='elementOnly'"
 * @generated
 */
public interface Trasse_Kante extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Trasse Knoten A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Trasse Knoten am Anfang der Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Trasse Knoten A</em>' reference.
	 * @see #isSetIDTrasseKnotenA()
	 * @see #unsetIDTrasseKnotenA()
	 * @see #setIDTrasseKnotenA(Trasse_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Kante_IDTrasseKnotenA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Trasse_Knoten_A'"
	 * @generated
	 */
	Trasse_Knoten getIDTrasseKnotenA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenA <em>ID Trasse Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Trasse Knoten A</em>' reference.
	 * @see #isSetIDTrasseKnotenA()
	 * @see #unsetIDTrasseKnotenA()
	 * @see #getIDTrasseKnotenA()
	 * @generated
	 */
	void setIDTrasseKnotenA(Trasse_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenA <em>ID Trasse Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDTrasseKnotenA()
	 * @see #getIDTrasseKnotenA()
	 * @see #setIDTrasseKnotenA(Trasse_Knoten)
	 * @generated
	 */
	void unsetIDTrasseKnotenA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenA <em>ID Trasse Knoten A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Trasse Knoten A</em>' reference is set.
	 * @see #unsetIDTrasseKnotenA()
	 * @see #getIDTrasseKnotenA()
	 * @see #setIDTrasseKnotenA(Trasse_Knoten)
	 * @generated
	 */
	boolean isSetIDTrasseKnotenA();

	/**
	 * Returns the value of the '<em><b>ID Trasse Knoten B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Trasse Knoten am Ende der Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Trasse Knoten B</em>' reference.
	 * @see #isSetIDTrasseKnotenB()
	 * @see #unsetIDTrasseKnotenB()
	 * @see #setIDTrasseKnotenB(Trasse_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Kante_IDTrasseKnotenB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Trasse_Knoten_B'"
	 * @generated
	 */
	Trasse_Knoten getIDTrasseKnotenB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenB <em>ID Trasse Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Trasse Knoten B</em>' reference.
	 * @see #isSetIDTrasseKnotenB()
	 * @see #unsetIDTrasseKnotenB()
	 * @see #getIDTrasseKnotenB()
	 * @generated
	 */
	void setIDTrasseKnotenB(Trasse_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenB <em>ID Trasse Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDTrasseKnotenB()
	 * @see #getIDTrasseKnotenB()
	 * @see #setIDTrasseKnotenB(Trasse_Knoten)
	 * @generated
	 */
	void unsetIDTrasseKnotenB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getIDTrasseKnotenB <em>ID Trasse Knoten B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Trasse Knoten B</em>' reference is set.
	 * @see #unsetIDTrasseKnotenB()
	 * @see #getIDTrasseKnotenB()
	 * @see #setIDTrasseKnotenB(Trasse_Knoten)
	 * @generated
	 */
	boolean isSetIDTrasseKnotenB();

	/**
	 * Returns the value of the '<em><b>Trasse Kante Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Medientrasse (z. B. Luft- oder Trogtrasse).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trasse Kante Art</em>' containment reference.
	 * @see #setTrasseKanteArt(Trasse_Kante_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Kante_TrasseKanteArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Trasse_Kante_Art'"
	 * @generated
	 */
	Trasse_Kante_Art_TypeClass getTrasseKanteArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante#getTrasseKanteArt <em>Trasse Kante Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trasse Kante Art</em>' containment reference.
	 * @see #getTrasseKanteArt()
	 * @generated
	 */
	void setTrasseKanteArt(Trasse_Kante_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Trasse Nutzer</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Nutzer_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nutzer der Medientrasse, z. B. DB Netz. Eine Trasse kann von mehreren Nutzern beansprucht werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trasse Nutzer</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getTrasse_Kante_TrasseNutzer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Trasse_Nutzer'"
	 * @generated
	 */
	EList<Trasse_Nutzer_TypeClass> getTrasseNutzer();

} // Trasse_Kante
