/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Kreuzungsplan_Koordinaten_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Kreuzungsplan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getBUEKreuzungsplanKoordinaten <em>BUE Kreuzungsplan Koordinaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_KreuzungsplanImpl#getIDAnhangKreuzungsplan <em>ID Anhang Kreuzungsplan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_KreuzungsplanImpl extends Basis_ObjektImpl implements BUE_Kreuzungsplan {
	/**
	 * The cached value of the '{@link #getBUEKreuzungsplanKoordinaten() <em>BUE Kreuzungsplan Koordinaten</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEKreuzungsplanKoordinaten()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> bUEKreuzungsplanKoordinaten;

	/**
	 * The cached value of the '{@link #getIDAnhangKreuzungsplan() <em>ID Anhang Kreuzungsplan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangKreuzungsplan()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangKreuzungsplan;

	/**
	 * This is true if the ID Anhang Kreuzungsplan reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangKreuzungsplanESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_KreuzungsplanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Kreuzungsplan();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup> getBUEKreuzungsplanKoordinaten() {
		if (bUEKreuzungsplanKoordinaten == null) {
			bUEKreuzungsplanKoordinaten = new EObjectContainmentEList<BUE_Kreuzungsplan_Koordinaten_AttributeGroup>(BUE_Kreuzungsplan_Koordinaten_AttributeGroup.class, this, BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN);
		}
		return bUEKreuzungsplanKoordinaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangKreuzungsplan() {
		if (iDAnhangKreuzungsplan != null && iDAnhangKreuzungsplan.eIsProxy()) {
			InternalEObject oldIDAnhangKreuzungsplan = (InternalEObject)iDAnhangKreuzungsplan;
			iDAnhangKreuzungsplan = (Anhang)eResolveProxy(oldIDAnhangKreuzungsplan);
			if (iDAnhangKreuzungsplan != oldIDAnhangKreuzungsplan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, oldIDAnhangKreuzungsplan, iDAnhangKreuzungsplan));
			}
		}
		return iDAnhangKreuzungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangKreuzungsplan() {
		return iDAnhangKreuzungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangKreuzungsplan(Anhang newIDAnhangKreuzungsplan) {
		Anhang oldIDAnhangKreuzungsplan = iDAnhangKreuzungsplan;
		iDAnhangKreuzungsplan = newIDAnhangKreuzungsplan;
		boolean oldIDAnhangKreuzungsplanESet = iDAnhangKreuzungsplanESet;
		iDAnhangKreuzungsplanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, oldIDAnhangKreuzungsplan, iDAnhangKreuzungsplan, !oldIDAnhangKreuzungsplanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangKreuzungsplan() {
		Anhang oldIDAnhangKreuzungsplan = iDAnhangKreuzungsplan;
		boolean oldIDAnhangKreuzungsplanESet = iDAnhangKreuzungsplanESet;
		iDAnhangKreuzungsplan = null;
		iDAnhangKreuzungsplanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN, oldIDAnhangKreuzungsplan, null, oldIDAnhangKreuzungsplanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangKreuzungsplan() {
		return iDAnhangKreuzungsplanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return ((InternalEList<?>)getBUEKreuzungsplanKoordinaten()).basicRemove(otherEnd, msgs);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return getBUEKreuzungsplanKoordinaten();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				if (resolve) return getIDAnhangKreuzungsplan();
				return basicGetIDAnhangKreuzungsplan();
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				getBUEKreuzungsplanKoordinaten().clear();
				getBUEKreuzungsplanKoordinaten().addAll((Collection<? extends BUE_Kreuzungsplan_Koordinaten_AttributeGroup>)newValue);
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				setIDAnhangKreuzungsplan((Anhang)newValue);
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				getBUEKreuzungsplanKoordinaten().clear();
				return;
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				unsetIDAnhangKreuzungsplan();
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
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__BUE_KREUZUNGSPLAN_KOORDINATEN:
				return bUEKreuzungsplanKoordinaten != null && !bUEKreuzungsplanKoordinaten.isEmpty();
			case BahnuebergangPackage.BUE_KREUZUNGSPLAN__ID_ANHANG_KREUZUNGSPLAN:
				return isSetIDAnhangKreuzungsplan();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_KreuzungsplanImpl
