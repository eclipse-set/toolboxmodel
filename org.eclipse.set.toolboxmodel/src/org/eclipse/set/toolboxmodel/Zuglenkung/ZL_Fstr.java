/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Aufnahme verschiedener Anstosspunkte (mittels ZL Fstr Anstoss) abhängig von den zugehörigen Vorsignalen und den Geschwindigkeitsklassen für die ZL. Über den Verweis zur Fstr Zug Rangier ist die Verbindung zur Fstr des ESTW hergestellt. Für eine Fstr des ESTW kann es mehrere ZL_Fstr geben, umgekehrt gilt dies nicht. DB-Regelwerk 819.0732 6 (1)b In der Tabelle der Zuglenkanstöße entspricht eine Zeile einer ZL-Fahrstraße. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getZLFstrAllg <em>ZL Fstr Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr()
 * @model extendedMetaData="name='CZL_Fstr' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verlinkung, zu welcher Fahrstraße die ZL-Fahrstraße gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' reference.
	 * @see #isSetIDFstrZugRangier()
	 * @see #unsetIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_IDFstrZugRangier()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	Fstr_Zug_Rangier getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' reference.
	 * @see #isSetIDFstrZugRangier()
	 * @see #unsetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(Fstr_Zug_Rangier value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	void unsetIDFstrZugRangier();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Zug Rangier</em>' reference is set.
	 * @see #unsetIDFstrZugRangier()
	 * @see #getIDFstrZugRangier()
	 * @see #setIDFstrZugRangier(Fstr_Zug_Rangier)
	 * @generated
	 */
	boolean isSetIDFstrZugRangier();

	/**
	 * Returns the value of the '<em><b>IDZL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige ZL, dessen Bestandteil die ZL-Fahrstraße ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL</em>' reference.
	 * @see #isSetIDZL()
	 * @see #unsetIDZL()
	 * @see #setIDZL(ZL)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_IDZL()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL'"
	 * @generated
	 */
	ZL getIDZL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL</em>' reference.
	 * @see #isSetIDZL()
	 * @see #unsetIDZL()
	 * @see #getIDZL()
	 * @generated
	 */
	void setIDZL(ZL value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZL()
	 * @see #getIDZL()
	 * @see #setIDZL(ZL)
	 * @generated
	 */
	void unsetIDZL();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZL</em>' reference is set.
	 * @see #unsetIDZL()
	 * @see #getIDZL()
	 * @see #setIDZL(ZL)
	 * @generated
	 */
	boolean isSetIDZL();

	/**
	 * Returns the value of the '<em><b>IDZL Fstr</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine ZL_Fstr, die als Alternative für die ursprünglich vorgesehene ZL_Fstr verwendet werden kann (in Tabelle ZL „D-Weg_Prio“). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Fstr</em>' reference.
	 * @see #isSetIDZLFstr()
	 * @see #unsetIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_IDZLFstr()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Fstr'"
	 * @generated
	 */
	ZL_Fstr getIDZLFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Fstr</em>' reference.
	 * @see #isSetIDZLFstr()
	 * @see #unsetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @generated
	 */
	void setIDZLFstr(ZL_Fstr value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @generated
	 */
	void unsetIDZLFstr();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZL Fstr</em>' reference is set.
	 * @see #unsetIDZLFstr()
	 * @see #getIDZLFstr()
	 * @see #setIDZLFstr(ZL_Fstr)
	 * @generated
	 */
	boolean isSetIDZLFstr();

	/**
	 * Returns the value of the '<em><b>ZL Fstr Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Fstr Allg</em>' containment reference.
	 * @see #setZLFstrAllg(ZL_Fstr_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Fstr_ZLFstrAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Allg'"
	 * @generated
	 */
	ZL_Fstr_Allg_AttributeGroup getZLFstrAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr#getZLFstrAllg <em>ZL Fstr Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Fstr Allg</em>' containment reference.
	 * @see #getZLFstrAllg()
	 * @generated
	 */
	void setZLFstrAllg(ZL_Fstr_Allg_AttributeGroup value);

} // ZL_Fstr
