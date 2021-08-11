pragma solidity ^0.8.5;


contract AccessCtrl {
	enum Roles {TESTROLE, ADMIN}
	
	
	
	mapping(address => bool) testroles;
	mapping(address => bool) admins;
	
	constructor(address admin){
		admins[admin] = true;
	}
	
	function checkAccess(address entity, Roles role) public returns (bool) {
		if(role == Roles.TESTROLE){
			return testroles[entity];
		}
		if(role == Roles.ADMIN){
			return admins[entity];
		}
	}
	
	function addToRole(address entity, Roles role) public onlyAdmin {
		if(role == Roles.TESTROLE){
			testroles[entity] = true;
		}
		if(role == Roles.ADMIN){
			admins[entity] = true;
		}
	}
	
	function removeFromRole(address entity, Roles role) public onlyAdmin {
		if(role == Roles.TESTROLE){
			testroles[entity] = false;
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