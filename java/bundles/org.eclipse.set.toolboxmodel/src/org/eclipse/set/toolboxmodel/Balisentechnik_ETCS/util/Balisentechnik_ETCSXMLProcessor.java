/**
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Balisentechnik_ETCSXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Balisentechnik_ETCSXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Balisentechnik_ETCSPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Balisentechnik_ETCSResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Balisentechnik_ETCSResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Balisentechnik_ETCSResourceFactoryImpl());
		}
		return registrations;
	}

} //Balisentechnik_ETCSXMLProcessor
