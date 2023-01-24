/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Schutzstrecke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZBS_SchutzstreckeImpl#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZBS_SchutzstreckeImpl#getZBSSchutzstreckeAllg <em>ZBS Schutzstrecke Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_SchutzstreckeImpl extends Basis_ObjektImpl implements ZBS_Schutzstrecke {
	/**
	 * The cached value of the '{@link #getIDFstrDWeg() <em>ID Fstr DWeg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrDWeg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_DWeg iDFstrDWeg;

	/**
	 * This is true if the ID Fstr DWeg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrDWegESet;

	/**
	 * The cached value of the '{@link #getZBSSchutzstreckeAllg() <em>ZBS Schutzstrecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSchutzstreckeAllg()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Schutzstrecke_Allg_AttributeGroup zBSSchutzstreckeAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_SchutzstreckeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Schutzstrecke();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_DWeg getIDFstrDWeg() {
		if (iDFstrDWeg != null && iDFstrDWeg.eIsProxy()) {
			InternalEObject oldIDFstrDWeg = (InternalEObject)iDFstrDWeg;
			iDFstrDWeg = (Fstr_DWeg)eResolveProxy(oldIDFstrDWeg);
			if (iDFstrDWeg != oldIDFstrDWeg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, oldIDFstrDWeg, iDFstrDWeg));
			}
		}
		return iDFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_DWeg basicGetIDFstrDWeg() {
		return iDFstrDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrDWeg(Fstr_DWeg newIDFstrDWeg) {
		Fstr_DWeg oldIDFstrDWeg = iDFstrDWeg;
		iDFstrDWeg = newIDFstrDWeg;
		boolean oldIDFstrDWegESet = iDFstrDWegESet;
		iDFstrDWegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, oldIDFstrDWeg, iDFstrDWeg, !oldIDFstrDWegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrDWeg() {
		Fstr_DWeg oldIDFstrDWeg = iDFstrDWeg;
		boolean oldIDFstrDWegESet = iDFstrDWegESet;
		iDFstrDWeg = null;
		iDFstrDWegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG, oldIDFstrDWeg, null, oldIDFstrDWegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrDWeg() {
		return iDFstrDWegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZBS_Schutzstrecke_Allg_AttributeGroup getZBSSchutzstreckeAllg() {
		return zBSSchutzstreckeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup newZBSSchutzstreckeAllg, NotificationChain msgs) {
		ZBS_Schutzstrecke_Allg_AttributeGroup oldZBSSchutzstreckeAllg = zBSSchutzstreckeAllg;
		zBSSchutzstreckeAllg = newZBSSchutzstreckeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, oldZBSSchutzstreckeAllg, newZBSSchutzstreckeAllg);
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
	public void setZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup newZBSSchutzstreckeAllg) {
		if (newZBSSchutzstreckeAllg != zBSSchutzstreckeAllg) {
			NotificationChain msgs = null;
			if (zBSSchutzstreckeAllg != null)
				msgs = ((InternalEObject)zBSSchutzstreckeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, null, msgs);
			if (newZBSSchutzstreckeAllg != null)
				msgs = ((InternalEObject)newZBSSchutzstreckeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, null, msgs);
			msgs = basicSetZBSSchutzstreckeAllg(newZBSSchutzstreckeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG, newZBSSchutzstreckeAllg, newZBSSchutzstreckeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				return basicSetZBSSchutzstreckeAllg(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				if (resolve) return getIDFstrDWeg();
				return basicGetIDFstrDWeg();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				return getZBSSchutzstreckeAllg();
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				setIDFstrDWeg((Fstr_DWeg)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				setZBSSchutzstreckeAllg((ZBS_Schutzstrecke_Allg_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				unsetIDFstrDWeg();
				return;
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				setZBSSchutzstreckeAllg((ZBS_Schutzstrecke_Allg_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ID_FSTR_DWEG:
				return isSetIDFstrDWeg();
			case Balisentechnik_ETCSPackage.ZBS_SCHUTZSTRECKE__ZBS_SCHUTZSTRECKE_ALLG:
				return zBSSchutzstreckeAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZBS_SchutzstreckeImpl
