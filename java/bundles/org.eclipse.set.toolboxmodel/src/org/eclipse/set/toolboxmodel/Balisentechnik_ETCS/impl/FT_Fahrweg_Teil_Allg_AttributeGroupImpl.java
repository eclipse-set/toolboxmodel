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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Umfahrstrasse_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_Ist_Fahrwegende_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Fahrweg Teil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_Teil_Allg_AttributeGroupImpl#getUmfahrstrasse <em>Umfahrstrasse</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_Teil_Allg_AttributeGroupImpl#getZielIstFahrwegende <em>Ziel Ist Fahrwegende</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_Fahrweg_Teil_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FT_Fahrweg_Teil_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getUmfahrstrasse() <em>Umfahrstrasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmfahrstrasse()
	 * @generated
	 * @ordered
	 */
	protected Umfahrstrasse_TypeClass umfahrstrasse;

	/**
	 * The cached value of the '{@link #getZielIstFahrwegende() <em>Ziel Ist Fahrwegende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielIstFahrwegende()
	 * @generated
	 * @ordered
	 */
	protected Ziel_Ist_Fahrwegende_TypeClass zielIstFahrwegende;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_Fahrweg_Teil_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Umfahrstrasse_TypeClass getUmfahrstrasse() {
		return umfahrstrasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmfahrstrasse(Umfahrstrasse_TypeClass newUmfahrstrasse, NotificationChain msgs) {
		Umfahrstrasse_TypeClass oldUmfahrstrasse = umfahrstrasse;
		umfahrstrasse = newUmfahrstrasse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE, oldUmfahrstrasse, newUmfahrstrasse);
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
	public void setUmfahrstrasse(Umfahrstrasse_TypeClass newUmfahrstrasse) {
		if (newUmfahrstrasse != umfahrstrasse) {
			NotificationChain msgs = null;
			if (umfahrstrasse != null)
				msgs = ((InternalEObject)umfahrstrasse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE, null, msgs);
			if (newUmfahrstrasse != null)
				msgs = ((InternalEObject)newUmfahrstrasse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE, null, msgs);
			msgs = basicSetUmfahrstrasse(newUmfahrstrasse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE, newUmfahrstrasse, newUmfahrstrasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_Ist_Fahrwegende_TypeClass getZielIstFahrwegende() {
		return zielIstFahrwegende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZielIstFahrwegende(Ziel_Ist_Fahrwegende_TypeClass newZielIstFahrwegende, NotificationChain msgs) {
		Ziel_Ist_Fahrwegende_TypeClass oldZielIstFahrwegende = zielIstFahrwegende;
		zielIstFahrwegende = newZielIstFahrwegende;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE, oldZielIstFahrwegende, newZielIstFahrwegende);
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
	public void setZielIstFahrwegende(Ziel_Ist_Fahrwegende_TypeClass newZielIstFahrwegende) {
		if (newZielIstFahrwegende != zielIstFahrwegende) {
			NotificationChain msgs = null;
			if (zielIstFahrwegende != null)
				msgs = ((InternalEObject)zielIstFahrwegende).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE, null, msgs);
			if (newZielIstFahrwegende != null)
				msgs = ((InternalEObject)newZielIstFahrwegende).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE, null, msgs);
			msgs = basicSetZielIstFahrwegende(newZielIstFahrwegende, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE, newZielIstFahrwegende, newZielIstFahrwegende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE:
				return basicSetUmfahrstrasse(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE:
				return basicSetZielIstFahrwegende(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE:
				return getUmfahrstrasse();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE:
				return getZielIstFahrwegende();
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE:
				setUmfahrstrasse((Umfahrstrasse_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE:
				setZielIstFahrwegende((Ziel_Ist_Fahrwegende_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE:
				setUmfahrstrasse((Umfahrstrasse_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE:
				setZielIstFahrwegende((Ziel_Ist_Fahrwegende_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__UMFAHRSTRASSE:
				return umfahrstrasse != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL_ALLG_ATTRIBUTE_GROUP__ZIEL_IST_FAHRWEGENDE:
				return zielIstFahrwegende != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_Fahrweg_Teil_Allg_AttributeGroupImpl
