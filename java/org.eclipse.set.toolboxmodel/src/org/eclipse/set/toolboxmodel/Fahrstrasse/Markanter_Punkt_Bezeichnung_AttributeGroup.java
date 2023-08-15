/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markanter Punkt Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup#getBezeichnungMarkanterPunkt <em>Bezeichnung Markanter Punkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CMarkanter_Punkt_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Markanter_Punkt_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des markanten Punktes. Die Bezeichnung ergibt sich ganz oder teilweise aus dem verlinkten Objekt (in der Regel Bezeichnung Tabelle), kann aber vom Planer geändert werden. Als Abkürzung für das Grenzzeichen wird einheitlich "Gz" verwendet. DB-Regelwerk Durchrutschwegtabelle, Spalte 2: "Durchrutschweg - bis"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Markanter Punkt</em>' containment reference.
	 * @see #setBezeichnungMarkanterPunkt(Bezeichnung_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getMarkanter_Punkt_Bezeichnung_AttributeGroup_BezeichnungMarkanterPunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Markanter_Punkt'"
	 * @generated
	 */
	Bezeichnung_Markanter_Punkt_TypeClass getBezeichnungMarkanterPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup#getBezeichnungMarkanterPunkt <em>Bezeichnung Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Markanter Punkt</em>' containment reference.
	 * @see #getBezeichnungMarkanterPunkt()
	 * @generated
	 */
	void setBezeichnungMarkanterPunkt(Bezeichnung_Markanter_Punkt_TypeClass value);

} // Markanter_Punkt_Bezeichnung_AttributeGroup
