/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionTypeVisibility;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl#getMutability <em>Mutability</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl#getParameterTypes <em>Parameter Types</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionTypeImpl#getReturnTypes <em>Return Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTypeImpl extends IdentifierImpl implements FunctionType {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionTypeVisibility VISIBILITY_EDEFAULT = FunctionTypeVisibility.INTERNAL;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected FunctionTypeVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMutability() <em>Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutability()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionMutability MUTABILITY_EDEFAULT = FunctionMutability.DEFAULT;

	/**
	 * The cached value of the '{@link #getMutability() <em>Mutability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMutability()
	 * @generated
	 * @ordered
	 */
	protected FunctionMutability mutability = MUTABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterTypes() <em>Parameter Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> parameterTypes;

	/**
	 * The cached value of the '{@link #getReturnTypes() <em>Return Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> returnTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.FUNCTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionTypeVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(FunctionTypeVisibility newVisibility) {
		FunctionTypeVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.FUNCTION_TYPE__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionMutability getMutability() {
		return mutability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutability(FunctionMutability newMutability) {
		FunctionMutability oldMutability = mutability;
		mutability = newMutability == null ? MUTABILITY_EDEFAULT : newMutability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.FUNCTION_TYPE__MUTABILITY, oldMutability, mutability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getParameterTypes() {
		if (parameterTypes == null) {
			parameterTypes = new EObjectResolvingEList<Type>(Type.class, this, SolidityContractsPackage.FUNCTION_TYPE__PARAMETER_TYPES);
		}
		return parameterTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getReturnTypes() {
		if (returnTypes == null) {
			returnTypes = new EObjectResolvingEList<Type>(Type.class, this, SolidityContractsPackage.FUNCTION_TYPE__RETURN_TYPES);
		}
		return returnTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityContractsPackage.FUNCTION_TYPE__VISIBILITY:
				return getVisibility();
			case SolidityContractsPackage.FUNCTION_TYPE__MUTABILITY:
				return getMutability();
			case SolidityContractsPackage.FUNCTION_TYPE__PARAMETER_TYPES:
				return getParameterTypes();
			case SolidityContractsPackage.FUNCTION_TYPE__RETURN_TYPES:
				return getReturnTypes();
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
			case SolidityContractsPackage.FUNCTION_TYPE__VISIBILITY:
				setVisibility((FunctionTypeVisibility)newValue);
				return;
			case SolidityContractsPackage.FUNCTION_TYPE__MUTABILITY:
				setMutability((FunctionMutability)newValue);
				return;
			case SolidityContractsPackage.FUNCTION_TYPE__PARAMETER_TYPES:
				getParameterTypes().clear();
				getParameterTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SolidityContractsPackage.FUNCTION_TYPE__RETURN_TYPES:
				getReturnTypes().clear();
				getReturnTypes().addAll((Collection<? extends Type>)newValue);
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
			case SolidityContractsPackage.FUNCTION_TYPE__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SolidityContractsPackage.FUNCTION_TYPE__MUTABILITY:
				setMutability(MUTABILITY_EDEFAULT);
				return;
			case SolidityContractsPackage.FUNCTION_TYPE__PARAMETER_TYPES:
				getParameterTypes().clear();
				return;
			case SolidityContractsPackage.FUNCTION_TYPE__RETURN_TYPES:
				getReturnTypes().clear();
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
			case SolidityContractsPackage.FUNCTION_TYPE__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SolidityContractsPackage.FUNCTION_TYPE__MUTABILITY:
				return mutability != MUTABILITY_EDEFAULT;
			case SolidityContractsPackage.FUNCTION_TYPE__PARAMETER_TYPES:
				return parameterTypes != null && !parameterTypes.isEmpty();
			case SolidityContractsPackage.FUNCTION_TYPE__RETURN_TYPES:
				return returnTypes != null && !returnTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", mutability: ");
		result.append(mutability);
		result.append(')');
		return result.toString();
	}

} //FunctionTypeImpl
