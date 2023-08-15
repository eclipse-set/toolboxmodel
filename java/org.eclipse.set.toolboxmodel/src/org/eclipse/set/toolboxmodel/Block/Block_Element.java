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

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Element am Ende einer Blockstrecke/Blockanlage. Ein Streckengleis, welches mit einer Block Anlage ausgerüstet ist, besitzt zwei korrespondierende Blockelemente in den benachbarten Betriebsstellen. Eine Ausnahme bildet der Stichstreckenblock, der nur ein Block_Element besitzt. Das Block_Element verweist auch auf die zugehörige Blockstrecke, die die relevanten blocktechnischen und betrieblichen Daten der Strecke enthält. Bei zweigleisigen Strecken verweisen zwei Blockelemente auf die Blockstrecke. Das Block_Element verweist auf ein Signal in Form des Streckenziels (A-Feld) und auf ein Schaltmittel zur Räumungsprüfung (E-Feld). Wenn eine gesonderte Zugschlussmeldung verwendet wird, wird mit ID_Zugschlussmeldung auf eine entsprechende Bedieneinrichtung verwiesen. Aus der Blockbauform der jeweiligen Endstelle kann die Art der technischen Realisierung erkannt werden. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getBlockElementAllg <em>Block Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element()
 * @model extendedMetaData="name='CBlock_Element' kind='elementOnly'"
 * @generated
 */
public interface Block_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Block Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Element Allg</em>' containment reference.
	 * @see #setBlockElementAllg(Block_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element_BlockElementAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Block_Element_Allg'"
	 * @generated
	 */
	Block_Element_Allg_AttributeGroup getBlockElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getBlockElementAllg <em>Block Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Element Allg</em>' containment reference.
	 * @see #getBlockElementAllg()
	 * @generated
	 */
	void setBlockElementAllg(Block_Element_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Block Element Erlaubnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Element Erlaubnis</em>' containment reference.
	 * @see #setBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element_BlockElementErlaubnis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Element_Erlaubnis'"
	 * @generated
	 */
	Block_Element_Erlaubnis_AttributeGroup getBlockElementErlaubnis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Element Erlaubnis</em>' containment reference.
	 * @see #getBlockElementErlaubnis()
	 * @generated
	 */
	void setBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Block Strecke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Block Element auf die zugehörige Block Strecke. Bei zweigleisigen Strecken verweisen zwei Block_Elemente auf die Block_Strecke. Bei eingleisigen Strecken verweist nur ein Block_Element auf die Block_Strecke. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Block Strecke</em>' reference.
	 * @see #isSetIDBlockStrecke()
	 * @see #unsetIDBlockStrecke()
	 * @see #setIDBlockStrecke(Block_Strecke)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element_IDBlockStrecke()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Block_Strecke'"
	 * @generated
	 */
	Block_Strecke getIDBlockStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Block Strecke</em>' reference.
	 * @see #isSetIDBlockStrecke()
	 * @see #unsetIDBlockStrecke()
	 * @see #getIDBlockStrecke()
	 * @generated
	 */
	void setIDBlockStrecke(Block_Strecke value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBlockStrecke()
	 * @see #getIDBlockStrecke()
	 * @see #setIDBlockStrecke(Block_Strecke)
	 * @generated
	 */
	void unsetIDBlockStrecke();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Block Strecke</em>' reference is set.
	 * @see #unsetIDBlockStrecke()
	 * @see #getIDBlockStrecke()
	 * @see #setIDBlockStrecke(Block_Strecke)
	 * @generated
	 */
	boolean isSetIDBlockStrecke();

	/**
	 * Returns the value of the '<em><b>ID Raeumungspruefung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Block Element auf die zugehörge Räumungsprüfung. Das Blockelement verweist über Schaltmittel Zuordnung auf ein Schaltmittel, welches zur Räumungsprüfung befahren und freigefahren werden muss. Nach erfolgreicher Räumungsprüfung kann der (automatische) Rückblock erfolgen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Raeumungspruefung</em>' reference.
	 * @see #isSetIDRaeumungspruefung()
	 * @see #unsetIDRaeumungspruefung()
	 * @see #setIDRaeumungspruefung(Schaltmittel_Zuordnung)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element_IDRaeumungspruefung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Raeumungspruefung'"
	 * @generated
	 */
	Schaltmittel_Zuordnung getIDRaeumungspruefung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Raeumungspruefung</em>' reference.
	 * @see #isSetIDRaeumungspruefung()
	 * @see #unsetIDRaeumungspruefung()
	 * @see #getIDRaeumungspruefung()
	 * @generated
	 */
	void setIDRaeumungspruefung(Schaltmittel_Zuordnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDRaeumungspruefung()
	 * @see #getIDRaeumungspruefung()
	 * @see #setIDRaeumungspruefung(Schaltmittel_Zuordnung)
	 * @generated
	 */
	void unsetIDRaeumungspruefung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Raeumungspruefung</em>' reference is set.
	 * @see #unsetIDRaeumungspruefung()
	 * @see #getIDRaeumungspruefung()
	 * @see #setIDRaeumungspruefung(Schaltmittel_Zuordnung)
	 * @generated
	 */
	boolean isSetIDRaeumungspruefung();

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein fiktives Signal (Ausfahrziel), über das die Abhängigkeit des zugehörigen A-Feldes beschrieben wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element_IDSignal()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDSignal <em>ID Signal</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDSignal <em>ID Signal</em>}' reference is set.
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
	 * Returns the value of the '<em><b>ID Zugschlussmeldung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Block Element auf die zugehörige Bedieneinrichtung zur Abgabe einer Zugschlussmeldung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Zugschlussmeldung</em>' reference.
	 * @see #isSetIDZugschlussmeldung()
	 * @see #unsetIDZugschlussmeldung()
	 * @see #setIDZugschlussmeldung(Bedien_Anzeige_Element)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Element_IDZugschlussmeldung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Zugschlussmeldung'"
	 * @generated
	 */
	Bedien_Anzeige_Element getIDZugschlussmeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Zugschlussmeldung</em>' reference.
	 * @see #isSetIDZugschlussmeldung()
	 * @see #unsetIDZugschlussmeldung()
	 * @see #getIDZugschlussmeldung()
	 * @generated
	 */
	void setIDZugschlussmeldung(Bedien_Anzeige_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZugschlussmeldung()
	 * @see #getIDZugschlussmeldung()
	 * @see #setIDZugschlussmeldung(Bedien_Anzeige_Element)
	 * @generated
	 */
	void unsetIDZugschlussmeldung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Zugschlussmeldung</em>' reference is set.
	 * @see #unsetIDZugschlussmeldung()
	 * @see #getIDZugschlussmeldung()
	 * @see #setIDZugschlussmeldung(Bedien_Anzeige_Element)
	 * @generated
	 */
	boolean isSetIDZugschlussmeldung();

} // Block_Element
