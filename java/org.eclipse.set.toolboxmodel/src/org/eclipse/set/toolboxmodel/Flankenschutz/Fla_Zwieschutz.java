/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Zwieschutz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibung der Verhaltensweise einer Zwieschutzweiche, wenn sie gleichzeitig in beiden Stellungen für den Flankenschutz angefordert wird. DB-Regelwerk Zwieschutzweichentabelle
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getFlaZwieschutzElement <em>Fla Zwieschutz Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getIDWElement <em>IDW Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getZwieschutzArt <em>Zwieschutz Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz()
 * @model extendedMetaData="name='CFla_Zwieschutz' kind='elementOnly'"
 * @generated
 */
public interface Fla_Zwieschutz extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fla Zwieschutz Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fla Zwieschutz Element</em>' containment reference.
	 * @see #setFlaZwieschutzElement(Fla_Zwieschutz_Element_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_FlaZwieschutzElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fla_Zwieschutz_Element'"
	 * @generated
	 */
	Fla_Zwieschutz_Element_AttributeGroup getFlaZwieschutzElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getFlaZwieschutzElement <em>Fla Zwieschutz Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Zwieschutz Element</em>' containment reference.
	 * @see #getFlaZwieschutzElement()
	 * @generated
	 */
	void setFlaZwieschutzElement(Fla_Zwieschutz_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDW Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Zwieschutzweiche. DB-Regelwerk Fla Zwieschutz: Zwieschutzweichentabelle, Spalte 1: "Weiche/Kreuzung in angeforderter Weichenstellung"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Element</em>' reference.
	 * @see #isSetIDWElement()
	 * @see #unsetIDWElement()
	 * @see #setIDWElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_IDWElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDWElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getIDWElement <em>IDW Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Element</em>' reference.
	 * @see #isSetIDWElement()
	 * @see #unsetIDWElement()
	 * @see #getIDWElement()
	 * @generated
	 */
	void setIDWElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getIDWElement <em>IDW Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWElement()
	 * @see #getIDWElement()
	 * @see #setIDWElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDWElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getIDWElement <em>IDW Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDW Element</em>' reference is set.
	 * @see #unsetIDWElement()
	 * @see #getIDWElement()
	 * @see #setIDWElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDWElement();

	/**
	 * Returns the value of the '<em><b>Zwieschutz Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Charakter der Zwieschutzweiche. Echte Zwieschutzweiche: Flankenschutzweiche, die durch unabhängige Fahrten in beiden Stellungen angefordert wird. Ohne spezielle Behandlung kann nur eine der beiden Fahrten zu einem Zeitpunkt eingestellt sein, da sich durch die Zwieschutzweiche ein Fahrstraßenausschluss ergibt. Eigenzwieschutzweiche: Flankenschutzweiche, die durch die gleiche Fahrt in beiden Stellungen angefordert wird. Ohne spezielle Behandlung kann die Fahrt nicht eingestellt werden. Eine Zwieschutzweiche kann gleichzeitig beide Charaktere annehmen. DB-Regelwerk Zwieschutzweichentabelle, Spalte 2 "Zwieschutzweiche - Eigen" und Spalte 3 "Zwieschutzweiche - Echt"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zwieschutz Art</em>' containment reference.
	 * @see #setZwieschutzArt(Zwieschutz_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_ZwieschutzArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Zwieschutz_Art'"
	 * @generated
	 */
	Zwieschutz_Art_TypeClass getZwieschutzArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz#getZwieschutzArt <em>Zwieschutz Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zwieschutz Art</em>' containment reference.
	 * @see #getZwieschutzArt()
	 * @generated
	 */
	void setZwieschutzArt(Zwieschutz_Art_TypeClass value);

} // Fla_Zwieschutz
