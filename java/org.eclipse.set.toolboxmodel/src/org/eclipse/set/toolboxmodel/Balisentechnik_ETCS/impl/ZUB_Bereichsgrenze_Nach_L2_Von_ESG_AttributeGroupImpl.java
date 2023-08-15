/**
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Abstand_Datenpunkt_EP_TPI_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Abstand_Datenpunkt_TPI_Folgesignal_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach L2 Von ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getAbstandDatenpunktEHEMFolgesignal <em>Abstand Datenpunkt EHEM Folgesignal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getAbstandDatenpunktEPTPI <em>Abstand Datenpunkt EPTPI</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getAbstandDatenpunktTPIFolgesignal <em>Abstand Datenpunkt TPI Folgesignal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl#getIDFolgesignal <em>ID Folgesignal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandDatenpunktEHEMFolgesignal() <em>Abstand Datenpunkt EHEM Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandDatenpunktEHEMFolgesignal()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass abstandDatenpunktEHEMFolgesignal;

	/**
	 * The cached value of the '{@link #getAbstandDatenpunktEPTPI() <em>Abstand Datenpunkt EPTPI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandDatenpunktEPTPI()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Datenpunkt_EP_TPI_TypeClass abstandDatenpunktEPTPI;

	/**
	 * The cached value of the '{@link #getAbstandDatenpunktTPIFolgesignal() <em>Abstand Datenpunkt TPI Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandDatenpunktTPIFolgesignal()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Datenpunkt_TPI_Folgesignal_TypeClass abstandDatenpunktTPIFolgesignal;

	/**
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected EList<Fachtelegramm> iDFachtelegramm;

	/**
	 * The cached value of the '{@link #getIDFolgesignal() <em>ID Folgesignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFolgesignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDFolgesignal;

	/**
	 * This is true if the ID Folgesignal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFolgesignalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass getAbstandDatenpunktEHEMFolgesignal() {
		return abstandDatenpunktEHEMFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandDatenpunktEHEMFolgesignal(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass newAbstandDatenpunktEHEMFolgesignal, NotificationChain msgs) {
		Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass oldAbstandDatenpunktEHEMFolgesignal = abstandDatenpunktEHEMFolgesignal;
		abstandDatenpunktEHEMFolgesignal = newAbstandDatenpunktEHEMFolgesignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, oldAbstandDatenpunktEHEMFolgesignal, newAbstandDatenpunktEHEMFolgesignal);
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
	public void setAbstandDatenpunktEHEMFolgesignal(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass newAbstandDatenpunktEHEMFolgesignal) {
		if (newAbstandDatenpunktEHEMFolgesignal != abstandDatenpunktEHEMFolgesignal) {
			NotificationChain msgs = null;
			if (abstandDatenpunktEHEMFolgesignal != null)
				msgs = ((InternalEObject)abstandDatenpunktEHEMFolgesignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, null, msgs);
			if (newAbstandDatenpunktEHEMFolgesignal != null)
				msgs = ((InternalEObject)newAbstandDatenpunktEHEMFolgesignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, null, msgs);
			msgs = basicSetAbstandDatenpunktEHEMFolgesignal(newAbstandDatenpunktEHEMFolgesignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL, newAbstandDatenpunktEHEMFolgesignal, newAbstandDatenpunktEHEMFolgesignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_EP_TPI_TypeClass getAbstandDatenpunktEPTPI() {
		return abstandDatenpunktEPTPI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandDatenpunktEPTPI(Abstand_Datenpunkt_EP_TPI_TypeClass newAbstandDatenpunktEPTPI, NotificationChain msgs) {
		Abstand_Datenpunkt_EP_TPI_TypeClass oldAbstandDatenpunktEPTPI = abstandDatenpunktEPTPI;
		abstandDatenpunktEPTPI = newAbstandDatenpunktEPTPI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, oldAbstandDatenpunktEPTPI, newAbstandDatenpunktEPTPI);
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
	public void setAbstandDatenpunktEPTPI(Abstand_Datenpunkt_EP_TPI_TypeClass newAbstandDatenpunktEPTPI) {
		if (newAbstandDatenpunktEPTPI != abstandDatenpunktEPTPI) {
			NotificationChain msgs = null;
			if (abstandDatenpunktEPTPI != null)
				msgs = ((InternalEObject)abstandDatenpunktEPTPI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, null, msgs);
			if (newAbstandDatenpunktEPTPI != null)
				msgs = ((InternalEObject)newAbstandDatenpunktEPTPI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, null, msgs);
			msgs = basicSetAbstandDatenpunktEPTPI(newAbstandDatenpunktEPTPI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI, newAbstandDatenpunktEPTPI, newAbstandDatenpunktEPTPI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Datenpunkt_TPI_Folgesignal_TypeClass getAbstandDatenpunktTPIFolgesignal() {
		return abstandDatenpunktTPIFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandDatenpunktTPIFolgesignal(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass newAbstandDatenpunktTPIFolgesignal, NotificationChain msgs) {
		Abstand_Datenpunkt_TPI_Folgesignal_TypeClass oldAbstandDatenpunktTPIFolgesignal = abstandDatenpunktTPIFolgesignal;
		abstandDatenpunktTPIFolgesignal = newAbstandDatenpunktTPIFolgesignal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, oldAbstandDatenpunktTPIFolgesignal, newAbstandDatenpunktTPIFolgesignal);
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
	public void setAbstandDatenpunktTPIFolgesignal(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass newAbstandDatenpunktTPIFolgesignal) {
		if (newAbstandDatenpunktTPIFolgesignal != abstandDatenpunktTPIFolgesignal) {
			NotificationChain msgs = null;
			if (abstandDatenpunktTPIFolgesignal != null)
				msgs = ((InternalEObject)abstandDatenpunktTPIFolgesignal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, null, msgs);
			if (newAbstandDatenpunktTPIFolgesignal != null)
				msgs = ((InternalEObject)newAbstandDatenpunktTPIFolgesignal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, null, msgs);
			msgs = basicSetAbstandDatenpunktTPIFolgesignal(newAbstandDatenpunktTPIFolgesignal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL, newAbstandDatenpunktTPIFolgesignal, newAbstandDatenpunktTPIFolgesignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Fachtelegramm> getIDFachtelegramm() {
		if (iDFachtelegramm == null) {
			iDFachtelegramm = new EObjectResolvingEList<Fachtelegramm>(Fachtelegramm.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM);
		}
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDFolgesignal() {
		if (iDFolgesignal != null && iDFolgesignal.eIsProxy()) {
			InternalEObject oldIDFolgesignal = (InternalEObject)iDFolgesignal;
			iDFolgesignal = (Signal)eResolveProxy(oldIDFolgesignal);
			if (iDFolgesignal != oldIDFolgesignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, oldIDFolgesignal, iDFolgesignal));
			}
		}
		return iDFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDFolgesignal() {
		return iDFolgesignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFolgesignal(Signal newIDFolgesignal) {
		Signal oldIDFolgesignal = iDFolgesignal;
		iDFolgesignal = newIDFolgesignal;
		boolean oldIDFolgesignalESet = iDFolgesignalESet;
		iDFolgesignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, oldIDFolgesignal, iDFolgesignal, !oldIDFolgesignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFolgesignal() {
		Signal oldIDFolgesignal = iDFolgesignal;
		boolean oldIDFolgesignalESet = iDFolgesignalESet;
		iDFolgesignal = null;
		iDFolgesignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL, oldIDFolgesignal, null, oldIDFolgesignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFolgesignal() {
		return iDFolgesignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				return basicSetAbstandDatenpunktEHEMFolgesignal(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				return basicSetAbstandDatenpunktEPTPI(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				return basicSetAbstandDatenpunktTPIFolgesignal(null, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				return getAbstandDatenpunktEHEMFolgesignal();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				return getAbstandDatenpunktEPTPI();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				return getAbstandDatenpunktTPIFolgesignal();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return getIDFachtelegramm();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				if (resolve) return getIDFolgesignal();
				return basicGetIDFolgesignal();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				setAbstandDatenpunktEHEMFolgesignal((Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				setAbstandDatenpunktEPTPI((Abstand_Datenpunkt_EP_TPI_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				setAbstandDatenpunktTPIFolgesignal((Abstand_Datenpunkt_TPI_Folgesignal_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				getIDFachtelegramm().addAll((Collection<? extends Fachtelegramm>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				setIDFolgesignal((Signal)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				setAbstandDatenpunktEHEMFolgesignal((Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				setAbstandDatenpunktEPTPI((Abstand_Datenpunkt_EP_TPI_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				setAbstandDatenpunktTPIFolgesignal((Abstand_Datenpunkt_TPI_Folgesignal_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				getIDFachtelegramm().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				unsetIDFolgesignal();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EHEM_FOLGESIGNAL:
				return abstandDatenpunktEHEMFolgesignal != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_EPTPI:
				return abstandDatenpunktEPTPI != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ABSTAND_DATENPUNKT_TPI_FOLGESIGNAL:
				return abstandDatenpunktTPIFolgesignal != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FACHTELEGRAMM:
				return iDFachtelegramm != null && !iDFachtelegramm.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG_ATTRIBUTE_GROUP__ID_FOLGESIGNAL:
				return isSetIDFolgesignal();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroupImpl
