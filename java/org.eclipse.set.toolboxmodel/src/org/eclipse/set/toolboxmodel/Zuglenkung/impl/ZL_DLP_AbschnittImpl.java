/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt;

import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL DLP Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_DLP_AbschnittImpl extends Basis_ObjektImpl implements ZL_DLP_Abschnitt {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected EList<Gleis_Abschnitt> iDGleisAbschnitt;

	/**
	 * The cached value of the '{@link #getIDZLDLPFstr() <em>IDZLDLP Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLDLPFstr()
	 * @generated
	 * @ordered
	 */
	protected ZL_DLP_Fstr iDZLDLPFstr;

	/**
	 * This is true if the IDZLDLP Fstr reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLDLPFstrESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_DLP_AbschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_DLP_ABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gleis_Abschnitt> getIDGleisAbschnitt() {
		if (iDGleisAbschnitt == null) {
			iDGleisAbschnitt = new EObjectResolvingEList<Gleis_Abschnitt>(Gleis_Abschnitt.class, this, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT);
		}
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_DLP_Fstr getIDZLDLPFstr() {
		if (iDZLDLPFstr != null && iDZLDLPFstr.eIsProxy()) {
			InternalEObject oldIDZLDLPFstr = (InternalEObject)iDZLDLPFstr;
			iDZLDLPFstr = (ZL_DLP_Fstr)eResolveProxy(oldIDZLDLPFstr);
			if (iDZLDLPFstr != oldIDZLDLPFstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, iDZLDLPFstr));
			}
		}
		return iDZLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_DLP_Fstr basicGetIDZLDLPFstr() {
		return iDZLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLDLPFstr(ZL_DLP_Fstr newIDZLDLPFstr) {
		ZL_DLP_Fstr oldIDZLDLPFstr = iDZLDLPFstr;
		iDZLDLPFstr = newIDZLDLPFstr;
		boolean oldIDZLDLPFstrESet = iDZLDLPFstrESet;
		iDZLDLPFstrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, iDZLDLPFstr, !oldIDZLDLPFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLDLPFstr() {
		ZL_DLP_Fstr oldIDZLDLPFstr = iDZLDLPFstr;
		boolean oldIDZLDLPFstrESet = iDZLDLPFstrESet;
		iDZLDLPFstr = null;
		iDZLDLPFstrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, null, oldIDZLDLPFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLDLPFstr() {
		return iDZLDLPFstrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return getIDGleisAbschnitt();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				if (resolve) return getIDZLDLPFstr();
				return basicGetIDZLDLPFstr();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				getIDGleisAbschnitt().clear();
				getIDGleisAbschnitt().addAll((Collection<? extends Gleis_Abschnitt>)newValue);
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				setIDZLDLPFstr((ZL_DLP_Fstr)newValue);
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				getIDGleisAbschnitt().clear();
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				unsetIDZLDLPFstr();
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return iDGleisAbschnitt != null && !iDGleisAbschnitt.isEmpty();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return isSetIDZLDLPFstr();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_DLP_AbschnittImpl
