/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der Kante des ETCS-spezifischen Knoten-Kanten-Modells auf das topologische PlanPro-Knoten-Kanten-Modell.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenA <em>IDETCS Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenB <em>IDETCS Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDTOPKante <em>IDTOP Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante()
 * @model extendedMetaData="name='CETCS_Kante' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Kante extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ETCS_Kante_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDETCS Knoten A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ETCS-Knoten am Anfang der Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Knoten A</em>' reference.
	 * @see #isSetIDETCSKnotenA()
	 * @see #unsetIDETCSKnotenA()
	 * @see #setIDETCSKnotenA(ETCS_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDETCSKnotenA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Knoten_A'"
	 * @generated
	 */
	ETCS_Knoten getIDETCSKnotenA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenA <em>IDETCS Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Knoten A</em>' reference.
	 * @see #isSetIDETCSKnotenA()
	 * @see #unsetIDETCSKnotenA()
	 * @see #getIDETCSKnotenA()
	 * @generated
	 */
	void setIDETCSKnotenA(ETCS_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenA <em>IDETCS Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDETCSKnotenA()
	 * @see #getIDETCSKnotenA()
	 * @see #setIDETCSKnotenA(ETCS_Knoten)
	 * @generated
	 */
	void unsetIDETCSKnotenA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenA <em>IDETCS Knoten A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDETCS Knoten A</em>' reference is set.
	 * @see #unsetIDETCSKnotenA()
	 * @see #getIDETCSKnotenA()
	 * @see #setIDETCSKnotenA(ETCS_Knoten)
	 * @generated
	 */
	boolean isSetIDETCSKnotenA();

	/**
	 * Returns the value of the '<em><b>IDETCS Knoten B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ETCS-Knoten am Ende der Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Knoten B</em>' reference.
	 * @see #isSetIDETCSKnotenB()
	 * @see #unsetIDETCSKnotenB()
	 * @see #setIDETCSKnotenB(ETCS_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDETCSKnotenB()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Knoten_B'"
	 * @generated
	 */
	ETCS_Knoten getIDETCSKnotenB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenB <em>IDETCS Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Knoten B</em>' reference.
	 * @see #isSetIDETCSKnotenB()
	 * @see #unsetIDETCSKnotenB()
	 * @see #getIDETCSKnotenB()
	 * @generated
	 */
	void setIDETCSKnotenB(ETCS_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenB <em>IDETCS Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDETCSKnotenB()
	 * @see #getIDETCSKnotenB()
	 * @see #setIDETCSKnotenB(ETCS_Knoten)
	 * @generated
	 */
	void unsetIDETCSKnotenB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenB <em>IDETCS Knoten B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDETCS Knoten B</em>' reference is set.
	 * @see #unsetIDETCSKnotenB()
	 * @see #getIDETCSKnotenB()
	 * @see #setIDETCSKnotenB(ETCS_Knoten)
	 * @generated
	 */
	boolean isSetIDETCSKnotenB();

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das RBC, in dessen Bereich die ETCS-Kante liegt. Im Bereich der RBC-Grenze ist ggf. eine Mehrfachangabe erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDRBC()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<RBC> getIDRBC();

	/**
	 * Returns the value of the '<em><b>IDTOP Kante</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die TOP-Kanten, die vollständig oder teilweise die ETCS-Kante bilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Kante</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDTOPKante()
	 * @model required="true" upper="3"
	 *        extendedMetaData="kind='element' name='ID_TOP_Kante'"
	 * @generated
	 */
	EList<TOP_Kante> getIDTOPKante();

} // ETCS_Kante
