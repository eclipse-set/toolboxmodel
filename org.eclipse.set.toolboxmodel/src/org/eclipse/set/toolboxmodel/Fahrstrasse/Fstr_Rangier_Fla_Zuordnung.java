/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Rangier Fla Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von zu gewährleistenden Flankenschutzmaßnahmen zur Rangierstraße. Nur in Ausnahmefällen wird Flankenschutz für Rangierstraßen realisiert. Dann kann für jede Weiche einzeln bestimmt werden, ob sie Flankenschutz bekommt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_Fla_Zuordnung()
 * @model extendedMetaData="name='CFstr_Rangier_Fla_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Rangier_Fla_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fla Schutz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Fahrwegelement, für das Flankenschutz angefordert werden soll, wenn es durch die angegebene Rangierstraße beansprucht wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Schutz</em>' reference.
	 * @see #isSetIDFlaSchutz()
	 * @see #unsetIDFlaSchutz()
	 * @see #setIDFlaSchutz(Fla_Schutz)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_Fla_Zuordnung_IDFlaSchutz()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Schutz'"
	 * @generated
	 */
	Fla_Schutz getIDFlaSchutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Schutz</em>' reference.
	 * @see #isSetIDFlaSchutz()
	 * @see #unsetIDFlaSchutz()
	 * @see #getIDFlaSchutz()
	 * @generated
	 */
	void setIDFlaSchutz(Fla_Schutz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaSchutz()
	 * @see #getIDFlaSchutz()
	 * @see #setIDFlaSchutz(Fla_Schutz)
	 * @generated
	 */
	void unsetIDFlaSchutz();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Schutz</em>' reference is set.
	 * @see #unsetIDFlaSchutz()
	 * @see #getIDFlaSchutz()
	 * @see #setIDFlaSchutz(Fla_Schutz)
	 * @generated
	 */
	boolean isSetIDFlaSchutz();

	/**
	 * Returns the value of the '<em><b>ID Fstr Rangier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Rangierstraße, für die das unter ID Fla Schutz angegebene Fahrwegelement Flankenschutz anfordern soll. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Rangier</em>' reference.
	 * @see #isSetIDFstrRangier()
	 * @see #unsetIDFstrRangier()
	 * @see #setIDFstrRangier(Fstr_Zug_Rangier)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_Fla_Zuordnung_IDFstrRangier()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Rangier'"
	 * @generated
	 */
	Fstr_Zug_Rangier getIDFstrRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Rangier</em>' reference.
	 * @see #isSetIDFstrRangier()
	 * @see #unsetIDFstrRangier()
	 * @see #getIDFstrRangier()
	 * @generated
	 */
	void setIDFstrRangier(Fstr_Zug_Rangier value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrRangier()
	 * @see #getIDFstrRangier()
	 * @see #setIDFstrRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	void unsetIDFstrRangier();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung#getIDFstrRangier <em>ID Fstr Rangier</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Rangier</em>' reference is set.
	 * @see #unsetIDFstrRangier()
	 * @see #getIDFstrRangier()
	 * @see #setIDFstrRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	boolean isSetIDFstrRangier();

} // Fstr_Rangier_Fla_Zuordnung
