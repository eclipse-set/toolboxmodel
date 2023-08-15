/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PlanPro.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.Basisobjekte.BasisobjekteFactory;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Ur_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

import org.eclipse.set.toolboxmodel.PlanPro.PlanProFactory;
import org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage;
import org.eclipse.set.toolboxmodel.PlanPro.Planung_Einzel;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.PlanPro.Planung_Einzel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Planung_EinzelItemProvider extends Ur_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Planung_EinzelItemProvider(AdapterFactory adapterFactory) {
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

			addIDAusgabeFachdatenPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Ausgabe Fachdaten feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDAusgabeFachdatenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Planung_Einzel_iDAusgabeFachdaten_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Planung_Einzel_iDAusgabeFachdaten_feature", "_UI_Planung_Einzel_type"),
				 PlanProPackage.eINSTANCE.getPlanung_Einzel_IDAusgabeFachdaten(),
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
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangErlaeuterungsbericht());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangMaterialBesonders());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangVzG());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_LSTObjektePlanungsbereich());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_PlanungEAllg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_PlanungEAusgabeBesonders());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_PlanungEHandlung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getPlanung_Einzel_ReferenzPlanungBasis());
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
	 * This returns Planung_Einzel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Planung_Einzel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Planung_Einzel_type");
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

		switch (notification.getFeatureID(Planung_Einzel.class)) {
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_ERLAEUTERUNGSBERICHT:
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_MATERIAL_BESONDERS:
			case PlanProPackage.PLANUNG_EINZEL__ANHANG_VZ_G:
			case PlanProPackage.PLANUNG_EINZEL__LST_OBJEKTE_PLANUNGSBEREICH:
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EALLG:
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EAUSGABE_BESONDERS:
			case PlanProPackage.PLANUNG_EINZEL__PLANUNG_EHANDLUNG:
			case PlanProPackage.PLANUNG_EINZEL__REFERENZ_PLANUNG_BASIS:
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
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangErlaeuterungsbericht(),
				 BasisobjekteFactory.eINSTANCE.createAnhang()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangMaterialBesonders(),
				 BasisobjekteFactory.eINSTANCE.createAnhang()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangVzG(),
				 BasisobjekteFactory.eINSTANCE.createAnhang()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_LSTObjektePlanungsbereich(),
				 PlanProFactory.eINSTANCE.createLST_Objekte_Planungsbereich_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_PlanungEAllg(),
				 PlanProFactory.eINSTANCE.createPlanung_E_Allg_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_PlanungEAusgabeBesonders(),
				 PlanProFactory.eINSTANCE.createPlanung_E_Ausgabe_Besonders_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_PlanungEHandlung(),
				 PlanProFactory.eINSTANCE.createPlanung_E_Handlung_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getPlanung_Einzel_ReferenzPlanungBasis(),
				 PlanProFactory.eINSTANCE.createReferenz_Planung_Basis_TypeClass()));
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
			childFeature == PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangErlaeuterungsbericht() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangMaterialBesonders() ||
			childFeature == PlanProPackage.eINSTANCE.getPlanung_Einzel_AnhangVzG();

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
