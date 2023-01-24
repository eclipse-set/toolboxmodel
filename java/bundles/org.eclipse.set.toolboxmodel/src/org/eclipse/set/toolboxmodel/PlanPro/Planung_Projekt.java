/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung Projekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ermöglicht die globale Angabe und Zuordnung von organisatorischen und inhaltlichen Daten, die für alle Planungsgruppen eines Planungsprojekts gleichermaßen gelten.
 * Ein ~ enthält mindestens eine Planungsgruppe.
 * DB-Regelwerk
 * Bisher keine eindeutige Abbildung als Schriftfeldeintrag gemäß Ril 886.0102.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Projekt#getLSTPlanungGruppe <em>LST Planung Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Projekt#getPlanungPAllg <em>Planung PAllg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanung_Projekt()
 * @model extendedMetaData="name='CPlanung_Projekt' kind='elementOnly'"
 * @generated
 */
public interface Planung_Projekt extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>LST Planung Gruppe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Gruppe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung des Objekts Planung_Gruppe in das Objekt Planung_Projekt.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung Gruppe</em>' containment reference list.
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanung_Projekt_LSTPlanungGruppe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Planung_Gruppe'"
	 * @generated
	 */
	EList<Planung_Gruppe> getLSTPlanungGruppe();

	/**
	 * Returns the value of the '<em><b>Planung PAllg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung PAllg</em>' containment reference.
	 * @see #setPlanungPAllg(Planung_P_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanung_Projekt_PlanungPAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_P_Allg'"
	 * @generated
	 */
	Planung_P_Allg_AttributeGroup getPlanungPAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Projekt#getPlanungPAllg <em>Planung PAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung PAllg</em>' containment reference.
	 * @see #getPlanungPAllg()
	 * @generated
	 */
	void setPlanungPAllg(Planung_P_Allg_AttributeGroup value);
	

	/**
	 * Returns the value of the '<em><b>Lst Planung Erste Gruppe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lst Planung Erste Gruppe</em>' reference.
	 * @see #setLstPlanungErsteGruppe(Planung_Gruppe)
	 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getPlanung_Projekt_LstPlanungErsteGruppe()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='final java.util.Optional&lt;org.eclipse.set.toolboxmodel.modelservice.ProjectGroupProviderService&gt; optionalProviderService = org.eclipse.set.toolboxmodel.modelservice.PlanProModelServices\n\t.get(org.eclipse.set.toolboxmodel.modelservice.ProjectGroupProviderService.class);\nif (optionalProviderService.isPresent()) {\n\tfinal org.eclipse.set.toolboxmodel.modelservice.ProjectGroupProviderService providerService = optionalProviderService\n\t\t\t.get();\n\treturn (Planung_Gruppe) providerService.getGroup(this);\n}\nreturn getLSTPlanungGruppe().get(0);\n'"
	 * @generated
	 */
	Planung_Gruppe getLstPlanungErsteGruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Projekt#getLstPlanungErsteGruppe <em>Lst Planung Erste Gruppe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lst Planung Erste Gruppe</em>' reference.
	 * @see #getLstPlanungErsteGruppe()
	 * @generated
	 */
	void setLstPlanungErsteGruppe(Planung_Gruppe value);


} // Planung_Projekt
