/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sonstiger Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nicht durch ein anderes Punkt Objekt festgelegter Markanter Punkt. Das Objekt Sonstiger_Punkt wird durch den LST-Planer angelegt, wenn kein bereits existierendes Punkt Objekt für die Beschreibung des Markanten Punktes zur Verfügung steht. Insbesondere handelt es sich dabei um: Beginn eines Bahnsteigs, Kante eines Gefahrraums am BÜ, Zugschluss bzw. -spitze, Beginn des zu deckenden Bereichs einer Deckungsstelle (z. B. bewegliche Brücke), sonstige Punkte (z. B. Merkpfahl, Laternenmast). DB-Regelwerk Siehe Markanter Punkt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getSonstiger_Punkt()
 * @model extendedMetaData="name='CSonstiger_Punkt' kind='elementOnly'"
 * @generated
 */
public interface Sonstiger_Punkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Beginn Bereich</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeiger auf das Bereich Objekt Bahnsteig Kante, BUE Gleisbezogener Gefahrraum oder ZUB Streckeneigenschaft, dessen Beginn bzw. Ende das Punkt Objekt Sonstiger Punkt abbildet. DB-Regelwerk Durchrutschwegtabelle, Spalte 2: "Durchrutschweg - bis"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Beginn Bereich</em>' reference.
	 * @see #isSetIDBeginnBereich()
	 * @see #unsetIDBeginnBereich()
	 * @see #setIDBeginnBereich(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getSonstiger_Punkt_IDBeginnBereich()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Beginn_Bereich'"
	 * @generated
	 */
	Basis_Objekt getIDBeginnBereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Beginn Bereich</em>' reference.
	 * @see #isSetIDBeginnBereich()
	 * @see #unsetIDBeginnBereich()
	 * @see #getIDBeginnBereich()
	 * @generated
	 */
	void setIDBeginnBereich(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBeginnBereich()
	 * @see #getIDBeginnBereich()
	 * @see #setIDBeginnBereich(Basis_Objekt)
	 * @generated
	 */
	void unsetIDBeginnBereich();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Sonstiger_Punkt#getIDBeginnBereich <em>ID Beginn Bereich</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Beginn Bereich</em>' reference is set.
	 * @see #unsetIDBeginnBereich()
	 * @see #getIDBeginnBereich()
	 * @see #setIDBeginnBereich(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDBeginnBereich();

} // Sonstiger_Punkt
