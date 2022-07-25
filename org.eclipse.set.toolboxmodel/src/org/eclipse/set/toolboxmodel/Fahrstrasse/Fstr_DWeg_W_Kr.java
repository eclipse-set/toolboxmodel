/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg WKr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Weichen und Kreuzungen zum in Fstr DWeg geplanten Durchrutschweg. Eine Zuordnung von Weichen und Kreuzungen über den zugrunde liegenden Fstr Fahrweg ist nicht möglich, da das Ende des Durchrutschweges in einer Weiche liegen kann, deren Sicherung explizit geplant werden muss. Außerdem muss für Weichen im Durchrutschweg angegeben werden, ob sie verschlossen werden und ob sie Flankenschutz anfordern sollen. Eine Angabe der Lage der Weiche ist nicht notwendig, da sich diese über Fstr Fahrweg (Bereich Objekt) ergibt. Obwohl die Spaltenüberschrift in der Durchrutschwegtabelle auch von Gleissperren spricht, werden Gleissperren nicht vorgesehen. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: "Weichen, Kreuzungen, Gleissperren"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getElementVerschluss <em>Element Verschluss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr()
 * @model extendedMetaData="name='CFstr_DWeg_W_Kr' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg_W_Kr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Element Verschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschluss der Weiche im Durchrutschweg. Stumpf berutschte, auffahrbare Weichen im Durchrutschweg können unverschlossen bleiben.
	 * 
	 * Das Attribut ist herstellerneutralitätskritisch.
	 *  
	 * DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: "Weichen, Kreuzungen, Gleissperren"
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Verschluss</em>' containment reference.
	 * @see #setElementVerschluss(Element_Verschluss_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_ElementVerschluss()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Element_Verschluss'"
	 * @generated
	 */
	Element_Verschluss_TypeClass getElementVerschluss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getElementVerschluss <em>Element Verschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Verschluss</em>' containment reference.
	 * @see #getElementVerschluss()
	 * @generated
	 */
	void setElementVerschluss(Element_Verschluss_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr DWeg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Weichen und Kreuzungen zum DWeg. DB-Regelwerk Durchrutschwegtabelle (gleiche Zeile) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr DWeg</em>' reference.
	 * @see #isSetIDFstrDWeg()
	 * @see #unsetIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_IDFstrDWeg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_DWeg'"
	 * @generated
	 */
	Fstr_DWeg getIDFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr DWeg</em>' reference.
	 * @see #isSetIDFstrDWeg()
	 * @see #unsetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @generated
	 */
	void setIDFstrDWeg(Fstr_DWeg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @generated
	 */
	void unsetIDFstrDWeg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr DWeg</em>' reference is set.
	 * @see #unsetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @generated
	 */
	boolean isSetIDFstrDWeg();

	/**
	 * Returns the value of the '<em><b>IDW Kr Gsp Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Weichen und Kreuzungen zum DWeg. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: "Weichen, Kreuzungen, Gleissperren - verschließen/nicht verschließen" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Gsp Element</em>' reference.
	 * @see #isSetIDWKrGspElement()
	 * @see #unsetIDWKrGspElement()
	 * @see #setIDWKrGspElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_IDWKrGspElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Gsp_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDWKrGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Gsp Element</em>' reference.
	 * @see #isSetIDWKrGspElement()
	 * @see #unsetIDWKrGspElement()
	 * @see #getIDWKrGspElement()
	 * @generated
	 */
	void setIDWKrGspElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWKrGspElement()
	 * @see #getIDWKrGspElement()
	 * @see #setIDWKrGspElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDWKrGspElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDW Kr Gsp Element</em>' reference is set.
	 * @see #unsetIDWKrGspElement()
	 * @see #getIDWKrGspElement()
	 * @see #setIDWKrGspElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDWKrGspElement();

} // Fstr_DWeg_W_Kr
