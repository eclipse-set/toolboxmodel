/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ausgabe Fachdaten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ausgabe der Fachdaten einer Planung im PlanPro-Format.
 * An dieser Stelle werden die LST-Fachinhalte getrennt von den Angaben des Objektmanagements eingebunden.
 * DB-Regelwerk
 * Bisher keine eindeutige Abbildung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten#getLSTZustandStart <em>LST Zustand Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten#getLSTZustandZiel <em>LST Zustand Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten#getUntergewerkArt <em>Untergewerk Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getAusgabe_Fachdaten()
 * @model extendedMetaData="name='CAusgabe_Fachdaten' kind='elementOnly'"
 * @generated
 */
public interface Ausgabe_Fachdaten extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>LST Zustand Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Menge aller Fachdaten zur Beschreibung des Startzustands einer Ausgabe.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Zustand Start</em>' containment reference.
	 * @see #setLSTZustandStart(LST_Zustand)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getAusgabe_Fachdaten_LSTZustandStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Zustand_Start'"
	 * @generated
	 */
	LST_Zustand getLSTZustandStart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten#getLSTZustandStart <em>LST Zustand Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Zustand Start</em>' containment reference.
	 * @see #getLSTZustandStart()
	 * @generated
	 */
	void setLSTZustandStart(LST_Zustand value);

	/**
	 * Returns the value of the '<em><b>LST Zustand Ziel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Menge aller Fachdaten zur Beschreibung des Zielzustands einer Ausgabe.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Zustand Ziel</em>' containment reference.
	 * @see #setLSTZustandZiel(LST_Zustand)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getAusgabe_Fachdaten_LSTZustandZiel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Zustand_Ziel'"
	 * @generated
	 */
	LST_Zustand getLSTZustandZiel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten#getLSTZustandZiel <em>LST Zustand Ziel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Zustand Ziel</em>' containment reference.
	 * @see #getLSTZustandZiel()
	 * @generated
	 */
	void setLSTZustandZiel(LST_Zustand value);

	/**
	 * Returns the value of the '<em><b>Untergewerk Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Untergewerk, für das die Fachdaten des LST-Datenmodells ausgegeben werden.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Untergewerk Art</em>' containment reference.
	 * @see #setUntergewerkArt(Untergewerk_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getAusgabe_Fachdaten_UntergewerkArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Untergewerk_Art'"
	 * @generated
	 */
	Untergewerk_Art_TypeClass getUntergewerkArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten#getUntergewerkArt <em>Untergewerk Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untergewerk Art</em>' containment reference.
	 * @see #getUntergewerkArt()
	 * @generated
	 */
	void setUntergewerkArt(Untergewerk_Art_TypeClass value);

} // Ausgabe_Fachdaten
