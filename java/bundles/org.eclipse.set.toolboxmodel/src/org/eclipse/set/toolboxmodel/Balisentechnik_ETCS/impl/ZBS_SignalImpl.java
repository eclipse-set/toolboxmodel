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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Signal;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZBS Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZBS_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZBS_SignalImpl#getZBSSignalSignalabstand <em>ZBS Signal Signalabstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZBS_SignalImpl extends Basis_ObjektImpl implements ZBS_Signal {
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
	 * The cached value of the '{@link #getZBSSignalSignalabstand() <em>ZBS Signal Signalabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZBSSignalSignalabstand()
	 * @generated
	 * @ordered
	 */
	protected ZBS_Signal_Signalabstand_AttributeGroup zBSSignalSignalabstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZBS_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZBS_Signal();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, oldIDSignal, iDSignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
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
	public ZBS_Signal_Signalabstand_AttributeGroup getZBSSignalSignalabstand() {
		return zBSSignalSignalabstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZBSSignalSignalabstand(ZBS_Signal_Signalabstand_AttributeGroup newZBSSignalSignalabstand, NotificationChain msgs) {
		ZBS_Signal_Signalabstand_AttributeGroup oldZBSSignalSignalabstand = zBSSignalSignalabstand;
		zBSSignalSignalabstand = newZBSSignalSignalabstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, oldZBSSignalSignalabstand, newZBSSignalSignalabstand);
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
	public void setZBSSignalSignalabstand(ZBS_Signal_Signalabstand_AttributeGroup newZBSSignalSignalabstand) {
		if (newZBSSignalSignalabstand != zBSSignalSignalabstand) {
			NotificationChain msgs = null;
			if (zBSSignalSignalabstand != null)
				msgs = ((InternalEObject)zBSSignalSignalabstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, null, msgs);
			if (newZBSSignalSignalabstand != null)
				msgs = ((InternalEObject)newZBSSignalSignalabstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, null, msgs);
			msgs = basicSetZBSSignalSignalabstand(newZBSSignalSignalabstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND, newZBSSignalSignalabstand, newZBSSignalSignalabstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				return basicSetZBSSignalSignalabstand(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				return getZBSSignalSignalabstand();
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				setZBSSignalSignalabstand((ZBS_Signal_Signalabstand_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				unsetIDSignal();
				return;
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				setZBSSignalSignalabstand((ZBS_Signal_Signalabstand_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ID_SIGNAL:
				return isSetIDSignal();
			case Balisentechnik_ETCSPackage.ZBS_SIGNAL__ZBS_SIGNAL_SIGNALABSTAND:
				return zBSSignalSignalabstand != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZBS_SignalImpl
