pragma solidity ^0.8.5;

import "./SingleAuction.sol";

contract AuctionManager {

	struct Item {
		string tokenLink;
	}

	SingleAuction singleAuction; //TODO: Auto-generated Field

	function createNewAuction(Item memory item, int expiration) public {
		// TODO: implement and verify auto-generated method stub
		revert("TODO: auto-generated method stub");
	}

}