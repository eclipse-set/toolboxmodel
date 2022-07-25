/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Neigung_TypeClass;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Element;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Element_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.GFR_Neigung_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFR Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_ElementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_ElementImpl#getIDGFRAnlage <em>IDGFR Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_ElementImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_ElementImpl#getBUENeigung <em>BUE Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.GFR_ElementImpl#getGFRNeigung <em>GFR Neigung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFR_ElementImpl extends Basis_ObjektImpl implements GFR_Element {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected GFR_Element_Bezeichnung_AttributeGroup bezeichnung;

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
	 * The cached value of the '{@link #getBUENeigung() <em>BUE Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUENeigung()
	 * @generated
	 * @ordered
	 */
	protected BUE_Neigung_TypeClass bUENeigung;

	/**
	 * The cached value of the '{@link #getGFRNeigung() <em>GFR Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGFRNeigung()
	 * @generated
	 * @ordered
	 */
	protected GFR_Neigung_TypeClass gFRNeigung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GFR_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getGFR_Element();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Element_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(GFR_Element_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		GFR_Element_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(GFR_Element_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, oldIDGFRAnlage, iDGFRAnlage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, oldIDGFRAnlage, iDGFRAnlage, !oldIDGFRAnlageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE, oldIDGFRAnlage, null, oldIDGFRAnlageESet));
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
	public Unterbringung getIDUnterbringung() {
		if (iDUnterbringung != null && iDUnterbringung.eIsProxy()) {
			InternalEObject oldIDUnterbringung = (InternalEObject)iDUnterbringung;
			iDUnterbringung = (Unterbringung)eResolveProxy(oldIDUnterbringung);
			if (iDUnterbringung != oldIDUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public BUE_Neigung_TypeClass getBUENeigung() {
		return bUENeigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUENeigung(BUE_Neigung_TypeClass newBUENeigung, NotificationChain msgs) {
		BUE_Neigung_TypeClass oldBUENeigung = bUENeigung;
		bUENeigung = newBUENeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, oldBUENeigung, newBUENeigung);
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
	public void setBUENeigung(BUE_Neigung_TypeClass newBUENeigung) {
		if (newBUENeigung != bUENeigung) {
			NotificationChain msgs = null;
			if (bUENeigung != null)
				msgs = ((InternalEObject)bUENeigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, null, msgs);
			if (newBUENeigung != null)
				msgs = ((InternalEObject)newBUENeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, null, msgs);
			msgs = basicSetBUENeigung(newBUENeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG, newBUENeigung, newBUENeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GFR_Neigung_TypeClass getGFRNeigung() {
		return gFRNeigung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGFRNeigung(GFR_Neigung_TypeClass newGFRNeigung, NotificationChain msgs) {
		GFR_Neigung_TypeClass oldGFRNeigung = gFRNeigung;
		gFRNeigung = newGFRNeigung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, oldGFRNeigung, newGFRNeigung);
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
	public void setGFRNeigung(GFR_Neigung_TypeClass newGFRNeigung) {
		if (newGFRNeigung != gFRNeigung) {
			NotificationChain msgs = null;
			if (gFRNeigung != null)
				msgs = ((InternalEObject)gFRNeigung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, null, msgs);
			if (newGFRNeigung != null)
				msgs = ((InternalEObject)newGFRNeigung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, null, msgs);
			msgs = basicSetGFRNeigung(newGFRNeigung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG, newGFRNeigung, newGFRNeigung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				return basicSetBUENeigung(null, msgs);
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				return basicSetGFRNeigung(null, msgs);
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				if (resolve) return getIDGFRAnlage();
				return basicGetIDGFRAnlage();
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				return getBUENeigung();
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				return getGFRNeigung();
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				setBezeichnung((GFR_Element_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				setIDGFRAnlage((GFR_Anlage)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				setBUENeigung((BUE_Neigung_TypeClass)newValue);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				setGFRNeigung((GFR_Neigung_TypeClass)newValue);
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				setBezeichnung((GFR_Element_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				unsetIDGFRAnlage();
				return;
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				setBUENeigung((BUE_Neigung_TypeClass)null);
				return;
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				setGFRNeigung((GFR_Neigung_TypeClass)null);
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
			case BahnuebergangPackage.GFR_ELEMENT__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.GFR_ELEMENT__IDGFR_ANLAGE:
				return isSetIDGFRAnlage();
			case BahnuebergangPackage.GFR_ELEMENT__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case BahnuebergangPackage.GFR_ELEMENT__BUE_NEIGUNG:
				return bUENeigung != null;
			case BahnuebergangPackage.GFR_ELEMENT__GFR_NEIGUNG:
				return gFRNeigung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //GFR_ElementImpl
