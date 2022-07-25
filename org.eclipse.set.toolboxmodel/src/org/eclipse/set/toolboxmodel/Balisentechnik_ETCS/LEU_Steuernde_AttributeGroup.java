/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Steuernde Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Steuernde_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Steuernde' kind='elementOnly'"
 * @generated
 */
public interface LEU_Steuernde_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDLEU Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die steuernde LEU-Anlage. Anmerkung: Balisen eines Datenpunkts können nicht mehreren LEU zugeordnet sein. Es ist nur möglich, eine zusammengefasste LEU mit zusammengefasster E/A-Logik aus mehreren LEU-Modulen zu bilden und die Balisen des DP verschiedenen LEU-Modulen zuzuordnen.  
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Anlage</em>' reference.
	 * @see #isSetIDLEUAnlage()
	 * @see #unsetIDLEUAnlage()
	 * @see #setIDLEUAnlage(LEU_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Steuernde_AttributeGroup_IDLEUAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Anlage'"
	 * @generated
	 */
	LEU_Anlage getIDLEUAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getIDLEUAnlage <em>IDLEU Anlage</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getIDLEUAnlage <em>IDLEU Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDLEUAnlage()
	 * @see #getIDLEUAnlage()
	 * @see #setIDLEUAnlage(LEU_Anlage)
	 * @generated
	 */
	void unsetIDLEUAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Steuernde_AttributeGroup#getIDLEUAnlage <em>IDLEU Anlage</em>}' reference is set.
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
	 * Returns the value of the '<em><b>LEU Ausgang Nr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planerisch vergebene Nummer des genutzten LEU-Ausgangs für die Ansteuerung der Balisen des Datenpunkts. 
	 * Bei Verwendung in Datenpunkt: Angabe des für diesen DP genutzen LEU-Ausgangs im Sinne einer Referenz. Mehrere Ausgänge werden bei DP mit mehreren gesteuerten Balisen benötigt.
	 * Bei Verwendung in LEU_Anlage: Definition des LEU-Ausgangs für die entsprechendes LEU-Anlage. Die Port-Nr. muss in Bezug auf die LEU-Anlage eindeutig sein.
	 * Bei Verwendung in LEU_Modul: Zuordnung des LEU-Ausgangs zu einem LEU-Modul. Weiterhin wird dem LEU-Ausgang vom Hersteller eine Portnummer zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Ausgang Nr</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Steuernde_AttributeGroup_LEUAusgangNr()
	 * @model containment="true" required="true" upper="16"
	 *        extendedMetaData="kind='element' name='LEU_Ausgang_Nr'"
	 * @generated
	 */
	EList<LEU_Ausgang_Nr_TypeClass> getLEUAusgangNr();

} // LEU_Steuernde_AttributeGroup
