/**
 * Copyright (c) 2023 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */

package org.eclipse.set.toolboxmodel.PlanPro.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * @author truong
 *
 */
public abstract class AbstractResourceImpl<T extends EObject>
		extends XMLResourceImpl {
	protected static ToolboxModelService toolboxModelService = null;

	protected AbstractResourceImpl(final URI uri,
			final ToolboxModelService toolboxModelService) {
		super(uri);
		getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				Boolean.TRUE);

		getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION,
				Boolean.TRUE);

		getDefaultLoadOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		getDefaultSaveOptions().put(
				XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER,
				Boolean.TRUE);
		getDefaultLoadOptions().put(
				XMLResource.OPTION_USE_PACKAGE_NS_URI_AS_LOCATION,
				Boolean.FALSE);
		if (AbstractResourceImpl.toolboxModelService == null) {
			AbstractResourceImpl.toolboxModelService = toolboxModelService;
		}

	}

	public abstract T getSourceModel();
}
