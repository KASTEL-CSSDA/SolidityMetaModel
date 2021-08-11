/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArray;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DefaultArrayEnum;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.DefaultArrayImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.DefaultArrayImpl#getDataLocation <em>Data Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultArrayImpl extends IdentifierImpl implements DefaultArray {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DefaultArrayEnum TYPE_EDEFAULT = DefaultArrayEnum.BYTES;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DefaultArrayEnum type = TYPE_EDEFAULT;

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
	protected DefaultArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.DEFAULT_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultArrayEnum getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(DefaultArrayEnum newType) {
		DefaultArrayEnum oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.DEFAULT_ARRAY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.DEFAULT_ARRAY__DATA_LOCATION, oldDataLocation, dataLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityContractsPackage.DEFAULT_ARRAY__TYPE:
				return getType();
			case SolidityContractsPackage.DEFAULT_ARRAY__DATA_LOCATION:
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
			case SolidityContractsPackage.DEFAULT_ARRAY__TYPE:
				setType((DefaultArrayEnum)newValue);
				return;
			case SolidityContractsPackage.DEFAULT_ARRAY__DATA_LOCATION:
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
			case SolidityContractsPackage.DEFAULT_ARRAY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SolidityContractsPackage.DEFAULT_ARRAY__DATA_LOCATION:
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
			case SolidityContractsPackage.DEFAULT_ARRAY__TYPE:
				return type != TYPE_EDEFAULT;
			case SolidityContractsPackage.DEFAULT_ARRAY__DATA_LOCATION:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", dataLocation: ");
		result.append(dataLocation);
		result.append(')');
		return result.toString();
	}

} //DefaultArrayImpl
