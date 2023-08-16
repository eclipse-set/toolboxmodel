/**
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Block.Block_Element;

import org.eclipse.set.toolboxmodel.Signale.Besetzte_Ausfahrt_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.DA_Manuell_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Durchfahrt_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Rangierstrasse_Restaufloesung_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Signal_Fstr_AttributeGroup;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_AttributeGroupImpl#getBesetzteAusfahrt <em>Besetzte Ausfahrt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_AttributeGroupImpl#getDAManuell <em>DA Manuell</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_AttributeGroupImpl#getDurchfahrt <em>Durchfahrt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_AttributeGroupImpl#getIDRaZielErlaubnisabhaengig <em>ID Ra Ziel Erlaubnisabhaengig</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_AttributeGroupImpl#getRangierstrasseRestaufloesung <em>Rangierstrasse Restaufloesung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fstr_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Fstr_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBesetzteAusfahrt() <em>Besetzte Ausfahrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesetzteAusfahrt()
	 * @generated
	 * @ordered
	 */
	protected Besetzte_Ausfahrt_TypeClass besetzteAusfahrt;

	/**
	 * The cached value of the '{@link #getDAManuell() <em>DA Manuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAManuell()
	 * @generated
	 * @ordered
	 */
	protected DA_Manuell_TypeClass dAManuell;

	/**
	 * The cached value of the '{@link #getDurchfahrt() <em>Durchfahrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurchfahrt()
	 * @generated
	 * @ordered
	 */
	protected Durchfahrt_TypeClass durchfahrt;

	/**
	 * The cached value of the '{@link #getIDRaZielErlaubnisabhaengig() <em>ID Ra Ziel Erlaubnisabhaengig</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRaZielErlaubnisabhaengig()
	 * @generated
	 * @ordered
	 */
	protected Block_Element iDRaZielErlaubnisabhaengig;

	/**
	 * This is true if the ID Ra Ziel Erlaubnisabhaengig reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRaZielErlaubnisabhaengigESet;

	/**
	 * The cached value of the '{@link #getRangierstrasseRestaufloesung() <em>Rangierstrasse Restaufloesung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRangierstrasseRestaufloesung()
	 * @generated
	 * @ordered
	 */
	protected Rangierstrasse_Restaufloesung_TypeClass rangierstrasseRestaufloesung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fstr_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FSTR_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besetzte_Ausfahrt_TypeClass getBesetzteAusfahrt() {
		return besetzteAusfahrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBesetzteAusfahrt(Besetzte_Ausfahrt_TypeClass newBesetzteAusfahrt, NotificationChain msgs) {
		Besetzte_Ausfahrt_TypeClass oldBesetzteAusfahrt = besetzteAusfahrt;
		besetzteAusfahrt = newBesetzteAusfahrt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT, oldBesetzteAusfahrt, newBesetzteAusfahrt);
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
	public void setBesetzteAusfahrt(Besetzte_Ausfahrt_TypeClass newBesetzteAusfahrt) {
		if (newBesetzteAusfahrt != besetzteAusfahrt) {
			NotificationChain msgs = null;
			if (besetzteAusfahrt != null)
				msgs = ((InternalEObject)besetzteAusfahrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT, null, msgs);
			if (newBesetzteAusfahrt != null)
				msgs = ((InternalEObject)newBesetzteAusfahrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT, null, msgs);
			msgs = basicSetBesetzteAusfahrt(newBesetzteAusfahrt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT, newBesetzteAusfahrt, newBesetzteAusfahrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DA_Manuell_TypeClass getDAManuell() {
		return dAManuell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDAManuell(DA_Manuell_TypeClass newDAManuell, NotificationChain msgs) {
		DA_Manuell_TypeClass oldDAManuell = dAManuell;
		dAManuell = newDAManuell;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL, oldDAManuell, newDAManuell);
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
	public void setDAManuell(DA_Manuell_TypeClass newDAManuell) {
		if (newDAManuell != dAManuell) {
			NotificationChain msgs = null;
			if (dAManuell != null)
				msgs = ((InternalEObject)dAManuell).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL, null, msgs);
			if (newDAManuell != null)
				msgs = ((InternalEObject)newDAManuell).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL, null, msgs);
			msgs = basicSetDAManuell(newDAManuell, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL, newDAManuell, newDAManuell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Durchfahrt_TypeClass getDurchfahrt() {
		return durchfahrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDurchfahrt(Durchfahrt_TypeClass newDurchfahrt, NotificationChain msgs) {
		Durchfahrt_TypeClass oldDurchfahrt = durchfahrt;
		durchfahrt = newDurchfahrt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT, oldDurchfahrt, newDurchfahrt);
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
	public void setDurchfahrt(Durchfahrt_TypeClass newDurchfahrt) {
		if (newDurchfahrt != durchfahrt) {
			NotificationChain msgs = null;
			if (durchfahrt != null)
				msgs = ((InternalEObject)durchfahrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT, null, msgs);
			if (newDurchfahrt != null)
				msgs = ((InternalEObject)newDurchfahrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT, null, msgs);
			msgs = basicSetDurchfahrt(newDurchfahrt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT, newDurchfahrt, newDurchfahrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element getIDRaZielErlaubnisabhaengig() {
		if (iDRaZielErlaubnisabhaengig != null && iDRaZielErlaubnisabhaengig.eIsProxy()) {
			InternalEObject oldIDRaZielErlaubnisabhaengig = (InternalEObject)iDRaZielErlaubnisabhaengig;
			iDRaZielErlaubnisabhaengig = (Block_Element)eResolveProxy(oldIDRaZielErlaubnisabhaengig);
			if (iDRaZielErlaubnisabhaengig != oldIDRaZielErlaubnisabhaengig) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG, oldIDRaZielErlaubnisabhaengig, iDRaZielErlaubnisabhaengig));
			}
		}
		return iDRaZielErlaubnisabhaengig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_Element basicGetIDRaZielErlaubnisabhaengig() {
		return iDRaZielErlaubnisabhaengig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRaZielErlaubnisabhaengig(Block_Element newIDRaZielErlaubnisabhaengig) {
		Block_Element oldIDRaZielErlaubnisabhaengig = iDRaZielErlaubnisabhaengig;
		iDRaZielErlaubnisabhaengig = newIDRaZielErlaubnisabhaengig;
		boolean oldIDRaZielErlaubnisabhaengigESet = iDRaZielErlaubnisabhaengigESet;
		iDRaZielErlaubnisabhaengigESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG, oldIDRaZielErlaubnisabhaengig, iDRaZielErlaubnisabhaengig, !oldIDRaZielErlaubnisabhaengigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRaZielErlaubnisabhaengig() {
		Block_Element oldIDRaZielErlaubnisabhaengig = iDRaZielErlaubnisabhaengig;
		boolean oldIDRaZielErlaubnisabhaengigESet = iDRaZielErlaubnisabhaengigESet;
		iDRaZielErlaubnisabhaengig = null;
		iDRaZielErlaubnisabhaengigESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG, oldIDRaZielErlaubnisabhaengig, null, oldIDRaZielErlaubnisabhaengigESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRaZielErlaubnisabhaengig() {
		return iDRaZielErlaubnisabhaengigESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rangierstrasse_Restaufloesung_TypeClass getRangierstrasseRestaufloesung() {
		return rangierstrasseRestaufloesung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangierstrasseRestaufloesung(Rangierstrasse_Restaufloesung_TypeClass newRangierstrasseRestaufloesung, NotificationChain msgs) {
		Rangierstrasse_Restaufloesung_TypeClass oldRangierstrasseRestaufloesung = rangierstrasseRestaufloesung;
		rangierstrasseRestaufloesung = newRangierstrasseRestaufloesung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG, oldRangierstrasseRestaufloesung, newRangierstrasseRestaufloesung);
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
	public void setRangierstrasseRestaufloesung(Rangierstrasse_Restaufloesung_TypeClass newRangierstrasseRestaufloesung) {
		if (newRangierstrasseRestaufloesung != rangierstrasseRestaufloesung) {
			NotificationChain msgs = null;
			if (rangierstrasseRestaufloesung != null)
				msgs = ((InternalEObject)rangierstrasseRestaufloesung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG, null, msgs);
			if (newRangierstrasseRestaufloesung != null)
				msgs = ((InternalEObject)newRangierstrasseRestaufloesung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG, null, msgs);
			msgs = basicSetRangierstrasseRestaufloesung(newRangierstrasseRestaufloesung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG, newRangierstrasseRestaufloesung, newRangierstrasseRestaufloesung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT:
				return basicSetBesetzteAusfahrt(null, msgs);
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL:
				return basicSetDAManuell(null, msgs);
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT:
				return basicSetDurchfahrt(null, msgs);
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG:
				return basicSetRangierstrasseRestaufloesung(null, msgs);
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
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT:
				return getBesetzteAusfahrt();
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL:
				return getDAManuell();
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT:
				return getDurchfahrt();
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG:
				if (resolve) return getIDRaZielErlaubnisabhaengig();
				return basicGetIDRaZielErlaubnisabhaengig();
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG:
				return getRangierstrasseRestaufloesung();
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
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT:
				setBesetzteAusfahrt((Besetzte_Ausfahrt_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL:
				setDAManuell((DA_Manuell_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT:
				setDurchfahrt((Durchfahrt_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG:
				setIDRaZielErlaubnisabhaengig((Block_Element)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG:
				setRangierstrasseRestaufloesung((Rangierstrasse_Restaufloesung_TypeClass)newValue);
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
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT:
				setBesetzteAusfahrt((Besetzte_Ausfahrt_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL:
				setDAManuell((DA_Manuell_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT:
				setDurchfahrt((Durchfahrt_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG:
				unsetIDRaZielErlaubnisabhaengig();
				return;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG:
				setRangierstrasseRestaufloesung((Rangierstrasse_Restaufloesung_TypeClass)null);
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
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__BESETZTE_AUSFAHRT:
				return besetzteAusfahrt != null;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DA_MANUELL:
				return dAManuell != null;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__DURCHFAHRT:
				return durchfahrt != null;
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__ID_RA_ZIEL_ERLAUBNISABHAENGIG:
				return isSetIDRaZielErlaubnisabhaengig();
			case SignalePackage.SIGNAL_FSTR_ATTRIBUTE_GROUP__RANGIERSTRASSE_RESTAUFLOESUNG:
				return rangierstrasseRestaufloesung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_Fstr_AttributeGroupImpl
