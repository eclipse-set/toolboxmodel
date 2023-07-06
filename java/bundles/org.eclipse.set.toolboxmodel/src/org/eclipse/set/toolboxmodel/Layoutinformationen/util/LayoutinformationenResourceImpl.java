/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Layoutinformationen.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.set.toolboxmodel.Layoutinformationen.DocumentRoot;
import org.eclipse.set.toolboxmodel.PlanPro.util.AbstractResourceImpl;
import org.eclipse.set.toolboxmodel.PlanPro.util.ToolboxModelService;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.set.toolboxmodel.Layoutinformationen.util.LayoutinformationenResourceFactoryImpl
 * @generated NOT
 */
public class LayoutinformationenResourceImpl extends
		AbstractResourceImpl<org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot> {
	private org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot sourceModel;

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated
	 */
	public LayoutinformationenResourceImpl(final URI uri,
			final ToolboxModelService toolboxModelService) {
		super(uri, toolboxModelService);
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
				if (content instanceof final org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot docRoot) {
					sourceModel = docRoot;
					EcoreUtil.replace(docRoot,
							toolboxModelService.loadPlanProLayout(docRoot));
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
				sourceModel = toolboxModelService.saveLayoutModel(docRoot);
				// Swap out the file content before saving
				EcoreUtil.replace(docRoot, sourceModel);
				super.doSave(outputStream, options);
				// Restore internal resource state by swapping back
				EcoreUtil.replace(sourceModel, docRoot);
				return;
			}
		}

		// Save
		super.doSave(outputStream, options);

	}

	@Override
	public org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot getSourceModel() {
		return sourceModel;
	}

} // LayoutinformationenResourceImpl
