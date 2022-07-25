/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Modul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elektronische Baugruppe zur Ansteuerung von Balisen in Abhängigkeit von Eingangsinformationen. Ein LEU-Modul ist in einem LEU-Schaltkasten untergebracht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDInformationEingang <em>ID Information Eingang</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getLEUModulAllg <em>LEU Modul Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getLEUModulAusgang <em>LEU Modul Ausgang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul()
 * @model extendedMetaData="name='CLEU_Modul' kind='elementOnly'"
 * @generated
 */
public interface LEU_Modul extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	LEU_Modul_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Information Eingang</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Quelle(n) der Eingangsinformationen, sofern dieses LEU-Modul Eingangsinformationen aufnimmt. Über eine Aussenelementansteuerung können auch Informationen von Objekten bezogen werden, die nicht im Stellbereich dieser Aussenelementansteuerung liegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Information Eingang</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_IDInformationEingang()
	 * @model extendedMetaData="kind='element' name='ID_Information_Eingang'"
	 * @generated
	 */
	EList<Basis_Objekt> getIDInformationEingang();

	/**
	 * Returns the value of the '<em><b>IDLEU Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die LEU-Anlage, zu der das LEU-Modul gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Anlage</em>' reference.
	 * @see #isSetIDLEUAnlage()
	 * @see #unsetIDLEUAnlage()
	 * @see #setIDLEUAnlage(LEU_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_IDLEUAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Anlage'"
	 * @generated
	 */
	LEU_Anlage getIDLEUAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUAnlage <em>IDLEU Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Anlage</em>' reference.
	 * @see #isSetIDLEUAnlage()
	 * @see #unsetIDLEUAnlage()
	 * @see #getIDLEUAnlage()
	 * @generated
	 */
	void setIDLEUAnlage(LEU_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUAnlage <em>IDLEU Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDLEUAnlage()
	 * @see #getIDLEUAnlage()
	 * @see #setIDLEUAnlage(LEU_Anlage)
	 * @generated
	 */
	void unsetIDLEUAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUAnlage <em>IDLEU Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDLEU Anlage</em>' reference is set.
	 * @see #unsetIDLEUAnlage()
	 * @see #getIDLEUAnlage()
	 * @see #setIDLEUAnlage(LEU_Anlage)
	 * @generated
	 */
	boolean isSetIDLEUAnlage();

	/**
	 * Returns the value of the '<em><b>IDLEU Schaltkasten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den LEU-Schaltkasten, in dem das LEU-Modul untergebracht ist. Es können LEU-Module verschiedener LEU-Anlagen in einem LEU-Schaltkasten untergebracht sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Schaltkasten</em>' reference.
	 * @see #isSetIDLEUSchaltkasten()
	 * @see #unsetIDLEUSchaltkasten()
	 * @see #setIDLEUSchaltkasten(LEU_Schaltkasten)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_IDLEUSchaltkasten()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Schaltkasten'"
	 * @generated
	 */
	LEU_Schaltkasten getIDLEUSchaltkasten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Schaltkasten</em>' reference.
	 * @see #isSetIDLEUSchaltkasten()
	 * @see #unsetIDLEUSchaltkasten()
	 * @see #getIDLEUSchaltkasten()
	 * @generated
	 */
	void setIDLEUSchaltkasten(LEU_Schaltkasten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDLEUSchaltkasten()
	 * @see #getIDLEUSchaltkasten()
	 * @see #setIDLEUSchaltkasten(LEU_Schaltkasten)
	 * @generated
	 */
	void unsetIDLEUSchaltkasten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDLEU Schaltkasten</em>' reference is set.
	 * @see #unsetIDLEUSchaltkasten()
	 * @see #getIDLEUSchaltkasten()
	 * @see #setIDLEUSchaltkasten(LEU_Schaltkasten)
	 * @generated
	 */
	boolean isSetIDLEUSchaltkasten();

	/**
	 * Returns the value of the '<em><b>LEU Modul Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LEU Modul Allg</em>' containment reference.
	 * @see #setLEUModulAllg(LEU_Modul_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_LEUModulAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Allg'"
	 * @generated
	 */
	LEU_Modul_Allg_AttributeGroup getLEUModulAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul#getLEUModulAllg <em>LEU Modul Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Modul Allg</em>' containment reference.
	 * @see #getLEUModulAllg()
	 * @generated
	 */
	void setLEUModulAllg(LEU_Modul_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LEU Modul Ausgang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Zuordnung von Ausgängen des LEU-Moduls zu Balisen. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Modul Ausgang</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_LEUModulAusgang()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Ausgang'"
	 * @generated
	 */
	EList<LEU_Modul_Ausgang_AttributeGroup> getLEUModulAusgang();

} // LEU_Modul
