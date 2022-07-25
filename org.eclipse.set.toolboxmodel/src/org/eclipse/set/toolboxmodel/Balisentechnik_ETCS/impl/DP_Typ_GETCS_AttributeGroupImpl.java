/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_ETCS_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Typ GETCS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Typ_GETCS_AttributeGroupImpl#getDPTypETCS <em>DP Typ ETCS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Typ_GETCS_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Typ_GETCS_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPTypETCS() <em>DP Typ ETCS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPTypETCS()
	 * @generated
	 * @ordered
	 */
	protected EList<DP_Typ_ETCS_TypeClass> dPTypETCS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Typ_GETCS_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Typ_GETCS_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DP_Typ_ETCS_TypeClass> getDPTypETCS() {
		if (dPTypETCS == null) {
			dPTypETCS = new EObjectContainmentEList<DP_Typ_ETCS_TypeClass>(DP_Typ_ETCS_TypeClass.class, this, Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS);
		}
		return dPTypETCS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				return ((InternalEList<?>)getDPTypETCS()).basicRemove(otherEnd, msgs);
			default:
				return super.eInverseRemove(otherEnd, featureID, msgs);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				return getDPTypETCS();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				getDPTypETCS().clear();
				getDPTypETCS().addAll((Collection<? extends DP_Typ_ETCS_TypeClass>)newValue);
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				getDPTypETCS().clear();
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
			case Balisentechnik_ETCSPackage.DP_TYP_GETCS_ATTRIBUTE_GROUP__DP_TYP_ETCS:
				return dPTypETCS != null && !dPTypETCS.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_Typ_GETCS_AttributeGroupImpl
