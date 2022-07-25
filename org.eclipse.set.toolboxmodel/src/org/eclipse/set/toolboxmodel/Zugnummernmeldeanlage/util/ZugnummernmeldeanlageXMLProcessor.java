/**
 */
package org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ZugnummernmeldeanlageXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZugnummernmeldeanlageXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ZugnummernmeldeanlagePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the ZugnummernmeldeanlageResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ZugnummernmeldeanlageResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ZugnummernmeldeanlageResourceFactoryImpl());
		}
		return registrations;
	}

} //ZugnummernmeldeanlageXMLProcessor
