/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Telegramm_84_Alle_Fstr_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Telegramm_84_Fuer_Alle_Fstr_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZLV_Bus;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Telegramm 84 Alle Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.Telegramm_84_Alle_Fstr_AttributeGroupImpl#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.Telegramm_84_Alle_Fstr_AttributeGroupImpl#getTelegramm84FuerAlleFstr <em>Telegramm84 Fuer Alle Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Telegramm_84_Alle_Fstr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Telegramm_84_Alle_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDZLVBus() <em>IDZLV Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLVBus()
	 * @generated
	 * @ordered
	 */
	protected ZLV_Bus iDZLVBus;

	/**
	 * This is true if the IDZLV Bus reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLVBusESet;

	/**
	 * The cached value of the '{@link #getTelegramm84FuerAlleFstr() <em>Telegramm84 Fuer Alle Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegramm84FuerAlleFstr()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_84_Fuer_Alle_Fstr_TypeClass telegramm84FuerAlleFstr;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Telegramm_84_Alle_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZLV_Bus getIDZLVBus() {
		if (iDZLVBus != null && iDZLVBus.eIsProxy()) {
			InternalEObject oldIDZLVBus = (InternalEObject)iDZLVBus;
			iDZLVBus = (ZLV_Bus)eResolveProxy(oldIDZLVBus);
			if (iDZLVBus != oldIDZLVBus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, iDZLVBus));
			}
		}
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZLV_Bus basicGetIDZLVBus() {
		return iDZLVBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLVBus(ZLV_Bus newIDZLVBus) {
		ZLV_Bus oldIDZLVBus = iDZLVBus;
		iDZLVBus = newIDZLVBus;
		boolean oldIDZLVBusESet = iDZLVBusESet;
		iDZLVBusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, iDZLVBus, !oldIDZLVBusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLVBus() {
		ZLV_Bus oldIDZLVBus = iDZLVBus;
		boolean oldIDZLVBusESet = iDZLVBusESet;
		iDZLVBus = null;
		iDZLVBusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS, oldIDZLVBus, null, oldIDZLVBusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLVBus() {
		return iDZLVBusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_84_Fuer_Alle_Fstr_TypeClass getTelegramm84FuerAlleFstr() {
		return telegramm84FuerAlleFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegramm84FuerAlleFstr(Telegramm_84_Fuer_Alle_Fstr_TypeClass newTelegramm84FuerAlleFstr, NotificationChain msgs) {
		Telegramm_84_Fuer_Alle_Fstr_TypeClass oldTelegramm84FuerAlleFstr = telegramm84FuerAlleFstr;
		telegramm84FuerAlleFstr = newTelegramm84FuerAlleFstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR, oldTelegramm84FuerAlleFstr, newTelegramm84FuerAlleFstr);
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
	public void setTelegramm84FuerAlleFstr(Telegramm_84_Fuer_Alle_Fstr_TypeClass newTelegramm84FuerAlleFstr) {
		if (newTelegramm84FuerAlleFstr != telegramm84FuerAlleFstr) {
			NotificationChain msgs = null;
			if (telegramm84FuerAlleFstr != null)
				msgs = ((InternalEObject)telegramm84FuerAlleFstr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR, null, msgs);
			if (newTelegramm84FuerAlleFstr != null)
				msgs = ((InternalEObject)newTelegramm84FuerAlleFstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR, null, msgs);
			msgs = basicSetTelegramm84FuerAlleFstr(newTelegramm84FuerAlleFstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR, newTelegramm84FuerAlleFstr, newTelegramm84FuerAlleFstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR:
				return basicSetTelegramm84FuerAlleFstr(null, msgs);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				if (resolve) return getIDZLVBus();
				return basicGetIDZLVBus();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR:
				return getTelegramm84FuerAlleFstr();
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				setIDZLVBus((ZLV_Bus)newValue);
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR:
				setTelegramm84FuerAlleFstr((Telegramm_84_Fuer_Alle_Fstr_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				unsetIDZLVBus();
				return;
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR:
				setTelegramm84FuerAlleFstr((Telegramm_84_Fuer_Alle_Fstr_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__IDZLV_BUS:
				return isSetIDZLVBus();
			case ZugnummernmeldeanlagePackage.TELEGRAMM_84_ALLE_FSTR_ATTRIBUTE_GROUP__TELEGRAMM84_FUER_ALLE_FSTR:
				return telegramm84FuerAlleFstr != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Telegramm_84_Alle_Fstr_AttributeGroupImpl
