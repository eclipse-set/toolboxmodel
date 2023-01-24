/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL DLP Fstr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_DLP_FstrImpl#getIDZLFstr <em>IDZL Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_DLP_FstrImpl extends Basis_ObjektImpl implements ZL_DLP_Fstr {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_DLP_FstrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_DLP_FSTR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, oldIDZLFstr, iDZLFstr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, oldIDZLFstr, iDZLFstr, !oldIDZLFstrESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR, oldIDZLFstr, null, oldIDZLFstrESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				if (resolve) return getIDZLFstr();
				return basicGetIDZLFstr();
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				setIDZLFstr((ZL_Fstr)newValue);
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				unsetIDZLFstr();
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
			case ZuglenkungPackage.ZL_DLP_FSTR__IDZL_FSTR:
				return isSetIDZLFstr();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_DLP_FstrImpl
