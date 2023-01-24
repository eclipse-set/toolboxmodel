/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL DLP Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sammlung der Gleisabschnitte, die in ZL DLP Fstr eingebunden werden und für die eine Prüfung auf Deadlock erfolgen muss. DB-Regelwerk TM 2011-024 I.NVT 3 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_DLP_Abschnitt()
 * @model extendedMetaData="name='CZL_DLP_Abschnitt' kind='elementOnly'"
 * @generated
 */
public interface ZL_DLP_Abschnitt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, welche Freimeldeabschnitte geprüft werden müssen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_DLP_Abschnitt_IDGleisAbschnitt()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt'"
	 * @generated
	 */
	EList<Gleis_Abschnitt> getIDGleisAbschnitt();

	/**
	 * Returns the value of the '<em><b>IDZLDLP Fstr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der ZL DLP Fstr, für welche die Gleisabschnitte UND-verknüpft werden müssen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLDLP Fstr</em>' reference.
	 * @see #isSetIDZLDLPFstr()
	 * @see #unsetIDZLDLPFstr()
	 * @see #setIDZLDLPFstr(ZL_DLP_Fstr)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_DLP_Abschnitt_IDZLDLPFstr()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_DLP_Fstr'"
	 * @generated
	 */
	ZL_DLP_Fstr getIDZLDLPFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZLDLP Fstr</em>' reference.
	 * @see #isSetIDZLDLPFstr()
	 * @see #unsetIDZLDLPFstr()
	 * @see #getIDZLDLPFstr()
	 * @generated
	 */
	void setIDZLDLPFstr(ZL_DLP_Fstr value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLDLPFstr()
	 * @see #getIDZLDLPFstr()
	 * @see #setIDZLDLPFstr(ZL_DLP_Fstr)
	 * @generated
	 */
	void unsetIDZLDLPFstr();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZLDLP Fstr</em>' reference is set.
	 * @see #unsetIDZLDLPFstr()
	 * @see #getIDZLDLPFstr()
	 * @see #setIDZLDLPFstr(ZL_DLP_Fstr)
	 * @generated
	 */
	boolean isSetIDZLDLPFstr();

} // ZL_DLP_Abschnitt
