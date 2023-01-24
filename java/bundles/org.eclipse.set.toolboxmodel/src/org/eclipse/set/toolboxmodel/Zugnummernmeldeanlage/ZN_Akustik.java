/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Akustik</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Akustisches Signal bei Befüllung eines ZN-Anzeigefeldes mit einer Zugnummer Bei der Planung der ZN-Akustik sind herstellerspezifische Besonderheiten zu beachten. Akustiken im Anbiete-/Annahmefeld sind Standard und nicht gesondert zu planen. Das Objekt bzw. die Attributgruppe wird bei Anbiete/Annahme- sowie Voranzeigefeldern IMMER angelegt, um die Dauer der Akustik festzulegen. Für die weiteren ZN-Anzeigefelder wird das Objekt nur dann angelegt, wenn das betreffene ZN Anzeigefeld mit einer Akustik ausgestatteet wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht vorhanden. Es findet sich im Lastenheft sowie in den firmenspezifischen Projektierungsunterlagen, die dem LST-Fachplaner nicht zur Verfügung stehen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getZNAkustikAnzeigefeld <em>ZN Akustik Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik()
 * @model extendedMetaData="name='CZN_Akustik' kind='elementOnly'"
 * @generated
 */
public interface ZN_Akustik extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ZN Akustik Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Akustik Anzeigefeld</em>' containment reference.
	 * @see #setZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_ZNAkustikAnzeigefeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Akustik_Anzeigefeld'"
	 * @generated
	 */
	ZN_Akustik_Anzeigefeld_AttributeGroup getZNAkustikAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getZNAkustikAnzeigefeld <em>ZN Akustik Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Akustik Anzeigefeld</em>' containment reference.
	 * @see #getZNAkustikAnzeigefeld()
	 * @generated
	 */
	void setZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, für die eine Akustik geplant wird, sofern keine ZN-Anzeigefeld-spezifische Planung möglich ist (herstellerabhängig). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #setIDZN(ZN)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_IDZN()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ZN getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #getIDZN()
	 * @generated
	 */
	void setIDZN(ZN value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	void unsetIDZN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZN <em>IDZN</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN</em>' reference is set.
	 * @see #unsetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	boolean isSetIDZN();

	/**
	 * Returns the value of the '<em><b>IDZN Anzeigefeld</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das ZN-Anzeigefeld, für das eine Akustik geplant wird (herstellerabhängig). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Anzeigefeld</em>' reference.
	 * @see #isSetIDZNAnzeigefeld()
	 * @see #unsetIDZNAnzeigefeld()
	 * @see #setIDZNAnzeigefeld(ZN_Anzeigefeld)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_IDZNAnzeigefeld()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Anzeigefeld'"
	 * @generated
	 */
	ZN_Anzeigefeld getIDZNAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Anzeigefeld</em>' reference.
	 * @see #isSetIDZNAnzeigefeld()
	 * @see #unsetIDZNAnzeigefeld()
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 */
	void setIDZNAnzeigefeld(ZN_Anzeigefeld value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNAnzeigefeld()
	 * @see #getIDZNAnzeigefeld()
	 * @see #setIDZNAnzeigefeld(ZN_Anzeigefeld)
	 * @generated
	 */
	void unsetIDZNAnzeigefeld();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Akustik#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN Anzeigefeld</em>' reference is set.
	 * @see #unsetIDZNAnzeigefeld()
	 * @see #getIDZNAnzeigefeld()
	 * @see #setIDZNAnzeigefeld(ZN_Anzeigefeld)
	 * @generated
	 */
	boolean isSetIDZNAnzeigefeld();

} // ZN_Akustik
