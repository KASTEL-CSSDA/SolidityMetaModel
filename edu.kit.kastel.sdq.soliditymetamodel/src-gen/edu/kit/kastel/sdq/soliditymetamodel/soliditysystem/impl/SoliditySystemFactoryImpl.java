/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.*;

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
public class SoliditySystemFactoryImpl extends EFactoryImpl implements SoliditySystemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SoliditySystemFactory init() {
		try {
			SoliditySystemFactory theSoliditySystemFactory = (SoliditySystemFactory)EPackage.Registry.INSTANCE.getEFactory(SoliditySystemPackage.eNS_URI);
			if (theSoliditySystemFactory != null) {
				return theSoliditySystemFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SoliditySystemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoliditySystemFactoryImpl() {
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
			case SoliditySystemPackage.SYSTEM_ASSEMBLY: return createSystemAssembly();
			case SoliditySystemPackage.INSTANCE: return createInstance();
			case SoliditySystemPackage.CONNECTOR: return createConnector();
			case SoliditySystemPackage.PROVIDED_INTERFACE: return createProvidedInterface();
			case SoliditySystemPackage.REQUIRED_INTERFACE: return createRequiredInterface();
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
	public SystemAssembly createSystemAssembly() {
		SystemAssemblyImpl systemAssembly = new SystemAssemblyImpl();
		return systemAssembly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedInterface createProvidedInterface() {
		ProvidedInterfaceImpl providedInterface = new ProvidedInterfaceImpl();
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredInterface createRequiredInterface() {
		RequiredInterfaceImpl requiredInterface = new RequiredInterfaceImpl();
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoliditySystemPackage getSoliditySystemPackage() {
		return (SoliditySystemPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SoliditySystemPackage getPackage() {
		return SoliditySystemPackage.eINSTANCE;
	}

} //SoliditySystemFactoryImpl
