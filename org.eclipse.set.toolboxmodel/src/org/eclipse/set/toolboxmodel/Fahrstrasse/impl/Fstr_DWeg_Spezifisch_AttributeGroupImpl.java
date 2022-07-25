/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_Reihenfolge_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.DWeg_V_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Anlage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr DWeg Spezifisch Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl#getAufloesungVerzoegerung <em>Aufloesung Verzoegerung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl#getDWegReihenfolge <em>DWeg Reihenfolge</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl#getDWegV <em>DWeg V</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl#getDWegVAufwertungVerzicht <em>DWeg VAufwertung Verzicht</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_DWeg_Spezifisch_AttributeGroupImpl#getIDFMAAnlageZielgleis <em>IDFMA Anlage Zielgleis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_DWeg_Spezifisch_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fstr_DWeg_Spezifisch_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAufloesungVerzoegerung() <em>Aufloesung Verzoegerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufloesungVerzoegerung()
	 * @generated
	 * @ordered
	 */
	protected Aufloesung_Verzoegerung_TypeClass aufloesungVerzoegerung;

	/**
	 * The cached value of the '{@link #getDWegReihenfolge() <em>DWeg Reihenfolge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegReihenfolge()
	 * @generated
	 * @ordered
	 */
	protected DWeg_Reihenfolge_TypeClass dWegReihenfolge;

	/**
	 * The cached value of the '{@link #getDWegV() <em>DWeg V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegV()
	 * @generated
	 * @ordered
	 */
	protected DWeg_V_TypeClass dWegV;

	/**
	 * The cached value of the '{@link #getDWegVAufwertungVerzicht() <em>DWeg VAufwertung Verzicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDWegVAufwertungVerzicht()
	 * @generated
	 * @ordered
	 */
	protected DWeg_V_Aufwertung_Verzicht_TypeClass dWegVAufwertungVerzicht;

	/**
	 * The cached value of the '{@link #getIDFMAAnlageZielgleis() <em>IDFMA Anlage Zielgleis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFMAAnlageZielgleis()
	 * @generated
	 * @ordered
	 */
	protected FMA_Anlage iDFMAAnlageZielgleis;

	/**
	 * This is true if the IDFMA Anlage Zielgleis reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFMAAnlageZielgleisESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_DWeg_Spezifisch_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aufloesung_Verzoegerung_TypeClass getAufloesungVerzoegerung() {
		return aufloesungVerzoegerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufloesungVerzoegerung(Aufloesung_Verzoegerung_TypeClass newAufloesungVerzoegerung, NotificationChain msgs) {
		Aufloesung_Verzoegerung_TypeClass oldAufloesungVerzoegerung = aufloesungVerzoegerung;
		aufloesungVerzoegerung = newAufloesungVerzoegerung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG, oldAufloesungVerzoegerung, newAufloesungVerzoegerung);
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
	public void setAufloesungVerzoegerung(Aufloesung_Verzoegerung_TypeClass newAufloesungVerzoegerung) {
		if (newAufloesungVerzoegerung != aufloesungVerzoegerung) {
			NotificationChain msgs = null;
			if (aufloesungVerzoegerung != null)
				msgs = ((InternalEObject)aufloesungVerzoegerung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG, null, msgs);
			if (newAufloesungVerzoegerung != null)
				msgs = ((InternalEObject)newAufloesungVerzoegerung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG, null, msgs);
			msgs = basicSetAufloesungVerzoegerung(newAufloesungVerzoegerung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG, newAufloesungVerzoegerung, newAufloesungVerzoegerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_Reihenfolge_TypeClass getDWegReihenfolge() {
		return dWegReihenfolge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegReihenfolge(DWeg_Reihenfolge_TypeClass newDWegReihenfolge, NotificationChain msgs) {
		DWeg_Reihenfolge_TypeClass oldDWegReihenfolge = dWegReihenfolge;
		dWegReihenfolge = newDWegReihenfolge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE, oldDWegReihenfolge, newDWegReihenfolge);
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
	public void setDWegReihenfolge(DWeg_Reihenfolge_TypeClass newDWegReihenfolge) {
		if (newDWegReihenfolge != dWegReihenfolge) {
			NotificationChain msgs = null;
			if (dWegReihenfolge != null)
				msgs = ((InternalEObject)dWegReihenfolge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE, null, msgs);
			if (newDWegReihenfolge != null)
				msgs = ((InternalEObject)newDWegReihenfolge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE, null, msgs);
			msgs = basicSetDWegReihenfolge(newDWegReihenfolge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE, newDWegReihenfolge, newDWegReihenfolge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_V_TypeClass getDWegV() {
		return dWegV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegV(DWeg_V_TypeClass newDWegV, NotificationChain msgs) {
		DWeg_V_TypeClass oldDWegV = dWegV;
		dWegV = newDWegV;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V, oldDWegV, newDWegV);
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
	public void setDWegV(DWeg_V_TypeClass newDWegV) {
		if (newDWegV != dWegV) {
			NotificationChain msgs = null;
			if (dWegV != null)
				msgs = ((InternalEObject)dWegV).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V, null, msgs);
			if (newDWegV != null)
				msgs = ((InternalEObject)newDWegV).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V, null, msgs);
			msgs = basicSetDWegV(newDWegV, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V, newDWegV, newDWegV));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DWeg_V_Aufwertung_Verzicht_TypeClass getDWegVAufwertungVerzicht() {
		return dWegVAufwertungVerzicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDWegVAufwertungVerzicht(DWeg_V_Aufwertung_Verzicht_TypeClass newDWegVAufwertungVerzicht, NotificationChain msgs) {
		DWeg_V_Aufwertung_Verzicht_TypeClass oldDWegVAufwertungVerzicht = dWegVAufwertungVerzicht;
		dWegVAufwertungVerzicht = newDWegVAufwertungVerzicht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT, oldDWegVAufwertungVerzicht, newDWegVAufwertungVerzicht);
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
	public void setDWegVAufwertungVerzicht(DWeg_V_Aufwertung_Verzicht_TypeClass newDWegVAufwertungVerzicht) {
		if (newDWegVAufwertungVerzicht != dWegVAufwertungVerzicht) {
			NotificationChain msgs = null;
			if (dWegVAufwertungVerzicht != null)
				msgs = ((InternalEObject)dWegVAufwertungVerzicht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT, null, msgs);
			if (newDWegVAufwertungVerzicht != null)
				msgs = ((InternalEObject)newDWegVAufwertungVerzicht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT, null, msgs);
			msgs = basicSetDWegVAufwertungVerzicht(newDWegVAufwertungVerzicht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT, newDWegVAufwertungVerzicht, newDWegVAufwertungVerzicht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Anlage getIDFMAAnlageZielgleis() {
		if (iDFMAAnlageZielgleis != null && iDFMAAnlageZielgleis.eIsProxy()) {
			InternalEObject oldIDFMAAnlageZielgleis = (InternalEObject)iDFMAAnlageZielgleis;
			iDFMAAnlageZielgleis = (FMA_Anlage)eResolveProxy(oldIDFMAAnlageZielgleis);
			if (iDFMAAnlageZielgleis != oldIDFMAAnlageZielgleis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS, oldIDFMAAnlageZielgleis, iDFMAAnlageZielgleis));
			}
		}
		return iDFMAAnlageZielgleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMA_Anlage basicGetIDFMAAnlageZielgleis() {
		return iDFMAAnlageZielgleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFMAAnlageZielgleis(FMA_Anlage newIDFMAAnlageZielgleis) {
		FMA_Anlage oldIDFMAAnlageZielgleis = iDFMAAnlageZielgleis;
		iDFMAAnlageZielgleis = newIDFMAAnlageZielgleis;
		boolean oldIDFMAAnlageZielgleisESet = iDFMAAnlageZielgleisESet;
		iDFMAAnlageZielgleisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS, oldIDFMAAnlageZielgleis, iDFMAAnlageZielgleis, !oldIDFMAAnlageZielgleisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFMAAnlageZielgleis() {
		FMA_Anlage oldIDFMAAnlageZielgleis = iDFMAAnlageZielgleis;
		boolean oldIDFMAAnlageZielgleisESet = iDFMAAnlageZielgleisESet;
		iDFMAAnlageZielgleis = null;
		iDFMAAnlageZielgleisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS, oldIDFMAAnlageZielgleis, null, oldIDFMAAnlageZielgleisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFMAAnlageZielgleis() {
		return iDFMAAnlageZielgleisESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG:
				return basicSetAufloesungVerzoegerung(null, msgs);
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE:
				return basicSetDWegReihenfolge(null, msgs);
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V:
				return basicSetDWegV(null, msgs);
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT:
				return basicSetDWegVAufwertungVerzicht(null, msgs);
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
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG:
				return getAufloesungVerzoegerung();
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE:
				return getDWegReihenfolge();
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V:
				return getDWegV();
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT:
				return getDWegVAufwertungVerzicht();
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS:
				if (resolve) return getIDFMAAnlageZielgleis();
				return basicGetIDFMAAnlageZielgleis();
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
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG:
				setAufloesungVerzoegerung((Aufloesung_Verzoegerung_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE:
				setDWegReihenfolge((DWeg_Reihenfolge_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V:
				setDWegV((DWeg_V_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT:
				setDWegVAufwertungVerzicht((DWeg_V_Aufwertung_Verzicht_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS:
				setIDFMAAnlageZielgleis((FMA_Anlage)newValue);
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
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG:
				setAufloesungVerzoegerung((Aufloesung_Verzoegerung_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE:
				setDWegReihenfolge((DWeg_Reihenfolge_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V:
				setDWegV((DWeg_V_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT:
				setDWegVAufwertungVerzicht((DWeg_V_Aufwertung_Verzicht_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS:
				unsetIDFMAAnlageZielgleis();
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
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__AUFLOESUNG_VERZOEGERUNG:
				return aufloesungVerzoegerung != null;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_REIHENFOLGE:
				return dWegReihenfolge != null;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_V:
				return dWegV != null;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__DWEG_VAUFWERTUNG_VERZICHT:
				return dWegVAufwertungVerzicht != null;
			case FahrstrassePackage.FSTR_DWEG_SPEZIFISCH_ATTRIBUTE_GROUP__IDFMA_ANLAGE_ZIELGLEIS:
				return isSetIDFMAAnlageZielgleis();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_DWeg_Spezifisch_AttributeGroupImpl
