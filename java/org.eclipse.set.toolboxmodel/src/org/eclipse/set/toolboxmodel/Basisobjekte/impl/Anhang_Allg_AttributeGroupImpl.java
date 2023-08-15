/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Dateiname_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Dateityp_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anhang Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl#getAnhangArt <em>Anhang Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Anhang_Allg_AttributeGroupImpl#getDateityp <em>Dateityp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Anhang_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Anhang_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnhangArt() <em>Anhang Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangArt()
	 * @generated
	 * @ordered
	 */
	protected Anhang_Art_TypeClass anhangArt;

	/**
	 * The cached value of the '{@link #getDateiname() <em>Dateiname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateiname()
	 * @generated
	 * @ordered
	 */
	protected Dateiname_TypeClass dateiname;

	/**
	 * The cached value of the '{@link #getDateityp() <em>Dateityp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateityp()
	 * @generated
	 * @ordered
	 */
	protected Dateityp_TypeClass dateityp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Anhang_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.ANHANG_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang_Art_TypeClass getAnhangArt() {
		return anhangArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnhangArt(Anhang_Art_TypeClass newAnhangArt, NotificationChain msgs) {
		Anhang_Art_TypeClass oldAnhangArt = anhangArt;
		anhangArt = newAnhangArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART, oldAnhangArt, newAnhangArt);
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
	public void setAnhangArt(Anhang_Art_TypeClass newAnhangArt) {
		if (newAnhangArt != anhangArt) {
			NotificationChain msgs = null;
			if (anhangArt != null)
				msgs = ((InternalEObject)anhangArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART, null, msgs);
			if (newAnhangArt != null)
				msgs = ((InternalEObject)newAnhangArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART, null, msgs);
			msgs = basicSetAnhangArt(newAnhangArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART, newAnhangArt, newAnhangArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateiname_TypeClass getDateiname() {
		return dateiname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateiname(Dateiname_TypeClass newDateiname, NotificationChain msgs) {
		Dateiname_TypeClass oldDateiname = dateiname;
		dateiname = newDateiname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME, oldDateiname, newDateiname);
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
	public void setDateiname(Dateiname_TypeClass newDateiname) {
		if (newDateiname != dateiname) {
			NotificationChain msgs = null;
			if (dateiname != null)
				msgs = ((InternalEObject)dateiname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME, null, msgs);
			if (newDateiname != null)
				msgs = ((InternalEObject)newDateiname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME, null, msgs);
			msgs = basicSetDateiname(newDateiname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME, newDateiname, newDateiname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dateityp_TypeClass getDateityp() {
		return dateityp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateityp(Dateityp_TypeClass newDateityp, NotificationChain msgs) {
		Dateityp_TypeClass oldDateityp = dateityp;
		dateityp = newDateityp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP, oldDateityp, newDateityp);
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
	public void setDateityp(Dateityp_TypeClass newDateityp) {
		if (newDateityp != dateityp) {
			NotificationChain msgs = null;
			if (dateityp != null)
				msgs = ((InternalEObject)dateityp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP, null, msgs);
			if (newDateityp != null)
				msgs = ((InternalEObject)newDateityp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP, null, msgs);
			msgs = basicSetDateityp(newDateityp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP, newDateityp, newDateityp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART:
				return basicSetAnhangArt(null, msgs);
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				return basicSetDateiname(null, msgs);
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP:
				return basicSetDateityp(null, msgs);
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
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART:
				return getAnhangArt();
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				return getDateiname();
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP:
				return getDateityp();
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
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART:
				setAnhangArt((Anhang_Art_TypeClass)newValue);
				return;
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				setDateiname((Dateiname_TypeClass)newValue);
				return;
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP:
				setDateityp((Dateityp_TypeClass)newValue);
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
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART:
				setAnhangArt((Anhang_Art_TypeClass)null);
				return;
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				setDateiname((Dateiname_TypeClass)null);
				return;
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP:
				setDateityp((Dateityp_TypeClass)null);
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
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__ANHANG_ART:
				return anhangArt != null;
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEINAME:
				return dateiname != null;
			case BasisobjektePackage.ANHANG_ALLG_ATTRIBUTE_GROUP__DATEITYP:
				return dateityp != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Anhang_Allg_AttributeGroupImpl
