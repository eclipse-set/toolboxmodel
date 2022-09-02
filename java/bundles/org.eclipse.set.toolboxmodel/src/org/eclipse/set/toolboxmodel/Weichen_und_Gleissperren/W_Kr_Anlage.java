/**
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WKr Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bauliche Gesamtheit des Objektes Weiche oder Kreuzung einschließlich der für seine Funktion unmittelbar und in der Nähe vorhandenen Stell-, Steuer- und Überwachungseinrichtungen. Typische Grundformen der Weichenanlagen sind: einfache Weiche (EW), einfache Kreuzungsweiche (EKW), doppelte Kreuzungsweiche (DKW), starre Kreuzung (KR) und Flachkreuzungen mit doppelten Herzstücken und beweglichen Spitzen (KR). Grundlage der Bezeichnungen ist die Ril 800.0120 in Verbindung mit den zugehörigen Anlagen. Weichenanlagen werden unterteilt in die einzelnen Elemente (Weichenelement). Die Elemente besitzen eine oder mehrere Komponenten (Weichenkomponente). Diese Objekte beschreiben in Verbindung mit Regelzeichnungen weitere Eigenschaften (z.B. Antriebe und Endlagenprüfer) der Weichenanlage. Siehe auch Modellierung Weichen. DB-Regelwerk Ril 800.0120 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getWKrAnlageAllg <em>WKr Anlage Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage()
 * @model extendedMetaData="name='CW_Kr_Anlage' kind='elementOnly'"
 * @generated
 */
public interface W_Kr_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anhang DWS</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Digitale Weichenskizze, die als Dateianhang mittels des Objektes Anhang eingebunden wird. DB-Regelwerk Die Digitale Weichenskizze wird für alle neu zu beschaffenden Weichen nach Ril 823.0700 erstellt. Sie enthält alle konstruktiven Daten der zu beschaffenden Weiche. Die relevanten Daten für die signaltechnischen Planungen werden künftig der DWS entnommen bzw. mit dieser Datei abgeglichen. Die für die LST-Planung relevanten Daten werden in entsprechende Attribute der allgemeinen Merkmale eingetragen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang DWS</em>' reference.
	 * @see #isSetIDAnhangDWS()
	 * @see #unsetIDAnhangDWS()
	 * @see #setIDAnhangDWS(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_IDAnhangDWS()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_DWS'"
	 * @generated
	 */
	Anhang getIDAnhangDWS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang DWS</em>' reference.
	 * @see #isSetIDAnhangDWS()
	 * @see #unsetIDAnhangDWS()
	 * @see #getIDAnhangDWS()
	 * @generated
	 */
	void setIDAnhangDWS(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangDWS()
	 * @see #getIDAnhangDWS()
	 * @see #setIDAnhangDWS(Anhang)
	 * @generated
	 */
	void unsetIDAnhangDWS();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang DWS</em>' reference is set.
	 * @see #unsetIDAnhangDWS()
	 * @see #getIDAnhangDWS()
	 * @see #setIDAnhangDWS(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangDWS();

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, welches den Zustand der W_Kr_Anlage signalisiert (z. B. Rückfallweichensignal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' reference.
	 * @see #isSetIDSignal()
	 * @see #unsetIDSignal()
	 * @see #setIDSignal(Signal)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_IDSignal()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	Signal getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	void unsetIDSignal();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal</em>' reference is set.
	 * @see #unsetIDSignal()
	 * @see #getIDSignal()
	 * @see #setIDSignal(Signal)
	 * @generated
	 */
	boolean isSetIDSignal();

	/**
	 * Returns the value of the '<em><b>WKr Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WKr Anlage Allg</em>' containment reference.
	 * @see #setWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_WKrAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Anlage_Allg'"
	 * @generated
	 */
	W_Kr_Anlage_Allg_AttributeGroup getWKrAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage#getWKrAnlageAllg <em>WKr Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WKr Anlage Allg</em>' containment reference.
	 * @see #getWKrAnlageAllg()
	 * @generated
	 */
	void setWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup value);

} // W_Kr_Anlage
