/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Contract;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Modifier;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.ModifierParameter;
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

import tools.mdsd.modelingfoundations.identifier.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.impl.ModifierImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModifierImpl extends NamedElementImpl implements Modifier {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ModifierParameter> parameters;

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
	 * The cached value of the '{@link #getOverride() <em>Override</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverride()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> override;

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
	protected ModifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityContractsPackage.Literals.MODIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModifierParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ModifierParameter>(ModifierParameter.class, this, SolidityContractsPackage.MODIFIER__PARAMETERS);
		}
		return parameters;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.MODIFIER__VIRTUAL, oldVirtual, virtual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Contract> getOverride() {
		if (override == null) {
			override = new EObjectResolvingEList<Contract>(Contract.class, this, SolidityContractsPackage.MODIFIER__OVERRIDE);
		}
		return override;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SolidityContractsPackage.MODIFIER__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolidityContractsPackage.MODIFIER__PARAMETERS:
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
			case SolidityContractsPackage.MODIFIER__PARAMETERS:
				return getParameters();
			case SolidityContractsPackage.MODIFIER__VIRTUAL:
				return isVirtual();
			case SolidityContractsPackage.MODIFIER__OVERRIDE:
				return getOverride();
			case SolidityContractsPackage.MODIFIER__CONTENT:
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
			case SolidityContractsPackage.MODIFIER__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ModifierParameter>)newValue);
				return;
			case SolidityContractsPackage.MODIFIER__VIRTUAL:
				setVirtual((Boolean)newValue);
				return;
			case SolidityContractsPackage.MODIFIER__OVERRIDE:
				getOverride().clear();
				getOverride().addAll((Collection<? extends Contract>)newValue);
				return;
			case SolidityContractsPackage.MODIFIER__CONTENT:
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
			case SolidityContractsPackage.MODIFIER__PARAMETERS:
				getParameters().clear();
				return;
			case SolidityContractsPackage.MODIFIER__VIRTUAL:
				setVirtual(VIRTUAL_EDEFAULT);
				return;
			case SolidityContractsPackage.MODIFIER__OVERRIDE:
				getOverride().clear();
				return;
			case SolidityContractsPackage.MODIFIER__CONTENT:
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
			case SolidityContractsPackage.MODIFIER__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case SolidityContractsPackage.MODIFIER__VIRTUAL:
				return virtual != VIRTUAL_EDEFAULT;
			case SolidityContractsPackage.MODIFIER__OVERRIDE:
				return override != null && !override.isEmpty();
			case SolidityContractsPackage.MODIFIER__CONTENT:
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
		result.append(" (virtual: ");
		result.append(virtual);
		result.append(", content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //ModifierImpl
