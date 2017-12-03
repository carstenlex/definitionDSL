/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Underlying List Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListSection#getUnderlyingListDefinitions <em>Underlying List Definitions</em>}</li>
 * </ul>
 *
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getUnderlyingListSection()
 * @model
 * @generated
 */
public interface UnderlyingListSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Underlying List Definitions</b></em>' containment reference list.
   * The list contents are of type {@link ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListDefintion}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Underlying List Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Underlying List Definitions</em>' containment reference list.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getUnderlyingListSection_UnderlyingListDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<UnderlyingListDefintion> getUnderlyingListDefinitions();

} // UnderlyingListSection