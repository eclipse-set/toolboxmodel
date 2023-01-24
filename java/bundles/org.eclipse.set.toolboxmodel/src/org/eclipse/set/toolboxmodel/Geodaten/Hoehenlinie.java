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
 * A representation of the model object '<em><b>Hoehenlinie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Höhenverlauf zwischen zwei Höhenpunkten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getHoehenlinie()
 * @model extendedMetaData="name='CHoehenlinie' kind='elementOnly'"
 * @generated
 */
public interface Hoehenlinie extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Hoehenlinie Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hoehenlinie Allg</em>' containment reference.
	 * @see #setHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getHoehenlinie_HoehenlinieAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenlinie_Allg'"
	 * @generated
	 */
	Hoehenlinie_Allg_AttributeGroup getHoehenlinieAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenlinie Allg</em>' containment reference.
	 * @see #getHoehenlinieAllg()
	 * @generated
	 */
	void setHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Hoehenpunkt A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Hoehenpunkt am Anfang der Hoehenlinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Hoehenlinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Hoehenpunkt A</em>' reference.
	 * @see #isSetIDHoehenpunktA()
	 * @see #unsetIDHoehenpunktA()
	 * @see #setIDHoehenpunktA(Hoehenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getHoehenlinie_IDHoehenpunktA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Hoehenpunkt_A'"
	 * @generated
	 */
	Hoehenpunkt getIDHoehenpunktA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Hoehenpunkt A</em>' reference.
	 * @see #isSetIDHoehenpunktA()
	 * @see #unsetIDHoehenpunktA()
	 * @see #getIDHoehenpunktA()
	 * @generated
	 */
	void setIDHoehenpunktA(Hoehenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDHoehenpunktA()
	 * @see #getIDHoehenpunktA()
	 * @see #setIDHoehenpunktA(Hoehenpunkt)
	 * @generated
	 */
	void unsetIDHoehenpunktA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Hoehenpunkt A</em>' reference is set.
	 * @see #unsetIDHoehenpunktA()
	 * @see #getIDHoehenpunktA()
	 * @see #setIDHoehenpunktA(Hoehenpunkt)
	 * @generated
	 */
	boolean isSetIDHoehenpunktA();

	/**
	 * Returns the value of the '<em><b>ID Hoehenpunkt B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Hoehenpunkt am Ende der Hoehenlinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Hoehenlinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Hoehenpunkt B</em>' reference.
	 * @see #isSetIDHoehenpunktB()
	 * @see #unsetIDHoehenpunktB()
	 * @see #setIDHoehenpunktB(Hoehenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getHoehenlinie_IDHoehenpunktB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Hoehenpunkt_B'"
	 * @generated
	 */
	Hoehenpunkt getIDHoehenpunktB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Hoehenpunkt B</em>' reference.
	 * @see #isSetIDHoehenpunktB()
	 * @see #unsetIDHoehenpunktB()
	 * @see #getIDHoehenpunktB()
	 * @generated
	 */
	void setIDHoehenpunktB(Hoehenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDHoehenpunktB()
	 * @see #getIDHoehenpunktB()
	 * @see #setIDHoehenpunktB(Hoehenpunkt)
	 * @generated
	 */
	void unsetIDHoehenpunktB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Hoehenpunkt B</em>' reference is set.
	 * @see #unsetIDHoehenpunktB()
	 * @see #getIDHoehenpunktB()
	 * @see #setIDHoehenpunktB(Hoehenpunkt)
	 * @generated
	 */
	boolean isSetIDHoehenpunktB();

} // Hoehenlinie
