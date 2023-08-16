/**
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

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;

import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Gleissperre_Element_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Anlage;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichenlaufkette;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Gsp Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getIDWeichenlaufkette <em>ID Weichenlaufkette</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getWKrGspElementAllg <em>WKr Gsp Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getGleissperreElement <em>Gleissperre Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_ElementImpl#getWeicheElement <em>Weiche Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_Gsp_ElementImpl extends Basis_ObjektImpl implements W_Kr_Gsp_Element {
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
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected Regelzeichnung iDRegelzeichnung;

	/**
	 * This is true if the ID Regelzeichnung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRegelzeichnungESet;

	/**
	 * The cached value of the '{@link #getIDStellelement() <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellelement()
	 * @generated
	 * @ordered
	 */
	protected Stellelement iDStellelement;

	/**
	 * This is true if the ID Stellelement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStellelementESet;

	/**
	 * The cached value of the '{@link #getIDWKrAnlage() <em>IDW Kr Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrAnlage()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Anlage iDWKrAnlage;

	/**
	 * This is true if the IDW Kr Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWKrAnlageESet;

	/**
	 * The cached value of the '{@link #getIDWeichenlaufkette() <em>ID Weichenlaufkette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWeichenlaufkette()
	 * @generated
	 * @ordered
	 */
	protected Weichenlaufkette iDWeichenlaufkette;

	/**
	 * This is true if the ID Weichenlaufkette reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWeichenlaufketteESet;

	/**
	 * The cached value of the '{@link #getWKrGspElementAllg() <em>WKr Gsp Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWKrGspElementAllg()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element_Allg_AttributeGroup wKrGspElementAllg;

	/**
	 * The cached value of the '{@link #getGleissperreElement() <em>Gleissperre Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleissperreElement()
	 * @generated
	 * @ordered
	 */
	protected Gleissperre_Element_AttributeGroup gleissperreElement;

	/**
	 * The cached value of the '{@link #getWeicheElement() <em>Weiche Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeicheElement()
	 * @generated
	 * @ordered
	 */
	protected Weiche_Element_AttributeGroup weicheElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_Gsp_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_GSP_ELEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Regelzeichnung getIDRegelzeichnung() {
		if (iDRegelzeichnung != null && iDRegelzeichnung.eIsProxy()) {
			InternalEObject oldIDRegelzeichnung = (InternalEObject)iDRegelzeichnung;
			iDRegelzeichnung = (Regelzeichnung)eResolveProxy(oldIDRegelzeichnung);
			if (iDRegelzeichnung != oldIDRegelzeichnung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, oldIDRegelzeichnung, iDRegelzeichnung));
			}
		}
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regelzeichnung basicGetIDRegelzeichnung() {
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRegelzeichnung(Regelzeichnung newIDRegelzeichnung) {
		Regelzeichnung oldIDRegelzeichnung = iDRegelzeichnung;
		iDRegelzeichnung = newIDRegelzeichnung;
		boolean oldIDRegelzeichnungESet = iDRegelzeichnungESet;
		iDRegelzeichnungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, oldIDRegelzeichnung, iDRegelzeichnung, !oldIDRegelzeichnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRegelzeichnung() {
		Regelzeichnung oldIDRegelzeichnung = iDRegelzeichnung;
		boolean oldIDRegelzeichnungESet = iDRegelzeichnungESet;
		iDRegelzeichnung = null;
		iDRegelzeichnungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG, oldIDRegelzeichnung, null, oldIDRegelzeichnungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRegelzeichnung() {
		return iDRegelzeichnungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stellelement getIDStellelement() {
		if (iDStellelement != null && iDStellelement.eIsProxy()) {
			InternalEObject oldIDStellelement = (InternalEObject)iDStellelement;
			iDStellelement = (Stellelement)eResolveProxy(oldIDStellelement);
			if (iDStellelement != oldIDStellelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, oldIDStellelement, iDStellelement));
			}
		}
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stellelement basicGetIDStellelement() {
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStellelement(Stellelement newIDStellelement) {
		Stellelement oldIDStellelement = iDStellelement;
		iDStellelement = newIDStellelement;
		boolean oldIDStellelementESet = iDStellelementESet;
		iDStellelementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, oldIDStellelement, iDStellelement, !oldIDStellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStellelement() {
		Stellelement oldIDStellelement = iDStellelement;
		boolean oldIDStellelementESet = iDStellelementESet;
		iDStellelement = null;
		iDStellelementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT, oldIDStellelement, null, oldIDStellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStellelement() {
		return iDStellelementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Anlage getIDWKrAnlage() {
		if (iDWKrAnlage != null && iDWKrAnlage.eIsProxy()) {
			InternalEObject oldIDWKrAnlage = (InternalEObject)iDWKrAnlage;
			iDWKrAnlage = (W_Kr_Anlage)eResolveProxy(oldIDWKrAnlage);
			if (iDWKrAnlage != oldIDWKrAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, oldIDWKrAnlage, iDWKrAnlage));
			}
		}
		return iDWKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Anlage basicGetIDWKrAnlage() {
		return iDWKrAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWKrAnlage(W_Kr_Anlage newIDWKrAnlage) {
		W_Kr_Anlage oldIDWKrAnlage = iDWKrAnlage;
		iDWKrAnlage = newIDWKrAnlage;
		boolean oldIDWKrAnlageESet = iDWKrAnlageESet;
		iDWKrAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, oldIDWKrAnlage, iDWKrAnlage, !oldIDWKrAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWKrAnlage() {
		W_Kr_Anlage oldIDWKrAnlage = iDWKrAnlage;
		boolean oldIDWKrAnlageESet = iDWKrAnlageESet;
		iDWKrAnlage = null;
		iDWKrAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE, oldIDWKrAnlage, null, oldIDWKrAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWKrAnlage() {
		return iDWKrAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weichenlaufkette getIDWeichenlaufkette() {
		if (iDWeichenlaufkette != null && iDWeichenlaufkette.eIsProxy()) {
			InternalEObject oldIDWeichenlaufkette = (InternalEObject)iDWeichenlaufkette;
			iDWeichenlaufkette = (Weichenlaufkette)eResolveProxy(oldIDWeichenlaufkette);
			if (iDWeichenlaufkette != oldIDWeichenlaufkette) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, iDWeichenlaufkette));
			}
		}
		return iDWeichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Weichenlaufkette basicGetIDWeichenlaufkette() {
		return iDWeichenlaufkette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWeichenlaufkette(Weichenlaufkette newIDWeichenlaufkette) {
		Weichenlaufkette oldIDWeichenlaufkette = iDWeichenlaufkette;
		iDWeichenlaufkette = newIDWeichenlaufkette;
		boolean oldIDWeichenlaufketteESet = iDWeichenlaufketteESet;
		iDWeichenlaufketteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, iDWeichenlaufkette, !oldIDWeichenlaufketteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWeichenlaufkette() {
		Weichenlaufkette oldIDWeichenlaufkette = iDWeichenlaufkette;
		boolean oldIDWeichenlaufketteESet = iDWeichenlaufketteESet;
		iDWeichenlaufkette = null;
		iDWeichenlaufketteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE, oldIDWeichenlaufkette, null, oldIDWeichenlaufketteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWeichenlaufkette() {
		return iDWeichenlaufketteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element_Allg_AttributeGroup getWKrGspElementAllg() {
		return wKrGspElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWKrGspElementAllg(W_Kr_Gsp_Element_Allg_AttributeGroup newWKrGspElementAllg, NotificationChain msgs) {
		W_Kr_Gsp_Element_Allg_AttributeGroup oldWKrGspElementAllg = wKrGspElementAllg;
		wKrGspElementAllg = newWKrGspElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, oldWKrGspElementAllg, newWKrGspElementAllg);
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
	public void setWKrGspElementAllg(W_Kr_Gsp_Element_Allg_AttributeGroup newWKrGspElementAllg) {
		if (newWKrGspElementAllg != wKrGspElementAllg) {
			NotificationChain msgs = null;
			if (wKrGspElementAllg != null)
				msgs = ((InternalEObject)wKrGspElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, null, msgs);
			if (newWKrGspElementAllg != null)
				msgs = ((InternalEObject)newWKrGspElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, null, msgs);
			msgs = basicSetWKrGspElementAllg(newWKrGspElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG, newWKrGspElementAllg, newWKrGspElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleissperre_Element_AttributeGroup getGleissperreElement() {
		return gleissperreElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleissperreElement(Gleissperre_Element_AttributeGroup newGleissperreElement, NotificationChain msgs) {
		Gleissperre_Element_AttributeGroup oldGleissperreElement = gleissperreElement;
		gleissperreElement = newGleissperreElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, oldGleissperreElement, newGleissperreElement);
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
	public void setGleissperreElement(Gleissperre_Element_AttributeGroup newGleissperreElement) {
		if (newGleissperreElement != gleissperreElement) {
			NotificationChain msgs = null;
			if (gleissperreElement != null)
				msgs = ((InternalEObject)gleissperreElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, null, msgs);
			if (newGleissperreElement != null)
				msgs = ((InternalEObject)newGleissperreElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, null, msgs);
			msgs = basicSetGleissperreElement(newGleissperreElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT, newGleissperreElement, newGleissperreElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Weiche_Element_AttributeGroup getWeicheElement() {
		return weicheElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeicheElement(Weiche_Element_AttributeGroup newWeicheElement, NotificationChain msgs) {
		Weiche_Element_AttributeGroup oldWeicheElement = weicheElement;
		weicheElement = newWeicheElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, oldWeicheElement, newWeicheElement);
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
	public void setWeicheElement(Weiche_Element_AttributeGroup newWeicheElement) {
		if (newWeicheElement != weicheElement) {
			NotificationChain msgs = null;
			if (weicheElement != null)
				msgs = ((InternalEObject)weicheElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, null, msgs);
			if (newWeicheElement != null)
				msgs = ((InternalEObject)newWeicheElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, null, msgs);
			msgs = basicSetWeicheElement(newWeicheElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT, newWeicheElement, newWeicheElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				return basicSetWKrGspElementAllg(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				return basicSetGleissperreElement(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				return basicSetWeicheElement(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				return getBezeichnung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				if (resolve) return getIDRegelzeichnung();
				return basicGetIDRegelzeichnung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				if (resolve) return getIDStellelement();
				return basicGetIDStellelement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				if (resolve) return getIDWKrAnlage();
				return basicGetIDWKrAnlage();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				if (resolve) return getIDWeichenlaufkette();
				return basicGetIDWeichenlaufkette();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				return getWKrGspElementAllg();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				return getGleissperreElement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				return getWeicheElement();
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				setIDRegelzeichnung((Regelzeichnung)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				setIDStellelement((Stellelement)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				setIDWKrAnlage((W_Kr_Anlage)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				setIDWeichenlaufkette((Weichenlaufkette)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				setWKrGspElementAllg((W_Kr_Gsp_Element_Allg_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				setGleissperreElement((Gleissperre_Element_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				setWeicheElement((Weiche_Element_AttributeGroup)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				unsetIDRegelzeichnung();
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				unsetIDStellelement();
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				unsetIDWKrAnlage();
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				unsetIDWeichenlaufkette();
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				setWKrGspElementAllg((W_Kr_Gsp_Element_Allg_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				setGleissperreElement((Gleissperre_Element_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				setWeicheElement((Weiche_Element_AttributeGroup)null);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__BEZEICHNUNG:
				return bezeichnung != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_REGELZEICHNUNG:
				return isSetIDRegelzeichnung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_STELLELEMENT:
				return isSetIDStellelement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__IDW_KR_ANLAGE:
				return isSetIDWKrAnlage();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__ID_WEICHENLAUFKETTE:
				return isSetIDWeichenlaufkette();
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WKR_GSP_ELEMENT_ALLG:
				return wKrGspElementAllg != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__GLEISSPERRE_ELEMENT:
				return gleissperreElement != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_ELEMENT__WEICHE_ELEMENT:
				return weicheElement != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //W_Kr_Gsp_ElementImpl
