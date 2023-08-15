/**
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
 * A representation of the model object '<em><b>ZN Telegramm 85 Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt, welches die Verbindung zwischen ZN und ggf. der einzelnen Fahrstraße herstellt, für die das Telegramm 85 gesendet werden soll. Herstellerbezogen kann die Sendung des Telegramms 85 für jede einzelne Fahrstraße oder nur für alle Fahrstraßen programmiert werden. DB-Regelwerk 819.0731A02 1 (5) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getTelegramm85AlleFstr <em>Telegramm85 Alle Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getTelegramm85EinzelneFstr <em>Telegramm85 Einzelne Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Telegramm_85_Zuordnung()
 * @model extendedMetaData="name='CZN_Telegramm_85_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface ZN_Telegramm_85_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, von der das Telegramm 85 generiert und auf den ZLV-Bus gesandt wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #setIDZN(ZN)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Telegramm_85_Zuordnung_IDZN()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ZN getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getIDZN <em>IDZN</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	void unsetIDZN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getIDZN <em>IDZN</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Telegramm85 Alle Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telegramm85 Alle Fstr</em>' containment reference.
	 * @see #setTelegramm85AlleFstr(Telegramm_85_Alle_Fstr_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Telegramm_85_Zuordnung_Telegramm85AlleFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_85_Alle_Fstr'"
	 * @generated
	 */
	Telegramm_85_Alle_Fstr_AttributeGroup getTelegramm85AlleFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getTelegramm85AlleFstr <em>Telegramm85 Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm85 Alle Fstr</em>' containment reference.
	 * @see #getTelegramm85AlleFstr()
	 * @generated
	 */
	void setTelegramm85AlleFstr(Telegramm_85_Alle_Fstr_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Telegramm85 Einzelne Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Telegramm85 Einzelne Fstr</em>' containment reference.
	 * @see #setTelegramm85EinzelneFstr(Telegramm_85_Einzelne_Fstr_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Telegramm_85_Zuordnung_Telegramm85EinzelneFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_85_Einzelne_Fstr'"
	 * @generated
	 */
	Telegramm_85_Einzelne_Fstr_AttributeGroup getTelegramm85EinzelneFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Telegramm_85_Zuordnung#getTelegramm85EinzelneFstr <em>Telegramm85 Einzelne Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm85 Einzelne Fstr</em>' containment reference.
	 * @see #getTelegramm85EinzelneFstr()
	 * @generated
	 */
	void setTelegramm85EinzelneFstr(Telegramm_85_Einzelne_Fstr_AttributeGroup value);

} // ZN_Telegramm_85_Zuordnung
