/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Verkehrszeichen_Lz_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Vz_Sperrstrecke_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verkehrszeichen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getVerkehrszeichenAndreaskreuz <em>Verkehrszeichen Andreaskreuz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.VerkehrszeichenImpl#getVzSperrstrecke <em>Vz Sperrstrecke</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerkehrszeichenImpl extends Basis_ObjektImpl implements Verkehrszeichen {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Verkehrszeichen_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBUEAnlage() <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage iDBUEAnlage;

	/**
	 * This is true if the IDBUE Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEAnlageESet;

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
	 * The cached value of the '{@link #getVerkehrszeichenAllg() <em>Verkehrszeichen Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichenAllg()
	 * @generated
	 * @ordered
	 */
	protected Verkehrszeichen_Allg_AttributeGroup verkehrszeichenAllg;

	/**
	 * The cached value of the '{@link #getVerkehrszeichenAndreaskreuz() <em>Verkehrszeichen Andreaskreuz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichenAndreaskreuz()
	 * @generated
	 * @ordered
	 */
	protected EList<Verkehrszeichen_Andreaskreuz_AttributeGroup> verkehrszeichenAndreaskreuz;

	/**
	 * The cached value of the '{@link #getVerkehrszeichenLz() <em>Verkehrszeichen Lz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerkehrszeichenLz()
	 * @generated
	 * @ordered
	 */
	protected Verkehrszeichen_Lz_AttributeGroup verkehrszeichenLz;

	/**
	 * The cached value of the '{@link #getVzSperrstrecke() <em>Vz Sperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVzSperrstrecke()
	 * @generated
	 * @ordered
	 */
	protected Vz_Sperrstrecke_AttributeGroup vzSperrstrecke;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerkehrszeichenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getVerkehrszeichen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Verkehrszeichen_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage getIDBUEAnlage() {
		if (iDBUEAnlage != null && iDBUEAnlage.eIsProxy()) {
			InternalEObject oldIDBUEAnlage = (InternalEObject)iDBUEAnlage;
			iDBUEAnlage = (BUE_Anlage)eResolveProxy(oldIDBUEAnlage);
			if (iDBUEAnlage != oldIDBUEAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage));
			}
		}
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Anlage basicGetIDBUEAnlage() {
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEAnlage(BUE_Anlage newIDBUEAnlage) {
		BUE_Anlage oldIDBUEAnlage = iDBUEAnlage;
		iDBUEAnlage = newIDBUEAnlage;
		boolean oldIDBUEAnlageESet = iDBUEAnlageESet;
		iDBUEAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage, !oldIDBUEAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEAnlage() {
		BUE_Anlage oldIDBUEAnlage = iDBUEAnlage;
		boolean oldIDBUEAnlageESet = iDBUEAnlageESet;
		iDBUEAnlage = null;
		iDBUEAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE, oldIDBUEAnlage, null, oldIDBUEAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEAnlage() {
		return iDBUEAnlageESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public Verkehrszeichen_Allg_AttributeGroup getVerkehrszeichenAllg() {
		return verkehrszeichenAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup newVerkehrszeichenAllg, NotificationChain msgs) {
		Verkehrszeichen_Allg_AttributeGroup oldVerkehrszeichenAllg = verkehrszeichenAllg;
		verkehrszeichenAllg = newVerkehrszeichenAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, oldVerkehrszeichenAllg, newVerkehrszeichenAllg);
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
	public void setVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup newVerkehrszeichenAllg) {
		if (newVerkehrszeichenAllg != verkehrszeichenAllg) {
			NotificationChain msgs = null;
			if (verkehrszeichenAllg != null)
				msgs = ((InternalEObject)verkehrszeichenAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, null, msgs);
			if (newVerkehrszeichenAllg != null)
				msgs = ((InternalEObject)newVerkehrszeichenAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, null, msgs);
			msgs = basicSetVerkehrszeichenAllg(newVerkehrszeichenAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG, newVerkehrszeichenAllg, newVerkehrszeichenAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verkehrszeichen_Andreaskreuz_AttributeGroup> getVerkehrszeichenAndreaskreuz() {
		if (verkehrszeichenAndreaskreuz == null) {
			verkehrszeichenAndreaskreuz = new EObjectContainmentEList<Verkehrszeichen_Andreaskreuz_AttributeGroup>(Verkehrszeichen_Andreaskreuz_AttributeGroup.class, this, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ);
		}
		return verkehrszeichenAndreaskreuz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verkehrszeichen_Lz_AttributeGroup getVerkehrszeichenLz() {
		return verkehrszeichenLz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup newVerkehrszeichenLz, NotificationChain msgs) {
		Verkehrszeichen_Lz_AttributeGroup oldVerkehrszeichenLz = verkehrszeichenLz;
		verkehrszeichenLz = newVerkehrszeichenLz;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, oldVerkehrszeichenLz, newVerkehrszeichenLz);
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
	public void setVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup newVerkehrszeichenLz) {
		if (newVerkehrszeichenLz != verkehrszeichenLz) {
			NotificationChain msgs = null;
			if (verkehrszeichenLz != null)
				msgs = ((InternalEObject)verkehrszeichenLz).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, null, msgs);
			if (newVerkehrszeichenLz != null)
				msgs = ((InternalEObject)newVerkehrszeichenLz).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, null, msgs);
			msgs = basicSetVerkehrszeichenLz(newVerkehrszeichenLz, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ, newVerkehrszeichenLz, newVerkehrszeichenLz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vz_Sperrstrecke_AttributeGroup getVzSperrstrecke() {
		return vzSperrstrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup newVzSperrstrecke, NotificationChain msgs) {
		Vz_Sperrstrecke_AttributeGroup oldVzSperrstrecke = vzSperrstrecke;
		vzSperrstrecke = newVzSperrstrecke;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, oldVzSperrstrecke, newVzSperrstrecke);
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
	public void setVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup newVzSperrstrecke) {
		if (newVzSperrstrecke != vzSperrstrecke) {
			NotificationChain msgs = null;
			if (vzSperrstrecke != null)
				msgs = ((InternalEObject)vzSperrstrecke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, null, msgs);
			if (newVzSperrstrecke != null)
				msgs = ((InternalEObject)newVzSperrstrecke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, null, msgs);
			msgs = basicSetVzSperrstrecke(newVzSperrstrecke, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE, newVzSperrstrecke, newVzSperrstrecke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				return basicSetVerkehrszeichenAllg(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				return ((InternalEList<?>)getVerkehrszeichenAndreaskreuz()).basicRemove(otherEnd, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				return basicSetVerkehrszeichenLz(null, msgs);
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				return basicSetVzSperrstrecke(null, msgs);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				return getBezeichnung();
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				if (resolve) return getIDBUEAnlage();
				return basicGetIDBUEAnlage();
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				return getVerkehrszeichenAllg();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				return getVerkehrszeichenAndreaskreuz();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				return getVerkehrszeichenLz();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				return getVzSperrstrecke();
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				setBezeichnung((Verkehrszeichen_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				setIDBUEAnlage((BUE_Anlage)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				setVerkehrszeichenAllg((Verkehrszeichen_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				getVerkehrszeichenAndreaskreuz().clear();
				getVerkehrszeichenAndreaskreuz().addAll((Collection<? extends Verkehrszeichen_Andreaskreuz_AttributeGroup>)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				setVerkehrszeichenLz((Verkehrszeichen_Lz_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				setVzSperrstrecke((Vz_Sperrstrecke_AttributeGroup)newValue);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				setBezeichnung((Verkehrszeichen_Bezeichnung_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				unsetIDBUEAnlage();
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				setVerkehrszeichenAllg((Verkehrszeichen_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				getVerkehrszeichenAndreaskreuz().clear();
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				setVerkehrszeichenLz((Verkehrszeichen_Lz_AttributeGroup)null);
				return;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				setVzSperrstrecke((Vz_Sperrstrecke_AttributeGroup)null);
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
			case BahnuebergangPackage.VERKEHRSZEICHEN__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__IDBUE_ANLAGE:
				return isSetIDBUEAnlage();
			case BahnuebergangPackage.VERKEHRSZEICHEN__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ALLG:
				return verkehrszeichenAllg != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_ANDREASKREUZ:
				return verkehrszeichenAndreaskreuz != null && !verkehrszeichenAndreaskreuz.isEmpty();
			case BahnuebergangPackage.VERKEHRSZEICHEN__VERKEHRSZEICHEN_LZ:
				return verkehrszeichenLz != null;
			case BahnuebergangPackage.VERKEHRSZEICHEN__VZ_SPERRSTRECKE:
				return vzSperrstrecke != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //VerkehrszeichenImpl
