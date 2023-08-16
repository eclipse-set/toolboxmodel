/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Block.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Block.BlockPackage;
import org.eclipse.set.toolboxmodel.Block.Block_Strecke;
import org.eclipse.set.toolboxmodel.Block.Block_Strecke_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke_Bremsweg;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Strecke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_StreckeImpl#getBlockStreckeAllg <em>Block Strecke Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_StreckeImpl#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_StreckeImpl#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_StreckeImpl#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_StreckeImpl#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_StreckeImpl extends Basis_ObjektImpl implements Block_Strecke {
	/**
	 * The cached value of the '{@link #getBlockStreckeAllg() <em>Block Strecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockStreckeAllg()
	 * @generated
	 * @ordered
	 */
	protected Block_Strecke_Allg_AttributeGroup blockStreckeAllg;

	/**
	 * The cached value of the '{@link #getIDBetriebsstelleNachbar() <em>ID Betriebsstelle Nachbar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBetriebsstelleNachbar()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDBetriebsstelleNachbar;

	/**
	 * This is true if the ID Betriebsstelle Nachbar reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBetriebsstelleNachbarESet;

	/**
	 * The cached value of the '{@link #getIDKnotenbahnhof() <em>ID Knotenbahnhof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDKnotenbahnhof()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDKnotenbahnhof;

	/**
	 * This is true if the ID Knotenbahnhof reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDKnotenbahnhofESet;

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
	 * The cached value of the '{@link #getIDStreckeBremsweg() <em>ID Strecke Bremsweg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStreckeBremsweg()
	 * @generated
	 * @ordered
	 */
	protected Strecke_Bremsweg iDStreckeBremsweg;

	/**
	 * This is true if the ID Strecke Bremsweg reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStreckeBremswegESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_StreckeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_STRECKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Strecke_Allg_AttributeGroup getBlockStreckeAllg() {
		return blockStreckeAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup newBlockStreckeAllg, NotificationChain msgs) {
		Block_Strecke_Allg_AttributeGroup oldBlockStreckeAllg = blockStreckeAllg;
		blockStreckeAllg = newBlockStreckeAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, oldBlockStreckeAllg, newBlockStreckeAllg);
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
	public void setBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup newBlockStreckeAllg) {
		if (newBlockStreckeAllg != blockStreckeAllg) {
			NotificationChain msgs = null;
			if (blockStreckeAllg != null)
				msgs = ((InternalEObject)blockStreckeAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, null, msgs);
			if (newBlockStreckeAllg != null)
				msgs = ((InternalEObject)newBlockStreckeAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, null, msgs);
			msgs = basicSetBlockStreckeAllg(newBlockStreckeAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG, newBlockStreckeAllg, newBlockStreckeAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDBetriebsstelleNachbar() {
		if (iDBetriebsstelleNachbar != null && iDBetriebsstelleNachbar.eIsProxy()) {
			InternalEObject oldIDBetriebsstelleNachbar = (InternalEObject)iDBetriebsstelleNachbar;
			iDBetriebsstelleNachbar = (Oertlichkeit)eResolveProxy(oldIDBetriebsstelleNachbar);
			if (iDBetriebsstelleNachbar != oldIDBetriebsstelleNachbar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, oldIDBetriebsstelleNachbar, iDBetriebsstelleNachbar));
			}
		}
		return iDBetriebsstelleNachbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDBetriebsstelleNachbar() {
		return iDBetriebsstelleNachbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBetriebsstelleNachbar(Oertlichkeit newIDBetriebsstelleNachbar) {
		Oertlichkeit oldIDBetriebsstelleNachbar = iDBetriebsstelleNachbar;
		iDBetriebsstelleNachbar = newIDBetriebsstelleNachbar;
		boolean oldIDBetriebsstelleNachbarESet = iDBetriebsstelleNachbarESet;
		iDBetriebsstelleNachbarESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, oldIDBetriebsstelleNachbar, iDBetriebsstelleNachbar, !oldIDBetriebsstelleNachbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBetriebsstelleNachbar() {
		Oertlichkeit oldIDBetriebsstelleNachbar = iDBetriebsstelleNachbar;
		boolean oldIDBetriebsstelleNachbarESet = iDBetriebsstelleNachbarESet;
		iDBetriebsstelleNachbar = null;
		iDBetriebsstelleNachbarESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR, oldIDBetriebsstelleNachbar, null, oldIDBetriebsstelleNachbarESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBetriebsstelleNachbar() {
		return iDBetriebsstelleNachbarESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDKnotenbahnhof() {
		if (iDKnotenbahnhof != null && iDKnotenbahnhof.eIsProxy()) {
			InternalEObject oldIDKnotenbahnhof = (InternalEObject)iDKnotenbahnhof;
			iDKnotenbahnhof = (Oertlichkeit)eResolveProxy(oldIDKnotenbahnhof);
			if (iDKnotenbahnhof != oldIDKnotenbahnhof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, oldIDKnotenbahnhof, iDKnotenbahnhof));
			}
		}
		return iDKnotenbahnhof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDKnotenbahnhof() {
		return iDKnotenbahnhof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDKnotenbahnhof(Oertlichkeit newIDKnotenbahnhof) {
		Oertlichkeit oldIDKnotenbahnhof = iDKnotenbahnhof;
		iDKnotenbahnhof = newIDKnotenbahnhof;
		boolean oldIDKnotenbahnhofESet = iDKnotenbahnhofESet;
		iDKnotenbahnhofESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, oldIDKnotenbahnhof, iDKnotenbahnhof, !oldIDKnotenbahnhofESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDKnotenbahnhof() {
		Oertlichkeit oldIDKnotenbahnhof = iDKnotenbahnhof;
		boolean oldIDKnotenbahnhofESet = iDKnotenbahnhofESet;
		iDKnotenbahnhof = null;
		iDKnotenbahnhofESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF, oldIDKnotenbahnhof, null, oldIDKnotenbahnhofESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDKnotenbahnhof() {
		return iDKnotenbahnhofESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_STRECKE__ID_STRECKE, oldIDStrecke, iDStrecke));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_STRECKE, oldIDStrecke, iDStrecke, !oldIDStreckeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_STRECKE__ID_STRECKE, oldIDStrecke, null, oldIDStreckeESet));
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
	public Strecke_Bremsweg getIDStreckeBremsweg() {
		if (iDStreckeBremsweg != null && iDStreckeBremsweg.eIsProxy()) {
			InternalEObject oldIDStreckeBremsweg = (InternalEObject)iDStreckeBremsweg;
			iDStreckeBremsweg = (Strecke_Bremsweg)eResolveProxy(oldIDStreckeBremsweg);
			if (iDStreckeBremsweg != oldIDStreckeBremsweg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, oldIDStreckeBremsweg, iDStreckeBremsweg));
			}
		}
		return iDStreckeBremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strecke_Bremsweg basicGetIDStreckeBremsweg() {
		return iDStreckeBremsweg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStreckeBremsweg(Strecke_Bremsweg newIDStreckeBremsweg) {
		Strecke_Bremsweg oldIDStreckeBremsweg = iDStreckeBremsweg;
		iDStreckeBremsweg = newIDStreckeBremsweg;
		boolean oldIDStreckeBremswegESet = iDStreckeBremswegESet;
		iDStreckeBremswegESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, oldIDStreckeBremsweg, iDStreckeBremsweg, !oldIDStreckeBremswegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStreckeBremsweg() {
		Strecke_Bremsweg oldIDStreckeBremsweg = iDStreckeBremsweg;
		boolean oldIDStreckeBremswegESet = iDStreckeBremswegESet;
		iDStreckeBremsweg = null;
		iDStreckeBremswegESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG, oldIDStreckeBremsweg, null, oldIDStreckeBremswegESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStreckeBremsweg() {
		return iDStreckeBremswegESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				return basicSetBlockStreckeAllg(null, msgs);
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				return getBlockStreckeAllg();
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				if (resolve) return getIDBetriebsstelleNachbar();
				return basicGetIDBetriebsstelleNachbar();
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				if (resolve) return getIDKnotenbahnhof();
				return basicGetIDKnotenbahnhof();
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				if (resolve) return getIDStrecke();
				return basicGetIDStrecke();
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				if (resolve) return getIDStreckeBremsweg();
				return basicGetIDStreckeBremsweg();
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				setBlockStreckeAllg((Block_Strecke_Allg_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				setIDBetriebsstelleNachbar((Oertlichkeit)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				setIDKnotenbahnhof((Oertlichkeit)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				setIDStrecke((Strecke)newValue);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				setIDStreckeBremsweg((Strecke_Bremsweg)newValue);
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				setBlockStreckeAllg((Block_Strecke_Allg_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				unsetIDBetriebsstelleNachbar();
				return;
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				unsetIDKnotenbahnhof();
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				unsetIDStrecke();
				return;
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				unsetIDStreckeBremsweg();
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
			case BlockPackage.BLOCK_STRECKE__BLOCK_STRECKE_ALLG:
				return blockStreckeAllg != null;
			case BlockPackage.BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR:
				return isSetIDBetriebsstelleNachbar();
			case BlockPackage.BLOCK_STRECKE__ID_KNOTENBAHNHOF:
				return isSetIDKnotenbahnhof();
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE:
				return isSetIDStrecke();
			case BlockPackage.BLOCK_STRECKE__ID_STRECKE_BREMSWEG:
				return isSetIDStreckeBremsweg();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Block_StreckeImpl
