/**
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Hauptschloss_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schlosskombination;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Sk Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl#getHauptschloss <em>Hauptschloss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Sk_AttributeGroupImpl#getIDSchlosskombination <em>ID Schlosskombination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Sk_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schloss_Sk_AttributeGroup {
	/**
	 * The cached value of the '{@link #getHauptschloss() <em>Hauptschloss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHauptschloss()
	 * @generated
	 * @ordered
	 */
	protected Hauptschloss_TypeClass hauptschloss;

	/**
	 * The cached value of the '{@link #getIDSchlosskombination() <em>ID Schlosskombination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchlosskombination()
	 * @generated
	 * @ordered
	 */
	protected Schlosskombination iDSchlosskombination;

	/**
	 * This is true if the ID Schlosskombination reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSchlosskombinationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Sk_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_SK_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hauptschloss_TypeClass getHauptschloss() {
		return hauptschloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHauptschloss(Hauptschloss_TypeClass newHauptschloss, NotificationChain msgs) {
		Hauptschloss_TypeClass oldHauptschloss = hauptschloss;
		hauptschloss = newHauptschloss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, oldHauptschloss, newHauptschloss);
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
	public void setHauptschloss(Hauptschloss_TypeClass newHauptschloss) {
		if (newHauptschloss != hauptschloss) {
			NotificationChain msgs = null;
			if (hauptschloss != null)
				msgs = ((InternalEObject)hauptschloss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, null, msgs);
			if (newHauptschloss != null)
				msgs = ((InternalEObject)newHauptschloss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, null, msgs);
			msgs = basicSetHauptschloss(newHauptschloss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS, newHauptschloss, newHauptschloss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schlosskombination getIDSchlosskombination() {
		if (iDSchlosskombination != null && iDSchlosskombination.eIsProxy()) {
			InternalEObject oldIDSchlosskombination = (InternalEObject)iDSchlosskombination;
			iDSchlosskombination = (Schlosskombination)eResolveProxy(oldIDSchlosskombination);
			if (iDSchlosskombination != oldIDSchlosskombination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, oldIDSchlosskombination, iDSchlosskombination));
			}
		}
		return iDSchlosskombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schlosskombination basicGetIDSchlosskombination() {
		return iDSchlosskombination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSchlosskombination(Schlosskombination newIDSchlosskombination) {
		Schlosskombination oldIDSchlosskombination = iDSchlosskombination;
		iDSchlosskombination = newIDSchlosskombination;
		boolean oldIDSchlosskombinationESet = iDSchlosskombinationESet;
		iDSchlosskombinationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, oldIDSchlosskombination, iDSchlosskombination, !oldIDSchlosskombinationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSchlosskombination() {
		Schlosskombination oldIDSchlosskombination = iDSchlosskombination;
		boolean oldIDSchlosskombinationESet = iDSchlosskombinationESet;
		iDSchlosskombination = null;
		iDSchlosskombinationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION, oldIDSchlosskombination, null, oldIDSchlosskombinationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSchlosskombination() {
		return iDSchlosskombinationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				return basicSetHauptschloss(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				return getHauptschloss();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				if (resolve) return getIDSchlosskombination();
				return basicGetIDSchlosskombination();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				setHauptschloss((Hauptschloss_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				setIDSchlosskombination((Schlosskombination)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				setHauptschloss((Hauptschloss_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				unsetIDSchlosskombination();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS:
				return hauptschloss != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION:
				return isSetIDSchlosskombination();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schloss_Sk_AttributeGroupImpl
