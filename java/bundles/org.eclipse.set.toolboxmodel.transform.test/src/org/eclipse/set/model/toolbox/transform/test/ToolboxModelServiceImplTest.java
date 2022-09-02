/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.toolbox.transform.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.set.model.model1902.PlanPro.DocumentRoot;
import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;
import org.eclipse.set.model.model1902.PlanPro.util.PlanProResourceFactoryImpl;
import org.eclipse.set.model.model1902.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;
import org.eclipse.set.toolboxmodel.PlanPro.util.ToolboxModelService;
import org.eclipse.set.toolboxmodel.transform.ToolboxModelServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

@SuppressWarnings("nls")
class ToolboxModelServiceImplTest {
	private DocumentRoot model;
	private ToolboxModelService testee;

	private byte[] sourceByteArray;
	private EObject retransformedModel;

	/**
	 * Tests whether a PlanPro file changes if it is transformed into a Toolbox
	 * model and back
	 * 
	 * @throws Exception
	 */
	@Test
	void testTransform() throws Exception {
		givenToolboxModelInitialization();
		givenPlanProFile(
				"res/2015-12-10_P-Hausen_1.9.0.2_4.0_Status_Genehmigt_V02.ppxml");
		givenToolboxModelService();

		whenTransformingModel();

		thenRetransformedModelMatchesOriginal();
	}

	private void givenToolboxModelService() {
		testee = new ToolboxModelServiceImpl();
	}

	private static byte[] saveEObjectToByteArray(final EObject object)
			throws IOException {
		final ResourceSet rs = new ResourceSetImpl();
		final Resource resource = rs
				.createResource(URI.createURI("filename.ppxml"));
		resource.getContents().add(object);
		final ByteArrayOutputStream sourceStream = new ByteArrayOutputStream();
		resource.save(sourceStream, null);
		return sourceStream.toByteArray();
	}

	private void thenRetransformedModelMatchesOriginal() throws IOException {
		// Write source into byte array
		final byte[] retransformed = saveEObjectToByteArray(retransformedModel);
		Assert.assertArrayEquals(sourceByteArray, retransformed);
	}

	private static void givenToolboxModelInitialization() {
		// Required for EMF Initialization according to EMF FAQ
		// See
		// https://wiki.eclipse.org/EMF/FAQ#How_do_I_use_EMF_in_standalone_applications_.28such_as_an_ordinary_main.29.3F
		org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage.eINSTANCE.eClass();
	}

	private void whenTransformingModel() {
		retransformedModel = testee
				.savePlanProModel(testee.loadPlanProModel(model));
	}

	protected void givenPlanProFile(final String filename) throws IOException {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
				.put("ppxml", new PlanProResourceFactoryImpl()); //$NON-NLS-1$
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(PlanProPackage.eNS_URI,
				PlanProPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(
				Signalbegriffe_Ril_301Package.eNS_URI,
				Signalbegriffe_Ril_301Package.eINSTANCE);

		final Resource resource = resourceSet
				.getResource(URI.createFileURI(filename), true);
		final EObject root = resource.getContents().get(0);
		if (!(root instanceof DocumentRoot)) {
			throw new IllegalArgumentException(
					"Resource contains no PlanPro model with the requested version."); //$NON-NLS-1$
		}
		model = (DocumentRoot) root;
		sourceByteArray = saveEObjectToByteArray(model);
	}

}
