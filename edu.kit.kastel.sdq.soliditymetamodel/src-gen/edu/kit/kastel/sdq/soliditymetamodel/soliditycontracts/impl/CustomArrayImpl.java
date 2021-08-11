/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.CustomArray;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.DataLocation;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tools.mdsd.modelingfoundations.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl#getSize <em>Size</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.CustomArrayImpl#getDataLocation <em>Data Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomArrayImpl extends IdentifierImpl implements CustomArray {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

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
	protected CustomArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.CUSTOM_ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.CUSTOM_ARRAY__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SolidityContractsPackage.CUSTOM_ARRAY__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.CUSTOM_ARRAY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.CUSTOM_ARRAY__DATA_LOCATION, oldDataLocation, dataLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityContractsPackage.CUSTOM_ARRAY__SIZE:
				return getSize();
			case SolidityContractsPackage.CUSTOM_ARRAY__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case SolidityContractsPackage.CUSTOM_ARRAY__DATA_LOCATION:
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
			case SolidityContractsPackage.CUSTOM_ARRAY__SIZE:
				setSize((Integer)newValue);
				return;
			case SolidityContractsPackage.CUSTOM_ARRAY__TYPE:
				setType((Type)newValue);
				return;
			case SolidityContractsPackage.CUSTOM_ARRAY__DATA_LOCATION:
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
			case SolidityContractsPackage.CUSTOM_ARRAY__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case SolidityContractsPackage.CUSTOM_ARRAY__TYPE:
				setType((Type)null);
				return;
			case SolidityContractsPackage.CUSTOM_ARRAY__DATA_LOCATION:
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
			case SolidityContractsPackage.CUSTOM_ARRAY__SIZE:
				return size != SIZE_EDEFAULT;
			case SolidityContractsPackage.CUSTOM_ARRAY__TYPE:
				return type != null;
			case SolidityContractsPackage.CUSTOM_ARRAY__DATA_LOCATION:
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
		result.append(" (size: ");
		result.append(size);
		result.append(", dataLocation: ");
		result.append(dataLocation);
		result.append(')');
		return result.toString();
	}

} //CustomArrayImpl
