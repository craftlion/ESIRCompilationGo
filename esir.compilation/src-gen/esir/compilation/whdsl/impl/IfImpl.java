/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl.impl;

import esir.compilation.whdsl.Commands;
import esir.compilation.whdsl.If;
import esir.compilation.whdsl.WhdslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.impl.IfImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link esir.compilation.whdsl.impl.IfImpl#getCmdsThen <em>Cmds Then</em>}</li>
 *   <li>{@link esir.compilation.whdsl.impl.IfImpl#getCmdsElse <em>Cmds Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends MinimalEObjectImpl.Container implements If
{
  /**
   * The default value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected static final String COND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected String cond = COND_EDEFAULT;

  /**
   * The cached value of the '{@link #getCmdsThen() <em>Cmds Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdsThen()
   * @generated
   * @ordered
   */
  protected Commands cmdsThen;

  /**
   * The cached value of the '{@link #getCmdsElse() <em>Cmds Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmdsElse()
   * @generated
   * @ordered
   */
  protected Commands cmdsElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfImpl()
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
    return WhdslPackage.Literals.IF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(String newCond)
  {
    String oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhdslPackage.IF__COND, oldCond, cond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmdsThen()
  {
    return cmdsThen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdsThen(Commands newCmdsThen, NotificationChain msgs)
  {
    Commands oldCmdsThen = cmdsThen;
    cmdsThen = newCmdsThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhdslPackage.IF__CMDS_THEN, oldCmdsThen, newCmdsThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdsThen(Commands newCmdsThen)
  {
    if (newCmdsThen != cmdsThen)
    {
      NotificationChain msgs = null;
      if (cmdsThen != null)
        msgs = ((InternalEObject)cmdsThen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.IF__CMDS_THEN, null, msgs);
      if (newCmdsThen != null)
        msgs = ((InternalEObject)newCmdsThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.IF__CMDS_THEN, null, msgs);
      msgs = basicSetCmdsThen(newCmdsThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhdslPackage.IF__CMDS_THEN, newCmdsThen, newCmdsThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands getCmdsElse()
  {
    return cmdsElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmdsElse(Commands newCmdsElse, NotificationChain msgs)
  {
    Commands oldCmdsElse = cmdsElse;
    cmdsElse = newCmdsElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WhdslPackage.IF__CMDS_ELSE, oldCmdsElse, newCmdsElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmdsElse(Commands newCmdsElse)
  {
    if (newCmdsElse != cmdsElse)
    {
      NotificationChain msgs = null;
      if (cmdsElse != null)
        msgs = ((InternalEObject)cmdsElse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.IF__CMDS_ELSE, null, msgs);
      if (newCmdsElse != null)
        msgs = ((InternalEObject)newCmdsElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WhdslPackage.IF__CMDS_ELSE, null, msgs);
      msgs = basicSetCmdsElse(newCmdsElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WhdslPackage.IF__CMDS_ELSE, newCmdsElse, newCmdsElse));
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
      case WhdslPackage.IF__CMDS_THEN:
        return basicSetCmdsThen(null, msgs);
      case WhdslPackage.IF__CMDS_ELSE:
        return basicSetCmdsElse(null, msgs);
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
      case WhdslPackage.IF__COND:
        return getCond();
      case WhdslPackage.IF__CMDS_THEN:
        return getCmdsThen();
      case WhdslPackage.IF__CMDS_ELSE:
        return getCmdsElse();
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
      case WhdslPackage.IF__COND:
        setCond((String)newValue);
        return;
      case WhdslPackage.IF__CMDS_THEN:
        setCmdsThen((Commands)newValue);
        return;
      case WhdslPackage.IF__CMDS_ELSE:
        setCmdsElse((Commands)newValue);
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
      case WhdslPackage.IF__COND:
        setCond(COND_EDEFAULT);
        return;
      case WhdslPackage.IF__CMDS_THEN:
        setCmdsThen((Commands)null);
        return;
      case WhdslPackage.IF__CMDS_ELSE:
        setCmdsElse((Commands)null);
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
      case WhdslPackage.IF__COND:
        return COND_EDEFAULT == null ? cond != null : !COND_EDEFAULT.equals(cond);
      case WhdslPackage.IF__CMDS_THEN:
        return cmdsThen != null;
      case WhdslPackage.IF__CMDS_ELSE:
        return cmdsElse != null;
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
    result.append(" (cond: ");
    result.append(cond);
    result.append(')');
    return result.toString();
  }

} //IfImpl
