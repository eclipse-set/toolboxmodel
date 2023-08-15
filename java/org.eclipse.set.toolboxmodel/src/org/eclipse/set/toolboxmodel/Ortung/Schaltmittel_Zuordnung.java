/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ortung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schaltmittel Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnungsobjekt für die punktuelle Auslösung von Schaltvorgängen. Beispiel: BÜSA, Rangier- und Ablaufanlagen. Schaltmittel sind oftmals separate Zugeinwirkungen (z. B. Radsensoren), es können aber auch Freimeldeabschnitte (FMA_Anlagen) oder Achszählpunkte (FMA_Komponenten) für den Zweck eines Schaltmittels mitverwendet werden (Doppelausnutzung). Ein Schaltmittel wiederum kann für unterschiedliche Funktionen vorgesehen sein. Das Zuordnungsobjekt Schaltmittel erfasst jeweils eine konkrete Anforderung (Verweis, der auf das anfordernde Objekt gerichtet ist, z.B. Bahnübergang EIN, Bahnübergang AUS, Fahrstraße verschließen und ordnet diese Funktion dann einer konkreten Anlage (Zugeinwirkung, Freimeldeabschnitt oder Achszählpunkt) sowie eine Beschriftung dieser Anlage im sicherungstechnischen Lageplan zu. Die Funktion "Fahrstraße verschließen (ID_Anforderung = Fstr_Fahrweg)" ist vorgesehen für den Anrückverschluss von Zugstraßen. Weitere Anwendungen sind aktuell nicht im Modell verankert. Der Verweis auf die Anforderung ist nicht erforderlich, wenn sich die Zuordnung eindeutig aus der Topologie ergibt (Beispiel: separates Schaltmittel für die Funktion "Zweites Haltfallkriterium"). In diesem Fall wird nur der Verweis auf die Anlage sowie die Beschriftung im Lageplan angegeben. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisfreimeldeplan.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDAnforderung <em>ID Anforderung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDSchalter <em>ID Schalter</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getSchaltmittelFunktion <em>Schaltmittel Funktion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getSchaltmittel_Zuordnung()
 * @model extendedMetaData="name='CSchaltmittel_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Schaltmittel_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anforderung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweist auf das Objekt, das eine Schaltanforderung stellt. Die Schaltanforderung erfolgt unabhängig von der konkreten Realisierung, diese Zuordnung wird über ID Schalter vorgenommen. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung, mittelbar aus Einträgen im Sicherungstechnischen Lageplan / BÜ-Lageplan zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anforderung</em>' reference.
	 * @see #isSetIDAnforderung()
	 * @see #unsetIDAnforderung()
	 * @see #setIDAnforderung(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getSchaltmittel_Zuordnung_IDAnforderung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anforderung'"
	 * @generated
	 */
	Basis_Objekt getIDAnforderung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDAnforderung <em>ID Anforderung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anforderung</em>' reference.
	 * @see #isSetIDAnforderung()
	 * @see #unsetIDAnforderung()
	 * @see #getIDAnforderung()
	 * @generated
	 */
	void setIDAnforderung(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDAnforderung <em>ID Anforderung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnforderung()
	 * @see #getIDAnforderung()
	 * @see #setIDAnforderung(Basis_Objekt)
	 * @generated
	 */
	void unsetIDAnforderung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDAnforderung <em>ID Anforderung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anforderung</em>' reference is set.
	 * @see #unsetIDAnforderung()
	 * @see #getIDAnforderung()
	 * @see #setIDAnforderung(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDAnforderung();

	/**
	 * Returns the value of the '<em><b>ID Schalter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Objekt, das eine Schaltanforderung bedient. Die Zuordnung des Schalters (Freimeldeabschnitt, Achszählpunkt oder Zugeinwirkung) erfolgt unabhängig von der konkreten Anforderung, diese Zuordnung wird über ID Anforderung vorgenommen. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung, mittelbar aus Einträgen im Sicherungstechnischen Lageplan / BÜ-Lageplan zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schalter</em>' reference.
	 * @see #isSetIDSchalter()
	 * @see #unsetIDSchalter()
	 * @see #setIDSchalter(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getSchaltmittel_Zuordnung_IDSchalter()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schalter'"
	 * @generated
	 */
	Basis_Objekt getIDSchalter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDSchalter <em>ID Schalter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schalter</em>' reference.
	 * @see #isSetIDSchalter()
	 * @see #unsetIDSchalter()
	 * @see #getIDSchalter()
	 * @generated
	 */
	void setIDSchalter(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDSchalter <em>ID Schalter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSchalter()
	 * @see #getIDSchalter()
	 * @see #setIDSchalter(Basis_Objekt)
	 * @generated
	 */
	void unsetIDSchalter();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getIDSchalter <em>ID Schalter</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Schalter</em>' reference is set.
	 * @see #unsetIDSchalter()
	 * @see #getIDSchalter()
	 * @see #setIDSchalter(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDSchalter();

	/**
	 * Returns the value of the '<em><b>Schaltmittel Funktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Funktion des Schaltmittels. Beispiele (und Erläuterung dazu): ARM (Anrückmeldung für BÜSA), Ein_BUE (Einschaltung von BÜSA), ZL_Anstoß (Zuglenk-Anstoß), Haltfall (zweites Haltfall-Kriterium bei Signalen). Zur Auswertung muss die Funktion noch mit dem unter ID Anforderung angegebenen Objekt vervollständigt werden. DB-Regelwerk Sicherungstechnischer Lageplan, BÜ-Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltmittel Funktion</em>' containment reference.
	 * @see #setSchaltmittelFunktion(Schaltmittel_Funktion_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Ortung.OrtungPackage#getSchaltmittel_Zuordnung_SchaltmittelFunktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schaltmittel_Funktion'"
	 * @generated
	 */
	Schaltmittel_Funktion_TypeClass getSchaltmittelFunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung#getSchaltmittelFunktion <em>Schaltmittel Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schaltmittel Funktion</em>' containment reference.
	 * @see #getSchaltmittelFunktion()
	 * @generated
	 */
	void setSchaltmittelFunktion(Schaltmittel_Funktion_TypeClass value);

} // Schaltmittel_Zuordnung
