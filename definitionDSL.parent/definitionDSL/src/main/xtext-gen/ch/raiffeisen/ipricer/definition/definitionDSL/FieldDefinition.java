/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getId <em>Id</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getName <em>Name</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getAccess <em>Access</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getRecordClass <em>Record Class</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getFieldName <em>Field Name</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getLength <em>Length</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition()
 * @model
 * @generated
 */
public interface FieldDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Field Type</b></em>' attribute.
   * The literals are from the enumeration {@link ch.raiffeisen.ipricer.definition.definitionDSL.FIELD_TYPE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Type</em>' attribute.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.FIELD_TYPE
   * @see #setFieldType(FIELD_TYPE)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_FieldType()
   * @model
   * @generated
   */
  FIELD_TYPE getFieldType();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getFieldType <em>Field Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Type</em>' attribute.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.FIELD_TYPE
   * @see #getFieldType()
   * @generated
   */
  void setFieldType(FIELD_TYPE value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link ch.raiffeisen.ipricer.definition.definitionDSL.ROLE}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Access</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.ROLE
   * @see #setAccess(ROLE)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_Access()
   * @model
   * @generated
   */
  ROLE getAccess();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.ROLE
   * @see #getAccess()
   * @generated
   */
  void setAccess(ROLE value);

  /**
   * Returns the value of the '<em><b>Record Class</b></em>' attribute.
   * The literals are from the enumeration {@link ch.raiffeisen.ipricer.definition.definitionDSL.RECORDCLASS}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Class</em>' attribute.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.RECORDCLASS
   * @see #setRecordClass(RECORDCLASS)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_RecordClass()
   * @model
   * @generated
   */
  RECORDCLASS getRecordClass();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getRecordClass <em>Record Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Class</em>' attribute.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.RECORDCLASS
   * @see #getRecordClass()
   * @generated
   */
  void setRecordClass(RECORDCLASS value);

  /**
   * Returns the value of the '<em><b>Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Name</em>' attribute.
   * @see #setFieldName(String)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_FieldName()
   * @model
   * @generated
   */
  String getFieldName();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getFieldName <em>Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Name</em>' attribute.
   * @see #getFieldName()
   * @generated
   */
  void setFieldName(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link ch.raiffeisen.ipricer.definition.definitionDSL.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getFieldDefinition_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

} // FieldDefinition
