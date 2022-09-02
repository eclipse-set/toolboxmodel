/**
 */
package org.eclipse.set.toolboxmodel.Flankenschutz.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Flankenschutz.FlankenschutzPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlankenschutzXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlankenschutzXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		FlankenschutzPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the FlankenschutzResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new FlankenschutzResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new FlankenschutzResourceFactoryImpl());
		}
		return registrations;
	}

} //FlankenschutzXMLProcessor
