/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction#getVisibility <em>Visibility</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getGlobalFunction()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PublicFunctionCannotUseMappingAsParameter PublicFunctionCannotUseMappingAsReturnVariable ExternalFunctionCannotUseMappingAsParameter ExternalFunctionCannotUseMappingAsReturnVariable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot PublicFunctionCannotUseMappingAsParameter='visibility = GlobalFunctionVisibility::public implies parameters -&gt; collect(type) -&gt; excludes(Mapping)' PublicFunctionCannotUseMappingAsReturnVariable='visibility = GlobalFunctionVisibility::public implies returnVariables -&gt; collect(type) -&gt; excludes(Mapping)' ExternalFunctionCannotUseMappingAsParameter='visibility = GlobalFunctionVisibility::external implies parameters -&gt; collect(type) -&gt; excludes(Mapping)' ExternalFunctionCannotUseMappingAsReturnVariable='visibility = GlobalFunctionVisibility::external implies returnVariables -&gt; collect(type) -&gt; excludes(Mapping)'"
 * @generated
 */
public interface GlobalFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility
	 * @see #setVisibility(GlobalFunctionVisibility)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getGlobalFunction_Visibility()
	 * @model
	 * @generated
	 */
	GlobalFunctionVisibility getVisibility();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunctionVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(GlobalFunctionVisibility value);

} // GlobalFunction
