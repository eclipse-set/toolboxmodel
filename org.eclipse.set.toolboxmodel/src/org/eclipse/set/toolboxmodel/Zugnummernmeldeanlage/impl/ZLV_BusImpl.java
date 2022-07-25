/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZLV Bus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZLV_BusImpl#getZLVBusAllg <em>ZLV Bus Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLV_BusImpl extends Basis_ObjektImpl implements ZLV_Bus {
	/**
	 * The cached value of the '{@link #getZLVBusAllg() <em>ZLV Bus Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLVBusAllg()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus_Allg_AttributeGroup zLVBusAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLV_BusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZLV_BUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus_Allg_AttributeGroup getZLVBusAllg() {
		return zLVBusAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLVBusAllg(ZLV_Bus_Allg_AttributeGroup newZLVBusAllg, NotificationChain msgs) {
		ZLV_Bus_Allg_AttributeGroup oldZLVBusAllg = zLVBusAllg;
		zLVBusAllg = newZLVBusAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, oldZLVBusAllg, newZLVBusAllg);
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
	public void setZLVBusAllg(ZLV_Bus_Allg_AttributeGroup newZLVBusAllg) {
		if (newZLVBusAllg != zLVBusAllg) {
			NotificationChain msgs = null;
			if (zLVBusAllg != null)
				msgs = ((InternalEObject)zLVBusAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, null, msgs);
			if (newZLVBusAllg != null)
				msgs = ((InternalEObject)newZLVBusAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, null, msgs);
			msgs = basicSetZLVBusAllg(newZLVBusAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG, newZLVBusAllg, newZLVBusAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				return basicSetZLVBusAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				return getZLVBusAllg();
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				setZLVBusAllg((ZLV_Bus_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				setZLVBusAllg((ZLV_Bus_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZLV_BUS__ZLV_BUS_ALLG:
				return zLVBusAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZLV_BusImpl
