/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.W_Lage_TypeClass;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss WAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl#getIDWKrElement <em>IDW Kr Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl#getSchlossArt <em>Schloss Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl#getVerschlussOrt <em>Verschluss Ort</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl#getWAnbaulage <em>WAnbaulage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_W_AttributeGroupImpl#getWLage <em>WLage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_W_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schloss_W_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDWKrElement() <em>IDW Kr Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDWKrElement;

	/**
	 * This is true if the IDW Kr Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWKrElementESet;

	/**
	 * The cached value of the '{@link #getSchlossArt() <em>Schloss Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchlossArt()
	 * @generated
	 * @ordered
	 */
	protected Schloss_Art_TypeClass schlossArt;

	/**
	 * The cached value of the '{@link #getVerschlussOrt() <em>Verschluss Ort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerschlussOrt()
	 * @generated
	 * @ordered
	 */
	protected Verschluss_Ort_TypeClass verschlussOrt;

	/**
	 * The cached value of the '{@link #getWAnbaulage() <em>WAnbaulage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWAnbaulage()
	 * @generated
	 * @ordered
	 */
	protected W_Anbaulage_TypeClass wAnbaulage;

	/**
	 * The cached value of the '{@link #getWLage() <em>WLage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWLage()
	 * @generated
	 * @ordered
	 */
	protected W_Lage_TypeClass wLage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_W_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_WATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDWKrElement() {
		if (iDWKrElement != null && iDWKrElement.eIsProxy()) {
			InternalEObject oldIDWKrElement = (InternalEObject)iDWKrElement;
			iDWKrElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDWKrElement);
			if (iDWKrElement != oldIDWKrElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT, oldIDWKrElement, iDWKrElement));
			}
		}
		return iDWKrElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDWKrElement() {
		return iDWKrElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWKrElement(W_Kr_Gsp_Element newIDWKrElement) {
		W_Kr_Gsp_Element oldIDWKrElement = iDWKrElement;
		iDWKrElement = newIDWKrElement;
		boolean oldIDWKrElementESet = iDWKrElementESet;
		iDWKrElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT, oldIDWKrElement, iDWKrElement, !oldIDWKrElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWKrElement() {
		W_Kr_Gsp_Element oldIDWKrElement = iDWKrElement;
		boolean oldIDWKrElementESet = iDWKrElementESet;
		iDWKrElement = null;
		iDWKrElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT, oldIDWKrElement, null, oldIDWKrElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWKrElement() {
		return iDWKrElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schloss_Art_TypeClass getSchlossArt() {
		return schlossArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchlossArt(Schloss_Art_TypeClass newSchlossArt, NotificationChain msgs) {
		Schloss_Art_TypeClass oldSchlossArt = schlossArt;
		schlossArt = newSchlossArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART, oldSchlossArt, newSchlossArt);
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
	public void setSchlossArt(Schloss_Art_TypeClass newSchlossArt) {
		if (newSchlossArt != schlossArt) {
			NotificationChain msgs = null;
			if (schlossArt != null)
				msgs = ((InternalEObject)schlossArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART, null, msgs);
			if (newSchlossArt != null)
				msgs = ((InternalEObject)newSchlossArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART, null, msgs);
			msgs = basicSetSchlossArt(newSchlossArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART, newSchlossArt, newSchlossArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verschluss_Ort_TypeClass getVerschlussOrt() {
		return verschlussOrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerschlussOrt(Verschluss_Ort_TypeClass newVerschlussOrt, NotificationChain msgs) {
		Verschluss_Ort_TypeClass oldVerschlussOrt = verschlussOrt;
		verschlussOrt = newVerschlussOrt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT, oldVerschlussOrt, newVerschlussOrt);
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
	public void setVerschlussOrt(Verschluss_Ort_TypeClass newVerschlussOrt) {
		if (newVerschlussOrt != verschlussOrt) {
			NotificationChain msgs = null;
			if (verschlussOrt != null)
				msgs = ((InternalEObject)verschlussOrt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT, null, msgs);
			if (newVerschlussOrt != null)
				msgs = ((InternalEObject)newVerschlussOrt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT, null, msgs);
			msgs = basicSetVerschlussOrt(newVerschlussOrt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT, newVerschlussOrt, newVerschlussOrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Anbaulage_TypeClass getWAnbaulage() {
		return wAnbaulage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWAnbaulage(W_Anbaulage_TypeClass newWAnbaulage, NotificationChain msgs) {
		W_Anbaulage_TypeClass oldWAnbaulage = wAnbaulage;
		wAnbaulage = newWAnbaulage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE, oldWAnbaulage, newWAnbaulage);
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
	public void setWAnbaulage(W_Anbaulage_TypeClass newWAnbaulage) {
		if (newWAnbaulage != wAnbaulage) {
			NotificationChain msgs = null;
			if (wAnbaulage != null)
				msgs = ((InternalEObject)wAnbaulage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE, null, msgs);
			if (newWAnbaulage != null)
				msgs = ((InternalEObject)newWAnbaulage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE, null, msgs);
			msgs = basicSetWAnbaulage(newWAnbaulage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE, newWAnbaulage, newWAnbaulage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Lage_TypeClass getWLage() {
		return wLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWLage(W_Lage_TypeClass newWLage, NotificationChain msgs) {
		W_Lage_TypeClass oldWLage = wLage;
		wLage = newWLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE, oldWLage, newWLage);
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
	public void setWLage(W_Lage_TypeClass newWLage) {
		if (newWLage != wLage) {
			NotificationChain msgs = null;
			if (wLage != null)
				msgs = ((InternalEObject)wLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE, null, msgs);
			if (newWLage != null)
				msgs = ((InternalEObject)newWLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE, null, msgs);
			msgs = basicSetWLage(newWLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE, newWLage, newWLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART:
				return basicSetSchlossArt(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT:
				return basicSetVerschlussOrt(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE:
				return basicSetWAnbaulage(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE:
				return basicSetWLage(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT:
				if (resolve) return getIDWKrElement();
				return basicGetIDWKrElement();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART:
				return getSchlossArt();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT:
				return getVerschlussOrt();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE:
				return getWAnbaulage();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE:
				return getWLage();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT:
				setIDWKrElement((W_Kr_Gsp_Element)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART:
				setSchlossArt((Schloss_Art_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT:
				setVerschlussOrt((Verschluss_Ort_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE:
				setWAnbaulage((W_Anbaulage_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE:
				setWLage((W_Lage_TypeClass)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT:
				unsetIDWKrElement();
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART:
				setSchlossArt((Schloss_Art_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT:
				setVerschlussOrt((Verschluss_Ort_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE:
				setWAnbaulage((W_Anbaulage_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE:
				setWLage((W_Lage_TypeClass)null);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT:
				return isSetIDWKrElement();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART:
				return schlossArt != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT:
				return verschlussOrt != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE:
				return wAnbaulage != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_WATTRIBUTE_GROUP__WLAGE:
				return wLage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schloss_W_AttributeGroupImpl
