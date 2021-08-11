/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Controlling Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl#getRoleDetermining <em>Role Determining</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControllingOperationImpl extends MinimalEObjectImpl.Container implements AccessControllingOperation {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected GlobalFunction operation;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter identity;

	/**
	 * The cached value of the '{@link #getRoleDetermining() <em>Role Determining</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleDetermining()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameter roleDetermining;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControllingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACPackage.Literals.ACCESS_CONTROLLING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalFunction getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (GlobalFunction)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBACPackage.ACCESS_CONTROLLING_OPERATION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalFunction basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(GlobalFunction newOperation) {
		GlobalFunction oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACPackage.ACCESS_CONTROLLING_OPERATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionParameter getIdentity() {
		if (identity != null && identity.eIsProxy()) {
			InternalEObject oldIdentity = (InternalEObject)identity;
			identity = (FunctionParameter)eResolveProxy(oldIdentity);
			if (identity != oldIdentity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBACPackage.ACCESS_CONTROLLING_OPERATION__IDENTITY, oldIdentity, identity));
			}
		}
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter basicGetIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentity(FunctionParameter newIdentity) {
		FunctionParameter oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACPackage.ACCESS_CONTROLLING_OPERATION__IDENTITY, oldIdentity, identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionParameter getRoleDetermining() {
		if (roleDetermining != null && roleDetermining.eIsProxy()) {
			InternalEObject oldRoleDetermining = (InternalEObject)roleDetermining;
			roleDetermining = (FunctionParameter)eResolveProxy(oldRoleDetermining);
			if (roleDetermining != oldRoleDetermining) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBACPackage.ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING, oldRoleDetermining, roleDetermining));
			}
		}
		return roleDetermining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter basicGetRoleDetermining() {
		return roleDetermining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoleDetermining(FunctionParameter newRoleDetermining) {
		FunctionParameter oldRoleDetermining = roleDetermining;
		roleDetermining = newRoleDetermining;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACPackage.ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING, oldRoleDetermining, roleDetermining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__IDENTITY:
				if (resolve) return getIdentity();
				return basicGetIdentity();
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING:
				if (resolve) return getRoleDetermining();
				return basicGetRoleDetermining();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__OPERATION:
				setOperation((GlobalFunction)newValue);
				return;
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__IDENTITY:
				setIdentity((FunctionParameter)newValue);
				return;
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING:
				setRoleDetermining((FunctionParameter)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__OPERATION:
				setOperation((GlobalFunction)null);
				return;
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__IDENTITY:
				setIdentity((FunctionParameter)null);
				return;
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING:
				setRoleDetermining((FunctionParameter)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__OPERATION:
				return operation != null;
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__IDENTITY:
				return identity != null;
			case RBACPackage.ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING:
				return roleDetermining != null;
		}
		return super.eIsSet(featureID);
	}

} //AccessControllingOperationImpl
