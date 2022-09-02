/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN ZBS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_ZBSImpl#getZNZBSAllg <em>ZNZBS Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_ZBSImpl extends Basis_ObjektImpl implements ZN_ZBS {
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
	 * The cached value of the '{@link #getZNZBSAllg() <em>ZNZBS Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNZBSAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_ZBS_Allg_AttributeGroup zNZBSAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_ZBSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_ZBS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, iDESTWZentraleinheit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, iDESTWZentraleinheit, !oldIDESTWZentraleinheitESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT, oldIDESTWZentraleinheit, null, oldIDESTWZentraleinheitESet));
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
	public ZN_ZBS_Allg_AttributeGroup getZNZBSAllg() {
		return zNZBSAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNZBSAllg(ZN_ZBS_Allg_AttributeGroup newZNZBSAllg, NotificationChain msgs) {
		ZN_ZBS_Allg_AttributeGroup oldZNZBSAllg = zNZBSAllg;
		zNZBSAllg = newZNZBSAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, oldZNZBSAllg, newZNZBSAllg);
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
	public void setZNZBSAllg(ZN_ZBS_Allg_AttributeGroup newZNZBSAllg) {
		if (newZNZBSAllg != zNZBSAllg) {
			NotificationChain msgs = null;
			if (zNZBSAllg != null)
				msgs = ((InternalEObject)zNZBSAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, null, msgs);
			if (newZNZBSAllg != null)
				msgs = ((InternalEObject)newZNZBSAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, null, msgs);
			msgs = basicSetZNZBSAllg(newZNZBSAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG, newZNZBSAllg, newZNZBSAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				return basicSetZNZBSAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				if (resolve) return getIDESTWZentraleinheit();
				return basicGetIDESTWZentraleinheit();
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				return getZNZBSAllg();
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				setIDESTWZentraleinheit((ESTW_Zentraleinheit)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				setZNZBSAllg((ZN_ZBS_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				unsetIDESTWZentraleinheit();
				return;
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				setZNZBSAllg((ZN_ZBS_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_ZBS__IDESTW_ZENTRALEINHEIT:
				return isSetIDESTWZentraleinheit();
			case ZugnummernmeldeanlagePackage.ZN_ZBS__ZNZBS_ALLG:
				return zNZBSAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_ZBSImpl
