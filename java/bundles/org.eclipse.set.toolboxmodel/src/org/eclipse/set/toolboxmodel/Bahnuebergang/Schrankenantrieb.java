/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schrankenantrieb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung von Schrankenantrieben für Bahnübergänge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getSASchrankenbaum <em>SA Schrankenbaum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getSchrankenantriebAllg <em>Schrankenantrieb Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb()
 * @model extendedMetaData="name='CSchrankenantrieb' kind='elementOnly'"
 * @generated
 */
public interface Schrankenantrieb extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Schrankenantrieb_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Schrankenantrieb_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Schrankenantrieb_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BÜ-Anlage, zu der der Schrankenantrieb gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_IDBUEAnlage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	BUE_Anlage getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' reference.
	 * @see #isSetIDBUEAnlage()
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(BUE_Anlage value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	void unsetIDBUEAnlage();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDBUE Anlage</em>' reference is set.
	 * @see #unsetIDBUEAnlage()
	 * @see #getIDBUEAnlage()
	 * @see #setIDBUEAnlage(BUE_Anlage)
	 * @generated
	 */
	boolean isSetIDBUEAnlage();

	/**
	 * Returns the value of the '<em><b>SA Schrankenbaum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SA Schrankenbaum</em>' containment reference.
	 * @see #setSASchrankenbaum(SA_Schrankenbaum_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_SASchrankenbaum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SA_Schrankenbaum'"
	 * @generated
	 */
	SA_Schrankenbaum_AttributeGroup getSASchrankenbaum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getSASchrankenbaum <em>SA Schrankenbaum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SA Schrankenbaum</em>' containment reference.
	 * @see #getSASchrankenbaum()
	 * @generated
	 */
	void setSASchrankenbaum(SA_Schrankenbaum_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schrankenantrieb Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schrankenantrieb Allg</em>' containment reference.
	 * @see #setSchrankenantriebAllg(Schrankenantrieb_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_SchrankenantriebAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schrankenantrieb_Allg'"
	 * @generated
	 */
	Schrankenantrieb_Allg_AttributeGroup getSchrankenantriebAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bahnuebergang.Schrankenantrieb#getSchrankenantriebAllg <em>Schrankenantrieb Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schrankenantrieb Allg</em>' containment reference.
	 * @see #getSchrankenantriebAllg()
	 * @generated
	 */
	void setSchrankenantriebAllg(Schrankenantrieb_Allg_AttributeGroup value);

} // Schrankenantrieb
