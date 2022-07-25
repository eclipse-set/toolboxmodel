/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Signale.Signal;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Signalgruppe_Zuordnung;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Signalgruppe Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Signalgruppe_ZuordnungImpl#getIDZLSignalgruppe <em>IDZL Signalgruppe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Signalgruppe_ZuordnungImpl extends Basis_ObjektImpl implements ZL_Signalgruppe_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignal;

	/**
	 * This is true if the ID Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalESet;

	/**
	 * The cached value of the '{@link #getIDZLSignalgruppe() <em>IDZL Signalgruppe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLSignalgruppe()
	 * @generated
	 * @ordered
	 */
	protected ZL_Signalgruppe iDZLSignalgruppe;

	/**
	 * This is true if the IDZL Signalgruppe reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLSignalgruppeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Signalgruppe_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_SIGNALGRUPPE_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignal() {
		if (iDSignal != null && iDSignal.eIsProxy()) {
			InternalEObject oldIDSignal = (InternalEObject)iDSignal;
			iDSignal = (Signal)eResolveProxy(oldIDSignal);
			if (iDSignal != oldIDSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, iDSignal));
			}
		}
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignal(Signal newIDSignal) {
		Signal oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignal() {
		Signal oldIDSignal = iDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignal = null;
		iDSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignal() {
		return iDSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Signalgruppe getIDZLSignalgruppe() {
		if (iDZLSignalgruppe != null && iDZLSignalgruppe.eIsProxy()) {
			InternalEObject oldIDZLSignalgruppe = (InternalEObject)iDZLSignalgruppe;
			iDZLSignalgruppe = (ZL_Signalgruppe)eResolveProxy(oldIDZLSignalgruppe);
			if (iDZLSignalgruppe != oldIDZLSignalgruppe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, oldIDZLSignalgruppe, iDZLSignalgruppe));
			}
		}
		return iDZLSignalgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_Signalgruppe basicGetIDZLSignalgruppe() {
		return iDZLSignalgruppe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLSignalgruppe(ZL_Signalgruppe newIDZLSignalgruppe) {
		ZL_Signalgruppe oldIDZLSignalgruppe = iDZLSignalgruppe;
		iDZLSignalgruppe = newIDZLSignalgruppe;
		boolean oldIDZLSignalgruppeESet = iDZLSignalgruppeESet;
		iDZLSignalgruppeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, oldIDZLSignalgruppe, iDZLSignalgruppe, !oldIDZLSignalgruppeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLSignalgruppe() {
		ZL_Signalgruppe oldIDZLSignalgruppe = iDZLSignalgruppe;
		boolean oldIDZLSignalgruppeESet = iDZLSignalgruppeESet;
		iDZLSignalgruppe = null;
		iDZLSignalgruppeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE, oldIDZLSignalgruppe, null, oldIDZLSignalgruppeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLSignalgruppe() {
		return iDZLSignalgruppeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				if (resolve) return getIDZLSignalgruppe();
				return basicGetIDZLSignalgruppe();
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				setIDZLSignalgruppe((ZL_Signalgruppe)newValue);
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				unsetIDSignal();
				return;
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				unsetIDZLSignalgruppe();
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
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL:
				return isSetIDSignal();
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE:
				return isSetIDZLSignalgruppe();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_Signalgruppe_ZuordnungImpl
