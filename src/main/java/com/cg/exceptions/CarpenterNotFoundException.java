package com.cg.exceptions;

// custom exception for carpenter

public class CarpenterNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CarpenterNotFoundException() {
	}
	
	public CarpenterNotFoundException(String message)
	{
		super(message);
	}
}
