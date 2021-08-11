/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getMutability <em>Mutability</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getReturnTypes <em>Return Types</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getFunctionType()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ExternalFunctionTypeCannotUseMappingAsParameter ExternalFunctionTypeCannotUseMappingAsReturnVariable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ExternalFunctionTypeCannotUseMappingAsParameter='visibility = FunctionTypeVisibility::external implies parameterTypes -&gt; excludes(Mapping)' ExternalFunctionTypeCannotUseMappingAsReturnVariable='visibility = FunctionTypeVisibility::external implies returnTypes -&gt; excludes(Mapping)'"
 * @generated
 */
public interface FunctionType extends Type {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility
	 * @see #setVisibility(FunctionTypeVisibility)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getFunctionType_Visibility()
	 * @model
	 * @generated
	 */
	FunctionTypeVisibility getVisibility();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(FunctionTypeVisibility value);

	/**
	 * Returns the value of the '<em><b>Mutability</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutability</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability
	 * @see #setMutability(FunctionMutability)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getFunctionType_Mutability()
	 * @model
	 * @generated
	 */
	FunctionMutability getMutability();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getMutability <em>Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutability</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability
	 * @see #getMutability()
	 * @generated
	 */
	void setMutability(FunctionMutability value);

	/**
	 * Returns the value of the '<em><b>Parameter Types</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Types</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getFunctionType_ParameterTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getParameterTypes();

	/**
	 * Returns the value of the '<em><b>Return Types</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Types</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getFunctionType_ReturnTypes()
	 * @model
	 * @generated
	 */
	EList<Type> getReturnTypes();

} // FunctionType
