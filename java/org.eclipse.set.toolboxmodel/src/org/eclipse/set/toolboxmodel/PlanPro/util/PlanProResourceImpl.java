/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.PlanPro.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.set.toolboxmodel.PlanPro.DocumentRoot;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.set.model.temporaryintegration.util.TemporaryintegrationResourceFactoryImpl
 * @generated NOT
 */
public class PlanProResourceImpl extends XMIResourceImpl {
	private org.eclipse.set.model.model11001.PlanPro.DocumentRoot sourceModel;
	private org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot layoutModel;
	private final ToolboxModelService toolboxModelService;

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated NOT
	 */
	public PlanProResourceImpl(final URI uri,
			final ToolboxModelService toolboxModelService) {
		super(uri);
		getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				Boolean.TRUE);

		getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION,
				Boolean.TRUE);
		getDefaultSaveOptions().put(OPTION_SUPPRESS_XMI, Boolean.TRUE);

		getDefaultLoadOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		getDefaultSaveOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER,
				Boolean.TRUE);
		getDefaultLoadOptions().put(
				XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION,
				Boolean.FALSE);
		this.toolboxModelService = toolboxModelService;

	}

	@Override
	public void doLoad(final InputStream inputStream, final Map<?, ?> options)
			throws IOException {
		try {
			super.doLoad(inputStream, options);
		} finally {
			// After loading, transform the loaded contents (if any)
			if (!getContents().isEmpty()) {
				final EObject content = getContents().get(0);
				if (content instanceof final org.eclipse.set.model.model11001.PlanPro.DocumentRoot docRoot) {
					sourceModel = docRoot;
					EcoreUtil.replace(docRoot,
							toolboxModelService.loadPlanProModel(docRoot));
				} else if (content instanceof final org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot layoutRoot) {
					layoutModel = layoutRoot;
					EcoreUtil.replace(layoutRoot,
							toolboxModelService.loadPlanProLayout(layoutRoot));
				}
			}
		}
	}

	@Override
	public void doSave(final OutputStream outputStream, final Map<?, ?> options)
			throws IOException {
		if (!getContents().isEmpty()) {
			final EObject content = getContents().get(0);
			if (content instanceof final DocumentRoot docRoot) {
				sourceModel = toolboxModelService.savePlanProModel(docRoot);
				// Swap out the file content before saving
				EcoreUtil.replace(docRoot, sourceModel);
				super.doSave(outputStream, options);
				// Restore internal resource state by swapping back
				EcoreUtil.replace(sourceModel, docRoot);
				return;
			} else if (content instanceof final org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot layoutRoot) {
				layoutModel = toolboxModelService.saveLayoutModel(layoutRoot);

				// Swap out the file content before saving
				EcoreUtil.replace(layoutRoot, layoutModel);
				super.doSave(outputStream, options);
				// Restore internal resource state by swapping back
				EcoreUtil.replace(layoutModel, layoutRoot);
				return;
			}
		}

		// Save
		super.doSave(outputStream, options);

	}

	public org.eclipse.set.model.model11001.PlanPro.DocumentRoot getSourceModel() {
		return sourceModel;
	}

	public org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot getLayoutModel() {
		return layoutModel;
	}
} // TemporaryintegrationResourceImpl
