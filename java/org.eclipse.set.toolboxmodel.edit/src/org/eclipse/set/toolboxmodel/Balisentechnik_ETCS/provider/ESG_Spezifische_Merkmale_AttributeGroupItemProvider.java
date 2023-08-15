/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.provider;


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

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESG_Spezifische_Merkmale_AttributeGroupItemProvider 
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
	public ESG_Spezifische_Merkmale_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSPaketnummer());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSParErlaeuterung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSParametername());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSParameterwert());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_Rekursion2Nr());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_RekursionNr());
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
	 * This returns ESG_Spezifische_Merkmale_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESG_Spezifische_Merkmale_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ESG_Spezifische_Merkmale_AttributeGroup_type");
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

		switch (notification.getFeatureID(ESG_Spezifische_Merkmale_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAKETNUMMER:
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PAR_ERLAEUTERUNG:
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERNAME:
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__ETCS_PARAMETERWERT:
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION2_NR:
			case Balisentechnik_ETCSPackage.ESG_SPEZIFISCHE_MERKMALE_ATTRIBUTE_GROUP__REKURSION_NR:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSPaketnummer(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Paketnummer_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSParErlaeuterung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Par_Erlaeuterung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSParametername(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Parametername_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_ETCSParameterwert(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Parameterwert_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_Rekursion2Nr(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createRekursion_2_Nr_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getESG_Spezifische_Merkmale_AttributeGroup_RekursionNr(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createRekursion_Nr_TypeClass()));
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
