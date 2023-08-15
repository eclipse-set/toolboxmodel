/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Hilfsobjekt zur Sättigung von Verweisen an der äußeren Grenze des Betrachtungsbereichs einer Einzelplanung. Die Validierung einer XML-Datei ist nur gesamthaft möglich. Somit müssen Planungs- und Betrachtungsbereich gleichermaßen valide sein. An der äußeren Grenze des Betrachtungsbereichs sind jedoch u. U. nicht mehr alle Zielobjekte von Verweisen vorhanden, da der Betrachtungsbereich nicht beliebig ausgeweitet werden kann und soll. Unter der Maßgabe einer validen XML besteht jedoch ein Zwang zur Sättigung von Verweisen. Das Proxy_Objekt schafft diesbezüglich eine Lösung für alle Objekte des LST-Datenmodells. In den Bestandsdaten der LST-Datenbank dürfen keine Proxyobjekte vorhanden sein.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.Proxy_Objekt#getLSTObjektArt <em>LST Objekt Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getProxy_Objekt()
 * @model extendedMetaData="name='CProxy_Objekt' kind='elementOnly'"
 * @generated
 */
public interface Proxy_Objekt extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>LST Objekt Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Objekts, das durch das Proxyobjekt vertreten wird. Mit Ausnahme von Ur Objekt, Basis Objekt, Bereich Objekt, Punkt Objekt und dem Proxy Objekt selbst können alle Objekte des LST-Datenmodells ausgewählt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Objekt Art</em>' containment reference.
	 * @see #setLSTObjektArt(LST_Objekt_Art_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage#getProxy_Objekt_LSTObjektArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Objekt_Art'"
	 * @generated
	 */
	LST_Objekt_Art_TypeClass getLSTObjektArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Basisobjekte.Proxy_Objekt#getLSTObjektArt <em>LST Objekt Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Objekt Art</em>' containment reference.
	 * @see #getLSTObjektArt()
	 * @generated
	 */
	void setLSTObjektArt(LST_Objekt_Art_TypeClass value);

} // Proxy_Objekt
