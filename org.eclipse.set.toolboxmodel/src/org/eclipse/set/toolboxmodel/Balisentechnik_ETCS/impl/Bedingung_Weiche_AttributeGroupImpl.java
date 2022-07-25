/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_Weiche_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_Weichenlage_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung Weiche Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bedingung_Weiche_AttributeGroupImpl#getBedingungWeichenlage <em>Bedingung Weichenlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bedingung_Weiche_AttributeGroupImpl#getIDWElement <em>IDW Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_Weiche_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedingung_Weiche_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBedingungWeichenlage() <em>Bedingung Weichenlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedingungWeichenlage()
	 * @generated
	 * @ordered
	 */
	protected Bedingung_Weichenlage_TypeClass bedingungWeichenlage;

	/**
	 * The cached value of the '{@link #getIDWElement() <em>IDW Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDWElement;

	/**
	 * This is true if the IDW Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_Weiche_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_Weiche_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedingung_Weichenlage_TypeClass getBedingungWeichenlage() {
		return bedingungWeichenlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedingungWeichenlage(Bedingung_Weichenlage_TypeClass newBedingungWeichenlage, NotificationChain msgs) {
		Bedingung_Weichenlage_TypeClass oldBedingungWeichenlage = bedingungWeichenlage;
		bedingungWeichenlage = newBedingungWeichenlage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, oldBedingungWeichenlage, newBedingungWeichenlage);
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
	public void setBedingungWeichenlage(Bedingung_Weichenlage_TypeClass newBedingungWeichenlage) {
		if (newBedingungWeichenlage != bedingungWeichenlage) {
			NotificationChain msgs = null;
			if (bedingungWeichenlage != null)
				msgs = ((InternalEObject)bedingungWeichenlage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, null, msgs);
			if (newBedingungWeichenlage != null)
				msgs = ((InternalEObject)newBedingungWeichenlage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, null, msgs);
			msgs = basicSetBedingungWeichenlage(newBedingungWeichenlage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE, newBedingungWeichenlage, newBedingungWeichenlage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDWElement() {
		if (iDWElement != null && iDWElement.eIsProxy()) {
			InternalEObject oldIDWElement = (InternalEObject)iDWElement;
			iDWElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDWElement);
			if (iDWElement != oldIDWElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, iDWElement));
			}
		}
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDWElement() {
		return iDWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWElement(W_Kr_Gsp_Element newIDWElement) {
		W_Kr_Gsp_Element oldIDWElement = iDWElement;
		iDWElement = newIDWElement;
		boolean oldIDWElementESet = iDWElementESet;
		iDWElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, iDWElement, !oldIDWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWElement() {
		W_Kr_Gsp_Element oldIDWElement = iDWElement;
		boolean oldIDWElementESet = iDWElementESet;
		iDWElement = null;
		iDWElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT, oldIDWElement, null, oldIDWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWElement() {
		return iDWElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				return basicSetBedingungWeichenlage(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				return getBedingungWeichenlage();
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				if (resolve) return getIDWElement();
				return basicGetIDWElement();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				setBedingungWeichenlage((Bedingung_Weichenlage_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				setIDWElement((W_Kr_Gsp_Element)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				setBedingungWeichenlage((Bedingung_Weichenlage_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				unsetIDWElement();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__BEDINGUNG_WEICHENLAGE:
				return bedingungWeichenlage != null;
			case Balisentechnik_ETCSPackage.BEDINGUNG_WEICHE_ATTRIBUTE_GROUP__IDW_ELEMENT:
				return isSetIDWElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedingung_Weiche_AttributeGroupImpl
