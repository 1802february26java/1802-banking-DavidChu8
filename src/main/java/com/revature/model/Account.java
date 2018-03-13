package com.revature.model;

import java.util.Date;
import java.util.TreeMap;

public class Account {
	
	// 8 digit account number
	private String account_number;
		
	// 8 digit pin to access account
	private String account_pin;
	
	// current balance on account
	private double balance;
	
	// holds account history
	private TreeMap<Date, Double> account_history;
	
	public Account(String account_number, String account_pin, double balance) {
		super();
		this.account_number = account_number;
		this.account_pin = account_pin;
		this.balance = balance;
		this.account_history.put(new Date(), Double.valueOf(this.balance));
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_pin() {
		return account_pin;
	}

	public void setAccount_pin(String account_pin) {
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

	public void setAccount_history(Date date, String amt) {
		this.account_history.put(date, Double.valueOf(amt));
	}
	
	
}
