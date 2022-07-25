/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.transform.internal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * Basic EObject transformation which copies all attributes and references into
 * a new EObject in another namespace.
 * 
 * @author Stuecker
 *
 */
public abstract class AbstractEObjectTransformation {
	/**
	 * Transforms the content of 'source' into the target namespace by creating
	 * a matching EObject
	 * 
	 * @param source
	 *            the source EObject, may be null
	 * @return the transformed object (or null if source was null)
	 */
	protected EObject transform(final EObject source) {
		// Do not transform nulls
		if (source == null) {
			return null;
		}

		// Find the matching class in the other package and create
		final EClass targetClass = getMatchingEClass(source.eClass());
		final EObject target = EcoreUtil.create(targetClass);

		// Transform features
		source.eClass().getEAllStructuralFeatures().stream()
				.forEach(feature -> {
					final EStructuralFeature targetFeature = targetClass
							.getEStructuralFeature(feature.getName());
					if (feature instanceof final EAttribute sourceAttribute) {
						transformAttribute(source, target, sourceAttribute,
								(EAttribute) targetFeature);
					} else if (feature instanceof final EReference sourceReference
							&& targetFeature != null) {
						transformReference(source, target, sourceReference,
								(EReference) targetFeature);
					}
				});

		return target;
	}

	/**
	 * Transforms an EAttribute into the target form
	 * 
	 * @param source
	 *            Source EObject
	 * @param target
	 *            Target EObject
	 * @param sourceAttr
	 *            Source attribute to copy the value from
	 * @param targetAttr
	 *            Target attribute to copy the value into
	 */
	protected static void transformAttribute(final EObject source,
			final EObject target, final EAttribute sourceAttr,
			final EAttribute targetAttr) {
		final Object sourceValue = source.eGet(sourceAttr);
		// If value is null and the attribute is unsettable, unset the attribute
		// in the target
		if (sourceValue == null && sourceAttr.isUnsettable()
				&& source.eIsSet(sourceAttr)) {
			target.eSet(targetAttr, null);
		} else if (sourceValue != null
				&& sourceValue != sourceAttr.getDefaultValue()) {
			// Otherwise set the value
			final EDataType sourceAttributeType = sourceAttr
					.getEAttributeType();
			final EDataType targetAttributeType = targetAttr
					.getEAttributeType();

			// Do not transform FeatureMaps
			if (!sourceAttributeType.getInstanceClass()
					.equals(FeatureMap.Entry.class)) {
				// Transform to a string representation to correctly handle
				// Enumerations
				final String sourceStringValue = EcoreUtil
						.convertToString(sourceAttributeType, sourceValue);
				target.eSet(targetAttr, EcoreUtil.createFromString(
						targetAttributeType, sourceStringValue));
			}
		}
	}

	/**
	 * Find the corresponding EStructuralFeature of the same name in the target
	 * package
	 * 
	 * @param source
	 *            source EStructuralFeature
	 * @return target EStructuralFeature
	 */
	protected EStructuralFeature getMatchingEStructuralFeature(
			final EStructuralFeature source) {
		// Find the corresponding target EClass
		final EClass sourceClass = source.getEContainingClass();
		final EClass targetClass = getMatchingEClass(sourceClass);

		// Find the feature of the same name
		return targetClass.getEStructuralFeature(source.getName());
	}

	/**
	 * Find the corresponding EClass of the same name in the target package
	 * 
	 * @param source
	 *            source class
	 * @return target class
	 */
	protected EClass getMatchingEClass(final EClass source) {
		// Find the corresponding target EPackage
		final EPackage sourcePackage = source.getEPackage();
		final EPackage targetPackage = getMatchingEPackage(sourcePackage);

		// Find the class of the same name
		return (EClass) targetPackage.getEClassifier(source.getName());
	}

	/**
	 * Find the corresponding EPackage for an EPackage via getTargetNamespace
	 * 
	 * @param source
	 *            source EPackage
	 * @return target EPackage
	 */
	protected EPackage getMatchingEPackage(final EPackage source) {
		final Registry registry = EPackage.Registry.INSTANCE;
		final String nsUri = getTargetNamespace(source.getNsURI());
		for (final String key : registry.keySet()) {
			final EPackage ePackage = registry.getEPackage(key);
			if (ePackage.getNsURI().equals(nsUri)) {
				return ePackage;
			}
		}
		throw new IllegalArgumentException(
				"No matching EPackage found for " + nsUri); //$NON-NLS-1$
	}

	/**
	 * Transforms an EReference into the target form
	 * 
	 * @param source
	 *            Source EObject
	 * @param target
	 *            Target EObject
	 * @param sourceAttr
	 *            Source reference to copy the value from
	 * @param targetAttr
	 *            Target reference to copy the value into
	 */
	protected void transformReference(final EObject source,
			final EObject target, final EReference sourceRef,
			final EReference targetRef) {
		// 1:1 Reference or a list?
		if (!sourceRef.isMany()) {
			final EObject sourceValue = (EObject) source.eGet(sourceRef);

			// If the value is null, set to nil if applicable
			if (sourceValue == null) {
				if (source.eIsSet(sourceRef) && sourceRef.isUnsettable()) {
					target.eSet(targetRef, null);
				}
				return;
			}

			// Transform the target value and set it
			final EObject targetValue = transform(sourceValue);
			target.eSet(targetRef, targetValue);
		} else {
			@SuppressWarnings("unchecked")
			final EList<EObject> list = (EList<EObject>) source.eGet(sourceRef);
			@SuppressWarnings("unchecked")
			final EList<EObject> targetList = (EList<EObject>) target
					.eGet(targetRef);
			list.forEach(entry -> {
				final EObject targetValue = transform(entry);
				targetList.add(targetValue);
			});
		}

	}

	/**
	 * @param sourceNamespace
	 *            the namespace of the source package
	 * @return the corresponding namespace of the target package containing the
	 *         same class
	 */
	protected abstract String getTargetNamespace(String sourceNamespace);
}
