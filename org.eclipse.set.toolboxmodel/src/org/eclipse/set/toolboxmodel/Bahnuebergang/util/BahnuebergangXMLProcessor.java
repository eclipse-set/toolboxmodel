/**
 */
package org.eclipse.set.toolboxmodel.Bahnuebergang.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Bahnuebergang.BahnuebergangPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BahnuebergangXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BahnuebergangXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		BahnuebergangPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the BahnuebergangResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new BahnuebergangResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new BahnuebergangResourceFactoryImpl());
		}
		return registrations;
	}

} //BahnuebergangXMLProcessor
