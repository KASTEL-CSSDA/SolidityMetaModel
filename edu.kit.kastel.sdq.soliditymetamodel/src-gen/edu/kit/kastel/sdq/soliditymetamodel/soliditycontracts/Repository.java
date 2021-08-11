/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getContracts <em>Contracts</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getGlobalFunctions <em>Global Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getGlobalTypes <em>Global Types</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getRepository()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ContractNameMustBeUnique GlobalFunctionsMustBePublicOrExternal GlobalFunctionCanOnlyUseGlobalTypes LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ContractNameMustBeUnique='contracts -&gt; isUnique(entityName)' GlobalFunctionsMustBePublicOrExternal='globalFunctions -&gt; collect(visibility) -&gt; excludesAll(Set{LocalFunctionVisibility::private, LocalFunctionVisibility::internal})' GlobalFunctionCanOnlyUseGlobalTypes='globalTypes -&gt; includesAll(globalFunctions -&gt; collect(returnVariables) -&gt; collect(type) -&gt; union(globalFunctions -&gt; collect(parameters) -&gt; collect(type)))' LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes='contracts -&gt; forAll(c|c.localTypes -&gt; union(globalTypes) -&gt; includesAll(c.localFunctions -&gt; collect(parameters) -&gt; collect(type) -&gt; union(c.localFunctions -&gt; collect(returnVariables) -&gt; collect(type))))' VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes='contracts -&gt; forAll(c|c.localTypes -&gt; union(globalTypes) -&gt; includesAll(c.variables -&gt; collect(type)))' EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes='contracts -&gt; forAll(c|c.localTypes -&gt; union(globalTypes) -&gt; includesAll(c.events -&gt; collect(parameters) -&gt; collect(type)))' ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes='contracts -&gt; forAll(c|c.localTypes -&gt; union(globalTypes) -&gt; includesAll(c.modifiers -&gt; collect(parameters) -&gt; collect(type)))'"
 * @generated
 */
public interface Repository extends EObject {
	/**
	 * Returns the value of the '<em><b>Contracts</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contracts</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getRepository_Contracts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContracts();

	/**
	 * Returns the value of the '<em><b>Global Functions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Functions</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getRepository_GlobalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalFunction> getGlobalFunctions();

	/**
	 * Returns the value of the '<em><b>Global Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Types</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getRepository_GlobalTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getGlobalTypes();

} // Repository
