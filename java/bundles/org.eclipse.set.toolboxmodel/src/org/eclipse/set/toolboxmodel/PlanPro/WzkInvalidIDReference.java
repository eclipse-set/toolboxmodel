/**
 * Copyright (c) 2021 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wzk Invalid ID Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getGuid <em>Guid</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getWzkInvalidIDReference()
 * @model
 * @generated
 */
public interface WzkInvalidIDReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Guid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guid</em>' attribute.
	 * @see #setGuid(String)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getWzkInvalidIDReference_Guid()
	 * @model
	 * @generated
	 */
	String getGuid();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getGuid <em>Guid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guid</em>' attribute.
	 * @see #getGuid()
	 * @generated
	 */
	void setGuid(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getWzkInvalidIDReference_Source()
	 * @model
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(EReference)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getWzkInvalidIDReference_SourceRef()
	 * @model
	 * @generated
	 */
	EReference getSourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(EReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(EObject)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getWzkInvalidIDReference_Target()
	 * @model
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(EReference)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getWzkInvalidIDReference_TargetRef()
	 * @model
	 * @generated
	 */
	EReference getTargetRef();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(EReference value);

} // WzkInvalidIDReference
