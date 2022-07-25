/**
 */
package org.eclipse.set.toolboxmodel.Bedienung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bedienung.BedienungPackage;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedien Oertlichkeit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_OertlichkeitImpl#getBedienOertlichkeitKennzahlen <em>Bedien Oertlichkeit Kennzahlen</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_OertlichkeitImpl#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bedienung.impl.Bedien_OertlichkeitImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedien_OertlichkeitImpl extends Basis_ObjektImpl implements Bedien_Oertlichkeit {
	/**
	 * The cached value of the '{@link #getBedienOertlichkeitKennzahlen() <em>Bedien Oertlichkeit Kennzahlen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienOertlichkeitKennzahlen()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Oertlichkeit_Kennzahlen_AttributeGroup bedienOertlichkeitKennzahlen;

	/**
	 * The cached value of the '{@link #getIDBedienBezirk() <em>ID Bedien Bezirk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirk()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk iDBedienBezirk;

	/**
	 * This is true if the ID Bedien Bezirk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienBezirkESet;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeit;

	/**
	 * This is true if the ID Oertlichkeit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedien_OertlichkeitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BedienungPackage.Literals.BEDIEN_OERTLICHKEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Oertlichkeit_Kennzahlen_AttributeGroup getBedienOertlichkeitKennzahlen() {
		return bedienOertlichkeitKennzahlen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienOertlichkeitKennzahlen(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup newBedienOertlichkeitKennzahlen, NotificationChain msgs) {
		Bedien_Oertlichkeit_Kennzahlen_AttributeGroup oldBedienOertlichkeitKennzahlen = bedienOertlichkeitKennzahlen;
		bedienOertlichkeitKennzahlen = newBedienOertlichkeitKennzahlen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, oldBedienOertlichkeitKennzahlen, newBedienOertlichkeitKennzahlen);
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
	public void setBedienOertlichkeitKennzahlen(Bedien_Oertlichkeit_Kennzahlen_AttributeGroup newBedienOertlichkeitKennzahlen) {
		if (newBedienOertlichkeitKennzahlen != bedienOertlichkeitKennzahlen) {
			NotificationChain msgs = null;
			if (bedienOertlichkeitKennzahlen != null)
				msgs = ((InternalEObject)bedienOertlichkeitKennzahlen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, null, msgs);
			if (newBedienOertlichkeitKennzahlen != null)
				msgs = ((InternalEObject)newBedienOertlichkeitKennzahlen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, null, msgs);
			msgs = basicSetBedienOertlichkeitKennzahlen(newBedienOertlichkeitKennzahlen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN, newBedienOertlichkeitKennzahlen, newBedienOertlichkeitKennzahlen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk getIDBedienBezirk() {
		if (iDBedienBezirk != null && iDBedienBezirk.eIsProxy()) {
			InternalEObject oldIDBedienBezirk = (InternalEObject)iDBedienBezirk;
			iDBedienBezirk = (Bedien_Bezirk)eResolveProxy(oldIDBedienBezirk);
			if (iDBedienBezirk != oldIDBedienBezirk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk));
			}
		}
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Bezirk basicGetIDBedienBezirk() {
		return iDBedienBezirk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienBezirk(Bedien_Bezirk newIDBedienBezirk) {
		Bedien_Bezirk oldIDBedienBezirk = iDBedienBezirk;
		iDBedienBezirk = newIDBedienBezirk;
		boolean oldIDBedienBezirkESet = iDBedienBezirkESet;
		iDBedienBezirkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, iDBedienBezirk, !oldIDBedienBezirkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienBezirk() {
		Bedien_Bezirk oldIDBedienBezirk = iDBedienBezirk;
		boolean oldIDBedienBezirkESet = iDBedienBezirkESet;
		iDBedienBezirk = null;
		iDBedienBezirkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK, oldIDBedienBezirk, null, oldIDBedienBezirkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienBezirk() {
		return iDBedienBezirkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeit() {
		if (iDOertlichkeit != null && iDOertlichkeit.eIsProxy()) {
			InternalEObject oldIDOertlichkeit = (InternalEObject)iDOertlichkeit;
			iDOertlichkeit = (Oertlichkeit)eResolveProxy(oldIDOertlichkeit);
			if (iDOertlichkeit != oldIDOertlichkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit));
			}
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeit(Oertlichkeit newIDOertlichkeit) {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit, !oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeit() {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeit = null;
		iDOertlichkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT, oldIDOertlichkeit, null, oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeit() {
		return iDOertlichkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				return basicSetBedienOertlichkeitKennzahlen(null, msgs);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				return getBedienOertlichkeitKennzahlen();
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				if (resolve) return getIDBedienBezirk();
				return basicGetIDBedienBezirk();
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				if (resolve) return getIDOertlichkeit();
				return basicGetIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				setBedienOertlichkeitKennzahlen((Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)newValue);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				setIDBedienBezirk((Bedien_Bezirk)newValue);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				setIDOertlichkeit((Oertlichkeit)newValue);
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				setBedienOertlichkeitKennzahlen((Bedien_Oertlichkeit_Kennzahlen_AttributeGroup)null);
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				unsetIDBedienBezirk();
				return;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				unsetIDOertlichkeit();
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
			case BedienungPackage.BEDIEN_OERTLICHKEIT__BEDIEN_OERTLICHKEIT_KENNZAHLEN:
				return bedienOertlichkeitKennzahlen != null;
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_BEDIEN_BEZIRK:
				return isSetIDBedienBezirk();
			case BedienungPackage.BEDIEN_OERTLICHKEIT__ID_OERTLICHKEIT:
				return isSetIDOertlichkeit();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedien_OertlichkeitImpl
