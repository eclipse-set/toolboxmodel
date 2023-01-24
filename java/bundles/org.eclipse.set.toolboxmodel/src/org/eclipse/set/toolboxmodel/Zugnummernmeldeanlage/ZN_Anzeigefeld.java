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

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Anzeigefeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt, welches die Funktionalitäten der ZN auf der Bedienoberfläche abbildet. Für jedes Gleis, in denen die ZN-Anlage Zugnummern verwalten und/oder anzeigen soll, ist mindestens ein ZN-Anzeigefeld zu definieren. Hinsichtlich der Besonderheiten bei der Bezeichnug wird auf die Ausführungen auf der Seite Bezeichnung ZN-Anzeigefeld verwiesen. DB-Regelwerk 819.0731 6 (1) bis (15) sowie (19) ff 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldAllg <em>ZN Anzeigefeld Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldBezeichnung <em>ZN Anzeigefeld Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld()
 * @model extendedMetaData="name='CZN_Anzeigefeld' kind='elementOnly'"
 * @generated
 */
public interface ZN_Anzeigefeld extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen Gleisabschnitt, in dem das ZN-Anzeigefeld auf der Bedienoberfläche angeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt</em>' reference.
	 * @see #isSetIDGleisAbschnitt()
	 * @see #unsetIDGleisAbschnitt()
	 * @see #setIDGleisAbschnitt(Gleis_Abschnitt)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDGleisAbschnitt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt'"
	 * @generated
	 */
	Gleis_Abschnitt getIDGleisAbschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Abschnitt</em>' reference.
	 * @see #isSetIDGleisAbschnitt()
	 * @see #unsetIDGleisAbschnitt()
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 */
	void setIDGleisAbschnitt(Gleis_Abschnitt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGleisAbschnitt()
	 * @see #getIDGleisAbschnitt()
	 * @see #setIDGleisAbschnitt(Gleis_Abschnitt)
	 * @generated
	 */
	void unsetIDGleisAbschnitt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Gleis Abschnitt</em>' reference is set.
	 * @see #unsetIDGleisAbschnitt()
	 * @see #getIDGleisAbschnitt()
	 * @see #setIDGleisAbschnitt(Gleis_Abschnitt)
	 * @generated
	 */
	boolean isSetIDGleisAbschnitt();

	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den oder die ZLV_Bus(se), auf den/die das Anzeigefeld durchgereicht wird. Der Verweis wird nur im Falle einer Durchreichung gefüllt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDZLVBus()
	 * @model extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	EList<ZLV_Bus> getIDZLVBus();

	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, zu der das ZN-Anzeigefeld gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' reference.
	 * @see #isSetIDZN()
	 * @see #unsetIDZN()
	 * @see #setIDZN(ZN)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDZN()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ZN getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZN <em>IDZN</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZN <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZN()
	 * @see #getIDZN()
	 * @see #setIDZN(ZN)
	 * @generated
	 */
	void unsetIDZN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZN <em>IDZN</em>}' reference is set.
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
	 * Verweis auf ein zugehöriges ZN-Anzeigefeld, z. B. bei der Anordnung von Voranzeige- oder Anbiete-/Annahmefeldern. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Anzeigefeld</em>' reference.
	 * @see #isSetIDZNAnzeigefeld()
	 * @see #unsetIDZNAnzeigefeld()
	 * @see #setIDZNAnzeigefeld(ZN_Anzeigefeld)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDZNAnzeigefeld()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Anzeigefeld'"
	 * @generated
	 */
	ZN_Anzeigefeld getIDZNAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNAnzeigefeld()
	 * @see #getIDZNAnzeigefeld()
	 * @see #setIDZNAnzeigefeld(ZN_Anzeigefeld)
	 * @generated
	 */
	void unsetIDZNAnzeigefeld();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN Anzeigefeld</em>' reference is set.
	 * @see #unsetIDZNAnzeigefeld()
	 * @see #getIDZNAnzeigefeld()
	 * @see #setIDZNAnzeigefeld(ZN_Anzeigefeld)
	 * @generated
	 */
	boolean isSetIDZNAnzeigefeld();

	/**
	 * Returns the value of the '<em><b>ZN Anzeigefeld Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Anzeigefeld Allg</em>' containment reference.
	 * @see #setZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_ZNAnzeigefeldAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Anzeigefeld_Allg'"
	 * @generated
	 */
	ZN_Anzeigefeld_Allg_AttributeGroup getZNAnzeigefeldAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldAllg <em>ZN Anzeigefeld Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Anzeigefeld Allg</em>' containment reference.
	 * @see #getZNAnzeigefeldAllg()
	 * @generated
	 */
	void setZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZN Anzeigefeld Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Anzeigefeld Bezeichnung</em>' containment reference.
	 * @see #setZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_ZNAnzeigefeldBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Anzeigefeld_Bezeichnung'"
	 * @generated
	 */
	ZN_Anzeigefeld_Bezeichnung_AttributeGroup getZNAnzeigefeldBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldBezeichnung <em>ZN Anzeigefeld Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Anzeigefeld Bezeichnung</em>' containment reference.
	 * @see #getZNAnzeigefeldBezeichnung()
	 * @generated
	 */
	void setZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup value);

} // ZN_Anzeigefeld
