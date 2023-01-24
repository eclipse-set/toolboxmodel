/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zugnummernmeldeanlage. Wird die ZN-Anlage zusammen mit dem ESTW geplant, gibt es keinen Verweis auf die Anhänge, da die ZN bereits in der ESTW-Konfiguration berücksichtigt ist. Wird die ZN nachgerüstet, sind die Verweise auf ESTW_Zentraleinheit und Anhänge vorhanden. Kann eine ESTW-Bauform keine ZN berücksichtigen, dann gibt es keinen Verweis auf ESTW_Zentraleinheit. DB-Regelwerk 819.0731 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDStellwerk <em>ID Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getZNAllg <em>ZN Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN()
 * @model extendedMetaData="name='CZN' kind='elementOnly'"
 * @generated
 */
public interface ZN extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anhang ZN Plan Bedienraum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des Raumplans Bedienraum, der als Anhang im Format PDF beigefügt wird. Bei Planung einer ZN-Einwahlstelle bzw. einer ZN in der Nachbarbetriebsstelle ist die Anordnung von Möbeln mit Unterbringung der ZN-Komponenten für den Bedienraum des Stw in einem Plan darzustellen. Dieser wird als PDF beigefügt. Wird die ZN zusammen mit dem zugehörigen ESTW geplant, gibt es keinen Anhang. DB-Regelwerk 819.0731 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang ZN Plan Bedienraum</em>' reference.
	 * @see #isSetIDAnhangZNPlanBedienraum()
	 * @see #unsetIDAnhangZNPlanBedienraum()
	 * @see #setIDAnhangZNPlanBedienraum(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDAnhangZNPlanBedienraum()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_ZN_Plan_Bedienraum'"
	 * @generated
	 */
	Anhang getIDAnhangZNPlanBedienraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang ZN Plan Bedienraum</em>' reference.
	 * @see #isSetIDAnhangZNPlanBedienraum()
	 * @see #unsetIDAnhangZNPlanBedienraum()
	 * @see #getIDAnhangZNPlanBedienraum()
	 * @generated
	 */
	void setIDAnhangZNPlanBedienraum(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangZNPlanBedienraum()
	 * @see #getIDAnhangZNPlanBedienraum()
	 * @see #setIDAnhangZNPlanBedienraum(Anhang)
	 * @generated
	 */
	void unsetIDAnhangZNPlanBedienraum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang ZN Plan Bedienraum</em>' reference is set.
	 * @see #unsetIDAnhangZNPlanBedienraum()
	 * @see #getIDAnhangZNPlanBedienraum()
	 * @see #setIDAnhangZNPlanBedienraum(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangZNPlanBedienraum();

	/**
	 * Returns the value of the '<em><b>ID Anhang ZN Plan Rechnerraum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des Raumplans Rechnerraum, der als Anhang im Format PDF beigefügt wird. Bei Planung einer ZN-Einwahlstelle bzw. einer ZN in der Nachbarbetriebsstelle ist die Anordnung von ZN-Komponenten im Rechnerraum des Stw in einem Plan darzustellen. Dieser wird als PDF beigefügt. Wird die ZN zusammen mit dem zugehörigen ESTW geplant, gibt es keinen Anhang. DB-Regelwerk 819.0731 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang ZN Plan Rechnerraum</em>' reference.
	 * @see #isSetIDAnhangZNPlanRechnerraum()
	 * @see #unsetIDAnhangZNPlanRechnerraum()
	 * @see #setIDAnhangZNPlanRechnerraum(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDAnhangZNPlanRechnerraum()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_ZN_Plan_Rechnerraum'"
	 * @generated
	 */
	Anhang getIDAnhangZNPlanRechnerraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang ZN Plan Rechnerraum</em>' reference.
	 * @see #isSetIDAnhangZNPlanRechnerraum()
	 * @see #unsetIDAnhangZNPlanRechnerraum()
	 * @see #getIDAnhangZNPlanRechnerraum()
	 * @generated
	 */
	void setIDAnhangZNPlanRechnerraum(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangZNPlanRechnerraum()
	 * @see #getIDAnhangZNPlanRechnerraum()
	 * @see #setIDAnhangZNPlanRechnerraum(Anhang)
	 * @generated
	 */
	void unsetIDAnhangZNPlanRechnerraum();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang ZN Plan Rechnerraum</em>' reference is set.
	 * @see #unsetIDAnhangZNPlanRechnerraum()
	 * @see #getIDAnhangZNPlanRechnerraum()
	 * @see #setIDAnhangZNPlanRechnerraum(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangZNPlanRechnerraum();

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeit, die für die ZN-Anlage namensgebend ist. Es ist der Wert „Oertlichkeit_Langname“ zu verwenden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDOertlichkeit()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	Oertlichkeit getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	void unsetIDOertlichkeit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Oertlichkeit</em>' reference is set.
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDOertlichkeit();

	/**
	 * Returns the value of the '<em><b>ID Stellwerk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ESTW-Zentraleinheit oder ein Relaisstellwerk, zu der diese ZN oder für die eine ZN-Einwahlstelle geplant wurde. Der Verweis ist optional, da im Plaungswerkzeug ZN/ZL keine Befüllung aller für die ESTW-ZE vorgesehenen Attribute möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellwerk</em>' reference.
	 * @see #isSetIDStellwerk()
	 * @see #unsetIDStellwerk()
	 * @see #setIDStellwerk(Basis_Objekt)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDStellwerk()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Stellwerk'"
	 * @generated
	 */
	Basis_Objekt getIDStellwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDStellwerk <em>ID Stellwerk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellwerk</em>' reference.
	 * @see #isSetIDStellwerk()
	 * @see #unsetIDStellwerk()
	 * @see #getIDStellwerk()
	 * @generated
	 */
	void setIDStellwerk(Basis_Objekt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDStellwerk <em>ID Stellwerk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDStellwerk()
	 * @see #getIDStellwerk()
	 * @see #setIDStellwerk(Basis_Objekt)
	 * @generated
	 */
	void unsetIDStellwerk();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDStellwerk <em>ID Stellwerk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Stellwerk</em>' reference is set.
	 * @see #unsetIDStellwerk()
	 * @see #getIDStellwerk()
	 * @see #setIDStellwerk(Basis_Objekt)
	 * @generated
	 */
	boolean isSetIDStellwerk();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDUnterbringung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>IDZN Unterstation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ID der zugehörigen ZLV-Bus-Unterstation. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Unterstation</em>' reference.
	 * @see #isSetIDZNUnterstation()
	 * @see #unsetIDZNUnterstation()
	 * @see #setIDZNUnterstation(ZN_Unterstation)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDZNUnterstation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Unterstation'"
	 * @generated
	 */
	ZN_Unterstation getIDZNUnterstation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDZNUnterstation <em>IDZN Unterstation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Unterstation</em>' reference.
	 * @see #isSetIDZNUnterstation()
	 * @see #unsetIDZNUnterstation()
	 * @see #getIDZNUnterstation()
	 * @generated
	 */
	void setIDZNUnterstation(ZN_Unterstation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDZNUnterstation <em>IDZN Unterstation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNUnterstation()
	 * @see #getIDZNUnterstation()
	 * @see #setIDZNUnterstation(ZN_Unterstation)
	 * @generated
	 */
	void unsetIDZNUnterstation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getIDZNUnterstation <em>IDZN Unterstation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN Unterstation</em>' reference is set.
	 * @see #unsetIDZNUnterstation()
	 * @see #getIDZNUnterstation()
	 * @see #setIDZNUnterstation(ZN_Unterstation)
	 * @generated
	 */
	boolean isSetIDZNUnterstation();

	/**
	 * Returns the value of the '<em><b>ZN Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Allg</em>' containment reference.
	 * @see #setZNAllg(ZN_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZNAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Allg'"
	 * @generated
	 */
	ZN_Allg_AttributeGroup getZNAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN#getZNAllg <em>ZN Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Allg</em>' containment reference.
	 * @see #getZNAllg()
	 * @generated
	 */
	void setZNAllg(ZN_Allg_AttributeGroup value);

} // ZN
