/**
 */
package org.eclipse.set.toolboxmodel.Medien_und_Trassen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel Verteilpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Punktförmige Installation zur Aufteilung bzw. Verschaltung von Kabeln (ohne Intelligenz).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getKabelVerteilpunktArt <em>Kabel Verteilpunkt Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt()
 * @model extendedMetaData="name='CKabel_Verteilpunkt' kind='elementOnly'"
 * @generated
 */
public interface Kabel_Verteilpunkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Kabel_Verteilpunkt_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Kabel_Verteilpunkt_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Kabel-Verteilpunkts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Kabel Verteilpunkt Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Unterbringung des Kabel-Verteilpunkts. Als Art der Unterbringung ist dabei immer "keine" auszuwählen, da der Kabel-Verteilpunkt selbst die physische Unterbringung definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Verteilpunkt Art</em>' containment reference.
	 * @see #setKabelVerteilpunktArt(Kabel_Verteilpunkt_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Verteilpunkt_KabelVerteilpunktArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Verteilpunkt_Art'"
	 * @generated
	 */
	Kabel_Verteilpunkt_Art_TypeClass getKabelVerteilpunktArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Verteilpunkt#getKabelVerteilpunktArt <em>Kabel Verteilpunkt Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Verteilpunkt Art</em>' containment reference.
	 * @see #getKabelVerteilpunktArt()
	 * @generated
	 */
	void setKabelVerteilpunktArt(Kabel_Verteilpunkt_Art_TypeClass value);

} // Kabel_Verteilpunkt
