/**
 */
package org.eclipse.set.toolboxmodel.PZB.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.set.toolboxmodel.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.toolboxmodel.Basisobjekte.Anhang;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Markanter_Punkt;
import org.eclipse.set.toolboxmodel.PZB.PZBPackage;
import org.eclipse.set.toolboxmodel.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.PZB.impl.PZB_Element_Zuordnung_INA_AttributeGroupImpl#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PZB_Element_Zuordnung_INA_AttributeGroupImpl extends MinimalEObjectImpl.Container implements PZB_Element_Zuordnung_INA_AttributeGroup {
	/**
	 * The cached value of the '{@link #getIDAnhangINA() <em>ID Anhang INA</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnhangINA()
	 * @generated
	 * @ordered
	 */
	protected Anhang iDAnhangINA;

	/**
	 * This is true if the ID Anhang INA reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDAnhangINAESet;

	/**
	 * The cached value of the '{@link #getIDBahnsteigKante() <em>ID Bahnsteig Kante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBahnsteigKante()
	 * @generated
	 * @ordered
	 */
	protected Bahnsteig_Kante iDBahnsteigKante;

	/**
	 * This is true if the ID Bahnsteig Kante reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDBahnsteigKanteESet;

	/**
	 * The cached value of the '{@link #getIDMarkanterPunkt() <em>ID Markanter Punkt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 * @ordered
	 */
	protected Markanter_Punkt iDMarkanterPunkt;

	/**
	 * This is true if the ID Markanter Punkt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDMarkanterPunktESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PZB_Element_Zuordnung_INA_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PZBPackage.Literals.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anhang getIDAnhangINA() {
		if (iDAnhangINA != null && iDAnhangINA.eIsProxy()) {
			InternalEObject oldIDAnhangINA = (InternalEObject)iDAnhangINA;
			iDAnhangINA = (Anhang)eResolveProxy(oldIDAnhangINA);
			if (iDAnhangINA != oldIDAnhangINA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, oldIDAnhangINA, iDAnhangINA));
			}
		}
		return iDAnhangINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anhang basicGetIDAnhangINA() {
		return iDAnhangINA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDAnhangINA(Anhang newIDAnhangINA) {
		Anhang oldIDAnhangINA = iDAnhangINA;
		iDAnhangINA = newIDAnhangINA;
		boolean oldIDAnhangINAESet = iDAnhangINAESet;
		iDAnhangINAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, oldIDAnhangINA, iDAnhangINA, !oldIDAnhangINAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDAnhangINA() {
		Anhang oldIDAnhangINA = iDAnhangINA;
		boolean oldIDAnhangINAESet = iDAnhangINAESet;
		iDAnhangINA = null;
		iDAnhangINAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA, oldIDAnhangINA, null, oldIDAnhangINAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDAnhangINA() {
		return iDAnhangINAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bahnsteig_Kante getIDBahnsteigKante() {
		if (iDBahnsteigKante != null && iDBahnsteigKante.eIsProxy()) {
			InternalEObject oldIDBahnsteigKante = (InternalEObject)iDBahnsteigKante;
			iDBahnsteigKante = (Bahnsteig_Kante)eResolveProxy(oldIDBahnsteigKante);
			if (iDBahnsteigKante != oldIDBahnsteigKante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, iDBahnsteigKante));
			}
		}
		return iDBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bahnsteig_Kante basicGetIDBahnsteigKante() {
		return iDBahnsteigKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDBahnsteigKante(Bahnsteig_Kante newIDBahnsteigKante) {
		Bahnsteig_Kante oldIDBahnsteigKante = iDBahnsteigKante;
		iDBahnsteigKante = newIDBahnsteigKante;
		boolean oldIDBahnsteigKanteESet = iDBahnsteigKanteESet;
		iDBahnsteigKanteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, iDBahnsteigKante, !oldIDBahnsteigKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDBahnsteigKante() {
		Bahnsteig_Kante oldIDBahnsteigKante = iDBahnsteigKante;
		boolean oldIDBahnsteigKanteESet = iDBahnsteigKanteESet;
		iDBahnsteigKante = null;
		iDBahnsteigKanteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE, oldIDBahnsteigKante, null, oldIDBahnsteigKanteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDBahnsteigKante() {
		return iDBahnsteigKanteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Markanter_Punkt getIDMarkanterPunkt() {
		if (iDMarkanterPunkt != null && iDMarkanterPunkt.eIsProxy()) {
			InternalEObject oldIDMarkanterPunkt = (InternalEObject)iDMarkanterPunkt;
			iDMarkanterPunkt = (Markanter_Punkt)eResolveProxy(oldIDMarkanterPunkt);
			if (iDMarkanterPunkt != oldIDMarkanterPunkt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, iDMarkanterPunkt));
			}
		}
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markanter_Punkt basicGetIDMarkanterPunkt() {
		return iDMarkanterPunkt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDMarkanterPunkt(Markanter_Punkt newIDMarkanterPunkt) {
		Markanter_Punkt oldIDMarkanterPunkt = iDMarkanterPunkt;
		iDMarkanterPunkt = newIDMarkanterPunkt;
		boolean oldIDMarkanterPunktESet = iDMarkanterPunktESet;
		iDMarkanterPunktESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, iDMarkanterPunkt, !oldIDMarkanterPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDMarkanterPunkt() {
		Markanter_Punkt oldIDMarkanterPunkt = iDMarkanterPunkt;
		boolean oldIDMarkanterPunktESet = iDMarkanterPunktESet;
		iDMarkanterPunkt = null;
		iDMarkanterPunktESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT, oldIDMarkanterPunkt, null, oldIDMarkanterPunktESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDMarkanterPunkt() {
		return iDMarkanterPunktESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				if (resolve) return getIDAnhangINA();
				return basicGetIDAnhangINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				if (resolve) return getIDBahnsteigKante();
				return basicGetIDBahnsteigKante();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				if (resolve) return getIDMarkanterPunkt();
				return basicGetIDMarkanterPunkt();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				setIDAnhangINA((Anhang)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				setIDBahnsteigKante((Bahnsteig_Kante)newValue);
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				setIDMarkanterPunkt((Markanter_Punkt)newValue);
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				unsetIDAnhangINA();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				unsetIDBahnsteigKante();
				return;
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				unsetIDMarkanterPunkt();
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
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA:
				return isSetIDAnhangINA();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE:
				return isSetIDBahnsteigKante();
			case PZBPackage.PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT:
				return isSetIDMarkanterPunkt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //PZB_Element_Zuordnung_INA_AttributeGroupImpl
