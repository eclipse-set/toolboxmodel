/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Unterstation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDZNZBS <em>IDZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_UnterstationImpl extends Basis_ObjektImpl implements ZN_Unterstation {
	/**
	 * The cached value of the '{@link #getIDZNZBS() <em>IDZNZBS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNZBS()
	 * @generated
	 * @ordered
	 */
	protected ZN_ZBS iDZNZBS;

	/**
	 * This is true if the IDZNZBS reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNZBSESet;

	/**
	 * The cached value of the '{@link #getZNUnterstationAllg() <em>ZN Unterstation Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNUnterstationAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Unterstation_Allg_AttributeGroup zNUnterstationAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_UnterstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_UNTERSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_ZBS getIDZNZBS() {
		if (iDZNZBS != null && iDZNZBS.eIsProxy()) {
			InternalEObject oldIDZNZBS = (InternalEObject)iDZNZBS;
			iDZNZBS = (ZN_ZBS)eResolveProxy(oldIDZNZBS);
			if (iDZNZBS != oldIDZNZBS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, iDZNZBS));
			}
		}
		return iDZNZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_ZBS basicGetIDZNZBS() {
		return iDZNZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNZBS(ZN_ZBS newIDZNZBS) {
		ZN_ZBS oldIDZNZBS = iDZNZBS;
		iDZNZBS = newIDZNZBS;
		boolean oldIDZNZBSESet = iDZNZBSESet;
		iDZNZBSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, iDZNZBS, !oldIDZNZBSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNZBS() {
		ZN_ZBS oldIDZNZBS = iDZNZBS;
		boolean oldIDZNZBSESet = iDZNZBSESet;
		iDZNZBS = null;
		iDZNZBSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, null, oldIDZNZBSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNZBS() {
		return iDZNZBSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation_Allg_AttributeGroup getZNUnterstationAllg() {
		return zNUnterstationAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup newZNUnterstationAllg, NotificationChain msgs) {
		ZN_Unterstation_Allg_AttributeGroup oldZNUnterstationAllg = zNUnterstationAllg;
		zNUnterstationAllg = newZNUnterstationAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, oldZNUnterstationAllg, newZNUnterstationAllg);
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
	public void setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup newZNUnterstationAllg) {
		if (newZNUnterstationAllg != zNUnterstationAllg) {
			NotificationChain msgs = null;
			if (zNUnterstationAllg != null)
				msgs = ((InternalEObject)zNUnterstationAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, null, msgs);
			if (newZNUnterstationAllg != null)
				msgs = ((InternalEObject)newZNUnterstationAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, null, msgs);
			msgs = basicSetZNUnterstationAllg(newZNUnterstationAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, newZNUnterstationAllg, newZNUnterstationAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return basicSetZNUnterstationAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				if (resolve) return getIDZNZBS();
				return basicGetIDZNZBS();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return getZNUnterstationAllg();
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				setIDZNZBS((ZN_ZBS)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				setZNUnterstationAllg((ZN_Unterstation_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				unsetIDZNZBS();
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				setZNUnterstationAllg((ZN_Unterstation_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				return isSetIDZNZBS();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return zNUnterstationAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_UnterstationImpl
