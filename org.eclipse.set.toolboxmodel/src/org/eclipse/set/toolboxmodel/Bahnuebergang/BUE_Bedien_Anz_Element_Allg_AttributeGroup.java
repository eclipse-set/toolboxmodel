/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Bedien Anz Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Bedien_Anz_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface BUE_Bedien_Anz_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BUE Handschalteinrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Handschalteinrichtungen des technisch gesicherten BÜ, die direkt auf die BÜ-Ein-/Ausschaltung wirken. AT: Ausschalttaste; ET: Einschalttaste; HAT: Hilfsausschalttaste; HET: Hilfseinschalttaste; RS: Rangierschalter; RT_ein_aus: 1. Tastendruck=EIN, 2. Tastendruck=AUS; RT_ein_RT_aus: jeweils ein Taster für EIN und AUS; UT: Unwirksamkeitstaste. AT, ET, HET und UT können gleisbezogen angeordnet werden; HAT, RS und RT (beide Ausführungen) wirken auf die gesamte BÜ-Anlage. DB-Regelwerk 819.1204 8 TM 2012.001 I.NVT 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Handschalteinrichtung</em>' containment reference.
	 * @see #setBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup_BUEHandschalteinrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Handschalteinrichtung'"
	 * @generated
	 */
	BUE_Handschalteinrichtung_TypeClass getBUEHandschalteinrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Handschalteinrichtung</em>' containment reference.
	 * @see #getBUEHandschalteinrichtung()
	 * @generated
	 */
	void setBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Anzeige Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bedien Anzeige Element, welches die Zuordnung zur Bedien Einrichtung Oertlich und damit zur physischen Unterbringung der Tasten herstellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Anzeige Element</em>' reference.
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDBedienAnzeigeElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Anzeige_Element'"
	 * @generated
	 */
	Bedien_Anzeige_Element getIDBedienAnzeigeElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @generated
	 */
	void unsetIDBedienAnzeigeElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Anzeige Element</em>' reference is set.
	 * @see #unsetIDBedienAnzeigeElement()
	 * @see #getIDBedienAnzeigeElement()
	 * @see #setIDBedienAnzeigeElement(Bedien_Anzeige_Element)
	 * @generated
	 */
	boolean isSetIDBedienAnzeigeElement();

	/**
	 * Returns the value of the '<em><b>ID Handschalt Wirkfunktion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige BUE Anlage (bei BÜ-bezogenen Funktionen) bzw. auf die zugehörige BUE Einschaltung / BUE Ausschaltung (bei gleisbezogenen Funktionen). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Handschalt Wirkfunktion</em>' reference.
	 * @see #isSetIDHandschaltWirkfunktion()
	 * @see #unsetIDHandschaltWirkfunktion()
	 * @see #setIDHandschaltWirkfunktion(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Bedien_Anz_Element_Allg_AttributeGroup_IDHandschaltWirkfunktion()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Handschalt_Wirkfunktion'"
	 * @generated
	 */
	Basis_Objekt getIDHandschaltWirkfunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Handschalt Wirkfunktion</em>' reference.
	 * @see #isSetIDHandschaltWirkfunktion()
	 * @see #unsetIDHandschaltWirkfunktion()
	 * @see #getIDHandschaltWirkfunktion()
	 * @generated
	 */
	void setIDHandschaltWirkfunktion(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDHandschaltWirkfunktion()
	 * @see #getIDHandschaltWirkfunktion()
	 * @see #setIDHandschaltWirkfunktion(Basis_Objekt)
	 * @generated
	 */
	void unsetIDHandschaltWirkfunktion();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Handschalt Wirkfunktion</em>' reference is set.
	 * @see #unsetIDHandschaltWirkfunktion()
	 * @see #getIDHandschaltWirkfunktion()
	 * @see #setIDHandschaltWirkfunktion(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDHandschaltWirkfunktion();

} // BUE_Bedien_Anz_Element_Allg_AttributeGroup
