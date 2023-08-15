/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Richtungsanzeige</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der Vorgaben zur Richtungsanzeige bei ETCS L2. DB-Regelwerk Ril 819.1344, 4.3.3 (74)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getTextmeldung <em>Textmeldung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige()
 * @model extendedMetaData="name='CETCS_Richtungsanzeige' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Richtungsanzeige extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Fahrweg, für den die Richtungsanzeige erfolgen soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige_IDFstrFahrweg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	Fstr_Fahrweg getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(Fstr_Fahrweg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	void unsetIDFstrFahrweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Fahrweg</em>' reference is set.
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	boolean isSetIDFstrFahrweg();

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit In Richtung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die nächste Zugmeldestelle, die bei Nutzung des angegebenen Fahrwegs zu erreichen ist. DB-Regelwerk Ril 819.1344, 4.3.3 (74)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit In Richtung</em>' reference.
	 * @see #isSetIDOertlichkeitInRichtung()
	 * @see #unsetIDOertlichkeitInRichtung()
	 * @see #setIDOertlichkeitInRichtung(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige_IDOertlichkeitInRichtung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_In_Richtung'"
	 * @generated
	 */
	Oertlichkeit getIDOertlichkeitInRichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit In Richtung</em>' reference.
	 * @see #isSetIDOertlichkeitInRichtung()
	 * @see #unsetIDOertlichkeitInRichtung()
	 * @see #getIDOertlichkeitInRichtung()
	 * @generated
	 */
	void setIDOertlichkeitInRichtung(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDOertlichkeitInRichtung()
	 * @see #getIDOertlichkeitInRichtung()
	 * @see #setIDOertlichkeitInRichtung(Oertlichkeit)
	 * @generated
	 */
	void unsetIDOertlichkeitInRichtung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Oertlichkeit In Richtung</em>' reference is set.
	 * @see #unsetIDOertlichkeitInRichtung()
	 * @see #getIDOertlichkeitInRichtung()
	 * @see #setIDOertlichkeitInRichtung(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDOertlichkeitInRichtung();

	/**
	 * Returns the value of the '<em><b>Textmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textmeldung, die dem Tf angezeigt wird. Der Inhalt muss in der BAST enthalten sein oder vom Auftraggeber bereitgestellt werden. DB-Regelwerk Ril 819.1344, 4.3.3 (74)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Textmeldung</em>' containment reference.
	 * @see #setTextmeldung(Textmeldung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige_Textmeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Textmeldung'"
	 * @generated
	 */
	Textmeldung_TypeClass getTextmeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getTextmeldung <em>Textmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textmeldung</em>' containment reference.
	 * @see #getTextmeldung()
	 * @generated
	 */
	void setTextmeldung(Textmeldung_TypeClass value);

} // ETCS_Richtungsanzeige
