pragma solidity ^0.8.5;

contract ParentContract {

	constructor() {
		//TODO: Auto-generated Constructor
	}

	function testFunction() virtual public testModifier(modifierParam) {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	function internalTestFunction(int input) internal testModifier(modifierParam) returns (int res) {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	modifier testModifier(bool modifierParam) virtual {
		_; //TODO: Auto-generated Modifier
	}
}