package com.revature.repository;

import java.util.Set;

import com.revature.model.Customer;

public interface CustomerRepository {
	/**
	 * Inserts a new customer in the database
	 */
	public boolean insert(Customer customer);
	
	/**
	 * Inserts a new customer in the database using a CallableStatement
	 * (Stored Procedure)
	 */
	public boolean insertProcedure(Customer customer);
	
	/**
	 * Select one [first one] Customer based on his/her first name.
	 */
	public Customer findByFirstName(String firstName);
	
	/**
	 * Select one [first one] Customer based on his/her last name.
	 */
	public Customer findByLastName(String lastName);
	
	/**
	 * Select one [first one] Customer based on his/her account number.
	 */
	public Customer findByAccountNumber(String accountNumber);
	
	/**
	 * Select one [first one] Customer based on his/her social security number.
	 */
	public Customer findBySSN(String ssn);
	
	/**
	 * Select one [first one] Account balance based on his/her account number.
	 */
	public double getBalByAccountNumber(String accountNumber);
	
	/**
	 * Insert into Account, deposit amount based on his/her account number.
	 */
	public boolean depositByAccountNumber(double amount);
	
	/**
	 * Insert into Account, withdrawal amount based on his/her account number.
	 */
	public boolean withdrawByAccountNumber(double amount);
	
	/**
	 * Select all customers from the database.
	 */
	public Set<Customer> selectAll();
}
