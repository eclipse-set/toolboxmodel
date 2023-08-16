/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Einrichtung_Oertlich;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Anzeige Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Anzeige_ElementImpl#getBedienAnzeigeElementAllg <em>Bedien Anzeige Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Anzeige_ElementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Anzeige_ElementImpl#getIDBedienEinrichtungOertlich <em>ID Bedien Einrichtung Oertlich</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Anzeige_ElementImpl#getIDVerknuepftesElement <em>ID Verknuepftes Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Anzeige_ElementImpl extends Basis_ObjektImpl implements Bedien_Anzeige_Element {
	/**
	 * The cached value of the '{@link #getBedienAnzeigeElementAllg() <em>Bedien Anzeige Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienAnzeigeElementAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element_Allg_AttributeGroup bedienAnzeigeElementAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBedienEinrichtungOertlich() <em>ID Bedien Einrichtung Oertlich</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienEinrichtungOertlich()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Einrichtung_Oertlich iDBedienEinrichtungOertlich;

	/**
	 * This is true if the ID Bedien Einrichtung Oertlich reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienEinrichtungOertlichESet;

	/**
	 * The cached value of the '{@link #getIDVerknuepftesElement() <em>ID Verknuepftes Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDVerknuepftesElement()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDVerknuepftesElement;

	/**
	 * This is true if the ID Verknuepftes Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDVerknuepftesElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Anzeige_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_ANZEIGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element_Allg_AttributeGroup getBedienAnzeigeElementAllg() {
		return bedienAnzeigeElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienAnzeigeElementAllg(Bedien_Anzeige_Element_Allg_AttributeGroup newBedienAnzeigeElementAllg, NotificationChain msgs) {
		Bedien_Anzeige_Element_Allg_AttributeGroup oldBedienAnzeigeElementAllg = bedienAnzeigeElementAllg;
		bedienAnzeigeElementAllg = newBedienAnzeigeElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, oldBedienAnzeigeElementAllg, newBedienAnzeigeElementAllg);
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
	public void setBedienAnzeigeElementAllg(Bedien_Anzeige_Element_Allg_AttributeGroup newBedienAnzeigeElementAllg) {
		if (newBedienAnzeigeElementAllg != bedienAnzeigeElementAllg) {
			NotificationChain msgs = null;
			if (bedienAnzeigeElementAllg != null)
				msgs = ((InternalEObject)bedienAnzeigeElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, null, msgs);
			if (newBedienAnzeigeElementAllg != null)
				msgs = ((InternalEObject)newBedienAnzeigeElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, null, msgs);
			msgs = basicSetBedienAnzeigeElementAllg(newBedienAnzeigeElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG, newBedienAnzeigeElementAllg, newBedienAnzeigeElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bedien_Anzeige_Element_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bedien_Anzeige_Element_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Einrichtung_Oertlich getIDBedienEinrichtungOertlich() {
		if (iDBedienEinrichtungOertlich != null && iDBedienEinrichtungOertlich.eIsProxy()) {
			InternalEObject oldIDBedienEinrichtungOertlich = (InternalEObject)iDBedienEinrichtungOertlich;
			iDBedienEinrichtungOertlich = (Bedien_Einrichtung_Oertlich)eResolveProxy(oldIDBedienEinrichtungOertlich);
			if (iDBedienEinrichtungOertlich != oldIDBedienEinrichtungOertlich) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, oldIDBedienEinrichtungOertlich, iDBedienEinrichtungOertlich));
			}
		}
		return iDBedienEinrichtungOertlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Einrichtung_Oertlich basicGetIDBedienEinrichtungOertlich() {
		return iDBedienEinrichtungOertlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienEinrichtungOertlich(Bedien_Einrichtung_Oertlich newIDBedienEinrichtungOertlich) {
		Bedien_Einrichtung_Oertlich oldIDBedienEinrichtungOertlich = iDBedienEinrichtungOertlich;
		iDBedienEinrichtungOertlich = newIDBedienEinrichtungOertlich;
		boolean oldIDBedienEinrichtungOertlichESet = iDBedienEinrichtungOertlichESet;
		iDBedienEinrichtungOertlichESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, oldIDBedienEinrichtungOertlich, iDBedienEinrichtungOertlich, !oldIDBedienEinrichtungOertlichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienEinrichtungOertlich() {
		Bedien_Einrichtung_Oertlich oldIDBedienEinrichtungOertlich = iDBedienEinrichtungOertlich;
		boolean oldIDBedienEinrichtungOertlichESet = iDBedienEinrichtungOertlichESet;
		iDBedienEinrichtungOertlich = null;
		iDBedienEinrichtungOertlichESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH, oldIDBedienEinrichtungOertlich, null, oldIDBedienEinrichtungOertlichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienEinrichtungOertlich() {
		return iDBedienEinrichtungOertlichESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDVerknuepftesElement() {
		if (iDVerknuepftesElement != null && iDVerknuepftesElement.eIsProxy()) {
			InternalEObject oldIDVerknuepftesElement = (InternalEObject)iDVerknuepftesElement;
			iDVerknuepftesElement = (Basis_Objekt)eResolveProxy(oldIDVerknuepftesElement);
			if (iDVerknuepftesElement != oldIDVerknuepftesElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, oldIDVerknuepftesElement, iDVerknuepftesElement));
			}
		}
		return iDVerknuepftesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDVerknuepftesElement() {
		return iDVerknuepftesElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDVerknuepftesElement(Basis_Objekt newIDVerknuepftesElement) {
		Basis_Objekt oldIDVerknuepftesElement = iDVerknuepftesElement;
		iDVerknuepftesElement = newIDVerknuepftesElement;
		boolean oldIDVerknuepftesElementESet = iDVerknuepftesElementESet;
		iDVerknuepftesElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, oldIDVerknuepftesElement, iDVerknuepftesElement, !oldIDVerknuepftesElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDVerknuepftesElement() {
		Basis_Objekt oldIDVerknuepftesElement = iDVerknuepftesElement;
		boolean oldIDVerknuepftesElementESet = iDVerknuepftesElementESet;
		iDVerknuepftesElement = null;
		iDVerknuepftesElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT, oldIDVerknuepftesElement, null, oldIDVerknuepftesElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDVerknuepftesElement() {
		return iDVerknuepftesElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				return basicSetBedienAnzeigeElementAllg(null, msgs);
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				return getBedienAnzeigeElementAllg();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				return getBezeichnung();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				if (resolve) return getIDBedienEinrichtungOertlich();
				return basicGetIDBedienEinrichtungOertlich();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				if (resolve) return getIDVerknuepftesElement();
				return basicGetIDVerknuepftesElement();
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				setBedienAnzeigeElementAllg((Bedien_Anzeige_Element_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				setIDBedienEinrichtungOertlich((Bedien_Einrichtung_Oertlich)newValue);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				setIDVerknuepftesElement((Basis_Objekt)newValue);
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				setBedienAnzeigeElementAllg((Bedien_Anzeige_Element_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bedien_Anzeige_Element_Bezeichnung_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				unsetIDBedienEinrichtungOertlich();
				return;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				unsetIDVerknuepftesElement();
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
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEDIEN_ANZEIGE_ELEMENT_ALLG:
				return bedienAnzeigeElementAllg != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__BEZEICHNUNG:
				return bezeichnung != null;
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_EINRICHTUNG_OERTLICH:
				return isSetIDBedienEinrichtungOertlich();
			case BedienungPackage.BEDIEN_ANZEIGE_ELEMENT__ID_VERKNUEPFTES_ELEMENT:
				return isSetIDVerknuepftesElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Anzeige_ElementImpl
