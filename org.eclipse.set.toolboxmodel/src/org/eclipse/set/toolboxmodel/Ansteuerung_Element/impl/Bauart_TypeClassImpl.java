/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Bauart_TypeClass;

import org.eclipse.set.toolboxmodel.BasisTypen.impl.BasisAttribut_AttributeGroupImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bauart Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.Bauart_TypeClassImpl#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bauart_TypeClassImpl extends BasisAttribut_AttributeGroupImpl implements Bauart_TypeClass {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final String WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected String wert = WERT_EDEFAULT;

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
	protected Bauart_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.BAUART_TYPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(String newWert) {
		String oldWert = wert;
		wert = newWert;
		boolean oldWertESet = wertESet;
		wertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.BAUART_TYPE_CLASS__WERT, oldWert, wert, !oldWertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWert() {
		String oldWert = wert;
		boolean oldWertESet = wertESet;
		wert = WERT_EDEFAULT;
		wertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.BAUART_TYPE_CLASS__WERT, oldWert, WERT_EDEFAULT, oldWertESet));
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
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS__WERT:
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
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS__WERT:
				setWert((String)newValue);
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
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS__WERT:
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
			case Ansteuerung_ElementPackage.BAUART_TYPE_CLASS__WERT:
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

} //Bauart_TypeClassImpl
