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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Freimelde_Zuordnung;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Raum_Freimeldung_TypeClass;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz;
import org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fla Freimelde Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Flankenschutz.impl.Fla_Freimelde_ZuordnungImpl#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fla_Freimelde_ZuordnungImpl extends Basis_ObjektImpl implements Fla_Freimelde_Zuordnung {
	/**
	 * The cached value of the '{@link #getFlaRaumFreimeldung() <em>Fla Raum Freimeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlaRaumFreimeldung()
	 * @generated
	 * @ordered
	 */
	protected Fla_Raum_Freimeldung_TypeClass flaRaumFreimeldung;

	/**
	 * The cached value of the '{@link #getIDFlaSchutz() <em>ID Fla Schutz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSchutz()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz iDFlaSchutz;

	/**
	 * This is true if the ID Fla Schutz reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaSchutzESet;

	/**
	 * The cached value of the '{@link #getIDFMAAnlage() <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage iDFMAAnlage;

	/**
	 * This is true if the IDFMA Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFMAAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fla_Freimelde_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlankenschutzPackage.Literals.FLA_FREIMELDE_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Raum_Freimeldung_TypeClass getFlaRaumFreimeldung() {
		return flaRaumFreimeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass newFlaRaumFreimeldung, NotificationChain msgs) {
		Fla_Raum_Freimeldung_TypeClass oldFlaRaumFreimeldung = flaRaumFreimeldung;
		flaRaumFreimeldung = newFlaRaumFreimeldung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, oldFlaRaumFreimeldung, newFlaRaumFreimeldung);
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
	public void setFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass newFlaRaumFreimeldung) {
		if (newFlaRaumFreimeldung != flaRaumFreimeldung) {
			NotificationChain msgs = null;
			if (flaRaumFreimeldung != null)
				msgs = ((InternalEObject)flaRaumFreimeldung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, null, msgs);
			if (newFlaRaumFreimeldung != null)
				msgs = ((InternalEObject)newFlaRaumFreimeldung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, null, msgs);
			msgs = basicSetFlaRaumFreimeldung(newFlaRaumFreimeldung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG, newFlaRaumFreimeldung, newFlaRaumFreimeldung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz getIDFlaSchutz() {
		if (iDFlaSchutz != null && iDFlaSchutz.eIsProxy()) {
			InternalEObject oldIDFlaSchutz = (InternalEObject)iDFlaSchutz;
			iDFlaSchutz = (Fla_Schutz)eResolveProxy(oldIDFlaSchutz);
			if (iDFlaSchutz != oldIDFlaSchutz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, iDFlaSchutz));
			}
		}
		return iDFlaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fla_Schutz basicGetIDFlaSchutz() {
		return iDFlaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaSchutz(Fla_Schutz newIDFlaSchutz) {
		Fla_Schutz oldIDFlaSchutz = iDFlaSchutz;
		iDFlaSchutz = newIDFlaSchutz;
		boolean oldIDFlaSchutzESet = iDFlaSchutzESet;
		iDFlaSchutzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, iDFlaSchutz, !oldIDFlaSchutzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaSchutz() {
		Fla_Schutz oldIDFlaSchutz = iDFlaSchutz;
		boolean oldIDFlaSchutzESet = iDFlaSchutzESet;
		iDFlaSchutz = null;
		iDFlaSchutzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, null, oldIDFlaSchutzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaSchutz() {
		return iDFlaSchutzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage getIDFMAAnlage() {
		if (iDFMAAnlage != null && iDFMAAnlage.eIsProxy()) {
			InternalEObject oldIDFMAAnlage = (InternalEObject)iDFMAAnlage;
			iDFMAAnlage = (FMA_Anlage)eResolveProxy(oldIDFMAAnlage);
			if (iDFMAAnlage != oldIDFMAAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, oldIDFMAAnlage, iDFMAAnlage));
			}
		}
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMA_Anlage basicGetIDFMAAnlage() {
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFMAAnlage(FMA_Anlage newIDFMAAnlage) {
		FMA_Anlage oldIDFMAAnlage = iDFMAAnlage;
		iDFMAAnlage = newIDFMAAnlage;
		boolean oldIDFMAAnlageESet = iDFMAAnlageESet;
		iDFMAAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, oldIDFMAAnlage, iDFMAAnlage, !oldIDFMAAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFMAAnlage() {
		FMA_Anlage oldIDFMAAnlage = iDFMAAnlage;
		boolean oldIDFMAAnlageESet = iDFMAAnlageESet;
		iDFMAAnlage = null;
		iDFMAAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE, oldIDFMAAnlage, null, oldIDFMAAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFMAAnlage() {
		return iDFMAAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				return basicSetFlaRaumFreimeldung(null, msgs);
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				return getFlaRaumFreimeldung();
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				if (resolve) return getIDFlaSchutz();
				return basicGetIDFlaSchutz();
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				if (resolve) return getIDFMAAnlage();
				return basicGetIDFMAAnlage();
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				setFlaRaumFreimeldung((Fla_Raum_Freimeldung_TypeClass)newValue);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				setIDFlaSchutz((Fla_Schutz)newValue);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				setIDFMAAnlage((FMA_Anlage)newValue);
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				setFlaRaumFreimeldung((Fla_Raum_Freimeldung_TypeClass)null);
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				unsetIDFlaSchutz();
				return;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				unsetIDFMAAnlage();
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
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG:
				return flaRaumFreimeldung != null;
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ:
				return isSetIDFlaSchutz();
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE:
				return isSetIDFMAAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fla_Freimelde_ZuordnungImpl
