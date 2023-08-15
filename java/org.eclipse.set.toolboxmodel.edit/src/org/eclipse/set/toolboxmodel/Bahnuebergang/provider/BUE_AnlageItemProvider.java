/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangFactory;
import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisTypenFactory;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Punkt_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Bahnuebergang.BUE_Anlage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BUE_AnlageItemProvider extends Punkt_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BUE_AnlageItemProvider(AdapterFactory adapterFactory) {
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

			addIDAEABUEAnschaltungPropertyDescriptor(object);
			addIDBUESchnittstellePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the IDAEABUE Anschaltung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDAEABUEAnschaltungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BUE_Anlage_iDAEABUEAnschaltung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BUE_Anlage_iDAEABUEAnschaltung_feature", "_UI_BUE_Anlage_type"),
				 BahnuebergangPackage.eINSTANCE.getBUE_Anlage_IDAEABUEAnschaltung(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDBUE Schnittstelle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDBUESchnittstellePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BUE_Anlage_iDBUESchnittstelle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BUE_Anlage_iDBUESchnittstelle_feature", "_UI_BUE_Anlage_type"),
				 BahnuebergangPackage.eINSTANCE.getBUE_Anlage_IDBUESchnittstelle(),
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
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getBUE_Anlage_Bezeichnung());
			childrenFeatures.add(BahnuebergangPackage.eINSTANCE.getBUE_Anlage_BUEAnlageAllg());
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
	 * This returns BUE_Anlage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BUE_Anlage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BUE_Anlage_type");
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

		switch (notification.getFeatureID(BUE_Anlage.class)) {
			case BahnuebergangPackage.BUE_ANLAGE__BEZEICHNUNG:
			case BahnuebergangPackage.BUE_ANLAGE__BUE_ANLAGE_ALLG:
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
				(BahnuebergangPackage.eINSTANCE.getBUE_Anlage_Bezeichnung(),
				 BasisTypenFactory.eINSTANCE.createBezeichnung_Element_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BahnuebergangPackage.eINSTANCE.getBUE_Anlage_BUEAnlageAllg(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Anlage_Allg_AttributeGroup()));
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
