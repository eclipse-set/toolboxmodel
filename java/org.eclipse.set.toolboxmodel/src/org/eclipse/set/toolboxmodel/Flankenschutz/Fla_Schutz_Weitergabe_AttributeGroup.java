/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz Weitergabe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Weitergabe_AttributeGroup()
 * @model extendedMetaData="name='CFla_Schutz_Weitergabe' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz_Weitergabe_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fla Weitergabe L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Flankenschutzmaßnahme bei Weitergabe der Flankenschutzanforderung wie bei Fahrt über den linken Strang der Flankenschutztransportweiche. DB-Regelwerk Flankenschutztabelle, Spalten 6 "Weitergabe über Weiche, Kreuzung" und 7 "wie Fahrt über deren Strang" mit Ausfüllung "L" (Links)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Weitergabe L</em>' reference.
	 * @see #isSetIDFlaWeitergabeL()
	 * @see #unsetIDFlaWeitergabeL()
	 * @see #setIDFlaWeitergabeL(Fla_Schutz)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Weitergabe_L'"
	 * @generated
	 */
	Fla_Schutz getIDFlaWeitergabeL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Weitergabe L</em>' reference.
	 * @see #isSetIDFlaWeitergabeL()
	 * @see #unsetIDFlaWeitergabeL()
	 * @see #getIDFlaWeitergabeL()
	 * @generated
	 */
	void setIDFlaWeitergabeL(Fla_Schutz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaWeitergabeL()
	 * @see #getIDFlaWeitergabeL()
	 * @see #setIDFlaWeitergabeL(Fla_Schutz)
	 * @generated
	 */
	void unsetIDFlaWeitergabeL();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Weitergabe L</em>' reference is set.
	 * @see #unsetIDFlaWeitergabeL()
	 * @see #getIDFlaWeitergabeL()
	 * @see #setIDFlaWeitergabeL(Fla_Schutz)
	 * @generated
	 */
	boolean isSetIDFlaWeitergabeL();

	/**
	 * Returns the value of the '<em><b>ID Fla Weitergabe R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Flankenschutzmaßnahme bei Weitergabe der Flankenschutzanforderung wie bei Fahrt über den rechten Strang der Flankenschutztransportweiche. DB-Regelwerk Flankenschutztabelle, Spalten 6 "Weitergabe über Weiche, Kreuzung" und 7 "wie Fahrt über deren Strang" mit Ausfüllung "R" (Rechts)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Weitergabe R</em>' reference.
	 * @see #isSetIDFlaWeitergabeR()
	 * @see #unsetIDFlaWeitergabeR()
	 * @see #setIDFlaWeitergabeR(Fla_Schutz)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Weitergabe_R'"
	 * @generated
	 */
	Fla_Schutz getIDFlaWeitergabeR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Weitergabe R</em>' reference.
	 * @see #isSetIDFlaWeitergabeR()
	 * @see #unsetIDFlaWeitergabeR()
	 * @see #getIDFlaWeitergabeR()
	 * @generated
	 */
	void setIDFlaWeitergabeR(Fla_Schutz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaWeitergabeR()
	 * @see #getIDFlaWeitergabeR()
	 * @see #setIDFlaWeitergabeR(Fla_Schutz)
	 * @generated
	 */
	void unsetIDFlaWeitergabeR();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Weitergabe R</em>' reference is set.
	 * @see #unsetIDFlaWeitergabeR()
	 * @see #getIDFlaWeitergabeR()
	 * @see #setIDFlaWeitergabeR(Fla_Schutz)
	 * @generated
	 */
	boolean isSetIDFlaWeitergabeR();

} // Fla_Schutz_Weitergabe_AttributeGroup
