/**
 */
package org.eclipse.set.toolboxmodel.Bedienung;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Platz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Örtliche Anordnung der Bedien- und Meldeeinrichtungen zur betrieblichen Nutzung eines elektronischen Stellwerks. Der Bedien_Platz kann sowohl an einem Bedien_Bezirk wie auch an einer ESTW_Zentraleinheit angeschaltet sein. Der Aufstellungsort muss aber nicht zwingend der Anschalteort sein. Der Bedien_Platz kann auch als abgesetzter Bedien_Platz an abweichenden Orten untergebracht sein. Z.B. wenn im Modulgebäude der ESTW_Zentraleinheit nicht ausreichend Platz ist und der Bedien_Platz im benachbartem alten Stellwerksgebäude untergebracht werden soll. Um dem Lieferanten die allgemeine Ausprägung des Bedien_Platzes im PT 1 zu beschreiben, ist noch der Hinweis zu erbringen, ob es sich um einen Not-Bedien_Platz oder einen Standard-Bedien_Platz handelt. Da es verschiedne Kombinationen und mehere Instanzen von Bedien_Platz geben kann, hier noch mal Beispielhafte Varianten: ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit örtlichem Notbedienplatz im Modulgebäude und Standardbedienplätzen in der Bedien_Zentrale (z.B. ESTW Orxhausen/Siemens) ESTW_Zentraleinheit mit abgesetzten Standardbedienplätzen und mit örtlichem Notbedienplatz im Modulgebäude (z.B. ESTW Kreiensen/Bombardier) ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit abgesetztem Notbedienplatz im Altstellwerk und Standardbedienplätzen in der Bedien_Zentrale (z.B. ESTW Oldenburg Nord/Siemens) Aus diesem Zusammenhang entstehen vier Typen von Bedienplätzen. Standard-Bedienplatz-System (Standard_BPS) Standard-Bedienplatz-System abgesetzt (Standard_BPS_Abgesetzt) Not-Bedienplatz Not-BPS-System (Not_BPS) Not-Bedienplatz Not-BPS-System abgesetzt (Not_BPS_Abgesetzt) Im PT 1 BZ werden für den Bedienplatz die Aufstellung im Raum, die Ausstattung und Ausrüstung sowie die Versorgung mit elektrischer Energie und Daten geplant. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Schematischer Plan der Strom- und Datenversorgung am Bedienplatz: Media:Plan Stromversorgung BPL BZH.pdf. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getBedienPlatzAllg <em>Bedien Platz Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz()
 * @model extendedMetaData="name='CBedien_Platz' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Platz extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Platz Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Platz Allg</em>' containment reference.
	 * @see #setBedienPlatzAllg(Bedien_Platz_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz_BedienPlatzAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Platz_Allg'"
	 * @generated
	 */
	Bedien_Platz_Allg_AttributeGroup getBedienPlatzAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getBedienPlatzAllg <em>Bedien Platz Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Platz Allg</em>' containment reference.
	 * @see #getBedienPlatzAllg()
	 * @generated
	 */
	void setBedienPlatzAllg(Bedien_Platz_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Moebelplan Aufriss</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang im PDF-Format, der den horizontalen Aufbau der Bedienmöbel einer Bedienzentrale beschreibt. Der Ein- und Ausbau der Ausrüstung erfolgt in der üblichen Rot/Gelb-Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Moebelplan Aufriss</em>' reference.
	 * @see #isSetIDAnhangMoebelplanAufriss()
	 * @see #unsetIDAnhangMoebelplanAufriss()
	 * @see #setIDAnhangMoebelplanAufriss(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz_IDAnhangMoebelplanAufriss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Moebelplan_Aufriss'"
	 * @generated
	 */
	Anhang getIDAnhangMoebelplanAufriss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Moebelplan Aufriss</em>' reference.
	 * @see #isSetIDAnhangMoebelplanAufriss()
	 * @see #unsetIDAnhangMoebelplanAufriss()
	 * @see #getIDAnhangMoebelplanAufriss()
	 * @generated
	 */
	void setIDAnhangMoebelplanAufriss(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangMoebelplanAufriss()
	 * @see #getIDAnhangMoebelplanAufriss()
	 * @see #setIDAnhangMoebelplanAufriss(Anhang)
	 * @generated
	 */
	void unsetIDAnhangMoebelplanAufriss();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanAufriss <em>ID Anhang Moebelplan Aufriss</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Moebelplan Aufriss</em>' reference is set.
	 * @see #unsetIDAnhangMoebelplanAufriss()
	 * @see #getIDAnhangMoebelplanAufriss()
	 * @see #setIDAnhangMoebelplanAufriss(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangMoebelplanAufriss();

	/**
	 * Returns the value of the '<em><b>ID Anhang Moebelplan Grundriss</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang im PDF-Format, der die Aufstellfläche und die Anschlüsse für elektrische Energie und Daten der Bedienplätze einer Bedienzentrale beschreibt. Der Ein- und Ausbau von Bedienplätzen und Anschlüssen erfolgt in der üblichen Rot/Gelb-Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Moebelplan Grundriss</em>' reference.
	 * @see #isSetIDAnhangMoebelplanGrundriss()
	 * @see #unsetIDAnhangMoebelplanGrundriss()
	 * @see #setIDAnhangMoebelplanGrundriss(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz_IDAnhangMoebelplanGrundriss()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Moebelplan_Grundriss'"
	 * @generated
	 */
	Anhang getIDAnhangMoebelplanGrundriss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Moebelplan Grundriss</em>' reference.
	 * @see #isSetIDAnhangMoebelplanGrundriss()
	 * @see #unsetIDAnhangMoebelplanGrundriss()
	 * @see #getIDAnhangMoebelplanGrundriss()
	 * @generated
	 */
	void setIDAnhangMoebelplanGrundriss(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangMoebelplanGrundriss()
	 * @see #getIDAnhangMoebelplanGrundriss()
	 * @see #setIDAnhangMoebelplanGrundriss(Anhang)
	 * @generated
	 */
	void unsetIDAnhangMoebelplanGrundriss();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDAnhangMoebelplanGrundriss <em>ID Anhang Moebelplan Grundriss</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang Moebelplan Grundriss</em>' reference is set.
	 * @see #unsetIDAnhangMoebelplanGrundriss()
	 * @see #getIDAnhangMoebelplanGrundriss()
	 * @see #setIDAnhangMoebelplanGrundriss(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangMoebelplanGrundriss();

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz_IDUnterbringung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	Unterbringung getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' reference.
	 * @see #isSetIDUnterbringung()
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(Unterbringung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDUnterbringung <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	void unsetIDUnterbringung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDUnterbringung <em>ID Unterbringung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Unterbringung</em>' reference is set.
	 * @see #unsetIDUnterbringung()
	 * @see #getIDUnterbringung()
	 * @see #setIDUnterbringung(Unterbringung)
	 * @generated
	 */
	boolean isSetIDUnterbringung();

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Bedien_Bezirk zur Zuordnung der Bedienplätze eines Steuerbereiches und der für Ihre Darstellung notwendigen Parameter (z.Zt. noch über PDF-Anhänge). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk</em>' reference.
	 * @see #isSetIDBedienBezirk()
	 * @see #unsetIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz_IDBedienBezirk()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk'"
	 * @generated
	 */
	Bedien_Bezirk getIDBedienBezirk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk</em>' reference.
	 * @see #isSetIDBedienBezirk()
	 * @see #unsetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @generated
	 */
	void setIDBedienBezirk(Bedien_Bezirk value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @generated
	 */
	void unsetIDBedienBezirk();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Bedien Bezirk</em>' reference is set.
	 * @see #unsetIDBedienBezirk()
	 * @see #getIDBedienBezirk()
	 * @see #setIDBedienBezirk(Bedien_Bezirk)
	 * @generated
	 */
	boolean isSetIDBedienBezirk();

	/**
	 * Returns the value of the '<em><b>IDESTW Zentraleinheit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Bedienplatzes zu einer ESTW_Zentraleinheit, wenn der Bedienplatz nicht an einen Bedien_Bezirk, sondern direkt an die ESTW_Zentraleinheit angeschaltet ist (z. B. Notbedienplatz). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @see org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage#getBedien_Platz_IDESTWZentraleinheit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ESTW_Zentraleinheit'"
	 * @generated
	 */
	ESTW_Zentraleinheit getIDESTWZentraleinheit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 */
	void setIDESTWZentraleinheit(ESTW_Zentraleinheit value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	void unsetIDESTWZentraleinheit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Bedienung.Bedien_Platz#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDESTW Zentraleinheit</em>' reference is set.
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	boolean isSetIDESTWZentraleinheit();

} // Bedien_Platz
