/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Ortung.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisTypenFactory;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Punkt_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

import org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente;
import org.eclipse.set.toolboxmodel.Ortung.OrtungFactory;
import org.eclipse.set.toolboxmodel.Ortung.OrtungPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Ortung.FMA_Komponente} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FMA_KomponenteItemProvider extends Punkt_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMA_KomponenteItemProvider(AdapterFactory adapterFactory) {
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

			addIDBezugspunktPropertyDescriptor(object);
			addIDFMAgrenzePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the ID Bezugspunkt feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDBezugspunktPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FMA_Komponente_iDBezugspunkt_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FMA_Komponente_iDBezugspunkt_feature", "_UI_FMA_Komponente_type"),
				 OrtungPackage.Literals.FMA_KOMPONENTE__ID_BEZUGSPUNKT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the IDFM Agrenze feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIDFMAgrenzePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FMA_Komponente_iDFMAgrenze_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FMA_Komponente_iDFMAgrenze_feature", "_UI_FMA_Komponente_type"),
				 OrtungPackage.Literals.FMA_KOMPONENTE__IDFM_AGRENZE,
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
			childrenFeatures.add(OrtungPackage.Literals.FMA_KOMPONENTE__BEZEICHNUNG);
			childrenFeatures.add(OrtungPackage.Literals.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT);
			childrenFeatures.add(OrtungPackage.Literals.FMA_KOMPONENTE__FMA_KOMPONENTE_ART);
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
	 * This returns FMA_Komponente.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FMA_Komponente"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_FMA_Komponente_type");
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

		switch (notification.getFeatureID(FMA_Komponente.class)) {
			case OrtungPackage.FMA_KOMPONENTE__BEZEICHNUNG:
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT:
			case OrtungPackage.FMA_KOMPONENTE__FMA_KOMPONENTE_ART:
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
				(OrtungPackage.Literals.FMA_KOMPONENTE__BEZEICHNUNG,
				 BasisTypenFactory.eINSTANCE.createBezeichnung_Element_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_KOMPONENTE__FMA_KOMPONENTE_ACHSZAEHLPUNKT,
				 OrtungFactory.eINSTANCE.createFMA_Komponente_Achszaehlpunkt_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(OrtungPackage.Literals.FMA_KOMPONENTE__FMA_KOMPONENTE_ART,
				 OrtungFactory.eINSTANCE.createFMA_Komponente_Art_TypeClass()));
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
