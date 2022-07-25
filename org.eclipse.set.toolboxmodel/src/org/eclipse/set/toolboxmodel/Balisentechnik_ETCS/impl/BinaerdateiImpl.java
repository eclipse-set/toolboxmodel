/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdatei;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binaerdatei</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.BinaerdateiImpl#getBinaerdateiAllg <em>Binaerdatei Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaerdateiImpl extends Basis_ObjektImpl implements Binaerdatei {
	/**
	 * The cached value of the '{@link #getBinaerdateiAllg() <em>Binaerdatei Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinaerdateiAllg()
	 * @generated
	 * @ordered
	 */
	protected Binaerdatei_Allg_AttributeGroup binaerdateiAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaerdateiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBinaerdatei();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdatei_Allg_AttributeGroup getBinaerdateiAllg() {
		return binaerdateiAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinaerdateiAllg(Binaerdatei_Allg_AttributeGroup newBinaerdateiAllg, NotificationChain msgs) {
		Binaerdatei_Allg_AttributeGroup oldBinaerdateiAllg = binaerdateiAllg;
		binaerdateiAllg = newBinaerdateiAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG, oldBinaerdateiAllg, newBinaerdateiAllg);
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
	public void setBinaerdateiAllg(Binaerdatei_Allg_AttributeGroup newBinaerdateiAllg) {
		if (newBinaerdateiAllg != binaerdateiAllg) {
			NotificationChain msgs = null;
			if (binaerdateiAllg != null)
				msgs = ((InternalEObject)binaerdateiAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG, null, msgs);
			if (newBinaerdateiAllg != null)
				msgs = ((InternalEObject)newBinaerdateiAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG, null, msgs);
			msgs = basicSetBinaerdateiAllg(newBinaerdateiAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG, newBinaerdateiAllg, newBinaerdateiAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG:
				return basicSetBinaerdateiAllg(null, msgs);
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
			case Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG:
				return getBinaerdateiAllg();
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
			case Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG:
				setBinaerdateiAllg((Binaerdatei_Allg_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG:
				setBinaerdateiAllg((Binaerdatei_Allg_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.BINAERDATEI__BINAERDATEI_ALLG:
				return binaerdateiAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //BinaerdateiImpl
