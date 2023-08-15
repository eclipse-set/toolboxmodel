/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Bezeichnung_Stellwerk_TypeClass;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stell_Bereich;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Zusatzinformation_Stellwerk_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stell Bereich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Stell_BereichImpl#getZusatzinformationStellwerk <em>Zusatzinformation Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Stell_BereichImpl#getBezeichnungStellwerk <em>Bezeichnung Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Stell_BereichImpl#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Stell_BereichImpl extends Bereich_ObjektImpl implements Stell_Bereich {
	/**
	 * The cached value of the '{@link #getZusatzinformationStellwerk() <em>Zusatzinformation Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatzinformationStellwerk()
	 * @generated
	 * @ordered
	 */
	protected Zusatzinformation_Stellwerk_TypeClass zusatzinformationStellwerk;

	/**
	 * The cached value of the '{@link #getBezeichnungStellwerk() <em>Bezeichnung Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnungStellwerk()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Stellwerk_TypeClass bezeichnungStellwerk;

	/**
	 * The cached value of the '{@link #getIDAussenelementansteuerung() <em>ID Aussenelementansteuerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDAussenelementansteuerung;

	/**
	 * This is true if the ID Aussenelementansteuerung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAussenelementansteuerungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Stell_BereichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.STELL_BEREICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zusatzinformation_Stellwerk_TypeClass getZusatzinformationStellwerk() {
		return zusatzinformationStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZusatzinformationStellwerk(Zusatzinformation_Stellwerk_TypeClass newZusatzinformationStellwerk, NotificationChain msgs) {
		Zusatzinformation_Stellwerk_TypeClass oldZusatzinformationStellwerk = zusatzinformationStellwerk;
		zusatzinformationStellwerk = newZusatzinformationStellwerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, oldZusatzinformationStellwerk, newZusatzinformationStellwerk);
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
	public void setZusatzinformationStellwerk(Zusatzinformation_Stellwerk_TypeClass newZusatzinformationStellwerk) {
		if (newZusatzinformationStellwerk != zusatzinformationStellwerk) {
			NotificationChain msgs = null;
			if (zusatzinformationStellwerk != null)
				msgs = ((InternalEObject)zusatzinformationStellwerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, null, msgs);
			if (newZusatzinformationStellwerk != null)
				msgs = ((InternalEObject)newZusatzinformationStellwerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, null, msgs);
			msgs = basicSetZusatzinformationStellwerk(newZusatzinformationStellwerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK, newZusatzinformationStellwerk, newZusatzinformationStellwerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Stellwerk_TypeClass getBezeichnungStellwerk() {
		return bezeichnungStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass newBezeichnungStellwerk, NotificationChain msgs) {
		Bezeichnung_Stellwerk_TypeClass oldBezeichnungStellwerk = bezeichnungStellwerk;
		bezeichnungStellwerk = newBezeichnungStellwerk;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, oldBezeichnungStellwerk, newBezeichnungStellwerk);
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
	public void setBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass newBezeichnungStellwerk) {
		if (newBezeichnungStellwerk != bezeichnungStellwerk) {
			NotificationChain msgs = null;
			if (bezeichnungStellwerk != null)
				msgs = ((InternalEObject)bezeichnungStellwerk).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, null, msgs);
			if (newBezeichnungStellwerk != null)
				msgs = ((InternalEObject)newBezeichnungStellwerk).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, null, msgs);
			msgs = basicSetBezeichnungStellwerk(newBezeichnungStellwerk, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK, newBezeichnungStellwerk, newBezeichnungStellwerk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDAussenelementansteuerung() {
		if (iDAussenelementansteuerung != null && iDAussenelementansteuerung.eIsProxy()) {
			InternalEObject oldIDAussenelementansteuerung = (InternalEObject)iDAussenelementansteuerung;
			iDAussenelementansteuerung = (Aussenelementansteuerung)eResolveProxy(oldIDAussenelementansteuerung);
			if (iDAussenelementansteuerung != oldIDAussenelementansteuerung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, iDAussenelementansteuerung));
			}
		}
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDAussenelementansteuerung() {
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAussenelementansteuerung(Aussenelementansteuerung newIDAussenelementansteuerung) {
		Aussenelementansteuerung oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		iDAussenelementansteuerung = newIDAussenelementansteuerung;
		boolean oldIDAussenelementansteuerungESet = iDAussenelementansteuerungESet;
		iDAussenelementansteuerungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, iDAussenelementansteuerung, !oldIDAussenelementansteuerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAussenelementansteuerung() {
		Aussenelementansteuerung oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		boolean oldIDAussenelementansteuerungESet = iDAussenelementansteuerungESet;
		iDAussenelementansteuerung = null;
		iDAussenelementansteuerungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, null, oldIDAussenelementansteuerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAussenelementansteuerung() {
		return iDAussenelementansteuerungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				return basicSetZusatzinformationStellwerk(null, msgs);
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				return basicSetBezeichnungStellwerk(null, msgs);
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				return getZusatzinformationStellwerk();
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				return getBezeichnungStellwerk();
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				if (resolve) return getIDAussenelementansteuerung();
				return basicGetIDAussenelementansteuerung();
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				setZusatzinformationStellwerk((Zusatzinformation_Stellwerk_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				setBezeichnungStellwerk((Bezeichnung_Stellwerk_TypeClass)newValue);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((Aussenelementansteuerung)newValue);
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				setZusatzinformationStellwerk((Zusatzinformation_Stellwerk_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				setBezeichnungStellwerk((Bezeichnung_Stellwerk_TypeClass)null);
				return;
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				unsetIDAussenelementansteuerung();
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ZUSATZINFORMATION_STELLWERK:
				return zusatzinformationStellwerk != null;
			case Ansteuerung_ElementPackage.STELL_BEREICH__BEZEICHNUNG_STELLWERK:
				return bezeichnungStellwerk != null;
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				return isSetIDAussenelementansteuerung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Stell_BereichImpl
