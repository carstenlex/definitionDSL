/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option Contrib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionContrib#isContrib <em>Contrib</em>}</li>
 * </ul>
 *
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getOptionContrib()
 * @model
 * @generated
 */
public interface OptionContrib extends Option
{
  /**
   * Returns the value of the '<em><b>Contrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contrib</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contrib</em>' attribute.
   * @see #setContrib(boolean)
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage#getOptionContrib_Contrib()
   * @model
   * @generated
   */
  boolean isContrib();

  /**
   * Sets the value of the '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionContrib#isContrib <em>Contrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contrib</em>' attribute.
   * @see #isContrib()
   * @generated
   */
  void setContrib(boolean value);

} // OptionContrib