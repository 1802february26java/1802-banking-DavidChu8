package com.revature.controller;

/* This Controller class uses I/O and text processing tools
 *  and tries to remain at a role that merely processes I/O,
 *  but blind to what's inside Customer information.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// call methods in com.revature.service for getting and setting Customer info
import com.revature.service.CommandExecution;

public final class CustomerInteraction {
	
	// Create a Service object that processes request on given user input.
	CommandExecution commander = new CommandExecution();
	
	public String register_user() {
		
		Scanner in = new Scanner(System.in);
		
		String ssn = "";
		
		// make sure social security entered is digits only, compare with digits regex
		Pattern digits = Pattern.compile("[0-9]");
		Matcher inputDigits;
		
		boolean tryAgain = true;
		do {
			// get social security number
			System.out.println("Please enter social security number (only digits): ");
			ssn = in.next();
			ssn.trim();
			
			// quickly check if already registered customer
			if (commander.ssnAlreadyHere(ssn))
				return ssn + " is a registered social security number.";
			
			// check if input is valid ssn
			inputDigits = digits.matcher(ssn);
			boolean correctLen = ssn.length() == 9;
			
			if (inputDigits.matches() & correctLen) {
				tryAgain = false;
			}
			
		} while (tryAgain);
		
		// get first name
		System.out.println("Please enter first name and press enter: ");
		String fname = in.next();
		
		// get middle name if any
		System.out.println("Please enter middle name (leave blank if none) and press enter: ");
		String mname = in.next();
		
		// get last name
		System.out.println("Please enter last name and press enter: ");
		String lname = in.next();
		
		// get balance
		double bal = 0.0;
		do {
			System.out.println("Please enter valid deposit amount: ");
			bal = in.nextDouble();
		} while (bal < 0);
		
		String newAccountNumber = commander.registerNewCustomer(fname, mname, lname, ssn, bal);
		return "Successfully registered, your new account number is " +
				newAccountNumber + " and your pin is the first 8 digits of your ssn!";
	}
	
	public boolean logon_user() {
		
		// scanner for input of account login and pin
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your Account number (only digits): ");
		
		String account_login;
		
		account_login = in.next();
		account_login.trim();
		
		in.close();
		// quickly check if already registered customer
		if (!commander.account_registered(account_login))
			return false;
		
		return true;
	}
	
	public void loggedin_menu(String accountNumber) {
		
		Scanner in = new Scanner(System.in);
		int choice = 4;
		double amt = 0.0;
		do {
			System.out.println("Enter 0 to view balance");
			System.out.println("Enter 1 for deposit");
			System.out.println("Enter 2 for withdrawal");
			System.out.println("Enter 3 to log off");
			choice = in.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Your account balance is: $" + commander.getAccountBal(accountNumber));
				break;
			case 1:
				do {
					System.out.println("Enter deposit amount: $");
					amt = in.nextDouble();
				} while (amt < 0);
				commander.depositBal(accountNumber, amt);
				break;
			case 2:
				do {
					System.out.println("Enter withdrawal amount: $");
					amt = in.nextDouble();
					// to do check against balance
				} while (amt < 0);
				commander.withdrawBal(accountNumber, amt);
				break;
			}
		} while (choice != 3);
		 
		in.close();
	}
}
