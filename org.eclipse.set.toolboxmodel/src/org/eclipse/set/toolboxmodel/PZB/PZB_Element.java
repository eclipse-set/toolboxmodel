/**
 */
package org.eclipse.set.toolboxmodel.PZB;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Bau)Art, Umfang und Funktionen der punktförmigen Zugbeeinflussung. Unter dem PZB_Element werden sowohl einzelne Gleismagneten als auch die Geschwindigkeitsüberwachungseinrichtungen (GÜ - in der Literatur auch als Geschwindigkeitsprüfeinrichtungen - GPE bezeichnet) sowie dazugehörige Eigenschaften und Parameter zusammenfassend dargestellt. DB-Regelwerk 819.1310 8 für Gleismagnete 819.1310 9 für GÜ In der Gleismagenttabelle finden sich die Angaben in den Zeilen 16 und 17 sowie 33 bis 35 für GÜ und 29 bis 32 für Gleismagnete.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getPZBArt <em>PZB Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getPZBElementGM <em>PZB Element GM</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getPZBElementGUE <em>PZB Element GUE</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element()
 * @model extendedMetaData="name='CPZB_Element' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>IDPZB Element Zuordnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt PZB_Element_Zuordnung, zur Angabe des zugehörigen Signals. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Zuordnung</em>' reference.
	 * @see #isSetIDPZBElementZuordnung()
	 * @see #unsetIDPZBElementZuordnung()
	 * @see #setIDPZBElementZuordnung(PZB_Element_Zuordnung)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_IDPZBElementZuordnung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Zuordnung'"
	 * @generated
	 */
	PZB_Element_Zuordnung getIDPZBElementZuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Zuordnung</em>' reference.
	 * @see #isSetIDPZBElementZuordnung()
	 * @see #unsetIDPZBElementZuordnung()
	 * @see #getIDPZBElementZuordnung()
	 * @generated
	 */
	void setIDPZBElementZuordnung(PZB_Element_Zuordnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDPZBElementZuordnung()
	 * @see #getIDPZBElementZuordnung()
	 * @see #setIDPZBElementZuordnung(PZB_Element_Zuordnung)
	 * @generated
	 */
	void unsetIDPZBElementZuordnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDPZBElementZuordnung <em>IDPZB Element Zuordnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDPZB Element Zuordnung</em>' reference is set.
	 * @see #unsetIDPZBElementZuordnung()
	 * @see #getIDPZBElementZuordnung()
	 * @see #setIDPZBElementZuordnung(PZB_Element_Zuordnung)
	 * @generated
	 */
	boolean isSetIDPZBElementZuordnung();

	/**
	 * Returns the value of the '<em><b>PZB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des PZB-Elementes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Art</em>' containment reference.
	 * @see #setPZBArt(PZB_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_PZBArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PZB_Art'"
	 * @generated
	 */
	PZB_Art_TypeClass getPZBArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getPZBArt <em>PZB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Art</em>' containment reference.
	 * @see #getPZBArt()
	 * @generated
	 */
	void setPZBArt(PZB_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Stellelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enthält Informationen über den energetischen und logischen Anschluss der Objekte. Für das PZB Element ist der Verweis nicht zu füllen, wenn damit eine GÜ oder ein ständig wirksamer Gleismagnet abgebildet wird. DB-Regelwerk Bisher ohne eindeutige Darstellung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_IDStellelement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	Stellelement getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @generated
	 */
	void setIDStellelement(Stellelement value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	void unsetIDStellelement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDStellelement <em>ID Stellelement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Stellelement</em>' reference is set.
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	boolean isSetIDStellelement();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_IDUnterbringung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>PZB Element GM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element GM</em>' containment reference.
	 * @see #setPZBElementGM(PZB_Element_GM_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_PZBElementGM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_GM'"
	 * @generated
	 */
	PZB_Element_GM_AttributeGroup getPZBElementGM();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getPZBElementGM <em>PZB Element GM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Element GM</em>' containment reference.
	 * @see #getPZBElementGM()
	 * @generated
	 */
	void setPZBElementGM(PZB_Element_GM_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>PZB Element GUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element GUE</em>' containment reference.
	 * @see #setPZBElementGUE(PZB_Element_GUE_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_PZBElementGUE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_GUE'"
	 * @generated
	 */
	PZB_Element_GUE_AttributeGroup getPZBElementGUE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element#getPZBElementGUE <em>PZB Element GUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Element GUE</em>' containment reference.
	 * @see #getPZBElementGUE()
	 * @generated
	 */
	void setPZBElementGUE(PZB_Element_GUE_AttributeGroup value);

} // PZB_Element
