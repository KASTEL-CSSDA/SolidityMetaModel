/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACPackageImpl;

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
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsFactory;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.util.SolidityContractsValidator;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.SoliditySystemPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolidityContractsPackageImpl extends EPackageImpl implements SolidityContractsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingKeyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overrideFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionMutabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionTypeVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableMutabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultArrayEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum localFunctionVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum globalFunctionVisibilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolidityContractsPackageImpl() {
		super(eNS_URI, SolidityContractsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SolidityContractsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolidityContractsPackage init() {
		if (isInited) return (SolidityContractsPackage)EPackage.Registry.INSTANCE.getEPackage(SolidityContractsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSolidityContractsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SolidityContractsPackageImpl theSolidityContractsPackage = registeredSolidityContractsPackage instanceof SolidityContractsPackageImpl ? (SolidityContractsPackageImpl)registeredSolidityContractsPackage : new SolidityContractsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RBACPackage.eNS_URI);
		RBACPackageImpl theRBACPackage = (RBACPackageImpl)(registeredPackage instanceof RBACPackageImpl ? registeredPackage : RBACPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SoliditySystemPackage.eNS_URI);
		SoliditySystemPackageImpl theSoliditySystemPackage = (SoliditySystemPackageImpl)(registeredPackage instanceof SoliditySystemPackageImpl ? registeredPackage : SoliditySystemPackage.eINSTANCE);

		// Create package meta-data objects
		theSolidityContractsPackage.createPackageContents();
		theRBACPackage.createPackageContents();
		theSoliditySystemPackage.createPackageContents();

		// Initialize created meta-data
		theSolidityContractsPackage.initializePackageContents();
		theRBACPackage.initializePackageContents();
		theSoliditySystemPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theSolidityContractsPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return SolidityContractsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSolidityContractsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolidityContractsPackage.eNS_URI, theSolidityContractsPackage);
		return theSolidityContractsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventParameter() {
		return eventParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventParameter_Type() {
		return (EReference)eventParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventParameter_Name() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventParameter_Indexed() {
		return (EAttribute)eventParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomArray() {
		return customArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomArray_Size() {
		return (EAttribute)customArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustomArray_Type() {
		return (EReference)customArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomArray_DataLocation() {
		return (EAttribute)customArrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifierParameter() {
		return modifierParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifierParameter_Name() {
		return (EAttribute)modifierParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifierParameter_Type() {
		return (EReference)modifierParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStateVariable() {
		return stateVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateVariable_Mutability() {
		return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStateVariable_Visibility() {
		return (EAttribute)stateVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStateVariable_Type() {
		return (EReference)stateVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_ReturnVariables() {
		return (EReference)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Mutability() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Modifiers() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Virtual() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Parameters() {
		return (EReference)functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnum() {
		return enumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnum_Members() {
		return (EReference)enumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Parameters() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Anonymous() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumMember() {
		return enumMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumMember_Value() {
		return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_KeyType() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_ValueType() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_DataLocation() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModifier() {
		return modifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_Parameters() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModifier_Virtual() {
		return (EAttribute)modifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModifier_Override() {
		return (EReference)modifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingKeyType() {
		return mappingKeyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStructMember() {
		return structMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStructMember_Type() {
		return (EReference)structMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_Contracts() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_GlobalFunctions() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRepository_GlobalTypes() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructor_Parameters() {
		return (EReference)constructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveType_Type() {
		return (EAttribute)primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnVariable() {
		return returnVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnVariable_Name() {
		return (EAttribute)returnVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnVariable_Type() {
		return (EReference)returnVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStruct() {
		return structEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStruct_Members() {
		return (EReference)structEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStruct_DataLocation() {
		return (EAttribute)structEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_Variables() {
		return (EReference)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_ProvidedFunctions() {
		return (EReference)contractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_Constructor() {
		return (EReference)contractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_Events() {
		return (EReference)contractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_Parents() {
		return (EReference)contractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_Modifiers() {
		return (EReference)contractEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_LocalTypes() {
		return (EReference)contractEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_RequiredFunctions() {
		return (EReference)contractEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_LocalFunctions() {
		return (EReference)contractEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContract_OverrideFunctions() {
		return (EReference)contractEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionParameter_Name() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionParameter_Type() {
		return (EReference)functionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstructorParameter() {
		return constructorParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstructorParameter_Name() {
		return (EAttribute)constructorParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConstructorParameter_Type() {
		return (EReference)constructorParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultArray() {
		return defaultArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultArray_Type() {
		return (EAttribute)defaultArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultArray_DataLocation() {
		return (EAttribute)defaultArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionType_Visibility() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionType_Mutability() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionType_ParameterTypes() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionType_ReturnTypes() {
		return (EReference)functionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContractType() {
		return contractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContractType_Contract() {
		return (EReference)contractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOverrideFunction() {
		return overrideFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOverrideFunction_Base() {
		return (EReference)overrideFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOverrideFunction_Overriding() {
		return (EReference)overrideFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOverrideFunction_BaseContracts() {
		return (EReference)overrideFunctionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocalFunction() {
		return localFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLocalFunction_Visibility() {
		return (EAttribute)localFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalFunction() {
		return globalFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobalFunction_Visibility() {
		return (EAttribute)globalFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableVisibility() {
		return variableVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataLocation() {
		return dataLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFunctionMutability() {
		return functionMutabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFunctionTypeVisibility() {
		return functionTypeVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitiveTypeEnum() {
		return primitiveTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVariableMutability() {
		return variableMutabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefaultArrayEnum() {
		return defaultArrayEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLocalFunctionVisibility() {
		return localFunctionVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGlobalFunctionVisibility() {
		return globalFunctionVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidityContractsFactory getSolidityContractsFactory() {
		return (SolidityContractsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eventParameterEClass = createEClass(EVENT_PARAMETER);
		createEReference(eventParameterEClass, EVENT_PARAMETER__TYPE);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__NAME);
		createEAttribute(eventParameterEClass, EVENT_PARAMETER__INDEXED);

		customArrayEClass = createEClass(CUSTOM_ARRAY);
		createEAttribute(customArrayEClass, CUSTOM_ARRAY__SIZE);
		createEReference(customArrayEClass, CUSTOM_ARRAY__TYPE);
		createEAttribute(customArrayEClass, CUSTOM_ARRAY__DATA_LOCATION);

		modifierParameterEClass = createEClass(MODIFIER_PARAMETER);
		createEAttribute(modifierParameterEClass, MODIFIER_PARAMETER__NAME);
		createEReference(modifierParameterEClass, MODIFIER_PARAMETER__TYPE);

		typeEClass = createEClass(TYPE);

		stateVariableEClass = createEClass(STATE_VARIABLE);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__MUTABILITY);
		createEAttribute(stateVariableEClass, STATE_VARIABLE__VISIBILITY);
		createEReference(stateVariableEClass, STATE_VARIABLE__TYPE);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__RETURN_VARIABLES);
		createEAttribute(functionEClass, FUNCTION__MUTABILITY);
		createEReference(functionEClass, FUNCTION__MODIFIERS);
		createEAttribute(functionEClass, FUNCTION__VIRTUAL);
		createEReference(functionEClass, FUNCTION__PARAMETERS);

		enumEClass = createEClass(ENUM);
		createEReference(enumEClass, ENUM__MEMBERS);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__PARAMETERS);
		createEAttribute(eventEClass, EVENT__ANONYMOUS);

		enumMemberEClass = createEClass(ENUM_MEMBER);
		createEAttribute(enumMemberEClass, ENUM_MEMBER__VALUE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__KEY_TYPE);
		createEReference(mappingEClass, MAPPING__VALUE_TYPE);
		createEAttribute(mappingEClass, MAPPING__DATA_LOCATION);

		modifierEClass = createEClass(MODIFIER);
		createEReference(modifierEClass, MODIFIER__PARAMETERS);
		createEAttribute(modifierEClass, MODIFIER__VIRTUAL);
		createEReference(modifierEClass, MODIFIER__OVERRIDE);

		mappingKeyTypeEClass = createEClass(MAPPING_KEY_TYPE);

		structMemberEClass = createEClass(STRUCT_MEMBER);
		createEReference(structMemberEClass, STRUCT_MEMBER__TYPE);

		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__CONTRACTS);
		createEReference(repositoryEClass, REPOSITORY__GLOBAL_FUNCTIONS);
		createEReference(repositoryEClass, REPOSITORY__GLOBAL_TYPES);

		constructorEClass = createEClass(CONSTRUCTOR);
		createEReference(constructorEClass, CONSTRUCTOR__PARAMETERS);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__TYPE);

		returnVariableEClass = createEClass(RETURN_VARIABLE);
		createEAttribute(returnVariableEClass, RETURN_VARIABLE__NAME);
		createEReference(returnVariableEClass, RETURN_VARIABLE__TYPE);

		structEClass = createEClass(STRUCT);
		createEReference(structEClass, STRUCT__MEMBERS);
		createEAttribute(structEClass, STRUCT__DATA_LOCATION);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__VARIABLES);
		createEReference(contractEClass, CONTRACT__PROVIDED_FUNCTIONS);
		createEReference(contractEClass, CONTRACT__CONSTRUCTOR);
		createEReference(contractEClass, CONTRACT__EVENTS);
		createEReference(contractEClass, CONTRACT__PARENTS);
		createEReference(contractEClass, CONTRACT__MODIFIERS);
		createEReference(contractEClass, CONTRACT__LOCAL_TYPES);
		createEReference(contractEClass, CONTRACT__REQUIRED_FUNCTIONS);
		createEReference(contractEClass, CONTRACT__LOCAL_FUNCTIONS);
		createEReference(contractEClass, CONTRACT__OVERRIDE_FUNCTIONS);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__NAME);
		createEReference(functionParameterEClass, FUNCTION_PARAMETER__TYPE);

		constructorParameterEClass = createEClass(CONSTRUCTOR_PARAMETER);
		createEAttribute(constructorParameterEClass, CONSTRUCTOR_PARAMETER__NAME);
		createEReference(constructorParameterEClass, CONSTRUCTOR_PARAMETER__TYPE);

		defaultArrayEClass = createEClass(DEFAULT_ARRAY);
		createEAttribute(defaultArrayEClass, DEFAULT_ARRAY__TYPE);
		createEAttribute(defaultArrayEClass, DEFAULT_ARRAY__DATA_LOCATION);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__VISIBILITY);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__MUTABILITY);
		createEReference(functionTypeEClass, FUNCTION_TYPE__PARAMETER_TYPES);
		createEReference(functionTypeEClass, FUNCTION_TYPE__RETURN_TYPES);

		contractTypeEClass = createEClass(CONTRACT_TYPE);
		createEReference(contractTypeEClass, CONTRACT_TYPE__CONTRACT);

		overrideFunctionEClass = createEClass(OVERRIDE_FUNCTION);
		createEReference(overrideFunctionEClass, OVERRIDE_FUNCTION__BASE);
		createEReference(overrideFunctionEClass, OVERRIDE_FUNCTION__OVERRIDING);
		createEReference(overrideFunctionEClass, OVERRIDE_FUNCTION__BASE_CONTRACTS);

		localFunctionEClass = createEClass(LOCAL_FUNCTION);
		createEAttribute(localFunctionEClass, LOCAL_FUNCTION__VISIBILITY);

		globalFunctionEClass = createEClass(GLOBAL_FUNCTION);
		createEAttribute(globalFunctionEClass, GLOBAL_FUNCTION__VISIBILITY);

		// Create enums
		variableVisibilityEEnum = createEEnum(VARIABLE_VISIBILITY);
		dataLocationEEnum = createEEnum(DATA_LOCATION);
		functionMutabilityEEnum = createEEnum(FUNCTION_MUTABILITY);
		functionTypeVisibilityEEnum = createEEnum(FUNCTION_TYPE_VISIBILITY);
		primitiveTypeEnumEEnum = createEEnum(PRIMITIVE_TYPE_ENUM);
		variableMutabilityEEnum = createEEnum(VARIABLE_MUTABILITY);
		defaultArrayEnumEEnum = createEEnum(DEFAULT_ARRAY_ENUM);
		localFunctionVisibilityEEnum = createEEnum(LOCAL_FUNCTION_VISIBILITY);
		globalFunctionVisibilityEEnum = createEEnum(GLOBAL_FUNCTION_VISIBILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customArrayEClass.getESuperTypes().add(this.getType());
		typeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		stateVariableEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		functionEClass.getESuperTypes().add(theIdentifierPackage.getEntity());
		enumEClass.getESuperTypes().add(this.getMappingKeyType());
		enumEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		eventEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		mappingEClass.getESuperTypes().add(this.getType());
		modifierEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		mappingKeyTypeEClass.getESuperTypes().add(this.getType());
		structMemberEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		primitiveTypeEClass.getESuperTypes().add(this.getMappingKeyType());
		structEClass.getESuperTypes().add(this.getType());
		structEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		contractEClass.getESuperTypes().add(theIdentifierPackage.getNamedElement());
		functionParameterEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		defaultArrayEClass.getESuperTypes().add(this.getMappingKeyType());
		functionTypeEClass.getESuperTypes().add(this.getType());
		contractTypeEClass.getESuperTypes().add(this.getMappingKeyType());
		overrideFunctionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		localFunctionEClass.getESuperTypes().add(this.getFunction());
		globalFunctionEClass.getESuperTypes().add(this.getFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(eventParameterEClass, EventParameter.class, "EventParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventParameter_Type(), this.getType(), null, "type", null, 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventParameter_Indexed(), ecorePackage.getEBoolean(), "indexed", null, 1, 1, EventParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customArrayEClass, CustomArray.class, "CustomArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomArray_Size(), ecorePackage.getEInt(), "size", null, 1, 1, CustomArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomArray_Type(), this.getType(), null, "type", null, 1, 1, CustomArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomArray_DataLocation(), this.getDataLocation(), "dataLocation", null, 0, 1, CustomArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierParameterEClass, ModifierParameter.class, "ModifierParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModifierParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModifierParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifierParameter_Type(), this.getType(), null, "type", null, 1, 1, ModifierParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateVariableEClass, StateVariable.class, "StateVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStateVariable_Mutability(), this.getVariableMutability(), "mutability", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateVariable_Visibility(), this.getVariableVisibility(), "visibility", null, 0, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateVariable_Type(), this.getType(), null, "type", null, 1, 1, StateVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_ReturnVariables(), this.getReturnVariable(), null, "returnVariables", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Mutability(), this.getFunctionMutability(), "mutability", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Virtual(), ecorePackage.getEBoolean(), "virtual", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Parameters(), this.getFunctionParameter(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumEClass, edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnum_Members(), this.getEnumMember(), null, "members", null, 1, 256, edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_Parameters(), this.getEventParameter(), null, "parameters", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Anonymous(), ecorePackage.getEBoolean(), "anonymous", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumMember_Value(), ecorePackage.getEString(), "value", null, 1, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_KeyType(), this.getMappingKeyType(), null, "keyType", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMapping_ValueType(), this.getType(), null, "valueType", null, 1, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapping_DataLocation(), this.getDataLocation(), "dataLocation", "storage", 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifierEClass, Modifier.class, "Modifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifier_Parameters(), this.getModifierParameter(), null, "parameters", null, 0, -1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModifier_Virtual(), ecorePackage.getEBoolean(), "virtual", null, 1, 1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModifier_Override(), this.getContract(), null, "override", null, 0, -1, Modifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingKeyTypeEClass, MappingKeyType.class, "MappingKeyType", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structMemberEClass, StructMember.class, "StructMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructMember_Type(), this.getType(), null, "type", null, 1, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Contracts(), this.getContract(), null, "contracts", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_GlobalFunctions(), this.getGlobalFunction(), null, "globalFunctions", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_GlobalTypes(), this.getType(), null, "globalTypes", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstructor_Parameters(), this.getConstructorParameter(), null, "parameters", null, 0, -1, Constructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_Type(), this.getPrimitiveTypeEnum(), "type", null, 1, 1, PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnVariableEClass, ReturnVariable.class, "ReturnVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturnVariable_Name(), ecorePackage.getEString(), "name", "", 0, 1, ReturnVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturnVariable_Type(), this.getType(), null, "type", null, 1, 1, ReturnVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStruct_Members(), this.getStructMember(), null, "members", null, 1, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStruct_DataLocation(), this.getDataLocation(), "dataLocation", null, 0, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_Variables(), this.getStateVariable(), null, "variables", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_ProvidedFunctions(), this.getGlobalFunction(), null, "providedFunctions", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Constructor(), this.getConstructor(), null, "constructor", null, 0, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Events(), this.getEvent(), null, "events", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Parents(), this.getContract(), null, "parents", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_Modifiers(), this.getModifier(), null, "modifiers", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_LocalTypes(), this.getType(), null, "localTypes", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_RequiredFunctions(), this.getGlobalFunction(), null, "requiredFunctions", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_LocalFunctions(), this.getLocalFunction(), null, "localFunctions", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContract_OverrideFunctions(), this.getOverrideFunction(), null, "overrideFunctions", null, 0, -1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionParameter_Type(), this.getType(), null, "type", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorParameterEClass, ConstructorParameter.class, "ConstructorParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstructorParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConstructorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstructorParameter_Type(), this.getType(), null, "type", null, 1, 1, ConstructorParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultArrayEClass, DefaultArray.class, "DefaultArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultArray_Type(), this.getDefaultArrayEnum(), "type", null, 1, 1, DefaultArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultArray_DataLocation(), this.getDataLocation(), "dataLocation", null, 0, 1, DefaultArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionType_Visibility(), this.getFunctionTypeVisibility(), "visibility", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionType_Mutability(), this.getFunctionMutability(), "mutability", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_ParameterTypes(), this.getType(), null, "parameterTypes", null, 0, -1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionType_ReturnTypes(), this.getType(), null, "returnTypes", null, 0, -1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractTypeEClass, ContractType.class, "ContractType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContractType_Contract(), this.getContract(), null, "contract", null, 1, 1, ContractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overrideFunctionEClass, OverrideFunction.class, "OverrideFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOverrideFunction_Base(), this.getFunction(), null, "base", null, 1, 1, OverrideFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverrideFunction_Overriding(), this.getFunction(), null, "overriding", null, 1, 1, OverrideFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOverrideFunction_BaseContracts(), this.getContract(), null, "baseContracts", null, 1, -1, OverrideFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(localFunctionEClass, LocalFunction.class, "LocalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocalFunction_Visibility(), this.getLocalFunctionVisibility(), "visibility", null, 0, 1, LocalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalFunctionEClass, GlobalFunction.class, "GlobalFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlobalFunction_Visibility(), this.getGlobalFunctionVisibility(), "visibility", null, 0, 1, GlobalFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(variableVisibilityEEnum, VariableVisibility.class, "VariableVisibility");
		addEEnumLiteral(variableVisibilityEEnum, VariableVisibility.PUBLIC);
		addEEnumLiteral(variableVisibilityEEnum, VariableVisibility.INTERNAL);
		addEEnumLiteral(variableVisibilityEEnum, VariableVisibility.PRIVATE);

		initEEnum(dataLocationEEnum, DataLocation.class, "DataLocation");
		addEEnumLiteral(dataLocationEEnum, DataLocation.STORAGE);
		addEEnumLiteral(dataLocationEEnum, DataLocation.MEMORY);
		addEEnumLiteral(dataLocationEEnum, DataLocation.CALLDATA);

		initEEnum(functionMutabilityEEnum, FunctionMutability.class, "FunctionMutability");
		addEEnumLiteral(functionMutabilityEEnum, FunctionMutability.DEFAULT);
		addEEnumLiteral(functionMutabilityEEnum, FunctionMutability.PURE);
		addEEnumLiteral(functionMutabilityEEnum, FunctionMutability.VIEW);
		addEEnumLiteral(functionMutabilityEEnum, FunctionMutability.PAYABLE);

		initEEnum(functionTypeVisibilityEEnum, FunctionTypeVisibility.class, "FunctionTypeVisibility");
		addEEnumLiteral(functionTypeVisibilityEEnum, FunctionTypeVisibility.INTERNAL);
		addEEnumLiteral(functionTypeVisibilityEEnum, FunctionTypeVisibility.EXTERNAL);

		initEEnum(primitiveTypeEnumEEnum, PrimitiveTypeEnum.class, "PrimitiveTypeEnum");
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BOOL);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.ADDRESS);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.ADDRESS_PAYABLE);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES1);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES2);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES3);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES4);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES5);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES6);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES7);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES8);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES9);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES10);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES11);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES12);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES13);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES14);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES15);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES16);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES17);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES18);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES19);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES20);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES21);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES22);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES23);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES24);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES25);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES26);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES27);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES28);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES29);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES30);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES31);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.BYTES32);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT8);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT16);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT24);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT32);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT40);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT48);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT56);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT64);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT72);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT80);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT88);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT96);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT104);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT112);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT120);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT128);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT136);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT144);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT152);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT160);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT168);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT176);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT184);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT192);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT200);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT208);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT216);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT224);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT232);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT240);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT248);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.INT256);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT8);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT16);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT24);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT32);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT40);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT48);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT56);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT64);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT72);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT80);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT88);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT96);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT104);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT112);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT120);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT128);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT136);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT144);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT152);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT160);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT168);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT176);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT184);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT192);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT200);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT208);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT216);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT224);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT232);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT240);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT248);
		addEEnumLiteral(primitiveTypeEnumEEnum, PrimitiveTypeEnum.UINT256);

		initEEnum(variableMutabilityEEnum, VariableMutability.class, "VariableMutability");
		addEEnumLiteral(variableMutabilityEEnum, VariableMutability.DEFAULT);
		addEEnumLiteral(variableMutabilityEEnum, VariableMutability.CONSTANT);
		addEEnumLiteral(variableMutabilityEEnum, VariableMutability.IMMUTABLE);

		initEEnum(defaultArrayEnumEEnum, DefaultArrayEnum.class, "DefaultArrayEnum");
		addEEnumLiteral(defaultArrayEnumEEnum, DefaultArrayEnum.BYTES);
		addEEnumLiteral(defaultArrayEnumEEnum, DefaultArrayEnum.STRING);

		initEEnum(localFunctionVisibilityEEnum, LocalFunctionVisibility.class, "LocalFunctionVisibility");
		addEEnumLiteral(localFunctionVisibilityEEnum, LocalFunctionVisibility.INTERNAL);
		addEEnumLiteral(localFunctionVisibilityEEnum, LocalFunctionVisibility.PRIVATE);

		initEEnum(globalFunctionVisibilityEEnum, GlobalFunctionVisibility.class, "GlobalFunctionVisibility");
		addEEnumLiteral(globalFunctionVisibilityEEnum, GlobalFunctionVisibility.PUBLIC);
		addEEnumLiteral(globalFunctionVisibilityEEnum, GlobalFunctionVisibility.EXTERNAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (stateVariableEClass,
		   source,
		   new String[] {
			   "constraints", "ImmutableOnlyAllowedForValueTypes ConstantOnlyAllowedForValueTypesOrString DataLocationOfDefaultArrayMustBeStorage DataLocationOfCustomArrayMustBeStorage DataLocationOfMappingMustBeStorage DataLocationOfStructMustBeStorage"
		   });
		addAnnotation
		  (functionEClass,
		   source,
		   new String[] {
			   "constraints", "FunctionParameterNamesAndReturnVariableNamesMustBeUnique"
		   });
		addAnnotation
		  (enumEClass,
		   source,
		   new String[] {
			   "constraints", "EnumMemberNamesMustBeUnique"
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "constraints", "EventParameterNamesMustBeUnique Max3IndexedParametersForEvent"
		   });
		addAnnotation
		  (mappingEClass,
		   source,
		   new String[] {
			   "constraints", "DataLocationOfMappingMustBeStorage"
		   });
		addAnnotation
		  (modifierEClass,
		   source,
		   new String[] {
			   "constraints", "ModifierParameterNamesMustBeUnique BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual"
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "constraints", "ContractNameMustBeUnique GlobalFunctionsMustBePublicOrExternal GlobalFunctionCanOnlyUseGlobalTypes LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes"
		   });
		addAnnotation
		  (constructorEClass,
		   source,
		   new String[] {
			   "constraints", "ConstructorParameterNamesMustBeUnique"
		   });
		addAnnotation
		  (structEClass,
		   source,
		   new String[] {
			   "constraints", "StructCannotContainItself StructMemberNamesMustBeUnique"
		   });
		addAnnotation
		  (contractEClass,
		   source,
		   new String[] {
			   "constraints", "ModifierNamesMustBeUnique StateVariableNamesMustBeUnique ContractCannotInheritFromItself ContractsReferencedInFunctionOverridesMustBeIncludedInParents ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents ContractMustContainOverrridingFunctions"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "constraints", "ExternalFunctionTypeCannotUseMappingAsParameter ExternalFunctionTypeCannotUseMappingAsReturnVariable"
		   });
		addAnnotation
		  (overrideFunctionEClass,
		   source,
		   new String[] {
			   "constraints", "BaseFunctionCannotBePrivate OverridingFunctionCannotBePrivate BaseFunctionMustBeIncludedInBaseContract BaseAndOverridingFunctionMustHaveSameName BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes LocalFunctionsCanOnlyBeOverriddenByLocalFunctions GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions OverridingVisibilityOnlyFromExternalToPublicAllowed OverrideMutabilityOnlyFromDefaultToViewToPureAllowed"
		   });
		addAnnotation
		  (localFunctionEClass,
		   source,
		   new String[] {
			   "constraints", "PrivateFunctionsCannotBeVirtual"
		   });
		addAnnotation
		  (globalFunctionEClass,
		   source,
		   new String[] {
			   "constraints", "PublicFunctionCannotUseMappingAsParameter PublicFunctionCannotUseMappingAsReturnVariable ExternalFunctionCannotUseMappingAsParameter ExternalFunctionCannotUseMappingAsReturnVariable"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (stateVariableEClass,
		   source,
		   new String[] {
			   "ImmutableOnlyAllowedForValueTypes", "mutability = VariableMutability::immutable implies type.oclIsTypeOf(PrimitiveType) or type.oclIsTypeOf(ContractType) or type.oclIsTypeOf(Enum)",
			   "ConstantOnlyAllowedForValueTypesOrString", "mutability = VariableMutability::immutable implies type.oclIsTypeOf(PrimitiveType) or type.oclIsTypeOf(ContractType) or type.oclIsTypeOf(Enum) or (type.oclIsTypeOf(DefaultArray) and type.oclAsType(DefaultArray).type = DefaultArrayEnum::string)",
			   "DataLocationOfDefaultArrayMustBeStorage", "type.oclIsTypeOf(DefaultArray) implies type.oclAsType(DefaultArray).dataLocation = DataLocation::storage",
			   "DataLocationOfCustomArrayMustBeStorage", "type.oclIsTypeOf(CustomArray) implies type.oclAsType(CustomArray).dataLocation = DataLocation::storage",
			   "DataLocationOfMappingMustBeStorage", "type.oclIsTypeOf(Mapping) implies type.oclAsType(Mapping).dataLocation = DataLocation::storage",
			   "DataLocationOfStructMustBeStorage", "type.oclIsTypeOf(Struct) implies type.oclAsType(Struct).dataLocation = DataLocation::storage"
		   });
		addAnnotation
		  (functionEClass,
		   source,
		   new String[] {
			   "FunctionParameterNamesAndReturnVariableNamesMustBeUnique", "self.parameters -> collect(name) -> union(self.returnVariables -> collect(name)) -> isUnique(x|x)"
		   });
		addAnnotation
		  (enumEClass,
		   source,
		   new String[] {
			   "EnumMemberNamesMustBeUnique", "self.members -> isUnique(value)"
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "EventParameterNamesMustBeUnique", "self.parameters -> isUnique(name)",
			   "Max3IndexedParametersForEvent", "self.parameters -> collect(indexed) -> count(true) <= 3"
		   });
		addAnnotation
		  (mappingEClass,
		   source,
		   new String[] {
			   "DataLocationOfMappingMustBeStorage", "dataLocation = DataLocation::storage"
		   });
		addAnnotation
		  (modifierEClass,
		   source,
		   new String[] {
			   "ModifierParameterNamesMustBeUnique", "self.parameters -> isUnique(name)",
			   "BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual", "override -> notEmpty() implies override -> forAll(c|c.modifiers ->  exists(m|m.entityName = entityName and m.parameters -> collect(name) = parameters -> collect(name) and m.virtual = true))"
		   });
		addAnnotation
		  (repositoryEClass,
		   source,
		   new String[] {
			   "ContractNameMustBeUnique", "contracts -> isUnique(entityName)",
			   "GlobalFunctionsMustBePublicOrExternal", "globalFunctions -> collect(visibility) -> excludesAll(Set{LocalFunctionVisibility::private, LocalFunctionVisibility::internal})",
			   "GlobalFunctionCanOnlyUseGlobalTypes", "globalTypes -> includesAll(globalFunctions -> collect(returnVariables) -> collect(type) -> union(globalFunctions -> collect(parameters) -> collect(type)))",
			   "LocalFunctionsCanOnlyUseLocalTypesOfContractOrGlobalTypes", "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.localFunctions -> collect(parameters) -> collect(type) -> union(c.localFunctions -> collect(returnVariables) -> collect(type))))",
			   "VariablesCanOnlyUseLocalTypesOfContractOrGlobalTypes", "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.variables -> collect(type)))",
			   "EventsCanOnlyUseLocalTypesOfContractOrGlobalTypes", "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.events -> collect(parameters) -> collect(type)))",
			   "ModifiersCanOnlyUseLocalTypesOfContractOrGlobalTypes", "contracts -> forAll(c|c.localTypes -> union(globalTypes) -> includesAll(c.modifiers -> collect(parameters) -> collect(type)))"
		   });
		addAnnotation
		  (constructorEClass,
		   source,
		   new String[] {
			   "ConstructorParameterNamesMustBeUnique", "parameters -> isUnique(name)"
		   });
		addAnnotation
		  (structEClass,
		   source,
		   new String[] {
			   "StructCannotContainItself", "self.members -> collect(type) -> excludes(self)",
			   "StructMemberNamesMustBeUnique", "self.members -> isUnique(entityName)"
		   });
		addAnnotation
		  (contractEClass,
		   source,
		   new String[] {
			   "ModifierNamesMustBeUnique", "self.modifiers -> isUnique(entityName)",
			   "StateVariableNamesMustBeUnique", "self.variables -> isUnique(entityName)",
			   "ContractCannotInheritFromItself", "parents->excludes(self)",
			   "ContractsReferencedInFunctionOverridesMustBeIncludedInParents", "parents -> includesAll(overrideFunctions -> collect(baseContracts))",
			   "ContractsReferencedInOverrideOfModifiersMustBeIncludedInParents", "parents -> includesAll(modifiers -> collect(override))",
			   "ContractMustContainOverrridingFunctions", "overrideFunctions -> forAll(f|localFunctions -> union(providedFunctions) -> includes(f.overriding))"
		   });
		addAnnotation
		  (functionTypeEClass,
		   source,
		   new String[] {
			   "ExternalFunctionTypeCannotUseMappingAsParameter", "visibility = FunctionTypeVisibility::external implies parameterTypes -> excludes(Mapping)",
			   "ExternalFunctionTypeCannotUseMappingAsReturnVariable", "visibility = FunctionTypeVisibility::external implies returnTypes -> excludes(Mapping)"
		   });
		addAnnotation
		  (overrideFunctionEClass,
		   source,
		   new String[] {
			   "BaseFunctionCannotBePrivate", "base.oclIsTypeOf(LocalFunction) implies base.oclAsType(LocalFunction).visibility <> LocalFunctionVisibility::private",
			   "OverridingFunctionCannotBePrivate", "overriding.oclIsTypeOf(LocalFunction) implies overriding.oclAsType(LocalFunction).visibility <> LocalFunctionVisibility::private",
			   "BaseFunctionMustBeIncludedInBaseContract", "baseContracts -> forAll(c| c.localFunctions -> union(c.providedFunctions) -> includes(base))",
			   "BaseAndOverridingFunctionMustHaveSameName", "base.entityName = overriding.entityName",
			   "BaseAndOverridingFunctionMustHaveSameParameterNameAndTypes", "Sequence{1..base.parameters -> size()} -> forAll(i| base.parameters -> at(i) -> collect(name) = overriding.parameters -> at(i) -> collect(name) and base.parameters -> at(i) -> collect(type) = overriding.parameters -> at(i) -> collect(type))",
			   "LocalFunctionsCanOnlyBeOverriddenByLocalFunctions", "base.oclIsTypeOf(LocalFunction) implies overriding.oclIsTypeOf(LocalFunction)",
			   "GlobalFunctionsCanOnlyBeOverriddenByGlobalFunctions", "base.oclIsTypeOf(GlobalFunction) implies overriding.oclIsTypeOf(GlobalFunction)",
			   "OverridingVisibilityOnlyFromExternalToPublicAllowed", "(base.oclIsTypeOf(GlobalFunction) and overriding.oclIsTypeOf(GlobalFunction)) implies base.oclAsType(GlobalFunction).visibility = overriding.oclAsType(GlobalFunction).visibility or (base.oclAsType(GlobalFunction).visibility = GlobalFunctionVisibility::external and overriding.oclAsType(GlobalFunction).visibility = GlobalFunctionVisibility::public)",
			   "OverrideMutabilityOnlyFromDefaultToViewToPureAllowed", "base.mutability = overriding.mutability or (base.mutability = FunctionMutability::default and (overriding.mutability = FunctionMutability::view or overriding.mutability = FunctionMutability::pure) or (base.mutability = FunctionMutability::view and overriding.mutability = FunctionMutability::pure))"
		   });
		addAnnotation
		  (localFunctionEClass,
		   source,
		   new String[] {
			   "PrivateFunctionsCannotBeVirtual", "visibility = LocalFunctionVisibility::private implies virtual = false"
		   });
		addAnnotation
		  (globalFunctionEClass,
		   source,
		   new String[] {
			   "PublicFunctionCannotUseMappingAsParameter", "visibility = GlobalFunctionVisibility::public implies parameters -> collect(type) -> excludes(Mapping)",
			   "PublicFunctionCannotUseMappingAsReturnVariable", "visibility = GlobalFunctionVisibility::public implies returnVariables -> collect(type) -> excludes(Mapping)",
			   "ExternalFunctionCannotUseMappingAsParameter", "visibility = GlobalFunctionVisibility::external implies parameters -> collect(type) -> excludes(Mapping)",
			   "ExternalFunctionCannotUseMappingAsReturnVariable", "visibility = GlobalFunctionVisibility::external implies returnVariables -> collect(type) -> excludes(Mapping)"
		   });
	}

} //SolidityContractsPackageImpl
