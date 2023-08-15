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
import org.eclipse.set.toolboxmodel.Block.Block_Anlage;
import org.eclipse.set.toolboxmodel.Block.Block_Anlage_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Block.Block_Element;

import org.eclipse.set.toolboxmodel.Gleis.Gleis_Bezeichnung;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Anlage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_AnlageImpl#getBlockAnlageAllg <em>Block Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_AnlageImpl#getIDBlockElementA <em>ID Block Element A</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_AnlageImpl#getIDBlockElementB <em>ID Block Element B</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_AnlageImpl#getIDGleisBezeichnung <em>ID Gleis Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_AnlageImpl extends Basis_ObjektImpl implements Block_Anlage {
	/**
	 * The cached value of the '{@link #getBlockAnlageAllg() <em>Block Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAnlageAllg()
	 * @generated
	 * @ordered
	 */
	protected Block_Anlage_Allg_AttributeGroup blockAnlageAllg;

	/**
	 * The cached value of the '{@link #getIDBlockElementA() <em>ID Block Element A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBlockElementA()
	 * @generated
	 * @ordered
	 */
	protected Block_Element iDBlockElementA;

	/**
	 * This is true if the ID Block Element A reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBlockElementAESet;

	/**
	 * The cached value of the '{@link #getIDBlockElementB() <em>ID Block Element B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBlockElementB()
	 * @generated
	 * @ordered
	 */
	protected Block_Element iDBlockElementB;

	/**
	 * This is true if the ID Block Element B reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBlockElementBESet;

	/**
	 * The cached value of the '{@link #getIDGleisBezeichnung() <em>ID Gleis Bezeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Bezeichnung iDGleisBezeichnung;

	/**
	 * This is true if the ID Gleis Bezeichnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGleisBezeichnungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_AnlageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ANLAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Anlage_Allg_AttributeGroup getBlockAnlageAllg() {
		return blockAnlageAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup newBlockAnlageAllg, NotificationChain msgs) {
		Block_Anlage_Allg_AttributeGroup oldBlockAnlageAllg = blockAnlageAllg;
		blockAnlageAllg = newBlockAnlageAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, oldBlockAnlageAllg, newBlockAnlageAllg);
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
	public void setBlockAnlageAllg(Block_Anlage_Allg_AttributeGroup newBlockAnlageAllg) {
		if (newBlockAnlageAllg != blockAnlageAllg) {
			NotificationChain msgs = null;
			if (blockAnlageAllg != null)
				msgs = ((InternalEObject)blockAnlageAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, null, msgs);
			if (newBlockAnlageAllg != null)
				msgs = ((InternalEObject)newBlockAnlageAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, null, msgs);
			msgs = basicSetBlockAnlageAllg(newBlockAnlageAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG, newBlockAnlageAllg, newBlockAnlageAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element getIDBlockElementA() {
		if (iDBlockElementA != null && iDBlockElementA.eIsProxy()) {
			InternalEObject oldIDBlockElementA = (InternalEObject)iDBlockElementA;
			iDBlockElementA = (Block_Element)eResolveProxy(oldIDBlockElementA);
			if (iDBlockElementA != oldIDBlockElementA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, oldIDBlockElementA, iDBlockElementA));
			}
		}
		return iDBlockElementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_Element basicGetIDBlockElementA() {
		return iDBlockElementA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBlockElementA(Block_Element newIDBlockElementA) {
		Block_Element oldIDBlockElementA = iDBlockElementA;
		iDBlockElementA = newIDBlockElementA;
		boolean oldIDBlockElementAESet = iDBlockElementAESet;
		iDBlockElementAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, oldIDBlockElementA, iDBlockElementA, !oldIDBlockElementAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBlockElementA() {
		Block_Element oldIDBlockElementA = iDBlockElementA;
		boolean oldIDBlockElementAESet = iDBlockElementAESet;
		iDBlockElementA = null;
		iDBlockElementAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A, oldIDBlockElementA, null, oldIDBlockElementAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBlockElementA() {
		return iDBlockElementAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element getIDBlockElementB() {
		if (iDBlockElementB != null && iDBlockElementB.eIsProxy()) {
			InternalEObject oldIDBlockElementB = (InternalEObject)iDBlockElementB;
			iDBlockElementB = (Block_Element)eResolveProxy(oldIDBlockElementB);
			if (iDBlockElementB != oldIDBlockElementB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, oldIDBlockElementB, iDBlockElementB));
			}
		}
		return iDBlockElementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_Element basicGetIDBlockElementB() {
		return iDBlockElementB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBlockElementB(Block_Element newIDBlockElementB) {
		Block_Element oldIDBlockElementB = iDBlockElementB;
		iDBlockElementB = newIDBlockElementB;
		boolean oldIDBlockElementBESet = iDBlockElementBESet;
		iDBlockElementBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, oldIDBlockElementB, iDBlockElementB, !oldIDBlockElementBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBlockElementB() {
		Block_Element oldIDBlockElementB = iDBlockElementB;
		boolean oldIDBlockElementBESet = iDBlockElementBESet;
		iDBlockElementB = null;
		iDBlockElementBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B, oldIDBlockElementB, null, oldIDBlockElementBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBlockElementB() {
		return iDBlockElementBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Bezeichnung getIDGleisBezeichnung() {
		if (iDGleisBezeichnung != null && iDGleisBezeichnung.eIsProxy()) {
			InternalEObject oldIDGleisBezeichnung = (InternalEObject)iDGleisBezeichnung;
			iDGleisBezeichnung = (Gleis_Bezeichnung)eResolveProxy(oldIDGleisBezeichnung);
			if (iDGleisBezeichnung != oldIDGleisBezeichnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, oldIDGleisBezeichnung, iDGleisBezeichnung));
			}
		}
		return iDGleisBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gleis_Bezeichnung basicGetIDGleisBezeichnung() {
		return iDGleisBezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGleisBezeichnung(Gleis_Bezeichnung newIDGleisBezeichnung) {
		Gleis_Bezeichnung oldIDGleisBezeichnung = iDGleisBezeichnung;
		iDGleisBezeichnung = newIDGleisBezeichnung;
		boolean oldIDGleisBezeichnungESet = iDGleisBezeichnungESet;
		iDGleisBezeichnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, oldIDGleisBezeichnung, iDGleisBezeichnung, !oldIDGleisBezeichnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGleisBezeichnung() {
		Gleis_Bezeichnung oldIDGleisBezeichnung = iDGleisBezeichnung;
		boolean oldIDGleisBezeichnungESet = iDGleisBezeichnungESet;
		iDGleisBezeichnung = null;
		iDGleisBezeichnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG, oldIDGleisBezeichnung, null, oldIDGleisBezeichnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGleisBezeichnung() {
		return iDGleisBezeichnungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				return basicSetBlockAnlageAllg(null, msgs);
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				return getBlockAnlageAllg();
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				if (resolve) return getIDBlockElementA();
				return basicGetIDBlockElementA();
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				if (resolve) return getIDBlockElementB();
				return basicGetIDBlockElementB();
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				if (resolve) return getIDGleisBezeichnung();
				return basicGetIDGleisBezeichnung();
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				setBlockAnlageAllg((Block_Anlage_Allg_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				setIDBlockElementA((Block_Element)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				setIDBlockElementB((Block_Element)newValue);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				setIDGleisBezeichnung((Gleis_Bezeichnung)newValue);
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				setBlockAnlageAllg((Block_Anlage_Allg_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				unsetIDBlockElementA();
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				unsetIDBlockElementB();
				return;
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				unsetIDGleisBezeichnung();
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
			case BlockPackage.BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG:
				return blockAnlageAllg != null;
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A:
				return isSetIDBlockElementA();
			case BlockPackage.BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B:
				return isSetIDBlockElementB();
			case BlockPackage.BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG:
				return isSetIDGleisBezeichnung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Block_AnlageImpl
