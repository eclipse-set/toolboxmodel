/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Abstand_Grenze_Bereich_C_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Baseline_System_Version_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Einstieg_Ohne_Rueckw_Sig_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prioritaet_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup;

import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZUB Bereichsgrenze Nach L2 Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getAbstandGrenzeBereichC <em>Abstand Grenze Bereich C</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getBaselineSystemVersion <em>Baseline System Version</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getBgrenzeNachL2BedEinstieg <em>Bgrenze Nach L2 Bed Einstieg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getEinstiegOhneRueckwSig <em>Einstieg Ohne Rueckw Sig</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getIDSignalZufahrtsicherungL2oS <em>ID Signal Zufahrtsicherung L2o S</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getPrioritaet <em>Prioritaet</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl#getZUBBereichsgrenzeNachL2VonESG <em>ZUB Bereichsgrenze Nach L2 Von ESG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl extends MinimalEObjectImpl.Container implements ZUB_Bereichsgrenze_Nach_L2_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAbstandGrenzeBereichC() <em>Abstand Grenze Bereich C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstandGrenzeBereichC()
	 * @generated
	 * @ordered
	 */
	protected Abstand_Grenze_Bereich_C_TypeClass abstandGrenzeBereichC;

	/**
	 * The cached value of the '{@link #getBaselineSystemVersion() <em>Baseline System Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaselineSystemVersion()
	 * @generated
	 * @ordered
	 */
	protected Baseline_System_Version_TypeClass baselineSystemVersion;

	/**
	 * The cached value of the '{@link #getBgrenzeNachL2BedEinstieg() <em>Bgrenze Nach L2 Bed Einstieg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgrenzeNachL2BedEinstieg()
	 * @generated
	 * @ordered
	 */
	protected EList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup> bgrenzeNachL2BedEinstieg;

	/**
	 * The cached value of the '{@link #getEinstiegOhneRueckwSig() <em>Einstieg Ohne Rueckw Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinstiegOhneRueckwSig()
	 * @generated
	 * @ordered
	 */
	protected Einstieg_Ohne_Rueckw_Sig_TypeClass einstiegOhneRueckwSig;

	/**
	 * The cached value of the '{@link #getIDRBCNachGrenze() <em>IDRBC Nach Grenze</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 * @ordered
	 */
	protected RBC iDRBCNachGrenze;

	/**
	 * This is true if the IDRBC Nach Grenze reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRBCNachGrenzeESet;

	/**
	 * The cached value of the '{@link #getIDSignalZufahrtsicherungL2oS() <em>ID Signal Zufahrtsicherung L2o S</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalZufahrtsicherungL2oS()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal> iDSignalZufahrtsicherungL2oS;

	/**
	 * The cached value of the '{@link #getPrioritaet() <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrioritaet()
	 * @generated
	 * @ordered
	 */
	protected Prioritaet_TypeClass prioritaet;

	/**
	 * The cached value of the '{@link #getZUBBereichsgrenzeNachL2VonESG() <em>ZUB Bereichsgrenze Nach L2 Von ESG</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZUBBereichsgrenzeNachL2VonESG()
	 * @generated
	 * @ordered
	 */
	protected EList<ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup> zUBBereichsgrenzeNachL2VonESG;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getZUB_Bereichsgrenze_Nach_L2_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Abstand_Grenze_Bereich_C_TypeClass getAbstandGrenzeBereichC() {
		return abstandGrenzeBereichC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstandGrenzeBereichC(Abstand_Grenze_Bereich_C_TypeClass newAbstandGrenzeBereichC, NotificationChain msgs) {
		Abstand_Grenze_Bereich_C_TypeClass oldAbstandGrenzeBereichC = abstandGrenzeBereichC;
		abstandGrenzeBereichC = newAbstandGrenzeBereichC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, oldAbstandGrenzeBereichC, newAbstandGrenzeBereichC);
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
	public void setAbstandGrenzeBereichC(Abstand_Grenze_Bereich_C_TypeClass newAbstandGrenzeBereichC) {
		if (newAbstandGrenzeBereichC != abstandGrenzeBereichC) {
			NotificationChain msgs = null;
			if (abstandGrenzeBereichC != null)
				msgs = ((InternalEObject)abstandGrenzeBereichC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, null, msgs);
			if (newAbstandGrenzeBereichC != null)
				msgs = ((InternalEObject)newAbstandGrenzeBereichC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, null, msgs);
			msgs = basicSetAbstandGrenzeBereichC(newAbstandGrenzeBereichC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C, newAbstandGrenzeBereichC, newAbstandGrenzeBereichC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Baseline_System_Version_TypeClass getBaselineSystemVersion() {
		return baselineSystemVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBaselineSystemVersion(Baseline_System_Version_TypeClass newBaselineSystemVersion, NotificationChain msgs) {
		Baseline_System_Version_TypeClass oldBaselineSystemVersion = baselineSystemVersion;
		baselineSystemVersion = newBaselineSystemVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, oldBaselineSystemVersion, newBaselineSystemVersion);
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
	public void setBaselineSystemVersion(Baseline_System_Version_TypeClass newBaselineSystemVersion) {
		if (newBaselineSystemVersion != baselineSystemVersion) {
			NotificationChain msgs = null;
			if (baselineSystemVersion != null)
				msgs = ((InternalEObject)baselineSystemVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, null, msgs);
			if (newBaselineSystemVersion != null)
				msgs = ((InternalEObject)newBaselineSystemVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, null, msgs);
			msgs = basicSetBaselineSystemVersion(newBaselineSystemVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION, newBaselineSystemVersion, newBaselineSystemVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup> getBgrenzeNachL2BedEinstieg() {
		if (bgrenzeNachL2BedEinstieg == null) {
			bgrenzeNachL2BedEinstieg = new EObjectContainmentEList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup>(Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG);
		}
		return bgrenzeNachL2BedEinstieg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einstieg_Ohne_Rueckw_Sig_TypeClass getEinstiegOhneRueckwSig() {
		return einstiegOhneRueckwSig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinstiegOhneRueckwSig(Einstieg_Ohne_Rueckw_Sig_TypeClass newEinstiegOhneRueckwSig, NotificationChain msgs) {
		Einstieg_Ohne_Rueckw_Sig_TypeClass oldEinstiegOhneRueckwSig = einstiegOhneRueckwSig;
		einstiegOhneRueckwSig = newEinstiegOhneRueckwSig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, oldEinstiegOhneRueckwSig, newEinstiegOhneRueckwSig);
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
	public void setEinstiegOhneRueckwSig(Einstieg_Ohne_Rueckw_Sig_TypeClass newEinstiegOhneRueckwSig) {
		if (newEinstiegOhneRueckwSig != einstiegOhneRueckwSig) {
			NotificationChain msgs = null;
			if (einstiegOhneRueckwSig != null)
				msgs = ((InternalEObject)einstiegOhneRueckwSig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, null, msgs);
			if (newEinstiegOhneRueckwSig != null)
				msgs = ((InternalEObject)newEinstiegOhneRueckwSig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, null, msgs);
			msgs = basicSetEinstiegOhneRueckwSig(newEinstiegOhneRueckwSig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG, newEinstiegOhneRueckwSig, newEinstiegOhneRueckwSig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBC getIDRBCNachGrenze() {
		if (iDRBCNachGrenze != null && iDRBCNachGrenze.eIsProxy()) {
			InternalEObject oldIDRBCNachGrenze = (InternalEObject)iDRBCNachGrenze;
			iDRBCNachGrenze = (RBC)eResolveProxy(oldIDRBCNachGrenze);
			if (iDRBCNachGrenze != oldIDRBCNachGrenze) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, iDRBCNachGrenze));
			}
		}
		return iDRBCNachGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBC basicGetIDRBCNachGrenze() {
		return iDRBCNachGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRBCNachGrenze(RBC newIDRBCNachGrenze) {
		RBC oldIDRBCNachGrenze = iDRBCNachGrenze;
		iDRBCNachGrenze = newIDRBCNachGrenze;
		boolean oldIDRBCNachGrenzeESet = iDRBCNachGrenzeESet;
		iDRBCNachGrenzeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, iDRBCNachGrenze, !oldIDRBCNachGrenzeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRBCNachGrenze() {
		RBC oldIDRBCNachGrenze = iDRBCNachGrenze;
		boolean oldIDRBCNachGrenzeESet = iDRBCNachGrenzeESet;
		iDRBCNachGrenze = null;
		iDRBCNachGrenzeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE, oldIDRBCNachGrenze, null, oldIDRBCNachGrenzeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRBCNachGrenze() {
		return iDRBCNachGrenzeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal> getIDSignalZufahrtsicherungL2oS() {
		if (iDSignalZufahrtsicherungL2oS == null) {
			iDSignalZufahrtsicherungL2oS = new EObjectResolvingEList<Signal>(Signal.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S);
		}
		return iDSignalZufahrtsicherungL2oS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prioritaet_TypeClass getPrioritaet() {
		return prioritaet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrioritaet(Prioritaet_TypeClass newPrioritaet, NotificationChain msgs) {
		Prioritaet_TypeClass oldPrioritaet = prioritaet;
		prioritaet = newPrioritaet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, oldPrioritaet, newPrioritaet);
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
	public void setPrioritaet(Prioritaet_TypeClass newPrioritaet) {
		if (newPrioritaet != prioritaet) {
			NotificationChain msgs = null;
			if (prioritaet != null)
				msgs = ((InternalEObject)prioritaet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			if (newPrioritaet != null)
				msgs = ((InternalEObject)newPrioritaet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, null, msgs);
			msgs = basicSetPrioritaet(newPrioritaet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET, newPrioritaet, newPrioritaet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup> getZUBBereichsgrenzeNachL2VonESG() {
		if (zUBBereichsgrenzeNachL2VonESG == null) {
			zUBBereichsgrenzeNachL2VonESG = new EObjectContainmentEList<ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup>(ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup.class, this, Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG);
		}
		return zUBBereichsgrenzeNachL2VonESG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				return basicSetAbstandGrenzeBereichC(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				return basicSetBaselineSystemVersion(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				return ((InternalEList<?>)getBgrenzeNachL2BedEinstieg()).basicRemove(otherEnd, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				return basicSetEinstiegOhneRueckwSig(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				return basicSetPrioritaet(null, msgs);
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG:
				return ((InternalEList<?>)getZUBBereichsgrenzeNachL2VonESG()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				return getAbstandGrenzeBereichC();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				return getBaselineSystemVersion();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				return getBgrenzeNachL2BedEinstieg();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				return getEinstiegOhneRueckwSig();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				if (resolve) return getIDRBCNachGrenze();
				return basicGetIDRBCNachGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				return getIDSignalZufahrtsicherungL2oS();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				return getPrioritaet();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG:
				return getZUBBereichsgrenzeNachL2VonESG();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				setAbstandGrenzeBereichC((Abstand_Grenze_Bereich_C_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				setBaselineSystemVersion((Baseline_System_Version_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				getBgrenzeNachL2BedEinstieg().clear();
				getBgrenzeNachL2BedEinstieg().addAll((Collection<? extends Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				setEinstiegOhneRueckwSig((Einstieg_Ohne_Rueckw_Sig_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				setIDRBCNachGrenze((RBC)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				getIDSignalZufahrtsicherungL2oS().clear();
				getIDSignalZufahrtsicherungL2oS().addAll((Collection<? extends Signal>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG:
				getZUBBereichsgrenzeNachL2VonESG().clear();
				getZUBBereichsgrenzeNachL2VonESG().addAll((Collection<? extends ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				setAbstandGrenzeBereichC((Abstand_Grenze_Bereich_C_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				setBaselineSystemVersion((Baseline_System_Version_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				getBgrenzeNachL2BedEinstieg().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				setEinstiegOhneRueckwSig((Einstieg_Ohne_Rueckw_Sig_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				unsetIDRBCNachGrenze();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				getIDSignalZufahrtsicherungL2oS().clear();
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				setPrioritaet((Prioritaet_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG:
				getZUBBereichsgrenzeNachL2VonESG().clear();
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
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ABSTAND_GRENZE_BEREICH_C:
				return abstandGrenzeBereichC != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BASELINE_SYSTEM_VERSION:
				return baselineSystemVersion != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__BGRENZE_NACH_L2_BED_EINSTIEG:
				return bgrenzeNachL2BedEinstieg != null && !bgrenzeNachL2BedEinstieg.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__EINSTIEG_OHNE_RUECKW_SIG:
				return einstiegOhneRueckwSig != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__IDRBC_NACH_GRENZE:
				return isSetIDRBCNachGrenze();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ID_SIGNAL_ZUFAHRTSICHERUNG_L2O_S:
				return iDSignalZufahrtsicherungL2oS != null && !iDSignalZufahrtsicherungL2oS.isEmpty();
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__PRIORITAET:
				return prioritaet != null;
			case Balisentechnik_ETCSPackage.ZUB_BEREICHSGRENZE_NACH_L2_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE_NACH_L2_VON_ESG:
				return zUBBereichsgrenzeNachL2VonESG != null && !zUBBereichsgrenzeNachL2VonESG.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZUB_Bereichsgrenze_Nach_L2_AttributeGroupImpl
