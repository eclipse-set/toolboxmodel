/**
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien GBT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Planung aller Parameter, die für die Darstellung der Gleisbenutzungstabelle (GBT) auf dem Bedienplatz für den Nutzer erforderlich sind.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getBedienGBTAllg <em>Bedien GBT Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_GBT()
 * @model extendedMetaData="name='CBedien_GBT' kind='elementOnly'"
 * @generated
 */
public interface Bedien_GBT extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien GBT Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien GBT Allg</em>' containment reference.
	 * @see #setBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_GBT_BedienGBTAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_GBT_Allg'"
	 * @generated
	 */
	Bedien_GBT_Allg_AttributeGroup getBedienGBTAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getBedienGBTAllg <em>Bedien GBT Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien GBT Allg</em>' containment reference.
	 * @see #getBedienGBTAllg()
	 * @generated
	 */
	void setBedienGBTAllg(Bedien_GBT_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Vorgabe GBT</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang mit Parametern für die Anzahl und Anordnung der Zuglenkbetriebsstellen in der Gleisbenutzungstabelle (GBT). Die konkreten Inhalte werden derzeit abgestimmt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Vorgabe GBT</em>' reference.
	 * @see #isSetIDAnhangVorgabeGBT()
	 * @see #unsetIDAnhangVorgabeGBT()
	 * @see #setIDAnhangVorgabeGBT(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_GBT_IDAnhangVorgabeGBT()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Vorgabe_GBT'"
	 * @generated
	 */
	Anhang getIDAnhangVorgabeGBT();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Vorgabe GBT</em>' reference.
	 * @see #isSetIDAnhangVorgabeGBT()
	 * @see #unsetIDAnhangVorgabeGBT()
	 * @see #getIDAnhangVorgabeGBT()
	 * @generated
	 */
	void setIDAnhangVorgabeGBT(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangVorgabeGBT()
	 * @see #getIDAnhangVorgabeGBT()
	 * @see #setIDAnhangVorgabeGBT(Anhang)
	 * @generated
	 */
	void unsetIDAnhangVorgabeGBT();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDAnhangVorgabeGBT <em>ID Anhang Vorgabe GBT</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Vorgabe GBT</em>' reference is set.
	 * @see #unsetIDAnhangVorgabeGBT()
	 * @see #getIDAnhangVorgabeGBT()
	 * @see #setIDAnhangVorgabeGBT(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangVorgabeGBT();

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Eigenschaften der Gleisbelegungstabelle als Element der Bedienoberfläche werden derzeit noch modelliert. Deshalb erfolgt eine Beschreibung aller damit zusammenhängender Eigenschaften und Verweise erst nach Abschluss dieser Konsolidierungsphase. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk</em>' reference.
	 * @see #isSetIDBedienBezirk()
	 * @see #unsetIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_GBT_IDBedienBezirk()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk'"
	 * @generated
	 */
	Bedien_Bezirk getIDBedienBezirk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk</em>' reference.
	 * @see #isSetIDBedienBezirk()
	 * @see #unsetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @generated
	 */
	void setIDBedienBezirk(Bedien_Bezirk value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @generated
	 */
	void unsetIDBedienBezirk();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_GBT#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Bezirk</em>' reference is set.
	 * @see #unsetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @generated
	 */
	boolean isSetIDBedienBezirk();

} // Bedien_GBT
