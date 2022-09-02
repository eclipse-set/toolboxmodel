/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Kreuzungsplan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verortungspunkte des für die BÜ-Planung verwendeten bautechnischen BÜ-Kreuzungsplans. Sofern der Anhang nicht als GeoTiff vorliegt, sind mindestens 2 Verortungspunkte anzugeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan()
 * @model extendedMetaData="name='CBUE_Kreuzungsplan' kind='elementOnly'"
 * @generated
 */
public interface BUE_Kreuzungsplan extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>BUE Kreuzungsplan Koordinaten</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BUE Kreuzungsplan Koordinaten</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_BUEKreuzungsplanKoordinaten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Kreuzungsplan_Koordinaten'"
	 * @generated
	 */
	EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> getBUEKreuzungsplanKoordinaten();

	/**
	 * Returns the value of the '<em><b>ID Anhang Kreuzungsplan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den einzubindenden bautechnischen BÜ-Kreuzungsplan als Bild.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Kreuzungsplan</em>' reference.
	 * @see #isSetIDAnhangKreuzungsplan()
	 * @see #unsetIDAnhangKreuzungsplan()
	 * @see #setIDAnhangKreuzungsplan(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getBUE_Kreuzungsplan_IDAnhangKreuzungsplan()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Kreuzungsplan'"
	 * @generated
	 */
	Anhang getIDAnhangKreuzungsplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Kreuzungsplan</em>' reference.
	 * @see #isSetIDAnhangKreuzungsplan()
	 * @see #unsetIDAnhangKreuzungsplan()
	 * @see #getIDAnhangKreuzungsplan()
	 * @generated
	 */
	void setIDAnhangKreuzungsplan(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangKreuzungsplan()
	 * @see #getIDAnhangKreuzungsplan()
	 * @see #setIDAnhangKreuzungsplan(Anhang)
	 * @generated
	 */
	void unsetIDAnhangKreuzungsplan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Kreuzungsplan</em>' reference is set.
	 * @see #unsetIDAnhangKreuzungsplan()
	 * @see #getIDAnhangKreuzungsplan()
	 * @see #setIDAnhangKreuzungsplan(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangKreuzungsplan();

} // BUE_Kreuzungsplan
