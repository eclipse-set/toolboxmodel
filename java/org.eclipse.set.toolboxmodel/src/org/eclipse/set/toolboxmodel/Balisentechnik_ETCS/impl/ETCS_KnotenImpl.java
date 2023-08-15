/**
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

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.TOP_Knoten;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Knoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KnotenImpl#getIDTOPKnoten <em>IDTOP Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KnotenImpl#getKnotenAufTOPKante <em>Knoten Auf TOP Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_KnotenImpl extends Basis_ObjektImpl implements ETCS_Knoten {
	/**
	 * The cached value of the '{@link #getIDTOPKnoten() <em>IDTOP Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKnoten()
	 * @generated
	 * @ordered
	 */
	protected TOP_Knoten iDTOPKnoten;

	/**
	 * This is true if the IDTOP Knoten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDTOPKnotenESet;

	/**
	 * The cached value of the '{@link #getKnotenAufTOPKante() <em>Knoten Auf TOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKnotenAufTOPKante()
	 * @generated
	 * @ordered
	 */
	protected Knoten_Auf_TOP_Kante_AttributeGroup knotenAufTOPKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_KnotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Knoten();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Knoten getIDTOPKnoten() {
		if (iDTOPKnoten != null && iDTOPKnoten.eIsProxy()) {
			InternalEObject oldIDTOPKnoten = (InternalEObject)iDTOPKnoten;
			iDTOPKnoten = (TOP_Knoten)eResolveProxy(oldIDTOPKnoten);
			if (iDTOPKnoten != oldIDTOPKnoten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN, oldIDTOPKnoten, iDTOPKnoten));
			}
		}
		return iDTOPKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP_Knoten basicGetIDTOPKnoten() {
		return iDTOPKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDTOPKnoten(TOP_Knoten newIDTOPKnoten) {
		TOP_Knoten oldIDTOPKnoten = iDTOPKnoten;
		iDTOPKnoten = newIDTOPKnoten;
		boolean oldIDTOPKnotenESet = iDTOPKnotenESet;
		iDTOPKnotenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN, oldIDTOPKnoten, iDTOPKnoten, !oldIDTOPKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDTOPKnoten() {
		TOP_Knoten oldIDTOPKnoten = iDTOPKnoten;
		boolean oldIDTOPKnotenESet = iDTOPKnotenESet;
		iDTOPKnoten = null;
		iDTOPKnotenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN, oldIDTOPKnoten, null, oldIDTOPKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDTOPKnoten() {
		return iDTOPKnotenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Knoten_Auf_TOP_Kante_AttributeGroup getKnotenAufTOPKante() {
		return knotenAufTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnotenAufTOPKante(Knoten_Auf_TOP_Kante_AttributeGroup newKnotenAufTOPKante, NotificationChain msgs) {
		Knoten_Auf_TOP_Kante_AttributeGroup oldKnotenAufTOPKante = knotenAufTOPKante;
		knotenAufTOPKante = newKnotenAufTOPKante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE, oldKnotenAufTOPKante, newKnotenAufTOPKante);
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
	public void setKnotenAufTOPKante(Knoten_Auf_TOP_Kante_AttributeGroup newKnotenAufTOPKante) {
		if (newKnotenAufTOPKante != knotenAufTOPKante) {
			NotificationChain msgs = null;
			if (knotenAufTOPKante != null)
				msgs = ((InternalEObject)knotenAufTOPKante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE, null, msgs);
			if (newKnotenAufTOPKante != null)
				msgs = ((InternalEObject)newKnotenAufTOPKante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE, null, msgs);
			msgs = basicSetKnotenAufTOPKante(newKnotenAufTOPKante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE, newKnotenAufTOPKante, newKnotenAufTOPKante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE:
				return basicSetKnotenAufTOPKante(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN:
				if (resolve) return getIDTOPKnoten();
				return basicGetIDTOPKnoten();
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE:
				return getKnotenAufTOPKante();
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
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN:
				setIDTOPKnoten((TOP_Knoten)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE:
				setKnotenAufTOPKante((Knoten_Auf_TOP_Kante_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN:
				unsetIDTOPKnoten();
				return;
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE:
				setKnotenAufTOPKante((Knoten_Auf_TOP_Kante_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__IDTOP_KNOTEN:
				return isSetIDTOPKnoten();
			case Balisentechnik_ETCSPackage.ETCS_KNOTEN__KNOTEN_AUF_TOP_KANTE:
				return knotenAufTOPKante != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_KnotenImpl
