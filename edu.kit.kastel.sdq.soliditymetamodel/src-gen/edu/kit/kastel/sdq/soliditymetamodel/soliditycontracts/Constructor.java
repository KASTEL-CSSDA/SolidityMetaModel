/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getConstructor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ConstructorParameterNamesMustBeUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ConstructorParameterNamesMustBeUnique='parameters -&gt; isUnique(name)'"
 * @generated
 */
public interface Constructor extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ConstructorParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getConstructor_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConstructorParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getConstructor_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Constructor
