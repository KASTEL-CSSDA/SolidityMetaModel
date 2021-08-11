/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Controlling Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getIdentity <em>Identity</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getRoleDetermining <em>Role Determining</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControllingOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IdentityParameterMustBelongToOperation RoleDeterminingParameterMustBelongToOperation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot IdentityParameterMustBelongToOperation='operation.parameters -&gt; includes(identity)' RoleDeterminingParameterMustBelongToOperation='operation.parameters -&gt; includes(roleDetermining)'"
 * @generated
 */
public interface AccessControllingOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see #setOperation(GlobalFunction)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControllingOperation_Operation()
	 * @model required="true"
	 * @generated
	 */
	GlobalFunction getOperation();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getOperation <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(GlobalFunction value);

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' reference.
	 * @see #setIdentity(FunctionParameter)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControllingOperation_Identity()
	 * @model required="true"
	 * @generated
	 */
	FunctionParameter getIdentity();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getIdentity <em>Identity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(FunctionParameter value);

	/**
	 * Returns the value of the '<em><b>Role Determining</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Determining</em>' reference.
	 * @see #setRoleDetermining(FunctionParameter)
	 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage#getAccessControllingOperation_RoleDetermining()
	 * @model
	 * @generated
	 */
	FunctionParameter getRoleDetermining();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation#getRoleDetermining <em>Role Determining</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Determining</em>' reference.
	 * @see #getRoleDetermining()
	 * @generated
	 */
	void setRoleDetermining(FunctionParameter value);

} // AccessControllingOperation
