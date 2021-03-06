/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL.util;

import ch.raiffeisen.ipricer.definition.definitionDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage
 * @generated
 */
public class DefinitionDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DefinitionDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DefinitionDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionDSLSwitch<Adapter> modelSwitch =
    new DefinitionDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDefinition(Definition object)
      {
        return createDefinitionAdapter();
      }
      @Override
      public Adapter caseData(Data object)
      {
        return createDataAdapter();
      }
      @Override
      public Adapter caseInitSection(InitSection object)
      {
        return createInitSectionAdapter();
      }
      @Override
      public Adapter caseTypeMaskSection(TypeMaskSection object)
      {
        return createTypeMaskSectionAdapter();
      }
      @Override
      public Adapter caseUnderlyingMaskSection(UnderlyingMaskSection object)
      {
        return createUnderlyingMaskSectionAdapter();
      }
      @Override
      public Adapter caseUnderlyingListSection(UnderlyingListSection object)
      {
        return createUnderlyingListSectionAdapter();
      }
      @Override
      public Adapter caseOptionListSection(OptionListSection object)
      {
        return createOptionListSectionAdapter();
      }
      @Override
      public Adapter caseOptionMaskSection(OptionMaskSection object)
      {
        return createOptionMaskSectionAdapter();
      }
      @Override
      public Adapter caseUnderlyingListDefintion(UnderlyingListDefintion object)
      {
        return createUnderlyingListDefintionAdapter();
      }
      @Override
      public Adapter caseTypeMaskDefinition(TypeMaskDefinition object)
      {
        return createTypeMaskDefinitionAdapter();
      }
      @Override
      public Adapter caseUnderlyingMaskDefinition(UnderlyingMaskDefinition object)
      {
        return createUnderlyingMaskDefinitionAdapter();
      }
      @Override
      public Adapter caseInitDefinition(InitDefinition object)
      {
        return createInitDefinitionAdapter();
      }
      @Override
      public Adapter caseFieldDefinition(FieldDefinition object)
      {
        return createFieldDefinitionAdapter();
      }
      @Override
      public Adapter caseOption(Option object)
      {
        return createOptionAdapter();
      }
      @Override
      public Adapter caseOptionValproc(OptionValproc object)
      {
        return createOptionValprocAdapter();
      }
      @Override
      public Adapter caseOptionStrict(OptionStrict object)
      {
        return createOptionStrictAdapter();
      }
      @Override
      public Adapter caseOptionRange(OptionRange object)
      {
        return createOptionRangeAdapter();
      }
      @Override
      public Adapter caseOptionContrib(OptionContrib object)
      {
        return createOptionContribAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.Definition
   * @generated
   */
  public Adapter createDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.Data
   * @generated
   */
  public Adapter createDataAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.InitSection <em>Init Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.InitSection
   * @generated
   */
  public Adapter createInitSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskSection <em>Type Mask Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskSection
   * @generated
   */
  public Adapter createTypeMaskSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingMaskSection <em>Underlying Mask Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingMaskSection
   * @generated
   */
  public Adapter createUnderlyingMaskSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListSection <em>Underlying List Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListSection
   * @generated
   */
  public Adapter createUnderlyingListSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionListSection <em>Option List Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.OptionListSection
   * @generated
   */
  public Adapter createOptionListSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionMaskSection <em>Option Mask Section</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.OptionMaskSection
   * @generated
   */
  public Adapter createOptionMaskSectionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListDefintion <em>Underlying List Defintion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListDefintion
   * @generated
   */
  public Adapter createUnderlyingListDefintionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskDefinition <em>Type Mask Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskDefinition
   * @generated
   */
  public Adapter createTypeMaskDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingMaskDefinition <em>Underlying Mask Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingMaskDefinition
   * @generated
   */
  public Adapter createUnderlyingMaskDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.InitDefinition <em>Init Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.InitDefinition
   * @generated
   */
  public Adapter createInitDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition <em>Field Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.FieldDefinition
   * @generated
   */
  public Adapter createFieldDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.Option <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.Option
   * @generated
   */
  public Adapter createOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionValproc <em>Option Valproc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.OptionValproc
   * @generated
   */
  public Adapter createOptionValprocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionStrict <em>Option Strict</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.OptionStrict
   * @generated
   */
  public Adapter createOptionStrictAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionRange <em>Option Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.OptionRange
   * @generated
   */
  public Adapter createOptionRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ch.raiffeisen.ipricer.definition.definitionDSL.OptionContrib <em>Option Contrib</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ch.raiffeisen.ipricer.definition.definitionDSL.OptionContrib
   * @generated
   */
  public Adapter createOptionContribAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DefinitionDSLAdapterFactory
