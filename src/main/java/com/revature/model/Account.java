package com.revature.model;

import java.util.Date;
import java.util.TreeMap;

public class Account {
	
	// 8 digit account number
	private int account_number;
	
	// a string indicating "checking" or "savings"
	private String account_type;
	
	// 8 digit pin to access account
	private int account_pin;
	
	// current balance on account
	private double balance;
	
	// holds account history
	TreeMap<Date, Double> account_history;
	
	
	public Account(int account_number, String account_type, int account_pin, double balance) {
		super();
		this.account_number = account_number;
		this.account_type = account_type;
		this.account_pin = account_pin;
		this.balance = balance;
		this.account_history.put(new Date(), Double.valueOf(this.balance));
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public int getAccount_pin() {
		return account_pin;
	}

	public void setAccount_pin(int account_pin) {
		this.account_pin = account_pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public TreeMap<Date, Double> getAccount_history() {
		return account_history;
	}

	public void setAccount_history(TreeMap<Date, Double> account_history) {
		this.account_history = account_history;
	}
	
	
}
