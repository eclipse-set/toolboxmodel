/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
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
 * Zusatzangaben für Signale im Zusammenhang mit ETCS L2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalAllg <em>ETCS Signal Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalTBV <em>ETCS Signal TBV</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}</li>
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
	 * Bei Einfahr-, Block- und Deckungssignalen ist der ETCS-Gefahrpunkt identisch mit dem Gefahrpunkt aus der Stellwerksplanung und somit hier nicht anzugeben.
	 * Bei Ausfahr- und Zwischensignalen ist der ETCS-Gefahrpunkt zu planen (bei vorhandener INA-Berechnung entspricht er meist der maßgebenden Gefahrstelle).
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
	 * Verweis auf das RBC, dem das Signal zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDRBC()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
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
