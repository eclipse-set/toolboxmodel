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

import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Begrenzung_A_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Begrenzung_B_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Richtungsbezug_TypeClass;

import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bereich Objekt Teilbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl#getBegrenzungA <em>Begrenzung A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl#getBegrenzungB <em>Begrenzung B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl#getIDTOPKante <em>IDTOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_Objekt_Teilbereich_AttributeGroupImpl#getRichtungsbezug <em>Richtungsbezug</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bereich_Objekt_Teilbereich_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bereich_Objekt_Teilbereich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBegrenzungA() <em>Begrenzung A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegrenzungA()
	 * @generated
	 * @ordered
	 */
	protected Begrenzung_A_TypeClass begrenzungA;

	/**
	 * The cached value of the '{@link #getBegrenzungB() <em>Begrenzung B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegrenzungB()
	 * @generated
	 * @ordered
	 */
	protected Begrenzung_B_TypeClass begrenzungB;

	/**
	 * The cached value of the '{@link #getIDTOPKante() <em>IDTOP Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKante()
	 * @generated
	 * @ordered
	 */
	protected TOP_Kante iDTOPKante;

	/**
	 * This is true if the IDTOP Kante reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDTOPKanteESet;

	/**
	 * The cached value of the '{@link #getRichtungsbezug() <em>Richtungsbezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRichtungsbezug()
	 * @generated
	 * @ordered
	 */
	protected Richtungsbezug_TypeClass richtungsbezug;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bereich_Objekt_Teilbereich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begrenzung_A_TypeClass getBegrenzungA() {
		return begrenzungA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegrenzungA(Begrenzung_A_TypeClass newBegrenzungA, NotificationChain msgs) {
		Begrenzung_A_TypeClass oldBegrenzungA = begrenzungA;
		begrenzungA = newBegrenzungA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A, oldBegrenzungA, newBegrenzungA);
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
	public void setBegrenzungA(Begrenzung_A_TypeClass newBegrenzungA) {
		if (newBegrenzungA != begrenzungA) {
			NotificationChain msgs = null;
			if (begrenzungA != null)
				msgs = ((InternalEObject)begrenzungA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A, null, msgs);
			if (newBegrenzungA != null)
				msgs = ((InternalEObject)newBegrenzungA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A, null, msgs);
			msgs = basicSetBegrenzungA(newBegrenzungA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A, newBegrenzungA, newBegrenzungA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begrenzung_B_TypeClass getBegrenzungB() {
		return begrenzungB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegrenzungB(Begrenzung_B_TypeClass newBegrenzungB, NotificationChain msgs) {
		Begrenzung_B_TypeClass oldBegrenzungB = begrenzungB;
		begrenzungB = newBegrenzungB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B, oldBegrenzungB, newBegrenzungB);
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
	public void setBegrenzungB(Begrenzung_B_TypeClass newBegrenzungB) {
		if (newBegrenzungB != begrenzungB) {
			NotificationChain msgs = null;
			if (begrenzungB != null)
				msgs = ((InternalEObject)begrenzungB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B, null, msgs);
			if (newBegrenzungB != null)
				msgs = ((InternalEObject)newBegrenzungB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B, null, msgs);
			msgs = basicSetBegrenzungB(newBegrenzungB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B, newBegrenzungB, newBegrenzungB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Kante getIDTOPKante() {
		if (iDTOPKante != null && iDTOPKante.eIsProxy()) {
			InternalEObject oldIDTOPKante = (InternalEObject)iDTOPKante;
			iDTOPKante = (TOP_Kante)eResolveProxy(oldIDTOPKante);
			if (iDTOPKante != oldIDTOPKante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE, oldIDTOPKante, iDTOPKante));
			}
		}
		return iDTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP_Kante basicGetIDTOPKante() {
		return iDTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDTOPKante(TOP_Kante newIDTOPKante) {
		TOP_Kante oldIDTOPKante = iDTOPKante;
		iDTOPKante = newIDTOPKante;
		boolean oldIDTOPKanteESet = iDTOPKanteESet;
		iDTOPKanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE, oldIDTOPKante, iDTOPKante, !oldIDTOPKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDTOPKante() {
		TOP_Kante oldIDTOPKante = iDTOPKante;
		boolean oldIDTOPKanteESet = iDTOPKanteESet;
		iDTOPKante = null;
		iDTOPKanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE, oldIDTOPKante, null, oldIDTOPKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDTOPKante() {
		return iDTOPKanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Richtungsbezug_TypeClass getRichtungsbezug() {
		return richtungsbezug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRichtungsbezug(Richtungsbezug_TypeClass newRichtungsbezug, NotificationChain msgs) {
		Richtungsbezug_TypeClass oldRichtungsbezug = richtungsbezug;
		richtungsbezug = newRichtungsbezug;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG, oldRichtungsbezug, newRichtungsbezug);
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
	public void setRichtungsbezug(Richtungsbezug_TypeClass newRichtungsbezug) {
		if (newRichtungsbezug != richtungsbezug) {
			NotificationChain msgs = null;
			if (richtungsbezug != null)
				msgs = ((InternalEObject)richtungsbezug).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG, null, msgs);
			if (newRichtungsbezug != null)
				msgs = ((InternalEObject)newRichtungsbezug).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG, null, msgs);
			msgs = basicSetRichtungsbezug(newRichtungsbezug, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG, newRichtungsbezug, newRichtungsbezug));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A:
				return basicSetBegrenzungA(null, msgs);
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B:
				return basicSetBegrenzungB(null, msgs);
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG:
				return basicSetRichtungsbezug(null, msgs);
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
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A:
				return getBegrenzungA();
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B:
				return getBegrenzungB();
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE:
				if (resolve) return getIDTOPKante();
				return basicGetIDTOPKante();
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG:
				return getRichtungsbezug();
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
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A:
				setBegrenzungA((Begrenzung_A_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B:
				setBegrenzungB((Begrenzung_B_TypeClass)newValue);
				return;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE:
				setIDTOPKante((TOP_Kante)newValue);
				return;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG:
				setRichtungsbezug((Richtungsbezug_TypeClass)newValue);
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
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A:
				setBegrenzungA((Begrenzung_A_TypeClass)null);
				return;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B:
				setBegrenzungB((Begrenzung_B_TypeClass)null);
				return;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE:
				unsetIDTOPKante();
				return;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG:
				setRichtungsbezug((Richtungsbezug_TypeClass)null);
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
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_A:
				return begrenzungA != null;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__BEGRENZUNG_B:
				return begrenzungB != null;
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__IDTOP_KANTE:
				return isSetIDTOPKante();
			case BasisobjektePackage.BEREICH_OBJEKT_TEILBEREICH_ATTRIBUTE_GROUP__RICHTUNGSBEZUG:
				return richtungsbezug != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bereich_Objekt_Teilbereich_AttributeGroupImpl
