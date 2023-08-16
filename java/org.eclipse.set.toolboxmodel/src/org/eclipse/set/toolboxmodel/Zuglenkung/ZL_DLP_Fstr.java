/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL DLP Fstr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von ZL-DLP-Abschnitten zur ZL-Fahrstraße. DB-Regelwerk TM 2011-024 I.NVT 3 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_DLP_Fstr()
 * @model extendedMetaData="name='CZL_DLP_Fstr' kind='elementOnly'"
 * @generated
 */
public interface ZL_DLP_Fstr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZL Fstr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der ZL_Fstr, für welche die DLP erfolgen soll. Die Angabe, zu welcher Betriebsstelle die ZL_Fstr gehört, ist über die Zuordnung der Fstr_Zug_Rangier zur Örtlichkeit indirekt möglich. Mehrere Instanzen mit der gleichen ZL_Fstr müssen dann für die eigentliche systematische Prüfung in der DLP ODER-verknüpft werden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Fstr</em>' reference.
	 * @see #isSetIDZLFstr()
	 * @see #unsetIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_DLP_Fstr_IDZLFstr()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Fstr'"
	 * @generated
	 */
	ZL_Fstr getIDZLFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Fstr</em>' reference.
	 * @see #isSetIDZLFstr()
	 * @see #unsetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @generated
	 */
	void setIDZLFstr(ZL_Fstr value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @generated
	 */
	void unsetIDZLFstr();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZL Fstr</em>' reference is set.
	 * @see #unsetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @generated
	 */
	boolean isSetIDZLFstr();

} // ZL_DLP_Fstr
