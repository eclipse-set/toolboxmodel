/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Flankenschutz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz_Signal_AttributeGroup;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass;
import org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Schutz Signal Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl#getFlaSignalZielsperrung <em>Fla Signal Zielsperrung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Schutz_Signal_AttributeGroupImpl#getIDFlaSignal <em>ID Fla Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Schutz_Signal_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fla_Schutz_Signal_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFlaSignalZielsperrung() <em>Fla Signal Zielsperrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaSignalZielsperrung()
	 * @generated
	 * @ordered
	 */
	protected Fla_Signal_Zielsperrung_TypeClass flaSignalZielsperrung;

	/**
	 * The cached value of the '{@link #getIDFlaSignal() <em>ID Fla Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDFlaSignal;

	/**
	 * This is true if the ID Fla Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaSignalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Schutz_Signal_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Signal_Zielsperrung_TypeClass getFlaSignalZielsperrung() {
		return flaSignalZielsperrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaSignalZielsperrung(Fla_Signal_Zielsperrung_TypeClass newFlaSignalZielsperrung, NotificationChain msgs) {
		Fla_Signal_Zielsperrung_TypeClass oldFlaSignalZielsperrung = flaSignalZielsperrung;
		flaSignalZielsperrung = newFlaSignalZielsperrung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, oldFlaSignalZielsperrung, newFlaSignalZielsperrung);
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
	public void setFlaSignalZielsperrung(Fla_Signal_Zielsperrung_TypeClass newFlaSignalZielsperrung) {
		if (newFlaSignalZielsperrung != flaSignalZielsperrung) {
			NotificationChain msgs = null;
			if (flaSignalZielsperrung != null)
				msgs = ((InternalEObject)flaSignalZielsperrung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, null, msgs);
			if (newFlaSignalZielsperrung != null)
				msgs = ((InternalEObject)newFlaSignalZielsperrung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, null, msgs);
			msgs = basicSetFlaSignalZielsperrung(newFlaSignalZielsperrung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG, newFlaSignalZielsperrung, newFlaSignalZielsperrung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDFlaSignal() {
		if (iDFlaSignal != null && iDFlaSignal.eIsProxy()) {
			InternalEObject oldIDFlaSignal = (InternalEObject)iDFlaSignal;
			iDFlaSignal = (Signal)eResolveProxy(oldIDFlaSignal);
			if (iDFlaSignal != oldIDFlaSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, oldIDFlaSignal, iDFlaSignal));
			}
		}
		return iDFlaSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDFlaSignal() {
		return iDFlaSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaSignal(Signal newIDFlaSignal) {
		Signal oldIDFlaSignal = iDFlaSignal;
		iDFlaSignal = newIDFlaSignal;
		boolean oldIDFlaSignalESet = iDFlaSignalESet;
		iDFlaSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, oldIDFlaSignal, iDFlaSignal, !oldIDFlaSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaSignal() {
		Signal oldIDFlaSignal = iDFlaSignal;
		boolean oldIDFlaSignalESet = iDFlaSignalESet;
		iDFlaSignal = null;
		iDFlaSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL, oldIDFlaSignal, null, oldIDFlaSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaSignal() {
		return iDFlaSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				return basicSetFlaSignalZielsperrung(null, msgs);
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				return getFlaSignalZielsperrung();
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				if (resolve) return getIDFlaSignal();
				return basicGetIDFlaSignal();
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				setFlaSignalZielsperrung((Fla_Signal_Zielsperrung_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				setIDFlaSignal((Signal)newValue);
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				setFlaSignalZielsperrung((Fla_Signal_Zielsperrung_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				unsetIDFlaSignal();
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
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG:
				return flaSignalZielsperrung != null;
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL:
				return isSetIDFlaSignal();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Schutz_Signal_AttributeGroupImpl
