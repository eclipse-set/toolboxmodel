/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Gleisbezogener_Gefahrraum;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Ersatzstecker_Gleisbezogen_TypeClass;
import org.eclipse.set.toolboxmodel.Bahnuebergang.Gleis_Am_Bue_TypeClass;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BUE Gleisbezogener Gefahrraum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Gleisbezogener_GefahrraumImpl#getErsatzsteckerGleisbezogen <em>Ersatzstecker Gleisbezogen</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Gleisbezogener_GefahrraumImpl#getGleisAmBue <em>Gleis Am Bue</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnuebergang.impl.BUE_Gleisbezogener_GefahrraumImpl#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BUE_Gleisbezogener_GefahrraumImpl extends Bereich_ObjektImpl implements BUE_Gleisbezogener_Gefahrraum {
	/**
	 * The cached value of the '{@link #getErsatzsteckerGleisbezogen() <em>Ersatzstecker Gleisbezogen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErsatzsteckerGleisbezogen()
	 * @generated
	 * @ordered
	 */
	protected Ersatzstecker_Gleisbezogen_TypeClass ersatzsteckerGleisbezogen;

	/**
	 * The cached value of the '{@link #getGleisAmBue() <em>Gleis Am Bue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGleisAmBue()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Am_Bue_TypeClass gleisAmBue;

	/**
	 * The cached value of the '{@link #getIDBUEAnlage() <em>IDBUE Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEAnlage()
	 * @generated
	 * @ordered
	 */
	protected BUE_Anlage iDBUEAnlage;

	/**
	 * This is true if the IDBUE Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBUEAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BUE_Gleisbezogener_GefahrraumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnuebergangPackage.eINSTANCE.getBUE_Gleisbezogener_Gefahrraum();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ersatzstecker_Gleisbezogen_TypeClass getErsatzsteckerGleisbezogen() {
		return ersatzsteckerGleisbezogen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErsatzsteckerGleisbezogen(Ersatzstecker_Gleisbezogen_TypeClass newErsatzsteckerGleisbezogen, NotificationChain msgs) {
		Ersatzstecker_Gleisbezogen_TypeClass oldErsatzsteckerGleisbezogen = ersatzsteckerGleisbezogen;
		ersatzsteckerGleisbezogen = newErsatzsteckerGleisbezogen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN, oldErsatzsteckerGleisbezogen, newErsatzsteckerGleisbezogen);
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
	public void setErsatzsteckerGleisbezogen(Ersatzstecker_Gleisbezogen_TypeClass newErsatzsteckerGleisbezogen) {
		if (newErsatzsteckerGleisbezogen != ersatzsteckerGleisbezogen) {
			NotificationChain msgs = null;
			if (ersatzsteckerGleisbezogen != null)
				msgs = ((InternalEObject)ersatzsteckerGleisbezogen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN, null, msgs);
			if (newErsatzsteckerGleisbezogen != null)
				msgs = ((InternalEObject)newErsatzsteckerGleisbezogen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN, null, msgs);
			msgs = basicSetErsatzsteckerGleisbezogen(newErsatzsteckerGleisbezogen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN, newErsatzsteckerGleisbezogen, newErsatzsteckerGleisbezogen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Am_Bue_TypeClass getGleisAmBue() {
		return gleisAmBue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGleisAmBue(Gleis_Am_Bue_TypeClass newGleisAmBue, NotificationChain msgs) {
		Gleis_Am_Bue_TypeClass oldGleisAmBue = gleisAmBue;
		gleisAmBue = newGleisAmBue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE, oldGleisAmBue, newGleisAmBue);
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
	public void setGleisAmBue(Gleis_Am_Bue_TypeClass newGleisAmBue) {
		if (newGleisAmBue != gleisAmBue) {
			NotificationChain msgs = null;
			if (gleisAmBue != null)
				msgs = ((InternalEObject)gleisAmBue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE, null, msgs);
			if (newGleisAmBue != null)
				msgs = ((InternalEObject)newGleisAmBue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE, null, msgs);
			msgs = basicSetGleisAmBue(newGleisAmBue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE, newGleisAmBue, newGleisAmBue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BUE_Anlage getIDBUEAnlage() {
		if (iDBUEAnlage != null && iDBUEAnlage.eIsProxy()) {
			InternalEObject oldIDBUEAnlage = (InternalEObject)iDBUEAnlage;
			iDBUEAnlage = (BUE_Anlage)eResolveProxy(oldIDBUEAnlage);
			if (iDBUEAnlage != oldIDBUEAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage));
			}
		}
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_Anlage basicGetIDBUEAnlage() {
		return iDBUEAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBUEAnlage(BUE_Anlage newIDBUEAnlage) {
		BUE_Anlage oldIDBUEAnlage = iDBUEAnlage;
		iDBUEAnlage = newIDBUEAnlage;
		boolean oldIDBUEAnlageESet = iDBUEAnlageESet;
		iDBUEAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE, oldIDBUEAnlage, iDBUEAnlage, !oldIDBUEAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBUEAnlage() {
		BUE_Anlage oldIDBUEAnlage = iDBUEAnlage;
		boolean oldIDBUEAnlageESet = iDBUEAnlageESet;
		iDBUEAnlage = null;
		iDBUEAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE, oldIDBUEAnlage, null, oldIDBUEAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBUEAnlage() {
		return iDBUEAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN:
				return basicSetErsatzsteckerGleisbezogen(null, msgs);
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE:
				return basicSetGleisAmBue(null, msgs);
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
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN:
				return getErsatzsteckerGleisbezogen();
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE:
				return getGleisAmBue();
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE:
				if (resolve) return getIDBUEAnlage();
				return basicGetIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN:
				setErsatzsteckerGleisbezogen((Ersatzstecker_Gleisbezogen_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE:
				setGleisAmBue((Gleis_Am_Bue_TypeClass)newValue);
				return;
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE:
				setIDBUEAnlage((BUE_Anlage)newValue);
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
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN:
				setErsatzsteckerGleisbezogen((Ersatzstecker_Gleisbezogen_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE:
				setGleisAmBue((Gleis_Am_Bue_TypeClass)null);
				return;
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE:
				unsetIDBUEAnlage();
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
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__ERSATZSTECKER_GLEISBEZOGEN:
				return ersatzsteckerGleisbezogen != null;
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__GLEIS_AM_BUE:
				return gleisAmBue != null;
			case BahnuebergangPackage.BUE_GLEISBEZOGENER_GEFAHRRAUM__IDBUE_ANLAGE:
				return isSetIDBUEAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //BUE_Gleisbezogener_GefahrraumImpl
