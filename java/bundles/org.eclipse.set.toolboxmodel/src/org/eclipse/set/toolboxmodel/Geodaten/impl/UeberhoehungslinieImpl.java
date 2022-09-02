/**
 */
package org.eclipse.set.toolboxmodel.Geodaten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage;
import org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehung;
import org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie;
import org.eclipse.set.toolboxmodel.Geodaten.Ueberhoehungslinie_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ueberhoehungslinie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.UeberhoehungslinieImpl#getIDUeberhoehungA <em>ID Ueberhoehung A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.UeberhoehungslinieImpl#getIDUeberhoehungB <em>ID Ueberhoehung B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.UeberhoehungslinieImpl#getUeberhoehungslinieAllg <em>Ueberhoehungslinie Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UeberhoehungslinieImpl extends Basis_ObjektImpl implements Ueberhoehungslinie {
	/**
	 * The cached value of the '{@link #getIDUeberhoehungA() <em>ID Ueberhoehung A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUeberhoehungA()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehung iDUeberhoehungA;

	/**
	 * This is true if the ID Ueberhoehung A reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUeberhoehungAESet;

	/**
	 * The cached value of the '{@link #getIDUeberhoehungB() <em>ID Ueberhoehung B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUeberhoehungB()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehung iDUeberhoehungB;

	/**
	 * This is true if the ID Ueberhoehung B reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUeberhoehungBESet;

	/**
	 * The cached value of the '{@link #getUeberhoehungslinieAllg() <em>Ueberhoehungslinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUeberhoehungslinieAllg()
	 * @generated
	 * @ordered
	 */
	protected Ueberhoehungslinie_Allg_AttributeGroup ueberhoehungslinieAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UeberhoehungslinieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.UEBERHOEHUNGSLINIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung getIDUeberhoehungA() {
		if (iDUeberhoehungA != null && iDUeberhoehungA.eIsProxy()) {
			InternalEObject oldIDUeberhoehungA = (InternalEObject)iDUeberhoehungA;
			iDUeberhoehungA = (Ueberhoehung)eResolveProxy(oldIDUeberhoehungA);
			if (iDUeberhoehungA != oldIDUeberhoehungA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, oldIDUeberhoehungA, iDUeberhoehungA));
			}
		}
		return iDUeberhoehungA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ueberhoehung basicGetIDUeberhoehungA() {
		return iDUeberhoehungA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUeberhoehungA(Ueberhoehung newIDUeberhoehungA) {
		Ueberhoehung oldIDUeberhoehungA = iDUeberhoehungA;
		iDUeberhoehungA = newIDUeberhoehungA;
		boolean oldIDUeberhoehungAESet = iDUeberhoehungAESet;
		iDUeberhoehungAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, oldIDUeberhoehungA, iDUeberhoehungA, !oldIDUeberhoehungAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUeberhoehungA() {
		Ueberhoehung oldIDUeberhoehungA = iDUeberhoehungA;
		boolean oldIDUeberhoehungAESet = iDUeberhoehungAESet;
		iDUeberhoehungA = null;
		iDUeberhoehungAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A, oldIDUeberhoehungA, null, oldIDUeberhoehungAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUeberhoehungA() {
		return iDUeberhoehungAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehung getIDUeberhoehungB() {
		if (iDUeberhoehungB != null && iDUeberhoehungB.eIsProxy()) {
			InternalEObject oldIDUeberhoehungB = (InternalEObject)iDUeberhoehungB;
			iDUeberhoehungB = (Ueberhoehung)eResolveProxy(oldIDUeberhoehungB);
			if (iDUeberhoehungB != oldIDUeberhoehungB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, oldIDUeberhoehungB, iDUeberhoehungB));
			}
		}
		return iDUeberhoehungB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ueberhoehung basicGetIDUeberhoehungB() {
		return iDUeberhoehungB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUeberhoehungB(Ueberhoehung newIDUeberhoehungB) {
		Ueberhoehung oldIDUeberhoehungB = iDUeberhoehungB;
		iDUeberhoehungB = newIDUeberhoehungB;
		boolean oldIDUeberhoehungBESet = iDUeberhoehungBESet;
		iDUeberhoehungBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, oldIDUeberhoehungB, iDUeberhoehungB, !oldIDUeberhoehungBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUeberhoehungB() {
		Ueberhoehung oldIDUeberhoehungB = iDUeberhoehungB;
		boolean oldIDUeberhoehungBESet = iDUeberhoehungBESet;
		iDUeberhoehungB = null;
		iDUeberhoehungBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B, oldIDUeberhoehungB, null, oldIDUeberhoehungBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUeberhoehungB() {
		return iDUeberhoehungBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ueberhoehungslinie_Allg_AttributeGroup getUeberhoehungslinieAllg() {
		return ueberhoehungslinieAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup newUeberhoehungslinieAllg, NotificationChain msgs) {
		Ueberhoehungslinie_Allg_AttributeGroup oldUeberhoehungslinieAllg = ueberhoehungslinieAllg;
		ueberhoehungslinieAllg = newUeberhoehungslinieAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, oldUeberhoehungslinieAllg, newUeberhoehungslinieAllg);
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
	public void setUeberhoehungslinieAllg(Ueberhoehungslinie_Allg_AttributeGroup newUeberhoehungslinieAllg) {
		if (newUeberhoehungslinieAllg != ueberhoehungslinieAllg) {
			NotificationChain msgs = null;
			if (ueberhoehungslinieAllg != null)
				msgs = ((InternalEObject)ueberhoehungslinieAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, null, msgs);
			if (newUeberhoehungslinieAllg != null)
				msgs = ((InternalEObject)newUeberhoehungslinieAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, null, msgs);
			msgs = basicSetUeberhoehungslinieAllg(newUeberhoehungslinieAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG, newUeberhoehungslinieAllg, newUeberhoehungslinieAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				return basicSetUeberhoehungslinieAllg(null, msgs);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				if (resolve) return getIDUeberhoehungA();
				return basicGetIDUeberhoehungA();
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				if (resolve) return getIDUeberhoehungB();
				return basicGetIDUeberhoehungB();
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				return getUeberhoehungslinieAllg();
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				setIDUeberhoehungA((Ueberhoehung)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				setIDUeberhoehungB((Ueberhoehung)newValue);
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				setUeberhoehungslinieAllg((Ueberhoehungslinie_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				unsetIDUeberhoehungA();
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				unsetIDUeberhoehungB();
				return;
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				setUeberhoehungslinieAllg((Ueberhoehungslinie_Allg_AttributeGroup)null);
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
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_A:
				return isSetIDUeberhoehungA();
			case GeodatenPackage.UEBERHOEHUNGSLINIE__ID_UEBERHOEHUNG_B:
				return isSetIDUeberhoehungB();
			case GeodatenPackage.UEBERHOEHUNGSLINIE__UEBERHOEHUNGSLINIE_ALLG:
				return ueberhoehungslinieAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //UeberhoehungslinieImpl
