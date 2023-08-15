/**
 * Copyright (c) 2023 DB Netz AG and others.
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.toolboxmodel.Balisentechnik_ETCS;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Verbot WB Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMVerbotWBArt()
 * @model extendedMetaData="name='ENUMVerbot_WB_Art'"
 * @generated
 */
public enum ENUMVerbotWBArt implements Enumerator {
	/**
	 * The '<em><b>ENUM Verbot WB Art Betriebsbremsung</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG(0, "ENUMVerbot_WB_Art_Betriebsbremsung", "Betriebsbremsung"),

	/**
	 * The '<em><b>ENUM Verbot WB Art vollständig</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERBOT_WB_ART_VOLLSTÄNDIG_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERBOT_WB_ART_VOLLSTÄNDIG(1, "ENUMVerbot_WB_Art_vollständig", "vollst\u00e4ndig");

	/**
	 * The '<em><b>ENUM Verbot WB Art Betriebsbremsung</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG
	 * @model name="ENUMVerbot_WB_Art_Betriebsbremsung" literal="Betriebsbremsung"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG_VALUE = 0;

	/**
	 * The '<em><b>ENUM Verbot WB Art vollständig</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERBOT_WB_ART_VOLLSTÄNDIG
	 * @model name="ENUMVerbot_WB_Art_vollständig" literal="vollst\344ndig"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERBOT_WB_ART_VOLLSTÄNDIG_VALUE = 1;

	/**
	 * An array of all the '<em><b>ENUM Verbot WB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMVerbotWBArt[] VALUES_ARRAY =
		new ENUMVerbotWBArt[] {
			ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG,
			ENUM_VERBOT_WB_ART_VOLLSTÄNDIG,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Verbot WB Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMVerbotWBArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Verbot WB Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerbotWBArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVerbotWBArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Verbot WB Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerbotWBArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVerbotWBArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Verbot WB Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVerbotWBArt get(int value) {
		switch (value) {
			case ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG_VALUE: return ENUM_VERBOT_WB_ART_BETRIEBSBREMSUNG;
			case ENUM_VERBOT_WB_ART_VOLLSTÄNDIG_VALUE: return ENUM_VERBOT_WB_ART_VOLLSTÄNDIG;
			default: return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ENUMVerbotWBArt(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ENUMVerbotWBArt
