/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Control Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessibleOperationsByRole <em>Accessible Operations By Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessibleVariablesByRole <em>Accessible Variables By Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessOperationDef <em>Access Operation Def</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControlRepository()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RoleNamesMustBeUnique OperationAccessibleByRolesCanOnlyDefinedOncePerOperation VariableAccessibleByRolesCanOnlyDefinedOncePerVariable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot RoleNamesMustBeUnique='roles -&gt; isUnique(entityName)' OperationAccessibleByRolesCanOnlyDefinedOncePerOperation='accessibleOperationsByRole -&gt; isUnique(operation)' VariableAccessibleByRolesCanOnlyDefinedOncePerVariable='accessibleVariablesByRole -&gt; isUnique(variable)'"
 * @generated
 */
public interface AccessControlRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Accessible Operations By Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Operations By Role</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControlRepository_AccessibleOperationsByRole()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationAccessibleByRoles> getAccessibleOperationsByRole();

	/**
	 * Returns the value of the '<em><b>Accessible Variables By Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessible Variables By Role</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControlRepository_AccessibleVariablesByRole()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableAccessibleByRoles> getAccessibleVariablesByRole();

	/**
	 * Returns the value of the '<em><b>Access Operation Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Operation Def</em>' containment reference.
	 * @see #setAccessOperationDef(AccessControllingOperation)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControlRepository_AccessOperationDef()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AccessControllingOperation getAccessOperationDef();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository#getAccessOperationDef <em>Access Operation Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Operation Def</em>' containment reference.
	 * @see #getAccessOperationDef()
	 * @generated
	 */
	void setAccessOperationDef(AccessControllingOperation value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.soliditymetamodel.rbac.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControlRepository_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // AccessControlRepository
