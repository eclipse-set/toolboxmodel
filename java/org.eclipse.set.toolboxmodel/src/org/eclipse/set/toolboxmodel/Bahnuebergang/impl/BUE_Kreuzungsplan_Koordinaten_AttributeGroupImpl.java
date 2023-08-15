/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Pixel_Koordinate_X_TypeClass;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Pixel_Koordinate_Y_TypeClass;

import org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Kreuzungsplan Koordinaten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl#getPixelKoordinateX <em>Pixel Koordinate X</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl#getPixelKoordinateY <em>Pixel Koordinate Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BUE_Kreuzungsplan_Koordinaten_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDGEOPunkt() <em>IDGEO Punkt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<GEO_Punkt> iDGEOPunkt;

	/**
	 * The cached value of the '{@link #getPixelKoordinateX() <em>Pixel Koordinate X</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelKoordinateX()
	 * @generated
	 * @ordered
	 */
	protected Pixel_Koordinate_X_TypeClass pixelKoordinateX;

	/**
	 * The cached value of the '{@link #getPixelKoordinateY() <em>Pixel Koordinate Y</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPixelKoordinateY()
	 * @generated
	 * @ordered
	 */
	protected Pixel_Koordinate_Y_TypeClass pixelKoordinateY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Kreuzungsplan_Koordinaten_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEO_Punkt> getIDGEOPunkt() {
		if (iDGEOPunkt == null) {
			iDGEOPunkt = new EObjectResolvingEList<GEO_Punkt>(GEO_Punkt.class, this, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT);
		}
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pixel_Koordinate_X_TypeClass getPixelKoordinateX() {
		return pixelKoordinateX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelKoordinateX(Pixel_Koordinate_X_TypeClass newPixelKoordinateX, NotificationChain msgs) {
		Pixel_Koordinate_X_TypeClass oldPixelKoordinateX = pixelKoordinateX;
		pixelKoordinateX = newPixelKoordinateX;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, oldPixelKoordinateX, newPixelKoordinateX);
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
	public void setPixelKoordinateX(Pixel_Koordinate_X_TypeClass newPixelKoordinateX) {
		if (newPixelKoordinateX != pixelKoordinateX) {
			NotificationChain msgs = null;
			if (pixelKoordinateX != null)
				msgs = ((InternalEObject)pixelKoordinateX).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, null, msgs);
			if (newPixelKoordinateX != null)
				msgs = ((InternalEObject)newPixelKoordinateX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, null, msgs);
			msgs = basicSetPixelKoordinateX(newPixelKoordinateX, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X, newPixelKoordinateX, newPixelKoordinateX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pixel_Koordinate_Y_TypeClass getPixelKoordinateY() {
		return pixelKoordinateY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPixelKoordinateY(Pixel_Koordinate_Y_TypeClass newPixelKoordinateY, NotificationChain msgs) {
		Pixel_Koordinate_Y_TypeClass oldPixelKoordinateY = pixelKoordinateY;
		pixelKoordinateY = newPixelKoordinateY;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, oldPixelKoordinateY, newPixelKoordinateY);
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
	public void setPixelKoordinateY(Pixel_Koordinate_Y_TypeClass newPixelKoordinateY) {
		if (newPixelKoordinateY != pixelKoordinateY) {
			NotificationChain msgs = null;
			if (pixelKoordinateY != null)
				msgs = ((InternalEObject)pixelKoordinateY).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, null, msgs);
			if (newPixelKoordinateY != null)
				msgs = ((InternalEObject)newPixelKoordinateY).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, null, msgs);
			msgs = basicSetPixelKoordinateY(newPixelKoordinateY, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y, newPixelKoordinateY, newPixelKoordinateY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				return basicSetPixelKoordinateX(null, msgs);
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				return basicSetPixelKoordinateY(null, msgs);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				return getIDGEOPunkt();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				return getPixelKoordinateX();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				return getPixelKoordinateY();
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				getIDGEOPunkt().clear();
				getIDGEOPunkt().addAll((Collection<? extends GEO_Punkt>)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				setPixelKoordinateX((Pixel_Koordinate_X_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				setPixelKoordinateY((Pixel_Koordinate_Y_TypeClass)newValue);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				getIDGEOPunkt().clear();
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				setPixelKoordinateX((Pixel_Koordinate_X_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				setPixelKoordinateY((Pixel_Koordinate_Y_TypeClass)null);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__IDGEO_PUNKT:
				return iDGEOPunkt != null && !iDGEOPunkt.isEmpty();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_X:
				return pixelKoordinateX != null;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN_KOORDINATEN_ATTRIBUTE_GROUP__PIXEL_KOORDINATE_Y:
				return pixelKoordinateY != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Kreuzungsplan_Koordinaten_AttributeGroupImpl
