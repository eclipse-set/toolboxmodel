/**
 */
package org.eclipse.set.toolboxmodel.Fahrstrasse.impl;

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
import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Einschaltung;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Automatische_Einstellung_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.FahrstrassePackage;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_AttributeGroup;
import org.eclipse.set.toolboxmodel.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Signale.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fstr Zug Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getAutomatischeEinstellung <em>Automatische Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getFstrVsigabstandVerkuerzt <em>Fstr Vsigabstand Verkuerzt</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getFstrZugDWeg <em>Fstr Zug DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Fahrstrasse.impl.Fstr_Zug_AttributeGroupImpl#getIDSignalGruppenausfahrt <em>ID Signal Gruppenausfahrt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Fstr_Zug_AttributeGroupImpl extends MinimalEObjectImpl.Container implements Fstr_Zug_AttributeGroup {
	/**
	 * The cached value of the '{@link #getAutomatischeEinstellung() <em>Automatische Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomatischeEinstellung()
	 * @generated
	 * @ordered
	 */
	protected Automatische_Einstellung_TypeClass automatischeEinstellung;

	/**
	 * The cached value of the '{@link #getFstrVsigabstandVerkuerzt() <em>Fstr Vsigabstand Verkuerzt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrVsigabstandVerkuerzt()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Vsigabstand_Verkuerzt_TypeClass fstrVsigabstandVerkuerzt;

	/**
	 * The cached value of the '{@link #getFstrZugDWeg() <em>Fstr Zug DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFstrZugDWeg()
	 * @generated
	 * @ordered
	 */
	protected Fstr_Zug_DWeg_AttributeGroup fstrZugDWeg;

	/**
	 * The cached value of the '{@link #getIDBUEEinschaltung() <em>IDBUE Einschaltung</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDBUEEinschaltung()
	 * @generated
	 * @ordered
	 */
	protected EList<BUE_Einschaltung> iDBUEEinschaltung;

	/**
	 * The cached value of the '{@link #getIDSignalGruppenausfahrt() <em>ID Signal Gruppenausfahrt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDSignalGruppenausfahrt()
	 * @generated
	 * @ordered
	 */
	protected Signal iDSignalGruppenausfahrt;

	/**
	 * This is true if the ID Signal Gruppenausfahrt reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDSignalGruppenausfahrtESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fstr_Zug_AttributeGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FahrstrassePackage.Literals.FSTR_ZUG_ATTRIBUTE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Automatische_Einstellung_TypeClass getAutomatischeEinstellung() {
		return automatischeEinstellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomatischeEinstellung(Automatische_Einstellung_TypeClass newAutomatischeEinstellung, NotificationChain msgs) {
		Automatische_Einstellung_TypeClass oldAutomatischeEinstellung = automatischeEinstellung;
		automatischeEinstellung = newAutomatischeEinstellung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, oldAutomatischeEinstellung, newAutomatischeEinstellung);
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
	public void setAutomatischeEinstellung(Automatische_Einstellung_TypeClass newAutomatischeEinstellung) {
		if (newAutomatischeEinstellung != automatischeEinstellung) {
			NotificationChain msgs = null;
			if (automatischeEinstellung != null)
				msgs = ((InternalEObject)automatischeEinstellung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, null, msgs);
			if (newAutomatischeEinstellung != null)
				msgs = ((InternalEObject)newAutomatischeEinstellung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, null, msgs);
			msgs = basicSetAutomatischeEinstellung(newAutomatischeEinstellung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG, newAutomatischeEinstellung, newAutomatischeEinstellung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Vsigabstand_Verkuerzt_TypeClass getFstrVsigabstandVerkuerzt() {
		return fstrVsigabstandVerkuerzt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrVsigabstandVerkuerzt(Fstr_Vsigabstand_Verkuerzt_TypeClass newFstrVsigabstandVerkuerzt, NotificationChain msgs) {
		Fstr_Vsigabstand_Verkuerzt_TypeClass oldFstrVsigabstandVerkuerzt = fstrVsigabstandVerkuerzt;
		fstrVsigabstandVerkuerzt = newFstrVsigabstandVerkuerzt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, oldFstrVsigabstandVerkuerzt, newFstrVsigabstandVerkuerzt);
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
	public void setFstrVsigabstandVerkuerzt(Fstr_Vsigabstand_Verkuerzt_TypeClass newFstrVsigabstandVerkuerzt) {
		if (newFstrVsigabstandVerkuerzt != fstrVsigabstandVerkuerzt) {
			NotificationChain msgs = null;
			if (fstrVsigabstandVerkuerzt != null)
				msgs = ((InternalEObject)fstrVsigabstandVerkuerzt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, null, msgs);
			if (newFstrVsigabstandVerkuerzt != null)
				msgs = ((InternalEObject)newFstrVsigabstandVerkuerzt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, null, msgs);
			msgs = basicSetFstrVsigabstandVerkuerzt(newFstrVsigabstandVerkuerzt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT, newFstrVsigabstandVerkuerzt, newFstrVsigabstandVerkuerzt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fstr_Zug_DWeg_AttributeGroup getFstrZugDWeg() {
		return fstrZugDWeg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFstrZugDWeg(Fstr_Zug_DWeg_AttributeGroup newFstrZugDWeg, NotificationChain msgs) {
		Fstr_Zug_DWeg_AttributeGroup oldFstrZugDWeg = fstrZugDWeg;
		fstrZugDWeg = newFstrZugDWeg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, oldFstrZugDWeg, newFstrZugDWeg);
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
	public void setFstrZugDWeg(Fstr_Zug_DWeg_AttributeGroup newFstrZugDWeg) {
		if (newFstrZugDWeg != fstrZugDWeg) {
			NotificationChain msgs = null;
			if (fstrZugDWeg != null)
				msgs = ((InternalEObject)fstrZugDWeg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, null, msgs);
			if (newFstrZugDWeg != null)
				msgs = ((InternalEObject)newFstrZugDWeg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, null, msgs);
			msgs = basicSetFstrZugDWeg(newFstrZugDWeg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG, newFstrZugDWeg, newFstrZugDWeg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BUE_Einschaltung> getIDBUEEinschaltung() {
		if (iDBUEEinschaltung == null) {
			iDBUEEinschaltung = new EObjectResolvingEList<BUE_Einschaltung>(BUE_Einschaltung.class, this, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG);
		}
		return iDBUEEinschaltung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signal getIDSignalGruppenausfahrt() {
		if (iDSignalGruppenausfahrt != null && iDSignalGruppenausfahrt.eIsProxy()) {
			InternalEObject oldIDSignalGruppenausfahrt = (InternalEObject)iDSignalGruppenausfahrt;
			iDSignalGruppenausfahrt = (Signal)eResolveProxy(oldIDSignalGruppenausfahrt);
			if (iDSignalGruppenausfahrt != oldIDSignalGruppenausfahrt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, oldIDSignalGruppenausfahrt, iDSignalGruppenausfahrt));
			}
		}
		return iDSignalGruppenausfahrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetIDSignalGruppenausfahrt() {
		return iDSignalGruppenausfahrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDSignalGruppenausfahrt(Signal newIDSignalGruppenausfahrt) {
		Signal oldIDSignalGruppenausfahrt = iDSignalGruppenausfahrt;
		iDSignalGruppenausfahrt = newIDSignalGruppenausfahrt;
		boolean oldIDSignalGruppenausfahrtESet = iDSignalGruppenausfahrtESet;
		iDSignalGruppenausfahrtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, oldIDSignalGruppenausfahrt, iDSignalGruppenausfahrt, !oldIDSignalGruppenausfahrtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDSignalGruppenausfahrt() {
		Signal oldIDSignalGruppenausfahrt = iDSignalGruppenausfahrt;
		boolean oldIDSignalGruppenausfahrtESet = iDSignalGruppenausfahrtESet;
		iDSignalGruppenausfahrt = null;
		iDSignalGruppenausfahrtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT, oldIDSignalGruppenausfahrt, null, oldIDSignalGruppenausfahrtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDSignalGruppenausfahrt() {
		return iDSignalGruppenausfahrtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return basicSetAutomatischeEinstellung(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				return basicSetFstrVsigabstandVerkuerzt(null, msgs);
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				return basicSetFstrZugDWeg(null, msgs);
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return getAutomatischeEinstellung();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				return getFstrVsigabstandVerkuerzt();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				return getFstrZugDWeg();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				return getIDBUEEinschaltung();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				if (resolve) return getIDSignalGruppenausfahrt();
				return basicGetIDSignalGruppenausfahrt();
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				setAutomatischeEinstellung((Automatische_Einstellung_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				setFstrVsigabstandVerkuerzt((Fstr_Vsigabstand_Verkuerzt_TypeClass)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				setFstrZugDWeg((Fstr_Zug_DWeg_AttributeGroup)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				getIDBUEEinschaltung().clear();
				getIDBUEEinschaltung().addAll((Collection<? extends BUE_Einschaltung>)newValue);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				setIDSignalGruppenausfahrt((Signal)newValue);
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				setAutomatischeEinstellung((Automatische_Einstellung_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				setFstrVsigabstandVerkuerzt((Fstr_Vsigabstand_Verkuerzt_TypeClass)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				setFstrZugDWeg((Fstr_Zug_DWeg_AttributeGroup)null);
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				getIDBUEEinschaltung().clear();
				return;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				unsetIDSignalGruppenausfahrt();
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
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__AUTOMATISCHE_EINSTELLUNG:
				return automatischeEinstellung != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_VSIGABSTAND_VERKUERZT:
				return fstrVsigabstandVerkuerzt != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__FSTR_ZUG_DWEG:
				return fstrZugDWeg != null;
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__IDBUE_EINSCHALTUNG:
				return iDBUEEinschaltung != null && !iDBUEEinschaltung.isEmpty();
			case FahrstrassePackage.FSTR_ZUG_ATTRIBUTE_GROUP__ID_SIGNAL_GRUPPENAUSFAHRT:
				return isSetIDSignalGruppenausfahrt();
			default:
				return super.eIsSet(featureID);
		}
	}

} //Fstr_Zug_AttributeGroupImpl
