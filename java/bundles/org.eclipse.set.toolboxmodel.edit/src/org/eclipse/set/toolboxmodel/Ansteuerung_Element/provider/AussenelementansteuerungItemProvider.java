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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementFactory;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;
import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Basis_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.PlanPro.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Ansteuerung_Element.Aussenelementansteuerung} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AussenelementansteuerungItemProvider extends Basis_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AussenelementansteuerungItemProvider(AdapterFactory adapterFactory) {
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

			addIDInformationPrimaerPropertyDescriptor(object);
			addIDInformationSekundaerPropertyDescriptor(object);
			addIDOertlichkeitGesteuertPropertyDescriptor(object);
			addIDOertlichkeitNamensgebendPropertyDescriptor(object);
			addIDUnterbringungPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Information Primaer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDInformationPrimaerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aussenelementansteuerung_iDInformationPrimaer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aussenelementansteuerung_iDInformationPrimaer_feature", "_UI_Aussenelementansteuerung_type"),
				 Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_PRIMAER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Information Sekundaer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDInformationSekundaerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aussenelementansteuerung_iDInformationSekundaer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aussenelementansteuerung_iDInformationSekundaer_feature", "_UI_Aussenelementansteuerung_type"),
				 Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__ID_INFORMATION_SEKUNDAER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ID Oertlichkeit Gesteuert feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDOertlichkeitGesteuertPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Aussenelementansteuerung_iDOertlichkeitGesteuert_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aussenelementansteuerung_iDOertlichkeitGesteuert_feature", "_UI_Aussenelementansteuerung_type"),
				 Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_GESTEUERT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
				 getString("_UI_Aussenelementansteuerung_iDOertlichkeitNamensgebend_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aussenelementansteuerung_iDOertlichkeitNamensgebend_feature", "_UI_Aussenelementansteuerung_type"),
				 Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__ID_OERTLICHKEIT_NAMENSGEBEND,
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
				 getString("_UI_Aussenelementansteuerung_iDUnterbringung_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Aussenelementansteuerung_iDUnterbringung_feature", "_UI_Aussenelementansteuerung_type"),
				 Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__ID_UNTERBRINGUNG,
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
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__AEA_ALLG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK);
			childrenFeatures.add(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG);
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
	 * This returns Aussenelementansteuerung.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Aussenelementansteuerung"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Aussenelementansteuerung_type");
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

		switch (notification.getFeatureID(Aussenelementansteuerung.class)) {
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ALLG:
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG:
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK:
			case Ansteuerung_ElementPackage.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG:
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
				(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__AEA_ALLG,
				 Ansteuerung_ElementFactory.eINSTANCE.createAEA_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__AEA_ENERGIEVERSORGUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createAEA_Energieversorgung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__AEAGFKIP_ADRESSBLOCK,
				 Ansteuerung_ElementFactory.eINSTANCE.createAEA_GFK_IP_Adressblock_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Ansteuerung_ElementPackage.Literals.AUSSENELEMENTANSTEUERUNG__BEZEICHNUNG,
				 Ansteuerung_ElementFactory.eINSTANCE.createAussenelementansteuerung_Bezeichnung_AttributeGroup()));
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
