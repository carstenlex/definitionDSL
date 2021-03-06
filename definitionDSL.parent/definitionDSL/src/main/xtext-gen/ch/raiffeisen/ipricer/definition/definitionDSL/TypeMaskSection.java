/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Mask Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskSection#getTypeMaskDefinitions <em>Type Mask Definitions</em>}</li>
 * </ul>
 *
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getTypeMaskSection()
 * @model
 * @generated
 */
public interface TypeMaskSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Mask Definitions</b></em>' containment reference list.
   * The list contents are of type {@link ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Mask Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Mask Definitions</em>' containment reference list.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getTypeMaskSection_TypeMaskDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<TypeMaskDefinition> getTypeMaskDefinitions();

} // TypeMaskSection
