/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Typ GTrans Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_GTrans_AttributeGroup#getDPTypTrans <em>DP Typ Trans</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GTrans_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ_GTrans' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_GTrans_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Typ Trans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um einen Ankündigungs- oder Transitions-Datenpunkt handelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ Trans</em>' containment reference.
	 * @see #setDPTypTrans(DP_Typ_Trans_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GTrans_AttributeGroup_DPTypTrans()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_Trans'"
	 * @generated
	 */
	DP_Typ_Trans_TypeClass getDPTypTrans();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_GTrans_AttributeGroup#getDPTypTrans <em>DP Typ Trans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ Trans</em>' containment reference.
	 * @see #getDPTypTrans()
	 * @generated
	 */
	void setDPTypTrans(DP_Typ_Trans_TypeClass value);

} // DP_Typ_GTrans_AttributeGroup
