/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.provider;


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

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;
import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZN_Anzeigefeld_Allg_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZN_Anzeigefeld_Allg_AttributeGroupItemProvider 
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
	public ZN_Anzeigefeld_Allg_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE);
			childrenFeatures.add(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG);
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
	 * This returns ZN_Anzeigefeld_Allg_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ZN_Anzeigefeld_Allg_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ZN_Anzeigefeld_Allg_AttributeGroup_type");
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

		switch (notification.getFeatureID(ZN_Anzeigefeld_Allg_AttributeGroup.class)) {
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE:
			case ZugnummernmeldeanlagePackage.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG:
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
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BEDIENBARKEIT_ANZEIGEFELD,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createBedienbarkeit_Anzeigefeld_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ANB,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createBf_Nr_ANB_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__BF_NR_ZNA,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createBf_Nr_ZN_A_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__FUNKTIONALITAET_ANZEIGEFELD,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createFunktionalitaet_Anzeigefeld_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__HOA,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createHOA_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__SICHTBARKEIT_ANZEIGEFELD,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createSichtbarkeit_Anzeigefeld_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VERZOEGERUNG_MANUELL_LOESCHUNG,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createVerzoegerung_Manuell_Loeschung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__VORMELDESTART,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createVormeldestart_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD_LOESCHKRITERIUM,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Anzeigefeld_Loeschkriterium_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZN_FELD_OHNE_ANZEIGE,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Feld_Ohne_Anzeige_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(ZugnummernmeldeanlagePackage.Literals.ZN_ANZEIGEFELD_ALLG_ATTRIBUTE_GROUP__ZUGVORBEREITUNGSMELDUNG,
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZugvorbereitungsmeldung_TypeClass()));
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
