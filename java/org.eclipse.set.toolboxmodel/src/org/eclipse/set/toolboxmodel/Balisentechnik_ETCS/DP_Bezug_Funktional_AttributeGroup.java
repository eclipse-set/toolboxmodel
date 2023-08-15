/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Bezug Funktional Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getDPBezugFunktionalArt <em>DP Bezug Funktional Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Funktional_AttributeGroup()
 * @model extendedMetaData="name='CDP_Bezug_Funktional' kind='elementOnly'"
 * @generated
 */
public interface DP_Bezug_Funktional_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Bezug Funktional Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Zuordnung zum Signal mittelbar (z. B. Aufwerte-Datenpunkte) oder unmittelbar (z. B. Hauptsignal-DP) erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Bezug Funktional Art</em>' containment reference.
	 * @see #setDPBezugFunktionalArt(DP_Bezug_Funktional_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Funktional_AttributeGroup_DPBezugFunktionalArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Bezug_Funktional_Art'"
	 * @generated
	 */
	DP_Bezug_Funktional_Art_TypeClass getDPBezugFunktionalArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getDPBezugFunktionalArt <em>DP Bezug Funktional Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Bezug Funktional Art</em>' containment reference.
	 * @see #getDPBezugFunktionalArt()
	 * @generated
	 */
	void setDPBezugFunktionalArt(DP_Bezug_Funktional_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDDP Bezug Funktional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element, auf das sich der fachliche Inhalt des Datenpunkts bezieht. Der fachliche Bezug kann Vorgaben für die Positionierung des Datenpunkts beinhalten. Die Angabe ist nur erforderlich, sofern sich dieser Punkt nicht über eine zugehörige LEU-Anlage ermittelt werden kann bzw. soll. Große Metallteile werden über ZUB_Streckeneigenschaft abgebildet. Bei ETCS L2 erfolgt die Angabe des Bezugspunkts im Zuammenhang mit dem DP-Typ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Bezug Funktional</em>' reference.
	 * @see #isSetIDDPBezugFunktional()
	 * @see #unsetIDDPBezugFunktional()
	 * @see #setIDDPBezugFunktional(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Bezug_Funktional_AttributeGroup_IDDPBezugFunktional()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Bezug_Funktional'"
	 * @generated
	 */
	Basis_Objekt getIDDPBezugFunktional();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Bezug Funktional</em>' reference.
	 * @see #isSetIDDPBezugFunktional()
	 * @see #unsetIDDPBezugFunktional()
	 * @see #getIDDPBezugFunktional()
	 * @generated
	 */
	void setIDDPBezugFunktional(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDDPBezugFunktional()
	 * @see #getIDDPBezugFunktional()
	 * @see #setIDDPBezugFunktional(Basis_Objekt)
	 * @generated
	 */
	void unsetIDDPBezugFunktional();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Funktional_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDDP Bezug Funktional</em>' reference is set.
	 * @see #unsetIDDPBezugFunktional()
	 * @see #getIDDPBezugFunktional()
	 * @see #setIDDPBezugFunktional(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDDPBezugFunktional();

} // DP_Bezug_Funktional_AttributeGroup
