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
		
		// get first name
		System.out.println("Please enter first name and press enter: ");
		String fname = in.next();
		
		// get middle name if any
		System.out.println("Please enter middle name (leave blank if none) and press enter: ");
		String mname = in.next();
		
		// get last name
		System.out.println("Please enter last name and press enter: ");
		String lname = in.next();
		
		// make sure social security entered is digits only, compare with digits regex
		Pattern digits = Pattern.compile("[0-9]");
		Matcher inputDigits;
		
		String ssn = "";
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
		
		commander.registerNewCustomer(fname, mname, lname, ssn);
		return "Successfully registered";
	}
	
	
	
}
