/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Uebertragungsweg;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Uebertragungsweg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UebertragungswegItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UebertragungswegItemProvider(AdapterFactory adapterFactory) {
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

			addIDAnhangUeWegNachPropertyDescriptor(object);
			addIDAnhangUeWegVonPropertyDescriptor(object);
			addIDUebertragungswegNachPropertyDescriptor(object);
			addIDUebertragungswegVonPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Anhang Ue Weg Nach feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDAnhangUeWegNachPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Uebertragungsweg_iDAnhangUeWegNach_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Uebertragungsweg_iDAnhangUeWegNach_feature", "_UI_Uebertragungsweg_type"),
				 Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_NACH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Anhang Ue Weg Von feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDAnhangUeWegVonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Uebertragungsweg_iDAnhangUeWegVon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Uebertragungsweg_iDAnhangUeWegVon_feature", "_UI_Uebertragungsweg_type"),
				 Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_ANHANG_UE_WEG_VON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Uebertragungsweg Nach feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDUebertragungswegNachPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Uebertragungsweg_iDUebertragungswegNach_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Uebertragungsweg_iDUebertragungswegNach_feature", "_UI_Uebertragungsweg_type"),
				 Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_NACH,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Uebertragungsweg Von feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDUebertragungswegVonPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Uebertragungsweg_iDUebertragungswegVon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Uebertragungsweg_iDUebertragungswegVon_feature", "_UI_Uebertragungsweg_type"),
				 Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__ID_UEBERTRAGUNGSWEG_VON,
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK);
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
	 * This returns Uebertragungsweg.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Uebertragungsweg"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Uebertragungsweg_type");
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

		switch (notification.getFeatureID(Uebertragungsweg.class)) {
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART:
			case Ansteuerung_ElementPackage.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK:
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
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_ART,
				 Ansteuerung_ElementFactory.eINSTANCE.createUebertragungsweg_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.UEBERTRAGUNGSWEG__UEBERTRAGUNGSWEG_TECHNIK,
				 Ansteuerung_ElementFactory.eINSTANCE.createUebertragungsweg_Technik_AttributeGroup()));
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
