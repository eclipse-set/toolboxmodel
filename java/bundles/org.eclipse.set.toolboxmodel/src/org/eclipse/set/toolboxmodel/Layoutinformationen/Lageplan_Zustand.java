/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Layoutinformationen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lageplan Zustand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Abbildung der zustandsbezogenen Layoutinformationen zu einem Lageplan.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand#getReferenzLSTZustand <em>Referenz LST Zustand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Layoutinformationen.LayoutinformationenPackage#getLageplan_Zustand()
 * @model extendedMetaData="name='CLageplan_Zustand' kind='elementOnly'"
 * @generated
 */
public interface Lageplan_Zustand extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Lageplan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Lageplan, zu dem der Lageplan-Zustand definiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Lageplan</em>' reference.
	 * @see #isSetIDLageplan()
	 * @see #unsetIDLageplan()
	 * @see #setIDLageplan(Lageplan)
	 * @see org.eclipse.set.toolboxmodel.Layoutinformationen.LayoutinformationenPackage#getLageplan_Zustand_IDLageplan()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Lageplan'"
	 * @generated
	 */
	Lageplan getIDLageplan();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Lageplan</em>' reference.
	 * @see #isSetIDLageplan()
	 * @see #unsetIDLageplan()
	 * @see #getIDLageplan()
	 * @generated
	 */
	void setIDLageplan(Lageplan value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDLageplan()
	 * @see #getIDLageplan()
	 * @see #setIDLageplan(Lageplan)
	 * @generated
	 */
	void unsetIDLageplan();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand#getIDLageplan <em>ID Lageplan</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Lageplan</em>' reference is set.
	 * @see #unsetIDLageplan()
	 * @see #getIDLageplan()
	 * @see #setIDLageplan(Lageplan)
	 * @generated
	 */
	boolean isSetIDLageplan();

	/**
	 * Returns the value of the '<em><b>Referenz LST Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Layoutinformationen.Referenz_LST_Zustand_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GUID des LST-Zustand, der für die Erstellung des Lageplans ausgewertet wird. Werden LST-Zustände einer Planung referenziert, müssen Sie einheitlich entweder den Start- oder den Zielzustand beschreiben. Eine Mischung von Start- und Zielzuständen ist nicht zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenz LST Zustand</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.Layoutinformationen.LayoutinformationenPackage#getLageplan_Zustand_ReferenzLSTZustand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Referenz_LST_Zustand'"
	 * @generated
	 */
	EList<Referenz_LST_Zustand_TypeClass> getReferenzLSTZustand();

} // Lageplan_Zustand
