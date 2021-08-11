/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getProvidedFunctions <em>Provided Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getParents <em>Parents</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getLocalTypes <em>Local Types</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getRequiredFunctions <em>Required Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getLocalFunctions <em>Local Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getOverrideFunctions <em>Override Functions</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModifierNamesMustBeUnique StateVariableNamesMustBeUnique ContractCannotInheritFromItself ContractsReferencedInFunctionOverridesMustBeIncludedInParents ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents ContractMustContainOverrridingFunctions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModifierNamesMustBeUnique='self.modifiers -&gt; isUnique(entityName)' StateVariableNamesMustBeUnique='self.variables -&gt; isUnique(entityName)' ContractCannotInheritFromItself='parents-&gt;excludes(self)' ContractsReferencedInFunctionOverridesMustBeIncludedInParents='parents -&gt; includesAll(overrideFunctions -&gt; collect(baseContracts))' ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents='parents -&gt; includesAll(modifiers -&gt; collect(override))' ContractMustContainOverrridingFunctions='overrideFunctions -&gt; forAll(f|localFunctions -&gt; union(providedFunctions) -&gt; includes(f.overriding))'"
 * @generated
 */
public interface Contract extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateVariable> getVariables();

	/**
	 * Returns the value of the '<em><b>Provided Functions</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provided Functions</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_ProvidedFunctions()
	 * @model
	 * @generated
	 */
	EList<GlobalFunction> getProvidedFunctions();

	/**
	 * Returns the value of the '<em><b>Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constructor</em>' containment reference.
	 * @see #setConstructor(Constructor)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_Constructor()
	 * @model containment="true"
	 * @generated
	 */
	Constructor getConstructor();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getConstructor <em>Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constructor</em>' containment reference.
	 * @see #getConstructor()
	 * @generated
	 */
	void setConstructor(Constructor value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_Parents()
	 * @model
	 * @generated
	 */
	EList<Contract> getParents();

	/**
	 * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifiers</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_Modifiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modifier> getModifiers();

	/**
	 * Returns the value of the '<em><b>Local Types</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Types</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_LocalTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getLocalTypes();

	/**
	 * Returns the value of the '<em><b>Required Functions</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Functions</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_RequiredFunctions()
	 * @model
	 * @generated
	 */
	EList<GlobalFunction> getRequiredFunctions();

	/**
	 * Returns the value of the '<em><b>Local Functions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Functions</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_LocalFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<LocalFunction> getLocalFunctions();

	/**
	 * Returns the value of the '<em><b>Override Functions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Functions</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getContract_OverrideFunctions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OverrideFunction> getOverrideFunctions();

} // Contract
