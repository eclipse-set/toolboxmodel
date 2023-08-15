/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Element;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Element_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Element_Anschluss_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_ElementImpl#getFMAElementAllg <em>FMA Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_ElementImpl#getFMAElementAnschluss <em>FMA Element Anschluss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_ElementImpl#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_ElementImpl extends Punkt_ObjektImpl implements FMA_Element {
	/**
	 * The cached value of the '{@link #getFMAElementAllg() <em>FMA Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementAllg()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Allg_AttributeGroup fMAElementAllg;

	/**
	 * The cached value of the '{@link #getFMAElementAnschluss() <em>FMA Element Anschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAElementAnschluss()
	 * @generated
	 * @ordered
	 */
	protected FMA_Element_Anschluss_AttributeGroup fMAElementAnschluss;

	/**
	 * The cached value of the '{@link #getIDFMAAnlage() <em>IDFMA Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlage()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage iDFMAAnlage;

	/**
	 * This is true if the IDFMA Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFMAAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Allg_AttributeGroup getFMAElementAllg() {
		return fMAElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementAllg(FMA_Element_Allg_AttributeGroup newFMAElementAllg, NotificationChain msgs) {
		FMA_Element_Allg_AttributeGroup oldFMAElementAllg = fMAElementAllg;
		fMAElementAllg = newFMAElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, oldFMAElementAllg, newFMAElementAllg);
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
	public void setFMAElementAllg(FMA_Element_Allg_AttributeGroup newFMAElementAllg) {
		if (newFMAElementAllg != fMAElementAllg) {
			NotificationChain msgs = null;
			if (fMAElementAllg != null)
				msgs = ((InternalEObject)fMAElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, null, msgs);
			if (newFMAElementAllg != null)
				msgs = ((InternalEObject)newFMAElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, null, msgs);
			msgs = basicSetFMAElementAllg(newFMAElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG, newFMAElementAllg, newFMAElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Element_Anschluss_AttributeGroup getFMAElementAnschluss() {
		return fMAElementAnschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAElementAnschluss(FMA_Element_Anschluss_AttributeGroup newFMAElementAnschluss, NotificationChain msgs) {
		FMA_Element_Anschluss_AttributeGroup oldFMAElementAnschluss = fMAElementAnschluss;
		fMAElementAnschluss = newFMAElementAnschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, oldFMAElementAnschluss, newFMAElementAnschluss);
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
	public void setFMAElementAnschluss(FMA_Element_Anschluss_AttributeGroup newFMAElementAnschluss) {
		if (newFMAElementAnschluss != fMAElementAnschluss) {
			NotificationChain msgs = null;
			if (fMAElementAnschluss != null)
				msgs = ((InternalEObject)fMAElementAnschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, null, msgs);
			if (newFMAElementAnschluss != null)
				msgs = ((InternalEObject)newFMAElementAnschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, null, msgs);
			msgs = basicSetFMAElementAnschluss(newFMAElementAnschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS, newFMAElementAnschluss, newFMAElementAnschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage getIDFMAAnlage() {
		if (iDFMAAnlage != null && iDFMAAnlage.eIsProxy()) {
			InternalEObject oldIDFMAAnlage = (InternalEObject)iDFMAAnlage;
			iDFMAAnlage = (FMA_Anlage)eResolveProxy(oldIDFMAAnlage);
			if (iDFMAAnlage != oldIDFMAAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, oldIDFMAAnlage, iDFMAAnlage));
			}
		}
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMA_Anlage basicGetIDFMAAnlage() {
		return iDFMAAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFMAAnlage(FMA_Anlage newIDFMAAnlage) {
		FMA_Anlage oldIDFMAAnlage = iDFMAAnlage;
		iDFMAAnlage = newIDFMAAnlage;
		boolean oldIDFMAAnlageESet = iDFMAAnlageESet;
		iDFMAAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, oldIDFMAAnlage, iDFMAAnlage, !oldIDFMAAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFMAAnlage() {
		FMA_Anlage oldIDFMAAnlage = iDFMAAnlage;
		boolean oldIDFMAAnlageESet = iDFMAAnlageESet;
		iDFMAAnlage = null;
		iDFMAAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE, oldIDFMAAnlage, null, oldIDFMAAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFMAAnlage() {
		return iDFMAAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				return basicSetFMAElementAllg(null, msgs);
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				return basicSetFMAElementAnschluss(null, msgs);
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				return getFMAElementAllg();
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				return getFMAElementAnschluss();
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				if (resolve) return getIDFMAAnlage();
				return basicGetIDFMAAnlage();
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				setFMAElementAllg((FMA_Element_Allg_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				setFMAElementAnschluss((FMA_Element_Anschluss_AttributeGroup)newValue);
				return;
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				setIDFMAAnlage((FMA_Anlage)newValue);
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				setFMAElementAllg((FMA_Element_Allg_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				setFMAElementAnschluss((FMA_Element_Anschluss_AttributeGroup)null);
				return;
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				unsetIDFMAAnlage();
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
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ALLG:
				return fMAElementAllg != null;
			case OrtungPackage.FMA_ELEMENT__FMA_ELEMENT_ANSCHLUSS:
				return fMAElementAnschluss != null;
			case OrtungPackage.FMA_ELEMENT__IDFMA_ANLAGE:
				return isSetIDFMAAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //FMA_ElementImpl
