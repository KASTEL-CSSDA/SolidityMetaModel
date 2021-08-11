/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SystemAssembly#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getSystemAssembly()
 * @model
 * @generated
 */
public interface SystemAssembly extends Entity {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getSystemAssembly_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getSystemAssembly_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connector> getConnectors();

} // SystemAssembly
