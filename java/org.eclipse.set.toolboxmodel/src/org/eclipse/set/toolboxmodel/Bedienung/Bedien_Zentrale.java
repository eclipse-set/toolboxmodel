/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Zentrale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Betriebsleitstelle eines EIU, aus der die Leit- und Sicherungstechnik von zentral gesteuerten ESTW planmäßig bedient wird. Die Betriebsleitstelle kann eine Betriebszentrale (BZ) der DB Netz oder auch eine zentrale Bedienstelle der Regionalnetze sein. Da die Bedien_Zentrale nicht notwendigerweise in der Nähe von Gleisen liegt, wird kein unmittelbarer Bezug zu einer Strecke hergestellt. Eine Örtlichkeit wird jedoch nach Ril 100 für den Standort festgelegt. In der Bedien_Zentrale sind die spezifischen Anhänge dargestellt. Weitere Pläne aus dem PT I BZ, wie beispielsweise Belegungspläne für Bodentanks, Kabelübersichtspläne, Verteilerbelegungspläne, Schrankpläne, Höheneinheiten und Patchfeldbelegungen in den Schränken für die BZ, werden als allgemeiner Anhang für die vererbten Eigenschaften aus dem Basisobjekt (Attribut Anhang) im Objekt Bedien_Zentrale angehängt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Zentrale()
 * @model extendedMetaData="name='CBedien_Zentrale' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Zentrale extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anhang Plan Bedienraum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Raumplan der Bedienräume als PDF-Anhang. Der Anhang beschreibt die Anordnung aller Bedienmöbel einer Bedienzentrale in den Bedienräumen zueinander sowie deren Anschlüsse für elektrische Energie, Potentialausgleich und Daten. Der Ein- und Ausbau von Bedienplätzen erfolgt in der üblichen Rot/Gelb-Darstellung. Beispiel: Media:Plan Bedieneben BZH.pdf 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Plan Bedienraum</em>' reference.
	 * @see #isSetIDAnhangPlanBedienraum()
	 * @see #unsetIDAnhangPlanBedienraum()
	 * @see #setIDAnhangPlanBedienraum(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Zentrale_IDAnhangPlanBedienraum()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Plan_Bedienraum'"
	 * @generated
	 */
	Anhang getIDAnhangPlanBedienraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Plan Bedienraum</em>' reference.
	 * @see #isSetIDAnhangPlanBedienraum()
	 * @see #unsetIDAnhangPlanBedienraum()
	 * @see #getIDAnhangPlanBedienraum()
	 * @generated
	 */
	void setIDAnhangPlanBedienraum(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangPlanBedienraum()
	 * @see #getIDAnhangPlanBedienraum()
	 * @see #setIDAnhangPlanBedienraum(Anhang)
	 * @generated
	 */
	void unsetIDAnhangPlanBedienraum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanBedienraum <em>ID Anhang Plan Bedienraum</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Plan Bedienraum</em>' reference is set.
	 * @see #unsetIDAnhangPlanBedienraum()
	 * @see #getIDAnhangPlanBedienraum()
	 * @see #setIDAnhangPlanBedienraum(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangPlanBedienraum();

	/**
	 * Returns the value of the '<em><b>ID Anhang Plan Rechnerraum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Raumplan der Rechnerräume als PDF-Anhang. Der Anhang beschreibt die Anordnung aller Rechnerschränke einer Bedienzentrale in den Rechnerräumen zueinander sowie deren Anschlüsse für elektrische Energie, Potentialausgleich und Daten. Der Ein- und Ausbau von Rechnerschränken erfolgt in der üblichen Rot/Gelb-Darstellung. Beispiel: Media:Plan Keller BZH.pdf
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Plan Rechnerraum</em>' reference.
	 * @see #isSetIDAnhangPlanRechnerraum()
	 * @see #unsetIDAnhangPlanRechnerraum()
	 * @see #setIDAnhangPlanRechnerraum(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Zentrale_IDAnhangPlanRechnerraum()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Plan_Rechnerraum'"
	 * @generated
	 */
	Anhang getIDAnhangPlanRechnerraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Plan Rechnerraum</em>' reference.
	 * @see #isSetIDAnhangPlanRechnerraum()
	 * @see #unsetIDAnhangPlanRechnerraum()
	 * @see #getIDAnhangPlanRechnerraum()
	 * @generated
	 */
	void setIDAnhangPlanRechnerraum(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangPlanRechnerraum()
	 * @see #getIDAnhangPlanRechnerraum()
	 * @see #setIDAnhangPlanRechnerraum(Anhang)
	 * @generated
	 */
	void unsetIDAnhangPlanRechnerraum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDAnhangPlanRechnerraum <em>ID Anhang Plan Rechnerraum</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Plan Rechnerraum</em>' reference is set.
	 * @see #unsetIDAnhangPlanRechnerraum()
	 * @see #getIDAnhangPlanRechnerraum()
	 * @see #setIDAnhangPlanRechnerraum(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangPlanRechnerraum();

	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung einer Bedienzentrale zu einer Streckennummer. Bedienzentralen (Betriebszentralen) der DB Netz AG werden willkürlich einer Strecke zugeordnet, um den Anforderungen der Richtlinie 100 minimal zu genügen. Diese Zuordnung ist auf die „Hülle“ der Zentrale bezogen, nicht auf die aus ihr gesteuerte Infrastruktur. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' reference.
	 * @see #isSetIDStrecke()
	 * @see #unsetIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Zentrale_IDStrecke()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	Strecke getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDStrecke <em>ID Strecke</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDStrecke <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStrecke()
	 * @see #getIDStrecke()
	 * @see #setIDStrecke(Strecke)
	 * @generated
	 */
	void unsetIDStrecke();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDStrecke <em>ID Strecke</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bedien_Zentrale_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Zentrale_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bedien_Zentrale_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bedien_Zentrale_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis zur Ermittlung des Ril 100-Bezeichners bei Bedienzentralen ohne abweichenden Namen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Zentrale_IDOertlichkeit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	Oertlichkeit getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	void unsetIDOertlichkeit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Zentrale#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Oertlichkeit</em>' reference is set.
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDOertlichkeit();

} // Bedien_Zentrale
