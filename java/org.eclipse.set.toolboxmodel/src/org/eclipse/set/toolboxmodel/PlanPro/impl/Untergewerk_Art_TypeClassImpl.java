/**
 */
package org.eclipse.set.toolboxmodel.PlanPro.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.BasisTypen.impl.BasisAttribut_AttributeGroupImpl;

import org.eclipse.set.toolboxmodel.PlanPro.ENUMUntergewerkArt;
import org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage;
import org.eclipse.set.toolboxmodel.PlanPro.Untergewerk_Art_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Untergewerk Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Untergewerk_Art_TypeClassImpl#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Untergewerk_Art_TypeClassImpl extends BasisAttribut_AttributeGroupImpl implements Untergewerk_Art_TypeClass {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final ENUMUntergewerkArt WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected ENUMUntergewerkArt wert = WERT_EDEFAULT;

	/**
	 * This is true if the Wert attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wertESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Untergewerk_Art_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getUntergewerk_Art_TypeClass();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENUMUntergewerkArt getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(ENUMUntergewerkArt newWert) {
		ENUMUntergewerkArt oldWert = wert;
		wert = newWert;
		boolean oldWertESet = wertESet;
		wertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS__WERT, oldWert, wert, !oldWertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWert() {
		ENUMUntergewerkArt oldWert = wert;
		boolean oldWertESet = wertESet;
		wert = WERT_EDEFAULT;
		wertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS__WERT, oldWert, WERT_EDEFAULT, oldWertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWert() {
		return wertESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS__WERT:
				return getWert();
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
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS__WERT:
				setWert((ENUMUntergewerkArt)newValue);
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
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS__WERT:
				unsetWert();
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
			case PlanProPackage.UNTERGEWERK_ART_TYPE_CLASS__WERT:
				return isSetWert();
			default:
				return super.eIsSet(featureID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (wert: ");
		if (wertESet) result.append(wert); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //Untergewerk_Art_TypeClassImpl
