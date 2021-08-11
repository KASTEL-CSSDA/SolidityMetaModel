/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.util;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ContractType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EnumMember;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tools.mdsd.modelingfoundations.identifier.Entity;
import tools.mdsd.modelingfoundations.identifier.Identifier;
import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage
 * @generated
 */
public class SolidityContractsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SolidityContractsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidityContractsSwitch() {
		if (modelPackage == null) {
			modelPackage = SolidityContractsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SolidityContractsPackage.EVENT_PARAMETER: {
				EventParameter eventParameter = (EventParameter)theEObject;
				T result = caseEventParameter(eventParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.CUSTOM_ARRAY: {
				CustomArray customArray = (CustomArray)theEObject;
				T result = caseCustomArray(customArray);
				if (result == null) result = caseType(customArray);
				if (result == null) result = caseIdentifier(customArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.MODIFIER_PARAMETER: {
				ModifierParameter modifierParameter = (ModifierParameter)theEObject;
				T result = caseModifierParameter(modifierParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseIdentifier(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.STATE_VARIABLE: {
				StateVariable stateVariable = (StateVariable)theEObject;
				T result = caseStateVariable(stateVariable);
				if (result == null) result = caseEntity(stateVariable);
				if (result == null) result = caseIdentifier(stateVariable);
				if (result == null) result = caseNamedElement(stateVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseEntity(function);
				if (result == null) result = caseIdentifier(function);
				if (result == null) result = caseNamedElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.ENUM: {
				edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum enum_ = (edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseMappingKeyType(enum_);
				if (result == null) result = caseNamedElement(enum_);
				if (result == null) result = caseType(enum_);
				if (result == null) result = caseIdentifier(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.ENUM_MEMBER: {
				EnumMember enumMember = (EnumMember)theEObject;
				T result = caseEnumMember(enumMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.MAPPING: {
				Mapping mapping = (Mapping)theEObject;
				T result = caseMapping(mapping);
				if (result == null) result = caseType(mapping);
				if (result == null) result = caseIdentifier(mapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.MODIFIER: {
				Modifier modifier = (Modifier)theEObject;
				T result = caseModifier(modifier);
				if (result == null) result = caseNamedElement(modifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.MAPPING_KEY_TYPE: {
				MappingKeyType mappingKeyType = (MappingKeyType)theEObject;
				T result = caseMappingKeyType(mappingKeyType);
				if (result == null) result = caseType(mappingKeyType);
				if (result == null) result = caseIdentifier(mappingKeyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.STRUCT_MEMBER: {
				StructMember structMember = (StructMember)theEObject;
				T result = caseStructMember(structMember);
				if (result == null) result = caseNamedElement(structMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.REPOSITORY: {
				Repository repository = (Repository)theEObject;
				T result = caseRepository(repository);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.PRIMITIVE_TYPE: {
				PrimitiveType primitiveType = (PrimitiveType)theEObject;
				T result = casePrimitiveType(primitiveType);
				if (result == null) result = caseMappingKeyType(primitiveType);
				if (result == null) result = caseType(primitiveType);
				if (result == null) result = caseIdentifier(primitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.RETURN_VARIABLE: {
				ReturnVariable returnVariable = (ReturnVariable)theEObject;
				T result = caseReturnVariable(returnVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.STRUCT: {
				Struct struct = (Struct)theEObject;
				T result = caseStruct(struct);
				if (result == null) result = caseType(struct);
				if (result == null) result = caseNamedElement(struct);
				if (result == null) result = caseIdentifier(struct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = caseNamedElement(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.FUNCTION_PARAMETER: {
				FunctionParameter functionParameter = (FunctionParameter)theEObject;
				T result = caseFunctionParameter(functionParameter);
				if (result == null) result = caseIdentifier(functionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.CONSTRUCTOR_PARAMETER: {
				ConstructorParameter constructorParameter = (ConstructorParameter)theEObject;
				T result = caseConstructorParameter(constructorParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.DEFAULT_ARRAY: {
				DefaultArray defaultArray = (DefaultArray)theEObject;
				T result = caseDefaultArray(defaultArray);
				if (result == null) result = caseMappingKeyType(defaultArray);
				if (result == null) result = caseType(defaultArray);
				if (result == null) result = caseIdentifier(defaultArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = caseType(functionType);
				if (result == null) result = caseIdentifier(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.CONTRACT_TYPE: {
				ContractType contractType = (ContractType)theEObject;
				T result = caseContractType(contractType);
				if (result == null) result = caseMappingKeyType(contractType);
				if (result == null) result = caseType(contractType);
				if (result == null) result = caseIdentifier(contractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.OVERRIDE_FUNCTION: {
				OverrideFunction overrideFunction = (OverrideFunction)theEObject;
				T result = caseOverrideFunction(overrideFunction);
				if (result == null) result = caseIdentifier(overrideFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.LOCAL_FUNCTION: {
				LocalFunction localFunction = (LocalFunction)theEObject;
				T result = caseLocalFunction(localFunction);
				if (result == null) result = caseFunction(localFunction);
				if (result == null) result = caseEntity(localFunction);
				if (result == null) result = caseIdentifier(localFunction);
				if (result == null) result = caseNamedElement(localFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SolidityContractsPackage.GLOBAL_FUNCTION: {
				GlobalFunction globalFunction = (GlobalFunction)theEObject;
				T result = caseGlobalFunction(globalFunction);
				if (result == null) result = caseFunction(globalFunction);
				if (result == null) result = caseEntity(globalFunction);
				if (result == null) result = caseIdentifier(globalFunction);
				if (result == null) result = caseNamedElement(globalFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventParameter(EventParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomArray(CustomArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifierParameter(ModifierParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateVariable(StateVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumMember(EnumMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapping(Mapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifier(Modifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingKeyType(MappingKeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructMember(StructMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepository(Repository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType(PrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnVariable(ReturnVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStruct(Struct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContract(Contract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructorParameter(ConstructorParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultArray(DefaultArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractType(ContractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Override Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Override Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOverrideFunction(OverrideFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalFunction(LocalFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalFunction(GlobalFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SolidityContractsSwitch
