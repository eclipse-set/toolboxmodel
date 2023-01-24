/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.ATO;

import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATO Timing Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definierter Punkt in den Infrastrukturdaten für ATO (Segment Profile), an dem betriebliche Vorgaben definiert werden können. Diese betrieblichen Vorgaben werden entweder direkt aus dem Fahrplan abgeleitet oder durch dispositive Handlungen definiert, z. B. Betriebshalte oder Verkehrshalte einfügen oder auslassen, Beschleunigen oder Verlangsamung der Fahrt (frühere/spätere Zeit für die Erreichung des Timing Points) und über das Journey Profile an ATO-OB kommandiert. 
 * Darüber hinaus kann an einem Timing Point die geplante betriebliche Fahrplanlage eines Zuges mit der tatsächlichen betrieblichen Lage des Zuges verglichen werden.
 * Die Position des TP im Segment Profile muss über die Topologie ermittelt werden. Der TP besitzt keine Wirkrichtung.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getATOTimingPointAllg <em>ATO Timing Point Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_Timing_Point()
 * @model extendedMetaData="name='CATO_Timing_Point' kind='elementOnly'"
 * @generated
 */
public interface ATO_Timing_Point extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ATO Timing Point Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATO Timing Point Allg</em>' containment reference.
	 * @see #setATOTimingPointAllg(ATO_Timing_Point_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_Timing_Point_ATOTimingPointAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ATO_Timing_Point_Allg'"
	 * @generated
	 */
	ATO_Timing_Point_Allg_AttributeGroup getATOTimingPointAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getATOTimingPointAllg <em>ATO Timing Point Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATO Timing Point Allg</em>' containment reference.
	 * @see #getATOTimingPointAllg()
	 * @generated
	 */
	void setATOTimingPointAllg(ATO_Timing_Point_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ATO_Timing_Point_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_Timing_Point_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ATO_Timing_Point_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ATO_Timing_Point_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal, zu dem der Timing Point gehört. Timing Points an weiteren Infrastrukturelementen oder -punkten (z.B. Fahrzeitmesspunkte in der Mitte von Betriebsstellen) können projektspezifisch durch die betriebliche Infrastrukturplanung in der BAst ATO vorgegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.ATO.ATOPackage#getATO_Timing_Point_IDSignal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(Signal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point#getIDSignal <em>ID Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal</em>' reference is set.
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	boolean isSetIDSignal();

} // ATO_Timing_Point
