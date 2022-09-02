/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterbringung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ort der Anordnung von nicht an das Gleis gebundenen Komponenten. Die Verortung der U. erfolgt entweder analog zum Punkt Objekt, mit einem GEO Punkt oder durch einen beschreibenden Text. Eine U. beschreibt in der Regel die Umhausung der Komponente. Ist sie nicht eingehaust, wird als Unterbringung Art "keine" angegeben. In diesen Fällen hat die Komponente dennoch eine Unterbringung Befestigung. Das ist z. B. der Fall, wenn eine wetterfeste Komponente (z. B. Schlüsselschalter) ohne Einhausung direkt an einem Pfosten befestigt ist. In einer U. können mehrere LST-Objekte untergebracht sein. Eine U. ist z. B. ein Betonschalthaus oder ein Schaltkasten. DB-Regelwerk Darstellung des Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getPunktObjektStrecke <em>Punkt Objekt Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getUnterbringungAllg <em>Unterbringung Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getStandortBeschreibung <em>Standort Beschreibung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung()
 * @model extendedMetaData="name='CUnterbringung' kind='elementOnly'"
 * @generated
 */
public interface Unterbringung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Zuordnung eines Objektes zu einer Strecke. Zur vererbungsspezifischen Befüllung der Attributgruppe siehe Modellierung Basisobjekte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Punkt Objekt Strecke</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_PunktObjektStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_Strecke'"
	 * @generated
	 */
	EList<Punkt_Objekt_Strecke_AttributeGroup> getPunktObjektStrecke();

	/**
	 * Returns the value of the '<em><b>Unterbringung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unterbringung Allg</em>' containment reference.
	 * @see #setUnterbringungAllg(Unterbringung_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_UnterbringungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Unterbringung_Allg'"
	 * @generated
	 */
	Unterbringung_Allg_AttributeGroup getUnterbringungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getUnterbringungAllg <em>Unterbringung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterbringung Allg</em>' containment reference.
	 * @see #getUnterbringungAllg()
	 * @generated
	 */
	void setUnterbringungAllg(Unterbringung_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Punkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen GEO Punkt, der eine Verortung über x- und y-Koordinate ermöglicht. DB-Regelwerk ESTW: Darstellung im sicherungstechnischen Lageplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Punkt</em>' reference.
	 * @see #isSetIDGEOPunkt()
	 * @see #unsetIDGEOPunkt()
	 * @see #setIDGEOPunkt(GEO_Punkt)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_IDGEOPunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Punkt'"
	 * @generated
	 */
	GEO_Punkt getIDGEOPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getIDGEOPunkt <em>IDGEO Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Punkt</em>' reference.
	 * @see #isSetIDGEOPunkt()
	 * @see #unsetIDGEOPunkt()
	 * @see #getIDGEOPunkt()
	 * @generated
	 */
	void setIDGEOPunkt(GEO_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getIDGEOPunkt <em>IDGEO Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOPunkt()
	 * @see #getIDGEOPunkt()
	 * @see #setIDGEOPunkt(GEO_Punkt)
	 * @generated
	 */
	void unsetIDGEOPunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getIDGEOPunkt <em>IDGEO Punkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGEO Punkt</em>' reference is set.
	 * @see #unsetIDGEOPunkt()
	 * @see #getIDGEOPunkt()
	 * @see #setIDGEOPunkt(GEO_Punkt)
	 * @generated
	 */
	boolean isSetIDGEOPunkt();

	/**
	 * Returns the value of the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Verortung eines Objektes an der Topologie. Die vererbungsspezifische Befüllung der zugehörigen Attribute wird auf der Seite Modellierung Basisobjekte beschrieben. Durch die mögliche Mehrfacheinbindung der Attributgruppe ist es möglich, ein Objekt (z. B. Grenzzeichen) mehreren topologischen Kanten zuzuordnen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Punkt Objekt TOP Kante</em>' containment reference.
	 * @see #setPunktObjektTOPKante(Punkt_Objekt_TOP_Kante_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_PunktObjektTOPKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_TOP_Kante'"
	 * @generated
	 */
	Punkt_Objekt_TOP_Kante_AttributeGroup getPunktObjektTOPKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Punkt Objekt TOP Kante</em>' containment reference.
	 * @see #getPunktObjektTOPKante()
	 * @generated
	 */
	void setPunktObjektTOPKante(Punkt_Objekt_TOP_Kante_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Standort Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textuelle Beschreibung des Standorts der Unterbringung. Das Attribut wird genutzt, wenn eine punktförmige Verortung nicht möglich ist, z. B. aufgrund der großen Entfernung des Standorts und der somit bedingten Lage außerhalb des Planungs- oder Betrachtungsbereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standort Beschreibung</em>' containment reference.
	 * @see #setStandortBeschreibung(Standort_Beschreibung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_StandortBeschreibung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Standort_Beschreibung'"
	 * @generated
	 */
	Standort_Beschreibung_TypeClass getStandortBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung#getStandortBeschreibung <em>Standort Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standort Beschreibung</em>' containment reference.
	 * @see #getStandortBeschreibung()
	 * @generated
	 */
	void setStandortBeschreibung(Standort_Beschreibung_TypeClass value);

} // Unterbringung
