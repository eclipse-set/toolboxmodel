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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.DP_Bezug_Betrieblich_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DP Bezug Betrieblich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Bezug_Betrieblich_AttributeGroupImpl#getDPBezugBetrieblichArt <em>DP Bezug Betrieblich Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.DP_Bezug_Betrieblich_AttributeGroupImpl#getIDDPBezugspunkt <em>IDDP Bezugspunkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DP_Bezug_Betrieblich_AttributeGroupImpl extends MinimalEObjectImpl.Container implements DP_Bezug_Betrieblich_AttributeGroup {
	/**
	 * The cached value of the '{@link #getDPBezugBetrieblichArt() <em>DP Bezug Betrieblich Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDPBezugBetrieblichArt()
	 * @generated
	 * @ordered
	 */
	protected DP_Bezug_Betrieblich_Art_TypeClass dPBezugBetrieblichArt;

	/**
	 * The cached value of the '{@link #getIDDPBezugspunkt() <em>IDDP Bezugspunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDDPBezugspunkt()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDDPBezugspunkt;

	/**
	 * This is true if the IDDP Bezugspunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDDPBezugspunktESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DP_Bezug_Betrieblich_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getDP_Bezug_Betrieblich_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DP_Bezug_Betrieblich_Art_TypeClass getDPBezugBetrieblichArt() {
		return dPBezugBetrieblichArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass newDPBezugBetrieblichArt, NotificationChain msgs) {
		DP_Bezug_Betrieblich_Art_TypeClass oldDPBezugBetrieblichArt = dPBezugBetrieblichArt;
		dPBezugBetrieblichArt = newDPBezugBetrieblichArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, oldDPBezugBetrieblichArt, newDPBezugBetrieblichArt);
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
	public void setDPBezugBetrieblichArt(DP_Bezug_Betrieblich_Art_TypeClass newDPBezugBetrieblichArt) {
		if (newDPBezugBetrieblichArt != dPBezugBetrieblichArt) {
			NotificationChain msgs = null;
			if (dPBezugBetrieblichArt != null)
				msgs = ((InternalEObject)dPBezugBetrieblichArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, null, msgs);
			if (newDPBezugBetrieblichArt != null)
				msgs = ((InternalEObject)newDPBezugBetrieblichArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, null, msgs);
			msgs = basicSetDPBezugBetrieblichArt(newDPBezugBetrieblichArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART, newDPBezugBetrieblichArt, newDPBezugBetrieblichArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDDPBezugspunkt() {
		if (iDDPBezugspunkt != null && iDDPBezugspunkt.eIsProxy()) {
			InternalEObject oldIDDPBezugspunkt = (InternalEObject)iDDPBezugspunkt;
			iDDPBezugspunkt = (Basis_Objekt)eResolveProxy(oldIDDPBezugspunkt);
			if (iDDPBezugspunkt != oldIDDPBezugspunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, oldIDDPBezugspunkt, iDDPBezugspunkt));
			}
		}
		return iDDPBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDDPBezugspunkt() {
		return iDDPBezugspunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDDPBezugspunkt(Basis_Objekt newIDDPBezugspunkt) {
		Basis_Objekt oldIDDPBezugspunkt = iDDPBezugspunkt;
		iDDPBezugspunkt = newIDDPBezugspunkt;
		boolean oldIDDPBezugspunktESet = iDDPBezugspunktESet;
		iDDPBezugspunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, oldIDDPBezugspunkt, iDDPBezugspunkt, !oldIDDPBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDDPBezugspunkt() {
		Basis_Objekt oldIDDPBezugspunkt = iDDPBezugspunkt;
		boolean oldIDDPBezugspunktESet = iDDPBezugspunktESet;
		iDDPBezugspunkt = null;
		iDDPBezugspunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT, oldIDDPBezugspunkt, null, oldIDDPBezugspunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDDPBezugspunkt() {
		return iDDPBezugspunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				return basicSetDPBezugBetrieblichArt(null, msgs);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				return getDPBezugBetrieblichArt();
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				if (resolve) return getIDDPBezugspunkt();
				return basicGetIDDPBezugspunkt();
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				setDPBezugBetrieblichArt((DP_Bezug_Betrieblich_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				setIDDPBezugspunkt((Basis_Objekt)newValue);
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				setDPBezugBetrieblichArt((DP_Bezug_Betrieblich_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				unsetIDDPBezugspunkt();
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
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__DP_BEZUG_BETRIEBLICH_ART:
				return dPBezugBetrieblichArt != null;
			case Balisentechnik_ETCSPackage.DP_BEZUG_BETRIEBLICH_ATTRIBUTE_GROUP__IDDP_BEZUGSPUNKT:
				return isSetIDDPBezugspunkt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //DP_Bezug_Betrieblich_AttributeGroupImpl
