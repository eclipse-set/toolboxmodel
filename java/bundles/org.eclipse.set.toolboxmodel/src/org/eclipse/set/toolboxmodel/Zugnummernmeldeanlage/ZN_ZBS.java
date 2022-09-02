/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN ZBS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der Parameter für die Anbindung einer ZN an die BZ. Der Verweis auf ID ESTW Zentraleinheit beschreibt den Ort der räumlichen Unterbringung der Koppelunterstation. Bei der Bearbeitung im Planungstool kann es notwendig sein, bereits bei Bearbeitung im Dialogfeld ZN-ZBS den Verweis auf die ESTW_Zentraleinheit zu befüllen. DB-Regelwerk 819.0731 6 (16) Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getZNZBSAllg <em>ZNZBS Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS()
 * @model extendedMetaData="name='CZN_ZBS' kind='elementOnly'"
 * @generated
 */
public interface ZN_ZBS extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDESTW Zentraleinheit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Ort der räumlichen Unterbringung der Koppelunterstation 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESTW Zentraleinheit</em>' reference.
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_IDESTWZentraleinheit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='ID_ESTW_Zentraleinheit'"
	 * @generated
	 */
	ESTW_Zentraleinheit getIDESTWZentraleinheit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
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
	 * Unsets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	void unsetIDESTWZentraleinheit();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>IDESTW Zentraleinheit</em>' reference is set.
	 * @see #unsetIDESTWZentraleinheit()
	 * @see #getIDESTWZentraleinheit()
	 * @see #setIDESTWZentraleinheit(ESTW_Zentraleinheit)
	 * @generated
	 */
	boolean isSetIDESTWZentraleinheit();

	/**
	 * Returns the value of the '<em><b>ZNZBS Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZNZBS Allg</em>' containment reference.
	 * @see #setZNZBSAllg(ZN_ZBS_Allg_AttributeGroup)
	 * @see org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_ZNZBSAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_ZBS_Allg'"
	 * @generated
	 */
	ZN_ZBS_Allg_AttributeGroup getZNZBSAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS#getZNZBSAllg <em>ZNZBS Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZNZBS Allg</em>' containment reference.
	 * @see #getZNZBSAllg()
	 * @generated
	 */
	void setZNZBSAllg(ZN_ZBS_Allg_AttributeGroup value);

} // ZN_ZBS
