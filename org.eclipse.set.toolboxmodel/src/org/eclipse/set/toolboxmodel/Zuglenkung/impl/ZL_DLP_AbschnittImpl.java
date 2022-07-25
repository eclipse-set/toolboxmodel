/**
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Gleis.Gleis_Abschnitt;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ZL DLP Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Zuglenkung.impl.ZL_DLP_AbschnittImpl#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZL_DLP_AbschnittImpl extends Basis_ObjektImpl implements ZL_DLP_Abschnitt {
	/**
	 * The cached value of the '{@link #getIDGleisAbschnitt() <em>ID Gleis Abschnitt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 * @ordered
	 */
	protected Gleis_Abschnitt iDGleisAbschnitt;

	/**
	 * This is true if the ID Gleis Abschnitt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGleisAbschnittESet;

	/**
	 * The cached value of the '{@link #getIDZLDLPFstr() <em>IDZLDLP Fstr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDZLDLPFstr()
	 * @generated
	 * @ordered
	 */
	protected ZL_DLP_Fstr iDZLDLPFstr;

	/**
	 * This is true if the IDZLDLP Fstr reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDZLDLPFstrESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZL_DLP_AbschnittImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZuglenkungPackage.Literals.ZL_DLP_ABSCHNITT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gleis_Abschnitt getIDGleisAbschnitt() {
		if (iDGleisAbschnitt != null && iDGleisAbschnitt.eIsProxy()) {
			InternalEObject oldIDGleisAbschnitt = (InternalEObject)iDGleisAbschnitt;
			iDGleisAbschnitt = (Gleis_Abschnitt)eResolveProxy(oldIDGleisAbschnitt);
			if (iDGleisAbschnitt != oldIDGleisAbschnitt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, iDGleisAbschnitt));
			}
		}
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gleis_Abschnitt basicGetIDGleisAbschnitt() {
		return iDGleisAbschnitt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGleisAbschnitt(Gleis_Abschnitt newIDGleisAbschnitt) {
		Gleis_Abschnitt oldIDGleisAbschnitt = iDGleisAbschnitt;
		iDGleisAbschnitt = newIDGleisAbschnitt;
		boolean oldIDGleisAbschnittESet = iDGleisAbschnittESet;
		iDGleisAbschnittESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, iDGleisAbschnitt, !oldIDGleisAbschnittESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGleisAbschnitt() {
		Gleis_Abschnitt oldIDGleisAbschnitt = iDGleisAbschnitt;
		boolean oldIDGleisAbschnittESet = iDGleisAbschnittESet;
		iDGleisAbschnitt = null;
		iDGleisAbschnittESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT, oldIDGleisAbschnitt, null, oldIDGleisAbschnittESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGleisAbschnitt() {
		return iDGleisAbschnittESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZL_DLP_Fstr getIDZLDLPFstr() {
		if (iDZLDLPFstr != null && iDZLDLPFstr.eIsProxy()) {
			InternalEObject oldIDZLDLPFstr = (InternalEObject)iDZLDLPFstr;
			iDZLDLPFstr = (ZL_DLP_Fstr)eResolveProxy(oldIDZLDLPFstr);
			if (iDZLDLPFstr != oldIDZLDLPFstr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, iDZLDLPFstr));
			}
		}
		return iDZLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_DLP_Fstr basicGetIDZLDLPFstr() {
		return iDZLDLPFstr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDZLDLPFstr(ZL_DLP_Fstr newIDZLDLPFstr) {
		ZL_DLP_Fstr oldIDZLDLPFstr = iDZLDLPFstr;
		iDZLDLPFstr = newIDZLDLPFstr;
		boolean oldIDZLDLPFstrESet = iDZLDLPFstrESet;
		iDZLDLPFstrESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, iDZLDLPFstr, !oldIDZLDLPFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDZLDLPFstr() {
		ZL_DLP_Fstr oldIDZLDLPFstr = iDZLDLPFstr;
		boolean oldIDZLDLPFstrESet = iDZLDLPFstrESet;
		iDZLDLPFstr = null;
		iDZLDLPFstrESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR, oldIDZLDLPFstr, null, oldIDZLDLPFstrESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDZLDLPFstr() {
		return iDZLDLPFstrESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				if (resolve) return getIDGleisAbschnitt();
				return basicGetIDGleisAbschnitt();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				if (resolve) return getIDZLDLPFstr();
				return basicGetIDZLDLPFstr();
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				setIDGleisAbschnitt((Gleis_Abschnitt)newValue);
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				setIDZLDLPFstr((ZL_DLP_Fstr)newValue);
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				unsetIDGleisAbschnitt();
				return;
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				unsetIDZLDLPFstr();
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
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT:
				return isSetIDGleisAbschnitt();
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT__IDZLDLP_FSTR:
				return isSetIDZLDLPFstr();
			default:
				return super.eIsSet(featureID);
		}
	}

} //ZL_DLP_AbschnittImpl
