/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit_Bezeichnung_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Bezirk;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ESTW Zentraleinheit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getESTWZentraleinheitAllg <em>ESTW Zentraleinheit Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDOertlichkeitNamensgebend <em>ID Oertlichkeit Namensgebend</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDBedienBezirkVirtuell <em>ID Bedien Bezirk Virtuell</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.impl.ESTW_ZentraleinheitImpl#getIDBedienBezirkZentral <em>ID Bedien Bezirk Zentral</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ESTW_ZentraleinheitImpl extends Basis_ObjektImpl implements ESTW_Zentraleinheit {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected ESTW_Zentraleinheit_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getESTWZentraleinheitAllg() <em>ESTW Zentraleinheit Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getESTWZentraleinheitAllg()
	 * @generated
	 * @ordered
	 */
	protected ESTW_Zentraleinheit_Allg_AttributeGroup eSTWZentraleinheitAllg;

	/**
	 * The cached value of the '{@link #getIDOertlichkeitNamensgebend() <em>ID Oertlichkeit Namensgebend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDOertlichkeitNamensgebend()
	 * @generated
	 * @ordered
	 */
	protected Oertlichkeit iDOertlichkeitNamensgebend;

	/**
	 * This is true if the ID Oertlichkeit Namensgebend reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDOertlichkeitNamensgebendESet;

	/**
	 * The cached value of the '{@link #getIDUnterbringung() <em>ID Unterbringung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDUnterbringung()
	 * @generated
	 * @ordered
	 */
	protected Basis_Objekt iDUnterbringung;

	/**
	 * This is true if the ID Unterbringung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDUnterbringungESet;

	/**
	 * The cached value of the '{@link #getIDBedienBezirkVirtuell() <em>ID Bedien Bezirk Virtuell</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirkVirtuell()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk iDBedienBezirkVirtuell;

	/**
	 * This is true if the ID Bedien Bezirk Virtuell reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienBezirkVirtuellESet;

	/**
	 * The cached value of the '{@link #getIDBedienBezirkZentral() <em>ID Bedien Bezirk Zentral</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBedienBezirkZentral()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Bezirk iDBedienBezirkZentral;

	/**
	 * This is true if the ID Bedien Bezirk Zentral reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBedienBezirkZentralESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESTW_ZentraleinheitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		ESTW_Zentraleinheit_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(ESTW_Zentraleinheit_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ESTW_Zentraleinheit_Allg_AttributeGroup getESTWZentraleinheitAllg() {
		return eSTWZentraleinheitAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup newESTWZentraleinheitAllg, NotificationChain msgs) {
		ESTW_Zentraleinheit_Allg_AttributeGroup oldESTWZentraleinheitAllg = eSTWZentraleinheitAllg;
		eSTWZentraleinheitAllg = newESTWZentraleinheitAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, oldESTWZentraleinheitAllg, newESTWZentraleinheitAllg);
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
	public void setESTWZentraleinheitAllg(ESTW_Zentraleinheit_Allg_AttributeGroup newESTWZentraleinheitAllg) {
		if (newESTWZentraleinheitAllg != eSTWZentraleinheitAllg) {
			NotificationChain msgs = null;
			if (eSTWZentraleinheitAllg != null)
				msgs = ((InternalEObject)eSTWZentraleinheitAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, null, msgs);
			if (newESTWZentraleinheitAllg != null)
				msgs = ((InternalEObject)newESTWZentraleinheitAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, null, msgs);
			msgs = basicSetESTWZentraleinheitAllg(newESTWZentraleinheitAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG, newESTWZentraleinheitAllg, newESTWZentraleinheitAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oertlichkeit getIDOertlichkeitNamensgebend() {
		if (iDOertlichkeitNamensgebend != null && iDOertlichkeitNamensgebend.eIsProxy()) {
			InternalEObject oldIDOertlichkeitNamensgebend = (InternalEObject)iDOertlichkeitNamensgebend;
			iDOertlichkeitNamensgebend = (Oertlichkeit)eResolveProxy(oldIDOertlichkeitNamensgebend);
			if (iDOertlichkeitNamensgebend != oldIDOertlichkeitNamensgebend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, iDOertlichkeitNamensgebend));
			}
		}
		return iDOertlichkeitNamensgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oertlichkeit basicGetIDOertlichkeitNamensgebend() {
		return iDOertlichkeitNamensgebend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDOertlichkeitNamensgebend(Oertlichkeit newIDOertlichkeitNamensgebend) {
		Oertlichkeit oldIDOertlichkeitNamensgebend = iDOertlichkeitNamensgebend;
		iDOertlichkeitNamensgebend = newIDOertlichkeitNamensgebend;
		boolean oldIDOertlichkeitNamensgebendESet = iDOertlichkeitNamensgebendESet;
		iDOertlichkeitNamensgebendESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, iDOertlichkeitNamensgebend, !oldIDOertlichkeitNamensgebendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDOertlichkeitNamensgebend() {
		Oertlichkeit oldIDOertlichkeitNamensgebend = iDOertlichkeitNamensgebend;
		boolean oldIDOertlichkeitNamensgebendESet = iDOertlichkeitNamensgebendESet;
		iDOertlichkeitNamensgebend = null;
		iDOertlichkeitNamensgebendESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND, oldIDOertlichkeitNamensgebend, null, oldIDOertlichkeitNamensgebendESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDOertlichkeitNamensgebend() {
		return iDOertlichkeitNamensgebendESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Basis_Objekt getIDUnterbringung() {
		if (iDUnterbringung != null && iDUnterbringung.eIsProxy()) {
			InternalEObject oldIDUnterbringung = (InternalEObject)iDUnterbringung;
			iDUnterbringung = (Basis_Objekt)eResolveProxy(oldIDUnterbringung);
			if (iDUnterbringung != oldIDUnterbringung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
			}
		}
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basis_Objekt basicGetIDUnterbringung() {
		return iDUnterbringung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDUnterbringung(Basis_Objekt newIDUnterbringung) {
		Basis_Objekt oldIDUnterbringung = iDUnterbringung;
		iDUnterbringung = newIDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDUnterbringung() {
		Basis_Objekt oldIDUnterbringung = iDUnterbringung;
		boolean oldIDUnterbringungESet = iDUnterbringungESet;
		iDUnterbringung = null;
		iDUnterbringungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public Bedien_Bezirk getIDBedienBezirkVirtuell() {
		if (iDBedienBezirkVirtuell != null && iDBedienBezirkVirtuell.eIsProxy()) {
			InternalEObject oldIDBedienBezirkVirtuell = (InternalEObject)iDBedienBezirkVirtuell;
			iDBedienBezirkVirtuell = (Bedien_Bezirk)eResolveProxy(oldIDBedienBezirkVirtuell);
			if (iDBedienBezirkVirtuell != oldIDBedienBezirkVirtuell) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, oldIDBedienBezirkVirtuell, iDBedienBezirkVirtuell));
			}
		}
		return iDBedienBezirkVirtuell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Bezirk basicGetIDBedienBezirkVirtuell() {
		return iDBedienBezirkVirtuell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienBezirkVirtuell(Bedien_Bezirk newIDBedienBezirkVirtuell) {
		Bedien_Bezirk oldIDBedienBezirkVirtuell = iDBedienBezirkVirtuell;
		iDBedienBezirkVirtuell = newIDBedienBezirkVirtuell;
		boolean oldIDBedienBezirkVirtuellESet = iDBedienBezirkVirtuellESet;
		iDBedienBezirkVirtuellESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, oldIDBedienBezirkVirtuell, iDBedienBezirkVirtuell, !oldIDBedienBezirkVirtuellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienBezirkVirtuell() {
		Bedien_Bezirk oldIDBedienBezirkVirtuell = iDBedienBezirkVirtuell;
		boolean oldIDBedienBezirkVirtuellESet = iDBedienBezirkVirtuellESet;
		iDBedienBezirkVirtuell = null;
		iDBedienBezirkVirtuellESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL, oldIDBedienBezirkVirtuell, null, oldIDBedienBezirkVirtuellESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienBezirkVirtuell() {
		return iDBedienBezirkVirtuellESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Bezirk getIDBedienBezirkZentral() {
		if (iDBedienBezirkZentral != null && iDBedienBezirkZentral.eIsProxy()) {
			InternalEObject oldIDBedienBezirkZentral = (InternalEObject)iDBedienBezirkZentral;
			iDBedienBezirkZentral = (Bedien_Bezirk)eResolveProxy(oldIDBedienBezirkZentral);
			if (iDBedienBezirkZentral != oldIDBedienBezirkZentral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, oldIDBedienBezirkZentral, iDBedienBezirkZentral));
			}
		}
		return iDBedienBezirkZentral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Bezirk basicGetIDBedienBezirkZentral() {
		return iDBedienBezirkZentral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBedienBezirkZentral(Bedien_Bezirk newIDBedienBezirkZentral) {
		Bedien_Bezirk oldIDBedienBezirkZentral = iDBedienBezirkZentral;
		iDBedienBezirkZentral = newIDBedienBezirkZentral;
		boolean oldIDBedienBezirkZentralESet = iDBedienBezirkZentralESet;
		iDBedienBezirkZentralESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, oldIDBedienBezirkZentral, iDBedienBezirkZentral, !oldIDBedienBezirkZentralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBedienBezirkZentral() {
		Bedien_Bezirk oldIDBedienBezirkZentral = iDBedienBezirkZentral;
		boolean oldIDBedienBezirkZentralESet = iDBedienBezirkZentralESet;
		iDBedienBezirkZentral = null;
		iDBedienBezirkZentralESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL, oldIDBedienBezirkZentral, null, oldIDBedienBezirkZentralESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBedienBezirkZentral() {
		return iDBedienBezirkZentralESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				return basicSetESTWZentraleinheitAllg(null, msgs);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				return getBezeichnung();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				return getESTWZentraleinheitAllg();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				if (resolve) return getIDOertlichkeitNamensgebend();
				return basicGetIDOertlichkeitNamensgebend();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				if (resolve) return getIDBedienBezirkVirtuell();
				return basicGetIDBedienBezirkVirtuell();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				if (resolve) return getIDBedienBezirkZentral();
				return basicGetIDBedienBezirkZentral();
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				setBezeichnung((ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				setESTWZentraleinheitAllg((ESTW_Zentraleinheit_Allg_AttributeGroup)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				setIDOertlichkeitNamensgebend((Oertlichkeit)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				setIDUnterbringung((Basis_Objekt)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				setIDBedienBezirkVirtuell((Bedien_Bezirk)newValue);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				setIDBedienBezirkZentral((Bedien_Bezirk)newValue);
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				setBezeichnung((ESTW_Zentraleinheit_Bezeichnung_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				setESTWZentraleinheitAllg((ESTW_Zentraleinheit_Allg_AttributeGroup)null);
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				unsetIDOertlichkeitNamensgebend();
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				unsetIDBedienBezirkVirtuell();
				return;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				unsetIDBedienBezirkZentral();
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
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
				return bezeichnung != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
				return eSTWZentraleinheitAllg != null;
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND:
				return isSetIDOertlichkeitNamensgebend();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL:
				return isSetIDBedienBezirkVirtuell();
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL:
				return isSetIDBedienBezirkZentral();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ESTW_ZentraleinheitImpl
