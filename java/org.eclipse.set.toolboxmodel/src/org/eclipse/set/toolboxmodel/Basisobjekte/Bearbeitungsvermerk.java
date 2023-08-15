/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bearbeitungsvermerk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Anhang in Form von Datei oder Text zu einem Objekt oder Attribut. Jeder zugelassene Projektbeteiligte kann zu einem Objekt oder Attribut einen Bearbeitungsvermerk anfügen, sofern er die entsprechend notwendige Berechtigung besitzt. Dies gilt für fachliche wie organisatorische Objekte und Attribute. Für ENUM-Attribute ist bei Auswahl des Werts "sonstige" zwingend ein Bearbeitungsvermerk anzufügen. Eine Dokumentenbeigabe ist dabei optional. Zu einem Objekt oder Attribut können mehrere Bearbeitungsvermerke erstellt werden. Der Bearbeitungsvermerk enthält vorläufig eine GUID zur Identifikation des Bearbeiters sowie eine GUID für die Signatur. Im Attribut „Bearbeitungsvermerk Rolle“ kann die fachliche Rolle des Bearbeiters abgelegt werden. Kommentare des Bearbeiters werden als Freitext im Attribut „Kommentar“ hinterlegt. Der Bearbeitungsvermerk kann einen Anhang aufnehmen. Um mehrere Anhänge zu einem Objekt zuzuordnen, müssen mehrere Bearbeitungsvermerke erstellt werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk#getIDAnhang <em>ID Anhang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk()
 * @model extendedMetaData="name='CBearbeitungsvermerk' kind='elementOnly'"
 * @generated
 */
public interface Bearbeitungsvermerk extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Bearbeitungsvermerk Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearbeitungsvermerk Allg</em>' containment reference.
	 * @see #setBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_BearbeitungsvermerkAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bearbeitungsvermerk_Allg'"
	 * @generated
	 */
	Bearbeitungsvermerk_Allg_AttributeGroup getBearbeitungsvermerkAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitungsvermerk Allg</em>' containment reference.
	 * @see #getBearbeitungsvermerkAllg()
	 * @generated
	 */
	void setBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den durch diesen Bearbeitungsvermerk referenzierten Anhang.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_IDAnhang()
	 * @model extendedMetaData="kind='element' name='ID_Anhang'"
	 * @generated
	 */
	EList<Anhang> getIDAnhang();

} // Bearbeitungsvermerk
