/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Signalbegriff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stellt eine Information optisch dar, die das Signal dem Triebfahrzeugführer übermitteln soll. Signalbegriffe werden im Signalbuch (Ril 301) durch eine Kurzbezeichnung (z. B. "Zs 1") und / oder durch eine Langbezeichnung (z. B. "Ersatzsignal") beschrieben. Diese und weitere feste Eigenschaften wie der Wertevorrat der anzeigbaren Symbole eines Signalbegriffs sind im Objekt Signalbegriff definiert, das mittels des Attributes Signalbegriff ID eingebunden wird. Anschaltdauer, Beleuchtung und Schaltbarkeit sind nicht fest, sondern wählbar an den Signalbegriff nach Signalbuch gekoppelt und so Eigenschaft des Objekts Signal_Signalbegriff. Ein Signal_Signalbegriff befindet sich immer in einem Signal Rahmen. Ausführliche Beschreibung s. Modellierung Signal DB-Regelwerk Ril 301, Planungsdaten: Sicherungstechnischer Lageplan, statische Eigenschaften: Signaltabelle 1, dynamische Eigenschaften: Signaltabelle 2. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getIDSignalRahmen <em>ID Signal Rahmen</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getSignalSignalbegriffAllg <em>Signal Signalbegriff Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getSignalbegriffID <em>Signalbegriff ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Signalbegriff()
 * @model extendedMetaData="name='CSignal_Signalbegriff' kind='elementOnly'"
 * @generated
 */
public interface Signal_Signalbegriff extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal Rahmen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den den Signalbegriff beinhaltenden Signal Rahmen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Rahmen</em>' reference.
	 * @see #isSetIDSignalRahmen()
	 * @see #unsetIDSignalRahmen()
	 * @see #setIDSignalRahmen(Signal_Rahmen)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Signalbegriff_IDSignalRahmen()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Rahmen'"
	 * @generated
	 */
	Signal_Rahmen getIDSignalRahmen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getIDSignalRahmen <em>ID Signal Rahmen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Rahmen</em>' reference.
	 * @see #isSetIDSignalRahmen()
	 * @see #unsetIDSignalRahmen()
	 * @see #getIDSignalRahmen()
	 * @generated
	 */
	void setIDSignalRahmen(Signal_Rahmen value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getIDSignalRahmen <em>ID Signal Rahmen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignalRahmen()
	 * @see #getIDSignalRahmen()
	 * @see #setIDSignalRahmen(Signal_Rahmen)
	 * @generated
	 */
	void unsetIDSignalRahmen();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getIDSignalRahmen <em>ID Signal Rahmen</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal Rahmen</em>' reference is set.
	 * @see #unsetIDSignalRahmen()
	 * @see #getIDSignalRahmen()
	 * @see #setIDSignalRahmen(Signal_Rahmen)
	 * @generated
	 */
	boolean isSetIDSignalRahmen();

	/**
	 * Returns the value of the '<em><b>Signal Signalbegriff Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Signalbegriff Allg</em>' containment reference.
	 * @see #setSignalSignalbegriffAllg(Signal_Signalbegriff_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Signalbegriff_SignalSignalbegriffAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Signalbegriff_Allg'"
	 * @generated
	 */
	Signal_Signalbegriff_Allg_AttributeGroup getSignalSignalbegriffAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getSignalSignalbegriffAllg <em>Signal Signalbegriff Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Signalbegriff Allg</em>' containment reference.
	 * @see #getSignalSignalbegriffAllg()
	 * @generated
	 */
	void setSignalSignalbegriffAllg(Signal_Signalbegriff_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signalbegriff ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifikator des einzubindenden Signalbegriffs. Der Wert für dieses Attribut ist aus einer vorgegebenen Liste (Objektnamen aus TCSignalbegriff) auswählbar. Die Verknüpfung unterscheidet sich von den sonst im Modell üblichen GUID-Verweisen, daher wurde bei der Bildung des Attributnamens auch von der Form "ID_..." abgewichen. DB-Regelwerk Signaltabelle 1, ist aus den Einträgen in Zeilen 14-27 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalbegriff ID</em>' containment reference.
	 * @see #setSignalbegriffID(Signalbegriff_ID_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Signalbegriff_SignalbegriffID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signalbegriff_ID'"
	 * @generated
	 */
	Signalbegriff_ID_TypeClass getSignalbegriffID();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff#getSignalbegriffID <em>Signalbegriff ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalbegriff ID</em>' containment reference.
	 * @see #getSignalbegriffID()
	 * @generated
	 */
	void setSignalbegriffID(Signalbegriff_ID_TypeClass value);

} // Signal_Signalbegriff
