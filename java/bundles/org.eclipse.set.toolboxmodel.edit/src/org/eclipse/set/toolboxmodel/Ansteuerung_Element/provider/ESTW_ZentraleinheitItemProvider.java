/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.ESTW_Zentraleinheit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ESTW_ZentraleinheitItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESTW_ZentraleinheitItemProvider(AdapterFactory adapterFactory) {
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

			addIDOertlichkeitNamensgebendPropertyDescriptor(object);
			addIDUnterbringungPropertyDescriptor(object);
			addIDBedienBezirkVirtuellPropertyDescriptor(object);
			addIDBedienBezirkZentralPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Oertlichkeit Namensgebend feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDOertlichkeitNamensgebendPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESTW_Zentraleinheit_iDOertlichkeitNamensgebend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESTW_Zentraleinheit_iDOertlichkeitNamensgebend_feature", "_UI_ESTW_Zentraleinheit_type"),
				 Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_OERTLICHKEIT_NAMENSGEBEND,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Unterbringung feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDUnterbringungPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESTW_Zentraleinheit_iDUnterbringung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESTW_Zentraleinheit_iDUnterbringung_feature", "_UI_ESTW_Zentraleinheit_type"),
				 Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_UNTERBRINGUNG,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Bedien Bezirk Virtuell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDBedienBezirkVirtuellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESTW_Zentraleinheit_iDBedienBezirkVirtuell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESTW_Zentraleinheit_iDBedienBezirkVirtuell_feature", "_UI_ESTW_Zentraleinheit_type"),
				 Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_VIRTUELL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Bedien Bezirk Zentral feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDBedienBezirkZentralPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ESTW_Zentraleinheit_iDBedienBezirkZentral_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ESTW_Zentraleinheit_iDBedienBezirkZentral_feature", "_UI_ESTW_Zentraleinheit_type"),
				 Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ID_BEDIEN_BEZIRK_ZENTRAL,
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__BEZEICHNUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTWZE_ENERGIEVERSORGUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG);
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
	 * This returns ESTW_Zentraleinheit.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ESTW_Zentraleinheit"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ESTW_Zentraleinheit_type");
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

		switch (notification.getFeatureID(ESTW_Zentraleinheit.class)) {
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__BEZEICHNUNG:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTWZE_ENERGIEVERSORGUNG:
			case Ansteuerung_ElementPackage.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG:
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
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__BEZEICHNUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_Zentraleinheit_Bezeichnung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTWZE_ENERGIEVERSORGUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_ZE_Energieversorgung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.ESTW_ZENTRALEINHEIT__ESTW_ZENTRALEINHEIT_ALLG,
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_Zentraleinheit_Allg_AttributeGroup()));
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
