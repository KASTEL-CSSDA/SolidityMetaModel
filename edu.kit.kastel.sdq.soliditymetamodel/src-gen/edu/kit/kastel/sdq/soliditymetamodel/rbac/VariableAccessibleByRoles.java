/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Accessible By Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getVariableAccessibleByRoles()
 * @model
 * @generated
 */
public interface VariableAccessibleByRoles extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.rbac.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getVariableAccessibleByRoles_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(StateVariable)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getVariableAccessibleByRoles_Variable()
	 * @model required="true"
	 * @generated
	 */
	StateVariable getVariable();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(StateVariable value);

} // VariableAccessibleByRoles
