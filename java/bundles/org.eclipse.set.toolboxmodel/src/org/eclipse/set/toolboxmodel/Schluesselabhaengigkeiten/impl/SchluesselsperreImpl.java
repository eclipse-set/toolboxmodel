/**
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Unterbringung;
import org.eclipse.set.toolboxmodel.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schluesselsperre;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schluesselsperre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl#getBedienungArt <em>Bedienung Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.impl.SchluesselsperreImpl#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchluesselsperreImpl extends Basis_ObjektImpl implements Schluesselsperre {
	/**
	 * The cached value of the '{@link #getBedienungArt() <em>Bedienung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBedienungArt()
	 * @generated
	 * @ordered
	 */
	protected Bedienung_Art_TypeClass bedienungArt;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bezeichnung_Element_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDStellelement() <em>ID Stellelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStellelement()
	 * @generated
	 * @ordered
	 */
	protected Stellelement iDStellelement;

	/**
	 * This is true if the ID Stellelement reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStellelementESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchluesselsperreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchluesselabhaengigkeitenPackage.Literals.SCHLUESSELSPERRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedienung_Art_TypeClass getBedienungArt() {
		return bedienungArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBedienungArt(Bedienung_Art_TypeClass newBedienungArt, NotificationChain msgs) {
		Bedienung_Art_TypeClass oldBedienungArt = bedienungArt;
		bedienungArt = newBedienungArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART, oldBedienungArt, newBedienungArt);
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
	public void setBedienungArt(Bedienung_Art_TypeClass newBedienungArt) {
		if (newBedienungArt != bedienungArt) {
			NotificationChain msgs = null;
			if (bedienungArt != null)
				msgs = ((InternalEObject)bedienungArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART, null, msgs);
			if (newBedienungArt != null)
				msgs = ((InternalEObject)newBedienungArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART, null, msgs);
			msgs = basicSetBedienungArt(newBedienungArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART, newBedienungArt, newBedienungArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bezeichnung_Element_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bezeichnung_Element_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bezeichnung_Element_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Stellelement getIDStellelement() {
		if (iDStellelement != null && iDStellelement.eIsProxy()) {
			InternalEObject oldIDStellelement = (InternalEObject)iDStellelement;
			iDStellelement = (Stellelement)eResolveProxy(oldIDStellelement);
			if (iDStellelement != oldIDStellelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT, oldIDStellelement, iDStellelement));
			}
		}
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stellelement basicGetIDStellelement() {
		return iDStellelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStellelement(Stellelement newIDStellelement) {
		Stellelement oldIDStellelement = iDStellelement;
		iDStellelement = newIDStellelement;
		boolean oldIDStellelementESet = iDStellelementESet;
		iDStellelementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT, oldIDStellelement, iDStellelement, !oldIDStellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStellelement() {
		Stellelement oldIDStellelement = iDStellelement;
		boolean oldIDStellelementESet = iDStellelementESet;
		iDStellelement = null;
		iDStellelementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT, oldIDStellelement, null, oldIDStellelementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStellelement() {
		return iDStellelementESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG, oldIDUnterbringung, iDUnterbringung, !oldIDUnterbringungESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG, oldIDUnterbringung, null, oldIDUnterbringungESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART:
				return basicSetBedienungArt(null, msgs);
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART:
				return getBedienungArt();
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG:
				return getBezeichnung();
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT:
				if (resolve) return getIDStellelement();
				return basicGetIDStellelement();
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG:
				if (resolve) return getIDUnterbringung();
				return basicGetIDUnterbringung();
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART:
				setBedienungArt((Bedienung_Art_TypeClass)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT:
				setIDStellelement((Stellelement)newValue);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG:
				setIDUnterbringung((Unterbringung)newValue);
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART:
				setBedienungArt((Bedienung_Art_TypeClass)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG:
				setBezeichnung((Bezeichnung_Element_AttributeGroup)null);
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT:
				unsetIDStellelement();
				return;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG:
				unsetIDUnterbringung();
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
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEDIENUNG_ART:
				return bedienungArt != null;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__BEZEICHNUNG:
				return bezeichnung != null;
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_STELLELEMENT:
				return isSetIDStellelement();
			case SchluesselabhaengigkeitenPackage.SCHLUESSELSPERRE__ID_UNTERBRINGUNG:
				return isSetIDUnterbringung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //SchluesselsperreImpl
