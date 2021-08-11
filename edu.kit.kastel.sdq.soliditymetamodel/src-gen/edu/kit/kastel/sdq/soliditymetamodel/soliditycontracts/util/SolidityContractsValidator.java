/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.util;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ContractType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EnumMember;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tools.mdsd.modelingfoundations.identifier.util.IdentifierValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage
 * @generated
 */
public class SolidityContractsValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SolidityContractsValidator INSTANCE = new SolidityContractsValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierValidator identifierValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidityContractsValidator() {
		super();
		identifierValidator = IdentifierValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SolidityContractsPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SolidityContractsPackage.EVENT_PARAMETER:
				return validateEventParameter((EventParameter)value, diagnostics, context);
			case SolidityContractsPackage.CUSTOM_ARRAY:
				return validateCustomArray((CustomArray)value, diagnostics, context);
			case SolidityContractsPackage.MODIFIER_PARAMETER:
				return validateModifierParameter((ModifierParameter)value, diagnostics, context);
			case SolidityContractsPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case SolidityContractsPackage.STATE_VARIABLE:
				return validateStateVariable((StateVariable)value, diagnostics, context);
			case SolidityContractsPackage.FUNCTION:
				return validateFunction((Function)value, diagnostics, context);
			case SolidityContractsPackage.ENUM:
				return validateEnum((edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum)value, diagnostics, context);
			case SolidityContractsPackage.EVENT:
				return validateEvent((Event)value, diagnostics, context);
			case SolidityContractsPackage.ENUM_MEMBER:
				return validateEnumMember((EnumMember)value, diagnostics, context);
			case SolidityContractsPackage.MAPPING:
				return validateMapping((Mapping)value, diagnostics, context);
			case SolidityContractsPackage.MODIFIER:
				return validateModifier((Modifier)value, diagnostics, context);
			case SolidityContractsPackage.MAPPING_KEY_TYPE:
				return validateMappingKeyType((MappingKeyType)value, diagnostics, context);
			case SolidityContractsPackage.STRUCT_MEMBER:
				return validateStructMember((StructMember)value, diagnostics, context);
			case SolidityContractsPackage.REPOSITORY:
				return validateRepository((Repository)value, diagnostics, context);
			case SolidityContractsPackage.CONSTRUCTOR:
				return validateConstructor((Constructor)value, diagnostics, context);
			case SolidityContractsPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case SolidityContractsPackage.RETURN_VARIABLE:
				return validateReturnVariable((ReturnVariable)value, diagnostics, context);
			case SolidityContractsPackage.STRUCT:
				return validateStruct((Struct)value, diagnostics, context);
			case SolidityContractsPackage.CONTRACT:
				return validateContract((Contract)value, diagnostics, context);
			case SolidityContractsPackage.FUNCTION_PARAMETER:
				return validateFunctionParameter((FunctionParameter)value, diagnostics, context);
			case SolidityContractsPackage.CONSTRUCTOR_PARAMETER:
				return validateConstructorParameter((ConstructorParameter)value, diagnostics, context);
			case SolidityContractsPackage.DEFAULT_ARRAY:
				return validateDefaultArray((DefaultArray)value, diagnostics, context);
			case SolidityContractsPackage.FUNCTION_TYPE:
				return validateFunctionType((FunctionType)value, diagnostics, context);
			case SolidityContractsPackage.CONTRACT_TYPE:
				return validateContractType((ContractType)value, diagnostics, context);
			case SolidityContractsPackage.OVERRIDE_FUNCTION:
				return validateOverrideFunction((OverrideFunction)value, diagnostics, context);
			case SolidityContractsPackage.LOCAL_FUNCTION:
				return validateLocalFunction((LocalFunction)value, diagnostics, context);
			case SolidityContractsPackage.GLOBAL_FUNCTION:
				return validateGlobalFunction((GlobalFunction)value, diagnostics, context);
			case SolidityContractsPackage.VARIABLE_VISIBILITY:
				return validateVariableVisibility((VariableVisibility)value, diagnostics, context);
			case SolidityContractsPackage.DATA_LOCATION:
				return validateDataLocation((DataLocation)value, diagnostics, context);
			case SolidityContractsPackage.FUNCTION_MUTABILITY:
				return validateFunctionMutability((FunctionMutability)value, diagnostics, context);
			case SolidityContractsPackage.FUNCTION_TYPE_VISIBILITY:
				return validateFunctionTypeVisibility((FunctionTypeVisibility)value, diagnostics, context);
			case SolidityContractsPackage.PRIMITIVE_TYPE_ENUM:
				return validatePrimitiveTypeEnum((PrimitiveTypeEnum)value, diagnostics, context);
			case SolidityContractsPackage.VARIABLE_MUTABILITY:
				return validateVariableMutability((VariableMutability)value, diagnostics, context);
			case SolidityContractsPackage.DEFAULT_ARRAY_ENUM:
				return validateDefaultArrayEnum((DefaultArrayEnum)value, diagnostics, context);
			case SolidityContractsPackage.LOCAL_FUNCTION_VISIBILITY:
				return validateLocalFunctionVisibility((LocalFunctionVisibility)value, diagnostics, context);
			case SolidityContractsPackage.GLOBAL_FUNCTION_VISIBILITY:
				return validateGlobalFunctionVisibility((GlobalFunctionVisibility)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventParameter(EventParameter eventParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomArray(CustomArray customArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(customArray, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(customArray, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(customArray, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifierParameter(ModifierParameter modifierParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modifierParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(type, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(type, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(stateVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateVariable_ImmutableOnlyAllowedForValueTypes(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateVariable_ConstantOnlyAllowedForValueTypesOrString(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateVariable_DataLocationOfDefaultArrayMustBeStorage(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateVariable_DataLocationOfCustomArrayMustBeStorage(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateVariable_DataLocationOfMappingMustBeStorage(stateVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateStateVariable_DataLocationOfStructMustBeStorage(stateVariable, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ImmutableOnlyAllowedForValueTypes constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_VARIABLE__IMMUTABLE_ONLY_ALLOWED_FOR_VALUE_TYPES__EEXPRESSION = "mutability = VariableMutability::immutable implies type.oclIsTypeOf(PrimitiveType) or type.oclIsTypeOf(ContractType) or type.oclIsTypeOf(Enum)";

	/**
	 * Validates the ImmutableOnlyAllowedForValueTypes constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable_ImmutableOnlyAllowedForValueTypes(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STATE_VARIABLE,
				 stateVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ImmutableOnlyAllowedForValueTypes",
				 STATE_VARIABLE__IMMUTABLE_ONLY_ALLOWED_FOR_VALUE_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ConstantOnlyAllowedForValueTypesOrString constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_VARIABLE__CONSTANT_ONLY_ALLOWED_FOR_VALUE_TYPES_OR_STRING__EEXPRESSION = "mutability = VariableMutability::immutable implies type.oclIsTypeOf(PrimitiveType) or type.oclIsTypeOf(ContractType) or type.oclIsTypeOf(Enum) or (type.oclIsTypeOf(DefaultArray) and type.oclAsType(DefaultArray).type = DefaultArrayEnum::string)";

	/**
	 * Validates the ConstantOnlyAllowedForValueTypesOrString constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable_ConstantOnlyAllowedForValueTypesOrString(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STATE_VARIABLE,
				 stateVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConstantOnlyAllowedForValueTypesOrString",
				 STATE_VARIABLE__CONSTANT_ONLY_ALLOWED_FOR_VALUE_TYPES_OR_STRING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DataLocationOfDefaultArrayMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_VARIABLE__DATA_LOCATION_OF_DEFAULT_ARRAY_MUST_BE_STORAGE__EEXPRESSION = "type.oclIsTypeOf(DefaultArray) implies type.oclAsType(DefaultArray).dataLocation = DataLocation::storage";

	/**
	 * Validates the DataLocationOfDefaultArrayMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable_DataLocationOfDefaultArrayMustBeStorage(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STATE_VARIABLE,
				 stateVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataLocationOfDefaultArrayMustBeStorage",
				 STATE_VARIABLE__DATA_LOCATION_OF_DEFAULT_ARRAY_MUST_BE_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DataLocationOfCustomArrayMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_VARIABLE__DATA_LOCATION_OF_CUSTOM_ARRAY_MUST_BE_STORAGE__EEXPRESSION = "type.oclIsTypeOf(CustomArray) implies type.oclAsType(CustomArray).dataLocation = DataLocation::storage";

	/**
	 * Validates the DataLocationOfCustomArrayMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable_DataLocationOfCustomArrayMustBeStorage(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STATE_VARIABLE,
				 stateVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataLocationOfCustomArrayMustBeStorage",
				 STATE_VARIABLE__DATA_LOCATION_OF_CUSTOM_ARRAY_MUST_BE_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DataLocationOfMappingMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_VARIABLE__DATA_LOCATION_OF_MAPPING_MUST_BE_STORAGE__EEXPRESSION = "type.oclIsTypeOf(Mapping) implies type.oclAsType(Mapping).dataLocation = DataLocation::storage";

	/**
	 * Validates the DataLocationOfMappingMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable_DataLocationOfMappingMustBeStorage(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STATE_VARIABLE,
				 stateVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataLocationOfMappingMustBeStorage",
				 STATE_VARIABLE__DATA_LOCATION_OF_MAPPING_MUST_BE_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the DataLocationOfStructMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATE_VARIABLE__DATA_LOCATION_OF_STRUCT_MUST_BE_STORAGE__EEXPRESSION = "type.oclIsTypeOf(Struct) implies type.oclAsType(Struct).dataLocation = DataLocation::storage";

	/**
	 * Validates the DataLocationOfStructMustBeStorage constraint of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateVariable_DataLocationOfStructMustBeStorage(StateVariable stateVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STATE_VARIABLE,
				 stateVariable,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataLocationOfStructMustBeStorage",
				 STATE_VARIABLE__DATA_LOCATION_OF_STRUCT_MUST_BE_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(function, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(function, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_FunctionParameterNamesAndReturnVariableNamesMustBeUnique(function, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the FunctionParameterNamesAndReturnVariableNamesMustBeUnique constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION__FUNCTION_PARAMETER_NAMES_AND_RETURN_VARIABLE_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.parameters -> collect(name) -> union(self.returnVariables -> collect(name)) -> isUnique(x|x)";

	/**
	 * Validates the FunctionParameterNamesAndReturnVariableNamesMustBeUnique constraint of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunction_FunctionParameterNamesAndReturnVariableNamesMustBeUnique(Function function, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.FUNCTION,
				 function,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "FunctionParameterNamesAndReturnVariableNamesMustBeUnique",
				 FUNCTION__FUNCTION_PARAMETER_NAMES_AND_RETURN_VARIABLE_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum(edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum enum_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enum_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(enum_, diagnostics, context);
		if (result || diagnostics != null) result &= validateEnum_EnumMemberNamesMustBeUnique(enum_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EnumMemberNamesMustBeUnique constraint of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENUM__ENUM_MEMBER_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.members -> isUnique(value)";

	/**
	 * Validates the EnumMemberNamesMustBeUnique constraint of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnum_EnumMemberNamesMustBeUnique(edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum enum_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.ENUM,
				 enum_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EnumMemberNamesMustBeUnique",
				 ENUM__ENUM_MEMBER_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(event, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvent_EventParameterNamesMustBeUnique(event, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvent_Max3IndexedParametersForEvent(event, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the EventParameterNamesMustBeUnique constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__EVENT_PARAMETER_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.parameters -> isUnique(name)";

	/**
	 * Validates the EventParameterNamesMustBeUnique constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_EventParameterNamesMustBeUnique(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.EVENT,
				 event,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EventParameterNamesMustBeUnique",
				 EVENT__EVENT_PARAMETER_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the Max3IndexedParametersForEvent constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String EVENT__MAX3_INDEXED_PARAMETERS_FOR_EVENT__EEXPRESSION = "self.parameters -> collect(indexed) -> count(true) <= 3";

	/**
	 * Validates the Max3IndexedParametersForEvent constraint of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvent_Max3IndexedParametersForEvent(Event event, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.EVENT,
				 event,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "Max3IndexedParametersForEvent",
				 EVENT__MAX3_INDEXED_PARAMETERS_FOR_EVENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumMember(EnumMember enumMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(mapping, diagnostics, context);
		if (result || diagnostics != null) result &= validateMapping_DataLocationOfMappingMustBeStorage(mapping, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the DataLocationOfMappingMustBeStorage constraint of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MAPPING__DATA_LOCATION_OF_MAPPING_MUST_BE_STORAGE__EEXPRESSION = "dataLocation = DataLocation::storage";

	/**
	 * Validates the DataLocationOfMappingMustBeStorage constraint of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapping_DataLocationOfMappingMustBeStorage(Mapping mapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.MAPPING,
				 mapping,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "DataLocationOfMappingMustBeStorage",
				 MAPPING__DATA_LOCATION_OF_MAPPING_MUST_BE_STORAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifier(Modifier modifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modifier, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateModifier_ModifierParameterNamesMustBeUnique(modifier, diagnostics, context);
		if (result || diagnostics != null) result &= validateModifier_BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual(modifier, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModifierParameterNamesMustBeUnique constraint of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODIFIER__MODIFIER_PARAMETER_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.parameters -> isUnique(name)";

	/**
	 * Validates the ModifierParameterNamesMustBeUnique constraint of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifier_ModifierParameterNamesMustBeUnique(Modifier modifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.MODIFIER,
				 modifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModifierParameterNamesMustBeUnique",
				 MODIFIER__MODIFIER_PARAMETER_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual constraint of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MODIFIER__BASE_MODIFIER_OF_OVERRIDDEN_CONTRACTS_MUST_HAVE_SAME_NAME_AND_PARAMETERS_AND_MUST_BE_VIRTUAL__EEXPRESSION = "override -> notEmpty() implies override -> forAll(c|c.modifiers ->  exists(m|m.entityName = entityName and m.parameters -> collect(name) = parameters -> collect(name) and m.virtual = true))";

	/**
	 * Validates the BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual constraint of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModifier_BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual(Modifier modifier, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.MODIFIER,
				 modifier,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual",
				 MODIFIER__BASE_MODIFIER_OF_OVERRIDDEN_CONTRACTS_MUST_HAVE_SAME_NAME_AND_PARAMETERS_AND_MUST_BE_VIRTUAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingKeyType(MappingKeyType mappingKeyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mappingKeyType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mappingKeyType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(mappingKeyType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStructMember(StructMember structMember, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(structMember, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repository, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_ContractNameMustBeUnique(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_GlobalFunctionsMustBePublicOrExternal(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_GlobalFunctionCanOnlyUseGlobalTypes(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes(repository, diagnostics, context);
		if (result || diagnostics != null) result &= validateRepository_ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes(repository, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ContractNameMustBeUnique constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__CONTRACT_NAME_MUST_BE_UNIQUE__EEXPRESSION = "contracts -> isUnique(entityName)";

	/**
	 * Validates the ContractNameMustBeUnique constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_ContractNameMustBeUnique(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ContractNameMustBeUnique",
				 REPOSITORY__CONTRACT_NAME_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the GlobalFunctionsMustBePublicOrExternal constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__GLOBAL_FUNCTIONS_MUST_BE_PUBLIC_OR_EXTERNAL__EEXPRESSION = "globalFunctions -> collect(visibility) -> excludesAll(Set{LocalFunctionVisibility::private, LocalFunctionVisibility::internal})";

	/**
	 * Validates the GlobalFunctionsMustBePublicOrExternal constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_GlobalFunctionsMustBePublicOrExternal(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GlobalFunctionsMustBePublicOrExternal",
				 REPOSITORY__GLOBAL_FUNCTIONS_MUST_BE_PUBLIC_OR_EXTERNAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the GlobalFunctionCanOnlyUseGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__GLOBAL_FUNCTION_CAN_ONLY_USE_GLOBAL_TYPES__EEXPRESSION = "globalTypes -> includesAll(globalFunctions -> collect(returnVariables) -> collect(type) -> union(globalFunctions -> collect(parameters) -> collect(type)))";

	/**
	 * Validates the GlobalFunctionCanOnlyUseGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_GlobalFunctionCanOnlyUseGlobalTypes(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GlobalFunctionCanOnlyUseGlobalTypes",
				 REPOSITORY__GLOBAL_FUNCTION_CAN_ONLY_USE_GLOBAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__LOCAL_FUNCTIONS_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION = "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.localFunctions -> collect(parameters) -> collect(type) -> union(c.localFunctions -> collect(returnVariables) -> collect(type))))";

	/**
	 * Validates the LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes",
				 REPOSITORY__LOCAL_FUNCTIONS_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__VARIABLES_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION = "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.variables -> collect(type)))";

	/**
	 * Validates the VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes",
				 REPOSITORY__VARIABLES_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__EVENTS_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION = "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.events -> collect(parameters) -> collect(type)))";

	/**
	 * Validates the EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes",
				 REPOSITORY__EVENTS_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String REPOSITORY__MODIFIERS_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION = "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.modifiers -> collect(parameters) -> collect(type)))";

	/**
	 * Validates the ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes constraint of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepository_ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes(Repository repository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.REPOSITORY,
				 repository,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes",
				 REPOSITORY__MODIFIERS_CAN_ONLY_USE_LOCAL_TYPES_OF_CONTRACT_OR_GLOBAL_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstructor(Constructor constructor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constructor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constructor, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstructor_ConstructorParameterNamesMustBeUnique(constructor, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ConstructorParameterNamesMustBeUnique constraint of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSTRUCTOR__CONSTRUCTOR_PARAMETER_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "parameters -> isUnique(name)";

	/**
	 * Validates the ConstructorParameterNamesMustBeUnique constraint of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstructor_ConstructorParameterNamesMustBeUnique(Constructor constructor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONSTRUCTOR,
				 constructor,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ConstructorParameterNamesMustBeUnique",
				 CONSTRUCTOR__CONSTRUCTOR_PARAMETER_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(primitiveType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(primitiveType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(primitiveType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnVariable(ReturnVariable returnVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStruct(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(struct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(struct, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStruct_StructCannotContainItself(struct, diagnostics, context);
		if (result || diagnostics != null) result &= validateStruct_StructMemberNamesMustBeUnique(struct, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the StructCannotContainItself constraint of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCT__STRUCT_CANNOT_CONTAIN_ITSELF__EEXPRESSION = "self.members -> collect(type) -> excludes(self)";

	/**
	 * Validates the StructCannotContainItself constraint of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStruct_StructCannotContainItself(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STRUCT,
				 struct,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StructCannotContainItself",
				 STRUCT__STRUCT_CANNOT_CONTAIN_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StructMemberNamesMustBeUnique constraint of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STRUCT__STRUCT_MEMBER_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.members -> isUnique(entityName)";

	/**
	 * Validates the StructMemberNamesMustBeUnique constraint of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStruct_StructMemberNamesMustBeUnique(Struct struct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.STRUCT,
				 struct,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StructMemberNamesMustBeUnique",
				 STRUCT__STRUCT_MEMBER_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contract, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validateContract_ModifierNamesMustBeUnique(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validateContract_StateVariableNamesMustBeUnique(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validateContract_ContractCannotInheritFromItself(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validateContract_ContractsReferencedInFunctionOverridesMustBeIncludedInParents(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validateContract_ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents(contract, diagnostics, context);
		if (result || diagnostics != null) result &= validateContract_ContractMustContainOverrridingFunctions(contract, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ModifierNamesMustBeUnique constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTRACT__MODIFIER_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.modifiers -> isUnique(entityName)";

	/**
	 * Validates the ModifierNamesMustBeUnique constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract_ModifierNamesMustBeUnique(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONTRACT,
				 contract,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ModifierNamesMustBeUnique",
				 CONTRACT__MODIFIER_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the StateVariableNamesMustBeUnique constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTRACT__STATE_VARIABLE_NAMES_MUST_BE_UNIQUE__EEXPRESSION = "self.variables -> isUnique(entityName)";

	/**
	 * Validates the StateVariableNamesMustBeUnique constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract_StateVariableNamesMustBeUnique(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONTRACT,
				 contract,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "StateVariableNamesMustBeUnique",
				 CONTRACT__STATE_VARIABLE_NAMES_MUST_BE_UNIQUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContractCannotInheritFromItself constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTRACT__CONTRACT_CANNOT_INHERIT_FROM_ITSELF__EEXPRESSION = "parents->excludes(self)";

	/**
	 * Validates the ContractCannotInheritFromItself constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract_ContractCannotInheritFromItself(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONTRACT,
				 contract,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ContractCannotInheritFromItself",
				 CONTRACT__CONTRACT_CANNOT_INHERIT_FROM_ITSELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContractsReferencedInFunctionOverridesMustBeIncludedInParents constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTRACT__CONTRACTS_REFERENCED_IN_FUNCTION_OVERRIDES_MUST_BE_INCLUDED_IN_PARENTS__EEXPRESSION = "parents -> includesAll(overrideFunctions -> collect(baseContracts))";

	/**
	 * Validates the ContractsReferencedInFunctionOverridesMustBeIncludedInParents constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract_ContractsReferencedInFunctionOverridesMustBeIncludedInParents(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONTRACT,
				 contract,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ContractsReferencedInFunctionOverridesMustBeIncludedInParents",
				 CONTRACT__CONTRACTS_REFERENCED_IN_FUNCTION_OVERRIDES_MUST_BE_INCLUDED_IN_PARENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTRACT__CONTRACTS_REFERENCED_IN_OVERRIDE_OF_MODIFIERS_MUST_BE_INCLUDED_IN_PARENTS__EEXPRESSION = "parents -> includesAll(modifiers -> collect(override))";

	/**
	 * Validates the ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract_ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONTRACT,
				 contract,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents",
				 CONTRACT__CONTRACTS_REFERENCED_IN_OVERRIDE_OF_MODIFIERS_MUST_BE_INCLUDED_IN_PARENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ContractMustContainOverrridingFunctions constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONTRACT__CONTRACT_MUST_CONTAIN_OVERRRIDING_FUNCTIONS__EEXPRESSION = "overrideFunctions -> forAll(f|localFunctions -> union(providedFunctions) -> includes(f.overriding))";

	/**
	 * Validates the ContractMustContainOverrridingFunctions constraint of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContract_ContractMustContainOverrridingFunctions(Contract contract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.CONTRACT,
				 contract,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ContractMustContainOverrridingFunctions",
				 CONTRACT__CONTRACT_MUST_CONTAIN_OVERRRIDING_FUNCTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionParameter(FunctionParameter functionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionParameter, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(functionParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstructorParameter(ConstructorParameter constructorParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constructorParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultArray(DefaultArray defaultArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(defaultArray, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(defaultArray, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(defaultArray, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionType_ExternalFunctionTypeCannotUseMappingAsParameter(functionType, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionType_ExternalFunctionTypeCannotUseMappingAsReturnVariable(functionType, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ExternalFunctionTypeCannotUseMappingAsParameter constraint of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION_TYPE__EXTERNAL_FUNCTION_TYPE_CANNOT_USE_MAPPING_AS_PARAMETER__EEXPRESSION = "visibility = FunctionTypeVisibility::external implies parameterTypes -> excludes(Mapping)";

	/**
	 * Validates the ExternalFunctionTypeCannotUseMappingAsParameter constraint of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType_ExternalFunctionTypeCannotUseMappingAsParameter(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.FUNCTION_TYPE,
				 functionType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExternalFunctionTypeCannotUseMappingAsParameter",
				 FUNCTION_TYPE__EXTERNAL_FUNCTION_TYPE_CANNOT_USE_MAPPING_AS_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExternalFunctionTypeCannotUseMappingAsReturnVariable constraint of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FUNCTION_TYPE__EXTERNAL_FUNCTION_TYPE_CANNOT_USE_MAPPING_AS_RETURN_VARIABLE__EEXPRESSION = "visibility = FunctionTypeVisibility::external implies returnTypes -> excludes(Mapping)";

	/**
	 * Validates the ExternalFunctionTypeCannotUseMappingAsReturnVariable constraint of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionType_ExternalFunctionTypeCannotUseMappingAsReturnVariable(FunctionType functionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.FUNCTION_TYPE,
				 functionType,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExternalFunctionTypeCannotUseMappingAsReturnVariable",
				 FUNCTION_TYPE__EXTERNAL_FUNCTION_TYPE_CANNOT_USE_MAPPING_AS_RETURN_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContractType(ContractType contractType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(contractType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(contractType, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(contractType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(overrideFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_BaseFunctionCannotBePrivate(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_OverridingFunctionCannotBePrivate(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_BaseFunctionMustBeIncludedInBaseContract(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_BaseAndOverridingFunctionMustHaveSameName(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_LocalFunctionsCanOnlyBeOverriddenByLocalFunctions(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_OverridingVisibilityOnlyFromExternalToPublicAllowed(overrideFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateOverrideFunction_OverrideMutabilityOnlyFromDefaultToViewToPureAllowed(overrideFunction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the BaseFunctionCannotBePrivate constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__BASE_FUNCTION_CANNOT_BE_PRIVATE__EEXPRESSION = "base.oclIsTypeOf(LocalFunction) implies base.oclAsType(LocalFunction).visibility <> LocalFunctionVisibility::private";

	/**
	 * Validates the BaseFunctionCannotBePrivate constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_BaseFunctionCannotBePrivate(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BaseFunctionCannotBePrivate",
				 OVERRIDE_FUNCTION__BASE_FUNCTION_CANNOT_BE_PRIVATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OverridingFunctionCannotBePrivate constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__OVERRIDING_FUNCTION_CANNOT_BE_PRIVATE__EEXPRESSION = "overriding.oclIsTypeOf(LocalFunction) implies overriding.oclAsType(LocalFunction).visibility <> LocalFunctionVisibility::private";

	/**
	 * Validates the OverridingFunctionCannotBePrivate constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_OverridingFunctionCannotBePrivate(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OverridingFunctionCannotBePrivate",
				 OVERRIDE_FUNCTION__OVERRIDING_FUNCTION_CANNOT_BE_PRIVATE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BaseFunctionMustBeIncludedInBaseContract constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__BASE_FUNCTION_MUST_BE_INCLUDED_IN_BASE_CONTRACT__EEXPRESSION = "baseContracts -> forAll(c| c.localFunctions -> union(c.providedFunctions) -> includes(base))";

	/**
	 * Validates the BaseFunctionMustBeIncludedInBaseContract constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_BaseFunctionMustBeIncludedInBaseContract(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BaseFunctionMustBeIncludedInBaseContract",
				 OVERRIDE_FUNCTION__BASE_FUNCTION_MUST_BE_INCLUDED_IN_BASE_CONTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BaseAndOverridingFunctionMustHaveSameName constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__BASE_AND_OVERRIDING_FUNCTION_MUST_HAVE_SAME_NAME__EEXPRESSION = "base.entityName = overriding.entityName";

	/**
	 * Validates the BaseAndOverridingFunctionMustHaveSameName constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_BaseAndOverridingFunctionMustHaveSameName(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BaseAndOverridingFunctionMustHaveSameName",
				 OVERRIDE_FUNCTION__BASE_AND_OVERRIDING_FUNCTION_MUST_HAVE_SAME_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__BASE_AND_OVERRIDING_FUNCTION_MUST_HAVE_SAME_PARAMETER_NAME_AND_TYPES__EEXPRESSION = "Sequence{1..base.parameters -> size()} -> forAll(i| base.parameters -> at(i) -> collect(name) = overriding.parameters -> at(i) -> collect(name) and base.parameters -> at(i) -> collect(type) = overriding.parameters -> at(i) -> collect(type))";

	/**
	 * Validates the BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes",
				 OVERRIDE_FUNCTION__BASE_AND_OVERRIDING_FUNCTION_MUST_HAVE_SAME_PARAMETER_NAME_AND_TYPES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the LocalFunctionsCanOnlyBeOverriddenByLocalFunctions constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__LOCAL_FUNCTIONS_CAN_ONLY_BE_OVERRIDDEN_BY_LOCAL_FUNCTIONS__EEXPRESSION = "base.oclIsTypeOf(LocalFunction) implies overriding.oclIsTypeOf(LocalFunction)";

	/**
	 * Validates the LocalFunctionsCanOnlyBeOverriddenByLocalFunctions constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_LocalFunctionsCanOnlyBeOverriddenByLocalFunctions(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "LocalFunctionsCanOnlyBeOverriddenByLocalFunctions",
				 OVERRIDE_FUNCTION__LOCAL_FUNCTIONS_CAN_ONLY_BE_OVERRIDDEN_BY_LOCAL_FUNCTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__GLOBAL_FUNCTIONS_CAN_ONLY_BE_OVERRIDDEN_BY_GLOBAL_FUNCTIONS__EEXPRESSION = "base.oclIsTypeOf(GlobalFunction) implies overriding.oclIsTypeOf(GlobalFunction)";

	/**
	 * Validates the GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions",
				 OVERRIDE_FUNCTION__GLOBAL_FUNCTIONS_CAN_ONLY_BE_OVERRIDDEN_BY_GLOBAL_FUNCTIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OverridingVisibilityOnlyFromExternalToPublicAllowed constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__OVERRIDING_VISIBILITY_ONLY_FROM_EXTERNAL_TO_PUBLIC_ALLOWED__EEXPRESSION = "(base.oclIsTypeOf(GlobalFunction) and overriding.oclIsTypeOf(GlobalFunction)) implies base.oclAsType(GlobalFunction).visibility = overriding.oclAsType(GlobalFunction).visibility or (base.oclAsType(GlobalFunction).visibility = GlobalFunctionVisibility::external and overriding.oclAsType(GlobalFunction).visibility = GlobalFunctionVisibility::public)";

	/**
	 * Validates the OverridingVisibilityOnlyFromExternalToPublicAllowed constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_OverridingVisibilityOnlyFromExternalToPublicAllowed(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OverridingVisibilityOnlyFromExternalToPublicAllowed",
				 OVERRIDE_FUNCTION__OVERRIDING_VISIBILITY_ONLY_FROM_EXTERNAL_TO_PUBLIC_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the OverrideMutabilityOnlyFromDefaultToViewToPureAllowed constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String OVERRIDE_FUNCTION__OVERRIDE_MUTABILITY_ONLY_FROM_DEFAULT_TO_VIEW_TO_PURE_ALLOWED__EEXPRESSION = "base.mutability = overriding.mutability or (base.mutability = FunctionMutability::default and (overriding.mutability = FunctionMutability::view or overriding.mutability = FunctionMutability::pure) or (base.mutability = FunctionMutability::view and overriding.mutability = FunctionMutability::pure))";

	/**
	 * Validates the OverrideMutabilityOnlyFromDefaultToViewToPureAllowed constraint of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOverrideFunction_OverrideMutabilityOnlyFromDefaultToViewToPureAllowed(OverrideFunction overrideFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.OVERRIDE_FUNCTION,
				 overrideFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "OverrideMutabilityOnlyFromDefaultToViewToPureAllowed",
				 OVERRIDE_FUNCTION__OVERRIDE_MUTABILITY_ONLY_FROM_DEFAULT_TO_VIEW_TO_PURE_ALLOWED__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFunction(LocalFunction localFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(localFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_FunctionParameterNamesAndReturnVariableNamesMustBeUnique(localFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateLocalFunction_PrivateFunctionsCannotBeVirtual(localFunction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PrivateFunctionsCannotBeVirtual constraint of '<em>Local Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String LOCAL_FUNCTION__PRIVATE_FUNCTIONS_CANNOT_BE_VIRTUAL__EEXPRESSION = "visibility = LocalFunctionVisibility::private implies virtual = false";

	/**
	 * Validates the PrivateFunctionsCannotBeVirtual constraint of '<em>Local Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFunction_PrivateFunctionsCannotBeVirtual(LocalFunction localFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.LOCAL_FUNCTION,
				 localFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PrivateFunctionsCannotBeVirtual",
				 LOCAL_FUNCTION__PRIVATE_FUNCTIONS_CANNOT_BE_VIRTUAL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFunction(GlobalFunction globalFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalFunction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunction_FunctionParameterNamesAndReturnVariableNamesMustBeUnique(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalFunction_PublicFunctionCannotUseMappingAsParameter(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalFunction_PublicFunctionCannotUseMappingAsReturnVariable(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalFunction_ExternalFunctionCannotUseMappingAsParameter(globalFunction, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalFunction_ExternalFunctionCannotUseMappingAsReturnVariable(globalFunction, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the PublicFunctionCannotUseMappingAsParameter constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_FUNCTION__PUBLIC_FUNCTION_CANNOT_USE_MAPPING_AS_PARAMETER__EEXPRESSION = "visibility = GlobalFunctionVisibility::public implies parameters -> collect(type) -> excludes(Mapping)";

	/**
	 * Validates the PublicFunctionCannotUseMappingAsParameter constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFunction_PublicFunctionCannotUseMappingAsParameter(GlobalFunction globalFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.GLOBAL_FUNCTION,
				 globalFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PublicFunctionCannotUseMappingAsParameter",
				 GLOBAL_FUNCTION__PUBLIC_FUNCTION_CANNOT_USE_MAPPING_AS_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the PublicFunctionCannotUseMappingAsReturnVariable constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_FUNCTION__PUBLIC_FUNCTION_CANNOT_USE_MAPPING_AS_RETURN_VARIABLE__EEXPRESSION = "visibility = GlobalFunctionVisibility::public implies returnVariables -> collect(type) -> excludes(Mapping)";

	/**
	 * Validates the PublicFunctionCannotUseMappingAsReturnVariable constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFunction_PublicFunctionCannotUseMappingAsReturnVariable(GlobalFunction globalFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.GLOBAL_FUNCTION,
				 globalFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "PublicFunctionCannotUseMappingAsReturnVariable",
				 GLOBAL_FUNCTION__PUBLIC_FUNCTION_CANNOT_USE_MAPPING_AS_RETURN_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExternalFunctionCannotUseMappingAsParameter constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_FUNCTION__EXTERNAL_FUNCTION_CANNOT_USE_MAPPING_AS_PARAMETER__EEXPRESSION = "visibility = GlobalFunctionVisibility::external implies parameters -> collect(type) -> excludes(Mapping)";

	/**
	 * Validates the ExternalFunctionCannotUseMappingAsParameter constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFunction_ExternalFunctionCannotUseMappingAsParameter(GlobalFunction globalFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.GLOBAL_FUNCTION,
				 globalFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExternalFunctionCannotUseMappingAsParameter",
				 GLOBAL_FUNCTION__EXTERNAL_FUNCTION_CANNOT_USE_MAPPING_AS_PARAMETER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the ExternalFunctionCannotUseMappingAsReturnVariable constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GLOBAL_FUNCTION__EXTERNAL_FUNCTION_CANNOT_USE_MAPPING_AS_RETURN_VARIABLE__EEXPRESSION = "visibility = GlobalFunctionVisibility::external implies returnVariables -> collect(type) -> excludes(Mapping)";

	/**
	 * Validates the ExternalFunctionCannotUseMappingAsReturnVariable constraint of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFunction_ExternalFunctionCannotUseMappingAsReturnVariable(GlobalFunction globalFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SolidityContractsPackage.Literals.GLOBAL_FUNCTION,
				 globalFunction,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ExternalFunctionCannotUseMappingAsReturnVariable",
				 GLOBAL_FUNCTION__EXTERNAL_FUNCTION_CANNOT_USE_MAPPING_AS_RETURN_VARIABLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableVisibility(VariableVisibility variableVisibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataLocation(DataLocation dataLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionMutability(FunctionMutability functionMutability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionTypeVisibility(FunctionTypeVisibility functionTypeVisibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveTypeEnum(PrimitiveTypeEnum primitiveTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariableMutability(VariableMutability variableMutability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultArrayEnum(DefaultArrayEnum defaultArrayEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocalFunctionVisibility(LocalFunctionVisibility localFunctionVisibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalFunctionVisibility(GlobalFunctionVisibility globalFunctionVisibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SolidityContractsValidator
