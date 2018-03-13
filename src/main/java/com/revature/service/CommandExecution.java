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
	public String registerNewCustomer(String fname, String mname, String lname, String ssn, double bal) {
		String account_number = banker.getNewAccountNumber();
		banker.addNewCustomer(fname, mname, lname, ssn, account_number, bal);
		return account_number;
	}
	
	// check/verify customer account number
	public boolean account_registered(String account_number) {
		return banker.verifyAccountNumber(account_number);
	}
	
	// get the balance
	public double getAccountBal(String accountNum) {
		return banker.getBal(accountNum);
	}
}
