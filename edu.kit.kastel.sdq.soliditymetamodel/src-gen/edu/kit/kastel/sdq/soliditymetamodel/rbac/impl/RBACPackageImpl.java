/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACFactory;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.Role;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.util.RBACValidator;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RBACPackageImpl extends EPackageImpl implements RBACPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAccessibleByRolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAccessibleByRolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControlRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessControllingOperationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RBACPackageImpl() {
		super(eNS_URI, RBACFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RBACPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RBACPackage init() {
		if (isInited) return (RBACPackage)EPackage.Registry.INSTANCE.getEPackage(RBACPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRBACPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RBACPackageImpl theRBACPackage = registeredRBACPackage instanceof RBACPackageImpl ? (RBACPackageImpl)registeredRBACPackage : new RBACPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SolidityContractsPackage.eNS_URI);
		SolidityContractsPackageImpl theSolidityContractsPackage = (SolidityContractsPackageImpl)(registeredPackage instanceof SolidityContractsPackageImpl ? registeredPackage : SolidityContractsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SoliditySystemPackage.eNS_URI);
		SoliditySystemPackageImpl theSoliditySystemPackage = (SoliditySystemPackageImpl)(registeredPackage instanceof SoliditySystemPackageImpl ? registeredPackage : SoliditySystemPackage.eINSTANCE);

		// Create package meta-data objects
		theRBACPackage.createPackageContents();
		theSolidityContractsPackage.createPackageContents();
		theSoliditySystemPackage.createPackageContents();

		// Initialize created meta-data
		theRBACPackage.initializePackageContents();
		theSolidityContractsPackage.initializePackageContents();
		theSoliditySystemPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRBACPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RBACValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRBACPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RBACPackage.eNS_URI, theRBACPackage);
		return theRBACPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationAccessibleByRoles() {
		return operationAccessibleByRolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationAccessibleByRoles_Roles() {
		return (EReference)operationAccessibleByRolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationAccessibleByRoles_Operation() {
		return (EReference)operationAccessibleByRolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableAccessibleByRoles() {
		return variableAccessibleByRolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAccessibleByRoles_Roles() {
		return (EReference)variableAccessibleByRolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableAccessibleByRoles_Variable() {
		return (EReference)variableAccessibleByRolesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControlRepository() {
		return accessControlRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlRepository_AccessibleOperationsByRole() {
		return (EReference)accessControlRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlRepository_AccessibleVariablesByRole() {
		return (EReference)accessControlRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlRepository_AccessOperationDef() {
		return (EReference)accessControlRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControlRepository_Roles() {
		return (EReference)accessControlRepositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessControllingOperation() {
		return accessControllingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControllingOperation_Operation() {
		return (EReference)accessControllingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControllingOperation_Identity() {
		return (EReference)accessControllingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessControllingOperation_RoleDetermining() {
		return (EReference)accessControllingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RBACFactory getRBACFactory() {
		return (RBACFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		roleEClass = createEClass(ROLE);

		operationAccessibleByRolesEClass = createEClass(OPERATION_ACCESSIBLE_BY_ROLES);
		createEReference(operationAccessibleByRolesEClass, OPERATION_ACCESSIBLE_BY_ROLES__ROLES);
		createEReference(operationAccessibleByRolesEClass, OPERATION_ACCESSIBLE_BY_ROLES__OPERATION);

		variableAccessibleByRolesEClass = createEClass(VARIABLE_ACCESSIBLE_BY_ROLES);
		createEReference(variableAccessibleByRolesEClass, VARIABLE_ACCESSIBLE_BY_ROLES__ROLES);
		createEReference(variableAccessibleByRolesEClass, VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE);

		accessControlRepositoryEClass = createEClass(ACCESS_CONTROL_REPOSITORY);
		createEReference(accessControlRepositoryEClass, ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE);
		createEReference(accessControlRepositoryEClass, ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE);
		createEReference(accessControlRepositoryEClass, ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF);
		createEReference(accessControlRepositoryEClass, ACCESS_CONTROL_REPOSITORY__ROLES);

		accessControllingOperationEClass = createEClass(ACCESS_CONTROLLING_OPERATION);
		createEReference(accessControllingOperationEClass, ACCESS_CONTROLLING_OPERATION__OPERATION);
		createEReference(accessControllingOperationEClass, ACCESS_CONTROLLING_OPERATION__IDENTITY);
		createEReference(accessControllingOperationEClass, ACCESS_CONTROLLING_OPERATION__ROLE_DETERMINING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		SolidityContractsPackage theSolidityContractsPackage = (SolidityContractsPackage)EPackage.Registry.INSTANCE.getEPackage(SolidityContractsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationAccessibleByRolesEClass, OperationAccessibleByRoles.class, "OperationAccessibleByRoles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationAccessibleByRoles_Roles(), this.getRole(), null, "roles", null, 0, -1, OperationAccessibleByRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationAccessibleByRoles_Operation(), theSolidityContractsPackage.getGlobalFunction(), null, "operation", null, 1, 1, OperationAccessibleByRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAccessibleByRolesEClass, VariableAccessibleByRoles.class, "VariableAccessibleByRoles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAccessibleByRoles_Roles(), this.getRole(), null, "roles", null, 0, -1, VariableAccessibleByRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAccessibleByRoles_Variable(), theSolidityContractsPackage.getStateVariable(), null, "variable", null, 1, 1, VariableAccessibleByRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControlRepositoryEClass, AccessControlRepository.class, "AccessControlRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControlRepository_AccessibleOperationsByRole(), this.getOperationAccessibleByRoles(), null, "accessibleOperationsByRole", null, 0, -1, AccessControlRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlRepository_AccessibleVariablesByRole(), this.getVariableAccessibleByRoles(), null, "accessibleVariablesByRole", null, 0, -1, AccessControlRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlRepository_AccessOperationDef(), this.getAccessControllingOperation(), null, "accessOperationDef", null, 1, 1, AccessControlRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControlRepository_Roles(), this.getRole(), null, "roles", null, 0, -1, AccessControlRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessControllingOperationEClass, AccessControllingOperation.class, "AccessControllingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessControllingOperation_Operation(), theSolidityContractsPackage.getGlobalFunction(), null, "operation", null, 1, 1, AccessControllingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControllingOperation_Identity(), theSolidityContractsPackage.getFunctionParameter(), null, "identity", null, 1, 1, AccessControllingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccessControllingOperation_RoleDetermining(), theSolidityContractsPackage.getFunctionParameter(), null, "roleDetermining", null, 0, 1, AccessControllingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (accessControlRepositoryEClass,
		   source,
		   new String[] {
			   "constraints", "RoleNamesMustBeUnique OperationAccessibleByRolesCanOnlyDefinedOncePerOperation VariableAccessibleByRolesCanOnlyDefinedOncePerVariable"
		   });
		addAnnotation
		  (accessControllingOperationEClass,
		   source,
		   new String[] {
			   "constraints", "IdentityParameterMustBelongToOperation RoleDeterminingParameterMustBelongToOperation"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (accessControlRepositoryEClass,
		   source,
		   new String[] {
			   "RoleNamesMustBeUnique", "roles -> isUnique(entityName)",
			   "OperationAccessibleByRolesCanOnlyDefinedOncePerOperation", "accessibleOperationsByRole -> isUnique(operation)",
			   "VariableAccessibleByRolesCanOnlyDefinedOncePerVariable", "accessibleVariablesByRole -> isUnique(variable)"
		   });
		addAnnotation
		  (accessControllingOperationEClass,
		   source,
		   new String[] {
			   "IdentityParameterMustBelongToOperation", "operation.parameters -> includes(identity)",
			   "RoleDeterminingParameterMustBelongToOperation", "operation.parameters -> includes(roleDetermining)"
		   });
	}

} //RBACPackageImpl
