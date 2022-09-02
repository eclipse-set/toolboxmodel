/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Zug Rangier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zug- oder Rangierstraße. Jeder Zugstraße ist ein Durchrutschweg (modelliert in Fstr DWeg) zugeordnet. Gibt es Fahrstraßen mit mehreren Durchrutschwegen, so werden dafür mehrere Zugstraßen angelegt, die auf dem gleichen befahrenen Teil (modelliert in Fstr Fahrweg) basieren. Mit dem Datenmodell werden auch Zentralblockfahrstraßen geplant. Der hiermit verknüpfte Gefahrpunktabstand wird in Fstr DWeg abgebildet. Eine Zentralblockfahrstraße (Fstr_Art==ZB) über die ESTW-Zentraleinheit-Grenze wird in zwei Teilblockfahrstraßen (Fstr_Art==ZB) im Bereich der jeweiligen ESTW-Zentraleinheit geplant. Dabei kann ein befahrener Teil der Länge Null entstehen, wenn die zweite Teilblockfahrstraße nur aus dem Durchrutschweg besteht. Zielsignal der ersten ist Startsignal der zweiten Teilblockfahrstraße. Fahrstraßen über eine ESTW-Zentraleinheit-Grenze (FAP) werden als zwei Teilfahrstraßen (Fstr_Art==ZT/ZTU/RT/RTU) geplant. Kann die erste Teilfahrstraße mit mehreren weiteren Teilfahrstraßen fortgesetzt werden, so muss für jede geplante Kombination eine eigene Instanz der ersten Teilfahrstraße angelegt werden (analog der Zuordnung mehrerer Durchrutschwege). Die Verknüpfung zur zweiten Teilfahrstraße geschieht über Fstr_Zug_Rangier.ID Fstr Folgeabhaengigkeit. Eine Mittelweichenteilfahrstraße besitzt keinen Durchrutschweg. Eine explizite Verknüpfung von Mittelweichenteilfahrstraßen untereinander und mit der Zugstraße erfolgt nicht, da sich diese über die Topologie und insbesondere über Start und Ziel ergeben. Eine Rangierstraße besitzt ebenfalls keinen Durchrutschweg. Die speziellen Attribute von Zug-/Rangier-/Mittelweichenteilfahrstraße werden in eigenen Attributgruppen gespeichert, die sich gegenseitig ausschließen. Gruppenausfahrten werden als Zugstraßen ohne besondere Eigenschaft abgebildet. Das Gruppenausfahrsignal wird unter ID Signal Gruppenausfahrt explizit angegeben, die Gruppenausfahrstraße ist somit eindeutig erkennbar. DB-Regelwerk Zugstraßentabelle (eine Zeile), Rangierstraßentabelle (eine Zeile), Mittelweichenteilfahrstraßentabelle (eine Zeile). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrZugRangierAllg <em>Fstr Zug Rangier Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrAusschlussBesonders <em>ID Fstr Ausschluss Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrMittel <em>Fstr Mittel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrRangier <em>Fstr Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrZug <em>Fstr Zug</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier()
 * @model extendedMetaData="name='CFstr_Zug_Rangier' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Zug_Rangier extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fstr Zug Rangier Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Zug Rangier Allg</em>' containment reference.
	 * @see #setFstrZugRangierAllg(Fstr_Zug_Rangier_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrZugRangierAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug_Rangier_Allg'"
	 * @generated
	 */
	Fstr_Zug_Rangier_Allg_AttributeGroup getFstrZugRangierAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrZugRangierAllg <em>Fstr Zug Rangier Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Zug Rangier Allg</em>' containment reference.
	 * @see #getFstrZugRangierAllg()
	 * @generated
	 */
	void setFstrZugRangierAllg(Fstr_Zug_Rangier_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Fstr Ausschluss Besonders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besonderer Fahrstraßenausschluss, der in Sonderfällen geplant werden muss, z. B. Rangierstraße mit paralleler Gruppenausfahrt. Der Ausschluss von Durchfahrten ist hier nicht anzugeben (siehe Signal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Ausschluss Besonders</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_IDFstrAusschlussBesonders()
	 * @model extendedMetaData="kind='element' name='ID_Fstr_Ausschluss_Besonders'"
	 * @generated
	 */
	EList<Fstr_Zug_Rangier> getIDFstrAusschlussBesonders();

	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Fahrwegs zur Fahrstraße als befahrener Teil. DB-Regelwerk Zugstraßentabelle, Bezeichnung der Fstr (Start und Ziel) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_IDFstrFahrweg()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	Fstr_Fahrweg getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' reference.
	 * @see #isSetIDFstrFahrweg()
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(Fstr_Fahrweg value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	void unsetIDFstrFahrweg();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fstr Fahrweg</em>' reference is set.
	 * @see #unsetIDFstrFahrweg()
	 * @see #getIDFstrFahrweg()
	 * @see #setIDFstrFahrweg(Fstr_Fahrweg)
	 * @generated
	 */
	boolean isSetIDFstrFahrweg();

	/**
	 * Returns the value of the '<em><b>Fstr Mittel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Mittel</em>' containment reference.
	 * @see #setFstrMittel(Fstr_Mittel_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrMittel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Mittel'"
	 * @generated
	 */
	Fstr_Mittel_AttributeGroup getFstrMittel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrMittel <em>Fstr Mittel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Mittel</em>' containment reference.
	 * @see #getFstrMittel()
	 * @generated
	 */
	void setFstrMittel(Fstr_Mittel_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fstr Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Rangier</em>' containment reference.
	 * @see #setFstrRangier(Fstr_Rangier_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrRangier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Rangier'"
	 * @generated
	 */
	Fstr_Rangier_AttributeGroup getFstrRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrRangier <em>Fstr Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Rangier</em>' containment reference.
	 * @see #getFstrRangier()
	 * @generated
	 */
	void setFstrRangier(Fstr_Rangier_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fstr Zug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Zug</em>' containment reference.
	 * @see #setFstrZug(Fstr_Zug_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrZug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug'"
	 * @generated
	 */
	Fstr_Zug_AttributeGroup getFstrZug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier#getFstrZug <em>Fstr Zug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Zug</em>' containment reference.
	 * @see #getFstrZug()
	 * @generated
	 */
	void setFstrZug(Fstr_Zug_AttributeGroup value);

} // Fstr_Zug_Rangier
