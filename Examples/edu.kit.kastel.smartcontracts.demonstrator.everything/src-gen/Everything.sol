pragma solidity ^0.8.5;

import "./ParentContract.sol";
import "./AccessCtrl.sol";

contract Everything {
	enum MyEnum { Member1, Member2 }

	struct MyStruct {
		address member1;
		bool member2;
	}

	struct MyStructMemory {
		int member;
	}

	struct MyStructCalldata {
		int member;
	}

	event Event(bool param1, address indexed param2);
	event AnonymousEvent() anonymous;

	AccessCtrl accessCtrl; //TODO: Auto-generated Field
	//Modifiable by: TestRole
	address public variable1; //TODO: Auto-generated Field
	address payable internal constant variable2; //TODO: Auto-generated Field
	bool private immutable variable3; //TODO: Auto-generated Field
	bytes1 public variable4; //TODO: Auto-generated Field
	int public variable5; //TODO: Auto-generated Field
	int8 public variable6; //TODO: Auto-generated Field
	uint public variable7; //TODO: Auto-generated Field
	uint8 public variable8; //TODO: Auto-generated Field
	MyStruct public variable9; //TODO: Auto-generated Field
	MyEnum public variable10; //TODO: Auto-generated Field
	int[5] public variable11; //TODO: Auto-generated Field
	ParentContract public variable12; //TODO: Auto-generated Field
	bytes public variable13; //TODO: Auto-generated Field
	mapping(address => bool) public variable14; //TODO: Auto-generated Field

	constructor(int param, address param2) {
		//TODO: Auto-generated Constructor
	}

	function functionProv() external onlyTestRole {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function1(int[] memory param) internal pure modifier1(param) returns (int[] memory ) {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function2(int[] calldata param) private view {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function3(function() external pure functionType1, function() internal functionType2) internal {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function4(MyEnum enum1) internal returns (function() internal view out1, function() internal payable out2) {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function5() internal {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function6(MyStructCalldata calldata test) internal {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function7(bytes calldata param) internal {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition variable1 == __verifier_old_address(variable1)
	function function8(string memory param) internal {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	modifier onlyTestRole {
		require(accessCtrl.checkAccess(msg.sender, accessCtrl.Roles.TESTROLE),"Access denied");
		_;
	}

	modifier modifier1(int param) {
		_; //TODO: Auto-generated Modifier
	}
}