/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Fahrweg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Unverzweigter Bereich auf dem Gleisnetz, der als Grundlage für den befahrenen Teil bzw. den Durchrutschweg einer Fahrstraße dient. Der Start befindet sich immer an einem Signal, das Ziel beim befahrenen Teil an einem Signal, beim Durchrutschweg (bzw. Gefahrpunktabstand) an einem markanten Punkt. Für Zug- und Rangierstraßen mit gleichem Fahrweg kann die gleiche Instanz von Fstr_Fahrweg verwendet werden; Ausnahmen siehe Fstr Abhaengigkeit. Hinweis zur Modellierung beim Durchrutschweg, wenn der Markante Punkt eine Weichenspitze ist: Läuft ein Durchrutschweg spitz auf eine Weiche zu und die Spitze dieser Weiche ist das Ende des Durchrutschwegs, dann endet das Bereichsobjekt Fstr_Fahrweg am Ende der Kante vor der Spitze der Weiche, ist der markante Punkt das Punktobjekt W_Kr_Gsp_Komponente, was auf anschließenden Kanten verweist. Damit liegen das Ende des Bereichsobjekts und der markante Punkt auf verschiedenen Kanten (jeweils mit Abstand 0 zum Knoten), dennoch beschreiben sie geografisch den gleichen Punkt. DB-Regelwerk Im heutigen Planungswerk findet sich der Weg nur implizit durch die Angabe für den befahrenen Teil von Start, Ziel und Entscheidungsweichen in der Zug- bzw. Rangierstraßentabelle, für den Durchrutschweg und Gefahrpunktabstand von Start und Ziel und allen Weichen in der Durchrutschweg- bzw. Gefahrpunkttabelle. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getFstrVHg <em>Fstr VHg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDStart <em>ID Start</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDZiel <em>ID Ziel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getStartSignalCharakter <em>Start Signal Charakter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Fahrweg()
 * @model extendedMetaData="name='CFstr_Fahrweg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Fahrweg extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Fstr VHg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeit, die bei Zugstraßen mit diesem befahrenen Teil ohne Einschränkung durch Zs 3 gefahren würde (Geschwindigkeit der Strecke). Das Attribut ist nur sinnvoll füllbar, wenn auf dem zugehörigen Fahrweg eine Zugstraße existiert, deren Befahrung mit Fahrtstellung eines Hauptsignals zugelassen wird. Es ist also nicht sinnvoll füllbar bei Instanzen von Fstr_Fahrweg, die nur von Rangierstraßen, Gefahrpunktabständen, Durchrutschwegen oder Hilfszugstraßen verwendet werden. Siehe auch Bildung der Signalbegriffe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr VHg</em>' containment reference.
	 * @see #setFstrVHg(Fstr_V_Hg_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Fahrweg_FstrVHg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_V_Hg'"
	 * @generated
	 */
	Fstr_V_Hg_TypeClass getFstrVHg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getFstrVHg <em>Fstr VHg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr VHg</em>' containment reference.
	 * @see #getFstrVHg()
	 * @generated
	 */
	void setFstrVHg(Fstr_V_Hg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Startpunkt von Fstr Fahrweg. Das Signal muss ein Haupt-, Sperrsignal oder ein Bedienpunkt sein. DB-Regelwerk Zugstraßentabelle: erster Bestandteil der Bezeichnung der Fstr; Durchrutschwegtabelle, Spalte 1: "von Signal". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Start</em>' reference.
	 * @see #isSetIDStart()
	 * @see #unsetIDStart()
	 * @see #setIDStart(Signal)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Fahrweg_IDStart()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Start'"
	 * @generated
	 */
	Signal getIDStart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDStart <em>ID Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Start</em>' reference.
	 * @see #isSetIDStart()
	 * @see #unsetIDStart()
	 * @see #getIDStart()
	 * @generated
	 */
	void setIDStart(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDStart <em>ID Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStart()
	 * @see #getIDStart()
	 * @see #setIDStart(Signal)
	 * @generated
	 */
	void unsetIDStart();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDStart <em>ID Start</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Start</em>' reference is set.
	 * @see #unsetIDStart()
	 * @see #getIDStart()
	 * @see #setIDStart(Signal)
	 * @generated
	 */
	boolean isSetIDStart();

	/**
	 * Returns the value of the '<em><b>ID Ziel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zielpunkt von Fstr Fahrweg. Der Zielpunkt besteht beim befahrenen Teil aus einem Signal mit der Ausprägung Hauptsignal, Sperrsignal oder Bedienpunkt, beim Durchrutschweg aus einem markanten Punkt. DB-Regelwerk Befahrener Teil: In der Fahrstraßentabelle genanntes Ziel der Fahrstraße; Durchrutschweg: Durchrutschwegtabelle, Spalte 2 "bis". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ziel</em>' reference.
	 * @see #isSetIDZiel()
	 * @see #unsetIDZiel()
	 * @see #setIDZiel(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Fahrweg_IDZiel()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ziel'"
	 * @generated
	 */
	Basis_Objekt getIDZiel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDZiel <em>ID Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ziel</em>' reference.
	 * @see #isSetIDZiel()
	 * @see #unsetIDZiel()
	 * @see #getIDZiel()
	 * @generated
	 */
	void setIDZiel(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDZiel <em>ID Ziel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZiel()
	 * @see #getIDZiel()
	 * @see #setIDZiel(Basis_Objekt)
	 * @generated
	 */
	void unsetIDZiel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getIDZiel <em>ID Ziel</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Ziel</em>' reference is set.
	 * @see #unsetIDZiel()
	 * @see #getIDZiel()
	 * @see #setIDZiel(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDZiel();

	/**
	 * Returns the value of the '<em><b>Start Signal Charakter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrwegbezogener Charakter des Start-Signals, sofern abweichend von der im Signal definierten Signal_Funktion. DB-Regelwerk Ril 819.1361, Tabelle der Signalabstände und Schutzstrecken
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Signal Charakter</em>' containment reference.
	 * @see #setStartSignalCharakter(Start_Signal_Charakter_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Fahrweg_StartSignalCharakter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Start_Signal_Charakter'"
	 * @generated
	 */
	Start_Signal_Charakter_TypeClass getStartSignalCharakter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg#getStartSignalCharakter <em>Start Signal Charakter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Signal Charakter</em>' containment reference.
	 * @see #getStartSignalCharakter()
	 * @generated
	 */
	void setStartSignalCharakter(Start_Signal_Charakter_TypeClass value);

} // Fstr_Fahrweg
