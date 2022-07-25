/**
 */
package org.eclipse.set.toolboxmodel.Bahnsteig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Anlage;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Bereich_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bahnsteig Kante</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.impl.Bahnsteig_KanteImpl#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.impl.Bahnsteig_KanteImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Bahnsteig.impl.Bahnsteig_KanteImpl#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Bahnsteig_KanteImpl extends Bereich_ObjektImpl implements Bahnsteig_Kante {
	/**
	 * The cached value of the '{@link #getBahnsteigKanteAllg() <em>Bahnsteig Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBahnsteigKanteAllg()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Kante_Allg_AttributeGroup bahnsteigKanteAllg;

	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Kante_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDBahnsteigAnlage() <em>ID Bahnsteig Anlage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Anlage iDBahnsteigAnlage;

	/**
	 * This is true if the ID Bahnsteig Anlage reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBahnsteigAnlageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bahnsteig_KanteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BahnsteigPackage.Literals.BAHNSTEIG_KANTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante_Allg_AttributeGroup getBahnsteigKanteAllg() {
		return bahnsteigKanteAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup newBahnsteigKanteAllg, NotificationChain msgs) {
		Bahnsteig_Kante_Allg_AttributeGroup oldBahnsteigKanteAllg = bahnsteigKanteAllg;
		bahnsteigKanteAllg = newBahnsteigKanteAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, oldBahnsteigKanteAllg, newBahnsteigKanteAllg);
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
	public void setBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup newBahnsteigKanteAllg) {
		if (newBahnsteigKanteAllg != bahnsteigKanteAllg) {
			NotificationChain msgs = null;
			if (bahnsteigKanteAllg != null)
				msgs = ((InternalEObject)bahnsteigKanteAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, null, msgs);
			if (newBahnsteigKanteAllg != null)
				msgs = ((InternalEObject)newBahnsteigKanteAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, null, msgs);
			msgs = basicSetBahnsteigKanteAllg(newBahnsteigKanteAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG, newBahnsteigKanteAllg, newBahnsteigKanteAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Bahnsteig_Kante_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Anlage getIDBahnsteigAnlage() {
		if (iDBahnsteigAnlage != null && iDBahnsteigAnlage.eIsProxy()) {
			InternalEObject oldIDBahnsteigAnlage = (InternalEObject)iDBahnsteigAnlage;
			iDBahnsteigAnlage = (Bahnsteig_Anlage)eResolveProxy(oldIDBahnsteigAnlage);
			if (iDBahnsteigAnlage != oldIDBahnsteigAnlage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, iDBahnsteigAnlage));
			}
		}
		return iDBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bahnsteig_Anlage basicGetIDBahnsteigAnlage() {
		return iDBahnsteigAnlage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBahnsteigAnlage(Bahnsteig_Anlage newIDBahnsteigAnlage) {
		Bahnsteig_Anlage oldIDBahnsteigAnlage = iDBahnsteigAnlage;
		iDBahnsteigAnlage = newIDBahnsteigAnlage;
		boolean oldIDBahnsteigAnlageESet = iDBahnsteigAnlageESet;
		iDBahnsteigAnlageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, iDBahnsteigAnlage, !oldIDBahnsteigAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBahnsteigAnlage() {
		Bahnsteig_Anlage oldIDBahnsteigAnlage = iDBahnsteigAnlage;
		boolean oldIDBahnsteigAnlageESet = iDBahnsteigAnlageESet;
		iDBahnsteigAnlage = null;
		iDBahnsteigAnlageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE, oldIDBahnsteigAnlage, null, oldIDBahnsteigAnlageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBahnsteigAnlage() {
		return iDBahnsteigAnlageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				return basicSetBahnsteigKanteAllg(null, msgs);
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				return getBahnsteigKanteAllg();
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				return getBezeichnung();
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				if (resolve) return getIDBahnsteigAnlage();
				return basicGetIDBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				setBahnsteigKanteAllg((Bahnsteig_Kante_Allg_AttributeGroup)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				setBezeichnung((Bahnsteig_Kante_Bezeichnung_AttributeGroup)newValue);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				setIDBahnsteigAnlage((Bahnsteig_Anlage)newValue);
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				setBahnsteigKanteAllg((Bahnsteig_Kante_Allg_AttributeGroup)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				setBezeichnung((Bahnsteig_Kante_Bezeichnung_AttributeGroup)null);
				return;
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				unsetIDBahnsteigAnlage();
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
			case BahnsteigPackage.BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG:
				return bahnsteigKanteAllg != null;
			case BahnsteigPackage.BAHNSTEIG_KANTE__BEZEICHNUNG:
				return bezeichnung != null;
			case BahnsteigPackage.BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE:
				return isSetIDBahnsteigAnlage();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Bahnsteig_KanteImpl
