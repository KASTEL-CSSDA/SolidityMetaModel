/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Constructor;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Event;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.GlobalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.LocalFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.OverrideFunction;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.StateVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tools.mdsd.modelingfoundations.identifier.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getProvidedFunctions <em>Provided Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getConstructor <em>Constructor</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getLocalTypes <em>Local Types</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getRequiredFunctions <em>Required Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getLocalFunctions <em>Local Functions</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ContractImpl#getOverrideFunctions <em>Override Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractImpl extends NamedElementImpl implements Contract {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<StateVariable> variables;

	/**
	 * The cached value of the '{@link #getProvidedFunctions() <em>Provided Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalFunction> providedFunctions;

	/**
	 * The cached value of the '{@link #getConstructor() <em>Constructor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstructor()
	 * @generated
	 * @ordered
	 */
	protected Constructor constructor;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> parents;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> modifiers;

	/**
	 * The cached value of the '{@link #getLocalTypes() <em>Local Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> localTypes;

	/**
	 * The cached value of the '{@link #getRequiredFunctions() <em>Required Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalFunction> requiredFunctions;

	/**
	 * The cached value of the '{@link #getLocalFunctions() <em>Local Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<LocalFunction> localFunctions;

	/**
	 * The cached value of the '{@link #getOverrideFunctions() <em>Override Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverrideFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<OverrideFunction> overrideFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StateVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<StateVariable>(StateVariable.class, this, SolidityContractsPackage.CONTRACT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlobalFunction> getProvidedFunctions() {
		if (providedFunctions == null) {
			providedFunctions = new EObjectResolvingEList<GlobalFunction>(GlobalFunction.class, this, SolidityContractsPackage.CONTRACT__PROVIDED_FUNCTIONS);
		}
		return providedFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constructor getConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstructor(Constructor newConstructor, NotificationChain msgs) {
		Constructor oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.CONTRACT__CONSTRUCTOR, oldConstructor, newConstructor);
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
	public void setConstructor(Constructor newConstructor) {
		if (newConstructor != constructor) {
			NotificationChain msgs = null;
			if (constructor != null)
				msgs = ((InternalEObject)constructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SolidityContractsPackage.CONTRACT__CONSTRUCTOR, null, msgs);
			if (newConstructor != null)
				msgs = ((InternalEObject)newConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SolidityContractsPackage.CONTRACT__CONSTRUCTOR, null, msgs);
			msgs = basicSetConstructor(newConstructor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.CONTRACT__CONSTRUCTOR, newConstructor, newConstructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, SolidityContractsPackage.CONTRACT__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contract> getParents() {
		if (parents == null) {
			parents = new EObjectResolvingEList<Contract>(Contract.class, this, SolidityContractsPackage.CONTRACT__PARENTS);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<Modifier>(Modifier.class, this, SolidityContractsPackage.CONTRACT__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getLocalTypes() {
		if (localTypes == null) {
			localTypes = new EObjectContainmentEList<Type>(Type.class, this, SolidityContractsPackage.CONTRACT__LOCAL_TYPES);
		}
		return localTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlobalFunction> getRequiredFunctions() {
		if (requiredFunctions == null) {
			requiredFunctions = new EObjectResolvingEList<GlobalFunction>(GlobalFunction.class, this, SolidityContractsPackage.CONTRACT__REQUIRED_FUNCTIONS);
		}
		return requiredFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LocalFunction> getLocalFunctions() {
		if (localFunctions == null) {
			localFunctions = new EObjectContainmentEList<LocalFunction>(LocalFunction.class, this, SolidityContractsPackage.CONTRACT__LOCAL_FUNCTIONS);
		}
		return localFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OverrideFunction> getOverrideFunctions() {
		if (overrideFunctions == null) {
			overrideFunctions = new EObjectContainmentEList<OverrideFunction>(OverrideFunction.class, this, SolidityContractsPackage.CONTRACT__OVERRIDE_FUNCTIONS);
		}
		return overrideFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolidityContractsPackage.CONTRACT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.CONTRACT__CONSTRUCTOR:
				return basicSetConstructor(null, msgs);
			case SolidityContractsPackage.CONTRACT__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.CONTRACT__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.CONTRACT__LOCAL_TYPES:
				return ((InternalEList<?>)getLocalTypes()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.CONTRACT__LOCAL_FUNCTIONS:
				return ((InternalEList<?>)getLocalFunctions()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.CONTRACT__OVERRIDE_FUNCTIONS:
				return ((InternalEList<?>)getOverrideFunctions()).basicRemove(otherEnd, msgs);
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
			case SolidityContractsPackage.CONTRACT__VARIABLES:
				return getVariables();
			case SolidityContractsPackage.CONTRACT__PROVIDED_FUNCTIONS:
				return getProvidedFunctions();
			case SolidityContractsPackage.CONTRACT__CONSTRUCTOR:
				return getConstructor();
			case SolidityContractsPackage.CONTRACT__EVENTS:
				return getEvents();
			case SolidityContractsPackage.CONTRACT__PARENTS:
				return getParents();
			case SolidityContractsPackage.CONTRACT__MODIFIERS:
				return getModifiers();
			case SolidityContractsPackage.CONTRACT__LOCAL_TYPES:
				return getLocalTypes();
			case SolidityContractsPackage.CONTRACT__REQUIRED_FUNCTIONS:
				return getRequiredFunctions();
			case SolidityContractsPackage.CONTRACT__LOCAL_FUNCTIONS:
				return getLocalFunctions();
			case SolidityContractsPackage.CONTRACT__OVERRIDE_FUNCTIONS:
				return getOverrideFunctions();
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
			case SolidityContractsPackage.CONTRACT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends StateVariable>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__PROVIDED_FUNCTIONS:
				getProvidedFunctions().clear();
				getProvidedFunctions().addAll((Collection<? extends GlobalFunction>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__CONSTRUCTOR:
				setConstructor((Constructor)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Contract>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Modifier>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__LOCAL_TYPES:
				getLocalTypes().clear();
				getLocalTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__REQUIRED_FUNCTIONS:
				getRequiredFunctions().clear();
				getRequiredFunctions().addAll((Collection<? extends GlobalFunction>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__LOCAL_FUNCTIONS:
				getLocalFunctions().clear();
				getLocalFunctions().addAll((Collection<? extends LocalFunction>)newValue);
				return;
			case SolidityContractsPackage.CONTRACT__OVERRIDE_FUNCTIONS:
				getOverrideFunctions().clear();
				getOverrideFunctions().addAll((Collection<? extends OverrideFunction>)newValue);
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
			case SolidityContractsPackage.CONTRACT__VARIABLES:
				getVariables().clear();
				return;
			case SolidityContractsPackage.CONTRACT__PROVIDED_FUNCTIONS:
				getProvidedFunctions().clear();
				return;
			case SolidityContractsPackage.CONTRACT__CONSTRUCTOR:
				setConstructor((Constructor)null);
				return;
			case SolidityContractsPackage.CONTRACT__EVENTS:
				getEvents().clear();
				return;
			case SolidityContractsPackage.CONTRACT__PARENTS:
				getParents().clear();
				return;
			case SolidityContractsPackage.CONTRACT__MODIFIERS:
				getModifiers().clear();
				return;
			case SolidityContractsPackage.CONTRACT__LOCAL_TYPES:
				getLocalTypes().clear();
				return;
			case SolidityContractsPackage.CONTRACT__REQUIRED_FUNCTIONS:
				getRequiredFunctions().clear();
				return;
			case SolidityContractsPackage.CONTRACT__LOCAL_FUNCTIONS:
				getLocalFunctions().clear();
				return;
			case SolidityContractsPackage.CONTRACT__OVERRIDE_FUNCTIONS:
				getOverrideFunctions().clear();
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
			case SolidityContractsPackage.CONTRACT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case SolidityContractsPackage.CONTRACT__PROVIDED_FUNCTIONS:
				return providedFunctions != null && !providedFunctions.isEmpty();
			case SolidityContractsPackage.CONTRACT__CONSTRUCTOR:
				return constructor != null;
			case SolidityContractsPackage.CONTRACT__EVENTS:
				return events != null && !events.isEmpty();
			case SolidityContractsPackage.CONTRACT__PARENTS:
				return parents != null && !parents.isEmpty();
			case SolidityContractsPackage.CONTRACT__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case SolidityContractsPackage.CONTRACT__LOCAL_TYPES:
				return localTypes != null && !localTypes.isEmpty();
			case SolidityContractsPackage.CONTRACT__REQUIRED_FUNCTIONS:
				return requiredFunctions != null && !requiredFunctions.isEmpty();
			case SolidityContractsPackage.CONTRACT__LOCAL_FUNCTIONS:
				return localFunctions != null && !localFunctions.isEmpty();
			case SolidityContractsPackage.CONTRACT__OVERRIDE_FUNCTIONS:
				return overrideFunctions != null && !overrideFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractImpl
