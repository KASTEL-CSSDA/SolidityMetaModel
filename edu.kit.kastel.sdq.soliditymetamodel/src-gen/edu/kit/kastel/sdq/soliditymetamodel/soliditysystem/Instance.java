/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getContract <em>Contract</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProvidedInterfacesMustContainProvidedFunctionsFromContract RequiredInterfacesMustContainRequiredFunctionsFromContract'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ProvidedInterfacesMustContainProvidedFunctionsFromContract='contract.providedFunctions -&gt; includesAll(providedInterfaces-&gt;collect(function))' RequiredInterfacesMustContainRequiredFunctionsFromContract='contract.requiredFunctions -&gt; includesAll(requiredInterfaces-&gt;collect(function))'"
 * @generated
 */
public interface Instance extends Identifier {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Contract)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getInstance_Contract()
	 * @model required="true"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Instance#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Provided Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Interfaces</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getInstance_ProvidedInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProvidedInterface> getProvidedInterfaces();

	/**
	 * Returns the value of the '<em><b>Required Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Interfaces</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getInstance_RequiredInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequiredInterface> getRequiredInterfaces();

} // Instance
