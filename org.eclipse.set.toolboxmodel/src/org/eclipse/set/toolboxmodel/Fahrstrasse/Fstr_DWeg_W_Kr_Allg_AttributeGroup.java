/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg WKr Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_AttributeGroup#getFstrDWegWKr <em>Fstr DWeg WKr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_Allg_AttributeGroup()
 * @model extendedMetaData="name='CFstr_DWeg_W_Kr_Allg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg_W_Kr_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fstr DWeg WKr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschluss der Weiche im Durchrutschweg. Stumpf berutschte, auffahrbare Weichen im Durchrutschweg können unverschlossen bleiben. Das Attribut ist herstellerneutralitätskritisch. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: "Weichen, Kreuzungen, Gleissperren"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr DWeg WKr</em>' containment reference.
	 * @see #setFstrDWegWKr(Fstr_DWeg_W_Kr_TypeClass)
	 * @see org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_Allg_AttributeGroup_FstrDWegWKr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_DWeg_W_Kr'"
	 * @generated
	 */
	Fstr_DWeg_W_Kr_TypeClass getFstrDWegWKr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_AttributeGroup#getFstrDWegWKr <em>Fstr DWeg WKr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr DWeg WKr</em>' containment reference.
	 * @see #getFstrDWegWKr()
	 * @generated
	 */
	void setFstrDWegWKr(Fstr_DWeg_W_Kr_TypeClass value);

} // Fstr_DWeg_W_Kr_Allg_AttributeGroup
