/**
 */
package org.eclipse.set.toolboxmodel.Ansteuerung_Element.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Ansteuerung_Element.Ansteuerung_ElementPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Ansteuerung_ElementXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ansteuerung_ElementXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Ansteuerung_ElementPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Ansteuerung_ElementResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Ansteuerung_ElementResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Ansteuerung_ElementResourceFactoryImpl());
		}
		return registrations;
	}

} //Ansteuerung_ElementXMLProcessor
