/**
 */
package org.eclipse.set.toolboxmodel.Nahbedienbereich.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Nahbedienbereich.NahbedienbereichPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NahbedienbereichXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NahbedienbereichXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		NahbedienbereichPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the NahbedienbereichResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new NahbedienbereichResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new NahbedienbereichResourceFactoryImpl());
		}
		return registrations;
	}

} //NahbedienbereichXMLProcessor
