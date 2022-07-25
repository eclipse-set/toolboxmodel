/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_ETCS_L2_Typ_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT ETCS L2 Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_ETCS_L2_Merkmale_AttributeGroupImpl#getFTETCSL2Typ <em>FTETCSL2 Typ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_ETCS_L2_Merkmale_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FT_ETCS_L2_Merkmale_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFTETCSL2Typ() <em>FTETCSL2 Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTETCSL2Typ()
	 * @generated
	 * @ordered
	 */
	protected FT_ETCS_L2_Typ_TypeClass fTETCSL2Typ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_ETCS_L2_Merkmale_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_ETCS_L2_Merkmale_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_ETCS_L2_Typ_TypeClass getFTETCSL2Typ() {
		return fTETCSL2Typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass newFTETCSL2Typ, NotificationChain msgs) {
		FT_ETCS_L2_Typ_TypeClass oldFTETCSL2Typ = fTETCSL2Typ;
		fTETCSL2Typ = newFTETCSL2Typ;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, oldFTETCSL2Typ, newFTETCSL2Typ);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass newFTETCSL2Typ) {
		if (newFTETCSL2Typ != fTETCSL2Typ) {
			NotificationChain msgs = null;
			if (fTETCSL2Typ != null)
				msgs = ((InternalEObject)fTETCSL2Typ).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, null, msgs);
			if (newFTETCSL2Typ != null)
				msgs = ((InternalEObject)newFTETCSL2Typ).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, null, msgs);
			msgs = basicSetFTETCSL2Typ(newFTETCSL2Typ, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP, newFTETCSL2Typ, newFTETCSL2Typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				return basicSetFTETCSL2Typ(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				return getFTETCSL2Typ();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				setFTETCSL2Typ((FT_ETCS_L2_Typ_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				setFTETCSL2Typ((FT_ETCS_L2_Typ_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_ETCS_L2_MERKMALE_ATTRIBUTE_GROUP__FTETCSL2_TYP:
				return fTETCSL2Typ != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_ETCS_L2_Merkmale_AttributeGroupImpl
