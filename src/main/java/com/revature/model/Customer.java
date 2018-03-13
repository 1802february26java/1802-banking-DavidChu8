package com.revature.model;


public class Customer {

	private String social_security_number;
	private String last_name;
	private String first_name;
	private String middle_name;
	
	private Account customer_account;
	
	public Customer(String ssn, String lname, String fname, String mname, String acctNum, double bal) {
		super();
		this.social_security_number = ssn;
		this.last_name = lname;
		this.first_name = fname;
		this.middle_name = mname;
		customer_account = new Account(acctNum, social_security_number.substring(0,8), bal);
		
	}

	public String getSocial_security_number() {
		return social_security_number;
	}

	public void setSocial_security_number(String social_security_number) {
		this.social_security_number = social_security_number;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public Account getCustomer_account() {
		return customer_account;
	}

	public void setCustomer_account(Account customer_account) {
		this.customer_account = customer_account;
	}
	
}
