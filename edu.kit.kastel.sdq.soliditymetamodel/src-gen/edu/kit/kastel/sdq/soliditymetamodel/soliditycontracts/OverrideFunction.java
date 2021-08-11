/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Override Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBase <em>Base</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBaseContracts <em>Base Contracts</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getOverrideFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BaseFunctionCannotBePrivate OverridingFunctionCannotBePrivate BaseFunctionMustBeIncludedInBaseContract BaseAndOverridingFunctionMustHaveSameName BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes LocalFunctionsCanOnlyBeOverriddenByLocalFunctions GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions OverridingVisibilityOnlyFromExternalToPublicAllowed OverrideMutabilityOnlyFromDefaultToViewToPureAllowed'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot BaseFunctionCannotBePrivate='base.oclIsTypeOf(LocalFunction) implies base.oclAsType(LocalFunction).visibility &lt;&gt; LocalFunctionVisibility::private' OverridingFunctionCannotBePrivate='overriding.oclIsTypeOf(LocalFunction) implies overriding.oclAsType(LocalFunction).visibility &lt;&gt; LocalFunctionVisibility::private' BaseFunctionMustBeIncludedInBaseContract='baseContracts -&gt; forAll(c| c.localFunctions -&gt; union(c.providedFunctions) -&gt; includes(base))' BaseAndOverridingFunctionMustHaveSameName='base.entityName = overriding.entityName' BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes='Sequence{1..base.parameters -&gt; size()} -&gt; forAll(i| base.parameters -&gt; at(i) -&gt; collect(name) = overriding.parameters -&gt; at(i) -&gt; collect(name) and base.parameters -&gt; at(i) -&gt; collect(type) = overriding.parameters -&gt; at(i) -&gt; collect(type))' LocalFunctionsCanOnlyBeOverriddenByLocalFunctions='base.oclIsTypeOf(LocalFunction) implies overriding.oclIsTypeOf(LocalFunction)' GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions='base.oclIsTypeOf(GlobalFunction) implies overriding.oclIsTypeOf(GlobalFunction)' OverridingVisibilityOnlyFromExternalToPublicAllowed='(base.oclIsTypeOf(GlobalFunction) and overriding.oclIsTypeOf(GlobalFunction)) implies base.oclAsType(GlobalFunction).visibility = overriding.oclAsType(GlobalFunction).visibility or (base.oclAsType(GlobalFunction).visibility = GlobalFunctionVisibility::external and overriding.oclAsType(GlobalFunction).visibility = GlobalFunctionVisibility::public)' OverrideMutabilityOnlyFromDefaultToViewToPureAllowed='base.mutability = overriding.mutability or (base.mutability = FunctionMutability::default and (overriding.mutability = FunctionMutability::view or overriding.mutability = FunctionMutability::pure) or (base.mutability = FunctionMutability::view and overriding.mutability = FunctionMutability::pure))'"
 * @generated
 */
public interface OverrideFunction extends Identifier {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Function)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getOverrideFunction_Base()
	 * @model required="true"
	 * @generated
	 */
	Function getBase();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Function value);

	/**
	 * Returns the value of the '<em><b>Overriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overriding</em>' reference.
	 * @see #setOverriding(Function)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getOverrideFunction_Overriding()
	 * @model required="true"
	 * @generated
	 */
	Function getOverriding();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getOverriding <em>Overriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overriding</em>' reference.
	 * @see #getOverriding()
	 * @generated
	 */
	void setOverriding(Function value);

	/**
	 * Returns the value of the '<em><b>Base Contracts</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Contracts</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getOverrideFunction_BaseContracts()
	 * @model required="true"
	 * @generated
	 */
	EList<Contract> getBaseContracts();

} // OverrideFunction
