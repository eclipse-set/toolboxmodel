/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Block.provider;


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

import org.eclipse.set.toolboxmodel.Block.BlockFactory;
import org.eclipse.set.toolboxmodel.Block.BlockPackage;
import org.eclipse.set.toolboxmodel.Block.Block_Element;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Block.Block_Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Block_ElementItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block_ElementItemProvider(AdapterFactory adapterFactory) {
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

			addIDBlockStreckePropertyDescriptor(object);
			addIDRaeumungspruefungPropertyDescriptor(object);
			addIDSignalPropertyDescriptor(object);
			addIDZugschlussmeldungPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Block Strecke feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDBlockStreckePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Block_Element_iDBlockStrecke_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Block_Element_iDBlockStrecke_feature", "_UI_Block_Element_type"),
				 BlockPackage.Literals.BLOCK_ELEMENT__ID_BLOCK_STRECKE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Raeumungspruefung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDRaeumungspruefungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Block_Element_iDRaeumungspruefung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Block_Element_iDRaeumungspruefung_feature", "_UI_Block_Element_type"),
				 BlockPackage.Literals.BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Signal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDSignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Block_Element_iDSignal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Block_Element_iDSignal_feature", "_UI_Block_Element_type"),
				 BlockPackage.Literals.BLOCK_ELEMENT__ID_SIGNAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Zugschlussmeldung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDZugschlussmeldungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Block_Element_iDZugschlussmeldung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Block_Element_iDZugschlussmeldung_feature", "_UI_Block_Element_type"),
				 BlockPackage.Literals.BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG,
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
			childrenFeatures.add(BlockPackage.Literals.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG);
			childrenFeatures.add(BlockPackage.Literals.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS);
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
	 * This returns Block_Element.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Block_Element"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Block_Element_type");
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

		switch (notification.getFeatureID(Block_Element.class)) {
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG:
			case BlockPackage.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS:
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
				(BlockPackage.Literals.BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG,
				 BlockFactory.eINSTANCE.createBlock_Element_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(BlockPackage.Literals.BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS,
				 BlockFactory.eINSTANCE.createBlock_Element_Erlaubnis_AttributeGroup()));
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
