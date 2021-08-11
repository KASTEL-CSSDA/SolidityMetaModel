/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getMembers <em>Members</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getDataLocation <em>Data Location</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStruct()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StructCannotContainItself StructMemberNamesMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StructCannotContainItself='self.members -&gt; collect(type) -&gt; excludes(self)' StructMemberNamesMustBeUnique='self.members -&gt; isUnique(entityName)'"
 * @generated
 */
public interface Struct extends Type, NamedElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StructMember}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStruct_Members()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<StructMember> getMembers();

	/**
	 * Returns the value of the '<em><b>Data Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Location</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
	 * @see #setDataLocation(DataLocation)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getStruct_DataLocation()
	 * @model
	 * @generated
	 */
	DataLocation getDataLocation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Struct#getDataLocation <em>Data Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Location</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation
	 * @see #getDataLocation()
	 * @generated
	 */
	void setDataLocation(DataLocation value);

} // Struct
