/**
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weichenlaufkette Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logisches Objekt für die Zuordnung zwischen Weichenlaufketten und Signalen. Das Objekt ist in der Realität des Stellwerkes nicht vorhanden. Die Weichenlaufkette_Zuordnung hat keine Attributgruppe "..._Allgemeine_Merkmale".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Zuordnung()
 * @model extendedMetaData="name='CWeichenlaufkette_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Weichenlaufkette_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal, dem die Weichenlaufkette zugeordnet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Zuordnung_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDSignal <em>ID Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal</em>' reference is set.
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	boolean isSetIDSignal();

	/**
	 * Returns the value of the '<em><b>ID Weichenlaufkette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Weichenlaufkette, die dem Signal zugeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Weichenlaufkette</em>' reference.
	 * @see #isSetIDWeichenlaufkette()
	 * @see #unsetIDWeichenlaufkette()
	 * @see #setIDWeichenlaufkette(Weichenlaufkette)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeichenlaufkette_Zuordnung_IDWeichenlaufkette()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Weichenlaufkette'"
	 * @generated
	 */
	Weichenlaufkette getIDWeichenlaufkette();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWeichenlaufkette()
	 * @see #getIDWeichenlaufkette()
	 * @see #setIDWeichenlaufkette(Weichenlaufkette)
	 * @generated
	 */
	void unsetIDWeichenlaufkette();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette_Zuordnung#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Weichenlaufkette</em>' reference is set.
	 * @see #unsetIDWeichenlaufkette()
	 * @see #getIDWeichenlaufkette()
	 * @see #setIDWeichenlaufkette(Weichenlaufkette)
	 * @generated
	 */
	boolean isSetIDWeichenlaufkette();

} // Weichenlaufkette_Zuordnung
