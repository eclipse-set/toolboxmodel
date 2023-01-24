/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;

import org.eclipse.set.toolboxmodel.Signale.Signal_Rahmen;
import org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff;
import org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Signalbegriff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_SignalbegriffImpl#getIDSignalRahmen <em>ID Signal Rahmen</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_SignalbegriffImpl#getSignalSignalbegriffAllg <em>Signal Signalbegriff Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_SignalbegriffImpl#getSignalbegriffID <em>Signalbegriff ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_SignalbegriffImpl extends Basis_ObjektImpl implements Signal_Signalbegriff {
	/**
	 * The cached value of the '{@link #getIDSignalRahmen() <em>ID Signal Rahmen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalRahmen()
	 * @generated
	 * @ordered
	 */
	protected Signal_Rahmen iDSignalRahmen;

	/**
	 * This is true if the ID Signal Rahmen reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalRahmenESet;

	/**
	 * The cached value of the '{@link #getSignalSignalbegriffAllg() <em>Signal Signalbegriff Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalSignalbegriffAllg()
	 * @generated
	 * @ordered
	 */
	protected Signal_Signalbegriff_Allg_AttributeGroup signalSignalbegriffAllg;

	/**
	 * The cached value of the '{@link #getSignalbegriffID() <em>Signalbegriff ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalbegriffID()
	 * @generated
	 * @ordered
	 */
	protected Signalbegriff_ID_TypeClass signalbegriffID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_SignalbegriffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_SIGNALBEGRIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Rahmen getIDSignalRahmen() {
		if (iDSignalRahmen != null && iDSignalRahmen.eIsProxy()) {
			InternalEObject oldIDSignalRahmen = (InternalEObject)iDSignalRahmen;
			iDSignalRahmen = (Signal_Rahmen)eResolveProxy(oldIDSignalRahmen);
			if (iDSignalRahmen != oldIDSignalRahmen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, oldIDSignalRahmen, iDSignalRahmen));
			}
		}
		return iDSignalRahmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal_Rahmen basicGetIDSignalRahmen() {
		return iDSignalRahmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignalRahmen(Signal_Rahmen newIDSignalRahmen) {
		Signal_Rahmen oldIDSignalRahmen = iDSignalRahmen;
		iDSignalRahmen = newIDSignalRahmen;
		boolean oldIDSignalRahmenESet = iDSignalRahmenESet;
		iDSignalRahmenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, oldIDSignalRahmen, iDSignalRahmen, !oldIDSignalRahmenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignalRahmen() {
		Signal_Rahmen oldIDSignalRahmen = iDSignalRahmen;
		boolean oldIDSignalRahmenESet = iDSignalRahmenESet;
		iDSignalRahmen = null;
		iDSignalRahmenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN, oldIDSignalRahmen, null, oldIDSignalRahmenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignalRahmen() {
		return iDSignalRahmenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Signalbegriff_Allg_AttributeGroup getSignalSignalbegriffAllg() {
		return signalSignalbegriffAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalSignalbegriffAllg(Signal_Signalbegriff_Allg_AttributeGroup newSignalSignalbegriffAllg, NotificationChain msgs) {
		Signal_Signalbegriff_Allg_AttributeGroup oldSignalSignalbegriffAllg = signalSignalbegriffAllg;
		signalSignalbegriffAllg = newSignalSignalbegriffAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, oldSignalSignalbegriffAllg, newSignalSignalbegriffAllg);
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
	public void setSignalSignalbegriffAllg(Signal_Signalbegriff_Allg_AttributeGroup newSignalSignalbegriffAllg) {
		if (newSignalSignalbegriffAllg != signalSignalbegriffAllg) {
			NotificationChain msgs = null;
			if (signalSignalbegriffAllg != null)
				msgs = ((InternalEObject)signalSignalbegriffAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, null, msgs);
			if (newSignalSignalbegriffAllg != null)
				msgs = ((InternalEObject)newSignalSignalbegriffAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, null, msgs);
			msgs = basicSetSignalSignalbegriffAllg(newSignalSignalbegriffAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG, newSignalSignalbegriffAllg, newSignalSignalbegriffAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalbegriff_ID_TypeClass getSignalbegriffID() {
		return signalbegriffID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalbegriffID(Signalbegriff_ID_TypeClass newSignalbegriffID, NotificationChain msgs) {
		Signalbegriff_ID_TypeClass oldSignalbegriffID = signalbegriffID;
		signalbegriffID = newSignalbegriffID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, oldSignalbegriffID, newSignalbegriffID);
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
	public void setSignalbegriffID(Signalbegriff_ID_TypeClass newSignalbegriffID) {
		if (newSignalbegriffID != signalbegriffID) {
			NotificationChain msgs = null;
			if (signalbegriffID != null)
				msgs = ((InternalEObject)signalbegriffID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, null, msgs);
			if (newSignalbegriffID != null)
				msgs = ((InternalEObject)newSignalbegriffID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, null, msgs);
			msgs = basicSetSignalbegriffID(newSignalbegriffID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID, newSignalbegriffID, newSignalbegriffID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				return basicSetSignalSignalbegriffAllg(null, msgs);
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				return basicSetSignalbegriffID(null, msgs);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				if (resolve) return getIDSignalRahmen();
				return basicGetIDSignalRahmen();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				return getSignalSignalbegriffAllg();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				return getSignalbegriffID();
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				setIDSignalRahmen((Signal_Rahmen)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				setSignalSignalbegriffAllg((Signal_Signalbegriff_Allg_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				setSignalbegriffID((Signalbegriff_ID_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				unsetIDSignalRahmen();
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				setSignalSignalbegriffAllg((Signal_Signalbegriff_Allg_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				setSignalbegriffID((Signalbegriff_ID_TypeClass)null);
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
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__ID_SIGNAL_RAHMEN:
				return isSetIDSignalRahmen();
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNAL_SIGNALBEGRIFF_ALLG:
				return signalSignalbegriffAllg != null;
			case SignalePackage.SIGNAL_SIGNALBEGRIFF__SIGNALBEGRIFF_ID:
				return signalbegriffID != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_SignalbegriffImpl
