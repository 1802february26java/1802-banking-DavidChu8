package com.revature.model;

import java.util.ArrayList;


public class Customer {

	private String social_security_number;
	private int birth_year;
	private int birth_month;
	private int birth_day;
	private String last_name;
	private String first_name;
	private String middle_name;
	
	private String street_address1;
	private String street_address2;
	private String city_address;
	private String state_address;
	private String zip_code;
	
	private ArrayList<Account> accounts;

	public Customer(String social_security_number, String last_name, String first_name, String middle_name, String street_address1,
			String street_address2, String city_address, String state_address, String zip_code) {
		super();
		this.social_security_number = social_security_number;
		this.last_name = last_name;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.street_address1 = street_address1;
		this.street_address2 = street_address2;
		this.city_address = city_address;
		this.state_address = state_address;
		this.zip_code = zip_code;
	
	}

	public String getSocial_security_number() {
		return social_security_number;
	}

	public void setSocial_security_number(String social_security_number) {
		this.social_security_number = social_security_number;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	public int getBirth_month() {
		return birth_month;
	}

	public void setBirth_month(int birth_month) {
		this.birth_month = birth_month;
	}

	public int getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(int birth_day) {
		this.birth_day = birth_day;
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

	public String getStreet_address1() {
		return street_address1;
	}

	public void setStreet_address1(String street_address1) {
		this.street_address1 = street_address1;
	}

	public String getStreet_address2() {
		return street_address2;
	}

	public void setStreet_address2(String street_address2) {
		this.street_address2 = street_address2;
	}

	public String getCity_address() {
		return city_address;
	}

	public void setCity_address(String city_address) {
		this.city_address = city_address;
	}

	public String getState_address() {
		return state_address;
	}

	public void setState_address(String state_address) {
		this.state_address = state_address;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + birth_day;
		result = prime * result + birth_month;
		result = prime * result + birth_year;
		result = prime * result + ((city_address == null) ? 0 : city_address.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((middle_name == null) ? 0 : middle_name.hashCode());
		result = prime * result + ((social_security_number == null) ? 0 : social_security_number.hashCode());
		result = prime * result + ((state_address == null) ? 0 : state_address.hashCode());
		result = prime * result + ((street_address1 == null) ? 0 : street_address1.hashCode());
		result = prime * result + ((street_address2 == null) ? 0 : street_address2.hashCode());
		result = prime * result + ((zip_code == null) ? 0 : zip_code.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (birth_day != other.birth_day)
			return false;
		if (birth_month != other.birth_month)
			return false;
		if (birth_year != other.birth_year)
			return false;
		if (city_address == null) {
			if (other.city_address != null)
				return false;
		} else if (!city_address.equals(other.city_address))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (middle_name == null) {
			if (other.middle_name != null)
				return false;
		} else if (!middle_name.equals(other.middle_name))
			return false;
		if (social_security_number == null) {
			if (other.social_security_number != null)
				return false;
		} else if (!social_security_number.equals(other.social_security_number))
			return false;
		if (state_address == null) {
			if (other.state_address != null)
				return false;
		} else if (!state_address.equals(other.state_address))
			return false;
		if (street_address1 == null) {
			if (other.street_address1 != null)
				return false;
		} else if (!street_address1.equals(other.street_address1))
			return false;
		if (street_address2 == null) {
			if (other.street_address2 != null)
				return false;
		} else if (!street_address2.equals(other.street_address2))
			return false;
		if (zip_code == null) {
			if (other.zip_code != null)
				return false;
		} else if (!zip_code.equals(other.zip_code))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [social_security_number=" + social_security_number + ", birth_year=" + birth_year
				+ ", birth_month=" + birth_month + ", birth_day=" + birth_day + ", last_name=" + last_name
				+ ", first_name=" + first_name + ", middle_name=" + middle_name + ", street_address1=" + street_address1
				+ ", street_address2=" + street_address2 + ", city_address=" + city_address + ", state_address="
				+ state_address + ", zip_code=" + zip_code + ", accounts=" + accounts + "]";
	}
	
	
	
}
