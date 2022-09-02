/**
 */
package org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.set.toolboxmodel.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchluesselabhaengigkeitenXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchluesselabhaengigkeitenXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SchluesselabhaengigkeitenPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SchluesselabhaengigkeitenResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SchluesselabhaengigkeitenResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SchluesselabhaengigkeitenResourceFactoryImpl());
		}
		return registrations;
	}

} //SchluesselabhaengigkeitenXMLProcessor
