/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_Fahrweg_Teil_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Start_W_Element_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Ziel_W_Element_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT Fahrweg Teil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getFTFahrwegTeilAllg <em>FT Fahrweg Teil Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDZielDatenpunkt <em>ID Ziel Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDZielSignal <em>ID Ziel Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getZielWElement <em>Ziel WElement</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDStartDatenpunkt <em>ID Start Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getIDStartSignal <em>ID Start Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.FT_Fahrweg_TeilImpl#getStartWElement <em>Start WElement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT_Fahrweg_TeilImpl extends Basis_ObjektImpl implements FT_Fahrweg_Teil {
	/**
	 * The cached value of the '{@link #getFTFahrwegTeilAllg() <em>FT Fahrweg Teil Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTFahrwegTeilAllg()
	 * @generated
	 * @ordered
	 */
	protected FT_Fahrweg_Teil_Allg_AttributeGroup fTFahrwegTeilAllg;

	/**
	 * The cached value of the '{@link #getIDZielDatenpunkt() <em>ID Ziel Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZielDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt iDZielDatenpunkt;

	/**
	 * This is true if the ID Ziel Datenpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZielDatenpunktESet;

	/**
	 * The cached value of the '{@link #getIDZielSignal() <em>ID Ziel Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZielSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDZielSignal;

	/**
	 * This is true if the ID Ziel Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZielSignalESet;

	/**
	 * The cached value of the '{@link #getZielWElement() <em>Ziel WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZielWElement()
	 * @generated
	 * @ordered
	 */
	protected Ziel_W_Element_AttributeGroup zielWElement;

	/**
	 * The cached value of the '{@link #getIDStartDatenpunkt() <em>ID Start Datenpunkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStartDatenpunkt()
	 * @generated
	 * @ordered
	 */
	protected Datenpunkt iDStartDatenpunkt;

	/**
	 * This is true if the ID Start Datenpunkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStartDatenpunktESet;

	/**
	 * The cached value of the '{@link #getIDStartSignal() <em>ID Start Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDStartSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDStartSignal;

	/**
	 * This is true if the ID Start Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDStartSignalESet;

	/**
	 * The cached value of the '{@link #getStartWElement() <em>Start WElement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartWElement()
	 * @generated
	 * @ordered
	 */
	protected Start_W_Element_AttributeGroup startWElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FT_Fahrweg_TeilImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getFT_Fahrweg_Teil();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FT_Fahrweg_Teil_Allg_AttributeGroup getFTFahrwegTeilAllg() {
		return fTFahrwegTeilAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTFahrwegTeilAllg(FT_Fahrweg_Teil_Allg_AttributeGroup newFTFahrwegTeilAllg, NotificationChain msgs) {
		FT_Fahrweg_Teil_Allg_AttributeGroup oldFTFahrwegTeilAllg = fTFahrwegTeilAllg;
		fTFahrwegTeilAllg = newFTFahrwegTeilAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, oldFTFahrwegTeilAllg, newFTFahrwegTeilAllg);
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
	public void setFTFahrwegTeilAllg(FT_Fahrweg_Teil_Allg_AttributeGroup newFTFahrwegTeilAllg) {
		if (newFTFahrwegTeilAllg != fTFahrwegTeilAllg) {
			NotificationChain msgs = null;
			if (fTFahrwegTeilAllg != null)
				msgs = ((InternalEObject)fTFahrwegTeilAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, null, msgs);
			if (newFTFahrwegTeilAllg != null)
				msgs = ((InternalEObject)newFTFahrwegTeilAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, null, msgs);
			msgs = basicSetFTFahrwegTeilAllg(newFTFahrwegTeilAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG, newFTFahrwegTeilAllg, newFTFahrwegTeilAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt getIDZielDatenpunkt() {
		if (iDZielDatenpunkt != null && iDZielDatenpunkt.eIsProxy()) {
			InternalEObject oldIDZielDatenpunkt = (InternalEObject)iDZielDatenpunkt;
			iDZielDatenpunkt = (Datenpunkt)eResolveProxy(oldIDZielDatenpunkt);
			if (iDZielDatenpunkt != oldIDZielDatenpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, oldIDZielDatenpunkt, iDZielDatenpunkt));
			}
		}
		return iDZielDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenpunkt basicGetIDZielDatenpunkt() {
		return iDZielDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZielDatenpunkt(Datenpunkt newIDZielDatenpunkt) {
		Datenpunkt oldIDZielDatenpunkt = iDZielDatenpunkt;
		iDZielDatenpunkt = newIDZielDatenpunkt;
		boolean oldIDZielDatenpunktESet = iDZielDatenpunktESet;
		iDZielDatenpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, oldIDZielDatenpunkt, iDZielDatenpunkt, !oldIDZielDatenpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZielDatenpunkt() {
		Datenpunkt oldIDZielDatenpunkt = iDZielDatenpunkt;
		boolean oldIDZielDatenpunktESet = iDZielDatenpunktESet;
		iDZielDatenpunkt = null;
		iDZielDatenpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT, oldIDZielDatenpunkt, null, oldIDZielDatenpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZielDatenpunkt() {
		return iDZielDatenpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDZielSignal() {
		if (iDZielSignal != null && iDZielSignal.eIsProxy()) {
			InternalEObject oldIDZielSignal = (InternalEObject)iDZielSignal;
			iDZielSignal = (Signal)eResolveProxy(oldIDZielSignal);
			if (iDZielSignal != oldIDZielSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, oldIDZielSignal, iDZielSignal));
			}
		}
		return iDZielSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDZielSignal() {
		return iDZielSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZielSignal(Signal newIDZielSignal) {
		Signal oldIDZielSignal = iDZielSignal;
		iDZielSignal = newIDZielSignal;
		boolean oldIDZielSignalESet = iDZielSignalESet;
		iDZielSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, oldIDZielSignal, iDZielSignal, !oldIDZielSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZielSignal() {
		Signal oldIDZielSignal = iDZielSignal;
		boolean oldIDZielSignalESet = iDZielSignalESet;
		iDZielSignal = null;
		iDZielSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL, oldIDZielSignal, null, oldIDZielSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZielSignal() {
		return iDZielSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ziel_W_Element_AttributeGroup getZielWElement() {
		return zielWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZielWElement(Ziel_W_Element_AttributeGroup newZielWElement, NotificationChain msgs) {
		Ziel_W_Element_AttributeGroup oldZielWElement = zielWElement;
		zielWElement = newZielWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, oldZielWElement, newZielWElement);
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
	public void setZielWElement(Ziel_W_Element_AttributeGroup newZielWElement) {
		if (newZielWElement != zielWElement) {
			NotificationChain msgs = null;
			if (zielWElement != null)
				msgs = ((InternalEObject)zielWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, null, msgs);
			if (newZielWElement != null)
				msgs = ((InternalEObject)newZielWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, null, msgs);
			msgs = basicSetZielWElement(newZielWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT, newZielWElement, newZielWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Datenpunkt getIDStartDatenpunkt() {
		if (iDStartDatenpunkt != null && iDStartDatenpunkt.eIsProxy()) {
			InternalEObject oldIDStartDatenpunkt = (InternalEObject)iDStartDatenpunkt;
			iDStartDatenpunkt = (Datenpunkt)eResolveProxy(oldIDStartDatenpunkt);
			if (iDStartDatenpunkt != oldIDStartDatenpunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, oldIDStartDatenpunkt, iDStartDatenpunkt));
			}
		}
		return iDStartDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datenpunkt basicGetIDStartDatenpunkt() {
		return iDStartDatenpunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStartDatenpunkt(Datenpunkt newIDStartDatenpunkt) {
		Datenpunkt oldIDStartDatenpunkt = iDStartDatenpunkt;
		iDStartDatenpunkt = newIDStartDatenpunkt;
		boolean oldIDStartDatenpunktESet = iDStartDatenpunktESet;
		iDStartDatenpunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, oldIDStartDatenpunkt, iDStartDatenpunkt, !oldIDStartDatenpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStartDatenpunkt() {
		Datenpunkt oldIDStartDatenpunkt = iDStartDatenpunkt;
		boolean oldIDStartDatenpunktESet = iDStartDatenpunktESet;
		iDStartDatenpunkt = null;
		iDStartDatenpunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT, oldIDStartDatenpunkt, null, oldIDStartDatenpunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStartDatenpunkt() {
		return iDStartDatenpunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDStartSignal() {
		if (iDStartSignal != null && iDStartSignal.eIsProxy()) {
			InternalEObject oldIDStartSignal = (InternalEObject)iDStartSignal;
			iDStartSignal = (Signal)eResolveProxy(oldIDStartSignal);
			if (iDStartSignal != oldIDStartSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, oldIDStartSignal, iDStartSignal));
			}
		}
		return iDStartSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDStartSignal() {
		return iDStartSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDStartSignal(Signal newIDStartSignal) {
		Signal oldIDStartSignal = iDStartSignal;
		iDStartSignal = newIDStartSignal;
		boolean oldIDStartSignalESet = iDStartSignalESet;
		iDStartSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, oldIDStartSignal, iDStartSignal, !oldIDStartSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDStartSignal() {
		Signal oldIDStartSignal = iDStartSignal;
		boolean oldIDStartSignalESet = iDStartSignalESet;
		iDStartSignal = null;
		iDStartSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL, oldIDStartSignal, null, oldIDStartSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDStartSignal() {
		return iDStartSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_W_Element_AttributeGroup getStartWElement() {
		return startWElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartWElement(Start_W_Element_AttributeGroup newStartWElement, NotificationChain msgs) {
		Start_W_Element_AttributeGroup oldStartWElement = startWElement;
		startWElement = newStartWElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, oldStartWElement, newStartWElement);
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
	public void setStartWElement(Start_W_Element_AttributeGroup newStartWElement) {
		if (newStartWElement != startWElement) {
			NotificationChain msgs = null;
			if (startWElement != null)
				msgs = ((InternalEObject)startWElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, null, msgs);
			if (newStartWElement != null)
				msgs = ((InternalEObject)newStartWElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, null, msgs);
			msgs = basicSetStartWElement(newStartWElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT, newStartWElement, newStartWElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				return basicSetFTFahrwegTeilAllg(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				return basicSetZielWElement(null, msgs);
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				return basicSetStartWElement(null, msgs);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				return getFTFahrwegTeilAllg();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				if (resolve) return getIDZielDatenpunkt();
				return basicGetIDZielDatenpunkt();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				if (resolve) return getIDZielSignal();
				return basicGetIDZielSignal();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				return getZielWElement();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				if (resolve) return getIDStartDatenpunkt();
				return basicGetIDStartDatenpunkt();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				if (resolve) return getIDStartSignal();
				return basicGetIDStartSignal();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				return getStartWElement();
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				setFTFahrwegTeilAllg((FT_Fahrweg_Teil_Allg_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				setIDZielDatenpunkt((Datenpunkt)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				setIDZielSignal((Signal)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				setZielWElement((Ziel_W_Element_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				setIDStartDatenpunkt((Datenpunkt)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				setIDStartSignal((Signal)newValue);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				setStartWElement((Start_W_Element_AttributeGroup)newValue);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				setFTFahrwegTeilAllg((FT_Fahrweg_Teil_Allg_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				unsetIDZielDatenpunkt();
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				unsetIDZielSignal();
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				setZielWElement((Ziel_W_Element_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				unsetIDStartDatenpunkt();
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				unsetIDStartSignal();
				return;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				setStartWElement((Start_W_Element_AttributeGroup)null);
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
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__FT_FAHRWEG_TEIL_ALLG:
				return fTFahrwegTeilAllg != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_DATENPUNKT:
				return isSetIDZielDatenpunkt();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_ZIEL_SIGNAL:
				return isSetIDZielSignal();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ZIEL_WELEMENT:
				return zielWElement != null;
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_DATENPUNKT:
				return isSetIDStartDatenpunkt();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__ID_START_SIGNAL:
				return isSetIDStartSignal();
			case Balisentechnik_ETCSPackage.FT_FAHRWEG_TEIL__START_WELEMENT:
				return startWElement != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //FT_Fahrweg_TeilImpl
