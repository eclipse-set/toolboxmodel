/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Tripelspiegel_Bezeichnung_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Tripelspiegel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_TripelspiegelImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_TripelspiegelImpl#getGFRTripelspiegelAllg <em>GFR Tripelspiegel Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_TripelspiegelImpl#getIDGFRAnlage <em>IDGFR Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_TripelspiegelImpl extends Punkt_ObjektImpl implements GFR_Tripelspiegel {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected GFR_Tripelspiegel_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getGFRTripelspiegelAllg() <em>GFR Tripelspiegel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRTripelspiegelAllg()
	 * @generated
	 * @ordered
	 */
	protected GFR_Tripelspiegel_Allg_AttributeGroup gFRTripelspiegelAllg;

	/**
	 * The cached value of the '{@link #getIDGFRAnlage() <em>IDGFR Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGFRAnlage()
	 * @generated
	 * @ordered
	 */
	protected GFR_Anlage iDGFRAnlage;

	/**
	 * This is true if the IDGFR Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGFRAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_TripelspiegelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Tripelspiegel();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(GFR_Tripelspiegel_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		GFR_Tripelspiegel_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(GFR_Tripelspiegel_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Tripelspiegel_Allg_AttributeGroup getGFRTripelspiegelAllg() {
		return gFRTripelspiegelAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRTripelspiegelAllg(GFR_Tripelspiegel_Allg_AttributeGroup newGFRTripelspiegelAllg, NotificationChain msgs) {
		GFR_Tripelspiegel_Allg_AttributeGroup oldGFRTripelspiegelAllg = gFRTripelspiegelAllg;
		gFRTripelspiegelAllg = newGFRTripelspiegelAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, oldGFRTripelspiegelAllg, newGFRTripelspiegelAllg);
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
	public void setGFRTripelspiegelAllg(GFR_Tripelspiegel_Allg_AttributeGroup newGFRTripelspiegelAllg) {
		if (newGFRTripelspiegelAllg != gFRTripelspiegelAllg) {
			NotificationChain msgs = null;
			if (gFRTripelspiegelAllg != null)
				msgs = ((InternalEObject)gFRTripelspiegelAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, null, msgs);
			if (newGFRTripelspiegelAllg != null)
				msgs = ((InternalEObject)newGFRTripelspiegelAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, null, msgs);
			msgs = basicSetGFRTripelspiegelAllg(newGFRTripelspiegelAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG, newGFRTripelspiegelAllg, newGFRTripelspiegelAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Anlage getIDGFRAnlage() {
		if (iDGFRAnlage != null && iDGFRAnlage.eIsProxy()) {
			InternalEObject oldIDGFRAnlage = (InternalEObject)iDGFRAnlage;
			iDGFRAnlage = (GFR_Anlage)eResolveProxy(oldIDGFRAnlage);
			if (iDGFRAnlage != oldIDGFRAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, oldIDGFRAnlage, iDGFRAnlage));
			}
		}
		return iDGFRAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GFR_Anlage basicGetIDGFRAnlage() {
		return iDGFRAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGFRAnlage(GFR_Anlage newIDGFRAnlage) {
		GFR_Anlage oldIDGFRAnlage = iDGFRAnlage;
		iDGFRAnlage = newIDGFRAnlage;
		boolean oldIDGFRAnlageESet = iDGFRAnlageESet;
		iDGFRAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, oldIDGFRAnlage, iDGFRAnlage, !oldIDGFRAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGFRAnlage() {
		GFR_Anlage oldIDGFRAnlage = iDGFRAnlage;
		boolean oldIDGFRAnlageESet = iDGFRAnlageESet;
		iDGFRAnlage = null;
		iDGFRAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE, oldIDGFRAnlage, null, oldIDGFRAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGFRAnlage() {
		return iDGFRAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				return basicSetGFRTripelspiegelAllg(null, msgs);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				return getGFRTripelspiegelAllg();
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				if (resolve) return getIDGFRAnlage();
				return basicGetIDGFRAnlage();
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				setBezeichnung((GFR_Tripelspiegel_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				setGFRTripelspiegelAllg((GFR_Tripelspiegel_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				setIDGFRAnlage((GFR_Anlage)newValue);
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				setBezeichnung((GFR_Tripelspiegel_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				setGFRTripelspiegelAllg((GFR_Tripelspiegel_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				unsetIDGFRAnlage();
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
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__GFR_TRIPELSPIEGEL_ALLG:
				return gFRTripelspiegelAllg != null;
			case BahnuebergangPackage.GFR_TRIPELSPIEGEL__IDGFR_ANLAGE:
				return isSetIDGFRAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //GFR_TripelspiegelImpl
