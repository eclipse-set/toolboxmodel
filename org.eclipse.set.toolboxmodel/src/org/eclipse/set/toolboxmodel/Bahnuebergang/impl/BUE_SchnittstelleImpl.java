/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Stellelement;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Abhaengigkeit_Fue_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Schnittstelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_SchnittstelleImpl#getBUEAbhaengigkeitFue <em>BUE Abhaengigkeit Fue</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_SchnittstelleImpl#getBUESchnittstelleAllg <em>BUE Schnittstelle Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_SchnittstelleImpl#getIDStellelement <em>ID Stellelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_SchnittstelleImpl extends Basis_ObjektImpl implements BUE_Schnittstelle {
	/**
	 * The cached value of the '{@link #getBUEAbhaengigkeitFue() <em>BUE Abhaengigkeit Fue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUEAbhaengigkeitFue()
	 * @generated
	 * @ordered
	 */
	protected BUE_Abhaengigkeit_Fue_AttributeGroup bUEAbhaengigkeitFue;

	/**
	 * The cached value of the '{@link #getBUESchnittstelleAllg() <em>BUE Schnittstelle Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBUESchnittstelleAllg()
	 * @generated
	 * @ordered
	 */
	protected BUE_Schnittstelle_Allg_AttributeGroup bUESchnittstelleAllg;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_SchnittstelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Schnittstelle();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Abhaengigkeit_Fue_AttributeGroup getBUEAbhaengigkeitFue() {
		return bUEAbhaengigkeitFue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUEAbhaengigkeitFue(BUE_Abhaengigkeit_Fue_AttributeGroup newBUEAbhaengigkeitFue, NotificationChain msgs) {
		BUE_Abhaengigkeit_Fue_AttributeGroup oldBUEAbhaengigkeitFue = bUEAbhaengigkeitFue;
		bUEAbhaengigkeitFue = newBUEAbhaengigkeitFue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE, oldBUEAbhaengigkeitFue, newBUEAbhaengigkeitFue);
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
	public void setBUEAbhaengigkeitFue(BUE_Abhaengigkeit_Fue_AttributeGroup newBUEAbhaengigkeitFue) {
		if (newBUEAbhaengigkeitFue != bUEAbhaengigkeitFue) {
			NotificationChain msgs = null;
			if (bUEAbhaengigkeitFue != null)
				msgs = ((InternalEObject)bUEAbhaengigkeitFue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE, null, msgs);
			if (newBUEAbhaengigkeitFue != null)
				msgs = ((InternalEObject)newBUEAbhaengigkeitFue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE, null, msgs);
			msgs = basicSetBUEAbhaengigkeitFue(newBUEAbhaengigkeitFue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE, newBUEAbhaengigkeitFue, newBUEAbhaengigkeitFue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Schnittstelle_Allg_AttributeGroup getBUESchnittstelleAllg() {
		return bUESchnittstelleAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBUESchnittstelleAllg(BUE_Schnittstelle_Allg_AttributeGroup newBUESchnittstelleAllg, NotificationChain msgs) {
		BUE_Schnittstelle_Allg_AttributeGroup oldBUESchnittstelleAllg = bUESchnittstelleAllg;
		bUESchnittstelleAllg = newBUESchnittstelleAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG, oldBUESchnittstelleAllg, newBUESchnittstelleAllg);
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
	public void setBUESchnittstelleAllg(BUE_Schnittstelle_Allg_AttributeGroup newBUESchnittstelleAllg) {
		if (newBUESchnittstelleAllg != bUESchnittstelleAllg) {
			NotificationChain msgs = null;
			if (bUESchnittstelleAllg != null)
				msgs = ((InternalEObject)bUESchnittstelleAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG, null, msgs);
			if (newBUESchnittstelleAllg != null)
				msgs = ((InternalEObject)newBUESchnittstelleAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG, null, msgs);
			msgs = basicSetBUESchnittstelleAllg(newBUESchnittstelleAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG, newBUESchnittstelleAllg, newBUESchnittstelleAllg));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT, oldIDStellelement, iDStellelement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT, oldIDStellelement, iDStellelement, !oldIDStellelementESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT, oldIDStellelement, null, oldIDStellelementESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE:
				return basicSetBUEAbhaengigkeitFue(null, msgs);
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG:
				return basicSetBUESchnittstelleAllg(null, msgs);
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE:
				return getBUEAbhaengigkeitFue();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG:
				return getBUESchnittstelleAllg();
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT:
				if (resolve) return getIDStellelement();
				return basicGetIDStellelement();
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE:
				setBUEAbhaengigkeitFue((BUE_Abhaengigkeit_Fue_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG:
				setBUESchnittstelleAllg((BUE_Schnittstelle_Allg_AttributeGroup)newValue);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT:
				setIDStellelement((Stellelement)newValue);
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE:
				setBUEAbhaengigkeitFue((BUE_Abhaengigkeit_Fue_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG:
				setBUESchnittstelleAllg((BUE_Schnittstelle_Allg_AttributeGroup)null);
				return;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT:
				unsetIDStellelement();
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
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_ABHAENGIGKEIT_FUE:
				return bUEAbhaengigkeitFue != null;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__BUE_SCHNITTSTELLE_ALLG:
				return bUESchnittstelleAllg != null;
			case BahnuebergangPackage.BUE_SCHNITTSTELLE__ID_STELLELEMENT:
				return isSetIDStellelement();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_SchnittstelleImpl
