/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.util;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.*;

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
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage
 * @generated
 */
public class SoliditySystemValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SoliditySystemValidator INSTANCE = new SoliditySystemValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.kit.kastel.sdq.soliditymetamodel.soliditysystem";

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
	public SoliditySystemValidator() {
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
	  return SoliditySystemPackage.eINSTANCE;
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
			case SoliditySystemPackage.SYSTEM_ASSEMBLY:
				return validateSystemAssembly((SystemAssembly)value, diagnostics, context);
			case SoliditySystemPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case SoliditySystemPackage.CONNECTOR:
				return validateConnector((Connector)value, diagnostics, context);
			case SoliditySystemPackage.PROVIDED_INTERFACE:
				return validateProvidedInterface((ProvidedInterface)value, diagnostics, context);
			case SoliditySystemPackage.REQUIRED_INTERFACE:
				return validateRequiredInterface((RequiredInterface)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemAssembly(SystemAssembly systemAssembly, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemAssembly, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemAssembly, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(systemAssembly, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstance_ProvidedInterfacesMustContainProvidedFunctionsFromContract(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstance_RequiredInterfacesMustContainRequiredFunctionsFromContract(instance, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ProvidedInterfacesMustContainProvidedFunctionsFromContract constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE__PROVIDED_INTERFACES_MUST_CONTAIN_PROVIDED_FUNCTIONS_FROM_CONTRACT__EEXPRESSION = "contract.providedFunctions -> includesAll(providedInterfaces->collect(function))";

	/**
	 * Validates the ProvidedInterfacesMustContainProvidedFunctionsFromContract constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance_ProvidedInterfacesMustContainProvidedFunctionsFromContract(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoliditySystemPackage.Literals.INSTANCE,
				 instance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ProvidedInterfacesMustContainProvidedFunctionsFromContract",
				 INSTANCE__PROVIDED_INTERFACES_MUST_CONTAIN_PROVIDED_FUNCTIONS_FROM_CONTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RequiredInterfacesMustContainRequiredFunctionsFromContract constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCE__REQUIRED_INTERFACES_MUST_CONTAIN_REQUIRED_FUNCTIONS_FROM_CONTRACT__EEXPRESSION = "contract.requiredFunctions -> includesAll(requiredInterfaces->collect(function))";

	/**
	 * Validates the RequiredInterfacesMustContainRequiredFunctionsFromContract constraint of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance_RequiredInterfacesMustContainRequiredFunctionsFromContract(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoliditySystemPackage.Literals.INSTANCE,
				 instance,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RequiredInterfacesMustContainRequiredFunctionsFromContract",
				 INSTANCE__REQUIRED_INTERFACES_MUST_CONTAIN_REQUIRED_FUNCTIONS_FROM_CONTRACT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connector, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(connector, diagnostics, context);
		if (result || diagnostics != null) result &= validateConnector_InterfacesMustMatch(connector, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InterfacesMustMatch constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTOR__INTERFACES_MUST_MATCH__EEXPRESSION = "providedInterface.function = requiredInterface.function";

	/**
	 * Validates the InterfacesMustMatch constraint of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnector_InterfacesMustMatch(Connector connector, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SoliditySystemPackage.Literals.CONNECTOR,
				 connector,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "InterfacesMustMatch",
				 CONNECTOR__INTERFACES_MUST_MATCH__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidedInterface(ProvidedInterface providedInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(providedInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(providedInterface, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(providedInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredInterface(RequiredInterface requiredInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requiredInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requiredInterface, diagnostics, context);
		if (result || diagnostics != null) result &= identifierValidator.validateIdentifier_identifierIsUnique(requiredInterface, diagnostics, context);
		return result;
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

} //SoliditySystemValidator
