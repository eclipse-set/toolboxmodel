/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT Fahrweg Teil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Teil des Fahrwegs, auf den sich die Informationen des Fachtelegramms beziehen. Die Fahrwegteile können außerhalb der betroffenen Fahrstraße liegen. Im Unterschied zum Fahrweg der Fahrstraße wird der Fahrwegteil nicht als Bereichsobjekt abgebildet, da in einigen Fällen kein Zielelement existiert (z. B. Übergang in Rangierbereich) oder das exakte Ende des Fahrwegteils nicht bestimmt wird (Kreuzungsweichen). Fahrwegteile mit mehreren Zielpunkten sind durch mehrere Instanzen von FT_Fahrweg_Teil abzubilden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getFTFahrwegTeilAllg <em>FT Fahrweg Teil Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielDatenpunkt <em>ID Ziel Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielSignal <em>ID Ziel Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getZielWElement <em>Ziel WElement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartDatenpunkt <em>ID Start Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartSignal <em>ID Start Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getStartWElement <em>Start WElement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil()
 * @model extendedMetaData="name='CFT_Fahrweg_Teil' kind='elementOnly'"
 * @generated
 */
public interface FT_Fahrweg_Teil extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>FT Fahrweg Teil Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FT Fahrweg Teil Allg</em>' containment reference.
	 * @see #setFTFahrwegTeilAllg(FT_Fahrweg_Teil_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_FTFahrwegTeilAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FT_Fahrweg_Teil_Allg'"
	 * @generated
	 */
	FT_Fahrweg_Teil_Allg_AttributeGroup getFTFahrwegTeilAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getFTFahrwegTeilAllg <em>FT Fahrweg Teil Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FT Fahrweg Teil Allg</em>' containment reference.
	 * @see #getFTFahrwegTeilAllg()
	 * @generated
	 */
	void setFTFahrwegTeilAllg(FT_Fahrweg_Teil_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Ziel Datenpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Datenpunkt, der als Ziel-Element zur Beschreibung des Fahrwegteils verwendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ziel Datenpunkt</em>' reference.
	 * @see #isSetIDZielDatenpunkt()
	 * @see #unsetIDZielDatenpunkt()
	 * @see #setIDZielDatenpunkt(Datenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_IDZielDatenpunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Ziel_Datenpunkt'"
	 * @generated
	 */
	Datenpunkt getIDZielDatenpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielDatenpunkt <em>ID Ziel Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ziel Datenpunkt</em>' reference.
	 * @see #isSetIDZielDatenpunkt()
	 * @see #unsetIDZielDatenpunkt()
	 * @see #getIDZielDatenpunkt()
	 * @generated
	 */
	void setIDZielDatenpunkt(Datenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielDatenpunkt <em>ID Ziel Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZielDatenpunkt()
	 * @see #getIDZielDatenpunkt()
	 * @see #setIDZielDatenpunkt(Datenpunkt)
	 * @generated
	 */
	void unsetIDZielDatenpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielDatenpunkt <em>ID Ziel Datenpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Ziel Datenpunkt</em>' reference is set.
	 * @see #unsetIDZielDatenpunkt()
	 * @see #getIDZielDatenpunkt()
	 * @see #setIDZielDatenpunkt(Datenpunkt)
	 * @generated
	 */
	boolean isSetIDZielDatenpunkt();

	/**
	 * Returns the value of the '<em><b>ID Ziel Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, das als Ziel-Element zur Beschreibung des Fahrwegteils verwendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ziel Signal</em>' reference.
	 * @see #isSetIDZielSignal()
	 * @see #unsetIDZielSignal()
	 * @see #setIDZielSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_IDZielSignal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Ziel_Signal'"
	 * @generated
	 */
	Signal getIDZielSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielSignal <em>ID Ziel Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ziel Signal</em>' reference.
	 * @see #isSetIDZielSignal()
	 * @see #unsetIDZielSignal()
	 * @see #getIDZielSignal()
	 * @generated
	 */
	void setIDZielSignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielSignal <em>ID Ziel Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZielSignal()
	 * @see #getIDZielSignal()
	 * @see #setIDZielSignal(Signal)
	 * @generated
	 */
	void unsetIDZielSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDZielSignal <em>ID Ziel Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Ziel Signal</em>' reference is set.
	 * @see #unsetIDZielSignal()
	 * @see #getIDZielSignal()
	 * @see #setIDZielSignal(Signal)
	 * @generated
	 */
	boolean isSetIDZielSignal();

	/**
	 * Returns the value of the '<em><b>Ziel WElement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ziel WElement</em>' containment reference.
	 * @see #setZielWElement(Ziel_W_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_ZielWElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ziel_W_Element'"
	 * @generated
	 */
	Ziel_W_Element_AttributeGroup getZielWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getZielWElement <em>Ziel WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ziel WElement</em>' containment reference.
	 * @see #getZielWElement()
	 * @generated
	 */
	void setZielWElement(Ziel_W_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Start Datenpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Datenpunkt, der als Start-Element zur Beschreibung des Fahrwegteils verwendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Start Datenpunkt</em>' reference.
	 * @see #isSetIDStartDatenpunkt()
	 * @see #unsetIDStartDatenpunkt()
	 * @see #setIDStartDatenpunkt(Datenpunkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_IDStartDatenpunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Start_Datenpunkt'"
	 * @generated
	 */
	Datenpunkt getIDStartDatenpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartDatenpunkt <em>ID Start Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Start Datenpunkt</em>' reference.
	 * @see #isSetIDStartDatenpunkt()
	 * @see #unsetIDStartDatenpunkt()
	 * @see #getIDStartDatenpunkt()
	 * @generated
	 */
	void setIDStartDatenpunkt(Datenpunkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartDatenpunkt <em>ID Start Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStartDatenpunkt()
	 * @see #getIDStartDatenpunkt()
	 * @see #setIDStartDatenpunkt(Datenpunkt)
	 * @generated
	 */
	void unsetIDStartDatenpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartDatenpunkt <em>ID Start Datenpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Start Datenpunkt</em>' reference is set.
	 * @see #unsetIDStartDatenpunkt()
	 * @see #getIDStartDatenpunkt()
	 * @see #setIDStartDatenpunkt(Datenpunkt)
	 * @generated
	 */
	boolean isSetIDStartDatenpunkt();

	/**
	 * Returns the value of the '<em><b>ID Start Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, das als Start-Element zur Beschreibung des Fahrwegteils verwendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Start Signal</em>' reference.
	 * @see #isSetIDStartSignal()
	 * @see #unsetIDStartSignal()
	 * @see #setIDStartSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_IDStartSignal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Start_Signal'"
	 * @generated
	 */
	Signal getIDStartSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartSignal <em>ID Start Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Start Signal</em>' reference.
	 * @see #isSetIDStartSignal()
	 * @see #unsetIDStartSignal()
	 * @see #getIDStartSignal()
	 * @generated
	 */
	void setIDStartSignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartSignal <em>ID Start Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStartSignal()
	 * @see #getIDStartSignal()
	 * @see #setIDStartSignal(Signal)
	 * @generated
	 */
	void unsetIDStartSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getIDStartSignal <em>ID Start Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Start Signal</em>' reference is set.
	 * @see #unsetIDStartSignal()
	 * @see #getIDStartSignal()
	 * @see #setIDStartSignal(Signal)
	 * @generated
	 */
	boolean isSetIDStartSignal();

	/**
	 * Returns the value of the '<em><b>Start WElement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start WElement</em>' containment reference.
	 * @see #setStartWElement(Start_W_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Fahrweg_Teil_StartWElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Start_W_Element'"
	 * @generated
	 */
	Start_W_Element_AttributeGroup getStartWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil#getStartWElement <em>Start WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start WElement</em>' containment reference.
	 * @see #getStartWElement()
	 * @generated
	 */
	void setStartWElement(Start_W_Element_AttributeGroup value);

} // FT_Fahrweg_Teil
