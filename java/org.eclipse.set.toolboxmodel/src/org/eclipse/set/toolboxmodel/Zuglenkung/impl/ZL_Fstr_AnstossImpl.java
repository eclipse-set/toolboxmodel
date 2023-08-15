/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;

import org.eclipse.set.toolboxmodel.Signale.Signal;

import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL Fstr Anstoss</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDVorsignal <em>ID Vorsignal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getZLFstrAnstossGK <em>ZL Fstr Anstoss GK</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_Fstr_AnstossImpl#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_Fstr_AnstossImpl extends Basis_ObjektImpl implements ZL_Fstr_Anstoss {
	/**
	 * The cached value of the '{@link #getIDVorsignal() <em>ID Vorsignal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDVorsignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDVorsignal;

	/**
	 * This is true if the ID Vorsignal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDVorsignalESet;

	/**
	 * The cached value of the '{@link #getIDZLFstr() <em>IDZL Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLFstr()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr iDZLFstr;

	/**
	 * This is true if the IDZL Fstr reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLFstrESet;

	/**
	 * The cached value of the '{@link #getZLFstrAnstossAllg() <em>ZL Fstr Anstoss Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAnstossAllg()
	 * @generated
	 * @ordered
	 */
	protected ZL_Fstr_Anstoss_Allg_AttributeGroup zLFstrAnstossAllg;

	/**
	 * The cached value of the '{@link #getZLFstrAnstossGK() <em>ZL Fstr Anstoss GK</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZLFstrAnstossGK()
	 * @generated
	 * @ordered
	 */
	protected EList<ZL_Fstr_Anstoss_GK_AttributeGroup> zLFstrAnstossGK;

	/**
	 * The cached value of the '{@link #getIDEinschaltpunkt() <em>ID Einschaltpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEinschaltpunkt()
	 * @generated
	 * @ordered
	 */
	protected Schaltmittel_Zuordnung iDEinschaltpunkt;

	/**
	 * This is true if the ID Einschaltpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEinschaltpunktESet;

	/**
	 * The cached value of the '{@link #getIDZNAnzeigefeldAnstoss() <em>IDZN Anzeigefeld Anstoss</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNAnzeigefeldAnstoss()
	 * @generated
	 * @ordered
	 */
	protected ZN_Anzeigefeld iDZNAnzeigefeldAnstoss;

	/**
	 * This is true if the IDZN Anzeigefeld Anstoss reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNAnzeigefeldAnstossESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_Fstr_AnstossImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDVorsignal() {
		if (iDVorsignal != null && iDVorsignal.eIsProxy()) {
			InternalEObject oldIDVorsignal = (InternalEObject)iDVorsignal;
			iDVorsignal = (Signal)eResolveProxy(oldIDVorsignal);
			if (iDVorsignal != oldIDVorsignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, oldIDVorsignal, iDVorsignal));
			}
		}
		return iDVorsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDVorsignal() {
		return iDVorsignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDVorsignal(Signal newIDVorsignal) {
		Signal oldIDVorsignal = iDVorsignal;
		iDVorsignal = newIDVorsignal;
		boolean oldIDVorsignalESet = iDVorsignalESet;
		iDVorsignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, oldIDVorsignal, iDVorsignal, !oldIDVorsignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDVorsignal() {
		Signal oldIDVorsignal = iDVorsignal;
		boolean oldIDVorsignalESet = iDVorsignalESet;
		iDVorsignal = null;
		iDVorsignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL, oldIDVorsignal, null, oldIDVorsignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDVorsignal() {
		return iDVorsignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr getIDZLFstr() {
		if (iDZLFstr != null && iDZLFstr.eIsProxy()) {
			InternalEObject oldIDZLFstr = (InternalEObject)iDZLFstr;
			iDZLFstr = (ZL_Fstr)eResolveProxy(oldIDZLFstr);
			if (iDZLFstr != oldIDZLFstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, oldIDZLFstr, iDZLFstr));
			}
		}
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_Fstr basicGetIDZLFstr() {
		return iDZLFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLFstr(ZL_Fstr newIDZLFstr) {
		ZL_Fstr oldIDZLFstr = iDZLFstr;
		iDZLFstr = newIDZLFstr;
		boolean oldIDZLFstrESet = iDZLFstrESet;
		iDZLFstrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, oldIDZLFstr, iDZLFstr, !oldIDZLFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLFstr() {
		ZL_Fstr oldIDZLFstr = iDZLFstr;
		boolean oldIDZLFstrESet = iDZLFstrESet;
		iDZLFstr = null;
		iDZLFstrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR, oldIDZLFstr, null, oldIDZLFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLFstr() {
		return iDZLFstrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_Fstr_Anstoss_Allg_AttributeGroup getZLFstrAnstossAllg() {
		return zLFstrAnstossAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup newZLFstrAnstossAllg, NotificationChain msgs) {
		ZL_Fstr_Anstoss_Allg_AttributeGroup oldZLFstrAnstossAllg = zLFstrAnstossAllg;
		zLFstrAnstossAllg = newZLFstrAnstossAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, oldZLFstrAnstossAllg, newZLFstrAnstossAllg);
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
	public void setZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup newZLFstrAnstossAllg) {
		if (newZLFstrAnstossAllg != zLFstrAnstossAllg) {
			NotificationChain msgs = null;
			if (zLFstrAnstossAllg != null)
				msgs = ((InternalEObject)zLFstrAnstossAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, null, msgs);
			if (newZLFstrAnstossAllg != null)
				msgs = ((InternalEObject)newZLFstrAnstossAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, null, msgs);
			msgs = basicSetZLFstrAnstossAllg(newZLFstrAnstossAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG, newZLFstrAnstossAllg, newZLFstrAnstossAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZL_Fstr_Anstoss_GK_AttributeGroup> getZLFstrAnstossGK() {
		if (zLFstrAnstossGK == null) {
			zLFstrAnstossGK = new EObjectContainmentEList<ZL_Fstr_Anstoss_GK_AttributeGroup>(ZL_Fstr_Anstoss_GK_AttributeGroup.class, this, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK);
		}
		return zLFstrAnstossGK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Zuordnung getIDEinschaltpunkt() {
		if (iDEinschaltpunkt != null && iDEinschaltpunkt.eIsProxy()) {
			InternalEObject oldIDEinschaltpunkt = (InternalEObject)iDEinschaltpunkt;
			iDEinschaltpunkt = (Schaltmittel_Zuordnung)eResolveProxy(oldIDEinschaltpunkt);
			if (iDEinschaltpunkt != oldIDEinschaltpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, oldIDEinschaltpunkt, iDEinschaltpunkt));
			}
		}
		return iDEinschaltpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schaltmittel_Zuordnung basicGetIDEinschaltpunkt() {
		return iDEinschaltpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEinschaltpunkt(Schaltmittel_Zuordnung newIDEinschaltpunkt) {
		Schaltmittel_Zuordnung oldIDEinschaltpunkt = iDEinschaltpunkt;
		iDEinschaltpunkt = newIDEinschaltpunkt;
		boolean oldIDEinschaltpunktESet = iDEinschaltpunktESet;
		iDEinschaltpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, oldIDEinschaltpunkt, iDEinschaltpunkt, !oldIDEinschaltpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEinschaltpunkt() {
		Schaltmittel_Zuordnung oldIDEinschaltpunkt = iDEinschaltpunkt;
		boolean oldIDEinschaltpunktESet = iDEinschaltpunktESet;
		iDEinschaltpunkt = null;
		iDEinschaltpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT, oldIDEinschaltpunkt, null, oldIDEinschaltpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEinschaltpunkt() {
		return iDEinschaltpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Anzeigefeld getIDZNAnzeigefeldAnstoss() {
		if (iDZNAnzeigefeldAnstoss != null && iDZNAnzeigefeldAnstoss.eIsProxy()) {
			InternalEObject oldIDZNAnzeigefeldAnstoss = (InternalEObject)iDZNAnzeigefeldAnstoss;
			iDZNAnzeigefeldAnstoss = (ZN_Anzeigefeld)eResolveProxy(oldIDZNAnzeigefeldAnstoss);
			if (iDZNAnzeigefeldAnstoss != oldIDZNAnzeigefeldAnstoss) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, oldIDZNAnzeigefeldAnstoss, iDZNAnzeigefeldAnstoss));
			}
		}
		return iDZNAnzeigefeldAnstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Anzeigefeld basicGetIDZNAnzeigefeldAnstoss() {
		return iDZNAnzeigefeldAnstoss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNAnzeigefeldAnstoss(ZN_Anzeigefeld newIDZNAnzeigefeldAnstoss) {
		ZN_Anzeigefeld oldIDZNAnzeigefeldAnstoss = iDZNAnzeigefeldAnstoss;
		iDZNAnzeigefeldAnstoss = newIDZNAnzeigefeldAnstoss;
		boolean oldIDZNAnzeigefeldAnstossESet = iDZNAnzeigefeldAnstossESet;
		iDZNAnzeigefeldAnstossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, oldIDZNAnzeigefeldAnstoss, iDZNAnzeigefeldAnstoss, !oldIDZNAnzeigefeldAnstossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNAnzeigefeldAnstoss() {
		ZN_Anzeigefeld oldIDZNAnzeigefeldAnstoss = iDZNAnzeigefeldAnstoss;
		boolean oldIDZNAnzeigefeldAnstossESet = iDZNAnzeigefeldAnstossESet;
		iDZNAnzeigefeldAnstoss = null;
		iDZNAnzeigefeldAnstossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS, oldIDZNAnzeigefeldAnstoss, null, oldIDZNAnzeigefeldAnstossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNAnzeigefeldAnstoss() {
		return iDZNAnzeigefeldAnstossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				return basicSetZLFstrAnstossAllg(null, msgs);
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				return ((InternalEList<?>)getZLFstrAnstossGK()).basicRemove(otherEnd, msgs);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				if (resolve) return getIDVorsignal();
				return basicGetIDVorsignal();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				if (resolve) return getIDZLFstr();
				return basicGetIDZLFstr();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				return getZLFstrAnstossAllg();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				return getZLFstrAnstossGK();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				if (resolve) return getIDEinschaltpunkt();
				return basicGetIDEinschaltpunkt();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				if (resolve) return getIDZNAnzeigefeldAnstoss();
				return basicGetIDZNAnzeigefeldAnstoss();
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				setIDVorsignal((Signal)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				setIDZLFstr((ZL_Fstr)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				setZLFstrAnstossAllg((ZL_Fstr_Anstoss_Allg_AttributeGroup)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				getZLFstrAnstossGK().clear();
				getZLFstrAnstossGK().addAll((Collection<? extends ZL_Fstr_Anstoss_GK_AttributeGroup>)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				setIDEinschaltpunkt((Schaltmittel_Zuordnung)newValue);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				setIDZNAnzeigefeldAnstoss((ZN_Anzeigefeld)newValue);
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				unsetIDVorsignal();
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				unsetIDZLFstr();
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				setZLFstrAnstossAllg((ZL_Fstr_Anstoss_Allg_AttributeGroup)null);
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				getZLFstrAnstossGK().clear();
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				unsetIDEinschaltpunkt();
				return;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				unsetIDZNAnzeigefeldAnstoss();
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
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_VORSIGNAL:
				return isSetIDVorsignal();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZL_FSTR:
				return isSetIDZLFstr();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
				return zLFstrAnstossAllg != null;
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
				return zLFstrAnstossGK != null && !zLFstrAnstossGK.isEmpty();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT:
				return isSetIDEinschaltpunkt();
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS:
				return isSetIDZNAnzeigefeldAnstoss();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_Fstr_AnstossImpl
