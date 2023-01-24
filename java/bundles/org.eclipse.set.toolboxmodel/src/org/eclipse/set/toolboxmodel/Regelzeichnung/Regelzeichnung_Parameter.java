/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Regelzeichnung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regelzeichnung Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Einer Regelzeichnung werden durch dieses Objekt weitere Parameter zugeordnet. Für eine Regelzeichnung können beliebig viele Parameter entsprechend der konkreten Anwendung angegeben werden. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung_Parameter#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung_Parameter#getRegelzeichnungParameterAllg <em>Regelzeichnung Parameter Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter()
 * @model extendedMetaData="name='CRegelzeichnung_Parameter' kind='elementOnly'"
 * @generated
 */
public interface Regelzeichnung_Parameter extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuweisung des Parameters zur Regelzeichnung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' reference.
	 * @see #isSetIDRegelzeichnung()
	 * @see #unsetIDRegelzeichnung()
	 * @see #setIDRegelzeichnung(Regelzeichnung)
	 * @see org.eclipse.set.toolboxmodel.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_IDRegelzeichnung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	Regelzeichnung getIDRegelzeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung_Parameter#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Regelzeichnung</em>' reference.
	 * @see #isSetIDRegelzeichnung()
	 * @see #unsetIDRegelzeichnung()
	 * @see #getIDRegelzeichnung()
	 * @generated
	 */
	void setIDRegelzeichnung(Regelzeichnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung_Parameter#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDRegelzeichnung()
	 * @see #getIDRegelzeichnung()
	 * @see #setIDRegelzeichnung(Regelzeichnung)
	 * @generated
	 */
	void unsetIDRegelzeichnung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung_Parameter#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Regelzeichnung</em>' reference is set.
	 * @see #unsetIDRegelzeichnung()
	 * @see #getIDRegelzeichnung()
	 * @see #setIDRegelzeichnung(Regelzeichnung)
	 * @generated
	 */
	boolean isSetIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>Regelzeichnung Parameter Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regelzeichnung Parameter Allg</em>' containment reference.
	 * @see #setRegelzeichnungParameterAllg(Regelzeichnung_Parameter_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_RegelzeichnungParameterAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Regelzeichnung_Parameter_Allg'"
	 * @generated
	 */
	Regelzeichnung_Parameter_Allg_AttributeGroup getRegelzeichnungParameterAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung_Parameter#getRegelzeichnungParameterAllg <em>Regelzeichnung Parameter Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regelzeichnung Parameter Allg</em>' containment reference.
	 * @see #getRegelzeichnungParameterAllg()
	 * @generated
	 */
	void setRegelzeichnungParameterAllg(Regelzeichnung_Parameter_Allg_AttributeGroup value);

} // Regelzeichnung_Parameter
