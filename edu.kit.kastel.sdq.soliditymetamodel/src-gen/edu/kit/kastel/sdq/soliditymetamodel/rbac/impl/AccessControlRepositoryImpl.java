/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.rbac.impl;

import edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControlRepository;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.AccessControllingOperation;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.OperationAccessibleByRoles;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.RBACPackage;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.Role;
import edu.kit.kastel.sdq.soliditymetamodel.rbac.VariableAccessibleByRoles;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Control Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl#getAccessibleOperationsByRole <em>Accessible Operations By Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl#getAccessibleVariablesByRole <em>Accessible Variables By Role</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl#getAccessOperationDef <em>Access Operation Def</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.rbac.impl.AccessControlRepositoryImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessControlRepositoryImpl extends MinimalEObjectImpl.Container implements AccessControlRepository {
	/**
	 * The cached value of the '{@link #getAccessibleOperationsByRole() <em>Accessible Operations By Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleOperationsByRole()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationAccessibleByRoles> accessibleOperationsByRole;

	/**
	 * The cached value of the '{@link #getAccessibleVariablesByRole() <em>Accessible Variables By Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessibleVariablesByRole()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableAccessibleByRoles> accessibleVariablesByRole;

	/**
	 * The cached value of the '{@link #getAccessOperationDef() <em>Access Operation Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessOperationDef()
	 * @generated
	 * @ordered
	 */
	protected AccessControllingOperation accessOperationDef;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RBACPackage.Literals.ACCESS_CONTROL_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationAccessibleByRoles> getAccessibleOperationsByRole() {
		if (accessibleOperationsByRole == null) {
			accessibleOperationsByRole = new EObjectContainmentEList<OperationAccessibleByRoles>(OperationAccessibleByRoles.class, this, RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE);
		}
		return accessibleOperationsByRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VariableAccessibleByRoles> getAccessibleVariablesByRole() {
		if (accessibleVariablesByRole == null) {
			accessibleVariablesByRole = new EObjectContainmentEList<VariableAccessibleByRoles>(VariableAccessibleByRoles.class, this, RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE);
		}
		return accessibleVariablesByRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControllingOperation getAccessOperationDef() {
		return accessOperationDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessOperationDef(AccessControllingOperation newAccessOperationDef, NotificationChain msgs) {
		AccessControllingOperation oldAccessOperationDef = accessOperationDef;
		accessOperationDef = newAccessOperationDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF, oldAccessOperationDef, newAccessOperationDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessOperationDef(AccessControllingOperation newAccessOperationDef) {
		if (newAccessOperationDef != accessOperationDef) {
			NotificationChain msgs = null;
			if (accessOperationDef != null)
				msgs = ((InternalEObject)accessOperationDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF, null, msgs);
			if (newAccessOperationDef != null)
				msgs = ((InternalEObject)newAccessOperationDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF, null, msgs);
			msgs = basicSetAccessOperationDef(newAccessOperationDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF, newAccessOperationDef, newAccessOperationDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, RBACPackage.ACCESS_CONTROL_REPOSITORY__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE:
				return ((InternalEList<?>)getAccessibleOperationsByRole()).basicRemove(otherEnd, msgs);
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE:
				return ((InternalEList<?>)getAccessibleVariablesByRole()).basicRemove(otherEnd, msgs);
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF:
				return basicSetAccessOperationDef(null, msgs);
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE:
				return getAccessibleOperationsByRole();
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE:
				return getAccessibleVariablesByRole();
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF:
				return getAccessOperationDef();
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ROLES:
				return getRoles();
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
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE:
				getAccessibleOperationsByRole().clear();
				getAccessibleOperationsByRole().addAll((Collection<? extends OperationAccessibleByRoles>)newValue);
				return;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE:
				getAccessibleVariablesByRole().clear();
				getAccessibleVariablesByRole().addAll((Collection<? extends VariableAccessibleByRoles>)newValue);
				return;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF:
				setAccessOperationDef((AccessControllingOperation)newValue);
				return;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE:
				getAccessibleOperationsByRole().clear();
				return;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE:
				getAccessibleVariablesByRole().clear();
				return;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF:
				setAccessOperationDef((AccessControllingOperation)null);
				return;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ROLES:
				getRoles().clear();
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
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_OPERATIONS_BY_ROLE:
				return accessibleOperationsByRole != null && !accessibleOperationsByRole.isEmpty();
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESSIBLE_VARIABLES_BY_ROLE:
				return accessibleVariablesByRole != null && !accessibleVariablesByRole.isEmpty();
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ACCESS_OPERATION_DEF:
				return accessOperationDef != null;
			case RBACPackage.ACCESS_CONTROL_REPOSITORY__ROLES:
				return roles != null && !roles.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessControlRepositoryImpl
