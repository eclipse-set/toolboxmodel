/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binaerdatei</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binärdatei mit betriebssystemnahen Metadaten (z. B. Dateiname, Dateityp).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdatei#getBinaerdateiAllg <em>Binaerdatei Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdatei()
 * @model extendedMetaData="name='CBinaerdatei' kind='elementOnly'"
 * @generated
 */
public interface Binaerdatei extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Binaerdatei Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binaerdatei Allg</em>' containment reference.
	 * @see #setBinaerdateiAllg(Binaerdatei_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdatei_BinaerdateiAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Binaerdatei_Allg'"
	 * @generated
	 */
	Binaerdatei_Allg_AttributeGroup getBinaerdateiAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdatei#getBinaerdateiAllg <em>Binaerdatei Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binaerdatei Allg</em>' containment reference.
	 * @see #getBinaerdateiAllg()
	 * @generated
	 */
	void setBinaerdateiAllg(Binaerdatei_Allg_AttributeGroup value);

} // Binaerdatei
