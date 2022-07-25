/**
 */
package org.eclipse.set.toolboxmodel.Ortung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Schienenprofil_TypeClass;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Stromversorgung_TypeClass;
import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente_Typ_TypeClass;
import org.eclipse.set.toolboxmodel.Ortung.OrtungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMA Komponente Achszaehlpunkt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl#getFMAKomponenteSchienenprofil <em>FMA Komponente Schienenprofil</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl#getFMAKomponenteStromversorgung <em>FMA Komponente Stromversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl#getFMAKomponenteTyp <em>FMA Komponente Typ</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl#getIDEnergie <em>ID Energie</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Ortung.impl.FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl#getIDInformation <em>ID Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl extends MinimalEObjectImpl.Container implements FMA_Komponente_Achszaehlpunkt_AttributeGroup {
	/**
	 * The cached value of the '{@link #getFMAKomponenteSchienenprofil() <em>FMA Komponente Schienenprofil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKomponenteSchienenprofil()
	 * @generated
	 * @ordered
	 */
	protected FMA_Komponente_Schienenprofil_TypeClass fMAKomponenteSchienenprofil;

	/**
	 * The cached value of the '{@link #getFMAKomponenteStromversorgung() <em>FMA Komponente Stromversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKomponenteStromversorgung()
	 * @generated
	 * @ordered
	 */
	protected FMA_Komponente_Stromversorgung_TypeClass fMAKomponenteStromversorgung;

	/**
	 * The cached value of the '{@link #getFMAKomponenteTyp() <em>FMA Komponente Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMAKomponenteTyp()
	 * @generated
	 * @ordered
	 */
	protected FMA_Komponente_Typ_TypeClass fMAKomponenteTyp;

	/**
	 * The cached value of the '{@link #getIDEnergie() <em>ID Energie</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDEnergie()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDEnergie;

	/**
	 * This is true if the ID Energie reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDEnergieESet;

	/**
	 * The cached value of the '{@link #getIDInformation() <em>ID Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDInformation()
	 * @generated
	 * @ordered
	 */
	protected Aussenelementansteuerung iDInformation;

	/**
	 * This is true if the ID Information reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDInformationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OrtungPackage.Literals.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Schienenprofil_TypeClass getFMAKomponenteSchienenprofil() {
		return fMAKomponenteSchienenprofil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKomponenteSchienenprofil(FMA_Komponente_Schienenprofil_TypeClass newFMAKomponenteSchienenprofil, NotificationChain msgs) {
		FMA_Komponente_Schienenprofil_TypeClass oldFMAKomponenteSchienenprofil = fMAKomponenteSchienenprofil;
		fMAKomponenteSchienenprofil = newFMAKomponenteSchienenprofil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL, oldFMAKomponenteSchienenprofil, newFMAKomponenteSchienenprofil);
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
	public void setFMAKomponenteSchienenprofil(FMA_Komponente_Schienenprofil_TypeClass newFMAKomponenteSchienenprofil) {
		if (newFMAKomponenteSchienenprofil != fMAKomponenteSchienenprofil) {
			NotificationChain msgs = null;
			if (fMAKomponenteSchienenprofil != null)
				msgs = ((InternalEObject)fMAKomponenteSchienenprofil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL, null, msgs);
			if (newFMAKomponenteSchienenprofil != null)
				msgs = ((InternalEObject)newFMAKomponenteSchienenprofil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL, null, msgs);
			msgs = basicSetFMAKomponenteSchienenprofil(newFMAKomponenteSchienenprofil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL, newFMAKomponenteSchienenprofil, newFMAKomponenteSchienenprofil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Stromversorgung_TypeClass getFMAKomponenteStromversorgung() {
		return fMAKomponenteStromversorgung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKomponenteStromversorgung(FMA_Komponente_Stromversorgung_TypeClass newFMAKomponenteStromversorgung, NotificationChain msgs) {
		FMA_Komponente_Stromversorgung_TypeClass oldFMAKomponenteStromversorgung = fMAKomponenteStromversorgung;
		fMAKomponenteStromversorgung = newFMAKomponenteStromversorgung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG, oldFMAKomponenteStromversorgung, newFMAKomponenteStromversorgung);
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
	public void setFMAKomponenteStromversorgung(FMA_Komponente_Stromversorgung_TypeClass newFMAKomponenteStromversorgung) {
		if (newFMAKomponenteStromversorgung != fMAKomponenteStromversorgung) {
			NotificationChain msgs = null;
			if (fMAKomponenteStromversorgung != null)
				msgs = ((InternalEObject)fMAKomponenteStromversorgung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG, null, msgs);
			if (newFMAKomponenteStromversorgung != null)
				msgs = ((InternalEObject)newFMAKomponenteStromversorgung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG, null, msgs);
			msgs = basicSetFMAKomponenteStromversorgung(newFMAKomponenteStromversorgung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG, newFMAKomponenteStromversorgung, newFMAKomponenteStromversorgung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMA_Komponente_Typ_TypeClass getFMAKomponenteTyp() {
		return fMAKomponenteTyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFMAKomponenteTyp(FMA_Komponente_Typ_TypeClass newFMAKomponenteTyp, NotificationChain msgs) {
		FMA_Komponente_Typ_TypeClass oldFMAKomponenteTyp = fMAKomponenteTyp;
		fMAKomponenteTyp = newFMAKomponenteTyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP, oldFMAKomponenteTyp, newFMAKomponenteTyp);
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
	public void setFMAKomponenteTyp(FMA_Komponente_Typ_TypeClass newFMAKomponenteTyp) {
		if (newFMAKomponenteTyp != fMAKomponenteTyp) {
			NotificationChain msgs = null;
			if (fMAKomponenteTyp != null)
				msgs = ((InternalEObject)fMAKomponenteTyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP, null, msgs);
			if (newFMAKomponenteTyp != null)
				msgs = ((InternalEObject)newFMAKomponenteTyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP, null, msgs);
			msgs = basicSetFMAKomponenteTyp(newFMAKomponenteTyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP, newFMAKomponenteTyp, newFMAKomponenteTyp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDEnergie() {
		if (iDEnergie != null && iDEnergie.eIsProxy()) {
			InternalEObject oldIDEnergie = (InternalEObject)iDEnergie;
			iDEnergie = (Aussenelementansteuerung)eResolveProxy(oldIDEnergie);
			if (iDEnergie != oldIDEnergie) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE, oldIDEnergie, iDEnergie));
			}
		}
		return iDEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDEnergie() {
		return iDEnergie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDEnergie(Aussenelementansteuerung newIDEnergie) {
		Aussenelementansteuerung oldIDEnergie = iDEnergie;
		iDEnergie = newIDEnergie;
		boolean oldIDEnergieESet = iDEnergieESet;
		iDEnergieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE, oldIDEnergie, iDEnergie, !oldIDEnergieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDEnergie() {
		Aussenelementansteuerung oldIDEnergie = iDEnergie;
		boolean oldIDEnergieESet = iDEnergieESet;
		iDEnergie = null;
		iDEnergieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE, oldIDEnergie, null, oldIDEnergieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDEnergie() {
		return iDEnergieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aussenelementansteuerung getIDInformation() {
		if (iDInformation != null && iDInformation.eIsProxy()) {
			InternalEObject oldIDInformation = (InternalEObject)iDInformation;
			iDInformation = (Aussenelementansteuerung)eResolveProxy(oldIDInformation);
			if (iDInformation != oldIDInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION, oldIDInformation, iDInformation));
			}
		}
		return iDInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aussenelementansteuerung basicGetIDInformation() {
		return iDInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDInformation(Aussenelementansteuerung newIDInformation) {
		Aussenelementansteuerung oldIDInformation = iDInformation;
		iDInformation = newIDInformation;
		boolean oldIDInformationESet = iDInformationESet;
		iDInformationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION, oldIDInformation, iDInformation, !oldIDInformationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDInformation() {
		Aussenelementansteuerung oldIDInformation = iDInformation;
		boolean oldIDInformationESet = iDInformationESet;
		iDInformation = null;
		iDInformationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION, oldIDInformation, null, oldIDInformationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDInformation() {
		return iDInformationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL:
				return basicSetFMAKomponenteSchienenprofil(null, msgs);
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG:
				return basicSetFMAKomponenteStromversorgung(null, msgs);
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP:
				return basicSetFMAKomponenteTyp(null, msgs);
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
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL:
				return getFMAKomponenteSchienenprofil();
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG:
				return getFMAKomponenteStromversorgung();
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP:
				return getFMAKomponenteTyp();
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE:
				if (resolve) return getIDEnergie();
				return basicGetIDEnergie();
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION:
				if (resolve) return getIDInformation();
				return basicGetIDInformation();
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
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL:
				setFMAKomponenteSchienenprofil((FMA_Komponente_Schienenprofil_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG:
				setFMAKomponenteStromversorgung((FMA_Komponente_Stromversorgung_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP:
				setFMAKomponenteTyp((FMA_Komponente_Typ_TypeClass)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE:
				setIDEnergie((Aussenelementansteuerung)newValue);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION:
				setIDInformation((Aussenelementansteuerung)newValue);
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
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL:
				setFMAKomponenteSchienenprofil((FMA_Komponente_Schienenprofil_TypeClass)null);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG:
				setFMAKomponenteStromversorgung((FMA_Komponente_Stromversorgung_TypeClass)null);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP:
				setFMAKomponenteTyp((FMA_Komponente_Typ_TypeClass)null);
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE:
				unsetIDEnergie();
				return;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION:
				unsetIDInformation();
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
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_SCHIENENPROFIL:
				return fMAKomponenteSchienenprofil != null;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_STROMVERSORGUNG:
				return fMAKomponenteStromversorgung != null;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__FMA_KOMPONENTE_TYP:
				return fMAKomponenteTyp != null;
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_ENERGIE:
				return isSetIDEnergie();
			case OrtungPackage.FMA_KOMPONENTE_ACHSZAEHLPUNKT_ATTRIBUTE_GROUP__ID_INFORMATION:
				return isSetIDInformation();
			default:
				return super.eIsSet(featureID);
		}
	}

} //FMA_Komponente_Achszaehlpunkt_AttributeGroupImpl
