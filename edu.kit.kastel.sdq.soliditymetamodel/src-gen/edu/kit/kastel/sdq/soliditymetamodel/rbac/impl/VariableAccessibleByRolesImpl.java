/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.Role;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Accessible By Roles</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.VariableAccessibleByRolesImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.VariableAccessibleByRolesImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableAccessibleByRolesImpl extends MinimalEObjectImpl.Container implements VariableAccessibleByRoles {
	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected StateVariable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableAccessibleByRolesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACPackage.Literals.VARIABLE_ACCESSIBLE_BY_ROLES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectResolvingEList<Role>(Role.class, this, RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateVariable getVariable() {
		if (variable != null && variable.eIsProxy()) {
			InternalEObject oldVariable = (InternalEObject)variable;
			variable = (StateVariable)eResolveProxy(oldVariable);
			if (variable != oldVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE, oldVariable, variable));
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateVariable basicGetVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariable(StateVariable newVariable) {
		StateVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__ROLES:
				return getRoles();
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE:
				if (resolve) return getVariable();
				return basicGetVariable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE:
				setVariable((StateVariable)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__ROLES:
				getRoles().clear();
				return;
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE:
				setVariable((StateVariable)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__ROLES:
				return roles != null && !roles.isEmpty();
			case RBACPackage.VARIABLE_ACCESSIBLE_BY_ROLES__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableAccessibleByRolesImpl
