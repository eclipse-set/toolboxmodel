/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Geodaten.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Geodaten.GeodatenFactory;
import org.eclipse.set.toolboxmodel.Geodaten.GeodatenPackage;
import org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup;

import org.eclipse.set.toolboxmodel.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Geodaten.Oertlichkeit_Bezeichnung_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Oertlichkeit_Bezeichnung_AttributeGroupItemProvider 
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
	public Oertlichkeit_Bezeichnung_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG);
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME);
			childrenFeatures.add(GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME);
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
	 * This returns Oertlichkeit_Bezeichnung_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Oertlichkeit_Bezeichnung_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Oertlichkeit_Bezeichnung_AttributeGroup_type");
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

		switch (notification.getFeatureID(Oertlichkeit_Bezeichnung_AttributeGroup.class)) {
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG:
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME:
			case GeodatenPackage.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME:
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
				(GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_ABKUERZUNG,
				 GeodatenFactory.eINSTANCE.createOertlichkeit_Abkuerzung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_KURZNAME,
				 GeodatenFactory.eINSTANCE.createOertlichkeit_Kurzname_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(GeodatenPackage.Literals.OERTLICHKEIT_BEZEICHNUNG_ATTRIBUTE_GROUP__OERTLICHKEIT_LANGNAME,
				 GeodatenFactory.eINSTANCE.createOertlichkeit_Langname_TypeClass()));
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
