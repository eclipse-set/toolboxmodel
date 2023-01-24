/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ortung.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Komponente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_KomponenteImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_KomponenteImpl#getIDBezugspunkt <em>ID Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_KomponenteImpl#getIDFMAgrenze <em>IDFM Agrenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_KomponenteImpl#getFMAKomponenteAchszaehlpunkt <em>FMA Komponente Achszaehlpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_KomponenteImpl#getFMAKomponenteArt <em>FMA Komponente Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_KomponenteImpl extends Punkt_ObjektImpl implements FMA_Komponente {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBezugspunkt() <em>ID Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDBezugspunkt;

	/**
	 * This is true if the ID Bezugspunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBezugspunktESet;

	/**
	 * The cached value of the '{@link #getIDFMAgrenze() <em>IDFM Agrenze</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAgrenze()
	 * @generated
	 * @ordered
	 */
	protected EList<FMA_Anlage> iDFMAgrenze;

	/**
	 * The cached value of the '{@link #getFMAKomponenteAchszaehlpunkt() <em>FMA Komponente Achszaehlpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKomponenteAchszaehlpunkt()
	 * @generated
	 * @ordered
	 */
	protected FMA_Komponente_Achszaehlpunkt_AttributeGroup fMAKomponenteAchszaehlpunkt;

	/**
	 * The cached value of the '{@link #getFMAKomponenteArt() <em>FMA Komponente Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKomponenteArt()
	 * @generated
	 * @ordered
	 */
	protected FMA_Komponente_Art_TypeClass fMAKomponenteArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_KomponenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_KOMPONENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDBezugspunkt() {
		if (iDBezugspunkt != null && iDBezugspunkt.eIsProxy()) {
			InternalEObject oldIDBezugspunkt = (InternalEObject)iDBezugspunkt;
			iDBezugspunkt = (Markanter_Punkt)eResolveProxy(oldIDBezugspunkt);
			if (iDBezugspunkt != oldIDBezugspunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT, oldIDBezugspunkt, iDBezugspunkt));
			}
		}
		return iDBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDBezugspunkt() {
		return iDBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBezugspunkt(Markanter_Punkt newIDBezugspunkt) {
		Markanter_Punkt oldIDBezugspunkt = iDBezugspunkt;
		iDBezugspunkt = newIDBezugspunkt;
		boolean oldIDBezugspunktESet = iDBezugspunktESet;
		iDBezugspunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT, oldIDBezugspunkt, iDBezugspunkt, !oldIDBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBezugspunkt() {
		Markanter_Punkt oldIDBezugspunkt = iDBezugspunkt;
		boolean oldIDBezugspunktESet = iDBezugspunktESet;
		iDBezugspunkt = null;
		iDBezugspunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT, oldIDBezugspunkt, null, oldIDBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBezugspunkt() {
		return iDBezugspunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMA_Anlage> getIDFMAgrenze() {
		if (iDFMAgrenze == null) {
			iDFMAgrenze = new EObjectResolvingEList<FMA_Anlage>(FMA_Anlage.class, this, OrtungPackage.FMA_KOMPONENTE__IDFM_AGRENZE);
		}
		return iDFMAgrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Achszaehlpunkt_AttributeGroup getFMAKomponenteAchszaehlpunkt() {
		return fMAKomponenteAchszaehlpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKomponenteAchszaehlpunkt(FMA_Komponente_Achszaehlpunkt_AttributeGroup newFMAKomponenteAchszaehlpunkt, NotificationChain msgs) {
		FMA_Komponente_Achszaehlpunkt_AttributeGroup oldFMAKomponenteAchszaehlpunkt = fMAKomponenteAchszaehlpunkt;
		fMAKomponenteAchszaehlpunkt = newFMAKomponenteAchszaehlpunkt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT, oldFMAKomponenteAchszaehlpunkt, newFMAKomponenteAchszaehlpunkt);
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
	public void setFMAKomponenteAchszaehlpunkt(FMA_Komponente_Achszaehlpunkt_AttributeGroup newFMAKomponenteAchszaehlpunkt) {
		if (newFMAKomponenteAchszaehlpunkt != fMAKomponenteAchszaehlpunkt) {
			NotificationChain msgs = null;
			if (fMAKomponenteAchszaehlpunkt != null)
				msgs = ((InternalEObject)fMAKomponenteAchszaehlpunkt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT, null, msgs);
			if (newFMAKomponenteAchszaehlpunkt != null)
				msgs = ((InternalEObject)newFMAKomponenteAchszaehlpunkt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT, null, msgs);
			msgs = basicSetFMAKomponenteAchszaehlpunkt(newFMAKomponenteAchszaehlpunkt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT, newFMAKomponenteAchszaehlpunkt, newFMAKomponenteAchszaehlpunkt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Art_TypeClass getFMAKomponenteArt() {
		return fMAKomponenteArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKomponenteArt(FMA_Komponente_Art_TypeClass newFMAKomponenteArt, NotificationChain msgs) {
		FMA_Komponente_Art_TypeClass oldFMAKomponenteArt = fMAKomponenteArt;
		fMAKomponenteArt = newFMAKomponenteArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART, oldFMAKomponenteArt, newFMAKomponenteArt);
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
	public void setFMAKomponenteArt(FMA_Komponente_Art_TypeClass newFMAKomponenteArt) {
		if (newFMAKomponenteArt != fMAKomponenteArt) {
			NotificationChain msgs = null;
			if (fMAKomponenteArt != null)
				msgs = ((InternalEObject)fMAKomponenteArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART, null, msgs);
			if (newFMAKomponenteArt != null)
				msgs = ((InternalEObject)newFMAKomponenteArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART, null, msgs);
			msgs = basicSetFMAKomponenteArt(newFMAKomponenteArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART, newFMAKomponenteArt, newFMAKomponenteArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT:
				return basicSetFMAKomponenteAchszaehlpunkt(null, msgs);
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART:
				return basicSetFMAKomponenteArt(null, msgs);
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
			case OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG:
				return getBezeichnung();
			case OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT:
				if (resolve) return getIDBezugspunkt();
				return basicGetIDBezugspunkt();
			case OrtungPackage.FMA_KOMPONENTE__IDFM_AGRENZE:
				return getIDFMAgrenze();
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT:
				return getFMAKomponenteAchszaehlpunkt();
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART:
				return getFMAKomponenteArt();
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
			case OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT:
				setIDBezugspunkt((Markanter_Punkt)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE__IDFM_AGRENZE:
				getIDFMAgrenze().clear();
				getIDFMAgrenze().addAll((Collection<? extends FMA_Anlage>)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT:
				setFMAKomponenteAchszaehlpunkt((FMA_Komponente_Achszaehlpunkt_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART:
				setFMAKomponenteArt((FMA_Komponente_Art_TypeClass)newValue);
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
			case OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT:
				unsetIDBezugspunkt();
				return;
			case OrtungPackage.FMA_KOMPONENTE__IDFM_AGRENZE:
				getIDFMAgrenze().clear();
				return;
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT:
				setFMAKomponenteAchszaehlpunkt((FMA_Komponente_Achszaehlpunkt_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART:
				setFMAKomponenteArt((FMA_Komponente_Art_TypeClass)null);
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
			case OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG:
				return bezeichnung != null;
			case OrtungPackage.FMA_KOMPONENTE__ID_BEZUGSPUNKT:
				return isSetIDBezugspunkt();
			case OrtungPackage.FMA_KOMPONENTE__IDFM_AGRENZE:
				return iDFMAgrenze != null && !iDFMAgrenze.isEmpty();
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT:
				return fMAKomponenteAchszaehlpunkt != null;
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART:
				return fMAKomponenteArt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FMA_KomponenteImpl
