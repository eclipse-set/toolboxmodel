/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.provider;


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

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZN_AnzeigefeldItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZN_AnzeigefeldItemProvider(AdapterFactory adapterFactory) {
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

			addIDGleisAbschnittPropertyDescriptor(object);
			addIDZLVBusPropertyDescriptor(object);
			addIDZNPropertyDescriptor(object);
			addIDZNAnzeigefeldPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Gleis Abschnitt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDGleisAbschnittPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZN_Anzeigefeld_iDGleisAbschnitt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZN_Anzeigefeld_iDGleisAbschnitt_feature", "_UI_ZN_Anzeigefeld_type"),
				 ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__ID_GLEIS_ABSCHNITT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDZLV Bus feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDZLVBusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZN_Anzeigefeld_iDZLVBus_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZN_Anzeigefeld_iDZLVBus_feature", "_UI_ZN_Anzeigefeld_type"),
				 ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__IDZLV_BUS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDZN feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDZNPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZN_Anzeigefeld_iDZN_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZN_Anzeigefeld_iDZN_feature", "_UI_ZN_Anzeigefeld_type"),
				 ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__IDZN,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDZN Anzeigefeld feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDZNAnzeigefeldPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZN_Anzeigefeld_iDZNAnzeigefeld_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZN_Anzeigefeld_iDZNAnzeigefeld_feature", "_UI_ZN_Anzeigefeld_type"),
				 ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__IDZN_ANZEIGEFELD,
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
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG);
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
	 * This returns ZN_Anzeigefeld.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZN_Anzeigefeld"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZN_Anzeigefeld_type");
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

		switch (notification.getFeatureID(ZN_Anzeigefeld.class)) {
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG:
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
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_ALLG,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Anzeigefeld_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD__ZN_ANZEIGEFELD_BEZEICHNUNG,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Anzeigefeld_Bezeichnung_AttributeGroup()));
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
