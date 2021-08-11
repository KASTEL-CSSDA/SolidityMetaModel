/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem;

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
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SoliditySystemPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "soliditysystem";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.kastel.kit.edu/SolidityMetaModel/soliditysystem";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "soliditysystem";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoliditySystemPackage eINSTANCE = edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SystemAssemblyImpl <em>System Assembly</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SystemAssemblyImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getSystemAssembly()
	 * @generated
	 */
	int SYSTEM_ASSEMBLY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ASSEMBLY__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ASSEMBLY__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ASSEMBLY__INSTANCES = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ASSEMBLY__CONNECTORS = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>System Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ASSEMBLY_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>System Assembly</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ASSEMBLY_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.InstanceImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONTRACT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PROVIDED_INTERFACES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__REQUIRED_INTERFACES = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ConnectorImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PROVIDED_INTERFACE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__REQUIRED_INTERFACE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ProvidedInterfaceImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getProvidedInterface()
	 * @generated
	 */
	int PROVIDED_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE__FUNCTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Provided Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_INTERFACE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.RequiredInterfaceImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getRequiredInterface()
	 * @generated
	 */
	int REQUIRED_INTERFACE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE__FUNCTION = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_INTERFACE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly <em>System Assembly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Assembly</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly
	 * @generated
	 */
	EClass getSystemAssembly();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly#getInstances()
	 * @see #getSystemAssembly()
	 * @generated
	 */
	EReference getSystemAssembly_Instances();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly#getConnectors()
	 * @see #getSystemAssembly()
	 * @generated
	 */
	EReference getSystemAssembly_Connectors();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getContract()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Contract();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getProvidedInterfaces <em>Provided Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provided Interfaces</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getProvidedInterfaces()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_ProvidedInterfaces();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getRequiredInterfaces <em>Required Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Interfaces</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getRequiredInterfaces()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_RequiredInterfaces();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Provided Interface</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getProvidedInterface()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_ProvidedInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getRequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Interface</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getRequiredInterface()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_RequiredInterface();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface <em>Provided Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Interface</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface
	 * @generated
	 */
	EClass getProvidedInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface#getFunction()
	 * @see #getProvidedInterface()
	 * @generated
	 */
	EReference getProvidedInterface_Function();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface <em>Required Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Interface</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface
	 * @generated
	 */
	EClass getRequiredInterface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface#getFunction()
	 * @see #getRequiredInterface()
	 * @generated
	 */
	EReference getRequiredInterface_Function();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SoliditySystemFactory getSoliditySystemFactory();

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
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SystemAssemblyImpl <em>System Assembly</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SystemAssemblyImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getSystemAssembly()
		 * @generated
		 */
		EClass SYSTEM_ASSEMBLY = eINSTANCE.getSystemAssembly();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ASSEMBLY__INSTANCES = eINSTANCE.getSystemAssembly_Instances();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ASSEMBLY__CONNECTORS = eINSTANCE.getSystemAssembly_Connectors();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.InstanceImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CONTRACT = eINSTANCE.getInstance_Contract();

		/**
		 * The meta object literal for the '<em><b>Provided Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__PROVIDED_INTERFACES = eINSTANCE.getInstance_ProvidedInterfaces();

		/**
		 * The meta object literal for the '<em><b>Required Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__REQUIRED_INTERFACES = eINSTANCE.getInstance_RequiredInterfaces();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ConnectorImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Provided Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PROVIDED_INTERFACE = eINSTANCE.getConnector_ProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Required Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__REQUIRED_INTERFACE = eINSTANCE.getConnector_RequiredInterface();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ProvidedInterfaceImpl <em>Provided Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ProvidedInterfaceImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getProvidedInterface()
		 * @generated
		 */
		EClass PROVIDED_INTERFACE = eINSTANCE.getProvidedInterface();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROVIDED_INTERFACE__FUNCTION = eINSTANCE.getProvidedInterface_Function();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.RequiredInterfaceImpl <em>Required Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.RequiredInterfaceImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl#getRequiredInterface()
		 * @generated
		 */
		EClass REQUIRED_INTERFACE = eINSTANCE.getRequiredInterface();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED_INTERFACE__FUNCTION = eINSTANCE.getRequiredInterface_Function();

	}

} //SoliditySystemPackage
