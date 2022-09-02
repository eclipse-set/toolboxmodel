/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Datei Gruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gruppe von Dateien, die zum Programmieren der Balise oder LEU benötigt werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prog_Datei_Gruppe#getIDGeraetProgrammiert <em>ID Geraet Programmiert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prog_Datei_Gruppe#getProgDateiEinzel <em>Prog Datei Einzel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Gruppe()
 * @model extendedMetaData="name='CProg_Datei_Gruppe' kind='elementOnly'"
 * @generated
 */
public interface Prog_Datei_Gruppe extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Geraet Programmiert</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zu programmierende Komponente (Balise oder LEU-Modul). Bei ESG können auch mehrere Komponenten angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Geraet Programmiert</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Gruppe_IDGeraetProgrammiert()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_Geraet_Programmiert'"
	 * @generated
	 */
	EList<Basis_Objekt> getIDGeraetProgrammiert();

	/**
	 * Returns the value of the '<em><b>Prog Datei Einzel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prog Datei Einzel</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Gruppe_ProgDateiEinzel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Prog_Datei_Einzel'"
	 * @generated
	 */
	EList<Prog_Datei_Einzel_AttributeGroup> getProgDateiEinzel();

} // Prog_Datei_Gruppe
