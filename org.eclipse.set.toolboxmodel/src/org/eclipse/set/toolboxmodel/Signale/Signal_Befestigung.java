/**
 */
package org.eclipse.set.toolboxmodel.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Befestigung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Konstruktionselement, das der baulichen Aufnahme eines oder mehrerer Signalrahmen dient. Die konkreten konstruktiven Merkmale sind in einer (oder im Bedarfsfall mehreren) Regelzeichnung(en) enthalten, auf die jeweils ein GUID-Verweis zeigt. Bei Sonderkonstruktionen wird die Regelzeichnung durch die zugehörigen Zulassungsdokumente ersetzt. Diese sind als Anhang mittels eines Bearbeitungsvermerks beizufügen. Signalbefestigungen können auch weitere Signalbefestigungen aufnehmen (z.B. trägt ein Signalausleger eine Arbeitsbühne). Einer Signalbefestigung ist mindestens ein Objekt Signal Rahmen oder Signal Befestigung zugeordnet. Ausführliche Beschreibung s. Modellierung Signal. DB-Regelwerk Regelzeichnungen 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung()
 * @model extendedMetaData="name='CSignal_Befestigung' kind='elementOnly'"
 * @generated
 */
public interface Signal_Befestigung extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Regelzeichnung. Für Signale werden in der Regel die Regelzeichnungen der Gruppe S800x,yy verwendet, die die grundsätzliche Anordnung am Gleis beschreiben. Die angegebene Regelzeichnung wird mittels Parametern (z. B.: "Bild") weiter spezifiziert. Der Verweis kann mehrfach verwendet werden, wenn die Zuordnung mehrerer Regelzeichnungen explizit erforderlich ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' reference list.
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_IDRegelzeichnung()
	 * @model extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	EList<Regelzeichnung> getIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung Vsig Tafel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Regelzeichnung für die Vorsignaltafel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung Vsig Tafel</em>' reference.
	 * @see #isSetIDRegelzeichnungVsigTafel()
	 * @see #unsetIDRegelzeichnungVsigTafel()
	 * @see #setIDRegelzeichnungVsigTafel(Regelzeichnung)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_IDRegelzeichnungVsigTafel()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung_Vsig_Tafel'"
	 * @generated
	 */
	Regelzeichnung getIDRegelzeichnungVsigTafel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Regelzeichnung Vsig Tafel</em>' reference.
	 * @see #isSetIDRegelzeichnungVsigTafel()
	 * @see #unsetIDRegelzeichnungVsigTafel()
	 * @see #getIDRegelzeichnungVsigTafel()
	 * @generated
	 */
	void setIDRegelzeichnungVsigTafel(Regelzeichnung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDRegelzeichnungVsigTafel()
	 * @see #getIDRegelzeichnungVsigTafel()
	 * @see #setIDRegelzeichnungVsigTafel(Regelzeichnung)
	 * @generated
	 */
	void unsetIDRegelzeichnungVsigTafel();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Regelzeichnung Vsig Tafel</em>' reference is set.
	 * @see #unsetIDRegelzeichnungVsigTafel()
	 * @see #getIDRegelzeichnungVsigTafel()
	 * @see #setIDRegelzeichnungVsigTafel(Regelzeichnung)
	 * @generated
	 */
	boolean isSetIDRegelzeichnungVsigTafel();

	/**
	 * Returns the value of the '<em><b>ID Signal Befestigung</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein zugehöriges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Einträgen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Befestigung</em>' reference.
	 * @see #isSetIDSignalBefestigung()
	 * @see #unsetIDSignalBefestigung()
	 * @see #setIDSignalBefestigung(Signal_Befestigung)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_IDSignalBefestigung()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Befestigung'"
	 * @generated
	 */
	Signal_Befestigung getIDSignalBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Befestigung</em>' reference.
	 * @see #isSetIDSignalBefestigung()
	 * @see #unsetIDSignalBefestigung()
	 * @see #getIDSignalBefestigung()
	 * @generated
	 */
	void setIDSignalBefestigung(Signal_Befestigung value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDSignalBefestigung()
	 * @see #getIDSignalBefestigung()
	 * @see #setIDSignalBefestigung(Signal_Befestigung)
	 * @generated
	 */
	void unsetIDSignalBefestigung();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID Signal Befestigung</em>' reference is set.
	 * @see #unsetIDSignalBefestigung()
	 * @see #getIDSignalBefestigung()
	 * @see #setIDSignalBefestigung(Signal_Befestigung)
	 * @generated
	 */
	boolean isSetIDSignalBefestigung();

	/**
	 * Returns the value of the '<em><b>Signal Befestigung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Signale.SignalePackage#getSignal_Befestigung_SignalBefestigungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigung_Allg'"
	 * @generated
	 */
	Signal_Befestigung_Allg_AttributeGroup getSignalBefestigungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #getSignalBefestigungAllg()
	 * @generated
	 */
	void setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup value);

} // Signal_Befestigung
