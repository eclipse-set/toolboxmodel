/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stell_Bereich;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stell Bereich</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Stell_BereichImpl#getIDAussenelementansteuerung <em>ID Aussenelementansteuerung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Stell_BereichImpl extends Bereich_ObjektImpl implements Stell_Bereich {
	/**
	 * The cached value of the '{@link #getIDAussenelementansteuerung() <em>ID Aussenelementansteuerung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAussenelementansteuerung()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDAussenelementansteuerung;

	/**
	 * This is true if the ID Aussenelementansteuerung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAussenelementansteuerungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Stell_BereichImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.STELL_BEREICH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDAussenelementansteuerung() {
		if (iDAussenelementansteuerung != null && iDAussenelementansteuerung.eIsProxy()) {
			InternalEObject oldIDAussenelementansteuerung = (InternalEObject)iDAussenelementansteuerung;
			iDAussenelementansteuerung = (Aussenelementansteuerung)eResolveProxy(oldIDAussenelementansteuerung);
			if (iDAussenelementansteuerung != oldIDAussenelementansteuerung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, iDAussenelementansteuerung));
			}
		}
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDAussenelementansteuerung() {
		return iDAussenelementansteuerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAussenelementansteuerung(Aussenelementansteuerung newIDAussenelementansteuerung) {
		Aussenelementansteuerung oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		iDAussenelementansteuerung = newIDAussenelementansteuerung;
		boolean oldIDAussenelementansteuerungESet = iDAussenelementansteuerungESet;
		iDAussenelementansteuerungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, iDAussenelementansteuerung, !oldIDAussenelementansteuerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAussenelementansteuerung() {
		Aussenelementansteuerung oldIDAussenelementansteuerung = iDAussenelementansteuerung;
		boolean oldIDAussenelementansteuerungESet = iDAussenelementansteuerungESet;
		iDAussenelementansteuerung = null;
		iDAussenelementansteuerungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG, oldIDAussenelementansteuerung, null, oldIDAussenelementansteuerungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAussenelementansteuerung() {
		return iDAussenelementansteuerungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				if (resolve) return getIDAussenelementansteuerung();
				return basicGetIDAussenelementansteuerung();
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				setIDAussenelementansteuerung((Aussenelementansteuerung)newValue);
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				unsetIDAussenelementansteuerung();
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
			case Ansteuerung_ElementPackage.STELL_BEREICH__ID_AUSSENELEMENTANSTEUERUNG:
				return isSetIDAussenelementansteuerung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Stell_BereichImpl
