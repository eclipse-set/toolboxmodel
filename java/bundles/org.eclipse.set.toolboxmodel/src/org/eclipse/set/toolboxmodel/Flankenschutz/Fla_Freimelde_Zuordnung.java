/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Freimelde Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung der freizuprüfenden Freimeldeabschnitte zur jeweiligen Flankenschutzmaßnahme. DB-Regelwerk Flankenschutztabelle, Spalte 10 "überwachter Schutzraum"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung()
 * @model extendedMetaData="name='CFla_Freimelde_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Fla_Freimelde_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fla Raum Freimeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob eine Freimeldung des Freimeldeabschnitts im Flankenschutzraum erfolgen soll (true) oder nicht (false). In der Regel werden die Freimeldeabschnitte des Flankenschutzraumes freigemeldet. Im Ausnahmefall kann bei Ersatzschutz auf die Freimeldung verzichtet werden (Lastenheft F1 Abschnitt Z 4.4.10). DB-Regelwerk Das Datum ist im jetzigen PT 1 höchstens unformal (Fußnote, Erläuterungsbericht) enthalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Raum Freimeldung</em>' containment reference.
	 * @see #setFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung_FlaRaumFreimeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fla_Raum_Freimeldung'"
	 * @generated
	 */
	Fla_Raum_Freimeldung_TypeClass getFlaRaumFreimeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Raum Freimeldung</em>' containment reference.
	 * @see #getFlaRaumFreimeldung()
	 * @generated
	 */
	void setFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fla Schutz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Flankenschutzfalls zu den dafür freizumeldenden Gleisfreimeldeabschnitten. DB-Regelwerk Flankenschutztabelle, Zeile. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Schutz</em>' reference.
	 * @see #isSetIDFlaSchutz()
	 * @see #unsetIDFlaSchutz()
	 * @see #setIDFlaSchutz(Fla_Schutz)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung_IDFlaSchutz()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Schutz'"
	 * @generated
	 */
	Fla_Schutz getIDFlaSchutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Schutz</em>' reference.
	 * @see #isSetIDFlaSchutz()
	 * @see #unsetIDFlaSchutz()
	 * @see #getIDFlaSchutz()
	 * @generated
	 */
	void setIDFlaSchutz(Fla_Schutz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaSchutz()
	 * @see #getIDFlaSchutz()
	 * @see #setIDFlaSchutz(Fla_Schutz)
	 * @generated
	 */
	void unsetIDFlaSchutz();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Schutz</em>' reference is set.
	 * @see #unsetIDFlaSchutz()
	 * @see #getIDFlaSchutz()
	 * @see #setIDFlaSchutz(Fla_Schutz)
	 * @generated
	 */
	boolean isSetIDFlaSchutz();

	/**
	 * Returns the value of the '<em><b>IDFMA Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung des freizuprüfenden Flankenschutzraums. DB-Regelwerk Flankenschutztabelle, Spalte 10: "überwachter Schutzraum". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage</em>' reference.
	 * @see #isSetIDFMAAnlage()
	 * @see #unsetIDFMAAnlage()
	 * @see #setIDFMAAnlage(FMA_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung_IDFMAAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage'"
	 * @generated
	 */
	FMA_Anlage getIDFMAAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFMA Anlage</em>' reference.
	 * @see #isSetIDFMAAnlage()
	 * @see #unsetIDFMAAnlage()
	 * @see #getIDFMAAnlage()
	 * @generated
	 */
	void setIDFMAAnlage(FMA_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFMAAnlage()
	 * @see #getIDFMAAnlage()
	 * @see #setIDFMAAnlage(FMA_Anlage)
	 * @generated
	 */
	void unsetIDFMAAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDFMA Anlage</em>' reference is set.
	 * @see #unsetIDFMAAnlage()
	 * @see #getIDFMAAnlage()
	 * @see #setIDFMAAnlage(FMA_Anlage)
	 * @generated
	 */
	boolean isSetIDFMAAnlage();

} // Fla_Freimelde_Zuordnung
