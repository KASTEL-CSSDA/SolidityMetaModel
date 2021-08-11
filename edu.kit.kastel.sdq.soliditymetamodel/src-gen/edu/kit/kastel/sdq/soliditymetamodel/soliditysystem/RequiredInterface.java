/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;

import tools.mdsd.modelingfoundations.identifier.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getRequiredInterface()
 * @model
 * @generated
 */
public interface RequiredInterface extends Identifier {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(GlobalFunction)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage#getRequiredInterface_Function()
	 * @model required="true"
	 * @generated
	 */
	GlobalFunction getFunction();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(GlobalFunction value);

} // RequiredInterface
