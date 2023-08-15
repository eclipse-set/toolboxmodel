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
 * A representation of the model object '<em><b>Fla Zwieschutz Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzL <em>ID Fla Schutz L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzR <em>ID Fla Schutz R</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeL <em>Massnahme L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeR <em>Massnahme R</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getNachlaufverhinderung <em>Nachlaufverhinderung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_Element_AttributeGroup()
 * @model extendedMetaData="name='CFla_Zwieschutz_Element' kind='elementOnly'"
 * @generated
 */
public interface Fla_Zwieschutz_Element_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fla Schutz L</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Ersatzschutzmaßnahme bei Ersatzschutz und Anforderung in Linkslage. DB-Regelwerk Zwieschutzweichentabelle, Spalten 5...7 "direkt anschließender Flankenschutz" und 8...9 "Flankenschutz"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Schutz L</em>' reference.
	 * @see #isSetIDFlaSchutzL()
	 * @see #unsetIDFlaSchutzL()
	 * @see #setIDFlaSchutzL(Fla_Schutz)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Schutz_L'"
	 * @generated
	 */
	Fla_Schutz getIDFlaSchutzL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzL <em>ID Fla Schutz L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Schutz L</em>' reference.
	 * @see #isSetIDFlaSchutzL()
	 * @see #unsetIDFlaSchutzL()
	 * @see #getIDFlaSchutzL()
	 * @generated
	 */
	void setIDFlaSchutzL(Fla_Schutz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzL <em>ID Fla Schutz L</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaSchutzL()
	 * @see #getIDFlaSchutzL()
	 * @see #setIDFlaSchutzL(Fla_Schutz)
	 * @generated
	 */
	void unsetIDFlaSchutzL();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzL <em>ID Fla Schutz L</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Schutz L</em>' reference is set.
	 * @see #unsetIDFlaSchutzL()
	 * @see #getIDFlaSchutzL()
	 * @see #setIDFlaSchutzL(Fla_Schutz)
	 * @generated
	 */
	boolean isSetIDFlaSchutzL();

	/**
	 * Returns the value of the '<em><b>ID Fla Schutz R</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Ersatzschutzmaßnahme bei Ersatzschutz und Anforderung in Rechtslage. DB-Regelwerk Zwieschutzweichentabelle, Spalten 5...7 "direkt anschließender Flankenschutz" und 8...9 "Flankenschutz"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Schutz R</em>' reference.
	 * @see #isSetIDFlaSchutzR()
	 * @see #unsetIDFlaSchutzR()
	 * @see #setIDFlaSchutzR(Fla_Schutz)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Schutz_R'"
	 * @generated
	 */
	Fla_Schutz getIDFlaSchutzR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzR <em>ID Fla Schutz R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Schutz R</em>' reference.
	 * @see #isSetIDFlaSchutzR()
	 * @see #unsetIDFlaSchutzR()
	 * @see #getIDFlaSchutzR()
	 * @generated
	 */
	void setIDFlaSchutzR(Fla_Schutz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzR <em>ID Fla Schutz R</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFlaSchutzR()
	 * @see #getIDFlaSchutzR()
	 * @see #setIDFlaSchutzR(Fla_Schutz)
	 * @generated
	 */
	void unsetIDFlaSchutzR();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getIDFlaSchutzR <em>ID Fla Schutz R</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fla Schutz R</em>' reference is set.
	 * @see #unsetIDFlaSchutzR()
	 * @see #getIDFlaSchutzR()
	 * @see #setIDFlaSchutzR(Fla_Schutz)
	 * @generated
	 */
	boolean isSetIDFlaSchutzR();

	/**
	 * Returns the value of the '<em><b>Massnahme L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßnahme, durch die der Flankenschutz im linken Strang der Zwieschutzweiche hergestellt wird. Ersatzschutz: Der Flankenschutz wird durch das nächste Flankenschutzelement hergestellt. Verschluss: Die Flankenschutzweiche wird in der Linkslage verschlossen. Verzicht: Der Flankenschutz wird durch betriebliche Maßnahmen hergestellt; technisch wird darauf verzichtet. Verschluss/Ersatzschutz: Der Wert bildet den Planungsfall ab, dass die Flankenschutzanforderungen an die Zwieschutzweiche von gleichberechtigten Fahrstraßen kommen und damit planerisch keine feste Zuweisung von Verschluss und Ersatzschutz erfolgt. Der ENUM-Wert ist also im Sinne „Verschluss oder Ersatzschutz“ zu interpretieren. In der Praxis bedeutet dies, dass die Fahrstraße, die zuerst eingestellt wird, den direkten Flankenschutz und die als zweite eingestellte Fahrstraße den Ersatzschutz erhält. 
	 * Die Maßnahmen beziehen sich nur auf den Zwieschutzfall. Wird die Weiche nur in einem Strang angefordert, wird sie regulär Flankenschutz bieten, wie es in der Flankenschutzplanung vorgesehen ist. DB-Regelwerk Zwieschutzweichentabelle, Spalte 4 "Zwieschutzfall-Maßnahme"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massnahme L</em>' containment reference.
	 * @see #setMassnahmeL(Massnahme_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Massnahme_L'"
	 * @generated
	 */
	Massnahme_TypeClass getMassnahmeL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeL <em>Massnahme L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massnahme L</em>' containment reference.
	 * @see #getMassnahmeL()
	 * @generated
	 */
	void setMassnahmeL(Massnahme_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massnahme R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßnahme, durch die der Flankenschutz im rechten Strang der Zwieschutzweiche hergestellt wird. Ersatzschutz: Der Flankenschutz wird durch das nächste Flankenschutzelement hergestellt. Verschluss: Die Flankenschutzweiche wird in der Rechtslage verschlossen. Verzicht: Der Flankenschutz wird durch betriebliche Maßnahmen hergestellt; technisch wird darauf verzichtet. Verschluss/Ersatzschutz: Der Wert bildet den Planungsfall ab, dass die Flankenschutzanforderungen an die Zwieschutzweiche von gleichberechtigten Fahrstraßen kommen und damit planerisch keine feste Zuweisung von Verschluss und Ersatzschutz erfolgt. Der ENUM-Wert ist also im Sinne „Verschluss oder Ersatzschutz“ zu interpretieren. In der Praxis bedeutet dies, dass die Fahrstraße, die zuerst eingestellt wird, den direkten Flankenschutz und die als zweite eingestellte Fahrstraße den Ersatzchutz erhält. Die Maßnahmen beziehen sich nur auf den Zwieschutzfall. Wird die Weiche nur in einem Strang angefordert, wird sie regulär Flankenschutz bieten, wie es in der Flankenschutzplanung vorgesehen ist. 
	 * DB-Regelwerk Zwieschutzweichentabelle, Spalte 4 "Zwieschutzfall-Maßnahme"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massnahme R</em>' containment reference.
	 * @see #setMassnahmeR(Massnahme_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Massnahme_R'"
	 * @generated
	 */
	Massnahme_TypeClass getMassnahmeR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getMassnahmeR <em>Massnahme R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massnahme R</em>' containment reference.
	 * @see #getMassnahmeR()
	 * @generated
	 */
	void setMassnahmeR(Massnahme_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Nachlaufverhinderung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Nachlaufen der Weiche wird verhindert, wenn die Flankenschutzanforderung, für die der Verschluss projektiert ist, nicht mehr besteht. In der Regel wird für Eigenzwieschutzweichen die Nachlaufverhinderung projektiert. DB-Regelwerk Zwieschutzweichentabelle, Spalten 10 und 11 "Zwieschutzweiche mit/ohne Nachlaufverhinderung"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachlaufverhinderung</em>' containment reference.
	 * @see #setNachlaufverhinderung(Nachlaufverhinderung_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage#getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Nachlaufverhinderung'"
	 * @generated
	 */
	Nachlaufverhinderung_TypeClass getNachlaufverhinderung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup#getNachlaufverhinderung <em>Nachlaufverhinderung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nachlaufverhinderung</em>' containment reference.
	 * @see #getNachlaufverhinderung()
	 * @generated
	 */
	void setNachlaufverhinderung(Nachlaufverhinderung_TypeClass value);

} // Fla_Zwieschutz_Element_AttributeGroup
