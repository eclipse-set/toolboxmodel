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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Fachtelegramm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FachtelegrammItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FachtelegrammItemProvider(AdapterFactory adapterFactory) {
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

			addIDDokuTelegrammkodierungPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Doku Telegrammkodierung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDDokuTelegrammkodierungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Fachtelegramm_iDDokuTelegrammkodierung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Fachtelegramm_iDDokuTelegrammkodierung_feature", "_UI_Fachtelegramm_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_IDDokuTelegrammkodierung(),
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTFahrwegTeile());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_WirkrichtungInDatenpunkt());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTESGMerkmale());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTETCSL2Merkmale());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTETCSTransMerkmale());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTGNTMerkmale());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTZBSMerkmale());
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
	 * This returns Fachtelegramm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Fachtelegramm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Fachtelegramm_type");
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

		switch (notification.getFeatureID(Fachtelegramm.class)) {
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FT_FAHRWEG_TEILE:
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__WIRKRICHTUNG_IN_DATENPUNKT:
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTESG_MERKMALE:
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCSL2_MERKMALE:
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTETCS_TRANS_MERKMALE:
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTGNT_MERKMALE:
			case Balisentechnik_ETCSPackage.FACHTELEGRAMM__FTZBS_MERKMALE:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTFahrwegTeile(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_Fahrweg_Teile_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_WirkrichtungInDatenpunkt(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createWirkrichtung_In_Datenpunkt_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTESGMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_ESG_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTETCSL2Merkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_ETCS_L2_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTETCSTransMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_ETCS_Trans_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTGNTMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_GNT_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFachtelegramm_FTZBSMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_ZBS_Merkmale_AttributeGroup()));
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
