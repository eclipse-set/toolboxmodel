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
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TOP Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.TOP_KanteImpl#getIDTOPKnotenA <em>IDTOP Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.TOP_KanteImpl#getIDTOPKnotenB <em>IDTOP Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Geodaten.impl.TOP_KanteImpl#getTOPKanteAllg <em>TOP Kante Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TOP_KanteImpl extends Basis_ObjektImpl implements TOP_Kante {
	/**
	 * The cached value of the '{@link #getIDTOPKnotenA() <em>IDTOP Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKnotenA()
	 * @generated
	 * @ordered
	 */
	protected TOP_Knoten iDTOPKnotenA;

	/**
	 * This is true if the IDTOP Knoten A reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDTOPKnotenAESet;

	/**
	 * The cached value of the '{@link #getIDTOPKnotenB() <em>IDTOP Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKnotenB()
	 * @generated
	 * @ordered
	 */
	protected TOP_Knoten iDTOPKnotenB;

	/**
	 * This is true if the IDTOP Knoten B reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDTOPKnotenBESet;

	/**
	 * The cached value of the '{@link #getTOPKanteAllg() <em>TOP Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOPKanteAllg()
	 * @generated
	 * @ordered
	 */
	protected TOP_Kante_Allg_AttributeGroup tOPKanteAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TOP_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeodatenPackage.Literals.TOP_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Knoten getIDTOPKnotenA() {
		if (iDTOPKnotenA != null && iDTOPKnotenA.eIsProxy()) {
			InternalEObject oldIDTOPKnotenA = (InternalEObject)iDTOPKnotenA;
			iDTOPKnotenA = (TOP_Knoten)eResolveProxy(oldIDTOPKnotenA);
			if (iDTOPKnotenA != oldIDTOPKnotenA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, oldIDTOPKnotenA, iDTOPKnotenA));
			}
		}
		return iDTOPKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP_Knoten basicGetIDTOPKnotenA() {
		return iDTOPKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDTOPKnotenA(TOP_Knoten newIDTOPKnotenA) {
		TOP_Knoten oldIDTOPKnotenA = iDTOPKnotenA;
		iDTOPKnotenA = newIDTOPKnotenA;
		boolean oldIDTOPKnotenAESet = iDTOPKnotenAESet;
		iDTOPKnotenAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, oldIDTOPKnotenA, iDTOPKnotenA, !oldIDTOPKnotenAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDTOPKnotenA() {
		TOP_Knoten oldIDTOPKnotenA = iDTOPKnotenA;
		boolean oldIDTOPKnotenAESet = iDTOPKnotenAESet;
		iDTOPKnotenA = null;
		iDTOPKnotenAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A, oldIDTOPKnotenA, null, oldIDTOPKnotenAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDTOPKnotenA() {
		return iDTOPKnotenAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Knoten getIDTOPKnotenB() {
		if (iDTOPKnotenB != null && iDTOPKnotenB.eIsProxy()) {
			InternalEObject oldIDTOPKnotenB = (InternalEObject)iDTOPKnotenB;
			iDTOPKnotenB = (TOP_Knoten)eResolveProxy(oldIDTOPKnotenB);
			if (iDTOPKnotenB != oldIDTOPKnotenB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, oldIDTOPKnotenB, iDTOPKnotenB));
			}
		}
		return iDTOPKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP_Knoten basicGetIDTOPKnotenB() {
		return iDTOPKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDTOPKnotenB(TOP_Knoten newIDTOPKnotenB) {
		TOP_Knoten oldIDTOPKnotenB = iDTOPKnotenB;
		iDTOPKnotenB = newIDTOPKnotenB;
		boolean oldIDTOPKnotenBESet = iDTOPKnotenBESet;
		iDTOPKnotenBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, oldIDTOPKnotenB, iDTOPKnotenB, !oldIDTOPKnotenBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDTOPKnotenB() {
		TOP_Knoten oldIDTOPKnotenB = iDTOPKnotenB;
		boolean oldIDTOPKnotenBESet = iDTOPKnotenBESet;
		iDTOPKnotenB = null;
		iDTOPKnotenBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B, oldIDTOPKnotenB, null, oldIDTOPKnotenBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDTOPKnotenB() {
		return iDTOPKnotenBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Kante_Allg_AttributeGroup getTOPKanteAllg() {
		return tOPKanteAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOPKanteAllg(TOP_Kante_Allg_AttributeGroup newTOPKanteAllg, NotificationChain msgs) {
		TOP_Kante_Allg_AttributeGroup oldTOPKanteAllg = tOPKanteAllg;
		tOPKanteAllg = newTOPKanteAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, oldTOPKanteAllg, newTOPKanteAllg);
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
	public void setTOPKanteAllg(TOP_Kante_Allg_AttributeGroup newTOPKanteAllg) {
		if (newTOPKanteAllg != tOPKanteAllg) {
			NotificationChain msgs = null;
			if (tOPKanteAllg != null)
				msgs = ((InternalEObject)tOPKanteAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, null, msgs);
			if (newTOPKanteAllg != null)
				msgs = ((InternalEObject)newTOPKanteAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, null, msgs);
			msgs = basicSetTOPKanteAllg(newTOPKanteAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG, newTOPKanteAllg, newTOPKanteAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				return basicSetTOPKanteAllg(null, msgs);
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
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				if (resolve) return getIDTOPKnotenA();
				return basicGetIDTOPKnotenA();
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				if (resolve) return getIDTOPKnotenB();
				return basicGetIDTOPKnotenB();
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				return getTOPKanteAllg();
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
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				setIDTOPKnotenA((TOP_Knoten)newValue);
				return;
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				setIDTOPKnotenB((TOP_Knoten)newValue);
				return;
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				setTOPKanteAllg((TOP_Kante_Allg_AttributeGroup)newValue);
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
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				unsetIDTOPKnotenA();
				return;
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				unsetIDTOPKnotenB();
				return;
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				setTOPKanteAllg((TOP_Kante_Allg_AttributeGroup)null);
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
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_A:
				return isSetIDTOPKnotenA();
			case GeodatenPackage.TOP_KANTE__IDTOP_KNOTEN_B:
				return isSetIDTOPKnotenB();
			case GeodatenPackage.TOP_KANTE__TOP_KANTE_ALLG:
				return tOPKanteAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //TOP_KanteImpl
