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
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.IllegalValueException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.model11001.PlanPro.DocumentRoot;
import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;
import org.eclipse.set.model.model11001.PlanPro.util.PlanProResourceFactoryImpl;
import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;
import org.eclipse.set.toolboxmodel.PlanPro.util.ToolboxModelService;
import org.eclipse.set.toolboxmodel.transform.ToolboxModelServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@SuppressWarnings("nls")
class ToolboxModelServiceImplTest {
	private static final String ZIPPED_PLANPRO_FILE = "res/PPHN_1.10.0.1_01-02_Ibn-Z._-_2._AeM_2022-05-17_13-44_tg2.planpro";
	private static final String PLAIN_PLANPRO_FILE = "res/PPHN_Sample.ppxml";
	private static final String UNZIP_DIR = "res/toolbox";
	private static final String CONTENT_MODEL = "content";
	private static final String LAYOUT_MODEL = "layout";
	private static final String PLANPRO_ZIPPED_EXTENSION = "planpro";
	private static final String PLANPRO_PLAIN_EXTENSION = "ppxml";
	private DocumentRoot model;
	private ToolboxModelService testee;

	private final HashMap<String, byte[]> sourceByteArray = new HashMap<>();
	private EObject retransformedPlanproModel;

	private ResourceSet resourceSet;
	private org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot layoutRoot;
	private org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot retransformedPlanproLayout;

	/**
	 * Tests whether a PlanPro file changes if it is transformed into a Toolbox
	 * model and back
	 * 
	 * @throws Exception
	 */
	@ParameterizedTest
	@ValueSource(strings = { ZIPPED_PLANPRO_FILE, PLAIN_PLANPRO_FILE })
	void testTransform(final String testFilePath) throws Exception {
		givenToolboxModelInitialization();
		givenToolboxModelService();
		givenResourceSet();
		givenPlanProFile(testFilePath);
		givenOriginalByteArray();

		whenTransformingModel();

		thenRetransformedModelMatchesOriginal();
	}

	private static void givenToolboxModelInitialization() {
		// Required for EMF Initialization according to EMF FAQ
		// See
		// https://wiki.eclipse.org/EMF/FAQ#How_do_I_use_EMF_in_standalone_applications_.28such_as_an_ordinary_main.29.3F
		org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage.eINSTANCE.eClass();
	}

	private void givenToolboxModelService() {
		testee = new ToolboxModelServiceImpl();
	}

	protected void givenResourceSet() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", //$NON-NLS-1$
				new PlanProResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
				.put(PLANPRO_PLAIN_EXTENSION, new PlanProResourceFactoryImpl());
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(PlanProPackage.eNS_URI,
				PlanProPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(
				Signalbegriffe_Ril_301Package.eNS_URI,
				Signalbegriffe_Ril_301Package.eINSTANCE);
		resourceSet.getPackageRegistry().put(LayoutinformationenPackage.eNS_URI,
				LayoutinformationenPackage.eINSTANCE);
	}

	protected void givenPlanProFile(final String filePath) throws IOException {
		if (isZippedPlanProFile(filePath)) {
			loadZippedPlanProFile(filePath);
		} else {
			final URI testFileURI = URI.createFileURI(filePath);
			final XMLResource resource = loadResource(testFileURI);
			if (!resource.getContents().isEmpty() && resource.getContents()
					.get(0) instanceof final DocumentRoot docRoot) {
				model = docRoot;
			}
		}
		if (model == null) {
			throw new IllegalArgumentException(
					"Resource contains no PlanPro model with the requested version."); //$NON-NLS-1$
		}
	}

	private void loadZippedPlanProFile(final String filePath)
			throws IOException {
		final List<XMLResource> listResource = new ArrayList<>();
		unzip(filePath);
		final URI contentURI = URI
				.createFileURI(getModelPath(CONTENT_MODEL).toString());
		listResource.add(loadResource(contentURI));

		final Path layoutModelPath = getModelPath(LAYOUT_MODEL);
		if (Files.exists(layoutModelPath)) {
			final URI layout = URI.createFileURI(layoutModelPath.toString());
			listResource.add(loadResource(layout));
		}

		listResource.forEach(resource -> {
			final EObject root = resource.getContents().get(0);
			if (root instanceof DocumentRoot) {
				model = (DocumentRoot) root;
			} else if (root instanceof final org.eclipse.set.model.model11001.Layoutinformationen.DocumentRoot layoutdocument) {
				this.layoutRoot = layoutdocument;
			}
		});
	}

	private static boolean isZippedPlanProFile(final String filePath) {
		final List<String> split = Arrays.asList(filePath.split("\\."));
		if (split.size() > 1) {
			return split.get(split.size() - 1).equals(PLANPRO_ZIPPED_EXTENSION);
		}
		return false;
	}

	private static void unzip(final String filePath) throws IOException {
		final Path unzipDir = Paths.get(UNZIP_DIR);
		Files.createDirectories(unzipDir);
		// unzip the archive
		final byte[] buffer = new byte[1024];
		try (final ZipInputStream zipIn = new ZipInputStream(
				new FileInputStream(new File(filePath)))) {
			for (ZipEntry zipEntry = zipIn
					.getNextEntry(); zipEntry != null; zipEntry = zipIn
							.getNextEntry()) {
				final File newFile = newFile(unzipDir, zipEntry);
				if (zipEntry.getName().endsWith("/")) {
					newFile.mkdirs();
				} else {
					// Create parent directories if not present
					newFile.getParentFile().mkdirs();

					// Extract the file
					try (final FileOutputStream fos = new FileOutputStream(
							newFile)) {
						int len;
						while ((len = zipIn.read(buffer)) > 0) {
							fos.write(buffer, 0, len);
						}
					}
				}
			}
			zipIn.closeEntry();
		}
	}

	private static File newFile(final Path dir, final ZipEntry entry)
			throws IOException {
		final File file = new File(dir.toString(), entry.getName());

		// test file position against dir
		final String filePath = file.getCanonicalPath();
		final String dirPath = dir.toFile().getCanonicalPath() + File.separator;
		if (filePath.startsWith(dirPath)) {
			return file;
		}
		throw new IOException(
				String.format("%s is outside of %s", filePath, dirPath)); //$NON-NLS-1$
	}

	private static Path getModelPath(final String modelName) {
		return Paths.get(UNZIP_DIR, modelName + ".xml");
	}

	private XMLResource loadResource(final URI resourceURI) throws IOException {
		final XMLResource resource = (XMLResource) resourceSet
				.createResource(resourceURI);
		try {
			resource.load(null);
		} catch (final Exception e) {
			if (!(e.getCause() instanceof FeatureNotFoundException
					|| e.getCause() instanceof IllegalValueException)) {
				throw e;
			}
		}
		return resource;
	}

	protected void givenOriginalByteArray() throws IOException {
		if (model != null) {
			sourceByteArray.put(CONTENT_MODEL,
					saveEObjectToByteArray(model, CONTENT_MODEL));
		}

		if (layoutRoot != null) {
			sourceByteArray.put(LAYOUT_MODEL,
					saveEObjectToByteArray(layoutRoot, LAYOUT_MODEL));
		}
	}

	private void whenTransformingModel() {
		retransformedPlanproModel = testee
				.savePlanProModel(testee.loadPlanProModel(model));
		if (layoutRoot != null) {
			retransformedPlanproLayout = testee
					.saveLayoutModel(testee.loadPlanProLayout(layoutRoot));
		}
	}

	private void thenRetransformedModelMatchesOriginal() throws IOException {
		// Write source into byte array
		final byte[] retransformed = saveEObjectToByteArray(
				retransformedPlanproModel, CONTENT_MODEL);
		Assertions.assertArrayEquals(sourceByteArray.get(CONTENT_MODEL),
				retransformed);

		if (layoutRoot != null) {
			final byte[] retransformedlayout = saveEObjectToByteArray(
					retransformedPlanproLayout, LAYOUT_MODEL);
			Assertions.assertArrayEquals(sourceByteArray.get(LAYOUT_MODEL),
					retransformedlayout);
		}
	}

	private static byte[] saveEObjectToByteArray(final EObject object,
			final String fileName) throws IOException {
		final ResourceSet rs = new ResourceSetImpl();
		final Resource resource = rs
				.createResource(URI.createURI(fileName + ".xml"));
		resource.getContents().add(object);
		final ByteArrayOutputStream sourceStream = new ByteArrayOutputStream();
		resource.save(sourceStream, null);
		return sourceStream.toByteArray();
	}
}
