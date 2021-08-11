/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import tools.mdsd.modelingfoundations.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface SolidityContractsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "soliditycontracts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.kastel.kit.edu/SolidityMetaModel/soliditycontracts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "soliditycontracts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolidityContractsPackage eINSTANCE = edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventParameterImpl <em>Event Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventParameterImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEventParameter()
	 * @generated
	 */
	int EVENT_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Indexed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER__INDEXED = 2;

	/**
	 * The number of structural features of the '<em>Event Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl <em>Custom Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getCustomArray()
	 * @generated
	 */
	int CUSTOM_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ARRAY__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ARRAY__SIZE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ARRAY__TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ARRAY__DATA_LOCATION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Custom Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ARRAY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Custom Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ARRAY_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierParameterImpl <em>Modifier Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierParameterImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getModifierParameter()
	 * @generated
	 */
	int MODIFIER_PARAMETER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Modifier Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Modifier Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StateVariableImpl <em>State Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StateVariableImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getStateVariable()
	 * @generated
	 */
	int STATE_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__MUTABILITY = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__VISIBILITY = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE__TYPE = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>State Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_VARIABLE_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = IdentifierPackage.ENTITY__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ENTITY_NAME = IdentifierPackage.ENTITY__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Return Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RETURN_VARIABLES = IdentifierPackage.ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MUTABILITY = IdentifierPackage.ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__MODIFIERS = IdentifierPackage.ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__VIRTUAL = IdentifierPackage.ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = IdentifierPackage.ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = IdentifierPackage.ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = IdentifierPackage.ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType <em>Mapping Key Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getMappingKeyType()
	 * @generated
	 */
	int MAPPING_KEY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_KEY_TYPE__ID = TYPE__ID;

	/**
	 * The number of structural features of the '<em>Mapping Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_KEY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mapping Key Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_KEY_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ID = MAPPING_KEY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ENTITY_NAME = MAPPING_KEY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__MEMBERS = MAPPING_KEY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = MAPPING_KEY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = MAPPING_KEY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 7;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ENTITY_NAME = IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARAMETERS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__ANONYMOUS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = IdentifierPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumMemberImpl <em>Enum Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumMemberImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEnumMember()
	 * @generated
	 */
	int ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Enum Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__KEY_TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__VALUE_TYPE = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__DATA_LOCATION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl <em>Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getModifier()
	 * @generated
	 */
	int MODIFIER = 10;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__ENTITY_NAME = IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__PARAMETERS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__VIRTUAL = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER__OVERRIDE = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_FEATURE_COUNT = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIER_OPERATION_COUNT = IdentifierPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructMemberImpl <em>Struct Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructMemberImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getStructMember()
	 * @generated
	 */
	int STRUCT_MEMBER = 12;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__ENTITY_NAME = IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER__TYPE = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_FEATURE_COUNT = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Struct Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_MEMBER_OPERATION_COUNT = IdentifierPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 13;

	/**
	 * The feature id for the '<em><b>Contracts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__CONTRACTS = 0;

	/**
	 * The feature id for the '<em><b>Global Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GLOBAL_FUNCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Global Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__GLOBAL_TYPES = 2;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 14;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PARAMETERS = 0;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.PrimitiveTypeImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ID = MAPPING_KEY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TYPE = MAPPING_KEY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = MAPPING_KEY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = MAPPING_KEY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ReturnVariableImpl <em>Return Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ReturnVariableImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getReturnVariable()
	 * @generated
	 */
	int RETURN_VARIABLE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Return Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Return Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructImpl <em>Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getStruct()
	 * @generated
	 */
	int STRUCT = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__ENTITY_NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__MEMBERS = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT__DATA_LOCATION = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCT_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 18;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ENTITY_NAME = IdentifierPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__VARIABLES = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PROVIDED_FUNCTIONS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constructor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CONSTRUCTOR = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__EVENTS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PARENTS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__MODIFIERS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Local Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__LOCAL_TYPES = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Required Functions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__REQUIRED_FUNCTIONS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Local Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__LOCAL_FUNCTIONS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Override Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__OVERRIDE_FUNCTIONS = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = IdentifierPackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_OPERATION_COUNT = IdentifierPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionParameterImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__TYPE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorParameterImpl <em>Constructor Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorParameterImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getConstructorParameter()
	 * @generated
	 */
	int CONSTRUCTOR_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PARAMETER__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Constructor Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constructor Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.DefaultArrayImpl <em>Default Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.DefaultArrayImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getDefaultArray()
	 * @generated
	 */
	int DEFAULT_ARRAY = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARRAY__ID = MAPPING_KEY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARRAY__TYPE = MAPPING_KEY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARRAY__DATA_LOCATION = MAPPING_KEY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARRAY_FEATURE_COUNT = MAPPING_KEY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Default Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_ARRAY_OPERATION_COUNT = MAPPING_KEY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__ID = TYPE__ID;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__VISIBILITY = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__MUTABILITY = TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__PARAMETER_TYPES = TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Return Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__RETURN_TYPES = TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractTypeImpl <em>Contract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractTypeImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getContractType()
	 * @generated
	 */
	int CONTRACT_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_TYPE__ID = MAPPING_KEY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_TYPE__CONTRACT = MAPPING_KEY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_TYPE_FEATURE_COUNT = MAPPING_KEY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_TYPE_OPERATION_COUNT = MAPPING_KEY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl <em>Override Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getOverrideFunction()
	 * @generated
	 */
	int OVERRIDE_FUNCTION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_FUNCTION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_FUNCTION__BASE = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Overriding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_FUNCTION__OVERRIDING = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Contracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_FUNCTION__BASE_CONTRACTS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Override Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_FUNCTION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Override Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OVERRIDE_FUNCTION_OPERATION_COUNT = IdentifierPackage.IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.LocalFunctionImpl <em>Local Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.LocalFunctionImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getLocalFunction()
	 * @generated
	 */
	int LOCAL_FUNCTION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__ENTITY_NAME = FUNCTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Return Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__RETURN_VARIABLES = FUNCTION__RETURN_VARIABLES;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__MUTABILITY = FUNCTION__MUTABILITY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__MODIFIERS = FUNCTION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__VIRTUAL = FUNCTION__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION__VISIBILITY = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.GlobalFunctionImpl <em>Global Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.GlobalFunctionImpl
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getGlobalFunction()
	 * @generated
	 */
	int GLOBAL_FUNCTION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__ID = FUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__ENTITY_NAME = FUNCTION__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Return Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__RETURN_VARIABLES = FUNCTION__RETURN_VARIABLES;

	/**
	 * The feature id for the '<em><b>Mutability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__MUTABILITY = FUNCTION__MUTABILITY;

	/**
	 * The feature id for the '<em><b>Modifiers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__MODIFIERS = FUNCTION__MODIFIERS;

	/**
	 * The feature id for the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__VIRTUAL = FUNCTION__VIRTUAL;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION__VISIBILITY = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Global Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Global Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FUNCTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility <em>Variable Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getVariableVisibility()
	 * @generated
	 */
	int VARIABLE_VISIBILITY = 27;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation <em>Data Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getDataLocation()
	 * @generated
	 */
	int DATA_LOCATION = 28;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability <em>Function Mutability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionMutability()
	 * @generated
	 */
	int FUNCTION_MUTABILITY = 29;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility <em>Function Type Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionTypeVisibility()
	 * @generated
	 */
	int FUNCTION_TYPE_VISIBILITY = 30;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getPrimitiveTypeEnum()
	 * @generated
	 */
	int PRIMITIVE_TYPE_ENUM = 31;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability <em>Variable Mutability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getVariableMutability()
	 * @generated
	 */
	int VARIABLE_MUTABILITY = 32;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum <em>Default Array Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getDefaultArrayEnum()
	 * @generated
	 */
	int DEFAULT_ARRAY_ENUM = 33;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility <em>Local Function Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getLocalFunctionVisibility()
	 * @generated
	 */
	int LOCAL_FUNCTION_VISIBILITY = 34;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility <em>Global Function Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getGlobalFunctionVisibility()
	 * @generated
	 */
	int GLOBAL_FUNCTION_VISIBILITY = 35;


	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter <em>Event Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Parameter</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter
	 * @generated
	 */
	EClass getEventParameter();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter#getType()
	 * @see #getEventParameter()
	 * @generated
	 */
	EReference getEventParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter#getName()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter#isIndexed <em>Indexed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexed</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EventParameter#isIndexed()
	 * @see #getEventParameter()
	 * @generated
	 */
	EAttribute getEventParameter_Indexed();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray <em>Custom Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Array</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray
	 * @generated
	 */
	EClass getCustomArray();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray#getSize()
	 * @see #getCustomArray()
	 * @generated
	 */
	EAttribute getCustomArray_Size();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray#getType()
	 * @see #getCustomArray()
	 * @generated
	 */
	EReference getCustomArray_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray#getDataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Location</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray#getDataLocation()
	 * @see #getCustomArray()
	 * @generated
	 */
	EAttribute getCustomArray_DataLocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter <em>Modifier Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier Parameter</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter
	 * @generated
	 */
	EClass getModifierParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter#getName()
	 * @see #getModifierParameter()
	 * @generated
	 */
	EAttribute getModifierParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter#getType()
	 * @see #getModifierParameter()
	 * @generated
	 */
	EReference getModifierParameter_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable <em>State Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Variable</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable
	 * @generated
	 */
	EClass getStateVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getMutability <em>Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutability</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getMutability()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Mutability();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getVisibility()
	 * @see #getStateVariable()
	 * @generated
	 */
	EAttribute getStateVariable_Visibility();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable#getType()
	 * @see #getStateVariable()
	 * @generated
	 */
	EReference getStateVariable_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getReturnVariables <em>Return Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Variables</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getReturnVariables()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_ReturnVariables();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getMutability <em>Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutability</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getMutability()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Mutability();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modifiers</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getModifiers()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Modifiers();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#isVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#isVirtual()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Virtual();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Enum#getMembers()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_Members();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event#getParameters()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event#isAnonymous <em>Anonymous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anonymous</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event#isAnonymous()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Anonymous();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Member</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EnumMember
	 * @generated
	 */
	EClass getEnumMember();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EnumMember#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.EnumMember#getValue()
	 * @see #getEnumMember()
	 * @generated
	 */
	EAttribute getEnumMember_Value();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getKeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getKeyType()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_KeyType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getValueType()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getDataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Location</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getDataLocation()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_DataLocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifier</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier
	 * @generated
	 */
	EClass getModifier();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getParameters()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#isVirtual <em>Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#isVirtual()
	 * @see #getModifier()
	 * @generated
	 */
	EAttribute getModifier_Virtual();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Override</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getOverride()
	 * @see #getModifier()
	 * @generated
	 */
	EReference getModifier_Override();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType <em>Mapping Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Key Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType
	 * @generated
	 */
	EClass getMappingKeyType();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember <em>Struct Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct Member</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember
	 * @generated
	 */
	EClass getStructMember();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember#getType()
	 * @see #getStructMember()
	 * @generated
	 */
	EReference getStructMember_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getContracts <em>Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contracts</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getContracts()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Contracts();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getGlobalFunctions <em>Global Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Functions</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getGlobalFunctions()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_GlobalFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getGlobalTypes <em>Global Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Types</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository#getGlobalTypes()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_GlobalTypes();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor#getParameters()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Parameters();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveType#getType()
	 * @see #getPrimitiveType()
	 * @generated
	 */
	EAttribute getPrimitiveType_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable <em>Return Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return Variable</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable
	 * @generated
	 */
	EClass getReturnVariable();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable#getName()
	 * @see #getReturnVariable()
	 * @generated
	 */
	EAttribute getReturnVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable#getType()
	 * @see #getReturnVariable()
	 * @generated
	 */
	EReference getReturnVariable_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Struct</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct
	 * @generated
	 */
	EClass getStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getMembers()
	 * @see #getStruct()
	 * @generated
	 */
	EReference getStruct_Members();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getDataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Location</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getDataLocation()
	 * @see #getStruct()
	 * @generated
	 */
	EAttribute getStruct_DataLocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getVariables()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Variables();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getProvidedFunctions <em>Provided Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided Functions</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getProvidedFunctions()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_ProvidedFunctions();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constructor</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getConstructor()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Constructor();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getEvents()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Events();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getParents()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Parents();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getModifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modifiers</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getModifiers()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_Modifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getLocalTypes <em>Local Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Types</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getLocalTypes()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_LocalTypes();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getRequiredFunctions <em>Required Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Functions</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getRequiredFunctions()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_RequiredFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getLocalFunctions <em>Local Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Functions</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getLocalFunctions()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_LocalFunctions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getOverrideFunctions <em>Override Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Override Functions</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract#getOverrideFunctions()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_OverrideFunctions();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter#getName()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter#getType()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EReference getFunctionParameter_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter <em>Constructor Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor Parameter</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter
	 * @generated
	 */
	EClass getConstructorParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter#getName()
	 * @see #getConstructorParameter()
	 * @generated
	 */
	EAttribute getConstructorParameter_Name();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter#getType()
	 * @see #getConstructorParameter()
	 * @generated
	 */
	EReference getConstructorParameter_Type();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray <em>Default Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Array</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray
	 * @generated
	 */
	EClass getDefaultArray();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray#getType()
	 * @see #getDefaultArray()
	 * @generated
	 */
	EAttribute getDefaultArray_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray#getDataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Location</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray#getDataLocation()
	 * @see #getDefaultArray()
	 * @generated
	 */
	EAttribute getDefaultArray_DataLocation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getVisibility()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getMutability <em>Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutability</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getMutability()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Mutability();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getParameterTypes <em>Parameter Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter Types</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getParameterTypes()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ParameterTypes();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getReturnTypes <em>Return Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Return Types</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType#getReturnTypes()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_ReturnTypes();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ContractType <em>Contract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract Type</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ContractType
	 * @generated
	 */
	EClass getContractType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ContractType#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contract</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ContractType#getContract()
	 * @see #getContractType()
	 * @generated
	 */
	EReference getContractType_Contract();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction <em>Override Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Override Function</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction
	 * @generated
	 */
	EClass getOverrideFunction();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBase()
	 * @see #getOverrideFunction()
	 * @generated
	 */
	EReference getOverrideFunction_Base();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getOverriding <em>Overriding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Overriding</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getOverriding()
	 * @see #getOverrideFunction()
	 * @generated
	 */
	EReference getOverrideFunction_Overriding();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBaseContracts <em>Base Contracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Contracts</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction#getBaseContracts()
	 * @see #getOverrideFunction()
	 * @generated
	 */
	EReference getOverrideFunction_BaseContracts();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction <em>Local Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Function</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction
	 * @generated
	 */
	EClass getLocalFunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction#getVisibility()
	 * @see #getLocalFunction()
	 * @generated
	 */
	EAttribute getLocalFunction_Visibility();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction <em>Global Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Function</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction
	 * @generated
	 */
	EClass getGlobalFunction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction#getVisibility()
	 * @see #getGlobalFunction()
	 * @generated
	 */
	EAttribute getGlobalFunction_Visibility();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility <em>Variable Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility
	 * @generated
	 */
	EEnum getVariableVisibility();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation <em>Data Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Location</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
	 * @generated
	 */
	EEnum getDataLocation();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability <em>Function Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Mutability</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability
	 * @generated
	 */
	EEnum getFunctionMutability();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility <em>Function Type Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Type Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility
	 * @generated
	 */
	EEnum getFunctionTypeVisibility();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum <em>Primitive Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type Enum</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum
	 * @generated
	 */
	EEnum getPrimitiveTypeEnum();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability <em>Variable Mutability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variable Mutability</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability
	 * @generated
	 */
	EEnum getVariableMutability();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum <em>Default Array Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Array Enum</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum
	 * @generated
	 */
	EEnum getDefaultArrayEnum();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility <em>Local Function Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Local Function Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility
	 * @generated
	 */
	EEnum getLocalFunctionVisibility();

	/**
	 * Returns the meta object for enum '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility <em>Global Function Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Global Function Visibility</em>'.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility
	 * @generated
	 */
	EEnum getGlobalFunctionVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolidityContractsFactory getSolidityContractsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventParameterImpl <em>Event Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventParameterImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEventParameter()
		 * @generated
		 */
		EClass EVENT_PARAMETER = eINSTANCE.getEventParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_PARAMETER__TYPE = eINSTANCE.getEventParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__NAME = eINSTANCE.getEventParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Indexed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_PARAMETER__INDEXED = eINSTANCE.getEventParameter_Indexed();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl <em>Custom Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getCustomArray()
		 * @generated
		 */
		EClass CUSTOM_ARRAY = eINSTANCE.getCustomArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ARRAY__SIZE = eINSTANCE.getCustomArray_Size();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_ARRAY__TYPE = eINSTANCE.getCustomArray_Type();

		/**
		 * The meta object literal for the '<em><b>Data Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ARRAY__DATA_LOCATION = eINSTANCE.getCustomArray_DataLocation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierParameterImpl <em>Modifier Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierParameterImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getModifierParameter()
		 * @generated
		 */
		EClass MODIFIER_PARAMETER = eINSTANCE.getModifierParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER_PARAMETER__NAME = eINSTANCE.getModifierParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER_PARAMETER__TYPE = eINSTANCE.getModifierParameter_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StateVariableImpl <em>State Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StateVariableImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getStateVariable()
		 * @generated
		 */
		EClass STATE_VARIABLE = eINSTANCE.getStateVariable();

		/**
		 * The meta object literal for the '<em><b>Mutability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__MUTABILITY = eINSTANCE.getStateVariable_Mutability();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE_VARIABLE__VISIBILITY = eINSTANCE.getStateVariable_Visibility();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE_VARIABLE__TYPE = eINSTANCE.getStateVariable_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Return Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RETURN_VARIABLES = eINSTANCE.getFunction_ReturnVariables();

		/**
		 * The meta object literal for the '<em><b>Mutability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__MUTABILITY = eINSTANCE.getFunction_Mutability();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__MODIFIERS = eINSTANCE.getFunction_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__VIRTUAL = eINSTANCE.getFunction_Virtual();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__MEMBERS = eINSTANCE.getEnum_Members();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EventImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__PARAMETERS = eINSTANCE.getEvent_Parameters();

		/**
		 * The meta object literal for the '<em><b>Anonymous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__ANONYMOUS = eINSTANCE.getEvent_Anonymous();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumMemberImpl <em>Enum Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.EnumMemberImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getEnumMember()
		 * @generated
		 */
		EClass ENUM_MEMBER = eINSTANCE.getEnumMember();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_MEMBER__VALUE = eINSTANCE.getEnumMember_Value();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Key Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__KEY_TYPE = eINSTANCE.getMapping_KeyType();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__VALUE_TYPE = eINSTANCE.getMapping_ValueType();

		/**
		 * The meta object literal for the '<em><b>Data Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__DATA_LOCATION = eINSTANCE.getMapping_DataLocation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl <em>Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getModifier()
		 * @generated
		 */
		EClass MODIFIER = eINSTANCE.getModifier();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__PARAMETERS = eINSTANCE.getModifier_Parameters();

		/**
		 * The meta object literal for the '<em><b>Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODIFIER__VIRTUAL = eINSTANCE.getModifier_Virtual();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIER__OVERRIDE = eINSTANCE.getModifier_Override();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType <em>Mapping Key Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getMappingKeyType()
		 * @generated
		 */
		EClass MAPPING_KEY_TYPE = eINSTANCE.getMappingKeyType();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructMemberImpl <em>Struct Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructMemberImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getStructMember()
		 * @generated
		 */
		EClass STRUCT_MEMBER = eINSTANCE.getStructMember();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT_MEMBER__TYPE = eINSTANCE.getStructMember_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Contracts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__CONTRACTS = eINSTANCE.getRepository_Contracts();

		/**
		 * The meta object literal for the '<em><b>Global Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__GLOBAL_FUNCTIONS = eINSTANCE.getRepository_GlobalFunctions();

		/**
		 * The meta object literal for the '<em><b>Global Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__GLOBAL_TYPES = eINSTANCE.getRepository_GlobalTypes();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__PARAMETERS = eINSTANCE.getConstructor_Parameters();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.PrimitiveTypeImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPE__TYPE = eINSTANCE.getPrimitiveType_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ReturnVariableImpl <em>Return Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ReturnVariableImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getReturnVariable()
		 * @generated
		 */
		EClass RETURN_VARIABLE = eINSTANCE.getReturnVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN_VARIABLE__NAME = eINSTANCE.getReturnVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_VARIABLE__TYPE = eINSTANCE.getReturnVariable_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructImpl <em>Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.StructImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getStruct()
		 * @generated
		 */
		EClass STRUCT = eINSTANCE.getStruct();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCT__MEMBERS = eINSTANCE.getStruct_Members();

		/**
		 * The meta object literal for the '<em><b>Data Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCT__DATA_LOCATION = eINSTANCE.getStruct_DataLocation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__VARIABLES = eINSTANCE.getContract_Variables();

		/**
		 * The meta object literal for the '<em><b>Provided Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__PROVIDED_FUNCTIONS = eINSTANCE.getContract_ProvidedFunctions();

		/**
		 * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__CONSTRUCTOR = eINSTANCE.getContract_Constructor();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__EVENTS = eINSTANCE.getContract_Events();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__PARENTS = eINSTANCE.getContract_Parents();

		/**
		 * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__MODIFIERS = eINSTANCE.getContract_Modifiers();

		/**
		 * The meta object literal for the '<em><b>Local Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__LOCAL_TYPES = eINSTANCE.getContract_LocalTypes();

		/**
		 * The meta object literal for the '<em><b>Required Functions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__REQUIRED_FUNCTIONS = eINSTANCE.getContract_RequiredFunctions();

		/**
		 * The meta object literal for the '<em><b>Local Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__LOCAL_FUNCTIONS = eINSTANCE.getContract_LocalFunctions();

		/**
		 * The meta object literal for the '<em><b>Override Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__OVERRIDE_FUNCTIONS = eINSTANCE.getContract_OverrideFunctions();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionParameterImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__NAME = eINSTANCE.getFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PARAMETER__TYPE = eINSTANCE.getFunctionParameter_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorParameterImpl <em>Constructor Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ConstructorParameterImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getConstructorParameter()
		 * @generated
		 */
		EClass CONSTRUCTOR_PARAMETER = eINSTANCE.getConstructorParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR_PARAMETER__NAME = eINSTANCE.getConstructorParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR_PARAMETER__TYPE = eINSTANCE.getConstructorParameter_Type();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.DefaultArrayImpl <em>Default Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.DefaultArrayImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getDefaultArray()
		 * @generated
		 */
		EClass DEFAULT_ARRAY = eINSTANCE.getDefaultArray();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_ARRAY__TYPE = eINSTANCE.getDefaultArray_Type();

		/**
		 * The meta object literal for the '<em><b>Data Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_ARRAY__DATA_LOCATION = eINSTANCE.getDefaultArray_DataLocation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TYPE__VISIBILITY = eINSTANCE.getFunctionType_Visibility();

		/**
		 * The meta object literal for the '<em><b>Mutability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TYPE__MUTABILITY = eINSTANCE.getFunctionType_Mutability();

		/**
		 * The meta object literal for the '<em><b>Parameter Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__PARAMETER_TYPES = eINSTANCE.getFunctionType_ParameterTypes();

		/**
		 * The meta object literal for the '<em><b>Return Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__RETURN_TYPES = eINSTANCE.getFunctionType_ReturnTypes();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractTypeImpl <em>Contract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractTypeImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getContractType()
		 * @generated
		 */
		EClass CONTRACT_TYPE = eINSTANCE.getContractType();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT_TYPE__CONTRACT = eINSTANCE.getContractType_Contract();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl <em>Override Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getOverrideFunction()
		 * @generated
		 */
		EClass OVERRIDE_FUNCTION = eINSTANCE.getOverrideFunction();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERRIDE_FUNCTION__BASE = eINSTANCE.getOverrideFunction_Base();

		/**
		 * The meta object literal for the '<em><b>Overriding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERRIDE_FUNCTION__OVERRIDING = eINSTANCE.getOverrideFunction_Overriding();

		/**
		 * The meta object literal for the '<em><b>Base Contracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OVERRIDE_FUNCTION__BASE_CONTRACTS = eINSTANCE.getOverrideFunction_BaseContracts();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.LocalFunctionImpl <em>Local Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.LocalFunctionImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getLocalFunction()
		 * @generated
		 */
		EClass LOCAL_FUNCTION = eINSTANCE.getLocalFunction();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_FUNCTION__VISIBILITY = eINSTANCE.getLocalFunction_Visibility();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.GlobalFunctionImpl <em>Global Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.GlobalFunctionImpl
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getGlobalFunction()
		 * @generated
		 */
		EClass GLOBAL_FUNCTION = eINSTANCE.getGlobalFunction();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_FUNCTION__VISIBILITY = eINSTANCE.getGlobalFunction_Visibility();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility <em>Variable Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableVisibility
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getVariableVisibility()
		 * @generated
		 */
		EEnum VARIABLE_VISIBILITY = eINSTANCE.getVariableVisibility();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation <em>Data Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getDataLocation()
		 * @generated
		 */
		EEnum DATA_LOCATION = eINSTANCE.getDataLocation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability <em>Function Mutability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionMutability()
		 * @generated
		 */
		EEnum FUNCTION_MUTABILITY = eINSTANCE.getFunctionMutability();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility <em>Function Type Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getFunctionTypeVisibility()
		 * @generated
		 */
		EEnum FUNCTION_TYPE_VISIBILITY = eINSTANCE.getFunctionTypeVisibility();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum <em>Primitive Type Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.PrimitiveTypeEnum
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getPrimitiveTypeEnum()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE_ENUM = eINSTANCE.getPrimitiveTypeEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability <em>Variable Mutability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.VariableMutability
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getVariableMutability()
		 * @generated
		 */
		EEnum VARIABLE_MUTABILITY = eINSTANCE.getVariableMutability();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum <em>Default Array Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getDefaultArrayEnum()
		 * @generated
		 */
		EEnum DEFAULT_ARRAY_ENUM = eINSTANCE.getDefaultArrayEnum();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility <em>Local Function Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getLocalFunctionVisibility()
		 * @generated
		 */
		EEnum LOCAL_FUNCTION_VISIBILITY = eINSTANCE.getLocalFunctionVisibility();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility <em>Global Function Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility
		 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.SolidityContractsPackageImpl#getGlobalFunctionVisibility()
		 * @generated
		 */
		EEnum GLOBAL_FUNCTION_VISIBILITY = eINSTANCE.getGlobalFunctionVisibility();

	}

} //SolidityContractsPackage
