/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Accessible By Roles</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getOperationAccessibleByRoles()
 * @model
 * @generated
 */
public interface OperationAccessibleByRoles extends EObject {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.rbac.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getOperationAccessibleByRoles_Roles()
	 * @model
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(GlobalFunction)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getOperationAccessibleByRoles_Operation()
	 * @model required="true"
	 * @generated
	 */
	GlobalFunction getOperation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(GlobalFunction value);

} // OperationAccessibleByRoles
