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

import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Ur_ObjektImpl;
import org.eclipse.set.toolboxmodel.PlanPro.Ausgabe_Fachdaten;
import org.eclipse.set.toolboxmodel.PlanPro.LST_Objekte_Planungsbereich_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage;
import org.eclipse.set.toolboxmodel.PlanPro.Planung_E_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.Planung_E_Handlung_AttributeGroup;
import org.eclipse.set.toolboxmodel.PlanPro.Planung_Einzel;
import org.eclipse.set.toolboxmodel.PlanPro.Referenz_Planung_Basis_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Planung Einzel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getAnhangErlaeuterungsbericht <em>Anhang Erlaeuterungsbericht</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getAnhangMaterialBesonders <em>Anhang Material Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getAnhangVzG <em>Anhang Vz G</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getIDAusgabeFachdaten <em>ID Ausgabe Fachdaten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getLSTObjektePlanungsbereich <em>LST Objekte Planungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getPlanungEAllg <em>Planung EAllg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getPlanungEAusgabeBesonders <em>Planung EAusgabe Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getPlanungEHandlung <em>Planung EHandlung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PlanPro.impl.Planung_EinzelImpl#getReferenzPlanungBasis <em>Referenz Planung Basis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Planung_EinzelImpl extends Ur_ObjektImpl implements Planung_Einzel {
	/**
	 * The cached value of the '{@link #getAnhangErlaeuterungsbericht() <em>Anhang Erlaeuterungsbericht</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangErlaeuterungsbericht()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhangErlaeuterungsbericht;

	/**
	 * The cached value of the '{@link #getAnhangMaterialBesonders() <em>Anhang Material Besonders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangMaterialBesonders()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhangMaterialBesonders;

	/**
	 * The cached value of the '{@link #getAnhangVzG() <em>Anhang Vz G</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnhangVzG()
	 * @generated
	 * @ordered
	 */
	protected EList<Anhang> anhangVzG;

	/**
	 * The cached value of the '{@link #getIDAusgabeFachdaten() <em>ID Ausgabe Fachdaten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAusgabeFachdaten()
	 * @generated
	 * @ordered
	 */
	protected Ausgabe_Fachdaten iDAusgabeFachdaten;

	/**
	 * This is true if the ID Ausgabe Fachdaten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAusgabeFachdatenESet;

	/**
	 * The cached value of the '{@link #getLSTObjektePlanungsbereich() <em>LST Objekte Planungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLSTObjektePlanungsbereich()
	 * @generated
	 * @ordered
	 */
	protected LST_Objekte_Planungsbereich_AttributeGroup lSTObjektePlanungsbereich;

	/**
	 * The cached value of the '{@link #getPlanungEAllg() <em>Planung EAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEAllg()
	 * @generated
	 * @ordered
	 */
	protected Planung_E_Allg_AttributeGroup planungEAllg;

	/**
	 * The cached value of the '{@link #getPlanungEAusgabeBesonders() <em>Planung EAusgabe Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEAusgabeBesonders()
	 * @generated
	 * @ordered
	 */
	protected Planung_E_Ausgabe_Besonders_AttributeGroup planungEAusgabeBesonders;

	/**
	 * The cached value of the '{@link #getPlanungEHandlung() <em>Planung EHandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanungEHandlung()
	 * @generated
	 * @ordered
	 */
	protected Planung_E_Handlung_AttributeGroup planungEHandlung;

	/**
	 * The cached value of the '{@link #getReferenzPlanungBasis() <em>Referenz Planung Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenzPlanungBasis()
	 * @generated
	 * @ordered
	 */
	protected Referenz_Planung_Basis_TypeClass referenzPlanungBasis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Planung_EinzelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlanProPackage.eINSTANCE.getPlanung_Einzel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhangErlaeuterungsbericht() {
		if (anhangErlaeuterungsbericht == null) {
			anhangErlaeuterungsbericht = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT);
		}
		return anhangErlaeuterungsbericht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhangMaterialBesonders() {
		if (anhangMaterialBesonders == null) {
			anhangMaterialBesonders = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS);
		}
		return anhangMaterialBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anhang> getAnhangVzG() {
		if (anhangVzG == null) {
			anhangVzG = new EObjectContainmentEList<Anhang>(Anhang.class, this, PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G);
		}
		return anhangVzG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ausgabe_Fachdaten getIDAusgabeFachdaten() {
		if (iDAusgabeFachdaten != null && iDAusgabeFachdaten.eIsProxy()) {
			InternalEObject oldIDAusgabeFachdaten = (InternalEObject)iDAusgabeFachdaten;
			iDAusgabeFachdaten = (Ausgabe_Fachdaten)eResolveProxy(oldIDAusgabeFachdaten);
			if (iDAusgabeFachdaten != oldIDAusgabeFachdaten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN, oldIDAusgabeFachdaten, iDAusgabeFachdaten));
			}
		}
		return iDAusgabeFachdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ausgabe_Fachdaten basicGetIDAusgabeFachdaten() {
		return iDAusgabeFachdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAusgabeFachdaten(Ausgabe_Fachdaten newIDAusgabeFachdaten) {
		Ausgabe_Fachdaten oldIDAusgabeFachdaten = iDAusgabeFachdaten;
		iDAusgabeFachdaten = newIDAusgabeFachdaten;
		boolean oldIDAusgabeFachdatenESet = iDAusgabeFachdatenESet;
		iDAusgabeFachdatenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN, oldIDAusgabeFachdaten, iDAusgabeFachdaten, !oldIDAusgabeFachdatenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAusgabeFachdaten() {
		Ausgabe_Fachdaten oldIDAusgabeFachdaten = iDAusgabeFachdaten;
		boolean oldIDAusgabeFachdatenESet = iDAusgabeFachdatenESet;
		iDAusgabeFachdaten = null;
		iDAusgabeFachdatenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN, oldIDAusgabeFachdaten, null, oldIDAusgabeFachdatenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAusgabeFachdaten() {
		return iDAusgabeFachdatenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LST_Objekte_Planungsbereich_AttributeGroup getLSTObjektePlanungsbereich() {
		return lSTObjektePlanungsbereich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLSTObjektePlanungsbereich(LST_Objekte_Planungsbereich_AttributeGroup newLSTObjektePlanungsbereich, NotificationChain msgs) {
		LST_Objekte_Planungsbereich_AttributeGroup oldLSTObjektePlanungsbereich = lSTObjektePlanungsbereich;
		lSTObjektePlanungsbereich = newLSTObjektePlanungsbereich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH, oldLSTObjektePlanungsbereich, newLSTObjektePlanungsbereich);
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
	public void setLSTObjektePlanungsbereich(LST_Objekte_Planungsbereich_AttributeGroup newLSTObjektePlanungsbereich) {
		if (newLSTObjektePlanungsbereich != lSTObjektePlanungsbereich) {
			NotificationChain msgs = null;
			if (lSTObjektePlanungsbereich != null)
				msgs = ((InternalEObject)lSTObjektePlanungsbereich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH, null, msgs);
			if (newLSTObjektePlanungsbereich != null)
				msgs = ((InternalEObject)newLSTObjektePlanungsbereich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH, null, msgs);
			msgs = basicSetLSTObjektePlanungsbereich(newLSTObjektePlanungsbereich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH, newLSTObjektePlanungsbereich, newLSTObjektePlanungsbereich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Allg_AttributeGroup getPlanungEAllg() {
		return planungEAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungEAllg(Planung_E_Allg_AttributeGroup newPlanungEAllg, NotificationChain msgs) {
		Planung_E_Allg_AttributeGroup oldPlanungEAllg = planungEAllg;
		planungEAllg = newPlanungEAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG, oldPlanungEAllg, newPlanungEAllg);
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
	public void setPlanungEAllg(Planung_E_Allg_AttributeGroup newPlanungEAllg) {
		if (newPlanungEAllg != planungEAllg) {
			NotificationChain msgs = null;
			if (planungEAllg != null)
				msgs = ((InternalEObject)planungEAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG, null, msgs);
			if (newPlanungEAllg != null)
				msgs = ((InternalEObject)newPlanungEAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG, null, msgs);
			msgs = basicSetPlanungEAllg(newPlanungEAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG, newPlanungEAllg, newPlanungEAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Ausgabe_Besonders_AttributeGroup getPlanungEAusgabeBesonders() {
		return planungEAusgabeBesonders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungEAusgabeBesonders(Planung_E_Ausgabe_Besonders_AttributeGroup newPlanungEAusgabeBesonders, NotificationChain msgs) {
		Planung_E_Ausgabe_Besonders_AttributeGroup oldPlanungEAusgabeBesonders = planungEAusgabeBesonders;
		planungEAusgabeBesonders = newPlanungEAusgabeBesonders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS, oldPlanungEAusgabeBesonders, newPlanungEAusgabeBesonders);
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
	public void setPlanungEAusgabeBesonders(Planung_E_Ausgabe_Besonders_AttributeGroup newPlanungEAusgabeBesonders) {
		if (newPlanungEAusgabeBesonders != planungEAusgabeBesonders) {
			NotificationChain msgs = null;
			if (planungEAusgabeBesonders != null)
				msgs = ((InternalEObject)planungEAusgabeBesonders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS, null, msgs);
			if (newPlanungEAusgabeBesonders != null)
				msgs = ((InternalEObject)newPlanungEAusgabeBesonders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS, null, msgs);
			msgs = basicSetPlanungEAusgabeBesonders(newPlanungEAusgabeBesonders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS, newPlanungEAusgabeBesonders, newPlanungEAusgabeBesonders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Planung_E_Handlung_AttributeGroup getPlanungEHandlung() {
		return planungEHandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanungEHandlung(Planung_E_Handlung_AttributeGroup newPlanungEHandlung, NotificationChain msgs) {
		Planung_E_Handlung_AttributeGroup oldPlanungEHandlung = planungEHandlung;
		planungEHandlung = newPlanungEHandlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG, oldPlanungEHandlung, newPlanungEHandlung);
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
	public void setPlanungEHandlung(Planung_E_Handlung_AttributeGroup newPlanungEHandlung) {
		if (newPlanungEHandlung != planungEHandlung) {
			NotificationChain msgs = null;
			if (planungEHandlung != null)
				msgs = ((InternalEObject)planungEHandlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG, null, msgs);
			if (newPlanungEHandlung != null)
				msgs = ((InternalEObject)newPlanungEHandlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG, null, msgs);
			msgs = basicSetPlanungEHandlung(newPlanungEHandlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG, newPlanungEHandlung, newPlanungEHandlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Referenz_Planung_Basis_TypeClass getReferenzPlanungBasis() {
		return referenzPlanungBasis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenzPlanungBasis(Referenz_Planung_Basis_TypeClass newReferenzPlanungBasis, NotificationChain msgs) {
		Referenz_Planung_Basis_TypeClass oldReferenzPlanungBasis = referenzPlanungBasis;
		referenzPlanungBasis = newReferenzPlanungBasis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS, oldReferenzPlanungBasis, newReferenzPlanungBasis);
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
	public void setReferenzPlanungBasis(Referenz_Planung_Basis_TypeClass newReferenzPlanungBasis) {
		if (newReferenzPlanungBasis != referenzPlanungBasis) {
			NotificationChain msgs = null;
			if (referenzPlanungBasis != null)
				msgs = ((InternalEObject)referenzPlanungBasis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS, null, msgs);
			if (newReferenzPlanungBasis != null)
				msgs = ((InternalEObject)newReferenzPlanungBasis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS, null, msgs);
			msgs = basicSetReferenzPlanungBasis(newReferenzPlanungBasis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS, newReferenzPlanungBasis, newReferenzPlanungBasis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT:
				return ((InternalEList<?>)getAnhangErlaeuterungsbericht()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS:
				return ((InternalEList<?>)getAnhangMaterialBesonders()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G:
				return ((InternalEList<?>)getAnhangVzG()).basicRemove(otherEnd, msgs);
			case PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH:
				return basicSetLSTObjektePlanungsbereich(null, msgs);
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG:
				return basicSetPlanungEAllg(null, msgs);
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS:
				return basicSetPlanungEAusgabeBesonders(null, msgs);
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG:
				return basicSetPlanungEHandlung(null, msgs);
			case PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS:
				return basicSetReferenzPlanungBasis(null, msgs);
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
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT:
				return getAnhangErlaeuterungsbericht();
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS:
				return getAnhangMaterialBesonders();
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G:
				return getAnhangVzG();
			case PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN:
				if (resolve) return getIDAusgabeFachdaten();
				return basicGetIDAusgabeFachdaten();
			case PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH:
				return getLSTObjektePlanungsbereich();
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG:
				return getPlanungEAllg();
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS:
				return getPlanungEAusgabeBesonders();
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG:
				return getPlanungEHandlung();
			case PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS:
				return getReferenzPlanungBasis();
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
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT:
				getAnhangErlaeuterungsbericht().clear();
				getAnhangErlaeuterungsbericht().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS:
				getAnhangMaterialBesonders().clear();
				getAnhangMaterialBesonders().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G:
				getAnhangVzG().clear();
				getAnhangVzG().addAll((Collection<? extends Anhang>)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN:
				setIDAusgabeFachdaten((Ausgabe_Fachdaten)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH:
				setLSTObjektePlanungsbereich((LST_Objekte_Planungsbereich_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG:
				setPlanungEAllg((Planung_E_Allg_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS:
				setPlanungEAusgabeBesonders((Planung_E_Ausgabe_Besonders_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG:
				setPlanungEHandlung((Planung_E_Handlung_AttributeGroup)newValue);
				return;
			case PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS:
				setReferenzPlanungBasis((Referenz_Planung_Basis_TypeClass)newValue);
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
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT:
				getAnhangErlaeuterungsbericht().clear();
				return;
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS:
				getAnhangMaterialBesonders().clear();
				return;
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G:
				getAnhangVzG().clear();
				return;
			case PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN:
				unsetIDAusgabeFachdaten();
				return;
			case PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH:
				setLSTObjektePlanungsbereich((LST_Objekte_Planungsbereich_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG:
				setPlanungEAllg((Planung_E_Allg_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS:
				setPlanungEAusgabeBesonders((Planung_E_Ausgabe_Besonders_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG:
				setPlanungEHandlung((Planung_E_Handlung_AttributeGroup)null);
				return;
			case PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS:
				setReferenzPlanungBasis((Referenz_Planung_Basis_TypeClass)null);
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
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT:
				return anhangErlaeuterungsbericht != null && !anhangErlaeuterungsbericht.isEmpty();
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS:
				return anhangMaterialBesonders != null && !anhangMaterialBesonders.isEmpty();
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G:
				return anhangVzG != null && !anhangVzG.isEmpty();
			case PlanProPackage.PLANUNG_EINZEL__ID_AUSGABE_FACHDATEN:
				return isSetIDAusgabeFachdaten();
			case PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH:
				return lSTObjektePlanungsbereich != null;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG:
				return planungEAllg != null;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS:
				return planungEAusgabeBesonders != null;
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG:
				return planungEHandlung != null;
			case PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS:
				return referenzPlanungBasis != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Planung_EinzelImpl
