/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basis Objekt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getBestandsschutz <em>Bestandsschutz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getObjektzustandBesonders <em>Objektzustand Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getDatumRegelwerk <em>Datum Regelwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getIDAnhangRegelwerkBesonders <em>ID Anhang Regelwerk Besonders</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBasis_Objekt_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBasis_Objekt_Allg' kind='elementOnly'"
 * @generated
 */
public interface Basis_Objekt_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bestandsschutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das betroffene Objekt wurde Bestandsschutz festgelegt (true). Die Angabe entfällt, wenn kein Bestandsschutz vorhanden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bestandsschutz</em>' containment reference.
	 * @see #setBestandsschutz(Bestandsschutz_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBasis_Objekt_Allg_AttributeGroup_Bestandsschutz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bestandsschutz'"
	 * @generated
	 */
	Bestandsschutz_TypeClass getBestandsschutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getBestandsschutz <em>Bestandsschutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestandsschutz</em>' containment reference.
	 * @see #getBestandsschutz()
	 * @generated
	 */
	void setBestandsschutz(Bestandsschutz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Objektzustand Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besonderer Zustand eines Objekts im Planungsbereich. Ist dieses Attribut nicht vorhanden, so ist das Objekt am geplanten/vorgesehenen Standort und angesteuert. "Nicht gültig" sind gemäß Betra als nicht gültig erklärte Signale im Baugleis [gem. Ril 819.1701 (11)]. "Ungültig" sind betrieblich außer Betrieb befindliche Signale, die mit einem Ungültigkeitskreuz [gem. Ril 819.1701 (10)] versehen sind. Bei Auswahl von "sonstige" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Bisher keine eindeutige Abbildung, besonderer Objektzustand meist Fußnoteneintrag in Planungsunterlagen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objektzustand Besonders</em>' containment reference.
	 * @see #setObjektzustandBesonders(Objektzustand_Besonders_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBasis_Objekt_Allg_AttributeGroup_ObjektzustandBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Objektzustand_Besonders'"
	 * @generated
	 */
	Objektzustand_Besonders_TypeClass getObjektzustandBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getObjektzustandBesonders <em>Objektzustand Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektzustand Besonders</em>' containment reference.
	 * @see #getObjektzustandBesonders()
	 * @generated
	 */
	void setObjektzustandBesonders(Objektzustand_Besonders_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Datum Regelwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des letzten Planungsstandes eines Objekts, Hinweis auf den Regelwerksstand zum Planungszeitpunkt. Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess Anhand des Regelwerksstandes lassen sich die jeweils gültigen Stände der verwendeten Regelwerke herleiten (wichtig für Bestandsschutz). Abweichungen werden auf Objektebene (Basis Objekt) über das Attribut ID Anhang Regelwerk Besonders beigefügt. Im Rahmen der Erstellung einer Planung_Einzel werden alle neuen und geänderten Objekte standardmäßig mit dem zentral einzugebenden Wert des Attributs „Datum Regelwerksstand“ der Planung_Einzel befüllt. Durch die Befüllung dürfen bereits vorhandene Angaben „ID_Anhang_Regelwerk_Besonders“ nicht überschrieben werden. Bei Abweichungen kann der LST-Fachplaner objekt- oder objektgruppenbezogen „ID_Anhang_Regelwerk_Besonders“ füllen. DB-Regelwerk Bisher ohne eindeutige Abbildung im Schriftfeld gemäß Ril 886.0102. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Regelwerk</em>' containment reference.
	 * @see #setDatumRegelwerk(Datum_Regelwerk_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBasis_Objekt_Allg_AttributeGroup_DatumRegelwerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Datum_Regelwerk'"
	 * @generated
	 */
	Datum_Regelwerk_TypeClass getDatumRegelwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getDatumRegelwerk <em>Datum Regelwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Regelwerk</em>' containment reference.
	 * @see #getDatumRegelwerk()
	 * @generated
	 */
	void setDatumRegelwerk(Datum_Regelwerk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Regelwerk Besonders</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das Objekt abweichend geltendes Regelwerk. Verweis auf einen Anhang, aus dem der besondere Regelwerksstand eines LST-Objektes hervorgeht. Dieser gilt abweichend von dem für die Planung_Einzel festgelegten Datum Regelwerksstand. Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess Im Schriftfeld gemäß Ril 886.0102 dient Feld 30 "Zusätzliche Vermerke" üblicherweise zur Angabe von Regelwerksabweichungen. DB-Regelwerk Bisher eine eindeutige Abbildung als Schriftfeldeintrag gemäß Ril 886.0102. Meist Angabe im Erläuterungsbericht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Regelwerk Besonders</em>' reference.
	 * @see #isSetIDAnhangRegelwerkBesonders()
	 * @see #unsetIDAnhangRegelwerkBesonders()
	 * @see #setIDAnhangRegelwerkBesonders(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBasis_Objekt_Allg_AttributeGroup_IDAnhangRegelwerkBesonders()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Regelwerk_Besonders'"
	 * @generated
	 */
	Anhang getIDAnhangRegelwerkBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getIDAnhangRegelwerkBesonders <em>ID Anhang Regelwerk Besonders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Regelwerk Besonders</em>' reference.
	 * @see #isSetIDAnhangRegelwerkBesonders()
	 * @see #unsetIDAnhangRegelwerkBesonders()
	 * @see #getIDAnhangRegelwerkBesonders()
	 * @generated
	 */
	void setIDAnhangRegelwerkBesonders(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getIDAnhangRegelwerkBesonders <em>ID Anhang Regelwerk Besonders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangRegelwerkBesonders()
	 * @see #getIDAnhangRegelwerkBesonders()
	 * @see #setIDAnhangRegelwerkBesonders(Anhang)
	 * @generated
	 */
	void unsetIDAnhangRegelwerkBesonders();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup#getIDAnhangRegelwerkBesonders <em>ID Anhang Regelwerk Besonders</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Regelwerk Besonders</em>' reference is set.
	 * @see #unsetIDAnhangRegelwerkBesonders()
	 * @see #getIDAnhangRegelwerkBesonders()
	 * @see #setIDAnhangRegelwerkBesonders(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangRegelwerkBesonders();

} // Basis_Objekt_Allg_AttributeGroup
