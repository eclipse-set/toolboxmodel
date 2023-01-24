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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.ETCS_Signal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ETCS_SignalItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETCS_SignalItemProvider(AdapterFactory adapterFactory) {
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

			addIDETCSGefahrpunktPropertyDescriptor(object);
			addIDETCSGefahrpunkt2PropertyDescriptor(object);
			addIDHOAFBOAPropertyDescriptor(object);
			addIDRBCPropertyDescriptor(object);
			addIDSignalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the IDETCS Gefahrpunkt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDETCSGefahrpunktPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETCS_Signal_iDETCSGefahrpunkt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETCS_Signal_iDETCSGefahrpunkt_feature", "_UI_ETCS_Signal_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDETCS Gefahrpunkt2 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDETCSGefahrpunkt2PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETCS_Signal_iDETCSGefahrpunkt2_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETCS_Signal_iDETCSGefahrpunkt2_feature", "_UI_ETCS_Signal_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDETCSGefahrpunkt2(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDHOAFBOA feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDHOAFBOAPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ETCS_Signal_iDHOAFBOA_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETCS_Signal_iDHOAFBOA_feature", "_UI_ETCS_Signal_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDHOAFBOA(),
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_ETCS_Signal_iDRBC_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETCS_Signal_iDRBC_feature", "_UI_ETCS_Signal_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDRBC(),
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
				 getString("_UI_ETCS_Signal_iDSignal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ETCS_Signal_iDSignal_feature", "_UI_ETCS_Signal_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_IDSignal(),
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSGefahrpunktabstandAbweichend());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalAllg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalDWeg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalTBV());
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
	 * This returns ETCS_Signal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ETCS_Signal"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ETCS_Signal_type");
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

		switch (notification.getFeatureID(ETCS_Signal.class)) {
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_GEFAHRPUNKTABSTAND_ABWEICHEND:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_ALLG:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_DWEG:
			case Balisentechnik_ETCSPackage.ETCS_SIGNAL__ETCS_SIGNAL_TBV:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSGefahrpunktabstandAbweichend(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Gefahrpunktabstand_Abweichend_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalAllg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalDWeg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal_DWeg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getETCS_Signal_ETCSSignalTBV(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal_TBV_AttributeGroup()));
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
