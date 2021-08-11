/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem;

import tools.mdsd.modelingfoundations.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getRequiredInterface <em>Required Interface</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getConnector()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InterfacesMustMatch'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InterfacesMustMatch='providedInterface.function = requiredInterface.function'"
 * @generated
 */
public interface Connector extends Identifier {
	/**
	 * Returns the value of the '<em><b>Provided Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interface</em>' reference.
	 * @see #setProvidedInterface(ProvidedInterface)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getConnector_ProvidedInterface()
	 * @model required="true"
	 * @generated
	 */
	ProvidedInterface getProvidedInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getProvidedInterface <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provided Interface</em>' reference.
	 * @see #getProvidedInterface()
	 * @generated
	 */
	void setProvidedInterface(ProvidedInterface value);

	/**
	 * Returns the value of the '<em><b>Required Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interface</em>' reference.
	 * @see #setRequiredInterface(RequiredInterface)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getConnector_RequiredInterface()
	 * @model required="true"
	 * @generated
	 */
	RequiredInterface getRequiredInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector#getRequiredInterface <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Interface</em>' reference.
	 * @see #getRequiredInterface()
	 * @generated
	 */
	void setRequiredInterface(RequiredInterface value);

} // Connector
