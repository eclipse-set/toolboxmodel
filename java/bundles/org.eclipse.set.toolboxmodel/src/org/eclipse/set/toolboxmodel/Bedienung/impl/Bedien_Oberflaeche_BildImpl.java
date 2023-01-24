/**
 * /**
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

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oberflaeche;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oberflaeche_Bild;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oberflaeche Bild</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Oberflaeche_BildImpl#getBedienOberflaecheBildAllg <em>Bedien Oberflaeche Bild Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Oberflaeche_BildImpl#getIDBedienOberflaeche <em>ID Bedien Oberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Oberflaeche_BildImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Oberflaeche_BildImpl extends Basis_ObjektImpl implements Bedien_Oberflaeche_Bild {
	/**
	 * The cached value of the '{@link #getBedienOberflaecheBildAllg() <em>Bedien Oberflaeche Bild Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOberflaecheBildAllg()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oberflaeche_Bild_Allg_AttributeGroup bedienOberflaecheBildAllg;

	/**
	 * The cached value of the '{@link #getIDBedienOberflaeche() <em>ID Bedien Oberflaeche</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienOberflaeche()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oberflaeche iDBedienOberflaeche;

	/**
	 * This is true if the ID Bedien Oberflaeche reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienOberflaecheESet;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeit;

	/**
	 * This is true if the ID Oertlichkeit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Oberflaeche_BildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OBERFLAECHE_BILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche_Bild_Allg_AttributeGroup getBedienOberflaecheBildAllg() {
		return bedienOberflaecheBildAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienOberflaecheBildAllg(Bedien_Oberflaeche_Bild_Allg_AttributeGroup newBedienOberflaecheBildAllg, NotificationChain msgs) {
		Bedien_Oberflaeche_Bild_Allg_AttributeGroup oldBedienOberflaecheBildAllg = bedienOberflaecheBildAllg;
		bedienOberflaecheBildAllg = newBedienOberflaecheBildAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, oldBedienOberflaecheBildAllg, newBedienOberflaecheBildAllg);
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
	public void setBedienOberflaecheBildAllg(Bedien_Oberflaeche_Bild_Allg_AttributeGroup newBedienOberflaecheBildAllg) {
		if (newBedienOberflaecheBildAllg != bedienOberflaecheBildAllg) {
			NotificationChain msgs = null;
			if (bedienOberflaecheBildAllg != null)
				msgs = ((InternalEObject)bedienOberflaecheBildAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, null, msgs);
			if (newBedienOberflaecheBildAllg != null)
				msgs = ((InternalEObject)newBedienOberflaecheBildAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, null, msgs);
			msgs = basicSetBedienOberflaecheBildAllg(newBedienOberflaecheBildAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG, newBedienOberflaecheBildAllg, newBedienOberflaecheBildAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oberflaeche getIDBedienOberflaeche() {
		if (iDBedienOberflaeche != null && iDBedienOberflaeche.eIsProxy()) {
			InternalEObject oldIDBedienOberflaeche = (InternalEObject)iDBedienOberflaeche;
			iDBedienOberflaeche = (Bedien_Oberflaeche)eResolveProxy(oldIDBedienOberflaeche);
			if (iDBedienOberflaeche != oldIDBedienOberflaeche) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, oldIDBedienOberflaeche, iDBedienOberflaeche));
			}
		}
		return iDBedienOberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Oberflaeche basicGetIDBedienOberflaeche() {
		return iDBedienOberflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienOberflaeche(Bedien_Oberflaeche newIDBedienOberflaeche) {
		Bedien_Oberflaeche oldIDBedienOberflaeche = iDBedienOberflaeche;
		iDBedienOberflaeche = newIDBedienOberflaeche;
		boolean oldIDBedienOberflaecheESet = iDBedienOberflaecheESet;
		iDBedienOberflaecheESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, oldIDBedienOberflaeche, iDBedienOberflaeche, !oldIDBedienOberflaecheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienOberflaeche() {
		Bedien_Oberflaeche oldIDBedienOberflaeche = iDBedienOberflaeche;
		boolean oldIDBedienOberflaecheESet = iDBedienOberflaecheESet;
		iDBedienOberflaeche = null;
		iDBedienOberflaecheESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE, oldIDBedienOberflaeche, null, oldIDBedienOberflaecheESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienOberflaeche() {
		return iDBedienOberflaecheESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeit() {
		if (iDOertlichkeit != null && iDOertlichkeit.eIsProxy()) {
			InternalEObject oldIDOertlichkeit = (InternalEObject)iDOertlichkeit;
			iDOertlichkeit = (Oertlichkeit)eResolveProxy(oldIDOertlichkeit);
			if (iDOertlichkeit != oldIDOertlichkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit));
			}
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeit(Oertlichkeit newIDOertlichkeit) {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit, !oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeit() {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeit = null;
		iDOertlichkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT, oldIDOertlichkeit, null, oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeit() {
		return iDOertlichkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				return basicSetBedienOberflaecheBildAllg(null, msgs);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				return getBedienOberflaecheBildAllg();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				if (resolve) return getIDBedienOberflaeche();
				return basicGetIDBedienOberflaeche();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				if (resolve) return getIDOertlichkeit();
				return basicGetIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				setBedienOberflaecheBildAllg((Bedien_Oberflaeche_Bild_Allg_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				setIDBedienOberflaeche((Bedien_Oberflaeche)newValue);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				setIDOertlichkeit((Oertlichkeit)newValue);
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				setBedienOberflaecheBildAllg((Bedien_Oberflaeche_Bild_Allg_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				unsetIDBedienOberflaeche();
				return;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				unsetIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__BEDIEN_OBERFLAECHE_BILD_ALLG:
				return bedienOberflaecheBildAllg != null;
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_BEDIEN_OBERFLAECHE:
				return isSetIDBedienOberflaeche();
			case BedienungPackage.BEDIEN_OBERFLAECHE_BILD__ID_OERTLICHKEIT:
				return isSetIDOertlichkeit();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Oberflaeche_BildImpl
