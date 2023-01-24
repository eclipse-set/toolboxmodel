/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.ATO.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.ATO.ATOPackage;
import org.eclipse.set.toolboxmodel.ATO.ATO_Segment_Profile;
import org.eclipse.set.toolboxmodel.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.ATO.ATO_TS_Instanz;
import org.eclipse.set.toolboxmodel.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATO Segment Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Segment_ProfileImpl#getAbstandATOHaltVorEoA <em>Abstand ATO Halt Vor Eo A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Segment_ProfileImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Segment_ProfileImpl#getIDATOTSInstanz <em>IDATOTS Instanz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Segment_ProfileImpl#getIDATOTSInstanzNachbar <em>IDATOTS Instanz Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Segment_ProfileImpl#getIDETCSKante <em>IDETCS Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.ATO.impl.ATO_Segment_ProfileImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ATO_Segment_ProfileImpl extends Basis_ObjektImpl implements ATO_Segment_Profile {
	/**
	 * The cached value of the '{@link #getAbstandATOHaltVorEoA() <em>Abstand ATO Halt Vor Eo A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandATOHaltVorEoA()
	 * @generated
	 * @ordered
	 */
	protected Abstand_ATO_Halt_Vor_EoA_TypeClass abstandATOHaltVorEoA;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ATO_Segment_Profile_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDATOTSInstanz() <em>IDATOTS Instanz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDATOTSInstanz()
	 * @generated
	 * @ordered
	 */
	protected ATO_TS_Instanz iDATOTSInstanz;

	/**
	 * This is true if the IDATOTS Instanz reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDATOTSInstanzESet;

	/**
	 * The cached value of the '{@link #getIDATOTSInstanzNachbar() <em>IDATOTS Instanz Nachbar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDATOTSInstanzNachbar()
	 * @generated
	 * @ordered
	 */
	protected ATO_TS_Instanz iDATOTSInstanzNachbar;

	/**
	 * This is true if the IDATOTS Instanz Nachbar reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDATOTSInstanzNachbarESet;

	/**
	 * The cached value of the '{@link #getIDETCSKante() <em>IDETCS Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKante()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Kante iDETCSKante;

	/**
	 * This is true if the IDETCS Kante reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDETCSKanteESet;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected EList<Oertlichkeit> iDOertlichkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATO_Segment_ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ATOPackage.Literals.ATO_SEGMENT_PROFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_ATO_Halt_Vor_EoA_TypeClass getAbstandATOHaltVorEoA() {
		return abstandATOHaltVorEoA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandATOHaltVorEoA(Abstand_ATO_Halt_Vor_EoA_TypeClass newAbstandATOHaltVorEoA, NotificationChain msgs) {
		Abstand_ATO_Halt_Vor_EoA_TypeClass oldAbstandATOHaltVorEoA = abstandATOHaltVorEoA;
		abstandATOHaltVorEoA = newAbstandATOHaltVorEoA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, oldAbstandATOHaltVorEoA, newAbstandATOHaltVorEoA);
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
	public void setAbstandATOHaltVorEoA(Abstand_ATO_Halt_Vor_EoA_TypeClass newAbstandATOHaltVorEoA) {
		if (newAbstandATOHaltVorEoA != abstandATOHaltVorEoA) {
			NotificationChain msgs = null;
			if (abstandATOHaltVorEoA != null)
				msgs = ((InternalEObject)abstandATOHaltVorEoA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, null, msgs);
			if (newAbstandATOHaltVorEoA != null)
				msgs = ((InternalEObject)newAbstandATOHaltVorEoA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, null, msgs);
			msgs = basicSetAbstandATOHaltVorEoA(newAbstandATOHaltVorEoA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A, newAbstandATOHaltVorEoA, newAbstandATOHaltVorEoA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_Segment_Profile_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ATO_Segment_Profile_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ATO_Segment_Profile_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ATO_Segment_Profile_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_TS_Instanz getIDATOTSInstanz() {
		if (iDATOTSInstanz != null && iDATOTSInstanz.eIsProxy()) {
			InternalEObject oldIDATOTSInstanz = (InternalEObject)iDATOTSInstanz;
			iDATOTSInstanz = (ATO_TS_Instanz)eResolveProxy(oldIDATOTSInstanz);
			if (iDATOTSInstanz != oldIDATOTSInstanz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, oldIDATOTSInstanz, iDATOTSInstanz));
			}
		}
		return iDATOTSInstanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATO_TS_Instanz basicGetIDATOTSInstanz() {
		return iDATOTSInstanz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDATOTSInstanz(ATO_TS_Instanz newIDATOTSInstanz) {
		ATO_TS_Instanz oldIDATOTSInstanz = iDATOTSInstanz;
		iDATOTSInstanz = newIDATOTSInstanz;
		boolean oldIDATOTSInstanzESet = iDATOTSInstanzESet;
		iDATOTSInstanzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, oldIDATOTSInstanz, iDATOTSInstanz, !oldIDATOTSInstanzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDATOTSInstanz() {
		ATO_TS_Instanz oldIDATOTSInstanz = iDATOTSInstanz;
		boolean oldIDATOTSInstanzESet = iDATOTSInstanzESet;
		iDATOTSInstanz = null;
		iDATOTSInstanzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ, oldIDATOTSInstanz, null, oldIDATOTSInstanzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDATOTSInstanz() {
		return iDATOTSInstanzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATO_TS_Instanz getIDATOTSInstanzNachbar() {
		if (iDATOTSInstanzNachbar != null && iDATOTSInstanzNachbar.eIsProxy()) {
			InternalEObject oldIDATOTSInstanzNachbar = (InternalEObject)iDATOTSInstanzNachbar;
			iDATOTSInstanzNachbar = (ATO_TS_Instanz)eResolveProxy(oldIDATOTSInstanzNachbar);
			if (iDATOTSInstanzNachbar != oldIDATOTSInstanzNachbar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, oldIDATOTSInstanzNachbar, iDATOTSInstanzNachbar));
			}
		}
		return iDATOTSInstanzNachbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATO_TS_Instanz basicGetIDATOTSInstanzNachbar() {
		return iDATOTSInstanzNachbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDATOTSInstanzNachbar(ATO_TS_Instanz newIDATOTSInstanzNachbar) {
		ATO_TS_Instanz oldIDATOTSInstanzNachbar = iDATOTSInstanzNachbar;
		iDATOTSInstanzNachbar = newIDATOTSInstanzNachbar;
		boolean oldIDATOTSInstanzNachbarESet = iDATOTSInstanzNachbarESet;
		iDATOTSInstanzNachbarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, oldIDATOTSInstanzNachbar, iDATOTSInstanzNachbar, !oldIDATOTSInstanzNachbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDATOTSInstanzNachbar() {
		ATO_TS_Instanz oldIDATOTSInstanzNachbar = iDATOTSInstanzNachbar;
		boolean oldIDATOTSInstanzNachbarESet = iDATOTSInstanzNachbarESet;
		iDATOTSInstanzNachbar = null;
		iDATOTSInstanzNachbarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR, oldIDATOTSInstanzNachbar, null, oldIDATOTSInstanzNachbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDATOTSInstanzNachbar() {
		return iDATOTSInstanzNachbarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Kante getIDETCSKante() {
		if (iDETCSKante != null && iDETCSKante.eIsProxy()) {
			InternalEObject oldIDETCSKante = (InternalEObject)iDETCSKante;
			iDETCSKante = (ETCS_Kante)eResolveProxy(oldIDETCSKante);
			if (iDETCSKante != oldIDETCSKante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, oldIDETCSKante, iDETCSKante));
			}
		}
		return iDETCSKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCS_Kante basicGetIDETCSKante() {
		return iDETCSKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDETCSKante(ETCS_Kante newIDETCSKante) {
		ETCS_Kante oldIDETCSKante = iDETCSKante;
		iDETCSKante = newIDETCSKante;
		boolean oldIDETCSKanteESet = iDETCSKanteESet;
		iDETCSKanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, oldIDETCSKante, iDETCSKante, !oldIDETCSKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDETCSKante() {
		ETCS_Kante oldIDETCSKante = iDETCSKante;
		boolean oldIDETCSKanteESet = iDETCSKanteESet;
		iDETCSKante = null;
		iDETCSKanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE, oldIDETCSKante, null, oldIDETCSKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDETCSKante() {
		return iDETCSKanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Oertlichkeit> getIDOertlichkeit() {
		if (iDOertlichkeit == null) {
			iDOertlichkeit = new EObjectResolvingEList<Oertlichkeit>(Oertlichkeit.class, this, ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT);
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				return basicSetAbstandATOHaltVorEoA(null, msgs);
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				return getAbstandATOHaltVorEoA();
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				return getBezeichnung();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				if (resolve) return getIDATOTSInstanz();
				return basicGetIDATOTSInstanz();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				if (resolve) return getIDATOTSInstanzNachbar();
				return basicGetIDATOTSInstanzNachbar();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				if (resolve) return getIDETCSKante();
				return basicGetIDETCSKante();
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				return getIDOertlichkeit();
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				setAbstandATOHaltVorEoA((Abstand_ATO_Halt_Vor_EoA_TypeClass)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				setBezeichnung((ATO_Segment_Profile_Bezeichnung_AttributeGroup)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				setIDATOTSInstanz((ATO_TS_Instanz)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				setIDATOTSInstanzNachbar((ATO_TS_Instanz)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				setIDETCSKante((ETCS_Kante)newValue);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				getIDOertlichkeit().clear();
				getIDOertlichkeit().addAll((Collection<? extends Oertlichkeit>)newValue);
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				setAbstandATOHaltVorEoA((Abstand_ATO_Halt_Vor_EoA_TypeClass)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				setBezeichnung((ATO_Segment_Profile_Bezeichnung_AttributeGroup)null);
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				unsetIDATOTSInstanz();
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				unsetIDATOTSInstanzNachbar();
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				unsetIDETCSKante();
				return;
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				getIDOertlichkeit().clear();
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
			case ATOPackage.ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A:
				return abstandATOHaltVorEoA != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__BEZEICHNUNG:
				return bezeichnung != null;
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ:
				return isSetIDATOTSInstanz();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR:
				return isSetIDATOTSInstanzNachbar();
			case ATOPackage.ATO_SEGMENT_PROFILE__IDETCS_KANTE:
				return isSetIDETCSKante();
			case ATOPackage.ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT:
				return iDOertlichkeit != null && !iDOertlichkeit.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ATO_Segment_ProfileImpl
