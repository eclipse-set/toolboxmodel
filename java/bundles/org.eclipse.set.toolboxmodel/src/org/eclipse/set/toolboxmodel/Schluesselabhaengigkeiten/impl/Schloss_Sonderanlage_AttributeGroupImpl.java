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

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Sonderanlage Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl#getBeschreibungSonderanlage <em>Beschreibung Sonderanlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Sonderanlage_AttributeGroupImpl#getIDSonderanlage <em>ID Sonderanlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Sonderanlage_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schloss_Sonderanlage_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBeschreibungSonderanlage() <em>Beschreibung Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibungSonderanlage()
	 * @generated
	 * @ordered
	 */
	protected Beschreibung_Sonderanlage_TypeClass beschreibungSonderanlage;

	/**
	 * The cached value of the '{@link #getIDSonderanlage() <em>ID Sonderanlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSonderanlage()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDSonderanlage;

	/**
	 * This is true if the ID Sonderanlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSonderanlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Sonderanlage_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Beschreibung_Sonderanlage_TypeClass getBeschreibungSonderanlage() {
		return beschreibungSonderanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass newBeschreibungSonderanlage, NotificationChain msgs) {
		Beschreibung_Sonderanlage_TypeClass oldBeschreibungSonderanlage = beschreibungSonderanlage;
		beschreibungSonderanlage = newBeschreibungSonderanlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, oldBeschreibungSonderanlage, newBeschreibungSonderanlage);
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
	public void setBeschreibungSonderanlage(Beschreibung_Sonderanlage_TypeClass newBeschreibungSonderanlage) {
		if (newBeschreibungSonderanlage != beschreibungSonderanlage) {
			NotificationChain msgs = null;
			if (beschreibungSonderanlage != null)
				msgs = ((InternalEObject)beschreibungSonderanlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, null, msgs);
			if (newBeschreibungSonderanlage != null)
				msgs = ((InternalEObject)newBeschreibungSonderanlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, null, msgs);
			msgs = basicSetBeschreibungSonderanlage(newBeschreibungSonderanlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE, newBeschreibungSonderanlage, newBeschreibungSonderanlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDSonderanlage() {
		if (iDSonderanlage != null && iDSonderanlage.eIsProxy()) {
			InternalEObject oldIDSonderanlage = (InternalEObject)iDSonderanlage;
			iDSonderanlage = (W_Kr_Gsp_Element)eResolveProxy(oldIDSonderanlage);
			if (iDSonderanlage != oldIDSonderanlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, oldIDSonderanlage, iDSonderanlage));
			}
		}
		return iDSonderanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDSonderanlage() {
		return iDSonderanlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSonderanlage(W_Kr_Gsp_Element newIDSonderanlage) {
		W_Kr_Gsp_Element oldIDSonderanlage = iDSonderanlage;
		iDSonderanlage = newIDSonderanlage;
		boolean oldIDSonderanlageESet = iDSonderanlageESet;
		iDSonderanlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, oldIDSonderanlage, iDSonderanlage, !oldIDSonderanlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSonderanlage() {
		W_Kr_Gsp_Element oldIDSonderanlage = iDSonderanlage;
		boolean oldIDSonderanlageESet = iDSonderanlageESet;
		iDSonderanlage = null;
		iDSonderanlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE, oldIDSonderanlage, null, oldIDSonderanlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSonderanlage() {
		return iDSonderanlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				return basicSetBeschreibungSonderanlage(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				return getBeschreibungSonderanlage();
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				if (resolve) return getIDSonderanlage();
				return basicGetIDSonderanlage();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				setBeschreibungSonderanlage((Beschreibung_Sonderanlage_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				setIDSonderanlage((W_Kr_Gsp_Element)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				setBeschreibungSonderanlage((Beschreibung_Sonderanlage_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				unsetIDSonderanlage();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE:
				return beschreibungSonderanlage != null;
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE:
				return isSetIDSonderanlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schloss_Sonderanlage_AttributeGroupImpl
