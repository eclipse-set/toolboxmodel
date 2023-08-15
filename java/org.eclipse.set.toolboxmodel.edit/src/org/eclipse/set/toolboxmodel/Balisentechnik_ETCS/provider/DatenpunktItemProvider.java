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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Punkt_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Datenpunkt} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatenpunktItemProvider extends Punkt_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatenpunktItemProvider(AdapterFactory adapterFactory) {
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

			addIDRBCPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the IDRBC feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDRBCPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Datenpunkt_iDRBC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Datenpunkt_iDRBC_feature", "_UI_Datenpunkt_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_IDRBC(),
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DatenpunktAllg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DatenpunktEinmesspunkt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPBezugFunktional());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPETCSAdresse());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPTyp());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_LEUSteuernde());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPTelegramm());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPTelegrammESG());
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
	 * This returns Datenpunkt.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Datenpunkt"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Datenpunkt_type");
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

		switch (notification.getFeatureID(Datenpunkt.class)) {
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_ALLG:
			case Balisentechnik_ETCSPackage.DATENPUNKT__DATENPUNKT_EINMESSPUNKT:
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_BEZUG_FUNKTIONAL:
			case Balisentechnik_ETCSPackage.DATENPUNKT__DPETCS_ADRESSE:
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TYP:
			case Balisentechnik_ETCSPackage.DATENPUNKT__LEU_STEUERNDE:
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM:
			case Balisentechnik_ETCSPackage.DATENPUNKT__DP_TELEGRAMM_ESG:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DatenpunktAllg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDatenpunkt_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DatenpunktEinmesspunkt(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDatenpunkt_Einmesspunkt_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPBezugFunktional(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDP_Bezug_Funktional_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPETCSAdresse(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDP_ETCS_Adresse_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPTyp(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDP_Typ_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_LEUSteuernde(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLEU_Steuernde_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPTelegramm(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDP_Telegramm_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getDatenpunkt_DPTelegrammESG(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDP_Telegramm_ESG_AttributeGroup()));
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
