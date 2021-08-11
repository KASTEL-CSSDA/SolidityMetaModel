/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage
 * @generated
 */
public interface SoliditySystemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SoliditySystemFactory eINSTANCE = edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Assembly</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Assembly</em>'.
	 * @generated
	 */
	SystemAssembly createSystemAssembly();

	/**
	 * Returns a new object of class '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Provided Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Interface</em>'.
	 * @generated
	 */
	ProvidedInterface createProvidedInterface();

	/**
	 * Returns a new object of class '<em>Required Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Interface</em>'.
	 * @generated
	 */
	RequiredInterface createRequiredInterface();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SoliditySystemPackage getSoliditySystemPackage();

} //SoliditySystemFactory
