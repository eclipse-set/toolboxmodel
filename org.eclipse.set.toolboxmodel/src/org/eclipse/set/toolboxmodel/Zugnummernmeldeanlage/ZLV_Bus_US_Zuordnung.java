/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus US Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von ZLV-Bussen zur ZN Unterstation und Angabe durchzureichender Telegramme. Logisches Objekt, falls eine ZN Unterstation an mehrere ZLV-Busse angebunden wird. DB-Regelwerk 819.0731 5 (4) ff Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getZLVBusUSZuordnungTelegramm <em>ZLV Bus US Zuordnung Telegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getZLVBusZuordnungAllg <em>ZLV Bus Zuordnung Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung()
 * @model extendedMetaData="name='CZLV_Bus_US_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_US_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des ZLV-Busses, an den die Unterstation angebunden wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' reference.
	 * @see #isSetIDZLVBus()
	 * @see #unsetIDZLVBus()
	 * @see #setIDZLVBus(ZLV_Bus)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_IDZLVBus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	ZLV_Bus getIDZLVBus();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZLVBus <em>IDZLV Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZLV Bus</em>' reference.
	 * @see #isSetIDZLVBus()
	 * @see #unsetIDZLVBus()
	 * @see #getIDZLVBus()
	 * @generated
	 */
	void setIDZLVBus(ZLV_Bus value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZLVBus <em>IDZLV Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZLVBus()
	 * @see #getIDZLVBus()
	 * @see #setIDZLVBus(ZLV_Bus)
	 * @generated
	 */
	void unsetIDZLVBus();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZLVBus <em>IDZLV Bus</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZLV Bus</em>' reference is set.
	 * @see #unsetIDZLVBus()
	 * @see #getIDZLVBus()
	 * @see #setIDZLVBus(ZLV_Bus)
	 * @generated
	 */
	boolean isSetIDZLVBus();

	/**
	 * Returns the value of the '<em><b>IDZN Unterstation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID der ZLV-Bus-Unterstation, die an den ZLV-Bus angeschlossen wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Unterstation</em>' reference.
	 * @see #isSetIDZNUnterstation()
	 * @see #unsetIDZNUnterstation()
	 * @see #setIDZNUnterstation(ZN_Unterstation)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_IDZNUnterstation()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Unterstation'"
	 * @generated
	 */
	ZN_Unterstation getIDZNUnterstation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZNUnterstation <em>IDZN Unterstation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Unterstation</em>' reference.
	 * @see #isSetIDZNUnterstation()
	 * @see #unsetIDZNUnterstation()
	 * @see #getIDZNUnterstation()
	 * @generated
	 */
	void setIDZNUnterstation(ZN_Unterstation value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZNUnterstation <em>IDZN Unterstation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDZNUnterstation()
	 * @see #getIDZNUnterstation()
	 * @see #setIDZNUnterstation(ZN_Unterstation)
	 * @generated
	 */
	void unsetIDZNUnterstation();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getIDZNUnterstation <em>IDZN Unterstation</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDZN Unterstation</em>' reference is set.
	 * @see #unsetIDZNUnterstation()
	 * @see #getIDZNUnterstation()
	 * @see #setIDZNUnterstation(ZN_Unterstation)
	 * @generated
	 */
	boolean isSetIDZNUnterstation();

	/**
	 * Returns the value of the '<em><b>ZLV Bus US Zuordnung Telegramm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Darstellung von durchzureichenden Telegrammen gemäß Tabelle 2 in der Ril 819.0731 A02. Die Attributgruppe dient der Zuordnung zur Quell-Unterstation, von der ZN-Anzeigefelder und/oder Telegramme durchgereicht werden. Firmenspezifische Telegrammarten werden nicht durchgereicht. DB-Regelwerk 819.0731 A02. Die Darstellung im PT1 erfolgt, wenn überhaupt, im Erläuterungsbericht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLV Bus US Zuordnung Telegramm</em>' containment reference.
	 * @see #setZLVBusUSZuordnungTelegramm(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_ZLVBusUSZuordnungTelegramm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus_US_Zuordnung_Telegramm'"
	 * @generated
	 */
	ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup getZLVBusUSZuordnungTelegramm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getZLVBusUSZuordnungTelegramm <em>ZLV Bus US Zuordnung Telegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLV Bus US Zuordnung Telegramm</em>' containment reference.
	 * @see #getZLVBusUSZuordnungTelegramm()
	 * @generated
	 */
	void setZLVBusUSZuordnungTelegramm(ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZLV Bus Zuordnung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZLV Bus Zuordnung Allg</em>' containment reference.
	 * @see #setZLVBusZuordnungAllg(ZLV_Bus_Zuordnung_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_ZLVBusZuordnungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus_Zuordnung_Allg'"
	 * @generated
	 */
	ZLV_Bus_Zuordnung_Allg_AttributeGroup getZLVBusZuordnungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung#getZLVBusZuordnungAllg <em>ZLV Bus Zuordnung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLV Bus Zuordnung Allg</em>' containment reference.
	 * @see #getZLVBusZuordnungAllg()
	 * @generated
	 */
	void setZLVBusZuordnungAllg(ZLV_Bus_Zuordnung_Allg_AttributeGroup value);

} // ZLV_Bus_US_Zuordnung
