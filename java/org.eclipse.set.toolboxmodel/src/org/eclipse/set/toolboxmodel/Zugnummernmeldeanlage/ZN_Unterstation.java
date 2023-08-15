/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Unterstation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verbindung zwischen ZN und ZLV Bus und/oder ZN ZBS. Über Modems wird die ZN an einen oder mehrere ZLV-Busse und ggf. an eine ZBS (Verbindung zu einer Bedien Zentrale) angebunden. Die Attributgruppe ZN_Unterstation_Bf_Nr kann mehrfach eingebunden werden. Damit werden alle Betriebsstellen, die ZN-seitig über diese Unterstation verwaltet bzw "angesprochen" werden, beschrieben. Der ZN-seitigen Bahnhofsnummer wird eine Örtlichkeit (Ril-100-Bezeichner der zugewiesenen Betriebsstelle) und ggf. eine Priorität zugeordnet. Letztere wird nur für diejenige Bahnhosnummer angegeben, die für die Kommunikation der ZN_Unterstation mit dem ZLV-Bus maßgebend ist. In allen anderen Fällen wird das Attribut nicht befüllt. Die Darstellung erfolgt auf dem ZLV-Bus-Übersichtsplan als tabellarischer Block mit den Zeilen \u0026lt;Bf-Nr\u0026gt; \u0026lt;Oertlichkeit_Abkuerzung\u0026gt; in dem Symbol für die ZN_Unterstation. Die Bahnhofsnummer mit Priorität wird direkt neben dem ZLV-Bus-Anschluss angeordnet. DB-Regelwerk 819.0731 5 Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation#getIDZNZBS <em>IDZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation()
 * @model extendedMetaData="name='CZN_Unterstation' kind='elementOnly'"
 * @generated
 */
public interface ZN_Unterstation extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZNZBS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID der zugehörigen ZLV-Bus-Sammelleitung (ZBS), sofern diese vorhanden ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZNZBS</em>' reference.
	 * @see #isSetIDZNZBS()
	 * @see #unsetIDZNZBS()
	 * @see #setIDZNZBS(ZN_ZBS)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_IDZNZBS()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_ZBS'"
	 * @generated
	 */
	ZN_ZBS getIDZNZBS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation#getIDZNZBS <em>IDZNZBS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZNZBS</em>' reference.
	 * @see #isSetIDZNZBS()
	 * @see #unsetIDZNZBS()
	 * @see #getIDZNZBS()
	 * @generated
	 */
	void setIDZNZBS(ZN_ZBS value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation#getIDZNZBS <em>IDZNZBS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNZBS()
	 * @see #getIDZNZBS()
	 * @see #setIDZNZBS(ZN_ZBS)
	 * @generated
	 */
	void unsetIDZNZBS();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation#getIDZNZBS <em>IDZNZBS</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZNZBS</em>' reference is set.
	 * @see #unsetIDZNZBS()
	 * @see #getIDZNZBS()
	 * @see #setIDZNZBS(ZN_ZBS)
	 * @generated
	 */
	boolean isSetIDZNZBS();

	/**
	 * Returns the value of the '<em><b>ZN Unterstation Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Unterstation Allg</em>' containment reference.
	 * @see #setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_ZNUnterstationAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Unterstation_Allg'"
	 * @generated
	 */
	ZN_Unterstation_Allg_AttributeGroup getZNUnterstationAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Unterstation Allg</em>' containment reference.
	 * @see #getZNUnterstationAllg()
	 * @generated
	 */
	void setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup value);

} // ZN_Unterstation
