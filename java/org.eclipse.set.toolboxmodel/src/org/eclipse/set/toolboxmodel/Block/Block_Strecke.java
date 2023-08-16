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

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke_Bremsweg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Strecke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Speicherung der betrieblich relevanter Streckendaten einer Blockstrecke. Das Objekt enthält die zwischen zwei Zugmeldestellen typischen betrieblichen Informationen (Streckendaten) zur Information. Es wird dem Blockelement der zugehörigen Blockstelle zugeordnet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getBlockStreckeAllg <em>Block Strecke Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Strecke()
 * @model extendedMetaData="name='CBlock_Strecke' kind='elementOnly'"
 * @generated
 */
public interface Block_Strecke extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Block Strecke Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Strecke Allg</em>' containment reference.
	 * @see #setBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Strecke_BlockStreckeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Block_Strecke_Allg'"
	 * @generated
	 */
	Block_Strecke_Allg_AttributeGroup getBlockStreckeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getBlockStreckeAllg <em>Block Strecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Strecke Allg</em>' containment reference.
	 * @see #getBlockStreckeAllg()
	 * @generated
	 */
	void setBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Betriebsstelle Nachbar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Örtlichkeit der nächsten Zugmeldestelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Betriebsstelle Nachbar</em>' reference.
	 * @see #isSetIDBetriebsstelleNachbar()
	 * @see #unsetIDBetriebsstelleNachbar()
	 * @see #setIDBetriebsstelleNachbar(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Strecke_IDBetriebsstelleNachbar()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Betriebsstelle_Nachbar'"
	 * @generated
	 */
	Oertlichkeit getIDBetriebsstelleNachbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Betriebsstelle Nachbar</em>' reference.
	 * @see #isSetIDBetriebsstelleNachbar()
	 * @see #unsetIDBetriebsstelleNachbar()
	 * @see #getIDBetriebsstelleNachbar()
	 * @generated
	 */
	void setIDBetriebsstelleNachbar(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBetriebsstelleNachbar()
	 * @see #getIDBetriebsstelleNachbar()
	 * @see #setIDBetriebsstelleNachbar(Oertlichkeit)
	 * @generated
	 */
	void unsetIDBetriebsstelleNachbar();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Betriebsstelle Nachbar</em>' reference is set.
	 * @see #unsetIDBetriebsstelleNachbar()
	 * @see #getIDBetriebsstelleNachbar()
	 * @see #setIDBetriebsstelleNachbar(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDBetriebsstelleNachbar();

	/**
	 * Returns the value of the '<em><b>ID Knotenbahnhof</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Örtlichkeit des nächsten Knotenbahnhofs oder am Streckenende zur besseren Orientierung. Das Attribut ist nicht zu befüllen, wenn ID_Betriebsstelle_Nachbar bereits auf einen Knotenbahnhof oder die Örtlichkeit am Streckenende verweist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Knotenbahnhof</em>' reference.
	 * @see #isSetIDKnotenbahnhof()
	 * @see #unsetIDKnotenbahnhof()
	 * @see #setIDKnotenbahnhof(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Strecke_IDKnotenbahnhof()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Knotenbahnhof'"
	 * @generated
	 */
	Oertlichkeit getIDKnotenbahnhof();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Knotenbahnhof</em>' reference.
	 * @see #isSetIDKnotenbahnhof()
	 * @see #unsetIDKnotenbahnhof()
	 * @see #getIDKnotenbahnhof()
	 * @generated
	 */
	void setIDKnotenbahnhof(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDKnotenbahnhof()
	 * @see #getIDKnotenbahnhof()
	 * @see #setIDKnotenbahnhof(Oertlichkeit)
	 * @generated
	 */
	void unsetIDKnotenbahnhof();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Knotenbahnhof</em>' reference is set.
	 * @see #unsetIDKnotenbahnhof()
	 * @see #getIDKnotenbahnhof()
	 * @see #setIDKnotenbahnhof(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDKnotenbahnhof();

	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung auf die Strecke. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' reference.
	 * @see #isSetIDStrecke()
	 * @see #unsetIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Strecke_IDStrecke()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	Strecke getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke</em>' reference.
	 * @see #isSetIDStrecke()
	 * @see #unsetIDStrecke()
	 * @see #getIDStrecke()
	 * @generated
	 */
	void setIDStrecke(Strecke value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStrecke()
	 * @see #getIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @generated
	 */
	void unsetIDStrecke();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Strecke</em>' reference is set.
	 * @see #unsetIDStrecke()
	 * @see #getIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @generated
	 */
	boolean isSetIDStrecke();

	/**
	 * Returns the value of the '<em><b>ID Strecke Bremsweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bereichsobjekt Strecke_Bremsweg zur Angabe des Bremswegs der Strecke. Es besteht übergangsweise noch die Möglichkeit, das Attribut Bremsweg zu befüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke Bremsweg</em>' reference.
	 * @see #isSetIDStreckeBremsweg()
	 * @see #unsetIDStreckeBremsweg()
	 * @see #setIDStreckeBremsweg(Strecke_Bremsweg)
	 * @see org.eclipse.set.toolboxmodel.Block.BlockPackage#getBlock_Strecke_IDStreckeBremsweg()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke_Bremsweg'"
	 * @generated
	 */
	Strecke_Bremsweg getIDStreckeBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke Bremsweg</em>' reference.
	 * @see #isSetIDStreckeBremsweg()
	 * @see #unsetIDStreckeBremsweg()
	 * @see #getIDStreckeBremsweg()
	 * @generated
	 */
	void setIDStreckeBremsweg(Strecke_Bremsweg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStreckeBremsweg()
	 * @see #getIDStreckeBremsweg()
	 * @see #setIDStreckeBremsweg(Strecke_Bremsweg)
	 * @generated
	 */
	void unsetIDStreckeBremsweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Strecke Bremsweg</em>' reference is set.
	 * @see #unsetIDStreckeBremsweg()
	 * @see #getIDStreckeBremsweg()
	 * @see #setIDStreckeBremsweg(Strecke_Bremsweg)
	 * @generated
	 */
	boolean isSetIDStreckeBremsweg();

} // Block_Strecke
