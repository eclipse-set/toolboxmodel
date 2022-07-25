/**
 */
package org.eclipse.set.toolboxmodel.BasisTypen.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.toolboxmodel.BasisTypen.BasisTypenPackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis Attribut Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.BasisTypen.impl.BasisAttribut_AttributeGroupImpl#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BasisAttribut_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BasisAttribut_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBearbeitungsvermerk() <em>ID Bearbeitungsvermerk</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBearbeitungsvermerk()
	 * @generated
	 * @ordered
	 */
	protected EList<Bearbeitungsvermerk> iDBearbeitungsvermerk;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisAttribut_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisTypenPackage.Literals.BASIS_ATTRIBUT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bearbeitungsvermerk> getIDBearbeitungsvermerk() {
		if (iDBearbeitungsvermerk == null) {
			iDBearbeitungsvermerk = new EObjectResolvingEList<Bearbeitungsvermerk>(Bearbeitungsvermerk.class, this, BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK);
		}
		return iDBearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				return getIDBearbeitungsvermerk();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				getIDBearbeitungsvermerk().clear();
				getIDBearbeitungsvermerk().addAll((Collection<? extends Bearbeitungsvermerk>)newValue);
				return;
			default:
				super.eSet(featureID, newValue);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				getIDBearbeitungsvermerk().clear();
				return;
			default:
				super.eUnset(featureID);
				return;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasisTypenPackage.BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK:
				return iDBearbeitungsvermerk != null && !iDBearbeitungsvermerk.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BasisAttribut_AttributeGroupImpl
