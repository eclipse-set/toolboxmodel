/**
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bahnanlagen und Betriebsstellen des Netzes. Die Örtlichkeit muss eine gültige Bezeichnung nach Ril 100 beinhalten und kann mittels ID Strecke Punkt mehreren Strecken mit Bezugskilometer zugeordnet sein. DB-Regelwerk Richtlinie 100.0001 Abschnitt 1 (1) 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getOertlichkeit()
 * @model extendedMetaData="name='COertlichkeit' kind='elementOnly'"
 * @generated
 */
public interface Oertlichkeit extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getOertlichkeit_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Oertlichkeit_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Oertlichkeit_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis zur (betrieblichen) Zuordnung von Bahnhofsteilen zu Bahnhöfen und von Betriebsstellen untereinander. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getOertlichkeit_IDOertlichkeit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	Oertlichkeit getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' reference.
	 * @see #isSetIDOertlichkeit()
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(Oertlichkeit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	void unsetIDOertlichkeit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getIDOertlichkeit <em>ID Oertlichkeit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Oertlichkeit</em>' reference is set.
	 * @see #unsetIDOertlichkeit()
	 * @see #getIDOertlichkeit()
	 * @see #setIDOertlichkeit(Oertlichkeit)
	 * @generated
	 */
	boolean isSetIDOertlichkeit();

	/**
	 * Returns the value of the '<em><b>ID Strecke Punkt</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Geodaten.Strecke_Punkt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Streckenpunkt zur Lokalisierung der Örtlichkeiten im Netz. Die Information wird für die Erstellung der Ausgabeformate benötigt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke Punkt</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getOertlichkeit_IDStreckePunkt()
	 * @model extendedMetaData="kind='element' name='ID_Strecke_Punkt'"
	 * @generated
	 */
	EList<Strecke_Punkt> getIDStreckePunkt();

	/**
	 * Returns the value of the '<em><b>Oertlichkeit Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oertlichkeit Allg</em>' containment reference.
	 * @see #setOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getOertlichkeit_OertlichkeitAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Oertlichkeit_Allg'"
	 * @generated
	 */
	Oertlichkeit_Allg_AttributeGroup getOertlichkeitAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit#getOertlichkeitAllg <em>Oertlichkeit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oertlichkeit Allg</em>' containment reference.
	 * @see #getOertlichkeitAllg()
	 * @generated
	 */
	void setOertlichkeitAllg(Oertlichkeit_Allg_AttributeGroup value);

} // Oertlichkeit
