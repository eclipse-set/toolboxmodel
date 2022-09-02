/**
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk_Anhaenge_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Bezirk Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl#getIDAnhangAnbindungIB2 <em>ID Anhang Anbindung IB2</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl#getIDAnhangAnbindungIB3 <em>ID Anhang Anbindung IB3</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_Bezirk_Anhaenge_AttributeGroupImpl#getIDAnhangSteuerbezUebersicht <em>ID Anhang Steuerbez Uebersicht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_Bezirk_Anhaenge_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedien_Bezirk_Anhaenge_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangAnbindungIB2() <em>ID Anhang Anbindung IB2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangAnbindungIB2()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangAnbindungIB2;

	/**
	 * This is true if the ID Anhang Anbindung IB2 reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangAnbindungIB2ESet;

	/**
	 * The cached value of the '{@link #getIDAnhangAnbindungIB3() <em>ID Anhang Anbindung IB3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangAnbindungIB3()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangAnbindungIB3;

	/**
	 * This is true if the ID Anhang Anbindung IB3 reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangAnbindungIB3ESet;

	/**
	 * The cached value of the '{@link #getIDAnhangSteuerbezUebersicht() <em>ID Anhang Steuerbez Uebersicht</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangSteuerbezUebersicht()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangSteuerbezUebersicht;

	/**
	 * This is true if the ID Anhang Steuerbez Uebersicht reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangSteuerbezUebersichtESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_Bezirk_Anhaenge_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangAnbindungIB2() {
		if (iDAnhangAnbindungIB2 != null && iDAnhangAnbindungIB2.eIsProxy()) {
			InternalEObject oldIDAnhangAnbindungIB2 = (InternalEObject)iDAnhangAnbindungIB2;
			iDAnhangAnbindungIB2 = (Anhang)eResolveProxy(oldIDAnhangAnbindungIB2);
			if (iDAnhangAnbindungIB2 != oldIDAnhangAnbindungIB2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, oldIDAnhangAnbindungIB2, iDAnhangAnbindungIB2));
			}
		}
		return iDAnhangAnbindungIB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangAnbindungIB2() {
		return iDAnhangAnbindungIB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangAnbindungIB2(Anhang newIDAnhangAnbindungIB2) {
		Anhang oldIDAnhangAnbindungIB2 = iDAnhangAnbindungIB2;
		iDAnhangAnbindungIB2 = newIDAnhangAnbindungIB2;
		boolean oldIDAnhangAnbindungIB2ESet = iDAnhangAnbindungIB2ESet;
		iDAnhangAnbindungIB2ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, oldIDAnhangAnbindungIB2, iDAnhangAnbindungIB2, !oldIDAnhangAnbindungIB2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangAnbindungIB2() {
		Anhang oldIDAnhangAnbindungIB2 = iDAnhangAnbindungIB2;
		boolean oldIDAnhangAnbindungIB2ESet = iDAnhangAnbindungIB2ESet;
		iDAnhangAnbindungIB2 = null;
		iDAnhangAnbindungIB2ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2, oldIDAnhangAnbindungIB2, null, oldIDAnhangAnbindungIB2ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangAnbindungIB2() {
		return iDAnhangAnbindungIB2ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangAnbindungIB3() {
		if (iDAnhangAnbindungIB3 != null && iDAnhangAnbindungIB3.eIsProxy()) {
			InternalEObject oldIDAnhangAnbindungIB3 = (InternalEObject)iDAnhangAnbindungIB3;
			iDAnhangAnbindungIB3 = (Anhang)eResolveProxy(oldIDAnhangAnbindungIB3);
			if (iDAnhangAnbindungIB3 != oldIDAnhangAnbindungIB3) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, oldIDAnhangAnbindungIB3, iDAnhangAnbindungIB3));
			}
		}
		return iDAnhangAnbindungIB3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangAnbindungIB3() {
		return iDAnhangAnbindungIB3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangAnbindungIB3(Anhang newIDAnhangAnbindungIB3) {
		Anhang oldIDAnhangAnbindungIB3 = iDAnhangAnbindungIB3;
		iDAnhangAnbindungIB3 = newIDAnhangAnbindungIB3;
		boolean oldIDAnhangAnbindungIB3ESet = iDAnhangAnbindungIB3ESet;
		iDAnhangAnbindungIB3ESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, oldIDAnhangAnbindungIB3, iDAnhangAnbindungIB3, !oldIDAnhangAnbindungIB3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangAnbindungIB3() {
		Anhang oldIDAnhangAnbindungIB3 = iDAnhangAnbindungIB3;
		boolean oldIDAnhangAnbindungIB3ESet = iDAnhangAnbindungIB3ESet;
		iDAnhangAnbindungIB3 = null;
		iDAnhangAnbindungIB3ESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3, oldIDAnhangAnbindungIB3, null, oldIDAnhangAnbindungIB3ESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangAnbindungIB3() {
		return iDAnhangAnbindungIB3ESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangSteuerbezUebersicht() {
		if (iDAnhangSteuerbezUebersicht != null && iDAnhangSteuerbezUebersicht.eIsProxy()) {
			InternalEObject oldIDAnhangSteuerbezUebersicht = (InternalEObject)iDAnhangSteuerbezUebersicht;
			iDAnhangSteuerbezUebersicht = (Anhang)eResolveProxy(oldIDAnhangSteuerbezUebersicht);
			if (iDAnhangSteuerbezUebersicht != oldIDAnhangSteuerbezUebersicht) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, oldIDAnhangSteuerbezUebersicht, iDAnhangSteuerbezUebersicht));
			}
		}
		return iDAnhangSteuerbezUebersicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangSteuerbezUebersicht() {
		return iDAnhangSteuerbezUebersicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangSteuerbezUebersicht(Anhang newIDAnhangSteuerbezUebersicht) {
		Anhang oldIDAnhangSteuerbezUebersicht = iDAnhangSteuerbezUebersicht;
		iDAnhangSteuerbezUebersicht = newIDAnhangSteuerbezUebersicht;
		boolean oldIDAnhangSteuerbezUebersichtESet = iDAnhangSteuerbezUebersichtESet;
		iDAnhangSteuerbezUebersichtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, oldIDAnhangSteuerbezUebersicht, iDAnhangSteuerbezUebersicht, !oldIDAnhangSteuerbezUebersichtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangSteuerbezUebersicht() {
		Anhang oldIDAnhangSteuerbezUebersicht = iDAnhangSteuerbezUebersicht;
		boolean oldIDAnhangSteuerbezUebersichtESet = iDAnhangSteuerbezUebersichtESet;
		iDAnhangSteuerbezUebersicht = null;
		iDAnhangSteuerbezUebersichtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT, oldIDAnhangSteuerbezUebersicht, null, oldIDAnhangSteuerbezUebersichtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangSteuerbezUebersicht() {
		return iDAnhangSteuerbezUebersichtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				if (resolve) return getIDAnhangAnbindungIB2();
				return basicGetIDAnhangAnbindungIB2();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				if (resolve) return getIDAnhangAnbindungIB3();
				return basicGetIDAnhangAnbindungIB3();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				if (resolve) return getIDAnhangSteuerbezUebersicht();
				return basicGetIDAnhangSteuerbezUebersicht();
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				setIDAnhangAnbindungIB2((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				setIDAnhangAnbindungIB3((Anhang)newValue);
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				setIDAnhangSteuerbezUebersicht((Anhang)newValue);
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				unsetIDAnhangAnbindungIB2();
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				unsetIDAnhangAnbindungIB3();
				return;
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				unsetIDAnhangSteuerbezUebersicht();
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
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB2:
				return isSetIDAnhangAnbindungIB2();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_ANBINDUNG_IB3:
				return isSetIDAnhangAnbindungIB3();
			case BedienungPackage.BEDIEN_BEZIRK_ANHAENGE_ATTRIBUTE_GROUP__ID_ANHANG_STEUERBEZ_UEBERSICHT:
				return isSetIDAnhangSteuerbezUebersicht();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_Bezirk_Anhaenge_AttributeGroupImpl
