/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Bedien_Anz_Element_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Handschalteinrichtung_TypeClass;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Bedien Anz Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl#getBUEHandschalteinrichtung <em>BUE Handschalteinrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl#getIDBedienAnzeigeElement <em>ID Bedien Anzeige Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl#getIDHandschaltWirkfunktion <em>ID Handschalt Wirkfunktion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl extends MinimalEObjectImpl.Container implements BUE_Bedien_Anz_Element_Allg_AttributeGroup {
	/**
	 * The cached value of the '{@link #getBUEHandschalteinrichtung() <em>BUE Handschalteinrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEHandschalteinrichtung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Handschalteinrichtung_TypeClass bUEHandschalteinrichtung;

	/**
	 * The cached value of the '{@link #getIDBedienAnzeigeElement() <em>ID Bedien Anzeige Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienAnzeigeElement()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element iDBedienAnzeigeElement;

	/**
	 * This is true if the ID Bedien Anzeige Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienAnzeigeElementESet;

	/**
	 * The cached value of the '{@link #getIDHandschaltWirkfunktion() <em>ID Handschalt Wirkfunktion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHandschaltWirkfunktion()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDHandschaltWirkfunktion;

	/**
	 * This is true if the ID Handschalt Wirkfunktion reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDHandschaltWirkfunktionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Bedien_Anz_Element_Allg_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Handschalteinrichtung_TypeClass getBUEHandschalteinrichtung() {
		return bUEHandschalteinrichtung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass newBUEHandschalteinrichtung, NotificationChain msgs) {
		BUE_Handschalteinrichtung_TypeClass oldBUEHandschalteinrichtung = bUEHandschalteinrichtung;
		bUEHandschalteinrichtung = newBUEHandschalteinrichtung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, oldBUEHandschalteinrichtung, newBUEHandschalteinrichtung);
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
	public void setBUEHandschalteinrichtung(BUE_Handschalteinrichtung_TypeClass newBUEHandschalteinrichtung) {
		if (newBUEHandschalteinrichtung != bUEHandschalteinrichtung) {
			NotificationChain msgs = null;
			if (bUEHandschalteinrichtung != null)
				msgs = ((InternalEObject)bUEHandschalteinrichtung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, null, msgs);
			if (newBUEHandschalteinrichtung != null)
				msgs = ((InternalEObject)newBUEHandschalteinrichtung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, null, msgs);
			msgs = basicSetBUEHandschalteinrichtung(newBUEHandschalteinrichtung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG, newBUEHandschalteinrichtung, newBUEHandschalteinrichtung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element getIDBedienAnzeigeElement() {
		if (iDBedienAnzeigeElement != null && iDBedienAnzeigeElement.eIsProxy()) {
			InternalEObject oldIDBedienAnzeigeElement = (InternalEObject)iDBedienAnzeigeElement;
			iDBedienAnzeigeElement = (Bedien_Anzeige_Element)eResolveProxy(oldIDBedienAnzeigeElement);
			if (iDBedienAnzeigeElement != oldIDBedienAnzeigeElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, iDBedienAnzeigeElement));
			}
		}
		return iDBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Anzeige_Element basicGetIDBedienAnzeigeElement() {
		return iDBedienAnzeigeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienAnzeigeElement(Bedien_Anzeige_Element newIDBedienAnzeigeElement) {
		Bedien_Anzeige_Element oldIDBedienAnzeigeElement = iDBedienAnzeigeElement;
		iDBedienAnzeigeElement = newIDBedienAnzeigeElement;
		boolean oldIDBedienAnzeigeElementESet = iDBedienAnzeigeElementESet;
		iDBedienAnzeigeElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, iDBedienAnzeigeElement, !oldIDBedienAnzeigeElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienAnzeigeElement() {
		Bedien_Anzeige_Element oldIDBedienAnzeigeElement = iDBedienAnzeigeElement;
		boolean oldIDBedienAnzeigeElementESet = iDBedienAnzeigeElementESet;
		iDBedienAnzeigeElement = null;
		iDBedienAnzeigeElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT, oldIDBedienAnzeigeElement, null, oldIDBedienAnzeigeElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienAnzeigeElement() {
		return iDBedienAnzeigeElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDHandschaltWirkfunktion() {
		if (iDHandschaltWirkfunktion != null && iDHandschaltWirkfunktion.eIsProxy()) {
			InternalEObject oldIDHandschaltWirkfunktion = (InternalEObject)iDHandschaltWirkfunktion;
			iDHandschaltWirkfunktion = (Basis_Objekt)eResolveProxy(oldIDHandschaltWirkfunktion);
			if (iDHandschaltWirkfunktion != oldIDHandschaltWirkfunktion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, oldIDHandschaltWirkfunktion, iDHandschaltWirkfunktion));
			}
		}
		return iDHandschaltWirkfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDHandschaltWirkfunktion() {
		return iDHandschaltWirkfunktion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDHandschaltWirkfunktion(Basis_Objekt newIDHandschaltWirkfunktion) {
		Basis_Objekt oldIDHandschaltWirkfunktion = iDHandschaltWirkfunktion;
		iDHandschaltWirkfunktion = newIDHandschaltWirkfunktion;
		boolean oldIDHandschaltWirkfunktionESet = iDHandschaltWirkfunktionESet;
		iDHandschaltWirkfunktionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, oldIDHandschaltWirkfunktion, iDHandschaltWirkfunktion, !oldIDHandschaltWirkfunktionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDHandschaltWirkfunktion() {
		Basis_Objekt oldIDHandschaltWirkfunktion = iDHandschaltWirkfunktion;
		boolean oldIDHandschaltWirkfunktionESet = iDHandschaltWirkfunktionESet;
		iDHandschaltWirkfunktion = null;
		iDHandschaltWirkfunktionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION, oldIDHandschaltWirkfunktion, null, oldIDHandschaltWirkfunktionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDHandschaltWirkfunktion() {
		return iDHandschaltWirkfunktionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				return basicSetBUEHandschalteinrichtung(null, msgs);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				return getBUEHandschalteinrichtung();
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				if (resolve) return getIDBedienAnzeigeElement();
				return basicGetIDBedienAnzeigeElement();
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				if (resolve) return getIDHandschaltWirkfunktion();
				return basicGetIDHandschaltWirkfunktion();
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				setBUEHandschalteinrichtung((BUE_Handschalteinrichtung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				setIDBedienAnzeigeElement((Bedien_Anzeige_Element)newValue);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				setIDHandschaltWirkfunktion((Basis_Objekt)newValue);
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				setBUEHandschalteinrichtung((BUE_Handschalteinrichtung_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				unsetIDBedienAnzeigeElement();
				return;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				unsetIDHandschaltWirkfunktion();
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
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__BUE_HANDSCHALTEINRICHTUNG:
				return bUEHandschalteinrichtung != null;
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_BEDIEN_ANZEIGE_ELEMENT:
				return isSetIDBedienAnzeigeElement();
			case BahnuebergangPackage.BUE_BEDIEN_ANZ_ELEMENT_ALLG_ATTRIBUTE_GROUP__ID_HANDSCHALT_WIRKFUNKTION:
				return isSetIDHandschaltWirkfunktion();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Bedien_Anz_Element_Allg_AttributeGroupImpl
