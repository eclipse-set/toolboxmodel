/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Unterstation;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getIDStellwerk <em>ID Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.impl.ZNImpl#getZNAllg <em>ZN Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZNImpl extends Basis_ObjektImpl implements ZN {
	/**
	 * The cached value of the '{@link #getIDAnhangZNPlanBedienraum() <em>ID Anhang ZN Plan Bedienraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangZNPlanBedienraum()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangZNPlanBedienraum;

	/**
	 * This is true if the ID Anhang ZN Plan Bedienraum reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangZNPlanBedienraumESet;

	/**
	 * The cached value of the '{@link #getIDAnhangZNPlanRechnerraum() <em>ID Anhang ZN Plan Rechnerraum</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangZNPlanRechnerraum()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangZNPlanRechnerraum;

	/**
	 * This is true if the ID Anhang ZN Plan Rechnerraum reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangZNPlanRechnerraumESet;

	/**
	 * The cached value of the '{@link #getIDOertlichkeit() <em>ID Oertlichkeit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeit()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeit;

	/**
	 * This is true if the ID Oertlichkeit reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitESet;

	/**
	 * The cached value of the '{@link #getIDStellwerk() <em>ID Stellwerk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellwerk()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDStellwerk;

	/**
	 * This is true if the ID Stellwerk reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStellwerkESet;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected Unterbringung iDUnterbringung;

	/**
	 * This is true if the ID Unterbringung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUnterbringungESet;

	/**
	 * The cached value of the '{@link #getIDZNUnterstation() <em>IDZN Unterstation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZNUnterstation()
	 * @generated
	 * @ordered
	 */
	protected ZN_Unterstation iDZNUnterstation;

	/**
	 * This is true if the IDZN Unterstation reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZNUnterstationESet;

	/**
	 * The cached value of the '{@link #getZNAllg() <em>ZN Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZNAllg()
	 * @generated
	 * @ordered
	 */
	protected ZN_Allg_AttributeGroup zNAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZugnummernmeldeanlagePackage.Literals.ZN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangZNPlanBedienraum() {
		if (iDAnhangZNPlanBedienraum != null && iDAnhangZNPlanBedienraum.eIsProxy()) {
			InternalEObject oldIDAnhangZNPlanBedienraum = (InternalEObject)iDAnhangZNPlanBedienraum;
			iDAnhangZNPlanBedienraum = (Anhang)eResolveProxy(oldIDAnhangZNPlanBedienraum);
			if (iDAnhangZNPlanBedienraum != oldIDAnhangZNPlanBedienraum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, oldIDAnhangZNPlanBedienraum, iDAnhangZNPlanBedienraum));
			}
		}
		return iDAnhangZNPlanBedienraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangZNPlanBedienraum() {
		return iDAnhangZNPlanBedienraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangZNPlanBedienraum(Anhang newIDAnhangZNPlanBedienraum) {
		Anhang oldIDAnhangZNPlanBedienraum = iDAnhangZNPlanBedienraum;
		iDAnhangZNPlanBedienraum = newIDAnhangZNPlanBedienraum;
		boolean oldIDAnhangZNPlanBedienraumESet = iDAnhangZNPlanBedienraumESet;
		iDAnhangZNPlanBedienraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, oldIDAnhangZNPlanBedienraum, iDAnhangZNPlanBedienraum, !oldIDAnhangZNPlanBedienraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangZNPlanBedienraum() {
		Anhang oldIDAnhangZNPlanBedienraum = iDAnhangZNPlanBedienraum;
		boolean oldIDAnhangZNPlanBedienraumESet = iDAnhangZNPlanBedienraumESet;
		iDAnhangZNPlanBedienraum = null;
		iDAnhangZNPlanBedienraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM, oldIDAnhangZNPlanBedienraum, null, oldIDAnhangZNPlanBedienraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangZNPlanBedienraum() {
		return iDAnhangZNPlanBedienraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangZNPlanRechnerraum() {
		if (iDAnhangZNPlanRechnerraum != null && iDAnhangZNPlanRechnerraum.eIsProxy()) {
			InternalEObject oldIDAnhangZNPlanRechnerraum = (InternalEObject)iDAnhangZNPlanRechnerraum;
			iDAnhangZNPlanRechnerraum = (Anhang)eResolveProxy(oldIDAnhangZNPlanRechnerraum);
			if (iDAnhangZNPlanRechnerraum != oldIDAnhangZNPlanRechnerraum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, oldIDAnhangZNPlanRechnerraum, iDAnhangZNPlanRechnerraum));
			}
		}
		return iDAnhangZNPlanRechnerraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangZNPlanRechnerraum() {
		return iDAnhangZNPlanRechnerraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangZNPlanRechnerraum(Anhang newIDAnhangZNPlanRechnerraum) {
		Anhang oldIDAnhangZNPlanRechnerraum = iDAnhangZNPlanRechnerraum;
		iDAnhangZNPlanRechnerraum = newIDAnhangZNPlanRechnerraum;
		boolean oldIDAnhangZNPlanRechnerraumESet = iDAnhangZNPlanRechnerraumESet;
		iDAnhangZNPlanRechnerraumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, oldIDAnhangZNPlanRechnerraum, iDAnhangZNPlanRechnerraum, !oldIDAnhangZNPlanRechnerraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangZNPlanRechnerraum() {
		Anhang oldIDAnhangZNPlanRechnerraum = iDAnhangZNPlanRechnerraum;
		boolean oldIDAnhangZNPlanRechnerraumESet = iDAnhangZNPlanRechnerraumESet;
		iDAnhangZNPlanRechnerraum = null;
		iDAnhangZNPlanRechnerraumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM, oldIDAnhangZNPlanRechnerraum, null, oldIDAnhangZNPlanRechnerraumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangZNPlanRechnerraum() {
		return iDAnhangZNPlanRechnerraumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeit() {
		if (iDOertlichkeit != null && iDOertlichkeit.eIsProxy()) {
			InternalEObject oldIDOertlichkeit = (InternalEObject)iDOertlichkeit;
			iDOertlichkeit = (Oertlichkeit)eResolveProxy(oldIDOertlichkeit);
			if (iDOertlichkeit != oldIDOertlichkeit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit));
			}
		}
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeit() {
		return iDOertlichkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeit(Oertlichkeit newIDOertlichkeit) {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		iDOertlichkeit = newIDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, oldIDOertlichkeit, iDOertlichkeit, !oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeit() {
		Oertlichkeit oldIDOertlichkeit = iDOertlichkeit;
		boolean oldIDOertlichkeitESet = iDOertlichkeitESet;
		iDOertlichkeit = null;
		iDOertlichkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT, oldIDOertlichkeit, null, oldIDOertlichkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeit() {
		return iDOertlichkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDStellwerk() {
		if (iDStellwerk != null && iDStellwerk.eIsProxy()) {
			InternalEObject oldIDStellwerk = (InternalEObject)iDStellwerk;
			iDStellwerk = (Basis_Objekt)eResolveProxy(oldIDStellwerk);
			if (iDStellwerk != oldIDStellwerk) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, oldIDStellwerk, iDStellwerk));
			}
		}
		return iDStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDStellwerk() {
		return iDStellwerk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStellwerk(Basis_Objekt newIDStellwerk) {
		Basis_Objekt oldIDStellwerk = iDStellwerk;
		iDStellwerk = newIDStellwerk;
		boolean oldIDStellwerkESet = iDStellwerkESet;
		iDStellwerkESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, oldIDStellwerk, iDStellwerk, !oldIDStellwerkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStellwerk() {
		Basis_Objekt oldIDStellwerk = iDStellwerk;
		boolean oldIDStellwerkESet = iDStellwerkESet;
		iDStellwerk = null;
		iDStellwerkESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK, oldIDStellwerk, null, oldIDStellwerkESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStellwerk() {
		return iDStellwerkESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Unterbringung getIDUnterbringung() {
		if (iDUnterbringung != null && iDUnterbringung.eIsProxy()) {
			InternalEObject oldIDUnterbringung = (InternalEObject)iDUnterbringung;
			iDUnterbringung = (Unterbringung)eResolveProxy(oldIDUnterbringung);
			if (iDUnterbringung != oldIDUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
			}
		}
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unterbringung basicGetIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUnterbringung(Unterbringung newIDUnterbringung) {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUnterbringung() {
		Unterbringung oldIDUnterbringung = iDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringung = null;
		iDUnterbringungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDUnterbringung() {
		return iDUnterbringungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Unterstation getIDZNUnterstation() {
		if (iDZNUnterstation != null && iDZNUnterstation.eIsProxy()) {
			InternalEObject oldIDZNUnterstation = (InternalEObject)iDZNUnterstation;
			iDZNUnterstation = (ZN_Unterstation)eResolveProxy(oldIDZNUnterstation);
			if (iDZNUnterstation != oldIDZNUnterstation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, oldIDZNUnterstation, iDZNUnterstation));
			}
		}
		return iDZNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_Unterstation basicGetIDZNUnterstation() {
		return iDZNUnterstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZNUnterstation(ZN_Unterstation newIDZNUnterstation) {
		ZN_Unterstation oldIDZNUnterstation = iDZNUnterstation;
		iDZNUnterstation = newIDZNUnterstation;
		boolean oldIDZNUnterstationESet = iDZNUnterstationESet;
		iDZNUnterstationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, oldIDZNUnterstation, iDZNUnterstation, !oldIDZNUnterstationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZNUnterstation() {
		ZN_Unterstation oldIDZNUnterstation = iDZNUnterstation;
		boolean oldIDZNUnterstationESet = iDZNUnterstationESet;
		iDZNUnterstation = null;
		iDZNUnterstationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION, oldIDZNUnterstation, null, oldIDZNUnterstationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZNUnterstation() {
		return iDZNUnterstationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZN_Allg_AttributeGroup getZNAllg() {
		return zNAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZNAllg(ZN_Allg_AttributeGroup newZNAllg, NotificationChain msgs) {
		ZN_Allg_AttributeGroup oldZNAllg = zNAllg;
		zNAllg = newZNAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, oldZNAllg, newZNAllg);
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
	public void setZNAllg(ZN_Allg_AttributeGroup newZNAllg) {
		if (newZNAllg != zNAllg) {
			NotificationChain msgs = null;
			if (zNAllg != null)
				msgs = ((InternalEObject)zNAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, null, msgs);
			if (newZNAllg != null)
				msgs = ((InternalEObject)newZNAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, null, msgs);
			msgs = basicSetZNAllg(newZNAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZugnummernmeldeanlagePackage.ZN__ZN_ALLG, newZNAllg, newZNAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				return basicSetZNAllg(null, msgs);
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				if (resolve) return getIDAnhangZNPlanBedienraum();
				return basicGetIDAnhangZNPlanBedienraum();
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				if (resolve) return getIDAnhangZNPlanRechnerraum();
				return basicGetIDAnhangZNPlanRechnerraum();
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				if (resolve) return getIDOertlichkeit();
				return basicGetIDOertlichkeit();
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				if (resolve) return getIDStellwerk();
				return basicGetIDStellwerk();
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				if (resolve) return getIDZNUnterstation();
				return basicGetIDZNUnterstation();
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				return getZNAllg();
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				setIDAnhangZNPlanBedienraum((Anhang)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				setIDAnhangZNPlanRechnerraum((Anhang)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				setIDOertlichkeit((Oertlichkeit)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				setIDStellwerk((Basis_Objekt)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				setIDZNUnterstation((ZN_Unterstation)newValue);
				return;
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				setZNAllg((ZN_Allg_AttributeGroup)newValue);
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				unsetIDAnhangZNPlanBedienraum();
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				unsetIDAnhangZNPlanRechnerraum();
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				unsetIDOertlichkeit();
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				unsetIDStellwerk();
				return;
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				unsetIDZNUnterstation();
				return;
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				setZNAllg((ZN_Allg_AttributeGroup)null);
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
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_BEDIENRAUM:
				return isSetIDAnhangZNPlanBedienraum();
			case ZugnummernmeldeanlagePackage.ZN__ID_ANHANG_ZN_PLAN_RECHNERRAUM:
				return isSetIDAnhangZNPlanRechnerraum();
			case ZugnummernmeldeanlagePackage.ZN__ID_OERTLICHKEIT:
				return isSetIDOertlichkeit();
			case ZugnummernmeldeanlagePackage.ZN__ID_STELLWERK:
				return isSetIDStellwerk();
			case ZugnummernmeldeanlagePackage.ZN__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case ZugnummernmeldeanlagePackage.ZN__IDZN_UNTERSTATION:
				return isSetIDZNUnterstation();
			case ZugnummernmeldeanlagePackage.ZN__ZN_ALLG:
				return zNAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZNImpl
