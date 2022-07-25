/**
 */
package org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Punkt_ObjektImpl;
import org.eclipse.set.toolboxmodel.Regelzeichnung.Regelzeichnung;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Besonderes_Fahrwegelement_TypeClass;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Kreuzung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Element;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;
import org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WKr Gsp Komponente</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl#getBesonderesFahrwegelement <em>Besonderes Fahrwegelement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl#getEntgleisungsschuh <em>Entgleisungsschuh</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl#getKreuzung <em>Kreuzung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Weichen_und_Gleissperren.impl.W_Kr_Gsp_KomponenteImpl#getZungenpaar <em>Zungenpaar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class W_Kr_Gsp_KomponenteImpl extends Punkt_ObjektImpl implements W_Kr_Gsp_Komponente {
	/**
	 * The cached value of the '{@link #getIDRegelzeichnung() <em>ID Regelzeichnung</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRegelzeichnung()
	 * @generated
	 * @ordered
	 */
	protected EList<Regelzeichnung> iDRegelzeichnung;

	/**
	 * The cached value of the '{@link #getIDWKrGspElement() <em>IDW Kr Gsp Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDWKrGspElement()
	 * @generated
	 * @ordered
	 */
	protected W_Kr_Gsp_Element iDWKrGspElement;

	/**
	 * This is true if the IDW Kr Gsp Element reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDWKrGspElementESet;

	/**
	 * The cached value of the '{@link #getBesonderesFahrwegelement() <em>Besonderes Fahrwegelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBesonderesFahrwegelement()
	 * @generated
	 * @ordered
	 */
	protected Besonderes_Fahrwegelement_TypeClass besonderesFahrwegelement;

	/**
	 * The cached value of the '{@link #getEntgleisungsschuh() <em>Entgleisungsschuh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntgleisungsschuh()
	 * @generated
	 * @ordered
	 */
	protected Entgleisungsschuh_AttributeGroup entgleisungsschuh;

	/**
	 * The cached value of the '{@link #getKreuzung() <em>Kreuzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKreuzung()
	 * @generated
	 * @ordered
	 */
	protected Kreuzung_AttributeGroup kreuzung;

	/**
	 * The cached value of the '{@link #getZungenpaar() <em>Zungenpaar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZungenpaar()
	 * @generated
	 * @ordered
	 */
	protected Zungenpaar_AttributeGroup zungenpaar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected W_Kr_Gsp_KomponenteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Weichen_und_GleissperrenPackage.Literals.WKR_GSP_KOMPONENTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Regelzeichnung> getIDRegelzeichnung() {
		if (iDRegelzeichnung == null) {
			iDRegelzeichnung = new EObjectResolvingEList<Regelzeichnung>(Regelzeichnung.class, this, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG);
		}
		return iDRegelzeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public W_Kr_Gsp_Element getIDWKrGspElement() {
		if (iDWKrGspElement != null && iDWKrGspElement.eIsProxy()) {
			InternalEObject oldIDWKrGspElement = (InternalEObject)iDWKrGspElement;
			iDWKrGspElement = (W_Kr_Gsp_Element)eResolveProxy(oldIDWKrGspElement);
			if (iDWKrGspElement != oldIDWKrGspElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, iDWKrGspElement));
			}
		}
		return iDWKrGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public W_Kr_Gsp_Element basicGetIDWKrGspElement() {
		return iDWKrGspElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDWKrGspElement(W_Kr_Gsp_Element newIDWKrGspElement) {
		W_Kr_Gsp_Element oldIDWKrGspElement = iDWKrGspElement;
		iDWKrGspElement = newIDWKrGspElement;
		boolean oldIDWKrGspElementESet = iDWKrGspElementESet;
		iDWKrGspElementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, iDWKrGspElement, !oldIDWKrGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDWKrGspElement() {
		W_Kr_Gsp_Element oldIDWKrGspElement = iDWKrGspElement;
		boolean oldIDWKrGspElementESet = iDWKrGspElementESet;
		iDWKrGspElement = null;
		iDWKrGspElementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT, oldIDWKrGspElement, null, oldIDWKrGspElementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDWKrGspElement() {
		return iDWKrGspElementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Besonderes_Fahrwegelement_TypeClass getBesonderesFahrwegelement() {
		return besonderesFahrwegelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBesonderesFahrwegelement(Besonderes_Fahrwegelement_TypeClass newBesonderesFahrwegelement, NotificationChain msgs) {
		Besonderes_Fahrwegelement_TypeClass oldBesonderesFahrwegelement = besonderesFahrwegelement;
		besonderesFahrwegelement = newBesonderesFahrwegelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT, oldBesonderesFahrwegelement, newBesonderesFahrwegelement);
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
	public void setBesonderesFahrwegelement(Besonderes_Fahrwegelement_TypeClass newBesonderesFahrwegelement) {
		if (newBesonderesFahrwegelement != besonderesFahrwegelement) {
			NotificationChain msgs = null;
			if (besonderesFahrwegelement != null)
				msgs = ((InternalEObject)besonderesFahrwegelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT, null, msgs);
			if (newBesonderesFahrwegelement != null)
				msgs = ((InternalEObject)newBesonderesFahrwegelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT, null, msgs);
			msgs = basicSetBesonderesFahrwegelement(newBesonderesFahrwegelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT, newBesonderesFahrwegelement, newBesonderesFahrwegelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entgleisungsschuh_AttributeGroup getEntgleisungsschuh() {
		return entgleisungsschuh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntgleisungsschuh(Entgleisungsschuh_AttributeGroup newEntgleisungsschuh, NotificationChain msgs) {
		Entgleisungsschuh_AttributeGroup oldEntgleisungsschuh = entgleisungsschuh;
		entgleisungsschuh = newEntgleisungsschuh;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH, oldEntgleisungsschuh, newEntgleisungsschuh);
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
	public void setEntgleisungsschuh(Entgleisungsschuh_AttributeGroup newEntgleisungsschuh) {
		if (newEntgleisungsschuh != entgleisungsschuh) {
			NotificationChain msgs = null;
			if (entgleisungsschuh != null)
				msgs = ((InternalEObject)entgleisungsschuh).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH, null, msgs);
			if (newEntgleisungsschuh != null)
				msgs = ((InternalEObject)newEntgleisungsschuh).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH, null, msgs);
			msgs = basicSetEntgleisungsschuh(newEntgleisungsschuh, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH, newEntgleisungsschuh, newEntgleisungsschuh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kreuzung_AttributeGroup getKreuzung() {
		return kreuzung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKreuzung(Kreuzung_AttributeGroup newKreuzung, NotificationChain msgs) {
		Kreuzung_AttributeGroup oldKreuzung = kreuzung;
		kreuzung = newKreuzung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG, oldKreuzung, newKreuzung);
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
	public void setKreuzung(Kreuzung_AttributeGroup newKreuzung) {
		if (newKreuzung != kreuzung) {
			NotificationChain msgs = null;
			if (kreuzung != null)
				msgs = ((InternalEObject)kreuzung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG, null, msgs);
			if (newKreuzung != null)
				msgs = ((InternalEObject)newKreuzung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG, null, msgs);
			msgs = basicSetKreuzung(newKreuzung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG, newKreuzung, newKreuzung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zungenpaar_AttributeGroup getZungenpaar() {
		return zungenpaar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZungenpaar(Zungenpaar_AttributeGroup newZungenpaar, NotificationChain msgs) {
		Zungenpaar_AttributeGroup oldZungenpaar = zungenpaar;
		zungenpaar = newZungenpaar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR, oldZungenpaar, newZungenpaar);
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
	public void setZungenpaar(Zungenpaar_AttributeGroup newZungenpaar) {
		if (newZungenpaar != zungenpaar) {
			NotificationChain msgs = null;
			if (zungenpaar != null)
				msgs = ((InternalEObject)zungenpaar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR, null, msgs);
			if (newZungenpaar != null)
				msgs = ((InternalEObject)newZungenpaar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR, null, msgs);
			msgs = basicSetZungenpaar(newZungenpaar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR, newZungenpaar, newZungenpaar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT:
				return basicSetBesonderesFahrwegelement(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH:
				return basicSetEntgleisungsschuh(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG:
				return basicSetKreuzung(null, msgs);
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR:
				return basicSetZungenpaar(null, msgs);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG:
				return getIDRegelzeichnung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT:
				if (resolve) return getIDWKrGspElement();
				return basicGetIDWKrGspElement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT:
				return getBesonderesFahrwegelement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH:
				return getEntgleisungsschuh();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG:
				return getKreuzung();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR:
				return getZungenpaar();
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG:
				getIDRegelzeichnung().clear();
				getIDRegelzeichnung().addAll((Collection<? extends Regelzeichnung>)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT:
				setIDWKrGspElement((W_Kr_Gsp_Element)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT:
				setBesonderesFahrwegelement((Besonderes_Fahrwegelement_TypeClass)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH:
				setEntgleisungsschuh((Entgleisungsschuh_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG:
				setKreuzung((Kreuzung_AttributeGroup)newValue);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR:
				setZungenpaar((Zungenpaar_AttributeGroup)newValue);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG:
				getIDRegelzeichnung().clear();
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT:
				unsetIDWKrGspElement();
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT:
				setBesonderesFahrwegelement((Besonderes_Fahrwegelement_TypeClass)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH:
				setEntgleisungsschuh((Entgleisungsschuh_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG:
				setKreuzung((Kreuzung_AttributeGroup)null);
				return;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR:
				setZungenpaar((Zungenpaar_AttributeGroup)null);
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
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ID_REGELZEICHNUNG:
				return iDRegelzeichnung != null && !iDRegelzeichnung.isEmpty();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__IDW_KR_GSP_ELEMENT:
				return isSetIDWKrGspElement();
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__BESONDERES_FAHRWEGELEMENT:
				return besonderesFahrwegelement != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ENTGLEISUNGSSCHUH:
				return entgleisungsschuh != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__KREUZUNG:
				return kreuzung != null;
			case Weichen_und_GleissperrenPackage.WKR_GSP_KOMPONENTE__ZUNGENPAAR:
				return zungenpaar != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //W_Kr_Gsp_KomponenteImpl
