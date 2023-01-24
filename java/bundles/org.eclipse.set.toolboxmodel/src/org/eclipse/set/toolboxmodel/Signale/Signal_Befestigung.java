/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Befestigung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Konstruktionselement, das der baulichen Aufnahme eines oder mehrerer Signalrahmen dient. Die konkreten konstruktiven Merkmale sind in einer (oder im Bedarfsfall mehreren) Regelzeichnung(en) enthalten, auf die jeweils ein GUID-Verweis zeigt. Bei Sonderkonstruktionen wird die Regelzeichnung durch die zugehörigen Zulassungsdokumente ersetzt. Diese sind als Anhang mittels eines Bearbeitungsvermerks beizufügen. Signalbefestigungen können auch weitere Signalbefestigungen aufnehmen (z.B. trägt ein Signalausleger eine Arbeitsbühne). Einer Signalbefestigung ist mindestens ein Objekt Signal Rahmen oder Signal Befestigung zugeordnet. Ausführliche Beschreibung s. Modellierung Signal. DB-Regelwerk Regelzeichnungen 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung()
 * @model extendedMetaData="name='CSignal_Befestigung' kind='elementOnly'"
 * @generated
 */
public interface Signal_Befestigung extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Regelzeichnung. Für Signale werden in der Regel die Regelzeichnungen der Gruppe S800x,yy verwendet, die die grundsätzliche Anordnung am Gleis beschreiben. Die angegebene Regelzeichnung wird mittels Parametern (z. B.: "Bild") weiter spezifiziert. Der Verweis kann mehrfach verwendet werden, wenn die Zuordnung mehrerer Regelzeichnungen explizit erforderlich ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_IDRegelzeichnung()
	 * @model extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	EList<Regelzeichnung> getIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>Signal Befestigung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_SignalBefestigungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigung_Allg'"
	 * @generated
	 */
	Signal_Befestigung_Allg_AttributeGroup getSignalBefestigungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #getSignalBefestigungAllg()
	 * @generated
	 */
	void setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Befestigung Bauwerk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Nicht-LST-Objekt (OL-Mast, Brücke, Stützwand), an dem die Signalbefestigung befestigt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Befestigung Bauwerk</em>' reference.
	 * @see #isSetIDBefestigungBauwerk()
	 * @see #unsetIDBefestigungBauwerk()
	 * @see #setIDBefestigungBauwerk(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_IDBefestigungBauwerk()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Befestigung_Bauwerk'"
	 * @generated
	 */
	Basis_Objekt getIDBefestigungBauwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Befestigung Bauwerk</em>' reference.
	 * @see #isSetIDBefestigungBauwerk()
	 * @see #unsetIDBefestigungBauwerk()
	 * @see #getIDBefestigungBauwerk()
	 * @generated
	 */
	void setIDBefestigungBauwerk(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBefestigungBauwerk()
	 * @see #getIDBefestigungBauwerk()
	 * @see #setIDBefestigungBauwerk(Basis_Objekt)
	 * @generated
	 */
	void unsetIDBefestigungBauwerk();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Befestigung Bauwerk</em>' reference is set.
	 * @see #unsetIDBefestigungBauwerk()
	 * @see #getIDBefestigungBauwerk()
	 * @see #setIDBefestigungBauwerk(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDBefestigungBauwerk();

	/**
	 * Returns the value of the '<em><b>ID Signal Befestigung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein zugehöriges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Einträgen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Befestigung</em>' reference.
	 * @see #isSetIDSignalBefestigung()
	 * @see #unsetIDSignalBefestigung()
	 * @see #setIDSignalBefestigung(Signal_Befestigung)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_IDSignalBefestigung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Befestigung'"
	 * @generated
	 */
	Signal_Befestigung getIDSignalBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Befestigung</em>' reference.
	 * @see #isSetIDSignalBefestigung()
	 * @see #unsetIDSignalBefestigung()
	 * @see #getIDSignalBefestigung()
	 * @generated
	 */
	void setIDSignalBefestigung(Signal_Befestigung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignalBefestigung()
	 * @see #getIDSignalBefestigung()
	 * @see #setIDSignalBefestigung(Signal_Befestigung)
	 * @generated
	 */
	void unsetIDSignalBefestigung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal Befestigung</em>' reference is set.
	 * @see #unsetIDSignalBefestigung()
	 * @see #getIDSignalBefestigung()
	 * @see #setIDSignalBefestigung(Signal_Befestigung)
	 * @generated
	 */
	boolean isSetIDSignalBefestigung();

} // Signal_Befestigung
