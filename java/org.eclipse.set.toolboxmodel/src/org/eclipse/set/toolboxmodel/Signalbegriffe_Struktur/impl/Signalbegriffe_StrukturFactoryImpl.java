/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Signalbegriffe_Struktur.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.set.toolboxmodel.Signalbegriffe_Struktur.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Signalbegriffe_StrukturFactoryImpl extends EFactoryImpl implements Signalbegriffe_StrukturFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Signalbegriffe_StrukturFactory init() {
		try {
			Signalbegriffe_StrukturFactory theSignalbegriffe_StrukturFactory = (Signalbegriffe_StrukturFactory)EPackage.Registry.INSTANCE.getEFactory(Signalbegriffe_StrukturPackage.eNS_URI);
			if (theSignalbegriffe_StrukturFactory != null) {
				return theSignalbegriffe_StrukturFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Signalbegriffe_StrukturFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signalbegriffe_StrukturFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalbegriffe_StrukturPackage getSignalbegriffe_StrukturPackage() {
		return (Signalbegriffe_StrukturPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Signalbegriffe_StrukturPackage getPackage() {
		return Signalbegriffe_StrukturPackage.eINSTANCE;
	}

} //Signalbegriffe_StrukturFactoryImpl
