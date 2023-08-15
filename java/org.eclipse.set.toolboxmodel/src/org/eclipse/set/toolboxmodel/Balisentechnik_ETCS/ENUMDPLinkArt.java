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
 * A representation of the literals of the enumeration '<em><b>ENUMDP Link Art</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.toolboxmodel.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getENUMDPLinkArt()
 * @model extendedMetaData="name='ENUMDP_Link_Art'"
 * @generated
 */
public enum ENUMDPLinkArt implements Enumerator {
	/**
	 * The '<em><b>ENUMDP Link Art Grund</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_LINK_ART_GRUND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_LINK_ART_GRUND(0, "ENUMDP_Link_Art_Grund", "Grund"),

	/**
	 * The '<em><b>ENUMDP Link Art Hilfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_LINK_ART_HILFS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_LINK_ART_HILFS(1, "ENUMDP_Link_Art_Hilfs", "Hilfs"),

	/**
	 * The '<em><b>ENUMDP Link Art sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_LINK_ART_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMDP_LINK_ART_SONSTIGE(2, "ENUMDP_Link_Art_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUMDP Link Art Grund</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_LINK_ART_GRUND
	 * @model name="ENUMDP_Link_Art_Grund" literal="Grund"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_LINK_ART_GRUND_VALUE = 0;

	/**
	 * The '<em><b>ENUMDP Link Art Hilfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_LINK_ART_HILFS
	 * @model name="ENUMDP_Link_Art_Hilfs" literal="Hilfs"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_LINK_ART_HILFS_VALUE = 1;

	/**
	 * The '<em><b>ENUMDP Link Art sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMDP_LINK_ART_SONSTIGE
	 * @model name="ENUMDP_Link_Art_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMDP_LINK_ART_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUMDP Link Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMDPLinkArt[] VALUES_ARRAY =
		new ENUMDPLinkArt[] {
			ENUMDP_LINK_ART_GRUND,
			ENUMDP_LINK_ART_HILFS,
			ENUMDP_LINK_ART_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUMDP Link Art</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMDPLinkArt> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUMDP Link Art</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPLinkArt get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPLinkArt result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Link Art</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPLinkArt getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMDPLinkArt result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUMDP Link Art</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMDPLinkArt get(int value) {
		switch (value) {
			case ENUMDP_LINK_ART_GRUND_VALUE: return ENUMDP_LINK_ART_GRUND;
			case ENUMDP_LINK_ART_HILFS_VALUE: return ENUMDP_LINK_ART_HILFS;
			case ENUMDP_LINK_ART_SONSTIGE_VALUE: return ENUMDP_LINK_ART_SONSTIGE;
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
	private ENUMDPLinkArt(int value, String name, String literal) {
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
	
} //ENUMDPLinkArt
