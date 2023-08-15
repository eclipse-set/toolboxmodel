/**
 */
package org.eclipse.set.toolboxmodel.PlanPro;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ENUM Vergleichstyp Besonders</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.toolboxmodel.PlanPro.PlanProPackage#getENUMVergleichstypBesonders()
 * @model extendedMetaData="name='ENUMVergleichstyp_Besonders'"
 * @generated
 */
public enum ENUMVergleichstypBesonders implements Enumerator {
	/**
	 * The '<em><b>ENUM Vergleichstyp Besonders Ae M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERGLEICHSTYP_BESONDERS_AE_M_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERGLEICHSTYP_BESONDERS_AE_M(0, "ENUMVergleichstyp_Besonders_AeM", "AeM"),

	/**
	 * The '<em><b>ENUM Vergleichstyp Besonders Ae P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERGLEICHSTYP_BESONDERS_AE_P_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERGLEICHSTYP_BESONDERS_AE_P(1, "ENUMVergleichstyp_Besonders_AeP", "AeP"),

	/**
	 * The '<em><b>ENUM Vergleichstyp Besonders sonstige</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE(2, "ENUMVergleichstyp_Besonders_sonstige", "sonstige");

	/**
	 * The '<em><b>ENUM Vergleichstyp Besonders Ae M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERGLEICHSTYP_BESONDERS_AE_M
	 * @model name="ENUMVergleichstyp_Besonders_AeM" literal="AeM"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERGLEICHSTYP_BESONDERS_AE_M_VALUE = 0;

	/**
	 * The '<em><b>ENUM Vergleichstyp Besonders Ae P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERGLEICHSTYP_BESONDERS_AE_P
	 * @model name="ENUMVergleichstyp_Besonders_AeP" literal="AeP"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERGLEICHSTYP_BESONDERS_AE_P_VALUE = 1;

	/**
	 * The '<em><b>ENUM Vergleichstyp Besonders sonstige</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE
	 * @model name="ENUMVergleichstyp_Besonders_sonstige" literal="sonstige"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>ENUM Vergleichstyp Besonders</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ENUMVergleichstypBesonders[] VALUES_ARRAY =
		new ENUMVergleichstypBesonders[] {
			ENUM_VERGLEICHSTYP_BESONDERS_AE_M,
			ENUM_VERGLEICHSTYP_BESONDERS_AE_P,
			ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE,
		};

	/**
	 * A public read-only list of all the '<em><b>ENUM Vergleichstyp Besonders</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ENUMVergleichstypBesonders> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ENUM Vergleichstyp Besonders</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVergleichstypBesonders get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVergleichstypBesonders result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Vergleichstyp Besonders</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVergleichstypBesonders getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ENUMVergleichstypBesonders result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ENUM Vergleichstyp Besonders</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ENUMVergleichstypBesonders get(int value) {
		switch (value) {
			case ENUM_VERGLEICHSTYP_BESONDERS_AE_M_VALUE: return ENUM_VERGLEICHSTYP_BESONDERS_AE_M;
			case ENUM_VERGLEICHSTYP_BESONDERS_AE_P_VALUE: return ENUM_VERGLEICHSTYP_BESONDERS_AE_P;
			case ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE_VALUE: return ENUM_VERGLEICHSTYP_BESONDERS_SONSTIGE;
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
	private ENUMVergleichstypBesonders(int value, String name, String literal) {
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
	
} //ENUMVergleichstypBesonders
