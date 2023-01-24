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

import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;

import org.eclipse.set.toolboxmodel.Signale.Rahmen_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Rahmen_Hoehe_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Signal;
import org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung;
import org.eclipse.set.toolboxmodel.Signale.Signal_Rahmen;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Rahmen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_RahmenImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_RahmenImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_RahmenImpl#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_RahmenImpl#getIDSignalNachordnung <em>ID Signal Nachordnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_RahmenImpl#getRahmenArt <em>Rahmen Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_RahmenImpl#getRahmenHoehe <em>Rahmen Hoehe</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_RahmenImpl extends Basis_ObjektImpl implements Signal_Rahmen {
	/**
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected Regelzeichnung iDRegelzeichnung;

	/**
	 * This is true if the ID Regelzeichnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRegelzeichnungESet;

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
	 * The cached value of the '{@link #getIDSignalBefestigung() <em>ID Signal Befestigung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalBefestigung()
	 * @generated
	 * @ordered
	 */
	protected Signal_Befestigung iDSignalBefestigung;

	/**
	 * This is true if the ID Signal Befestigung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalBefestigungESet;

	/**
	 * The cached value of the '{@link #getIDSignalNachordnung() <em>ID Signal Nachordnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalNachordnung()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignalNachordnung;

	/**
	 * This is true if the ID Signal Nachordnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalNachordnungESet;

	/**
	 * The cached value of the '{@link #getRahmenArt() <em>Rahmen Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRahmenArt()
	 * @generated
	 * @ordered
	 */
	protected Rahmen_Art_TypeClass rahmenArt;

	/**
	 * The cached value of the '{@link #getRahmenHoehe() <em>Rahmen Hoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRahmenHoehe()
	 * @generated
	 * @ordered
	 */
	protected Rahmen_Hoehe_TypeClass rahmenHoehe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_RahmenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_RAHMEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung getIDRegelzeichnung() {
		if (iDRegelzeichnung != null && iDRegelzeichnung.eIsProxy()) {
			InternalEObject oldIDRegelzeichnung = (InternalEObject)iDRegelzeichnung;
			iDRegelzeichnung = (Regelzeichnung)eResolveProxy(oldIDRegelzeichnung);
			if (iDRegelzeichnung != oldIDRegelzeichnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG, oldIDRegelzeichnung, iDRegelzeichnung));
			}
		}
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regelzeichnung basicGetIDRegelzeichnung() {
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRegelzeichnung(Regelzeichnung newIDRegelzeichnung) {
		Regelzeichnung oldIDRegelzeichnung = iDRegelzeichnung;
		iDRegelzeichnung = newIDRegelzeichnung;
		boolean oldIDRegelzeichnungESet = iDRegelzeichnungESet;
		iDRegelzeichnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG, oldIDRegelzeichnung, iDRegelzeichnung, !oldIDRegelzeichnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRegelzeichnung() {
		Regelzeichnung oldIDRegelzeichnung = iDRegelzeichnung;
		boolean oldIDRegelzeichnungESet = iDRegelzeichnungESet;
		iDRegelzeichnung = null;
		iDRegelzeichnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG, oldIDRegelzeichnung, null, oldIDRegelzeichnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRegelzeichnung() {
		return iDRegelzeichnungESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, oldIDSignal, iDSignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
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
	public Signal_Befestigung getIDSignalBefestigung() {
		if (iDSignalBefestigung != null && iDSignalBefestigung.eIsProxy()) {
			InternalEObject oldIDSignalBefestigung = (InternalEObject)iDSignalBefestigung;
			iDSignalBefestigung = (Signal_Befestigung)eResolveProxy(oldIDSignalBefestigung);
			if (iDSignalBefestigung != oldIDSignalBefestigung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, iDSignalBefestigung));
			}
		}
		return iDSignalBefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal_Befestigung basicGetIDSignalBefestigung() {
		return iDSignalBefestigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignalBefestigung(Signal_Befestigung newIDSignalBefestigung) {
		Signal_Befestigung oldIDSignalBefestigung = iDSignalBefestigung;
		iDSignalBefestigung = newIDSignalBefestigung;
		boolean oldIDSignalBefestigungESet = iDSignalBefestigungESet;
		iDSignalBefestigungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, iDSignalBefestigung, !oldIDSignalBefestigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignalBefestigung() {
		Signal_Befestigung oldIDSignalBefestigung = iDSignalBefestigung;
		boolean oldIDSignalBefestigungESet = iDSignalBefestigungESet;
		iDSignalBefestigung = null;
		iDSignalBefestigungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, null, oldIDSignalBefestigungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignalBefestigung() {
		return iDSignalBefestigungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignalNachordnung() {
		if (iDSignalNachordnung != null && iDSignalNachordnung.eIsProxy()) {
			InternalEObject oldIDSignalNachordnung = (InternalEObject)iDSignalNachordnung;
			iDSignalNachordnung = (Signal)eResolveProxy(oldIDSignalNachordnung);
			if (iDSignalNachordnung != oldIDSignalNachordnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, oldIDSignalNachordnung, iDSignalNachordnung));
			}
		}
		return iDSignalNachordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignalNachordnung() {
		return iDSignalNachordnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignalNachordnung(Signal newIDSignalNachordnung) {
		Signal oldIDSignalNachordnung = iDSignalNachordnung;
		iDSignalNachordnung = newIDSignalNachordnung;
		boolean oldIDSignalNachordnungESet = iDSignalNachordnungESet;
		iDSignalNachordnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, oldIDSignalNachordnung, iDSignalNachordnung, !oldIDSignalNachordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignalNachordnung() {
		Signal oldIDSignalNachordnung = iDSignalNachordnung;
		boolean oldIDSignalNachordnungESet = iDSignalNachordnungESet;
		iDSignalNachordnung = null;
		iDSignalNachordnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG, oldIDSignalNachordnung, null, oldIDSignalNachordnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignalNachordnung() {
		return iDSignalNachordnungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rahmen_Art_TypeClass getRahmenArt() {
		return rahmenArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRahmenArt(Rahmen_Art_TypeClass newRahmenArt, NotificationChain msgs) {
		Rahmen_Art_TypeClass oldRahmenArt = rahmenArt;
		rahmenArt = newRahmenArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, oldRahmenArt, newRahmenArt);
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
	public void setRahmenArt(Rahmen_Art_TypeClass newRahmenArt) {
		if (newRahmenArt != rahmenArt) {
			NotificationChain msgs = null;
			if (rahmenArt != null)
				msgs = ((InternalEObject)rahmenArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, null, msgs);
			if (newRahmenArt != null)
				msgs = ((InternalEObject)newRahmenArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, null, msgs);
			msgs = basicSetRahmenArt(newRahmenArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART, newRahmenArt, newRahmenArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rahmen_Hoehe_TypeClass getRahmenHoehe() {
		return rahmenHoehe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRahmenHoehe(Rahmen_Hoehe_TypeClass newRahmenHoehe, NotificationChain msgs) {
		Rahmen_Hoehe_TypeClass oldRahmenHoehe = rahmenHoehe;
		rahmenHoehe = newRahmenHoehe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE, oldRahmenHoehe, newRahmenHoehe);
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
	public void setRahmenHoehe(Rahmen_Hoehe_TypeClass newRahmenHoehe) {
		if (newRahmenHoehe != rahmenHoehe) {
			NotificationChain msgs = null;
			if (rahmenHoehe != null)
				msgs = ((InternalEObject)rahmenHoehe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE, null, msgs);
			if (newRahmenHoehe != null)
				msgs = ((InternalEObject)newRahmenHoehe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE, null, msgs);
			msgs = basicSetRahmenHoehe(newRahmenHoehe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE, newRahmenHoehe, newRahmenHoehe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				return basicSetRahmenArt(null, msgs);
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE:
				return basicSetRahmenHoehe(null, msgs);
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
			case SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG:
				if (resolve) return getIDRegelzeichnung();
				return basicGetIDRegelzeichnung();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				if (resolve) return getIDSignalBefestigung();
				return basicGetIDSignalBefestigung();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				if (resolve) return getIDSignalNachordnung();
				return basicGetIDSignalNachordnung();
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				return getRahmenArt();
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE:
				return getRahmenHoehe();
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
			case SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG:
				setIDRegelzeichnung((Regelzeichnung)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				setIDSignalBefestigung((Signal_Befestigung)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				setIDSignalNachordnung((Signal)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				setRahmenArt((Rahmen_Art_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE:
				setRahmenHoehe((Rahmen_Hoehe_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG:
				unsetIDRegelzeichnung();
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				unsetIDSignal();
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				unsetIDSignalBefestigung();
				return;
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				unsetIDSignalNachordnung();
				return;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				setRahmenArt((Rahmen_Art_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE:
				setRahmenHoehe((Rahmen_Hoehe_TypeClass)null);
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
			case SignalePackage.SIGNAL_RAHMEN__ID_REGELZEICHNUNG:
				return isSetIDRegelzeichnung();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL:
				return isSetIDSignal();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_BEFESTIGUNG:
				return isSetIDSignalBefestigung();
			case SignalePackage.SIGNAL_RAHMEN__ID_SIGNAL_NACHORDNUNG:
				return isSetIDSignalNachordnung();
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_ART:
				return rahmenArt != null;
			case SignalePackage.SIGNAL_RAHMEN__RAHMEN_HOEHE:
				return rahmenHoehe != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_RahmenImpl
