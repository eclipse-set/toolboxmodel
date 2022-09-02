/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Signalgruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gruppe von Signalen (Haupt-, Sperrsignale), die von der Zug- bzw. Rangierlenkung für die Vorzugregelung benötigt wird. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, für die es im Regelwerk z. Zt. keine Vorgabe gibt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe()
 * @model extendedMetaData="name='CZL_Signalgruppe' kind='elementOnly'"
 * @generated
 */
public interface ZL_Signalgruppe extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZL</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige ZL, der die Signalgruppe zugeordnet ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL</em>' reference.
	 * @see #isSetIDZL()
	 * @see #unsetIDZL()
	 * @see #setIDZL(ZL)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_IDZL()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL'"
	 * @generated
	 */
	ZL getIDZL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZL()
	 * @see #getIDZL()
	 * @see #setIDZL(ZL)
	 * @generated
	 */
	void unsetIDZL();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe#getIDZL <em>IDZL</em>}' reference is set.
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
	 * Returns the value of the '<em><b>ZL Signalgruppe Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Signalgruppe Allg</em>' containment reference.
	 * @see #setZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage#getZL_Signalgruppe_ZLSignalgruppeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Signalgruppe_Allg'"
	 * @generated
	 */
	ZL_Signalgruppe_Allg_AttributeGroup getZLSignalgruppeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe#getZLSignalgruppeAllg <em>ZL Signalgruppe Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Signalgruppe Allg</em>' containment reference.
	 * @see #getZLSignalgruppeAllg()
	 * @generated
	 */
	void setZLSignalgruppeAllg(ZL_Signalgruppe_Allg_AttributeGroup value);

} // ZL_Signalgruppe
