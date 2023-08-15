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
 * A representation of the model object '<em><b>Ueberhoehungslinie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Überhöhungsverlauf zwischen zwei Überhöhungspunkten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getUeberhoehungslinie()
 * @model extendedMetaData="name='CUeberhoehungslinie' kind='elementOnly'"
 * @generated
 */
public interface Ueberhoehungslinie extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Ueberhoehung A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Ueberhoehung am Anfang der Ueberhoehungslinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Ueberhoehungslinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ueberhoehung A</em>' reference.
	 * @see #isSetIDUeberhoehungA()
	 * @see #unsetIDUeberhoehungA()
	 * @see #setIDUeberhoehungA(Ueberhoehung)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getUeberhoehungslinie_IDUeberhoehungA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ueberhoehung_A'"
	 * @generated
	 */
	Ueberhoehung getIDUeberhoehungA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ueberhoehung A</em>' reference.
	 * @see #isSetIDUeberhoehungA()
	 * @see #unsetIDUeberhoehungA()
	 * @see #getIDUeberhoehungA()
	 * @generated
	 */
	void setIDUeberhoehungA(Ueberhoehung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUeberhoehungA()
	 * @see #getIDUeberhoehungA()
	 * @see #setIDUeberhoehungA(Ueberhoehung)
	 * @generated
	 */
	void unsetIDUeberhoehungA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Ueberhoehung A</em>' reference is set.
	 * @see #unsetIDUeberhoehungA()
	 * @see #getIDUeberhoehungA()
	 * @see #setIDUeberhoehungA(Ueberhoehung)
	 * @generated
	 */
	boolean isSetIDUeberhoehungA();

	/**
	 * Returns the value of the '<em><b>ID Ueberhoehung B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Ueberhoehung am Ende der Ueberhoehungslinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Ueberhoehungslinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ueberhoehung B</em>' reference.
	 * @see #isSetIDUeberhoehungB()
	 * @see #unsetIDUeberhoehungB()
	 * @see #setIDUeberhoehungB(Ueberhoehung)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getUeberhoehungslinie_IDUeberhoehungB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ueberhoehung_B'"
	 * @generated
	 */
	Ueberhoehung getIDUeberhoehungB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ueberhoehung B</em>' reference.
	 * @see #isSetIDUeberhoehungB()
	 * @see #unsetIDUeberhoehungB()
	 * @see #getIDUeberhoehungB()
	 * @generated
	 */
	void setIDUeberhoehungB(Ueberhoehung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUeberhoehungB()
	 * @see #getIDUeberhoehungB()
	 * @see #setIDUeberhoehungB(Ueberhoehung)
	 * @generated
	 */
	void unsetIDUeberhoehungB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Ueberhoehung B</em>' reference is set.
	 * @see #unsetIDUeberhoehungB()
	 * @see #getIDUeberhoehungB()
	 * @see #setIDUeberhoehungB(Ueberhoehung)
	 * @generated
	 */
	boolean isSetIDUeberhoehungB();

	/**
	 * Returns the value of the '<em><b>Ueberhoehungslinie Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ueberhoehungslinie Allg</em>' containment reference.
	 * @see #setUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getUeberhoehungslinie_UeberhoehungslinieAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehungslinie_Allg'"
	 * @generated
	 */
	Ueberhoehungslinie_Allg_AttributeGroup getUeberhoehungslinieAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehungslinie Allg</em>' containment reference.
	 * @see #getUeberhoehungslinieAllg()
	 * @generated
	 */
	void setUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup value);

} // Ueberhoehungslinie
