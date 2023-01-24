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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Anlage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LEU_Schaltkasten;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LEU Modul</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_ModulImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_ModulImpl#getIDInformationEingang <em>ID Information Eingang</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_ModulImpl#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_ModulImpl#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_ModulImpl#getLEUModulAllg <em>LEU Modul Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.LEU_ModulImpl#getLEUModulAusgang <em>LEU Modul Ausgang</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEU_ModulImpl extends Basis_ObjektImpl implements LEU_Modul {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDInformationEingang() <em>ID Information Eingang</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformationEingang()
	 * @generated
	 * @ordered
	 */
	protected EList<Basis_Objekt> iDInformationEingang;

	/**
	 * The cached value of the '{@link #getIDLEUAnlage() <em>IDLEU Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUAnlage()
	 * @generated
	 * @ordered
	 */
	protected LEU_Anlage iDLEUAnlage;

	/**
	 * This is true if the IDLEU Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDLEUAnlageESet;

	/**
	 * The cached value of the '{@link #getIDLEUSchaltkasten() <em>IDLEU Schaltkasten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDLEUSchaltkasten()
	 * @generated
	 * @ordered
	 */
	protected LEU_Schaltkasten iDLEUSchaltkasten;

	/**
	 * This is true if the IDLEU Schaltkasten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDLEUSchaltkastenESet;

	/**
	 * The cached value of the '{@link #getLEUModulAllg() <em>LEU Modul Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulAllg()
	 * @generated
	 * @ordered
	 */
	protected LEU_Modul_Allg_AttributeGroup lEUModulAllg;

	/**
	 * The cached value of the '{@link #getLEUModulAusgang() <em>LEU Modul Ausgang</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEUModulAusgang()
	 * @generated
	 * @ordered
	 */
	protected EList<LEU_Modul_Ausgang_AttributeGroup> lEUModulAusgang;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEU_ModulImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLEU_Modul();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		LEU_Modul_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Basis_Objekt> getIDInformationEingang() {
		if (iDInformationEingang == null) {
			iDInformationEingang = new EObjectResolvingEList<Basis_Objekt>(Basis_Objekt.class, this, Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG);
		}
		return iDInformationEingang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Anlage getIDLEUAnlage() {
		if (iDLEUAnlage != null && iDLEUAnlage.eIsProxy()) {
			InternalEObject oldIDLEUAnlage = (InternalEObject)iDLEUAnlage;
			iDLEUAnlage = (LEU_Anlage)eResolveProxy(oldIDLEUAnlage);
			if (iDLEUAnlage != oldIDLEUAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, oldIDLEUAnlage, iDLEUAnlage));
			}
		}
		return iDLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEU_Anlage basicGetIDLEUAnlage() {
		return iDLEUAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDLEUAnlage(LEU_Anlage newIDLEUAnlage) {
		LEU_Anlage oldIDLEUAnlage = iDLEUAnlage;
		iDLEUAnlage = newIDLEUAnlage;
		boolean oldIDLEUAnlageESet = iDLEUAnlageESet;
		iDLEUAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, oldIDLEUAnlage, iDLEUAnlage, !oldIDLEUAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDLEUAnlage() {
		LEU_Anlage oldIDLEUAnlage = iDLEUAnlage;
		boolean oldIDLEUAnlageESet = iDLEUAnlageESet;
		iDLEUAnlage = null;
		iDLEUAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE, oldIDLEUAnlage, null, oldIDLEUAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDLEUAnlage() {
		return iDLEUAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Schaltkasten getIDLEUSchaltkasten() {
		if (iDLEUSchaltkasten != null && iDLEUSchaltkasten.eIsProxy()) {
			InternalEObject oldIDLEUSchaltkasten = (InternalEObject)iDLEUSchaltkasten;
			iDLEUSchaltkasten = (LEU_Schaltkasten)eResolveProxy(oldIDLEUSchaltkasten);
			if (iDLEUSchaltkasten != oldIDLEUSchaltkasten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, oldIDLEUSchaltkasten, iDLEUSchaltkasten));
			}
		}
		return iDLEUSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LEU_Schaltkasten basicGetIDLEUSchaltkasten() {
		return iDLEUSchaltkasten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDLEUSchaltkasten(LEU_Schaltkasten newIDLEUSchaltkasten) {
		LEU_Schaltkasten oldIDLEUSchaltkasten = iDLEUSchaltkasten;
		iDLEUSchaltkasten = newIDLEUSchaltkasten;
		boolean oldIDLEUSchaltkastenESet = iDLEUSchaltkastenESet;
		iDLEUSchaltkastenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, oldIDLEUSchaltkasten, iDLEUSchaltkasten, !oldIDLEUSchaltkastenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDLEUSchaltkasten() {
		LEU_Schaltkasten oldIDLEUSchaltkasten = iDLEUSchaltkasten;
		boolean oldIDLEUSchaltkastenESet = iDLEUSchaltkastenESet;
		iDLEUSchaltkasten = null;
		iDLEUSchaltkastenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN, oldIDLEUSchaltkasten, null, oldIDLEUSchaltkastenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDLEUSchaltkasten() {
		return iDLEUSchaltkastenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LEU_Modul_Allg_AttributeGroup getLEUModulAllg() {
		return lEUModulAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLEUModulAllg(LEU_Modul_Allg_AttributeGroup newLEUModulAllg, NotificationChain msgs) {
		LEU_Modul_Allg_AttributeGroup oldLEUModulAllg = lEUModulAllg;
		lEUModulAllg = newLEUModulAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, oldLEUModulAllg, newLEUModulAllg);
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
	public void setLEUModulAllg(LEU_Modul_Allg_AttributeGroup newLEUModulAllg) {
		if (newLEUModulAllg != lEUModulAllg) {
			NotificationChain msgs = null;
			if (lEUModulAllg != null)
				msgs = ((InternalEObject)lEUModulAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, null, msgs);
			if (newLEUModulAllg != null)
				msgs = ((InternalEObject)newLEUModulAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, null, msgs);
			msgs = basicSetLEUModulAllg(newLEUModulAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG, newLEUModulAllg, newLEUModulAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LEU_Modul_Ausgang_AttributeGroup> getLEUModulAusgang() {
		if (lEUModulAusgang == null) {
			lEUModulAusgang = new EObjectContainmentEList<LEU_Modul_Ausgang_AttributeGroup>(LEU_Modul_Ausgang_AttributeGroup.class, this, Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG);
		}
		return lEUModulAusgang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				return basicSetLEUModulAllg(null, msgs);
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				return ((InternalEList<?>)getLEUModulAusgang()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				return getIDInformationEingang();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				if (resolve) return getIDLEUAnlage();
				return basicGetIDLEUAnlage();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				if (resolve) return getIDLEUSchaltkasten();
				return basicGetIDLEUSchaltkasten();
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				return getLEUModulAllg();
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				return getLEUModulAusgang();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				setBezeichnung((LEU_Modul_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				getIDInformationEingang().clear();
				getIDInformationEingang().addAll((Collection<? extends Basis_Objekt>)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				setIDLEUAnlage((LEU_Anlage)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				setIDLEUSchaltkasten((LEU_Schaltkasten)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				setLEUModulAllg((LEU_Modul_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				getLEUModulAusgang().clear();
				getLEUModulAusgang().addAll((Collection<? extends LEU_Modul_Ausgang_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				setBezeichnung((LEU_Modul_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				getIDInformationEingang().clear();
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				unsetIDLEUAnlage();
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				unsetIDLEUSchaltkasten();
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				setLEUModulAllg((LEU_Modul_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				getLEUModulAusgang().clear();
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
			case Balisentechnik_ETCSPackage.LEU_MODUL__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL__ID_INFORMATION_EINGANG:
				return iDInformationEingang != null && !iDInformationEingang.isEmpty();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_ANLAGE:
				return isSetIDLEUAnlage();
			case Balisentechnik_ETCSPackage.LEU_MODUL__IDLEU_SCHALTKASTEN:
				return isSetIDLEUSchaltkasten();
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_ALLG:
				return lEUModulAllg != null;
			case Balisentechnik_ETCSPackage.LEU_MODUL__LEU_MODUL_AUSGANG:
				return lEUModulAusgang != null && !lEUModulAusgang.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //LEU_ModulImpl
