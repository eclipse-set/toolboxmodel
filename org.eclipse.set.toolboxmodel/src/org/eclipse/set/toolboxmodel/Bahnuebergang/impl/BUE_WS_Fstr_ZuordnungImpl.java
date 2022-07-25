/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_WS_Fstr_Zuordnung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE WS Fstr Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_WS_Fstr_ZuordnungImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_WS_Fstr_ZuordnungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_WS_Fstr_ZuordnungImpl extends Basis_ObjektImpl implements BUE_WS_Fstr_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDBUEEinschaltung() <em>IDBUE Einschaltung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Einschaltung iDBUEEinschaltung;

	/**
	 * This is true if the IDBUE Einschaltung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEEinschaltungESet;

	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrZugRangier;

	/**
	 * This is true if the ID Fstr Zug Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrZugRangierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_WS_Fstr_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_WS_Fstr_Zuordnung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Einschaltung getIDBUEEinschaltung() {
		if (iDBUEEinschaltung != null && iDBUEEinschaltung.eIsProxy()) {
			InternalEObject oldIDBUEEinschaltung = (InternalEObject)iDBUEEinschaltung;
			iDBUEEinschaltung = (BUE_Einschaltung)eResolveProxy(oldIDBUEEinschaltung);
			if (iDBUEEinschaltung != oldIDBUEEinschaltung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, iDBUEEinschaltung));
			}
		}
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Einschaltung basicGetIDBUEEinschaltung() {
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEEinschaltung(BUE_Einschaltung newIDBUEEinschaltung) {
		BUE_Einschaltung oldIDBUEEinschaltung = iDBUEEinschaltung;
		iDBUEEinschaltung = newIDBUEEinschaltung;
		boolean oldIDBUEEinschaltungESet = iDBUEEinschaltungESet;
		iDBUEEinschaltungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, iDBUEEinschaltung, !oldIDBUEEinschaltungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEEinschaltung() {
		BUE_Einschaltung oldIDBUEEinschaltung = iDBUEEinschaltung;
		boolean oldIDBUEEinschaltungESet = iDBUEEinschaltungESet;
		iDBUEEinschaltung = null;
		iDBUEEinschaltungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG, oldIDBUEEinschaltung, null, oldIDBUEEinschaltungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEEinschaltung() {
		return iDBUEEinschaltungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrZugRangier() {
		if (iDFstrZugRangier != null && iDFstrZugRangier.eIsProxy()) {
			InternalEObject oldIDFstrZugRangier = (InternalEObject)iDFstrZugRangier;
			iDFstrZugRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrZugRangier);
			if (iDFstrZugRangier != oldIDFstrZugRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
			}
		}
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrZugRangier(Fstr_Zug_Rangier newIDFstrZugRangier) {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrZugRangier() {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangier = null;
		iDFstrZugRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrZugRangier() {
		return iDFstrZugRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				if (resolve) return getIDBUEEinschaltung();
				return basicGetIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				if (resolve) return getIDFstrZugRangier();
				return basicGetIDFstrZugRangier();
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				setIDBUEEinschaltung((BUE_Einschaltung)newValue);
				return;
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((Fstr_Zug_Rangier)newValue);
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				unsetIDBUEEinschaltung();
				return;
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				unsetIDFstrZugRangier();
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
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__IDBUE_EINSCHALTUNG:
				return isSetIDBUEEinschaltung();
			case BahnuebergangPackage.BUE_WS_FSTR_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_WS_Fstr_ZuordnungImpl
