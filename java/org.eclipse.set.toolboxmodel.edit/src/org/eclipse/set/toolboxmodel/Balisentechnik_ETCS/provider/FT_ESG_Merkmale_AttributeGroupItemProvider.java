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
import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FT_ESG_Merkmale_AttributeGroupItemProvider 
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
	public FT_ESG_Merkmale_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
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

			addIDMassgebendesZielsignalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Massgebendes Zielsignal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDMassgebendesZielsignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FT_ESG_Merkmale_AttributeGroup_iDMassgebendesZielsignal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FT_ESG_Merkmale_AttributeGroup_iDMassgebendesZielsignal_feature", "_UI_FT_ESG_Merkmale_AttributeGroup_type"),
				 Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_IDMassgebendesZielsignal(),
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
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_AbstandBesLangerEinfahrweg());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_DPTypVLa());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_ESGIndividuelleMerkmale());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_ESGSpezifischeMerkmale());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_IndividualisierungWeitere());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_LaengeGestufteVSignalisierung());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_NIDTSR());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_Projektierungsfall());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_Telegrammnummer());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_UeberwachungLaenge());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_VStart());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_VZiel());
			childrenFeatures.add(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_Vorsignalabstand());
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
	 * This returns FT_ESG_Merkmale_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FT_ESG_Merkmale_AttributeGroup"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FT_ESG_Merkmale_AttributeGroup_type");
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

		switch (notification.getFeatureID(FT_ESG_Merkmale_AttributeGroup.class)) {
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ABSTAND_BES_LANGER_EINFAHRWEG:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__DP_TYP_VLA:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_INDIVIDUELLE_MERKMALE:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__ESG_SPEZIFISCHE_MERKMALE:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__INDIVIDUALISIERUNG_WEITERE:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__LAENGE_GESTUFTE_VSIGNALISIERUNG:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__NIDTSR:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__PROJEKTIERUNGSFALL:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__TELEGRAMMNUMMER:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__UEBERWACHUNG_LAENGE:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VSTART:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VZIEL:
			case Balisentechnik_ETCSPackage.FT_ESG_MERKMALE_ATTRIBUTE_GROUP__VORSIGNALABSTAND:
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
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_AbstandBesLangerEinfahrweg(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createAbstand_Bes_Langer_Einfahrweg_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_DPTypVLa(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDP_Typ_V_La_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_ESGIndividuelleMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createESG_Individuelle_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_ESGSpezifischeMerkmale(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createESG_Spezifische_Merkmale_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_IndividualisierungWeitere(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createIndividualisierung_Weitere_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_LaengeGestufteVSignalisierung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLaenge_Gestufte_V_Signalisierung_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_NIDTSR(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createNID_TSR_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_Projektierungsfall(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createProjektierungsfall_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_Telegrammnummer(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createTelegrammnummer_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_UeberwachungLaenge(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createUeberwachung_Laenge_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_VStart(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createV_Start_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_VZiel(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createV_Ziel_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(Balisentechnik_ETCSPackage.eINSTANCE.getFT_ESG_Merkmale_AttributeGroup_Vorsignalabstand(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createVorsignalabstand_TypeClass()));
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
