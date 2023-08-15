/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Basisobjekte.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjekteFactory;
import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjektePackage;
import org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Punkt_Objekt_TOP_Kante_AttributeGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Punkt_Objekt_TOP_Kante_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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

			addIDGEOPunktBerechnetPropertyDescriptor(object);
			addIDTOPKantePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the IDGEO Punkt Berechnet feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDGEOPunktBerechnetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_iDGEOPunktBerechnet_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_iDGEOPunktBerechnet_feature", "_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_type"),
				 BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDGEO_PUNKT_BERECHNET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDTOP Kante feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDTOPKantePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_iDTOPKante_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_iDTOPKante_feature", "_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_type"),
				 BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__IDTOP_KANTE,
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
			childrenFeatures.add(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND);
			childrenFeatures.add(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG);
			childrenFeatures.add(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE);
			childrenFeatures.add(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND);
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
	 * This returns Punkt_Objekt_TOP_Kante_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Punkt_Objekt_TOP_Kante_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Punkt_Objekt_TOP_Kante_AttributeGroup_type");
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

		switch (notification.getFeatureID(Punkt_Objekt_TOP_Kante_AttributeGroup.class)) {
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND:
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG:
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE:
			case BasisobjektePackage.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND:
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
				(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__ABSTAND,
				 BasisobjekteFactory.eINSTANCE.createAbstand_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__WIRKRICHTUNG,
				 BasisobjekteFactory.eINSTANCE.createWirkrichtung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHE_LAGE,
				 BasisobjekteFactory.eINSTANCE.createSeitliche_Lage_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(BasisobjektePackage.Literals.PUNKT_OBJEKT_TOP_KANTE_ATTRIBUTE_GROUP__SEITLICHER_ABSTAND,
				 BasisobjekteFactory.eINSTANCE.createSeitlicher_Abstand_TypeClass()));
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
