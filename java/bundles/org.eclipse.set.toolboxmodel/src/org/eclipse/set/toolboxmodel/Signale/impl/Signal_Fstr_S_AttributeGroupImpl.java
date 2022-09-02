/**
 */
package org.eclipse.set.toolboxmodel.Signale.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Ortung.Schaltmittel_Zuordnung;
import org.eclipse.set.toolboxmodel.Signale.Gegengleis_TypeClass;
import org.eclipse.set.toolboxmodel.Signale.Signal_Fstr_S_AttributeGroup;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signal Fstr SAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_S_AttributeGroupImpl#getGegengleis <em>Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_S_AttributeGroupImpl#getIDAnrueckverschluss <em>ID Anrueckverschluss</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Signale.impl.Signal_Fstr_S_AttributeGroupImpl#getIDZweitesHaltfallkriterium <em>ID Zweites Haltfallkriterium</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Signal_Fstr_S_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Signal_Fstr_S_AttributeGroup {
	/**
	 * The cached value of the '{@link #getGegengleis() <em>Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGegengleis()
	 * @generated
	 * @ordered
	 */
	protected Gegengleis_TypeClass gegengleis;

	/**
	 * The cached value of the '{@link #getIDAnrueckverschluss() <em>ID Anrueckverschluss</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnrueckverschluss()
	 * @generated
	 * @ordered
	 */
	protected EList<Schaltmittel_Zuordnung> iDAnrueckverschluss;

	/**
	 * The cached value of the '{@link #getIDZweitesHaltfallkriterium() <em>ID Zweites Haltfallkriterium</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZweitesHaltfallkriterium()
	 * @generated
	 * @ordered
	 */
	protected Schaltmittel_Zuordnung iDZweitesHaltfallkriterium;

	/**
	 * This is true if the ID Zweites Haltfallkriterium reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZweitesHaltfallkriteriumESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signal_Fstr_S_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SignalePackage.Literals.SIGNAL_FSTR_SATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gegengleis_TypeClass getGegengleis() {
		return gegengleis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGegengleis(Gegengleis_TypeClass newGegengleis, NotificationChain msgs) {
		Gegengleis_TypeClass oldGegengleis = gegengleis;
		gegengleis = newGegengleis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, oldGegengleis, newGegengleis);
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
	public void setGegengleis(Gegengleis_TypeClass newGegengleis) {
		if (newGegengleis != gegengleis) {
			NotificationChain msgs = null;
			if (gegengleis != null)
				msgs = ((InternalEObject)gegengleis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, null, msgs);
			if (newGegengleis != null)
				msgs = ((InternalEObject)newGegengleis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, null, msgs);
			msgs = basicSetGegengleis(newGegengleis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS, newGegengleis, newGegengleis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schaltmittel_Zuordnung> getIDAnrueckverschluss() {
		if (iDAnrueckverschluss == null) {
			iDAnrueckverschluss = new EObjectResolvingEList<Schaltmittel_Zuordnung>(Schaltmittel_Zuordnung.class, this, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS);
		}
		return iDAnrueckverschluss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schaltmittel_Zuordnung getIDZweitesHaltfallkriterium() {
		if (iDZweitesHaltfallkriterium != null && iDZweitesHaltfallkriterium.eIsProxy()) {
			InternalEObject oldIDZweitesHaltfallkriterium = (InternalEObject)iDZweitesHaltfallkriterium;
			iDZweitesHaltfallkriterium = (Schaltmittel_Zuordnung)eResolveProxy(oldIDZweitesHaltfallkriterium);
			if (iDZweitesHaltfallkriterium != oldIDZweitesHaltfallkriterium) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, oldIDZweitesHaltfallkriterium, iDZweitesHaltfallkriterium));
			}
		}
		return iDZweitesHaltfallkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schaltmittel_Zuordnung basicGetIDZweitesHaltfallkriterium() {
		return iDZweitesHaltfallkriterium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZweitesHaltfallkriterium(Schaltmittel_Zuordnung newIDZweitesHaltfallkriterium) {
		Schaltmittel_Zuordnung oldIDZweitesHaltfallkriterium = iDZweitesHaltfallkriterium;
		iDZweitesHaltfallkriterium = newIDZweitesHaltfallkriterium;
		boolean oldIDZweitesHaltfallkriteriumESet = iDZweitesHaltfallkriteriumESet;
		iDZweitesHaltfallkriteriumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, oldIDZweitesHaltfallkriterium, iDZweitesHaltfallkriterium, !oldIDZweitesHaltfallkriteriumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZweitesHaltfallkriterium() {
		Schaltmittel_Zuordnung oldIDZweitesHaltfallkriterium = iDZweitesHaltfallkriterium;
		boolean oldIDZweitesHaltfallkriteriumESet = iDZweitesHaltfallkriteriumESet;
		iDZweitesHaltfallkriterium = null;
		iDZweitesHaltfallkriteriumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM, oldIDZweitesHaltfallkriterium, null, oldIDZweitesHaltfallkriteriumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZweitesHaltfallkriterium() {
		return iDZweitesHaltfallkriteriumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				return basicSetGegengleis(null, msgs);
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				return getGegengleis();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				return getIDAnrueckverschluss();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				if (resolve) return getIDZweitesHaltfallkriterium();
				return basicGetIDZweitesHaltfallkriterium();
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				setGegengleis((Gegengleis_TypeClass)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				getIDAnrueckverschluss().clear();
				getIDAnrueckverschluss().addAll((Collection<? extends Schaltmittel_Zuordnung>)newValue);
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				setIDZweitesHaltfallkriterium((Schaltmittel_Zuordnung)newValue);
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				setGegengleis((Gegengleis_TypeClass)null);
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				getIDAnrueckverschluss().clear();
				return;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				unsetIDZweitesHaltfallkriterium();
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
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__GEGENGLEIS:
				return gegengleis != null;
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ANRUECKVERSCHLUSS:
				return iDAnrueckverschluss != null && !iDAnrueckverschluss.isEmpty();
			case SignalePackage.SIGNAL_FSTR_SATTRIBUTE_GROUP__ID_ZWEITES_HALTFALLKRITERIUM:
				return isSetIDZweitesHaltfallkriterium();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Signal_Fstr_S_AttributeGroupImpl
