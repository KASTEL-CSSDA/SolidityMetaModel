pragma solidity ^0.8.5;


import "./ParentContract.sol";
import "./SecondParentContract.sol";

contract ChildContract is ParentContract, SecondParentContract {
	
	
	
	
	
	
	
	function testFunction() public testModifier(modifierParam) override(ParentContract, SecondParentContract) {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}
	
	
	
	modifier testModifier(bool modifierParam) override(ParentContract, SecondParentContract) {
		_; //TODO: Auto-generated Modifier
	}
}