/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Signalgruppe Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Signalen zur ZL Signalgruppe. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, für die es im Regelwerk z. Zt. keine Vorgabe gibt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Zuordnung()
 * @model extendedMetaData="name='CZL_Signalgruppe_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface ZL_Signalgruppe_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, das der ZL_Signalgruppe zugeordnet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Zuordnung_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDSignal <em>ID Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal</em>' reference is set.
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	boolean isSetIDSignal();

	/**
	 * Returns the value of the '<em><b>IDZL Signalgruppe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZL_Signalgruppe, zu der das zugeordnete Signal gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Signalgruppe</em>' reference.
	 * @see #isSetIDZLSignalgruppe()
	 * @see #unsetIDZLSignalgruppe()
	 * @see #setIDZLSignalgruppe(ZL_Signalgruppe)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Signalgruppe'"
	 * @generated
	 */
	ZL_Signalgruppe getIDZLSignalgruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Signalgruppe</em>' reference.
	 * @see #isSetIDZLSignalgruppe()
	 * @see #unsetIDZLSignalgruppe()
	 * @see #getIDZLSignalgruppe()
	 * @generated
	 */
	void setIDZLSignalgruppe(ZL_Signalgruppe value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLSignalgruppe()
	 * @see #getIDZLSignalgruppe()
	 * @see #setIDZLSignalgruppe(ZL_Signalgruppe)
	 * @generated
	 */
	void unsetIDZLSignalgruppe();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZL Signalgruppe</em>' reference is set.
	 * @see #unsetIDZLSignalgruppe()
	 * @see #getIDZLSignalgruppe()
	 * @see #setIDZLSignalgruppe(ZL_Signalgruppe)
	 * @generated
	 */
	boolean isSetIDZLSignalgruppe();

} // ZL_Signalgruppe_Zuordnung
