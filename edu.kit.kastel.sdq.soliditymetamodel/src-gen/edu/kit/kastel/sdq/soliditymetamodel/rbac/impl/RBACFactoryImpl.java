/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RBACFactoryImpl extends EFactoryImpl implements RBACFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RBACFactory init() {
		try {
			RBACFactory theRBACFactory = (RBACFactory)EPackage.Registry.INSTANCE.getEFactory(RBACPackage.eNS_URI);
			if (theRBACFactory != null) {
				return theRBACFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RBACFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBACFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RBACPackage.ROLE: return createRole();
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES: return createOperationAccessibleByRoles();
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES: return createVariableAccessibleByRoles();
			case RBACPackage.ACCESS_CONTROL_REPOSITORY: return createAccessControlRepository();
			case RBACPackage.ACCESS_CONTROLLING_OPERATION: return createAccessControllingOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationAccessibleByRoles createOperationAccessibleByRoles() {
		OperationAccessibleByRolesImpl operationAccessibleByRoles = new OperationAccessibleByRolesImpl();
		return operationAccessibleByRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableAccessibleByRoles createVariableAccessibleByRoles() {
		VariableAccessibleByRolesImpl variableAccessibleByRoles = new VariableAccessibleByRolesImpl();
		return variableAccessibleByRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControlRepository createAccessControlRepository() {
		AccessControlRepositoryImpl accessControlRepository = new AccessControlRepositoryImpl();
		return accessControlRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControllingOperation createAccessControllingOperation() {
		AccessControllingOperationImpl accessControllingOperation = new AccessControllingOperationImpl();
		return accessControllingOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBACPackage getRBACPackage() {
		return (RBACPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RBACPackage getPackage() {
		return RBACPackage.eINSTANCE;
	}

} //RBACFactoryImpl
