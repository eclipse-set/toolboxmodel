/**
 */
package org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Kante;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kabel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.KabelImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.KabelImpl#getIDTrasseKante <em>ID Trasse Kante</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.KabelImpl#getKabelAllg <em>Kabel Allg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KabelImpl extends Basis_ObjektImpl implements Kabel {
	/**
	 * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBezeichnung()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Bezeichnung_AttributeGroup bezeichnung;

	/**
	 * The cached value of the '{@link #getIDTrasseKante() <em>ID Trasse Kante</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDTrasseKante()
	 * @generated
	 * @ordered
	 */
	protected EList<Trasse_Kante> iDTrasseKante;

	/**
	 * The cached value of the '{@link #getKabelAllg() <em>Kabel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKabelAllg()
	 * @generated
	 * @ordered
	 */
	protected Kabel_Allg_AttributeGroup kabelAllg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.KABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Bezeichnung_AttributeGroup getBezeichnung() {
		return bezeichnung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBezeichnung(Kabel_Bezeichnung_AttributeGroup newBezeichnung, NotificationChain msgs) {
		Kabel_Bezeichnung_AttributeGroup oldBezeichnung = bezeichnung;
		bezeichnung = newBezeichnung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, oldBezeichnung, newBezeichnung);
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
	public void setBezeichnung(Kabel_Bezeichnung_AttributeGroup newBezeichnung) {
		if (newBezeichnung != bezeichnung) {
			NotificationChain msgs = null;
			if (bezeichnung != null)
				msgs = ((InternalEObject)bezeichnung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, null, msgs);
			if (newBezeichnung != null)
				msgs = ((InternalEObject)newBezeichnung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, null, msgs);
			msgs = basicSetBezeichnung(newBezeichnung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__BEZEICHNUNG, newBezeichnung, newBezeichnung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Trasse_Kante> getIDTrasseKante() {
		if (iDTrasseKante == null) {
			iDTrasseKante = new EObjectResolvingEList<Trasse_Kante>(Trasse_Kante.class, this, Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE);
		}
		return iDTrasseKante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kabel_Allg_AttributeGroup getKabelAllg() {
		return kabelAllg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKabelAllg(Kabel_Allg_AttributeGroup newKabelAllg, NotificationChain msgs) {
		Kabel_Allg_AttributeGroup oldKabelAllg = kabelAllg;
		kabelAllg = newKabelAllg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__KABEL_ALLG, oldKabelAllg, newKabelAllg);
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
	public void setKabelAllg(Kabel_Allg_AttributeGroup newKabelAllg) {
		if (newKabelAllg != kabelAllg) {
			NotificationChain msgs = null;
			if (kabelAllg != null)
				msgs = ((InternalEObject)kabelAllg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__KABEL_ALLG, null, msgs);
			if (newKabelAllg != null)
				msgs = ((InternalEObject)newKabelAllg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.KABEL__KABEL_ALLG, null, msgs);
			msgs = basicSetKabelAllg(newKabelAllg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.KABEL__KABEL_ALLG, newKabelAllg, newKabelAllg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				return basicSetBezeichnung(null, msgs);
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				return basicSetKabelAllg(null, msgs);
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				return getBezeichnung();
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				return getIDTrasseKante();
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				return getKabelAllg();
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				setBezeichnung((Kabel_Bezeichnung_AttributeGroup)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				getIDTrasseKante().clear();
				getIDTrasseKante().addAll((Collection<? extends Trasse_Kante>)newValue);
				return;
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				setKabelAllg((Kabel_Allg_AttributeGroup)newValue);
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				setBezeichnung((Kabel_Bezeichnung_AttributeGroup)null);
				return;
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				getIDTrasseKante().clear();
				return;
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				setKabelAllg((Kabel_Allg_AttributeGroup)null);
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
			case Medien_und_TrassenPackage.KABEL__BEZEICHNUNG:
				return bezeichnung != null;
			case Medien_und_TrassenPackage.KABEL__ID_TRASSE_KANTE:
				return iDTrasseKante != null && !iDTrasseKante.isEmpty();
			case Medien_und_TrassenPackage.KABEL__KABEL_ALLG:
				return kabelAllg != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //KabelImpl
