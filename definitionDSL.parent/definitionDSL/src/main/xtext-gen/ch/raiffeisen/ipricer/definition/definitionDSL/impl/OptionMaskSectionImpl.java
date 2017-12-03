/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL.impl;

import ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage;
import ch.raiffeisen.ipricer.definition.definitionDSL.OptionMaskSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option Mask Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.OptionMaskSectionImpl#getOptionMaskDefinitions <em>Option Mask Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionMaskSectionImpl extends MinimalEObjectImpl.Container implements OptionMaskSection
{
  /**
   * The cached value of the '{@link #getOptionMaskDefinitions() <em>Option Mask Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionMaskDefinitions()
   * @generated
   * @ordered
   */
  protected EList<TypeMaskDefinition> optionMaskDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionMaskSectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DefinitionDSLPackage.Literals.OPTION_MASK_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeMaskDefinition> getOptionMaskDefinitions()
  {
    if (optionMaskDefinitions == null)
    {
      optionMaskDefinitions = new EObjectContainmentEList<TypeMaskDefinition>(TypeMaskDefinition.class, this, DefinitionDSLPackage.OPTION_MASK_SECTION__OPTION_MASK_DEFINITIONS);
    }
    return optionMaskDefinitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DefinitionDSLPackage.OPTION_MASK_SECTION__OPTION_MASK_DEFINITIONS:
        return ((InternalEList<?>)getOptionMaskDefinitions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DefinitionDSLPackage.OPTION_MASK_SECTION__OPTION_MASK_DEFINITIONS:
        return getOptionMaskDefinitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DefinitionDSLPackage.OPTION_MASK_SECTION__OPTION_MASK_DEFINITIONS:
        getOptionMaskDefinitions().clear();
        getOptionMaskDefinitions().addAll((Collection<? extends TypeMaskDefinition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DefinitionDSLPackage.OPTION_MASK_SECTION__OPTION_MASK_DEFINITIONS:
        getOptionMaskDefinitions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DefinitionDSLPackage.OPTION_MASK_SECTION__OPTION_MASK_DEFINITIONS:
        return optionMaskDefinitions != null && !optionMaskDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptionMaskSectionImpl