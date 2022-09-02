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
import org.eclipse.set.toolboxmodel.PlanPro.util.IDReference;

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
	 * Resolves a list of ID references in a toolbox model
	 * 
	 * @param model
	 *            the toolbox model
	 * @param references
	 *            a list of ID references to resolve
	 * @return a list of ID references which could not be resolved
	 */
	public static List<IDReference> resolveIDReferences(
			final PlanPro_Schnittstelle model,
			final List<IDReference> references) {
		final ToolboxIDResolver resolver = new ToolboxIDResolver(model);
		return references.stream()
				.filter(reference -> !resolver.resolveIDReference(reference))
				.toList();
	}

	private boolean resolveIDReference(final IDReference reference) {
		if (reference.guid() == null) {
			if (reference.targetRef().isUnsettable()) {
				// Reference with xsi:nil GUID
				return setIDReference(reference, null);
			}
			// Reference with xsi:nil GUID that isn't allowed by the schema
			return false;
		}

		final EObject value = guidCache.get(reference.guid(),
				reference.target());
		if (value != null) {
			return setIDReference(reference, value);

		}

		// Cannot find object via GUID
		return false;
	}

	private static boolean setIDReference(final IDReference reference,
			final EObject value) {
		final EClass referenceType = reference.targetRef().getEReferenceType();

		// If we have a value, check whether it is applicable
		if (value != null) {
			final Class<?> valueClass = value.getClass();
			final Class<?> referenceClass = referenceType.getInstanceClass();
			if (!referenceClass.isAssignableFrom(valueClass)) {
				return false;
			}
		}

		if (reference.targetRef().isMany()) {
			@SuppressWarnings("unchecked")
			final EList<EObject> list = (EList<EObject>) reference.target()
					.eGet(reference.targetRef());
			list.add(value);
		} else {
			reference.target().eSet(reference.targetRef(), value);
		}
		return true;
	}
}
