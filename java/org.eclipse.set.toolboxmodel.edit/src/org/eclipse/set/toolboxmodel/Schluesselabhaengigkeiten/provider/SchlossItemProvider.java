/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenFactory;
import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.Schloss} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchlossItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchlossItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIDSchluesselPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Schluessel feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDSchluesselPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schloss_iDSchluessel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schloss_iDSchluessel_feature", "_UI_Schloss_type"),
				 SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__ID_SCHLUESSEL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__BEZEICHNUNG);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_BUE);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_GSP);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_SK);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_SONDERANLAGE);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_SSP);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_W);
			childrenFeatures.add(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__TECHNISCH_BERECHTIGTER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Schloss.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Schloss"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Schloss_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Schloss.class)) {
			case SchluesselabhaengigkeitenPackage.SCHLOSS__BEZEICHNUNG:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_BUE:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_GSP:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SK:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SONDERANLAGE:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_SSP:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__SCHLOSS_W:
			case SchluesselabhaengigkeitenPackage.SCHLOSS__TECHNISCH_BERECHTIGTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
			default:
				super.notifyChanged(notification);
				return;
			}
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__BEZEICHNUNG,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchluessel_In_Grdst_Eingeschl_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_BUE,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_BUE_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_GSP,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_Gsp_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_SK,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_Sk_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_SONDERANLAGE,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_Sonderanlage_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_SSP,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_Ssp_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__SCHLOSS_W,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss_W_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SchluesselabhaengigkeitenPackage.Literals.SCHLOSS__TECHNISCH_BERECHTIGTER,
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createTechnisch_Berechtigter_TypeClass()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlanProEditPlugin.INSTANCE;
	}

}
