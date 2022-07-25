/**
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ueberhoehung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Örtlicher Höhenunterschied beider Schienen eines Gleises in Querrichtung. Die Überhöhung ist eine Querneigung eines Gleises in einem Bogen an einem Punkt im Gleis. Durch die seitliche Lage (als Attribut des Punkt_Objektes - links oder rechts) wird die höhere Seite der beiden Schienen beschrieben. Ein Höhenpunkt, der unmittelbar auf einem Anfang oder Ende eines Weichenschenkels liegt (TOP_Kante, mit Anschluss_A oder Anschluss_B als Links oder Rechts) ist auf die TOP_Kante der Spitze dieser Weiche zu verorten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehung#getUeberhoehungAllg <em>Ueberhoehung Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getUeberhoehung()
 * @model extendedMetaData="name='CUeberhoehung' kind='elementOnly'"
 * @generated
 */
public interface Ueberhoehung extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Ueberhoehung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ueberhoehung Allg</em>' containment reference.
	 * @see #setUeberhoehungAllg(Ueberhoehung_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getUeberhoehung_UeberhoehungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehung_Allg'"
	 * @generated
	 */
	Ueberhoehung_Allg_AttributeGroup getUeberhoehungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehung#getUeberhoehungAllg <em>Ueberhoehung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehung Allg</em>' containment reference.
	 * @see #getUeberhoehungAllg()
	 * @generated
	 */
	void setUeberhoehungAllg(Ueberhoehung_Allg_AttributeGroup value);

} // Ueberhoehung
