/**
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hoehenpunkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Örtliche Höhe des Bezugspunkts gemäß des Höhensystems. Liegt der Höhenpunkt innerhalb des zugehörigen Gleises, wird dieser mit einem Seitlichen Abstand im Punkt_Objekt von 0.000 angegeben und gibt die Höhe des Gleises in Meter gemäß Höhensystem an. Wird eine seitlicher Abstand ungleich 0.000 angegeben, so handelt es sich um einen sonstigen Höhenpunkt, der nicht die Höhenlage des Gleises angibt. Ein Höhenpunkt, der unmittelbar auf einem Anfang oder Ende eines Weichenschenkels liegt (TOP_Kante, mit Anschluss_A oder Anschluss_B als Links oder Rechts) ist auf die TOP_Kante der Spitze dieser Weiche zu verorten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenpunkt#getHoehenpunktAllg <em>Hoehenpunkt Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getHoehenpunkt()
 * @model extendedMetaData="name='CHoehenpunkt' kind='elementOnly'"
 * @generated
 */
public interface Hoehenpunkt extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Hoehenpunkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hoehenpunkt Allg</em>' containment reference.
	 * @see #setHoehenpunktAllg(Hoehenpunkt_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getHoehenpunkt_HoehenpunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenpunkt_Allg'"
	 * @generated
	 */
	Hoehenpunkt_Allg_AttributeGroup getHoehenpunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Hoehenpunkt#getHoehenpunktAllg <em>Hoehenpunkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenpunkt Allg</em>' containment reference.
	 * @see #getHoehenpunktAllg()
	 * @generated
	 */
	void setHoehenpunktAllg(Hoehenpunkt_Allg_AttributeGroup value);

} // Hoehenpunkt
