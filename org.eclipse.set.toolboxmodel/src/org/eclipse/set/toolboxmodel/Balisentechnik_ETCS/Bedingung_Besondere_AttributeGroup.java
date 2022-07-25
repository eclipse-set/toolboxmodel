/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedingung Besondere Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_Besondere_AttributeGroup#getArtBedingung <em>Art Bedingung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Besondere_AttributeGroup()
 * @model extendedMetaData="name='CBedingung_Besondere' kind='elementOnly'"
 * @generated
 */
public interface Bedingung_Besondere_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Art Bedingung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besondere Art der Anschaltbedingung, wenn keine durch Signal, Weiche oder PZB-Element eindeutig bestimmte Anschaltbedingung zutrifft.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Bedingung</em>' containment reference.
	 * @see #setArtBedingung(Art_Bedingung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBedingung_Besondere_AttributeGroup_ArtBedingung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Art_Bedingung'"
	 * @generated
	 */
	Art_Bedingung_TypeClass getArtBedingung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_Besondere_AttributeGroup#getArtBedingung <em>Art Bedingung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Bedingung</em>' containment reference.
	 * @see #getArtBedingung()
	 * @generated
	 */
	void setArtBedingung(Art_Bedingung_TypeClass value);

} // Bedingung_Besondere_AttributeGroup
