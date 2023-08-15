/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Fahrweg;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Mittel_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Zug Rangier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_RangierImpl#getFstrZugRangierAllg <em>Fstr Zug Rangier Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_RangierImpl#getIDFstrAusschlussBesonders <em>ID Fstr Ausschluss Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_RangierImpl#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_RangierImpl#getFstrMittel <em>Fstr Mittel</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_RangierImpl#getFstrRangier <em>Fstr Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_RangierImpl#getFstrZug <em>Fstr Zug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Zug_RangierImpl extends Basis_ObjektImpl implements Fstr_Zug_Rangier {
	/**
	 * The cached value of the '{@link #getFstrZugRangierAllg() <em>Fstr Zug Rangier Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrZugRangierAllg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier_Allg_AttributeGroup fstrZugRangierAllg;

	/**
	 * The cached value of the '{@link #getIDFstrAusschlussBesonders() <em>ID Fstr Ausschluss Besonders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrAusschlussBesonders()
	 * @generated
	 * @ordered
	 */
	protected EList<Fstr_Zug_Rangier> iDFstrAusschlussBesonders;

	/**
	 * The cached value of the '{@link #getIDFstrFahrweg() <em>ID Fstr Fahrweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrFahrweg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Fahrweg iDFstrFahrweg;

	/**
	 * This is true if the ID Fstr Fahrweg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrFahrwegESet;

	/**
	 * The cached value of the '{@link #getFstrMittel() <em>Fstr Mittel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrMittel()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Mittel_AttributeGroup fstrMittel;

	/**
	 * The cached value of the '{@link #getFstrRangier() <em>Fstr Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Rangier_AttributeGroup fstrRangier;

	/**
	 * The cached value of the '{@link #getFstrZug() <em>Fstr Zug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrZug()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_AttributeGroup fstrZug;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Zug_RangierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ZUG_RANGIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier_Allg_AttributeGroup getFstrZugRangierAllg() {
		return fstrZugRangierAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrZugRangierAllg(Fstr_Zug_Rangier_Allg_AttributeGroup newFstrZugRangierAllg, NotificationChain msgs) {
		Fstr_Zug_Rangier_Allg_AttributeGroup oldFstrZugRangierAllg = fstrZugRangierAllg;
		fstrZugRangierAllg = newFstrZugRangierAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG, oldFstrZugRangierAllg, newFstrZugRangierAllg);
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
	public void setFstrZugRangierAllg(Fstr_Zug_Rangier_Allg_AttributeGroup newFstrZugRangierAllg) {
		if (newFstrZugRangierAllg != fstrZugRangierAllg) {
			NotificationChain msgs = null;
			if (fstrZugRangierAllg != null)
				msgs = ((InternalEObject)fstrZugRangierAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG, null, msgs);
			if (newFstrZugRangierAllg != null)
				msgs = ((InternalEObject)newFstrZugRangierAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG, null, msgs);
			msgs = basicSetFstrZugRangierAllg(newFstrZugRangierAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG, newFstrZugRangierAllg, newFstrZugRangierAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fstr_Zug_Rangier> getIDFstrAusschlussBesonders() {
		if (iDFstrAusschlussBesonders == null) {
			iDFstrAusschlussBesonders = new EObjectResolvingEList<Fstr_Zug_Rangier>(Fstr_Zug_Rangier.class, this, FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS);
		}
		return iDFstrAusschlussBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Fahrweg getIDFstrFahrweg() {
		if (iDFstrFahrweg != null && iDFstrFahrweg.eIsProxy()) {
			InternalEObject oldIDFstrFahrweg = (InternalEObject)iDFstrFahrweg;
			iDFstrFahrweg = (Fstr_Fahrweg)eResolveProxy(oldIDFstrFahrweg);
			if (iDFstrFahrweg != oldIDFstrFahrweg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg));
			}
		}
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Fahrweg basicGetIDFstrFahrweg() {
		return iDFstrFahrweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrFahrweg(Fstr_Fahrweg newIDFstrFahrweg) {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		iDFstrFahrweg = newIDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrwegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, iDFstrFahrweg, !oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrFahrweg() {
		Fstr_Fahrweg oldIDFstrFahrweg = iDFstrFahrweg;
		boolean oldIDFstrFahrwegESet = iDFstrFahrwegESet;
		iDFstrFahrweg = null;
		iDFstrFahrwegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG, oldIDFstrFahrweg, null, oldIDFstrFahrwegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrFahrweg() {
		return iDFstrFahrwegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Mittel_AttributeGroup getFstrMittel() {
		return fstrMittel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrMittel(Fstr_Mittel_AttributeGroup newFstrMittel, NotificationChain msgs) {
		Fstr_Mittel_AttributeGroup oldFstrMittel = fstrMittel;
		fstrMittel = newFstrMittel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL, oldFstrMittel, newFstrMittel);
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
	public void setFstrMittel(Fstr_Mittel_AttributeGroup newFstrMittel) {
		if (newFstrMittel != fstrMittel) {
			NotificationChain msgs = null;
			if (fstrMittel != null)
				msgs = ((InternalEObject)fstrMittel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL, null, msgs);
			if (newFstrMittel != null)
				msgs = ((InternalEObject)newFstrMittel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL, null, msgs);
			msgs = basicSetFstrMittel(newFstrMittel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL, newFstrMittel, newFstrMittel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Rangier_AttributeGroup getFstrRangier() {
		return fstrRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrRangier(Fstr_Rangier_AttributeGroup newFstrRangier, NotificationChain msgs) {
		Fstr_Rangier_AttributeGroup oldFstrRangier = fstrRangier;
		fstrRangier = newFstrRangier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER, oldFstrRangier, newFstrRangier);
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
	public void setFstrRangier(Fstr_Rangier_AttributeGroup newFstrRangier) {
		if (newFstrRangier != fstrRangier) {
			NotificationChain msgs = null;
			if (fstrRangier != null)
				msgs = ((InternalEObject)fstrRangier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER, null, msgs);
			if (newFstrRangier != null)
				msgs = ((InternalEObject)newFstrRangier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER, null, msgs);
			msgs = basicSetFstrRangier(newFstrRangier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER, newFstrRangier, newFstrRangier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_AttributeGroup getFstrZug() {
		return fstrZug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrZug(Fstr_Zug_AttributeGroup newFstrZug, NotificationChain msgs) {
		Fstr_Zug_AttributeGroup oldFstrZug = fstrZug;
		fstrZug = newFstrZug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG, oldFstrZug, newFstrZug);
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
	public void setFstrZug(Fstr_Zug_AttributeGroup newFstrZug) {
		if (newFstrZug != fstrZug) {
			NotificationChain msgs = null;
			if (fstrZug != null)
				msgs = ((InternalEObject)fstrZug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG, null, msgs);
			if (newFstrZug != null)
				msgs = ((InternalEObject)newFstrZug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG, null, msgs);
			msgs = basicSetFstrZug(newFstrZug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG, newFstrZug, newFstrZug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG:
				return basicSetFstrZugRangierAllg(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL:
				return basicSetFstrMittel(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER:
				return basicSetFstrRangier(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG:
				return basicSetFstrZug(null, msgs);
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG:
				return getFstrZugRangierAllg();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS:
				return getIDFstrAusschlussBesonders();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG:
				if (resolve) return getIDFstrFahrweg();
				return basicGetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL:
				return getFstrMittel();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER:
				return getFstrRangier();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG:
				return getFstrZug();
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG:
				setFstrZugRangierAllg((Fstr_Zug_Rangier_Allg_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS:
				getIDFstrAusschlussBesonders().clear();
				getIDFstrAusschlussBesonders().addAll((Collection<? extends Fstr_Zug_Rangier>)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG:
				setIDFstrFahrweg((Fstr_Fahrweg)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL:
				setFstrMittel((Fstr_Mittel_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER:
				setFstrRangier((Fstr_Rangier_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG:
				setFstrZug((Fstr_Zug_AttributeGroup)newValue);
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG:
				setFstrZugRangierAllg((Fstr_Zug_Rangier_Allg_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS:
				getIDFstrAusschlussBesonders().clear();
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG:
				unsetIDFstrFahrweg();
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL:
				setFstrMittel((Fstr_Mittel_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER:
				setFstrRangier((Fstr_Rangier_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG:
				setFstrZug((Fstr_Zug_AttributeGroup)null);
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
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG_RANGIER_ALLG:
				return fstrZugRangierAllg != null;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_AUSSCHLUSS_BESONDERS:
				return iDFstrAusschlussBesonders != null && !iDFstrAusschlussBesonders.isEmpty();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__ID_FSTR_FAHRWEG:
				return isSetIDFstrFahrweg();
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_MITTEL:
				return fstrMittel != null;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_RANGIER:
				return fstrRangier != null;
			case FahrstrassePackage.FSTR_ZUG_RANGIER__FSTR_ZUG:
				return fstrZug != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_Zug_RangierImpl
