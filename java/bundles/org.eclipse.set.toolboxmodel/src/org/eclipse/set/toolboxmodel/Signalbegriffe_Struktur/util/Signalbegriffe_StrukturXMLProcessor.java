/**
 */
package org.eclipse.set.toolboxmodel.Signalbegriffe_Struktur.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Signalbegriffe_StrukturXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signalbegriffe_StrukturXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		Signalbegriffe_StrukturPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the Signalbegriffe_StrukturResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new Signalbegriffe_StrukturResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new Signalbegriffe_StrukturResourceFactoryImpl());
		}
		return registrations;
	}

} //Signalbegriffe_StrukturXMLProcessor
