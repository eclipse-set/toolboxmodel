/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdatei_Hilfe_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.LT_Binaerdaten_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Telegramm_Index_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luft Telegramm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getLTBinaerdateiHilfe <em>LT Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getLTBinaerdaten <em>LT Binaerdaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getTelegrammIndex <em>Telegramm Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Luft_TelegrammImpl extends Basis_ObjektImpl implements Luft_Telegramm {
	/**
	 * The cached value of the '{@link #getIDBaliseUebertragung() <em>ID Balise Uebertragung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBaliseUebertragung()
	 * @generated
	 * @ordered
	 */
	protected Balise iDBaliseUebertragung;

	/**
	 * This is true if the ID Balise Uebertragung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBaliseUebertragungESet;

	/**
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected Fachtelegramm iDFachtelegramm;

	/**
	 * This is true if the ID Fachtelegramm reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFachtelegrammESet;

	/**
	 * The cached value of the '{@link #getLTBinaerdateiHilfe() <em>LT Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLTBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected LT_Binaerdatei_Hilfe_AttributeGroup lTBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getLTBinaerdaten() <em>LT Binaerdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLTBinaerdaten()
	 * @generated
	 * @ordered
	 */
	protected LT_Binaerdaten_AttributeGroup lTBinaerdaten;

	/**
	 * The cached value of the '{@link #getTelegrammIndex() <em>Telegramm Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelegrammIndex()
	 * @generated
	 * @ordered
	 */
	protected Telegramm_Index_TypeClass telegrammIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Luft_TelegrammImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise getIDBaliseUebertragung() {
		if (iDBaliseUebertragung != null && iDBaliseUebertragung.eIsProxy()) {
			InternalEObject oldIDBaliseUebertragung = (InternalEObject)iDBaliseUebertragung;
			iDBaliseUebertragung = (Balise)eResolveProxy(oldIDBaliseUebertragung);
			if (iDBaliseUebertragung != oldIDBaliseUebertragung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, iDBaliseUebertragung));
			}
		}
		return iDBaliseUebertragung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balise basicGetIDBaliseUebertragung() {
		return iDBaliseUebertragung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBaliseUebertragung(Balise newIDBaliseUebertragung) {
		Balise oldIDBaliseUebertragung = iDBaliseUebertragung;
		iDBaliseUebertragung = newIDBaliseUebertragung;
		boolean oldIDBaliseUebertragungESet = iDBaliseUebertragungESet;
		iDBaliseUebertragungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, iDBaliseUebertragung, !oldIDBaliseUebertragungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBaliseUebertragung() {
		Balise oldIDBaliseUebertragung = iDBaliseUebertragung;
		boolean oldIDBaliseUebertragungESet = iDBaliseUebertragungESet;
		iDBaliseUebertragung = null;
		iDBaliseUebertragungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, null, oldIDBaliseUebertragungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBaliseUebertragung() {
		return iDBaliseUebertragungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fachtelegramm getIDFachtelegramm() {
		if (iDFachtelegramm != null && iDFachtelegramm.eIsProxy()) {
			InternalEObject oldIDFachtelegramm = (InternalEObject)iDFachtelegramm;
			iDFachtelegramm = (Fachtelegramm)eResolveProxy(oldIDFachtelegramm);
			if (iDFachtelegramm != oldIDFachtelegramm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, iDFachtelegramm));
			}
		}
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fachtelegramm basicGetIDFachtelegramm() {
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFachtelegramm(Fachtelegramm newIDFachtelegramm) {
		Fachtelegramm oldIDFachtelegramm = iDFachtelegramm;
		iDFachtelegramm = newIDFachtelegramm;
		boolean oldIDFachtelegrammESet = iDFachtelegrammESet;
		iDFachtelegrammESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, iDFachtelegramm, !oldIDFachtelegrammESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFachtelegramm() {
		Fachtelegramm oldIDFachtelegramm = iDFachtelegramm;
		boolean oldIDFachtelegrammESet = iDFachtelegrammESet;
		iDFachtelegramm = null;
		iDFachtelegrammESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, null, oldIDFachtelegrammESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFachtelegramm() {
		return iDFachtelegrammESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LT_Binaerdatei_Hilfe_AttributeGroup getLTBinaerdateiHilfe() {
		return lTBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLTBinaerdateiHilfe(LT_Binaerdatei_Hilfe_AttributeGroup newLTBinaerdateiHilfe, NotificationChain msgs) {
		LT_Binaerdatei_Hilfe_AttributeGroup oldLTBinaerdateiHilfe = lTBinaerdateiHilfe;
		lTBinaerdateiHilfe = newLTBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, oldLTBinaerdateiHilfe, newLTBinaerdateiHilfe);
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
	public void setLTBinaerdateiHilfe(LT_Binaerdatei_Hilfe_AttributeGroup newLTBinaerdateiHilfe) {
		if (newLTBinaerdateiHilfe != lTBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (lTBinaerdateiHilfe != null)
				msgs = ((InternalEObject)lTBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, null, msgs);
			if (newLTBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newLTBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetLTBinaerdateiHilfe(newLTBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE, newLTBinaerdateiHilfe, newLTBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LT_Binaerdaten_AttributeGroup getLTBinaerdaten() {
		return lTBinaerdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLTBinaerdaten(LT_Binaerdaten_AttributeGroup newLTBinaerdaten, NotificationChain msgs) {
		LT_Binaerdaten_AttributeGroup oldLTBinaerdaten = lTBinaerdaten;
		lTBinaerdaten = newLTBinaerdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, oldLTBinaerdaten, newLTBinaerdaten);
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
	public void setLTBinaerdaten(LT_Binaerdaten_AttributeGroup newLTBinaerdaten) {
		if (newLTBinaerdaten != lTBinaerdaten) {
			NotificationChain msgs = null;
			if (lTBinaerdaten != null)
				msgs = ((InternalEObject)lTBinaerdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, null, msgs);
			if (newLTBinaerdaten != null)
				msgs = ((InternalEObject)newLTBinaerdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, null, msgs);
			msgs = basicSetLTBinaerdaten(newLTBinaerdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN, newLTBinaerdaten, newLTBinaerdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Telegramm_Index_TypeClass getTelegrammIndex() {
		return telegrammIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTelegrammIndex(Telegramm_Index_TypeClass newTelegrammIndex, NotificationChain msgs) {
		Telegramm_Index_TypeClass oldTelegrammIndex = telegrammIndex;
		telegrammIndex = newTelegrammIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, oldTelegrammIndex, newTelegrammIndex);
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
	public void setTelegrammIndex(Telegramm_Index_TypeClass newTelegrammIndex) {
		if (newTelegrammIndex != telegrammIndex) {
			NotificationChain msgs = null;
			if (telegrammIndex != null)
				msgs = ((InternalEObject)telegrammIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, null, msgs);
			if (newTelegrammIndex != null)
				msgs = ((InternalEObject)newTelegrammIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, null, msgs);
			msgs = basicSetTelegrammIndex(newTelegrammIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX, newTelegrammIndex, newTelegrammIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				return basicSetLTBinaerdateiHilfe(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				return basicSetLTBinaerdaten(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				return basicSetTelegrammIndex(null, msgs);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				if (resolve) return getIDBaliseUebertragung();
				return basicGetIDBaliseUebertragung();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				if (resolve) return getIDFachtelegramm();
				return basicGetIDFachtelegramm();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				return getLTBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				return getLTBinaerdaten();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				return getTelegrammIndex();
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				setIDBaliseUebertragung((Balise)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				setIDFachtelegramm((Fachtelegramm)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				setLTBinaerdateiHilfe((LT_Binaerdatei_Hilfe_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				setLTBinaerdaten((LT_Binaerdaten_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				setTelegrammIndex((Telegramm_Index_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				unsetIDBaliseUebertragung();
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				unsetIDFachtelegramm();
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				setLTBinaerdateiHilfe((LT_Binaerdatei_Hilfe_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				setLTBinaerdaten((LT_Binaerdaten_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				setTelegrammIndex((Telegramm_Index_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return isSetIDBaliseUebertragung();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return isSetIDFachtelegramm();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEI_HILFE:
				return lTBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__LT_BINAERDATEN:
				return lTBinaerdaten != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__TELEGRAMM_INDEX:
				return telegrammIndex != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Luft_TelegrammImpl
