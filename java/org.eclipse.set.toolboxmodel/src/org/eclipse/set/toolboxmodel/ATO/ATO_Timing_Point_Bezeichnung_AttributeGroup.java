/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.ATO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATO Timing Point Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup#getBezeichnungATOTP <em>Bezeichnung ATOTP</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_Timing_Point_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CATO_Timing_Point_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ATO_Timing_Point_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung ATOTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fachliche Bezeichnung des Timing Points (Parameter „X_TEXT“ aus dem Block „Timing Point Name“, siehe Subset 126).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung ATOTP</em>' containment reference.
	 * @see #setBezeichnungATOTP(Bezeichnung_ATO_TP_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_ATO_TP'"
	 * @generated
	 */
	Bezeichnung_ATO_TP_TypeClass getBezeichnungATOTP();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup#getBezeichnungATOTP <em>Bezeichnung ATOTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung ATOTP</em>' containment reference.
	 * @see #getBezeichnungATOTP()
	 * @generated
	 */
	void setBezeichnungATOTP(Bezeichnung_ATO_TP_TypeClass value);

} // ATO_Timing_Point_Bezeichnung_AttributeGroup
