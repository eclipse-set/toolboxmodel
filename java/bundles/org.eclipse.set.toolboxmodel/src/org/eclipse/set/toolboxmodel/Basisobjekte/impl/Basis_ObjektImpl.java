/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte.impl;

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

import org.eclipse.set.toolboxmodel.BasisTypen.ID_Bearbeitungsvermerk_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Bearbeitungsvermerk;
import org.eclipse.set.toolboxmodel.Basisobjekte.Objektreferenzen_AttributeGroup;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basis Objekt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl#getBasisObjektAllg <em>Basis Objekt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl#getIDOertlichkeitAusgabe <em>ID Oertlichkeit Ausgabe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl#getObjektreferenzen <em>Objektreferenzen</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class Basis_ObjektImpl extends Ur_ObjektImpl implements Basis_Objekt {
	/**
	 * The cached value of the '{@link #getBasisObjektAllg() <em>Basis Objekt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisObjektAllg()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt_Allg_AttributeGroup basisObjektAllg;

	/**
	 * The cached value of the '{@link #getIDBearbeitungsvermerk() <em>ID Bearbeitungsvermerk</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBearbeitungsvermerk()
	 * @generated
	 * @ordered
	 */
	protected EList<Bearbeitungsvermerk> iDBearbeitungsvermerk;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitAusgabe() <em>ID Oertlichkeit Ausgabe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitAusgabe()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeitAusgabe;

	/**
	 * This is true if the ID Oertlichkeit Ausgabe reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitAusgabeESet;

	/**
	 * The cached value of the '{@link #getObjektreferenzen() <em>Objektreferenzen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjektreferenzen()
	 * @generated
	 * @ordered
	 */
	protected Objektreferenzen_AttributeGroup objektreferenzen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Basis_ObjektImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.BASIS_OBJEKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt_Allg_AttributeGroup getBasisObjektAllg() {
		return basisObjektAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasisObjektAllg(Basis_Objekt_Allg_AttributeGroup newBasisObjektAllg, NotificationChain msgs) {
		Basis_Objekt_Allg_AttributeGroup oldBasisObjektAllg = basisObjektAllg;
		basisObjektAllg = newBasisObjektAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG, oldBasisObjektAllg, newBasisObjektAllg);
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
	public void setBasisObjektAllg(Basis_Objekt_Allg_AttributeGroup newBasisObjektAllg) {
		if (newBasisObjektAllg != basisObjektAllg) {
			NotificationChain msgs = null;
			if (basisObjektAllg != null)
				msgs = ((InternalEObject)basisObjektAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG, null, msgs);
			if (newBasisObjektAllg != null)
				msgs = ((InternalEObject)newBasisObjektAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG, null, msgs);
			msgs = basicSetBasisObjektAllg(newBasisObjektAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG, newBasisObjektAllg, newBasisObjektAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bearbeitungsvermerk> getIDBearbeitungsvermerk() {
		if (iDBearbeitungsvermerk == null) {
			iDBearbeitungsvermerk = new EObjectResolvingEList<Bearbeitungsvermerk>(Bearbeitungsvermerk.class, this, BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK);
		}
		return iDBearbeitungsvermerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeitAusgabe() {
		if (iDOertlichkeitAusgabe != null && iDOertlichkeitAusgabe.eIsProxy()) {
			InternalEObject oldIDOertlichkeitAusgabe = (InternalEObject)iDOertlichkeitAusgabe;
			iDOertlichkeitAusgabe = (Oertlichkeit)eResolveProxy(oldIDOertlichkeitAusgabe);
			if (iDOertlichkeitAusgabe != oldIDOertlichkeitAusgabe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE, oldIDOertlichkeitAusgabe, iDOertlichkeitAusgabe));
			}
		}
		return iDOertlichkeitAusgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeitAusgabe() {
		return iDOertlichkeitAusgabe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeitAusgabe(Oertlichkeit newIDOertlichkeitAusgabe) {
		Oertlichkeit oldIDOertlichkeitAusgabe = iDOertlichkeitAusgabe;
		iDOertlichkeitAusgabe = newIDOertlichkeitAusgabe;
		boolean oldIDOertlichkeitAusgabeESet = iDOertlichkeitAusgabeESet;
		iDOertlichkeitAusgabeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE, oldIDOertlichkeitAusgabe, iDOertlichkeitAusgabe, !oldIDOertlichkeitAusgabeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeitAusgabe() {
		Oertlichkeit oldIDOertlichkeitAusgabe = iDOertlichkeitAusgabe;
		boolean oldIDOertlichkeitAusgabeESet = iDOertlichkeitAusgabeESet;
		iDOertlichkeitAusgabe = null;
		iDOertlichkeitAusgabeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE, oldIDOertlichkeitAusgabe, null, oldIDOertlichkeitAusgabeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeitAusgabe() {
		return iDOertlichkeitAusgabeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objektreferenzen_AttributeGroup getObjektreferenzen() {
		return objektreferenzen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjektreferenzen(Objektreferenzen_AttributeGroup newObjektreferenzen, NotificationChain msgs) {
		Objektreferenzen_AttributeGroup oldObjektreferenzen = objektreferenzen;
		objektreferenzen = newObjektreferenzen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN, oldObjektreferenzen, newObjektreferenzen);
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
	public void setObjektreferenzen(Objektreferenzen_AttributeGroup newObjektreferenzen) {
		if (newObjektreferenzen != objektreferenzen) {
			NotificationChain msgs = null;
			if (objektreferenzen != null)
				msgs = ((InternalEObject)objektreferenzen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN, null, msgs);
			if (newObjektreferenzen != null)
				msgs = ((InternalEObject)newObjektreferenzen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN, null, msgs);
			msgs = basicSetObjektreferenzen(newObjektreferenzen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN, newObjektreferenzen, newObjektreferenzen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG:
				return basicSetBasisObjektAllg(null, msgs);
			case BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN:
				return basicSetObjektreferenzen(null, msgs);
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
			case BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG:
				return getBasisObjektAllg();
			case BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK:
				return getIDBearbeitungsvermerk();
			case BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE:
				if (resolve) return getIDOertlichkeitAusgabe();
				return basicGetIDOertlichkeitAusgabe();
			case BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN:
				return getObjektreferenzen();
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
			case BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG:
				setBasisObjektAllg((Basis_Objekt_Allg_AttributeGroup)newValue);
				return;
			case BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK:
				getIDBearbeitungsvermerk().clear();
				getIDBearbeitungsvermerk().addAll((Collection<? extends Bearbeitungsvermerk>)newValue);
				return;
			case BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE:
				setIDOertlichkeitAusgabe((Oertlichkeit)newValue);
				return;
			case BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN:
				setObjektreferenzen((Objektreferenzen_AttributeGroup)newValue);
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
			case BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG:
				setBasisObjektAllg((Basis_Objekt_Allg_AttributeGroup)null);
				return;
			case BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK:
				getIDBearbeitungsvermerk().clear();
				return;
			case BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE:
				unsetIDOertlichkeitAusgabe();
				return;
			case BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN:
				setObjektreferenzen((Objektreferenzen_AttributeGroup)null);
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
			case BasisobjektePackage.BASIS_OBJEKT__BASIS_OBJEKT_ALLG:
				return basisObjektAllg != null;
			case BasisobjektePackage.BASIS_OBJEKT__ID_BEARBEITUNGSVERMERK:
				return iDBearbeitungsvermerk != null && !iDBearbeitungsvermerk.isEmpty();
			case BasisobjektePackage.BASIS_OBJEKT__ID_OERTLICHKEIT_AUSGABE:
				return isSetIDOertlichkeitAusgabe();
			case BasisobjektePackage.BASIS_OBJEKT__OBJEKTREFERENZEN:
				return objektreferenzen != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Basis_ObjektImpl
