/**
 */
package edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.provider;


import edu.kit.kastel.sdq.soliditymetamodel.rbac.provider.SolidityMetaModelEditPlugin;

import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsFactory;
import edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.SolidityContractsPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.soliditymetamodel.soliditycontracts.Repository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RepositoryItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SolidityContractsPackage.Literals.REPOSITORY__CONTRACTS);
			childrenFeatures.add(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_FUNCTIONS);
			childrenFeatures.add(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Repository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Repository"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Repository_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Repository.class)) {
			case SolidityContractsPackage.REPOSITORY__CONTRACTS:
			case SolidityContractsPackage.REPOSITORY__GLOBAL_FUNCTIONS:
			case SolidityContractsPackage.REPOSITORY__GLOBAL_TYPES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__CONTRACTS,
				 SolidityContractsFactory.eINSTANCE.createContract()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_FUNCTIONS,
				 SolidityContractsFactory.eINSTANCE.createGlobalFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createCustomArray()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createEnum()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createMapping()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createPrimitiveType()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createStruct()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createDefaultArray()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createFunctionType()));

		newChildDescriptors.add
			(createChildParameter
				(SolidityContractsPackage.Literals.REPOSITORY__GLOBAL_TYPES,
				 SolidityContractsFactory.eINSTANCE.createContractType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SolidityMetaModelEditPlugin.INSTANCE;
	}

}
