/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;

import org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung;
import org.eclipse.set.toolboxmodel.Signale.Signal_Befestigung_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Befestigung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_BefestigungImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_BefestigungImpl#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_BefestigungImpl#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_BefestigungImpl#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_BefestigungImpl extends Punkt_ObjektImpl implements Signal_Befestigung {
	/**
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Regelzeichnung> iDRegelzeichnung;

	/**
	 * The cached value of the '{@link #getSignalBefestigungAllg() <em>Signal Befestigung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignalBefestigungAllg()
	 * @generated
	 * @ordered
	 */
	protected Signal_Befestigung_Allg_AttributeGroup signalBefestigungAllg;

	/**
	 * The cached value of the '{@link #getIDBefestigungBauwerk() <em>ID Befestigung Bauwerk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBefestigungBauwerk()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDBefestigungBauwerk;

	/**
	 * This is true if the ID Befestigung Bauwerk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBefestigungBauwerkESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_BefestigungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_BEFESTIGUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regelzeichnung> getIDRegelzeichnung() {
		if (iDRegelzeichnung == null) {
			iDRegelzeichnung = new EObjectResolvingEList<Regelzeichnung>(Regelzeichnung.class, this, SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG);
		}
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal_Befestigung_Allg_AttributeGroup getSignalBefestigungAllg() {
		return signalBefestigungAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup newSignalBefestigungAllg, NotificationChain msgs) {
		Signal_Befestigung_Allg_AttributeGroup oldSignalBefestigungAllg = signalBefestigungAllg;
		signalBefestigungAllg = newSignalBefestigungAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, oldSignalBefestigungAllg, newSignalBefestigungAllg);
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
	public void setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup newSignalBefestigungAllg) {
		if (newSignalBefestigungAllg != signalBefestigungAllg) {
			NotificationChain msgs = null;
			if (signalBefestigungAllg != null)
				msgs = ((InternalEObject)signalBefestigungAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, null, msgs);
			if (newSignalBefestigungAllg != null)
				msgs = ((InternalEObject)newSignalBefestigungAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, null, msgs);
			msgs = basicSetSignalBefestigungAllg(newSignalBefestigungAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG, newSignalBefestigungAllg, newSignalBefestigungAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDBefestigungBauwerk() {
		if (iDBefestigungBauwerk != null && iDBefestigungBauwerk.eIsProxy()) {
			InternalEObject oldIDBefestigungBauwerk = (InternalEObject)iDBefestigungBauwerk;
			iDBefestigungBauwerk = (Basis_Objekt)eResolveProxy(oldIDBefestigungBauwerk);
			if (iDBefestigungBauwerk != oldIDBefestigungBauwerk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK, oldIDBefestigungBauwerk, iDBefestigungBauwerk));
			}
		}
		return iDBefestigungBauwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDBefestigungBauwerk() {
		return iDBefestigungBauwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBefestigungBauwerk(Basis_Objekt newIDBefestigungBauwerk) {
		Basis_Objekt oldIDBefestigungBauwerk = iDBefestigungBauwerk;
		iDBefestigungBauwerk = newIDBefestigungBauwerk;
		boolean oldIDBefestigungBauwerkESet = iDBefestigungBauwerkESet;
		iDBefestigungBauwerkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK, oldIDBefestigungBauwerk, iDBefestigungBauwerk, !oldIDBefestigungBauwerkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBefestigungBauwerk() {
		Basis_Objekt oldIDBefestigungBauwerk = iDBefestigungBauwerk;
		boolean oldIDBefestigungBauwerkESet = iDBefestigungBauwerkESet;
		iDBefestigungBauwerk = null;
		iDBefestigungBauwerkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK, oldIDBefestigungBauwerk, null, oldIDBefestigungBauwerkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBefestigungBauwerk() {
		return iDBefestigungBauwerkESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, iDSignalBefestigung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, iDSignalBefestigung, !oldIDSignalBefestigungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG, oldIDSignalBefestigung, null, oldIDSignalBefestigungESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				return basicSetSignalBefestigungAllg(null, msgs);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				return getIDRegelzeichnung();
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				return getSignalBefestigungAllg();
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK:
				if (resolve) return getIDBefestigungBauwerk();
				return basicGetIDBefestigungBauwerk();
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				if (resolve) return getIDSignalBefestigung();
				return basicGetIDSignalBefestigung();
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				getIDRegelzeichnung().clear();
				getIDRegelzeichnung().addAll((Collection<? extends Regelzeichnung>)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				setSignalBefestigungAllg((Signal_Befestigung_Allg_AttributeGroup)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK:
				setIDBefestigungBauwerk((Basis_Objekt)newValue);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				setIDSignalBefestigung((Signal_Befestigung)newValue);
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				getIDRegelzeichnung().clear();
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				setSignalBefestigungAllg((Signal_Befestigung_Allg_AttributeGroup)null);
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK:
				unsetIDBefestigungBauwerk();
				return;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				unsetIDSignalBefestigung();
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
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_REGELZEICHNUNG:
				return iDRegelzeichnung != null && !iDRegelzeichnung.isEmpty();
			case SignalePackage.SIGNAL_BEFESTIGUNG__SIGNAL_BEFESTIGUNG_ALLG:
				return signalBefestigungAllg != null;
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_BEFESTIGUNG_BAUWERK:
				return isSetIDBefestigungBauwerk();
			case SignalePackage.SIGNAL_BEFESTIGUNG__ID_SIGNAL_BEFESTIGUNG:
				return isSetIDSignalBefestigung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_BefestigungImpl
