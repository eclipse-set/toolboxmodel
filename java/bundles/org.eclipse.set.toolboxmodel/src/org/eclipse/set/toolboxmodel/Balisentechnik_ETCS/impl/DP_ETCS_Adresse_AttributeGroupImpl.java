/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_ETCS_Adresse_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Adresse_Kennung_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Adresse_NID_BG_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Adresse_NID_C_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP ETCS Adresse Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_ETCS_Adresse_AttributeGroupImpl#getETCSAdresseKennung <em>ETCS Adresse Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_ETCS_Adresse_AttributeGroupImpl#getETCSAdresseNIDBG <em>ETCS Adresse NIDBG</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_ETCS_Adresse_AttributeGroupImpl#getETCSAdresseNIDC <em>ETCS Adresse NIDC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_ETCS_Adresse_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_ETCS_Adresse_AttributeGroup {
	/**
	 * The cached value of the '{@link #getETCSAdresseKennung() <em>ETCS Adresse Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSAdresseKennung()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Adresse_Kennung_TypeClass eTCSAdresseKennung;

	/**
	 * The cached value of the '{@link #getETCSAdresseNIDBG() <em>ETCS Adresse NIDBG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSAdresseNIDBG()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Adresse_NID_BG_TypeClass eTCSAdresseNIDBG;

	/**
	 * The cached value of the '{@link #getETCSAdresseNIDC() <em>ETCS Adresse NIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSAdresseNIDC()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Adresse_NID_C_TypeClass eTCSAdresseNIDC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_ETCS_Adresse_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_ETCS_Adresse_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Adresse_Kennung_TypeClass getETCSAdresseKennung() {
		return eTCSAdresseKennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSAdresseKennung(ETCS_Adresse_Kennung_TypeClass newETCSAdresseKennung, NotificationChain msgs) {
		ETCS_Adresse_Kennung_TypeClass oldETCSAdresseKennung = eTCSAdresseKennung;
		eTCSAdresseKennung = newETCSAdresseKennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG, oldETCSAdresseKennung, newETCSAdresseKennung);
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
	public void setETCSAdresseKennung(ETCS_Adresse_Kennung_TypeClass newETCSAdresseKennung) {
		if (newETCSAdresseKennung != eTCSAdresseKennung) {
			NotificationChain msgs = null;
			if (eTCSAdresseKennung != null)
				msgs = ((InternalEObject)eTCSAdresseKennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG, null, msgs);
			if (newETCSAdresseKennung != null)
				msgs = ((InternalEObject)newETCSAdresseKennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG, null, msgs);
			msgs = basicSetETCSAdresseKennung(newETCSAdresseKennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG, newETCSAdresseKennung, newETCSAdresseKennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Adresse_NID_BG_TypeClass getETCSAdresseNIDBG() {
		return eTCSAdresseNIDBG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSAdresseNIDBG(ETCS_Adresse_NID_BG_TypeClass newETCSAdresseNIDBG, NotificationChain msgs) {
		ETCS_Adresse_NID_BG_TypeClass oldETCSAdresseNIDBG = eTCSAdresseNIDBG;
		eTCSAdresseNIDBG = newETCSAdresseNIDBG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG, oldETCSAdresseNIDBG, newETCSAdresseNIDBG);
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
	public void setETCSAdresseNIDBG(ETCS_Adresse_NID_BG_TypeClass newETCSAdresseNIDBG) {
		if (newETCSAdresseNIDBG != eTCSAdresseNIDBG) {
			NotificationChain msgs = null;
			if (eTCSAdresseNIDBG != null)
				msgs = ((InternalEObject)eTCSAdresseNIDBG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG, null, msgs);
			if (newETCSAdresseNIDBG != null)
				msgs = ((InternalEObject)newETCSAdresseNIDBG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG, null, msgs);
			msgs = basicSetETCSAdresseNIDBG(newETCSAdresseNIDBG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG, newETCSAdresseNIDBG, newETCSAdresseNIDBG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Adresse_NID_C_TypeClass getETCSAdresseNIDC() {
		return eTCSAdresseNIDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSAdresseNIDC(ETCS_Adresse_NID_C_TypeClass newETCSAdresseNIDC, NotificationChain msgs) {
		ETCS_Adresse_NID_C_TypeClass oldETCSAdresseNIDC = eTCSAdresseNIDC;
		eTCSAdresseNIDC = newETCSAdresseNIDC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC, oldETCSAdresseNIDC, newETCSAdresseNIDC);
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
	public void setETCSAdresseNIDC(ETCS_Adresse_NID_C_TypeClass newETCSAdresseNIDC) {
		if (newETCSAdresseNIDC != eTCSAdresseNIDC) {
			NotificationChain msgs = null;
			if (eTCSAdresseNIDC != null)
				msgs = ((InternalEObject)eTCSAdresseNIDC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC, null, msgs);
			if (newETCSAdresseNIDC != null)
				msgs = ((InternalEObject)newETCSAdresseNIDC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC, null, msgs);
			msgs = basicSetETCSAdresseNIDC(newETCSAdresseNIDC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC, newETCSAdresseNIDC, newETCSAdresseNIDC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG:
				return basicSetETCSAdresseKennung(null, msgs);
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG:
				return basicSetETCSAdresseNIDBG(null, msgs);
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC:
				return basicSetETCSAdresseNIDC(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG:
				return getETCSAdresseKennung();
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG:
				return getETCSAdresseNIDBG();
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC:
				return getETCSAdresseNIDC();
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
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG:
				setETCSAdresseKennung((ETCS_Adresse_Kennung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG:
				setETCSAdresseNIDBG((ETCS_Adresse_NID_BG_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC:
				setETCSAdresseNIDC((ETCS_Adresse_NID_C_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG:
				setETCSAdresseKennung((ETCS_Adresse_Kennung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG:
				setETCSAdresseNIDBG((ETCS_Adresse_NID_BG_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC:
				setETCSAdresseNIDC((ETCS_Adresse_NID_C_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_KENNUNG:
				return eTCSAdresseKennung != null;
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDBG:
				return eTCSAdresseNIDBG != null;
			case Balisentechnik_ETCSPackage.DP_ETCS_ADRESSE_ATTRIBUTE_GROUP__ETCS_ADRESSE_NIDC:
				return eTCSAdresseNIDC != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_ETCS_Adresse_AttributeGroupImpl
