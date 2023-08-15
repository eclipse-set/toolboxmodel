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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Basisobjekte.Abstand_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Seitliche_Lage_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Seitlicher_Abstand_TypeClass;
import org.eclipse.set.toolboxmodel.Basisobjekte.Wirkrichtung_TypeClass;

import org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt;
import org.eclipse.set.toolboxmodel.Geodaten.TOP_Kante;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Punkt Objekt TOP Kante Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl#getAbstand <em>Abstand</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl#getIDGEOPunktBerechnet <em>IDGEO Punkt Berechnet</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl#getIDTOPKante <em>IDTOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl#getWirkrichtung <em>Wirkrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl#getSeitlicheLage <em>Seitliche Lage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_Objekt_TOP_Kante_AttributeGroupImpl#getSeitlicherAbstand <em>Seitlicher Abstand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Punkt_Objekt_TOP_Kante_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Punkt_Objekt_TOP_Kante_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstand() <em>Abstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstand()
	 * @generated
	 * @ordered
	 */
	protected Abstand_TypeClass abstand;

	/**
	 * The cached value of the '{@link #getIDGEOPunktBerechnet() <em>IDGEO Punkt Berechnet</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunktBerechnet()
	 * @generated
	 * @ordered
	 */
	protected EList<GEO_Punkt> iDGEOPunktBerechnet;

	/**
	 * The cached value of the '{@link #getIDTOPKante() <em>IDTOP Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTOPKante()
	 * @generated
	 * @ordered
	 */
	protected TOP_Kante iDTOPKante;

	/**
	 * This is true if the IDTOP Kante reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDTOPKanteESet;

	/**
	 * The cached value of the '{@link #getWirkrichtung() <em>Wirkrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirkrichtung()
	 * @generated
	 * @ordered
	 */
	protected Wirkrichtung_TypeClass wirkrichtung;

	/**
	 * The cached value of the '{@link #getSeitlicheLage() <em>Seitliche Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitlicheLage()
	 * @generated
	 * @ordered
	 */
	protected Seitliche_Lage_TypeClass seitlicheLage;

	/**
	 * The cached value of the '{@link #getSeitlicherAbstand() <em>Seitlicher Abstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeitlicherAbstand()
	 * @generated
	 * @ordered
	 */
	protected Seitlicher_Abstand_TypeClass seitlicherAbstand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Punkt_Objekt_TOP_Kante_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_TypeClass getAbstand() {
		return abstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstand(Abstand_TypeClass newAbstand, NotificationChain msgs) {
		Abstand_TypeClass oldAbstand = abstand;
		abstand = newAbstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND, oldAbstand, newAbstand);
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
	public void setAbstand(Abstand_TypeClass newAbstand) {
		if (newAbstand != abstand) {
			NotificationChain msgs = null;
			if (abstand != null)
				msgs = ((InternalEObject)abstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND, null, msgs);
			if (newAbstand != null)
				msgs = ((InternalEObject)newAbstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND, null, msgs);
			msgs = basicSetAbstand(newAbstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND, newAbstand, newAbstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GEO_Punkt> getIDGEOPunktBerechnet() {
		if (iDGEOPunktBerechnet == null) {
			iDGEOPunktBerechnet = new EObjectResolvingEList<GEO_Punkt>(GEO_Punkt.class, this, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET);
		}
		return iDGEOPunktBerechnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOP_Kante getIDTOPKante() {
		if (iDTOPKante != null && iDTOPKante.eIsProxy()) {
			InternalEObject oldIDTOPKante = (InternalEObject)iDTOPKante;
			iDTOPKante = (TOP_Kante)eResolveProxy(oldIDTOPKante);
			if (iDTOPKante != oldIDTOPKante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE, oldIDTOPKante, iDTOPKante));
			}
		}
		return iDTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP_Kante basicGetIDTOPKante() {
		return iDTOPKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDTOPKante(TOP_Kante newIDTOPKante) {
		TOP_Kante oldIDTOPKante = iDTOPKante;
		iDTOPKante = newIDTOPKante;
		boolean oldIDTOPKanteESet = iDTOPKanteESet;
		iDTOPKanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE, oldIDTOPKante, iDTOPKante, !oldIDTOPKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDTOPKante() {
		TOP_Kante oldIDTOPKante = iDTOPKante;
		boolean oldIDTOPKanteESet = iDTOPKanteESet;
		iDTOPKante = null;
		iDTOPKanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE, oldIDTOPKante, null, oldIDTOPKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDTOPKante() {
		return iDTOPKanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirkrichtung_TypeClass getWirkrichtung() {
		return wirkrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirkrichtung(Wirkrichtung_TypeClass newWirkrichtung, NotificationChain msgs) {
		Wirkrichtung_TypeClass oldWirkrichtung = wirkrichtung;
		wirkrichtung = newWirkrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG, oldWirkrichtung, newWirkrichtung);
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
	public void setWirkrichtung(Wirkrichtung_TypeClass newWirkrichtung) {
		if (newWirkrichtung != wirkrichtung) {
			NotificationChain msgs = null;
			if (wirkrichtung != null)
				msgs = ((InternalEObject)wirkrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG, null, msgs);
			if (newWirkrichtung != null)
				msgs = ((InternalEObject)newWirkrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG, null, msgs);
			msgs = basicSetWirkrichtung(newWirkrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG, newWirkrichtung, newWirkrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seitliche_Lage_TypeClass getSeitlicheLage() {
		return seitlicheLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeitlicheLage(Seitliche_Lage_TypeClass newSeitlicheLage, NotificationChain msgs) {
		Seitliche_Lage_TypeClass oldSeitlicheLage = seitlicheLage;
		seitlicheLage = newSeitlicheLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE, oldSeitlicheLage, newSeitlicheLage);
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
	public void setSeitlicheLage(Seitliche_Lage_TypeClass newSeitlicheLage) {
		if (newSeitlicheLage != seitlicheLage) {
			NotificationChain msgs = null;
			if (seitlicheLage != null)
				msgs = ((InternalEObject)seitlicheLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE, null, msgs);
			if (newSeitlicheLage != null)
				msgs = ((InternalEObject)newSeitlicheLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE, null, msgs);
			msgs = basicSetSeitlicheLage(newSeitlicheLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE, newSeitlicheLage, newSeitlicheLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Seitlicher_Abstand_TypeClass getSeitlicherAbstand() {
		return seitlicherAbstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeitlicherAbstand(Seitlicher_Abstand_TypeClass newSeitlicherAbstand, NotificationChain msgs) {
		Seitlicher_Abstand_TypeClass oldSeitlicherAbstand = seitlicherAbstand;
		seitlicherAbstand = newSeitlicherAbstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND, oldSeitlicherAbstand, newSeitlicherAbstand);
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
	public void setSeitlicherAbstand(Seitlicher_Abstand_TypeClass newSeitlicherAbstand) {
		if (newSeitlicherAbstand != seitlicherAbstand) {
			NotificationChain msgs = null;
			if (seitlicherAbstand != null)
				msgs = ((InternalEObject)seitlicherAbstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND, null, msgs);
			if (newSeitlicherAbstand != null)
				msgs = ((InternalEObject)newSeitlicherAbstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND, null, msgs);
			msgs = basicSetSeitlicherAbstand(newSeitlicherAbstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND, newSeitlicherAbstand, newSeitlicherAbstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND:
				return basicSetAbstand(null, msgs);
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				return basicSetWirkrichtung(null, msgs);
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE:
				return basicSetSeitlicheLage(null, msgs);
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND:
				return basicSetSeitlicherAbstand(null, msgs);
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
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND:
				return getAbstand();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET:
				return getIDGEOPunktBerechnet();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE:
				if (resolve) return getIDTOPKante();
				return basicGetIDTOPKante();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				return getWirkrichtung();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE:
				return getSeitlicheLage();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND:
				return getSeitlicherAbstand();
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
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND:
				setAbstand((Abstand_TypeClass)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET:
				getIDGEOPunktBerechnet().clear();
				getIDGEOPunktBerechnet().addAll((Collection<? extends GEO_Punkt>)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE:
				setIDTOPKante((TOP_Kante)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				setWirkrichtung((Wirkrichtung_TypeClass)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE:
				setSeitlicheLage((Seitliche_Lage_TypeClass)newValue);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND:
				setSeitlicherAbstand((Seitlicher_Abstand_TypeClass)newValue);
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
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND:
				setAbstand((Abstand_TypeClass)null);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET:
				getIDGEOPunktBerechnet().clear();
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE:
				unsetIDTOPKante();
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				setWirkrichtung((Wirkrichtung_TypeClass)null);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE:
				setSeitlicheLage((Seitliche_Lage_TypeClass)null);
				return;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND:
				setSeitlicherAbstand((Seitlicher_Abstand_TypeClass)null);
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
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND:
				return abstand != null;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET:
				return iDGEOPunktBerechnet != null && !iDGEOPunktBerechnet.isEmpty();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE:
				return isSetIDTOPKante();
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG:
				return wirkrichtung != null;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE:
				return seitlicheLage != null;
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND:
				return seitlicherAbstand != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Punkt_Objekt_TOP_Kante_AttributeGroupImpl
