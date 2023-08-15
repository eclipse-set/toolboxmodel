/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

import org.eclipse.set.toolboxmodel.Geodaten.Technischer_Punkt;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusatzangaben für reale Signale im Zusammenhang mit ETCS L2.
 * Die Signalart "sonstiges Lichtsperrsignal" (sLs) für Lichtsperrsignale, an denen keine Zugstraßen beginnen oder enden, muss aus dem Fehlen entsprechender Zugstraßen abgeleitet werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSGefahrpunktabstandAbweichend <em>ETCS Gefahrpunktabstand Abweichend</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalAllg <em>ETCS Signal Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalTBV <em>ETCS Signal TBV</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt2 <em>IDETCS Gefahrpunkt2</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDHOAFBOA <em>IDHOAFBOA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal()
 * @model extendedMetaData="name='CETCS_Signal' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ETCS Gefahrpunktabstand Abweichend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des ETCS-Gefahrpunktabstands, sofern sich dieser nicht aus den Positionen von Signal und ETCS-Gefahrpunkt ermitteln lässt. Die Angabe erfolgt beispielsweise im Fall, dass ein bedingtes Ausstiegssignal eine Vorsignalfunktion für den Fahrweg in die seitliche Ausfahrt besitzt (Mehrabschnittssignal oder Hauptsignal mit Vorsignal am gleichen Standort), wobei der Abstand zum ETCS-Gefahrpunkt für dieses bedingte Ausstiegssignal auf 0 m festgesetzt werden muss. DB-Regelwerk Ril 819.1344, 4.3.2.2 (53).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Gefahrpunktabstand Abweichend</em>' containment reference.
	 * @see #setETCSGefahrpunktabstandAbweichend(ETCS_Gefahrpunktabstand_Abweichend_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSGefahrpunktabstandAbweichend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Gefahrpunktabstand_Abweichend'"
	 * @generated
	 */
	ETCS_Gefahrpunktabstand_Abweichend_TypeClass getETCSGefahrpunktabstandAbweichend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSGefahrpunktabstandAbweichend <em>ETCS Gefahrpunktabstand Abweichend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Gefahrpunktabstand Abweichend</em>' containment reference.
	 * @see #getETCSGefahrpunktabstandAbweichend()
	 * @generated
	 */
	void setETCSGefahrpunktabstandAbweichend(ETCS_Gefahrpunktabstand_Abweichend_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ETCS Signal Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Signal Allg</em>' containment reference.
	 * @see #setETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSSignalAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal_Allg'"
	 * @generated
	 */
	ETCS_Signal_Allg_AttributeGroup getETCSSignalAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalAllg <em>ETCS Signal Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Signal Allg</em>' containment reference.
	 * @see #getETCSSignalAllg()
	 * @generated
	 */
	void setETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ETCS Signal DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Signal DWeg</em>' containment reference.
	 * @see #setETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSSignalDWeg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal_DWeg'"
	 * @generated
	 */
	ETCS_Signal_DWeg_AttributeGroup getETCSSignalDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Signal DWeg</em>' containment reference.
	 * @see #getETCSSignalDWeg()
	 * @generated
	 */
	void setETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ETCS Signal TBV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Signal TBV</em>' containment reference.
	 * @see #setETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSSignalTBV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal_TBV'"
	 * @generated
	 */
	ETCS_Signal_TBV_AttributeGroup getETCSSignalTBV();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalTBV <em>ETCS Signal TBV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Signal TBV</em>' containment reference.
	 * @see #getETCSSignalTBV()
	 * @generated
	 */
	void setETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDETCS Gefahrpunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des ETCS-Gefahrpunkts (Danger Point).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Gefahrpunkt</em>' reference.
	 * @see #isSetIDETCSGefahrpunkt()
	 * @see #unsetIDETCSGefahrpunkt()
	 * @see #setIDETCSGefahrpunkt(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDETCSGefahrpunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Gefahrpunkt'"
	 * @generated
	 */
	Markanter_Punkt getIDETCSGefahrpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Gefahrpunkt</em>' reference.
	 * @see #isSetIDETCSGefahrpunkt()
	 * @see #unsetIDETCSGefahrpunkt()
	 * @see #getIDETCSGefahrpunkt()
	 * @generated
	 */
	void setIDETCSGefahrpunkt(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDETCSGefahrpunkt()
	 * @see #getIDETCSGefahrpunkt()
	 * @see #setIDETCSGefahrpunkt(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDETCSGefahrpunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDETCS Gefahrpunkt</em>' reference is set.
	 * @see #unsetIDETCSGefahrpunkt()
	 * @see #getIDETCSGefahrpunkt()
	 * @see #setIDETCSGefahrpunkt(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDETCSGefahrpunkt();

	/**
	 * Returns the value of the '<em><b>IDETCS Gefahrpunkt2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe eines zusätzlichen ETCS-Gefahrpunkts (Danger Point), wenn der Abstand zum (ersten) ETCS-Gefahrpunkt kürzer als 50 m ist. DB-Regelwerk Ril 819.1344, 3.3.2.2 (53)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Gefahrpunkt2</em>' reference.
	 * @see #isSetIDETCSGefahrpunkt2()
	 * @see #unsetIDETCSGefahrpunkt2()
	 * @see #setIDETCSGefahrpunkt2(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDETCSGefahrpunkt2()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Gefahrpunkt_2'"
	 * @generated
	 */
	Markanter_Punkt getIDETCSGefahrpunkt2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt2 <em>IDETCS Gefahrpunkt2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Gefahrpunkt2</em>' reference.
	 * @see #isSetIDETCSGefahrpunkt2()
	 * @see #unsetIDETCSGefahrpunkt2()
	 * @see #getIDETCSGefahrpunkt2()
	 * @generated
	 */
	void setIDETCSGefahrpunkt2(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt2 <em>IDETCS Gefahrpunkt2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDETCSGefahrpunkt2()
	 * @see #getIDETCSGefahrpunkt2()
	 * @see #setIDETCSGefahrpunkt2(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDETCSGefahrpunkt2();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt2 <em>IDETCS Gefahrpunkt2</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDETCS Gefahrpunkt2</em>' reference is set.
	 * @see #unsetIDETCSGefahrpunkt2()
	 * @see #getIDETCSGefahrpunkt2()
	 * @see #setIDETCSGefahrpunkt2(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDETCSGefahrpunkt2();

	/**
	 * Returns the value of the '<em><b>IDHOAFBOA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Heißläuferortungs- oder Festbremsortungsanlage, wenn dieses Signal als HOA/FBOA-Stellort definiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDHOAFBOA</em>' reference.
	 * @see #isSetIDHOAFBOA()
	 * @see #unsetIDHOAFBOA()
	 * @see #setIDHOAFBOA(Technischer_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDHOAFBOA()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_HOA_FBOA'"
	 * @generated
	 */
	Technischer_Punkt getIDHOAFBOA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDHOAFBOA <em>IDHOAFBOA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDHOAFBOA</em>' reference.
	 * @see #isSetIDHOAFBOA()
	 * @see #unsetIDHOAFBOA()
	 * @see #getIDHOAFBOA()
	 * @generated
	 */
	void setIDHOAFBOA(Technischer_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDHOAFBOA <em>IDHOAFBOA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDHOAFBOA()
	 * @see #getIDHOAFBOA()
	 * @see #setIDHOAFBOA(Technischer_Punkt)
	 * @generated
	 */
	void unsetIDHOAFBOA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDHOAFBOA <em>IDHOAFBOA</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDHOAFBOA</em>' reference is set.
	 * @see #unsetIDHOAFBOA()
	 * @see #getIDHOAFBOA()
	 * @see #setIDHOAFBOA(Technischer_Punkt)
	 * @generated
	 */
	boolean isSetIDHOAFBOA();

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das RBC, dem das Signal zugeordnet ist. Die Angabe ist bei vereinfachter ETCS-Ausrüstung nicht erforderlich. Signale die keinem RBC zugeordnet sind (aber ein Ne 14 haben), bekommen in der MUKA Signale die Fußnote "Signal nicht in RBC-Anschaltung".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDRBC()
	 * @model extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<RBC> getIDRBC();

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDSignal <em>ID Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal</em>' reference is set.
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	boolean isSetIDSignal();

} // ETCS_Signal
