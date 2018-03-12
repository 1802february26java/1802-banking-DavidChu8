package com.revature.service;

import com.revature.model.Banker;
import com.revature.model.Account;
import com.revature.model.Customer;

public class CommandExecution {

	// only one object holds the Customer info
	static Banker banker;
	public CommandExecution() {
		banker = new Banker();
	}
	
	// check if social security number is already registered.
	public boolean ssnAlreadyHere(String ssn) {
		banker.ssnIsRegistered(ssn);
		return true;
	}
	
	// Create a new Customer
	public void registerNewCustomer(String fname, String mname, String lname, String ssn) {
		String account_number = banker.getNewAccountNumber();
		
	}
}
