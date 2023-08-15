/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.AEA_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.AEA_Energieversorgung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.AEA_GFK_IP_Adressblock_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aussenelementansteuerung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getAEAAllg <em>AEA Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getAEAEnergieversorgung <em>AEA Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getAEAGFKIPAdressblock <em>AEAGFKIP Adressblock</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDInformationPrimaer <em>ID Information Primaer</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDInformationSekundaer <em>ID Information Sekundaer</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDOertlichkeitGesteuert <em>ID Oertlichkeit Gesteuert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.AussenelementansteuerungImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AussenelementansteuerungImpl extends Basis_ObjektImpl implements Aussenelementansteuerung {
	/**
	 * The cached value of the '{@link #getAEAAllg() <em>AEA Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEAAllg()
	 * @generated
	 * @ordered
	 */
	protected AEA_Allg_AttributeGroup aEAAllg;

	/**
	 * The cached value of the '{@link #getAEAEnergieversorgung() <em>AEA Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEAEnergieversorgung()
	 * @generated
	 * @ordered
	 */
	protected AEA_Energieversorgung_AttributeGroup aEAEnergieversorgung;

	/**
	 * The cached value of the '{@link #getAEAGFKIPAdressblock() <em>AEAGFKIP Adressblock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAEAGFKIPAdressblock()
	 * @generated
	 * @ordered
	 */
	protected AEA_GFK_IP_Adressblock_AttributeGroup aEAGFKIPAdressblock;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDInformationPrimaer() <em>ID Information Primaer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformationPrimaer()
	 * @generated
	 * @ordered
	 */
	protected EList<Basis_Objekt> iDInformationPrimaer;

	/**
	 * The cached value of the '{@link #getIDInformationSekundaer() <em>ID Information Sekundaer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformationSekundaer()
	 * @generated
	 * @ordered
	 */
	protected EList<Aussenelementansteuerung> iDInformationSekundaer;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitGesteuert() <em>ID Oertlichkeit Gesteuert</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitGesteuert()
	 * @generated
	 * @ordered
	 */
	protected EList<Oertlichkeit> iDOertlichkeitGesteuert;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitNamensgebend() <em>ID Oertlichkeit Namensgebend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitNamensgebend()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeitNamensgebend;

	/**
	 * This is true if the ID Oertlichkeit Namensgebend reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitNamensgebendESet;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung iDUnterbringung;

	/**
	 * This is true if the ID Unterbringung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUnterbringungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AussenelementansteuerungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_Allg_AttributeGroup getAEAAllg() {
		return aEAAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEAAllg(AEA_Allg_AttributeGroup newAEAAllg, NotificationChain msgs) {
		AEA_Allg_AttributeGroup oldAEAAllg = aEAAllg;
		aEAAllg = newAEAAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, oldAEAAllg, newAEAAllg);
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
	public void setAEAAllg(AEA_Allg_AttributeGroup newAEAAllg) {
		if (newAEAAllg != aEAAllg) {
			NotificationChain msgs = null;
			if (aEAAllg != null)
				msgs = ((InternalEObject)aEAAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, null, msgs);
			if (newAEAAllg != null)
				msgs = ((InternalEObject)newAEAAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, null, msgs);
			msgs = basicSetAEAAllg(newAEAAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG, newAEAAllg, newAEAAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_Energieversorgung_AttributeGroup getAEAEnergieversorgung() {
		return aEAEnergieversorgung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEAEnergieversorgung(AEA_Energieversorgung_AttributeGroup newAEAEnergieversorgung, NotificationChain msgs) {
		AEA_Energieversorgung_AttributeGroup oldAEAEnergieversorgung = aEAEnergieversorgung;
		aEAEnergieversorgung = newAEAEnergieversorgung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, oldAEAEnergieversorgung, newAEAEnergieversorgung);
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
	public void setAEAEnergieversorgung(AEA_Energieversorgung_AttributeGroup newAEAEnergieversorgung) {
		if (newAEAEnergieversorgung != aEAEnergieversorgung) {
			NotificationChain msgs = null;
			if (aEAEnergieversorgung != null)
				msgs = ((InternalEObject)aEAEnergieversorgung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, null, msgs);
			if (newAEAEnergieversorgung != null)
				msgs = ((InternalEObject)newAEAEnergieversorgung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, null, msgs);
			msgs = basicSetAEAEnergieversorgung(newAEAEnergieversorgung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG, newAEAEnergieversorgung, newAEAEnergieversorgung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AEA_GFK_IP_Adressblock_AttributeGroup getAEAGFKIPAdressblock() {
		return aEAGFKIPAdressblock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAEAGFKIPAdressblock(AEA_GFK_IP_Adressblock_AttributeGroup newAEAGFKIPAdressblock, NotificationChain msgs) {
		AEA_GFK_IP_Adressblock_AttributeGroup oldAEAGFKIPAdressblock = aEAGFKIPAdressblock;
		aEAGFKIPAdressblock = newAEAGFKIPAdressblock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, oldAEAGFKIPAdressblock, newAEAGFKIPAdressblock);
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
	public void setAEAGFKIPAdressblock(AEA_GFK_IP_Adressblock_AttributeGroup newAEAGFKIPAdressblock) {
		if (newAEAGFKIPAdressblock != aEAGFKIPAdressblock) {
			NotificationChain msgs = null;
			if (aEAGFKIPAdressblock != null)
				msgs = ((InternalEObject)aEAGFKIPAdressblock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, null, msgs);
			if (newAEAGFKIPAdressblock != null)
				msgs = ((InternalEObject)newAEAGFKIPAdressblock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, null, msgs);
			msgs = basicSetAEAGFKIPAdressblock(newAEAGFKIPAdressblock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK, newAEAGFKIPAdressblock, newAEAGFKIPAdressblock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Aussenelementansteuerung_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Aussenelementansteuerung_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Aussenelementansteuerung_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Basis_Objekt> getIDInformationPrimaer() {
		if (iDInformationPrimaer == null) {
			iDInformationPrimaer = new EObjectResolvingEList<Basis_Objekt>(Basis_Objekt.class, this, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER);
		}
		return iDInformationPrimaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Aussenelementansteuerung> getIDInformationSekundaer() {
		if (iDInformationSekundaer == null) {
			iDInformationSekundaer = new EObjectResolvingEList<Aussenelementansteuerung>(Aussenelementansteuerung.class, this, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER);
		}
		return iDInformationSekundaer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Oertlichkeit> getIDOertlichkeitGesteuert() {
		if (iDOertlichkeitGesteuert == null) {
			iDOertlichkeitGesteuert = new EObjectResolvingEList<Oertlichkeit>(Oertlichkeit.class, this, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT);
		}
		return iDOertlichkeitGesteuert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeitNamensgebend() {
		if (iDOertlichkeitNamensgebend != null && iDOertlichkeitNamensgebend.eIsProxy()) {
			InternalEObject oldIDOertlichkeitNamensgebend = (InternalEObject)iDOertlichkeitNamensgebend;
			iDOertlichkeitNamensgebend = (Oertlichkeit)eResolveProxy(oldIDOertlichkeitNamensgebend);
			if (iDOertlichkeitNamensgebend != oldIDOertlichkeitNamensgebend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, iDOertlichkeitNamensgebend));
			}
		}
		return iDOertlichkeitNamensgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeitNamensgebend() {
		return iDOertlichkeitNamensgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeitNamensgebend(Oertlichkeit newIDOertlichkeitNamensgebend) {
		Oertlichkeit oldIDOertlichkeitNamensgebend = iDOertlichkeitNamensgebend;
		iDOertlichkeitNamensgebend = newIDOertlichkeitNamensgebend;
		boolean oldIDOertlichkeitNamensgebendESet = iDOertlichkeitNamensgebendESet;
		iDOertlichkeitNamensgebendESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, iDOertlichkeitNamensgebend, !oldIDOertlichkeitNamensgebendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeitNamensgebend() {
		Oertlichkeit oldIDOertlichkeitNamensgebend = iDOertlichkeitNamensgebend;
		boolean oldIDOertlichkeitNamensgebendESet = iDOertlichkeitNamensgebendESet;
		iDOertlichkeitNamensgebend = null;
		iDOertlichkeitNamensgebendESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, null, oldIDOertlichkeitNamensgebendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeitNamensgebend() {
		return iDOertlichkeitNamensgebendESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung getIDUnterbringung() {
		if (iDUnterbringung != null && iDUnterbringung.eIsProxy()) {
			InternalEObject oldIDUnterbringung = (InternalEObject)iDUnterbringung;
			iDUnterbringung = (Unterbringung)eResolveProxy(oldIDUnterbringung);
			if (iDUnterbringung != oldIDUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
			}
		}
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterbringung basicGetIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUnterbringung(Unterbringung newIDUnterbringung) {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUnterbringung() {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringung = null;
		iDUnterbringungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUnterbringung() {
		return iDUnterbringungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				return basicSetAEAAllg(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				return basicSetAEAEnergieversorgung(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				return basicSetAEAGFKIPAdressblock(null, msgs);
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				return getAEAAllg();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				return getAEAEnergieversorgung();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				return getAEAGFKIPAdressblock();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				return getBezeichnung();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				return getIDInformationPrimaer();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				return getIDInformationSekundaer();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				return getIDOertlichkeitGesteuert();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				if (resolve) return getIDOertlichkeitNamensgebend();
				return basicGetIDOertlichkeitNamensgebend();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				setAEAAllg((AEA_Allg_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				setAEAEnergieversorgung((AEA_Energieversorgung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				setAEAGFKIPAdressblock((AEA_GFK_IP_Adressblock_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				setBezeichnung((Aussenelementansteuerung_Bezeichnung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				getIDInformationPrimaer().clear();
				getIDInformationPrimaer().addAll((Collection<? extends Basis_Objekt>)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				getIDInformationSekundaer().clear();
				getIDInformationSekundaer().addAll((Collection<? extends Aussenelementansteuerung>)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				getIDOertlichkeitGesteuert().clear();
				getIDOertlichkeitGesteuert().addAll((Collection<? extends Oertlichkeit>)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				setIDOertlichkeitNamensgebend((Oertlichkeit)newValue);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				setAEAAllg((AEA_Allg_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				setAEAEnergieversorgung((AEA_Energieversorgung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				setAEAGFKIPAdressblock((AEA_GFK_IP_Adressblock_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				setBezeichnung((Aussenelementansteuerung_Bezeichnung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				getIDInformationPrimaer().clear();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				getIDInformationSekundaer().clear();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				getIDOertlichkeitGesteuert().clear();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				unsetIDOertlichkeitNamensgebend();
				return;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
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
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
				return aEAAllg != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
				return aEAEnergieversorgung != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
				return aEAGFKIPAdressblock != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
				return bezeichnung != null;
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER:
				return iDInformationPrimaer != null && !iDInformationPrimaer.isEmpty();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER:
				return iDInformationSekundaer != null && !iDInformationSekundaer.isEmpty();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT:
				return iDOertlichkeitGesteuert != null && !iDOertlichkeitGesteuert.isEmpty();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND:
				return isSetIDOertlichkeitNamensgebend();
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //AussenelementansteuerungImpl
