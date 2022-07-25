/**
 */
package org.eclipse.set.toolboxmodel.PZB;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Zuordnung Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Objekt dient der Zuordnung der Signale (Vorsignal, Vorsignalwiederholer, H-Tafel) zum maßgebenden Gleismagneten (GM) 2000 Hz des Hauptsignals. Die Unterscheidung zwischen den verschiedenen Signalen wird über die GUID des Signals hergestellt. Der angegebene Abstand bezieht sich beim Vorsignal auf den Abstand des GM 1000 Hz, bei Vorsignalwiederholer und H-Tafel auf den Abstand des Signals zum maßgebenden GM 2000 Hz des Hauptsignals. Es werden in der Regel bis zu vier H-Tafeln pro Hauptsignal geplant. DB-Regelwerk Gleismagnettabelle, Zeilen 19 sowie 21 bis 25 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Zuordnung_Signal()
 * @model extendedMetaData="name='CPZB_Zuordnung_Signal' kind='elementOnly'"
 * @generated
 */
public interface PZB_Zuordnung_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDPZB Element Zuordnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt PZB_Element_Zuordnung, zur Angabe des zugehörigen Signals. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Zuordnung</em>' reference.
	 * @see #isSetIDPZBElementZuordnung()
	 * @see #unsetIDPZBElementZuordnung()
	 * @see #setIDPZBElementZuordnung(PZB_Element_Zuordnung)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Zuordnung_Signal_IDPZBElementZuordnung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Zuordnung'"
	 * @generated
	 */
	PZB_Element_Zuordnung getIDPZBElementZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Zuordnung</em>' reference.
	 * @see #isSetIDPZBElementZuordnung()
	 * @see #unsetIDPZBElementZuordnung()
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 */
	void setIDPZBElementZuordnung(PZB_Element_Zuordnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDPZBElementZuordnung()
	 * @see #getIDPZBElementZuordnung()
	 * @see #setIDPZBElementZuordnung(PZB_Element_Zuordnung)
	 * @generated
	 */
	void unsetIDPZBElementZuordnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDPZB Element Zuordnung</em>' reference is set.
	 * @see #unsetIDPZBElementZuordnung()
	 * @see #getIDPZBElementZuordnung()
	 * @see #setIDPZBElementZuordnung(PZB_Element_Zuordnung)
	 * @generated
	 */
	boolean isSetIDPZBElementZuordnung();

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des zugeordneten Signals (Vorsignal, Vorsignalwiederholer, H-Tafel), welches im Rahmen der INA-Berechnung dem Hauptsignal zugeordet wird und damit mit diesem im festen Zusammenhang steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Zuordnung_Signal_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Zuordnung_Signal#getIDSignal <em>ID Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal</em>' reference is set.
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	boolean isSetIDSignal();

} // PZB_Zuordnung_Signal
