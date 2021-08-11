pragma solidity ^0.8.5;


contract AccessCtrl {
	enum Roles {BIDDER, SELLER, MANAGER, ADMIN}
	
	
	
	mapping(address => bool) bidders;
	mapping(address => bool) sellers;
	mapping(address => bool) managers;
	mapping(address => bool) admins;
	
	constructor(address admin){
		admins[admin] = true;
	}
	
	function checkAccess(address entity, Roles role) public returns (bool) {
		if(role == Roles.BIDDER){
			return bidders[entity];
		}
		if(role == Roles.SELLER){
			return sellers[entity];
		}
		if(role == Roles.MANAGER){
			return managers[entity];
		}
		if(role == Roles.ADMIN){
			return admins[entity];
		}
	}
	
	function addToRole(address entity, Roles role) public onlyAdmin {
		if(role == Roles.BIDDER){
			bidders[entity] = true;
		}
		if(role == Roles.SELLER){
			sellers[entity] = true;
		}
		if(role == Roles.MANAGER){
			managers[entity] = true;
		}
		if(role == Roles.ADMIN){
			admins[entity] = true;
		}
	}
	
	function removeFromRole(address entity, Roles role) public onlyAdmin {
		if(role == Roles.BIDDER){
			bidders[entity] = false;
		}
		if(role == Roles.SELLER){
			sellers[entity] = false;
		}
		if(role == Roles.MANAGER){
			managers[entity] = false;
		}
		if(role == Roles.ADMIN){
			admins[entity] = false;
		}
	}
	
	modifier onlyAdmin {
		require(admins[msg.sender] == true, "Access denied");
		_;
	}
	
}