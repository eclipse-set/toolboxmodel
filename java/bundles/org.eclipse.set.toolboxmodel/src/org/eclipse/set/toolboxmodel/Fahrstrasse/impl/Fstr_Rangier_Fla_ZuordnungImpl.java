/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.toolboxmodel.Flankenschutz.Fla_Schutz;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Rangier Fla Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Rangier_Fla_ZuordnungImpl#getIDFstrRangier <em>ID Fstr Rangier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Rangier_Fla_ZuordnungImpl extends Basis_ObjektImpl implements Fstr_Rangier_Fla_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDFlaSchutz() <em>ID Fla Schutz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFlaSchutz()
	 * @generated
	 * @ordered
	 */
	protected Fla_Schutz iDFlaSchutz;

	/**
	 * This is true if the ID Fla Schutz reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFlaSchutzESet;

	/**
	 * The cached value of the '{@link #getIDFstrRangier() <em>ID Fstr Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrRangier;

	/**
	 * This is true if the ID Fstr Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrRangierESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Rangier_Fla_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_RANGIER_FLA_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fla_Schutz getIDFlaSchutz() {
		if (iDFlaSchutz != null && iDFlaSchutz.eIsProxy()) {
			InternalEObject oldIDFlaSchutz = (InternalEObject)iDFlaSchutz;
			iDFlaSchutz = (Fla_Schutz)eResolveProxy(oldIDFlaSchutz);
			if (iDFlaSchutz != oldIDFlaSchutz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, iDFlaSchutz));
			}
		}
		return iDFlaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fla_Schutz basicGetIDFlaSchutz() {
		return iDFlaSchutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFlaSchutz(Fla_Schutz newIDFlaSchutz) {
		Fla_Schutz oldIDFlaSchutz = iDFlaSchutz;
		iDFlaSchutz = newIDFlaSchutz;
		boolean oldIDFlaSchutzESet = iDFlaSchutzESet;
		iDFlaSchutzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, iDFlaSchutz, !oldIDFlaSchutzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFlaSchutz() {
		Fla_Schutz oldIDFlaSchutz = iDFlaSchutz;
		boolean oldIDFlaSchutzESet = iDFlaSchutzESet;
		iDFlaSchutz = null;
		iDFlaSchutzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ, oldIDFlaSchutz, null, oldIDFlaSchutzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFlaSchutz() {
		return iDFlaSchutzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrRangier() {
		if (iDFstrRangier != null && iDFstrRangier.eIsProxy()) {
			InternalEObject oldIDFstrRangier = (InternalEObject)iDFstrRangier;
			iDFstrRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrRangier);
			if (iDFstrRangier != oldIDFstrRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, oldIDFstrRangier, iDFstrRangier));
			}
		}
		return iDFstrRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrRangier() {
		return iDFstrRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrRangier(Fstr_Zug_Rangier newIDFstrRangier) {
		Fstr_Zug_Rangier oldIDFstrRangier = iDFstrRangier;
		iDFstrRangier = newIDFstrRangier;
		boolean oldIDFstrRangierESet = iDFstrRangierESet;
		iDFstrRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, oldIDFstrRangier, iDFstrRangier, !oldIDFstrRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrRangier() {
		Fstr_Zug_Rangier oldIDFstrRangier = iDFstrRangier;
		boolean oldIDFstrRangierESet = iDFstrRangierESet;
		iDFstrRangier = null;
		iDFstrRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER, oldIDFstrRangier, null, oldIDFstrRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrRangier() {
		return iDFstrRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				if (resolve) return getIDFlaSchutz();
				return basicGetIDFlaSchutz();
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				if (resolve) return getIDFstrRangier();
				return basicGetIDFstrRangier();
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				setIDFlaSchutz((Fla_Schutz)newValue);
				return;
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				setIDFstrRangier((Fstr_Zug_Rangier)newValue);
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				unsetIDFlaSchutz();
				return;
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				unsetIDFstrRangier();
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
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FLA_SCHUTZ:
				return isSetIDFlaSchutz();
			case FahrstrassePackage.FSTR_RANGIER_FLA_ZUORDNUNG__ID_FSTR_RANGIER:
				return isSetIDFstrRangier();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_Rangier_Fla_ZuordnungImpl
