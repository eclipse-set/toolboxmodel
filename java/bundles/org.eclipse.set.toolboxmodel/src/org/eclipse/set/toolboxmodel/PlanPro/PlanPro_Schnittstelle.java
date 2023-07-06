/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.emf.common.util.EList;
import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;
import org.eclipse.set.toolboxmodel.Layoutinformationen.PlanPro_Layoutinfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Pro Schnittstelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Oberstes Objekt der Content-XML, das in jeder Datei vorhanden ist. Damit jede Ausgabe in Form einer XML-Datei über die Identität von ~ eindeutig zu identifizieren ist, muss bei jeder Erzeugung einer XML-Ausgabe für eine Planung eine neue GUID für das Objekt PlanPro_Schnittstelle vergeben werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getPlanProSchnittstelleAllg <em>Plan Pro Schnittstelle Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTPlanung <em>LST Planung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTZustand <em>LST Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getWzkInvalidIDReferences <em>Wzk Invalid ID References</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getPlanpro_layoutinfo <em>Planpro layoutinfo</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle()
 * @model extendedMetaData="name='CPlanPro_Schnittstelle' kind='elementOnly'"
 * @generated
 */
public interface PlanPro_Schnittstelle extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Plan Pro Schnittstelle Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Pro Schnittstelle Allg</em>' containment reference.
	 * @see #setPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_PlanProSchnittstelleAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PlanPro_Schnittstelle_Allg'"
	 * @generated
	 */
	PlanPro_Schnittstelle_Allg_AttributeGroup getPlanProSchnittstelleAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getPlanProSchnittstelleAllg <em>Plan Pro Schnittstelle Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Pro Schnittstelle Allg</em>' containment reference.
	 * @see #getPlanProSchnittstelleAllg()
	 * @generated
	 */
	void setPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LST Planung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Einbindung von Planungen einer LST-Anlage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung</em>' containment reference.
	 * @see #setLSTPlanung(LST_Planung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_LSTPlanung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LST_Planung'"
	 * @generated
	 */
	LST_Planung_AttributeGroup getLSTPlanung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTPlanung <em>LST Planung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Planung</em>' containment reference.
	 * @see #getLSTPlanung()
	 * @generated
	 */
	void setLSTPlanung(LST_Planung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LST Zustand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Einbindung eines Zustands einer LST-Anlage (z. B. Bestandsdaten).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Zustand</em>' containment reference.
	 * @see #setLSTZustand(LST_Zustand)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_LSTZustand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LST_Zustand'"
	 * @generated
	 */
	LST_Zustand getLSTZustand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getLSTZustand <em>LST Zustand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Zustand</em>' containment reference.
	 * @see #getLSTZustand()
	 * @generated
	 */
	void setLSTZustand(LST_Zustand value);

	/**
	 * Returns the value of the '<em><b>Wzk Invalid ID References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wzk Invalid ID References</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_WzkInvalidIDReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<WzkInvalidIDReference> getWzkInvalidIDReferences();

	/**
	 * Returns the value of the '<em><b>Planpro layoutinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planpro layoutinfo</em>' containment reference.
	 * @see #setPlanpro_layoutinfo(PlanPro_Layoutinfo)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_Planpro_layoutinfo()
	 * @model containment="true"
	 * @generated
	 */
	PlanPro_Layoutinfo getPlanpro_layoutinfo();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle#getPlanpro_layoutinfo <em>Planpro layoutinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planpro layoutinfo</em>' containment reference.
	 * @see #getPlanpro_layoutinfo()
	 * @generated
	 */
	void setPlanpro_layoutinfo(PlanPro_Layoutinfo value);

} // PlanPro_Schnittstelle
