/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage
 * @generated
 */
public interface RBACFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RBACFactory eINSTANCE = edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.RBACFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Operation Accessible By Roles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Accessible By Roles</em>'.
	 * @generated
	 */
	OperationAccessibleByRoles createOperationAccessibleByRoles();

	/**
	 * Returns a new object of class '<em>Variable Accessible By Roles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Accessible By Roles</em>'.
	 * @generated
	 */
	VariableAccessibleByRoles createVariableAccessibleByRoles();

	/**
	 * Returns a new object of class '<em>Access Control Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Control Repository</em>'.
	 * @generated
	 */
	AccessControlRepository createAccessControlRepository();

	/**
	 * Returns a new object of class '<em>Access Controlling Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Controlling Operation</em>'.
	 * @generated
	 */
	AccessControllingOperation createAccessControllingOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RBACPackage getRBACPackage();

} //RBACFactory
