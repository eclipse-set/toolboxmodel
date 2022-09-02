/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Deckendes Signal Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das Zuordnungsobjekt BUE_Deckendes_Signal bildet die diesbezügliche Angabe in der Signaltabelle 1 sowie in der Einschaltstreckenberechnung ab. Die Angaben in der Signaltabelle 1 sowie in der Einschaltstreckenberechnung beziehen sich auf das deckende Signal (Haupt-/LS-Signal) und nicht auf die den BÜ-Schließvorgang anstoßende Fahrstraße. DB-Regelwerk Signaltabelle 1, Zeile 33 und 34 Einschaltstreckenberechnung 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getSicherheitsabstand <em>Sicherheitsabstand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung()
 * @model extendedMetaData="name='CBUE_Deckendes_Signal_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Deckendes_Signal_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zu dem deckenden Signal zugehörige Einschaltung. DB-Regelwerk Signaltabelle 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' reference.
	 * @see #isSetIDBUEEinschaltung()
	 * @see #unsetIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung_IDBUEEinschaltung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	BUE_Einschaltung getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Einschaltung</em>' reference.
	 * @see #isSetIDBUEEinschaltung()
	 * @see #unsetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 */
	void setIDBUEEinschaltung(BUE_Einschaltung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	void unsetIDBUEEinschaltung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Einschaltung</em>' reference is set.
	 * @see #unsetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	boolean isSetIDBUEEinschaltung();

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zu dem Signal, welches den BÜ deckt (deckendes Haupt-/ LS-Signal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getIDSignal <em>ID Signal</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Sicherheitsabstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand vom deckenden Signal zur BÜ-Kante. Im Gegensatz zum BÜ-Gefahrraum werden abgesetzte Fuß- und Radwege dabei berücksichtigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sicherheitsabstand</em>' containment reference.
	 * @see #setSicherheitsabstand(Sicherheitsabstand_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Deckendes_Signal_Zuordnung_Sicherheitsabstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sicherheitsabstand'"
	 * @generated
	 */
	Sicherheitsabstand_TypeClass getSicherheitsabstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Deckendes_Signal_Zuordnung#getSicherheitsabstand <em>Sicherheitsabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sicherheitsabstand</em>' containment reference.
	 * @see #getSicherheitsabstand()
	 * @generated
	 */
	void setSicherheitsabstand(Sicherheitsabstand_TypeClass value);

} // BUE_Deckendes_Signal_Zuordnung
