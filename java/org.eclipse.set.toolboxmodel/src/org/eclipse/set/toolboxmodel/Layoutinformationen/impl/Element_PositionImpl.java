/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Layoutinformationen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.toolboxmodel.Layoutinformationen.Element_Position;
import org.eclipse.set.toolboxmodel.Layoutinformationen.Element_Position_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Layoutinformationen.Lageplan_Zustand;
import org.eclipse.set.toolboxmodel.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.toolboxmodel.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.impl.Element_PositionImpl#getElementPositionAllg <em>Element Position Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.impl.Element_PositionImpl#getIDLageplanZustand <em>ID Lageplan Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Layoutinformationen.impl.Element_PositionImpl#getReferenzObjektDarstellung <em>Referenz Objekt Darstellung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Element_PositionImpl extends Ur_ObjektImpl implements Element_Position {
	/**
	 * The cached value of the '{@link #getElementPositionAllg() <em>Element Position Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementPositionAllg()
	 * @generated
	 * @ordered
	 */
	protected Element_Position_Allg_AttributeGroup elementPositionAllg;

	/**
	 * The cached value of the '{@link #getIDLageplanZustand() <em>ID Lageplan Zustand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLageplanZustand()
	 * @generated
	 * @ordered
	 */
	protected EList<Lageplan_Zustand> iDLageplanZustand;

	/**
	 * The cached value of the '{@link #getReferenzObjektDarstellung() <em>Referenz Objekt Darstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenzObjektDarstellung()
	 * @generated
	 * @ordered
	 */
	protected Referenz_Objekt_Darstellung_TypeClass referenzObjektDarstellung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Element_PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LayoutinformationenPackage.Literals.ELEMENT_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Position_Allg_AttributeGroup getElementPositionAllg() {
		return elementPositionAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementPositionAllg(Element_Position_Allg_AttributeGroup newElementPositionAllg, NotificationChain msgs) {
		Element_Position_Allg_AttributeGroup oldElementPositionAllg = elementPositionAllg;
		elementPositionAllg = newElementPositionAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG, oldElementPositionAllg, newElementPositionAllg);
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
	public void setElementPositionAllg(Element_Position_Allg_AttributeGroup newElementPositionAllg) {
		if (newElementPositionAllg != elementPositionAllg) {
			NotificationChain msgs = null;
			if (elementPositionAllg != null)
				msgs = ((InternalEObject)elementPositionAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG, null, msgs);
			if (newElementPositionAllg != null)
				msgs = ((InternalEObject)newElementPositionAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG, null, msgs);
			msgs = basicSetElementPositionAllg(newElementPositionAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG, newElementPositionAllg, newElementPositionAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lageplan_Zustand> getIDLageplanZustand() {
		if (iDLageplanZustand == null) {
			iDLageplanZustand = new EObjectResolvingEList<Lageplan_Zustand>(Lageplan_Zustand.class, this, LayoutinformationenPackage.ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND);
		}
		return iDLageplanZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_Objekt_Darstellung_TypeClass getReferenzObjektDarstellung() {
		return referenzObjektDarstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenzObjektDarstellung(Referenz_Objekt_Darstellung_TypeClass newReferenzObjektDarstellung, NotificationChain msgs) {
		Referenz_Objekt_Darstellung_TypeClass oldReferenzObjektDarstellung = referenzObjektDarstellung;
		referenzObjektDarstellung = newReferenzObjektDarstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG, oldReferenzObjektDarstellung, newReferenzObjektDarstellung);
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
	public void setReferenzObjektDarstellung(Referenz_Objekt_Darstellung_TypeClass newReferenzObjektDarstellung) {
		if (newReferenzObjektDarstellung != referenzObjektDarstellung) {
			NotificationChain msgs = null;
			if (referenzObjektDarstellung != null)
				msgs = ((InternalEObject)referenzObjektDarstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG, null, msgs);
			if (newReferenzObjektDarstellung != null)
				msgs = ((InternalEObject)newReferenzObjektDarstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG, null, msgs);
			msgs = basicSetReferenzObjektDarstellung(newReferenzObjektDarstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG, newReferenzObjektDarstellung, newReferenzObjektDarstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG:
				return basicSetElementPositionAllg(null, msgs);
			case LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG:
				return basicSetReferenzObjektDarstellung(null, msgs);
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
			case LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG:
				return getElementPositionAllg();
			case LayoutinformationenPackage.ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND:
				return getIDLageplanZustand();
			case LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG:
				return getReferenzObjektDarstellung();
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
			case LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG:
				setElementPositionAllg((Element_Position_Allg_AttributeGroup)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND:
				getIDLageplanZustand().clear();
				getIDLageplanZustand().addAll((Collection<? extends Lageplan_Zustand>)newValue);
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG:
				setReferenzObjektDarstellung((Referenz_Objekt_Darstellung_TypeClass)newValue);
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
			case LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG:
				setElementPositionAllg((Element_Position_Allg_AttributeGroup)null);
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND:
				getIDLageplanZustand().clear();
				return;
			case LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG:
				setReferenzObjektDarstellung((Referenz_Objekt_Darstellung_TypeClass)null);
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
			case LayoutinformationenPackage.ELEMENT_POSITION__ELEMENT_POSITION_ALLG:
				return elementPositionAllg != null;
			case LayoutinformationenPackage.ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND:
				return iDLageplanZustand != null && !iDLageplanZustand.isEmpty();
			case LayoutinformationenPackage.ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG:
				return referenzObjektDarstellung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Element_PositionImpl
