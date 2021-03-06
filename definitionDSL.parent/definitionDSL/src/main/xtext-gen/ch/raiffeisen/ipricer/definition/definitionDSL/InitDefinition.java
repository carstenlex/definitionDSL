/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Init Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.InitDefinition#getId <em>Id</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.InitDefinition#getInitValue <em>Init Value</em>}</li>
 * </ul>
 *
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getInitDefinition()
 * @model
 * @generated
 */
public interface InitDefinition extends EObject
{
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
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getInitDefinition_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.InitDefinition#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Init Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init Value</em>' attribute.
   * @see #setInitValue(String)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getInitDefinition_InitValue()
   * @model
   * @generated
   */
  String getInitValue();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.InitDefinition#getInitValue <em>Init Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init Value</em>' attribute.
   * @see #getInitValue()
   * @generated
   */
  void setInitValue(String value);

} // InitDefinition
