/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.Connector;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.ProvidedInterface;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.RequiredInterface;
import edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.SoliditySystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ConnectorImpl#getProvidedInterface <em>Provided Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditysystem.impl.ConnectorImpl#getRequiredInterface <em>Required Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends IdentifierImpl implements Connector {
	/**
	 * The cached value of the '{@link #getProvidedInterface() <em>Provided Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterface()
	 * @generated
	 * @ordered
	 */
	protected ProvidedInterface providedInterface;

	/**
	 * The cached value of the '{@link #getRequiredInterface() <em>Required Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterface()
	 * @generated
	 * @ordered
	 */
	protected RequiredInterface requiredInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoliditySystemPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidedInterface getProvidedInterface() {
		if (providedInterface != null && providedInterface.eIsProxy()) {
			InternalEObject oldProvidedInterface = (InternalEObject)providedInterface;
			providedInterface = (ProvidedInterface)eResolveProxy(oldProvidedInterface);
			if (providedInterface != oldProvidedInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoliditySystemPackage.CONNECTOR__PROVIDED_INTERFACE, oldProvidedInterface, providedInterface));
			}
		}
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedInterface basicGetProvidedInterface() {
		return providedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProvidedInterface(ProvidedInterface newProvidedInterface) {
		ProvidedInterface oldProvidedInterface = providedInterface;
		providedInterface = newProvidedInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoliditySystemPackage.CONNECTOR__PROVIDED_INTERFACE, oldProvidedInterface, providedInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredInterface getRequiredInterface() {
		if (requiredInterface != null && requiredInterface.eIsProxy()) {
			InternalEObject oldRequiredInterface = (InternalEObject)requiredInterface;
			requiredInterface = (RequiredInterface)eResolveProxy(oldRequiredInterface);
			if (requiredInterface != oldRequiredInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoliditySystemPackage.CONNECTOR__REQUIRED_INTERFACE, oldRequiredInterface, requiredInterface));
			}
		}
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredInterface basicGetRequiredInterface() {
		return requiredInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredInterface(RequiredInterface newRequiredInterface) {
		RequiredInterface oldRequiredInterface = requiredInterface;
		requiredInterface = newRequiredInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoliditySystemPackage.CONNECTOR__REQUIRED_INTERFACE, oldRequiredInterface, requiredInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoliditySystemPackage.CONNECTOR__PROVIDED_INTERFACE:
				if (resolve) return getProvidedInterface();
				return basicGetProvidedInterface();
			case SoliditySystemPackage.CONNECTOR__REQUIRED_INTERFACE:
				if (resolve) return getRequiredInterface();
				return basicGetRequiredInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SoliditySystemPackage.CONNECTOR__PROVIDED_INTERFACE:
				setProvidedInterface((ProvidedInterface)newValue);
				return;
			case SoliditySystemPackage.CONNECTOR__REQUIRED_INTERFACE:
				setRequiredInterface((RequiredInterface)newValue);
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
			case SoliditySystemPackage.CONNECTOR__PROVIDED_INTERFACE:
				setProvidedInterface((ProvidedInterface)null);
				return;
			case SoliditySystemPackage.CONNECTOR__REQUIRED_INTERFACE:
				setRequiredInterface((RequiredInterface)null);
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
			case SoliditySystemPackage.CONNECTOR__PROVIDED_INTERFACE:
				return providedInterface != null;
			case SoliditySystemPackage.CONNECTOR__REQUIRED_INTERFACE:
				return requiredInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorImpl
