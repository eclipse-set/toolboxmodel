/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;

import org.eclipse.set.toolboxmodel.Signale.Signal;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr Anstoss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit ZL_Fstr_Anstoss wird für eine Fahrstrasse der Zuglenkung der Anstosspunkt gebildet. Die für diese ZL-Fahrstraße relevante(n) Geschwindigkeitsklasse(n) (GK) wird/werden über die entsprechende Attributgruppe zugeordnet. DB-Regelwerk 819.0732 11 In der Tabelle der Zuglenkanstöße findet sich die Angabe in der Spalte "EP-MO".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossGK <em>ZL Fstr Anstoss GK</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss()
 * @model extendedMetaData="name='CZL_Fstr_Anstoss' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr_Anstoss extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Vorsignal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standort der Vorsignalisierung des zu lenkenden Hauptsignals. Die Angabe ist notwendig für die Ermittlung des Sichtpunkts bei vorgegebener Sichtzeit. Es wird aus dem Objekt der Standort (km, Stationierung) benötigt. Der Verweis kann entfallen, wenn der Zug erst am zu lenkenden Hauptsignal startet oder das Startsignal ein LZB-Blockkennzeichen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Vorsignal</em>' reference.
	 * @see #isSetIDVorsignal()
	 * @see #unsetIDVorsignal()
	 * @see #setIDVorsignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDVorsignal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Vorsignal'"
	 * @generated
	 */
	Signal getIDVorsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Vorsignal</em>' reference.
	 * @see #isSetIDVorsignal()
	 * @see #unsetIDVorsignal()
	 * @see #getIDVorsignal()
	 * @generated
	 */
	void setIDVorsignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDVorsignal()
	 * @see #getIDVorsignal()
	 * @see #setIDVorsignal(Signal)
	 * @generated
	 */
	void unsetIDVorsignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Vorsignal</em>' reference is set.
	 * @see #unsetIDVorsignal()
	 * @see #getIDVorsignal()
	 * @see #setIDVorsignal(Signal)
	 * @generated
	 */
	boolean isSetIDVorsignal();

	/**
	 * Returns the value of the '<em><b>IDZL Fstr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verlinkung, zu welcher ZL_Fstr dieser Anstoß gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Fstr</em>' reference.
	 * @see #isSetIDZLFstr()
	 * @see #unsetIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDZLFstr()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Fstr'"
	 * @generated
	 */
	ZL_Fstr getIDZLFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Fstr</em>' reference.
	 * @see #isSetIDZLFstr()
	 * @see #unsetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @generated
	 */
	void setIDZLFstr(ZL_Fstr value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @generated
	 */
	void unsetIDZLFstr();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZL Fstr</em>' reference is set.
	 * @see #unsetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @generated
	 */
	boolean isSetIDZLFstr();

	/**
	 * Returns the value of the '<em><b>ZL Fstr Anstoss Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Fstr Anstoss Allg</em>' containment reference.
	 * @see #setZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_ZLFstrAnstossAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Anstoss_Allg'"
	 * @generated
	 */
	ZL_Fstr_Anstoss_Allg_AttributeGroup getZLFstrAnstossAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Fstr Anstoss Allg</em>' containment reference.
	 * @see #getZLFstrAnstossAllg()
	 * @generated
	 */
	void setZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZL Fstr Anstoss GK</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Fstr Anstoss GK</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_ZLFstrAnstossGK()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Anstoss_GK'"
	 * @generated
	 */
	EList<ZL_Fstr_Anstoss_GK_AttributeGroup> getZLFstrAnstossGK();

	/**
	 * Returns the value of the '<em><b>ID Einschaltpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Schaltmittel, welches als Anstoß für die ZL-Fahrstraße ausgewertet wird. Der Standort bzw. die Stationierung geht in die Berechnung einer Verzögerungszeit ein. Das Attribut ist optional, da nicht für jede ZL-Fahrstraße ein Schaltmittel ausgewählt werden kann (z. B. an Stellbereichsgrenzen). In dem Fall ist ein ZN_Anzeigefeld als Anstoßkriterium festzulegen. Einer von beiden Verweisen (ID_Einschaltpunkt oder ID ZN Anzeigefeld Anstoss) muss immer gefüllt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Einschaltpunkt</em>' reference.
	 * @see #isSetIDEinschaltpunkt()
	 * @see #unsetIDEinschaltpunkt()
	 * @see #setIDEinschaltpunkt(Schaltmittel_Zuordnung)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDEinschaltpunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Einschaltpunkt'"
	 * @generated
	 */
	Schaltmittel_Zuordnung getIDEinschaltpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Einschaltpunkt</em>' reference.
	 * @see #isSetIDEinschaltpunkt()
	 * @see #unsetIDEinschaltpunkt()
	 * @see #getIDEinschaltpunkt()
	 * @generated
	 */
	void setIDEinschaltpunkt(Schaltmittel_Zuordnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDEinschaltpunkt()
	 * @see #getIDEinschaltpunkt()
	 * @see #setIDEinschaltpunkt(Schaltmittel_Zuordnung)
	 * @generated
	 */
	void unsetIDEinschaltpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Einschaltpunkt</em>' reference is set.
	 * @see #unsetIDEinschaltpunkt()
	 * @see #getIDEinschaltpunkt()
	 * @see #setIDEinschaltpunkt(Schaltmittel_Zuordnung)
	 * @generated
	 */
	boolean isSetIDEinschaltpunkt();

	/**
	 * Returns the value of the '<em><b>IDZN Anzeigefeld Anstoss</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das ZN Anzeigefeld, aus dem der Anstoß der ZL ausgelöst wird. Das Attribut ist optional, falls für einen ZL-Anstoß kein geeignetes ZN-Anzeigefeld zur Verfügung steht. In dem Fall ist ein Schaltmittel als Anstoßkriterium festzulegen. Einer von beiden Verweisen (ID Einschaltpunkt oder ID_ZN_Anzeigefeld_Anstoss) muss immer gefüllt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Anzeigefeld Anstoss</em>' reference.
	 * @see #isSetIDZNAnzeigefeldAnstoss()
	 * @see #unsetIDZNAnzeigefeldAnstoss()
	 * @see #setIDZNAnzeigefeldAnstoss(ZN_Anzeigefeld)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Anzeigefeld_Anstoss'"
	 * @generated
	 */
	ZN_Anzeigefeld getIDZNAnzeigefeldAnstoss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Anzeigefeld Anstoss</em>' reference.
	 * @see #isSetIDZNAnzeigefeldAnstoss()
	 * @see #unsetIDZNAnzeigefeldAnstoss()
	 * @see #getIDZNAnzeigefeldAnstoss()
	 * @generated
	 */
	void setIDZNAnzeigefeldAnstoss(ZN_Anzeigefeld value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNAnzeigefeldAnstoss()
	 * @see #getIDZNAnzeigefeldAnstoss()
	 * @see #setIDZNAnzeigefeldAnstoss(ZN_Anzeigefeld)
	 * @generated
	 */
	void unsetIDZNAnzeigefeldAnstoss();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN Anzeigefeld Anstoss</em>' reference is set.
	 * @see #unsetIDZNAnzeigefeldAnstoss()
	 * @see #getIDZNAnzeigefeldAnstoss()
	 * @see #setIDZNAnzeigefeldAnstoss(ZN_Anzeigefeld)
	 * @generated
	 */
	boolean isSetIDZNAnzeigefeldAnstoss();

} // ZL_Fstr_Anstoss
