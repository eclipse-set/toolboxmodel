/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.BasisTypen.Eigenschaften_Datei_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luft Telegramm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung des Telegramms (Binaerdatei) zur Balise, von der das Telegramm an das Fahrzeug übertragen wird. Das Telegramm kann dabei in der Balise gespeichert sein oder von der LEU an die Balise gesendet werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdateiHilfe <em>Eigenschaften Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm()
 * @model extendedMetaData="name='CLuft_Telegramm' kind='elementOnly'"
 * @generated
 */
public interface Luft_Telegramm extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Eigenschaften Binaerdatei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadaten der Binärdatei, die von der Balise gesendet wird
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eigenschaften Binaerdatei</em>' containment reference.
	 * @see #setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_EigenschaftenBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Eigenschaften_Binaerdatei'"
	 * @generated
	 */
	Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eigenschaften Binaerdatei</em>' containment reference.
	 * @see #getEigenschaftenBinaerdatei()
	 * @generated
	 */
	void setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Eigenschaften Binaerdatei Hilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadaten der Hilfsdatei zur Unterstützung bei der Balisenprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eigenschaften Binaerdatei Hilfe</em>' containment reference.
	 * @see #setEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_EigenschaftenBinaerdateiHilfe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Eigenschaften_Binaerdatei_Hilfe'"
	 * @generated
	 */
	Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getEigenschaftenBinaerdateiHilfe <em>Eigenschaften Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eigenschaften Binaerdatei Hilfe</em>' containment reference.
	 * @see #getEigenschaftenBinaerdateiHilfe()
	 * @generated
	 */
	void setEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang EA Doku</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Anhang, der die Zuordnung zwischen Eingangsinformationen (z. B. Signalbegriffe) und zugehörigem Lufttelegramm enthält.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang EA Doku</em>' reference.
	 * @see #isSetIDAnhangEADoku()
	 * @see #unsetIDAnhangEADoku()
	 * @see #setIDAnhangEADoku(Anhang)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDAnhangEADoku()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_EA_Doku'"
	 * @generated
	 */
	Anhang getIDAnhangEADoku();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang EA Doku</em>' reference.
	 * @see #isSetIDAnhangEADoku()
	 * @see #unsetIDAnhangEADoku()
	 * @see #getIDAnhangEADoku()
	 * @generated
	 */
	void setIDAnhangEADoku(Anhang value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDAnhangEADoku()
	 * @see #getIDAnhangEADoku()
	 * @see #setIDAnhangEADoku(Anhang)
	 * @generated
	 */
	void unsetIDAnhangEADoku();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Anhang EA Doku</em>' reference is set.
	 * @see #unsetIDAnhangEADoku()
	 * @see #getIDAnhangEADoku()
	 * @see #setIDAnhangEADoku(Anhang)
	 * @generated
	 */
	boolean isSetIDAnhangEADoku();

	/**
	 * Returns the value of the '<em><b>ID Balise Uebertragung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Balise, von der das Lufttelegramm gesendet wird. Die Unterscheidung der verschiedenen Lufttelegramme an einer Balise erfolgt über ID_Fachtelegramm bzw. dessen Anschaltbedingung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Balise Uebertragung</em>' reference.
	 * @see #isSetIDBaliseUebertragung()
	 * @see #unsetIDBaliseUebertragung()
	 * @see #setIDBaliseUebertragung(Balise)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBaliseUebertragung()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Balise_Uebertragung'"
	 * @generated
	 */
	Balise getIDBaliseUebertragung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Balise Uebertragung</em>' reference.
	 * @see #isSetIDBaliseUebertragung()
	 * @see #unsetIDBaliseUebertragung()
	 * @see #getIDBaliseUebertragung()
	 * @generated
	 */
	void setIDBaliseUebertragung(Balise value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBaliseUebertragung()
	 * @see #getIDBaliseUebertragung()
	 * @see #setIDBaliseUebertragung(Balise)
	 * @generated
	 */
	void unsetIDBaliseUebertragung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Balise Uebertragung</em>' reference is set.
	 * @see #unsetIDBaliseUebertragung()
	 * @see #getIDBaliseUebertragung()
	 * @see #setIDBaliseUebertragung(Balise)
	 * @generated
	 */
	boolean isSetIDBaliseUebertragung();

	/**
	 * Returns the value of the '<em><b>ID Binaerdatei</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Binärdatei, die von der Balise gesendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdatei</em>' reference.
	 * @see #isSetIDBinaerdatei()
	 * @see #unsetIDBinaerdatei()
	 * @see #setIDBinaerdatei(Binaerdatei)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBinaerdatei()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdatei'"
	 * @generated
	 */
	Binaerdatei getIDBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdatei <em>ID Binaerdatei</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdatei</em>' reference.
	 * @see #isSetIDBinaerdatei()
	 * @see #unsetIDBinaerdatei()
	 * @see #getIDBinaerdatei()
	 * @generated
	 */
	void setIDBinaerdatei(Binaerdatei value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdatei <em>ID Binaerdatei</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBinaerdatei()
	 * @see #getIDBinaerdatei()
	 * @see #setIDBinaerdatei(Binaerdatei)
	 * @generated
	 */
	void unsetIDBinaerdatei();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdatei <em>ID Binaerdatei</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Binaerdatei</em>' reference is set.
	 * @see #unsetIDBinaerdatei()
	 * @see #getIDBinaerdatei()
	 * @see #setIDBinaerdatei(Binaerdatei)
	 * @generated
	 */
	boolean isSetIDBinaerdatei();

	/**
	 * Returns the value of the '<em><b>ID Binaerdatei Hilfe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Hilfsdatei zur Unterstützung bei der Balisenprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdatei Hilfe</em>' reference.
	 * @see #isSetIDBinaerdateiHilfe()
	 * @see #unsetIDBinaerdateiHilfe()
	 * @see #setIDBinaerdateiHilfe(Binaerdatei)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDBinaerdateiHilfe()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdatei_Hilfe'"
	 * @generated
	 */
	Binaerdatei getIDBinaerdateiHilfe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdatei Hilfe</em>' reference.
	 * @see #isSetIDBinaerdateiHilfe()
	 * @see #unsetIDBinaerdateiHilfe()
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 */
	void setIDBinaerdateiHilfe(Binaerdatei value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDBinaerdateiHilfe()
	 * @see #getIDBinaerdateiHilfe()
	 * @see #setIDBinaerdateiHilfe(Binaerdatei)
	 * @generated
	 */
	void unsetIDBinaerdateiHilfe();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Binaerdatei Hilfe</em>' reference is set.
	 * @see #unsetIDBinaerdateiHilfe()
	 * @see #getIDBinaerdateiHilfe()
	 * @see #setIDBinaerdateiHilfe(Binaerdatei)
	 * @generated
	 */
	boolean isSetIDBinaerdateiHilfe();

	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Fachtelegramm, das vom Lufttelegramm umgesetzt wird. Ein Fachtelegramm kann dabei durch mehrere Lufttelegramme umgesetzt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' reference.
	 * @see #isSetIDFachtelegramm()
	 * @see #unsetIDFachtelegramm()
	 * @see #setIDFachtelegramm(Fachtelegramm)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLuft_Telegramm_IDFachtelegramm()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	Fachtelegramm getIDFachtelegramm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fachtelegramm</em>' reference.
	 * @see #isSetIDFachtelegramm()
	 * @see #unsetIDFachtelegramm()
	 * @see #getIDFachtelegramm()
	 * @generated
	 */
	void setIDFachtelegramm(Fachtelegramm value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDFachtelegramm()
	 * @see #getIDFachtelegramm()
	 * @see #setIDFachtelegramm(Fachtelegramm)
	 * @generated
	 */
	void unsetIDFachtelegramm();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm#getIDFachtelegramm <em>ID Fachtelegramm</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Fachtelegramm</em>' reference is set.
	 * @see #unsetIDFachtelegramm()
	 * @see #getIDFachtelegramm()
	 * @see #setIDFachtelegramm(Fachtelegramm)
	 * @generated
	 */
	boolean isSetIDFachtelegramm();

} // Luft_Telegramm
