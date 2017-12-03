/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL.impl;

import ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage;
import ch.raiffeisen.ipricer.definition.definitionDSL.OptionListSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListDefintion;

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
 * An implementation of the model object '<em><b>Option List Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.OptionListSectionImpl#getOptionListDefinitions <em>Option List Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionListSectionImpl extends MinimalEObjectImpl.Container implements OptionListSection
{
  /**
   * The cached value of the '{@link #getOptionListDefinitions() <em>Option List Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionListDefinitions()
   * @generated
   * @ordered
   */
  protected EList<UnderlyingListDefintion> optionListDefinitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionListSectionImpl()
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
    return DefinitionDSLPackage.Literals.OPTION_LIST_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnderlyingListDefintion> getOptionListDefinitions()
  {
    if (optionListDefinitions == null)
    {
      optionListDefinitions = new EObjectContainmentEList<UnderlyingListDefintion>(UnderlyingListDefintion.class, this, DefinitionDSLPackage.OPTION_LIST_SECTION__OPTION_LIST_DEFINITIONS);
    }
    return optionListDefinitions;
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
      case DefinitionDSLPackage.OPTION_LIST_SECTION__OPTION_LIST_DEFINITIONS:
        return ((InternalEList<?>)getOptionListDefinitions()).basicRemove(otherEnd, msgs);
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
      case DefinitionDSLPackage.OPTION_LIST_SECTION__OPTION_LIST_DEFINITIONS:
        return getOptionListDefinitions();
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
      case DefinitionDSLPackage.OPTION_LIST_SECTION__OPTION_LIST_DEFINITIONS:
        getOptionListDefinitions().clear();
        getOptionListDefinitions().addAll((Collection<? extends UnderlyingListDefintion>)newValue);
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
      case DefinitionDSLPackage.OPTION_LIST_SECTION__OPTION_LIST_DEFINITIONS:
        getOptionListDefinitions().clear();
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
      case DefinitionDSLPackage.OPTION_LIST_SECTION__OPTION_LIST_DEFINITIONS:
        return optionListDefinitions != null && !optionListDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OptionListSectionImpl
