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
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Bf_Nr_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.Prioritaet_TypeClass;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Unterstation Bf Nr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Unterstation_Bf_Nr_AttributeGroupImpl#getBfNr <em>Bf Nr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Unterstation_Bf_Nr_AttributeGroupImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_Unterstation_Bf_Nr_AttributeGroupImpl#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_Unterstation_Bf_Nr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZN_Unterstation_Bf_Nr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBfNr() <em>Bf Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBfNr()
	 * @generated
	 * @ordered
	 */
	protected Bf_Nr_TypeClass bfNr;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeit;

	/**
	 * This is true if the ID Oertlichkeit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitESet;

	/**
	 * The cached value of the '{@link #getPrioritaet() <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritaet()
	 * @generated
	 * @ordered
	 */
	protected Prioritaet_TypeClass prioritaet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_Unterstation_Bf_Nr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bf_Nr_TypeClass getBfNr() {
		return bfNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBfNr(Bf_Nr_TypeClass newBfNr, NotificationChain msgs) {
		Bf_Nr_TypeClass oldBfNr = bfNr;
		bfNr = newBfNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR, oldBfNr, newBfNr);
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
	public void setBfNr(Bf_Nr_TypeClass newBfNr) {
		if (newBfNr != bfNr) {
			NotificationChain msgs = null;
			if (bfNr != null)
				msgs = ((InternalEObject)bfNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR, null, msgs);
			if (newBfNr != null)
				msgs = ((InternalEObject)newBfNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR, null, msgs);
			msgs = basicSetBfNr(newBfNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR, newBfNr, newBfNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeit() {
		if (iDOertlichkeit != null && iDOertlichkeit.eIsProxy()) {
			InternalEObject oldIDOertlichkeit = (InternalEObject)iDOertlichkeit;
			iDOertlichkeit = (Oertlichkeit)eResolveProxy(oldIDOertlichkeit);
			if (iDOertlichkeit != oldIDOertlichkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit));
			}
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeit(Oertlichkeit newIDOertlichkeit) {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit, !oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeit() {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeit = null;
		iDOertlichkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT, oldIDOertlichkeit, null, oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeit() {
		return iDOertlichkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_TypeClass getPrioritaet() {
		return prioritaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritaet(Prioritaet_TypeClass newPrioritaet, NotificationChain msgs) {
		Prioritaet_TypeClass oldPrioritaet = prioritaet;
		prioritaet = newPrioritaet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET, oldPrioritaet, newPrioritaet);
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
	public void setPrioritaet(Prioritaet_TypeClass newPrioritaet) {
		if (newPrioritaet != prioritaet) {
			NotificationChain msgs = null;
			if (prioritaet != null)
				msgs = ((InternalEObject)prioritaet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			if (newPrioritaet != null)
				msgs = ((InternalEObject)newPrioritaet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			msgs = basicSetPrioritaet(newPrioritaet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET, newPrioritaet, newPrioritaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR:
				return basicSetBfNr(null, msgs);
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET:
				return basicSetPrioritaet(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR:
				return getBfNr();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT:
				if (resolve) return getIDOertlichkeit();
				return basicGetIDOertlichkeit();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET:
				return getPrioritaet();
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR:
				setBfNr((Bf_Nr_TypeClass)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT:
				setIDOertlichkeit((Oertlichkeit)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR:
				setBfNr((Bf_Nr_TypeClass)null);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT:
				unsetIDOertlichkeit();
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)null);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__BF_NR:
				return bfNr != null;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__ID_OERTLICHKEIT:
				return isSetIDOertlichkeit();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION_BF_NR_ATTRIBUTE_GROUP__PRIORITAET:
				return prioritaet != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_Unterstation_Bf_Nr_AttributeGroupImpl
