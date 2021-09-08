pragma solidity ^0.8.5;

import "./AccessCtrl.sol";

contract SingleAuction {

	AccessCtrl accessCtrl; //TODO: Auto-generated Field
	//Modifiable by: Bidder, Seller
	bool public auctionClosed; //TODO: Auto-generated Field
	//Modifiable by: Nothing
	address public managerAddress; //TODO: Auto-generated Field
	//Modifiable by: Nothing
	address public sellerAddress; //TODO: Auto-generated Field

	/// @notice postcondition managerAddress == __verifier_old_address(managerAddress)
	/// @notice postcondition sellerAddress == __verifier_old_address(sellerAddress)
	function bid(int value) public onlyBidder {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition managerAddress == __verifier_old_address(managerAddress)
	/// @notice postcondition sellerAddress == __verifier_old_address(sellerAddress)
	function close() public onlyBidderSeller returns (bool res) {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition auctionClosed == __verifier_old_bool(auctionClosed)
	/// @notice postcondition managerAddress == __verifier_old_address(managerAddress)
	/// @notice postcondition sellerAddress == __verifier_old_address(sellerAddress)
	function emergencyShutdown() public onlyManager {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition managerAddress == __verifier_old_address(managerAddress)
	/// @notice postcondition sellerAddress == __verifier_old_address(sellerAddress)
	function sellerWithdraw() public onlySeller {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	/// @notice postcondition managerAddress == __verifier_old_address(managerAddress)
	/// @notice postcondition sellerAddress == __verifier_old_address(sellerAddress)
	function withdraw() public onlyBidder {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

	modifier onlyBidder {
		require(accessCtrl.checkAccess(msg.sender, accessCtrl.Roles.BIDDER),"Access denied");
		_;
	}

	modifier onlyBidderSeller {
		require(accessCtrl.checkAccess(msg.sender, accessCtrl.Roles.SELLER) || 
		accessCtrl.checkAccess(msg.sender, accessCtrl.Roles.BIDDER),"Access denied");
		_;
	}

	modifier onlyManager {
		require(accessCtrl.checkAccess(msg.sender, accessCtrl.Roles.MANAGER),"Access denied");
		_;
	}

	modifier onlySeller {
		require(accessCtrl.checkAccess(msg.sender, accessCtrl.Roles.SELLER),"Access denied");
		_;
	}

}