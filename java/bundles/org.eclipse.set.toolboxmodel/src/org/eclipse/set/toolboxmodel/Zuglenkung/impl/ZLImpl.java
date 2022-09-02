/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_ZN_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZLImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZLImpl#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZLImpl#getZLAllg <em>ZL Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZLImpl#getZLZN <em>ZLZN</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZLImpl extends Basis_ObjektImpl implements ZL {
	/**
	 * The cached value of the '{@link #getIDESTWZentraleinheit() <em>IDESTW Zentraleinheit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 * @ordered
	 */
	protected ESTW_Zentraleinheit iDESTWZentraleinheit;

	/**
	 * This is true if the IDESTW Zentraleinheit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDESTWZentraleinheitESet;

	/**
	 * The cached value of the '{@link #getIDZN() <em>IDZN</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZN()
	 * @generated
	 * @ordered
	 */
	protected ZN iDZN;

	/**
	 * This is true if the IDZN reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNESet;

	/**
	 * The cached value of the '{@link #getZLAllg() <em>ZL Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Allg_AttributeGroup zLAllg;

	/**
	 * The cached value of the '{@link #getZLZN() <em>ZLZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLZN()
	 * @generated
	 * @ordered
	 */
	protected ZL_ZN_AttributeGroup zLZN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit getIDESTWZentraleinheit() {
		if (iDESTWZentraleinheit != null && iDESTWZentraleinheit.eIsProxy()) {
			InternalEObject oldIDESTWZentraleinheit = (InternalEObject)iDESTWZentraleinheit;
			iDESTWZentraleinheit = (ESTW_Zentraleinheit)eResolveProxy(oldIDESTWZentraleinheit);
			if (iDESTWZentraleinheit != oldIDESTWZentraleinheit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, iDESTWZentraleinheit));
			}
		}
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESTW_Zentraleinheit basicGetIDESTWZentraleinheit() {
		return iDESTWZentraleinheit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDESTWZentraleinheit(ESTW_Zentraleinheit newIDESTWZentraleinheit) {
		ESTW_Zentraleinheit oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		iDESTWZentraleinheit = newIDESTWZentraleinheit;
		boolean oldIDESTWZentraleinheitESet = iDESTWZentraleinheitESet;
		iDESTWZentraleinheitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, iDESTWZentraleinheit, !oldIDESTWZentraleinheitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDESTWZentraleinheit() {
		ESTW_Zentraleinheit oldIDESTWZentraleinheit = iDESTWZentraleinheit;
		boolean oldIDESTWZentraleinheitESet = iDESTWZentraleinheitESet;
		iDESTWZentraleinheit = null;
		iDESTWZentraleinheitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, null, oldIDESTWZentraleinheitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDESTWZentraleinheit() {
		return iDESTWZentraleinheitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN getIDZN() {
		if (iDZN != null && iDZN.eIsProxy()) {
			InternalEObject oldIDZN = (InternalEObject)iDZN;
			iDZN = (ZN)eResolveProxy(oldIDZN);
			if (iDZN != oldIDZN) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL__IDZN, oldIDZN, iDZN));
			}
		}
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN basicGetIDZN() {
		return iDZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZN(ZN newIDZN) {
		ZN oldIDZN = iDZN;
		iDZN = newIDZN;
		boolean oldIDZNESet = iDZNESet;
		iDZNESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__IDZN, oldIDZN, iDZN, !oldIDZNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZN() {
		ZN oldIDZN = iDZN;
		boolean oldIDZNESet = iDZNESet;
		iDZN = null;
		iDZNESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL__IDZN, oldIDZN, null, oldIDZNESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZN() {
		return iDZNESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Allg_AttributeGroup getZLAllg() {
		return zLAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLAllg(ZL_Allg_AttributeGroup newZLAllg, NotificationChain msgs) {
		ZL_Allg_AttributeGroup oldZLAllg = zLAllg;
		zLAllg = newZLAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZL_ALLG, oldZLAllg, newZLAllg);
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
	public void setZLAllg(ZL_Allg_AttributeGroup newZLAllg) {
		if (newZLAllg != zLAllg) {
			NotificationChain msgs = null;
			if (zLAllg != null)
				msgs = ((InternalEObject)zLAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZL_ALLG, null, msgs);
			if (newZLAllg != null)
				msgs = ((InternalEObject)newZLAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZL_ALLG, null, msgs);
			msgs = basicSetZLAllg(newZLAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZL_ALLG, newZLAllg, newZLAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_ZN_AttributeGroup getZLZN() {
		return zLZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLZN(ZL_ZN_AttributeGroup newZLZN, NotificationChain msgs) {
		ZL_ZN_AttributeGroup oldZLZN = zLZN;
		zLZN = newZLZN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZLZN, oldZLZN, newZLZN);
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
	public void setZLZN(ZL_ZN_AttributeGroup newZLZN) {
		if (newZLZN != zLZN) {
			NotificationChain msgs = null;
			if (zLZN != null)
				msgs = ((InternalEObject)zLZN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZLZN, null, msgs);
			if (newZLZN != null)
				msgs = ((InternalEObject)newZLZN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL__ZLZN, null, msgs);
			msgs = basicSetZLZN(newZLZN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL__ZLZN, newZLZN, newZLZN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL__ZL_ALLG:
				return basicSetZLAllg(null, msgs);
			case ZuglenkungPackage.ZL__ZLZN:
				return basicSetZLZN(null, msgs);
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				if (resolve) return getIDESTWZentraleinheit();
				return basicGetIDESTWZentraleinheit();
			case ZuglenkungPackage.ZL__IDZN:
				if (resolve) return getIDZN();
				return basicGetIDZN();
			case ZuglenkungPackage.ZL__ZL_ALLG:
				return getZLAllg();
			case ZuglenkungPackage.ZL__ZLZN:
				return getZLZN();
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ESTW_Zentraleinheit)newValue);
				return;
			case ZuglenkungPackage.ZL__IDZN:
				setIDZN((ZN)newValue);
				return;
			case ZuglenkungPackage.ZL__ZL_ALLG:
				setZLAllg((ZL_Allg_AttributeGroup)newValue);
				return;
			case ZuglenkungPackage.ZL__ZLZN:
				setZLZN((ZL_ZN_AttributeGroup)newValue);
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				unsetIDESTWZentraleinheit();
				return;
			case ZuglenkungPackage.ZL__IDZN:
				unsetIDZN();
				return;
			case ZuglenkungPackage.ZL__ZL_ALLG:
				setZLAllg((ZL_Allg_AttributeGroup)null);
				return;
			case ZuglenkungPackage.ZL__ZLZN:
				setZLZN((ZL_ZN_AttributeGroup)null);
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
			case ZuglenkungPackage.ZL__IDESTW_ZENTRALEINHEIT:
				return isSetIDESTWZentraleinheit();
			case ZuglenkungPackage.ZL__IDZN:
				return isSetIDZN();
			case ZuglenkungPackage.ZL__ZL_ALLG:
				return zLAllg != null;
			case ZuglenkungPackage.ZL__ZLZN:
				return zLZN != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZLImpl
