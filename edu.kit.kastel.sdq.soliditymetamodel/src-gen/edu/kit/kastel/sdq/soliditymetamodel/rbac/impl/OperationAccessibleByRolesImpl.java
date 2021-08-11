/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.Role;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Accessible By Roles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.OperationAccessibleByRolesImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.OperationAccessibleByRolesImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationAccessibleByRolesImpl extends MinimalEObjectImpl.Container implements OperationAccessibleByRoles {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationAccessibleByRolesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACPackage.Literals.OPERATION_ACCESSIBLE_BY_ROLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Role>(Role.class, this, RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__ROLES);
		}
		return roles;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__OPERATION, oldOperation, operation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__ROLES:
				return getRoles();
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__OPERATION:
				setOperation((GlobalFunction)newValue);
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
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__ROLES:
				getRoles().clear();
				return;
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__OPERATION:
				setOperation((GlobalFunction)null);
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
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__ROLES:
				return roles != null && !roles.isEmpty();
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES__OPERATION:
				return operation != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationAccessibleByRolesImpl
