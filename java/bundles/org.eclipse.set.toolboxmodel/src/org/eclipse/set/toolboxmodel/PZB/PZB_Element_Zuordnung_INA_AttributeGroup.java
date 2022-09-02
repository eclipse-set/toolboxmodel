/**
 */
package org.eclipse.set.toolboxmodel.PZB;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung_INA' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung_INA_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang INA</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörigen Dokumente zur INA-Berechnung. Dazu gehören Erhebungsbogen, Wirkbereichsbogen und ggf. die Berechnungsblätter selbst. Diese werden für jedes Signal gesondert erstellt. DB-Regelwerk 819.1310A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang INA</em>' reference.
	 * @see #isSetIDAnhangINA()
	 * @see #unsetIDAnhangINA()
	 * @see #setIDAnhangINA(Anhang)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_INA'"
	 * @generated
	 */
	Anhang getIDAnhangINA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang INA</em>' reference.
	 * @see #isSetIDAnhangINA()
	 * @see #unsetIDAnhangINA()
	 * @see #getIDAnhangINA()
	 * @generated
	 */
	void setIDAnhangINA(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangINA()
	 * @see #getIDAnhangINA()
	 * @see #setIDAnhangINA(Anhang)
	 * @generated
	 */
	void unsetIDAnhangINA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang INA</em>' reference is set.
	 * @see #unsetIDAnhangINA()
	 * @see #getIDAnhangINA()
	 * @see #setIDAnhangINA(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangINA();

	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Kante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID der zugehörigen Bahnsteigkante bezogen auf ein Signal mit INA-Berechnung. Der Fall, dass zwei separate Bahnsteige zwischen Vor- und Hauptsignal angeordnet sind, wird nicht angenommen. Aus der bisherigen Praxis sind keine solchen Fälle bekannt. DB-Regelwerk 819.1310A02 2 (1) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Kante</em>' reference.
	 * @see #isSetIDBahnsteigKante()
	 * @see #unsetIDBahnsteigKante()
	 * @see #setIDBahnsteigKante(Bahnsteig_Kante)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Kante'"
	 * @generated
	 */
	Bahnsteig_Kante getIDBahnsteigKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Kante</em>' reference.
	 * @see #isSetIDBahnsteigKante()
	 * @see #unsetIDBahnsteigKante()
	 * @see #getIDBahnsteigKante()
	 * @generated
	 */
	void setIDBahnsteigKante(Bahnsteig_Kante value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBahnsteigKante()
	 * @see #getIDBahnsteigKante()
	 * @see #setIDBahnsteigKante(Bahnsteig_Kante)
	 * @generated
	 */
	void unsetIDBahnsteigKante();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bahnsteig Kante</em>' reference is set.
	 * @see #unsetIDBahnsteigKante()
	 * @see #getIDBahnsteigKante()
	 * @see #setIDBahnsteigKante(Bahnsteig_Kante)
	 * @generated
	 */
	boolean isSetIDBahnsteigKante();

	/**
	 * Returns the value of the '<em><b>ID Markanter Punkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des Markanten Punktes, welcher die maßgebende Gefahrenstelle für die INA-Berechnung ist. DB-Regelwerk 819.1310A02 2 (11) und (12) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Markanter Punkt</em>' reference.
	 * @see #isSetIDMarkanterPunkt()
	 * @see #unsetIDMarkanterPunkt()
	 * @see #setIDMarkanterPunkt(Markanter_Punkt)
	 * @see org.eclipse.set.toolboxmodel.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDMarkanterPunkt()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Markanter_Punkt'"
	 * @generated
	 */
	Markanter_Punkt getIDMarkanterPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Markanter Punkt</em>' reference.
	 * @see #isSetIDMarkanterPunkt()
	 * @see #unsetIDMarkanterPunkt()
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 */
	void setIDMarkanterPunkt(Markanter_Punkt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDMarkanterPunkt()
	 * @see #getIDMarkanterPunkt()
	 * @see #setIDMarkanterPunkt(Markanter_Punkt)
	 * @generated
	 */
	void unsetIDMarkanterPunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Markanter Punkt</em>' reference is set.
	 * @see #unsetIDMarkanterPunkt()
	 * @see #getIDMarkanterPunkt()
	 * @see #setIDMarkanterPunkt(Markanter_Punkt)
	 * @generated
	 */
	boolean isSetIDMarkanterPunkt();

} // PZB_Element_Zuordnung_INA_AttributeGroup
