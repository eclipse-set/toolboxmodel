/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBS Schutzstrecke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der ZBS-Schutzstrecke. Modellseitig werden für die Abbildung einer Schutzstrecke die Objekte Fstr_DWeg und ZBS_Schutzstrecke benötigt mit entsprechender Aufteilung der Planungsinformationen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke#getZBSSchutzstreckeAllg <em>ZBS Schutzstrecke Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke()
 * @model extendedMetaData="name='CZBS_Schutzstrecke' kind='elementOnly'"
 * @generated
 */
public interface ZBS_Schutzstrecke extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr DWeg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf Fstr_DWeg zur Anreicherung der spezifischen Angaben von Schutzstrecken bei ZBS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr DWeg</em>' reference.
	 * @see #isSetIDFstrDWeg()
	 * @see #unsetIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_IDFstrDWeg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_DWeg'"
	 * @generated
	 */
	Fstr_DWeg getIDFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr DWeg</em>' reference.
	 * @see #isSetIDFstrDWeg()
	 * @see #unsetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @generated
	 */
	void setIDFstrDWeg(Fstr_DWeg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @generated
	 */
	void unsetIDFstrDWeg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke#getIDFstrDWeg <em>ID Fstr DWeg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr DWeg</em>' reference is set.
	 * @see #unsetIDFstrDWeg()
	 * @see #getIDFstrDWeg()
	 * @see #setIDFstrDWeg(Fstr_DWeg)
	 * @generated
	 */
	boolean isSetIDFstrDWeg();

	/**
	 * Returns the value of the '<em><b>ZBS Schutzstrecke Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZBS Schutzstrecke Allg</em>' containment reference.
	 * @see #setZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_ZBSSchutzstreckeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_Schutzstrecke_Allg'"
	 * @generated
	 */
	ZBS_Schutzstrecke_Allg_AttributeGroup getZBSSchutzstreckeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke#getZBSSchutzstreckeAllg <em>ZBS Schutzstrecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Schutzstrecke Allg</em>' containment reference.
	 * @see #getZBSSchutzstreckeAllg()
	 * @generated
	 */
	void setZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup value);

} // ZBS_Schutzstrecke
