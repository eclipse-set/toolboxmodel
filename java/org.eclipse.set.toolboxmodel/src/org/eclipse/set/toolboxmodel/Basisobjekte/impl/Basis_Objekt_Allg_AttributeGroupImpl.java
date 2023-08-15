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

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bestandsschutz_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Datum_Regelwerk_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Objektzustand_Besonders_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis Objekt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl#getBestandsschutz <em>Bestandsschutz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl#getObjektzustandBesonders <em>Objektzustand Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl#getDatumRegelwerk <em>Datum Regelwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_Objekt_Allg_AttributeGroupImpl#getIDAnhangRegelwerkBesonders <em>ID Anhang Regelwerk Besonders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Basis_Objekt_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Basis_Objekt_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBestandsschutz() <em>Bestandsschutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestandsschutz()
	 * @generated
	 * @ordered
	 */
	protected Bestandsschutz_TypeClass bestandsschutz;

	/**
	 * The cached value of the '{@link #getObjektzustandBesonders() <em>Objektzustand Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektzustandBesonders()
	 * @generated
	 * @ordered
	 */
	protected Objektzustand_Besonders_TypeClass objektzustandBesonders;

	/**
	 * The cached value of the '{@link #getDatumRegelwerk() <em>Datum Regelwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatumRegelwerk()
	 * @generated
	 * @ordered
	 */
	protected Datum_Regelwerk_TypeClass datumRegelwerk;

	/**
	 * The cached value of the '{@link #getIDAnhangRegelwerkBesonders() <em>ID Anhang Regelwerk Besonders</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangRegelwerkBesonders()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangRegelwerkBesonders;

	/**
	 * This is true if the ID Anhang Regelwerk Besonders reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangRegelwerkBesondersESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Basis_Objekt_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bestandsschutz_TypeClass getBestandsschutz() {
		return bestandsschutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBestandsschutz(Bestandsschutz_TypeClass newBestandsschutz, NotificationChain msgs) {
		Bestandsschutz_TypeClass oldBestandsschutz = bestandsschutz;
		bestandsschutz = newBestandsschutz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ, oldBestandsschutz, newBestandsschutz);
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
	public void setBestandsschutz(Bestandsschutz_TypeClass newBestandsschutz) {
		if (newBestandsschutz != bestandsschutz) {
			NotificationChain msgs = null;
			if (bestandsschutz != null)
				msgs = ((InternalEObject)bestandsschutz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ, null, msgs);
			if (newBestandsschutz != null)
				msgs = ((InternalEObject)newBestandsschutz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ, null, msgs);
			msgs = basicSetBestandsschutz(newBestandsschutz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ, newBestandsschutz, newBestandsschutz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objektzustand_Besonders_TypeClass getObjektzustandBesonders() {
		return objektzustandBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjektzustandBesonders(Objektzustand_Besonders_TypeClass newObjektzustandBesonders, NotificationChain msgs) {
		Objektzustand_Besonders_TypeClass oldObjektzustandBesonders = objektzustandBesonders;
		objektzustandBesonders = newObjektzustandBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS, oldObjektzustandBesonders, newObjektzustandBesonders);
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
	public void setObjektzustandBesonders(Objektzustand_Besonders_TypeClass newObjektzustandBesonders) {
		if (newObjektzustandBesonders != objektzustandBesonders) {
			NotificationChain msgs = null;
			if (objektzustandBesonders != null)
				msgs = ((InternalEObject)objektzustandBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS, null, msgs);
			if (newObjektzustandBesonders != null)
				msgs = ((InternalEObject)newObjektzustandBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS, null, msgs);
			msgs = basicSetObjektzustandBesonders(newObjektzustandBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS, newObjektzustandBesonders, newObjektzustandBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datum_Regelwerk_TypeClass getDatumRegelwerk() {
		return datumRegelwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatumRegelwerk(Datum_Regelwerk_TypeClass newDatumRegelwerk, NotificationChain msgs) {
		Datum_Regelwerk_TypeClass oldDatumRegelwerk = datumRegelwerk;
		datumRegelwerk = newDatumRegelwerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK, oldDatumRegelwerk, newDatumRegelwerk);
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
	public void setDatumRegelwerk(Datum_Regelwerk_TypeClass newDatumRegelwerk) {
		if (newDatumRegelwerk != datumRegelwerk) {
			NotificationChain msgs = null;
			if (datumRegelwerk != null)
				msgs = ((InternalEObject)datumRegelwerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK, null, msgs);
			if (newDatumRegelwerk != null)
				msgs = ((InternalEObject)newDatumRegelwerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK, null, msgs);
			msgs = basicSetDatumRegelwerk(newDatumRegelwerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK, newDatumRegelwerk, newDatumRegelwerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangRegelwerkBesonders() {
		if (iDAnhangRegelwerkBesonders != null && iDAnhangRegelwerkBesonders.eIsProxy()) {
			InternalEObject oldIDAnhangRegelwerkBesonders = (InternalEObject)iDAnhangRegelwerkBesonders;
			iDAnhangRegelwerkBesonders = (Anhang)eResolveProxy(oldIDAnhangRegelwerkBesonders);
			if (iDAnhangRegelwerkBesonders != oldIDAnhangRegelwerkBesonders) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS, oldIDAnhangRegelwerkBesonders, iDAnhangRegelwerkBesonders));
			}
		}
		return iDAnhangRegelwerkBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangRegelwerkBesonders() {
		return iDAnhangRegelwerkBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangRegelwerkBesonders(Anhang newIDAnhangRegelwerkBesonders) {
		Anhang oldIDAnhangRegelwerkBesonders = iDAnhangRegelwerkBesonders;
		iDAnhangRegelwerkBesonders = newIDAnhangRegelwerkBesonders;
		boolean oldIDAnhangRegelwerkBesondersESet = iDAnhangRegelwerkBesondersESet;
		iDAnhangRegelwerkBesondersESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS, oldIDAnhangRegelwerkBesonders, iDAnhangRegelwerkBesonders, !oldIDAnhangRegelwerkBesondersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangRegelwerkBesonders() {
		Anhang oldIDAnhangRegelwerkBesonders = iDAnhangRegelwerkBesonders;
		boolean oldIDAnhangRegelwerkBesondersESet = iDAnhangRegelwerkBesondersESet;
		iDAnhangRegelwerkBesonders = null;
		iDAnhangRegelwerkBesondersESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS, oldIDAnhangRegelwerkBesonders, null, oldIDAnhangRegelwerkBesondersESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangRegelwerkBesonders() {
		return iDAnhangRegelwerkBesondersESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ:
				return basicSetBestandsschutz(null, msgs);
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS:
				return basicSetObjektzustandBesonders(null, msgs);
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK:
				return basicSetDatumRegelwerk(null, msgs);
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
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ:
				return getBestandsschutz();
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS:
				return getObjektzustandBesonders();
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK:
				return getDatumRegelwerk();
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS:
				if (resolve) return getIDAnhangRegelwerkBesonders();
				return basicGetIDAnhangRegelwerkBesonders();
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
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ:
				setBestandsschutz((Bestandsschutz_TypeClass)newValue);
				return;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS:
				setObjektzustandBesonders((Objektzustand_Besonders_TypeClass)newValue);
				return;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK:
				setDatumRegelwerk((Datum_Regelwerk_TypeClass)newValue);
				return;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS:
				setIDAnhangRegelwerkBesonders((Anhang)newValue);
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
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ:
				setBestandsschutz((Bestandsschutz_TypeClass)null);
				return;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS:
				setObjektzustandBesonders((Objektzustand_Besonders_TypeClass)null);
				return;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK:
				setDatumRegelwerk((Datum_Regelwerk_TypeClass)null);
				return;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS:
				unsetIDAnhangRegelwerkBesonders();
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
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__BESTANDSSCHUTZ:
				return bestandsschutz != null;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__OBJEKTZUSTAND_BESONDERS:
				return objektzustandBesonders != null;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__DATUM_REGELWERK:
				return datumRegelwerk != null;
			case BasisobjektePackage.BASIS_OBJEKT_ALLG_ATTRIBUTE_GROUP__ID_ANHANG_REGELWERK_BESONDERS:
				return isSetIDAnhangRegelwerkBesonders();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Basis_Objekt_Allg_AttributeGroupImpl
