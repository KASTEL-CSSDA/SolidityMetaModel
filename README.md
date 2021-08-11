# SolidityMetaModel

An Ecore-Model for Solidity Smart Contracts that includes OCL constraints and Role Based Access Control (RBAC).

## Setup
1. Setup an [Eclipse Modelling Tools 2021-06](https://www.eclipse.org/downloads/packages/release/2021-06/r/eclipse-modeling-tools) (4.20) with the following Plugins:
	* OCL All-In-One SDK (6.15.0.v20210609-1442): [http://download.eclipse.org/modeling/mdt/ocl/updates/releases](http://download.eclipse.org/modeling/mdt/ocl/updates/releases)
	* MDSD.tools Modeling Foundations (1.0.0.202010011104): [https://github.com/MDSD-Tools/Metamodel-Modeling-Foundations](https://github.com/MDSD-Tools/Metamodel-Modeling-Foundations)
2. Clone this repository
3. Import the following projects in Eclipse:
	* `edu.kit.kastel.sdq.soliditymetamodel`
	* `edu.kit.kastel.sdq.soliditymetamodel.edit`
	* `edu.kit.kastel.sdq.soliditymetamodel.editor`
4. Generate model-content if necessary

## Examples
- Auctionhouse: `edu.kit.kastel.smartcontracts.demonstrator.auctionhouse`
- Everything: `edu.kit.kastel.smartcontracts.demonstrator.everything` (includes all model elements)