/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Punkt;
import org.eclipse.set.toolboxmodel.Geodaten.Strecke_Punkt;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_ZBS;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN Unterstation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getIDZNZBS <em>IDZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZN_UnterstationImpl#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZN_UnterstationImpl extends Basis_ObjektImpl implements ZN_Unterstation {
	/**
	 * The cached value of the '{@link #getIDGEOPunkt() <em>IDGEO Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOPunkt()
	 * @generated
	 * @ordered
	 */
	protected GEO_Punkt iDGEOPunkt;

	/**
	 * This is true if the IDGEO Punkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOPunktESet;

	/**
	 * The cached value of the '{@link #getIDStreckePunkt() <em>ID Strecke Punkt</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStreckePunkt()
	 * @generated
	 * @ordered
	 */
	protected EList<Strecke_Punkt> iDStreckePunkt;

	/**
	 * The cached value of the '{@link #getIDZNZBS() <em>IDZNZBS</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNZBS()
	 * @generated
	 * @ordered
	 */
	protected ZN_ZBS iDZNZBS;

	/**
	 * This is true if the IDZNZBS reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNZBSESet;

	/**
	 * The cached value of the '{@link #getZNUnterstationAllg() <em>ZN Unterstation Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNUnterstationAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Unterstation_Allg_AttributeGroup zNUnterstationAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZN_UnterstationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN_UNTERSTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Punkt getIDGEOPunkt() {
		if (iDGEOPunkt != null && iDGEOPunkt.eIsProxy()) {
			InternalEObject oldIDGEOPunkt = (InternalEObject)iDGEOPunkt;
			iDGEOPunkt = (GEO_Punkt)eResolveProxy(oldIDGEOPunkt);
			if (iDGEOPunkt != oldIDGEOPunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, oldIDGEOPunkt, iDGEOPunkt));
			}
		}
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEO_Punkt basicGetIDGEOPunkt() {
		return iDGEOPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOPunkt(GEO_Punkt newIDGEOPunkt) {
		GEO_Punkt oldIDGEOPunkt = iDGEOPunkt;
		iDGEOPunkt = newIDGEOPunkt;
		boolean oldIDGEOPunktESet = iDGEOPunktESet;
		iDGEOPunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, oldIDGEOPunkt, iDGEOPunkt, !oldIDGEOPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOPunkt() {
		GEO_Punkt oldIDGEOPunkt = iDGEOPunkt;
		boolean oldIDGEOPunktESet = iDGEOPunktESet;
		iDGEOPunkt = null;
		iDGEOPunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT, oldIDGEOPunkt, null, oldIDGEOPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOPunkt() {
		return iDGEOPunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Strecke_Punkt> getIDStreckePunkt() {
		if (iDStreckePunkt == null) {
			iDStreckePunkt = new EObjectResolvingEList<Strecke_Punkt>(Strecke_Punkt.class, this, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT);
		}
		return iDStreckePunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_ZBS getIDZNZBS() {
		if (iDZNZBS != null && iDZNZBS.eIsProxy()) {
			InternalEObject oldIDZNZBS = (InternalEObject)iDZNZBS;
			iDZNZBS = (ZN_ZBS)eResolveProxy(oldIDZNZBS);
			if (iDZNZBS != oldIDZNZBS) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, iDZNZBS));
			}
		}
		return iDZNZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_ZBS basicGetIDZNZBS() {
		return iDZNZBS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNZBS(ZN_ZBS newIDZNZBS) {
		ZN_ZBS oldIDZNZBS = iDZNZBS;
		iDZNZBS = newIDZNZBS;
		boolean oldIDZNZBSESet = iDZNZBSESet;
		iDZNZBSESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, iDZNZBS, !oldIDZNZBSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNZBS() {
		ZN_ZBS oldIDZNZBS = iDZNZBS;
		boolean oldIDZNZBSESet = iDZNZBSESet;
		iDZNZBS = null;
		iDZNZBSESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS, oldIDZNZBS, null, oldIDZNZBSESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNZBS() {
		return iDZNZBSESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation_Allg_AttributeGroup getZNUnterstationAllg() {
		return zNUnterstationAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup newZNUnterstationAllg, NotificationChain msgs) {
		ZN_Unterstation_Allg_AttributeGroup oldZNUnterstationAllg = zNUnterstationAllg;
		zNUnterstationAllg = newZNUnterstationAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, oldZNUnterstationAllg, newZNUnterstationAllg);
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
	public void setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup newZNUnterstationAllg) {
		if (newZNUnterstationAllg != zNUnterstationAllg) {
			NotificationChain msgs = null;
			if (zNUnterstationAllg != null)
				msgs = ((InternalEObject)zNUnterstationAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, null, msgs);
			if (newZNUnterstationAllg != null)
				msgs = ((InternalEObject)newZNUnterstationAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, null, msgs);
			msgs = basicSetZNUnterstationAllg(newZNUnterstationAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG, newZNUnterstationAllg, newZNUnterstationAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return basicSetZNUnterstationAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				if (resolve) return getIDGEOPunkt();
				return basicGetIDGEOPunkt();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				return getIDStreckePunkt();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				if (resolve) return getIDZNZBS();
				return basicGetIDZNZBS();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return getZNUnterstationAllg();
			default:
				return super.eGet(featureID, resolve, coreType);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				setIDGEOPunkt((GEO_Punkt)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				getIDStreckePunkt().addAll((Collection<? extends Strecke_Punkt>)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				setIDZNZBS((ZN_ZBS)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				setZNUnterstationAllg((ZN_Unterstation_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				unsetIDGEOPunkt();
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				getIDStreckePunkt().clear();
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				unsetIDZNZBS();
				return;
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				setZNUnterstationAllg((ZN_Unterstation_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDGEO_PUNKT:
				return isSetIDGEOPunkt();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ID_STRECKE_PUNKT:
				return iDStreckePunkt != null && !iDStreckePunkt.isEmpty();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__IDZNZBS:
				return isSetIDZNZBS();
			case ZugnummernmeldeanlagePackage.ZN_UNTERSTATION__ZN_UNTERSTATION_ALLG:
				return zNUnterstationAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZN_UnterstationImpl
