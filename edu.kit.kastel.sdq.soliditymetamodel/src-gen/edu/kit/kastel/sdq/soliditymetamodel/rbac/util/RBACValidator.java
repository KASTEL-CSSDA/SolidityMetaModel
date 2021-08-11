/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.util;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage
 * @generated
 */
public class RBACValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RBACValidator INSTANCE = new RBACValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.kastel.sdq.soliditymetamodel.rbac";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RBACValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RBACPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RBACPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case RBACPackage.OPERATION_ACCESSIBLE_BY_ROLES:
				return validateOperationAccessibleByRoles((OperationAccessibleByRoles)value, diagnostics, context);
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES:
				return validateVariableAccessibleByRoles((VariableAccessibleByRoles)value, diagnostics, context);
			case RBACPackage.ACCESS_CONTROL_REPOSITORY:
				return validateAccessControlRepository((AccessControlRepository)value, diagnostics, context);
			case RBACPackage.ACCESS_CONTROLLING_OPERATION:
				return validateAccessControllingOperation((AccessControllingOperation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(role, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperationAccessibleByRoles(OperationAccessibleByRoles operationAccessibleByRoles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operationAccessibleByRoles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableAccessibleByRoles(VariableAccessibleByRoles variableAccessibleByRoles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variableAccessibleByRoles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlRepository(AccessControlRepository accessControlRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessControlRepository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessControlRepository_RoleNamesMustBeUnique(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessControlRepository_OperationAccessibleByRolesCanOnlyDefinedOncePerOperation(accessControlRepository, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessControlRepository_VariableAccessibleByRolesCanOnlyDefinedOncePerVariable(accessControlRepository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the RoleNamesMustBeUnique constraint of '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCESS_CONTROL_REPOSITORY__ROLE_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "roles -> isUnique(entityName)";

	/**
	 * Validates the RoleNamesMustBeUnique constraint of '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlRepository_RoleNamesMustBeUnique(AccessControlRepository accessControlRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RBACPackage.Literals.ACCESS_CONTROL_REPOSITORY,
				 accessControlRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RoleNamesMustBeUnique",
				 ACCESS_CONTROL_REPOSITORY__ROLE_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OperationAccessibleByRolesCanOnlyDefinedOncePerOperation constraint of '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCESS_CONTROL_REPOSITORY__OPERATION_ACCESSIBLE_BY_ROLES_CAN_ONLY_DEFINED_ONCE_PER_OPERATION__EEXPRESSION = "accessibleOperationsByRole -> isUnique(operation)";

	/**
	 * Validates the OperationAccessibleByRolesCanOnlyDefinedOncePerOperation constraint of '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlRepository_OperationAccessibleByRolesCanOnlyDefinedOncePerOperation(AccessControlRepository accessControlRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RBACPackage.Literals.ACCESS_CONTROL_REPOSITORY,
				 accessControlRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OperationAccessibleByRolesCanOnlyDefinedOncePerOperation",
				 ACCESS_CONTROL_REPOSITORY__OPERATION_ACCESSIBLE_BY_ROLES_CAN_ONLY_DEFINED_ONCE_PER_OPERATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the VariableAccessibleByRolesCanOnlyDefinedOncePerVariable constraint of '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCESS_CONTROL_REPOSITORY__VARIABLE_ACCESSIBLE_BY_ROLES_CAN_ONLY_DEFINED_ONCE_PER_VARIABLE__EEXPRESSION = "accessibleVariablesByRole -> isUnique(variable)";

	/**
	 * Validates the VariableAccessibleByRolesCanOnlyDefinedOncePerVariable constraint of '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControlRepository_VariableAccessibleByRolesCanOnlyDefinedOncePerVariable(AccessControlRepository accessControlRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RBACPackage.Literals.ACCESS_CONTROL_REPOSITORY,
				 accessControlRepository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "VariableAccessibleByRolesCanOnlyDefinedOncePerVariable",
				 ACCESS_CONTROL_REPOSITORY__VARIABLE_ACCESSIBLE_BY_ROLES_CAN_ONLY_DEFINED_ONCE_PER_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControllingOperation(AccessControllingOperation accessControllingOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessControllingOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessControllingOperation_IdentityParameterMustBelongToOperation(accessControllingOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessControllingOperation_RoleDeterminingParameterMustBelongToOperation(accessControllingOperation, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the IdentityParameterMustBelongToOperation constraint of '<em>Access Controlling Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCESS_CONTROLLING_OPERATION__IDENTITY_PARAMETER_MUST_BELONG_TO_OPERATION__EEXPRESSION = "operation.parameters -> includes(identity)";

	/**
	 * Validates the IdentityParameterMustBelongToOperation constraint of '<em>Access Controlling Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControllingOperation_IdentityParameterMustBelongToOperation(AccessControllingOperation accessControllingOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RBACPackage.Literals.ACCESS_CONTROLLING_OPERATION,
				 accessControllingOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdentityParameterMustBelongToOperation",
				 ACCESS_CONTROLLING_OPERATION__IDENTITY_PARAMETER_MUST_BELONG_TO_OPERATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RoleDeterminingParameterMustBelongToOperation constraint of '<em>Access Controlling Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING_PARAMETER_MUST_BELONG_TO_OPERATION__EEXPRESSION = "operation.parameters -> includes(roleDetermining)";

	/**
	 * Validates the RoleDeterminingParameterMustBelongToOperation constraint of '<em>Access Controlling Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessControllingOperation_RoleDeterminingParameterMustBelongToOperation(AccessControllingOperation accessControllingOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RBACPackage.Literals.ACCESS_CONTROLLING_OPERATION,
				 accessControllingOperation,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RoleDeterminingParameterMustBelongToOperation",
				 ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING_PARAMETER_MUST_BELONG_TO_OPERATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RBACValidator
