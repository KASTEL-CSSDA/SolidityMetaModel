/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Function;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionMutability;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.FunctionParameter;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ReturnVariable;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;

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

import tools.mdsd.modelingfoundations.identifier.impl.EntityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl#getReturnVariables <em>Return Variables</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl#getMutability <em>Mutability</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.FunctionImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FunctionImpl extends EntityImpl implements Function {
	/**
	 * The cached value of the '{@link #getReturnVariables() <em>Return Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<ReturnVariable> returnVariables;

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
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Modifier> modifiers;

	/**
	 * The default value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIRTUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected boolean virtual = VIRTUAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionParameter> parameters;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReturnVariable> getReturnVariables() {
		if (returnVariables == null) {
			returnVariables = new EObjectContainmentEList<ReturnVariable>(ReturnVariable.class, this, SolidityContractsPackage.FUNCTION__RETURN_VARIABLES);
		}
		return returnVariables;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.FUNCTION__MUTABILITY, oldMutability, mutability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectResolvingEList<Modifier>(Modifier.class, this, SolidityContractsPackage.FUNCTION__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVirtual() {
		return virtual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtual(boolean newVirtual) {
		boolean oldVirtual = virtual;
		virtual = newVirtual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.FUNCTION__VIRTUAL, oldVirtual, virtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<FunctionParameter>(FunctionParameter.class, this, SolidityContractsPackage.FUNCTION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.FUNCTION__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolidityContractsPackage.FUNCTION__RETURN_VARIABLES:
				return ((InternalEList<?>)getReturnVariables()).basicRemove(otherEnd, msgs);
			case SolidityContractsPackage.FUNCTION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case SolidityContractsPackage.FUNCTION__RETURN_VARIABLES:
				return getReturnVariables();
			case SolidityContractsPackage.FUNCTION__MUTABILITY:
				return getMutability();
			case SolidityContractsPackage.FUNCTION__MODIFIERS:
				return getModifiers();
			case SolidityContractsPackage.FUNCTION__VIRTUAL:
				return isVirtual();
			case SolidityContractsPackage.FUNCTION__PARAMETERS:
				return getParameters();
			case SolidityContractsPackage.FUNCTION__CONTENT:
				return getContent();
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
			case SolidityContractsPackage.FUNCTION__RETURN_VARIABLES:
				getReturnVariables().clear();
				getReturnVariables().addAll((Collection<? extends ReturnVariable>)newValue);
				return;
			case SolidityContractsPackage.FUNCTION__MUTABILITY:
				setMutability((FunctionMutability)newValue);
				return;
			case SolidityContractsPackage.FUNCTION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends Modifier>)newValue);
				return;
			case SolidityContractsPackage.FUNCTION__VIRTUAL:
				setVirtual((Boolean)newValue);
				return;
			case SolidityContractsPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FunctionParameter>)newValue);
				return;
			case SolidityContractsPackage.FUNCTION__CONTENT:
				setContent((String)newValue);
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
			case SolidityContractsPackage.FUNCTION__RETURN_VARIABLES:
				getReturnVariables().clear();
				return;
			case SolidityContractsPackage.FUNCTION__MUTABILITY:
				setMutability(MUTABILITY_EDEFAULT);
				return;
			case SolidityContractsPackage.FUNCTION__MODIFIERS:
				getModifiers().clear();
				return;
			case SolidityContractsPackage.FUNCTION__VIRTUAL:
				setVirtual(VIRTUAL_EDEFAULT);
				return;
			case SolidityContractsPackage.FUNCTION__PARAMETERS:
				getParameters().clear();
				return;
			case SolidityContractsPackage.FUNCTION__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case SolidityContractsPackage.FUNCTION__RETURN_VARIABLES:
				return returnVariables != null && !returnVariables.isEmpty();
			case SolidityContractsPackage.FUNCTION__MUTABILITY:
				return mutability != MUTABILITY_EDEFAULT;
			case SolidityContractsPackage.FUNCTION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case SolidityContractsPackage.FUNCTION__VIRTUAL:
				return virtual != VIRTUAL_EDEFAULT;
			case SolidityContractsPackage.FUNCTION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SolidityContractsPackage.FUNCTION__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
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
		result.append(" (mutability: ");
		result.append(mutability);
		result.append(", virtual: ");
		result.append(virtual);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
