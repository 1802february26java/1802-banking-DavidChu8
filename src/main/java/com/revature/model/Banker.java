package com.revature.model;

import com.revature.model.Customer;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Banker {
	
	// holds unique account numbers 
	private static TreeSet<Integer> account_numbers;
	
	// holds accounts by account number 
	private static TreeMap<Integer, Customer> accounts;
	
	public Banker() {
		account_numbers = new TreeSet<Integer>();
		accounts = new TreeMap<Integer, Customer>();
	}
	
	
	// return true if user's social security number is already registered.
	public boolean ssnIsRegistered(String ssn) {
		
		// get a set of entries
		Set currentUsers = accounts.entrySet();
		
		// get an iterator to go through current users
		Iterator iter = currentUsers.iterator();
		
		while (iter.hasNext()) {
			Map.Entry user = (Map.Entry)iter.next();
			Customer current_account = (Customer) user.getValue();
			if(current_account.getSocial_security_number().equals(ssn)) {
				return true;
			}
		}
		
		return false;
	}
	
	/*
	 * Returns a new account number.
	 */
	public String getNewAccountNumber() {
		Random rand = new Random();
		int accountNumber;
		boolean didntFindNewNum = true;
		do {
			accountNumber = rand.nextInt(99999999) + 10000000;
			if (account_numbers.contains(Integer.valueOf(accountNumber))) {
				didntFindNewNum = true;
			}
			else
				return String.valueOf(account_numbers); 
				
		} while (didntFindNewNum);
		
		return "No more Account numbers available";
	}
	
}
