/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Anzeigetext_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdatei;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Einzeldatei_Art_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Konfigurationskennung_TypeClass;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Verwendung_TypeClass;

import org.eclipse.set.toolboxmodel.BasisTypen.Eigenschaften_Datei_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Datei Einzel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getAnzeigetext <em>Anzeigetext</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getEinzeldateiArt <em>Einzeldatei Art</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getKonfigurationskennung <em>Konfigurationskennung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_Einzel_AttributeGroupImpl#getVerwendung <em>Verwendung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Prog_Datei_Einzel_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Prog_Datei_Einzel_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAnzeigetext() <em>Anzeigetext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzeigetext()
	 * @generated
	 * @ordered
	 */
	protected Anzeigetext_TypeClass anzeigetext;

	/**
	 * The cached value of the '{@link #getEigenschaftenBinaerdatei() <em>Eigenschaften Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenschaftenBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected Eigenschaften_Datei_AttributeGroup eigenschaftenBinaerdatei;

	/**
	 * The cached value of the '{@link #getEinzeldateiArt() <em>Einzeldatei Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinzeldateiArt()
	 * @generated
	 * @ordered
	 */
	protected Einzeldatei_Art_TypeClass einzeldateiArt;

	/**
	 * The cached value of the '{@link #getIDBinaerdatei() <em>ID Binaerdatei</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdatei()
	 * @generated
	 * @ordered
	 */
	protected Binaerdatei iDBinaerdatei;

	/**
	 * This is true if the ID Binaerdatei reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBinaerdateiESet;

	/**
	 * The cached value of the '{@link #getKonfigurationskennung() <em>Konfigurationskennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonfigurationskennung()
	 * @generated
	 * @ordered
	 */
	protected Konfigurationskennung_TypeClass konfigurationskennung;

	/**
	 * The cached value of the '{@link #getVerwendung() <em>Verwendung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerwendung()
	 * @generated
	 * @ordered
	 */
	protected Verwendung_TypeClass verwendung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Prog_Datei_Einzel_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getProg_Datei_Einzel_AttributeGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anzeigetext_TypeClass getAnzeigetext() {
		return anzeigetext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnzeigetext(Anzeigetext_TypeClass newAnzeigetext, NotificationChain msgs) {
		Anzeigetext_TypeClass oldAnzeigetext = anzeigetext;
		anzeigetext = newAnzeigetext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, oldAnzeigetext, newAnzeigetext);
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
	public void setAnzeigetext(Anzeigetext_TypeClass newAnzeigetext) {
		if (newAnzeigetext != anzeigetext) {
			NotificationChain msgs = null;
			if (anzeigetext != null)
				msgs = ((InternalEObject)anzeigetext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, null, msgs);
			if (newAnzeigetext != null)
				msgs = ((InternalEObject)newAnzeigetext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, null, msgs);
			msgs = basicSetAnzeigetext(newAnzeigetext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT, newAnzeigetext, newAnzeigetext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdatei() {
		return eigenschaftenBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdatei, NotificationChain msgs) {
		Eigenschaften_Datei_AttributeGroup oldEigenschaftenBinaerdatei = eigenschaftenBinaerdatei;
		eigenschaftenBinaerdatei = newEigenschaftenBinaerdatei;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI, oldEigenschaftenBinaerdatei, newEigenschaftenBinaerdatei);
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
	public void setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdatei) {
		if (newEigenschaftenBinaerdatei != eigenschaftenBinaerdatei) {
			NotificationChain msgs = null;
			if (eigenschaftenBinaerdatei != null)
				msgs = ((InternalEObject)eigenschaftenBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI, null, msgs);
			if (newEigenschaftenBinaerdatei != null)
				msgs = ((InternalEObject)newEigenschaftenBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI, null, msgs);
			msgs = basicSetEigenschaftenBinaerdatei(newEigenschaftenBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI, newEigenschaftenBinaerdatei, newEigenschaftenBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Einzeldatei_Art_TypeClass getEinzeldateiArt() {
		return einzeldateiArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinzeldateiArt(Einzeldatei_Art_TypeClass newEinzeldateiArt, NotificationChain msgs) {
		Einzeldatei_Art_TypeClass oldEinzeldateiArt = einzeldateiArt;
		einzeldateiArt = newEinzeldateiArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, oldEinzeldateiArt, newEinzeldateiArt);
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
	public void setEinzeldateiArt(Einzeldatei_Art_TypeClass newEinzeldateiArt) {
		if (newEinzeldateiArt != einzeldateiArt) {
			NotificationChain msgs = null;
			if (einzeldateiArt != null)
				msgs = ((InternalEObject)einzeldateiArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, null, msgs);
			if (newEinzeldateiArt != null)
				msgs = ((InternalEObject)newEinzeldateiArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, null, msgs);
			msgs = basicSetEinzeldateiArt(newEinzeldateiArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART, newEinzeldateiArt, newEinzeldateiArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binaerdatei getIDBinaerdatei() {
		if (iDBinaerdatei != null && iDBinaerdatei.eIsProxy()) {
			InternalEObject oldIDBinaerdatei = (InternalEObject)iDBinaerdatei;
			iDBinaerdatei = (Binaerdatei)eResolveProxy(oldIDBinaerdatei);
			if (iDBinaerdatei != oldIDBinaerdatei) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, oldIDBinaerdatei, iDBinaerdatei));
			}
		}
		return iDBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binaerdatei basicGetIDBinaerdatei() {
		return iDBinaerdatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBinaerdatei(Binaerdatei newIDBinaerdatei) {
		Binaerdatei oldIDBinaerdatei = iDBinaerdatei;
		iDBinaerdatei = newIDBinaerdatei;
		boolean oldIDBinaerdateiESet = iDBinaerdateiESet;
		iDBinaerdateiESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, oldIDBinaerdatei, iDBinaerdatei, !oldIDBinaerdateiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBinaerdatei() {
		Binaerdatei oldIDBinaerdatei = iDBinaerdatei;
		boolean oldIDBinaerdateiESet = iDBinaerdateiESet;
		iDBinaerdatei = null;
		iDBinaerdateiESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI, oldIDBinaerdatei, null, oldIDBinaerdateiESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBinaerdatei() {
		return iDBinaerdateiESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Konfigurationskennung_TypeClass getKonfigurationskennung() {
		return konfigurationskennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKonfigurationskennung(Konfigurationskennung_TypeClass newKonfigurationskennung, NotificationChain msgs) {
		Konfigurationskennung_TypeClass oldKonfigurationskennung = konfigurationskennung;
		konfigurationskennung = newKonfigurationskennung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, oldKonfigurationskennung, newKonfigurationskennung);
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
	public void setKonfigurationskennung(Konfigurationskennung_TypeClass newKonfigurationskennung) {
		if (newKonfigurationskennung != konfigurationskennung) {
			NotificationChain msgs = null;
			if (konfigurationskennung != null)
				msgs = ((InternalEObject)konfigurationskennung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, null, msgs);
			if (newKonfigurationskennung != null)
				msgs = ((InternalEObject)newKonfigurationskennung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, null, msgs);
			msgs = basicSetKonfigurationskennung(newKonfigurationskennung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG, newKonfigurationskennung, newKonfigurationskennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Verwendung_TypeClass getVerwendung() {
		return verwendung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerwendung(Verwendung_TypeClass newVerwendung, NotificationChain msgs) {
		Verwendung_TypeClass oldVerwendung = verwendung;
		verwendung = newVerwendung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, oldVerwendung, newVerwendung);
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
	public void setVerwendung(Verwendung_TypeClass newVerwendung) {
		if (newVerwendung != verwendung) {
			NotificationChain msgs = null;
			if (verwendung != null)
				msgs = ((InternalEObject)verwendung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, null, msgs);
			if (newVerwendung != null)
				msgs = ((InternalEObject)newVerwendung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, null, msgs);
			msgs = basicSetVerwendung(newVerwendung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG, newVerwendung, newVerwendung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				return basicSetAnzeigetext(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI:
				return basicSetEigenschaftenBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				return basicSetEinzeldateiArt(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				return basicSetKonfigurationskennung(null, msgs);
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				return basicSetVerwendung(null, msgs);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				return getAnzeigetext();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI:
				return getEigenschaftenBinaerdatei();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				return getEinzeldateiArt();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				if (resolve) return getIDBinaerdatei();
				return basicGetIDBinaerdatei();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				return getKonfigurationskennung();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				return getVerwendung();
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				setAnzeigetext((Anzeigetext_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI:
				setEigenschaftenBinaerdatei((Eigenschaften_Datei_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				setEinzeldateiArt((Einzeldatei_Art_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				setIDBinaerdatei((Binaerdatei)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				setKonfigurationskennung((Konfigurationskennung_TypeClass)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				setVerwendung((Verwendung_TypeClass)newValue);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				setAnzeigetext((Anzeigetext_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI:
				setEigenschaftenBinaerdatei((Eigenschaften_Datei_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				setEinzeldateiArt((Einzeldatei_Art_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				unsetIDBinaerdatei();
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				setKonfigurationskennung((Konfigurationskennung_TypeClass)null);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				setVerwendung((Verwendung_TypeClass)null);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ANZEIGETEXT:
				return anzeigetext != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EIGENSCHAFTEN_BINAERDATEI:
				return eigenschaftenBinaerdatei != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__EINZELDATEI_ART:
				return einzeldateiArt != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__ID_BINAERDATEI:
				return isSetIDBinaerdatei();
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__KONFIGURATIONSKENNUNG:
				return konfigurationskennung != null;
			case Balisentechnik_ETCSPackage.PROG_DATEI_EINZEL_ATTRIBUTE_GROUP__VERWENDUNG:
				return verwendung != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Prog_Datei_Einzel_AttributeGroupImpl
