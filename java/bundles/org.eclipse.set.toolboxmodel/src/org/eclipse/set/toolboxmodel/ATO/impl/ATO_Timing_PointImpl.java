/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.ATO.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.ATO.ATOPackage;
import org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point;
import org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Timing Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Timing_PointImpl#getATOTimingPointAllg <em>ATO Timing Point Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Timing_PointImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Timing_PointImpl#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Timing_PointImpl extends Punkt_ObjektImpl implements ATO_Timing_Point {
	/**
	 * The cached value of the '{@link #getATOTimingPointAllg() <em>ATO Timing Point Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATOTimingPointAllg()
	 * @generated
	 * @ordered
	 */
	protected ATO_Timing_Point_Allg_AttributeGroup aTOTimingPointAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ATO_Timing_Point_Bezeichnung_AttributeGroup bezeichnung;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Timing_PointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_TIMING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point_Allg_AttributeGroup getATOTimingPointAllg() {
		return aTOTimingPointAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATOTimingPointAllg(ATO_Timing_Point_Allg_AttributeGroup newATOTimingPointAllg, NotificationChain msgs) {
		ATO_Timing_Point_Allg_AttributeGroup oldATOTimingPointAllg = aTOTimingPointAllg;
		aTOTimingPointAllg = newATOTimingPointAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, oldATOTimingPointAllg, newATOTimingPointAllg);
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
	public void setATOTimingPointAllg(ATO_Timing_Point_Allg_AttributeGroup newATOTimingPointAllg) {
		if (newATOTimingPointAllg != aTOTimingPointAllg) {
			NotificationChain msgs = null;
			if (aTOTimingPointAllg != null)
				msgs = ((InternalEObject)aTOTimingPointAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, null, msgs);
			if (newATOTimingPointAllg != null)
				msgs = ((InternalEObject)newATOTimingPointAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, null, msgs);
			msgs = basicSetATOTimingPointAllg(newATOTimingPointAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG, newATOTimingPointAllg, newATOTimingPointAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Timing_Point_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ATO_Timing_Point_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ATO_Timing_Point_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ATO_Timing_Point_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, oldIDSignal, iDSignal));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, ATOPackage.ATO_TIMING_POINT__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				return basicSetATOTimingPointAllg(null, msgs);
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				return getATOTimingPointAllg();
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				return getBezeichnung();
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				setATOTimingPointAllg((ATO_Timing_Point_Allg_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				setBezeichnung((ATO_Timing_Point_Bezeichnung_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				setIDSignal((Signal)newValue);
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				setATOTimingPointAllg((ATO_Timing_Point_Allg_AttributeGroup)null);
				return;
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				setBezeichnung((ATO_Timing_Point_Bezeichnung_AttributeGroup)null);
				return;
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				unsetIDSignal();
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
			case ATOPackage.ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG:
				return aTOTimingPointAllg != null;
			case ATOPackage.ATO_TIMING_POINT__BEZEICHNUNG:
				return bezeichnung != null;
			case ATOPackage.ATO_TIMING_POINT__ID_SIGNAL:
				return isSetIDSignal();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ATO_Timing_PointImpl
