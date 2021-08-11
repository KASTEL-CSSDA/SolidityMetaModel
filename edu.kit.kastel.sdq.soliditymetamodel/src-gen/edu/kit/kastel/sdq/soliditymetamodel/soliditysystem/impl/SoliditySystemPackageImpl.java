/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemFactory;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.util.SoliditySystemValidator;

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
public class SoliditySystemPackageImpl extends EPackageImpl implements SoliditySystemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemAssemblyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredInterfaceEClass = null;

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
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SoliditySystemPackageImpl() {
		super(eNS_URI, SoliditySystemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SoliditySystemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SoliditySystemPackage init() {
		if (isInited) return (SoliditySystemPackage)EPackage.Registry.INSTANCE.getEPackage(SoliditySystemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSoliditySystemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SoliditySystemPackageImpl theSoliditySystemPackage = registeredSoliditySystemPackage instanceof SoliditySystemPackageImpl ? (SoliditySystemPackageImpl)registeredSoliditySystemPackage : new SoliditySystemPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RBACPackage.eNS_URI);
		RBACPackageImpl theRBACPackage = (RBACPackageImpl)(registeredPackage instanceof RBACPackageImpl ? registeredPackage : RBACPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SolidityContractsPackage.eNS_URI);
		SolidityContractsPackageImpl theSolidityContractsPackage = (SolidityContractsPackageImpl)(registeredPackage instanceof SolidityContractsPackageImpl ? registeredPackage : SolidityContractsPackage.eINSTANCE);

		// Create package meta-data objects
		theSoliditySystemPackage.createPackageContents();
		theRBACPackage.createPackageContents();
		theSolidityContractsPackage.createPackageContents();

		// Initialize created meta-data
		theSoliditySystemPackage.initializePackageContents();
		theRBACPackage.initializePackageContents();
		theSolidityContractsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSoliditySystemPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return SoliditySystemValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSoliditySystemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SoliditySystemPackage.eNS_URI, theSoliditySystemPackage);
		return theSoliditySystemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemAssembly() {
		return systemAssemblyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemAssembly_Instances() {
		return (EReference)systemAssemblyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemAssembly_Connectors() {
		return (EReference)systemAssemblyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstance_Contract() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstance_ProvidedInterfaces() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInstance_RequiredInterfaces() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_ProvidedInterface() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnector_RequiredInterface() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedInterface() {
		return providedInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProvidedInterface_Function() {
		return (EReference)providedInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredInterface() {
		return requiredInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequiredInterface_Function() {
		return (EReference)requiredInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoliditySystemFactory getSoliditySystemFactory() {
		return (SoliditySystemFactory)getEFactoryInstance();
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
		systemAssemblyEClass = createEClass(SYSTEM_ASSEMBLY);
		createEReference(systemAssemblyEClass, SYSTEM_ASSEMBLY__INSTANCES);
		createEReference(systemAssemblyEClass, SYSTEM_ASSEMBLY__CONNECTORS);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__CONTRACT);
		createEReference(instanceEClass, INSTANCE__PROVIDED_INTERFACES);
		createEReference(instanceEClass, INSTANCE__REQUIRED_INTERFACES);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__PROVIDED_INTERFACE);
		createEReference(connectorEClass, CONNECTOR__REQUIRED_INTERFACE);

		providedInterfaceEClass = createEClass(PROVIDED_INTERFACE);
		createEReference(providedInterfaceEClass, PROVIDED_INTERFACE__FUNCTION);

		requiredInterfaceEClass = createEClass(REQUIRED_INTERFACE);
		createEReference(requiredInterfaceEClass, REQUIRED_INTERFACE__FUNCTION);
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
		systemAssemblyEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		instanceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		connectorEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		providedInterfaceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		requiredInterfaceEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemAssemblyEClass, SystemAssembly.class, "SystemAssembly", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemAssembly_Instances(), this.getInstance(), null, "instances", null, 0, -1, SystemAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemAssembly_Connectors(), this.getConnector(), null, "connectors", null, 0, -1, SystemAssembly.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Contract(), theSolidityContractsPackage.getContract(), null, "contract", null, 1, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_ProvidedInterfaces(), this.getProvidedInterface(), null, "providedInterfaces", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstance_RequiredInterfaces(), this.getRequiredInterface(), null, "requiredInterfaces", null, 0, -1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_ProvidedInterface(), this.getProvidedInterface(), null, "providedInterface", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_RequiredInterface(), this.getRequiredInterface(), null, "requiredInterface", null, 1, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(providedInterfaceEClass, ProvidedInterface.class, "ProvidedInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvidedInterface_Function(), theSolidityContractsPackage.getGlobalFunction(), null, "function", null, 1, 1, ProvidedInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requiredInterfaceEClass, RequiredInterface.class, "RequiredInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequiredInterface_Function(), theSolidityContractsPackage.getGlobalFunction(), null, "function", null, 1, 1, RequiredInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (instanceEClass,
		   source,
		   new String[] {
			   "constraints", "ProvidedInterfacesMustContainProvidedFunctionsFromContract RequiredInterfacesMustContainRequiredFunctionsFromContract"
		   });
		addAnnotation
		  (connectorEClass,
		   source,
		   new String[] {
			   "constraints", "InterfacesMustMatch"
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
		  (instanceEClass,
		   source,
		   new String[] {
			   "ProvidedInterfacesMustContainProvidedFunctionsFromContract", "contract.providedFunctions -> includesAll(providedInterfaces->collect(function))",
			   "RequiredInterfacesMustContainRequiredFunctionsFromContract", "contract.requiredFunctions -> includesAll(requiredInterfaces->collect(function))"
		   });
		addAnnotation
		  (connectorEClass,
		   source,
		   new String[] {
			   "InterfacesMustMatch", "providedInterface.function = requiredInterface.function"
		   });
	}

} //SoliditySystemPackageImpl
