/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Bezug Betrieblich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getDPBezugBetrieblichArt <em>DP Bezug Betrieblich Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Betrieblich_AttributeGroup()
 * @model extendedMetaData="name='CDP_Bezug_Betrieblich' kind='elementOnly'"
 * @generated
 */
public interface DP_Bezug_Betrieblich_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Bezug Betrieblich Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Zuordnung zum Signal mittelbar (z. B. Aufwerte-Datenpunkte) oder unmittelbar (z. B. Hauptsignal-DP) erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Bezug Betrieblich Art</em>' containment reference.
	 * @see #setDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Betrieblich_AttributeGroup_DPBezugBetrieblichArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Bezug_Betrieblich_Art'"
	 * @generated
	 */
	DP_Bezug_Betrieblich_Art_TypeClass getDPBezugBetrieblichArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getDPBezugBetrieblichArt <em>DP Bezug Betrieblich Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Bezug Betrieblich Art</em>' containment reference.
	 * @see #getDPBezugBetrieblichArt()
	 * @generated
	 */
	void setDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDDP Bezugspunkt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezugspunkt, auf den sich der Datenpunkt bezieht. Die Angabe ist nur erforderlich, sofern der Bezugspunkt nicht über eine zugehörige LEU-Anlage ermittelt werden kann bzw. soll. Große Metallteile werden über ZUB_Streckeneigenschaft abgebildet.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Bezugspunkt</em>' reference.
	 * @see #isSetIDDPBezugspunkt()
	 * @see #unsetIDDPBezugspunkt()
	 * @see #setIDDPBezugspunkt(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Betrieblich_AttributeGroup_IDDPBezugspunkt()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Bezugspunkt'"
	 * @generated
	 */
	Basis_Objekt getIDDPBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Bezugspunkt</em>' reference.
	 * @see #isSetIDDPBezugspunkt()
	 * @see #unsetIDDPBezugspunkt()
	 * @see #getIDDPBezugspunkt()
	 * @generated
	 */
	void setIDDPBezugspunkt(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDDPBezugspunkt()
	 * @see #getIDDPBezugspunkt()
	 * @see #setIDDPBezugspunkt(Basis_Objekt)
	 * @generated
	 */
	void unsetIDDPBezugspunkt();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDDP Bezugspunkt</em>' reference is set.
	 * @see #unsetIDDPBezugspunkt()
	 * @see #getIDDPBezugspunkt()
	 * @see #setIDDPBezugspunkt(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDDPBezugspunkt();

} // DP_Bezug_Betrieblich_AttributeGroup
