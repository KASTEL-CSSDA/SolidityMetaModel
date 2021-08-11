/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Mapping;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.MappingKeyType;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.MappingImpl#getDataLocation <em>Data Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends IdentifierImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getKeyType() <em>Key Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyType()
	 * @generated
	 * @ordered
	 */
	protected MappingKeyType keyType;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected Type valueType;

	/**
	 * The default value of the '{@link #getDataLocation() <em>Data Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLocation()
	 * @generated
	 * @ordered
	 */
	protected static final DataLocation DATA_LOCATION_EDEFAULT = DataLocation.STORAGE;

	/**
	 * The cached value of the '{@link #getDataLocation() <em>Data Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLocation()
	 * @generated
	 * @ordered
	 */
	protected DataLocation dataLocation = DATA_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingKeyType getKeyType() {
		if (keyType != null && keyType.eIsProxy()) {
			InternalEObject oldKeyType = (InternalEObject)keyType;
			keyType = (MappingKeyType)eResolveProxy(oldKeyType);
			if (keyType != oldKeyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolidityContractsPackage.MAPPING__KEY_TYPE, oldKeyType, keyType));
			}
		}
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingKeyType basicGetKeyType() {
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyType(MappingKeyType newKeyType) {
		MappingKeyType oldKeyType = keyType;
		keyType = newKeyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.MAPPING__KEY_TYPE, oldKeyType, keyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getValueType() {
		if (valueType != null && valueType.eIsProxy()) {
			InternalEObject oldValueType = (InternalEObject)valueType;
			valueType = (Type)eResolveProxy(oldValueType);
			if (valueType != oldValueType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolidityContractsPackage.MAPPING__VALUE_TYPE, oldValueType, valueType));
			}
		}
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(Type newValueType) {
		Type oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.MAPPING__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataLocation getDataLocation() {
		return dataLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataLocation(DataLocation newDataLocation) {
		DataLocation oldDataLocation = dataLocation;
		dataLocation = newDataLocation == null ? DATA_LOCATION_EDEFAULT : newDataLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.MAPPING__DATA_LOCATION, oldDataLocation, dataLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityContractsPackage.MAPPING__KEY_TYPE:
				if (resolve) return getKeyType();
				return basicGetKeyType();
			case SolidityContractsPackage.MAPPING__VALUE_TYPE:
				if (resolve) return getValueType();
				return basicGetValueType();
			case SolidityContractsPackage.MAPPING__DATA_LOCATION:
				return getDataLocation();
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
			case SolidityContractsPackage.MAPPING__KEY_TYPE:
				setKeyType((MappingKeyType)newValue);
				return;
			case SolidityContractsPackage.MAPPING__VALUE_TYPE:
				setValueType((Type)newValue);
				return;
			case SolidityContractsPackage.MAPPING__DATA_LOCATION:
				setDataLocation((DataLocation)newValue);
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
			case SolidityContractsPackage.MAPPING__KEY_TYPE:
				setKeyType((MappingKeyType)null);
				return;
			case SolidityContractsPackage.MAPPING__VALUE_TYPE:
				setValueType((Type)null);
				return;
			case SolidityContractsPackage.MAPPING__DATA_LOCATION:
				setDataLocation(DATA_LOCATION_EDEFAULT);
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
			case SolidityContractsPackage.MAPPING__KEY_TYPE:
				return keyType != null;
			case SolidityContractsPackage.MAPPING__VALUE_TYPE:
				return valueType != null;
			case SolidityContractsPackage.MAPPING__DATA_LOCATION:
				return dataLocation != DATA_LOCATION_EDEFAULT;
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
		result.append(" (dataLocation: ");
		result.append(dataLocation);
		result.append(')');
		return result.toString();
	}

} //MappingImpl
