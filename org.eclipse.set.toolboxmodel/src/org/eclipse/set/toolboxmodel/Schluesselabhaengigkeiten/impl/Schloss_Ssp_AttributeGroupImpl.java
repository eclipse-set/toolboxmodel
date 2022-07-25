/**
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schloss Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.Schloss_Ssp_AttributeGroupImpl#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Schloss_Ssp_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Schloss_Ssp_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDSchluesselsperre() <em>ID Schluesselsperre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSchluesselsperre()
	 * @generated
	 * @ordered
	 */
	protected Schluesselsperre iDSchluesselsperre;

	/**
	 * This is true if the ID Schluesselsperre reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSchluesselsperreESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schloss_Ssp_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLOSS_SSP_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schluesselsperre getIDSchluesselsperre() {
		if (iDSchluesselsperre != null && iDSchluesselsperre.eIsProxy()) {
			InternalEObject oldIDSchluesselsperre = (InternalEObject)iDSchluesselsperre;
			iDSchluesselsperre = (Schluesselsperre)eResolveProxy(oldIDSchluesselsperre);
			if (iDSchluesselsperre != oldIDSchluesselsperre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, iDSchluesselsperre));
			}
		}
		return iDSchluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schluesselsperre basicGetIDSchluesselsperre() {
		return iDSchluesselsperre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSchluesselsperre(Schluesselsperre newIDSchluesselsperre) {
		Schluesselsperre oldIDSchluesselsperre = iDSchluesselsperre;
		iDSchluesselsperre = newIDSchluesselsperre;
		boolean oldIDSchluesselsperreESet = iDSchluesselsperreESet;
		iDSchluesselsperreESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, iDSchluesselsperre, !oldIDSchluesselsperreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSchluesselsperre() {
		Schluesselsperre oldIDSchluesselsperre = iDSchluesselsperre;
		boolean oldIDSchluesselsperreESet = iDSchluesselsperreESet;
		iDSchluesselsperre = null;
		iDSchluesselsperreESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE, oldIDSchluesselsperre, null, oldIDSchluesselsperreESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSchluesselsperre() {
		return iDSchluesselsperreESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				if (resolve) return getIDSchluesselsperre();
				return basicGetIDSchluesselsperre();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				setIDSchluesselsperre((Schluesselsperre)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				unsetIDSchluesselsperre();
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
			case SchluesselabhaengigkeitenPackage.SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE:
				return isSetIDSchluesselsperre();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Schloss_Ssp_AttributeGroupImpl
