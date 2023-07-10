/**
 */
package org.eclipse.set.toolboxmodel.PlanPro.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Ur_ObjektImpl;

import org.eclipse.set.toolboxmodel.Layoutinformationen.PlanPro_Layoutinfo;
import org.eclipse.set.toolboxmodel.PlanPro.LST_Planung_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.LST_Zustand;
import org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage;
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Pro Schnittstelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.PlanPro_SchnittstelleImpl#getPlanProSchnittstelleAllg <em>Plan Pro Schnittstelle Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.PlanPro_SchnittstelleImpl#getLSTPlanung <em>LST Planung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.PlanPro_SchnittstelleImpl#getLSTZustand <em>LST Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.PlanPro_SchnittstelleImpl#getWzkInvalidIDReferences <em>Wzk Invalid ID References</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.PlanPro_SchnittstelleImpl#getPlanpro_layoutinfo <em>Planpro layoutinfo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanPro_SchnittstelleImpl extends Ur_ObjektImpl implements PlanPro_Schnittstelle {
	/**
	 * The cached value of the '{@link #getPlanProSchnittstelleAllg() <em>Plan Pro Schnittstelle Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanProSchnittstelleAllg()
	 * @generated
	 * @ordered
	 */
	protected PlanPro_Schnittstelle_Allg_AttributeGroup planProSchnittstelleAllg;

	/**
	 * The cached value of the '{@link #getLSTPlanung() <em>LST Planung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTPlanung()
	 * @generated
	 * @ordered
	 */
	protected LST_Planung_AttributeGroup lSTPlanung;

	/**
	 * The cached value of the '{@link #getLSTZustand() <em>LST Zustand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTZustand()
	 * @generated
	 * @ordered
	 */
	protected LST_Zustand lSTZustand;

	/**
	 * The cached value of the '{@link #getWzkInvalidIDReferences() <em>Wzk Invalid ID References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWzkInvalidIDReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<WzkInvalidIDReference> wzkInvalidIDReferences;

	/**
	 * The cached value of the '{@link #getPlanpro_layoutinfo() <em>Planpro layoutinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanpro_layoutinfo()
	 * @generated
	 * @ordered
	 */
	protected PlanPro_Layoutinfo planpro_layoutinfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanPro_SchnittstelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanPro_Schnittstelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_Schnittstelle_Allg_AttributeGroup getPlanProSchnittstelleAllg() {
		return planProSchnittstelleAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup newPlanProSchnittstelleAllg, NotificationChain msgs) {
		PlanPro_Schnittstelle_Allg_AttributeGroup oldPlanProSchnittstelleAllg = planProSchnittstelleAllg;
		planProSchnittstelleAllg = newPlanProSchnittstelleAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, oldPlanProSchnittstelleAllg, newPlanProSchnittstelleAllg);
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
	public void setPlanProSchnittstelleAllg(PlanPro_Schnittstelle_Allg_AttributeGroup newPlanProSchnittstelleAllg) {
		if (newPlanProSchnittstelleAllg != planProSchnittstelleAllg) {
			NotificationChain msgs = null;
			if (planProSchnittstelleAllg != null)
				msgs = ((InternalEObject)planProSchnittstelleAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, null, msgs);
			if (newPlanProSchnittstelleAllg != null)
				msgs = ((InternalEObject)newPlanProSchnittstelleAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, null, msgs);
			msgs = basicSetPlanProSchnittstelleAllg(newPlanProSchnittstelleAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG, newPlanProSchnittstelleAllg, newPlanProSchnittstelleAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Planung_AttributeGroup getLSTPlanung() {
		return lSTPlanung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTPlanung(LST_Planung_AttributeGroup newLSTPlanung, NotificationChain msgs) {
		LST_Planung_AttributeGroup oldLSTPlanung = lSTPlanung;
		lSTPlanung = newLSTPlanung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, oldLSTPlanung, newLSTPlanung);
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
	public void setLSTPlanung(LST_Planung_AttributeGroup newLSTPlanung) {
		if (newLSTPlanung != lSTPlanung) {
			NotificationChain msgs = null;
			if (lSTPlanung != null)
				msgs = ((InternalEObject)lSTPlanung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, null, msgs);
			if (newLSTPlanung != null)
				msgs = ((InternalEObject)newLSTPlanung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, null, msgs);
			msgs = basicSetLSTPlanung(newLSTPlanung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG, newLSTPlanung, newLSTPlanung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Zustand getLSTZustand() {
		return lSTZustand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTZustand(LST_Zustand newLSTZustand, NotificationChain msgs) {
		LST_Zustand oldLSTZustand = lSTZustand;
		lSTZustand = newLSTZustand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, oldLSTZustand, newLSTZustand);
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
	public void setLSTZustand(LST_Zustand newLSTZustand) {
		if (newLSTZustand != lSTZustand) {
			NotificationChain msgs = null;
			if (lSTZustand != null)
				msgs = ((InternalEObject)lSTZustand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, null, msgs);
			if (newLSTZustand != null)
				msgs = ((InternalEObject)newLSTZustand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, null, msgs);
			msgs = basicSetLSTZustand(newLSTZustand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND, newLSTZustand, newLSTZustand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WzkInvalidIDReference> getWzkInvalidIDReferences() {
		if (wzkInvalidIDReferences == null) {
			wzkInvalidIDReferences = new EObjectContainmentEList<WzkInvalidIDReference>(WzkInvalidIDReference.class, this, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__WZK_INVALID_ID_REFERENCES);
		}
		return wzkInvalidIDReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PlanPro_Layoutinfo getPlanpro_layoutinfo() {
		return planpro_layoutinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanpro_layoutinfo(PlanPro_Layoutinfo newPlanpro_layoutinfo, NotificationChain msgs) {
		PlanPro_Layoutinfo oldPlanpro_layoutinfo = planpro_layoutinfo;
		planpro_layoutinfo = newPlanpro_layoutinfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO, oldPlanpro_layoutinfo, newPlanpro_layoutinfo);
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
	public void setPlanpro_layoutinfo(PlanPro_Layoutinfo newPlanpro_layoutinfo) {
		if (newPlanpro_layoutinfo != planpro_layoutinfo) {
			NotificationChain msgs = null;
			if (planpro_layoutinfo != null)
				msgs = ((InternalEObject)planpro_layoutinfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO, null, msgs);
			if (newPlanpro_layoutinfo != null)
				msgs = ((InternalEObject)newPlanpro_layoutinfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO, null, msgs);
			msgs = basicSetPlanpro_layoutinfo(newPlanpro_layoutinfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO, newPlanpro_layoutinfo, newPlanpro_layoutinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				return basicSetPlanProSchnittstelleAllg(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				return basicSetLSTPlanung(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				return basicSetLSTZustand(null, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__WZK_INVALID_ID_REFERENCES:
				return ((InternalEList<?>)getWzkInvalidIDReferences()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO:
				return basicSetPlanpro_layoutinfo(null, msgs);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				return getPlanProSchnittstelleAllg();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				return getLSTPlanung();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				return getLSTZustand();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__WZK_INVALID_ID_REFERENCES:
				return getWzkInvalidIDReferences();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO:
				return getPlanpro_layoutinfo();
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				setPlanProSchnittstelleAllg((PlanPro_Schnittstelle_Allg_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				setLSTPlanung((LST_Planung_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				setLSTZustand((LST_Zustand)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__WZK_INVALID_ID_REFERENCES:
				getWzkInvalidIDReferences().clear();
				getWzkInvalidIDReferences().addAll((Collection<? extends WzkInvalidIDReference>)newValue);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO:
				setPlanpro_layoutinfo((PlanPro_Layoutinfo)newValue);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				setPlanProSchnittstelleAllg((PlanPro_Schnittstelle_Allg_AttributeGroup)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				setLSTPlanung((LST_Planung_AttributeGroup)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				setLSTZustand((LST_Zustand)null);
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__WZK_INVALID_ID_REFERENCES:
				getWzkInvalidIDReferences().clear();
				return;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO:
				setPlanpro_layoutinfo((PlanPro_Layoutinfo)null);
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
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLAN_PRO_SCHNITTSTELLE_ALLG:
				return planProSchnittstelleAllg != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_PLANUNG:
				return lSTPlanung != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__LST_ZUSTAND:
				return lSTZustand != null;
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__WZK_INVALID_ID_REFERENCES:
				return wzkInvalidIDReferences != null && !wzkInvalidIDReferences.isEmpty();
			case PlanProPackage.PLAN_PRO_SCHNITTSTELLE__PLANPRO_LAYOUTINFO:
				return planpro_layoutinfo != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //PlanPro_SchnittstelleImpl
