/**
 */
package org.eclipse.set.toolboxmodel.PlanPro.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;
import org.eclipse.set.toolboxmodel.PlanPro.LST_Objekte_Planungsbereich_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LST Objekte Planungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.LST_Objekte_Planungsbereich_AttributeGroupImpl#getIDLSTObjektPlanungsbereich <em>IDLST Objekt Planungsbereich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LST_Objekte_Planungsbereich_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LST_Objekte_Planungsbereich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDLSTObjektPlanungsbereich() <em>IDLST Objekt Planungsbereich</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLSTObjektPlanungsbereich()
	 * @generated
	 * @ordered
	 */
	protected EList<Ur_Objekt> iDLSTObjektPlanungsbereich;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LST_Objekte_Planungsbereich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getLST_Objekte_Planungsbereich_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ur_Objekt> getIDLSTObjektPlanungsbereich() {
		if (iDLSTObjektPlanungsbereich == null) {
			iDLSTObjektPlanungsbereich = new EObjectResolvingEList<Ur_Objekt>(Ur_Objekt.class, this, PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH);
		}
		return iDLSTObjektPlanungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				return getIDLSTObjektPlanungsbereich();
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				getIDLSTObjektPlanungsbereich().clear();
				getIDLSTObjektPlanungsbereich().addAll((Collection<? extends Ur_Objekt>)newValue);
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				getIDLSTObjektPlanungsbereich().clear();
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
			case PlanProPackage.LST_OBJEKTE_PLANUNGSBEREICH_ATTRIBUTE_GROUP__IDLST_OBJEKT_PLANUNGSBEREICH:
				return iDLSTObjektPlanungsbereich != null && !iDLSTObjektPlanungsbereich.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //LST_Objekte_Planungsbereich_AttributeGroupImpl
