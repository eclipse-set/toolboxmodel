/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Layoutinformationen.util;

import java.util.function.Supplier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.set.toolboxmodel.PlanPro.util.ToolboxModelService;

/**
 * <!-- begin-user-doc --> The <b>Resource Factory</b> associated with the
 * package. <!-- end-user-doc -->
 * 
 * @see org.eclipse.set.toolboxmodel.Layoutinformationen.util.LayoutinformationenResourceImpl
 * @generated NOT
 */
public class LayoutinformationenResourceFactoryImpl
		extends ResourceFactoryImpl {
	private Supplier<ToolboxModelService> toolboxModelServiceProvider;

	/**
	 * Creates an instance of the resource factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public LayoutinformationenResourceFactoryImpl() {
		super();
	}

	/**
	 * Sets the supplier for ToolboxModelServices
	 * 
	 * @param provider
	 *            the provider
	 */
	public void setToolboxModelServiceProvider(
			final Supplier<ToolboxModelService> provider) {
		this.toolboxModelServiceProvider = provider;
	}

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Resource createResource(final URI uri) {
		return new LayoutinformationenResourceImpl(uri,
				toolboxModelServiceProvider.get());
	}

} // LayoutinformationenResourceFactoryImpl
