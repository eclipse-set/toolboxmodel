/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Spezifisches Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Zuordnung von Signalen, die ausschließlich im Zusammenhang mit einem Bahnübergang (BÜ) angeordnet werden. Dazu gehören zum Beispiel Pfeiftafeln, Lf-Signale mit und ohne Zusatz "BÜ" oder Überwachungssignale für BÜ, Merktafeln oder Merkpfähle u.a. Die Anwendung von Pfeiftafeln und Lf-Signalen erfolgt zumeist bei nichttechnisch gesicherten BÜ; die Anwendung der Überwachungssignale bei Bahnübergängen der Funktionsüberwachung "ÜS". Für die vorgenannten Fälle ist der Verweis auf BUE Anlage zu befüllen. Wird zum Beispiel ein Merkpfahl zur Kennzeichnung eines Einschaltpunktes (Anwendung in besonderen Planungsfällen) vorgesehen, ist der Verweis auf BUE Einschaltung zu befüllen. Für die Bezeichnung von BÜ-spezifischen Signalen, insbesondere Überwachungssignale, sind Ausführungen auf der Seite Bezeichnung Signal vorhanden. DB-Regelwerk Formblatt zur Ermittlung der Sichtflächen für nichttechnisch gesicherte BÜ 819.1204 9 für ÜS SPU 24 für Merktafel /-pfahl BÜ-Kabellage- und -übersichtsplan 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal()
 * @model extendedMetaData="name='CBUE_Spezifisches_Signal' kind='elementOnly'"
 * @generated
 */
public interface BUE_Spezifisches_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal, welches im Zusammenhang mit dem BÜ angeordnet wird. Es ist zu unterscheiden, ob das Signal zur BUE Anlage (z. B. ÜS, Pfeiftafel) oder zur BUE Einschaltung (z. B. Merktafel) gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDSignal <em>ID Signal</em>}' reference is set.
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
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BUE Anlage, für die das Signal angeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal_IDBUEAnlage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	BUE_Anlage getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(BUE_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	void unsetIDBUEAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Anlage</em>' reference is set.
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	boolean isSetIDBUEAnlage();

	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BUE_Einschaltung, an der das Signal angeordnet wird (z.B. Tafel für die Markierung des Einschaltkontaktes). DB-Regelwerk SPU (Sammlung der Planunterlagen) 24 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' reference.
	 * @see #isSetIDBUEEinschaltung()
	 * @see #unsetIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Spezifisches_Signal_IDBUEEinschaltung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	BUE_Einschaltung getIDBUEEinschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	void unsetIDBUEEinschaltung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Spezifisches_Signal#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Einschaltung</em>' reference is set.
	 * @see #unsetIDBUEEinschaltung()
	 * @see #getIDBUEEinschaltung()
	 * @see #setIDBUEEinschaltung(BUE_Einschaltung)
	 * @generated
	 */
	boolean isSetIDBUEEinschaltung();

} // BUE_Spezifisches_Signal
