/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts;

import org.eclipse.emf.common.util.EList;

import tools.mdsd.modelingfoundations.identifier.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getOverride <em>Override</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getModifier()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ModifierParameterNamesMustBeUnique BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ModifierParameterNamesMustBeUnique='self.parameters -&gt; isUnique(name)' BaseModifierOfOverriddenContractsMustHaveSameNameAndParametersAndMustBeVirtual='override -&gt; notEmpty() implies override -&gt; forAll(c|c.modifiers -&gt;  exists(m|m.entityName = entityName and m.parameters -&gt; collect(name) = parameters -&gt; collect(name) and m.virtual = true))'"
 * @generated
 */
public interface Modifier extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getModifier_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModifierParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see #setVirtual(boolean)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getModifier_Virtual()
	 * @model required="true"
	 * @generated
	 */
	boolean isVirtual();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see #isVirtual()
	 * @generated
	 */
	void setVirtual(boolean value);

	/**
	 * Returns the value of the '<em><b>Override</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getModifier_Override()
	 * @model
	 * @generated
	 */
	EList<Contract> getOverride();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage#getModifier_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // Modifier
