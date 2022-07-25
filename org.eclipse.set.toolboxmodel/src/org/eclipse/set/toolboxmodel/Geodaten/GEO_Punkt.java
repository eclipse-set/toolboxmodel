/**
 */
package org.eclipse.set.toolboxmodel.Geodaten;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEO Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Topographischer Punkt im Koordinatensystem zur eindeutige Zuordnung im realen Gelände. Alle Objekte, die einen entsprechenden Bezug erfordern, werden über andere Objekte (z.B Verortung an der Topologie) oder auch direkt auf dieses Objekt abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Punkt()
 * @model extendedMetaData="name='CGEO_Punkt' kind='elementOnly'"
 * @generated
 */
public interface GEO_Punkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GEO Punkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GEO Punkt Allg</em>' containment reference.
	 * @see #setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Punkt_GEOPunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Punkt_Allg'"
	 * @generated
	 */
	GEO_Punkt_Allg_AttributeGroup getGEOPunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Punkt Allg</em>' containment reference.
	 * @see #getGEOPunktAllg()
	 * @generated
	 */
	void setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des GEO_Knoten, auf den dieser GEO Punkt verweist. Einem GEO Knoten können über diesen Verweis mehrere GEO_Punkte zugewiesen werden. Das ist erforderlich, wenn ein GEO_Knoten in unterschiedlichen Koordinatensystemen zugeordnet ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' reference.
	 * @see #isSetIDGEOKnoten()
	 * @see #unsetIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @see org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage#getGEO_Punkt_IDGEOKnoten()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	GEO_Knoten getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten</em>' reference.
	 * @see #isSetIDGEOKnoten()
	 * @see #unsetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @generated
	 */
	void setIDGEOKnoten(GEO_Knoten value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @generated
	 */
	void unsetIDGEOKnoten();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDGEO Knoten</em>' reference is set.
	 * @see #unsetIDGEOKnoten()
	 * @see #getIDGEOKnoten()
	 * @see #setIDGEOKnoten(GEO_Knoten)
	 * @generated
	 */
	boolean isSetIDGEOKnoten();

} // GEO_Punkt
