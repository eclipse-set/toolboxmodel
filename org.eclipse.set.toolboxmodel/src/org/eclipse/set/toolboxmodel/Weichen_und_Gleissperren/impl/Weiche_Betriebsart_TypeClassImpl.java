/**
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.BasisTypen.impl.BasisAttribut_AttributeGroupImpl;

import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.ENUMWeicheBetriebsart;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weiche_Betriebsart_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weiche Betriebsart Type Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.Weiche_Betriebsart_TypeClassImpl#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Weiche_Betriebsart_TypeClassImpl extends BasisAttribut_AttributeGroupImpl implements Weiche_Betriebsart_TypeClass {
	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final ENUMWeicheBetriebsart WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected ENUMWeicheBetriebsart wert = WERT_EDEFAULT;

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
	protected Weiche_Betriebsart_TypeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WEICHE_BETRIEBSART_TYPE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ENUMWeicheBetriebsart getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(ENUMWeicheBetriebsart newWert) {
		ENUMWeicheBetriebsart oldWert = wert;
		wert = newWert;
		boolean oldWertESet = wertESet;
		wertESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS__WERT, oldWert, wert, !oldWertESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWert() {
		ENUMWeicheBetriebsart oldWert = wert;
		boolean oldWertESet = wertESet;
		wert = WERT_EDEFAULT;
		wertESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS__WERT, oldWert, WERT_EDEFAULT, oldWertESet));
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
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS__WERT:
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
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS__WERT:
				setWert((ENUMWeicheBetriebsart)newValue);
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
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS__WERT:
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
			case Weichen_und_GleissperrenPackage.WEICHE_BETRIEBSART_TYPE_CLASS__WERT:
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

} //Weiche_Betriebsart_TypeClassImpl