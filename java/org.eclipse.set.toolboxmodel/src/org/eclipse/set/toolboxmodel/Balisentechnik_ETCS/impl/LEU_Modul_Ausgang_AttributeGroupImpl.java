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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Ausgang_Nr_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Port_Nr_Ausg_Physisch_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Modul Ausgang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Modul_Ausgang_AttributeGroupImpl#getIDBalise <em>ID Balise</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Modul_Ausgang_AttributeGroupImpl#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_Modul_Ausgang_AttributeGroupImpl#getPortNrAusgPhysisch <em>Port Nr Ausg Physisch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_Modul_Ausgang_AttributeGroupImpl extends MinimalEObjectImpl.Container implements LEU_Modul_Ausgang_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDBalise() <em>ID Balise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBalise()
	 * @generated
	 * @ordered
	 */
	protected Balise iDBalise;

	/**
	 * This is true if the ID Balise reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBaliseESet;

	/**
	 * The cached value of the '{@link #getLEUAusgangNr() <em>LEU Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUAusgangNr()
	 * @generated
	 * @ordered
	 */
	protected LEU_Ausgang_Nr_TypeClass lEUAusgangNr;

	/**
	 * The cached value of the '{@link #getPortNrAusgPhysisch() <em>Port Nr Ausg Physisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNrAusgPhysisch()
	 * @generated
	 * @ordered
	 */
	protected Port_Nr_Ausg_Physisch_TypeClass portNrAusgPhysisch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_Modul_Ausgang_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Modul_Ausgang_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise getIDBalise() {
		if (iDBalise != null && iDBalise.eIsProxy()) {
			InternalEObject oldIDBalise = (InternalEObject)iDBalise;
			iDBalise = (Balise)eResolveProxy(oldIDBalise);
			if (iDBalise != oldIDBalise) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, oldIDBalise, iDBalise));
			}
		}
		return iDBalise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balise basicGetIDBalise() {
		return iDBalise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBalise(Balise newIDBalise) {
		Balise oldIDBalise = iDBalise;
		iDBalise = newIDBalise;
		boolean oldIDBaliseESet = iDBaliseESet;
		iDBaliseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, oldIDBalise, iDBalise, !oldIDBaliseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBalise() {
		Balise oldIDBalise = iDBalise;
		boolean oldIDBaliseESet = iDBaliseESet;
		iDBalise = null;
		iDBaliseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE, oldIDBalise, null, oldIDBaliseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBalise() {
		return iDBaliseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Ausgang_Nr_TypeClass getLEUAusgangNr() {
		return lEUAusgangNr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUAusgangNr(LEU_Ausgang_Nr_TypeClass newLEUAusgangNr, NotificationChain msgs) {
		LEU_Ausgang_Nr_TypeClass oldLEUAusgangNr = lEUAusgangNr;
		lEUAusgangNr = newLEUAusgangNr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, oldLEUAusgangNr, newLEUAusgangNr);
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
	public void setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass newLEUAusgangNr) {
		if (newLEUAusgangNr != lEUAusgangNr) {
			NotificationChain msgs = null;
			if (lEUAusgangNr != null)
				msgs = ((InternalEObject)lEUAusgangNr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, null, msgs);
			if (newLEUAusgangNr != null)
				msgs = ((InternalEObject)newLEUAusgangNr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, null, msgs);
			msgs = basicSetLEUAusgangNr(newLEUAusgangNr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR, newLEUAusgangNr, newLEUAusgangNr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port_Nr_Ausg_Physisch_TypeClass getPortNrAusgPhysisch() {
		return portNrAusgPhysisch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortNrAusgPhysisch(Port_Nr_Ausg_Physisch_TypeClass newPortNrAusgPhysisch, NotificationChain msgs) {
		Port_Nr_Ausg_Physisch_TypeClass oldPortNrAusgPhysisch = portNrAusgPhysisch;
		portNrAusgPhysisch = newPortNrAusgPhysisch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, oldPortNrAusgPhysisch, newPortNrAusgPhysisch);
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
	public void setPortNrAusgPhysisch(Port_Nr_Ausg_Physisch_TypeClass newPortNrAusgPhysisch) {
		if (newPortNrAusgPhysisch != portNrAusgPhysisch) {
			NotificationChain msgs = null;
			if (portNrAusgPhysisch != null)
				msgs = ((InternalEObject)portNrAusgPhysisch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, null, msgs);
			if (newPortNrAusgPhysisch != null)
				msgs = ((InternalEObject)newPortNrAusgPhysisch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, null, msgs);
			msgs = basicSetPortNrAusgPhysisch(newPortNrAusgPhysisch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH, newPortNrAusgPhysisch, newPortNrAusgPhysisch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return basicSetLEUAusgangNr(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				return basicSetPortNrAusgPhysisch(null, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				if (resolve) return getIDBalise();
				return basicGetIDBalise();
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return getLEUAusgangNr();
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				return getPortNrAusgPhysisch();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				setIDBalise((Balise)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				setLEUAusgangNr((LEU_Ausgang_Nr_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				setPortNrAusgPhysisch((Port_Nr_Ausg_Physisch_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				unsetIDBalise();
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				setLEUAusgangNr((LEU_Ausgang_Nr_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				setPortNrAusgPhysisch((Port_Nr_Ausg_Physisch_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__ID_BALISE:
				return isSetIDBalise();
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__LEU_AUSGANG_NR:
				return lEUAusgangNr != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL_AUSGANG_ATTRIBUTE_GROUP__PORT_NR_AUSG_PHYSISCH:
				return portNrAusgPhysisch != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_Modul_Ausgang_AttributeGroupImpl
