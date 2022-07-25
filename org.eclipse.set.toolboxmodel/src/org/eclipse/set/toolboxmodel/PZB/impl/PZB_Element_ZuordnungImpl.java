/**
 */
package org.eclipse.set.toolboxmodel.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_Rangier;
import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;
import org.eclipse.set.toolboxmodel.PZB.Wirksamkeit_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_ZuordnungImpl#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_ZuordnungImpl#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_ZuordnungImpl#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_ZuordnungImpl#getWirksamkeit <em>Wirksamkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_ZuordnungImpl extends Basis_ObjektImpl implements PZB_Element_Zuordnung {
	/**
	 * The cached value of the '{@link #getIDFstrZugRangier() <em>ID Fstr Zug Rangier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFstrZugRangier()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_Rangier iDFstrZugRangier;

	/**
	 * This is true if the ID Fstr Zug Rangier reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFstrZugRangierESet;

	/**
	 * The cached value of the '{@link #getIDPZBElementBezugspunkt() <em>IDPZB Element Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDPZBElementBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDPZBElementBezugspunkt;

	/**
	 * This is true if the IDPZB Element Bezugspunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDPZBElementBezugspunktESet;

	/**
	 * The cached value of the '{@link #getPZBElementZuordnungINA() <em>PZB Element Zuordnung INA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPZBElementZuordnungINA()
	 * @generated
	 * @ordered
	 */
	protected PZB_Element_Zuordnung_INA_AttributeGroup pZBElementZuordnungINA;

	/**
	 * The cached value of the '{@link #getWirksamkeit() <em>Wirksamkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWirksamkeit()
	 * @generated
	 * @ordered
	 */
	protected Wirksamkeit_TypeClass wirksamkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_ZuordnungImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_Rangier getIDFstrZugRangier() {
		if (iDFstrZugRangier != null && iDFstrZugRangier.eIsProxy()) {
			InternalEObject oldIDFstrZugRangier = (InternalEObject)iDFstrZugRangier;
			iDFstrZugRangier = (Fstr_Zug_Rangier)eResolveProxy(oldIDFstrZugRangier);
			if (iDFstrZugRangier != oldIDFstrZugRangier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier));
			}
		}
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fstr_Zug_Rangier basicGetIDFstrZugRangier() {
		return iDFstrZugRangier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFstrZugRangier(Fstr_Zug_Rangier newIDFstrZugRangier) {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		iDFstrZugRangier = newIDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangierESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, iDFstrZugRangier, !oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFstrZugRangier() {
		Fstr_Zug_Rangier oldIDFstrZugRangier = iDFstrZugRangier;
		boolean oldIDFstrZugRangierESet = iDFstrZugRangierESet;
		iDFstrZugRangier = null;
		iDFstrZugRangierESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER, oldIDFstrZugRangier, null, oldIDFstrZugRangierESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFstrZugRangier() {
		return iDFstrZugRangierESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDPZBElementBezugspunkt() {
		if (iDPZBElementBezugspunkt != null && iDPZBElementBezugspunkt.eIsProxy()) {
			InternalEObject oldIDPZBElementBezugspunkt = (InternalEObject)iDPZBElementBezugspunkt;
			iDPZBElementBezugspunkt = (Basis_Objekt)eResolveProxy(oldIDPZBElementBezugspunkt);
			if (iDPZBElementBezugspunkt != oldIDPZBElementBezugspunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, oldIDPZBElementBezugspunkt, iDPZBElementBezugspunkt));
			}
		}
		return iDPZBElementBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDPZBElementBezugspunkt() {
		return iDPZBElementBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDPZBElementBezugspunkt(Basis_Objekt newIDPZBElementBezugspunkt) {
		Basis_Objekt oldIDPZBElementBezugspunkt = iDPZBElementBezugspunkt;
		iDPZBElementBezugspunkt = newIDPZBElementBezugspunkt;
		boolean oldIDPZBElementBezugspunktESet = iDPZBElementBezugspunktESet;
		iDPZBElementBezugspunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, oldIDPZBElementBezugspunkt, iDPZBElementBezugspunkt, !oldIDPZBElementBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDPZBElementBezugspunkt() {
		Basis_Objekt oldIDPZBElementBezugspunkt = iDPZBElementBezugspunkt;
		boolean oldIDPZBElementBezugspunktESet = iDPZBElementBezugspunktESet;
		iDPZBElementBezugspunkt = null;
		iDPZBElementBezugspunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT, oldIDPZBElementBezugspunkt, null, oldIDPZBElementBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDPZBElementBezugspunkt() {
		return iDPZBElementBezugspunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZB_Element_Zuordnung_INA_AttributeGroup getPZBElementZuordnungINA() {
		return pZBElementZuordnungINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup newPZBElementZuordnungINA, NotificationChain msgs) {
		PZB_Element_Zuordnung_INA_AttributeGroup oldPZBElementZuordnungINA = pZBElementZuordnungINA;
		pZBElementZuordnungINA = newPZBElementZuordnungINA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, oldPZBElementZuordnungINA, newPZBElementZuordnungINA);
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
	public void setPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup newPZBElementZuordnungINA) {
		if (newPZBElementZuordnungINA != pZBElementZuordnungINA) {
			NotificationChain msgs = null;
			if (pZBElementZuordnungINA != null)
				msgs = ((InternalEObject)pZBElementZuordnungINA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, null, msgs);
			if (newPZBElementZuordnungINA != null)
				msgs = ((InternalEObject)newPZBElementZuordnungINA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, null, msgs);
			msgs = basicSetPZBElementZuordnungINA(newPZBElementZuordnungINA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA, newPZBElementZuordnungINA, newPZBElementZuordnungINA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wirksamkeit_TypeClass getWirksamkeit() {
		return wirksamkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWirksamkeit(Wirksamkeit_TypeClass newWirksamkeit, NotificationChain msgs) {
		Wirksamkeit_TypeClass oldWirksamkeit = wirksamkeit;
		wirksamkeit = newWirksamkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, oldWirksamkeit, newWirksamkeit);
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
	public void setWirksamkeit(Wirksamkeit_TypeClass newWirksamkeit) {
		if (newWirksamkeit != wirksamkeit) {
			NotificationChain msgs = null;
			if (wirksamkeit != null)
				msgs = ((InternalEObject)wirksamkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, null, msgs);
			if (newWirksamkeit != null)
				msgs = ((InternalEObject)newWirksamkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, null, msgs);
			msgs = basicSetWirksamkeit(newWirksamkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT, newWirksamkeit, newWirksamkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				return basicSetPZBElementZuordnungINA(null, msgs);
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				return basicSetWirksamkeit(null, msgs);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				if (resolve) return getIDFstrZugRangier();
				return basicGetIDFstrZugRangier();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				if (resolve) return getIDPZBElementBezugspunkt();
				return basicGetIDPZBElementBezugspunkt();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				return getPZBElementZuordnungINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				return getWirksamkeit();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				setIDFstrZugRangier((Fstr_Zug_Rangier)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				setIDPZBElementBezugspunkt((Basis_Objekt)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				setPZBElementZuordnungINA((PZB_Element_Zuordnung_INA_AttributeGroup)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				setWirksamkeit((Wirksamkeit_TypeClass)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				unsetIDFstrZugRangier();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				unsetIDPZBElementBezugspunkt();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				setPZBElementZuordnungINA((PZB_Element_Zuordnung_INA_AttributeGroup)null);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				setWirksamkeit((Wirksamkeit_TypeClass)null);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__ID_FSTR_ZUG_RANGIER:
				return isSetIDFstrZugRangier();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__IDPZB_ELEMENT_BEZUGSPUNKT:
				return isSetIDPZBElementBezugspunkt();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_INA:
				return pZBElementZuordnungINA != null;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG__WIRKSAMKEIT:
				return wirksamkeit != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Element_ZuordnungImpl
