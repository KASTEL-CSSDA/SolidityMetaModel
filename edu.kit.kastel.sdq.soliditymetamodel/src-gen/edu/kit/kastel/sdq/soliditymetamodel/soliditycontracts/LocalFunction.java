/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getLocalFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PrivateFunctionsCannotBeVirtual'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PrivateFunctionsCannotBeVirtual='visibility = LocalFunctionVisibility::private implies virtual = false'"
 * @generated
 */
public interface LocalFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility
	 * @see #setVisibility(LocalFunctionVisibility)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getLocalFunction_Visibility()
	 * @model
	 * @generated
	 */
	LocalFunctionVisibility getVisibility();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunctionVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(LocalFunctionVisibility value);

} // LocalFunction
