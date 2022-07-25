/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_FstrImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_FstrImpl#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_FstrImpl#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_FstrImpl#getZLFstrAllg <em>ZL Fstr Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_FstrImpl extends Basis_ObjektImpl implements ZL_Fstr {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrZugRangier;

	/**
	 * This is true if the ID Fstr Zug Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrZugRangierESet;

	/**
	 * The cached value of the '{@link #getIDZL() <em>IDZL</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZL()
	 * @generated
	 * @ordered
	 */
	protected ZL iDZL;

	/**
	 * This is true if the IDZL reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLESet;

	/**
	 * The cached value of the '{@link #getIDZLFstr() <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLFstr()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr iDZLFstr;

	/**
	 * This is true if the IDZL Fstr reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLFstrESet;

	/**
	 * The cached value of the '{@link #getZLFstrAllg() <em>ZL Fstr Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr_Allg_AttributeGroup zLFstrAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_FstrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrZugRangier() {
		if (iDFstrZugRangier != null && iDFstrZugRangier.eIsProxy()) {
			InternalEObject oldIDFstrZugRangier = (InternalEObject)iDFstrZugRangier;
			iDFstrZugRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrZugRangier);
			if (iDFstrZugRangier != oldIDFstrZugRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
			}
		}
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrZugRangier(Fstr_Zug_Rangier newIDFstrZugRangier) {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrZugRangier() {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangier = null;
		iDFstrZugRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrZugRangier() {
		return iDFstrZugRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL getIDZL() {
		if (iDZL != null && iDZL.eIsProxy()) {
			InternalEObject oldIDZL = (InternalEObject)iDZL;
			iDZL = (ZL)eResolveProxy(oldIDZL);
			if (iDZL != oldIDZL) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR__IDZL, oldIDZL, iDZL));
			}
		}
		return iDZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL basicGetIDZL() {
		return iDZL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZL(ZL newIDZL) {
		ZL oldIDZL = iDZL;
		iDZL = newIDZL;
		boolean oldIDZLESet = iDZLESet;
		iDZLESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__IDZL, oldIDZL, iDZL, !oldIDZLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZL() {
		ZL oldIDZL = iDZL;
		boolean oldIDZLESet = iDZLESet;
		iDZL = null;
		iDZLESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR__IDZL, oldIDZL, null, oldIDZLESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZL() {
		return iDZLESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr getIDZLFstr() {
		if (iDZLFstr != null && iDZLFstr.eIsProxy()) {
			InternalEObject oldIDZLFstr = (InternalEObject)iDZLFstr;
			iDZLFstr = (ZL_Fstr)eResolveProxy(oldIDZLFstr);
			if (iDZLFstr != oldIDZLFstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, oldIDZLFstr, iDZLFstr));
			}
		}
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_Fstr basicGetIDZLFstr() {
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLFstr(ZL_Fstr newIDZLFstr) {
		ZL_Fstr oldIDZLFstr = iDZLFstr;
		iDZLFstr = newIDZLFstr;
		boolean oldIDZLFstrESet = iDZLFstrESet;
		iDZLFstrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, oldIDZLFstr, iDZLFstr, !oldIDZLFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLFstr() {
		ZL_Fstr oldIDZLFstr = iDZLFstr;
		boolean oldIDZLFstrESet = iDZLFstrESet;
		iDZLFstr = null;
		iDZLFstrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR__IDZL_FSTR, oldIDZLFstr, null, oldIDZLFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLFstr() {
		return iDZLFstrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Allg_AttributeGroup getZLFstrAllg() {
		return zLFstrAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLFstrAllg(ZL_Fstr_Allg_AttributeGroup newZLFstrAllg, NotificationChain msgs) {
		ZL_Fstr_Allg_AttributeGroup oldZLFstrAllg = zLFstrAllg;
		zLFstrAllg = newZLFstrAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, oldZLFstrAllg, newZLFstrAllg);
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
	public void setZLFstrAllg(ZL_Fstr_Allg_AttributeGroup newZLFstrAllg) {
		if (newZLFstrAllg != zLFstrAllg) {
			NotificationChain msgs = null;
			if (zLFstrAllg != null)
				msgs = ((InternalEObject)zLFstrAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, null, msgs);
			if (newZLFstrAllg != null)
				msgs = ((InternalEObject)newZLFstrAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, null, msgs);
			msgs = basicSetZLFstrAllg(newZLFstrAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG, newZLFstrAllg, newZLFstrAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				return basicSetZLFstrAllg(null, msgs);
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				if (resolve) return getIDFstrZugRangier();
				return basicGetIDFstrZugRangier();
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				if (resolve) return getIDZL();
				return basicGetIDZL();
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				if (resolve) return getIDZLFstr();
				return basicGetIDZLFstr();
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				return getZLFstrAllg();
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((Fstr_Zug_Rangier)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				setIDZL((ZL)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				setIDZLFstr((ZL_Fstr)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				setZLFstrAllg((ZL_Fstr_Allg_AttributeGroup)newValue);
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				unsetIDFstrZugRangier();
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				unsetIDZL();
				return;
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				unsetIDZLFstr();
				return;
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				setZLFstrAllg((ZL_Fstr_Allg_AttributeGroup)null);
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
			case ZuglenkungPackage.ZL_FSTR__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			case ZuglenkungPackage.ZL_FSTR__IDZL:
				return isSetIDZL();
			case ZuglenkungPackage.ZL_FSTR__IDZL_FSTR:
				return isSetIDZLFstr();
			case ZuglenkungPackage.ZL_FSTR__ZL_FSTR_ALLG:
				return zLFstrAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_FstrImpl
