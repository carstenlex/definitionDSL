/**
 * generated by Xtext 2.9.2
 */
package ch.raiffeisen.ipricer.definition.definitionDSL.impl;

import ch.raiffeisen.ipricer.definition.definitionDSL.DefinitionDSLPackage;
import ch.raiffeisen.ipricer.definition.definitionDSL.UnderlyingListDefintion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underlying List Defintion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.UnderlyingListDefintionImpl#getId <em>Id</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.UnderlyingListDefintionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link ch.raiffeisen.ipricer.definition.definitionDSL.impl.UnderlyingListDefintionImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderlyingListDefintionImpl extends MinimalEObjectImpl.Container implements UnderlyingListDefintion
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnderlyingListDefintionImpl()
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
    return DefinitionDSLPackage.Literals.UNDERLYING_LIST_DEFINTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__TITLE, oldTitle, title));
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
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__ID:
        return getId();
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__WIDTH:
        return getWidth();
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__TITLE:
        return getTitle();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__ID:
        setId((String)newValue);
        return;
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__WIDTH:
        setWidth((Integer)newValue);
        return;
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__TITLE:
        setTitle((String)newValue);
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
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__ID:
        setId(ID_EDEFAULT);
        return;
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__TITLE:
        setTitle(TITLE_EDEFAULT);
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
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__WIDTH:
        return width != WIDTH_EDEFAULT;
      case DefinitionDSLPackage.UNDERLYING_LIST_DEFINTION__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", width: ");
    result.append(width);
    result.append(", title: ");
    result.append(title);
    result.append(')');
    return result.toString();
  }

} //UnderlyingListDefintionImpl
