/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beeinflussungspunkt bestehend aus einer Einzelbalise oder Balisengruppe und ggf. einer LEU. In europäischen Spezifikationen wird der Begriff "Balisengruppe" auch synonym für "Datenpunkt" verwendet. Ein ungesteuerter Datenpunkt besteht ausschließlich aus ungesteuerten Balisen (Festdatenbalisen). Die Attributgruppe darf nur ausgewählt werden, wenn ausschließlich ESG-Telegramme enthalten sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDatenpunktAllg <em>Datenpunkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPBezugBetrieblich <em>DP Bezug Betrieblich</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPETCSAdresse <em>DPETCS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPTyp <em>DP Typ</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getIDEinmesspunkt <em>ID Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getLEUSteuernde <em>LEU Steuernde</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPTelegramm <em>DP Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPTelegrammESG <em>DP Telegramm ESG</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt()
 * @model extendedMetaData="name='CDatenpunkt' kind='elementOnly'"
 * @generated
 */
public interface Datenpunkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Datenpunkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenpunkt Allg</em>' containment reference.
	 * @see #setDatenpunktAllg(Datenpunkt_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DatenpunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datenpunkt_Allg'"
	 * @generated
	 */
	Datenpunkt_Allg_AttributeGroup getDatenpunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDatenpunktAllg <em>Datenpunkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenpunkt Allg</em>' containment reference.
	 * @see #getDatenpunktAllg()
	 * @generated
	 */
	void setDatenpunktAllg(Datenpunkt_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Bezug Betrieblich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Bezug Betrieblich</em>' containment reference.
	 * @see #setDPBezugBetrieblich(DP_Bezug_Betrieblich_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPBezugBetrieblich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Bezug_Betrieblich'"
	 * @generated
	 */
	DP_Bezug_Betrieblich_AttributeGroup getDPBezugBetrieblich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPBezugBetrieblich <em>DP Bezug Betrieblich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Bezug Betrieblich</em>' containment reference.
	 * @see #getDPBezugBetrieblich()
	 * @generated
	 */
	void setDPBezugBetrieblich(DP_Bezug_Betrieblich_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DPETCS Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei ESG optional (nur, wenn DP in mehreren Anwendungssystemen verwendet wird), bei allen anderen Anwendungssystemen Pflicht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DPETCS Adresse</em>' containment reference.
	 * @see #setDPETCSAdresse(DP_ETCS_Adresse_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPETCSAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_ETCS_Adresse'"
	 * @generated
	 */
	DP_ETCS_Adresse_AttributeGroup getDPETCSAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getDPETCSAdresse <em>DPETCS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DPETCS Adresse</em>' containment reference.
	 * @see #getDPETCSAdresse()
	 * @generated
	 */
	void setDPETCSAdresse(DP_ETCS_Adresse_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Typ</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPTyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ'"
	 * @generated
	 */
	EList<DP_Typ_AttributeGroup> getDPTyp();

	/**
	 * Returns the value of the '<em><b>ID Einmesspunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll-Abstand zum Referenzpunkt für die Montage. Das Attribut darf nur in den XML-Dateien für die Balisen-Programmiergeräte gefüllt sein (Ersatz für die topologische Berechnung des Abstands). Die Umsetzung der Richtungsinformationen in den Planunterlagen muss entsprechend des Anwendungssystems festgelegt und im Werkzeug implementiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Einmesspunkt</em>' reference.
	 * @see #isSetIDEinmesspunkt()
	 * @see #unsetIDEinmesspunkt()
	 * @see #setIDEinmesspunkt(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_IDEinmesspunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Einmesspunkt'"
	 * @generated
	 */
	Markanter_Punkt getIDEinmesspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Einmesspunkt</em>' reference.
	 * @see #isSetIDEinmesspunkt()
	 * @see #unsetIDEinmesspunkt()
	 * @see #getIDEinmesspunkt()
	 * @generated
	 */
	void setIDEinmesspunkt(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDEinmesspunkt()
	 * @see #getIDEinmesspunkt()
	 * @see #setIDEinmesspunkt(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDEinmesspunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Einmesspunkt</em>' reference is set.
	 * @see #unsetIDEinmesspunkt()
	 * @see #getIDEinmesspunkt()
	 * @see #setIDEinmesspunkt(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDEinmesspunkt();

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die RBC, denen der Datenpunkt bekannt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_IDRBC()
	 * @model extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<RBC> getIDRBC();

	/**
	 * Returns the value of the '<em><b>LEU Steuernde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LEU Steuernde</em>' containment reference.
	 * @see #setLEUSteuernde(LEU_Steuernde_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_LEUSteuernde()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Steuernde'"
	 * @generated
	 */
	LEU_Steuernde_AttributeGroup getLEUSteuernde();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt#getLEUSteuernde <em>LEU Steuernde</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Steuernde</em>' containment reference.
	 * @see #getLEUSteuernde()
	 * @generated
	 */
	void setLEUSteuernde(LEU_Steuernde_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Telegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Telegramm</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPTelegramm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Telegramm'"
	 * @generated
	 */
	EList<DP_Telegramm_AttributeGroup> getDPTelegramm();

	/**
	 * Returns the value of the '<em><b>DP Telegramm ESG</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Telegramm_ESG_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Telegramm ESG</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_DPTelegrammESG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Telegramm_ESG'"
	 * @generated
	 */
	EList<DP_Telegramm_ESG_AttributeGroup> getDPTelegrammESG();

} // Datenpunkt
