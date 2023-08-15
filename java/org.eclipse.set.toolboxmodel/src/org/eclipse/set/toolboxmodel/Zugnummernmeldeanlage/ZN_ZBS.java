/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN ZBS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der Parameter für die Anbindung einer ZN an die BZ. Der Verweis auf ID ESTW Zentraleinheit beschreibt den Ort der räumlichen Unterbringung der Koppelunterstation. Bei der Bearbeitung im Planungstool kann es notwendig sein, bereits bei Bearbeitung im Dialogfeld ZN-ZBS den Verweis auf die ESTW_Zentraleinheit zu befüllen. DB-Regelwerk 819.0731 6 (16) Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIPAdresse <em>IP Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getZBSSchnittstelle <em>ZBS Schnittstelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS()
 * @model extendedMetaData="name='CZN_ZBS' kind='elementOnly'"
 * @generated
 */
public interface ZN_ZBS extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDESTW Zentraleinheit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Ort der räumlichen Unterbringung der Koppelunterstation 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_IDESTWZentraleinheit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ESTW_Zentraleinheit'"
	 * @generated
	 */
	ESTW_Zentraleinheit getIDESTWZentraleinheit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 */
	void setIDESTWZentraleinheit(ESTW_Zentraleinheit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	void unsetIDESTWZentraleinheit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDESTW Zentraleinheit</em>' reference is set.
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	boolean isSetIDESTWZentraleinheit();

	/**
	 * Returns the value of the '<em><b>IP Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP_Adresse des COM-Servers gemäß Ril 819.0705. Der Planungsfall tritt ein, wenn eine ZBS-Verbindung zwischen ZN Unterstation und BZ zu planen ist. DB-Regelwerk 819.0731A05 819.0705 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adresse</em>' containment reference.
	 * @see #setIPAdresse(IP_Adresse_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_IPAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IP_Adresse'"
	 * @generated
	 */
	IP_Adresse_TypeClass getIPAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIPAdresse <em>IP Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adresse</em>' containment reference.
	 * @see #getIPAdresse()
	 * @generated
	 */
	void setIPAdresse(IP_Adresse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Schnittstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modem, welches die Verbindung zwischen ZN Unterstation und ZBS für die Datenkommunikation herstellt. Bei Auswahl von "sonstige" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk 819.0731A04 2 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS Schnittstelle</em>' containment reference.
	 * @see #setZBSSchnittstelle(ZBS_Schnittstelle_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_ZBSSchnittstelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZBS_Schnittstelle'"
	 * @generated
	 */
	ZBS_Schnittstelle_TypeClass getZBSSchnittstelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getZBSSchnittstelle <em>ZBS Schnittstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Schnittstelle</em>' containment reference.
	 * @see #getZBSSchnittstelle()
	 * @generated
	 */
	void setZBSSchnittstelle(ZBS_Schnittstelle_TypeClass value);

} // ZN_ZBS
