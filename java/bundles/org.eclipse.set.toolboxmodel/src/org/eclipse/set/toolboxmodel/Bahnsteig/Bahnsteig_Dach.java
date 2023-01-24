/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnsteig;

import org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Dach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bahnsteigkanten-bezogene Abbildung der Bahnsteig-Überdachung. Die Angabe ist im INA-Erhebungsbogen erforderlich.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Dach#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getBahnsteig_Dach()
 * @model extendedMetaData="name='CBahnsteig_Dach' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Dach extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Kante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Bahnsteigkante, zu der die Überdachung gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Kante</em>' reference.
	 * @see #isSetIDBahnsteigKante()
	 * @see #unsetIDBahnsteigKante()
	 * @see #setIDBahnsteigKante(Bahnsteig_Kante)
	 * @see org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage#getBahnsteig_Dach_IDBahnsteigKante()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Kante'"
	 * @generated
	 */
	Bahnsteig_Kante getIDBahnsteigKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Dach#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Kante</em>' reference.
	 * @see #isSetIDBahnsteigKante()
	 * @see #unsetIDBahnsteigKante()
	 * @see #getIDBahnsteigKante()
	 * @generated
	 */
	void setIDBahnsteigKante(Bahnsteig_Kante value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Dach#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBahnsteigKante()
	 * @see #getIDBahnsteigKante()
	 * @see #setIDBahnsteigKante(Bahnsteig_Kante)
	 * @generated
	 */
	void unsetIDBahnsteigKante();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Dach#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bahnsteig Kante</em>' reference is set.
	 * @see #unsetIDBahnsteigKante()
	 * @see #getIDBahnsteigKante()
	 * @see #setIDBahnsteigKante(Bahnsteig_Kante)
	 * @generated
	 */
	boolean isSetIDBahnsteigKante();

} // Bahnsteig_Dach
