/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Override Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl#getBase <em>Base</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl#getOverriding <em>Overriding</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.OverrideFunctionImpl#getBaseContracts <em>Base Contracts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverrideFunctionImpl extends IdentifierImpl implements OverrideFunction {
	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Function base;

	/**
	 * The cached value of the '{@link #getOverriding() <em>Overriding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriding()
	 * @generated
	 * @ordered
	 */
	protected Function overriding;

	/**
	 * The cached value of the '{@link #getBaseContracts() <em>Base Contracts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseContracts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> baseContracts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverrideFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.OVERRIDE_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Function)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolidityContractsPackage.OVERRIDE_FUNCTION__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(Function newBase) {
		Function oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.OVERRIDE_FUNCTION__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getOverriding() {
		if (overriding != null && overriding.eIsProxy()) {
			InternalEObject oldOverriding = (InternalEObject)overriding;
			overriding = (Function)eResolveProxy(oldOverriding);
			if (overriding != oldOverriding) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolidityContractsPackage.OVERRIDE_FUNCTION__OVERRIDING, oldOverriding, overriding));
			}
		}
		return overriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetOverriding() {
		return overriding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverriding(Function newOverriding) {
		Function oldOverriding = overriding;
		overriding = newOverriding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.OVERRIDE_FUNCTION__OVERRIDING, oldOverriding, overriding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contract> getBaseContracts() {
		if (baseContracts == null) {
			baseContracts = new EObjectResolvingEList<Contract>(Contract.class, this, SolidityContractsPackage.OVERRIDE_FUNCTION__BASE_CONTRACTS);
		}
		return baseContracts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case SolidityContractsPackage.OVERRIDE_FUNCTION__OVERRIDING:
				if (resolve) return getOverriding();
				return basicGetOverriding();
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE_CONTRACTS:
				return getBaseContracts();
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
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE:
				setBase((Function)newValue);
				return;
			case SolidityContractsPackage.OVERRIDE_FUNCTION__OVERRIDING:
				setOverriding((Function)newValue);
				return;
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE_CONTRACTS:
				getBaseContracts().clear();
				getBaseContracts().addAll((Collection<? extends Contract>)newValue);
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
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE:
				setBase((Function)null);
				return;
			case SolidityContractsPackage.OVERRIDE_FUNCTION__OVERRIDING:
				setOverriding((Function)null);
				return;
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE_CONTRACTS:
				getBaseContracts().clear();
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
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE:
				return base != null;
			case SolidityContractsPackage.OVERRIDE_FUNCTION__OVERRIDING:
				return overriding != null;
			case SolidityContractsPackage.OVERRIDE_FUNCTION__BASE_CONTRACTS:
				return baseContracts != null && !baseContracts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OverrideFunctionImpl
