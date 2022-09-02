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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Start_W_Element_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.W_Anschluss_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Start WElement Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Start_W_Element_AttributeGroupImpl#getIDStartWElement <em>ID Start WElement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Start_W_Element_AttributeGroupImpl#getWAnschluss <em>WAnschluss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Start_W_Element_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Start_W_Element_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDStartWElement() <em>ID Start WElement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStartWElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDStartWElement;

	/**
	 * This is true if the ID Start WElement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStartWElementESet;

	/**
	 * The cached value of the '{@link #getWAnschluss() <em>WAnschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWAnschluss()
	 * @generated
	 * @ordered
	 */
	protected W_Anschluss_TypeClass wAnschluss;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Start_W_Element_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getStart_W_Element_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDStartWElement() {
		if (iDStartWElement != null && iDStartWElement.eIsProxy()) {
			InternalEObject oldIDStartWElement = (InternalEObject)iDStartWElement;
			iDStartWElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDStartWElement);
			if (iDStartWElement != oldIDStartWElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, oldIDStartWElement, iDStartWElement));
			}
		}
		return iDStartWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDStartWElement() {
		return iDStartWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStartWElement(W_Kr_Gsp_Element newIDStartWElement) {
		W_Kr_Gsp_Element oldIDStartWElement = iDStartWElement;
		iDStartWElement = newIDStartWElement;
		boolean oldIDStartWElementESet = iDStartWElementESet;
		iDStartWElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, oldIDStartWElement, iDStartWElement, !oldIDStartWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStartWElement() {
		W_Kr_Gsp_Element oldIDStartWElement = iDStartWElement;
		boolean oldIDStartWElementESet = iDStartWElementESet;
		iDStartWElement = null;
		iDStartWElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT, oldIDStartWElement, null, oldIDStartWElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStartWElement() {
		return iDStartWElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Anschluss_TypeClass getWAnschluss() {
		return wAnschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWAnschluss(W_Anschluss_TypeClass newWAnschluss, NotificationChain msgs) {
		W_Anschluss_TypeClass oldWAnschluss = wAnschluss;
		wAnschluss = newWAnschluss;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, oldWAnschluss, newWAnschluss);
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
	public void setWAnschluss(W_Anschluss_TypeClass newWAnschluss) {
		if (newWAnschluss != wAnschluss) {
			NotificationChain msgs = null;
			if (wAnschluss != null)
				msgs = ((InternalEObject)wAnschluss).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			if (newWAnschluss != null)
				msgs = ((InternalEObject)newWAnschluss).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, null, msgs);
			msgs = basicSetWAnschluss(newWAnschluss, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS, newWAnschluss, newWAnschluss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return basicSetWAnschluss(null, msgs);
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				if (resolve) return getIDStartWElement();
				return basicGetIDStartWElement();
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return getWAnschluss();
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				setIDStartWElement((W_Kr_Gsp_Element)newValue);
				return;
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				unsetIDStartWElement();
				return;
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				setWAnschluss((W_Anschluss_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__ID_START_WELEMENT:
				return isSetIDStartWElement();
			case Balisentechnik_ETCSPackage.START_WELEMENT_ATTRIBUTE_GROUP__WANSCHLUSS:
				return wAnschluss != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Start_W_Element_AttributeGroupImpl
