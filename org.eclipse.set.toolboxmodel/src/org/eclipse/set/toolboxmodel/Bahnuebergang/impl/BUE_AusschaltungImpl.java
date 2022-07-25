/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Ausschaltung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Ausschaltung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_AusschaltungImpl#getIDBUEGleisbezGefahrraum <em>IDBUE Gleisbez Gefahrraum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_AusschaltungImpl extends Basis_ObjektImpl implements BUE_Ausschaltung {
	/**
	 * The cached value of the '{@link #getIDBUEGleisbezGefahrraum() <em>IDBUE Gleisbez Gefahrraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEGleisbezGefahrraum()
	 * @generated
	 * @ordered
	 */
	protected BUE_Gleisbezogener_Gefahrraum iDBUEGleisbezGefahrraum;

	/**
	 * This is true if the IDBUE Gleisbez Gefahrraum reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEGleisbezGefahrraumESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_AusschaltungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Ausschaltung();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Gleisbezogener_Gefahrraum getIDBUEGleisbezGefahrraum() {
		if (iDBUEGleisbezGefahrraum != null && iDBUEGleisbezGefahrraum.eIsProxy()) {
			InternalEObject oldIDBUEGleisbezGefahrraum = (InternalEObject)iDBUEGleisbezGefahrraum;
			iDBUEGleisbezGefahrraum = (BUE_Gleisbezogener_Gefahrraum)eResolveProxy(oldIDBUEGleisbezGefahrraum);
			if (iDBUEGleisbezGefahrraum != oldIDBUEGleisbezGefahrraum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, iDBUEGleisbezGefahrraum));
			}
		}
		return iDBUEGleisbezGefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Gleisbezogener_Gefahrraum basicGetIDBUEGleisbezGefahrraum() {
		return iDBUEGleisbezGefahrraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEGleisbezGefahrraum(BUE_Gleisbezogener_Gefahrraum newIDBUEGleisbezGefahrraum) {
		BUE_Gleisbezogener_Gefahrraum oldIDBUEGleisbezGefahrraum = iDBUEGleisbezGefahrraum;
		iDBUEGleisbezGefahrraum = newIDBUEGleisbezGefahrraum;
		boolean oldIDBUEGleisbezGefahrraumESet = iDBUEGleisbezGefahrraumESet;
		iDBUEGleisbezGefahrraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, iDBUEGleisbezGefahrraum, !oldIDBUEGleisbezGefahrraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEGleisbezGefahrraum() {
		BUE_Gleisbezogener_Gefahrraum oldIDBUEGleisbezGefahrraum = iDBUEGleisbezGefahrraum;
		boolean oldIDBUEGleisbezGefahrraumESet = iDBUEGleisbezGefahrraumESet;
		iDBUEGleisbezGefahrraum = null;
		iDBUEGleisbezGefahrraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM, oldIDBUEGleisbezGefahrraum, null, oldIDBUEGleisbezGefahrraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEGleisbezGefahrraum() {
		return iDBUEGleisbezGefahrraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				if (resolve) return getIDBUEGleisbezGefahrraum();
				return basicGetIDBUEGleisbezGefahrraum();
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
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				setIDBUEGleisbezGefahrraum((BUE_Gleisbezogener_Gefahrraum)newValue);
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
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				unsetIDBUEGleisbezGefahrraum();
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
			case BahnuebergangPackage.BUE_AUSSCHALTUNG__IDBUE_GLEISBEZ_GEFAHRRAUM:
				return isSetIDBUEGleisbezGefahrraum();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_AusschaltungImpl
