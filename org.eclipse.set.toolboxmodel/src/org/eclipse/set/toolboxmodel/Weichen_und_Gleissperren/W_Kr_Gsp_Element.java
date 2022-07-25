/**
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;
import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WKr Gsp Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Einzeln stellbarer Teil einer Weichenanlage oder einer Gleissperre, der höchstens zwei Stellungen (Fahrrichtung rechts oder links bzw. Entgleisungsschuh aufgelegt oder abgelegt) annehmen kann. Weichenanlagen bekommen 1 bzw. 2 Weichenelemente zugeordnet. Jedes Weichenelement besteht aus mindestens einer (ggf. mehreren) Komponenten (Zungenpaare), die die technische Sicht darstellen. Eine Kreuzung hat zwei Weichenelemente (A- und B-Seite). Im Fall beweglicher doppelter Herzstückspitzen hat die Kreuzung auch zwei Endlagen. Eine starre Kreuzung hat keine Regelzeichnung, da diese keinen Antrieb besitzt. Gleissperren haben kein Objekt im Sinn einer Anlage. Die Attributgruppen GZ_Freimeldung_R bzw. GZ_Freimeldung_L werden nur angegeben, wenn der rechte bzw. linke Schenkel einer Weiche nicht grenzzeichenfrei freigemeldet ist. Wenn das Element weder für eine Weiche oder Gleissperre genutzt wird (z.B. Verrrieglung einer beweglichen Brücke oder eines Tors), werden die Attributgruppen Gleissperre_Element und Weiche_Element nicht verwendet (optionale Choice). Siehe auch Modellierung Weichen. DB-Regelwerk Weichen werden gemäß Richtlinie 800.0120 gebaut. Für die Anordnung der Bauteile (einschließlich Antriebe) an einer Weiche und der Gleissperren existieren Regelzeichnungen der Gruppe S 73xx. Für die Planung von Weichen ist das Regelwerk 819.0401 zu beachten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWKrGspElementAllg <em>WKr Gsp Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getGleissperreElement <em>Gleissperre Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWeicheElement <em>Weiche Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element()
 * @model extendedMetaData="name='CW_Kr_Gsp_Element' kind='elementOnly'"
 * @generated
 */
public interface W_Kr_Gsp_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Regelzeichnung, sofern bei einer Weiche (z. B. DKW) oder Gleissperre (z. B. gekuppelte Gleissperre) mehrere Komponenten in einer Regelzeichnung zusammengefasst sind. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' reference.
	 * @see #isSetIDRegelzeichnung()
	 * @see #unsetIDRegelzeichnung()
	 * @see #setIDRegelzeichnung(Regelzeichnung)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_IDRegelzeichnung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	Regelzeichnung getIDRegelzeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Regelzeichnung</em>' reference.
	 * @see #isSetIDRegelzeichnung()
	 * @see #unsetIDRegelzeichnung()
	 * @see #getIDRegelzeichnung()
	 * @generated
	 */
	void setIDRegelzeichnung(Regelzeichnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDRegelzeichnung()
	 * @see #getIDRegelzeichnung()
	 * @see #setIDRegelzeichnung(Regelzeichnung)
	 * @generated
	 */
	void unsetIDRegelzeichnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Regelzeichnung</em>' reference is set.
	 * @see #unsetIDRegelzeichnung()
	 * @see #getIDRegelzeichnung()
	 * @see #setIDRegelzeichnung(Regelzeichnung)
	 * @generated
	 */
	boolean isSetIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>ID Stellelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enthält Informationen über den energetischen und logischen Anschluss der Objekte. Für das PZB Element ist der Verweis nur zu füllen, wenn das PZB_Element eine GÜ ist. DB-Regelwerk Bisher ohne eindeutige Darstellung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_IDStellelement()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	Stellelement getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDStellelement <em>ID Stellelement</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	void unsetIDStellelement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDStellelement <em>ID Stellelement</em>}' reference is set.
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
	 * Returns the value of the '<em><b>IDW Kr Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die W_Kr_Anlage, deren Bestandteil das W_Kr_Gsp_Element ist. Der Verweis wird nur für Weichen und Keuzungen verwendet. Er darf nicht bei Gleissperren verwendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Anlage</em>' reference.
	 * @see #isSetIDWKrAnlage()
	 * @see #unsetIDWKrAnlage()
	 * @see #setIDWKrAnlage(W_Kr_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_IDWKrAnlage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Anlage'"
	 * @generated
	 */
	W_Kr_Anlage getIDWKrAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWKrAnlage <em>IDW Kr Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Anlage</em>' reference.
	 * @see #isSetIDWKrAnlage()
	 * @see #unsetIDWKrAnlage()
	 * @see #getIDWKrAnlage()
	 * @generated
	 */
	void setIDWKrAnlage(W_Kr_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWKrAnlage <em>IDW Kr Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWKrAnlage()
	 * @see #getIDWKrAnlage()
	 * @see #setIDWKrAnlage(W_Kr_Anlage)
	 * @generated
	 */
	void unsetIDWKrAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWKrAnlage <em>IDW Kr Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDW Kr Anlage</em>' reference is set.
	 * @see #unsetIDWKrAnlage()
	 * @see #getIDWKrAnlage()
	 * @see #setIDWKrAnlage(W_Kr_Anlage)
	 * @generated
	 */
	boolean isSetIDWKrAnlage();

	/**
	 * Returns the value of the '<em><b>ID Weichenlaufkette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Weichenlaufkette, in der das Weichenelement enthalten ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Weichenlaufkette</em>' reference.
	 * @see #isSetIDWeichenlaufkette()
	 * @see #unsetIDWeichenlaufkette()
	 * @see #setIDWeichenlaufkette(Weichenlaufkette)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_IDWeichenlaufkette()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Weichenlaufkette'"
	 * @generated
	 */
	Weichenlaufkette getIDWeichenlaufkette();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Weichenlaufkette</em>' reference.
	 * @see #isSetIDWeichenlaufkette()
	 * @see #unsetIDWeichenlaufkette()
	 * @see #getIDWeichenlaufkette()
	 * @generated
	 */
	void setIDWeichenlaufkette(Weichenlaufkette value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWeichenlaufkette()
	 * @see #getIDWeichenlaufkette()
	 * @see #setIDWeichenlaufkette(Weichenlaufkette)
	 * @generated
	 */
	void unsetIDWeichenlaufkette();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Weichenlaufkette</em>' reference is set.
	 * @see #unsetIDWeichenlaufkette()
	 * @see #getIDWeichenlaufkette()
	 * @see #setIDWeichenlaufkette(Weichenlaufkette)
	 * @generated
	 */
	boolean isSetIDWeichenlaufkette();

	/**
	 * Returns the value of the '<em><b>WKr Gsp Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WKr Gsp Element Allg</em>' containment reference.
	 * @see #setWKrGspElementAllg(W_Kr_Gsp_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_WKrGspElementAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Gsp_Element_Allg'"
	 * @generated
	 */
	W_Kr_Gsp_Element_Allg_AttributeGroup getWKrGspElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWKrGspElementAllg <em>WKr Gsp Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WKr Gsp Element Allg</em>' containment reference.
	 * @see #getWKrGspElementAllg()
	 * @generated
	 */
	void setWKrGspElementAllg(W_Kr_Gsp_Element_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Gleissperre Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gleissperre Element</em>' containment reference.
	 * @see #setGleissperreElement(Gleissperre_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_GleissperreElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleissperre_Element'"
	 * @generated
	 */
	Gleissperre_Element_AttributeGroup getGleissperreElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getGleissperreElement <em>Gleissperre Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleissperre Element</em>' containment reference.
	 * @see #getGleissperreElement()
	 * @generated
	 */
	void setGleissperreElement(Gleissperre_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Weiche Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weiche Element</em>' containment reference.
	 * @see #setWeicheElement(Weiche_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_WeicheElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Weiche_Element'"
	 * @generated
	 */
	Weiche_Element_AttributeGroup getWeicheElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element#getWeicheElement <em>Weiche Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weiche Element</em>' containment reference.
	 * @see #getWeicheElement()
	 * @generated
	 */
	void setWeicheElement(Weiche_Element_AttributeGroup value);

} // W_Kr_Gsp_Element
