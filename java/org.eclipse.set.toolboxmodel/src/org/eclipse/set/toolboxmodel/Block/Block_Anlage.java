/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Block;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Bezeichnung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technische Einrichtungen für die blocktechnische Sicherung von Zugfahrten auf Streckengleisen. Die zugehörige Bezeichnung des Streckengleises wird über das Objekt Gleis Bezeichnung ermittelt. Die Klammern der Gleisbezeichnung für Streckengleise sind Bestandteil der Gleisbezeichnung. Für die Darstellung der Streckendaten für eine Blockstrecke wird über das Objekt Block Element das Objekt Block Strecke verwendet. Ist Streckenblock geplant, wird einem Streckengleis eine Block_Anlage zugeordnet. Bei einer zweigleisigen Strecke, bei der beide Streckengleise mit Streckenblock ausgerüstet sind, wird den beiden Streckengleisen jeweils eine eigene Block_Anlage zugeordnet. Eine Block_Anlage verfügt über zwei Block_Elemente A und B (Blockendstellen), die entsprechend der Regelfahrrichtung zugewiesen werden. Bei eingleisigen Strecken ergibt sich der Richtungssinn A - B aus der Streckenkilometrierung. Eine Ausnahme bildet der Stichstreckenblock, dem nur ein Block Element zugeordnet wird. Als Zusammenfassung aller Objekte wird auch die Bezeichnung Block verwendet. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getBlockAnlageAllg <em>Block Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Anlage()
 * @model extendedMetaData="name='CBlock_Anlage' kind='elementOnly'"
 * @generated
 */
public interface Block_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Block Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Anlage Allg</em>' containment reference.
	 * @see #setBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Anlage_BlockAnlageAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Anlage_Allg'"
	 * @generated
	 */
	Block_Anlage_Allg_AttributeGroup getBlockAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getBlockAnlageAllg <em>Block Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Anlage Allg</em>' containment reference.
	 * @see #getBlockAnlageAllg()
	 * @generated
	 */
	void setBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Block Element A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Block_Element am Anfang einer Blockanlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Block Element A</em>' reference.
	 * @see #isSetIDBlockElementA()
	 * @see #unsetIDBlockElementA()
	 * @see #setIDBlockElementA(Block_Element)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Anlage_IDBlockElementA()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Block_Element_A'"
	 * @generated
	 */
	Block_Element getIDBlockElementA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Block Element A</em>' reference.
	 * @see #isSetIDBlockElementA()
	 * @see #unsetIDBlockElementA()
	 * @see #getIDBlockElementA()
	 * @generated
	 */
	void setIDBlockElementA(Block_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBlockElementA()
	 * @see #getIDBlockElementA()
	 * @see #setIDBlockElementA(Block_Element)
	 * @generated
	 */
	void unsetIDBlockElementA();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementA <em>ID Block Element A</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Block Element A</em>' reference is set.
	 * @see #unsetIDBlockElementA()
	 * @see #getIDBlockElementA()
	 * @see #setIDBlockElementA(Block_Element)
	 * @generated
	 */
	boolean isSetIDBlockElementA();

	/**
	 * Returns the value of the '<em><b>ID Block Element B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Block_Element am Ende einer Blockanlage. Die Angabe ist nur bei Stichstreckenblock nicht erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Block Element B</em>' reference.
	 * @see #isSetIDBlockElementB()
	 * @see #unsetIDBlockElementB()
	 * @see #setIDBlockElementB(Block_Element)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Anlage_IDBlockElementB()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Block_Element_B'"
	 * @generated
	 */
	Block_Element getIDBlockElementB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Block Element B</em>' reference.
	 * @see #isSetIDBlockElementB()
	 * @see #unsetIDBlockElementB()
	 * @see #getIDBlockElementB()
	 * @generated
	 */
	void setIDBlockElementB(Block_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBlockElementB()
	 * @see #getIDBlockElementB()
	 * @see #setIDBlockElementB(Block_Element)
	 * @generated
	 */
	void unsetIDBlockElementB();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDBlockElementB <em>ID Block Element B</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Block Element B</em>' reference is set.
	 * @see #unsetIDBlockElementB()
	 * @see #getIDBlockElementB()
	 * @see #setIDBlockElementB(Block_Element)
	 * @generated
	 */
	boolean isSetIDBlockElementB();

	/**
	 * Returns the value of the '<em><b>ID Gleis Bezeichnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Streckengleis als Träger der Bezeichnung des Streckengleises zwischen den beiden Blockendstellen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Bezeichnung</em>' reference.
	 * @see #isSetIDGleisBezeichnung()
	 * @see #unsetIDGleisBezeichnung()
	 * @see #setIDGleisBezeichnung(Gleis_Bezeichnung)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Anlage_IDGleisBezeichnung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Bezeichnung'"
	 * @generated
	 */
	Gleis_Bezeichnung getIDGleisBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Bezeichnung</em>' reference.
	 * @see #isSetIDGleisBezeichnung()
	 * @see #unsetIDGleisBezeichnung()
	 * @see #getIDGleisBezeichnung()
	 * @generated
	 */
	void setIDGleisBezeichnung(Gleis_Bezeichnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGleisBezeichnung()
	 * @see #getIDGleisBezeichnung()
	 * @see #setIDGleisBezeichnung(Gleis_Bezeichnung)
	 * @generated
	 */
	void unsetIDGleisBezeichnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Anlage#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Gleis Bezeichnung</em>' reference is set.
	 * @see #unsetIDGleisBezeichnung()
	 * @see #getIDGleisBezeichnung()
	 * @see #setIDGleisBezeichnung(Gleis_Bezeichnung)
	 * @generated
	 */
	boolean isSetIDGleisBezeichnung();

} // Block_Anlage
