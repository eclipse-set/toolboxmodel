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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Bedingung_PZB_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Wirksam_TypeClass;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bedingung PZB Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bedingung_PZB_AttributeGroupImpl#getIDPZBElement <em>IDPZB Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Bedingung_PZB_AttributeGroupImpl#getWirksam <em>Wirksam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bedingung_PZB_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Bedingung_PZB_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDPZBElement() <em>IDPZB Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElement()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element iDPZBElement;

	/**
	 * This is true if the IDPZB Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDPZBElementESet;

	/**
	 * The cached value of the '{@link #getWirksam() <em>Wirksam</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksam()
	 * @generated
	 * @ordered
	 */
	protected Wirksam_TypeClass wirksam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bedingung_PZB_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getBedingung_PZB_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element getIDPZBElement() {
		if (iDPZBElement != null && iDPZBElement.eIsProxy()) {
			InternalEObject oldIDPZBElement = (InternalEObject)iDPZBElement;
			iDPZBElement = (PZB_Element)eResolveProxy(oldIDPZBElement);
			if (iDPZBElement != oldIDPZBElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, oldIDPZBElement, iDPZBElement));
			}
		}
		return iDPZBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PZB_Element basicGetIDPZBElement() {
		return iDPZBElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDPZBElement(PZB_Element newIDPZBElement) {
		PZB_Element oldIDPZBElement = iDPZBElement;
		iDPZBElement = newIDPZBElement;
		boolean oldIDPZBElementESet = iDPZBElementESet;
		iDPZBElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, oldIDPZBElement, iDPZBElement, !oldIDPZBElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDPZBElement() {
		PZB_Element oldIDPZBElement = iDPZBElement;
		boolean oldIDPZBElementESet = iDPZBElementESet;
		iDPZBElement = null;
		iDPZBElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT, oldIDPZBElement, null, oldIDPZBElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDPZBElement() {
		return iDPZBElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksam_TypeClass getWirksam() {
		return wirksam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksam(Wirksam_TypeClass newWirksam, NotificationChain msgs) {
		Wirksam_TypeClass oldWirksam = wirksam;
		wirksam = newWirksam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, oldWirksam, newWirksam);
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
	public void setWirksam(Wirksam_TypeClass newWirksam) {
		if (newWirksam != wirksam) {
			NotificationChain msgs = null;
			if (wirksam != null)
				msgs = ((InternalEObject)wirksam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, null, msgs);
			if (newWirksam != null)
				msgs = ((InternalEObject)newWirksam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, null, msgs);
			msgs = basicSetWirksam(newWirksam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM, newWirksam, newWirksam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				return basicSetWirksam(null, msgs);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				if (resolve) return getIDPZBElement();
				return basicGetIDPZBElement();
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				return getWirksam();
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				setIDPZBElement((PZB_Element)newValue);
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				setWirksam((Wirksam_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				unsetIDPZBElement();
				return;
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				setWirksam((Wirksam_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__IDPZB_ELEMENT:
				return isSetIDPZBElement();
			case Balisentechnik_ETCSPackage.BEDINGUNG_PZB_ATTRIBUTE_GROUP__WIRKSAM:
				return wirksam != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bedingung_PZB_AttributeGroupImpl
