/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.transform.internal;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference;

/**
 * Resolver to set ID references within a toolbox model to their respective
 * EObject values
 * 
 * @author Stuecker
 */
public class ToolboxIDResolver {
	private final GuidCache guidCache = new GuidCache();

	private ToolboxIDResolver(final PlanPro_Schnittstelle model) {
		guidCache.prepare(model);
	}

	/**
	 * Resolves a list of ID references in a toolbox model and updates the model
	 * accordingly
	 * 
	 * @param model
	 *            the toolbox model
	 */
	public static void resolveIDReferences(final PlanPro_Schnittstelle model) {
		final ToolboxIDResolver resolver = new ToolboxIDResolver(model);
		final EList<WzkInvalidIDReference> refs = model
				.getWzkInvalidIDReferences();

		final List<WzkInvalidIDReference> resolved = refs.stream()
				.filter(resolver::resolveIDReference).toList();
		refs.removeAll(resolved);
	}

	private boolean resolveIDReference(final WzkInvalidIDReference reference) {
		if (reference.getGuid() == null) {
			if (reference.getTargetRef().isUnsettable()) {
				// Reference with xsi:nil GUID
				return setIDReference(reference, null);
			}
			// Reference with xsi:nil GUID that isn't allowed by the schema
			return false;
		}

		final EObject value = guidCache.get(reference.getGuid(),
				reference.getTarget());
		if (value != null) {
			return setIDReference(reference, value);

		}

		// Cannot find object via GUID
		return false;
	}

	private static boolean setIDReference(final WzkInvalidIDReference reference,
			final EObject value) {
		final EClass referenceType = reference.getTargetRef()
				.getEReferenceType();

		// If we have a value, check whether it is applicable
		if (value != null) {
			final Class<?> valueClass = value.getClass();
			final Class<?> referenceClass = referenceType.getInstanceClass();
			if (!referenceClass.isAssignableFrom(valueClass)) {
				return false;
			}
		}

		if (reference.getTargetRef().isMany()) {
			@SuppressWarnings("unchecked")
			final EList<EObject> list = (EList<EObject>) reference.getTarget()
					.eGet(reference.getTargetRef());
			list.add(value);
		} else {
			reference.getTarget().eSet(reference.getTargetRef(), value);
		}
		return true;
	}
}
