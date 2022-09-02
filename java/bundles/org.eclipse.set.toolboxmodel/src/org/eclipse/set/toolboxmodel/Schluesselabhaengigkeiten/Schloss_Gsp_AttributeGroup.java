/**
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Gsp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getGspLage <em>Gsp Lage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Gsp_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Gsp' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Gsp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Gsp Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage, in der die Gleissperre verschlossen wird. DB-Regelwerk Die Abhängigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gsp Lage</em>' containment reference.
	 * @see #setGspLage(Gsp_Lage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Gsp_AttributeGroup_GspLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Gsp_Lage'"
	 * @generated
	 */
	Gsp_Lage_TypeClass getGspLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getGspLage <em>Gsp Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gsp Lage</em>' containment reference.
	 * @see #getGspLage()
	 * @generated
	 */
	void setGspLage(Gsp_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Gsp Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Gleissperre, die mit dem Schloss verschlossen wird. DB-Regelwerk Lageplan, Logische Darstellung der Schlüsselabhängigkeit 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gsp Element</em>' reference.
	 * @see #isSetIDGspElement()
	 * @see #unsetIDGspElement()
	 * @see #setIDGspElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Gsp_AttributeGroup_IDGspElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gsp_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gsp Element</em>' reference.
	 * @see #isSetIDGspElement()
	 * @see #unsetIDGspElement()
	 * @see #getIDGspElement()
	 * @generated
	 */
	void setIDGspElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGspElement()
	 * @see #getIDGspElement()
	 * @see #setIDGspElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDGspElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup#getIDGspElement <em>ID Gsp Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Gsp Element</em>' reference is set.
	 * @see #unsetIDGspElement()
	 * @see #getIDGspElement()
	 * @see #setIDGspElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDGspElement();

} // Schloss_Gsp_AttributeGroup
