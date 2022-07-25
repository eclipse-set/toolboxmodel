/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.transform.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.set.toolboxmodel.PlanPro.util.IDReference;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model1902.BasisTypen.Zeiger_TypeClass;
import org.eclipse.set.model.model1902.PlanPro.DocumentRoot;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle;

/**
 * Transformation from a PlanPro model to the Toolbox Model
 * 
 * @author Stuecker
 *
 */
public class PlanProToToolboxTransformation
		extends AbstractEObjectTransformation {
	private List<IDReference> unresolvedIDReferences;

	/**
	 * Transforms a PlanPro model to a Toolbox model. This will not resolve ID
	 * references, but instead leave them as null values.
	 * 
	 * @param inputModel
	 *            the PlanPro model
	 * @return the Toolbox model
	 */
	public org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot transform(
			final DocumentRoot inputModel) {
		unresolvedIDReferences = new ArrayList<>();
		return (org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot) super.transform(
				inputModel);
	}

	/**
	 * Transforms a PlanPro model to a Toolbox model. This will not resolve ID
	 * references, but instead leave them as null values.
	 * 
	 * @param inputModel
	 *            the PlanPro model
	 * @return the Toolbox model
	 */
	public org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle transform(
			final PlanPro_Schnittstelle inputModel) {
		unresolvedIDReferences = new ArrayList<>();
		return (org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle) super.transform(
				inputModel);
	}

	/**
	 * @return a list of unresolved ID references
	 */
	public List<IDReference> getUnresolvedIDReferences() {
		return unresolvedIDReferences;
	}

	@Override
	protected String getTargetNamespace(final String sourceNamespace) {
		if (!sourceNamespace.startsWith(Constants.PLANPRO_NAMESPACE_BASE)) {
			return sourceNamespace;
		}

		return sourceNamespace
				.replace(Constants.PLANPRO_MODEL_VERSION,
						Constants.TOOLBOX_VERSION)
				.replace(Constants.SIGNALBEGRIFFE_MODEL_VERSION,
						Constants.TOOLBOX_VERSION);
	}

	@Override
	protected void transformReference(final EObject source,
			final EObject target, final EReference sourceRef,
			final EReference targetRef) {
		// Check if this is an ID Reference, if so handle it explicitly
		if (isIDReference(sourceRef)) {
			transformIDReference(source, target, sourceRef, targetRef);
		} else if (!isPlanungErsteGruppe(sourceRef)) {
			// Do not transform lstPlanungErsteGruppe
			super.transformReference(source, target, sourceRef, targetRef);
		}

	}

	private static boolean isPlanungErsteGruppe(final EReference sourceRef) {
		return sourceRef == PlanProPackage.eINSTANCE
				.getPlanung_Projekt_LstPlanungErsteGruppe();
	}

	private void transformIDReference(final EObject source,
			final EObject target, final EReference sourceRef,
			final EReference targetRef) {
		if (!source.eIsSet(sourceRef)) {
			return;
		}
		final Object sourceValue = source.eGet(sourceRef);

		// Store the ID reference(s). We cannot resolve the ID reference yet, as
		// the object may not yet have been transformed
		if (sourceValue instanceof final Zeiger_TypeClass sourcePointer) {
			unresolvedIDReferences.add(new IDReference(sourcePointer.getWert(),
					source, sourceRef, target, targetRef));
		} else if (sourceValue instanceof final EList<?> sourceList) {
			sourceList.forEach(value -> {
				final Zeiger_TypeClass sourcePointer = (Zeiger_TypeClass) value;
				unresolvedIDReferences
						.add(new IDReference(sourcePointer.getWert(), source,
								sourceRef, target, targetRef));
			});
		} else {
			throw new UnsupportedOperationException(
					"Unsupported ID reference type"); //$NON-NLS-1$
		}
	}

	private static boolean isIDReference(final EReference ref) {
		return ref.getEReferenceType().getEAllSuperTypes().stream()
				.anyMatch(superType -> superType.equals(
						BasisTypenPackage.eINSTANCE.getZeiger_TypeClass()));
	}
}
