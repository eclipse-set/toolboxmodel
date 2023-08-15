/**
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
 * A representation of the model object '<em><b>Schloss WAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getIDWKrElement <em>IDW Kr Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getSchlossArt <em>Schloss Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getVerschlussOrt <em>Verschluss Ort</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWAnbaulage <em>WAnbaulage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWLage <em>WLage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_W_AttributeGroup()
 * @model extendedMetaData="name='CSchloss_W' kind='elementOnly'"
 * @generated
 */
public interface Schloss_W_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDW Kr Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Weichen- oder Kreuzungselement, das mit dem Schloss verschlossen wird. DB-Regelwerk Lageplan, Logische Darstellung der Schlüsselabhängigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Element</em>' reference.
	 * @see #isSetIDWKrElement()
	 * @see #unsetIDWKrElement()
	 * @see #setIDWKrElement(W_Kr_Gsp_Element)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_W_AttributeGroup_IDWKrElement()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Element'"
	 * @generated
	 */
	W_Kr_Gsp_Element getIDWKrElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getIDWKrElement <em>IDW Kr Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Element</em>' reference.
	 * @see #isSetIDWKrElement()
	 * @see #unsetIDWKrElement()
	 * @see #getIDWKrElement()
	 * @generated
	 */
	void setIDWKrElement(W_Kr_Gsp_Element value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getIDWKrElement <em>IDW Kr Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWKrElement()
	 * @see #getIDWKrElement()
	 * @see #setIDWKrElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	void unsetIDWKrElement();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getIDWKrElement <em>IDW Kr Element</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDW Kr Element</em>' reference is set.
	 * @see #unsetIDWKrElement()
	 * @see #getIDWKrElement()
	 * @see #setIDWKrElement(W_Kr_Gsp_Element)
	 * @generated
	 */
	boolean isSetIDWKrElement();

	/**
	 * Returns the value of the '<em><b>Schloss Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauart des an der Weiche vorgesehenen Schlosses. Bei Auswahl von "sonstige" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schloss Art</em>' containment reference.
	 * @see #setSchlossArt(Schloss_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_W_AttributeGroup_SchlossArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schloss_Art'"
	 * @generated
	 */
	Schloss_Art_TypeClass getSchlossArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getSchlossArt <em>Schloss Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss Art</em>' containment reference.
	 * @see #getSchlossArt()
	 * @generated
	 */
	void setSchlossArt(Schloss_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verschluss Ort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschlussort für das unter ID_W_Kr_Element angegebene Weichen- bzw. Kreuzungselement. Die Angabe "Herzstück" ist nur bei Weichen mit beweglichen Herzstückspitzen sinnvoll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verschluss Ort</em>' containment reference.
	 * @see #setVerschlussOrt(Verschluss_Ort_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_W_AttributeGroup_VerschlussOrt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Verschluss_Ort'"
	 * @generated
	 */
	Verschluss_Ort_TypeClass getVerschlussOrt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getVerschlussOrt <em>Verschluss Ort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verschluss Ort</em>' containment reference.
	 * @see #getVerschlussOrt()
	 * @generated
	 */
	void setVerschlussOrt(Verschluss_Ort_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WAnbaulage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das Schloss an der linken oder rechten Seite der Weiche angebaut ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WAnbaulage</em>' containment reference.
	 * @see #setWAnbaulage(W_Anbaulage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_W_AttributeGroup_WAnbaulage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Anbaulage'"
	 * @generated
	 */
	W_Anbaulage_TypeClass getWAnbaulage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWAnbaulage <em>WAnbaulage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WAnbaulage</em>' containment reference.
	 * @see #getWAnbaulage()
	 * @generated
	 */
	void setWAnbaulage(W_Anbaulage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WLage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage, in der die Weiche durch das Schloss gesichert wird. DB-Regelwerk Die Abhängigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WLage</em>' containment reference.
	 * @see #setWLage(W_Lage_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_W_AttributeGroup_WLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Lage'"
	 * @generated
	 */
	W_Lage_TypeClass getWLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup#getWLage <em>WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WLage</em>' containment reference.
	 * @see #getWLage()
	 * @generated
	 */
	void setWLage(W_Lage_TypeClass value);

} // Schloss_W_AttributeGroup
