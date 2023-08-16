/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus Besondere Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Besondere Anlage, die an einen ZLV-Bus angeschlossen ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getIDZLVBus <em>IDZLV Bus</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage()
 * @model extendedMetaData="name='CZLV_Bus_Besondere_Anlage' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_Besondere_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ZLV-Bus, an den die Besondere Anlage angeschlossen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' reference.
	 * @see #isSetIDZLVBus()
	 * @see #unsetIDZLVBus()
	 * @see #setIDZLVBus(ZLV_Bus)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_IDZLVBus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	ZLV_Bus getIDZLVBus();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getIDZLVBus <em>IDZLV Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZLV Bus</em>' reference.
	 * @see #isSetIDZLVBus()
	 * @see #unsetIDZLVBus()
	 * @see #getIDZLVBus()
	 * @generated
	 */
	void setIDZLVBus(ZLV_Bus value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getIDZLVBus <em>IDZLV Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLVBus()
	 * @see #getIDZLVBus()
	 * @see #setIDZLVBus(ZLV_Bus)
	 * @generated
	 */
	void unsetIDZLVBus();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getIDZLVBus <em>IDZLV Bus</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZLV Bus</em>' reference is set.
	 * @see #unsetIDZLVBus()
	 * @see #getIDZLVBus()
	 * @see #setIDZLVBus(ZLV_Bus)
	 * @generated
	 */
	boolean isSetIDZLVBus();

} // ZLV_Bus_Besondere_Anlage
