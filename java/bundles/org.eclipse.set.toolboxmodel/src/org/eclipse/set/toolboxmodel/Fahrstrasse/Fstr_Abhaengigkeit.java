/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Abhaengigkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung aller für einen Fstr Fahrweg zu sichernden und nicht durch die Topologie auffindbaren Objekte. Nicht durch die Topologie findbar sind insbesondere: Schluesselsperre, Zustimmungsschalter/-taster. Spezialfall: Für eine Rangierstraße kann richtungsabhängig geplant werden, dass eine Schlüsselsperre im Zielgleis nicht überwacht wird. In dem (sehr seltenen) Fall müssen für eine Zug- und eine Rangierstraße mit identischem Fahrweg zwei Instanzen Fstr Fahrweg angelegt werden. DB-Regelwerk Schlüsselsperre: Zugstraßentabelle, Spalte 5: "Ssp in der Fahrstraße verschlossen und überwacht"; Rangierstraßentabelle, Spalte 15: "Ssp in der Rangierstraße verschlossen und überwacht". Zustimmungsschalter/-taster: Bemerkung/Fußnote. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getFstrAbhaengigkeitSsp <em>Fstr Abhaengigkeit Ssp</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit()
 * @model extendedMetaData="name='CFstr_Abhaengigkeit' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Abhaengigkeit extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des abhängigen Elements zu Fstr Fahrweg. DB-Regelwerk Zugstraßentabelle, Zeile 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_IDFstrFahrweg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	Fstr_Fahrweg getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(Fstr_Fahrweg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	void unsetIDFstrFahrweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Fahrweg</em>' reference is set.
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	boolean isSetIDFstrFahrweg();

	/**
	 * Returns the value of the '<em><b>Fstr Abhaengigkeit Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Abhaengigkeit Ssp</em>' containment reference.
	 * @see #setFstrAbhaengigkeitSsp(Fstr_Abhaengigkeit_Ssp_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_FstrAbhaengigkeitSsp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Abhaengigkeit_Ssp'"
	 * @generated
	 */
	Fstr_Abhaengigkeit_Ssp_AttributeGroup getFstrAbhaengigkeitSsp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getFstrAbhaengigkeitSsp <em>Fstr Abhaengigkeit Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Abhaengigkeit Ssp</em>' containment reference.
	 * @see #getFstrAbhaengigkeitSsp()
	 * @generated
	 */
	void setFstrAbhaengigkeitSsp(Fstr_Abhaengigkeit_Ssp_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Anzeige Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bedien_Anzeige_Element, das wirksam sein muss, damit die Fstr gesichert ist. DB-Regelwerk Mittelweichenteilfahrstraßentabelle: Bemerkung oder Fußnote. Schalter/Taster: Zugstraßentabelle: Bemerkung oder Fußnote; Rangierstraßentabelle: Bemerkung oder Fußnote; Mittelweichenteilfahrstraßentabelle: Bemerkung oder Fußnote. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Anzeige Element</em>' reference.
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_IDBedienAnzeigeElement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Anzeige_Element'"
	 * @generated
	 */
	Bedien_Anzeige_Element getIDBedienAnzeigeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Anzeige Element</em>' reference.
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 */
	void setIDBedienAnzeigeElement(Bedien_Anzeige_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @generated
	 */
	void unsetIDBedienAnzeigeElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Abhaengigkeit#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Anzeige Element</em>' reference is set.
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @generated
	 */
	boolean isSetIDBedienAnzeigeElement();

} // Fstr_Abhaengigkeit
