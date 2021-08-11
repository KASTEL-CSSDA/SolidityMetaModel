/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getValueType <em>Value Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getDataLocation <em>Data Location</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DataLocationOfMappingMustBeStorage'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot DataLocationOfMappingMustBeStorage='dataLocation = DataLocation::storage'"
 * @generated
 */
public interface Mapping extends Type {
	/**
	 * Returns the value of the '<em><b>Key Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Type</em>' reference.
	 * @see #setKeyType(MappingKeyType)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getMapping_KeyType()
	 * @model required="true"
	 * @generated
	 */
	MappingKeyType getKeyType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getKeyType <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Type</em>' reference.
	 * @see #getKeyType()
	 * @generated
	 */
	void setKeyType(MappingKeyType value);

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' reference.
	 * @see #setValueType(Type)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getMapping_ValueType()
	 * @model required="true"
	 * @generated
	 */
	Type getValueType();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getValueType <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' reference.
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(Type value);

	/**
	 * Returns the value of the '<em><b>Data Location</b></em>' attribute.
	 * The default value is <code>"storage"</code>.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Location</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
	 * @see #setDataLocation(DataLocation)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getMapping_DataLocation()
	 * @model default="storage"
	 * @generated
	 */
	DataLocation getDataLocation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping#getDataLocation <em>Data Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Location</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
	 * @see #getDataLocation()
	 * @generated
	 */
	void setDataLocation(DataLocation value);

} // Mapping
