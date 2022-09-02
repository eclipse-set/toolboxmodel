/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_Signal_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Verwendung_Als_Rueckfall_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Signal_Signalbegriff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung Signal Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bedingung_Signal_AttributeGroupImpl#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bedingung_Signal_AttributeGroupImpl#getVerwendungAlsRueckfall <em>Verwendung Als Rueckfall</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_Signal_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedingung_Signal_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDSignalSignalbegriff() <em>ID Signal Signalbegriff</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalSignalbegriff()
	 * @generated
	 * @ordered
	 */
	protected EList<Signal_Signalbegriff> iDSignalSignalbegriff;

	/**
	 * The cached value of the '{@link #getVerwendungAlsRueckfall() <em>Verwendung Als Rueckfall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwendungAlsRueckfall()
	 * @generated
	 * @ordered
	 */
	protected Verwendung_Als_Rueckfall_TypeClass verwendungAlsRueckfall;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_Signal_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_Signal_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Signal_Signalbegriff> getIDSignalSignalbegriff() {
		if (iDSignalSignalbegriff == null) {
			iDSignalSignalbegriff = new EObjectResolvingEList<Signal_Signalbegriff>(Signal_Signalbegriff.class, this, Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF);
		}
		return iDSignalSignalbegriff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_Als_Rueckfall_TypeClass getVerwendungAlsRueckfall() {
		return verwendungAlsRueckfall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwendungAlsRueckfall(Verwendung_Als_Rueckfall_TypeClass newVerwendungAlsRueckfall, NotificationChain msgs) {
		Verwendung_Als_Rueckfall_TypeClass oldVerwendungAlsRueckfall = verwendungAlsRueckfall;
		verwendungAlsRueckfall = newVerwendungAlsRueckfall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, oldVerwendungAlsRueckfall, newVerwendungAlsRueckfall);
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
	public void setVerwendungAlsRueckfall(Verwendung_Als_Rueckfall_TypeClass newVerwendungAlsRueckfall) {
		if (newVerwendungAlsRueckfall != verwendungAlsRueckfall) {
			NotificationChain msgs = null;
			if (verwendungAlsRueckfall != null)
				msgs = ((InternalEObject)verwendungAlsRueckfall).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, null, msgs);
			if (newVerwendungAlsRueckfall != null)
				msgs = ((InternalEObject)newVerwendungAlsRueckfall).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, null, msgs);
			msgs = basicSetVerwendungAlsRueckfall(newVerwendungAlsRueckfall, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL, newVerwendungAlsRueckfall, newVerwendungAlsRueckfall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				return basicSetVerwendungAlsRueckfall(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				return getIDSignalSignalbegriff();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				return getVerwendungAlsRueckfall();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				getIDSignalSignalbegriff().clear();
				getIDSignalSignalbegriff().addAll((Collection<? extends Signal_Signalbegriff>)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				setVerwendungAlsRueckfall((Verwendung_Als_Rueckfall_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				getIDSignalSignalbegriff().clear();
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				setVerwendungAlsRueckfall((Verwendung_Als_Rueckfall_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__ID_SIGNAL_SIGNALBEGRIFF:
				return iDSignalSignalbegriff != null && !iDSignalSignalbegriff.isEmpty();
			case Balisentechnik_ETCSPackage.BEDINGUNG_SIGNAL_ATTRIBUTE_GROUP__VERWENDUNG_ALS_RUECKFALL:
				return verwendungAlsRueckfall != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedingung_Signal_AttributeGroupImpl
