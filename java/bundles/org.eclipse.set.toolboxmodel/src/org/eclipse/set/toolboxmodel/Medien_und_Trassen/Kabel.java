/**
 */
package org.eclipse.set.toolboxmodel.Medien_und_Trassen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Medium zur Übermittlung von Energie und/oder Information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel#getIDTrasseKante <em>ID Trasse Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel#getKabelAllg <em>Kabel Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel()
 * @model extendedMetaData="name='CKabel' kind='elementOnly'"
 * @generated
 */
public interface Kabel extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Kabel_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Kabel_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Kabel_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Trasse Kante</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Trassen-Kante des Kabel-Gefäßsystems, in dem das Kabel verlegt werden soll bzw. ist. Kurze Verbindungen sind auch ohne Kabelgefäßsystem möglich, z. B. zwischen zwei benachbarten Schaltkästen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Trasse Kante</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_IDTrasseKante()
	 * @model extendedMetaData="kind='element' name='ID_Trasse_Kante'"
	 * @generated
	 */
	EList<Trasse_Kante> getIDTrasseKante();

	/**
	 * Returns the value of the '<em><b>Kabel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kabel Allg</em>' containment reference.
	 * @see #setKabelAllg(Kabel_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_KabelAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Allg'"
	 * @generated
	 */
	Kabel_Allg_AttributeGroup getKabelAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel#getKabelAllg <em>Kabel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Allg</em>' containment reference.
	 * @see #getKabelAllg()
	 * @generated
	 */
	void setKabelAllg(Kabel_Allg_AttributeGroup value);

} // Kabel
