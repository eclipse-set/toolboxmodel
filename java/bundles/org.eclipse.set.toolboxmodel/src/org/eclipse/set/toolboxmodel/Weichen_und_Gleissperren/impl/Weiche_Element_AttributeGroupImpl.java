/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Signale.Signal;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Auffahrortung_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weiche_Vorzugslage_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weiche Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getAuffahrortung <em>Auffahrortung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getGZFreimeldungL <em>GZ Freimeldung L</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getGZFreimeldungR <em>GZ Freimeldung R</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getIDGrenzzeichen <em>ID Grenzzeichen</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getWeicheBetriebsart <em>Weiche Betriebsart</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Element_AttributeGroupImpl#getWeicheVorzugslage <em>Weiche Vorzugslage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Weiche_Element_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Weiche_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAuffahrortung() <em>Auffahrortung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuffahrortung()
	 * @generated
	 * @ordered
	 */
	protected Auffahrortung_TypeClass auffahrortung;

	/**
	 * The cached value of the '{@link #getGZFreimeldungL() <em>GZ Freimeldung L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGZFreimeldungL()
	 * @generated
	 * @ordered
	 */
	protected GZ_Freimeldung_L_AttributeGroup gZFreimeldungL;

	/**
	 * The cached value of the '{@link #getGZFreimeldungR() <em>GZ Freimeldung R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGZFreimeldungR()
	 * @generated
	 * @ordered
	 */
	protected GZ_Freimeldung_R_AttributeGroup gZFreimeldungR;

	/**
	 * The cached value of the '{@link #getIDGrenzzeichen() <em>ID Grenzzeichen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGrenzzeichen()
	 * @generated
	 * @ordered
	 */
	protected Signal iDGrenzzeichen;

	/**
	 * This is true if the ID Grenzzeichen reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGrenzzeichenESet;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignal;

	/**
	 * This is true if the ID Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalESet;

	/**
	 * The cached value of the '{@link #getWeicheBetriebsart() <em>Weiche Betriebsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeicheBetriebsart()
	 * @generated
	 * @ordered
	 */
	protected Weiche_Betriebsart_TypeClass weicheBetriebsart;

	/**
	 * The cached value of the '{@link #getWeicheVorzugslage() <em>Weiche Vorzugslage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeicheVorzugslage()
	 * @generated
	 * @ordered
	 */
	protected Weiche_Vorzugslage_TypeClass weicheVorzugslage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Weiche_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WEICHE_ELEMENT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Auffahrortung_TypeClass getAuffahrortung() {
		return auffahrortung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuffahrortung(Auffahrortung_TypeClass newAuffahrortung, NotificationChain msgs) {
		Auffahrortung_TypeClass oldAuffahrortung = auffahrortung;
		auffahrortung = newAuffahrortung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG, oldAuffahrortung, newAuffahrortung);
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
	public void setAuffahrortung(Auffahrortung_TypeClass newAuffahrortung) {
		if (newAuffahrortung != auffahrortung) {
			NotificationChain msgs = null;
			if (auffahrortung != null)
				msgs = ((InternalEObject)auffahrortung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG, null, msgs);
			if (newAuffahrortung != null)
				msgs = ((InternalEObject)newAuffahrortung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG, null, msgs);
			msgs = basicSetAuffahrortung(newAuffahrortung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG, newAuffahrortung, newAuffahrortung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GZ_Freimeldung_L_AttributeGroup getGZFreimeldungL() {
		return gZFreimeldungL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGZFreimeldungL(GZ_Freimeldung_L_AttributeGroup newGZFreimeldungL, NotificationChain msgs) {
		GZ_Freimeldung_L_AttributeGroup oldGZFreimeldungL = gZFreimeldungL;
		gZFreimeldungL = newGZFreimeldungL;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L, oldGZFreimeldungL, newGZFreimeldungL);
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
	public void setGZFreimeldungL(GZ_Freimeldung_L_AttributeGroup newGZFreimeldungL) {
		if (newGZFreimeldungL != gZFreimeldungL) {
			NotificationChain msgs = null;
			if (gZFreimeldungL != null)
				msgs = ((InternalEObject)gZFreimeldungL).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L, null, msgs);
			if (newGZFreimeldungL != null)
				msgs = ((InternalEObject)newGZFreimeldungL).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L, null, msgs);
			msgs = basicSetGZFreimeldungL(newGZFreimeldungL, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L, newGZFreimeldungL, newGZFreimeldungL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GZ_Freimeldung_R_AttributeGroup getGZFreimeldungR() {
		return gZFreimeldungR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGZFreimeldungR(GZ_Freimeldung_R_AttributeGroup newGZFreimeldungR, NotificationChain msgs) {
		GZ_Freimeldung_R_AttributeGroup oldGZFreimeldungR = gZFreimeldungR;
		gZFreimeldungR = newGZFreimeldungR;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R, oldGZFreimeldungR, newGZFreimeldungR);
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
	public void setGZFreimeldungR(GZ_Freimeldung_R_AttributeGroup newGZFreimeldungR) {
		if (newGZFreimeldungR != gZFreimeldungR) {
			NotificationChain msgs = null;
			if (gZFreimeldungR != null)
				msgs = ((InternalEObject)gZFreimeldungR).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R, null, msgs);
			if (newGZFreimeldungR != null)
				msgs = ((InternalEObject)newGZFreimeldungR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R, null, msgs);
			msgs = basicSetGZFreimeldungR(newGZFreimeldungR, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R, newGZFreimeldungR, newGZFreimeldungR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDGrenzzeichen() {
		if (iDGrenzzeichen != null && iDGrenzzeichen.eIsProxy()) {
			InternalEObject oldIDGrenzzeichen = (InternalEObject)iDGrenzzeichen;
			iDGrenzzeichen = (Signal)eResolveProxy(oldIDGrenzzeichen);
			if (iDGrenzzeichen != oldIDGrenzzeichen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN, oldIDGrenzzeichen, iDGrenzzeichen));
			}
		}
		return iDGrenzzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDGrenzzeichen() {
		return iDGrenzzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGrenzzeichen(Signal newIDGrenzzeichen) {
		Signal oldIDGrenzzeichen = iDGrenzzeichen;
		iDGrenzzeichen = newIDGrenzzeichen;
		boolean oldIDGrenzzeichenESet = iDGrenzzeichenESet;
		iDGrenzzeichenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN, oldIDGrenzzeichen, iDGrenzzeichen, !oldIDGrenzzeichenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGrenzzeichen() {
		Signal oldIDGrenzzeichen = iDGrenzzeichen;
		boolean oldIDGrenzzeichenESet = iDGrenzzeichenESet;
		iDGrenzzeichen = null;
		iDGrenzzeichenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN, oldIDGrenzzeichen, null, oldIDGrenzzeichenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGrenzzeichen() {
		return iDGrenzzeichenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignal() {
		if (iDSignal != null && iDSignal.eIsProxy()) {
			InternalEObject oldIDSignal = (InternalEObject)iDSignal;
			iDSignal = (Signal)eResolveProxy(oldIDSignal);
			if (iDSignal != oldIDSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL, oldIDSignal, iDSignal));
			}
		}
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignal(Signal newIDSignal) {
		Signal oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignal() {
		Signal oldIDSignal = iDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignal = null;
		iDSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignal() {
		return iDSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Betriebsart_TypeClass getWeicheBetriebsart() {
		return weicheBetriebsart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeicheBetriebsart(Weiche_Betriebsart_TypeClass newWeicheBetriebsart, NotificationChain msgs) {
		Weiche_Betriebsart_TypeClass oldWeicheBetriebsart = weicheBetriebsart;
		weicheBetriebsart = newWeicheBetriebsart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART, oldWeicheBetriebsart, newWeicheBetriebsart);
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
	public void setWeicheBetriebsart(Weiche_Betriebsart_TypeClass newWeicheBetriebsart) {
		if (newWeicheBetriebsart != weicheBetriebsart) {
			NotificationChain msgs = null;
			if (weicheBetriebsart != null)
				msgs = ((InternalEObject)weicheBetriebsart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART, null, msgs);
			if (newWeicheBetriebsart != null)
				msgs = ((InternalEObject)newWeicheBetriebsart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART, null, msgs);
			msgs = basicSetWeicheBetriebsart(newWeicheBetriebsart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART, newWeicheBetriebsart, newWeicheBetriebsart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Vorzugslage_TypeClass getWeicheVorzugslage() {
		return weicheVorzugslage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeicheVorzugslage(Weiche_Vorzugslage_TypeClass newWeicheVorzugslage, NotificationChain msgs) {
		Weiche_Vorzugslage_TypeClass oldWeicheVorzugslage = weicheVorzugslage;
		weicheVorzugslage = newWeicheVorzugslage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE, oldWeicheVorzugslage, newWeicheVorzugslage);
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
	public void setWeicheVorzugslage(Weiche_Vorzugslage_TypeClass newWeicheVorzugslage) {
		if (newWeicheVorzugslage != weicheVorzugslage) {
			NotificationChain msgs = null;
			if (weicheVorzugslage != null)
				msgs = ((InternalEObject)weicheVorzugslage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE, null, msgs);
			if (newWeicheVorzugslage != null)
				msgs = ((InternalEObject)newWeicheVorzugslage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE, null, msgs);
			msgs = basicSetWeicheVorzugslage(newWeicheVorzugslage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE, newWeicheVorzugslage, newWeicheVorzugslage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG:
				return basicSetAuffahrortung(null, msgs);
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L:
				return basicSetGZFreimeldungL(null, msgs);
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R:
				return basicSetGZFreimeldungR(null, msgs);
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART:
				return basicSetWeicheBetriebsart(null, msgs);
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE:
				return basicSetWeicheVorzugslage(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG:
				return getAuffahrortung();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L:
				return getGZFreimeldungL();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R:
				return getGZFreimeldungR();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN:
				if (resolve) return getIDGrenzzeichen();
				return basicGetIDGrenzzeichen();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART:
				return getWeicheBetriebsart();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE:
				return getWeicheVorzugslage();
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
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG:
				setAuffahrortung((Auffahrortung_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L:
				setGZFreimeldungL((GZ_Freimeldung_L_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R:
				setGZFreimeldungR((GZ_Freimeldung_R_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN:
				setIDGrenzzeichen((Signal)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART:
				setWeicheBetriebsart((Weiche_Betriebsart_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE:
				setWeicheVorzugslage((Weiche_Vorzugslage_TypeClass)newValue);
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
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG:
				setAuffahrortung((Auffahrortung_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L:
				setGZFreimeldungL((GZ_Freimeldung_L_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R:
				setGZFreimeldungR((GZ_Freimeldung_R_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN:
				unsetIDGrenzzeichen();
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL:
				unsetIDSignal();
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART:
				setWeicheBetriebsart((Weiche_Betriebsart_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE:
				setWeicheVorzugslage((Weiche_Vorzugslage_TypeClass)null);
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
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__AUFFAHRORTUNG:
				return auffahrortung != null;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_L:
				return gZFreimeldungL != null;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__GZ_FREIMELDUNG_R:
				return gZFreimeldungR != null;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_GRENZZEICHEN:
				return isSetIDGrenzzeichen();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__ID_SIGNAL:
				return isSetIDSignal();
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_BETRIEBSART:
				return weicheBetriebsart != null;
			case Weichen_und_GleissperrenPackage.WEICHE_ELEMENT_ATTRIBUTE_GROUP__WEICHE_VORZUGSLAGE:
				return weicheVorzugslage != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Weiche_Element_AttributeGroupImpl
