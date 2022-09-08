/**
 */
package org.eclipse.set.toolboxmodel.Regelzeichnung.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Regelzeichnung.RegelzeichnungPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RegelzeichnungXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegelzeichnungXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		RegelzeichnungPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the RegelzeichnungResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new RegelzeichnungResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new RegelzeichnungResourceFactoryImpl());
		}
		return registrations;
	}

} //RegelzeichnungXMLProcessor