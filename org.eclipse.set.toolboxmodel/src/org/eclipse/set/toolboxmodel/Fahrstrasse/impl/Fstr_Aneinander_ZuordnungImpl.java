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
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Aneinander_Zuordnung;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Aneinander Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl#getIDFstrAneinander <em>ID Fstr Aneinander</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Aneinander_ZuordnungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Aneinander_ZuordnungImpl extends Basis_ObjektImpl implements Fstr_Aneinander_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDFstrAneinander() <em>ID Fstr Aneinander</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrAneinander()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Aneinander iDFstrAneinander;

	/**
	 * This is true if the ID Fstr Aneinander reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrAneinanderESet;

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
	protected Fstr_Aneinander_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ANEINANDER_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Aneinander getIDFstrAneinander() {
		if (iDFstrAneinander != null && iDFstrAneinander.eIsProxy()) {
			InternalEObject oldIDFstrAneinander = (InternalEObject)iDFstrAneinander;
			iDFstrAneinander = (Fstr_Aneinander)eResolveProxy(oldIDFstrAneinander);
			if (iDFstrAneinander != oldIDFstrAneinander) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, oldIDFstrAneinander, iDFstrAneinander));
			}
		}
		return iDFstrAneinander;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Aneinander basicGetIDFstrAneinander() {
		return iDFstrAneinander;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrAneinander(Fstr_Aneinander newIDFstrAneinander) {
		Fstr_Aneinander oldIDFstrAneinander = iDFstrAneinander;
		iDFstrAneinander = newIDFstrAneinander;
		boolean oldIDFstrAneinanderESet = iDFstrAneinanderESet;
		iDFstrAneinanderESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, oldIDFstrAneinander, iDFstrAneinander, !oldIDFstrAneinanderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrAneinander() {
		Fstr_Aneinander oldIDFstrAneinander = iDFstrAneinander;
		boolean oldIDFstrAneinanderESet = iDFstrAneinanderESet;
		iDFstrAneinander = null;
		iDFstrAneinanderESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER, oldIDFstrAneinander, null, oldIDFstrAneinanderESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrAneinander() {
		return iDFstrAneinanderESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				if (resolve) return getIDFstrAneinander();
				return basicGetIDFstrAneinander();
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				setIDFstrAneinander((Fstr_Aneinander)newValue);
				return;
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				unsetIDFstrAneinander();
				return;
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
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
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ANEINANDER:
				return isSetIDFstrAneinander();
			case FahrstrassePackage.FSTR_ANEINANDER_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_Aneinander_ZuordnungImpl
