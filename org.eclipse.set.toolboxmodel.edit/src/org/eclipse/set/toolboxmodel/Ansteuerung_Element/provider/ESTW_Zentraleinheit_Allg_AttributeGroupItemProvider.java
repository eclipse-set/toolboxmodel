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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup;

import org.eclipse.set.toolboxmodel.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESTW_Zentraleinheit_Allg_AttributeGroupItemProvider 
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
	public ESTW_Zentraleinheit_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER);
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
	 * This returns ESTW_Zentraleinheit_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESTW_Zentraleinheit_Allg_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ESTW_Zentraleinheit_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(ESTW_Zentraleinheit_Allg_AttributeGroup.class)) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER:
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
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__BAUART,
				 Ansteuerung_ElementFactory.eINSTANCE.createBauart_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART,
				 Ansteuerung_ElementFactory.eINSTANCE.createEnergieversorgung_Art_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ,
				 Ansteuerung_ElementFactory.eINSTANCE.createEnergieversorgung_Art_Ersatz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2,
				 Ansteuerung_ElementFactory.eINSTANCE.createEnergieversorgung_Art_Ersatz_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__HERSTELLER,
				 Ansteuerung_ElementFactory.eINSTANCE.createHersteller_TypeClass()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ ||
			childFeature == Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT_ALLG_ATTRIBUTE_GROUP__ENERGIEVERSORGUNG_ART_ERSATZ2;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
