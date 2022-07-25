/**
 */
package org.eclipse.set.toolboxmodel.Block.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Bedienung.Bedien_Anzeige_Element;
import org.eclipse.set.toolboxmodel.Block.BlockPackage;
import org.eclipse.set.toolboxmodel.Block.Block_Element;
import org.eclipse.set.toolboxmodel.Block.Block_Element_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Block.Block_Element_Erlaubnis_AttributeGroup;
import org.eclipse.set.toolboxmodel.Block.Block_Strecke;
import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_ElementImpl#getBlockElementAllg <em>Block Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_ElementImpl#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_ElementImpl#getIDBlockStrecke <em>ID Block Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_ElementImpl#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_ElementImpl#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Block.impl.Block_ElementImpl#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Block_ElementImpl extends Basis_ObjektImpl implements Block_Element {
	/**
	 * The cached value of the '{@link #getBlockElementAllg() <em>Block Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElementAllg()
	 * @generated
	 * @ordered
	 */
	protected Block_Element_Allg_AttributeGroup blockElementAllg;

	/**
	 * The cached value of the '{@link #getBlockElementErlaubnis() <em>Block Element Erlaubnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockElementErlaubnis()
	 * @generated
	 * @ordered
	 */
	protected Block_Element_Erlaubnis_AttributeGroup blockElementErlaubnis;

	/**
	 * The cached value of the '{@link #getIDBlockStrecke() <em>ID Block Strecke</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBlockStrecke()
	 * @generated
	 * @ordered
	 */
	protected Block_Strecke iDBlockStrecke;

	/**
	 * This is true if the ID Block Strecke reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBlockStreckeESet;

	/**
	 * The cached value of the '{@link #getIDRaeumungspruefung() <em>ID Raeumungspruefung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDRaeumungspruefung()
	 * @generated
	 * @ordered
	 */
	protected Schaltmittel_Zuordnung iDRaeumungspruefung;

	/**
	 * This is true if the ID Raeumungspruefung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDRaeumungspruefungESet;

	/**
	 * The cached value of the '{@link #getIDSignal() <em>ID Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignal()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignal;

	/**
	 * This is true if the ID Signal reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalESet;

	/**
	 * The cached value of the '{@link #getIDZugschlussmeldung() <em>ID Zugschlussmeldung</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZugschlussmeldung()
	 * @generated
	 * @ordered
	 */
	protected Bedien_Anzeige_Element iDZugschlussmeldung;

	/**
	 * This is true if the ID Zugschlussmeldung reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZugschlussmeldungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Block_ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BlockPackage.Literals.BLOCK_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element_Allg_AttributeGroup getBlockElementAllg() {
		return blockElementAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockElementAllg(Block_Element_Allg_AttributeGroup newBlockElementAllg, NotificationChain msgs) {
		Block_Element_Allg_AttributeGroup oldBlockElementAllg = blockElementAllg;
		blockElementAllg = newBlockElementAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, oldBlockElementAllg, newBlockElementAllg);
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
	public void setBlockElementAllg(Block_Element_Allg_AttributeGroup newBlockElementAllg) {
		if (newBlockElementAllg != blockElementAllg) {
			NotificationChain msgs = null;
			if (blockElementAllg != null)
				msgs = ((InternalEObject)blockElementAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, null, msgs);
			if (newBlockElementAllg != null)
				msgs = ((InternalEObject)newBlockElementAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, null, msgs);
			msgs = basicSetBlockElementAllg(newBlockElementAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG, newBlockElementAllg, newBlockElementAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Element_Erlaubnis_AttributeGroup getBlockElementErlaubnis() {
		return blockElementErlaubnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup newBlockElementErlaubnis, NotificationChain msgs) {
		Block_Element_Erlaubnis_AttributeGroup oldBlockElementErlaubnis = blockElementErlaubnis;
		blockElementErlaubnis = newBlockElementErlaubnis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, oldBlockElementErlaubnis, newBlockElementErlaubnis);
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
	public void setBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup newBlockElementErlaubnis) {
		if (newBlockElementErlaubnis != blockElementErlaubnis) {
			NotificationChain msgs = null;
			if (blockElementErlaubnis != null)
				msgs = ((InternalEObject)blockElementErlaubnis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, null, msgs);
			if (newBlockElementErlaubnis != null)
				msgs = ((InternalEObject)newBlockElementErlaubnis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, null, msgs);
			msgs = basicSetBlockElementErlaubnis(newBlockElementErlaubnis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS, newBlockElementErlaubnis, newBlockElementErlaubnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Block_Strecke getIDBlockStrecke() {
		if (iDBlockStrecke != null && iDBlockStrecke.eIsProxy()) {
			InternalEObject oldIDBlockStrecke = (InternalEObject)iDBlockStrecke;
			iDBlockStrecke = (Block_Strecke)eResolveProxy(oldIDBlockStrecke);
			if (iDBlockStrecke != oldIDBlockStrecke) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, oldIDBlockStrecke, iDBlockStrecke));
			}
		}
		return iDBlockStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_Strecke basicGetIDBlockStrecke() {
		return iDBlockStrecke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBlockStrecke(Block_Strecke newIDBlockStrecke) {
		Block_Strecke oldIDBlockStrecke = iDBlockStrecke;
		iDBlockStrecke = newIDBlockStrecke;
		boolean oldIDBlockStreckeESet = iDBlockStreckeESet;
		iDBlockStreckeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, oldIDBlockStrecke, iDBlockStrecke, !oldIDBlockStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBlockStrecke() {
		Block_Strecke oldIDBlockStrecke = iDBlockStrecke;
		boolean oldIDBlockStreckeESet = iDBlockStreckeESet;
		iDBlockStrecke = null;
		iDBlockStreckeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE, oldIDBlockStrecke, null, oldIDBlockStreckeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBlockStrecke() {
		return iDBlockStreckeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Zuordnung getIDRaeumungspruefung() {
		if (iDRaeumungspruefung != null && iDRaeumungspruefung.eIsProxy()) {
			InternalEObject oldIDRaeumungspruefung = (InternalEObject)iDRaeumungspruefung;
			iDRaeumungspruefung = (Schaltmittel_Zuordnung)eResolveProxy(oldIDRaeumungspruefung);
			if (iDRaeumungspruefung != oldIDRaeumungspruefung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, oldIDRaeumungspruefung, iDRaeumungspruefung));
			}
		}
		return iDRaeumungspruefung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schaltmittel_Zuordnung basicGetIDRaeumungspruefung() {
		return iDRaeumungspruefung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDRaeumungspruefung(Schaltmittel_Zuordnung newIDRaeumungspruefung) {
		Schaltmittel_Zuordnung oldIDRaeumungspruefung = iDRaeumungspruefung;
		iDRaeumungspruefung = newIDRaeumungspruefung;
		boolean oldIDRaeumungspruefungESet = iDRaeumungspruefungESet;
		iDRaeumungspruefungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, oldIDRaeumungspruefung, iDRaeumungspruefung, !oldIDRaeumungspruefungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDRaeumungspruefung() {
		Schaltmittel_Zuordnung oldIDRaeumungspruefung = iDRaeumungspruefung;
		boolean oldIDRaeumungspruefungESet = iDRaeumungspruefungESet;
		iDRaeumungspruefung = null;
		iDRaeumungspruefungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG, oldIDRaeumungspruefung, null, oldIDRaeumungspruefungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDRaeumungspruefung() {
		return iDRaeumungspruefungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignal() {
		if (iDSignal != null && iDSignal.eIsProxy()) {
			InternalEObject oldIDSignal = (InternalEObject)iDSignal;
			iDSignal = (Signal)eResolveProxy(oldIDSignal);
			if (iDSignal != oldIDSignal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, oldIDSignal, iDSignal));
			}
		}
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignal() {
		return iDSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignal(Signal newIDSignal) {
		Signal oldIDSignal = iDSignal;
		iDSignal = newIDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, oldIDSignal, iDSignal, !oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignal() {
		Signal oldIDSignal = iDSignal;
		boolean oldIDSignalESet = iDSignalESet;
		iDSignal = null;
		iDSignalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ELEMENT__ID_SIGNAL, oldIDSignal, null, oldIDSignalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignal() {
		return iDSignalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bedien_Anzeige_Element getIDZugschlussmeldung() {
		if (iDZugschlussmeldung != null && iDZugschlussmeldung.eIsProxy()) {
			InternalEObject oldIDZugschlussmeldung = (InternalEObject)iDZugschlussmeldung;
			iDZugschlussmeldung = (Bedien_Anzeige_Element)eResolveProxy(oldIDZugschlussmeldung);
			if (iDZugschlussmeldung != oldIDZugschlussmeldung) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, oldIDZugschlussmeldung, iDZugschlussmeldung));
			}
		}
		return iDZugschlussmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bedien_Anzeige_Element basicGetIDZugschlussmeldung() {
		return iDZugschlussmeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZugschlussmeldung(Bedien_Anzeige_Element newIDZugschlussmeldung) {
		Bedien_Anzeige_Element oldIDZugschlussmeldung = iDZugschlussmeldung;
		iDZugschlussmeldung = newIDZugschlussmeldung;
		boolean oldIDZugschlussmeldungESet = iDZugschlussmeldungESet;
		iDZugschlussmeldungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, oldIDZugschlussmeldung, iDZugschlussmeldung, !oldIDZugschlussmeldungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZugschlussmeldung() {
		Bedien_Anzeige_Element oldIDZugschlussmeldung = iDZugschlussmeldung;
		boolean oldIDZugschlussmeldungESet = iDZugschlussmeldungESet;
		iDZugschlussmeldung = null;
		iDZugschlussmeldungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG, oldIDZugschlussmeldung, null, oldIDZugschlussmeldungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZugschlussmeldung() {
		return iDZugschlussmeldungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				return basicSetBlockElementAllg(null, msgs);
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				return basicSetBlockElementErlaubnis(null, msgs);
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				return getBlockElementAllg();
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				return getBlockElementErlaubnis();
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				if (resolve) return getIDBlockStrecke();
				return basicGetIDBlockStrecke();
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				if (resolve) return getIDRaeumungspruefung();
				return basicGetIDRaeumungspruefung();
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				if (resolve) return getIDSignal();
				return basicGetIDSignal();
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				if (resolve) return getIDZugschlussmeldung();
				return basicGetIDZugschlussmeldung();
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				setBlockElementAllg((Block_Element_Allg_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				setBlockElementErlaubnis((Block_Element_Erlaubnis_AttributeGroup)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				setIDBlockStrecke((Block_Strecke)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				setIDRaeumungspruefung((Schaltmittel_Zuordnung)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				setIDSignal((Signal)newValue);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				setIDZugschlussmeldung((Bedien_Anzeige_Element)newValue);
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				setBlockElementAllg((Block_Element_Allg_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				setBlockElementErlaubnis((Block_Element_Erlaubnis_AttributeGroup)null);
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				unsetIDBlockStrecke();
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				unsetIDRaeumungspruefung();
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				unsetIDSignal();
				return;
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				unsetIDZugschlussmeldung();
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
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
				return blockElementAllg != null;
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
				return blockElementErlaubnis != null;
			case BlockPackage.BLOCK_ELEMENT__ID_BLOCK_STRECKE:
				return isSetIDBlockStrecke();
			case BlockPackage.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG:
				return isSetIDRaeumungspruefung();
			case BlockPackage.BLOCK_ELEMENT__ID_SIGNAL:
				return isSetIDSignal();
			case BlockPackage.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG:
				return isSetIDZugschlussmeldung();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Block_ElementImpl
