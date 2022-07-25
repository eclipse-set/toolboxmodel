/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zuglenkung.provider;


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

import org.eclipse.set.toolboxmodel.PlanPro.provider.PlanProEditPlugin;

import org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungFactory;
import org.eclipse.set.toolboxmodel.Zuglenkung.ZuglenkungPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Zuglenkung.ZL_Fstr_Anstoss} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZL_Fstr_AnstossItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZL_Fstr_AnstossItemProvider(AdapterFactory adapterFactory) {
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

			addIDEinschaltpunktPropertyDescriptor(object);
			addIDVorsignalPropertyDescriptor(object);
			addIDZLFstrPropertyDescriptor(object);
			addIDZNAnzeigefeldAnstossPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Einschaltpunkt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDEinschaltpunktPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZL_Fstr_Anstoss_iDEinschaltpunkt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZL_Fstr_Anstoss_iDEinschaltpunkt_feature", "_UI_ZL_Fstr_Anstoss_type"),
				 ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Vorsignal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDVorsignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZL_Fstr_Anstoss_iDVorsignal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZL_Fstr_Anstoss_iDVorsignal_feature", "_UI_ZL_Fstr_Anstoss_type"),
				 ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__ID_VORSIGNAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDZL Fstr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDZLFstrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZL_Fstr_Anstoss_iDZLFstr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZL_Fstr_Anstoss_iDZLFstr_feature", "_UI_ZL_Fstr_Anstoss_type"),
				 ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__IDZL_FSTR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDZN Anzeigefeld Anstoss feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDZNAnzeigefeldAnstossPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ZL_Fstr_Anstoss_iDZNAnzeigefeldAnstoss_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ZL_Fstr_Anstoss_iDZNAnzeigefeldAnstoss_feature", "_UI_ZL_Fstr_Anstoss_type"),
				 ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS,
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
			childrenFeatures.add(ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG);
			childrenFeatures.add(ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK);
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
	 * This returns ZL_Fstr_Anstoss.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZL_Fstr_Anstoss"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZL_Fstr_Anstoss_type");
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

		switch (notification.getFeatureID(ZL_Fstr_Anstoss.class)) {
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG:
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK:
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
				(ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG,
				 ZuglenkungFactory.eINSTANCE.createZL_Fstr_Anstoss_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ZuglenkungPackage.Literals.ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK,
				 ZuglenkungFactory.eINSTANCE.createZL_Fstr_Anstoss_GK_AttributeGroup()));
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
