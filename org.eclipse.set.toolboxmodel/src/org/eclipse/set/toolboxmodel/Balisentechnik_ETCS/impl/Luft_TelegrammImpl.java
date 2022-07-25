/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balise;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Binaerdatei;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Luft_Telegramm;

import org.eclipse.set.toolboxmodel.BasisTypen.Eigenschaften_Datei_AttributeGroup;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luft Telegramm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getEigenschaftenBinaerdateiHilfe <em>Eigenschaften Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDAnhangEADoku <em>ID Anhang EA Doku</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBaliseUebertragung <em>ID Balise Uebertragung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDBinaerdateiHilfe <em>ID Binaerdatei Hilfe</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Luft_TelegrammImpl#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Luft_TelegrammImpl extends Basis_ObjektImpl implements Luft_Telegramm {
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
	 * The cached value of the '{@link #getEigenschaftenBinaerdateiHilfe() <em>Eigenschaften Binaerdatei Hilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEigenschaftenBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected Eigenschaften_Datei_AttributeGroup eigenschaftenBinaerdateiHilfe;

	/**
	 * The cached value of the '{@link #getIDAnhangEADoku() <em>ID Anhang EA Doku</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangEADoku()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangEADoku;

	/**
	 * This is true if the ID Anhang EA Doku reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangEADokuESet;

	/**
	 * The cached value of the '{@link #getIDBaliseUebertragung() <em>ID Balise Uebertragung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBaliseUebertragung()
	 * @generated
	 * @ordered
	 */
	protected Balise iDBaliseUebertragung;

	/**
	 * This is true if the ID Balise Uebertragung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBaliseUebertragungESet;

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
	 * The cached value of the '{@link #getIDBinaerdateiHilfe() <em>ID Binaerdatei Hilfe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBinaerdateiHilfe()
	 * @generated
	 * @ordered
	 */
	protected Binaerdatei iDBinaerdateiHilfe;

	/**
	 * This is true if the ID Binaerdatei Hilfe reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBinaerdateiHilfeESet;

	/**
	 * The cached value of the '{@link #getIDFachtelegramm() <em>ID Fachtelegramm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDFachtelegramm()
	 * @generated
	 * @ordered
	 */
	protected Fachtelegramm iDFachtelegramm;

	/**
	 * This is true if the ID Fachtelegramm reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDFachtelegrammESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Luft_TelegrammImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getLuft_Telegramm();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, oldEigenschaftenBinaerdatei, newEigenschaftenBinaerdatei);
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
				msgs = ((InternalEObject)eigenschaftenBinaerdatei).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, null, msgs);
			if (newEigenschaftenBinaerdatei != null)
				msgs = ((InternalEObject)newEigenschaftenBinaerdatei).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, null, msgs);
			msgs = basicSetEigenschaftenBinaerdatei(newEigenschaftenBinaerdatei, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI, newEigenschaftenBinaerdatei, newEigenschaftenBinaerdatei));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdateiHilfe() {
		return eigenschaftenBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdateiHilfe, NotificationChain msgs) {
		Eigenschaften_Datei_AttributeGroup oldEigenschaftenBinaerdateiHilfe = eigenschaftenBinaerdateiHilfe;
		eigenschaftenBinaerdateiHilfe = newEigenschaftenBinaerdateiHilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, oldEigenschaftenBinaerdateiHilfe, newEigenschaftenBinaerdateiHilfe);
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
	public void setEigenschaftenBinaerdateiHilfe(Eigenschaften_Datei_AttributeGroup newEigenschaftenBinaerdateiHilfe) {
		if (newEigenschaftenBinaerdateiHilfe != eigenschaftenBinaerdateiHilfe) {
			NotificationChain msgs = null;
			if (eigenschaftenBinaerdateiHilfe != null)
				msgs = ((InternalEObject)eigenschaftenBinaerdateiHilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, null, msgs);
			if (newEigenschaftenBinaerdateiHilfe != null)
				msgs = ((InternalEObject)newEigenschaftenBinaerdateiHilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, null, msgs);
			msgs = basicSetEigenschaftenBinaerdateiHilfe(newEigenschaftenBinaerdateiHilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE, newEigenschaftenBinaerdateiHilfe, newEigenschaftenBinaerdateiHilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangEADoku() {
		if (iDAnhangEADoku != null && iDAnhangEADoku.eIsProxy()) {
			InternalEObject oldIDAnhangEADoku = (InternalEObject)iDAnhangEADoku;
			iDAnhangEADoku = (Anhang)eResolveProxy(oldIDAnhangEADoku);
			if (iDAnhangEADoku != oldIDAnhangEADoku) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, iDAnhangEADoku));
			}
		}
		return iDAnhangEADoku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangEADoku() {
		return iDAnhangEADoku;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangEADoku(Anhang newIDAnhangEADoku) {
		Anhang oldIDAnhangEADoku = iDAnhangEADoku;
		iDAnhangEADoku = newIDAnhangEADoku;
		boolean oldIDAnhangEADokuESet = iDAnhangEADokuESet;
		iDAnhangEADokuESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, iDAnhangEADoku, !oldIDAnhangEADokuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangEADoku() {
		Anhang oldIDAnhangEADoku = iDAnhangEADoku;
		boolean oldIDAnhangEADokuESet = iDAnhangEADokuESet;
		iDAnhangEADoku = null;
		iDAnhangEADokuESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU, oldIDAnhangEADoku, null, oldIDAnhangEADokuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangEADoku() {
		return iDAnhangEADokuESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Balise getIDBaliseUebertragung() {
		if (iDBaliseUebertragung != null && iDBaliseUebertragung.eIsProxy()) {
			InternalEObject oldIDBaliseUebertragung = (InternalEObject)iDBaliseUebertragung;
			iDBaliseUebertragung = (Balise)eResolveProxy(oldIDBaliseUebertragung);
			if (iDBaliseUebertragung != oldIDBaliseUebertragung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, iDBaliseUebertragung));
			}
		}
		return iDBaliseUebertragung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balise basicGetIDBaliseUebertragung() {
		return iDBaliseUebertragung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBaliseUebertragung(Balise newIDBaliseUebertragung) {
		Balise oldIDBaliseUebertragung = iDBaliseUebertragung;
		iDBaliseUebertragung = newIDBaliseUebertragung;
		boolean oldIDBaliseUebertragungESet = iDBaliseUebertragungESet;
		iDBaliseUebertragungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, iDBaliseUebertragung, !oldIDBaliseUebertragungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBaliseUebertragung() {
		Balise oldIDBaliseUebertragung = iDBaliseUebertragung;
		boolean oldIDBaliseUebertragungESet = iDBaliseUebertragungESet;
		iDBaliseUebertragung = null;
		iDBaliseUebertragungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG, oldIDBaliseUebertragung, null, oldIDBaliseUebertragungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBaliseUebertragung() {
		return iDBaliseUebertragungESet;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, oldIDBinaerdatei, iDBinaerdatei));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, oldIDBinaerdatei, iDBinaerdatei, !oldIDBinaerdateiESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI, oldIDBinaerdatei, null, oldIDBinaerdateiESet));
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
	public Binaerdatei getIDBinaerdateiHilfe() {
		if (iDBinaerdateiHilfe != null && iDBinaerdateiHilfe.eIsProxy()) {
			InternalEObject oldIDBinaerdateiHilfe = (InternalEObject)iDBinaerdateiHilfe;
			iDBinaerdateiHilfe = (Binaerdatei)eResolveProxy(oldIDBinaerdateiHilfe);
			if (iDBinaerdateiHilfe != oldIDBinaerdateiHilfe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, iDBinaerdateiHilfe));
			}
		}
		return iDBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binaerdatei basicGetIDBinaerdateiHilfe() {
		return iDBinaerdateiHilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBinaerdateiHilfe(Binaerdatei newIDBinaerdateiHilfe) {
		Binaerdatei oldIDBinaerdateiHilfe = iDBinaerdateiHilfe;
		iDBinaerdateiHilfe = newIDBinaerdateiHilfe;
		boolean oldIDBinaerdateiHilfeESet = iDBinaerdateiHilfeESet;
		iDBinaerdateiHilfeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, iDBinaerdateiHilfe, !oldIDBinaerdateiHilfeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBinaerdateiHilfe() {
		Binaerdatei oldIDBinaerdateiHilfe = iDBinaerdateiHilfe;
		boolean oldIDBinaerdateiHilfeESet = iDBinaerdateiHilfeESet;
		iDBinaerdateiHilfe = null;
		iDBinaerdateiHilfeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE, oldIDBinaerdateiHilfe, null, oldIDBinaerdateiHilfeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBinaerdateiHilfe() {
		return iDBinaerdateiHilfeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fachtelegramm getIDFachtelegramm() {
		if (iDFachtelegramm != null && iDFachtelegramm.eIsProxy()) {
			InternalEObject oldIDFachtelegramm = (InternalEObject)iDFachtelegramm;
			iDFachtelegramm = (Fachtelegramm)eResolveProxy(oldIDFachtelegramm);
			if (iDFachtelegramm != oldIDFachtelegramm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, iDFachtelegramm));
			}
		}
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fachtelegramm basicGetIDFachtelegramm() {
		return iDFachtelegramm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDFachtelegramm(Fachtelegramm newIDFachtelegramm) {
		Fachtelegramm oldIDFachtelegramm = iDFachtelegramm;
		iDFachtelegramm = newIDFachtelegramm;
		boolean oldIDFachtelegrammESet = iDFachtelegrammESet;
		iDFachtelegrammESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, iDFachtelegramm, !oldIDFachtelegrammESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDFachtelegramm() {
		Fachtelegramm oldIDFachtelegramm = iDFachtelegramm;
		boolean oldIDFachtelegrammESet = iDFachtelegrammESet;
		iDFachtelegramm = null;
		iDFachtelegrammESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM, oldIDFachtelegramm, null, oldIDFachtelegrammESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDFachtelegramm() {
		return iDFachtelegrammESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				return basicSetEigenschaftenBinaerdatei(null, msgs);
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				return basicSetEigenschaftenBinaerdateiHilfe(null, msgs);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				return getEigenschaftenBinaerdatei();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				return getEigenschaftenBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				if (resolve) return getIDAnhangEADoku();
				return basicGetIDAnhangEADoku();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				if (resolve) return getIDBaliseUebertragung();
				return basicGetIDBaliseUebertragung();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				if (resolve) return getIDBinaerdatei();
				return basicGetIDBinaerdatei();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				if (resolve) return getIDBinaerdateiHilfe();
				return basicGetIDBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				if (resolve) return getIDFachtelegramm();
				return basicGetIDFachtelegramm();
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				setEigenschaftenBinaerdatei((Eigenschaften_Datei_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				setEigenschaftenBinaerdateiHilfe((Eigenschaften_Datei_AttributeGroup)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				setIDAnhangEADoku((Anhang)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				setIDBaliseUebertragung((Balise)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				setIDBinaerdatei((Binaerdatei)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				setIDBinaerdateiHilfe((Binaerdatei)newValue);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				setIDFachtelegramm((Fachtelegramm)newValue);
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				setEigenschaftenBinaerdatei((Eigenschaften_Datei_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				setEigenschaftenBinaerdateiHilfe((Eigenschaften_Datei_AttributeGroup)null);
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				unsetIDAnhangEADoku();
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				unsetIDBaliseUebertragung();
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				unsetIDBinaerdatei();
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				unsetIDBinaerdateiHilfe();
				return;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				unsetIDFachtelegramm();
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
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI:
				return eigenschaftenBinaerdatei != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__EIGENSCHAFTEN_BINAERDATEI_HILFE:
				return eigenschaftenBinaerdateiHilfe != null;
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_ANHANG_EA_DOKU:
				return isSetIDAnhangEADoku();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BALISE_UEBERTRAGUNG:
				return isSetIDBaliseUebertragung();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI:
				return isSetIDBinaerdatei();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_BINAERDATEI_HILFE:
				return isSetIDBinaerdateiHilfe();
			case Balisentechnik_ETCSPackage.LUFT_TELEGRAMM__ID_FACHTELEGRAMM:
				return isSetIDFachtelegramm();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Luft_TelegrammImpl
