package com.revature.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

import org.apache.log4j.Logger;

import com.revature.model.Customer;

public class CustomerRepositoryJdbc implements CustomerRepository{

	private static Logger logger = Logger.getLogger(CustomerRepositoryJdbc.class);

	/*
	 * Singleton Logic
	 */
	private static CustomerRepositoryJdbc repository = new CustomerRepositoryJdbc();
	
	private CustomerRepositoryJdbc() {}

	@Override
	public boolean insert(Customer customer) {
		logger.trace("Inserting celebrity.");
		try(Connection connection = ConnectionUtil.getConnection()) {
			int parameterIndex = 0;
			String sql = "INSERT INTO CUSTOMER(first_name, middle_name, last_name, ssn, account_number) VALUES(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(++parameterIndex, customer.getFirst_name());
			statement.setString(++parameterIndex, customer.getMiddle_name());
			statement.setString(++parameterIndex, customer.getLast_name());
			statement.setInt(++parameterIndex, Integer.valueOf(customer.getSocial_security_number()));
			statement.setInt(++parameterIndex, Integer.valueOf(customer.getCustomer_account().getAccount_number()));

			if(statement.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException e) {
			logger.error("Exception thrown while inserting new Celebrity", e);
		}
		return false;
	}

	@Override
	public boolean insertProcedure(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer findBySSN(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBalByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean depositByAccountNumber(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean withdrawByAccountNumber(double amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Customer> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
