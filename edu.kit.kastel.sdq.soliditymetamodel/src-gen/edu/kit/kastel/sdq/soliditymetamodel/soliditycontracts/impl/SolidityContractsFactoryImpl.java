/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

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
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsFactory;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolidityContractsFactoryImpl extends EFactoryImpl implements SolidityContractsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SolidityContractsFactory init() {
		try {
			SolidityContractsFactory theSolidityContractsFactory = (SolidityContractsFactory)EPackage.Registry.INSTANCE.getEFactory(SolidityContractsPackage.eNS_URI);
			if (theSolidityContractsFactory != null) {
				return theSolidityContractsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SolidityContractsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidityContractsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SolidityContractsPackage.EVENT_PARAMETER: return createEventParameter();
			case SolidityContractsPackage.CUSTOM_ARRAY: return createCustomArray();
			case SolidityContractsPackage.MODIFIER_PARAMETER: return createModifierParameter();
			case SolidityContractsPackage.STATE_VARIABLE: return createStateVariable();
			case SolidityContractsPackage.ENUM: return createEnum();
			case SolidityContractsPackage.EVENT: return createEvent();
			case SolidityContractsPackage.ENUM_MEMBER: return createEnumMember();
			case SolidityContractsPackage.MAPPING: return createMapping();
			case SolidityContractsPackage.MODIFIER: return createModifier();
			case SolidityContractsPackage.STRUCT_MEMBER: return createStructMember();
			case SolidityContractsPackage.REPOSITORY: return createRepository();
			case SolidityContractsPackage.CONSTRUCTOR: return createConstructor();
			case SolidityContractsPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case SolidityContractsPackage.RETURN_VARIABLE: return createReturnVariable();
			case SolidityContractsPackage.STRUCT: return createStruct();
			case SolidityContractsPackage.CONTRACT: return createContract();
			case SolidityContractsPackage.FUNCTION_PARAMETER: return createFunctionParameter();
			case SolidityContractsPackage.CONSTRUCTOR_PARAMETER: return createConstructorParameter();
			case SolidityContractsPackage.DEFAULT_ARRAY: return createDefaultArray();
			case SolidityContractsPackage.FUNCTION_TYPE: return createFunctionType();
			case SolidityContractsPackage.CONTRACT_TYPE: return createContractType();
			case SolidityContractsPackage.OVERRIDE_FUNCTION: return createOverrideFunction();
			case SolidityContractsPackage.LOCAL_FUNCTION: return createLocalFunction();
			case SolidityContractsPackage.GLOBAL_FUNCTION: return createGlobalFunction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SolidityContractsPackage.VARIABLE_VISIBILITY:
				return createVariableVisibilityFromString(eDataType, initialValue);
			case SolidityContractsPackage.DATA_LOCATION:
				return createDataLocationFromString(eDataType, initialValue);
			case SolidityContractsPackage.FUNCTION_MUTABILITY:
				return createFunctionMutabilityFromString(eDataType, initialValue);
			case SolidityContractsPackage.FUNCTION_TYPE_VISIBILITY:
				return createFunctionTypeVisibilityFromString(eDataType, initialValue);
			case SolidityContractsPackage.PRIMITIVE_TYPE_ENUM:
				return createPrimitiveTypeEnumFromString(eDataType, initialValue);
			case SolidityContractsPackage.VARIABLE_MUTABILITY:
				return createVariableMutabilityFromString(eDataType, initialValue);
			case SolidityContractsPackage.DEFAULT_ARRAY_ENUM:
				return createDefaultArrayEnumFromString(eDataType, initialValue);
			case SolidityContractsPackage.LOCAL_FUNCTION_VISIBILITY:
				return createLocalFunctionVisibilityFromString(eDataType, initialValue);
			case SolidityContractsPackage.GLOBAL_FUNCTION_VISIBILITY:
				return createGlobalFunctionVisibilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SolidityContractsPackage.VARIABLE_VISIBILITY:
				return convertVariableVisibilityToString(eDataType, instanceValue);
			case SolidityContractsPackage.DATA_LOCATION:
				return convertDataLocationToString(eDataType, instanceValue);
			case SolidityContractsPackage.FUNCTION_MUTABILITY:
				return convertFunctionMutabilityToString(eDataType, instanceValue);
			case SolidityContractsPackage.FUNCTION_TYPE_VISIBILITY:
				return convertFunctionTypeVisibilityToString(eDataType, instanceValue);
			case SolidityContractsPackage.PRIMITIVE_TYPE_ENUM:
				return convertPrimitiveTypeEnumToString(eDataType, instanceValue);
			case SolidityContractsPackage.VARIABLE_MUTABILITY:
				return convertVariableMutabilityToString(eDataType, instanceValue);
			case SolidityContractsPackage.DEFAULT_ARRAY_ENUM:
				return convertDefaultArrayEnumToString(eDataType, instanceValue);
			case SolidityContractsPackage.LOCAL_FUNCTION_VISIBILITY:
				return convertLocalFunctionVisibilityToString(eDataType, instanceValue);
			case SolidityContractsPackage.GLOBAL_FUNCTION_VISIBILITY:
				return convertGlobalFunctionVisibilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventParameter createEventParameter() {
		EventParameterImpl eventParameter = new EventParameterImpl();
		return eventParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomArray createCustomArray() {
		CustomArrayImpl customArray = new CustomArrayImpl();
		return customArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModifierParameter createModifierParameter() {
		ModifierParameterImpl modifierParameter = new ModifierParameterImpl();
		return modifierParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateVariable createStateVariable() {
		StateVariableImpl stateVariable = new StateVariableImpl();
		return stateVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumMember createEnumMember() {
		EnumMemberImpl enumMember = new EnumMemberImpl();
		return enumMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modifier createModifier() {
		ModifierImpl modifier = new ModifierImpl();
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StructMember createStructMember() {
		StructMemberImpl structMember = new StructMemberImpl();
		return structMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repository createRepository() {
		RepositoryImpl repository = new RepositoryImpl();
		return repository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReturnVariable createReturnVariable() {
		ReturnVariableImpl returnVariable = new ReturnVariableImpl();
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Struct createStruct() {
		StructImpl struct = new StructImpl();
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract() {
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionParameter createFunctionParameter() {
		FunctionParameterImpl functionParameter = new FunctionParameterImpl();
		return functionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstructorParameter createConstructorParameter() {
		ConstructorParameterImpl constructorParameter = new ConstructorParameterImpl();
		return constructorParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultArray createDefaultArray() {
		DefaultArrayImpl defaultArray = new DefaultArrayImpl();
		return defaultArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContractType createContractType() {
		ContractTypeImpl contractType = new ContractTypeImpl();
		return contractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OverrideFunction createOverrideFunction() {
		OverrideFunctionImpl overrideFunction = new OverrideFunctionImpl();
		return overrideFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalFunction createLocalFunction() {
		LocalFunctionImpl localFunction = new LocalFunctionImpl();
		return localFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobalFunction createGlobalFunction() {
		GlobalFunctionImpl globalFunction = new GlobalFunctionImpl();
		return globalFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableVisibility createVariableVisibilityFromString(EDataType eDataType, String initialValue) {
		VariableVisibility result = VariableVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLocation createDataLocationFromString(EDataType eDataType, String initialValue) {
		DataLocation result = DataLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionMutability createFunctionMutabilityFromString(EDataType eDataType, String initialValue) {
		FunctionMutability result = FunctionMutability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionMutabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionTypeVisibility createFunctionTypeVisibilityFromString(EDataType eDataType, String initialValue) {
		FunctionTypeVisibility result = FunctionTypeVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionTypeVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypeEnum createPrimitiveTypeEnumFromString(EDataType eDataType, String initialValue) {
		PrimitiveTypeEnum result = PrimitiveTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableMutability createVariableMutabilityFromString(EDataType eDataType, String initialValue) {
		VariableMutability result = VariableMutability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableMutabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultArrayEnum createDefaultArrayEnumFromString(EDataType eDataType, String initialValue) {
		DefaultArrayEnum result = DefaultArrayEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefaultArrayEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalFunctionVisibility createLocalFunctionVisibilityFromString(EDataType eDataType, String initialValue) {
		LocalFunctionVisibility result = LocalFunctionVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocalFunctionVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalFunctionVisibility createGlobalFunctionVisibilityFromString(EDataType eDataType, String initialValue) {
		GlobalFunctionVisibility result = GlobalFunctionVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlobalFunctionVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidityContractsPackage getSolidityContractsPackage() {
		return (SolidityContractsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SolidityContractsPackage getPackage() {
		return SolidityContractsPackage.eINSTANCE;
	}

} //SolidityContractsFactoryImpl
