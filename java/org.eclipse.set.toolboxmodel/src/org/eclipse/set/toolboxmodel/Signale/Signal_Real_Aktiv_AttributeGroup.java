/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Real Aktiv Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getTunnelsignal <em>Tunnelsignal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Real_Aktiv' kind='elementOnly'"
 * @generated
 */
public interface Signal_Real_Aktiv_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der automatischen Einstellung.
	 * DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung; bei realen, aktiven Signalen mittelbar aus Angaben in der Zugstraßentabelle zu erkennen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Einstellung</em>' containment reference.
	 * @see #setAutoEinstellung(Auto_Einstellung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_AutoEinstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auto_Einstellung'"
	 * @generated
	 */
	Auto_Einstellung_TypeClass getAutoEinstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getAutoEinstellung <em>Auto Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Einstellung</em>' containment reference.
	 * @see #getAutoEinstellung()
	 * @generated
	 */
	void setAutoEinstellung(Auto_Einstellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Stellelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enthält Informationen über den energetischen und logischen Anschluss der Objekte. Für das PZB Element ist der Verweis nur zu füllen, wenn das PZB_Element eine GÜ ist. DB-Regelwerk Bisher ohne eindeutige Darstellung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_IDStellelement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Stellelement'"
	 * @generated
	 */
	Stellelement getIDStellelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellelement</em>' reference.
	 * @see #isSetIDStellelement()
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @generated
	 */
	void setIDStellelement(Stellelement value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	void unsetIDStellelement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getIDStellelement <em>ID Stellelement</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Stellelement</em>' reference is set.
	 * @see #unsetIDStellelement()
	 * @see #getIDStellelement()
	 * @see #setIDStellelement(Stellelement)
	 * @generated
	 */
	boolean isSetIDStellelement();

	/**
	 * Returns the value of the '<em><b>Sonstige Zulaessige Anordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anordnung von Aktiven Signalen bei mehreren parallelen Strecken oder beim Zusammenlauf von Strecken. DB-Regelwerk 819.0202 A03, Planungsdaten: Signaltabelle 1, Zeile 2. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstige Zulaessige Anordnung</em>' containment reference.
	 * @see #setSonstigeZulaessigeAnordnung(Sonstige_Zulaessige_Anordnung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_SonstigeZulaessigeAnordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Sonstige_Zulaessige_Anordnung'"
	 * @generated
	 */
	Sonstige_Zulaessige_Anordnung_TypeClass getSonstigeZulaessigeAnordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getSonstigeZulaessigeAnordnung <em>Sonstige Zulaessige Anordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstige Zulaessige Anordnung</em>' containment reference.
	 * @see #getSonstigeZulaessigeAnordnung()
	 * @generated
	 */
	void setSonstigeZulaessigeAnordnung(Sonstige_Zulaessige_Anordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Tunnelsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enthält zusätzliche Angaben zu Aktiven Signalen mit schaltbaren Signalbegriffen bezüglich der Nachtschaltung. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tunnelsignal</em>' containment reference.
	 * @see #setTunnelsignal(Tunnelsignal_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Real_Aktiv_AttributeGroup_Tunnelsignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tunnelsignal'"
	 * @generated
	 */
	Tunnelsignal_TypeClass getTunnelsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Real_Aktiv_AttributeGroup#getTunnelsignal <em>Tunnelsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tunnelsignal</em>' containment reference.
	 * @see #getTunnelsignal()
	 * @generated
	 */
	void setTunnelsignal(Tunnelsignal_TypeClass value);

} // Signal_Real_Aktiv_AttributeGroup
