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
import org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie;
import org.eclipse.set.toolboxmodel.Geodaten.Hoehenlinie_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.Hoehenpunkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hoehenlinie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.HoehenlinieImpl#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.HoehenlinieImpl#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.HoehenlinieImpl#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HoehenlinieImpl extends Basis_ObjektImpl implements Hoehenlinie {
	/**
	 * The cached value of the '{@link #getHoehenlinieAllg() <em>Hoehenlinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoehenlinieAllg()
	 * @generated
	 * @ordered
	 */
	protected Hoehenlinie_Allg_AttributeGroup hoehenlinieAllg;

	/**
	 * The cached value of the '{@link #getIDHoehenpunktA() <em>ID Hoehenpunkt A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHoehenpunktA()
	 * @generated
	 * @ordered
	 */
	protected Hoehenpunkt iDHoehenpunktA;

	/**
	 * This is true if the ID Hoehenpunkt A reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDHoehenpunktAESet;

	/**
	 * The cached value of the '{@link #getIDHoehenpunktB() <em>ID Hoehenpunkt B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHoehenpunktB()
	 * @generated
	 * @ordered
	 */
	protected Hoehenpunkt iDHoehenpunktB;

	/**
	 * This is true if the ID Hoehenpunkt B reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDHoehenpunktBESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HoehenlinieImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.HOEHENLINIE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenlinie_Allg_AttributeGroup getHoehenlinieAllg() {
		return hoehenlinieAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup newHoehenlinieAllg, NotificationChain msgs) {
		Hoehenlinie_Allg_AttributeGroup oldHoehenlinieAllg = hoehenlinieAllg;
		hoehenlinieAllg = newHoehenlinieAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, oldHoehenlinieAllg, newHoehenlinieAllg);
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
	public void setHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup newHoehenlinieAllg) {
		if (newHoehenlinieAllg != hoehenlinieAllg) {
			NotificationChain msgs = null;
			if (hoehenlinieAllg != null)
				msgs = ((InternalEObject)hoehenlinieAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, null, msgs);
			if (newHoehenlinieAllg != null)
				msgs = ((InternalEObject)newHoehenlinieAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, null, msgs);
			msgs = basicSetHoehenlinieAllg(newHoehenlinieAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG, newHoehenlinieAllg, newHoehenlinieAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt getIDHoehenpunktA() {
		if (iDHoehenpunktA != null && iDHoehenpunktA.eIsProxy()) {
			InternalEObject oldIDHoehenpunktA = (InternalEObject)iDHoehenpunktA;
			iDHoehenpunktA = (Hoehenpunkt)eResolveProxy(oldIDHoehenpunktA);
			if (iDHoehenpunktA != oldIDHoehenpunktA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, oldIDHoehenpunktA, iDHoehenpunktA));
			}
		}
		return iDHoehenpunktA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hoehenpunkt basicGetIDHoehenpunktA() {
		return iDHoehenpunktA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDHoehenpunktA(Hoehenpunkt newIDHoehenpunktA) {
		Hoehenpunkt oldIDHoehenpunktA = iDHoehenpunktA;
		iDHoehenpunktA = newIDHoehenpunktA;
		boolean oldIDHoehenpunktAESet = iDHoehenpunktAESet;
		iDHoehenpunktAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, oldIDHoehenpunktA, iDHoehenpunktA, !oldIDHoehenpunktAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDHoehenpunktA() {
		Hoehenpunkt oldIDHoehenpunktA = iDHoehenpunktA;
		boolean oldIDHoehenpunktAESet = iDHoehenpunktAESet;
		iDHoehenpunktA = null;
		iDHoehenpunktAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A, oldIDHoehenpunktA, null, oldIDHoehenpunktAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDHoehenpunktA() {
		return iDHoehenpunktAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hoehenpunkt getIDHoehenpunktB() {
		if (iDHoehenpunktB != null && iDHoehenpunktB.eIsProxy()) {
			InternalEObject oldIDHoehenpunktB = (InternalEObject)iDHoehenpunktB;
			iDHoehenpunktB = (Hoehenpunkt)eResolveProxy(oldIDHoehenpunktB);
			if (iDHoehenpunktB != oldIDHoehenpunktB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, oldIDHoehenpunktB, iDHoehenpunktB));
			}
		}
		return iDHoehenpunktB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hoehenpunkt basicGetIDHoehenpunktB() {
		return iDHoehenpunktB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDHoehenpunktB(Hoehenpunkt newIDHoehenpunktB) {
		Hoehenpunkt oldIDHoehenpunktB = iDHoehenpunktB;
		iDHoehenpunktB = newIDHoehenpunktB;
		boolean oldIDHoehenpunktBESet = iDHoehenpunktBESet;
		iDHoehenpunktBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, oldIDHoehenpunktB, iDHoehenpunktB, !oldIDHoehenpunktBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDHoehenpunktB() {
		Hoehenpunkt oldIDHoehenpunktB = iDHoehenpunktB;
		boolean oldIDHoehenpunktBESet = iDHoehenpunktBESet;
		iDHoehenpunktB = null;
		iDHoehenpunktBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B, oldIDHoehenpunktB, null, oldIDHoehenpunktBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDHoehenpunktB() {
		return iDHoehenpunktBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				return basicSetHoehenlinieAllg(null, msgs);
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				return getHoehenlinieAllg();
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				if (resolve) return getIDHoehenpunktA();
				return basicGetIDHoehenpunktA();
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				if (resolve) return getIDHoehenpunktB();
				return basicGetIDHoehenpunktB();
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				setHoehenlinieAllg((Hoehenlinie_Allg_AttributeGroup)newValue);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				setIDHoehenpunktA((Hoehenpunkt)newValue);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				setIDHoehenpunktB((Hoehenpunkt)newValue);
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				setHoehenlinieAllg((Hoehenlinie_Allg_AttributeGroup)null);
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				unsetIDHoehenpunktA();
				return;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				unsetIDHoehenpunktB();
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
			case GeodatenPackage.HOEHENLINIE__HOEHENLINIE_ALLG:
				return hoehenlinieAllg != null;
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_A:
				return isSetIDHoehenpunktA();
			case GeodatenPackage.HOEHENLINIE__ID_HOEHENPUNKT_B:
				return isSetIDHoehenpunktB();
			default:
				return super.eIsSet(featureID);
		}
	}

} //HoehenlinieImpl
