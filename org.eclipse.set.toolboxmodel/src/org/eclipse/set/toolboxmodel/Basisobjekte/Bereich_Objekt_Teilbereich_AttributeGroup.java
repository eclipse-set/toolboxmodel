/**
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bereich Objekt Teilbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungA <em>Begrenzung A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungB <em>Begrenzung B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getRichtungsbezug <em>Richtungsbezug</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBereich_Objekt_Teilbereich_AttributeGroup()
 * @model extendedMetaData="name='CBereich_Objekt_Teilbereich' kind='elementOnly'"
 * @generated
 */
public interface Bereich_Objekt_Teilbereich_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Begrenzung A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand der Begrenzung A zum Anfang der TOP Kante. Die Begrenzung A darf nicht weiter als die Begrenzung B vom Anfang der TOP Kante entfernt sein. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begrenzung A</em>' containment reference.
	 * @see #setBegrenzungA(Begrenzung_A_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Begrenzung_A'"
	 * @generated
	 */
	Begrenzung_A_TypeClass getBegrenzungA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungA <em>Begrenzung A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begrenzung A</em>' containment reference.
	 * @see #getBegrenzungA()
	 * @generated
	 */
	void setBegrenzungA(Begrenzung_A_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Begrenzung B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand der Begrenzung B zum Anfang der TOP Kante. Die Begrenzung B ist gleich weit oder weiter als die Begrenzung A vom Anfang der TOP Kante entfernt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Begrenzung B</em>' containment reference.
	 * @see #setBegrenzungB(Begrenzung_B_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBereich_Objekt_Teilbereich_AttributeGroup_BegrenzungB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Begrenzung_B'"
	 * @generated
	 */
	Begrenzung_B_TypeClass getBegrenzungB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getBegrenzungB <em>Begrenzung B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begrenzung B</em>' containment reference.
	 * @see #getBegrenzungB()
	 * @generated
	 */
	void setBegrenzungB(Begrenzung_B_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDTOP Kante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis, auf welche TOP Kante sich der Teilbereich bezieht. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Kante</em>' reference.
	 * @see #isSetIDTOPKante()
	 * @see #unsetIDTOPKante()
	 * @see #setIDTOPKante(TOP_Kante)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBereich_Objekt_Teilbereich_AttributeGroup_IDTOPKante()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Kante'"
	 * @generated
	 */
	TOP_Kante getIDTOPKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDTOP Kante</em>' reference.
	 * @see #isSetIDTOPKante()
	 * @see #unsetIDTOPKante()
	 * @see #getIDTOPKante()
	 * @generated
	 */
	void setIDTOPKante(TOP_Kante value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDTOPKante()
	 * @see #getIDTOPKante()
	 * @see #setIDTOPKante(TOP_Kante)
	 * @generated
	 */
	void unsetIDTOPKante();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDTOP Kante</em>' reference is set.
	 * @see #unsetIDTOPKante()
	 * @see #getIDTOPKante()
	 * @see #setIDTOPKante(TOP_Kante)
	 * @generated
	 */
	boolean isSetIDTOPKante();

	/**
	 * Returns the value of the '<em><b>Richtungsbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Richtung des Teilbereichs bezogen auf die Topologierichtung der über ID TOP Kante referenzierten Topologiekante. Zur vererbungsspezifischen Befüllung siehe Modellierung Basisobjekte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Richtungsbezug</em>' containment reference.
	 * @see #setRichtungsbezug(Richtungsbezug_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBereich_Objekt_Teilbereich_AttributeGroup_Richtungsbezug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Richtungsbezug'"
	 * @generated
	 */
	Richtungsbezug_TypeClass getRichtungsbezug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup#getRichtungsbezug <em>Richtungsbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtungsbezug</em>' containment reference.
	 * @see #getRichtungsbezug()
	 * @generated
	 */
	void setRichtungsbezug(Richtungsbezug_TypeClass value);

} // Bereich_Objekt_Teilbereich_AttributeGroup
