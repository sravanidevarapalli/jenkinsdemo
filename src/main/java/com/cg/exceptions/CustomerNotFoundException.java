package com.cg.exceptions;

// custom exception for customer

public class CustomerNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerNotFoundException() {
	}
	
	public CustomerNotFoundException(String message)
	{
		super(message);
	}
}
