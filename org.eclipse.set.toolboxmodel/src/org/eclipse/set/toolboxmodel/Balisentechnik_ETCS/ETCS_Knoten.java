/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Knoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung des Knotens des ETCS-spezifischen Knoten-Kanten-Modells auf das topologische PlanPro-Knoten-Kanten-Modell. Bei Kreuzungsweichen erfolgt die Verortung zweifach, sonst einfach.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten#getIDTOPKnoten <em>IDTOP Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten#getKnotenAufTOPKante <em>Knoten Auf TOP Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Knoten()
 * @model extendedMetaData="name='CETCS_Knoten' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Knoten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDTOP Knoten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den TOP-Knoten, mit dem der ETCS-Knoten identisch ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Knoten</em>' reference.
	 * @see #isSetIDTOPKnoten()
	 * @see #unsetIDTOPKnoten()
	 * @see #setIDTOPKnoten(TOP_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Knoten_IDTOPKnoten()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Knoten'"
	 * @generated
	 */
	TOP_Knoten getIDTOPKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten#getIDTOPKnoten <em>IDTOP Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDTOP Knoten</em>' reference.
	 * @see #isSetIDTOPKnoten()
	 * @see #unsetIDTOPKnoten()
	 * @see #getIDTOPKnoten()
	 * @generated
	 */
	void setIDTOPKnoten(TOP_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten#getIDTOPKnoten <em>IDTOP Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDTOPKnoten()
	 * @see #getIDTOPKnoten()
	 * @see #setIDTOPKnoten(TOP_Knoten)
	 * @generated
	 */
	void unsetIDTOPKnoten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten#getIDTOPKnoten <em>IDTOP Knoten</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDTOP Knoten</em>' reference is set.
	 * @see #unsetIDTOPKnoten()
	 * @see #getIDTOPKnoten()
	 * @see #setIDTOPKnoten(TOP_Knoten)
	 * @generated
	 */
	boolean isSetIDTOPKnoten();

	/**
	 * Returns the value of the '<em><b>Knoten Auf TOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knoten Auf TOP Kante</em>' containment reference.
	 * @see #setKnotenAufTOPKante(Knoten_Auf_TOP_Kante_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Knoten_KnotenAufTOPKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Knoten_Auf_TOP_Kante'"
	 * @generated
	 */
	Knoten_Auf_TOP_Kante_AttributeGroup getKnotenAufTOPKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten#getKnotenAufTOPKante <em>Knoten Auf TOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knoten Auf TOP Kante</em>' containment reference.
	 * @see #getKnotenAufTOPKante()
	 * @generated
	 */
	void setKnotenAufTOPKante(Knoten_Auf_TOP_Kante_AttributeGroup value);

} // ETCS_Knoten
