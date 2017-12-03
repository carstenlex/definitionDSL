/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FIELD TYPE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFIELD_TYPE()
 * @model
 * @generated
 */
public enum FIELD_TYPE implements Enumerator
{
  /**
   * The '<em><b>STRING FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_FIELD_VALUE
   * @generated
   * @ordered
   */
  STRING_FIELD(0, "STRING_FIELD", "StringField"),

  /**
   * The '<em><b>TIME FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TIME_FIELD_VALUE
   * @generated
   * @ordered
   */
  TIME_FIELD(1, "TIME_FIELD", "TimeField"),

  /**
   * The '<em><b>INTEGER FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTEGER_FIELD_VALUE
   * @generated
   * @ordered
   */
  INTEGER_FIELD(2, "INTEGER_FIELD", "IntegerField"),

  /**
   * The '<em><b>PRICE FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRICE_FIELD_VALUE
   * @generated
   * @ordered
   */
  PRICE_FIELD(3, "PRICE_FIELD", "PriceField"),

  /**
   * The '<em><b>DOUBLE FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOUBLE_FIELD_VALUE
   * @generated
   * @ordered
   */
  DOUBLE_FIELD(4, "DOUBLE_FIELD", "DoubleField"),

  /**
   * The '<em><b>ZAHL FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ZAHL_FIELD_VALUE
   * @generated
   * @ordered
   */
  ZAHL_FIELD(5, "ZAHL_FIELD", "ZahlField"),

  /**
   * The '<em><b>DATE FIELD</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATE_FIELD_VALUE
   * @generated
   * @ordered
   */
  DATE_FIELD(6, "DATE_FIELD", "DateField");

  /**
   * The '<em><b>STRING FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING_FIELD
   * @model literal="StringField"
   * @generated
   * @ordered
   */
  public static final int STRING_FIELD_VALUE = 0;

  /**
   * The '<em><b>TIME FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TIME FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TIME_FIELD
   * @model literal="TimeField"
   * @generated
   * @ordered
   */
  public static final int TIME_FIELD_VALUE = 1;

  /**
   * The '<em><b>INTEGER FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTEGER FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTEGER_FIELD
   * @model literal="IntegerField"
   * @generated
   * @ordered
   */
  public static final int INTEGER_FIELD_VALUE = 2;

  /**
   * The '<em><b>PRICE FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRICE FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRICE_FIELD
   * @model literal="PriceField"
   * @generated
   * @ordered
   */
  public static final int PRICE_FIELD_VALUE = 3;

  /**
   * The '<em><b>DOUBLE FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DOUBLE FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOUBLE_FIELD
   * @model literal="DoubleField"
   * @generated
   * @ordered
   */
  public static final int DOUBLE_FIELD_VALUE = 4;

  /**
   * The '<em><b>ZAHL FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ZAHL FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ZAHL_FIELD
   * @model literal="ZahlField"
   * @generated
   * @ordered
   */
  public static final int ZAHL_FIELD_VALUE = 5;

  /**
   * The '<em><b>DATE FIELD</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATE FIELD</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATE_FIELD
   * @model literal="DateField"
   * @generated
   * @ordered
   */
  public static final int DATE_FIELD_VALUE = 6;

  /**
   * An array of all the '<em><b>FIELD TYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final FIELD_TYPE[] VALUES_ARRAY =
    new FIELD_TYPE[]
    {
      STRING_FIELD,
      TIME_FIELD,
      INTEGER_FIELD,
      PRICE_FIELD,
      DOUBLE_FIELD,
      ZAHL_FIELD,
      DATE_FIELD,
    };

  /**
   * A public read-only list of all the '<em><b>FIELD TYPE</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<FIELD_TYPE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>FIELD TYPE</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static FIELD_TYPE get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FIELD_TYPE result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FIELD TYPE</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static FIELD_TYPE getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      FIELD_TYPE result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>FIELD TYPE</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static FIELD_TYPE get(int value)
  {
    switch (value)
    {
      case STRING_FIELD_VALUE: return STRING_FIELD;
      case TIME_FIELD_VALUE: return TIME_FIELD;
      case INTEGER_FIELD_VALUE: return INTEGER_FIELD;
      case PRICE_FIELD_VALUE: return PRICE_FIELD;
      case DOUBLE_FIELD_VALUE: return DOUBLE_FIELD;
      case ZAHL_FIELD_VALUE: return ZAHL_FIELD;
      case DATE_FIELD_VALUE: return DATE_FIELD;
    }
    return null;
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
  private FIELD_TYPE(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //FIELD_TYPE
