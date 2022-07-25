/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal_DWeg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.RBC;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.toolboxmodel.Geodaten.Technischer_Punkt;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ETCS Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSSignalAllg <em>ETCS Signal Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getETCSSignalTBV <em>ETCS Signal TBV</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDHOAFBOA <em>IDHOAFBOA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.ETCS_SignalImpl#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ETCS_SignalImpl extends Basis_ObjektImpl implements ETCS_Signal {
	/**
	 * The cached value of the '{@link #getETCSSignalAllg() <em>ETCS Signal Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignalAllg()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Signal_Allg_AttributeGroup eTCSSignalAllg;

	/**
	 * The cached value of the '{@link #getETCSSignalDWeg() <em>ETCS Signal DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignalDWeg()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Signal_DWeg_AttributeGroup eTCSSignalDWeg;

	/**
	 * The cached value of the '{@link #getETCSSignalTBV() <em>ETCS Signal TBV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETCSSignalTBV()
	 * @generated
	 * @ordered
	 */
	protected ETCS_Signal_TBV_AttributeGroup eTCSSignalTBV;

	/**
	 * The cached value of the '{@link #getIDETCSGefahrpunkt() <em>IDETCS Gefahrpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDETCSGefahrpunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDETCSGefahrpunkt;

	/**
	 * This is true if the IDETCS Gefahrpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDETCSGefahrpunktESet;

	/**
	 * The cached value of the '{@link #getIDHOAFBOA() <em>IDHOAFBOA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDHOAFBOA()
	 * @generated
	 * @ordered
	 */
	protected Technischer_Punkt iDHOAFBOA;

	/**
	 * This is true if the IDHOAFBOA reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDHOAFBOAESet;

	/**
	 * The cached value of the '{@link #getIDRBC() <em>IDRBC</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRBC()
	 * @generated
	 * @ordered
	 */
	protected EList<RBC> iDRBC;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignal;

	/**
	 * This is true if the ID Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ETCS_SignalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_Allg_AttributeGroup getETCSSignalAllg() {
		return eTCSSignalAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup newETCSSignalAllg, NotificationChain msgs) {
		ETCS_Signal_Allg_AttributeGroup oldETCSSignalAllg = eTCSSignalAllg;
		eTCSSignalAllg = newETCSSignalAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, oldETCSSignalAllg, newETCSSignalAllg);
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
	public void setETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup newETCSSignalAllg) {
		if (newETCSSignalAllg != eTCSSignalAllg) {
			NotificationChain msgs = null;
			if (eTCSSignalAllg != null)
				msgs = ((InternalEObject)eTCSSignalAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, null, msgs);
			if (newETCSSignalAllg != null)
				msgs = ((InternalEObject)newETCSSignalAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, null, msgs);
			msgs = basicSetETCSSignalAllg(newETCSSignalAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG, newETCSSignalAllg, newETCSSignalAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_DWeg_AttributeGroup getETCSSignalDWeg() {
		return eTCSSignalDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup newETCSSignalDWeg, NotificationChain msgs) {
		ETCS_Signal_DWeg_AttributeGroup oldETCSSignalDWeg = eTCSSignalDWeg;
		eTCSSignalDWeg = newETCSSignalDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, oldETCSSignalDWeg, newETCSSignalDWeg);
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
	public void setETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup newETCSSignalDWeg) {
		if (newETCSSignalDWeg != eTCSSignalDWeg) {
			NotificationChain msgs = null;
			if (eTCSSignalDWeg != null)
				msgs = ((InternalEObject)eTCSSignalDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, null, msgs);
			if (newETCSSignalDWeg != null)
				msgs = ((InternalEObject)newETCSSignalDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, null, msgs);
			msgs = basicSetETCSSignalDWeg(newETCSSignalDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG, newETCSSignalDWeg, newETCSSignalDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ETCS_Signal_TBV_AttributeGroup getETCSSignalTBV() {
		return eTCSSignalTBV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup newETCSSignalTBV, NotificationChain msgs) {
		ETCS_Signal_TBV_AttributeGroup oldETCSSignalTBV = eTCSSignalTBV;
		eTCSSignalTBV = newETCSSignalTBV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, oldETCSSignalTBV, newETCSSignalTBV);
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
	public void setETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup newETCSSignalTBV) {
		if (newETCSSignalTBV != eTCSSignalTBV) {
			NotificationChain msgs = null;
			if (eTCSSignalTBV != null)
				msgs = ((InternalEObject)eTCSSignalTBV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, null, msgs);
			if (newETCSSignalTBV != null)
				msgs = ((InternalEObject)newETCSSignalTBV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, null, msgs);
			msgs = basicSetETCSSignalTBV(newETCSSignalTBV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV, newETCSSignalTBV, newETCSSignalTBV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDETCSGefahrpunkt() {
		if (iDETCSGefahrpunkt != null && iDETCSGefahrpunkt.eIsProxy()) {
			InternalEObject oldIDETCSGefahrpunkt = (InternalEObject)iDETCSGefahrpunkt;
			iDETCSGefahrpunkt = (Markanter_Punkt)eResolveProxy(oldIDETCSGefahrpunkt);
			if (iDETCSGefahrpunkt != oldIDETCSGefahrpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, oldIDETCSGefahrpunkt, iDETCSGefahrpunkt));
			}
		}
		return iDETCSGefahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDETCSGefahrpunkt() {
		return iDETCSGefahrpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDETCSGefahrpunkt(Markanter_Punkt newIDETCSGefahrpunkt) {
		Markanter_Punkt oldIDETCSGefahrpunkt = iDETCSGefahrpunkt;
		iDETCSGefahrpunkt = newIDETCSGefahrpunkt;
		boolean oldIDETCSGefahrpunktESet = iDETCSGefahrpunktESet;
		iDETCSGefahrpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, oldIDETCSGefahrpunkt, iDETCSGefahrpunkt, !oldIDETCSGefahrpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDETCSGefahrpunkt() {
		Markanter_Punkt oldIDETCSGefahrpunkt = iDETCSGefahrpunkt;
		boolean oldIDETCSGefahrpunktESet = iDETCSGefahrpunktESet;
		iDETCSGefahrpunkt = null;
		iDETCSGefahrpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT, oldIDETCSGefahrpunkt, null, oldIDETCSGefahrpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDETCSGefahrpunkt() {
		return iDETCSGefahrpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Technischer_Punkt getIDHOAFBOA() {
		if (iDHOAFBOA != null && iDHOAFBOA.eIsProxy()) {
			InternalEObject oldIDHOAFBOA = (InternalEObject)iDHOAFBOA;
			iDHOAFBOA = (Technischer_Punkt)eResolveProxy(oldIDHOAFBOA);
			if (iDHOAFBOA != oldIDHOAFBOA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, oldIDHOAFBOA, iDHOAFBOA));
			}
		}
		return iDHOAFBOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technischer_Punkt basicGetIDHOAFBOA() {
		return iDHOAFBOA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDHOAFBOA(Technischer_Punkt newIDHOAFBOA) {
		Technischer_Punkt oldIDHOAFBOA = iDHOAFBOA;
		iDHOAFBOA = newIDHOAFBOA;
		boolean oldIDHOAFBOAESet = iDHOAFBOAESet;
		iDHOAFBOAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, oldIDHOAFBOA, iDHOAFBOA, !oldIDHOAFBOAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDHOAFBOA() {
		Technischer_Punkt oldIDHOAFBOA = iDHOAFBOA;
		boolean oldIDHOAFBOAESet = iDHOAFBOAESet;
		iDHOAFBOA = null;
		iDHOAFBOAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA, oldIDHOAFBOA, null, oldIDHOAFBOAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDHOAFBOA() {
		return iDHOAFBOAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RBC> getIDRBC() {
		if (iDRBC == null) {
			iDRBC = new EObjectResolvingEList<RBC>(RBC.class, this, Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC);
		}
		return iDRBC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignal() {
		if (iDSignal != null && iDSignal.eIsProxy()) {
			InternalEObject oldIDSignal = (InternalEObject)iDSignal;
			iDSignal = (Signal)eResolveProxy(oldIDSignal);
			if (iDSignal != oldIDSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, oldIDSignal, iDSignal));
			}
		}
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignal(Signal newIDSignal) {
		Signal oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignal() {
		Signal oldIDSignal = iDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignal = null;
		iDSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignal() {
		return iDSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				return basicSetETCSSignalAllg(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				return basicSetETCSSignalDWeg(null, msgs);
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				return basicSetETCSSignalTBV(null, msgs);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				return getETCSSignalAllg();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				return getETCSSignalDWeg();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				return getETCSSignalTBV();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				if (resolve) return getIDETCSGefahrpunkt();
				return basicGetIDETCSGefahrpunkt();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				if (resolve) return getIDHOAFBOA();
				return basicGetIDHOAFBOA();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				return getIDRBC();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				setETCSSignalAllg((ETCS_Signal_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				setETCSSignalDWeg((ETCS_Signal_DWeg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				setETCSSignalTBV((ETCS_Signal_TBV_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				setIDETCSGefahrpunkt((Markanter_Punkt)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				setIDHOAFBOA((Technischer_Punkt)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				getIDRBC().clear();
				getIDRBC().addAll((Collection<? extends RBC>)newValue);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				setIDSignal((Signal)newValue);
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				setETCSSignalAllg((ETCS_Signal_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				setETCSSignalDWeg((ETCS_Signal_DWeg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				setETCSSignalTBV((ETCS_Signal_TBV_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				unsetIDETCSGefahrpunkt();
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				unsetIDHOAFBOA();
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				getIDRBC().clear();
				return;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				unsetIDSignal();
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
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
				return eTCSSignalAllg != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
				return eTCSSignalDWeg != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
				return eTCSSignalTBV != null;
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDETCS_GEFAHRPUNKT:
				return isSetIDETCSGefahrpunkt();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDHOAFBOA:
				return isSetIDHOAFBOA();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__IDRBC:
				return iDRBC != null && !iDRBC.isEmpty();
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ID_SIGNAL:
				return isSetIDSignal();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ETCS_SignalImpl
