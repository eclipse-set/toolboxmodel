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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage_Moduleigenschaften_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Anlage Moduleigenschaften Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Anlage_Moduleigenschaften_AttributeGroupImpl#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Anlage_Moduleigenschaften_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Anlage_Moduleigenschaften_AttributeGroup {
	/**
	 * The cached value of the '{@link #getLEUAusgangNr() <em>LEU Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAusgangNr()
	 * @generated
	 * @ordered
	 */
	protected LEU_Ausgang_Nr_TypeClass lEUAusgangNr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Anlage_Moduleigenschaften_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Anlage_Moduleigenschaften_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Ausgang_Nr_TypeClass getLEUAusgangNr() {
		return lEUAusgangNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUAusgangNr(LEU_Ausgang_Nr_TypeClass newLEUAusgangNr, NotificationChain msgs) {
		LEU_Ausgang_Nr_TypeClass oldLEUAusgangNr = lEUAusgangNr;
		lEUAusgangNr = newLEUAusgangNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, oldLEUAusgangNr, newLEUAusgangNr);
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
	public void setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass newLEUAusgangNr) {
		if (newLEUAusgangNr != lEUAusgangNr) {
			NotificationChain msgs = null;
			if (lEUAusgangNr != null)
				msgs = ((InternalEObject)lEUAusgangNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, null, msgs);
			if (newLEUAusgangNr != null)
				msgs = ((InternalEObject)newLEUAusgangNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, null, msgs);
			msgs = basicSetLEUAusgangNr(newLEUAusgangNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, newLEUAusgangNr, newLEUAusgangNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return basicSetLEUAusgangNr(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return getLEUAusgangNr();
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				setLEUAusgangNr((LEU_Ausgang_Nr_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				setLEUAusgangNr((LEU_Ausgang_Nr_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_ANLAGE_MODULEIGENSCHAFTEN_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return lEUAusgangNr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Anlage_Moduleigenschaften_AttributeGroupImpl
