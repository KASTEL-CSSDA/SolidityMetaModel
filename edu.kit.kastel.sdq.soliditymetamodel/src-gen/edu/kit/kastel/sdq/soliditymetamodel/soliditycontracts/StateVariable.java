/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import tools.mdsd.modelingfoundations.identifier.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getMutability <em>Mutability</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStateVariable()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ImmutableOnlyAllowedForValueTypes ConstantOnlyAllowedForValueTypesOrString DataLocationOfDefaultArrayMustBeStorage DataLocationOfCustomArrayMustBeStorage DataLocationOfMappingMustBeStorage DataLocationOfStructMustBeStorage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ImmutableOnlyAllowedForValueTypes='mutability = VariableMutability::immutable implies type.oclIsTypeOf(PrimitiveType) or type.oclIsTypeOf(ContractType) or type.oclIsTypeOf(Enum)' ConstantOnlyAllowedForValueTypesOrString='mutability = VariableMutability::immutable implies type.oclIsTypeOf(PrimitiveType) or type.oclIsTypeOf(ContractType) or type.oclIsTypeOf(Enum) or (type.oclIsTypeOf(DefaultArray) and type.oclAsType(DefaultArray).type = DefaultArrayEnum::string)' DataLocationOfDefaultArrayMustBeStorage='type.oclIsTypeOf(DefaultArray) implies type.oclAsType(DefaultArray).dataLocation = DataLocation::storage' DataLocationOfCustomArrayMustBeStorage='type.oclIsTypeOf(CustomArray) implies type.oclAsType(CustomArray).dataLocation = DataLocation::storage' DataLocationOfMappingMustBeStorage='type.oclIsTypeOf(Mapping) implies type.oclAsType(Mapping).dataLocation = DataLocation::storage' DataLocationOfStructMustBeStorage='type.oclIsTypeOf(Struct) implies type.oclAsType(Struct).dataLocation = DataLocation::storage'"
 * @generated
 */
public interface StateVariable extends Entity {
	/**
	 * Returns the value of the '<em><b>Mutability</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mutability</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability
	 * @see #setMutability(VariableMutability)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStateVariable_Mutability()
	 * @model
	 * @generated
	 */
	VariableMutability getMutability();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getMutability <em>Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mutability</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability
	 * @see #getMutability()
	 * @generated
	 */
	void setMutability(VariableMutability value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility
	 * @see #setVisibility(VariableVisibility)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStateVariable_Visibility()
	 * @model
	 * @generated
	 */
	VariableVisibility getVisibility();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VariableVisibility value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStateVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // StateVariable
