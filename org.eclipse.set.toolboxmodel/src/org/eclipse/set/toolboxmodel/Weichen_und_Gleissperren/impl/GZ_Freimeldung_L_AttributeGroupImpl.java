/**
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Element_Lage_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.GZ_Freimeldung_L_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GZ Freimeldung LAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.GZ_Freimeldung_L_AttributeGroupImpl#getElementLage <em>Element Lage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.GZ_Freimeldung_L_AttributeGroupImpl#getIDElement <em>ID Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GZ_Freimeldung_L_AttributeGroupImpl extends MinimalEObjectImpl.Container implements GZ_Freimeldung_L_AttributeGroup {
	/**
	 * The cached value of the '{@link #getElementLage() <em>Element Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementLage()
	 * @generated
	 * @ordered
	 */
	protected Element_Lage_TypeClass elementLage;

	/**
	 * The cached value of the '{@link #getIDElement() <em>ID Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDElement()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDElement;

	/**
	 * This is true if the ID Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDElementESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GZ_Freimeldung_L_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.GZ_FREIMELDUNG_LATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element_Lage_TypeClass getElementLage() {
		return elementLage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementLage(Element_Lage_TypeClass newElementLage, NotificationChain msgs) {
		Element_Lage_TypeClass oldElementLage = elementLage;
		elementLage = newElementLage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE, oldElementLage, newElementLage);
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
	public void setElementLage(Element_Lage_TypeClass newElementLage) {
		if (newElementLage != elementLage) {
			NotificationChain msgs = null;
			if (elementLage != null)
				msgs = ((InternalEObject)elementLage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE, null, msgs);
			if (newElementLage != null)
				msgs = ((InternalEObject)newElementLage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE, null, msgs);
			msgs = basicSetElementLage(newElementLage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE, newElementLage, newElementLage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDElement() {
		if (iDElement != null && iDElement.eIsProxy()) {
			InternalEObject oldIDElement = (InternalEObject)iDElement;
			iDElement = (Basis_Objekt)eResolveProxy(oldIDElement);
			if (iDElement != oldIDElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT, oldIDElement, iDElement));
			}
		}
		return iDElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDElement() {
		return iDElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDElement(Basis_Objekt newIDElement) {
		Basis_Objekt oldIDElement = iDElement;
		iDElement = newIDElement;
		boolean oldIDElementESet = iDElementESet;
		iDElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT, oldIDElement, iDElement, !oldIDElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDElement() {
		Basis_Objekt oldIDElement = iDElement;
		boolean oldIDElementESet = iDElementESet;
		iDElement = null;
		iDElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT, oldIDElement, null, oldIDElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDElement() {
		return iDElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE:
				return basicSetElementLage(null, msgs);
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE:
				return getElementLage();
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT:
				if (resolve) return getIDElement();
				return basicGetIDElement();
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE:
				setElementLage((Element_Lage_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT:
				setIDElement((Basis_Objekt)newValue);
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE:
				setElementLage((Element_Lage_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT:
				unsetIDElement();
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
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ELEMENT_LAGE:
				return elementLage != null;
			case Weichen_und_GleissperrenPackage.GZ_FREIMELDUNG_LATTRIBUTE_GROUP__ID_ELEMENT:
				return isSetIDElement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //GZ_Freimeldung_L_AttributeGroupImpl
