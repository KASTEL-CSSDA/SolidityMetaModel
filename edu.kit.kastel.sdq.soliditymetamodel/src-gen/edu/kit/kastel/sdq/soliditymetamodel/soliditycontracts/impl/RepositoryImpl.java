/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl#getContracts <em>Contracts</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl#getGlobalFunctions <em>Global Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.RepositoryImpl#getGlobalTypes <em>Global Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryImpl extends MinimalEObjectImpl.Container implements Repository {
	/**
	 * The cached value of the '{@link #getContracts() <em>Contracts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contracts;

	/**
	 * The cached value of the '{@link #getGlobalFunctions() <em>Global Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalFunction> globalFunctions;

	/**
	 * The cached value of the '{@link #getGlobalTypes() <em>Global Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> globalTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contract> getContracts() {
		if (contracts == null) {
			contracts = new EObjectContainmentEList<Contract>(Contract.class, this, SolidityContractsPackage.REPOSITORY__CONTRACTS);
		}
		return contracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlobalFunction> getGlobalFunctions() {
		if (globalFunctions == null) {
			globalFunctions = new EObjectContainmentEList<GlobalFunction>(GlobalFunction.class, this, SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS);
		}
		return globalFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getGlobalTypes() {
		if (globalTypes == null) {
			globalTypes = new EObjectContainmentEList<Type>(Type.class, this, SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES);
		}
		return globalTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolidityContractsPackage.REPOSITORY__CONTRACTS:
				return ((InternalEList<?>)getContracts()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS:
				return ((InternalEList<?>)getGlobalFunctions()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES:
				return ((InternalEList<?>)getGlobalTypes()).basicRemove(otherEnd, msgs);
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
			case SolidityContractsPackage.REPOSITORY__CONTRACTS:
				return getContracts();
			case SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS:
				return getGlobalFunctions();
			case SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES:
				return getGlobalTypes();
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
			case SolidityContractsPackage.REPOSITORY__CONTRACTS:
				getContracts().clear();
				getContracts().addAll((Collection<? extends Contract>)newValue);
				return;
			case SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS:
				getGlobalFunctions().clear();
				getGlobalFunctions().addAll((Collection<? extends GlobalFunction>)newValue);
				return;
			case SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES:
				getGlobalTypes().clear();
				getGlobalTypes().addAll((Collection<? extends Type>)newValue);
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
			case SolidityContractsPackage.REPOSITORY__CONTRACTS:
				getContracts().clear();
				return;
			case SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS:
				getGlobalFunctions().clear();
				return;
			case SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES:
				getGlobalTypes().clear();
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
			case SolidityContractsPackage.REPOSITORY__CONTRACTS:
				return contracts != null && !contracts.isEmpty();
			case SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS:
				return globalFunctions != null && !globalFunctions.isEmpty();
			case SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES:
				return globalTypes != null && !globalTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RepositoryImpl
