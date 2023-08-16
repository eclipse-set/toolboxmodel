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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Kante_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Knoten;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.Strecke;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDETCSKnotenA <em>IDETCS Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDETCSKnotenB <em>IDETCS Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_KanteImpl#getIDTOPKante <em>IDTOP Kante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_KanteImpl extends Basis_ObjektImpl implements ETCS_Kante {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Kante_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDETCSKnotenA() <em>IDETCS Knoten A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKnotenA()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Knoten iDETCSKnotenA;

	/**
	 * This is true if the IDETCS Knoten A reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDETCSKnotenAESet;

	/**
	 * The cached value of the '{@link #getIDETCSKnotenB() <em>IDETCS Knoten B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSKnotenB()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Knoten iDETCSKnotenB;

	/**
	 * This is true if the IDETCS Knoten B reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDETCSKnotenBESet;

	/**
	 * The cached value of the '{@link #getIDRBC() <em>IDRBC</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<RBC> iDRBC;

	/**
	 * The cached value of the '{@link #getIDStrecke() <em>ID Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStrecke()
	 * @generated
	 * @ordered
	 */
	protected Strecke iDStrecke;

	/**
	 * This is true if the ID Strecke reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStreckeESet;

	/**
	 * The cached value of the '{@link #getIDTOPKante() <em>IDTOP Kante</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKante()
	 * @generated
	 * @ordered
	 */
	protected EList<TOP_Kante> iDTOPKante;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Kante();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Kante_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ETCS_Kante_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Knoten getIDETCSKnotenA() {
		if (iDETCSKnotenA != null && iDETCSKnotenA.eIsProxy()) {
			InternalEObject oldIDETCSKnotenA = (InternalEObject)iDETCSKnotenA;
			iDETCSKnotenA = (ETCS_Knoten)eResolveProxy(oldIDETCSKnotenA);
			if (iDETCSKnotenA != oldIDETCSKnotenA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, oldIDETCSKnotenA, iDETCSKnotenA));
			}
		}
		return iDETCSKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCS_Knoten basicGetIDETCSKnotenA() {
		return iDETCSKnotenA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDETCSKnotenA(ETCS_Knoten newIDETCSKnotenA) {
		ETCS_Knoten oldIDETCSKnotenA = iDETCSKnotenA;
		iDETCSKnotenA = newIDETCSKnotenA;
		boolean oldIDETCSKnotenAESet = iDETCSKnotenAESet;
		iDETCSKnotenAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, oldIDETCSKnotenA, iDETCSKnotenA, !oldIDETCSKnotenAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDETCSKnotenA() {
		ETCS_Knoten oldIDETCSKnotenA = iDETCSKnotenA;
		boolean oldIDETCSKnotenAESet = iDETCSKnotenAESet;
		iDETCSKnotenA = null;
		iDETCSKnotenAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A, oldIDETCSKnotenA, null, oldIDETCSKnotenAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDETCSKnotenA() {
		return iDETCSKnotenAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Knoten getIDETCSKnotenB() {
		if (iDETCSKnotenB != null && iDETCSKnotenB.eIsProxy()) {
			InternalEObject oldIDETCSKnotenB = (InternalEObject)iDETCSKnotenB;
			iDETCSKnotenB = (ETCS_Knoten)eResolveProxy(oldIDETCSKnotenB);
			if (iDETCSKnotenB != oldIDETCSKnotenB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, oldIDETCSKnotenB, iDETCSKnotenB));
			}
		}
		return iDETCSKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCS_Knoten basicGetIDETCSKnotenB() {
		return iDETCSKnotenB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDETCSKnotenB(ETCS_Knoten newIDETCSKnotenB) {
		ETCS_Knoten oldIDETCSKnotenB = iDETCSKnotenB;
		iDETCSKnotenB = newIDETCSKnotenB;
		boolean oldIDETCSKnotenBESet = iDETCSKnotenBESet;
		iDETCSKnotenBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, oldIDETCSKnotenB, iDETCSKnotenB, !oldIDETCSKnotenBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDETCSKnotenB() {
		ETCS_Knoten oldIDETCSKnotenB = iDETCSKnotenB;
		boolean oldIDETCSKnotenBESet = iDETCSKnotenBESet;
		iDETCSKnotenB = null;
		iDETCSKnotenBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B, oldIDETCSKnotenB, null, oldIDETCSKnotenBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDETCSKnotenB() {
		return iDETCSKnotenBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RBC> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectResolvingEList<RBC>(RBC.class, this, Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strecke getIDStrecke() {
		if (iDStrecke != null && iDStrecke.eIsProxy()) {
			InternalEObject oldIDStrecke = (InternalEObject)iDStrecke;
			iDStrecke = (Strecke)eResolveProxy(oldIDStrecke);
			if (iDStrecke != oldIDStrecke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE, oldIDStrecke, iDStrecke));
			}
		}
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strecke basicGetIDStrecke() {
		return iDStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStrecke(Strecke newIDStrecke) {
		Strecke oldIDStrecke = iDStrecke;
		iDStrecke = newIDStrecke;
		boolean oldIDStreckeESet = iDStreckeESet;
		iDStreckeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE, oldIDStrecke, iDStrecke, !oldIDStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStrecke() {
		Strecke oldIDStrecke = iDStrecke;
		boolean oldIDStreckeESet = iDStreckeESet;
		iDStrecke = null;
		iDStreckeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE, oldIDStrecke, null, oldIDStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStrecke() {
		return iDStreckeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TOP_Kante> getIDTOPKante() {
		if (iDTOPKante == null) {
			iDTOPKante = new EObjectResolvingEList<TOP_Kante>(TOP_Kante.class, this, Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE);
		}
		return iDTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				return getBezeichnung();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				if (resolve) return getIDETCSKnotenA();
				return basicGetIDETCSKnotenA();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				if (resolve) return getIDETCSKnotenB();
				return basicGetIDETCSKnotenB();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE:
				if (resolve) return getIDStrecke();
				return basicGetIDStrecke();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				return getIDTOPKante();
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				setBezeichnung((ETCS_Kante_Bezeichnung_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				setIDETCSKnotenA((ETCS_Knoten)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				setIDETCSKnotenB((ETCS_Knoten)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends RBC>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE:
				setIDStrecke((Strecke)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				getIDTOPKante().clear();
				getIDTOPKante().addAll((Collection<? extends TOP_Kante>)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				setBezeichnung((ETCS_Kante_Bezeichnung_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				unsetIDETCSKnotenA();
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				unsetIDETCSKnotenB();
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE:
				unsetIDStrecke();
				return;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				getIDTOPKante().clear();
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
			case Balisentechnik_ETCSPackage.ETCS_KANTE__BEZEICHNUNG:
				return bezeichnung != null;
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_A:
				return isSetIDETCSKnotenA();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDETCS_KNOTEN_B:
				return isSetIDETCSKnotenB();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__ID_STRECKE:
				return isSetIDStrecke();
			case Balisentechnik_ETCSPackage.ETCS_KANTE__IDTOP_KANTE:
				return iDTOPKante != null && !iDTOPKante.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_KanteImpl
