/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Prog_Datei_Gruppe;

import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prog Datei Gruppe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_GruppeImpl#getIDGeraetProgrammiert <em>ID Geraet Programmiert</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.impl.Prog_Datei_GruppeImpl#getProgDateiEinzel <em>Prog Datei Einzel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Prog_Datei_GruppeImpl extends Basis_ObjektImpl implements Prog_Datei_Gruppe {
	/**
	 * The cached value of the '{@link #getIDGeraetProgrammiert() <em>ID Geraet Programmiert</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGeraetProgrammiert()
	 * @generated
	 * @ordered
	 */
	protected EList<Basis_Objekt> iDGeraetProgrammiert;

	/**
	 * The cached value of the '{@link #getProgDateiEinzel() <em>Prog Datei Einzel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgDateiEinzel()
	 * @generated
	 * @ordered
	 */
	protected EList<Prog_Datei_Einzel_AttributeGroup> progDateiEinzel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Prog_Datei_GruppeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Balisentechnik_ETCSPackage.eINSTANCE.getProg_Datei_Gruppe();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Basis_Objekt> getIDGeraetProgrammiert() {
		if (iDGeraetProgrammiert == null) {
			iDGeraetProgrammiert = new EObjectResolvingEList<Basis_Objekt>(Basis_Objekt.class, this, Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_GERAET_PROGRAMMIERT);
		}
		return iDGeraetProgrammiert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Prog_Datei_Einzel_AttributeGroup> getProgDateiEinzel() {
		if (progDateiEinzel == null) {
			progDateiEinzel = new EObjectContainmentEList<Prog_Datei_Einzel_AttributeGroup>(Prog_Datei_Einzel_AttributeGroup.class, this, Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL);
		}
		return progDateiEinzel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				return ((InternalEList<?>)getProgDateiEinzel()).basicRemove(otherEnd, msgs);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_GERAET_PROGRAMMIERT:
				return getIDGeraetProgrammiert();
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				return getProgDateiEinzel();
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_GERAET_PROGRAMMIERT:
				getIDGeraetProgrammiert().clear();
				getIDGeraetProgrammiert().addAll((Collection<? extends Basis_Objekt>)newValue);
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				getProgDateiEinzel().clear();
				getProgDateiEinzel().addAll((Collection<? extends Prog_Datei_Einzel_AttributeGroup>)newValue);
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_GERAET_PROGRAMMIERT:
				getIDGeraetProgrammiert().clear();
				return;
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				getProgDateiEinzel().clear();
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
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__ID_GERAET_PROGRAMMIERT:
				return iDGeraetProgrammiert != null && !iDGeraetProgrammiert.isEmpty();
			case Balisentechnik_ETCSPackage.PROG_DATEI_GRUPPE__PROG_DATEI_EINZEL:
				return progDateiEinzel != null && !progDateiEinzel.isEmpty();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Prog_Datei_GruppeImpl
