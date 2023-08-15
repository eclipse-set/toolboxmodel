/**
 * /**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signale.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.toolboxmodel.BasisTypen.BasisTypenFactory;

import org.eclipse.set.toolboxmodel.Basisobjekte.provider.Punkt_ObjektItemProvider;

import org.eclipse.set.toolboxmodel.Layoutinformationen.provider.PlanProEditPlugin;

import org.eclipse.set.toolboxmodel.Signale.Signal;
import org.eclipse.set.toolboxmodel.Signale.SignaleFactory;
import org.eclipse.set.toolboxmodel.Signale.SignalePackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.toolboxmodel.Signale.Signal} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SignalItemProvider extends Punkt_ObjektItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__BEZEICHNUNG);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__PZB_SCHUTZSTRECKE_SOLL);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__SIGNAL_FSTR);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__SIGNAL_FSTR_S);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__SIGNAL_FIKTIV);
			childrenFeatures.add(SignalePackage.Literals.SIGNAL__SIGNAL_REAL);
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
	 * This returns Signal.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Signal"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Signal_type");
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

		switch (notification.getFeatureID(Signal.class)) {
			case SignalePackage.SIGNAL__BEZEICHNUNG:
			case SignalePackage.SIGNAL__PZB_SCHUTZSTRECKE_SOLL:
			case SignalePackage.SIGNAL__SIGNAL_FSTR:
			case SignalePackage.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS:
			case SignalePackage.SIGNAL__SIGNAL_FSTR_S:
			case SignalePackage.SIGNAL__SIGNAL_FIKTIV:
			case SignalePackage.SIGNAL__SIGNAL_REAL:
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
				(SignalePackage.Literals.SIGNAL__BEZEICHNUNG,
				 BasisTypenFactory.eINSTANCE.createBezeichnung_Element_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL__PZB_SCHUTZSTRECKE_SOLL,
				 SignaleFactory.eINSTANCE.createPZB_Schutzstrecke_Soll_TypeClass()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL__SIGNAL_FSTR,
				 SignaleFactory.eINSTANCE.createSignal_Fstr_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL__SIGNAL_FSTR_AUS_INSELGLEIS,
				 SignaleFactory.eINSTANCE.createSignal_Fstr_Aus_Inselgleis_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL__SIGNAL_FSTR_S,
				 SignaleFactory.eINSTANCE.createSignal_Fstr_S_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL__SIGNAL_FIKTIV,
				 SignaleFactory.eINSTANCE.createSignal_Fiktiv_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(SignalePackage.Literals.SIGNAL__SIGNAL_REAL,
				 SignaleFactory.eINSTANCE.createSignal_Real_AttributeGroup()));
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
