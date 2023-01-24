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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten_Position_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Position_Sonstige_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Position_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Schaltkasten Position Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Position_AttributeGroupImpl#getIDBezugspunktPositionierung <em>ID Bezugspunkt Positionierung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Position_AttributeGroupImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Schaltkasten_Position_AttributeGroupImpl#getPositionSonstige <em>Position Sonstige</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Schaltkasten_Position_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Schaltkasten_Position_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBezugspunktPositionierung() <em>ID Bezugspunkt Positionierung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBezugspunktPositionierung()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDBezugspunktPositionierung;

	/**
	 * This is true if the ID Bezugspunkt Positionierung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBezugspunktPositionierungESet;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position_TypeClass position;

	/**
	 * The cached value of the '{@link #getPositionSonstige() <em>Position Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionSonstige()
	 * @generated
	 * @ordered
	 */
	protected Position_Sonstige_TypeClass positionSonstige;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Schaltkasten_Position_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Schaltkasten_Position_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDBezugspunktPositionierung() {
		if (iDBezugspunktPositionierung != null && iDBezugspunktPositionierung.eIsProxy()) {
			InternalEObject oldIDBezugspunktPositionierung = (InternalEObject)iDBezugspunktPositionierung;
			iDBezugspunktPositionierung = (Basis_Objekt)eResolveProxy(oldIDBezugspunktPositionierung);
			if (iDBezugspunktPositionierung != oldIDBezugspunktPositionierung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, oldIDBezugspunktPositionierung, iDBezugspunktPositionierung));
			}
		}
		return iDBezugspunktPositionierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDBezugspunktPositionierung() {
		return iDBezugspunktPositionierung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBezugspunktPositionierung(Basis_Objekt newIDBezugspunktPositionierung) {
		Basis_Objekt oldIDBezugspunktPositionierung = iDBezugspunktPositionierung;
		iDBezugspunktPositionierung = newIDBezugspunktPositionierung;
		boolean oldIDBezugspunktPositionierungESet = iDBezugspunktPositionierungESet;
		iDBezugspunktPositionierungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, oldIDBezugspunktPositionierung, iDBezugspunktPositionierung, !oldIDBezugspunktPositionierungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBezugspunktPositionierung() {
		Basis_Objekt oldIDBezugspunktPositionierung = iDBezugspunktPositionierung;
		boolean oldIDBezugspunktPositionierungESet = iDBezugspunktPositionierungESet;
		iDBezugspunktPositionierung = null;
		iDBezugspunktPositionierungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG, oldIDBezugspunktPositionierung, null, oldIDBezugspunktPositionierungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBezugspunktPositionierung() {
		return iDBezugspunktPositionierungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_TypeClass getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position_TypeClass newPosition, NotificationChain msgs) {
		Position_TypeClass oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, oldPosition, newPosition);
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
	public void setPosition(Position_TypeClass newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject)position).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject)newPosition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION, newPosition, newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position_Sonstige_TypeClass getPositionSonstige() {
		return positionSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionSonstige(Position_Sonstige_TypeClass newPositionSonstige, NotificationChain msgs) {
		Position_Sonstige_TypeClass oldPositionSonstige = positionSonstige;
		positionSonstige = newPositionSonstige;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, oldPositionSonstige, newPositionSonstige);
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
	public void setPositionSonstige(Position_Sonstige_TypeClass newPositionSonstige) {
		if (newPositionSonstige != positionSonstige) {
			NotificationChain msgs = null;
			if (positionSonstige != null)
				msgs = ((InternalEObject)positionSonstige).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, null, msgs);
			if (newPositionSonstige != null)
				msgs = ((InternalEObject)newPositionSonstige).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, null, msgs);
			msgs = basicSetPositionSonstige(newPositionSonstige, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE, newPositionSonstige, newPositionSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				return basicSetPosition(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				return basicSetPositionSonstige(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				if (resolve) return getIDBezugspunktPositionierung();
				return basicGetIDBezugspunktPositionierung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				return getPosition();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				return getPositionSonstige();
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				setIDBezugspunktPositionierung((Basis_Objekt)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				setPosition((Position_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				setPositionSonstige((Position_Sonstige_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				unsetIDBezugspunktPositionierung();
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				setPosition((Position_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				setPositionSonstige((Position_Sonstige_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__ID_BEZUGSPUNKT_POSITIONIERUNG:
				return isSetIDBezugspunktPositionierung();
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION:
				return position != null;
			case Balisentechnik_ETCSPackage.LEU_SCHALTKASTEN_POSITION_ATTRIBUTE_GROUP__POSITION_SONSTIGE:
				return positionSonstige != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Schaltkasten_Position_AttributeGroupImpl
