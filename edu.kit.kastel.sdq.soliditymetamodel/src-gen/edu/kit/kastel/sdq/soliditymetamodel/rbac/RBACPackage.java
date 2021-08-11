/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RBACPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rbac";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.kastel.kit.edu/SolidityMetaModel/rbac";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rbac";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBACPackage eINSTANCE = edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RoleImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ENTITY_NAME = IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = IdentifierPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.OperationAccessibleByRolesImpl <em>Operation Accessible By Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.OperationAccessibleByRolesImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getOperationAccessibleByRoles()
	 * @generated
	 */
	int OPERATION_ACCESSIBLE_BY_ROLES = 1;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACCESSIBLE_BY_ROLES__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACCESSIBLE_BY_ROLES__OPERATION = 1;

	/**
	 * The number of structural features of the '<em>Operation Accessible By Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACCESSIBLE_BY_ROLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Operation Accessible By Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_ACCESSIBLE_BY_ROLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.VariableAccessibleByRolesImpl <em>Variable Accessible By Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.VariableAccessibleByRolesImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getVariableAccessibleByRoles()
	 * @generated
	 */
	int VARIABLE_ACCESSIBLE_BY_ROLES = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESSIBLE_BY_ROLES__ROLES = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE = 1;

	/**
	 * The number of structural features of the '<em>Variable Accessible By Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESSIBLE_BY_ROLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Accessible By Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_ACCESSIBLE_BY_ROLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl <em>Access Control Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getAccessControlRepository()
	 * @generated
	 */
	int ACCESS_CONTROL_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Accessible Operations By Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE = 0;

	/**
	 * The feature id for the '<em><b>Accessible Variables By Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE = 1;

	/**
	 * The feature id for the '<em><b>Access Operation Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_REPOSITORY__ROLES = 3;

	/**
	 * The number of structural features of the '<em>Access Control Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Access Control Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROL_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl <em>Access Controlling Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getAccessControllingOperation()
	 * @generated
	 */
	int ACCESS_CONTROLLING_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLING_OPERATION__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLING_OPERATION__IDENTITY = 1;

	/**
	 * The feature id for the '<em><b>Role Determining</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING = 2;

	/**
	 * The number of structural features of the '<em>Access Controlling Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLING_OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Access Controlling Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CONTROLLING_OPERATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles <em>Operation Accessible By Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Accessible By Roles</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles
	 * @generated
	 */
	EClass getOperationAccessibleByRoles();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getRoles()
	 * @see #getOperationAccessibleByRoles()
	 * @generated
	 */
	EReference getOperationAccessibleByRoles_Roles();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getOperation()
	 * @see #getOperationAccessibleByRoles()
	 * @generated
	 */
	EReference getOperationAccessibleByRoles_Operation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles <em>Variable Accessible By Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Accessible By Roles</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles
	 * @generated
	 */
	EClass getVariableAccessibleByRoles();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getRoles()
	 * @see #getVariableAccessibleByRoles()
	 * @generated
	 */
	EReference getVariableAccessibleByRoles_Roles();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getVariable()
	 * @see #getVariableAccessibleByRoles()
	 * @generated
	 */
	EReference getVariableAccessibleByRoles_Variable();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository <em>Access Control Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Control Repository</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository
	 * @generated
	 */
	EClass getAccessControlRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessibleOperationsByRole <em>Accessible Operations By Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accessible Operations By Role</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessibleOperationsByRole()
	 * @see #getAccessControlRepository()
	 * @generated
	 */
	EReference getAccessControlRepository_AccessibleOperationsByRole();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessibleVariablesByRole <em>Accessible Variables By Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accessible Variables By Role</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessibleVariablesByRole()
	 * @see #getAccessControlRepository()
	 * @generated
	 */
	EReference getAccessControlRepository_AccessibleVariablesByRole();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessOperationDef <em>Access Operation Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Access Operation Def</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessOperationDef()
	 * @see #getAccessControlRepository()
	 * @generated
	 */
	EReference getAccessControlRepository_AccessOperationDef();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getRoles()
	 * @see #getAccessControlRepository()
	 * @generated
	 */
	EReference getAccessControlRepository_Roles();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation <em>Access Controlling Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Controlling Operation</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation
	 * @generated
	 */
	EClass getAccessControllingOperation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getOperation()
	 * @see #getAccessControllingOperation()
	 * @generated
	 */
	EReference getAccessControllingOperation_Operation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Identity</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getIdentity()
	 * @see #getAccessControllingOperation()
	 * @generated
	 */
	EReference getAccessControllingOperation_Identity();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getRoleDetermining <em>Role Determining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role Determining</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getRoleDetermining()
	 * @see #getAccessControllingOperation()
	 * @generated
	 */
	EReference getAccessControllingOperation_RoleDetermining();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RBACFactory getRBACFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RoleImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.OperationAccessibleByRolesImpl <em>Operation Accessible By Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.OperationAccessibleByRolesImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getOperationAccessibleByRoles()
		 * @generated
		 */
		EClass OPERATION_ACCESSIBLE_BY_ROLES = eINSTANCE.getOperationAccessibleByRoles();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ACCESSIBLE_BY_ROLES__ROLES = eINSTANCE.getOperationAccessibleByRoles_Roles();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_ACCESSIBLE_BY_ROLES__OPERATION = eINSTANCE.getOperationAccessibleByRoles_Operation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.VariableAccessibleByRolesImpl <em>Variable Accessible By Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.VariableAccessibleByRolesImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getVariableAccessibleByRoles()
		 * @generated
		 */
		EClass VARIABLE_ACCESSIBLE_BY_ROLES = eINSTANCE.getVariableAccessibleByRoles();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESSIBLE_BY_ROLES__ROLES = eINSTANCE.getVariableAccessibleByRoles_Roles();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE = eINSTANCE.getVariableAccessibleByRoles_Variable();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl <em>Access Control Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getAccessControlRepository()
		 * @generated
		 */
		EClass ACCESS_CONTROL_REPOSITORY = eINSTANCE.getAccessControlRepository();

		/**
		 * The meta object literal for the '<em><b>Accessible Operations By Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE = eINSTANCE.getAccessControlRepository_AccessibleOperationsByRole();

		/**
		 * The meta object literal for the '<em><b>Accessible Variables By Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE = eINSTANCE.getAccessControlRepository_AccessibleVariablesByRole();

		/**
		 * The meta object literal for the '<em><b>Access Operation Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF = eINSTANCE.getAccessControlRepository_AccessOperationDef();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROL_REPOSITORY__ROLES = eINSTANCE.getAccessControlRepository_Roles();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl <em>Access Controlling Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControllingOperationImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl#getAccessControllingOperation()
		 * @generated
		 */
		EClass ACCESS_CONTROLLING_OPERATION = eINSTANCE.getAccessControllingOperation();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROLLING_OPERATION__OPERATION = eINSTANCE.getAccessControllingOperation_Operation();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROLLING_OPERATION__IDENTITY = eINSTANCE.getAccessControllingOperation_Identity();

		/**
		 * The meta object literal for the '<em><b>Role Determining</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING = eINSTANCE.getAccessControllingOperation_RoleDetermining();

	}

} //RBACPackage
