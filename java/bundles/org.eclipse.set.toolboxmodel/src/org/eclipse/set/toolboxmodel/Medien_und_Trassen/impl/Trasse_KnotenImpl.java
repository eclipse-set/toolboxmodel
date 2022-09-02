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
import org.eclipse.set.toolboxmodel.Basisobjekte.Basis_Objekt;
import org.eclipse.set.toolboxmodel.Basisobjekte.impl.Basis_ObjektImpl;
import org.eclipse.set.toolboxmodel.Geodaten.GEO_Knoten;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten;
import org.eclipse.set.toolboxmodel.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trasse Knoten</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.Trasse_KnotenImpl#getIDAnschlussElement <em>ID Anschluss Element</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.Trasse_KnotenImpl#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.toolboxmodel.Medien_und_Trassen.impl.Trasse_KnotenImpl#getTrasseKnotenArt <em>Trasse Knoten Art</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Trasse_KnotenImpl extends Basis_ObjektImpl implements Trasse_Knoten {
	/**
	 * The cached value of the '{@link #getIDAnschlussElement() <em>ID Anschluss Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDAnschlussElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Basis_Objekt> iDAnschlussElement;

	/**
	 * The cached value of the '{@link #getIDGEOKnoten() <em>IDGEO Knoten</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDGEOKnoten()
	 * @generated
	 * @ordered
	 */
	protected GEO_Knoten iDGEOKnoten;

	/**
	 * This is true if the IDGEO Knoten reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDGEOKnotenESet;

	/**
	 * The cached value of the '{@link #getTrasseKnotenArt() <em>Trasse Knoten Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrasseKnotenArt()
	 * @generated
	 * @ordered
	 */
	protected Trasse_Knoten_Art_TypeClass trasseKnotenArt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Trasse_KnotenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Medien_und_TrassenPackage.Literals.TRASSE_KNOTEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Basis_Objekt> getIDAnschlussElement() {
		if (iDAnschlussElement == null) {
			iDAnschlussElement = new EObjectResolvingEList<Basis_Objekt>(Basis_Objekt.class, this, Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT);
		}
		return iDAnschlussElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GEO_Knoten getIDGEOKnoten() {
		if (iDGEOKnoten != null && iDGEOKnoten.eIsProxy()) {
			InternalEObject oldIDGEOKnoten = (InternalEObject)iDGEOKnoten;
			iDGEOKnoten = (GEO_Knoten)eResolveProxy(oldIDGEOKnoten);
			if (iDGEOKnoten != oldIDGEOKnoten) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten));
			}
		}
		return iDGEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GEO_Knoten basicGetIDGEOKnoten() {
		return iDGEOKnoten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIDGEOKnoten(GEO_Knoten newIDGEOKnoten) {
		GEO_Knoten oldIDGEOKnoten = iDGEOKnoten;
		iDGEOKnoten = newIDGEOKnoten;
		boolean oldIDGEOKnotenESet = iDGEOKnotenESet;
		iDGEOKnotenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, iDGEOKnoten, !oldIDGEOKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetIDGEOKnoten() {
		GEO_Knoten oldIDGEOKnoten = iDGEOKnoten;
		boolean oldIDGEOKnotenESet = iDGEOKnotenESet;
		iDGEOKnoten = null;
		iDGEOKnotenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN, oldIDGEOKnoten, null, oldIDGEOKnotenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetIDGEOKnoten() {
		return iDGEOKnotenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trasse_Knoten_Art_TypeClass getTrasseKnotenArt() {
		return trasseKnotenArt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrasseKnotenArt(Trasse_Knoten_Art_TypeClass newTrasseKnotenArt, NotificationChain msgs) {
		Trasse_Knoten_Art_TypeClass oldTrasseKnotenArt = trasseKnotenArt;
		trasseKnotenArt = newTrasseKnotenArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, oldTrasseKnotenArt, newTrasseKnotenArt);
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
	public void setTrasseKnotenArt(Trasse_Knoten_Art_TypeClass newTrasseKnotenArt) {
		if (newTrasseKnotenArt != trasseKnotenArt) {
			NotificationChain msgs = null;
			if (trasseKnotenArt != null)
				msgs = ((InternalEObject)trasseKnotenArt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, null, msgs);
			if (newTrasseKnotenArt != null)
				msgs = ((InternalEObject)newTrasseKnotenArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, null, msgs);
			msgs = basicSetTrasseKnotenArt(newTrasseKnotenArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART, newTrasseKnotenArt, newTrasseKnotenArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				return basicSetTrasseKnotenArt(null, msgs);
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				return getIDAnschlussElement();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				if (resolve) return getIDGEOKnoten();
				return basicGetIDGEOKnoten();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				return getTrasseKnotenArt();
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				getIDAnschlussElement().clear();
				getIDAnschlussElement().addAll((Collection<? extends Basis_Objekt>)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				setIDGEOKnoten((GEO_Knoten)newValue);
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				setTrasseKnotenArt((Trasse_Knoten_Art_TypeClass)newValue);
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				getIDAnschlussElement().clear();
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				unsetIDGEOKnoten();
				return;
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				setTrasseKnotenArt((Trasse_Knoten_Art_TypeClass)null);
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
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT:
				return iDAnschlussElement != null && !iDAnschlussElement.isEmpty();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__IDGEO_KNOTEN:
				return isSetIDGEOKnoten();
			case Medien_und_TrassenPackage.TRASSE_KNOTEN__TRASSE_KNOTEN_ART:
				return trasseKnotenArt != null;
			default:
				return super.eIsSet(featureID);
		}
	}

} //Trasse_KnotenImpl
