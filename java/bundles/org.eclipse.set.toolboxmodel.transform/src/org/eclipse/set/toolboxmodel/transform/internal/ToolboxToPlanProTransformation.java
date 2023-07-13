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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass;
import org.eclipse.set.model.model11001.Layoutinformationen.PlanPro_Layoutinfo;
import org.eclipse.set.model.model11001.PlanPro.DocumentRoot;
import org.eclipse.set.model.model11001.PlanPro.PlanPro_Schnittstelle;
import org.eclipse.set.toolboxmodel.Basisobjekte.Ur_Objekt;
import org.eclipse.set.toolboxmodel.PlanPro.WzkInvalidIDReference;
import org.eclipse.set.toolboxmodel.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

/**
 * Transformation from a Toolbox Model to the PlanPro Model
 * 
 * @author Stuecker
 *
 */
public class ToolboxToPlanProTransformation
		extends AbstractEObjectTransformation {
	private PlanPro_Schnittstelle planProRoot;

	private PlanPro_Layoutinfo layoutRoot;

	@Override
	protected String getTargetNamespace(final String sourceNamespace) {
		if (!sourceNamespace.startsWith(Constants.PLANPRO_NAMESPACE_BASE)) {
			return sourceNamespace;
		}

		// Special case: The Signalbegriffe package has another versioning
		// scheme
		if (sourceNamespace.equals(Signalbegriffe_Ril_301Package.eNS_URI)) {
			return sourceNamespace.replace(Constants.TOOLBOX_VERSION,
					Constants.SIGNALBEGRIFFE_MODEL_VERSION);
		}

		return sourceNamespace.replace(Constants.TOOLBOX_VERSION,
				Constants.PLANPRO_MODEL_VERSION);
	}

	@Override
	protected void transformReference(final EObject source,
			final EObject target, final EReference sourceRef,
			final EReference targetRef) {
		// Check if this is an ID Reference, if so handle it explicitly
		if (isIDReference(targetRef)) {
			transformIDReference(source, target, sourceRef, targetRef);
		} else {
			// Do not transform lstPlanungErsteGruppe
			super.transformReference(source, target, sourceRef, targetRef);
		}
	}

	private static boolean isIDReference(final EReference ref) {
		return ref.getEReferenceType().getEAllSuperTypes().stream()
				.anyMatch(superType -> superType.equals(
						BasisTypenPackage.eINSTANCE.getZeiger_TypeClass()))
				|| ref.getEReferenceType().equals(BasisTypenPackage.eINSTANCE
						.getID_Bearbeitungsvermerk_TypeClass());
	}

	private static void transformIDReference(final EObject source,
			final EObject target, final EReference sourceRef,
			final EReference targetRef) {
		// Do not transform missing entries
		if (!source.eIsSet(sourceRef)) {
			return;
		}
		final Object sourceValue = source.eGet(sourceRef);
		final EClass referenceType = targetRef.getEReferenceType();
		if (targetRef.isMany()) {
			if (sourceValue == null) {
				// If the list does not exist, skip
				return;
			}
			@SuppressWarnings("unchecked")
			final EList<EObject> list = (EList<EObject>) target.eGet(targetRef);
			@SuppressWarnings("unchecked")
			final EList<Ur_Objekt> sourceList = (EList<Ur_Objekt>) sourceValue;
			sourceList.forEach(entry -> {
				if (referenceType.equals(BasisTypenPackage.eINSTANCE
						.getID_Bearbeitungsvermerk_TypeClass())) {
					final ID_Bearbeitungsvermerk_TypeClass pointer = (ID_Bearbeitungsvermerk_TypeClass) EcoreUtil
							.create(referenceType);
					pointer.setWert(entry.getIdentitaet().getWert());
					list.add(pointer);

				} else {

					final Zeiger_TypeClass pointer = (Zeiger_TypeClass) EcoreUtil
							.create(referenceType);
					pointer.setWert(entry.getIdentitaet().getWert());
					list.add(pointer);
				}
			});
		} else {
			// Simple reference, find the GUID of the source object
			final Ur_Objekt sourceObject = (Ur_Objekt) sourceValue;
			if (referenceType.equals(BasisTypenPackage.eINSTANCE
					.getID_Bearbeitungsvermerk_TypeClass())) {

				final ID_Bearbeitungsvermerk_TypeClass pointer = (ID_Bearbeitungsvermerk_TypeClass) EcoreUtil
						.create(referenceType);
				if (sourceObject == null) {
					// If the value is null, this is a nil reference
					pointer.setWert(null);
				} else {
					pointer.setWert(sourceObject.getIdentitaet().getWert());
				}
				target.eSet(targetRef, pointer);

			} else {
				final Zeiger_TypeClass pointer = (Zeiger_TypeClass) EcoreUtil
						.create(referenceType);
				if (sourceObject == null) {
					// If the value is null, this is a nil reference
					pointer.setWert(null);
				} else {
					pointer.setWert(sourceObject.getIdentitaet().getWert());
				}
				target.eSet(targetRef, pointer);
			}
		}

	}

	/**
	 * Transforms a Toolbox model to a PlanPro model
	 * 
	 * @param toolboxRoot
	 *            the DocumentRoot for the Toolbox model
	 * @return the PlanPro model
	 */
	public DocumentRoot transform(
			final org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot toolboxRoot) {
		final DocumentRoot docRoot = (DocumentRoot) super.transform(
				toolboxRoot);
		planProRoot = docRoot.getPlanProSchnittstelle();
		toolboxRoot.getPlanProSchnittstelle().getWzkInvalidIDReferences()
				.forEach(e -> restoreIDReference(e, planProRoot));
		return docRoot;
	}

	/**
	 * Transforms a Toolbox model to a PlanPro model
	 * 
	 * @param toolboxRoot
	 *            the Schnittstelle for the Toolbox model
	 * @return the PlanPro model
	 */
	public PlanPro_Schnittstelle transform(
			final org.eclipse.set.toolboxmodel.PlanPro.PlanPro_Schnittstelle toolboxRoot) {
		planProRoot = transform(toolboxRoot);
		toolboxRoot.getWzkInvalidIDReferences()
				.forEach(e -> restoreIDReference(e, planProRoot));
		return planProRoot;
	}

	/**
	 * Transforms a Toolbox model to a PlanPro Layoutinformationen model
	 * 
	 * @param layoutInfo
	 *            the DocumentRoot for the Toolbox layoutinformationen model
	 * @param toolboxRoot
	 *            the DocumentRoot for the Toolbox model
	 * @return the planpro model
	 */
	public org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot transformLayout(
			final org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot layoutInfo,
			final org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot toolboxRoot) {
		// PlanPro_LayoutInfo is containment,
		// after reference to PlanPro_Schnitstelle will
		// the PlanPro_LayoutInfo Object in DocumentRoot of Layoutinformationen
		// null
		if (layoutInfo.getPlanProLayoutinfo() == null) {
			layoutInfo.setPlanProLayoutinfo(toolboxRoot
					.getPlanProSchnittstelle().getPlanpro_layoutinfo());
		} else {
			EcoreUtil.replace(layoutInfo.getPlanProLayoutinfo(), toolboxRoot
					.getPlanProSchnittstelle().getPlanpro_layoutinfo());
		}

		final org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot docRoot = (org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot) super.transform(
				layoutInfo);
		layoutRoot = docRoot.getPlanProLayoutinfo();
		toolboxRoot.getPlanProSchnittstelle().getWzkInvalidIDReferences()
				.forEach(e -> restoreIDReference(e, layoutRoot));
		return docRoot;

	}

	private <T> EObject getRootContainer(final EObject source,
			final Class<T> contanierClass) {
		if (source.getClass().isAssignableFrom(contanierClass)) {
			return source;
		}
		if (source.eContainer() == null) {
			return null;
		}
		return getRootContainer(source.eContainer(), contanierClass);
	}

	private <T extends EObject> void restoreIDReference(
			final WzkInvalidIDReference reference, final T docRoot) {
		// Find the root container of the source PlanPro model that was
		// initially used to create the toolbox model
		final EObject oldRoot = getRootContainer(reference.getSource(),
				docRoot.getClass());
		// It exists two DocumentRoot (PlanPro and Layoutinformation),
		// but have only one WzkInvalidIDReference list, for this reasons,
		// the oldRoot can be null
		if (oldRoot == null) {
			return;
		}
		// Find the new object at the same relative URI in the new PlanPro model
		final EObject newRoot = getRootContainer(docRoot, docRoot.getClass());
		final String relativeURI = EcoreUtil.getRelativeURIFragmentPath(oldRoot,
				reference.getSource());
		final EObject newObject = EcoreUtil.getEObject(newRoot, relativeURI);

		// If the new object does not exist, it has been removed
		if (newObject == null) {
			return;
		}

		// Create the pointer
		final EClass pointerType = reference.getSourceRef().getEReferenceType();
		final Zeiger_TypeClass pointer = (Zeiger_TypeClass) EcoreUtil
				.create(pointerType);
		pointer.setWert(reference.getGuid());

		// Add the pointer to the list or set it as value
		if (reference.getSourceRef().isMany()) {
			@SuppressWarnings("unchecked")
			final EList<Zeiger_TypeClass> list = (EList<Zeiger_TypeClass>) newObject
					.eGet(reference.getSourceRef());
			list.add(pointer);
		} else {
			newObject.eSet(reference.getSourceRef(), pointer);
		}
	}

}
