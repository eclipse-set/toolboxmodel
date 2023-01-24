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
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass;
import org.eclipse.set.model.model11001.PlanPro.DocumentRoot;
import org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.toolboxmodel.PlanPro.PlanProFactory;
import org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference;

/**
 * Transformation from a PlanPro model to the Toolbox Model
 * 
 * @author Stuecker
 *
 */
public class PlanProToToolboxTransformation
		extends AbstractEObjectTransformation {
	private List<WzkInvalidIDReference> pendingIDReferences = new ArrayList<>();

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
		pendingIDReferences = new ArrayList<>();
		final org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot toolboxRoot = (org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot) super.transform(
				inputModel);
		toolboxRoot.getPlanProSchnittstelle().getWzkInvalidIDReferences()
				.addAll(pendingIDReferences);
		ToolboxIDResolver
				.resolveIDReferences(toolboxRoot.getPlanProSchnittstelle());
		return toolboxRoot;
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
		pendingIDReferences = new ArrayList<>();
		final org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle planproSchnittstelle = (org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle) super.transform(
				inputModel);
		planproSchnittstelle.getWzkInvalidIDReferences()
				.addAll(pendingIDReferences);
		ToolboxIDResolver.resolveIDReferences(planproSchnittstelle);
		return planproSchnittstelle;
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
		} else {
			// Do not transform lstPlanungErsteGruppe
			super.transformReference(source, target, sourceRef, targetRef);
		}
	}

	private void addUnresolvedReference(final String guid, final EObject source,
			final EReference sourceRef, final EObject target,
			final EReference targetRef) {

		final WzkInvalidIDReference wzkref = PlanProFactory.eINSTANCE
				.createWzkInvalidIDReference();
		wzkref.setGuid(guid);
		wzkref.setSource(source);
		wzkref.setSourceRef(sourceRef);
		wzkref.setTarget(target);
		wzkref.setTargetRef(targetRef);
		pendingIDReferences.add(wzkref);
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
			addUnresolvedReference(sourcePointer.getWert(), source, sourceRef,
					target, targetRef);
		} else if (sourceValue instanceof final EList<?> sourceList) {
			sourceList.forEach(value -> {
				final Zeiger_TypeClass sourcePointer = (Zeiger_TypeClass) value;
				addUnresolvedReference(sourcePointer.getWert(), source,
						sourceRef, target, targetRef);
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
