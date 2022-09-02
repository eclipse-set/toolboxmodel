/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Ausschaltung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt, das alle Informationen zur Ausschaltung eines Bahnübergangs enthält. Über den Verweis auf BUE Gleisbezogener Gefahrraum findet eine Verortung am zugehörigen Gleis statt, für das der Ausschaltkontakt angeordnet wird. Der Ausschaltkontakt selbst ist über das Objekt Schaltmittel Zuordnung abgebildet. Für die BUE_Ausschaltung ist, in Fahrtrichtung Ausschaltkontakt weg vom BÜ gesehen, die RÜCKGELEGENE Grenze von BUE Gleisbezogener Gefahrraum für die Verortung maßgebend. Die Gefahrraum-Grenze liegt damit in Fahrtrichtung VOR dem Ausschaltkontakt. DB-Regelwerk 815.0032 4 (3) Die Planung der Ausschaltung erfolgt entsprechend der Projektierungshinweise der konkreten BÜ-Technik. Seitens der Ril 815 gibt es dazu keine konkreten Vorgaben. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Ausschaltung()
 * @model extendedMetaData="name='CBUE_Ausschaltung' kind='elementOnly'"
 * @generated
 */
public interface BUE_Ausschaltung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDBUE Gleisbez Gefahrraum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen Gefahrraum, auf den sich die Ausschaltung – gleisbezogen - bezieht. Ist bei der Planung von technisch gesicherten BÜ zu befüllen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Gleisbez Gefahrraum</em>' reference.
	 * @see #isSetIDBUEGleisbezGefahrraum()
	 * @see #unsetIDBUEGleisbezGefahrraum()
	 * @see #setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Ausschaltung_IDBUEGleisbezGefahrraum()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Gleisbez_Gefahrraum'"
	 * @generated
	 */
	BUE_Gleisbezogener_Gefahrraum getIDBUEGleisbezGefahrraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Gleisbez Gefahrraum</em>' reference.
	 * @see #isSetIDBUEGleisbezGefahrraum()
	 * @see #unsetIDBUEGleisbezGefahrraum()
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 */
	void setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEGleisbezGefahrraum()
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @see #setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum)
	 * @generated
	 */
	void unsetIDBUEGleisbezGefahrraum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Ausschaltung#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Gleisbez Gefahrraum</em>' reference is set.
	 * @see #unsetIDBUEGleisbezGefahrraum()
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @see #setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum)
	 * @generated
	 */
	boolean isSetIDBUEGleisbezGefahrraum();

} // BUE_Ausschaltung
