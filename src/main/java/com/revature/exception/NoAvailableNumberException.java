package com.revature.exception;

public class NoAvailableNumberException extends Exception{
	
	String msg;
	
	public NoAvailableNumberException() {
		msg = "All valid bank account numbers are in use, please ask Peter";
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 */
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	
	
}
