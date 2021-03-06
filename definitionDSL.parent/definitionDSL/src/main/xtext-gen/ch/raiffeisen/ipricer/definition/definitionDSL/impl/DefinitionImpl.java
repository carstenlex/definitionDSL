/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL.impl;

import ch.raiffeisen.ipricer.definition.definitionDSL.Data;
import ch.raiffeisen.ipricer.definition.definitionDSL.Definition;
import ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage;
import ch.raiffeisen.ipricer.definition.definitionDSL.InitSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.OptionListSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.OptionMaskSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.TypeMaskSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListSection;
import ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingMaskSection;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getGuiLabelMethod <em>Gui Label Method</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getGuiLabelParent <em>Gui Label Parent</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getGuiLabelChild <em>Gui Label Child</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getData <em>Data</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getInitSection <em>Init Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getTypeMaskSection <em>Type Mask Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getUnderlyingListSection <em>Underlying List Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getUnderlyingMaskSection <em>Underlying Mask Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getOptionListSection <em>Option List Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getOptionListLabelSection <em>Option List Label Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getOptionMaskSection <em>Option Mask Section</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.DefinitionImpl#getEventuellTclProcedures <em>Eventuell Tcl Procedures</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionImpl extends MinimalEObjectImpl.Container implements Definition
{
  /**
   * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected static final String METHOD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodName()
   * @generated
   * @ordered
   */
  protected String methodName = METHOD_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getGuiLabelMethod() <em>Gui Label Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiLabelMethod()
   * @generated
   * @ordered
   */
  protected static final String GUI_LABEL_METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuiLabelMethod() <em>Gui Label Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiLabelMethod()
   * @generated
   * @ordered
   */
  protected String guiLabelMethod = GUI_LABEL_METHOD_EDEFAULT;

  /**
   * The default value of the '{@link #getGuiLabelParent() <em>Gui Label Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiLabelParent()
   * @generated
   * @ordered
   */
  protected static final String GUI_LABEL_PARENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuiLabelParent() <em>Gui Label Parent</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiLabelParent()
   * @generated
   * @ordered
   */
  protected String guiLabelParent = GUI_LABEL_PARENT_EDEFAULT;

  /**
   * The default value of the '{@link #getGuiLabelChild() <em>Gui Label Child</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiLabelChild()
   * @generated
   * @ordered
   */
  protected static final String GUI_LABEL_CHILD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGuiLabelChild() <em>Gui Label Child</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuiLabelChild()
   * @generated
   * @ordered
   */
  protected String guiLabelChild = GUI_LABEL_CHILD_EDEFAULT;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected Data data;

  /**
   * The cached value of the '{@link #getInitSection() <em>Init Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitSection()
   * @generated
   * @ordered
   */
  protected InitSection initSection;

  /**
   * The cached value of the '{@link #getTypeMaskSection() <em>Type Mask Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeMaskSection()
   * @generated
   * @ordered
   */
  protected TypeMaskSection typeMaskSection;

  /**
   * The cached value of the '{@link #getUnderlyingListSection() <em>Underlying List Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnderlyingListSection()
   * @generated
   * @ordered
   */
  protected UnderlyingListSection underlyingListSection;

  /**
   * The cached value of the '{@link #getUnderlyingMaskSection() <em>Underlying Mask Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnderlyingMaskSection()
   * @generated
   * @ordered
   */
  protected UnderlyingMaskSection underlyingMaskSection;

  /**
   * The cached value of the '{@link #getOptionListSection() <em>Option List Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionListSection()
   * @generated
   * @ordered
   */
  protected OptionListSection optionListSection;

  /**
   * The default value of the '{@link #getOptionListLabelSection() <em>Option List Label Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionListLabelSection()
   * @generated
   * @ordered
   */
  protected static final String OPTION_LIST_LABEL_SECTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptionListLabelSection() <em>Option List Label Section</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionListLabelSection()
   * @generated
   * @ordered
   */
  protected String optionListLabelSection = OPTION_LIST_LABEL_SECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getOptionMaskSection() <em>Option Mask Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionMaskSection()
   * @generated
   * @ordered
   */
  protected OptionMaskSection optionMaskSection;

  /**
   * The cached value of the '{@link #getEventuellTclProcedures() <em>Eventuell Tcl Procedures</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventuellTclProcedures()
   * @generated
   * @ordered
   */
  protected EList<String> eventuellTclProcedures;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return DefinitionDSLPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethodName()
  {
    return methodName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodName(String newMethodName)
  {
    String oldMethodName = methodName;
    methodName = newMethodName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__METHOD_NAME, oldMethodName, methodName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuiLabelMethod()
  {
    return guiLabelMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuiLabelMethod(String newGuiLabelMethod)
  {
    String oldGuiLabelMethod = guiLabelMethod;
    guiLabelMethod = newGuiLabelMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__GUI_LABEL_METHOD, oldGuiLabelMethod, guiLabelMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuiLabelParent()
  {
    return guiLabelParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuiLabelParent(String newGuiLabelParent)
  {
    String oldGuiLabelParent = guiLabelParent;
    guiLabelParent = newGuiLabelParent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__GUI_LABEL_PARENT, oldGuiLabelParent, guiLabelParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGuiLabelChild()
  {
    return guiLabelChild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuiLabelChild(String newGuiLabelChild)
  {
    String oldGuiLabelChild = guiLabelChild;
    guiLabelChild = newGuiLabelChild;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__GUI_LABEL_CHILD, oldGuiLabelChild, guiLabelChild));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(Data newData, NotificationChain msgs)
  {
    Data oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(Data newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitSection getInitSection()
  {
    return initSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitSection(InitSection newInitSection, NotificationChain msgs)
  {
    InitSection oldInitSection = initSection;
    initSection = newInitSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__INIT_SECTION, oldInitSection, newInitSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitSection(InitSection newInitSection)
  {
    if (newInitSection != initSection)
    {
      NotificationChain msgs = null;
      if (initSection != null)
        msgs = ((InternalEObject)initSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__INIT_SECTION, null, msgs);
      if (newInitSection != null)
        msgs = ((InternalEObject)newInitSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__INIT_SECTION, null, msgs);
      msgs = basicSetInitSection(newInitSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__INIT_SECTION, newInitSection, newInitSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeMaskSection getTypeMaskSection()
  {
    return typeMaskSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeMaskSection(TypeMaskSection newTypeMaskSection, NotificationChain msgs)
  {
    TypeMaskSection oldTypeMaskSection = typeMaskSection;
    typeMaskSection = newTypeMaskSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION, oldTypeMaskSection, newTypeMaskSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeMaskSection(TypeMaskSection newTypeMaskSection)
  {
    if (newTypeMaskSection != typeMaskSection)
    {
      NotificationChain msgs = null;
      if (typeMaskSection != null)
        msgs = ((InternalEObject)typeMaskSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION, null, msgs);
      if (newTypeMaskSection != null)
        msgs = ((InternalEObject)newTypeMaskSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION, null, msgs);
      msgs = basicSetTypeMaskSection(newTypeMaskSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION, newTypeMaskSection, newTypeMaskSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnderlyingListSection getUnderlyingListSection()
  {
    return underlyingListSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnderlyingListSection(UnderlyingListSection newUnderlyingListSection, NotificationChain msgs)
  {
    UnderlyingListSection oldUnderlyingListSection = underlyingListSection;
    underlyingListSection = newUnderlyingListSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION, oldUnderlyingListSection, newUnderlyingListSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnderlyingListSection(UnderlyingListSection newUnderlyingListSection)
  {
    if (newUnderlyingListSection != underlyingListSection)
    {
      NotificationChain msgs = null;
      if (underlyingListSection != null)
        msgs = ((InternalEObject)underlyingListSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION, null, msgs);
      if (newUnderlyingListSection != null)
        msgs = ((InternalEObject)newUnderlyingListSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION, null, msgs);
      msgs = basicSetUnderlyingListSection(newUnderlyingListSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION, newUnderlyingListSection, newUnderlyingListSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnderlyingMaskSection getUnderlyingMaskSection()
  {
    return underlyingMaskSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnderlyingMaskSection(UnderlyingMaskSection newUnderlyingMaskSection, NotificationChain msgs)
  {
    UnderlyingMaskSection oldUnderlyingMaskSection = underlyingMaskSection;
    underlyingMaskSection = newUnderlyingMaskSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION, oldUnderlyingMaskSection, newUnderlyingMaskSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnderlyingMaskSection(UnderlyingMaskSection newUnderlyingMaskSection)
  {
    if (newUnderlyingMaskSection != underlyingMaskSection)
    {
      NotificationChain msgs = null;
      if (underlyingMaskSection != null)
        msgs = ((InternalEObject)underlyingMaskSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION, null, msgs);
      if (newUnderlyingMaskSection != null)
        msgs = ((InternalEObject)newUnderlyingMaskSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION, null, msgs);
      msgs = basicSetUnderlyingMaskSection(newUnderlyingMaskSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION, newUnderlyingMaskSection, newUnderlyingMaskSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionListSection getOptionListSection()
  {
    return optionListSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptionListSection(OptionListSection newOptionListSection, NotificationChain msgs)
  {
    OptionListSection oldOptionListSection = optionListSection;
    optionListSection = newOptionListSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION, oldOptionListSection, newOptionListSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptionListSection(OptionListSection newOptionListSection)
  {
    if (newOptionListSection != optionListSection)
    {
      NotificationChain msgs = null;
      if (optionListSection != null)
        msgs = ((InternalEObject)optionListSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION, null, msgs);
      if (newOptionListSection != null)
        msgs = ((InternalEObject)newOptionListSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION, null, msgs);
      msgs = basicSetOptionListSection(newOptionListSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION, newOptionListSection, newOptionListSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOptionListLabelSection()
  {
    return optionListLabelSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptionListLabelSection(String newOptionListLabelSection)
  {
    String oldOptionListLabelSection = optionListLabelSection;
    optionListLabelSection = newOptionListLabelSection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__OPTION_LIST_LABEL_SECTION, oldOptionListLabelSection, optionListLabelSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionMaskSection getOptionMaskSection()
  {
    return optionMaskSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptionMaskSection(OptionMaskSection newOptionMaskSection, NotificationChain msgs)
  {
    OptionMaskSection oldOptionMaskSection = optionMaskSection;
    optionMaskSection = newOptionMaskSection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION, oldOptionMaskSection, newOptionMaskSection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptionMaskSection(OptionMaskSection newOptionMaskSection)
  {
    if (newOptionMaskSection != optionMaskSection)
    {
      NotificationChain msgs = null;
      if (optionMaskSection != null)
        msgs = ((InternalEObject)optionMaskSection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION, null, msgs);
      if (newOptionMaskSection != null)
        msgs = ((InternalEObject)newOptionMaskSection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION, null, msgs);
      msgs = basicSetOptionMaskSection(newOptionMaskSection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION, newOptionMaskSection, newOptionMaskSection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getEventuellTclProcedures()
  {
    if (eventuellTclProcedures == null)
    {
      eventuellTclProcedures = new EDataTypeEList<String>(String.class, this, DefinitionDSLPackage.DEFINITION__EVENTUELL_TCL_PROCEDURES);
    }
    return eventuellTclProcedures;
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
      case DefinitionDSLPackage.DEFINITION__DATA:
        return basicSetData(null, msgs);
      case DefinitionDSLPackage.DEFINITION__INIT_SECTION:
        return basicSetInitSection(null, msgs);
      case DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION:
        return basicSetTypeMaskSection(null, msgs);
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION:
        return basicSetUnderlyingListSection(null, msgs);
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION:
        return basicSetUnderlyingMaskSection(null, msgs);
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION:
        return basicSetOptionListSection(null, msgs);
      case DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION:
        return basicSetOptionMaskSection(null, msgs);
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
      case DefinitionDSLPackage.DEFINITION__METHOD_NAME:
        return getMethodName();
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_METHOD:
        return getGuiLabelMethod();
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_PARENT:
        return getGuiLabelParent();
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_CHILD:
        return getGuiLabelChild();
      case DefinitionDSLPackage.DEFINITION__DATA:
        return getData();
      case DefinitionDSLPackage.DEFINITION__INIT_SECTION:
        return getInitSection();
      case DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION:
        return getTypeMaskSection();
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION:
        return getUnderlyingListSection();
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION:
        return getUnderlyingMaskSection();
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION:
        return getOptionListSection();
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_LABEL_SECTION:
        return getOptionListLabelSection();
      case DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION:
        return getOptionMaskSection();
      case DefinitionDSLPackage.DEFINITION__EVENTUELL_TCL_PROCEDURES:
        return getEventuellTclProcedures();
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
      case DefinitionDSLPackage.DEFINITION__METHOD_NAME:
        setMethodName((String)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_METHOD:
        setGuiLabelMethod((String)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_PARENT:
        setGuiLabelParent((String)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_CHILD:
        setGuiLabelChild((String)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__DATA:
        setData((Data)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__INIT_SECTION:
        setInitSection((InitSection)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION:
        setTypeMaskSection((TypeMaskSection)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION:
        setUnderlyingListSection((UnderlyingListSection)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION:
        setUnderlyingMaskSection((UnderlyingMaskSection)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION:
        setOptionListSection((OptionListSection)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_LABEL_SECTION:
        setOptionListLabelSection((String)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION:
        setOptionMaskSection((OptionMaskSection)newValue);
        return;
      case DefinitionDSLPackage.DEFINITION__EVENTUELL_TCL_PROCEDURES:
        getEventuellTclProcedures().clear();
        getEventuellTclProcedures().addAll((Collection<? extends String>)newValue);
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
      case DefinitionDSLPackage.DEFINITION__METHOD_NAME:
        setMethodName(METHOD_NAME_EDEFAULT);
        return;
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_METHOD:
        setGuiLabelMethod(GUI_LABEL_METHOD_EDEFAULT);
        return;
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_PARENT:
        setGuiLabelParent(GUI_LABEL_PARENT_EDEFAULT);
        return;
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_CHILD:
        setGuiLabelChild(GUI_LABEL_CHILD_EDEFAULT);
        return;
      case DefinitionDSLPackage.DEFINITION__DATA:
        setData((Data)null);
        return;
      case DefinitionDSLPackage.DEFINITION__INIT_SECTION:
        setInitSection((InitSection)null);
        return;
      case DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION:
        setTypeMaskSection((TypeMaskSection)null);
        return;
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION:
        setUnderlyingListSection((UnderlyingListSection)null);
        return;
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION:
        setUnderlyingMaskSection((UnderlyingMaskSection)null);
        return;
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION:
        setOptionListSection((OptionListSection)null);
        return;
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_LABEL_SECTION:
        setOptionListLabelSection(OPTION_LIST_LABEL_SECTION_EDEFAULT);
        return;
      case DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION:
        setOptionMaskSection((OptionMaskSection)null);
        return;
      case DefinitionDSLPackage.DEFINITION__EVENTUELL_TCL_PROCEDURES:
        getEventuellTclProcedures().clear();
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
      case DefinitionDSLPackage.DEFINITION__METHOD_NAME:
        return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_METHOD:
        return GUI_LABEL_METHOD_EDEFAULT == null ? guiLabelMethod != null : !GUI_LABEL_METHOD_EDEFAULT.equals(guiLabelMethod);
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_PARENT:
        return GUI_LABEL_PARENT_EDEFAULT == null ? guiLabelParent != null : !GUI_LABEL_PARENT_EDEFAULT.equals(guiLabelParent);
      case DefinitionDSLPackage.DEFINITION__GUI_LABEL_CHILD:
        return GUI_LABEL_CHILD_EDEFAULT == null ? guiLabelChild != null : !GUI_LABEL_CHILD_EDEFAULT.equals(guiLabelChild);
      case DefinitionDSLPackage.DEFINITION__DATA:
        return data != null;
      case DefinitionDSLPackage.DEFINITION__INIT_SECTION:
        return initSection != null;
      case DefinitionDSLPackage.DEFINITION__TYPE_MASK_SECTION:
        return typeMaskSection != null;
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_LIST_SECTION:
        return underlyingListSection != null;
      case DefinitionDSLPackage.DEFINITION__UNDERLYING_MASK_SECTION:
        return underlyingMaskSection != null;
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_SECTION:
        return optionListSection != null;
      case DefinitionDSLPackage.DEFINITION__OPTION_LIST_LABEL_SECTION:
        return OPTION_LIST_LABEL_SECTION_EDEFAULT == null ? optionListLabelSection != null : !OPTION_LIST_LABEL_SECTION_EDEFAULT.equals(optionListLabelSection);
      case DefinitionDSLPackage.DEFINITION__OPTION_MASK_SECTION:
        return optionMaskSection != null;
      case DefinitionDSLPackage.DEFINITION__EVENTUELL_TCL_PROCEDURES:
        return eventuellTclProcedures != null && !eventuellTclProcedures.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (methodName: ");
    result.append(methodName);
    result.append(", guiLabelMethod: ");
    result.append(guiLabelMethod);
    result.append(", guiLabelParent: ");
    result.append(guiLabelParent);
    result.append(", guiLabelChild: ");
    result.append(guiLabelChild);
    result.append(", optionListLabelSection: ");
    result.append(optionListLabelSection);
    result.append(", eventuellTclProcedures: ");
    result.append(eventuellTclProcedures);
    result.append(')');
    return result.toString();
  }

} //DefinitionImpl
