/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss Sonderanlage Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getSonderanlageLage <em>Sonderanlage Lage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_Sonderanlage' kind='elementOnly'"
 * @generated
 */
public interface Schloss_Sonderanlage_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Sonderanlage Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage, in der die Sonderanlage verschlossen wird. DB-Regelwerk Die Abhängigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonderanlage Lage</em>' containment reference.
	 * @see #setSonderanlageLage(Sonderanlage_Lage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sonderanlage_Lage'"
	 * @generated
	 */
	Sonderanlage_Lage_TypeClass getSonderanlageLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getSonderanlageLage <em>Sonderanlage Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonderanlage Lage</em>' containment reference.
	 * @see #getSonderanlageLage()
	 * @generated
	 */
	void setSonderanlageLage(Sonderanlage_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Beschreibung Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der Sonderanlage, sofern es sich nicht um ein besonderes Fahrwegelement handelt, das über ID_Sonderanlage angegeben werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung Sonderanlage</em>' containment reference.
	 * @see #setBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Beschreibung_Sonderanlage'"
	 * @generated
	 */
	Beschreibung_Sonderanlage_TypeClass getBeschreibungSonderanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung Sonderanlage</em>' containment reference.
	 * @see #getBeschreibungSonderanlage()
	 * @generated
	 */
	void setBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Sonderanlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Sonderanlage im Sinne eines besonderen Fahrwegelements (z. B. bewegliche Brücke).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Sonderanlage</em>' reference.
	 * @see #isSetIDSonderanlage()
	 * @see #unsetIDSonderanlage()
	 * @see #setIDSonderanlage(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Sonderanlage'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDSonderanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Sonderanlage</em>' reference.
	 * @see #isSetIDSonderanlage()
	 * @see #unsetIDSonderanlage()
	 * @see #getIDSonderanlage()
	 * @generated
	 */
	void setIDSonderanlage(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSonderanlage()
	 * @see #getIDSonderanlage()
	 * @see #setIDSonderanlage(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDSonderanlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup#getIDSonderanlage <em>ID Sonderanlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Sonderanlage</em>' reference is set.
	 * @see #unsetIDSonderanlage()
	 * @see #getIDSonderanlage()
	 * @see #setIDSonderanlage(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDSonderanlage();

} // Schloss_Sonderanlage_AttributeGroup
