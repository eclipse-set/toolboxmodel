/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS WKr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusatzangaben für Weichen und Kreuzungen im Zusammenhang mit ETCS L2. Ortsgestellte Weichen sind gemäß der Vorgaben in Ril 819.1344 zu berücksichtigen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSKnoten <em>IDETCS Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getETCSWKrMUKA <em>ETCSW Kr MUKA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getETCSWOrtsgestellt <em>ETCSW Ortsgestellt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr()
 * @model extendedMetaData="name='CETCS_W_Kr' kind='elementOnly'"
 * @generated
 */
public interface ETCS_W_Kr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDETCS Knoten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ETCS_Knoten, der die Weiche bzw. Kreuzung repräsentiert. ETCS benutzt bei abzweigendem Fahrweg ersatzhalber die Geo-/Topo-Daten der Fahrwegabschnitte über den Kreuzungsmittelpunkt. Der auftretende Fehler wird vernachlässigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Knoten</em>' reference.
	 * @see #isSetIDETCSKnoten()
	 * @see #unsetIDETCSKnoten()
	 * @see #setIDETCSKnoten(ETCS_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDETCSKnoten()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Knoten'"
	 * @generated
	 */
	ETCS_Knoten getIDETCSKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSKnoten <em>IDETCS Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Knoten</em>' reference.
	 * @see #isSetIDETCSKnoten()
	 * @see #unsetIDETCSKnoten()
	 * @see #getIDETCSKnoten()
	 * @generated
	 */
	void setIDETCSKnoten(ETCS_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSKnoten <em>IDETCS Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDETCSKnoten()
	 * @see #getIDETCSKnoten()
	 * @see #setIDETCSKnoten(ETCS_Knoten)
	 * @generated
	 */
	void unsetIDETCSKnoten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSKnoten <em>IDETCS Knoten</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDETCS Knoten</em>' reference is set.
	 * @see #unsetIDETCSKnoten()
	 * @see #getIDETCSKnoten()
	 * @see #setIDETCSKnoten(ETCS_Knoten)
	 * @generated
	 */
	boolean isSetIDETCSKnoten();

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das RBC, dem die Weiche zugeordnet ist. Die Zuordnung ist auch für ortsgestellte Weichen notwendig, um das Ende des Weichenbereichs ermitteln bzw. trotz fehlender Lageinformation das Ende der Fahrerlaubnis bestimmen zu können.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDRBC()
	 * @model required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<RBC> getIDRBC();

	/**
	 * Returns the value of the '<em><b>IDW Kr Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Weiche bzw. Kreuzung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Anlage</em>' reference.
	 * @see #isSetIDWKrAnlage()
	 * @see #unsetIDWKrAnlage()
	 * @see #setIDWKrAnlage(W_Kr_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDWKrAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Anlage'"
	 * @generated
	 */
	W_Kr_Anlage getIDWKrAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDWKrAnlage <em>IDW Kr Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Anlage</em>' reference.
	 * @see #isSetIDWKrAnlage()
	 * @see #unsetIDWKrAnlage()
	 * @see #getIDWKrAnlage()
	 * @generated
	 */
	void setIDWKrAnlage(W_Kr_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDWKrAnlage <em>IDW Kr Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDWKrAnlage()
	 * @see #getIDWKrAnlage()
	 * @see #setIDWKrAnlage(W_Kr_Anlage)
	 * @generated
	 */
	void unsetIDWKrAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getIDWKrAnlage <em>IDW Kr Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDW Kr Anlage</em>' reference is set.
	 * @see #unsetIDWKrAnlage()
	 * @see #getIDWKrAnlage()
	 * @see #setIDWKrAnlage(W_Kr_Anlage)
	 * @generated
	 */
	boolean isSetIDWKrAnlage();

	/**
	 * Returns the value of the '<em><b>ETCSW Kr MUKA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCSW Kr MUKA</em>' containment reference.
	 * @see #setETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_ETCSWKrMUKA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_W_Kr_MUKA'"
	 * @generated
	 */
	ETCS_W_Kr_MUKA_AttributeGroup getETCSWKrMUKA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getETCSWKrMUKA <em>ETCSW Kr MUKA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCSW Kr MUKA</em>' containment reference.
	 * @see #getETCSWKrMUKA()
	 * @generated
	 */
	void setETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ETCSW Ortsgestellt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um eine ortsgestellte Weiche handelt (true). Der Wert "false" wird nicht verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCSW Ortsgestellt</em>' containment reference.
	 * @see #setETCSWOrtsgestellt(ETCS_W_Ortsgestellt_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_ETCSWOrtsgestellt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_W_Ortsgestellt'"
	 * @generated
	 */
	ETCS_W_Ortsgestellt_TypeClass getETCSWOrtsgestellt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_W_Kr#getETCSWOrtsgestellt <em>ETCSW Ortsgestellt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCSW Ortsgestellt</em>' containment reference.
	 * @see #getETCSWOrtsgestellt()
	 * @generated
	 */
	void setETCSWOrtsgestellt(ETCS_W_Ortsgestellt_TypeClass value);

} // ETCS_W_Kr
